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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_URL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sub'", "'()'", "'(var'", "', var'", "')'", "'main'", "'; '", "';'", "'if'", "'all'", "'any'", "'then'", "'else'", "'endif'", "'toto'", "'var'", "'='", "'=='", "'>'", "'<'", "'!'", "'bool'", "'string'", "'int'", "'checkbox'", "'link'", "'button'", "'image'", "'textField'", "'click('", "'fill('", "', value='", "'clear('", "'verify('", "'exist('", "'url='"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:133:1: ruleSubroutine returns [EObject current=null] : (otherlv_0= 'sub' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) ) ;
    public final EObject ruleSubroutine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_head_1_0 = null;

        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:136:28: ( (otherlv_0= 'sub' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:137:1: (otherlv_0= 'sub' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:137:1: (otherlv_0= 'sub' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:137:3: otherlv_0= 'sub' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) )
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:194:1: ruleHead returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) ) ;
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
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:197:28: ( ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:198:1: ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:198:1: ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:221:6: ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:221:6: ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:221:7: ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')'
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

                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:261:2: (otherlv_5= ', var' ( (lv_varId_6_0= ruleVariableName ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:261:4: otherlv_5= ', var' ( (lv_varId_6_0= ruleVariableName ) )
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


    // $ANTLR start "entryRuleFunctionName"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:365:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:366:2: (iv_ruleFunctionName= ruleFunctionName EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:367:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_ruleFunctionName_in_entryRuleFunctionName710);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionName720); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:374:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:377:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:378:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:378:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:379:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:379:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:380:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionName761); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:404:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:405:2: (iv_ruleMain= ruleMain EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:406:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain801);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain811); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:413:1: ruleMain returns [EObject current=null] : (otherlv_0= 'main' this_Body_1= ruleBody ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Body_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:416:28: ( (otherlv_0= 'main' this_Body_1= ruleBody ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:417:1: (otherlv_0= 'main' this_Body_1= ruleBody )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:417:1: (otherlv_0= 'main' this_Body_1= ruleBody )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:417:3: otherlv_0= 'main' this_Body_1= ruleBody
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleMain848); 

                	newLeafNode(otherlv_0, grammarAccess.getMainAccess().getMainKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getMainAccess().getBodyParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleBody_in_ruleMain870);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:438:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:439:2: (iv_ruleBody= ruleBody EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:440:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody905);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody915); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:447:1: ruleBody returns [EObject current=null] : ( ( (lv_instructions_0_0= ruleInstruction ) ) (otherlv_1= '; ' ( (lv_instructions_2_0= ruleInstruction ) ) )* otherlv_3= ';' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_instructions_0_0 = null;

        EObject lv_instructions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:450:28: ( ( ( (lv_instructions_0_0= ruleInstruction ) ) (otherlv_1= '; ' ( (lv_instructions_2_0= ruleInstruction ) ) )* otherlv_3= ';' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:451:1: ( ( (lv_instructions_0_0= ruleInstruction ) ) (otherlv_1= '; ' ( (lv_instructions_2_0= ruleInstruction ) ) )* otherlv_3= ';' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:451:1: ( ( (lv_instructions_0_0= ruleInstruction ) ) (otherlv_1= '; ' ( (lv_instructions_2_0= ruleInstruction ) ) )* otherlv_3= ';' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:451:2: ( (lv_instructions_0_0= ruleInstruction ) ) (otherlv_1= '; ' ( (lv_instructions_2_0= ruleInstruction ) ) )* otherlv_3= ';'
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:451:2: ( (lv_instructions_0_0= ruleInstruction ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:452:1: (lv_instructions_0_0= ruleInstruction )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:452:1: (lv_instructions_0_0= ruleInstruction )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:453:3: lv_instructions_0_0= ruleInstruction
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getInstructionsInstructionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleInstruction_in_ruleBody961);
            lv_instructions_0_0=ruleInstruction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	        }
                   		add(
                   			current, 
                   			"instructions",
                    		lv_instructions_0_0, 
                    		"Instruction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:469:2: (otherlv_1= '; ' ( (lv_instructions_2_0= ruleInstruction ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:469:4: otherlv_1= '; ' ( (lv_instructions_2_0= ruleInstruction ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBody974); 

            	        	newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getSemicolonSpaceKeyword_1_0());
            	        
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:473:1: ( (lv_instructions_2_0= ruleInstruction ) )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:474:1: (lv_instructions_2_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:474:1: (lv_instructions_2_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:475:3: lv_instructions_2_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBodyAccess().getInstructionsInstructionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleBody995);
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


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBody1009); 

                	newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getSemicolonKeyword_2());
                

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:503:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:504:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:505:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction1045);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction1055); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:512:1: ruleInstruction returns [EObject current=null] : ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_cond_1_0= ruleCondition ) ) | ( (lv_loop_2_0= ruleLoop ) ) | ( (lv_act_3_0= ruleActionInstruction ) ) | ( (lv_ass_4_0= ruleAssignation ) ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject lv_dec_0_0 = null;

        EObject lv_cond_1_0 = null;

        AntlrDatatypeRuleToken lv_loop_2_0 = null;

        EObject lv_act_3_0 = null;

        EObject lv_ass_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:515:28: ( ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_cond_1_0= ruleCondition ) ) | ( (lv_loop_2_0= ruleLoop ) ) | ( (lv_act_3_0= ruleActionInstruction ) ) | ( (lv_ass_4_0= ruleAssignation ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:516:1: ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_cond_1_0= ruleCondition ) ) | ( (lv_loop_2_0= ruleLoop ) ) | ( (lv_act_3_0= ruleActionInstruction ) ) | ( (lv_ass_4_0= ruleAssignation ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:516:1: ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_cond_1_0= ruleCondition ) ) | ( (lv_loop_2_0= ruleLoop ) ) | ( (lv_act_3_0= ruleActionInstruction ) ) | ( (lv_ass_4_0= ruleAssignation ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 41:
            case 42:
            case 44:
            case 47:
                {
                alt5=4;
                }
                break;
            case RULE_ID:
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:516:2: ( (lv_dec_0_0= ruleDeclaration ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:516:2: ( (lv_dec_0_0= ruleDeclaration ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:517:1: (lv_dec_0_0= ruleDeclaration )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:517:1: (lv_dec_0_0= ruleDeclaration )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:518:3: lv_dec_0_0= ruleDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getDecDeclarationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleInstruction1101);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:535:6: ( (lv_cond_1_0= ruleCondition ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:535:6: ( (lv_cond_1_0= ruleCondition ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:536:1: (lv_cond_1_0= ruleCondition )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:536:1: (lv_cond_1_0= ruleCondition )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:537:3: lv_cond_1_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getCondConditionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleInstruction1128);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:554:6: ( (lv_loop_2_0= ruleLoop ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:554:6: ( (lv_loop_2_0= ruleLoop ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:555:1: (lv_loop_2_0= ruleLoop )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:555:1: (lv_loop_2_0= ruleLoop )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:556:3: lv_loop_2_0= ruleLoop
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getLoopLoopParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLoop_in_ruleInstruction1155);
                    lv_loop_2_0=ruleLoop();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"loop",
                            		lv_loop_2_0, 
                            		"Loop");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:573:6: ( (lv_act_3_0= ruleActionInstruction ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:573:6: ( (lv_act_3_0= ruleActionInstruction ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:574:1: (lv_act_3_0= ruleActionInstruction )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:574:1: (lv_act_3_0= ruleActionInstruction )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:575:3: lv_act_3_0= ruleActionInstruction
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getActActionInstructionParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionInstruction_in_ruleInstruction1182);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:592:6: ( (lv_ass_4_0= ruleAssignation ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:592:6: ( (lv_ass_4_0= ruleAssignation ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:593:1: (lv_ass_4_0= ruleAssignation )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:593:1: (lv_ass_4_0= ruleAssignation )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:594:3: lv_ass_4_0= ruleAssignation
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getAssAssignationParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssignation_in_ruleInstruction1209);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:618:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:619:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:620:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1245);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1255); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:627:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'if' (otherlv_1= 'all' | otherlv_2= 'any' )? ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= 'then' ( (lv_ins_5_0= ruleInstruction ) )+ otherlv_6= 'else' ( (lv_ins2_7_0= ruleInstruction ) )+ otherlv_8= 'endif' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_exp_3_0 = null;

        EObject lv_ins_5_0 = null;

        EObject lv_ins2_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:630:28: ( (otherlv_0= 'if' (otherlv_1= 'all' | otherlv_2= 'any' )? ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= 'then' ( (lv_ins_5_0= ruleInstruction ) )+ otherlv_6= 'else' ( (lv_ins2_7_0= ruleInstruction ) )+ otherlv_8= 'endif' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:631:1: (otherlv_0= 'if' (otherlv_1= 'all' | otherlv_2= 'any' )? ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= 'then' ( (lv_ins_5_0= ruleInstruction ) )+ otherlv_6= 'else' ( (lv_ins2_7_0= ruleInstruction ) )+ otherlv_8= 'endif' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:631:1: (otherlv_0= 'if' (otherlv_1= 'all' | otherlv_2= 'any' )? ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= 'then' ( (lv_ins_5_0= ruleInstruction ) )+ otherlv_6= 'else' ( (lv_ins2_7_0= ruleInstruction ) )+ otherlv_8= 'endif' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:631:3: otherlv_0= 'if' (otherlv_1= 'all' | otherlv_2= 'any' )? ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= 'then' ( (lv_ins_5_0= ruleInstruction ) )+ otherlv_6= 'else' ( (lv_ins2_7_0= ruleInstruction ) )+ otherlv_8= 'endif'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCondition1292); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:635:1: (otherlv_1= 'all' | otherlv_2= 'any' )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:635:3: otherlv_1= 'all'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleCondition1305); 

                        	newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getAllKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:640:7: otherlv_2= 'any'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleCondition1323); 

                        	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getAnyKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:644:3: ( (lv_exp_3_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:645:1: (lv_exp_3_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:645:1: (lv_exp_3_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:646:3: lv_exp_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getExpExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCondition1346);
            lv_exp_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleCondition1358); 

                	newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getThenKeyword_3());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:666:1: ( (lv_ins_5_0= ruleInstruction ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==20||(LA7_0>=26 && LA7_0<=27)||(LA7_0>=41 && LA7_0<=42)||LA7_0==44||LA7_0==47) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:667:1: (lv_ins_5_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:667:1: (lv_ins_5_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:668:3: lv_ins_5_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionAccess().getInsInstructionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleCondition1379);
            	    lv_ins_5_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ins",
            	            		lv_ins_5_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleCondition1392); 

                	newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getElseKeyword_5());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:688:1: ( (lv_ins2_7_0= ruleInstruction ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==20||(LA8_0>=26 && LA8_0<=27)||(LA8_0>=41 && LA8_0<=42)||LA8_0==44||LA8_0==47) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:689:1: (lv_ins2_7_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:689:1: (lv_ins2_7_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:690:3: lv_ins2_7_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionAccess().getIns2InstructionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleCondition1413);
            	    lv_ins2_7_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ins2",
            	            		lv_ins2_7_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleCondition1426); 

                	newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getEndifKeyword_7());
                

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


    // $ANTLR start "entryRuleLoop"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:718:1: entryRuleLoop returns [String current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final String entryRuleLoop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLoop = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:719:2: (iv_ruleLoop= ruleLoop EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:720:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_ruleLoop_in_entryRuleLoop1463);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoop1474); 

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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:727:1: ruleLoop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'toto' ;
    public final AntlrDatatypeRuleToken ruleLoop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:730:28: (kw= 'toto' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:732:2: kw= 'toto'
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleLoop1511); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLoopAccess().getTotoKeyword()); 
                

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleActionInstruction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:745:1: entryRuleActionInstruction returns [EObject current=null] : iv_ruleActionInstruction= ruleActionInstruction EOF ;
    public final EObject entryRuleActionInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionInstruction = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:746:2: (iv_ruleActionInstruction= ruleActionInstruction EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:747:2: iv_ruleActionInstruction= ruleActionInstruction EOF
            {
             newCompositeNode(grammarAccess.getActionInstructionRule()); 
            pushFollow(FOLLOW_ruleActionInstruction_in_entryRuleActionInstruction1550);
            iv_ruleActionInstruction=ruleActionInstruction();

            state._fsp--;

             current =iv_ruleActionInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionInstruction1560); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:754:1: ruleActionInstruction returns [EObject current=null] : ( ( (lv_action_0_0= ruleClick ) ) | ( (lv_action_1_0= ruleFill ) ) | ( (lv_action_2_0= ruleClear ) ) | ruleGoTo ) ;
    public final EObject ruleActionInstruction() throws RecognitionException {
        EObject current = null;

        EObject lv_action_0_0 = null;

        EObject lv_action_1_0 = null;

        EObject lv_action_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:757:28: ( ( ( (lv_action_0_0= ruleClick ) ) | ( (lv_action_1_0= ruleFill ) ) | ( (lv_action_2_0= ruleClear ) ) | ruleGoTo ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:758:1: ( ( (lv_action_0_0= ruleClick ) ) | ( (lv_action_1_0= ruleFill ) ) | ( (lv_action_2_0= ruleClear ) ) | ruleGoTo )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:758:1: ( ( (lv_action_0_0= ruleClick ) ) | ( (lv_action_1_0= ruleFill ) ) | ( (lv_action_2_0= ruleClear ) ) | ruleGoTo )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt9=1;
                }
                break;
            case 42:
                {
                alt9=2;
                }
                break;
            case 44:
                {
                alt9=3;
                }
                break;
            case 47:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:758:2: ( (lv_action_0_0= ruleClick ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:758:2: ( (lv_action_0_0= ruleClick ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:759:1: (lv_action_0_0= ruleClick )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:759:1: (lv_action_0_0= ruleClick )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:760:3: lv_action_0_0= ruleClick
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionInstructionAccess().getActionClickParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClick_in_ruleActionInstruction1606);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:777:6: ( (lv_action_1_0= ruleFill ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:777:6: ( (lv_action_1_0= ruleFill ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:778:1: (lv_action_1_0= ruleFill )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:778:1: (lv_action_1_0= ruleFill )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:779:3: lv_action_1_0= ruleFill
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionInstructionAccess().getActionFillParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFill_in_ruleActionInstruction1633);
                    lv_action_1_0=ruleFill();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionInstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"action",
                            		lv_action_1_0, 
                            		"Fill");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:796:6: ( (lv_action_2_0= ruleClear ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:796:6: ( (lv_action_2_0= ruleClear ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:797:1: (lv_action_2_0= ruleClear )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:797:1: (lv_action_2_0= ruleClear )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:798:3: lv_action_2_0= ruleClear
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionInstructionAccess().getActionClearParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClear_in_ruleActionInstruction1660);
                    lv_action_2_0=ruleClear();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionInstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"action",
                            		lv_action_2_0, 
                            		"Clear");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:816:5: ruleGoTo
                    {
                     
                            newCompositeNode(grammarAccess.getActionInstructionAccess().getGoToParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGoTo_in_ruleActionInstruction1682);
                    ruleGoTo();

                    state._fsp--;

                     
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:831:1: entryRuleVariableName returns [EObject current=null] : iv_ruleVariableName= ruleVariableName EOF ;
    public final EObject entryRuleVariableName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableName = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:832:2: (iv_ruleVariableName= ruleVariableName EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:833:2: iv_ruleVariableName= ruleVariableName EOF
            {
             newCompositeNode(grammarAccess.getVariableNameRule()); 
            pushFollow(FOLLOW_ruleVariableName_in_entryRuleVariableName1717);
            iv_ruleVariableName=ruleVariableName();

            state._fsp--;

             current =iv_ruleVariableName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableName1727); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:840:1: ruleVariableName returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleVariableName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:843:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:844:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:844:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:845:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:845:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:846:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariableName1768); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:870:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:871:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:872:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration1808);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration1818); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:879:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= '=' ( (lv_val_3_0= ruleExpression ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_name_1_0 = null;

        EObject lv_val_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:882:28: ( (otherlv_0= 'var' ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= '=' ( (lv_val_3_0= ruleExpression ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:883:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= '=' ( (lv_val_3_0= ruleExpression ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:883:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= '=' ( (lv_val_3_0= ruleExpression ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:883:3: otherlv_0= 'var' ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= '=' ( (lv_val_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleDeclaration1855); 

                	newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getVarKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:887:1: ( (lv_name_1_0= ruleVariableName ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:888:1: (lv_name_1_0= ruleVariableName )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:888:1: (lv_name_1_0= ruleVariableName )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:889:3: lv_name_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getNameVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleDeclaration1876);
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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleDeclaration1888); 

                	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:909:1: ( (lv_val_3_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:910:1: (lv_val_3_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:910:1: (lv_val_3_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:911:3: lv_val_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getValExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleDeclaration1909);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:935:1: entryRuleAssignation returns [EObject current=null] : iv_ruleAssignation= ruleAssignation EOF ;
    public final EObject entryRuleAssignation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignation = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:936:2: (iv_ruleAssignation= ruleAssignation EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:937:2: iv_ruleAssignation= ruleAssignation EOF
            {
             newCompositeNode(grammarAccess.getAssignationRule()); 
            pushFollow(FOLLOW_ruleAssignation_in_entryRuleAssignation1945);
            iv_ruleAssignation=ruleAssignation();

            state._fsp--;

             current =iv_ruleAssignation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignation1955); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:944:1: ruleAssignation returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;

        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:947:28: ( ( ( (lv_var_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:948:1: ( ( (lv_var_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:948:1: ( ( (lv_var_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:948:2: ( (lv_var_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:948:2: ( (lv_var_0_0= ruleVariableReference ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:949:1: (lv_var_0_0= ruleVariableReference )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:949:1: (lv_var_0_0= ruleVariableReference )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:950:3: lv_var_0_0= ruleVariableReference
            {
             
            	        newCompositeNode(grammarAccess.getAssignationAccess().getVarVariableReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableReference_in_ruleAssignation2001);
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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleAssignation2013); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignationAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:970:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:971:1: (lv_expr_2_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:971:1: (lv_expr_2_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:972:3: lv_expr_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignationAccess().getExprExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignation2034);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:996:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:997:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:998:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2070);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2080); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1005:1: ruleExpression returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) | ( (lv_var_1_0= ruleVariable ) ) | ( (lv_act_2_0= ruleActionExpression ) ) | ( (otherlv_3= '==' | otherlv_4= '>' | otherlv_5= '<' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) ) | (otherlv_8= '!' ( (lv_exp_9_0= ruleExpression ) ) ) ) ;
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
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1008:28: ( ( ( (lv_type_0_0= ruleType ) ) | ( (lv_var_1_0= ruleVariable ) ) | ( (lv_act_2_0= ruleActionExpression ) ) | ( (otherlv_3= '==' | otherlv_4= '>' | otherlv_5= '<' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) ) | (otherlv_8= '!' ( (lv_exp_9_0= ruleExpression ) ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1009:1: ( ( (lv_type_0_0= ruleType ) ) | ( (lv_var_1_0= ruleVariable ) ) | ( (lv_act_2_0= ruleActionExpression ) ) | ( (otherlv_3= '==' | otherlv_4= '>' | otherlv_5= '<' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) ) | (otherlv_8= '!' ( (lv_exp_9_0= ruleExpression ) ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1009:1: ( ( (lv_type_0_0= ruleType ) ) | ( (lv_var_1_0= ruleVariable ) ) | ( (lv_act_2_0= ruleActionExpression ) ) | ( (otherlv_3= '==' | otherlv_4= '>' | otherlv_5= '<' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) ) | (otherlv_8= '!' ( (lv_exp_9_0= ruleExpression ) ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 33:
            case 34:
            case 35:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case 45:
            case 46:
                {
                alt11=3;
                }
                break;
            case 29:
            case 30:
            case 31:
                {
                alt11=4;
                }
                break;
            case 32:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1009:2: ( (lv_type_0_0= ruleType ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1009:2: ( (lv_type_0_0= ruleType ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1010:1: (lv_type_0_0= ruleType )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1010:1: (lv_type_0_0= ruleType )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1011:3: lv_type_0_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getTypeTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleExpression2126);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1028:6: ( (lv_var_1_0= ruleVariable ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1028:6: ( (lv_var_1_0= ruleVariable ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1029:1: (lv_var_1_0= ruleVariable )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1029:1: (lv_var_1_0= ruleVariable )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1030:3: lv_var_1_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getVarVariableParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleExpression2153);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1047:6: ( (lv_act_2_0= ruleActionExpression ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1047:6: ( (lv_act_2_0= ruleActionExpression ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1048:1: (lv_act_2_0= ruleActionExpression )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1048:1: (lv_act_2_0= ruleActionExpression )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1049:3: lv_act_2_0= ruleActionExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getActActionExpressionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionExpression_in_ruleExpression2180);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1066:6: ( (otherlv_3= '==' | otherlv_4= '>' | otherlv_5= '<' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1066:6: ( (otherlv_3= '==' | otherlv_4= '>' | otherlv_5= '<' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1066:7: (otherlv_3= '==' | otherlv_4= '>' | otherlv_5= '<' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1066:7: (otherlv_3= '==' | otherlv_4= '>' | otherlv_5= '<' )
                    int alt10=3;
                    switch ( input.LA(1) ) {
                    case 29:
                        {
                        alt10=1;
                        }
                        break;
                    case 30:
                        {
                        alt10=2;
                        }
                        break;
                    case 31:
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
                            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1066:9: otherlv_3= '=='
                            {
                            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleExpression2200); 

                                	newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getEqualsSignEqualsSignKeyword_3_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1071:7: otherlv_4= '>'
                            {
                            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleExpression2218); 

                                	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getGreaterThanSignKeyword_3_0_1());
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1076:7: otherlv_5= '<'
                            {
                            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleExpression2236); 

                                	newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getLessThanSignKeyword_3_0_2());
                                

                            }
                            break;

                    }

                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1080:2: ( (lv_left_6_0= ruleExpression ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1081:1: (lv_left_6_0= ruleExpression )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1081:1: (lv_left_6_0= ruleExpression )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1082:3: lv_left_6_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getLeftExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression2258);
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

                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1098:2: ( (lv_right_7_0= ruleExpression ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1099:1: (lv_right_7_0= ruleExpression )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1099:1: (lv_right_7_0= ruleExpression )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1100:3: lv_right_7_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression2279);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1117:6: (otherlv_8= '!' ( (lv_exp_9_0= ruleExpression ) ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1117:6: (otherlv_8= '!' ( (lv_exp_9_0= ruleExpression ) ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1117:8: otherlv_8= '!' ( (lv_exp_9_0= ruleExpression ) )
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_32_in_ruleExpression2299); 

                        	newLeafNode(otherlv_8, grammarAccess.getExpressionAccess().getExclamationMarkKeyword_4_0());
                        
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1121:1: ( (lv_exp_9_0= ruleExpression ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1122:1: (lv_exp_9_0= ruleExpression )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1122:1: (lv_exp_9_0= ruleExpression )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1123:3: lv_exp_9_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getExpExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression2320);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1147:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1148:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1149:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2358);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2369); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1156:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bool' | kw= 'string' | kw= 'int' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1159:28: ( (kw= 'bool' | kw= 'string' | kw= 'int' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1160:1: (kw= 'bool' | kw= 'string' | kw= 'int' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1160:1: (kw= 'bool' | kw= 'string' | kw= 'int' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt12=1;
                }
                break;
            case 34:
                {
                alt12=2;
                }
                break;
            case 35:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1161:2: kw= 'bool'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleType2407); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getBoolKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1168:2: kw= 'string'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleType2426); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1175:2: kw= 'int'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleType2445); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1188:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1189:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1190:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2485);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2495); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1197:1: ruleVariable returns [EObject current=null] : ( (lv_var_0_0= ruleVariableReference ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1200:28: ( ( (lv_var_0_0= ruleVariableReference ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1201:1: ( (lv_var_0_0= ruleVariableReference ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1201:1: ( (lv_var_0_0= ruleVariableReference ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1202:1: (lv_var_0_0= ruleVariableReference )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1202:1: (lv_var_0_0= ruleVariableReference )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1203:3: lv_var_0_0= ruleVariableReference
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getVarVariableReferenceParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableReference_in_ruleVariable2540);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1227:1: entryRuleActionExpression returns [EObject current=null] : iv_ruleActionExpression= ruleActionExpression EOF ;
    public final EObject entryRuleActionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionExpression = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1228:2: (iv_ruleActionExpression= ruleActionExpression EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1229:2: iv_ruleActionExpression= ruleActionExpression EOF
            {
             newCompositeNode(grammarAccess.getActionExpressionRule()); 
            pushFollow(FOLLOW_ruleActionExpression_in_entryRuleActionExpression2575);
            iv_ruleActionExpression=ruleActionExpression();

            state._fsp--;

             current =iv_ruleActionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionExpression2585); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1236:1: ruleActionExpression returns [EObject current=null] : (this_Verify_0= ruleVerify | this_Exist_1= ruleExist ) ;
    public final EObject ruleActionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Verify_0 = null;

        EObject this_Exist_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1239:28: ( (this_Verify_0= ruleVerify | this_Exist_1= ruleExist ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1240:1: (this_Verify_0= ruleVerify | this_Exist_1= ruleExist )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1240:1: (this_Verify_0= ruleVerify | this_Exist_1= ruleExist )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) ) {
                alt13=1;
            }
            else if ( (LA13_0==46) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1241:5: this_Verify_0= ruleVerify
                    {
                     
                            newCompositeNode(grammarAccess.getActionExpressionAccess().getVerifyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVerify_in_ruleActionExpression2632);
                    this_Verify_0=ruleVerify();

                    state._fsp--;

                     
                            current = this_Verify_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1251:5: this_Exist_1= ruleExist
                    {
                     
                            newCompositeNode(grammarAccess.getActionExpressionAccess().getExistParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExist_in_ruleActionExpression2659);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1267:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1268:2: (iv_ruleElement= ruleElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1269:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement2694);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement2704); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1276:1: ruleElement returns [EObject current=null] : (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_ClickableElement_0 = null;

        EObject this_FillableElement_1 = null;

        EObject this_CheckableElement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1279:28: ( (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1280:1: (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1280:1: (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
                {
                alt14=1;
                }
                break;
            case 40:
                {
                alt14=2;
                }
                break;
            case 36:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1281:5: this_ClickableElement_0= ruleClickableElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getClickableElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClickableElement_in_ruleElement2751);
                    this_ClickableElement_0=ruleClickableElement();

                    state._fsp--;

                     
                            current = this_ClickableElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1291:5: this_FillableElement_1= ruleFillableElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getFillableElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleElement2778);
                    this_FillableElement_1=ruleFillableElement();

                    state._fsp--;

                     
                            current = this_FillableElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1301:5: this_CheckableElement_2= ruleCheckableElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getCheckableElementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleElement2805);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1317:1: entryRuleClickableElement returns [EObject current=null] : iv_ruleClickableElement= ruleClickableElement EOF ;
    public final EObject entryRuleClickableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickableElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1318:2: (iv_ruleClickableElement= ruleClickableElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1319:2: iv_ruleClickableElement= ruleClickableElement EOF
            {
             newCompositeNode(grammarAccess.getClickableElementRule()); 
            pushFollow(FOLLOW_ruleClickableElement_in_entryRuleClickableElement2840);
            iv_ruleClickableElement=ruleClickableElement();

            state._fsp--;

             current =iv_ruleClickableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClickableElement2850); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1326:1: ruleClickableElement returns [EObject current=null] : (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage ) ;
    public final EObject ruleClickableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Link_0 = null;

        EObject this_Button_1 = null;

        EObject this_Image_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1329:28: ( (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1330:1: (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1330:1: (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt15=1;
                }
                break;
            case 38:
                {
                alt15=2;
                }
                break;
            case 39:
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1331:5: this_Link_0= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getClickableElementAccess().getLinkParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleClickableElement2897);
                    this_Link_0=ruleLink();

                    state._fsp--;

                     
                            current = this_Link_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1341:5: this_Button_1= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getClickableElementAccess().getButtonParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleClickableElement2924);
                    this_Button_1=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1351:5: this_Image_2= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getClickableElementAccess().getImageParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleClickableElement2951);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1367:1: entryRuleFillableElement returns [EObject current=null] : iv_ruleFillableElement= ruleFillableElement EOF ;
    public final EObject entryRuleFillableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFillableElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1368:2: (iv_ruleFillableElement= ruleFillableElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1369:2: iv_ruleFillableElement= ruleFillableElement EOF
            {
             newCompositeNode(grammarAccess.getFillableElementRule()); 
            pushFollow(FOLLOW_ruleFillableElement_in_entryRuleFillableElement2986);
            iv_ruleFillableElement=ruleFillableElement();

            state._fsp--;

             current =iv_ruleFillableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFillableElement2996); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1376:1: ruleFillableElement returns [EObject current=null] : this_TextField_0= ruleTextField ;
    public final EObject ruleFillableElement() throws RecognitionException {
        EObject current = null;

        EObject this_TextField_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1379:28: (this_TextField_0= ruleTextField )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1381:5: this_TextField_0= ruleTextField
            {
             
                    newCompositeNode(grammarAccess.getFillableElementAccess().getTextFieldParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTextField_in_ruleFillableElement3042);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1397:1: entryRuleCheckableElement returns [EObject current=null] : iv_ruleCheckableElement= ruleCheckableElement EOF ;
    public final EObject entryRuleCheckableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckableElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1398:2: (iv_ruleCheckableElement= ruleCheckableElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1399:2: iv_ruleCheckableElement= ruleCheckableElement EOF
            {
             newCompositeNode(grammarAccess.getCheckableElementRule()); 
            pushFollow(FOLLOW_ruleCheckableElement_in_entryRuleCheckableElement3076);
            iv_ruleCheckableElement=ruleCheckableElement();

            state._fsp--;

             current =iv_ruleCheckableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckableElement3086); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1406:1: ruleCheckableElement returns [EObject current=null] : this_Checkbox_0= ruleCheckbox ;
    public final EObject ruleCheckableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Checkbox_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1409:28: (this_Checkbox_0= ruleCheckbox )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1411:5: this_Checkbox_0= ruleCheckbox
            {
             
                    newCompositeNode(grammarAccess.getCheckableElementAccess().getCheckboxParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleCheckbox_in_ruleCheckableElement3132);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1427:1: entryRuleCheckbox returns [EObject current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final EObject entryRuleCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckbox = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1428:2: (iv_ruleCheckbox= ruleCheckbox EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1429:2: iv_ruleCheckbox= ruleCheckbox EOF
            {
             newCompositeNode(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_ruleCheckbox_in_entryRuleCheckbox3166);
            iv_ruleCheckbox=ruleCheckbox();

            state._fsp--;

             current =iv_ruleCheckbox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckbox3176); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1436:1: ruleCheckbox returns [EObject current=null] : (otherlv_0= 'checkbox' ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) ;
    public final EObject ruleCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_check_1_0=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1439:28: ( (otherlv_0= 'checkbox' ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1440:1: (otherlv_0= 'checkbox' ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1440:1: (otherlv_0= 'checkbox' ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1440:3: otherlv_0= 'checkbox' ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleCheckbox3213); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1444:1: ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1444:2: ( (lv_check_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1444:2: ( (lv_check_1_0= RULE_STRING ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1445:1: (lv_check_1_0= RULE_STRING )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1445:1: (lv_check_1_0= RULE_STRING )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1446:3: lv_check_1_0= RULE_STRING
                    {
                    lv_check_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckbox3231); 

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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1464:5: this_Variable_2= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getCheckboxAccess().getVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleCheckbox3264);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1480:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1481:2: (iv_ruleLink= ruleLink EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1482:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink3300);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink3310); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1489:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_link_1_0=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1492:28: ( (otherlv_0= 'link' ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1493:1: (otherlv_0= 'link' ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1493:1: (otherlv_0= 'link' ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1493:3: otherlv_0= 'link' ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleLink3347); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1497:1: ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1497:2: ( (lv_link_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1497:2: ( (lv_link_1_0= RULE_STRING ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1498:1: (lv_link_1_0= RULE_STRING )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1498:1: (lv_link_1_0= RULE_STRING )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1499:3: lv_link_1_0= RULE_STRING
                    {
                    lv_link_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink3365); 

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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1517:5: this_Variable_2= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getLinkAccess().getVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleLink3398);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1533:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1534:2: (iv_ruleButton= ruleButton EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1535:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton3434);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton3444); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1542:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_but_1_0=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1545:28: ( (otherlv_0= 'button' ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1546:1: (otherlv_0= 'button' ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1546:1: (otherlv_0= 'button' ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1546:3: otherlv_0= 'button' ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleButton3481); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1550:1: ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1550:2: ( (lv_but_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1550:2: ( (lv_but_1_0= RULE_STRING ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1551:1: (lv_but_1_0= RULE_STRING )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1551:1: (lv_but_1_0= RULE_STRING )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1552:3: lv_but_1_0= RULE_STRING
                    {
                    lv_but_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButton3499); 

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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1570:5: this_Variable_2= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getButtonAccess().getVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleButton3532);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1586:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1587:2: (iv_ruleImage= ruleImage EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1588:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage3568);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage3578); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1595:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image' ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_img_1_0=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1598:28: ( (otherlv_0= 'image' ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1599:1: (otherlv_0= 'image' ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1599:1: (otherlv_0= 'image' ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1599:3: otherlv_0= 'image' ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleImage3615); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1603:1: ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1603:2: ( (lv_img_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1603:2: ( (lv_img_1_0= RULE_STRING ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1604:1: (lv_img_1_0= RULE_STRING )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1604:1: (lv_img_1_0= RULE_STRING )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1605:3: lv_img_1_0= RULE_STRING
                    {
                    lv_img_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImage3633); 

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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1623:5: this_Variable_2= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getImageAccess().getVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleImage3666);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1639:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1640:2: (iv_ruleTextField= ruleTextField EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1641:2: iv_ruleTextField= ruleTextField EOF
            {
             newCompositeNode(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_ruleTextField_in_entryRuleTextField3702);
            iv_ruleTextField=ruleTextField();

            state._fsp--;

             current =iv_ruleTextField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextField3712); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1648:1: ruleTextField returns [EObject current=null] : (otherlv_0= 'textField' ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1651:28: ( (otherlv_0= 'textField' ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1652:1: (otherlv_0= 'textField' ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1652:1: (otherlv_0= 'textField' ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1652:3: otherlv_0= 'textField' ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleTextField3749); 

                	newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1656:1: ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1656:2: ( (lv_text_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1656:2: ( (lv_text_1_0= RULE_STRING ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1657:1: (lv_text_1_0= RULE_STRING )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1657:1: (lv_text_1_0= RULE_STRING )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1658:3: lv_text_1_0= RULE_STRING
                    {
                    lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextField3767); 

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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1676:5: this_Variable_2= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getTextFieldAccess().getVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleTextField3800);
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


    // $ANTLR start "entryRuleClick"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1692:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1693:2: (iv_ruleClick= ruleClick EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1694:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_ruleClick_in_entryRuleClick3836);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClick3846); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1701:1: ruleClick returns [EObject current=null] : (otherlv_0= 'click(' this_ClickableElement_1= ruleClickableElement otherlv_2= ')' ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ClickableElement_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1704:28: ( (otherlv_0= 'click(' this_ClickableElement_1= ruleClickableElement otherlv_2= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1705:1: (otherlv_0= 'click(' this_ClickableElement_1= ruleClickableElement otherlv_2= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1705:1: (otherlv_0= 'click(' this_ClickableElement_1= ruleClickableElement otherlv_2= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1705:3: otherlv_0= 'click(' this_ClickableElement_1= ruleClickableElement otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleClick3883); 

                	newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getClickAccess().getClickableElementParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleClickableElement_in_ruleClick3905);
            this_ClickableElement_1=ruleClickableElement();

            state._fsp--;

             
                    current = this_ClickableElement_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleClick3916); 

                	newLeafNode(otherlv_2, grammarAccess.getClickAccess().getRightParenthesisKeyword_2());
                

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


    // $ANTLR start "entryRuleFill"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1730:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1731:2: (iv_ruleFill= ruleFill EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1732:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_ruleFill_in_entryRuleFill3952);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFill3962); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1739:1: ruleFill returns [EObject current=null] : (otherlv_0= 'fill(' this_FillableElement_1= ruleFillableElement otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ')' ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_STRING_3=null;
        Token otherlv_4=null;
        EObject this_FillableElement_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1742:28: ( (otherlv_0= 'fill(' this_FillableElement_1= ruleFillableElement otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1743:1: (otherlv_0= 'fill(' this_FillableElement_1= ruleFillableElement otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1743:1: (otherlv_0= 'fill(' this_FillableElement_1= ruleFillableElement otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1743:3: otherlv_0= 'fill(' this_FillableElement_1= ruleFillableElement otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleFill3999); 

                	newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getFillAccess().getFillableElementParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFillableElement_in_ruleFill4021);
            this_FillableElement_1=ruleFillableElement();

            state._fsp--;

             
                    current = this_FillableElement_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleFill4032); 

                	newLeafNode(otherlv_2, grammarAccess.getFillAccess().getValueKeyword_2());
                
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFill4043); 
             
                newLeafNode(this_STRING_3, grammarAccess.getFillAccess().getSTRINGTerminalRuleCall_3()); 
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleFill4054); 

                	newLeafNode(otherlv_4, grammarAccess.getFillAccess().getRightParenthesisKeyword_4());
                

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1776:1: entryRuleClear returns [EObject current=null] : iv_ruleClear= ruleClear EOF ;
    public final EObject entryRuleClear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClear = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1777:2: (iv_ruleClear= ruleClear EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1778:2: iv_ruleClear= ruleClear EOF
            {
             newCompositeNode(grammarAccess.getClearRule()); 
            pushFollow(FOLLOW_ruleClear_in_entryRuleClear4090);
            iv_ruleClear=ruleClear();

            state._fsp--;

             current =iv_ruleClear; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClear4100); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1785:1: ruleClear returns [EObject current=null] : (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ')' ) ;
    public final EObject ruleClear() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_FillableElement_1 = null;

        EObject this_CheckableElement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1788:28: ( (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1789:1: (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1789:1: (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1789:3: otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleClear4137); 

                	newLeafNode(otherlv_0, grammarAccess.getClearAccess().getClearKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1793:1: (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            else if ( (LA21_0==36) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1794:5: this_FillableElement_1= ruleFillableElement
                    {
                     
                            newCompositeNode(grammarAccess.getClearAccess().getFillableElementParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleClear4160);
                    this_FillableElement_1=ruleFillableElement();

                    state._fsp--;

                     
                            current = this_FillableElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1804:5: this_CheckableElement_2= ruleCheckableElement
                    {
                     
                            newCompositeNode(grammarAccess.getClearAccess().getCheckableElementParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleClear4187);
                    this_CheckableElement_2=ruleCheckableElement();

                    state._fsp--;

                     
                            current = this_CheckableElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleClear4199); 

                	newLeafNode(otherlv_3, grammarAccess.getClearAccess().getRightParenthesisKeyword_2());
                

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1824:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1825:2: (iv_ruleVerify= ruleVerify EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1826:2: iv_ruleVerify= ruleVerify EOF
            {
             newCompositeNode(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_ruleVerify_in_entryRuleVerify4235);
            iv_ruleVerify=ruleVerify();

            state._fsp--;

             current =iv_ruleVerify; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerify4245); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1833:1: ruleVerify returns [EObject current=null] : (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ', value=' this_STRING_4= RULE_STRING otherlv_5= ')' ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token this_STRING_4=null;
        Token otherlv_5=null;
        EObject this_FillableElement_1 = null;

        EObject this_CheckableElement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1836:28: ( (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ', value=' this_STRING_4= RULE_STRING otherlv_5= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1837:1: (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ', value=' this_STRING_4= RULE_STRING otherlv_5= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1837:1: (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ', value=' this_STRING_4= RULE_STRING otherlv_5= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1837:3: otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ', value=' this_STRING_4= RULE_STRING otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleVerify4282); 

                	newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1841:1: (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            else if ( (LA22_0==36) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1842:5: this_FillableElement_1= ruleFillableElement
                    {
                     
                            newCompositeNode(grammarAccess.getVerifyAccess().getFillableElementParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleVerify4305);
                    this_FillableElement_1=ruleFillableElement();

                    state._fsp--;

                     
                            current = this_FillableElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1852:5: this_CheckableElement_2= ruleCheckableElement
                    {
                     
                            newCompositeNode(grammarAccess.getVerifyAccess().getCheckableElementParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleVerify4332);
                    this_CheckableElement_2=ruleCheckableElement();

                    state._fsp--;

                     
                            current = this_CheckableElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleVerify4344); 

                	newLeafNode(otherlv_3, grammarAccess.getVerifyAccess().getValueKeyword_2());
                
            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVerify4355); 
             
                newLeafNode(this_STRING_4, grammarAccess.getVerifyAccess().getSTRINGTerminalRuleCall_3()); 
                
            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleVerify4366); 

                	newLeafNode(otherlv_5, grammarAccess.getVerifyAccess().getRightParenthesisKeyword_4());
                

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1880:1: entryRuleExist returns [EObject current=null] : iv_ruleExist= ruleExist EOF ;
    public final EObject entryRuleExist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExist = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1881:2: (iv_ruleExist= ruleExist EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1882:2: iv_ruleExist= ruleExist EOF
            {
             newCompositeNode(grammarAccess.getExistRule()); 
            pushFollow(FOLLOW_ruleExist_in_entryRuleExist4402);
            iv_ruleExist=ruleExist();

            state._fsp--;

             current =iv_ruleExist; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExist4412); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1889:1: ruleExist returns [EObject current=null] : (otherlv_0= 'exist(' this_Element_1= ruleElement otherlv_2= ')' ) ;
    public final EObject ruleExist() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Element_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1892:28: ( (otherlv_0= 'exist(' this_Element_1= ruleElement otherlv_2= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1893:1: (otherlv_0= 'exist(' this_Element_1= ruleElement otherlv_2= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1893:1: (otherlv_0= 'exist(' this_Element_1= ruleElement otherlv_2= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1893:3: otherlv_0= 'exist(' this_Element_1= ruleElement otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleExist4449); 

                	newLeafNode(otherlv_0, grammarAccess.getExistAccess().getExistKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getExistAccess().getElementParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleElement_in_ruleExist4471);
            this_Element_1=ruleElement();

            state._fsp--;

             
                    current = this_Element_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleExist4482); 

                	newLeafNode(otherlv_2, grammarAccess.getExistAccess().getRightParenthesisKeyword_2());
                

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1918:1: entryRuleGoTo returns [String current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final String entryRuleGoTo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGoTo = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1919:2: (iv_ruleGoTo= ruleGoTo EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1920:2: iv_ruleGoTo= ruleGoTo EOF
            {
             newCompositeNode(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_ruleGoTo_in_entryRuleGoTo4519);
            iv_ruleGoTo=ruleGoTo();

            state._fsp--;

             current =iv_ruleGoTo.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoTo4530); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1927:1: ruleGoTo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'url=' this_URL_1= RULE_URL ) ;
    public final AntlrDatatypeRuleToken ruleGoTo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_URL_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1930:28: ( (kw= 'url=' this_URL_1= RULE_URL ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1931:1: (kw= 'url=' this_URL_1= RULE_URL )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1931:1: (kw= 'url=' this_URL_1= RULE_URL )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1932:2: kw= 'url=' this_URL_1= RULE_URL
            {
            kw=(Token)match(input,47,FOLLOW_47_in_ruleGoTo4568); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getGoToAccess().getUrlKeyword_0()); 
                
            this_URL_1=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleGoTo4583); 

            		current.merge(this_URL_1);
                
             
                newLeafNode(this_URL_1, grammarAccess.getGoToAccess().getURLTerminalRuleCall_1()); 
                

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
    public static final BitSet FOLLOW_ruleSubroutine_in_ruleProgram131 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_ruleMain_in_ruleProgram153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_entryRuleSubroutine189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutine199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSubroutine236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHead_in_ruleSubroutine257 = new BitSet(new long[]{0x000096000C100010L});
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
    public static final BitSet FOLLOW_ruleFunctionName_in_entryRuleFunctionName710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionName720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionName761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMain848 = new BitSet(new long[]{0x000096000C100010L});
    public static final BitSet FOLLOW_ruleBody_in_ruleMain870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBody961 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleBody974 = new BitSet(new long[]{0x000096000C100010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBody995 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleBody1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleInstruction1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleInstruction1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_ruleInstruction1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionInstruction_in_ruleInstruction1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignation_in_ruleInstruction1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCondition1292 = new BitSet(new long[]{0x0000F60FEC700010L});
    public static final BitSet FOLLOW_21_in_ruleCondition1305 = new BitSet(new long[]{0x0000F60FEC700010L});
    public static final BitSet FOLLOW_22_in_ruleCondition1323 = new BitSet(new long[]{0x0000F60FEC700010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition1346 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCondition1358 = new BitSet(new long[]{0x000096000C100010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleCondition1379 = new BitSet(new long[]{0x000096000D100010L});
    public static final BitSet FOLLOW_24_in_ruleCondition1392 = new BitSet(new long[]{0x000096000C100010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleCondition1413 = new BitSet(new long[]{0x000096000E100010L});
    public static final BitSet FOLLOW_25_in_ruleCondition1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_entryRuleLoop1463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoop1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLoop1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionInstruction_in_entryRuleActionInstruction1550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionInstruction1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_ruleActionInstruction1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_ruleActionInstruction1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClear_in_ruleActionInstruction1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_ruleActionInstruction1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName1717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariableName1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration1808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDeclaration1855 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleDeclaration1876 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDeclaration1888 = new BitSet(new long[]{0x0000F60FEC700010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDeclaration1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignation_in_entryRuleAssignation1945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignation1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAssignation2001 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAssignation2013 = new BitSet(new long[]{0x0000F60FEC700010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignation2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleExpression2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExpression2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleExpression2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleExpression2200 = new BitSet(new long[]{0x0000F60FEC700010L});
    public static final BitSet FOLLOW_30_in_ruleExpression2218 = new BitSet(new long[]{0x0000F60FEC700010L});
    public static final BitSet FOLLOW_31_in_ruleExpression2236 = new BitSet(new long[]{0x0000F60FEC700010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression2258 = new BitSet(new long[]{0x0000F60FEC700010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleExpression2299 = new BitSet(new long[]{0x0000F60FEC700010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleType2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleType2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleType2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleVariable2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_in_entryRuleActionExpression2575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionExpression2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_ruleActionExpression2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExist_in_ruleActionExpression2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement2694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickableElement_in_ruleElement2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleElement2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleElement2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickableElement_in_entryRuleClickableElement2840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClickableElement2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleClickableElement2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleClickableElement2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleClickableElement2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFillableElement_in_entryRuleFillableElement2986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFillableElement2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_ruleFillableElement3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_entryRuleCheckableElement3076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckableElement3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_ruleCheckableElement3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_entryRuleCheckbox3166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckbox3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCheckbox3213 = new BitSet(new long[]{0x000096000C100030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckbox3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCheckbox3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink3300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleLink3347 = new BitSet(new long[]{0x000096000C100030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLink3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton3434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleButton3481 = new BitSet(new long[]{0x000096000C100030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButton3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleButton3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage3568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleImage3615 = new BitSet(new long[]{0x000096000C100030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImage3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleImage3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField3702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextField3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTextField3749 = new BitSet(new long[]{0x000096000C100030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextField3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTextField3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_entryRuleClick3836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClick3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleClick3883 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_ruleClickableElement_in_ruleClick3905 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClick3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_entryRuleFill3952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFill3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFill3999 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleFill4021 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleFill4032 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFill4043 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFill4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClear_in_entryRuleClear4090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClear4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleClear4137 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleClear4160 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleClear4187 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClear4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_entryRuleVerify4235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerify4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVerify4282 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleVerify4305 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleVerify4332 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleVerify4344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVerify4355 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVerify4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExist_in_entryRuleExist4402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExist4412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleExist4449 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_ruleElement_in_ruleExist4471 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExist4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_entryRuleGoTo4519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoTo4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleGoTo4568 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleGoTo4583 = new BitSet(new long[]{0x0000000000000002L});

}