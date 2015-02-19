package org.xtext.mda.project.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_URL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'browser '", "';'", "'sub '", "'{'", "'}'", "'()'", "'(var '", "', var '", "')'", "'main'", "'('", "', '", "'var '", "' = '", "'goTo('", "'checkbox('", "'link('", "'button('", "'image('", "'textField('", "'.click()'", "'.isCheck('", "'.clear()'", "'.verify('", "'.fill('", "'true'", "'false'", "'Chrome'", "'Firefox'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:68:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:69:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:70:2: iv_ruleProgram= ruleProgram EOF
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:77:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'browser ' ( (lv_browser_1_0= ruleOpenBrowser ) ) otherlv_2= ';' ( (lv_variables_3_0= ruleDeclaration ) )* ( (lv_subroutines_4_0= ruleSubroutine ) )* ( (lv_main_5_0= ruleMain ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_browser_1_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_subroutines_4_0 = null;

        EObject lv_main_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:80:28: ( (otherlv_0= 'browser ' ( (lv_browser_1_0= ruleOpenBrowser ) ) otherlv_2= ';' ( (lv_variables_3_0= ruleDeclaration ) )* ( (lv_subroutines_4_0= ruleSubroutine ) )* ( (lv_main_5_0= ruleMain ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:81:1: (otherlv_0= 'browser ' ( (lv_browser_1_0= ruleOpenBrowser ) ) otherlv_2= ';' ( (lv_variables_3_0= ruleDeclaration ) )* ( (lv_subroutines_4_0= ruleSubroutine ) )* ( (lv_main_5_0= ruleMain ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:81:1: (otherlv_0= 'browser ' ( (lv_browser_1_0= ruleOpenBrowser ) ) otherlv_2= ';' ( (lv_variables_3_0= ruleDeclaration ) )* ( (lv_subroutines_4_0= ruleSubroutine ) )* ( (lv_main_5_0= ruleMain ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:81:3: otherlv_0= 'browser ' ( (lv_browser_1_0= ruleOpenBrowser ) ) otherlv_2= ';' ( (lv_variables_3_0= ruleDeclaration ) )* ( (lv_subroutines_4_0= ruleSubroutine ) )* ( (lv_main_5_0= ruleMain ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleProgram122); 

                	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getBrowserKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:85:1: ( (lv_browser_1_0= ruleOpenBrowser ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:86:1: (lv_browser_1_0= ruleOpenBrowser )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:86:1: (lv_browser_1_0= ruleOpenBrowser )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:87:3: lv_browser_1_0= ruleOpenBrowser
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getBrowserOpenBrowserEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOpenBrowser_in_ruleProgram143);
            lv_browser_1_0=ruleOpenBrowser();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		set(
                   			current, 
                   			"browser",
                    		lv_browser_1_0, 
                    		"OpenBrowser");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleProgram155); 

                	newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getSemicolonKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:107:1: ( (lv_variables_3_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:108:1: (lv_variables_3_0= ruleDeclaration )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:108:1: (lv_variables_3_0= ruleDeclaration )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:109:3: lv_variables_3_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getVariablesDeclarationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleProgram176);
            	    lv_variables_3_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_3_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:125:3: ( (lv_subroutines_4_0= ruleSubroutine ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:126:1: (lv_subroutines_4_0= ruleSubroutine )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:126:1: (lv_subroutines_4_0= ruleSubroutine )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:127:3: lv_subroutines_4_0= ruleSubroutine
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getSubroutinesSubroutineParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSubroutine_in_ruleProgram198);
            	    lv_subroutines_4_0=ruleSubroutine();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subroutines",
            	            		lv_subroutines_4_0, 
            	            		"Subroutine");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:143:3: ( (lv_main_5_0= ruleMain ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:144:1: (lv_main_5_0= ruleMain )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:144:1: (lv_main_5_0= ruleMain )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:145:3: lv_main_5_0= ruleMain
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getMainMainParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleMain_in_ruleProgram220);
            lv_main_5_0=ruleMain();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		set(
                   			current, 
                   			"main",
                    		lv_main_5_0, 
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:169:1: entryRuleSubroutine returns [EObject current=null] : iv_ruleSubroutine= ruleSubroutine EOF ;
    public final EObject entryRuleSubroutine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubroutine = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:170:2: (iv_ruleSubroutine= ruleSubroutine EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:171:2: iv_ruleSubroutine= ruleSubroutine EOF
            {
             newCompositeNode(grammarAccess.getSubroutineRule()); 
            pushFollow(FOLLOW_ruleSubroutine_in_entryRuleSubroutine256);
            iv_ruleSubroutine=ruleSubroutine();

            state._fsp--;

             current =iv_ruleSubroutine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutine266); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:178:1: ruleSubroutine returns [EObject current=null] : (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleSubBody ) ) ) ;
    public final EObject ruleSubroutine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_head_1_0 = null;

        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:181:28: ( (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleSubBody ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:182:1: (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleSubBody ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:182:1: (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleSubBody ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:182:3: otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleSubBody ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSubroutine303); 

                	newLeafNode(otherlv_0, grammarAccess.getSubroutineAccess().getSubKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:186:1: ( (lv_head_1_0= ruleHead ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:187:1: (lv_head_1_0= ruleHead )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:187:1: (lv_head_1_0= ruleHead )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:188:3: lv_head_1_0= ruleHead
            {
             
            	        newCompositeNode(grammarAccess.getSubroutineAccess().getHeadHeadParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleHead_in_ruleSubroutine324);
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

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:204:2: ( (lv_body_2_0= ruleSubBody ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:205:1: (lv_body_2_0= ruleSubBody )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:205:1: (lv_body_2_0= ruleSubBody )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:206:3: lv_body_2_0= ruleSubBody
            {
             
            	        newCompositeNode(grammarAccess.getSubroutineAccess().getBodySubBodyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSubBody_in_ruleSubroutine345);
            lv_body_2_0=ruleSubBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubroutineRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_2_0, 
                    		"SubBody");
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


    // $ANTLR start "entryRuleSubBody"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:230:1: entryRuleSubBody returns [EObject current=null] : iv_ruleSubBody= ruleSubBody EOF ;
    public final EObject entryRuleSubBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubBody = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:231:2: (iv_ruleSubBody= ruleSubBody EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:232:2: iv_ruleSubBody= ruleSubBody EOF
            {
             newCompositeNode(grammarAccess.getSubBodyRule()); 
            pushFollow(FOLLOW_ruleSubBody_in_entryRuleSubBody381);
            iv_ruleSubBody=ruleSubBody();

            state._fsp--;

             current =iv_ruleSubBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubBody391); 

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
    // $ANTLR end "entryRuleSubBody"


    // $ANTLR start "ruleSubBody"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:239:1: ruleSubBody returns [EObject current=null] : (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ( ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
    public final EObject ruleSubBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_instructions_1_0 = null;

        EObject lv_instructions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:242:28: ( (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ( ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:243:1: (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ( ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:243:1: (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ( ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:243:3: otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ( ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= ';' )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSubBody428); 

                	newLeafNode(otherlv_0, grammarAccess.getSubBodyAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:247:1: ( (lv_instructions_1_0= ruleInstruction ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:248:1: (lv_instructions_1_0= ruleInstruction )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:248:1: (lv_instructions_1_0= ruleInstruction )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:249:3: lv_instructions_1_0= ruleInstruction
            {
             
            	        newCompositeNode(grammarAccess.getSubBodyAccess().getInstructionsInstructionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleInstruction_in_ruleSubBody449);
            lv_instructions_1_0=ruleInstruction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubBodyRule());
            	        }
                   		add(
                   			current, 
                   			"instructions",
                    		lv_instructions_1_0, 
                    		"Instruction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSubBody461); 

                	newLeafNode(otherlv_2, grammarAccess.getSubBodyAccess().getSemicolonKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:269:1: ( ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=26 && LA3_0<=31)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:269:2: ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= ';'
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:269:2: ( (lv_instructions_3_0= ruleInstruction ) )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:270:1: (lv_instructions_3_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:270:1: (lv_instructions_3_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:271:3: lv_instructions_3_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubBodyAccess().getInstructionsInstructionParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleSubBody483);
            	    lv_instructions_3_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_3_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSubBody495); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSubBodyAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSubBody509); 

                	newLeafNode(otherlv_5, grammarAccess.getSubBodyAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSubBody"


    // $ANTLR start "entryRuleHead"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:303:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:304:2: (iv_ruleHead= ruleHead EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:305:2: iv_ruleHead= ruleHead EOF
            {
             newCompositeNode(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_ruleHead_in_entryRuleHead545);
            iv_ruleHead=ruleHead();

            state._fsp--;

             current =iv_ruleHead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHead555); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:312:1: ruleHead returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_nameParameters_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_name_0_0 = null;

        EObject lv_name_2_0 = null;

        EObject lv_nameParameters_4_0 = null;

        EObject lv_nameParameters_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:315:28: ( ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_nameParameters_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:316:1: ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_nameParameters_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:316:1: ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_nameParameters_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==17) ) {
                    alt5=1;
                }
                else if ( (LA5_1==18) ) {
                    alt5=2;
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:316:2: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:316:2: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:316:3: ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()'
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:316:3: ( (lv_name_0_0= ruleFunctionName ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:317:1: (lv_name_0_0= ruleFunctionName )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:317:1: (lv_name_0_0= ruleFunctionName )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:318:3: lv_name_0_0= ruleFunctionName
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeadAccess().getNameFunctionNameParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionName_in_ruleHead602);
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

                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleHead614); 

                        	newLeafNode(otherlv_1, grammarAccess.getHeadAccess().getLeftParenthesisRightParenthesisKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:339:6: ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_nameParameters_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )* otherlv_7= ')' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:339:6: ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_nameParameters_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )* otherlv_7= ')' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:339:7: ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_nameParameters_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )* otherlv_7= ')'
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:339:7: ( (lv_name_2_0= ruleFunctionName ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:340:1: (lv_name_2_0= ruleFunctionName )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:340:1: (lv_name_2_0= ruleFunctionName )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:341:3: lv_name_2_0= ruleFunctionName
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeadAccess().getNameFunctionNameParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionName_in_ruleHead643);
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

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleHead655); 

                        	newLeafNode(otherlv_3, grammarAccess.getHeadAccess().getVarKeyword_1_1());
                        
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:361:1: ( (lv_nameParameters_4_0= ruleVariableName ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:362:1: (lv_nameParameters_4_0= ruleVariableName )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:362:1: (lv_nameParameters_4_0= ruleVariableName )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:363:3: lv_nameParameters_4_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeadAccess().getNameParametersVariableNameParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleHead676);
                    lv_nameParameters_4_0=ruleVariableName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeadRule());
                    	        }
                           		add(
                           			current, 
                           			"nameParameters",
                            		lv_nameParameters_4_0, 
                            		"VariableName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:379:2: (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==19) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:379:4: otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleHead689); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getHeadAccess().getVarKeyword_1_3_0());
                    	        
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:383:1: ( (lv_nameParameters_6_0= ruleVariableName ) )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:384:1: (lv_nameParameters_6_0= ruleVariableName )
                    	    {
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:384:1: (lv_nameParameters_6_0= ruleVariableName )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:385:3: lv_nameParameters_6_0= ruleVariableName
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHeadAccess().getNameParametersVariableNameParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVariableName_in_ruleHead710);
                    	    lv_nameParameters_6_0=ruleVariableName();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHeadRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nameParameters",
                    	            		lv_nameParameters_6_0, 
                    	            		"VariableName");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleHead724); 

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


    // $ANTLR start "entryRuleFunctionName"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:413:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:414:2: (iv_ruleFunctionName= ruleFunctionName EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:415:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_ruleFunctionName_in_entryRuleFunctionName761);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionName771); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:422:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:425:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:426:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:426:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:427:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:427:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:428:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionName812); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:452:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:453:2: (iv_ruleMain= ruleMain EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:454:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain852);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain862); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:461:1: ruleMain returns [EObject current=null] : (otherlv_0= 'main' ( (lv_body_1_0= ruleBody ) ) ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:464:28: ( (otherlv_0= 'main' ( (lv_body_1_0= ruleBody ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:465:1: (otherlv_0= 'main' ( (lv_body_1_0= ruleBody ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:465:1: (otherlv_0= 'main' ( (lv_body_1_0= ruleBody ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:465:3: otherlv_0= 'main' ( (lv_body_1_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleMain899); 

                	newLeafNode(otherlv_0, grammarAccess.getMainAccess().getMainKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:469:1: ( (lv_body_1_0= ruleBody ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:470:1: (lv_body_1_0= ruleBody )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:470:1: (lv_body_1_0= ruleBody )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:471:3: lv_body_1_0= ruleBody
            {
             
            	        newCompositeNode(grammarAccess.getMainAccess().getBodyBodyParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBody_in_ruleMain920);
            lv_body_1_0=ruleBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMainRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_1_0, 
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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleBody"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:495:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:496:2: (iv_ruleBody= ruleBody EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:497:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody956);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody966); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:504:1: ruleBody returns [EObject current=null] : (otherlv_0= '{' ( (lv_url_1_0= ruleGoTo ) ) otherlv_2= ';' ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= ';' ( ( (lv_instructions_5_0= ruleInstruction ) ) otherlv_6= ';' )* otherlv_7= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_url_1_0 = null;

        EObject lv_instructions_3_0 = null;

        EObject lv_instructions_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:507:28: ( (otherlv_0= '{' ( (lv_url_1_0= ruleGoTo ) ) otherlv_2= ';' ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= ';' ( ( (lv_instructions_5_0= ruleInstruction ) ) otherlv_6= ';' )* otherlv_7= '}' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:508:1: (otherlv_0= '{' ( (lv_url_1_0= ruleGoTo ) ) otherlv_2= ';' ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= ';' ( ( (lv_instructions_5_0= ruleInstruction ) ) otherlv_6= ';' )* otherlv_7= '}' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:508:1: (otherlv_0= '{' ( (lv_url_1_0= ruleGoTo ) ) otherlv_2= ';' ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= ';' ( ( (lv_instructions_5_0= ruleInstruction ) ) otherlv_6= ';' )* otherlv_7= '}' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:508:3: otherlv_0= '{' ( (lv_url_1_0= ruleGoTo ) ) otherlv_2= ';' ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= ';' ( ( (lv_instructions_5_0= ruleInstruction ) ) otherlv_6= ';' )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleBody1003); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:512:1: ( (lv_url_1_0= ruleGoTo ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:513:1: (lv_url_1_0= ruleGoTo )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:513:1: (lv_url_1_0= ruleGoTo )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:514:3: lv_url_1_0= ruleGoTo
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getUrlGoToParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleGoTo_in_ruleBody1024);
            lv_url_1_0=ruleGoTo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	        }
                   		set(
                   			current, 
                   			"url",
                    		lv_url_1_0, 
                    		"GoTo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleBody1036); 

                	newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getSemicolonKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:534:1: ( (lv_instructions_3_0= ruleInstruction ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:535:1: (lv_instructions_3_0= ruleInstruction )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:535:1: (lv_instructions_3_0= ruleInstruction )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:536:3: lv_instructions_3_0= ruleInstruction
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getInstructionsInstructionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleInstruction_in_ruleBody1057);
            lv_instructions_3_0=ruleInstruction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	        }
                   		add(
                   			current, 
                   			"instructions",
                    		lv_instructions_3_0, 
                    		"Instruction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleBody1069); 

                	newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getSemicolonKeyword_4());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:556:1: ( ( (lv_instructions_5_0= ruleInstruction ) ) otherlv_6= ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=26 && LA6_0<=31)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:556:2: ( (lv_instructions_5_0= ruleInstruction ) ) otherlv_6= ';'
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:556:2: ( (lv_instructions_5_0= ruleInstruction ) )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:557:1: (lv_instructions_5_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:557:1: (lv_instructions_5_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:558:3: lv_instructions_5_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBodyAccess().getInstructionsInstructionParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleBody1091);
            	    lv_instructions_5_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_5_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleBody1103); 

            	        	newLeafNode(otherlv_6, grammarAccess.getBodyAccess().getSemicolonKeyword_5_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleBody1117); 

                	newLeafNode(otherlv_7, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleVariableReference"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:590:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:591:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:592:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference1153);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;

             current =iv_ruleVariableReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference1163); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:599:1: ruleVariableReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:602:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:603:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:603:1: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:604:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:604:1: (otherlv_0= RULE_ID )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:605:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference1207); 

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


    // $ANTLR start "entryRuleFunctionReference"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:624:1: entryRuleFunctionReference returns [EObject current=null] : iv_ruleFunctionReference= ruleFunctionReference EOF ;
    public final EObject entryRuleFunctionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReference = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:625:2: (iv_ruleFunctionReference= ruleFunctionReference EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:626:2: iv_ruleFunctionReference= ruleFunctionReference EOF
            {
             newCompositeNode(grammarAccess.getFunctionReferenceRule()); 
            pushFollow(FOLLOW_ruleFunctionReference_in_entryRuleFunctionReference1242);
            iv_ruleFunctionReference=ruleFunctionReference();

            state._fsp--;

             current =iv_ruleFunctionReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionReference1252); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:633:1: ruleFunctionReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFunctionReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:636:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:637:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:637:1: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:638:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:638:1: (otherlv_0= RULE_ID )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:639:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionReference1296); 

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


    // $ANTLR start "entryRuleFunctionCall"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:658:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:659:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:660:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall1331);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall1341); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:667:1: ruleFunctionCall returns [EObject current=null] : ( ( ( (lv_function_0_0= ruleFunctionReference ) ) otherlv_1= '()' ) | ( ( (lv_function_2_0= ruleFunctionReference ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleCallType ) ) (otherlv_5= ', ' ( (lv_parameters_6_0= ruleCallType ) ) )* otherlv_7= ')' ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_function_0_0 = null;

        EObject lv_function_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:670:28: ( ( ( ( (lv_function_0_0= ruleFunctionReference ) ) otherlv_1= '()' ) | ( ( (lv_function_2_0= ruleFunctionReference ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleCallType ) ) (otherlv_5= ', ' ( (lv_parameters_6_0= ruleCallType ) ) )* otherlv_7= ')' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:671:1: ( ( ( (lv_function_0_0= ruleFunctionReference ) ) otherlv_1= '()' ) | ( ( (lv_function_2_0= ruleFunctionReference ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleCallType ) ) (otherlv_5= ', ' ( (lv_parameters_6_0= ruleCallType ) ) )* otherlv_7= ')' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:671:1: ( ( ( (lv_function_0_0= ruleFunctionReference ) ) otherlv_1= '()' ) | ( ( (lv_function_2_0= ruleFunctionReference ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleCallType ) ) (otherlv_5= ', ' ( (lv_parameters_6_0= ruleCallType ) ) )* otherlv_7= ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==22) ) {
                    alt8=2;
                }
                else if ( (LA8_1==17) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:671:2: ( ( (lv_function_0_0= ruleFunctionReference ) ) otherlv_1= '()' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:671:2: ( ( (lv_function_0_0= ruleFunctionReference ) ) otherlv_1= '()' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:671:3: ( (lv_function_0_0= ruleFunctionReference ) ) otherlv_1= '()'
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:671:3: ( (lv_function_0_0= ruleFunctionReference ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:672:1: (lv_function_0_0= ruleFunctionReference )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:672:1: (lv_function_0_0= ruleFunctionReference )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:673:3: lv_function_0_0= ruleFunctionReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionFunctionReferenceParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionReference_in_ruleFunctionCall1388);
                    lv_function_0_0=ruleFunctionReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	        }
                           		set(
                           			current, 
                           			"function",
                            		lv_function_0_0, 
                            		"FunctionReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleFunctionCall1400); 

                        	newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:694:6: ( ( (lv_function_2_0= ruleFunctionReference ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleCallType ) ) (otherlv_5= ', ' ( (lv_parameters_6_0= ruleCallType ) ) )* otherlv_7= ')' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:694:6: ( ( (lv_function_2_0= ruleFunctionReference ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleCallType ) ) (otherlv_5= ', ' ( (lv_parameters_6_0= ruleCallType ) ) )* otherlv_7= ')' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:694:7: ( (lv_function_2_0= ruleFunctionReference ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleCallType ) ) (otherlv_5= ', ' ( (lv_parameters_6_0= ruleCallType ) ) )* otherlv_7= ')'
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:694:7: ( (lv_function_2_0= ruleFunctionReference ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:695:1: (lv_function_2_0= ruleFunctionReference )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:695:1: (lv_function_2_0= ruleFunctionReference )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:696:3: lv_function_2_0= ruleFunctionReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionFunctionReferenceParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionReference_in_ruleFunctionCall1429);
                    lv_function_2_0=ruleFunctionReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	        }
                           		set(
                           			current, 
                           			"function",
                            		lv_function_2_0, 
                            		"FunctionReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleFunctionCall1441); 

                        	newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:716:1: ( (lv_parameters_4_0= ruleCallType ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:717:1: (lv_parameters_4_0= ruleCallType )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:717:1: (lv_parameters_4_0= ruleCallType )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:718:3: lv_parameters_4_0= ruleCallType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersCallTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCallType_in_ruleFunctionCall1462);
                    lv_parameters_4_0=ruleCallType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_4_0, 
                            		"CallType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:734:2: (otherlv_5= ', ' ( (lv_parameters_6_0= ruleCallType ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==23) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:734:4: otherlv_5= ', ' ( (lv_parameters_6_0= ruleCallType ) )
                    	    {
                    	    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleFunctionCall1475); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getCommaSpaceKeyword_1_3_0());
                    	        
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:738:1: ( (lv_parameters_6_0= ruleCallType ) )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:739:1: (lv_parameters_6_0= ruleCallType )
                    	    {
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:739:1: (lv_parameters_6_0= ruleCallType )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:740:3: lv_parameters_6_0= ruleCallType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersCallTypeParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCallType_in_ruleFunctionCall1496);
                    	    lv_parameters_6_0=ruleCallType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_6_0, 
                    	            		"CallType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleFunctionCall1510); 

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


    // $ANTLR start "entryRuleCallType"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:768:1: entryRuleCallType returns [EObject current=null] : iv_ruleCallType= ruleCallType EOF ;
    public final EObject entryRuleCallType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallType = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:769:2: (iv_ruleCallType= ruleCallType EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:770:2: iv_ruleCallType= ruleCallType EOF
            {
             newCompositeNode(grammarAccess.getCallTypeRule()); 
            pushFollow(FOLLOW_ruleCallType_in_entryRuleCallType1547);
            iv_ruleCallType=ruleCallType();

            state._fsp--;

             current =iv_ruleCallType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallType1557); 

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
    // $ANTLR end "entryRuleCallType"


    // $ANTLR start "ruleCallType"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:777:1: ruleCallType returns [EObject current=null] : (this_Values_0= ruleValues | this_Variable_1= ruleVariable ) ;
    public final EObject ruleCallType() throws RecognitionException {
        EObject current = null;

        EObject this_Values_0 = null;

        EObject this_Variable_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:780:28: ( (this_Values_0= ruleValues | this_Variable_1= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:781:1: (this_Values_0= ruleValues | this_Variable_1= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:781:1: (this_Values_0= ruleValues | this_Variable_1= ruleVariable )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING||LA9_0==RULE_INT||(LA9_0>=37 && LA9_0<=38)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:782:5: this_Values_0= ruleValues
                    {
                     
                            newCompositeNode(grammarAccess.getCallTypeAccess().getValuesParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleValues_in_ruleCallType1604);
                    this_Values_0=ruleValues();

                    state._fsp--;

                     
                            current = this_Values_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:792:5: this_Variable_1= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getCallTypeAccess().getVariableParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleCallType1631);
                    this_Variable_1=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_1; 
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
    // $ANTLR end "ruleCallType"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:808:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:809:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:810:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1666);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1676); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:817:1: ruleVariable returns [EObject current=null] : this_VariableReference_0= ruleVariableReference ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_VariableReference_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:820:28: (this_VariableReference_0= ruleVariableReference )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:822:5: this_VariableReference_0= ruleVariableReference
            {
             
                    newCompositeNode(grammarAccess.getVariableAccess().getVariableReferenceParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleVariableReference_in_ruleVariable1722);
            this_VariableReference_0=ruleVariableReference();

            state._fsp--;

             
                    current = this_VariableReference_0; 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVariableName"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:838:1: entryRuleVariableName returns [EObject current=null] : iv_ruleVariableName= ruleVariableName EOF ;
    public final EObject entryRuleVariableName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableName = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:839:2: (iv_ruleVariableName= ruleVariableName EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:840:2: iv_ruleVariableName= ruleVariableName EOF
            {
             newCompositeNode(grammarAccess.getVariableNameRule()); 
            pushFollow(FOLLOW_ruleVariableName_in_entryRuleVariableName1756);
            iv_ruleVariableName=ruleVariableName();

            state._fsp--;

             current =iv_ruleVariableName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableName1766); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:847:1: ruleVariableName returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleVariableName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:850:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:851:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:851:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:852:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:852:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:853:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariableName1807); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:877:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:878:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:879:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration1847);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration1857); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:886:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'var ' ( (lv_variable_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( (lv_value_3_0= ruleValues ) ) otherlv_4= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:889:28: ( (otherlv_0= 'var ' ( (lv_variable_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( (lv_value_3_0= ruleValues ) ) otherlv_4= ';' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:890:1: (otherlv_0= 'var ' ( (lv_variable_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( (lv_value_3_0= ruleValues ) ) otherlv_4= ';' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:890:1: (otherlv_0= 'var ' ( (lv_variable_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( (lv_value_3_0= ruleValues ) ) otherlv_4= ';' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:890:3: otherlv_0= 'var ' ( (lv_variable_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( (lv_value_3_0= ruleValues ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleDeclaration1894); 

                	newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getVarKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:894:1: ( (lv_variable_1_0= ruleVariableName ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:895:1: (lv_variable_1_0= ruleVariableName )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:895:1: (lv_variable_1_0= ruleVariableName )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:896:3: lv_variable_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getVariableVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleDeclaration1915);
            lv_variable_1_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleDeclaration1927); 

                	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getSpaceEqualsSignSpaceKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:916:1: ( (lv_value_3_0= ruleValues ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:917:1: (lv_value_3_0= ruleValues )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:917:1: (lv_value_3_0= ruleValues )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:918:3: lv_value_3_0= ruleValues
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getValueValuesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValues_in_ruleDeclaration1948);
            lv_value_3_0=ruleValues();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Values");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDeclaration1960); 

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


    // $ANTLR start "entryRuleInstruction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:946:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:947:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:948:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction1996);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction2006); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:955:1: ruleInstruction returns [EObject current=null] : (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage | this_TextField_3= ruleTextField | this_Checkbox_4= ruleCheckbox | this_GoTo_5= ruleGoTo | this_FunctionCall_6= ruleFunctionCall ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Link_0 = null;

        EObject this_Button_1 = null;

        EObject this_Image_2 = null;

        EObject this_TextField_3 = null;

        EObject this_Checkbox_4 = null;

        EObject this_GoTo_5 = null;

        EObject this_FunctionCall_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:958:28: ( (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage | this_TextField_3= ruleTextField | this_Checkbox_4= ruleCheckbox | this_GoTo_5= ruleGoTo | this_FunctionCall_6= ruleFunctionCall ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:959:1: (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage | this_TextField_3= ruleTextField | this_Checkbox_4= ruleCheckbox | this_GoTo_5= ruleGoTo | this_FunctionCall_6= ruleFunctionCall )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:959:1: (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage | this_TextField_3= ruleTextField | this_Checkbox_4= ruleCheckbox | this_GoTo_5= ruleGoTo | this_FunctionCall_6= ruleFunctionCall )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=2;
                }
                break;
            case 30:
                {
                alt10=3;
                }
                break;
            case 31:
                {
                alt10=4;
                }
                break;
            case 27:
                {
                alt10=5;
                }
                break;
            case 26:
                {
                alt10=6;
                }
                break;
            case RULE_ID:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:960:5: this_Link_0= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLinkParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleInstruction2053);
                    this_Link_0=ruleLink();

                    state._fsp--;

                     
                            current = this_Link_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:970:5: this_Button_1= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getButtonParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleInstruction2080);
                    this_Button_1=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:980:5: this_Image_2= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getImageParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleInstruction2107);
                    this_Image_2=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:990:5: this_TextField_3= ruleTextField
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getTextFieldParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTextField_in_ruleInstruction2134);
                    this_TextField_3=ruleTextField();

                    state._fsp--;

                     
                            current = this_TextField_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1000:5: this_Checkbox_4= ruleCheckbox
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCheckboxParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCheckbox_in_ruleInstruction2161);
                    this_Checkbox_4=ruleCheckbox();

                    state._fsp--;

                     
                            current = this_Checkbox_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1010:5: this_GoTo_5= ruleGoTo
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getGoToParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleGoTo_in_ruleInstruction2188);
                    this_GoTo_5=ruleGoTo();

                    state._fsp--;

                     
                            current = this_GoTo_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1020:5: this_FunctionCall_6= ruleFunctionCall
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getFunctionCallParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleInstruction2215);
                    this_FunctionCall_6=ruleFunctionCall();

                    state._fsp--;

                     
                            current = this_FunctionCall_6; 
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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleGoTo"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1036:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1037:2: (iv_ruleGoTo= ruleGoTo EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1038:2: iv_ruleGoTo= ruleGoTo EOF
            {
             newCompositeNode(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_ruleGoTo_in_entryRuleGoTo2250);
            iv_ruleGoTo=ruleGoTo();

            state._fsp--;

             current =iv_ruleGoTo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoTo2260); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1045:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ')' ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1048:28: ( (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1049:1: (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1049:1: (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1049:3: otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleGoTo2297); 

                	newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGoToKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1053:1: ( (lv_url_1_0= RULE_URL ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1054:1: (lv_url_1_0= RULE_URL )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1054:1: (lv_url_1_0= RULE_URL )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1055:3: lv_url_1_0= RULE_URL
            {
            lv_url_1_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleGoTo2314); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleGoTo2331); 

                	newLeafNode(otherlv_2, grammarAccess.getGoToAccess().getRightParenthesisKeyword_2());
                

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


    // $ANTLR start "entryRuleCheckbox"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1083:1: entryRuleCheckbox returns [EObject current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final EObject entryRuleCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckbox = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1084:2: (iv_ruleCheckbox= ruleCheckbox EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1085:2: iv_ruleCheckbox= ruleCheckbox EOF
            {
             newCompositeNode(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_ruleCheckbox_in_entryRuleCheckbox2367);
            iv_ruleCheckbox=ruleCheckbox();

            state._fsp--;

             current =iv_ruleCheckbox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckbox2377); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1092:1: ruleCheckbox returns [EObject current=null] : (otherlv_0= 'checkbox(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleCheckboxAction ) ) ) ;
    public final EObject ruleCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_id_1_1 = null;

        EObject lv_id_1_2 = null;

        EObject lv_action_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1095:28: ( (otherlv_0= 'checkbox(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleCheckboxAction ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1096:1: (otherlv_0= 'checkbox(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleCheckboxAction ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1096:1: (otherlv_0= 'checkbox(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleCheckboxAction ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1096:3: otherlv_0= 'checkbox(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleCheckboxAction ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleCheckbox2414); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1100:1: ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1101:1: ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1101:1: ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1102:1: (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1102:1: (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1103:3: lv_id_1_1= ruleStringValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckboxAccess().getIdStringValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringValue_in_ruleCheckbox2437);
                    lv_id_1_1=ruleStringValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckboxRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_1_1, 
                            		"StringValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1118:8: lv_id_1_2= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckboxAccess().getIdVariableParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleCheckbox2456);
                    lv_id_1_2=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckboxRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_1_2, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCheckbox2471); 

                	newLeafNode(otherlv_2, grammarAccess.getCheckboxAccess().getRightParenthesisKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1140:1: ( (lv_action_3_0= ruleCheckboxAction ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1141:1: (lv_action_3_0= ruleCheckboxAction )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1141:1: (lv_action_3_0= ruleCheckboxAction )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1142:3: lv_action_3_0= ruleCheckboxAction
            {
             
            	        newCompositeNode(grammarAccess.getCheckboxAccess().getActionCheckboxActionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCheckboxAction_in_ruleCheckbox2492);
            lv_action_3_0=ruleCheckboxAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCheckboxRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_3_0, 
                    		"CheckboxAction");
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
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "entryRuleLink"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1166:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1167:2: (iv_ruleLink= ruleLink EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1168:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink2528);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink2538); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1175:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleLinkAction ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_id_1_1 = null;

        EObject lv_id_1_2 = null;

        EObject lv_action_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1178:28: ( (otherlv_0= 'link(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleLinkAction ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1179:1: (otherlv_0= 'link(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleLinkAction ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1179:1: (otherlv_0= 'link(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleLinkAction ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1179:3: otherlv_0= 'link(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleLinkAction ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleLink2575); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1183:1: ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1184:1: ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1184:1: ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1185:1: (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1185:1: (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1186:3: lv_id_1_1= ruleStringValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getIdStringValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringValue_in_ruleLink2598);
                    lv_id_1_1=ruleStringValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_1_1, 
                            		"StringValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1201:8: lv_id_1_2= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getIdVariableParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleLink2617);
                    lv_id_1_2=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_1_2, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleLink2632); 

                	newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getRightParenthesisKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1223:1: ( (lv_action_3_0= ruleLinkAction ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1224:1: (lv_action_3_0= ruleLinkAction )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1224:1: (lv_action_3_0= ruleLinkAction )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1225:3: lv_action_3_0= ruleLinkAction
            {
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getActionLinkActionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLinkAction_in_ruleLink2653);
            lv_action_3_0=ruleLinkAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_3_0, 
                    		"LinkAction");
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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleButton"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1249:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1250:2: (iv_ruleButton= ruleButton EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1251:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton2689);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton2699); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1258:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleButtonAction ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_id_1_1 = null;

        EObject lv_id_1_2 = null;

        EObject lv_action_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1261:28: ( (otherlv_0= 'button(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleButtonAction ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1262:1: (otherlv_0= 'button(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleButtonAction ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1262:1: (otherlv_0= 'button(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleButtonAction ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1262:3: otherlv_0= 'button(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleButtonAction ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleButton2736); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1266:1: ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1267:1: ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1267:1: ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1268:1: (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1268:1: (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1269:3: lv_id_1_1= ruleStringValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonAccess().getIdStringValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringValue_in_ruleButton2759);
                    lv_id_1_1=ruleStringValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getButtonRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_1_1, 
                            		"StringValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1284:8: lv_id_1_2= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonAccess().getIdVariableParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleButton2778);
                    lv_id_1_2=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getButtonRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_1_2, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleButton2793); 

                	newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getRightParenthesisKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1306:1: ( (lv_action_3_0= ruleButtonAction ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1307:1: (lv_action_3_0= ruleButtonAction )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1307:1: (lv_action_3_0= ruleButtonAction )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1308:3: lv_action_3_0= ruleButtonAction
            {
             
            	        newCompositeNode(grammarAccess.getButtonAccess().getActionButtonActionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleButtonAction_in_ruleButton2814);
            lv_action_3_0=ruleButtonAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getButtonRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_3_0, 
                    		"ButtonAction");
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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleImage"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1332:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1333:2: (iv_ruleImage= ruleImage EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1334:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage2850);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage2860); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1341:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleImageAction ) ) ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_id_1_1 = null;

        EObject lv_id_1_2 = null;

        EObject lv_action_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1344:28: ( (otherlv_0= 'image(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleImageAction ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1345:1: (otherlv_0= 'image(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleImageAction ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1345:1: (otherlv_0= 'image(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleImageAction ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1345:3: otherlv_0= 'image(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleImageAction ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleImage2897); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1349:1: ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1350:1: ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1350:1: ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1351:1: (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1351:1: (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1352:3: lv_id_1_1= ruleStringValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getIdStringValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringValue_in_ruleImage2920);
                    lv_id_1_1=ruleStringValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_1_1, 
                            		"StringValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1367:8: lv_id_1_2= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getIdVariableParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleImage2939);
                    lv_id_1_2=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_1_2, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleImage2954); 

                	newLeafNode(otherlv_2, grammarAccess.getImageAccess().getRightParenthesisKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1389:1: ( (lv_action_3_0= ruleImageAction ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1390:1: (lv_action_3_0= ruleImageAction )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1390:1: (lv_action_3_0= ruleImageAction )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1391:3: lv_action_3_0= ruleImageAction
            {
             
            	        newCompositeNode(grammarAccess.getImageAccess().getActionImageActionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleImageAction_in_ruleImage2975);
            lv_action_3_0=ruleImageAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImageRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_3_0, 
                    		"ImageAction");
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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleTextField"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1415:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1416:2: (iv_ruleTextField= ruleTextField EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1417:2: iv_ruleTextField= ruleTextField EOF
            {
             newCompositeNode(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_ruleTextField_in_entryRuleTextField3011);
            iv_ruleTextField=ruleTextField();

            state._fsp--;

             current =iv_ruleTextField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextField3021); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1424:1: ruleTextField returns [EObject current=null] : (otherlv_0= 'textField(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleTextAction ) ) ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_id_1_1 = null;

        EObject lv_id_1_2 = null;

        EObject lv_action_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1427:28: ( (otherlv_0= 'textField(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleTextAction ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1428:1: (otherlv_0= 'textField(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleTextAction ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1428:1: (otherlv_0= 'textField(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleTextAction ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1428:3: otherlv_0= 'textField(' ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) ) otherlv_2= ')' ( (lv_action_3_0= ruleTextAction ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleTextField3058); 

                	newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1432:1: ( ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1433:1: ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1433:1: ( (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1434:1: (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1434:1: (lv_id_1_1= ruleStringValue | lv_id_1_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1435:3: lv_id_1_1= ruleStringValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextFieldAccess().getIdStringValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringValue_in_ruleTextField3081);
                    lv_id_1_1=ruleStringValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_1_1, 
                            		"StringValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1450:8: lv_id_1_2= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextFieldAccess().getIdVariableParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleTextField3100);
                    lv_id_1_2=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_1_2, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTextField3115); 

                	newLeafNode(otherlv_2, grammarAccess.getTextFieldAccess().getRightParenthesisKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1472:1: ( (lv_action_3_0= ruleTextAction ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1473:1: (lv_action_3_0= ruleTextAction )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1473:1: (lv_action_3_0= ruleTextAction )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1474:3: lv_action_3_0= ruleTextAction
            {
             
            	        newCompositeNode(grammarAccess.getTextFieldAccess().getActionTextActionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTextAction_in_ruleTextField3136);
            lv_action_3_0=ruleTextAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextFieldRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_3_0, 
                    		"TextAction");
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
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleCheckboxAction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1498:1: entryRuleCheckboxAction returns [EObject current=null] : iv_ruleCheckboxAction= ruleCheckboxAction EOF ;
    public final EObject entryRuleCheckboxAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckboxAction = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1499:2: (iv_ruleCheckboxAction= ruleCheckboxAction EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1500:2: iv_ruleCheckboxAction= ruleCheckboxAction EOF
            {
             newCompositeNode(grammarAccess.getCheckboxActionRule()); 
            pushFollow(FOLLOW_ruleCheckboxAction_in_entryRuleCheckboxAction3172);
            iv_ruleCheckboxAction=ruleCheckboxAction();

            state._fsp--;

             current =iv_ruleCheckboxAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckboxAction3182); 

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
    // $ANTLR end "entryRuleCheckboxAction"


    // $ANTLR start "ruleCheckboxAction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1507:1: ruleCheckboxAction returns [EObject current=null] : (this_Click_0= ruleClick | this_IsCheck_1= ruleIsCheck | this_Clear_2= ruleClear ) ;
    public final EObject ruleCheckboxAction() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;

        EObject this_IsCheck_1 = null;

        EObject this_Clear_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1510:28: ( (this_Click_0= ruleClick | this_IsCheck_1= ruleIsCheck | this_Clear_2= ruleClear ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1511:1: (this_Click_0= ruleClick | this_IsCheck_1= ruleIsCheck | this_Clear_2= ruleClear )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1511:1: (this_Click_0= ruleClick | this_IsCheck_1= ruleIsCheck | this_Clear_2= ruleClear )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                alt16=2;
                }
                break;
            case 34:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1512:5: this_Click_0= ruleClick
                    {
                     
                            newCompositeNode(grammarAccess.getCheckboxActionAccess().getClickParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClick_in_ruleCheckboxAction3229);
                    this_Click_0=ruleClick();

                    state._fsp--;

                     
                            current = this_Click_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1522:5: this_IsCheck_1= ruleIsCheck
                    {
                     
                            newCompositeNode(grammarAccess.getCheckboxActionAccess().getIsCheckParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIsCheck_in_ruleCheckboxAction3256);
                    this_IsCheck_1=ruleIsCheck();

                    state._fsp--;

                     
                            current = this_IsCheck_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1532:5: this_Clear_2= ruleClear
                    {
                     
                            newCompositeNode(grammarAccess.getCheckboxActionAccess().getClearParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleClear_in_ruleCheckboxAction3283);
                    this_Clear_2=ruleClear();

                    state._fsp--;

                     
                            current = this_Clear_2; 
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
    // $ANTLR end "ruleCheckboxAction"


    // $ANTLR start "entryRuleLinkAction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1548:1: entryRuleLinkAction returns [EObject current=null] : iv_ruleLinkAction= ruleLinkAction EOF ;
    public final EObject entryRuleLinkAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkAction = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1549:2: (iv_ruleLinkAction= ruleLinkAction EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1550:2: iv_ruleLinkAction= ruleLinkAction EOF
            {
             newCompositeNode(grammarAccess.getLinkActionRule()); 
            pushFollow(FOLLOW_ruleLinkAction_in_entryRuleLinkAction3318);
            iv_ruleLinkAction=ruleLinkAction();

            state._fsp--;

             current =iv_ruleLinkAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkAction3328); 

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
    // $ANTLR end "entryRuleLinkAction"


    // $ANTLR start "ruleLinkAction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1557:1: ruleLinkAction returns [EObject current=null] : this_Click_0= ruleClick ;
    public final EObject ruleLinkAction() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1560:28: (this_Click_0= ruleClick )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1562:5: this_Click_0= ruleClick
            {
             
                    newCompositeNode(grammarAccess.getLinkActionAccess().getClickParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleClick_in_ruleLinkAction3374);
            this_Click_0=ruleClick();

            state._fsp--;

             
                    current = this_Click_0; 
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
    // $ANTLR end "ruleLinkAction"


    // $ANTLR start "entryRuleButtonAction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1578:1: entryRuleButtonAction returns [EObject current=null] : iv_ruleButtonAction= ruleButtonAction EOF ;
    public final EObject entryRuleButtonAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonAction = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1579:2: (iv_ruleButtonAction= ruleButtonAction EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1580:2: iv_ruleButtonAction= ruleButtonAction EOF
            {
             newCompositeNode(grammarAccess.getButtonActionRule()); 
            pushFollow(FOLLOW_ruleButtonAction_in_entryRuleButtonAction3408);
            iv_ruleButtonAction=ruleButtonAction();

            state._fsp--;

             current =iv_ruleButtonAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButtonAction3418); 

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
    // $ANTLR end "entryRuleButtonAction"


    // $ANTLR start "ruleButtonAction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1587:1: ruleButtonAction returns [EObject current=null] : this_Click_0= ruleClick ;
    public final EObject ruleButtonAction() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1590:28: (this_Click_0= ruleClick )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1592:5: this_Click_0= ruleClick
            {
             
                    newCompositeNode(grammarAccess.getButtonActionAccess().getClickParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleClick_in_ruleButtonAction3464);
            this_Click_0=ruleClick();

            state._fsp--;

             
                    current = this_Click_0; 
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
    // $ANTLR end "ruleButtonAction"


    // $ANTLR start "entryRuleImageAction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1608:1: entryRuleImageAction returns [EObject current=null] : iv_ruleImageAction= ruleImageAction EOF ;
    public final EObject entryRuleImageAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageAction = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1609:2: (iv_ruleImageAction= ruleImageAction EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1610:2: iv_ruleImageAction= ruleImageAction EOF
            {
             newCompositeNode(grammarAccess.getImageActionRule()); 
            pushFollow(FOLLOW_ruleImageAction_in_entryRuleImageAction3498);
            iv_ruleImageAction=ruleImageAction();

            state._fsp--;

             current =iv_ruleImageAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageAction3508); 

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
    // $ANTLR end "entryRuleImageAction"


    // $ANTLR start "ruleImageAction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1617:1: ruleImageAction returns [EObject current=null] : this_Click_0= ruleClick ;
    public final EObject ruleImageAction() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1620:28: (this_Click_0= ruleClick )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1622:5: this_Click_0= ruleClick
            {
             
                    newCompositeNode(grammarAccess.getImageActionAccess().getClickParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleClick_in_ruleImageAction3554);
            this_Click_0=ruleClick();

            state._fsp--;

             
                    current = this_Click_0; 
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
    // $ANTLR end "ruleImageAction"


    // $ANTLR start "entryRuleTextAction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1638:1: entryRuleTextAction returns [EObject current=null] : iv_ruleTextAction= ruleTextAction EOF ;
    public final EObject entryRuleTextAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAction = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1639:2: (iv_ruleTextAction= ruleTextAction EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1640:2: iv_ruleTextAction= ruleTextAction EOF
            {
             newCompositeNode(grammarAccess.getTextActionRule()); 
            pushFollow(FOLLOW_ruleTextAction_in_entryRuleTextAction3588);
            iv_ruleTextAction=ruleTextAction();

            state._fsp--;

             current =iv_ruleTextAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextAction3598); 

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
    // $ANTLR end "entryRuleTextAction"


    // $ANTLR start "ruleTextAction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1647:1: ruleTextAction returns [EObject current=null] : (this_CheckValue_0= ruleCheckValue | this_Fill_1= ruleFill | this_Clear_2= ruleClear ) ;
    public final EObject ruleTextAction() throws RecognitionException {
        EObject current = null;

        EObject this_CheckValue_0 = null;

        EObject this_Fill_1 = null;

        EObject this_Clear_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1650:28: ( (this_CheckValue_0= ruleCheckValue | this_Fill_1= ruleFill | this_Clear_2= ruleClear ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1651:1: (this_CheckValue_0= ruleCheckValue | this_Fill_1= ruleFill | this_Clear_2= ruleClear )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1651:1: (this_CheckValue_0= ruleCheckValue | this_Fill_1= ruleFill | this_Clear_2= ruleClear )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt17=1;
                }
                break;
            case 36:
                {
                alt17=2;
                }
                break;
            case 34:
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1652:5: this_CheckValue_0= ruleCheckValue
                    {
                     
                            newCompositeNode(grammarAccess.getTextActionAccess().getCheckValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCheckValue_in_ruleTextAction3645);
                    this_CheckValue_0=ruleCheckValue();

                    state._fsp--;

                     
                            current = this_CheckValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1662:5: this_Fill_1= ruleFill
                    {
                     
                            newCompositeNode(grammarAccess.getTextActionAccess().getFillParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFill_in_ruleTextAction3672);
                    this_Fill_1=ruleFill();

                    state._fsp--;

                     
                            current = this_Fill_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1672:5: this_Clear_2= ruleClear
                    {
                     
                            newCompositeNode(grammarAccess.getTextActionAccess().getClearParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleClear_in_ruleTextAction3699);
                    this_Clear_2=ruleClear();

                    state._fsp--;

                     
                            current = this_Clear_2; 
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
    // $ANTLR end "ruleTextAction"


    // $ANTLR start "entryRuleClick"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1688:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1689:2: (iv_ruleClick= ruleClick EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1690:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_ruleClick_in_entryRuleClick3734);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClick3744); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1697:1: ruleClick returns [EObject current=null] : ( (lv_action_0_0= '.click()' ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token lv_action_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1700:28: ( ( (lv_action_0_0= '.click()' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1701:1: ( (lv_action_0_0= '.click()' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1701:1: ( (lv_action_0_0= '.click()' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1702:1: (lv_action_0_0= '.click()' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1702:1: (lv_action_0_0= '.click()' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1703:3: lv_action_0_0= '.click()'
            {
            lv_action_0_0=(Token)match(input,32,FOLLOW_32_in_ruleClick3786); 

                    newLeafNode(lv_action_0_0, grammarAccess.getClickAccess().getActionClickKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClickRule());
            	        }
                   		setWithLastConsumed(current, "action", lv_action_0_0, ".click()");
            	    

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
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleIsCheck"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1724:1: entryRuleIsCheck returns [EObject current=null] : iv_ruleIsCheck= ruleIsCheck EOF ;
    public final EObject entryRuleIsCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsCheck = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1725:2: (iv_ruleIsCheck= ruleIsCheck EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1726:2: iv_ruleIsCheck= ruleIsCheck EOF
            {
             newCompositeNode(grammarAccess.getIsCheckRule()); 
            pushFollow(FOLLOW_ruleIsCheck_in_entryRuleIsCheck3834);
            iv_ruleIsCheck=ruleIsCheck();

            state._fsp--;

             current =iv_ruleIsCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsCheck3844); 

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
    // $ANTLR end "entryRuleIsCheck"


    // $ANTLR start "ruleIsCheck"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1733:1: ruleIsCheck returns [EObject current=null] : (otherlv_0= '.isCheck(' ( (lv_val_1_0= ruleBoolean ) ) otherlv_2= ')' ) ;
    public final EObject ruleIsCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_val_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1736:28: ( (otherlv_0= '.isCheck(' ( (lv_val_1_0= ruleBoolean ) ) otherlv_2= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1737:1: (otherlv_0= '.isCheck(' ( (lv_val_1_0= ruleBoolean ) ) otherlv_2= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1737:1: (otherlv_0= '.isCheck(' ( (lv_val_1_0= ruleBoolean ) ) otherlv_2= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1737:3: otherlv_0= '.isCheck(' ( (lv_val_1_0= ruleBoolean ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleIsCheck3881); 

                	newLeafNode(otherlv_0, grammarAccess.getIsCheckAccess().getIsCheckKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1741:1: ( (lv_val_1_0= ruleBoolean ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1742:1: (lv_val_1_0= ruleBoolean )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1742:1: (lv_val_1_0= ruleBoolean )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1743:3: lv_val_1_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getIsCheckAccess().getValBooleanEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleIsCheck3902);
            lv_val_1_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIsCheckRule());
            	        }
                   		set(
                   			current, 
                   			"val",
                    		lv_val_1_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleIsCheck3914); 

                	newLeafNode(otherlv_2, grammarAccess.getIsCheckAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleIsCheck"


    // $ANTLR start "entryRuleClear"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1771:1: entryRuleClear returns [EObject current=null] : iv_ruleClear= ruleClear EOF ;
    public final EObject entryRuleClear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClear = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1772:2: (iv_ruleClear= ruleClear EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1773:2: iv_ruleClear= ruleClear EOF
            {
             newCompositeNode(grammarAccess.getClearRule()); 
            pushFollow(FOLLOW_ruleClear_in_entryRuleClear3950);
            iv_ruleClear=ruleClear();

            state._fsp--;

             current =iv_ruleClear; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClear3960); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1780:1: ruleClear returns [EObject current=null] : ( (lv_action_0_0= '.clear()' ) ) ;
    public final EObject ruleClear() throws RecognitionException {
        EObject current = null;

        Token lv_action_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1783:28: ( ( (lv_action_0_0= '.clear()' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1784:1: ( (lv_action_0_0= '.clear()' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1784:1: ( (lv_action_0_0= '.clear()' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1785:1: (lv_action_0_0= '.clear()' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1785:1: (lv_action_0_0= '.clear()' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1786:3: lv_action_0_0= '.clear()'
            {
            lv_action_0_0=(Token)match(input,34,FOLLOW_34_in_ruleClear4002); 

                    newLeafNode(lv_action_0_0, grammarAccess.getClearAccess().getActionClearKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClearRule());
            	        }
                   		setWithLastConsumed(current, "action", lv_action_0_0, ".clear()");
            	    

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
    // $ANTLR end "ruleClear"


    // $ANTLR start "entryRuleCheckValue"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1807:1: entryRuleCheckValue returns [EObject current=null] : iv_ruleCheckValue= ruleCheckValue EOF ;
    public final EObject entryRuleCheckValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckValue = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1808:2: (iv_ruleCheckValue= ruleCheckValue EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1809:2: iv_ruleCheckValue= ruleCheckValue EOF
            {
             newCompositeNode(grammarAccess.getCheckValueRule()); 
            pushFollow(FOLLOW_ruleCheckValue_in_entryRuleCheckValue4050);
            iv_ruleCheckValue=ruleCheckValue();

            state._fsp--;

             current =iv_ruleCheckValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckValue4060); 

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
    // $ANTLR end "entryRuleCheckValue"


    // $ANTLR start "ruleCheckValue"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1816:1: ruleCheckValue returns [EObject current=null] : (otherlv_0= '.verify(' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) otherlv_2= ')' ) ;
    public final EObject ruleCheckValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1819:28: ( (otherlv_0= '.verify(' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) otherlv_2= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1820:1: (otherlv_0= '.verify(' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) otherlv_2= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1820:1: (otherlv_0= '.verify(' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) otherlv_2= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1820:3: otherlv_0= '.verify(' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleCheckValue4097); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckValueAccess().getVerifyKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1824:1: ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1825:1: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1825:1: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1826:1: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1826:1: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1827:3: lv_value_1_1= ruleStringValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckValueAccess().getValueStringValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringValue_in_ruleCheckValue4120);
                    lv_value_1_1=ruleStringValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_1, 
                            		"StringValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1842:8: lv_value_1_2= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckValueAccess().getValueVariableParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleCheckValue4139);
                    lv_value_1_2=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_2, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCheckValue4154); 

                	newLeafNode(otherlv_2, grammarAccess.getCheckValueAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleCheckValue"


    // $ANTLR start "entryRuleFill"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1872:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1873:2: (iv_ruleFill= ruleFill EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1874:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_ruleFill_in_entryRuleFill4190);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFill4200); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1881:1: ruleFill returns [EObject current=null] : (otherlv_0= '.fill(' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) otherlv_2= ')' ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1884:28: ( (otherlv_0= '.fill(' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) otherlv_2= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1885:1: (otherlv_0= '.fill(' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) otherlv_2= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1885:1: (otherlv_0= '.fill(' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) otherlv_2= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1885:3: otherlv_0= '.fill(' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleFill4237); 

                	newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1889:1: ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1890:1: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1890:1: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1891:1: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1891:1: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1892:3: lv_value_1_1= ruleStringValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getFillAccess().getValueStringValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringValue_in_ruleFill4260);
                    lv_value_1_1=ruleStringValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFillRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_1, 
                            		"StringValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1907:8: lv_value_1_2= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getFillAccess().getValueVariableParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleFill4279);
                    lv_value_1_2=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFillRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_2, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleFill4294); 

                	newLeafNode(otherlv_2, grammarAccess.getFillAccess().getRightParenthesisKeyword_2());
                

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


    // $ANTLR start "entryRuleValues"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1937:1: entryRuleValues returns [EObject current=null] : iv_ruleValues= ruleValues EOF ;
    public final EObject entryRuleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValues = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1938:2: (iv_ruleValues= ruleValues EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1939:2: iv_ruleValues= ruleValues EOF
            {
             newCompositeNode(grammarAccess.getValuesRule()); 
            pushFollow(FOLLOW_ruleValues_in_entryRuleValues4330);
            iv_ruleValues=ruleValues();

            state._fsp--;

             current =iv_ruleValues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValues4340); 

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
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1946:1: ruleValues returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue ) ;
    public final EObject ruleValues() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_BooleanValue_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1949:28: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1950:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1950:1: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt20=1;
                }
                break;
            case RULE_STRING:
                {
                alt20=2;
                }
                break;
            case 37:
            case 38:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1951:5: this_IntValue_0= ruleIntValue
                    {
                     
                            newCompositeNode(grammarAccess.getValuesAccess().getIntValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValues4387);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;

                     
                            current = this_IntValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1961:5: this_StringValue_1= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getValuesAccess().getStringValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValues4414);
                    this_StringValue_1=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1971:5: this_BooleanValue_2= ruleBooleanValue
                    {
                     
                            newCompositeNode(grammarAccess.getValuesAccess().getBooleanValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleValues4441);
                    this_BooleanValue_2=ruleBooleanValue();

                    state._fsp--;

                     
                            current = this_BooleanValue_2; 
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
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRuleIntValue"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1987:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1988:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1989:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue4476);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue4486); 

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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1996:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1999:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2000:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2000:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2001:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2001:1: (lv_value_0_0= RULE_INT )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2002:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue4527); 

            			newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleStringValue"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2026:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2027:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2028:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue4567);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue4577); 

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2035:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2038:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2039:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2039:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2040:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2040:1: (lv_value_0_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2041:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue4618); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2065:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2066:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2067:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue4658);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue4668); 

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2074:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2077:28: ( ( (lv_value_0_0= ruleBoolean ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2078:1: ( (lv_value_0_0= ruleBoolean ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2078:1: ( (lv_value_0_0= ruleBoolean ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2079:1: (lv_value_0_0= ruleBoolean )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2079:1: (lv_value_0_0= ruleBoolean )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2080:3: lv_value_0_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getValueBooleanEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleBooleanValue4713);
            lv_value_0_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Boolean");
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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "ruleBoolean"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2104:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2106:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2107:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2107:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            else if ( (LA21_0==38) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2107:2: (enumLiteral_0= 'true' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2107:2: (enumLiteral_0= 'true' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2107:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_ruleBoolean4762); 

                            current = grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2113:6: (enumLiteral_1= 'false' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2113:6: (enumLiteral_1= 'false' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2113:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_38_in_ruleBoolean4779); 

                            current = grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleOpenBrowser"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2123:1: ruleOpenBrowser returns [Enumerator current=null] : ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) ) ;
    public final Enumerator ruleOpenBrowser() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2125:28: ( ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2126:1: ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2126:1: ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            else if ( (LA22_0==40) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2126:2: (enumLiteral_0= 'Chrome' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2126:2: (enumLiteral_0= 'Chrome' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2126:4: enumLiteral_0= 'Chrome'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleOpenBrowser4824); 

                            current = grammarAccess.getOpenBrowserAccess().getChromeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOpenBrowserAccess().getChromeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2132:6: (enumLiteral_1= 'Firefox' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2132:6: (enumLiteral_1= 'Firefox' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2132:8: enumLiteral_1= 'Firefox'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleOpenBrowser4841); 

                            current = grammarAccess.getOpenBrowserAccess().getFirefoxEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOpenBrowserAccess().getFirefoxEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleOpenBrowser"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleProgram122 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleOpenBrowser_in_ruleProgram143 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProgram155 = new BitSet(new long[]{0x0000000001204000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleProgram176 = new BitSet(new long[]{0x0000000001204000L});
    public static final BitSet FOLLOW_ruleSubroutine_in_ruleProgram198 = new BitSet(new long[]{0x0000000001204000L});
    public static final BitSet FOLLOW_ruleMain_in_ruleProgram220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_entryRuleSubroutine256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutine266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSubroutine303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleHead_in_ruleSubroutine324 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSubBody_in_ruleSubroutine345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubBody_in_entryRuleSubBody381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubBody391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSubBody428 = new BitSet(new long[]{0x00000000FC000020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleSubBody449 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSubBody461 = new BitSet(new long[]{0x00000000FC010020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleSubBody483 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSubBody495 = new BitSet(new long[]{0x00000000FC010020L});
    public static final BitSet FOLLOW_16_in_ruleSubBody509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleHead602 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHead614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleHead643 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHead655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleHead676 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleHead689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleHead710 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleHead724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_entryRuleFunctionName761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionName771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionName812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMain899 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleBody_in_ruleMain920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBody1003 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleGoTo_in_ruleBody1024 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBody1036 = new BitSet(new long[]{0x00000000FC000020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBody1057 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBody1069 = new BitSet(new long[]{0x00000000FC010020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBody1091 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBody1103 = new BitSet(new long[]{0x00000000FC010020L});
    public static final BitSet FOLLOW_16_in_ruleBody1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference1153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionReference_in_entryRuleFunctionReference1242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionReference1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionReference1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall1331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionReference_in_ruleFunctionCall1388 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionCall1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionReference_in_ruleFunctionCall1429 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionCall1441 = new BitSet(new long[]{0x00000060000000B0L});
    public static final BitSet FOLLOW_ruleCallType_in_ruleFunctionCall1462 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionCall1475 = new BitSet(new long[]{0x00000060000000B0L});
    public static final BitSet FOLLOW_ruleCallType_in_ruleFunctionCall1496 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionCall1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallType_in_entryRuleCallType1547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallType1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_ruleCallType1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCallType1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleVariable1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName1756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariableName1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration1847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDeclaration1894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleDeclaration1915 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDeclaration1927 = new BitSet(new long[]{0x0000006000000090L});
    public static final BitSet FOLLOW_ruleValues_in_ruleDeclaration1948 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeclaration1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction1996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleInstruction2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleInstruction2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleInstruction2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_ruleInstruction2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_ruleInstruction2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_ruleInstruction2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleInstruction2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_entryRuleGoTo2250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoTo2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleGoTo2297 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleGoTo2314 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGoTo2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_entryRuleCheckbox2367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckbox2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCheckbox2414 = new BitSet(new long[]{0x00000060000000B0L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleCheckbox2437 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCheckbox2456 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCheckbox2471 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_ruleCheckboxAction_in_ruleCheckbox2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink2528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLink2575 = new BitSet(new long[]{0x00000060000000B0L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleLink2598 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLink2617 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLink2632 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleLinkAction_in_ruleLink2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton2689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleButton2736 = new BitSet(new long[]{0x00000060000000B0L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleButton2759 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleButton2778 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleButton2793 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleButtonAction_in_ruleButton2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage2850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleImage2897 = new BitSet(new long[]{0x00000060000000B0L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleImage2920 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleImage2939 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleImage2954 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleImageAction_in_ruleImage2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField3011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextField3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTextField3058 = new BitSet(new long[]{0x00000060000000B0L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleTextField3081 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTextField3100 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTextField3115 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_ruleTextAction_in_ruleTextField3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckboxAction_in_entryRuleCheckboxAction3172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckboxAction3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_ruleCheckboxAction3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsCheck_in_ruleCheckboxAction3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClear_in_ruleCheckboxAction3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkAction_in_entryRuleLinkAction3318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkAction3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_ruleLinkAction3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonAction_in_entryRuleButtonAction3408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButtonAction3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_ruleButtonAction3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageAction_in_entryRuleImageAction3498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageAction3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_ruleImageAction3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextAction_in_entryRuleTextAction3588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextAction3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckValue_in_ruleTextAction3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_ruleTextAction3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClear_in_ruleTextAction3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_entryRuleClick3734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClick3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleClick3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsCheck_in_entryRuleIsCheck3834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsCheck3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleIsCheck3881 = new BitSet(new long[]{0x0000006000000090L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleIsCheck3902 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIsCheck3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClear_in_entryRuleClear3950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClear3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleClear4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckValue_in_entryRuleCheckValue4050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckValue4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCheckValue4097 = new BitSet(new long[]{0x00000060000000B0L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleCheckValue4120 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCheckValue4139 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCheckValue4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_entryRuleFill4190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFill4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFill4237 = new BitSet(new long[]{0x00000060000000B0L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleFill4260 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleFill4279 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFill4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_entryRuleValues4330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValues4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValues4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValues4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValues4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue4476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue4567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue4658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleBooleanValue4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBoolean4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBoolean4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpenBrowser4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpenBrowser4841 = new BitSet(new long[]{0x0000000000000002L});

}