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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_URL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'browser '", "';'", "'sub '", "'()'", "'(var '", "', var '", "')'", "'();'", "'('", "', '", "');'", "'main'", "'{'", "'}'", "'if '", "'all '", "'any '", "'then '", "'else '", "'endif '", "'while ('", "') do '", "'endwhile'", "'var '", "' = '", "' !'", "' == '", "' > '", "' < '", "'checkbox '", "'link '", "'button '", "'image '", "'textField '", "'select('", "'click('", "'check('", "'fill('", "', value='", "'clear('", "'verify('", "'exist('", "'goTo('", "'Chrome'", "'Firefox'", "'HtmlUnitDriver'", "'Checkbox'", "'Link'", "'Button'", "'Image'", "'TextField'"
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
    public static final int T__61=61;
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
    public static final int T__62=62;
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:77:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'browser ' ( (lv_browser_1_0= ruleOpenBrowser ) ) otherlv_2= ';' ( (lv_subroutines_3_0= ruleSubroutine ) )* ( (lv_main_4_0= ruleMain ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_browser_1_0 = null;

        EObject lv_subroutines_3_0 = null;

        EObject lv_main_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:80:28: ( (otherlv_0= 'browser ' ( (lv_browser_1_0= ruleOpenBrowser ) ) otherlv_2= ';' ( (lv_subroutines_3_0= ruleSubroutine ) )* ( (lv_main_4_0= ruleMain ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:81:1: (otherlv_0= 'browser ' ( (lv_browser_1_0= ruleOpenBrowser ) ) otherlv_2= ';' ( (lv_subroutines_3_0= ruleSubroutine ) )* ( (lv_main_4_0= ruleMain ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:81:1: (otherlv_0= 'browser ' ( (lv_browser_1_0= ruleOpenBrowser ) ) otherlv_2= ';' ( (lv_subroutines_3_0= ruleSubroutine ) )* ( (lv_main_4_0= ruleMain ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:81:3: otherlv_0= 'browser ' ( (lv_browser_1_0= ruleOpenBrowser ) ) otherlv_2= ';' ( (lv_subroutines_3_0= ruleSubroutine ) )* ( (lv_main_4_0= ruleMain ) )
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
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:107:1: ( (lv_subroutines_3_0= ruleSubroutine ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:108:1: (lv_subroutines_3_0= ruleSubroutine )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:108:1: (lv_subroutines_3_0= ruleSubroutine )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:109:3: lv_subroutines_3_0= ruleSubroutine
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getSubroutinesSubroutineParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSubroutine_in_ruleProgram176);
            	    lv_subroutines_3_0=ruleSubroutine();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subroutines",
            	            		lv_subroutines_3_0, 
            	            		"Subroutine");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:125:3: ( (lv_main_4_0= ruleMain ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:126:1: (lv_main_4_0= ruleMain )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:126:1: (lv_main_4_0= ruleMain )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:127:3: lv_main_4_0= ruleMain
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getMainMainParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMain_in_ruleProgram198);
            lv_main_4_0=ruleMain();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		set(
                   			current, 
                   			"main",
                    		lv_main_4_0, 
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:151:1: entryRuleSubroutine returns [EObject current=null] : iv_ruleSubroutine= ruleSubroutine EOF ;
    public final EObject entryRuleSubroutine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubroutine = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:152:2: (iv_ruleSubroutine= ruleSubroutine EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:153:2: iv_ruleSubroutine= ruleSubroutine EOF
            {
             newCompositeNode(grammarAccess.getSubroutineRule()); 
            pushFollow(FOLLOW_ruleSubroutine_in_entryRuleSubroutine234);
            iv_ruleSubroutine=ruleSubroutine();

            state._fsp--;

             current =iv_ruleSubroutine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutine244); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:160:1: ruleSubroutine returns [EObject current=null] : (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) ) ;
    public final EObject ruleSubroutine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_head_1_0 = null;

        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:163:28: ( (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:164:1: (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:164:1: (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:164:3: otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSubroutine281); 

                	newLeafNode(otherlv_0, grammarAccess.getSubroutineAccess().getSubKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:168:1: ( (lv_head_1_0= ruleHead ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:169:1: (lv_head_1_0= ruleHead )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:169:1: (lv_head_1_0= ruleHead )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:170:3: lv_head_1_0= ruleHead
            {
             
            	        newCompositeNode(grammarAccess.getSubroutineAccess().getHeadHeadParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleHead_in_ruleSubroutine302);
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

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:186:2: ( (lv_body_2_0= ruleBody ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:187:1: (lv_body_2_0= ruleBody )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:187:1: (lv_body_2_0= ruleBody )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:188:3: lv_body_2_0= ruleBody
            {
             
            	        newCompositeNode(grammarAccess.getSubroutineAccess().getBodyBodyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBody_in_ruleSubroutine323);
            lv_body_2_0=ruleBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubroutineRule());
            	        }
                   		set(
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:212:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:213:2: (iv_ruleHead= ruleHead EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:214:2: iv_ruleHead= ruleHead EOF
            {
             newCompositeNode(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_ruleHead_in_entryRuleHead359);
            iv_ruleHead=ruleHead();

            state._fsp--;

             current =iv_ruleHead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHead369); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:221:1: ruleHead returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_nameParameters_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) ) ;
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
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:224:28: ( ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_nameParameters_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:225:1: ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_nameParameters_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:225:1: ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_nameParameters_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==16) ) {
                    alt3=2;
                }
                else if ( (LA3_1==15) ) {
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:225:2: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:225:2: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:225:3: ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()'
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:225:3: ( (lv_name_0_0= ruleFunctionName ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:226:1: (lv_name_0_0= ruleFunctionName )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:226:1: (lv_name_0_0= ruleFunctionName )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:227:3: lv_name_0_0= ruleFunctionName
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeadAccess().getNameFunctionNameParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionName_in_ruleHead416);
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

                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleHead428); 

                        	newLeafNode(otherlv_1, grammarAccess.getHeadAccess().getLeftParenthesisRightParenthesisKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:248:6: ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_nameParameters_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )* otherlv_7= ')' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:248:6: ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_nameParameters_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )* otherlv_7= ')' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:248:7: ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_nameParameters_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )* otherlv_7= ')'
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:248:7: ( (lv_name_2_0= ruleFunctionName ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:249:1: (lv_name_2_0= ruleFunctionName )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:249:1: (lv_name_2_0= ruleFunctionName )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:250:3: lv_name_2_0= ruleFunctionName
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeadAccess().getNameFunctionNameParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionName_in_ruleHead457);
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

                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleHead469); 

                        	newLeafNode(otherlv_3, grammarAccess.getHeadAccess().getVarKeyword_1_1());
                        
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:270:1: ( (lv_nameParameters_4_0= ruleVariableName ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:271:1: (lv_nameParameters_4_0= ruleVariableName )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:271:1: (lv_nameParameters_4_0= ruleVariableName )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:272:3: lv_nameParameters_4_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeadAccess().getNameParametersVariableNameParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleHead490);
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

                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:288:2: (otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:288:4: otherlv_5= ', var ' ( (lv_nameParameters_6_0= ruleVariableName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleHead503); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getHeadAccess().getVarKeyword_1_3_0());
                    	        
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:292:1: ( (lv_nameParameters_6_0= ruleVariableName ) )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:293:1: (lv_nameParameters_6_0= ruleVariableName )
                    	    {
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:293:1: (lv_nameParameters_6_0= ruleVariableName )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:294:3: lv_nameParameters_6_0= ruleVariableName
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHeadAccess().getNameParametersVariableNameParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVariableName_in_ruleHead524);
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
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleHead538); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:322:1: entryRuleFunctionReference returns [EObject current=null] : iv_ruleFunctionReference= ruleFunctionReference EOF ;
    public final EObject entryRuleFunctionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReference = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:323:2: (iv_ruleFunctionReference= ruleFunctionReference EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:324:2: iv_ruleFunctionReference= ruleFunctionReference EOF
            {
             newCompositeNode(grammarAccess.getFunctionReferenceRule()); 
            pushFollow(FOLLOW_ruleFunctionReference_in_entryRuleFunctionReference575);
            iv_ruleFunctionReference=ruleFunctionReference();

            state._fsp--;

             current =iv_ruleFunctionReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionReference585); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:331:1: ruleFunctionReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFunctionReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:334:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:335:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:335:1: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:336:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:336:1: (otherlv_0= RULE_ID )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:337:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionReference629); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:356:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:357:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:358:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference664);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;

             current =iv_ruleVariableReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference674); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:365:1: ruleVariableReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:368:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:369:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:369:1: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:370:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:370:1: (otherlv_0= RULE_ID )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:371:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference718); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:390:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:391:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:392:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall753);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall763); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:399:1: ruleFunctionCall returns [EObject current=null] : ( ( ( (lv_function_0_0= ruleFunctionReference ) ) otherlv_1= '();' ) | ( ( (lv_function_2_0= ruleFunctionReference ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleExpression ) ) (otherlv_5= ', ' ( (lv_parameters_6_0= ruleExpression ) ) )* otherlv_7= ');' ) ) ;
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
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:402:28: ( ( ( ( (lv_function_0_0= ruleFunctionReference ) ) otherlv_1= '();' ) | ( ( (lv_function_2_0= ruleFunctionReference ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleExpression ) ) (otherlv_5= ', ' ( (lv_parameters_6_0= ruleExpression ) ) )* otherlv_7= ');' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:403:1: ( ( ( (lv_function_0_0= ruleFunctionReference ) ) otherlv_1= '();' ) | ( ( (lv_function_2_0= ruleFunctionReference ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleExpression ) ) (otherlv_5= ', ' ( (lv_parameters_6_0= ruleExpression ) ) )* otherlv_7= ');' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:403:1: ( ( ( (lv_function_0_0= ruleFunctionReference ) ) otherlv_1= '();' ) | ( ( (lv_function_2_0= ruleFunctionReference ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleExpression ) ) (otherlv_5= ', ' ( (lv_parameters_6_0= ruleExpression ) ) )* otherlv_7= ');' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==20) ) {
                    alt5=2;
                }
                else if ( (LA5_1==19) ) {
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:403:2: ( ( (lv_function_0_0= ruleFunctionReference ) ) otherlv_1= '();' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:403:2: ( ( (lv_function_0_0= ruleFunctionReference ) ) otherlv_1= '();' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:403:3: ( (lv_function_0_0= ruleFunctionReference ) ) otherlv_1= '();'
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:403:3: ( (lv_function_0_0= ruleFunctionReference ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:404:1: (lv_function_0_0= ruleFunctionReference )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:404:1: (lv_function_0_0= ruleFunctionReference )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:405:3: lv_function_0_0= ruleFunctionReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionFunctionReferenceParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionReference_in_ruleFunctionCall810);
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

                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleFunctionCall822); 

                        	newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisSemicolonKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:426:6: ( ( (lv_function_2_0= ruleFunctionReference ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleExpression ) ) (otherlv_5= ', ' ( (lv_parameters_6_0= ruleExpression ) ) )* otherlv_7= ');' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:426:6: ( ( (lv_function_2_0= ruleFunctionReference ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleExpression ) ) (otherlv_5= ', ' ( (lv_parameters_6_0= ruleExpression ) ) )* otherlv_7= ');' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:426:7: ( (lv_function_2_0= ruleFunctionReference ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleExpression ) ) (otherlv_5= ', ' ( (lv_parameters_6_0= ruleExpression ) ) )* otherlv_7= ');'
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:426:7: ( (lv_function_2_0= ruleFunctionReference ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:427:1: (lv_function_2_0= ruleFunctionReference )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:427:1: (lv_function_2_0= ruleFunctionReference )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:428:3: lv_function_2_0= ruleFunctionReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionFunctionReferenceParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionReference_in_ruleFunctionCall851);
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

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleFunctionCall863); 

                        	newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:448:1: ( (lv_parameters_4_0= ruleExpression ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:449:1: (lv_parameters_4_0= ruleExpression )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:449:1: (lv_parameters_4_0= ruleExpression )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:450:3: lv_parameters_4_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall884);
                    lv_parameters_4_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_4_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:466:2: (otherlv_5= ', ' ( (lv_parameters_6_0= ruleExpression ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==21) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:466:4: otherlv_5= ', ' ( (lv_parameters_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleFunctionCall897); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getCommaSpaceKeyword_1_3_0());
                    	        
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:470:1: ( (lv_parameters_6_0= ruleExpression ) )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:471:1: (lv_parameters_6_0= ruleExpression )
                    	    {
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:471:1: (lv_parameters_6_0= ruleExpression )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:472:3: lv_parameters_6_0= ruleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall918);
                    	    lv_parameters_6_0=ruleExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_6_0, 
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

                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleFunctionCall932); 

                        	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getRightParenthesisSemicolonKeyword_1_4());
                        

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:500:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:501:2: (iv_ruleFunctionName= ruleFunctionName EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:502:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_ruleFunctionName_in_entryRuleFunctionName969);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionName979); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:509:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:512:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:513:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:513:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:514:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:514:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:515:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionName1020); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:539:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:540:2: (iv_ruleMain= ruleMain EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:541:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain1060);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain1070); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:548:1: ruleMain returns [EObject current=null] : (otherlv_0= 'main' ( (lv_body_1_0= ruleBody ) ) ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:551:28: ( (otherlv_0= 'main' ( (lv_body_1_0= ruleBody ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:552:1: (otherlv_0= 'main' ( (lv_body_1_0= ruleBody ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:552:1: (otherlv_0= 'main' ( (lv_body_1_0= ruleBody ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:552:3: otherlv_0= 'main' ( (lv_body_1_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleMain1107); 

                	newLeafNode(otherlv_0, grammarAccess.getMainAccess().getMainKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:556:1: ( (lv_body_1_0= ruleBody ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:557:1: (lv_body_1_0= ruleBody )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:557:1: (lv_body_1_0= ruleBody )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:558:3: lv_body_1_0= ruleBody
            {
             
            	        newCompositeNode(grammarAccess.getMainAccess().getBodyBodyParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBody_in_ruleMain1128);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:582:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:583:2: (iv_ruleBody= ruleBody EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:584:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody1164);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody1174); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:591:1: ruleBody returns [EObject current=null] : (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_instructions_1_0 = null;

        EObject lv_instructions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:594:28: ( (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:595:1: (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:595:1: (otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:595:3: otherlv_0= '{' ( (lv_instructions_1_0= ruleInstruction ) ) ( (lv_instructions_2_0= ruleInstruction ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleBody1211); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:599:1: ( (lv_instructions_1_0= ruleInstruction ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:600:1: (lv_instructions_1_0= ruleInstruction )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:600:1: (lv_instructions_1_0= ruleInstruction )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:601:3: lv_instructions_1_0= ruleInstruction
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getInstructionsInstructionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleInstruction_in_ruleBody1232);
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

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:617:2: ( (lv_instructions_2_0= ruleInstruction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==26||LA6_0==32||LA6_0==35||(LA6_0>=47 && LA6_0<=49)||LA6_0==51||LA6_0==54) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:618:1: (lv_instructions_2_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:618:1: (lv_instructions_2_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:619:3: lv_instructions_2_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBodyAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleBody1253);
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

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleBody1266); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:647:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:648:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:649:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction1302);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction1312); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:656:1: ruleInstruction returns [EObject current=null] : (this_Declaration_0= ruleDeclaration | this_Condition_1= ruleCondition | this_While_2= ruleWhile | this_ActionInstruction_3= ruleActionInstruction | this_Assignation_4= ruleAssignation | this_FunctionCall_5= ruleFunctionCall ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Declaration_0 = null;

        EObject this_Condition_1 = null;

        EObject this_While_2 = null;

        EObject this_ActionInstruction_3 = null;

        EObject this_Assignation_4 = null;

        EObject this_FunctionCall_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:659:28: ( (this_Declaration_0= ruleDeclaration | this_Condition_1= ruleCondition | this_While_2= ruleWhile | this_ActionInstruction_3= ruleActionInstruction | this_Assignation_4= ruleAssignation | this_FunctionCall_5= ruleFunctionCall ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:660:1: (this_Declaration_0= ruleDeclaration | this_Condition_1= ruleCondition | this_While_2= ruleWhile | this_ActionInstruction_3= ruleActionInstruction | this_Assignation_4= ruleAssignation | this_FunctionCall_5= ruleFunctionCall )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:660:1: (this_Declaration_0= ruleDeclaration | this_Condition_1= ruleCondition | this_While_2= ruleWhile | this_ActionInstruction_3= ruleActionInstruction | this_Assignation_4= ruleAssignation | this_FunctionCall_5= ruleFunctionCall )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            case 47:
            case 48:
            case 49:
            case 51:
            case 54:
                {
                alt7=4;
                }
                break;
            case RULE_ID:
                {
                int LA7_5 = input.LA(2);

                if ( ((LA7_5>=19 && LA7_5<=20)) ) {
                    alt7=6;
                }
                else if ( (LA7_5==36) ) {
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:661:5: this_Declaration_0= ruleDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleInstruction1359);
                    this_Declaration_0=ruleDeclaration();

                    state._fsp--;

                     
                            current = this_Declaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:671:5: this_Condition_1= ruleCondition
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getConditionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCondition_in_ruleInstruction1386);
                    this_Condition_1=ruleCondition();

                    state._fsp--;

                     
                            current = this_Condition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:681:5: this_While_2= ruleWhile
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getWhileParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleWhile_in_ruleInstruction1413);
                    this_While_2=ruleWhile();

                    state._fsp--;

                     
                            current = this_While_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:691:5: this_ActionInstruction_3= ruleActionInstruction
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getActionInstructionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleActionInstruction_in_ruleInstruction1440);
                    this_ActionInstruction_3=ruleActionInstruction();

                    state._fsp--;

                     
                            current = this_ActionInstruction_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:701:5: this_Assignation_4= ruleAssignation
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAssignationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAssignation_in_ruleInstruction1467);
                    this_Assignation_4=ruleAssignation();

                    state._fsp--;

                     
                            current = this_Assignation_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:711:5: this_FunctionCall_5= ruleFunctionCall
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getFunctionCallParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleInstruction1494);
                    this_FunctionCall_5=ruleFunctionCall();

                    state._fsp--;

                     
                            current = this_FunctionCall_5; 
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
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1529);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1539); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:736:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'if ' (otherlv_1= 'all ' | otherlv_2= 'any ' )? otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= 'then ' ( (lv_instructionsIf_7_0= ruleInstruction ) )+ (otherlv_8= 'else ' ( (lv_instructionsElse_9_0= ruleInstruction ) )+ )? otherlv_10= 'endif ' ) ;
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
        EObject lv_expression_4_0 = null;

        EObject lv_instructionsIf_7_0 = null;

        EObject lv_instructionsElse_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:739:28: ( (otherlv_0= 'if ' (otherlv_1= 'all ' | otherlv_2= 'any ' )? otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= 'then ' ( (lv_instructionsIf_7_0= ruleInstruction ) )+ (otherlv_8= 'else ' ( (lv_instructionsElse_9_0= ruleInstruction ) )+ )? otherlv_10= 'endif ' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:740:1: (otherlv_0= 'if ' (otherlv_1= 'all ' | otherlv_2= 'any ' )? otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= 'then ' ( (lv_instructionsIf_7_0= ruleInstruction ) )+ (otherlv_8= 'else ' ( (lv_instructionsElse_9_0= ruleInstruction ) )+ )? otherlv_10= 'endif ' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:740:1: (otherlv_0= 'if ' (otherlv_1= 'all ' | otherlv_2= 'any ' )? otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= 'then ' ( (lv_instructionsIf_7_0= ruleInstruction ) )+ (otherlv_8= 'else ' ( (lv_instructionsElse_9_0= ruleInstruction ) )+ )? otherlv_10= 'endif ' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:740:3: otherlv_0= 'if ' (otherlv_1= 'all ' | otherlv_2= 'any ' )? otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= 'then ' ( (lv_instructionsIf_7_0= ruleInstruction ) )+ (otherlv_8= 'else ' ( (lv_instructionsElse_9_0= ruleInstruction ) )+ )? otherlv_10= 'endif '
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleCondition1576); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:744:1: (otherlv_1= 'all ' | otherlv_2= 'any ' )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:744:3: otherlv_1= 'all '
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleCondition1589); 

                        	newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getAllKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:749:7: otherlv_2= 'any '
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleCondition1607); 

                        	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getAnyKeyword_1_1());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCondition1621); 

                	newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:757:1: ( (lv_expression_4_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:758:1: (lv_expression_4_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:758:1: (lv_expression_4_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:759:3: lv_expression_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getExpressionExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCondition1642);
            lv_expression_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleCondition1654); 

                	newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getRightParenthesisKeyword_4());
                
            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleCondition1666); 

                	newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getThenKeyword_5());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:783:1: ( (lv_instructionsIf_7_0= ruleInstruction ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==26||LA9_0==32||LA9_0==35||(LA9_0>=47 && LA9_0<=49)||LA9_0==51||LA9_0==54) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:784:1: (lv_instructionsIf_7_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:784:1: (lv_instructionsIf_7_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:785:3: lv_instructionsIf_7_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionAccess().getInstructionsIfInstructionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleCondition1687);
            	    lv_instructionsIf_7_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructionsIf",
            	            		lv_instructionsIf_7_0, 
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

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:801:3: (otherlv_8= 'else ' ( (lv_instructionsElse_9_0= ruleInstruction ) )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:801:5: otherlv_8= 'else ' ( (lv_instructionsElse_9_0= ruleInstruction ) )+
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleCondition1701); 

                        	newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getElseKeyword_7_0());
                        
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:805:1: ( (lv_instructionsElse_9_0= ruleInstruction ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID||LA10_0==26||LA10_0==32||LA10_0==35||(LA10_0>=47 && LA10_0<=49)||LA10_0==51||LA10_0==54) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:806:1: (lv_instructionsElse_9_0= ruleInstruction )
                    	    {
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:806:1: (lv_instructionsElse_9_0= ruleInstruction )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:807:3: lv_instructionsElse_9_0= ruleInstruction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConditionAccess().getInstructionsElseInstructionParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInstruction_in_ruleCondition1722);
                    	    lv_instructionsElse_9_0=ruleInstruction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"instructionsElse",
                    	            		lv_instructionsElse_9_0, 
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


                    }
                    break;

            }

            otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleCondition1737); 

                	newLeafNode(otherlv_10, grammarAccess.getConditionAccess().getEndifKeyword_8());
                

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
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile1773);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile1783); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:844:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while (' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ') do ' ( (lv_instructions_3_0= ruleInstruction ) )+ otherlv_4= 'endwhile' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_instructions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:847:28: ( (otherlv_0= 'while (' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ') do ' ( (lv_instructions_3_0= ruleInstruction ) )+ otherlv_4= 'endwhile' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:848:1: (otherlv_0= 'while (' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ') do ' ( (lv_instructions_3_0= ruleInstruction ) )+ otherlv_4= 'endwhile' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:848:1: (otherlv_0= 'while (' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ') do ' ( (lv_instructions_3_0= ruleInstruction ) )+ otherlv_4= 'endwhile' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:848:3: otherlv_0= 'while (' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ') do ' ( (lv_instructions_3_0= ruleInstruction ) )+ otherlv_4= 'endwhile'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleWhile1820); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:852:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:853:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:853:1: (lv_expression_1_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:854:3: lv_expression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getWhileAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleWhile1841);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleWhile1853); 

                	newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getDoKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:874:1: ( (lv_instructions_3_0= ruleInstruction ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==26||LA12_0==32||LA12_0==35||(LA12_0>=47 && LA12_0<=49)||LA12_0==51||LA12_0==54) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:875:1: (lv_instructions_3_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:875:1: (lv_instructions_3_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:876:3: lv_instructions_3_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhileAccess().getInstructionsInstructionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleWhile1874);
            	    lv_instructions_3_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_3_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleWhile1887); 

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
            pushFollow(FOLLOW_ruleActionInstruction_in_entryRuleActionInstruction1923);
            iv_ruleActionInstruction=ruleActionInstruction();

            state._fsp--;

             current =iv_ruleActionInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionInstruction1933); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:913:1: ruleActionInstruction returns [EObject current=null] : (this_Click_0= ruleClick | this_Check_1= ruleCheck | this_Fill_2= ruleFill | this_Clear_3= ruleClear | this_GoTo_4= ruleGoTo ) ;
    public final EObject ruleActionInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;

        EObject this_Check_1 = null;

        EObject this_Fill_2 = null;

        EObject this_Clear_3 = null;

        EObject this_GoTo_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:916:28: ( (this_Click_0= ruleClick | this_Check_1= ruleCheck | this_Fill_2= ruleFill | this_Clear_3= ruleClear | this_GoTo_4= ruleGoTo ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:917:1: (this_Click_0= ruleClick | this_Check_1= ruleCheck | this_Fill_2= ruleFill | this_Clear_3= ruleClear | this_GoTo_4= ruleGoTo )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:917:1: (this_Click_0= ruleClick | this_Check_1= ruleCheck | this_Fill_2= ruleFill | this_Clear_3= ruleClear | this_GoTo_4= ruleGoTo )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt13=1;
                }
                break;
            case 48:
                {
                alt13=2;
                }
                break;
            case 49:
                {
                alt13=3;
                }
                break;
            case 51:
                {
                alt13=4;
                }
                break;
            case 54:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:918:5: this_Click_0= ruleClick
                    {
                     
                            newCompositeNode(grammarAccess.getActionInstructionAccess().getClickParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClick_in_ruleActionInstruction1980);
                    this_Click_0=ruleClick();

                    state._fsp--;

                     
                            current = this_Click_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:928:5: this_Check_1= ruleCheck
                    {
                     
                            newCompositeNode(grammarAccess.getActionInstructionAccess().getCheckParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCheck_in_ruleActionInstruction2007);
                    this_Check_1=ruleCheck();

                    state._fsp--;

                     
                            current = this_Check_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:938:5: this_Fill_2= ruleFill
                    {
                     
                            newCompositeNode(grammarAccess.getActionInstructionAccess().getFillParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFill_in_ruleActionInstruction2034);
                    this_Fill_2=ruleFill();

                    state._fsp--;

                     
                            current = this_Fill_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:948:5: this_Clear_3= ruleClear
                    {
                     
                            newCompositeNode(grammarAccess.getActionInstructionAccess().getClearParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleClear_in_ruleActionInstruction2061);
                    this_Clear_3=ruleClear();

                    state._fsp--;

                     
                            current = this_Clear_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:958:5: this_GoTo_4= ruleGoTo
                    {
                     
                            newCompositeNode(grammarAccess.getActionInstructionAccess().getGoToParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleGoTo_in_ruleActionInstruction2088);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:974:1: entryRuleVariableName returns [EObject current=null] : iv_ruleVariableName= ruleVariableName EOF ;
    public final EObject entryRuleVariableName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableName = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:975:2: (iv_ruleVariableName= ruleVariableName EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:976:2: iv_ruleVariableName= ruleVariableName EOF
            {
             newCompositeNode(grammarAccess.getVariableNameRule()); 
            pushFollow(FOLLOW_ruleVariableName_in_entryRuleVariableName2123);
            iv_ruleVariableName=ruleVariableName();

            state._fsp--;

             current =iv_ruleVariableName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableName2133); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:983:1: ruleVariableName returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleVariableName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:986:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:987:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:987:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:988:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:988:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:989:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariableName2174); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1013:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1014:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1015:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration2214);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration2224); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1022:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'var ' ( (lv_variable_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleElement ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_value_3_1 = null;

        EObject lv_value_3_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1025:28: ( (otherlv_0= 'var ' ( (lv_variable_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleElement ) ) ) otherlv_4= ';' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1026:1: (otherlv_0= 'var ' ( (lv_variable_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleElement ) ) ) otherlv_4= ';' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1026:1: (otherlv_0= 'var ' ( (lv_variable_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleElement ) ) ) otherlv_4= ';' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1026:3: otherlv_0= 'var ' ( (lv_variable_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleElement ) ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleDeclaration2261); 

                	newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getVarKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1030:1: ( (lv_variable_1_0= ruleVariableName ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1031:1: (lv_variable_1_0= ruleVariableName )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1031:1: (lv_variable_1_0= ruleVariableName )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1032:3: lv_variable_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getVariableVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleDeclaration2282);
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

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleDeclaration2294); 

                	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getSpaceEqualsSignSpaceKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1052:1: ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleElement ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1053:1: ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleElement ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1053:1: ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleElement ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1054:1: (lv_value_3_1= ruleExpression | lv_value_3_2= ruleElement )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1054:1: (lv_value_3_1= ruleExpression | lv_value_3_2= ruleElement )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||(LA14_0>=37 && LA14_0<=40)||(LA14_0>=52 && LA14_0<=53)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=41 && LA14_0<=45)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1055:3: lv_value_3_1= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationAccess().getValueExpressionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleDeclaration2317);
                    lv_value_3_1=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_1, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1070:8: lv_value_3_2= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationAccess().getValueElementParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleElement_in_ruleDeclaration2336);
                    lv_value_3_2=ruleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_2, 
                            		"Element");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDeclaration2351); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1100:1: entryRuleAssignation returns [EObject current=null] : iv_ruleAssignation= ruleAssignation EOF ;
    public final EObject entryRuleAssignation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignation = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1101:2: (iv_ruleAssignation= ruleAssignation EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1102:2: iv_ruleAssignation= ruleAssignation EOF
            {
             newCompositeNode(grammarAccess.getAssignationRule()); 
            pushFollow(FOLLOW_ruleAssignation_in_entryRuleAssignation2387);
            iv_ruleAssignation=ruleAssignation();

            state._fsp--;

             current =iv_ruleAssignation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignation2397); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1109:1: ruleAssignation returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= ' = ' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleAssignation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1112:28: ( ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= ' = ' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1113:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= ' = ' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1113:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= ' = ' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1113:2: ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= ' = ' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1113:2: ( (lv_variable_0_0= ruleVariableReference ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1114:1: (lv_variable_0_0= ruleVariableReference )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1114:1: (lv_variable_0_0= ruleVariableReference )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1115:3: lv_variable_0_0= ruleVariableReference
            {
             
            	        newCompositeNode(grammarAccess.getAssignationAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableReference_in_ruleAssignation2443);
            lv_variable_0_0=ruleVariableReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignationRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_0_0, 
                    		"VariableReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleAssignation2455); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignationAccess().getSpaceEqualsSignSpaceKeyword_1());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1135:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1136:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1136:1: (lv_value_2_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1137:3: lv_value_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignationAccess().getValueExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignation2476);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignationRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleAssignation2488); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1165:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1166:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1167:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2524);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2534); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1174:1: ruleExpression returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_Variable_1= ruleVariable | this_ActionExpression_2= ruleActionExpression | this_NotEpression_3= ruleNotEpression | this_BinarieExpression_4= ruleBinarieExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_Variable_1 = null;

        EObject this_ActionExpression_2 = null;

        EObject this_NotEpression_3 = null;

        EObject this_BinarieExpression_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1177:28: ( (this_StringValue_0= ruleStringValue | this_Variable_1= ruleVariable | this_ActionExpression_2= ruleActionExpression | this_NotEpression_3= ruleNotEpression | this_BinarieExpression_4= ruleBinarieExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1178:1: (this_StringValue_0= ruleStringValue | this_Variable_1= ruleVariable | this_ActionExpression_2= ruleActionExpression | this_NotEpression_3= ruleNotEpression | this_BinarieExpression_4= ruleBinarieExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1178:1: (this_StringValue_0= ruleStringValue | this_Variable_1= ruleVariable | this_ActionExpression_2= ruleActionExpression | this_NotEpression_3= ruleNotEpression | this_BinarieExpression_4= ruleBinarieExpression )
            int alt15=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt15=1;
                }
                break;
            case RULE_ID:
                {
                alt15=2;
                }
                break;
            case 52:
            case 53:
                {
                alt15=3;
                }
                break;
            case 37:
                {
                alt15=4;
                }
                break;
            case 38:
            case 39:
            case 40:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1179:5: this_StringValue_0= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getStringValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleExpression2581);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1189:5: this_Variable_1= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getVariableParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleExpression2608);
                    this_Variable_1=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1199:5: this_ActionExpression_2= ruleActionExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getActionExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleActionExpression_in_ruleExpression2635);
                    this_ActionExpression_2=ruleActionExpression();

                    state._fsp--;

                     
                            current = this_ActionExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1209:5: this_NotEpression_3= ruleNotEpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getNotEpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleNotEpression_in_ruleExpression2662);
                    this_NotEpression_3=ruleNotEpression();

                    state._fsp--;

                     
                            current = this_NotEpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1219:5: this_BinarieExpression_4= ruleBinarieExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getBinarieExpressionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBinarieExpression_in_ruleExpression2689);
                    this_BinarieExpression_4=ruleBinarieExpression();

                    state._fsp--;

                     
                            current = this_BinarieExpression_4; 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleNotEpression"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1235:1: entryRuleNotEpression returns [EObject current=null] : iv_ruleNotEpression= ruleNotEpression EOF ;
    public final EObject entryRuleNotEpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEpression = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1236:2: (iv_ruleNotEpression= ruleNotEpression EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1237:2: iv_ruleNotEpression= ruleNotEpression EOF
            {
             newCompositeNode(grammarAccess.getNotEpressionRule()); 
            pushFollow(FOLLOW_ruleNotEpression_in_entryRuleNotEpression2724);
            iv_ruleNotEpression=ruleNotEpression();

            state._fsp--;

             current =iv_ruleNotEpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEpression2734); 

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
    // $ANTLR end "entryRuleNotEpression"


    // $ANTLR start "ruleNotEpression"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1244:1: ruleNotEpression returns [EObject current=null] : (otherlv_0= ' !' ( (lv_exp_1_0= ruleExpression ) ) ) ;
    public final EObject ruleNotEpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1247:28: ( (otherlv_0= ' !' ( (lv_exp_1_0= ruleExpression ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1248:1: (otherlv_0= ' !' ( (lv_exp_1_0= ruleExpression ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1248:1: (otherlv_0= ' !' ( (lv_exp_1_0= ruleExpression ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1248:3: otherlv_0= ' !' ( (lv_exp_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleNotEpression2771); 

                	newLeafNode(otherlv_0, grammarAccess.getNotEpressionAccess().getSpaceExclamationMarkKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1252:1: ( (lv_exp_1_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1253:1: (lv_exp_1_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1253:1: (lv_exp_1_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1254:3: lv_exp_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getNotEpressionAccess().getExpExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleNotEpression2792);
            lv_exp_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNotEpressionRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_1_0, 
                    		"Expression");
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
    // $ANTLR end "ruleNotEpression"


    // $ANTLR start "entryRuleBinarieExpression"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1278:1: entryRuleBinarieExpression returns [EObject current=null] : iv_ruleBinarieExpression= ruleBinarieExpression EOF ;
    public final EObject entryRuleBinarieExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinarieExpression = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1279:2: (iv_ruleBinarieExpression= ruleBinarieExpression EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1280:2: iv_ruleBinarieExpression= ruleBinarieExpression EOF
            {
             newCompositeNode(grammarAccess.getBinarieExpressionRule()); 
            pushFollow(FOLLOW_ruleBinarieExpression_in_entryRuleBinarieExpression2828);
            iv_ruleBinarieExpression=ruleBinarieExpression();

            state._fsp--;

             current =iv_ruleBinarieExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinarieExpression2838); 

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
    // $ANTLR end "entryRuleBinarieExpression"


    // $ANTLR start "ruleBinarieExpression"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1287:1: ruleBinarieExpression returns [EObject current=null] : ( (otherlv_0= ' == ' | otherlv_1= ' > ' | otherlv_2= ' < ' ) ( (lv_leftExpression_3_0= ruleExpression ) ) ( (lv_rightExpression_4_0= ruleExpression ) ) ) ;
    public final EObject ruleBinarieExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_leftExpression_3_0 = null;

        EObject lv_rightExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1290:28: ( ( (otherlv_0= ' == ' | otherlv_1= ' > ' | otherlv_2= ' < ' ) ( (lv_leftExpression_3_0= ruleExpression ) ) ( (lv_rightExpression_4_0= ruleExpression ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1291:1: ( (otherlv_0= ' == ' | otherlv_1= ' > ' | otherlv_2= ' < ' ) ( (lv_leftExpression_3_0= ruleExpression ) ) ( (lv_rightExpression_4_0= ruleExpression ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1291:1: ( (otherlv_0= ' == ' | otherlv_1= ' > ' | otherlv_2= ' < ' ) ( (lv_leftExpression_3_0= ruleExpression ) ) ( (lv_rightExpression_4_0= ruleExpression ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1291:2: (otherlv_0= ' == ' | otherlv_1= ' > ' | otherlv_2= ' < ' ) ( (lv_leftExpression_3_0= ruleExpression ) ) ( (lv_rightExpression_4_0= ruleExpression ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1291:2: (otherlv_0= ' == ' | otherlv_1= ' > ' | otherlv_2= ' < ' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt16=1;
                }
                break;
            case 39:
                {
                alt16=2;
                }
                break;
            case 40:
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1291:4: otherlv_0= ' == '
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleBinarieExpression2876); 

                        	newLeafNode(otherlv_0, grammarAccess.getBinarieExpressionAccess().getSpaceEqualsSignEqualsSignSpaceKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1296:7: otherlv_1= ' > '
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleBinarieExpression2894); 

                        	newLeafNode(otherlv_1, grammarAccess.getBinarieExpressionAccess().getSpaceGreaterThanSignSpaceKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1301:7: otherlv_2= ' < '
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleBinarieExpression2912); 

                        	newLeafNode(otherlv_2, grammarAccess.getBinarieExpressionAccess().getSpaceLessThanSignSpaceKeyword_0_2());
                        

                    }
                    break;

            }

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1305:2: ( (lv_leftExpression_3_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1306:1: (lv_leftExpression_3_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1306:1: (lv_leftExpression_3_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1307:3: lv_leftExpression_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getBinarieExpressionAccess().getLeftExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleBinarieExpression2934);
            lv_leftExpression_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinarieExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"leftExpression",
                    		lv_leftExpression_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1323:2: ( (lv_rightExpression_4_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1324:1: (lv_rightExpression_4_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1324:1: (lv_rightExpression_4_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1325:3: lv_rightExpression_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getBinarieExpressionAccess().getRightExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleBinarieExpression2955);
            lv_rightExpression_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinarieExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"rightExpression",
                    		lv_rightExpression_4_0, 
                    		"Expression");
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
    // $ANTLR end "ruleBinarieExpression"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1349:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1350:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1351:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2991);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable3001); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1358:1: ruleVariable returns [EObject current=null] : this_VariableReference_0= ruleVariableReference ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_VariableReference_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1361:28: (this_VariableReference_0= ruleVariableReference )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1363:5: this_VariableReference_0= ruleVariableReference
            {
             
                    newCompositeNode(grammarAccess.getVariableAccess().getVariableReferenceParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleVariableReference_in_ruleVariable3047);
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


    // $ANTLR start "entryRuleActionExpression"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1379:1: entryRuleActionExpression returns [EObject current=null] : iv_ruleActionExpression= ruleActionExpression EOF ;
    public final EObject entryRuleActionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionExpression = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1380:2: (iv_ruleActionExpression= ruleActionExpression EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1381:2: iv_ruleActionExpression= ruleActionExpression EOF
            {
             newCompositeNode(grammarAccess.getActionExpressionRule()); 
            pushFollow(FOLLOW_ruleActionExpression_in_entryRuleActionExpression3081);
            iv_ruleActionExpression=ruleActionExpression();

            state._fsp--;

             current =iv_ruleActionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionExpression3091); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1388:1: ruleActionExpression returns [EObject current=null] : (this_Verify_0= ruleVerify | this_Exist_1= ruleExist ) ;
    public final EObject ruleActionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Verify_0 = null;

        EObject this_Exist_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1391:28: ( (this_Verify_0= ruleVerify | this_Exist_1= ruleExist ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1392:1: (this_Verify_0= ruleVerify | this_Exist_1= ruleExist )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1392:1: (this_Verify_0= ruleVerify | this_Exist_1= ruleExist )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            else if ( (LA17_0==53) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1393:5: this_Verify_0= ruleVerify
                    {
                     
                            newCompositeNode(grammarAccess.getActionExpressionAccess().getVerifyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVerify_in_ruleActionExpression3138);
                    this_Verify_0=ruleVerify();

                    state._fsp--;

                     
                            current = this_Verify_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1403:5: this_Exist_1= ruleExist
                    {
                     
                            newCompositeNode(grammarAccess.getActionExpressionAccess().getExistParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExist_in_ruleActionExpression3165);
                    this_Exist_1=ruleExist();

                    state._fsp--;

                     
                            current = this_Exist_1; 
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
    // $ANTLR end "ruleActionExpression"


    // $ANTLR start "entryRuleElement"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1419:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1420:2: (iv_ruleElement= ruleElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1421:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement3200);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement3210); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1428:1: ruleElement returns [EObject current=null] : (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_ClickableElement_0 = null;

        EObject this_FillableElement_1 = null;

        EObject this_CheckableElement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1431:28: ( (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1432:1: (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1432:1: (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 42:
            case 43:
            case 44:
                {
                alt18=1;
                }
                break;
            case 45:
                {
                alt18=2;
                }
                break;
            case 41:
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1433:5: this_ClickableElement_0= ruleClickableElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getClickableElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClickableElement_in_ruleElement3257);
                    this_ClickableElement_0=ruleClickableElement();

                    state._fsp--;

                     
                            current = this_ClickableElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1443:5: this_FillableElement_1= ruleFillableElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getFillableElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleElement3284);
                    this_FillableElement_1=ruleFillableElement();

                    state._fsp--;

                     
                            current = this_FillableElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1453:5: this_CheckableElement_2= ruleCheckableElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getCheckableElementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleElement3311);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1469:1: entryRuleClickableElement returns [EObject current=null] : iv_ruleClickableElement= ruleClickableElement EOF ;
    public final EObject entryRuleClickableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickableElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1470:2: (iv_ruleClickableElement= ruleClickableElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1471:2: iv_ruleClickableElement= ruleClickableElement EOF
            {
             newCompositeNode(grammarAccess.getClickableElementRule()); 
            pushFollow(FOLLOW_ruleClickableElement_in_entryRuleClickableElement3346);
            iv_ruleClickableElement=ruleClickableElement();

            state._fsp--;

             current =iv_ruleClickableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClickableElement3356); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1478:1: ruleClickableElement returns [EObject current=null] : (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage ) ;
    public final EObject ruleClickableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Link_0 = null;

        EObject this_Button_1 = null;

        EObject this_Image_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1481:28: ( (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1482:1: (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1482:1: (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt19=1;
                }
                break;
            case 43:
                {
                alt19=2;
                }
                break;
            case 44:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1483:5: this_Link_0= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getClickableElementAccess().getLinkParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleClickableElement3403);
                    this_Link_0=ruleLink();

                    state._fsp--;

                     
                            current = this_Link_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1493:5: this_Button_1= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getClickableElementAccess().getButtonParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleClickableElement3430);
                    this_Button_1=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1503:5: this_Image_2= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getClickableElementAccess().getImageParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleClickableElement3457);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1519:1: entryRuleFillableElement returns [EObject current=null] : iv_ruleFillableElement= ruleFillableElement EOF ;
    public final EObject entryRuleFillableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFillableElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1520:2: (iv_ruleFillableElement= ruleFillableElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1521:2: iv_ruleFillableElement= ruleFillableElement EOF
            {
             newCompositeNode(grammarAccess.getFillableElementRule()); 
            pushFollow(FOLLOW_ruleFillableElement_in_entryRuleFillableElement3492);
            iv_ruleFillableElement=ruleFillableElement();

            state._fsp--;

             current =iv_ruleFillableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFillableElement3502); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1528:1: ruleFillableElement returns [EObject current=null] : this_TextField_0= ruleTextField ;
    public final EObject ruleFillableElement() throws RecognitionException {
        EObject current = null;

        EObject this_TextField_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1531:28: (this_TextField_0= ruleTextField )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1533:5: this_TextField_0= ruleTextField
            {
             
                    newCompositeNode(grammarAccess.getFillableElementAccess().getTextFieldParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTextField_in_ruleFillableElement3548);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1549:1: entryRuleCheckableElement returns [EObject current=null] : iv_ruleCheckableElement= ruleCheckableElement EOF ;
    public final EObject entryRuleCheckableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckableElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1550:2: (iv_ruleCheckableElement= ruleCheckableElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1551:2: iv_ruleCheckableElement= ruleCheckableElement EOF
            {
             newCompositeNode(grammarAccess.getCheckableElementRule()); 
            pushFollow(FOLLOW_ruleCheckableElement_in_entryRuleCheckableElement3582);
            iv_ruleCheckableElement=ruleCheckableElement();

            state._fsp--;

             current =iv_ruleCheckableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckableElement3592); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1558:1: ruleCheckableElement returns [EObject current=null] : this_Checkbox_0= ruleCheckbox ;
    public final EObject ruleCheckableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Checkbox_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1561:28: (this_Checkbox_0= ruleCheckbox )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1563:5: this_Checkbox_0= ruleCheckbox
            {
             
                    newCompositeNode(grammarAccess.getCheckableElementAccess().getCheckboxParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleCheckbox_in_ruleCheckableElement3638);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1579:1: entryRuleCheckbox returns [EObject current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final EObject entryRuleCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckbox = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1580:2: (iv_ruleCheckbox= ruleCheckbox EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1581:2: iv_ruleCheckbox= ruleCheckbox EOF
            {
             newCompositeNode(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_ruleCheckbox_in_entryRuleCheckbox3672);
            iv_ruleCheckbox=ruleCheckbox();

            state._fsp--;

             current =iv_ruleCheckbox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckbox3682); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1588:1: ruleCheckbox returns [EObject current=null] : (otherlv_0= 'checkbox ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) ) ;
    public final EObject ruleCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1591:28: ( (otherlv_0= 'checkbox ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1592:1: (otherlv_0= 'checkbox ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1592:1: (otherlv_0= 'checkbox ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1592:3: otherlv_0= 'checkbox ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleCheckbox3719); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1596:1: ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1597:1: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1597:1: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1598:1: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1598:1: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1599:3: lv_value_1_1= ruleStringValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckboxAccess().getValueStringValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringValue_in_ruleCheckbox3742);
                    lv_value_1_1=ruleStringValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckboxRule());
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1614:8: lv_value_1_2= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckboxAccess().getValueVariableParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleCheckbox3761);
                    lv_value_1_2=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckboxRule());
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1640:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1641:2: (iv_ruleLink= ruleLink EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1642:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink3800);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink3810); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1649:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1652:28: ( (otherlv_0= 'link ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1653:1: (otherlv_0= 'link ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1653:1: (otherlv_0= 'link ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1653:3: otherlv_0= 'link ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleLink3847); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1657:1: ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1658:1: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1658:1: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1659:1: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1659:1: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1660:3: lv_value_1_1= ruleStringValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getValueStringValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringValue_in_ruleLink3870);
                    lv_value_1_1=ruleStringValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLinkRule());
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1675:8: lv_value_1_2= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getValueVariableParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleLink3889);
                    lv_value_1_2=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLinkRule());
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1701:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1702:2: (iv_ruleButton= ruleButton EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1703:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton3928);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton3938); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1710:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1713:28: ( (otherlv_0= 'button ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1714:1: (otherlv_0= 'button ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1714:1: (otherlv_0= 'button ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1714:3: otherlv_0= 'button ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleButton3975); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1718:1: ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1719:1: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1719:1: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1720:1: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1720:1: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1721:3: lv_value_1_1= ruleStringValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonAccess().getValueStringValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringValue_in_ruleButton3998);
                    lv_value_1_1=ruleStringValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getButtonRule());
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1736:8: lv_value_1_2= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonAccess().getValueVariableParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleButton4017);
                    lv_value_1_2=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getButtonRule());
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1762:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1763:2: (iv_ruleImage= ruleImage EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1764:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage4056);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage4066); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1771:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1774:28: ( (otherlv_0= 'image ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1775:1: (otherlv_0= 'image ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1775:1: (otherlv_0= 'image ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1775:3: otherlv_0= 'image ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleImage4103); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1779:1: ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1780:1: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1780:1: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1781:1: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1781:1: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1782:3: lv_value_1_1= ruleStringValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getValueStringValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringValue_in_ruleImage4126);
                    lv_value_1_1=ruleStringValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRule());
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1797:8: lv_value_1_2= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getValueVariableParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleImage4145);
                    lv_value_1_2=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRule());
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1823:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1824:2: (iv_ruleTextField= ruleTextField EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1825:2: iv_ruleTextField= ruleTextField EOF
            {
             newCompositeNode(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_ruleTextField_in_entryRuleTextField4184);
            iv_ruleTextField=ruleTextField();

            state._fsp--;

             current =iv_ruleTextField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextField4194); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1832:1: ruleTextField returns [EObject current=null] : (otherlv_0= 'textField ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1835:28: ( (otherlv_0= 'textField ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1836:1: (otherlv_0= 'textField ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1836:1: (otherlv_0= 'textField ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1836:3: otherlv_0= 'textField ' ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleTextField4231); 

                	newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1840:1: ( ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1841:1: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1841:1: ( (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1842:1: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1842:1: (lv_value_1_1= ruleStringValue | lv_value_1_2= ruleVariable )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1843:3: lv_value_1_1= ruleStringValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextFieldAccess().getValueStringValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringValue_in_ruleTextField4254);
                    lv_value_1_1=ruleStringValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextFieldRule());
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1858:8: lv_value_1_2= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextFieldAccess().getValueVariableParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleTextField4273);
                    lv_value_1_2=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextFieldRule());
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


    // $ANTLR start "entryRuleSelect"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1884:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1885:2: (iv_ruleSelect= ruleSelect EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1886:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect4312);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect4322); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1893:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select(' ( (lv_value_1_0= ruleTypeElement ) ) otherlv_2= ')' ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1896:28: ( (otherlv_0= 'select(' ( (lv_value_1_0= ruleTypeElement ) ) otherlv_2= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1897:1: (otherlv_0= 'select(' ( (lv_value_1_0= ruleTypeElement ) ) otherlv_2= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1897:1: (otherlv_0= 'select(' ( (lv_value_1_0= ruleTypeElement ) ) otherlv_2= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1897:3: otherlv_0= 'select(' ( (lv_value_1_0= ruleTypeElement ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleSelect4359); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1901:1: ( (lv_value_1_0= ruleTypeElement ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1902:1: (lv_value_1_0= ruleTypeElement )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1902:1: (lv_value_1_0= ruleTypeElement )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1903:3: lv_value_1_0= ruleTypeElement
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getValueTypeElementEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeElement_in_ruleSelect4380);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleSelect4392); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1931:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1932:2: (iv_ruleClick= ruleClick EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1933:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_ruleClick_in_entryRuleClick4428);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClick4438); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1940:1: ruleClick returns [EObject current=null] : (otherlv_0= 'click(' ( ( (lv_element_1_1= ruleClickableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ');' ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_1_1 = null;

        EObject lv_element_1_2 = null;

        EObject lv_element_1_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1943:28: ( (otherlv_0= 'click(' ( ( (lv_element_1_1= ruleClickableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1944:1: (otherlv_0= 'click(' ( ( (lv_element_1_1= ruleClickableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1944:1: (otherlv_0= 'click(' ( ( (lv_element_1_1= ruleClickableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1944:3: otherlv_0= 'click(' ( ( (lv_element_1_1= ruleClickableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ');'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleClick4475); 

                	newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1948:1: ( ( (lv_element_1_1= ruleClickableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1949:1: ( (lv_element_1_1= ruleClickableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1949:1: ( (lv_element_1_1= ruleClickableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1950:1: (lv_element_1_1= ruleClickableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1950:1: (lv_element_1_1= ruleClickableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 42:
            case 43:
            case 44:
                {
                alt25=1;
                }
                break;
            case 46:
                {
                alt25=2;
                }
                break;
            case RULE_ID:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1951:3: lv_element_1_1= ruleClickableElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getClickAccess().getElementClickableElementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClickableElement_in_ruleClick4498);
                    lv_element_1_1=ruleClickableElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClickRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_1, 
                            		"ClickableElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1966:8: lv_element_1_2= ruleSelect
                    {
                     
                    	        newCompositeNode(grammarAccess.getClickAccess().getElementSelectParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleSelect_in_ruleClick4517);
                    lv_element_1_2=ruleSelect();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClickRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_2, 
                            		"Select");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1981:8: lv_element_1_3= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getClickAccess().getElementVariableParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleClick4536);
                    lv_element_1_3=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClickRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_3, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleClick4551); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2011:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2012:2: (iv_ruleCheck= ruleCheck EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2013:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck4587);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck4597); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2020:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'check(' ( ( (lv_element_1_1= ruleCheckableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ');' ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_1_1 = null;

        EObject lv_element_1_2 = null;

        EObject lv_element_1_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2023:28: ( (otherlv_0= 'check(' ( ( (lv_element_1_1= ruleCheckableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2024:1: (otherlv_0= 'check(' ( ( (lv_element_1_1= ruleCheckableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2024:1: (otherlv_0= 'check(' ( ( (lv_element_1_1= ruleCheckableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2024:3: otherlv_0= 'check(' ( ( (lv_element_1_1= ruleCheckableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ');'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleCheck4634); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2028:1: ( ( (lv_element_1_1= ruleCheckableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2029:1: ( (lv_element_1_1= ruleCheckableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2029:1: ( (lv_element_1_1= ruleCheckableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2030:1: (lv_element_1_1= ruleCheckableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2030:1: (lv_element_1_1= ruleCheckableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt26=1;
                }
                break;
            case 46:
                {
                alt26=2;
                }
                break;
            case RULE_ID:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2031:3: lv_element_1_1= ruleCheckableElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckAccess().getElementCheckableElementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleCheck4657);
                    lv_element_1_1=ruleCheckableElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_1, 
                            		"CheckableElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2046:8: lv_element_1_2= ruleSelect
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckAccess().getElementSelectParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleSelect_in_ruleCheck4676);
                    lv_element_1_2=ruleSelect();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_2, 
                            		"Select");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2061:8: lv_element_1_3= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckAccess().getElementVariableParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleCheck4695);
                    lv_element_1_3=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_3, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleCheck4710); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2091:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2092:2: (iv_ruleFill= ruleFill EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2093:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_ruleFill_in_entryRuleFill4746);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFill4756); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2100:1: ruleFill returns [EObject current=null] : (otherlv_0= 'fill(' ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ', value=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ');' ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        EObject lv_element_1_1 = null;

        EObject lv_element_1_2 = null;

        EObject lv_element_1_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2103:28: ( (otherlv_0= 'fill(' ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ', value=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2104:1: (otherlv_0= 'fill(' ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ', value=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2104:1: (otherlv_0= 'fill(' ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ', value=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2104:3: otherlv_0= 'fill(' ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ', value=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ');'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleFill4793); 

                	newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2108:1: ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2109:1: ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2109:1: ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2110:1: (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2110:1: (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt27=1;
                }
                break;
            case 46:
                {
                alt27=2;
                }
                break;
            case RULE_ID:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2111:3: lv_element_1_1= ruleFillableElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getFillAccess().getElementFillableElementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleFill4816);
                    lv_element_1_1=ruleFillableElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFillRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_1, 
                            		"FillableElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2126:8: lv_element_1_2= ruleSelect
                    {
                     
                    	        newCompositeNode(grammarAccess.getFillAccess().getElementSelectParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleSelect_in_ruleFill4835);
                    lv_element_1_2=ruleSelect();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFillRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_2, 
                            		"Select");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2141:8: lv_element_1_3= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getFillAccess().getElementVariableParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleFill4854);
                    lv_element_1_3=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFillRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_3, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleFill4869); 

                	newLeafNode(otherlv_2, grammarAccess.getFillAccess().getValueKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2163:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2164:1: (lv_value_3_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2164:1: (lv_value_3_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2165:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFill4886); 

            			newLeafNode(lv_value_3_0, grammarAccess.getFillAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFillRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleFill4903); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2193:1: entryRuleClear returns [EObject current=null] : iv_ruleClear= ruleClear EOF ;
    public final EObject entryRuleClear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClear = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2194:2: (iv_ruleClear= ruleClear EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2195:2: iv_ruleClear= ruleClear EOF
            {
             newCompositeNode(grammarAccess.getClearRule()); 
            pushFollow(FOLLOW_ruleClear_in_entryRuleClear4939);
            iv_ruleClear=ruleClear();

            state._fsp--;

             current =iv_ruleClear; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClear4949); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2202:1: ruleClear returns [EObject current=null] : (otherlv_0= 'clear(' ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) ) ) otherlv_2= ');' ) ;
    public final EObject ruleClear() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_1_1 = null;

        EObject lv_element_1_2 = null;

        EObject lv_element_1_3 = null;

        EObject lv_element_1_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2205:28: ( (otherlv_0= 'clear(' ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) ) ) otherlv_2= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2206:1: (otherlv_0= 'clear(' ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) ) ) otherlv_2= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2206:1: (otherlv_0= 'clear(' ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) ) ) otherlv_2= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2206:3: otherlv_0= 'clear(' ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) ) ) otherlv_2= ');'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleClear4986); 

                	newLeafNode(otherlv_0, grammarAccess.getClearAccess().getClearKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2210:1: ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2211:1: ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2211:1: ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2212:1: (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2212:1: (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable )
            int alt28=4;
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
            case 46:
                {
                alt28=3;
                }
                break;
            case RULE_ID:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2213:3: lv_element_1_1= ruleFillableElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getClearAccess().getElementFillableElementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleClear5009);
                    lv_element_1_1=ruleFillableElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClearRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_1, 
                            		"FillableElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2228:8: lv_element_1_2= ruleCheckableElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getClearAccess().getElementCheckableElementParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleClear5028);
                    lv_element_1_2=ruleCheckableElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClearRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_2, 
                            		"CheckableElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2243:8: lv_element_1_3= ruleSelect
                    {
                     
                    	        newCompositeNode(grammarAccess.getClearAccess().getElementSelectParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleSelect_in_ruleClear5047);
                    lv_element_1_3=ruleSelect();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClearRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_3, 
                            		"Select");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2258:8: lv_element_1_4= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getClearAccess().getElementVariableParserRuleCall_1_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleClear5066);
                    lv_element_1_4=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClearRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_4, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleClear5081); 

                	newLeafNode(otherlv_2, grammarAccess.getClearAccess().getRightParenthesisSemicolonKeyword_2());
                

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2288:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2289:2: (iv_ruleVerify= ruleVerify EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2290:2: iv_ruleVerify= ruleVerify EOF
            {
             newCompositeNode(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_ruleVerify_in_entryRuleVerify5117);
            iv_ruleVerify=ruleVerify();

            state._fsp--;

             current =iv_ruleVerify; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerify5127); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2297:1: ruleVerify returns [EObject current=null] : (otherlv_0= 'verify(' ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) ) ) otherlv_2= ', value=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ');' ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        EObject lv_element_1_1 = null;

        EObject lv_element_1_2 = null;

        EObject lv_element_1_3 = null;

        EObject lv_element_1_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2300:28: ( (otherlv_0= 'verify(' ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) ) ) otherlv_2= ', value=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2301:1: (otherlv_0= 'verify(' ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) ) ) otherlv_2= ', value=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2301:1: (otherlv_0= 'verify(' ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) ) ) otherlv_2= ', value=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2301:3: otherlv_0= 'verify(' ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) ) ) otherlv_2= ', value=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ');'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleVerify5164); 

                	newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2305:1: ( ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2306:1: ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2306:1: ( (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2307:1: (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2307:1: (lv_element_1_1= ruleFillableElement | lv_element_1_2= ruleCheckableElement | lv_element_1_3= ruleSelect | lv_element_1_4= ruleVariable )
            int alt29=4;
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
            case 46:
                {
                alt29=3;
                }
                break;
            case RULE_ID:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2308:3: lv_element_1_1= ruleFillableElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerifyAccess().getElementFillableElementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleVerify5187);
                    lv_element_1_1=ruleFillableElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerifyRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_1, 
                            		"FillableElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2323:8: lv_element_1_2= ruleCheckableElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerifyAccess().getElementCheckableElementParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleVerify5206);
                    lv_element_1_2=ruleCheckableElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerifyRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_2, 
                            		"CheckableElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2338:8: lv_element_1_3= ruleSelect
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerifyAccess().getElementSelectParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleSelect_in_ruleVerify5225);
                    lv_element_1_3=ruleSelect();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerifyRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_3, 
                            		"Select");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2353:8: lv_element_1_4= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerifyAccess().getElementVariableParserRuleCall_1_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleVerify5244);
                    lv_element_1_4=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerifyRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_4, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleVerify5259); 

                	newLeafNode(otherlv_2, grammarAccess.getVerifyAccess().getValueKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2375:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2376:1: (lv_value_3_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2376:1: (lv_value_3_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2377:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVerify5276); 

            			newLeafNode(lv_value_3_0, grammarAccess.getVerifyAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVerifyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleVerify5293); 

                	newLeafNode(otherlv_4, grammarAccess.getVerifyAccess().getRightParenthesisSemicolonKeyword_4());
                

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2405:1: entryRuleExist returns [EObject current=null] : iv_ruleExist= ruleExist EOF ;
    public final EObject entryRuleExist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExist = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2406:2: (iv_ruleExist= ruleExist EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2407:2: iv_ruleExist= ruleExist EOF
            {
             newCompositeNode(grammarAccess.getExistRule()); 
            pushFollow(FOLLOW_ruleExist_in_entryRuleExist5329);
            iv_ruleExist=ruleExist();

            state._fsp--;

             current =iv_ruleExist; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExist5339); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2414:1: ruleExist returns [EObject current=null] : (otherlv_0= 'exist(' ( ( (lv_element_1_1= ruleElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ');' ) ;
    public final EObject ruleExist() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_1_1 = null;

        EObject lv_element_1_2 = null;

        EObject lv_element_1_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2417:28: ( (otherlv_0= 'exist(' ( ( (lv_element_1_1= ruleElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2418:1: (otherlv_0= 'exist(' ( ( (lv_element_1_1= ruleElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2418:1: (otherlv_0= 'exist(' ( ( (lv_element_1_1= ruleElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2418:3: otherlv_0= 'exist(' ( ( (lv_element_1_1= ruleElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) ) otherlv_2= ');'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleExist5376); 

                	newLeafNode(otherlv_0, grammarAccess.getExistAccess().getExistKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2422:1: ( ( (lv_element_1_1= ruleElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2423:1: ( (lv_element_1_1= ruleElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2423:1: ( (lv_element_1_1= ruleElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2424:1: (lv_element_1_1= ruleElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2424:1: (lv_element_1_1= ruleElement | lv_element_1_2= ruleSelect | lv_element_1_3= ruleVariable )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt30=1;
                }
                break;
            case 46:
                {
                alt30=2;
                }
                break;
            case RULE_ID:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2425:3: lv_element_1_1= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getExistAccess().getElementElementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElement_in_ruleExist5399);
                    lv_element_1_1=ruleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExistRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_1, 
                            		"Element");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2440:8: lv_element_1_2= ruleSelect
                    {
                     
                    	        newCompositeNode(grammarAccess.getExistAccess().getElementSelectParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleSelect_in_ruleExist5418);
                    lv_element_1_2=ruleSelect();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExistRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_2, 
                            		"Select");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2455:8: lv_element_1_3= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getExistAccess().getElementVariableParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleExist5437);
                    lv_element_1_3=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExistRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_3, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleExist5452); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2485:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2486:2: (iv_ruleGoTo= ruleGoTo EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2487:2: iv_ruleGoTo= ruleGoTo EOF
            {
             newCompositeNode(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_ruleGoTo_in_entryRuleGoTo5488);
            iv_ruleGoTo=ruleGoTo();

            state._fsp--;

             current =iv_ruleGoTo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoTo5498); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2494:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ');' ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2497:28: ( (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2498:1: (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2498:1: (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2498:3: otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ');'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleGoTo5535); 

                	newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGoToKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2502:1: ( (lv_url_1_0= RULE_URL ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2503:1: (lv_url_1_0= RULE_URL )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2503:1: (lv_url_1_0= RULE_URL )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2504:3: lv_url_1_0= RULE_URL
            {
            lv_url_1_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleGoTo5552); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleGoTo5569); 

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


    // $ANTLR start "entryRuleStringValue"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2532:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2533:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2534:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue5605);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue5615); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2541:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2544:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2545:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2545:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2546:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2546:1: (lv_value_0_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2547:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue5656); 

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


    // $ANTLR start "ruleOpenBrowser"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2571:1: ruleOpenBrowser returns [Enumerator current=null] : ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) | (enumLiteral_2= 'HtmlUnitDriver' ) ) ;
    public final Enumerator ruleOpenBrowser() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2573:28: ( ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) | (enumLiteral_2= 'HtmlUnitDriver' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2574:1: ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) | (enumLiteral_2= 'HtmlUnitDriver' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2574:1: ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) | (enumLiteral_2= 'HtmlUnitDriver' ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt31=1;
                }
                break;
            case 56:
                {
                alt31=2;
                }
                break;
            case 57:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2574:2: (enumLiteral_0= 'Chrome' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2574:2: (enumLiteral_0= 'Chrome' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2574:4: enumLiteral_0= 'Chrome'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleOpenBrowser5710); 

                            current = grammarAccess.getOpenBrowserAccess().getChromeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOpenBrowserAccess().getChromeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2580:6: (enumLiteral_1= 'Firefox' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2580:6: (enumLiteral_1= 'Firefox' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2580:8: enumLiteral_1= 'Firefox'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_ruleOpenBrowser5727); 

                            current = grammarAccess.getOpenBrowserAccess().getFirefoxEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOpenBrowserAccess().getFirefoxEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2586:6: (enumLiteral_2= 'HtmlUnitDriver' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2586:6: (enumLiteral_2= 'HtmlUnitDriver' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2586:8: enumLiteral_2= 'HtmlUnitDriver'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_57_in_ruleOpenBrowser5744); 

                            current = grammarAccess.getOpenBrowserAccess().getHtmlUnitDriverEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOpenBrowserAccess().getHtmlUnitDriverEnumLiteralDeclaration_2()); 
                        

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


    // $ANTLR start "ruleTypeElement"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2596:1: ruleTypeElement returns [Enumerator current=null] : ( (enumLiteral_0= 'Checkbox' ) | (enumLiteral_1= 'Link' ) | (enumLiteral_2= 'Button' ) | (enumLiteral_3= 'Image' ) | (enumLiteral_4= 'TextField' ) ) ;
    public final Enumerator ruleTypeElement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2598:28: ( ( (enumLiteral_0= 'Checkbox' ) | (enumLiteral_1= 'Link' ) | (enumLiteral_2= 'Button' ) | (enumLiteral_3= 'Image' ) | (enumLiteral_4= 'TextField' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2599:1: ( (enumLiteral_0= 'Checkbox' ) | (enumLiteral_1= 'Link' ) | (enumLiteral_2= 'Button' ) | (enumLiteral_3= 'Image' ) | (enumLiteral_4= 'TextField' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2599:1: ( (enumLiteral_0= 'Checkbox' ) | (enumLiteral_1= 'Link' ) | (enumLiteral_2= 'Button' ) | (enumLiteral_3= 'Image' ) | (enumLiteral_4= 'TextField' ) )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt32=1;
                }
                break;
            case 59:
                {
                alt32=2;
                }
                break;
            case 60:
                {
                alt32=3;
                }
                break;
            case 61:
                {
                alt32=4;
                }
                break;
            case 62:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2599:2: (enumLiteral_0= 'Checkbox' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2599:2: (enumLiteral_0= 'Checkbox' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2599:4: enumLiteral_0= 'Checkbox'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleTypeElement5789); 

                            current = grammarAccess.getTypeElementAccess().getCheckboxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeElementAccess().getCheckboxEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2605:6: (enumLiteral_1= 'Link' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2605:6: (enumLiteral_1= 'Link' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2605:8: enumLiteral_1= 'Link'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleTypeElement5806); 

                            current = grammarAccess.getTypeElementAccess().getLinkEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeElementAccess().getLinkEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2611:6: (enumLiteral_2= 'Button' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2611:6: (enumLiteral_2= 'Button' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2611:8: enumLiteral_2= 'Button'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_60_in_ruleTypeElement5823); 

                            current = grammarAccess.getTypeElementAccess().getButtonEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeElementAccess().getButtonEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2617:6: (enumLiteral_3= 'Image' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2617:6: (enumLiteral_3= 'Image' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2617:8: enumLiteral_3= 'Image'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_61_in_ruleTypeElement5840); 

                            current = grammarAccess.getTypeElementAccess().getImageEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeElementAccess().getImageEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2623:6: (enumLiteral_4= 'TextField' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2623:6: (enumLiteral_4= 'TextField' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2623:8: enumLiteral_4= 'TextField'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_62_in_ruleTypeElement5857); 

                            current = grammarAccess.getTypeElementAccess().getTextFieldEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTypeElementAccess().getTextFieldEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleTypeElement"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleProgram122 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_ruleOpenBrowser_in_ruleProgram143 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProgram155 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_ruleSubroutine_in_ruleProgram176 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_ruleMain_in_ruleProgram198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_entryRuleSubroutine234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutine244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSubroutine281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHead_in_ruleSubroutine302 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleBody_in_ruleSubroutine323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleHead416 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleHead428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleHead457 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleHead469 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleHead490 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleHead503 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleHead524 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleHead538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionReference_in_entryRuleFunctionReference575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionReference585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionReference629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionReference_in_ruleFunctionCall810 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionCall822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionReference_in_ruleFunctionCall851 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionCall863 = new BitSet(new long[]{0x003001E000000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall884 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionCall897 = new BitSet(new long[]{0x003001E000000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall918 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionCall932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_entryRuleFunctionName969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionName979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionName1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain1060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMain1107 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleBody_in_ruleMain1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody1164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBody1211 = new BitSet(new long[]{0x004B800904000010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBody1232 = new BitSet(new long[]{0x004B800906000010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBody1253 = new BitSet(new long[]{0x004B800906000010L});
    public static final BitSet FOLLOW_25_in_ruleBody1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction1302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleInstruction1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleInstruction1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleInstruction1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionInstruction_in_ruleInstruction1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignation_in_ruleInstruction1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleInstruction1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCondition1576 = new BitSet(new long[]{0x0000000018100000L});
    public static final BitSet FOLLOW_27_in_ruleCondition1589 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_28_in_ruleCondition1607 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCondition1621 = new BitSet(new long[]{0x003001E000000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition1642 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCondition1654 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCondition1666 = new BitSet(new long[]{0x004B800904000010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleCondition1687 = new BitSet(new long[]{0x004B8009C4000010L});
    public static final BitSet FOLLOW_30_in_ruleCondition1701 = new BitSet(new long[]{0x004B800904000010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleCondition1722 = new BitSet(new long[]{0x004B800984000010L});
    public static final BitSet FOLLOW_31_in_ruleCondition1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile1773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleWhile1820 = new BitSet(new long[]{0x003001E000000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhile1841 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleWhile1853 = new BitSet(new long[]{0x004B800904000010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleWhile1874 = new BitSet(new long[]{0x004B800D04000010L});
    public static final BitSet FOLLOW_34_in_ruleWhile1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionInstruction_in_entryRuleActionInstruction1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionInstruction1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_ruleActionInstruction1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleActionInstruction2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_ruleActionInstruction2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClear_in_ruleActionInstruction2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_ruleActionInstruction2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName2123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariableName2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration2214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDeclaration2261 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleDeclaration2282 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleDeclaration2294 = new BitSet(new long[]{0x00303FE000000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDeclaration2317 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleElement_in_ruleDeclaration2336 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeclaration2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignation_in_entryRuleAssignation2387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignation2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAssignation2443 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleAssignation2455 = new BitSet(new long[]{0x003001E000000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignation2476 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssignation2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleExpression2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExpression2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleExpression2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEpression_in_ruleExpression2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinarieExpression_in_ruleExpression2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEpression_in_entryRuleNotEpression2724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEpression2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleNotEpression2771 = new BitSet(new long[]{0x003001E000000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleNotEpression2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinarieExpression_in_entryRuleBinarieExpression2828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinarieExpression2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBinarieExpression2876 = new BitSet(new long[]{0x003001E000000030L});
    public static final BitSet FOLLOW_39_in_ruleBinarieExpression2894 = new BitSet(new long[]{0x003001E000000030L});
    public static final BitSet FOLLOW_40_in_ruleBinarieExpression2912 = new BitSet(new long[]{0x003001E000000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBinarieExpression2934 = new BitSet(new long[]{0x003001E000000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBinarieExpression2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleVariable3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_in_entryRuleActionExpression3081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionExpression3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_ruleActionExpression3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExist_in_ruleActionExpression3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement3200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickableElement_in_ruleElement3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleElement3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleElement3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickableElement_in_entryRuleClickableElement3346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClickableElement3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleClickableElement3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleClickableElement3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleClickableElement3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFillableElement_in_entryRuleFillableElement3492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFillableElement3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_ruleFillableElement3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_entryRuleCheckableElement3582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckableElement3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_ruleCheckableElement3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_entryRuleCheckbox3672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckbox3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCheckbox3719 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleCheckbox3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCheckbox3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink3800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLink3847 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleLink3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLink3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton3928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleButton3975 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleButton3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleButton4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage4056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleImage4103 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleImage4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleImage4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField4184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextField4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTextField4231 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleTextField4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTextField4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect4312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSelect4359 = new BitSet(new long[]{0x7C00000000000000L});
    public static final BitSet FOLLOW_ruleTypeElement_in_ruleSelect4380 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSelect4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_entryRuleClick4428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClick4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleClick4475 = new BitSet(new long[]{0x00005C0000000010L});
    public static final BitSet FOLLOW_ruleClickableElement_in_ruleClick4498 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleClick4517 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleClick4536 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleClick4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_entryRuleCheck4587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheck4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleCheck4634 = new BitSet(new long[]{0x00307FE000000030L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleCheck4657 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleCheck4676 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCheck4695 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCheck4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_entryRuleFill4746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFill4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFill4793 = new BitSet(new long[]{0x0000600000000010L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleFill4816 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleFill4835 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleFill4854 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleFill4869 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFill4886 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFill4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClear_in_entryRuleClear4939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClear4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleClear4986 = new BitSet(new long[]{0x00307FE000000030L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleClear5009 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleClear5028 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleClear5047 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleClear5066 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleClear5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_entryRuleVerify5117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerify5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleVerify5164 = new BitSet(new long[]{0x00307FE000000030L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleVerify5187 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleVerify5206 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleVerify5225 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVerify5244 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleVerify5259 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVerify5276 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleVerify5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExist_in_entryRuleExist5329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExist5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExist5376 = new BitSet(new long[]{0x00307FE000000030L});
    public static final BitSet FOLLOW_ruleElement_in_ruleExist5399 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleExist5418 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExist5437 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExist5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_entryRuleGoTo5488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoTo5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleGoTo5535 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleGoTo5552 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleGoTo5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue5605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOpenBrowser5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOpenBrowser5727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOpenBrowser5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTypeElement5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTypeElement5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTypeElement5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleTypeElement5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTypeElement5857 = new BitSet(new long[]{0x0000000000000002L});

}