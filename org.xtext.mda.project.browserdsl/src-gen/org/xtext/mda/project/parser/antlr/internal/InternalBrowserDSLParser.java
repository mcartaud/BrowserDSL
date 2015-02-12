package org.xtext.mda.project.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.mda.project.services.BrowserDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrowserDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_URL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sub '", "'()'", "'(var '", "', var '", "')'", "'('", "','", "'main '", "'{'", "'}'", "'if '", "'all '", "'any '", "'then '", "'else '", "'endif'", "'while ('", "') do '", "' endwhile'", "'var '", "' = '", "';'", "' == '", "' > '", "' < '", "' !'", "'bool '", "'string '", "'int '", "'checkbox '", "'link '", "'button '", "'image '", "'textField '", "'checkbox'", "'link'", "'button'", "'image'", "'textField'", "'select('", "'click('", "');'", "'check('", "'fill('", "', value='", "'clear('", "'verify('", "'exist('", "'goTo('"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g"; }



     	private BrowserDSLGrammarAccess grammarAccess;
     	
        public InternalBrowserDSLParser(TokenStream input, BrowserDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected BrowserDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:76:1: ruleProgram returns [EObject current=null] : ( ( (lv_sub_0_0= ruleSubroutine ) )* ( (lv_main_1_0= ruleMain ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_sub_0_0 = null;

        EObject lv_main_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:79:28: ( ( ( (lv_sub_0_0= ruleSubroutine ) )* ( (lv_main_1_0= ruleMain ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:80:1: ( ( (lv_sub_0_0= ruleSubroutine ) )* ( (lv_main_1_0= ruleMain ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:80:1: ( ( (lv_sub_0_0= ruleSubroutine ) )* ( (lv_main_1_0= ruleMain ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:80:2: ( (lv_sub_0_0= ruleSubroutine ) )* ( (lv_main_1_0= ruleMain ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:80:2: ( (lv_sub_0_0= ruleSubroutine ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:81:1: (lv_sub_0_0= ruleSubroutine )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:81:1: (lv_sub_0_0= ruleSubroutine )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:82:3: lv_sub_0_0= ruleSubroutine
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getSubSubroutineParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSubroutine_in_ruleProgram131);
            	    lv_sub_0_0=ruleSubroutine();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sub",
            	            		lv_sub_0_0, 
            	            		"Subroutine");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:98:3: ( (lv_main_1_0= ruleMain ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:99:1: (lv_main_1_0= ruleMain )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:99:1: (lv_main_1_0= ruleMain )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:100:3: lv_main_1_0= ruleMain
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getMainMainParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMain_in_ruleProgram153);
            lv_main_1_0=ruleMain();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		set(
                   			current, 
                   			"main",
                    		lv_main_1_0, 
                    		"Main");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleSubroutine"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:124:1: entryRuleSubroutine returns [EObject current=null] : iv_ruleSubroutine= ruleSubroutine EOF ;
    public final EObject entryRuleSubroutine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubroutine = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:125:2: (iv_ruleSubroutine= ruleSubroutine EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:126:2: iv_ruleSubroutine= ruleSubroutine EOF
            {
             newCompositeNode(grammarAccess.getSubroutineRule()); 
            pushFollow(FOLLOW_ruleSubroutine_in_entryRuleSubroutine189);
            iv_ruleSubroutine=ruleSubroutine();

            state._fsp--;

             current =iv_ruleSubroutine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutine199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubroutine"


    // $ANTLR start "ruleSubroutine"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:133:1: ruleSubroutine returns [EObject current=null] : (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) ) ;
    public final EObject ruleSubroutine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_head_1_0 = null;

        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:136:28: ( (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:137:1: (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:137:1: (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:137:3: otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleSubroutine236); 

                	newLeafNode(otherlv_0, grammarAccess.getSubroutineAccess().getSubKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:141:1: ( (lv_head_1_0= ruleHead ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:142:1: (lv_head_1_0= ruleHead )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:142:1: (lv_head_1_0= ruleHead )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:143:3: lv_head_1_0= ruleHead
            {
             
            	        newCompositeNode(grammarAccess.getSubroutineAccess().getHeadHeadParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleHead_in_ruleSubroutine257);
            lv_head_1_0=ruleHead();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubroutineRule());
            	        }
                   		set(
                   			current, 
                   			"head",
                    		lv_head_1_0, 
                    		"Head");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:159:2: ( (lv_body_2_0= ruleBody ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:160:1: (lv_body_2_0= ruleBody )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:160:1: (lv_body_2_0= ruleBody )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:161:3: lv_body_2_0= ruleBody
            {
             
            	        newCompositeNode(grammarAccess.getSubroutineAccess().getBodyBodyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBody_in_ruleSubroutine278);
            lv_body_2_0=ruleBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubroutineRule());
            	        }
                   		add(
                   			current, 
                   			"body",
                    		lv_body_2_0, 
                    		"Body");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubroutine"


    // $ANTLR start "entryRuleHead"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:185:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:186:2: (iv_ruleHead= ruleHead EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:187:2: iv_ruleHead= ruleHead EOF
            {
             newCompositeNode(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_ruleHead_in_entryRuleHead314);
            iv_ruleHead=ruleHead();

            state._fsp--;

             current =iv_ruleHead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHead324); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:194:1: ruleHead returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_name_0_0 = null;

        EObject lv_name_2_0 = null;

        EObject lv_varId_4_0 = null;

        EObject lv_varId_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:197:28: ( ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:198:1: ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:198:1: ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==14) ) {
                    alt3=2;
                }
                else if ( (LA3_1==13) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:198:2: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:198:2: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:198:3: ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()'
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:198:3: ( (lv_name_0_0= ruleFunctionName ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:199:1: (lv_name_0_0= ruleFunctionName )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:199:1: (lv_name_0_0= ruleFunctionName )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:200:3: lv_name_0_0= ruleFunctionName
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeadAccess().getNameFunctionNameParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionName_in_ruleHead371);
                    lv_name_0_0=ruleFunctionName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeadRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"FunctionName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleHead383); 

                        	newLeafNode(otherlv_1, grammarAccess.getHeadAccess().getLeftParenthesisRightParenthesisKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:221:6: ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:221:6: ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:221:7: ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')'
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:221:7: ( (lv_name_2_0= ruleFunctionName ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:222:1: (lv_name_2_0= ruleFunctionName )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:222:1: (lv_name_2_0= ruleFunctionName )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:223:3: lv_name_2_0= ruleFunctionName
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeadAccess().getNameFunctionNameParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionName_in_ruleHead412);
                    lv_name_2_0=ruleFunctionName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeadRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"FunctionName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleHead424); 

                        	newLeafNode(otherlv_3, grammarAccess.getHeadAccess().getVarKeyword_1_1());
                        
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:243:1: ( (lv_varId_4_0= ruleVariableName ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:244:1: (lv_varId_4_0= ruleVariableName )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:244:1: (lv_varId_4_0= ruleVariableName )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:245:3: lv_varId_4_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeadAccess().getVarIdVariableNameParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleHead445);
                    lv_varId_4_0=ruleVariableName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeadRule());
                    	        }
                           		add(
                           			current, 
                           			"varId",
                            		lv_varId_4_0, 
                            		"VariableName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:261:2: (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:261:4: otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleHead458); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getHeadAccess().getVarKeyword_1_3_0());
                    	        
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:265:1: ( (lv_varId_6_0= ruleVariableName ) )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:266:1: (lv_varId_6_0= ruleVariableName )
                    	    {
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:266:1: (lv_varId_6_0= ruleVariableName )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:267:3: lv_varId_6_0= ruleVariableName
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHeadAccess().getVarIdVariableNameParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVariableName_in_ruleHead479);
                    	    lv_varId_6_0=ruleVariableName();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHeadRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"varId",
                    	            		lv_varId_6_0, 
                    	            		"VariableName");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleHead493); 

                        	newLeafNode(otherlv_7, grammarAccess.getHeadAccess().getRightParenthesisKeyword_1_4());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleFunctionReference"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:295:1: entryRuleFunctionReference returns [EObject current=null] : iv_ruleFunctionReference= ruleFunctionReference EOF ;
    public final EObject entryRuleFunctionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReference = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:296:2: (iv_ruleFunctionReference= ruleFunctionReference EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:297:2: iv_ruleFunctionReference= ruleFunctionReference EOF
            {
             newCompositeNode(grammarAccess.getFunctionReferenceRule()); 
            pushFollow(FOLLOW_ruleFunctionReference_in_entryRuleFunctionReference530);
            iv_ruleFunctionReference=ruleFunctionReference();

            state._fsp--;

             current =iv_ruleFunctionReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionReference540); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionReference"


    // $ANTLR start "ruleFunctionReference"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:304:1: ruleFunctionReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFunctionReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:307:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:308:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:308:1: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:309:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:309:1: (otherlv_0= RULE_ID )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:310:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionReference584); 

            		newLeafNode(otherlv_0, grammarAccess.getFunctionReferenceAccess().getFunctionNameFunctionNameCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionReference"


    // $ANTLR start "entryRuleVariableReference"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:329:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:330:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:331:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference619);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;

             current =iv_ruleVariableReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference629); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:338:1: ruleVariableReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:341:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:342:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:342:1: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:343:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:343:1: (otherlv_0= RULE_ID )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:344:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference673); 

            		newLeafNode(otherlv_0, grammarAccess.getVariableReferenceAccess().getVarIDVariableNameCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleFunctionCall"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:363:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:364:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:365:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall708);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall718); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:372:1: ruleFunctionCall returns [EObject current=null] : ( (this_FunctionReference_0= ruleFunctionReference otherlv_1= '()' ) | (this_FunctionReference_2= ruleFunctionReference otherlv_3= '(' ( (lv_var_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )* otherlv_7= ')' ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_FunctionReference_0 = null;

        EObject this_FunctionReference_2 = null;

        EObject lv_var_4_0 = null;

        EObject lv_var_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:375:28: ( ( (this_FunctionReference_0= ruleFunctionReference otherlv_1= '()' ) | (this_FunctionReference_2= ruleFunctionReference otherlv_3= '(' ( (lv_var_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )* otherlv_7= ')' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:376:1: ( (this_FunctionReference_0= ruleFunctionReference otherlv_1= '()' ) | (this_FunctionReference_2= ruleFunctionReference otherlv_3= '(' ( (lv_var_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )* otherlv_7= ')' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:376:1: ( (this_FunctionReference_0= ruleFunctionReference otherlv_1= '()' ) | (this_FunctionReference_2= ruleFunctionReference otherlv_3= '(' ( (lv_var_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )* otherlv_7= ')' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==17) ) {
                    alt5=2;
                }
                else if ( (LA5_1==13) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:376:2: (this_FunctionReference_0= ruleFunctionReference otherlv_1= '()' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:376:2: (this_FunctionReference_0= ruleFunctionReference otherlv_1= '()' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:377:5: this_FunctionReference_0= ruleFunctionReference otherlv_1= '()'
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionReferenceParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleFunctionReference_in_ruleFunctionCall766);
                    this_FunctionReference_0=ruleFunctionReference();

                    state._fsp--;

                     
                            current = this_FunctionReference_0; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleFunctionCall777); 

                        	newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:390:6: (this_FunctionReference_2= ruleFunctionReference otherlv_3= '(' ( (lv_var_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )* otherlv_7= ')' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:390:6: (this_FunctionReference_2= ruleFunctionReference otherlv_3= '(' ( (lv_var_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )* otherlv_7= ')' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:391:5: this_FunctionReference_2= ruleFunctionReference otherlv_3= '(' ( (lv_var_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )* otherlv_7= ')'
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionReferenceParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleFunctionReference_in_ruleFunctionCall807);
                    this_FunctionReference_2=ruleFunctionReference();

                    state._fsp--;

                     
                            current = this_FunctionReference_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleFunctionCall818); 

                        	newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:403:1: ( (lv_var_4_0= ruleExpression ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:404:1: (lv_var_4_0= ruleExpression )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:404:1: (lv_var_4_0= ruleExpression )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:405:3: lv_var_4_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getVarExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall839);
                    lv_var_4_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	        }
                           		add(
                           			current, 
                           			"var",
                            		lv_var_4_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:421:2: (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:421:4: otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleFunctionCall852); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getCommaKeyword_1_3_0());
                    	        
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:425:1: ( (lv_var_6_0= ruleExpression ) )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:426:1: (lv_var_6_0= ruleExpression )
                    	    {
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:426:1: (lv_var_6_0= ruleExpression )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:427:3: lv_var_6_0= ruleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getVarExpressionParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall873);
                    	    lv_var_6_0=ruleExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"var",
                    	            		lv_var_6_0, 
                    	            		"Expression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleFunctionCall887); 

                        	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_4());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleFunctionName"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:455:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:456:2: (iv_ruleFunctionName= ruleFunctionName EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:457:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_ruleFunctionName_in_entryRuleFunctionName924);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionName934); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:464:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:467:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:468:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:468:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:469:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:469:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:470:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionName975); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFunctionNameAccess().getNameSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleMain"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:494:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:495:2: (iv_ruleMain= ruleMain EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:496:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain1015);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain1025); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:503:1: ruleMain returns [EObject current=null] : (otherlv_0= 'main ' this_Body_1= ruleBody ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Body_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:506:28: ( (otherlv_0= 'main ' this_Body_1= ruleBody ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:507:1: (otherlv_0= 'main ' this_Body_1= ruleBody )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:507:1: (otherlv_0= 'main ' this_Body_1= ruleBody )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:507:3: otherlv_0= 'main ' this_Body_1= ruleBody
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleMain1062); 

                	newLeafNode(otherlv_0, grammarAccess.getMainAccess().getMainKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getMainAccess().getBodyParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleBody_in_ruleMain1084);
            this_Body_1=ruleBody();

            state._fsp--;

             
                    current = this_Body_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleBody"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:528:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:529:2: (iv_ruleBody= ruleBody EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:530:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody1119);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody1129); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:537:1: ruleBody returns [EObject current=null] : (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_instructions_1_0 = null;

        EObject lv_instructions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:540:28: ( (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:541:1: (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:541:1: (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:541:3: otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleBody1166); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:545:1: ( (lv_instructions_1_0= ruleInstruction ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:546:1: (lv_instructions_1_0= ruleInstruction )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:546:1: (lv_instructions_1_0= ruleInstruction )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:547:3: lv_instructions_1_0= ruleInstruction
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getInstructionsInstructionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleInstruction_in_ruleBody1187);
            lv_instructions_1_0=ruleInstruction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	        }
                   		add(
                   			current, 
                   			"instructions",
                    		lv_instructions_1_0, 
                    		"Instruction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:563:2: ( (lv_instructions_2_0= ruleInstruction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==22||LA6_0==28||LA6_0==31||LA6_0==52||(LA6_0>=54 && LA6_0<=55)||LA6_0==57||LA6_0==60) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:564:1: (lv_instructions_2_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:564:1: (lv_instructions_2_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:565:3: lv_instructions_2_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBodyAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleBody1208);
            	    lv_instructions_2_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_2_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleBody1221); 

                	newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleInstruction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:593:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:594:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:595:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction1257);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction1267); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:602:1: ruleInstruction returns [EObject current=null] : ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_cond_1_0= ruleCondition ) ) | ( (lv_while_2_0= ruleWhile ) ) | ( (lv_act_3_0= ruleActionInstruction ) ) | ( (lv_ass_4_0= ruleAssignation ) ) | ( (lv_sub_5_0= ruleFunctionCall ) ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject lv_dec_0_0 = null;

        EObject lv_cond_1_0 = null;

        EObject lv_while_2_0 = null;

        EObject lv_act_3_0 = null;

        EObject lv_ass_4_0 = null;

        EObject lv_sub_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:605:28: ( ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_cond_1_0= ruleCondition ) ) | ( (lv_while_2_0= ruleWhile ) ) | ( (lv_act_3_0= ruleActionInstruction ) ) | ( (lv_ass_4_0= ruleAssignation ) ) | ( (lv_sub_5_0= ruleFunctionCall ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:606:1: ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_cond_1_0= ruleCondition ) ) | ( (lv_while_2_0= ruleWhile ) ) | ( (lv_act_3_0= ruleActionInstruction ) ) | ( (lv_ass_4_0= ruleAssignation ) ) | ( (lv_sub_5_0= ruleFunctionCall ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:606:1: ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_cond_1_0= ruleCondition ) ) | ( (lv_while_2_0= ruleWhile ) ) | ( (lv_act_3_0= ruleActionInstruction ) ) | ( (lv_ass_4_0= ruleAssignation ) ) | ( (lv_sub_5_0= ruleFunctionCall ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 52:
            case 54:
            case 55:
            case 57:
            case 60:
                {
                alt7=4;
                }
                break;
            case RULE_ID:
                {
                int LA7_5 = input.LA(2);

                if ( (LA7_5==13||LA7_5==17) ) {
                    alt7=6;
                }
                else if ( (LA7_5==32) ) {
                    alt7=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:606:2: ( (lv_dec_0_0= ruleDeclaration ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:606:2: ( (lv_dec_0_0= ruleDeclaration ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:607:1: (lv_dec_0_0= ruleDeclaration )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:607:1: (lv_dec_0_0= ruleDeclaration )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:608:3: lv_dec_0_0= ruleDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getDecDeclarationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleInstruction1313);
                    lv_dec_0_0=ruleDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"dec",
                            		lv_dec_0_0, 
                            		"Declaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:625:6: ( (lv_cond_1_0= ruleCondition ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:625:6: ( (lv_cond_1_0= ruleCondition ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:626:1: (lv_cond_1_0= ruleCondition )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:626:1: (lv_cond_1_0= ruleCondition )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:627:3: lv_cond_1_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getCondConditionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleInstruction1340);
                    lv_cond_1_0=ruleCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"cond",
                            		lv_cond_1_0, 
                            		"Condition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:644:6: ( (lv_while_2_0= ruleWhile ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:644:6: ( (lv_while_2_0= ruleWhile ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:645:1: (lv_while_2_0= ruleWhile )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:645:1: (lv_while_2_0= ruleWhile )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:646:3: lv_while_2_0= ruleWhile
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getWhileWhileParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhile_in_ruleInstruction1367);
                    lv_while_2_0=ruleWhile();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"while",
                            		lv_while_2_0, 
                            		"While");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:663:6: ( (lv_act_3_0= ruleActionInstruction ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:663:6: ( (lv_act_3_0= ruleActionInstruction ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:664:1: (lv_act_3_0= ruleActionInstruction )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:664:1: (lv_act_3_0= ruleActionInstruction )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:665:3: lv_act_3_0= ruleActionInstruction
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getActActionInstructionParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionInstruction_in_ruleInstruction1394);
                    lv_act_3_0=ruleActionInstruction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"act",
                            		lv_act_3_0, 
                            		"ActionInstruction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:682:6: ( (lv_ass_4_0= ruleAssignation ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:682:6: ( (lv_ass_4_0= ruleAssignation ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:683:1: (lv_ass_4_0= ruleAssignation )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:683:1: (lv_ass_4_0= ruleAssignation )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:684:3: lv_ass_4_0= ruleAssignation
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getAssAssignationParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssignation_in_ruleInstruction1421);
                    lv_ass_4_0=ruleAssignation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"ass",
                            		lv_ass_4_0, 
                            		"Assignation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:701:6: ( (lv_sub_5_0= ruleFunctionCall ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:701:6: ( (lv_sub_5_0= ruleFunctionCall ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:702:1: (lv_sub_5_0= ruleFunctionCall )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:702:1: (lv_sub_5_0= ruleFunctionCall )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:703:3: lv_sub_5_0= ruleFunctionCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getSubFunctionCallParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleInstruction1448);
                    lv_sub_5_0=ruleFunctionCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"sub",
                            		lv_sub_5_0, 
                            		"FunctionCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleCondition"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:727:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:728:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:729:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1484);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1494); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:736:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'if ' (otherlv_1= 'all ' | otherlv_2= 'any ' )? otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= 'then ' ( (lv_ins_7_0= ruleInstruction ) )+ otherlv_8= 'else ' ( (lv_ins2_9_0= ruleInstruction ) )+ otherlv_10= 'endif' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_exp_4_0 = null;

        EObject lv_ins_7_0 = null;

        EObject lv_ins2_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:739:28: ( (otherlv_0= 'if ' (otherlv_1= 'all ' | otherlv_2= 'any ' )? otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= 'then ' ( (lv_ins_7_0= ruleInstruction ) )+ otherlv_8= 'else ' ( (lv_ins2_9_0= ruleInstruction ) )+ otherlv_10= 'endif' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:740:1: (otherlv_0= 'if ' (otherlv_1= 'all ' | otherlv_2= 'any ' )? otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= 'then ' ( (lv_ins_7_0= ruleInstruction ) )+ otherlv_8= 'else ' ( (lv_ins2_9_0= ruleInstruction ) )+ otherlv_10= 'endif' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:740:1: (otherlv_0= 'if ' (otherlv_1= 'all ' | otherlv_2= 'any ' )? otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= 'then ' ( (lv_ins_7_0= ruleInstruction ) )+ otherlv_8= 'else ' ( (lv_ins2_9_0= ruleInstruction ) )+ otherlv_10= 'endif' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:740:3: otherlv_0= 'if ' (otherlv_1= 'all ' | otherlv_2= 'any ' )? otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= 'then ' ( (lv_ins_7_0= ruleInstruction ) )+ otherlv_8= 'else ' ( (lv_ins2_9_0= ruleInstruction ) )+ otherlv_10= 'endif'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleCondition1531); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:744:1: (otherlv_1= 'all ' | otherlv_2= 'any ' )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:744:3: otherlv_1= 'all '
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleCondition1544); 

                        	newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getAllKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:749:7: otherlv_2= 'any '
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleCondition1562); 

                        	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getAnyKeyword_1_1());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleCondition1576); 

                	newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:757:1: ( (lv_exp_4_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:758:1: (lv_exp_4_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:758:1: (lv_exp_4_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:759:3: lv_exp_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getExpExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCondition1597);
            lv_exp_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleCondition1609); 

                	newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getRightParenthesisKeyword_4());
                
            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleCondition1621); 

                	newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getThenKeyword_5());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:783:1: ( (lv_ins_7_0= ruleInstruction ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==22||LA9_0==28||LA9_0==31||LA9_0==52||(LA9_0>=54 && LA9_0<=55)||LA9_0==57||LA9_0==60) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:784:1: (lv_ins_7_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:784:1: (lv_ins_7_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:785:3: lv_ins_7_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionAccess().getInsInstructionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleCondition1642);
            	    lv_ins_7_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ins",
            	            		lv_ins_7_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleCondition1655); 

                	newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getElseKeyword_7());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:805:1: ( (lv_ins2_9_0= ruleInstruction ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==22||LA10_0==28||LA10_0==31||LA10_0==52||(LA10_0>=54 && LA10_0<=55)||LA10_0==57||LA10_0==60) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:806:1: (lv_ins2_9_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:806:1: (lv_ins2_9_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:807:3: lv_ins2_9_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionAccess().getIns2InstructionParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleCondition1676);
            	    lv_ins2_9_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ins2",
            	            		lv_ins2_9_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleCondition1689); 

                	newLeafNode(otherlv_10, grammarAccess.getConditionAccess().getEndifKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleWhile"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:835:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:836:2: (iv_ruleWhile= ruleWhile EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:837:2: iv_ruleWhile= ruleWhile EOF
            {
             newCompositeNode(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile1725);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile1735); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:844:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while (' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ') do ' ( (lv_ins_3_0= ruleInstruction ) )+ otherlv_4= ' endwhile' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_exp_1_0 = null;

        EObject lv_ins_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:847:28: ( (otherlv_0= 'while (' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ') do ' ( (lv_ins_3_0= ruleInstruction ) )+ otherlv_4= ' endwhile' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:848:1: (otherlv_0= 'while (' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ') do ' ( (lv_ins_3_0= ruleInstruction ) )+ otherlv_4= ' endwhile' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:848:1: (otherlv_0= 'while (' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ') do ' ( (lv_ins_3_0= ruleInstruction ) )+ otherlv_4= ' endwhile' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:848:3: otherlv_0= 'while (' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ') do ' ( (lv_ins_3_0= ruleInstruction ) )+ otherlv_4= ' endwhile'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleWhile1772); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:852:1: ( (lv_exp_1_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:853:1: (lv_exp_1_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:853:1: (lv_exp_1_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:854:3: lv_exp_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getWhileAccess().getExpExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleWhile1793);
            lv_exp_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleWhile1805); 

                	newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getDoKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:874:1: ( (lv_ins_3_0= ruleInstruction ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==22||LA11_0==28||LA11_0==31||LA11_0==52||(LA11_0>=54 && LA11_0<=55)||LA11_0==57||LA11_0==60) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:875:1: (lv_ins_3_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:875:1: (lv_ins_3_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:876:3: lv_ins_3_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhileAccess().getInsInstructionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleWhile1826);
            	    lv_ins_3_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ins",
            	            		lv_ins_3_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleWhile1839); 

                	newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getEndwhileKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleActionInstruction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:904:1: entryRuleActionInstruction returns [EObject current=null] : iv_ruleActionInstruction= ruleActionInstruction EOF ;
    public final EObject entryRuleActionInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionInstruction = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:905:2: (iv_ruleActionInstruction= ruleActionInstruction EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:906:2: iv_ruleActionInstruction= ruleActionInstruction EOF
            {
             newCompositeNode(grammarAccess.getActionInstructionRule()); 
            pushFollow(FOLLOW_ruleActionInstruction_in_entryRuleActionInstruction1875);
            iv_ruleActionInstruction=ruleActionInstruction();

            state._fsp--;

             current =iv_ruleActionInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionInstruction1885); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionInstruction"


    // $ANTLR start "ruleActionInstruction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:913:1: ruleActionInstruction returns [EObject current=null] : ( ( (lv_action_0_0= ruleClick ) ) | ( (lv_action_1_0= ruleCheck ) ) | ( (lv_action_2_0= ruleFill ) ) | ( (lv_action_3_0= ruleClear ) ) | this_GoTo_4= ruleGoTo ) ;
    public final EObject ruleActionInstruction() throws RecognitionException {
        EObject current = null;

        EObject lv_action_0_0 = null;

        EObject lv_action_1_0 = null;

        EObject lv_action_2_0 = null;

        EObject lv_action_3_0 = null;

        EObject this_GoTo_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:916:28: ( ( ( (lv_action_0_0= ruleClick ) ) | ( (lv_action_1_0= ruleCheck ) ) | ( (lv_action_2_0= ruleFill ) ) | ( (lv_action_3_0= ruleClear ) ) | this_GoTo_4= ruleGoTo ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:917:1: ( ( (lv_action_0_0= ruleClick ) ) | ( (lv_action_1_0= ruleCheck ) ) | ( (lv_action_2_0= ruleFill ) ) | ( (lv_action_3_0= ruleClear ) ) | this_GoTo_4= ruleGoTo )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:917:1: ( ( (lv_action_0_0= ruleClick ) ) | ( (lv_action_1_0= ruleCheck ) ) | ( (lv_action_2_0= ruleFill ) ) | ( (lv_action_3_0= ruleClear ) ) | this_GoTo_4= ruleGoTo )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt12=1;
                }
                break;
            case 54:
                {
                alt12=2;
                }
                break;
            case 55:
                {
                alt12=3;
                }
                break;
            case 57:
                {
                alt12=4;
                }
                break;
            case 60:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:917:2: ( (lv_action_0_0= ruleClick ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:917:2: ( (lv_action_0_0= ruleClick ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:918:1: (lv_action_0_0= ruleClick )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:918:1: (lv_action_0_0= ruleClick )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:919:3: lv_action_0_0= ruleClick
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionInstructionAccess().getActionClickParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClick_in_ruleActionInstruction1931);
                    lv_action_0_0=ruleClick();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionInstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"action",
                            		lv_action_0_0, 
                            		"Click");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:936:6: ( (lv_action_1_0= ruleCheck ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:936:6: ( (lv_action_1_0= ruleCheck ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:937:1: (lv_action_1_0= ruleCheck )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:937:1: (lv_action_1_0= ruleCheck )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:938:3: lv_action_1_0= ruleCheck
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionInstructionAccess().getActionCheckParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCheck_in_ruleActionInstruction1958);
                    lv_action_1_0=ruleCheck();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionInstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"action",
                            		lv_action_1_0, 
                            		"Check");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:955:6: ( (lv_action_2_0= ruleFill ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:955:6: ( (lv_action_2_0= ruleFill ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:956:1: (lv_action_2_0= ruleFill )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:956:1: (lv_action_2_0= ruleFill )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:957:3: lv_action_2_0= ruleFill
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionInstructionAccess().getActionFillParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFill_in_ruleActionInstruction1985);
                    lv_action_2_0=ruleFill();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionInstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"action",
                            		lv_action_2_0, 
                            		"Fill");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:974:6: ( (lv_action_3_0= ruleClear ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:974:6: ( (lv_action_3_0= ruleClear ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:975:1: (lv_action_3_0= ruleClear )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:975:1: (lv_action_3_0= ruleClear )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:976:3: lv_action_3_0= ruleClear
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionInstructionAccess().getActionClearParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClear_in_ruleActionInstruction2012);
                    lv_action_3_0=ruleClear();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionInstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"action",
                            		lv_action_3_0, 
                            		"Clear");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:994:5: this_GoTo_4= ruleGoTo
                    {
                     
                            newCompositeNode(grammarAccess.getActionInstructionAccess().getGoToParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleGoTo_in_ruleActionInstruction2040);
                    this_GoTo_4=ruleGoTo();

                    state._fsp--;

                     
                            current = this_GoTo_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionInstruction"


    // $ANTLR start "entryRuleVariableName"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1010:1: entryRuleVariableName returns [EObject current=null] : iv_ruleVariableName= ruleVariableName EOF ;
    public final EObject entryRuleVariableName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableName = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1011:2: (iv_ruleVariableName= ruleVariableName EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1012:2: iv_ruleVariableName= ruleVariableName EOF
            {
             newCompositeNode(grammarAccess.getVariableNameRule()); 
            pushFollow(FOLLOW_ruleVariableName_in_entryRuleVariableName2075);
            iv_ruleVariableName=ruleVariableName();

            state._fsp--;

             current =iv_ruleVariableName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableName2085); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableName"


    // $ANTLR start "ruleVariableName"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1019:1: ruleVariableName returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleVariableName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1022:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1023:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1023:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1024:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1024:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1025:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariableName2126); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableNameAccess().getNameSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableName"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1049:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1050:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1051:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration2166);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration2176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1058:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'var ' ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( (lv_val_3_0= ruleExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_1_0 = null;

        EObject lv_val_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1061:28: ( (otherlv_0= 'var ' ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( (lv_val_3_0= ruleExpression ) ) otherlv_4= ';' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1062:1: (otherlv_0= 'var ' ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( (lv_val_3_0= ruleExpression ) ) otherlv_4= ';' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1062:1: (otherlv_0= 'var ' ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( (lv_val_3_0= ruleExpression ) ) otherlv_4= ';' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1062:3: otherlv_0= 'var ' ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( (lv_val_3_0= ruleExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleDeclaration2213); 

                	newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getVarKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1066:1: ( (lv_name_1_0= ruleVariableName ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1067:1: (lv_name_1_0= ruleVariableName )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1067:1: (lv_name_1_0= ruleVariableName )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1068:3: lv_name_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getNameVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleDeclaration2234);
            lv_name_1_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleDeclaration2246); 

                	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getSpaceEqualsSignSpaceKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1088:1: ( (lv_val_3_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1089:1: (lv_val_3_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1089:1: (lv_val_3_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1090:3: lv_val_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getValExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleDeclaration2267);
            lv_val_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"val",
                    		lv_val_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleDeclaration2279); 

                	newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleAssignation"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1118:1: entryRuleAssignation returns [EObject current=null] : iv_ruleAssignation= ruleAssignation EOF ;
    public final EObject entryRuleAssignation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignation = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1119:2: (iv_ruleAssignation= ruleAssignation EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1120:2: iv_ruleAssignation= ruleAssignation EOF
            {
             newCompositeNode(grammarAccess.getAssignationRule()); 
            pushFollow(FOLLOW_ruleAssignation_in_entryRuleAssignation2315);
            iv_ruleAssignation=ruleAssignation();

            state._fsp--;

             current =iv_ruleAssignation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignation2325); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignation"


    // $ANTLR start "ruleAssignation"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1127:1: ruleAssignation returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariableReference ) ) otherlv_1= ' = ' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleAssignation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_var_0_0 = null;

        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1130:28: ( ( ( (lv_var_0_0= ruleVariableReference ) ) otherlv_1= ' = ' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1131:1: ( ( (lv_var_0_0= ruleVariableReference ) ) otherlv_1= ' = ' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1131:1: ( ( (lv_var_0_0= ruleVariableReference ) ) otherlv_1= ' = ' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1131:2: ( (lv_var_0_0= ruleVariableReference ) ) otherlv_1= ' = ' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1131:2: ( (lv_var_0_0= ruleVariableReference ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1132:1: (lv_var_0_0= ruleVariableReference )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1132:1: (lv_var_0_0= ruleVariableReference )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1133:3: lv_var_0_0= ruleVariableReference
            {
             
            	        newCompositeNode(grammarAccess.getAssignationAccess().getVarVariableReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableReference_in_ruleAssignation2371);
            lv_var_0_0=ruleVariableReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignationRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_0_0, 
                    		"VariableReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleAssignation2383); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignationAccess().getSpaceEqualsSignSpaceKeyword_1());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1153:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1154:1: (lv_expr_2_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1154:1: (lv_expr_2_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1155:3: lv_expr_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignationAccess().getExprExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignation2404);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignationRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleAssignation2416); 

                	newLeafNode(otherlv_3, grammarAccess.getAssignationAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignation"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1183:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1184:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1185:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2452);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2462); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1192:1: ruleExpression returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) | ( (lv_var_1_0= ruleVariable ) ) | ( (lv_act_2_0= ruleActionExpression ) ) | ( (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) ) | (otherlv_8= ' !' ( (lv_exp_9_0= ruleExpression ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_var_1_0 = null;

        EObject lv_act_2_0 = null;

        EObject lv_left_6_0 = null;

        EObject lv_right_7_0 = null;

        EObject lv_exp_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1195:28: ( ( ( (lv_type_0_0= ruleType ) ) | ( (lv_var_1_0= ruleVariable ) ) | ( (lv_act_2_0= ruleActionExpression ) ) | ( (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) ) | (otherlv_8= ' !' ( (lv_exp_9_0= ruleExpression ) ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1196:1: ( ( (lv_type_0_0= ruleType ) ) | ( (lv_var_1_0= ruleVariable ) ) | ( (lv_act_2_0= ruleActionExpression ) ) | ( (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) ) | (otherlv_8= ' !' ( (lv_exp_9_0= ruleExpression ) ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1196:1: ( ( (lv_type_0_0= ruleType ) ) | ( (lv_var_1_0= ruleVariable ) ) | ( (lv_act_2_0= ruleActionExpression ) ) | ( (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) ) | (otherlv_8= ' !' ( (lv_exp_9_0= ruleExpression ) ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 38:
            case 39:
            case 40:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                alt14=2;
                }
                break;
            case 58:
            case 59:
                {
                alt14=3;
                }
                break;
            case 34:
            case 35:
            case 36:
                {
                alt14=4;
                }
                break;
            case 37:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1196:2: ( (lv_type_0_0= ruleType ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1196:2: ( (lv_type_0_0= ruleType ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1197:1: (lv_type_0_0= ruleType )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1197:1: (lv_type_0_0= ruleType )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1198:3: lv_type_0_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getTypeTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleExpression2508);
                    lv_type_0_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_0_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1215:6: ( (lv_var_1_0= ruleVariable ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1215:6: ( (lv_var_1_0= ruleVariable ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1216:1: (lv_var_1_0= ruleVariable )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1216:1: (lv_var_1_0= ruleVariable )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1217:3: lv_var_1_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getVarVariableParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleExpression2535);
                    lv_var_1_0=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"var",
                            		lv_var_1_0, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1234:6: ( (lv_act_2_0= ruleActionExpression ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1234:6: ( (lv_act_2_0= ruleActionExpression ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1235:1: (lv_act_2_0= ruleActionExpression )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1235:1: (lv_act_2_0= ruleActionExpression )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1236:3: lv_act_2_0= ruleActionExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getActActionExpressionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionExpression_in_ruleExpression2562);
                    lv_act_2_0=ruleActionExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"act",
                            		lv_act_2_0, 
                            		"ActionExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1253:6: ( (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1253:6: ( (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1253:7: (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1253:7: (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' )
                    int alt13=3;
                    switch ( input.LA(1) ) {
                    case 34:
                        {
                        alt13=1;
                        }
                        break;
                    case 35:
                        {
                        alt13=2;
                        }
                        break;
                    case 36:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1253:9: otherlv_3= ' == '
                            {
                            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleExpression2582); 

                                	newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getSpaceEqualsSignEqualsSignSpaceKeyword_3_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1258:7: otherlv_4= ' > '
                            {
                            otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleExpression2600); 

                                	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getSpaceGreaterThanSignSpaceKeyword_3_0_1());
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1263:7: otherlv_5= ' < '
                            {
                            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleExpression2618); 

                                	newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getSpaceLessThanSignSpaceKeyword_3_0_2());
                                

                            }
                            break;

                    }

                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1267:2: ( (lv_left_6_0= ruleExpression ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1268:1: (lv_left_6_0= ruleExpression )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1268:1: (lv_left_6_0= ruleExpression )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1269:3: lv_left_6_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getLeftExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression2640);
                    lv_left_6_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_6_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1285:2: ( (lv_right_7_0= ruleExpression ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1286:1: (lv_right_7_0= ruleExpression )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1286:1: (lv_right_7_0= ruleExpression )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1287:3: lv_right_7_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression2661);
                    lv_right_7_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_7_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1304:6: (otherlv_8= ' !' ( (lv_exp_9_0= ruleExpression ) ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1304:6: (otherlv_8= ' !' ( (lv_exp_9_0= ruleExpression ) ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1304:8: otherlv_8= ' !' ( (lv_exp_9_0= ruleExpression ) )
                    {
                    otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleExpression2681); 

                        	newLeafNode(otherlv_8, grammarAccess.getExpressionAccess().getSpaceExclamationMarkKeyword_4_0());
                        
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1308:1: ( (lv_exp_9_0= ruleExpression ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1309:1: (lv_exp_9_0= ruleExpression )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1309:1: (lv_exp_9_0= ruleExpression )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1310:3: lv_exp_9_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getExpExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression2702);
                    lv_exp_9_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"exp",
                            		lv_exp_9_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1334:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1335:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1336:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2740);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2751); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1343:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bool ' | kw= 'string ' | kw= 'int ' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1346:28: ( (kw= 'bool ' | kw= 'string ' | kw= 'int ' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1347:1: (kw= 'bool ' | kw= 'string ' | kw= 'int ' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1347:1: (kw= 'bool ' | kw= 'string ' | kw= 'int ' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt15=1;
                }
                break;
            case 39:
                {
                alt15=2;
                }
                break;
            case 40:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1348:2: kw= 'bool '
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleType2789); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getBoolKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1355:2: kw= 'string '
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleType2808); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1362:2: kw= 'int '
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleType2827); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1375:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1376:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1377:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2867);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2877); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1384:1: ruleVariable returns [EObject current=null] : ( (lv_var_0_0= ruleVariableReference ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1387:28: ( ( (lv_var_0_0= ruleVariableReference ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1388:1: ( (lv_var_0_0= ruleVariableReference ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1388:1: ( (lv_var_0_0= ruleVariableReference ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1389:1: (lv_var_0_0= ruleVariableReference )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1389:1: (lv_var_0_0= ruleVariableReference )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1390:3: lv_var_0_0= ruleVariableReference
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getVarVariableReferenceParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableReference_in_ruleVariable2922);
            lv_var_0_0=ruleVariableReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_0_0, 
                    		"VariableReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleActionExpression"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1414:1: entryRuleActionExpression returns [EObject current=null] : iv_ruleActionExpression= ruleActionExpression EOF ;
    public final EObject entryRuleActionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionExpression = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1415:2: (iv_ruleActionExpression= ruleActionExpression EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1416:2: iv_ruleActionExpression= ruleActionExpression EOF
            {
             newCompositeNode(grammarAccess.getActionExpressionRule()); 
            pushFollow(FOLLOW_ruleActionExpression_in_entryRuleActionExpression2957);
            iv_ruleActionExpression=ruleActionExpression();

            state._fsp--;

             current =iv_ruleActionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionExpression2967); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionExpression"


    // $ANTLR start "ruleActionExpression"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1423:1: ruleActionExpression returns [EObject current=null] : ( ( (lv_expr_0_0= ruleVerify ) ) | ( (lv_expr_1_0= ruleExist ) ) ) ;
    public final EObject ruleActionExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;

        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1426:28: ( ( ( (lv_expr_0_0= ruleVerify ) ) | ( (lv_expr_1_0= ruleExist ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1427:1: ( ( (lv_expr_0_0= ruleVerify ) ) | ( (lv_expr_1_0= ruleExist ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1427:1: ( ( (lv_expr_0_0= ruleVerify ) ) | ( (lv_expr_1_0= ruleExist ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==58) ) {
                alt16=1;
            }
            else if ( (LA16_0==59) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1427:2: ( (lv_expr_0_0= ruleVerify ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1427:2: ( (lv_expr_0_0= ruleVerify ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1428:1: (lv_expr_0_0= ruleVerify )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1428:1: (lv_expr_0_0= ruleVerify )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1429:3: lv_expr_0_0= ruleVerify
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionExpressionAccess().getExprVerifyParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerify_in_ruleActionExpression3013);
                    lv_expr_0_0=ruleVerify();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_0_0, 
                            		"Verify");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1446:6: ( (lv_expr_1_0= ruleExist ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1446:6: ( (lv_expr_1_0= ruleExist ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1447:1: (lv_expr_1_0= ruleExist )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1447:1: (lv_expr_1_0= ruleExist )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1448:3: lv_expr_1_0= ruleExist
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionExpressionAccess().getExprExistParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExist_in_ruleActionExpression3040);
                    lv_expr_1_0=ruleExist();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_1_0, 
                            		"Exist");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionExpression"


    // $ANTLR start "entryRuleElement"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1472:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1473:2: (iv_ruleElement= ruleElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1474:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement3076);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement3086); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1481:1: ruleElement returns [EObject current=null] : (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_ClickableElement_0 = null;

        EObject this_FillableElement_1 = null;

        EObject this_CheckableElement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1484:28: ( (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1485:1: (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1485:1: (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 42:
            case 43:
            case 44:
                {
                alt17=1;
                }
                break;
            case 45:
                {
                alt17=2;
                }
                break;
            case 41:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1486:5: this_ClickableElement_0= ruleClickableElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getClickableElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClickableElement_in_ruleElement3133);
                    this_ClickableElement_0=ruleClickableElement();

                    state._fsp--;

                     
                            current = this_ClickableElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1496:5: this_FillableElement_1= ruleFillableElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getFillableElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleElement3160);
                    this_FillableElement_1=ruleFillableElement();

                    state._fsp--;

                     
                            current = this_FillableElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1506:5: this_CheckableElement_2= ruleCheckableElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getCheckableElementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleElement3187);
                    this_CheckableElement_2=ruleCheckableElement();

                    state._fsp--;

                     
                            current = this_CheckableElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleClickableElement"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1522:1: entryRuleClickableElement returns [EObject current=null] : iv_ruleClickableElement= ruleClickableElement EOF ;
    public final EObject entryRuleClickableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickableElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1523:2: (iv_ruleClickableElement= ruleClickableElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1524:2: iv_ruleClickableElement= ruleClickableElement EOF
            {
             newCompositeNode(grammarAccess.getClickableElementRule()); 
            pushFollow(FOLLOW_ruleClickableElement_in_entryRuleClickableElement3222);
            iv_ruleClickableElement=ruleClickableElement();

            state._fsp--;

             current =iv_ruleClickableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClickableElement3232); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClickableElement"


    // $ANTLR start "ruleClickableElement"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1531:1: ruleClickableElement returns [EObject current=null] : (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage ) ;
    public final EObject ruleClickableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Link_0 = null;

        EObject this_Button_1 = null;

        EObject this_Image_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1534:28: ( (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1535:1: (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1535:1: (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt18=1;
                }
                break;
            case 43:
                {
                alt18=2;
                }
                break;
            case 44:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1536:5: this_Link_0= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getClickableElementAccess().getLinkParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleClickableElement3279);
                    this_Link_0=ruleLink();

                    state._fsp--;

                     
                            current = this_Link_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1546:5: this_Button_1= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getClickableElementAccess().getButtonParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleClickableElement3306);
                    this_Button_1=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1556:5: this_Image_2= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getClickableElementAccess().getImageParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleClickableElement3333);
                    this_Image_2=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClickableElement"


    // $ANTLR start "entryRuleFillableElement"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1572:1: entryRuleFillableElement returns [EObject current=null] : iv_ruleFillableElement= ruleFillableElement EOF ;
    public final EObject entryRuleFillableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFillableElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1573:2: (iv_ruleFillableElement= ruleFillableElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1574:2: iv_ruleFillableElement= ruleFillableElement EOF
            {
             newCompositeNode(grammarAccess.getFillableElementRule()); 
            pushFollow(FOLLOW_ruleFillableElement_in_entryRuleFillableElement3368);
            iv_ruleFillableElement=ruleFillableElement();

            state._fsp--;

             current =iv_ruleFillableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFillableElement3378); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFillableElement"


    // $ANTLR start "ruleFillableElement"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1581:1: ruleFillableElement returns [EObject current=null] : this_TextField_0= ruleTextField ;
    public final EObject ruleFillableElement() throws RecognitionException {
        EObject current = null;

        EObject this_TextField_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1584:28: (this_TextField_0= ruleTextField )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1586:5: this_TextField_0= ruleTextField
            {
             
                    newCompositeNode(grammarAccess.getFillableElementAccess().getTextFieldParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTextField_in_ruleFillableElement3424);
            this_TextField_0=ruleTextField();

            state._fsp--;

             
                    current = this_TextField_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFillableElement"


    // $ANTLR start "entryRuleCheckableElement"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1602:1: entryRuleCheckableElement returns [EObject current=null] : iv_ruleCheckableElement= ruleCheckableElement EOF ;
    public final EObject entryRuleCheckableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckableElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1603:2: (iv_ruleCheckableElement= ruleCheckableElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1604:2: iv_ruleCheckableElement= ruleCheckableElement EOF
            {
             newCompositeNode(grammarAccess.getCheckableElementRule()); 
            pushFollow(FOLLOW_ruleCheckableElement_in_entryRuleCheckableElement3458);
            iv_ruleCheckableElement=ruleCheckableElement();

            state._fsp--;

             current =iv_ruleCheckableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckableElement3468); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckableElement"


    // $ANTLR start "ruleCheckableElement"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1611:1: ruleCheckableElement returns [EObject current=null] : this_Checkbox_0= ruleCheckbox ;
    public final EObject ruleCheckableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Checkbox_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1614:28: (this_Checkbox_0= ruleCheckbox )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1616:5: this_Checkbox_0= ruleCheckbox
            {
             
                    newCompositeNode(grammarAccess.getCheckableElementAccess().getCheckboxParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleCheckbox_in_ruleCheckableElement3514);
            this_Checkbox_0=ruleCheckbox();

            state._fsp--;

             
                    current = this_Checkbox_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckableElement"


    // $ANTLR start "entryRuleCheckbox"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1632:1: entryRuleCheckbox returns [EObject current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final EObject entryRuleCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckbox = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1633:2: (iv_ruleCheckbox= ruleCheckbox EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1634:2: iv_ruleCheckbox= ruleCheckbox EOF
            {
             newCompositeNode(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_ruleCheckbox_in_entryRuleCheckbox3548);
            iv_ruleCheckbox=ruleCheckbox();

            state._fsp--;

             current =iv_ruleCheckbox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckbox3558); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1641:1: ruleCheckbox returns [EObject current=null] : (otherlv_0= 'checkbox ' ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) ;
    public final EObject ruleCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_check_1_0=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1644:28: ( (otherlv_0= 'checkbox ' ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1645:1: (otherlv_0= 'checkbox ' ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1645:1: (otherlv_0= 'checkbox ' ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1645:3: otherlv_0= 'checkbox ' ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleCheckbox3595); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1649:1: ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1649:2: ( (lv_check_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1649:2: ( (lv_check_1_0= RULE_STRING ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1650:1: (lv_check_1_0= RULE_STRING )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1650:1: (lv_check_1_0= RULE_STRING )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1651:3: lv_check_1_0= RULE_STRING
                    {
                    lv_check_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckbox3613); 

                    			newLeafNode(lv_check_1_0, grammarAccess.getCheckboxAccess().getCheckSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCheckboxRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"check",
                            		lv_check_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1669:5: this_Variable_2= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getCheckboxAccess().getVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleCheckbox3646);
                    this_Variable_2=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "entryRuleLink"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1685:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1686:2: (iv_ruleLink= ruleLink EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1687:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink3682);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink3692); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1694:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link ' ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_link_1_0=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1697:28: ( (otherlv_0= 'link ' ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1698:1: (otherlv_0= 'link ' ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1698:1: (otherlv_0= 'link ' ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1698:3: otherlv_0= 'link ' ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleLink3729); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1702:1: ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1702:2: ( (lv_link_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1702:2: ( (lv_link_1_0= RULE_STRING ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1703:1: (lv_link_1_0= RULE_STRING )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1703:1: (lv_link_1_0= RULE_STRING )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1704:3: lv_link_1_0= RULE_STRING
                    {
                    lv_link_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink3747); 

                    			newLeafNode(lv_link_1_0, grammarAccess.getLinkAccess().getLinkSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"link",
                            		lv_link_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1722:5: this_Variable_2= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getLinkAccess().getVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleLink3780);
                    this_Variable_2=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleButton"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1738:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1739:2: (iv_ruleButton= ruleButton EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1740:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton3816);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton3826); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1747:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button ' ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_but_1_0=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1750:28: ( (otherlv_0= 'button ' ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1751:1: (otherlv_0= 'button ' ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1751:1: (otherlv_0= 'button ' ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1751:3: otherlv_0= 'button ' ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleButton3863); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1755:1: ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1755:2: ( (lv_but_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1755:2: ( (lv_but_1_0= RULE_STRING ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1756:1: (lv_but_1_0= RULE_STRING )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1756:1: (lv_but_1_0= RULE_STRING )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1757:3: lv_but_1_0= RULE_STRING
                    {
                    lv_but_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButton3881); 

                    			newLeafNode(lv_but_1_0, grammarAccess.getButtonAccess().getButSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"but",
                            		lv_but_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1775:5: this_Variable_2= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getButtonAccess().getVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleButton3914);
                    this_Variable_2=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleImage"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1791:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1792:2: (iv_ruleImage= ruleImage EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1793:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage3950);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage3960); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1800:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image ' ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_img_1_0=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1803:28: ( (otherlv_0= 'image ' ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1804:1: (otherlv_0= 'image ' ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1804:1: (otherlv_0= 'image ' ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1804:3: otherlv_0= 'image ' ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleImage3997); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1808:1: ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1808:2: ( (lv_img_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1808:2: ( (lv_img_1_0= RULE_STRING ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1809:1: (lv_img_1_0= RULE_STRING )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1809:1: (lv_img_1_0= RULE_STRING )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1810:3: lv_img_1_0= RULE_STRING
                    {
                    lv_img_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImage4015); 

                    			newLeafNode(lv_img_1_0, grammarAccess.getImageAccess().getImgSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"img",
                            		lv_img_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1828:5: this_Variable_2= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getImageAccess().getVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleImage4048);
                    this_Variable_2=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleTextField"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1844:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1845:2: (iv_ruleTextField= ruleTextField EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1846:2: iv_ruleTextField= ruleTextField EOF
            {
             newCompositeNode(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_ruleTextField_in_entryRuleTextField4084);
            iv_ruleTextField=ruleTextField();

            state._fsp--;

             current =iv_ruleTextField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextField4094); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1853:1: ruleTextField returns [EObject current=null] : (otherlv_0= 'textField ' ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1856:28: ( (otherlv_0= 'textField ' ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1857:1: (otherlv_0= 'textField ' ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1857:1: (otherlv_0= 'textField ' ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1857:3: otherlv_0= 'textField ' ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleTextField4131); 

                	newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1861:1: ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1861:2: ( (lv_text_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1861:2: ( (lv_text_1_0= RULE_STRING ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1862:1: (lv_text_1_0= RULE_STRING )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1862:1: (lv_text_1_0= RULE_STRING )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1863:3: lv_text_1_0= RULE_STRING
                    {
                    lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextField4149); 

                    			newLeafNode(lv_text_1_0, grammarAccess.getTextFieldAccess().getTextSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextFieldRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1881:5: this_Variable_2= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getTextFieldAccess().getVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleTextField4182);
                    this_Variable_2=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleTypeElement"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1897:1: entryRuleTypeElement returns [EObject current=null] : iv_ruleTypeElement= ruleTypeElement EOF ;
    public final EObject entryRuleTypeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1898:2: (iv_ruleTypeElement= ruleTypeElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1899:2: iv_ruleTypeElement= ruleTypeElement EOF
            {
             newCompositeNode(grammarAccess.getTypeElementRule()); 
            pushFollow(FOLLOW_ruleTypeElement_in_entryRuleTypeElement4218);
            iv_ruleTypeElement=ruleTypeElement();

            state._fsp--;

             current =iv_ruleTypeElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeElement4228); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeElement"


    // $ANTLR start "ruleTypeElement"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1906:1: ruleTypeElement returns [EObject current=null] : ( ( (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' ) ) ) ;
    public final EObject ruleTypeElement() throws RecognitionException {
        EObject current = null;

        Token lv_elem_0_1=null;
        Token lv_elem_0_2=null;
        Token lv_elem_0_3=null;
        Token lv_elem_0_4=null;
        Token lv_elem_0_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1909:28: ( ( ( (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1910:1: ( ( (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1910:1: ( ( (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1911:1: ( (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1911:1: ( (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1912:1: (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1912:1: (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt24=1;
                }
                break;
            case 47:
                {
                alt24=2;
                }
                break;
            case 48:
                {
                alt24=3;
                }
                break;
            case 49:
                {
                alt24=4;
                }
                break;
            case 50:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1913:3: lv_elem_0_1= 'checkbox'
                    {
                    lv_elem_0_1=(Token)match(input,46,FOLLOW_46_in_ruleTypeElement4272); 

                            newLeafNode(lv_elem_0_1, grammarAccess.getTypeElementAccess().getElemCheckboxKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeElementRule());
                    	        }
                           		setWithLastConsumed(current, "elem", lv_elem_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1925:8: lv_elem_0_2= 'link'
                    {
                    lv_elem_0_2=(Token)match(input,47,FOLLOW_47_in_ruleTypeElement4301); 

                            newLeafNode(lv_elem_0_2, grammarAccess.getTypeElementAccess().getElemLinkKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeElementRule());
                    	        }
                           		setWithLastConsumed(current, "elem", lv_elem_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1937:8: lv_elem_0_3= 'button'
                    {
                    lv_elem_0_3=(Token)match(input,48,FOLLOW_48_in_ruleTypeElement4330); 

                            newLeafNode(lv_elem_0_3, grammarAccess.getTypeElementAccess().getElemButtonKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeElementRule());
                    	        }
                           		setWithLastConsumed(current, "elem", lv_elem_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1949:8: lv_elem_0_4= 'image'
                    {
                    lv_elem_0_4=(Token)match(input,49,FOLLOW_49_in_ruleTypeElement4359); 

                            newLeafNode(lv_elem_0_4, grammarAccess.getTypeElementAccess().getElemImageKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeElementRule());
                    	        }
                           		setWithLastConsumed(current, "elem", lv_elem_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1961:8: lv_elem_0_5= 'textField'
                    {
                    lv_elem_0_5=(Token)match(input,50,FOLLOW_50_in_ruleTypeElement4388); 

                            newLeafNode(lv_elem_0_5, grammarAccess.getTypeElementAccess().getElemTextFieldKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeElementRule());
                    	        }
                           		setWithLastConsumed(current, "elem", lv_elem_0_5, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeElement"


    // $ANTLR start "entryRuleSelect"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1984:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1985:2: (iv_ruleSelect= ruleSelect EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1986:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect4439);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect4449); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1993:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select(' ( (lv_value_1_0= ruleTypeElement ) ) otherlv_2= ')' ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1996:28: ( (otherlv_0= 'select(' ( (lv_value_1_0= ruleTypeElement ) ) otherlv_2= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1997:1: (otherlv_0= 'select(' ( (lv_value_1_0= ruleTypeElement ) ) otherlv_2= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1997:1: (otherlv_0= 'select(' ( (lv_value_1_0= ruleTypeElement ) ) otherlv_2= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1997:3: otherlv_0= 'select(' ( (lv_value_1_0= ruleTypeElement ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleSelect4486); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2001:1: ( (lv_value_1_0= ruleTypeElement ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2002:1: (lv_value_1_0= ruleTypeElement )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2002:1: (lv_value_1_0= ruleTypeElement )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2003:3: lv_value_1_0= ruleTypeElement
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getValueTypeElementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeElement_in_ruleSelect4507);
            lv_value_1_0=ruleTypeElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"TypeElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSelect4519); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getRightParenthesisKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleClick"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2031:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2032:2: (iv_ruleClick= ruleClick EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2033:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_ruleClick_in_entryRuleClick4555);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClick4565); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2040:1: ruleClick returns [EObject current=null] : (otherlv_0= 'click(' ( ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_val_1_1 = null;

        EObject lv_val_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2043:28: ( (otherlv_0= 'click(' ( ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2044:1: (otherlv_0= 'click(' ( ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2044:1: (otherlv_0= 'click(' ( ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2044:3: otherlv_0= 'click(' ( ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleClick4602); 

                	newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2048:1: ( ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2049:1: ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2049:1: ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2050:1: (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2050:1: (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=42 && LA25_0<=44)) ) {
                alt25=1;
            }
            else if ( (LA25_0==51) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2051:3: lv_val_1_1= ruleClickableElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getClickAccess().getValClickableElementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClickableElement_in_ruleClick4625);
                    lv_val_1_1=ruleClickableElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClickRule());
                    	        }
                           		set(
                           			current, 
                           			"val",
                            		lv_val_1_1, 
                            		"ClickableElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2066:8: lv_val_1_2= ruleSelect
                    {
                     
                    	        newCompositeNode(grammarAccess.getClickAccess().getValSelectParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleSelect_in_ruleClick4644);
                    lv_val_1_2=ruleSelect();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClickRule());
                    	        }
                           		set(
                           			current, 
                           			"val",
                            		lv_val_1_2, 
                            		"Select");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleClick4659); 

                	newLeafNode(otherlv_2, grammarAccess.getClickAccess().getRightParenthesisSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleCheck"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2096:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2097:2: (iv_ruleCheck= ruleCheck EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2098:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck4695);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck4705); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2105:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'check(' ( ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_val_1_1 = null;

        EObject lv_val_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2108:28: ( (otherlv_0= 'check(' ( ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2109:1: (otherlv_0= 'check(' ( ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2109:1: (otherlv_0= 'check(' ( ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2109:3: otherlv_0= 'check(' ( ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleCheck4742); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2113:1: ( ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2114:1: ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2114:1: ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2115:1: (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2115:1: (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            else if ( (LA26_0==51) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2116:3: lv_val_1_1= ruleCheckableElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckAccess().getValCheckableElementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleCheck4765);
                    lv_val_1_1=ruleCheckableElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckRule());
                    	        }
                           		set(
                           			current, 
                           			"val",
                            		lv_val_1_1, 
                            		"CheckableElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2131:8: lv_val_1_2= ruleSelect
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckAccess().getValSelectParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleSelect_in_ruleCheck4784);
                    lv_val_1_2=ruleSelect();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckRule());
                    	        }
                           		set(
                           			current, 
                           			"val",
                            		lv_val_1_2, 
                            		"Select");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleCheck4799); 

                	newLeafNode(otherlv_2, grammarAccess.getCheckAccess().getRightParenthesisSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleFill"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2161:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2162:2: (iv_ruleFill= ruleFill EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2163:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_ruleFill_in_entryRuleFill4835);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFill4845); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2170:1: ruleFill returns [EObject current=null] : (otherlv_0= 'fill(' ( ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ');' ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_STRING_3=null;
        Token otherlv_4=null;
        EObject lv_val_1_1 = null;

        EObject lv_val_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2173:28: ( (otherlv_0= 'fill(' ( ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2174:1: (otherlv_0= 'fill(' ( ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2174:1: (otherlv_0= 'fill(' ( ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2174:3: otherlv_0= 'fill(' ( ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ');'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleFill4882); 

                	newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2178:1: ( ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2179:1: ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2179:1: ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2180:1: (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2180:1: (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            else if ( (LA27_0==51) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2181:3: lv_val_1_1= ruleFillableElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getFillAccess().getValFillableElementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleFill4905);
                    lv_val_1_1=ruleFillableElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFillRule());
                    	        }
                           		set(
                           			current, 
                           			"val",
                            		lv_val_1_1, 
                            		"FillableElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2196:8: lv_val_1_2= ruleSelect
                    {
                     
                    	        newCompositeNode(grammarAccess.getFillAccess().getValSelectParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleSelect_in_ruleFill4924);
                    lv_val_1_2=ruleSelect();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFillRule());
                    	        }
                           		set(
                           			current, 
                           			"val",
                            		lv_val_1_2, 
                            		"Select");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleFill4939); 

                	newLeafNode(otherlv_2, grammarAccess.getFillAccess().getValueKeyword_2());
                
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFill4950); 
             
                newLeafNode(this_STRING_3, grammarAccess.getFillAccess().getSTRINGTerminalRuleCall_3()); 
                
            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleFill4961); 

                	newLeafNode(otherlv_4, grammarAccess.getFillAccess().getRightParenthesisSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleClear"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2234:1: entryRuleClear returns [EObject current=null] : iv_ruleClear= ruleClear EOF ;
    public final EObject entryRuleClear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClear = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2235:2: (iv_ruleClear= ruleClear EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2236:2: iv_ruleClear= ruleClear EOF
            {
             newCompositeNode(grammarAccess.getClearRule()); 
            pushFollow(FOLLOW_ruleClear_in_entryRuleClear4997);
            iv_ruleClear=ruleClear();

            state._fsp--;

             current =iv_ruleClear; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClear5007); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClear"


    // $ANTLR start "ruleClear"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2243:1: ruleClear returns [EObject current=null] : (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ');' ) ;
    public final EObject ruleClear() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_FillableElement_1 = null;

        EObject this_CheckableElement_2 = null;

        EObject this_Select_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2246:28: ( (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2247:1: (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2247:1: (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2247:3: otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ');'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleClear5044); 

                	newLeafNode(otherlv_0, grammarAccess.getClearAccess().getClearKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2251:1: (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt28=1;
                }
                break;
            case 41:
                {
                alt28=2;
                }
                break;
            case 51:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2252:5: this_FillableElement_1= ruleFillableElement
                    {
                     
                            newCompositeNode(grammarAccess.getClearAccess().getFillableElementParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleClear5067);
                    this_FillableElement_1=ruleFillableElement();

                    state._fsp--;

                     
                            current = this_FillableElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2262:5: this_CheckableElement_2= ruleCheckableElement
                    {
                     
                            newCompositeNode(grammarAccess.getClearAccess().getCheckableElementParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleClear5094);
                    this_CheckableElement_2=ruleCheckableElement();

                    state._fsp--;

                     
                            current = this_CheckableElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2272:5: this_Select_3= ruleSelect
                    {
                     
                            newCompositeNode(grammarAccess.getClearAccess().getSelectParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleSelect_in_ruleClear5121);
                    this_Select_3=ruleSelect();

                    state._fsp--;

                     
                            current = this_Select_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleClear5133); 

                	newLeafNode(otherlv_4, grammarAccess.getClearAccess().getRightParenthesisSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClear"


    // $ANTLR start "entryRuleVerify"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2292:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2293:2: (iv_ruleVerify= ruleVerify EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2294:2: iv_ruleVerify= ruleVerify EOF
            {
             newCompositeNode(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_ruleVerify_in_entryRuleVerify5169);
            iv_ruleVerify=ruleVerify();

            state._fsp--;

             current =iv_ruleVerify; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerify5179); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2301:1: ruleVerify returns [EObject current=null] : (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ', value=' this_STRING_5= RULE_STRING otherlv_6= ');' ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token this_STRING_5=null;
        Token otherlv_6=null;
        EObject this_FillableElement_1 = null;

        EObject this_CheckableElement_2 = null;

        EObject this_Select_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2304:28: ( (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ', value=' this_STRING_5= RULE_STRING otherlv_6= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2305:1: (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ', value=' this_STRING_5= RULE_STRING otherlv_6= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2305:1: (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ', value=' this_STRING_5= RULE_STRING otherlv_6= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2305:3: otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ', value=' this_STRING_5= RULE_STRING otherlv_6= ');'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleVerify5216); 

                	newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2309:1: (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt29=1;
                }
                break;
            case 41:
                {
                alt29=2;
                }
                break;
            case 51:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2310:5: this_FillableElement_1= ruleFillableElement
                    {
                     
                            newCompositeNode(grammarAccess.getVerifyAccess().getFillableElementParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleVerify5239);
                    this_FillableElement_1=ruleFillableElement();

                    state._fsp--;

                     
                            current = this_FillableElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2320:5: this_CheckableElement_2= ruleCheckableElement
                    {
                     
                            newCompositeNode(grammarAccess.getVerifyAccess().getCheckableElementParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleVerify5266);
                    this_CheckableElement_2=ruleCheckableElement();

                    state._fsp--;

                     
                            current = this_CheckableElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2330:5: this_Select_3= ruleSelect
                    {
                     
                            newCompositeNode(grammarAccess.getVerifyAccess().getSelectParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleSelect_in_ruleVerify5293);
                    this_Select_3=ruleSelect();

                    state._fsp--;

                     
                            current = this_Select_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleVerify5305); 

                	newLeafNode(otherlv_4, grammarAccess.getVerifyAccess().getValueKeyword_2());
                
            this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVerify5316); 
             
                newLeafNode(this_STRING_5, grammarAccess.getVerifyAccess().getSTRINGTerminalRuleCall_3()); 
                
            otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleVerify5327); 

                	newLeafNode(otherlv_6, grammarAccess.getVerifyAccess().getRightParenthesisSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleExist"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2358:1: entryRuleExist returns [EObject current=null] : iv_ruleExist= ruleExist EOF ;
    public final EObject entryRuleExist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExist = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2359:2: (iv_ruleExist= ruleExist EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2360:2: iv_ruleExist= ruleExist EOF
            {
             newCompositeNode(grammarAccess.getExistRule()); 
            pushFollow(FOLLOW_ruleExist_in_entryRuleExist5363);
            iv_ruleExist=ruleExist();

            state._fsp--;

             current =iv_ruleExist; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExist5373); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExist"


    // $ANTLR start "ruleExist"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2367:1: ruleExist returns [EObject current=null] : (otherlv_0= 'exist(' ( ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' ) ;
    public final EObject ruleExist() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_val_1_1 = null;

        EObject lv_val_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2370:28: ( (otherlv_0= 'exist(' ( ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2371:1: (otherlv_0= 'exist(' ( ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2371:1: (otherlv_0= 'exist(' ( ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2371:3: otherlv_0= 'exist(' ( ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleExist5410); 

                	newLeafNode(otherlv_0, grammarAccess.getExistAccess().getExistKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2375:1: ( ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2376:1: ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2376:1: ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2377:1: (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2377:1: (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=41 && LA30_0<=45)) ) {
                alt30=1;
            }
            else if ( (LA30_0==51) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2378:3: lv_val_1_1= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getExistAccess().getValElementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElement_in_ruleExist5433);
                    lv_val_1_1=ruleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExistRule());
                    	        }
                           		set(
                           			current, 
                           			"val",
                            		lv_val_1_1, 
                            		"Element");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2393:8: lv_val_1_2= ruleSelect
                    {
                     
                    	        newCompositeNode(grammarAccess.getExistAccess().getValSelectParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleSelect_in_ruleExist5452);
                    lv_val_1_2=ruleSelect();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExistRule());
                    	        }
                           		set(
                           			current, 
                           			"val",
                            		lv_val_1_2, 
                            		"Select");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleExist5467); 

                	newLeafNode(otherlv_2, grammarAccess.getExistAccess().getRightParenthesisSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExist"


    // $ANTLR start "entryRuleGoTo"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2423:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2424:2: (iv_ruleGoTo= ruleGoTo EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2425:2: iv_ruleGoTo= ruleGoTo EOF
            {
             newCompositeNode(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_ruleGoTo_in_entryRuleGoTo5503);
            iv_ruleGoTo=ruleGoTo();

            state._fsp--;

             current =iv_ruleGoTo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoTo5513); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2432:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ');' ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2435:28: ( (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2436:1: (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2436:1: (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2436:3: otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ');'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleGoTo5550); 

                	newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGoToKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2440:1: ( (lv_url_1_0= RULE_URL ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2441:1: (lv_url_1_0= RULE_URL )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2441:1: (lv_url_1_0= RULE_URL )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2442:3: lv_url_1_0= RULE_URL
            {
            lv_url_1_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleGoTo5567); 

            			newLeafNode(lv_url_1_0, grammarAccess.getGoToAccess().getUrlURLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoToRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"url",
                    		lv_url_1_0, 
                    		"URL");
            	    

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleGoTo5584); 

                	newLeafNode(otherlv_2, grammarAccess.getGoToAccess().getRightParenthesisSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoTo"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_ruleProgram131 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_ruleMain_in_ruleProgram153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_entryRuleSubroutine189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutine199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSubroutine236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHead_in_ruleSubroutine257 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleBody_in_ruleSubroutine278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleHead371 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHead383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleHead412 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHead424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleHead445 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleHead458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleHead479 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleHead493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionReference_in_entryRuleFunctionReference530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionReference540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionReference584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionReference_in_ruleFunctionCall766 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionCall777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionReference_in_ruleFunctionCall807 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionCall818 = new BitSet(new long[]{0x0C0001FC00000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall839 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionCall852 = new BitSet(new long[]{0x0C0001FC00000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall873 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionCall887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_entryRuleFunctionName924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionName934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionName975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain1015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMain1062 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleBody_in_ruleMain1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody1119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBody1166 = new BitSet(new long[]{0x12D0000090400010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBody1187 = new BitSet(new long[]{0x12D0000090600010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBody1208 = new BitSet(new long[]{0x12D0000090600010L});
    public static final BitSet FOLLOW_21_in_ruleBody1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction1257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleInstruction1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleInstruction1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleInstruction1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionInstruction_in_ruleInstruction1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignation_in_ruleInstruction1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleInstruction1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCondition1531 = new BitSet(new long[]{0x0000000001820000L});
    public static final BitSet FOLLOW_23_in_ruleCondition1544 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_24_in_ruleCondition1562 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCondition1576 = new BitSet(new long[]{0x0C0001FC00000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition1597 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCondition1609 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCondition1621 = new BitSet(new long[]{0x12D0000090400010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleCondition1642 = new BitSet(new long[]{0x12D0000094400010L});
    public static final BitSet FOLLOW_26_in_ruleCondition1655 = new BitSet(new long[]{0x12D0000090400010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleCondition1676 = new BitSet(new long[]{0x12D0000098400010L});
    public static final BitSet FOLLOW_27_in_ruleCondition1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile1725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleWhile1772 = new BitSet(new long[]{0x0C0001FC00000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhile1793 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleWhile1805 = new BitSet(new long[]{0x12D0000090400010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleWhile1826 = new BitSet(new long[]{0x12D00000D0400010L});
    public static final BitSet FOLLOW_30_in_ruleWhile1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionInstruction_in_entryRuleActionInstruction1875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionInstruction1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_ruleActionInstruction1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleActionInstruction1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_ruleActionInstruction1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClear_in_ruleActionInstruction2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_ruleActionInstruction2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName2075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariableName2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration2166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDeclaration2213 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleDeclaration2234 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDeclaration2246 = new BitSet(new long[]{0x0C0001FC00000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDeclaration2267 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDeclaration2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignation_in_entryRuleAssignation2315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignation2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAssignation2371 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleAssignation2383 = new BitSet(new long[]{0x0C0001FC00000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignation2404 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAssignation2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleExpression2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExpression2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleExpression2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleExpression2582 = new BitSet(new long[]{0x0C0001FC00000010L});
    public static final BitSet FOLLOW_35_in_ruleExpression2600 = new BitSet(new long[]{0x0C0001FC00000010L});
    public static final BitSet FOLLOW_36_in_ruleExpression2618 = new BitSet(new long[]{0x0C0001FC00000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression2640 = new BitSet(new long[]{0x0C0001FC00000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleExpression2681 = new BitSet(new long[]{0x0C0001FC00000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleType2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleType2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleType2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleVariable2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_in_entryRuleActionExpression2957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionExpression2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_ruleActionExpression3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExist_in_ruleActionExpression3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement3076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickableElement_in_ruleElement3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleElement3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleElement3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickableElement_in_entryRuleClickableElement3222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClickableElement3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleClickableElement3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleClickableElement3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleClickableElement3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFillableElement_in_entryRuleFillableElement3368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFillableElement3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_ruleFillableElement3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_entryRuleCheckableElement3458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckableElement3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_ruleCheckableElement3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_entryRuleCheckbox3548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckbox3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCheckbox3595 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckbox3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCheckbox3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink3682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLink3729 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLink3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton3816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleButton3863 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButton3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleButton3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage3950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleImage3997 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImage4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleImage4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField4084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextField4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTextField4131 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextField4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTextField4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeElement_in_entryRuleTypeElement4218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeElement4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTypeElement4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTypeElement4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTypeElement4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTypeElement4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTypeElement4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect4439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSelect4486 = new BitSet(new long[]{0x0007C00000000000L});
    public static final BitSet FOLLOW_ruleTypeElement_in_ruleSelect4507 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSelect4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_entryRuleClick4555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClick4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleClick4602 = new BitSet(new long[]{0x00081C0000000000L});
    public static final BitSet FOLLOW_ruleClickableElement_in_ruleClick4625 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleClick4644 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleClick4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_entryRuleCheck4695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheck4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleCheck4742 = new BitSet(new long[]{0x00081E0000000000L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleCheck4765 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleCheck4784 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleCheck4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_entryRuleFill4835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFill4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleFill4882 = new BitSet(new long[]{0x00083C0000000000L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleFill4905 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleFill4924 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleFill4939 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFill4950 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleFill4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClear_in_entryRuleClear4997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClear5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleClear5044 = new BitSet(new long[]{0x00083E0000000000L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleClear5067 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleClear5094 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleClear5121 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleClear5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_entryRuleVerify5169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerify5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleVerify5216 = new BitSet(new long[]{0x00083E0000000000L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleVerify5239 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleVerify5266 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleVerify5293 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleVerify5305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVerify5316 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleVerify5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExist_in_entryRuleExist5363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExist5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleExist5410 = new BitSet(new long[]{0x00083E0000000000L});
    public static final BitSet FOLLOW_ruleElement_in_ruleExist5433 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleExist5452 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleExist5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_entryRuleGoTo5503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoTo5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleGoTo5550 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleGoTo5567 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleGoTo5584 = new BitSet(new long[]{0x0000000000000002L});

}