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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_URL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sub '", "'()'", "'(var '", "', var '", "')'", "'('", "','", "'main '", "'{'", "'browser'", "', '", "' '", "'}'", "'if '", "'all '", "'any '", "'then '", "'else '", "'endif'", "'while ('", "') do '", "' endwhile'", "'var '", "' = '", "';'", "' == '", "' > '", "' < '", "' !'", "'bool '", "'string '", "'int '", "'checkbox '", "'link '", "'button '", "'image '", "'textField '", "'checkbox'", "'link'", "'button'", "'image'", "'textField'", "'select('", "'click('", "');'", "'check('", "'fill('", "', value='", "'clear('", "'verify('", "'exist('", "'goTo('", "'Chrome'", "'Firefox'"
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
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:77:1: ruleProgram returns [EObject current=null] : ( ( (lv_sub_0_0= ruleSubroutine ) )* ( (lv_main_1_0= ruleMain ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_sub_0_0 = null;

        EObject lv_main_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:80:28: ( ( ( (lv_sub_0_0= ruleSubroutine ) )* ( (lv_main_1_0= ruleMain ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:81:1: ( ( (lv_sub_0_0= ruleSubroutine ) )* ( (lv_main_1_0= ruleMain ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:81:1: ( ( (lv_sub_0_0= ruleSubroutine ) )* ( (lv_main_1_0= ruleMain ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:81:2: ( (lv_sub_0_0= ruleSubroutine ) )* ( (lv_main_1_0= ruleMain ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:81:2: ( (lv_sub_0_0= ruleSubroutine ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:82:1: (lv_sub_0_0= ruleSubroutine )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:82:1: (lv_sub_0_0= ruleSubroutine )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:83:3: lv_sub_0_0= ruleSubroutine
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

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:99:3: ( (lv_main_1_0= ruleMain ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:100:1: (lv_main_1_0= ruleMain )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:100:1: (lv_main_1_0= ruleMain )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:101:3: lv_main_1_0= ruleMain
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:125:1: entryRuleSubroutine returns [EObject current=null] : iv_ruleSubroutine= ruleSubroutine EOF ;
    public final EObject entryRuleSubroutine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubroutine = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:126:2: (iv_ruleSubroutine= ruleSubroutine EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:127:2: iv_ruleSubroutine= ruleSubroutine EOF
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:134:1: ruleSubroutine returns [EObject current=null] : (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) ) ;
    public final EObject ruleSubroutine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_head_1_0 = null;

        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:137:28: ( (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:138:1: (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:138:1: (otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:138:3: otherlv_0= 'sub ' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleSubroutine236); 

                	newLeafNode(otherlv_0, grammarAccess.getSubroutineAccess().getSubKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:142:1: ( (lv_head_1_0= ruleHead ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:143:1: (lv_head_1_0= ruleHead )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:143:1: (lv_head_1_0= ruleHead )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:144:3: lv_head_1_0= ruleHead
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

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:160:2: ( (lv_body_2_0= ruleBody ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:161:1: (lv_body_2_0= ruleBody )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:161:1: (lv_body_2_0= ruleBody )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:162:3: lv_body_2_0= ruleBody
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:186:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:187:2: (iv_ruleHead= ruleHead EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:188:2: iv_ruleHead= ruleHead EOF
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:195:1: ruleHead returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) ) ;
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
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:198:28: ( ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:199:1: ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:199:1: ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' ) | ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' ) )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:199:2: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:199:2: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:199:3: ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '()'
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:199:3: ( (lv_name_0_0= ruleFunctionName ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:200:1: (lv_name_0_0= ruleFunctionName )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:200:1: (lv_name_0_0= ruleFunctionName )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:201:3: lv_name_0_0= ruleFunctionName
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:222:6: ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:222:6: ( ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:222:7: ( (lv_name_2_0= ruleFunctionName ) ) otherlv_3= '(var ' ( (lv_varId_4_0= ruleVariableName ) ) (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )* otherlv_7= ')'
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:222:7: ( (lv_name_2_0= ruleFunctionName ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:223:1: (lv_name_2_0= ruleFunctionName )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:223:1: (lv_name_2_0= ruleFunctionName )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:224:3: lv_name_2_0= ruleFunctionName
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
                        
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:244:1: ( (lv_varId_4_0= ruleVariableName ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:245:1: (lv_varId_4_0= ruleVariableName )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:245:1: (lv_varId_4_0= ruleVariableName )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:246:3: lv_varId_4_0= ruleVariableName
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

                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:262:2: (otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:262:4: otherlv_5= ', var ' ( (lv_varId_6_0= ruleVariableName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleHead458); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getHeadAccess().getVarKeyword_1_3_0());
                    	        
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:266:1: ( (lv_varId_6_0= ruleVariableName ) )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:267:1: (lv_varId_6_0= ruleVariableName )
                    	    {
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:267:1: (lv_varId_6_0= ruleVariableName )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:268:3: lv_varId_6_0= ruleVariableName
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:296:1: entryRuleFunctionReference returns [EObject current=null] : iv_ruleFunctionReference= ruleFunctionReference EOF ;
    public final EObject entryRuleFunctionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReference = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:297:2: (iv_ruleFunctionReference= ruleFunctionReference EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:298:2: iv_ruleFunctionReference= ruleFunctionReference EOF
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:305:1: ruleFunctionReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFunctionReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:308:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:309:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:309:1: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:310:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:310:1: (otherlv_0= RULE_ID )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:311:3: otherlv_0= RULE_ID
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:330:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:331:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:332:2: iv_ruleVariableReference= ruleVariableReference EOF
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:339:1: ruleVariableReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:342:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:343:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:343:1: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:344:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:344:1: (otherlv_0= RULE_ID )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:345:3: otherlv_0= RULE_ID
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:364:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:365:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:366:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:373:1: ruleFunctionCall returns [EObject current=null] : ( (this_FunctionReference_0= ruleFunctionReference otherlv_1= '()' ) | (this_FunctionReference_2= ruleFunctionReference otherlv_3= '(' ( (lv_var_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )* otherlv_7= ')' ) ) ;
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
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:376:28: ( ( (this_FunctionReference_0= ruleFunctionReference otherlv_1= '()' ) | (this_FunctionReference_2= ruleFunctionReference otherlv_3= '(' ( (lv_var_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )* otherlv_7= ')' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:377:1: ( (this_FunctionReference_0= ruleFunctionReference otherlv_1= '()' ) | (this_FunctionReference_2= ruleFunctionReference otherlv_3= '(' ( (lv_var_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )* otherlv_7= ')' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:377:1: ( (this_FunctionReference_0= ruleFunctionReference otherlv_1= '()' ) | (this_FunctionReference_2= ruleFunctionReference otherlv_3= '(' ( (lv_var_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )* otherlv_7= ')' ) )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:377:2: (this_FunctionReference_0= ruleFunctionReference otherlv_1= '()' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:377:2: (this_FunctionReference_0= ruleFunctionReference otherlv_1= '()' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:378:5: this_FunctionReference_0= ruleFunctionReference otherlv_1= '()'
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:391:6: (this_FunctionReference_2= ruleFunctionReference otherlv_3= '(' ( (lv_var_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )* otherlv_7= ')' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:391:6: (this_FunctionReference_2= ruleFunctionReference otherlv_3= '(' ( (lv_var_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )* otherlv_7= ')' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:392:5: this_FunctionReference_2= ruleFunctionReference otherlv_3= '(' ( (lv_var_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )* otherlv_7= ')'
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionReferenceParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleFunctionReference_in_ruleFunctionCall807);
                    this_FunctionReference_2=ruleFunctionReference();

                    state._fsp--;

                     
                            current = this_FunctionReference_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleFunctionCall818); 

                        	newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:404:1: ( (lv_var_4_0= ruleExpression ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:405:1: (lv_var_4_0= ruleExpression )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:405:1: (lv_var_4_0= ruleExpression )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:406:3: lv_var_4_0= ruleExpression
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

                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:422:2: (otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:422:4: otherlv_5= ',' ( (lv_var_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleFunctionCall852); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getCommaKeyword_1_3_0());
                    	        
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:426:1: ( (lv_var_6_0= ruleExpression ) )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:427:1: (lv_var_6_0= ruleExpression )
                    	    {
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:427:1: (lv_var_6_0= ruleExpression )
                    	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:428:3: lv_var_6_0= ruleExpression
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:456:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:457:2: (iv_ruleFunctionName= ruleFunctionName EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:458:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:465:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:468:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:469:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:469:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:470:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:470:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:471:3: lv_name_0_0= RULE_STRING
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:495:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:496:2: (iv_ruleMain= ruleMain EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:497:2: iv_ruleMain= ruleMain EOF
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:504:1: ruleMain returns [EObject current=null] : (otherlv_0= 'main ' this_Body_1= ruleBody ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Body_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:507:28: ( (otherlv_0= 'main ' this_Body_1= ruleBody ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:508:1: (otherlv_0= 'main ' this_Body_1= ruleBody )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:508:1: (otherlv_0= 'main ' this_Body_1= ruleBody )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:508:3: otherlv_0= 'main ' this_Body_1= ruleBody
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:529:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:530:2: (iv_ruleBody= ruleBody EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:531:2: iv_ruleBody= ruleBody EOF
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:538:1: ruleBody returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'browser' ( (lv_open_2_0= ruleOpenBrowser ) ) otherlv_3= ', ' ( (lv_instructions_4_0= ruleInstruction ) ) (otherlv_5= ' ' ( (lv_instructions_6_0= ruleInstruction ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_open_2_0 = null;

        EObject lv_instructions_4_0 = null;

        EObject lv_instructions_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:541:28: ( (otherlv_0= '{' otherlv_1= 'browser' ( (lv_open_2_0= ruleOpenBrowser ) ) otherlv_3= ', ' ( (lv_instructions_4_0= ruleInstruction ) ) (otherlv_5= ' ' ( (lv_instructions_6_0= ruleInstruction ) ) )* otherlv_7= '}' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:542:1: (otherlv_0= '{' otherlv_1= 'browser' ( (lv_open_2_0= ruleOpenBrowser ) ) otherlv_3= ', ' ( (lv_instructions_4_0= ruleInstruction ) ) (otherlv_5= ' ' ( (lv_instructions_6_0= ruleInstruction ) ) )* otherlv_7= '}' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:542:1: (otherlv_0= '{' otherlv_1= 'browser' ( (lv_open_2_0= ruleOpenBrowser ) ) otherlv_3= ', ' ( (lv_instructions_4_0= ruleInstruction ) ) (otherlv_5= ' ' ( (lv_instructions_6_0= ruleInstruction ) ) )* otherlv_7= '}' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:542:3: otherlv_0= '{' otherlv_1= 'browser' ( (lv_open_2_0= ruleOpenBrowser ) ) otherlv_3= ', ' ( (lv_instructions_4_0= ruleInstruction ) ) (otherlv_5= ' ' ( (lv_instructions_6_0= ruleInstruction ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleBody1166); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleBody1178); 

                	newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getBrowserKeyword_1());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:550:1: ( (lv_open_2_0= ruleOpenBrowser ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:551:1: (lv_open_2_0= ruleOpenBrowser )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:551:1: (lv_open_2_0= ruleOpenBrowser )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:552:3: lv_open_2_0= ruleOpenBrowser
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getOpenOpenBrowserEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOpenBrowser_in_ruleBody1199);
            lv_open_2_0=ruleOpenBrowser();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	        }
                   		set(
                   			current, 
                   			"open",
                    		lv_open_2_0, 
                    		"OpenBrowser");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleBody1211); 

                	newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getCommaSpaceKeyword_3());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:572:1: ( (lv_instructions_4_0= ruleInstruction ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:573:1: (lv_instructions_4_0= ruleInstruction )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:573:1: (lv_instructions_4_0= ruleInstruction )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:574:3: lv_instructions_4_0= ruleInstruction
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getInstructionsInstructionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleInstruction_in_ruleBody1232);
            lv_instructions_4_0=ruleInstruction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	        }
                   		add(
                   			current, 
                   			"instructions",
                    		lv_instructions_4_0, 
                    		"Instruction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:590:2: (otherlv_5= ' ' ( (lv_instructions_6_0= ruleInstruction ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:590:4: otherlv_5= ' ' ( (lv_instructions_6_0= ruleInstruction ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleBody1245); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBodyAccess().getSpaceKeyword_5_0());
            	        
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:594:1: ( (lv_instructions_6_0= ruleInstruction ) )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:595:1: (lv_instructions_6_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:595:1: (lv_instructions_6_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:596:3: lv_instructions_6_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBodyAccess().getInstructionsInstructionParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleBody1266);
            	    lv_instructions_6_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_6_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleBody1280); 

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


    // $ANTLR start "entryRuleInstruction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:624:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:625:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:626:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction1316);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction1326); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:633:1: ruleInstruction returns [EObject current=null] : ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_cond_1_0= ruleCondition ) ) | ( (lv_while_2_0= ruleWhile ) ) | ( (lv_act_3_0= ruleActionInstruction ) ) | ( (lv_ass_4_0= ruleAssignation ) ) | ( (lv_sub_5_0= ruleFunctionCall ) ) ) ;
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
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:636:28: ( ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_cond_1_0= ruleCondition ) ) | ( (lv_while_2_0= ruleWhile ) ) | ( (lv_act_3_0= ruleActionInstruction ) ) | ( (lv_ass_4_0= ruleAssignation ) ) | ( (lv_sub_5_0= ruleFunctionCall ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:637:1: ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_cond_1_0= ruleCondition ) ) | ( (lv_while_2_0= ruleWhile ) ) | ( (lv_act_3_0= ruleActionInstruction ) ) | ( (lv_ass_4_0= ruleAssignation ) ) | ( (lv_sub_5_0= ruleFunctionCall ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:637:1: ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_cond_1_0= ruleCondition ) ) | ( (lv_while_2_0= ruleWhile ) ) | ( (lv_act_3_0= ruleActionInstruction ) ) | ( (lv_ass_4_0= ruleAssignation ) ) | ( (lv_sub_5_0= ruleFunctionCall ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            case 55:
            case 57:
            case 58:
            case 60:
            case 63:
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
                else if ( (LA7_5==35) ) {
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:637:2: ( (lv_dec_0_0= ruleDeclaration ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:637:2: ( (lv_dec_0_0= ruleDeclaration ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:638:1: (lv_dec_0_0= ruleDeclaration )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:638:1: (lv_dec_0_0= ruleDeclaration )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:639:3: lv_dec_0_0= ruleDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getDecDeclarationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleInstruction1372);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:656:6: ( (lv_cond_1_0= ruleCondition ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:656:6: ( (lv_cond_1_0= ruleCondition ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:657:1: (lv_cond_1_0= ruleCondition )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:657:1: (lv_cond_1_0= ruleCondition )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:658:3: lv_cond_1_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getCondConditionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleInstruction1399);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:675:6: ( (lv_while_2_0= ruleWhile ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:675:6: ( (lv_while_2_0= ruleWhile ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:676:1: (lv_while_2_0= ruleWhile )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:676:1: (lv_while_2_0= ruleWhile )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:677:3: lv_while_2_0= ruleWhile
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getWhileWhileParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhile_in_ruleInstruction1426);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:694:6: ( (lv_act_3_0= ruleActionInstruction ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:694:6: ( (lv_act_3_0= ruleActionInstruction ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:695:1: (lv_act_3_0= ruleActionInstruction )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:695:1: (lv_act_3_0= ruleActionInstruction )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:696:3: lv_act_3_0= ruleActionInstruction
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getActActionInstructionParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionInstruction_in_ruleInstruction1453);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:713:6: ( (lv_ass_4_0= ruleAssignation ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:713:6: ( (lv_ass_4_0= ruleAssignation ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:714:1: (lv_ass_4_0= ruleAssignation )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:714:1: (lv_ass_4_0= ruleAssignation )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:715:3: lv_ass_4_0= ruleAssignation
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getAssAssignationParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssignation_in_ruleInstruction1480);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:732:6: ( (lv_sub_5_0= ruleFunctionCall ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:732:6: ( (lv_sub_5_0= ruleFunctionCall ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:733:1: (lv_sub_5_0= ruleFunctionCall )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:733:1: (lv_sub_5_0= ruleFunctionCall )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:734:3: lv_sub_5_0= ruleFunctionCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstructionAccess().getSubFunctionCallParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleInstruction1507);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:758:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:759:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:760:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1543);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1553); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:767:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'if ' (otherlv_1= 'all ' | otherlv_2= 'any ' )? otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= 'then ' ( (lv_ins_7_0= ruleInstruction ) )+ otherlv_8= 'else ' ( (lv_ins2_9_0= ruleInstruction ) )+ otherlv_10= 'endif' ) ;
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
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:770:28: ( (otherlv_0= 'if ' (otherlv_1= 'all ' | otherlv_2= 'any ' )? otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= 'then ' ( (lv_ins_7_0= ruleInstruction ) )+ otherlv_8= 'else ' ( (lv_ins2_9_0= ruleInstruction ) )+ otherlv_10= 'endif' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:771:1: (otherlv_0= 'if ' (otherlv_1= 'all ' | otherlv_2= 'any ' )? otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= 'then ' ( (lv_ins_7_0= ruleInstruction ) )+ otherlv_8= 'else ' ( (lv_ins2_9_0= ruleInstruction ) )+ otherlv_10= 'endif' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:771:1: (otherlv_0= 'if ' (otherlv_1= 'all ' | otherlv_2= 'any ' )? otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= 'then ' ( (lv_ins_7_0= ruleInstruction ) )+ otherlv_8= 'else ' ( (lv_ins2_9_0= ruleInstruction ) )+ otherlv_10= 'endif' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:771:3: otherlv_0= 'if ' (otherlv_1= 'all ' | otherlv_2= 'any ' )? otherlv_3= '(' ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= 'then ' ( (lv_ins_7_0= ruleInstruction ) )+ otherlv_8= 'else ' ( (lv_ins2_9_0= ruleInstruction ) )+ otherlv_10= 'endif'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleCondition1590); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:775:1: (otherlv_1= 'all ' | otherlv_2= 'any ' )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:775:3: otherlv_1= 'all '
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleCondition1603); 

                        	newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getAllKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:780:7: otherlv_2= 'any '
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleCondition1621); 

                        	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getAnyKeyword_1_1());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleCondition1635); 

                	newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:788:1: ( (lv_exp_4_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:789:1: (lv_exp_4_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:789:1: (lv_exp_4_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:790:3: lv_exp_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getExpExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCondition1656);
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

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleCondition1668); 

                	newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getRightParenthesisKeyword_4());
                
            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleCondition1680); 

                	newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getThenKeyword_5());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:814:1: ( (lv_ins_7_0= ruleInstruction ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==25||LA9_0==31||LA9_0==34||LA9_0==55||(LA9_0>=57 && LA9_0<=58)||LA9_0==60||LA9_0==63) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:815:1: (lv_ins_7_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:815:1: (lv_ins_7_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:816:3: lv_ins_7_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionAccess().getInsInstructionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleCondition1701);
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

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleCondition1714); 

                	newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getElseKeyword_7());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:836:1: ( (lv_ins2_9_0= ruleInstruction ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==25||LA10_0==31||LA10_0==34||LA10_0==55||(LA10_0>=57 && LA10_0<=58)||LA10_0==60||LA10_0==63) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:837:1: (lv_ins2_9_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:837:1: (lv_ins2_9_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:838:3: lv_ins2_9_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionAccess().getIns2InstructionParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleCondition1735);
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

            otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleCondition1748); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:866:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:867:2: (iv_ruleWhile= ruleWhile EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:868:2: iv_ruleWhile= ruleWhile EOF
            {
             newCompositeNode(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile1784);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile1794); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:875:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while (' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ') do ' ( (lv_ins_3_0= ruleInstruction ) )+ otherlv_4= ' endwhile' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_exp_1_0 = null;

        EObject lv_ins_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:878:28: ( (otherlv_0= 'while (' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ') do ' ( (lv_ins_3_0= ruleInstruction ) )+ otherlv_4= ' endwhile' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:879:1: (otherlv_0= 'while (' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ') do ' ( (lv_ins_3_0= ruleInstruction ) )+ otherlv_4= ' endwhile' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:879:1: (otherlv_0= 'while (' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ') do ' ( (lv_ins_3_0= ruleInstruction ) )+ otherlv_4= ' endwhile' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:879:3: otherlv_0= 'while (' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ') do ' ( (lv_ins_3_0= ruleInstruction ) )+ otherlv_4= ' endwhile'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleWhile1831); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:883:1: ( (lv_exp_1_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:884:1: (lv_exp_1_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:884:1: (lv_exp_1_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:885:3: lv_exp_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getWhileAccess().getExpExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleWhile1852);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleWhile1864); 

                	newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getDoKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:905:1: ( (lv_ins_3_0= ruleInstruction ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==25||LA11_0==31||LA11_0==34||LA11_0==55||(LA11_0>=57 && LA11_0<=58)||LA11_0==60||LA11_0==63) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:906:1: (lv_ins_3_0= ruleInstruction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:906:1: (lv_ins_3_0= ruleInstruction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:907:3: lv_ins_3_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhileAccess().getInsInstructionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleWhile1885);
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

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleWhile1898); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:935:1: entryRuleActionInstruction returns [EObject current=null] : iv_ruleActionInstruction= ruleActionInstruction EOF ;
    public final EObject entryRuleActionInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionInstruction = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:936:2: (iv_ruleActionInstruction= ruleActionInstruction EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:937:2: iv_ruleActionInstruction= ruleActionInstruction EOF
            {
             newCompositeNode(grammarAccess.getActionInstructionRule()); 
            pushFollow(FOLLOW_ruleActionInstruction_in_entryRuleActionInstruction1934);
            iv_ruleActionInstruction=ruleActionInstruction();

            state._fsp--;

             current =iv_ruleActionInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionInstruction1944); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:944:1: ruleActionInstruction returns [EObject current=null] : ( ( (lv_action_0_0= ruleClick ) ) | ( (lv_action_1_0= ruleCheck ) ) | ( (lv_action_2_0= ruleFill ) ) | ( (lv_action_3_0= ruleClear ) ) | this_GoTo_4= ruleGoTo ) ;
    public final EObject ruleActionInstruction() throws RecognitionException {
        EObject current = null;

        EObject lv_action_0_0 = null;

        EObject lv_action_1_0 = null;

        EObject lv_action_2_0 = null;

        EObject lv_action_3_0 = null;

        EObject this_GoTo_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:947:28: ( ( ( (lv_action_0_0= ruleClick ) ) | ( (lv_action_1_0= ruleCheck ) ) | ( (lv_action_2_0= ruleFill ) ) | ( (lv_action_3_0= ruleClear ) ) | this_GoTo_4= ruleGoTo ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:948:1: ( ( (lv_action_0_0= ruleClick ) ) | ( (lv_action_1_0= ruleCheck ) ) | ( (lv_action_2_0= ruleFill ) ) | ( (lv_action_3_0= ruleClear ) ) | this_GoTo_4= ruleGoTo )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:948:1: ( ( (lv_action_0_0= ruleClick ) ) | ( (lv_action_1_0= ruleCheck ) ) | ( (lv_action_2_0= ruleFill ) ) | ( (lv_action_3_0= ruleClear ) ) | this_GoTo_4= ruleGoTo )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt12=1;
                }
                break;
            case 57:
                {
                alt12=2;
                }
                break;
            case 58:
                {
                alt12=3;
                }
                break;
            case 60:
                {
                alt12=4;
                }
                break;
            case 63:
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:948:2: ( (lv_action_0_0= ruleClick ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:948:2: ( (lv_action_0_0= ruleClick ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:949:1: (lv_action_0_0= ruleClick )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:949:1: (lv_action_0_0= ruleClick )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:950:3: lv_action_0_0= ruleClick
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionInstructionAccess().getActionClickParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClick_in_ruleActionInstruction1990);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:967:6: ( (lv_action_1_0= ruleCheck ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:967:6: ( (lv_action_1_0= ruleCheck ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:968:1: (lv_action_1_0= ruleCheck )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:968:1: (lv_action_1_0= ruleCheck )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:969:3: lv_action_1_0= ruleCheck
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionInstructionAccess().getActionCheckParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCheck_in_ruleActionInstruction2017);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:986:6: ( (lv_action_2_0= ruleFill ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:986:6: ( (lv_action_2_0= ruleFill ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:987:1: (lv_action_2_0= ruleFill )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:987:1: (lv_action_2_0= ruleFill )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:988:3: lv_action_2_0= ruleFill
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionInstructionAccess().getActionFillParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFill_in_ruleActionInstruction2044);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1005:6: ( (lv_action_3_0= ruleClear ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1005:6: ( (lv_action_3_0= ruleClear ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1006:1: (lv_action_3_0= ruleClear )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1006:1: (lv_action_3_0= ruleClear )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1007:3: lv_action_3_0= ruleClear
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionInstructionAccess().getActionClearParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClear_in_ruleActionInstruction2071);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1025:5: this_GoTo_4= ruleGoTo
                    {
                     
                            newCompositeNode(grammarAccess.getActionInstructionAccess().getGoToParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleGoTo_in_ruleActionInstruction2099);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1041:1: entryRuleVariableName returns [EObject current=null] : iv_ruleVariableName= ruleVariableName EOF ;
    public final EObject entryRuleVariableName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableName = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1042:2: (iv_ruleVariableName= ruleVariableName EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1043:2: iv_ruleVariableName= ruleVariableName EOF
            {
             newCompositeNode(grammarAccess.getVariableNameRule()); 
            pushFollow(FOLLOW_ruleVariableName_in_entryRuleVariableName2134);
            iv_ruleVariableName=ruleVariableName();

            state._fsp--;

             current =iv_ruleVariableName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableName2144); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1050:1: ruleVariableName returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleVariableName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1053:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1054:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1054:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1055:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1055:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1056:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariableName2185); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1080:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1081:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1082:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration2225);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration2235); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1089:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'var ' ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( (lv_val_3_0= ruleExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_1_0 = null;

        EObject lv_val_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1092:28: ( (otherlv_0= 'var ' ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( (lv_val_3_0= ruleExpression ) ) otherlv_4= ';' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1093:1: (otherlv_0= 'var ' ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( (lv_val_3_0= ruleExpression ) ) otherlv_4= ';' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1093:1: (otherlv_0= 'var ' ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( (lv_val_3_0= ruleExpression ) ) otherlv_4= ';' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1093:3: otherlv_0= 'var ' ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= ' = ' ( (lv_val_3_0= ruleExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleDeclaration2272); 

                	newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getVarKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1097:1: ( (lv_name_1_0= ruleVariableName ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1098:1: (lv_name_1_0= ruleVariableName )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1098:1: (lv_name_1_0= ruleVariableName )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1099:3: lv_name_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getNameVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleDeclaration2293);
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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleDeclaration2305); 

                	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getSpaceEqualsSignSpaceKeyword_2());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1119:1: ( (lv_val_3_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1120:1: (lv_val_3_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1120:1: (lv_val_3_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1121:3: lv_val_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getValExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleDeclaration2326);
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

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleDeclaration2338); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1149:1: entryRuleAssignation returns [EObject current=null] : iv_ruleAssignation= ruleAssignation EOF ;
    public final EObject entryRuleAssignation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignation = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1150:2: (iv_ruleAssignation= ruleAssignation EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1151:2: iv_ruleAssignation= ruleAssignation EOF
            {
             newCompositeNode(grammarAccess.getAssignationRule()); 
            pushFollow(FOLLOW_ruleAssignation_in_entryRuleAssignation2374);
            iv_ruleAssignation=ruleAssignation();

            state._fsp--;

             current =iv_ruleAssignation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignation2384); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1158:1: ruleAssignation returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariableReference ) ) otherlv_1= ' = ' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleAssignation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_var_0_0 = null;

        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1161:28: ( ( ( (lv_var_0_0= ruleVariableReference ) ) otherlv_1= ' = ' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1162:1: ( ( (lv_var_0_0= ruleVariableReference ) ) otherlv_1= ' = ' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1162:1: ( ( (lv_var_0_0= ruleVariableReference ) ) otherlv_1= ' = ' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1162:2: ( (lv_var_0_0= ruleVariableReference ) ) otherlv_1= ' = ' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1162:2: ( (lv_var_0_0= ruleVariableReference ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1163:1: (lv_var_0_0= ruleVariableReference )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1163:1: (lv_var_0_0= ruleVariableReference )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1164:3: lv_var_0_0= ruleVariableReference
            {
             
            	        newCompositeNode(grammarAccess.getAssignationAccess().getVarVariableReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableReference_in_ruleAssignation2430);
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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleAssignation2442); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignationAccess().getSpaceEqualsSignSpaceKeyword_1());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1184:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1185:1: (lv_expr_2_0= ruleExpression )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1185:1: (lv_expr_2_0= ruleExpression )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1186:3: lv_expr_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignationAccess().getExprExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignation2463);
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

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleAssignation2475); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1214:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1215:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1216:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2511);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2521); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1223:1: ruleExpression returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) | ( (lv_var_1_0= ruleVariable ) ) | ( (lv_act_2_0= ruleActionExpression ) ) | ( (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) ) | (otherlv_8= ' !' ( (lv_exp_9_0= ruleExpression ) ) ) ) ;
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
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1226:28: ( ( ( (lv_type_0_0= ruleType ) ) | ( (lv_var_1_0= ruleVariable ) ) | ( (lv_act_2_0= ruleActionExpression ) ) | ( (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) ) | (otherlv_8= ' !' ( (lv_exp_9_0= ruleExpression ) ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1227:1: ( ( (lv_type_0_0= ruleType ) ) | ( (lv_var_1_0= ruleVariable ) ) | ( (lv_act_2_0= ruleActionExpression ) ) | ( (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) ) | (otherlv_8= ' !' ( (lv_exp_9_0= ruleExpression ) ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1227:1: ( ( (lv_type_0_0= ruleType ) ) | ( (lv_var_1_0= ruleVariable ) ) | ( (lv_act_2_0= ruleActionExpression ) ) | ( (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) ) | (otherlv_8= ' !' ( (lv_exp_9_0= ruleExpression ) ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 41:
            case 42:
            case 43:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                alt14=2;
                }
                break;
            case 61:
            case 62:
                {
                alt14=3;
                }
                break;
            case 37:
            case 38:
            case 39:
                {
                alt14=4;
                }
                break;
            case 40:
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1227:2: ( (lv_type_0_0= ruleType ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1227:2: ( (lv_type_0_0= ruleType ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1228:1: (lv_type_0_0= ruleType )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1228:1: (lv_type_0_0= ruleType )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1229:3: lv_type_0_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getTypeTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleExpression2567);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1246:6: ( (lv_var_1_0= ruleVariable ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1246:6: ( (lv_var_1_0= ruleVariable ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1247:1: (lv_var_1_0= ruleVariable )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1247:1: (lv_var_1_0= ruleVariable )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1248:3: lv_var_1_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getVarVariableParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleExpression2594);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1265:6: ( (lv_act_2_0= ruleActionExpression ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1265:6: ( (lv_act_2_0= ruleActionExpression ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1266:1: (lv_act_2_0= ruleActionExpression )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1266:1: (lv_act_2_0= ruleActionExpression )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1267:3: lv_act_2_0= ruleActionExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getActActionExpressionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionExpression_in_ruleExpression2621);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1284:6: ( (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1284:6: ( (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1284:7: (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' ) ( (lv_left_6_0= ruleExpression ) ) ( (lv_right_7_0= ruleExpression ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1284:7: (otherlv_3= ' == ' | otherlv_4= ' > ' | otherlv_5= ' < ' )
                    int alt13=3;
                    switch ( input.LA(1) ) {
                    case 37:
                        {
                        alt13=1;
                        }
                        break;
                    case 38:
                        {
                        alt13=2;
                        }
                        break;
                    case 39:
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
                            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1284:9: otherlv_3= ' == '
                            {
                            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleExpression2641); 

                                	newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getSpaceEqualsSignEqualsSignSpaceKeyword_3_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1289:7: otherlv_4= ' > '
                            {
                            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleExpression2659); 

                                	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getSpaceGreaterThanSignSpaceKeyword_3_0_1());
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1294:7: otherlv_5= ' < '
                            {
                            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleExpression2677); 

                                	newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getSpaceLessThanSignSpaceKeyword_3_0_2());
                                

                            }
                            break;

                    }

                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1298:2: ( (lv_left_6_0= ruleExpression ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1299:1: (lv_left_6_0= ruleExpression )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1299:1: (lv_left_6_0= ruleExpression )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1300:3: lv_left_6_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getLeftExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression2699);
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

                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1316:2: ( (lv_right_7_0= ruleExpression ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1317:1: (lv_right_7_0= ruleExpression )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1317:1: (lv_right_7_0= ruleExpression )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1318:3: lv_right_7_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression2720);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1335:6: (otherlv_8= ' !' ( (lv_exp_9_0= ruleExpression ) ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1335:6: (otherlv_8= ' !' ( (lv_exp_9_0= ruleExpression ) ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1335:8: otherlv_8= ' !' ( (lv_exp_9_0= ruleExpression ) )
                    {
                    otherlv_8=(Token)match(input,40,FOLLOW_40_in_ruleExpression2740); 

                        	newLeafNode(otherlv_8, grammarAccess.getExpressionAccess().getSpaceExclamationMarkKeyword_4_0());
                        
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1339:1: ( (lv_exp_9_0= ruleExpression ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1340:1: (lv_exp_9_0= ruleExpression )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1340:1: (lv_exp_9_0= ruleExpression )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1341:3: lv_exp_9_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getExpExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression2761);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1365:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1366:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1367:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2799);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2810); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1374:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bool ' | kw= 'string ' | kw= 'int ' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1377:28: ( (kw= 'bool ' | kw= 'string ' | kw= 'int ' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1378:1: (kw= 'bool ' | kw= 'string ' | kw= 'int ' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1378:1: (kw= 'bool ' | kw= 'string ' | kw= 'int ' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt15=1;
                }
                break;
            case 42:
                {
                alt15=2;
                }
                break;
            case 43:
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1379:2: kw= 'bool '
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleType2848); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getBoolKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1386:2: kw= 'string '
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleType2867); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1393:2: kw= 'int '
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleType2886); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1406:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1407:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1408:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2926);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2936); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1415:1: ruleVariable returns [EObject current=null] : ( (lv_var_0_0= ruleVariableReference ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1418:28: ( ( (lv_var_0_0= ruleVariableReference ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1419:1: ( (lv_var_0_0= ruleVariableReference ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1419:1: ( (lv_var_0_0= ruleVariableReference ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1420:1: (lv_var_0_0= ruleVariableReference )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1420:1: (lv_var_0_0= ruleVariableReference )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1421:3: lv_var_0_0= ruleVariableReference
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getVarVariableReferenceParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableReference_in_ruleVariable2981);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1445:1: entryRuleActionExpression returns [EObject current=null] : iv_ruleActionExpression= ruleActionExpression EOF ;
    public final EObject entryRuleActionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionExpression = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1446:2: (iv_ruleActionExpression= ruleActionExpression EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1447:2: iv_ruleActionExpression= ruleActionExpression EOF
            {
             newCompositeNode(grammarAccess.getActionExpressionRule()); 
            pushFollow(FOLLOW_ruleActionExpression_in_entryRuleActionExpression3016);
            iv_ruleActionExpression=ruleActionExpression();

            state._fsp--;

             current =iv_ruleActionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionExpression3026); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1454:1: ruleActionExpression returns [EObject current=null] : ( ( (lv_expr_0_0= ruleVerify ) ) | ( (lv_expr_1_0= ruleExist ) ) ) ;
    public final EObject ruleActionExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;

        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1457:28: ( ( ( (lv_expr_0_0= ruleVerify ) ) | ( (lv_expr_1_0= ruleExist ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1458:1: ( ( (lv_expr_0_0= ruleVerify ) ) | ( (lv_expr_1_0= ruleExist ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1458:1: ( ( (lv_expr_0_0= ruleVerify ) ) | ( (lv_expr_1_0= ruleExist ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==61) ) {
                alt16=1;
            }
            else if ( (LA16_0==62) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1458:2: ( (lv_expr_0_0= ruleVerify ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1458:2: ( (lv_expr_0_0= ruleVerify ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1459:1: (lv_expr_0_0= ruleVerify )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1459:1: (lv_expr_0_0= ruleVerify )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1460:3: lv_expr_0_0= ruleVerify
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionExpressionAccess().getExprVerifyParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerify_in_ruleActionExpression3072);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1477:6: ( (lv_expr_1_0= ruleExist ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1477:6: ( (lv_expr_1_0= ruleExist ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1478:1: (lv_expr_1_0= ruleExist )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1478:1: (lv_expr_1_0= ruleExist )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1479:3: lv_expr_1_0= ruleExist
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionExpressionAccess().getExprExistParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExist_in_ruleActionExpression3099);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1503:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1504:2: (iv_ruleElement= ruleElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1505:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement3135);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement3145); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1512:1: ruleElement returns [EObject current=null] : (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_ClickableElement_0 = null;

        EObject this_FillableElement_1 = null;

        EObject this_CheckableElement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1515:28: ( (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1516:1: (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1516:1: (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 45:
            case 46:
            case 47:
                {
                alt17=1;
                }
                break;
            case 48:
                {
                alt17=2;
                }
                break;
            case 44:
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1517:5: this_ClickableElement_0= ruleClickableElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getClickableElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClickableElement_in_ruleElement3192);
                    this_ClickableElement_0=ruleClickableElement();

                    state._fsp--;

                     
                            current = this_ClickableElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1527:5: this_FillableElement_1= ruleFillableElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getFillableElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleElement3219);
                    this_FillableElement_1=ruleFillableElement();

                    state._fsp--;

                     
                            current = this_FillableElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1537:5: this_CheckableElement_2= ruleCheckableElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getCheckableElementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleElement3246);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1553:1: entryRuleClickableElement returns [EObject current=null] : iv_ruleClickableElement= ruleClickableElement EOF ;
    public final EObject entryRuleClickableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickableElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1554:2: (iv_ruleClickableElement= ruleClickableElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1555:2: iv_ruleClickableElement= ruleClickableElement EOF
            {
             newCompositeNode(grammarAccess.getClickableElementRule()); 
            pushFollow(FOLLOW_ruleClickableElement_in_entryRuleClickableElement3281);
            iv_ruleClickableElement=ruleClickableElement();

            state._fsp--;

             current =iv_ruleClickableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClickableElement3291); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1562:1: ruleClickableElement returns [EObject current=null] : (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage ) ;
    public final EObject ruleClickableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Link_0 = null;

        EObject this_Button_1 = null;

        EObject this_Image_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1565:28: ( (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1566:1: (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1566:1: (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt18=1;
                }
                break;
            case 46:
                {
                alt18=2;
                }
                break;
            case 47:
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1567:5: this_Link_0= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getClickableElementAccess().getLinkParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleClickableElement3338);
                    this_Link_0=ruleLink();

                    state._fsp--;

                     
                            current = this_Link_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1577:5: this_Button_1= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getClickableElementAccess().getButtonParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleClickableElement3365);
                    this_Button_1=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1587:5: this_Image_2= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getClickableElementAccess().getImageParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleClickableElement3392);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1603:1: entryRuleFillableElement returns [EObject current=null] : iv_ruleFillableElement= ruleFillableElement EOF ;
    public final EObject entryRuleFillableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFillableElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1604:2: (iv_ruleFillableElement= ruleFillableElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1605:2: iv_ruleFillableElement= ruleFillableElement EOF
            {
             newCompositeNode(grammarAccess.getFillableElementRule()); 
            pushFollow(FOLLOW_ruleFillableElement_in_entryRuleFillableElement3427);
            iv_ruleFillableElement=ruleFillableElement();

            state._fsp--;

             current =iv_ruleFillableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFillableElement3437); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1612:1: ruleFillableElement returns [EObject current=null] : this_TextField_0= ruleTextField ;
    public final EObject ruleFillableElement() throws RecognitionException {
        EObject current = null;

        EObject this_TextField_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1615:28: (this_TextField_0= ruleTextField )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1617:5: this_TextField_0= ruleTextField
            {
             
                    newCompositeNode(grammarAccess.getFillableElementAccess().getTextFieldParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTextField_in_ruleFillableElement3483);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1633:1: entryRuleCheckableElement returns [EObject current=null] : iv_ruleCheckableElement= ruleCheckableElement EOF ;
    public final EObject entryRuleCheckableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckableElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1634:2: (iv_ruleCheckableElement= ruleCheckableElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1635:2: iv_ruleCheckableElement= ruleCheckableElement EOF
            {
             newCompositeNode(grammarAccess.getCheckableElementRule()); 
            pushFollow(FOLLOW_ruleCheckableElement_in_entryRuleCheckableElement3517);
            iv_ruleCheckableElement=ruleCheckableElement();

            state._fsp--;

             current =iv_ruleCheckableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckableElement3527); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1642:1: ruleCheckableElement returns [EObject current=null] : this_Checkbox_0= ruleCheckbox ;
    public final EObject ruleCheckableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Checkbox_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1645:28: (this_Checkbox_0= ruleCheckbox )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1647:5: this_Checkbox_0= ruleCheckbox
            {
             
                    newCompositeNode(grammarAccess.getCheckableElementAccess().getCheckboxParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleCheckbox_in_ruleCheckableElement3573);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1663:1: entryRuleCheckbox returns [EObject current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final EObject entryRuleCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckbox = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1664:2: (iv_ruleCheckbox= ruleCheckbox EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1665:2: iv_ruleCheckbox= ruleCheckbox EOF
            {
             newCompositeNode(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_ruleCheckbox_in_entryRuleCheckbox3607);
            iv_ruleCheckbox=ruleCheckbox();

            state._fsp--;

             current =iv_ruleCheckbox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckbox3617); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1672:1: ruleCheckbox returns [EObject current=null] : (otherlv_0= 'checkbox ' ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) ;
    public final EObject ruleCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_check_1_0=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1675:28: ( (otherlv_0= 'checkbox ' ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1676:1: (otherlv_0= 'checkbox ' ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1676:1: (otherlv_0= 'checkbox ' ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1676:3: otherlv_0= 'checkbox ' ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleCheckbox3654); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1680:1: ( ( (lv_check_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1680:2: ( (lv_check_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1680:2: ( (lv_check_1_0= RULE_STRING ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1681:1: (lv_check_1_0= RULE_STRING )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1681:1: (lv_check_1_0= RULE_STRING )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1682:3: lv_check_1_0= RULE_STRING
                    {
                    lv_check_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckbox3672); 

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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1700:5: this_Variable_2= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getCheckboxAccess().getVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleCheckbox3705);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1716:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1717:2: (iv_ruleLink= ruleLink EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1718:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink3741);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink3751); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1725:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link ' ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_link_1_0=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1728:28: ( (otherlv_0= 'link ' ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1729:1: (otherlv_0= 'link ' ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1729:1: (otherlv_0= 'link ' ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1729:3: otherlv_0= 'link ' ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleLink3788); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1733:1: ( ( (lv_link_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1733:2: ( (lv_link_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1733:2: ( (lv_link_1_0= RULE_STRING ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1734:1: (lv_link_1_0= RULE_STRING )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1734:1: (lv_link_1_0= RULE_STRING )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1735:3: lv_link_1_0= RULE_STRING
                    {
                    lv_link_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink3806); 

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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1753:5: this_Variable_2= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getLinkAccess().getVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleLink3839);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1769:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1770:2: (iv_ruleButton= ruleButton EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1771:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton3875);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton3885); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1778:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button ' ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_but_1_0=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1781:28: ( (otherlv_0= 'button ' ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1782:1: (otherlv_0= 'button ' ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1782:1: (otherlv_0= 'button ' ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1782:3: otherlv_0= 'button ' ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleButton3922); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1786:1: ( ( (lv_but_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1786:2: ( (lv_but_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1786:2: ( (lv_but_1_0= RULE_STRING ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1787:1: (lv_but_1_0= RULE_STRING )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1787:1: (lv_but_1_0= RULE_STRING )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1788:3: lv_but_1_0= RULE_STRING
                    {
                    lv_but_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButton3940); 

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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1806:5: this_Variable_2= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getButtonAccess().getVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleButton3973);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1822:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1823:2: (iv_ruleImage= ruleImage EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1824:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage4009);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage4019); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1831:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image ' ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_img_1_0=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1834:28: ( (otherlv_0= 'image ' ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1835:1: (otherlv_0= 'image ' ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1835:1: (otherlv_0= 'image ' ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1835:3: otherlv_0= 'image ' ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleImage4056); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1839:1: ( ( (lv_img_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1839:2: ( (lv_img_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1839:2: ( (lv_img_1_0= RULE_STRING ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1840:1: (lv_img_1_0= RULE_STRING )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1840:1: (lv_img_1_0= RULE_STRING )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1841:3: lv_img_1_0= RULE_STRING
                    {
                    lv_img_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImage4074); 

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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1859:5: this_Variable_2= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getImageAccess().getVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleImage4107);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1875:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1876:2: (iv_ruleTextField= ruleTextField EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1877:2: iv_ruleTextField= ruleTextField EOF
            {
             newCompositeNode(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_ruleTextField_in_entryRuleTextField4143);
            iv_ruleTextField=ruleTextField();

            state._fsp--;

             current =iv_ruleTextField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextField4153); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1884:1: ruleTextField returns [EObject current=null] : (otherlv_0= 'textField ' ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        EObject this_Variable_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1887:28: ( (otherlv_0= 'textField ' ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1888:1: (otherlv_0= 'textField ' ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1888:1: (otherlv_0= 'textField ' ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1888:3: otherlv_0= 'textField ' ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleTextField4190); 

                	newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1892:1: ( ( (lv_text_1_0= RULE_STRING ) ) | this_Variable_2= ruleVariable )
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1892:2: ( (lv_text_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1892:2: ( (lv_text_1_0= RULE_STRING ) )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1893:1: (lv_text_1_0= RULE_STRING )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1893:1: (lv_text_1_0= RULE_STRING )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1894:3: lv_text_1_0= RULE_STRING
                    {
                    lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextField4208); 

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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1912:5: this_Variable_2= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getTextFieldAccess().getVariableParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleTextField4241);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1928:1: entryRuleTypeElement returns [EObject current=null] : iv_ruleTypeElement= ruleTypeElement EOF ;
    public final EObject entryRuleTypeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1929:2: (iv_ruleTypeElement= ruleTypeElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1930:2: iv_ruleTypeElement= ruleTypeElement EOF
            {
             newCompositeNode(grammarAccess.getTypeElementRule()); 
            pushFollow(FOLLOW_ruleTypeElement_in_entryRuleTypeElement4277);
            iv_ruleTypeElement=ruleTypeElement();

            state._fsp--;

             current =iv_ruleTypeElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeElement4287); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1937:1: ruleTypeElement returns [EObject current=null] : ( ( (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' ) ) ) ;
    public final EObject ruleTypeElement() throws RecognitionException {
        EObject current = null;

        Token lv_elem_0_1=null;
        Token lv_elem_0_2=null;
        Token lv_elem_0_3=null;
        Token lv_elem_0_4=null;
        Token lv_elem_0_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1940:28: ( ( ( (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1941:1: ( ( (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1941:1: ( ( (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1942:1: ( (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1942:1: ( (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1943:1: (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1943:1: (lv_elem_0_1= 'checkbox' | lv_elem_0_2= 'link' | lv_elem_0_3= 'button' | lv_elem_0_4= 'image' | lv_elem_0_5= 'textField' )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt24=1;
                }
                break;
            case 50:
                {
                alt24=2;
                }
                break;
            case 51:
                {
                alt24=3;
                }
                break;
            case 52:
                {
                alt24=4;
                }
                break;
            case 53:
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1944:3: lv_elem_0_1= 'checkbox'
                    {
                    lv_elem_0_1=(Token)match(input,49,FOLLOW_49_in_ruleTypeElement4331); 

                            newLeafNode(lv_elem_0_1, grammarAccess.getTypeElementAccess().getElemCheckboxKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeElementRule());
                    	        }
                           		setWithLastConsumed(current, "elem", lv_elem_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1956:8: lv_elem_0_2= 'link'
                    {
                    lv_elem_0_2=(Token)match(input,50,FOLLOW_50_in_ruleTypeElement4360); 

                            newLeafNode(lv_elem_0_2, grammarAccess.getTypeElementAccess().getElemLinkKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeElementRule());
                    	        }
                           		setWithLastConsumed(current, "elem", lv_elem_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1968:8: lv_elem_0_3= 'button'
                    {
                    lv_elem_0_3=(Token)match(input,51,FOLLOW_51_in_ruleTypeElement4389); 

                            newLeafNode(lv_elem_0_3, grammarAccess.getTypeElementAccess().getElemButtonKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeElementRule());
                    	        }
                           		setWithLastConsumed(current, "elem", lv_elem_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1980:8: lv_elem_0_4= 'image'
                    {
                    lv_elem_0_4=(Token)match(input,52,FOLLOW_52_in_ruleTypeElement4418); 

                            newLeafNode(lv_elem_0_4, grammarAccess.getTypeElementAccess().getElemImageKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeElementRule());
                    	        }
                           		setWithLastConsumed(current, "elem", lv_elem_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:1992:8: lv_elem_0_5= 'textField'
                    {
                    lv_elem_0_5=(Token)match(input,53,FOLLOW_53_in_ruleTypeElement4447); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2015:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2016:2: (iv_ruleSelect= ruleSelect EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2017:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect4498);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect4508); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2024:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select(' ( (lv_value_1_0= ruleTypeElement ) ) otherlv_2= ')' ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2027:28: ( (otherlv_0= 'select(' ( (lv_value_1_0= ruleTypeElement ) ) otherlv_2= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2028:1: (otherlv_0= 'select(' ( (lv_value_1_0= ruleTypeElement ) ) otherlv_2= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2028:1: (otherlv_0= 'select(' ( (lv_value_1_0= ruleTypeElement ) ) otherlv_2= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2028:3: otherlv_0= 'select(' ( (lv_value_1_0= ruleTypeElement ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleSelect4545); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2032:1: ( (lv_value_1_0= ruleTypeElement ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2033:1: (lv_value_1_0= ruleTypeElement )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2033:1: (lv_value_1_0= ruleTypeElement )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2034:3: lv_value_1_0= ruleTypeElement
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getValueTypeElementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeElement_in_ruleSelect4566);
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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSelect4578); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2062:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2063:2: (iv_ruleClick= ruleClick EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2064:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_ruleClick_in_entryRuleClick4614);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClick4624); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2071:1: ruleClick returns [EObject current=null] : (otherlv_0= 'click(' ( ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_val_1_1 = null;

        EObject lv_val_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2074:28: ( (otherlv_0= 'click(' ( ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2075:1: (otherlv_0= 'click(' ( ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2075:1: (otherlv_0= 'click(' ( ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2075:3: otherlv_0= 'click(' ( ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleClick4661); 

                	newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2079:1: ( ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2080:1: ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2080:1: ( (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2081:1: (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2081:1: (lv_val_1_1= ruleClickableElement | lv_val_1_2= ruleSelect )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=45 && LA25_0<=47)) ) {
                alt25=1;
            }
            else if ( (LA25_0==54) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2082:3: lv_val_1_1= ruleClickableElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getClickAccess().getValClickableElementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClickableElement_in_ruleClick4684);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2097:8: lv_val_1_2= ruleSelect
                    {
                     
                    	        newCompositeNode(grammarAccess.getClickAccess().getValSelectParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleSelect_in_ruleClick4703);
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

            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleClick4718); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2127:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2128:2: (iv_ruleCheck= ruleCheck EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2129:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck4754);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck4764); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2136:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'check(' ( ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_val_1_1 = null;

        EObject lv_val_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2139:28: ( (otherlv_0= 'check(' ( ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2140:1: (otherlv_0= 'check(' ( ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2140:1: (otherlv_0= 'check(' ( ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2140:3: otherlv_0= 'check(' ( ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleCheck4801); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2144:1: ( ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2145:1: ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2145:1: ( (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2146:1: (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2146:1: (lv_val_1_1= ruleCheckableElement | lv_val_1_2= ruleSelect )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            else if ( (LA26_0==54) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2147:3: lv_val_1_1= ruleCheckableElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckAccess().getValCheckableElementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleCheck4824);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2162:8: lv_val_1_2= ruleSelect
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckAccess().getValSelectParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleSelect_in_ruleCheck4843);
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

            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleCheck4858); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2192:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2193:2: (iv_ruleFill= ruleFill EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2194:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_ruleFill_in_entryRuleFill4894);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFill4904); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2201:1: ruleFill returns [EObject current=null] : (otherlv_0= 'fill(' ( ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ');' ) ;
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
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2204:28: ( (otherlv_0= 'fill(' ( ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2205:1: (otherlv_0= 'fill(' ( ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2205:1: (otherlv_0= 'fill(' ( ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2205:3: otherlv_0= 'fill(' ( ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ');'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleFill4941); 

                	newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2209:1: ( ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2210:1: ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2210:1: ( (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2211:1: (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2211:1: (lv_val_1_1= ruleFillableElement | lv_val_1_2= ruleSelect )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==48) ) {
                alt27=1;
            }
            else if ( (LA27_0==54) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2212:3: lv_val_1_1= ruleFillableElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getFillAccess().getValFillableElementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleFill4964);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2227:8: lv_val_1_2= ruleSelect
                    {
                     
                    	        newCompositeNode(grammarAccess.getFillAccess().getValSelectParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleSelect_in_ruleFill4983);
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

            otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleFill4998); 

                	newLeafNode(otherlv_2, grammarAccess.getFillAccess().getValueKeyword_2());
                
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFill5009); 
             
                newLeafNode(this_STRING_3, grammarAccess.getFillAccess().getSTRINGTerminalRuleCall_3()); 
                
            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleFill5020); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2265:1: entryRuleClear returns [EObject current=null] : iv_ruleClear= ruleClear EOF ;
    public final EObject entryRuleClear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClear = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2266:2: (iv_ruleClear= ruleClear EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2267:2: iv_ruleClear= ruleClear EOF
            {
             newCompositeNode(grammarAccess.getClearRule()); 
            pushFollow(FOLLOW_ruleClear_in_entryRuleClear5056);
            iv_ruleClear=ruleClear();

            state._fsp--;

             current =iv_ruleClear; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClear5066); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2274:1: ruleClear returns [EObject current=null] : (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ');' ) ;
    public final EObject ruleClear() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_FillableElement_1 = null;

        EObject this_CheckableElement_2 = null;

        EObject this_Select_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2277:28: ( (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2278:1: (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2278:1: (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2278:3: otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ');'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleClear5103); 

                	newLeafNode(otherlv_0, grammarAccess.getClearAccess().getClearKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2282:1: (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt28=1;
                }
                break;
            case 44:
                {
                alt28=2;
                }
                break;
            case 54:
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2283:5: this_FillableElement_1= ruleFillableElement
                    {
                     
                            newCompositeNode(grammarAccess.getClearAccess().getFillableElementParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleClear5126);
                    this_FillableElement_1=ruleFillableElement();

                    state._fsp--;

                     
                            current = this_FillableElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2293:5: this_CheckableElement_2= ruleCheckableElement
                    {
                     
                            newCompositeNode(grammarAccess.getClearAccess().getCheckableElementParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleClear5153);
                    this_CheckableElement_2=ruleCheckableElement();

                    state._fsp--;

                     
                            current = this_CheckableElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2303:5: this_Select_3= ruleSelect
                    {
                     
                            newCompositeNode(grammarAccess.getClearAccess().getSelectParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleSelect_in_ruleClear5180);
                    this_Select_3=ruleSelect();

                    state._fsp--;

                     
                            current = this_Select_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleClear5192); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2323:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2324:2: (iv_ruleVerify= ruleVerify EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2325:2: iv_ruleVerify= ruleVerify EOF
            {
             newCompositeNode(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_ruleVerify_in_entryRuleVerify5228);
            iv_ruleVerify=ruleVerify();

            state._fsp--;

             current =iv_ruleVerify; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerify5238); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2332:1: ruleVerify returns [EObject current=null] : (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ', value=' this_STRING_5= RULE_STRING otherlv_6= ');' ) ;
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
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2335:28: ( (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ', value=' this_STRING_5= RULE_STRING otherlv_6= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2336:1: (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ', value=' this_STRING_5= RULE_STRING otherlv_6= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2336:1: (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ', value=' this_STRING_5= RULE_STRING otherlv_6= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2336:3: otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect ) otherlv_4= ', value=' this_STRING_5= RULE_STRING otherlv_6= ');'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleVerify5275); 

                	newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2340:1: (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement | this_Select_3= ruleSelect )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt29=1;
                }
                break;
            case 44:
                {
                alt29=2;
                }
                break;
            case 54:
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2341:5: this_FillableElement_1= ruleFillableElement
                    {
                     
                            newCompositeNode(grammarAccess.getVerifyAccess().getFillableElementParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleVerify5298);
                    this_FillableElement_1=ruleFillableElement();

                    state._fsp--;

                     
                            current = this_FillableElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2351:5: this_CheckableElement_2= ruleCheckableElement
                    {
                     
                            newCompositeNode(grammarAccess.getVerifyAccess().getCheckableElementParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleVerify5325);
                    this_CheckableElement_2=ruleCheckableElement();

                    state._fsp--;

                     
                            current = this_CheckableElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2361:5: this_Select_3= ruleSelect
                    {
                     
                            newCompositeNode(grammarAccess.getVerifyAccess().getSelectParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleSelect_in_ruleVerify5352);
                    this_Select_3=ruleSelect();

                    state._fsp--;

                     
                            current = this_Select_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,59,FOLLOW_59_in_ruleVerify5364); 

                	newLeafNode(otherlv_4, grammarAccess.getVerifyAccess().getValueKeyword_2());
                
            this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVerify5375); 
             
                newLeafNode(this_STRING_5, grammarAccess.getVerifyAccess().getSTRINGTerminalRuleCall_3()); 
                
            otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleVerify5386); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2389:1: entryRuleExist returns [EObject current=null] : iv_ruleExist= ruleExist EOF ;
    public final EObject entryRuleExist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExist = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2390:2: (iv_ruleExist= ruleExist EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2391:2: iv_ruleExist= ruleExist EOF
            {
             newCompositeNode(grammarAccess.getExistRule()); 
            pushFollow(FOLLOW_ruleExist_in_entryRuleExist5422);
            iv_ruleExist=ruleExist();

            state._fsp--;

             current =iv_ruleExist; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExist5432); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2398:1: ruleExist returns [EObject current=null] : (otherlv_0= 'exist(' ( ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' ) ;
    public final EObject ruleExist() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_val_1_1 = null;

        EObject lv_val_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2401:28: ( (otherlv_0= 'exist(' ( ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2402:1: (otherlv_0= 'exist(' ( ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2402:1: (otherlv_0= 'exist(' ( ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2402:3: otherlv_0= 'exist(' ( ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) ) ) otherlv_2= ');'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleExist5469); 

                	newLeafNode(otherlv_0, grammarAccess.getExistAccess().getExistKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2406:1: ( ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2407:1: ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2407:1: ( (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2408:1: (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2408:1: (lv_val_1_1= ruleElement | lv_val_1_2= ruleSelect )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=44 && LA30_0<=48)) ) {
                alt30=1;
            }
            else if ( (LA30_0==54) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2409:3: lv_val_1_1= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getExistAccess().getValElementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElement_in_ruleExist5492);
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
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2424:8: lv_val_1_2= ruleSelect
                    {
                     
                    	        newCompositeNode(grammarAccess.getExistAccess().getValSelectParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleSelect_in_ruleExist5511);
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

            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleExist5526); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2454:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2455:2: (iv_ruleGoTo= ruleGoTo EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2456:2: iv_ruleGoTo= ruleGoTo EOF
            {
             newCompositeNode(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_ruleGoTo_in_entryRuleGoTo5562);
            iv_ruleGoTo=ruleGoTo();

            state._fsp--;

             current =iv_ruleGoTo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoTo5572); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2463:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ');' ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2466:28: ( (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ');' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2467:1: (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ');' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2467:1: (otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ');' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2467:3: otherlv_0= 'goTo(' ( (lv_url_1_0= RULE_URL ) ) otherlv_2= ');'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleGoTo5609); 

                	newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGoToKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2471:1: ( (lv_url_1_0= RULE_URL ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2472:1: (lv_url_1_0= RULE_URL )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2472:1: (lv_url_1_0= RULE_URL )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2473:3: lv_url_1_0= RULE_URL
            {
            lv_url_1_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleGoTo5626); 

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

            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleGoTo5643); 

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


    // $ANTLR start "ruleOpenBrowser"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2501:1: ruleOpenBrowser returns [Enumerator current=null] : ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) ) ;
    public final Enumerator ruleOpenBrowser() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2503:28: ( ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2504:1: ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2504:1: ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Firefox' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==64) ) {
                alt31=1;
            }
            else if ( (LA31_0==65) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2504:2: (enumLiteral_0= 'Chrome' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2504:2: (enumLiteral_0= 'Chrome' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2504:4: enumLiteral_0= 'Chrome'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_64_in_ruleOpenBrowser5693); 

                            current = grammarAccess.getOpenBrowserAccess().getChromeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOpenBrowserAccess().getChromeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2510:6: (enumLiteral_1= 'Firefox' )
                    {
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2510:6: (enumLiteral_1= 'Firefox' )
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:2510:8: enumLiteral_1= 'Firefox'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_65_in_ruleOpenBrowser5710); 

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
    public static final BitSet FOLLOW_17_in_ruleFunctionCall818 = new BitSet(new long[]{0x60000FE000000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall839 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionCall852 = new BitSet(new long[]{0x60000FE000000010L});
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
    public static final BitSet FOLLOW_20_in_ruleBody1166 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBody1178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleOpenBrowser_in_ruleBody1199 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBody1211 = new BitSet(new long[]{0x9680000482000010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBody1232 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleBody1245 = new BitSet(new long[]{0x9680000482000010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBody1266 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleBody1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction1316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleInstruction1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleInstruction1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleInstruction1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionInstruction_in_ruleInstruction1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignation_in_ruleInstruction1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleInstruction1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCondition1590 = new BitSet(new long[]{0x000000000C020000L});
    public static final BitSet FOLLOW_26_in_ruleCondition1603 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_27_in_ruleCondition1621 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCondition1635 = new BitSet(new long[]{0x60000FE000000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition1656 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCondition1668 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCondition1680 = new BitSet(new long[]{0x9680000482000010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleCondition1701 = new BitSet(new long[]{0x96800004A2000010L});
    public static final BitSet FOLLOW_29_in_ruleCondition1714 = new BitSet(new long[]{0x9680000482000010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleCondition1735 = new BitSet(new long[]{0x96800004C2000010L});
    public static final BitSet FOLLOW_30_in_ruleCondition1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile1784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleWhile1831 = new BitSet(new long[]{0x60000FE000000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhile1852 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleWhile1864 = new BitSet(new long[]{0x9680000482000010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleWhile1885 = new BitSet(new long[]{0x9680000682000010L});
    public static final BitSet FOLLOW_33_in_ruleWhile1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionInstruction_in_entryRuleActionInstruction1934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionInstruction1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_ruleActionInstruction1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleActionInstruction2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_ruleActionInstruction2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClear_in_ruleActionInstruction2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_ruleActionInstruction2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName2134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariableName2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration2225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDeclaration2272 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleDeclaration2293 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDeclaration2305 = new BitSet(new long[]{0x60000FE000000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDeclaration2326 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleDeclaration2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignation_in_entryRuleAssignation2374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignation2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAssignation2430 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleAssignation2442 = new BitSet(new long[]{0x60000FE000000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignation2463 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleAssignation2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleExpression2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExpression2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_in_ruleExpression2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleExpression2641 = new BitSet(new long[]{0x60000FE000000010L});
    public static final BitSet FOLLOW_38_in_ruleExpression2659 = new BitSet(new long[]{0x60000FE000000010L});
    public static final BitSet FOLLOW_39_in_ruleExpression2677 = new BitSet(new long[]{0x60000FE000000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression2699 = new BitSet(new long[]{0x60000FE000000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleExpression2740 = new BitSet(new long[]{0x60000FE000000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleType2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleType2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleType2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleVariable2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_in_entryRuleActionExpression3016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionExpression3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_ruleActionExpression3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExist_in_ruleActionExpression3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement3135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickableElement_in_ruleElement3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleElement3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleElement3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickableElement_in_entryRuleClickableElement3281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClickableElement3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleClickableElement3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleClickableElement3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleClickableElement3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFillableElement_in_entryRuleFillableElement3427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFillableElement3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_ruleFillableElement3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_entryRuleCheckableElement3517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckableElement3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_ruleCheckableElement3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_entryRuleCheckbox3607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckbox3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCheckbox3654 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckbox3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCheckbox3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink3741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleLink3788 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLink3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton3875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleButton3922 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButton3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleButton3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage4009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleImage4056 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImage4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleImage4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField4143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextField4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTextField4190 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextField4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTextField4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeElement_in_entryRuleTypeElement4277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeElement4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTypeElement4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTypeElement4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTypeElement4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTypeElement4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTypeElement4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect4498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleSelect4545 = new BitSet(new long[]{0x003E000000000000L});
    public static final BitSet FOLLOW_ruleTypeElement_in_ruleSelect4566 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSelect4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_entryRuleClick4614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClick4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleClick4661 = new BitSet(new long[]{0x0040E00000000000L});
    public static final BitSet FOLLOW_ruleClickableElement_in_ruleClick4684 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleClick4703 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleClick4718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_entryRuleCheck4754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheck4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCheck4801 = new BitSet(new long[]{0x0040F00000000000L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleCheck4824 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleCheck4843 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleCheck4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_entryRuleFill4894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFill4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFill4941 = new BitSet(new long[]{0x0041E00000000000L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleFill4964 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleFill4983 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleFill4998 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFill5009 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleFill5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClear_in_entryRuleClear5056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClear5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleClear5103 = new BitSet(new long[]{0x0041F00000000000L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleClear5126 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleClear5153 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleClear5180 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleClear5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_entryRuleVerify5228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerify5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleVerify5275 = new BitSet(new long[]{0x0041F00000000000L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleVerify5298 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleVerify5325 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleVerify5352 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleVerify5364 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVerify5375 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleVerify5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExist_in_entryRuleExist5422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExist5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleExist5469 = new BitSet(new long[]{0x0041F00000000000L});
    public static final BitSet FOLLOW_ruleElement_in_ruleExist5492 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleExist5511 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleExist5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_entryRuleGoTo5562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoTo5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleGoTo5609 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleGoTo5626 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleGoTo5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOpenBrowser5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOpenBrowser5710 = new BitSet(new long[]{0x0000000000000002L});

}