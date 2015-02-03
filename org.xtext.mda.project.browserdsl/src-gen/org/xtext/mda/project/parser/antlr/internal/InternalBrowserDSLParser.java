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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'click('", "')'", "'fill('", "', value='", "'clear('", "'verify('", "'exist('", "'checkbox '", "'link '", "'button '", "'image '", "'textField '", "'url '"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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
        	return "Model";	
       	}
       	
       	@Override
       	protected BrowserDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:76:1: ruleModel returns [EObject current=null] : ( (lv_actions_0_0= ruleAction ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:79:28: ( ( (lv_actions_0_0= ruleAction ) )* )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:80:1: ( (lv_actions_0_0= ruleAction ) )*
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:80:1: ( (lv_actions_0_0= ruleAction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13||(LA1_0>=15 && LA1_0<=17)||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:81:1: (lv_actions_0_0= ruleAction )
            	    {
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:81:1: (lv_actions_0_0= ruleAction )
            	    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:82:3: lv_actions_0_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getActionsActionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleModel130);
            	    lv_actions_0_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_0_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:106:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:107:2: (iv_ruleAction= ruleAction EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:108:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction166);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction176); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:115:1: ruleAction returns [EObject current=null] : (this_Click_0= ruleClick | this_Fill_1= ruleFill | this_Clear_2= ruleClear | this_Verify_3= ruleVerify | this_Exist_4= ruleExist | this_GoTo_5= ruleGoTo ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;

        EObject this_Fill_1 = null;

        EObject this_Clear_2 = null;

        EObject this_Verify_3 = null;

        EObject this_Exist_4 = null;

        EObject this_GoTo_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:118:28: ( (this_Click_0= ruleClick | this_Fill_1= ruleFill | this_Clear_2= ruleClear | this_Verify_3= ruleVerify | this_Exist_4= ruleExist | this_GoTo_5= ruleGoTo ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:119:1: (this_Click_0= ruleClick | this_Fill_1= ruleFill | this_Clear_2= ruleClear | this_Verify_3= ruleVerify | this_Exist_4= ruleExist | this_GoTo_5= ruleGoTo )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:119:1: (this_Click_0= ruleClick | this_Fill_1= ruleFill | this_Clear_2= ruleClear | this_Verify_3= ruleVerify | this_Exist_4= ruleExist | this_GoTo_5= ruleGoTo )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 23:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:120:5: this_Click_0= ruleClick
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getClickParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClick_in_ruleAction223);
                    this_Click_0=ruleClick();

                    state._fsp--;

                     
                            current = this_Click_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:130:5: this_Fill_1= ruleFill
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getFillParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFill_in_ruleAction250);
                    this_Fill_1=ruleFill();

                    state._fsp--;

                     
                            current = this_Fill_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:140:5: this_Clear_2= ruleClear
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getClearParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleClear_in_ruleAction277);
                    this_Clear_2=ruleClear();

                    state._fsp--;

                     
                            current = this_Clear_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:150:5: this_Verify_3= ruleVerify
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getVerifyParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleVerify_in_ruleAction304);
                    this_Verify_3=ruleVerify();

                    state._fsp--;

                     
                            current = this_Verify_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:160:5: this_Exist_4= ruleExist
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getExistParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleExist_in_ruleAction331);
                    this_Exist_4=ruleExist();

                    state._fsp--;

                     
                            current = this_Exist_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:170:5: this_GoTo_5= ruleGoTo
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getGoToParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleGoTo_in_ruleAction358);
                    this_GoTo_5=ruleGoTo();

                    state._fsp--;

                     
                            current = this_GoTo_5; 
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleElement"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:186:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:187:2: (iv_ruleElement= ruleElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:188:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement393);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement403); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:195:1: ruleElement returns [EObject current=null] : (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_ClickableElement_0 = null;

        EObject this_FillableElement_1 = null;

        EObject this_CheckableElement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:198:28: ( (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:199:1: (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:199:1: (this_ClickableElement_0= ruleClickableElement | this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 19:
            case 20:
            case 21:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:200:5: this_ClickableElement_0= ruleClickableElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getClickableElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClickableElement_in_ruleElement450);
                    this_ClickableElement_0=ruleClickableElement();

                    state._fsp--;

                     
                            current = this_ClickableElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:210:5: this_FillableElement_1= ruleFillableElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getFillableElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleElement477);
                    this_FillableElement_1=ruleFillableElement();

                    state._fsp--;

                     
                            current = this_FillableElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:220:5: this_CheckableElement_2= ruleCheckableElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getCheckableElementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleElement504);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:236:1: entryRuleClickableElement returns [EObject current=null] : iv_ruleClickableElement= ruleClickableElement EOF ;
    public final EObject entryRuleClickableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickableElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:237:2: (iv_ruleClickableElement= ruleClickableElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:238:2: iv_ruleClickableElement= ruleClickableElement EOF
            {
             newCompositeNode(grammarAccess.getClickableElementRule()); 
            pushFollow(FOLLOW_ruleClickableElement_in_entryRuleClickableElement539);
            iv_ruleClickableElement=ruleClickableElement();

            state._fsp--;

             current =iv_ruleClickableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClickableElement549); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:245:1: ruleClickableElement returns [EObject current=null] : (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage ) ;
    public final EObject ruleClickableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Link_0 = null;

        EObject this_Button_1 = null;

        EObject this_Image_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:248:28: ( (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:249:1: (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:249:1: (this_Link_0= ruleLink | this_Button_1= ruleButton | this_Image_2= ruleImage )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:250:5: this_Link_0= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getClickableElementAccess().getLinkParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleClickableElement596);
                    this_Link_0=ruleLink();

                    state._fsp--;

                     
                            current = this_Link_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:260:5: this_Button_1= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getClickableElementAccess().getButtonParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleClickableElement623);
                    this_Button_1=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:270:5: this_Image_2= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getClickableElementAccess().getImageParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleClickableElement650);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:286:1: entryRuleFillableElement returns [EObject current=null] : iv_ruleFillableElement= ruleFillableElement EOF ;
    public final EObject entryRuleFillableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFillableElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:287:2: (iv_ruleFillableElement= ruleFillableElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:288:2: iv_ruleFillableElement= ruleFillableElement EOF
            {
             newCompositeNode(grammarAccess.getFillableElementRule()); 
            pushFollow(FOLLOW_ruleFillableElement_in_entryRuleFillableElement685);
            iv_ruleFillableElement=ruleFillableElement();

            state._fsp--;

             current =iv_ruleFillableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFillableElement695); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:295:1: ruleFillableElement returns [EObject current=null] : this_TextField_0= ruleTextField ;
    public final EObject ruleFillableElement() throws RecognitionException {
        EObject current = null;

        EObject this_TextField_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:298:28: (this_TextField_0= ruleTextField )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:300:5: this_TextField_0= ruleTextField
            {
             
                    newCompositeNode(grammarAccess.getFillableElementAccess().getTextFieldParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTextField_in_ruleFillableElement741);
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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:316:1: entryRuleCheckableElement returns [EObject current=null] : iv_ruleCheckableElement= ruleCheckableElement EOF ;
    public final EObject entryRuleCheckableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckableElement = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:317:2: (iv_ruleCheckableElement= ruleCheckableElement EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:318:2: iv_ruleCheckableElement= ruleCheckableElement EOF
            {
             newCompositeNode(grammarAccess.getCheckableElementRule()); 
            pushFollow(FOLLOW_ruleCheckableElement_in_entryRuleCheckableElement775);
            iv_ruleCheckableElement=ruleCheckableElement();

            state._fsp--;

             current =iv_ruleCheckableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckableElement785); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:325:1: ruleCheckableElement returns [EObject current=null] : this_Checkbox_0= ruleCheckbox ;
    public final EObject ruleCheckableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Checkbox_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:328:28: (this_Checkbox_0= ruleCheckbox )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:330:5: this_Checkbox_0= ruleCheckbox
            {
             
                    newCompositeNode(grammarAccess.getCheckableElementAccess().getCheckboxParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleCheckbox_in_ruleCheckableElement831);
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


    // $ANTLR start "entryRuleClick"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:346:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:347:2: (iv_ruleClick= ruleClick EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:348:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_ruleClick_in_entryRuleClick865);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClick875); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:355:1: ruleClick returns [EObject current=null] : (otherlv_0= 'click(' this_ClickableElement_1= ruleClickableElement otherlv_2= ')' ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ClickableElement_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:358:28: ( (otherlv_0= 'click(' this_ClickableElement_1= ruleClickableElement otherlv_2= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:359:1: (otherlv_0= 'click(' this_ClickableElement_1= ruleClickableElement otherlv_2= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:359:1: (otherlv_0= 'click(' this_ClickableElement_1= ruleClickableElement otherlv_2= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:359:3: otherlv_0= 'click(' this_ClickableElement_1= ruleClickableElement otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleClick912); 

                	newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getClickAccess().getClickableElementParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleClickableElement_in_ruleClick934);
            this_ClickableElement_1=ruleClickableElement();

            state._fsp--;

             
                    current = this_ClickableElement_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleClick945); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:384:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:385:2: (iv_ruleFill= ruleFill EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:386:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_ruleFill_in_entryRuleFill981);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFill991); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:393:1: ruleFill returns [EObject current=null] : (otherlv_0= 'fill(' this_FillableElement_1= ruleFillableElement otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ')' ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_STRING_3=null;
        Token otherlv_4=null;
        EObject this_FillableElement_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:396:28: ( (otherlv_0= 'fill(' this_FillableElement_1= ruleFillableElement otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:397:1: (otherlv_0= 'fill(' this_FillableElement_1= ruleFillableElement otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:397:1: (otherlv_0= 'fill(' this_FillableElement_1= ruleFillableElement otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:397:3: otherlv_0= 'fill(' this_FillableElement_1= ruleFillableElement otherlv_2= ', value=' this_STRING_3= RULE_STRING otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleFill1028); 

                	newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getFillAccess().getFillableElementParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFillableElement_in_ruleFill1050);
            this_FillableElement_1=ruleFillableElement();

            state._fsp--;

             
                    current = this_FillableElement_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleFill1061); 

                	newLeafNode(otherlv_2, grammarAccess.getFillAccess().getValueKeyword_2());
                
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFill1072); 
             
                newLeafNode(this_STRING_3, grammarAccess.getFillAccess().getSTRINGTerminalRuleCall_3()); 
                
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleFill1083); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:430:1: entryRuleClear returns [EObject current=null] : iv_ruleClear= ruleClear EOF ;
    public final EObject entryRuleClear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClear = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:431:2: (iv_ruleClear= ruleClear EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:432:2: iv_ruleClear= ruleClear EOF
            {
             newCompositeNode(grammarAccess.getClearRule()); 
            pushFollow(FOLLOW_ruleClear_in_entryRuleClear1119);
            iv_ruleClear=ruleClear();

            state._fsp--;

             current =iv_ruleClear; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClear1129); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:439:1: ruleClear returns [EObject current=null] : (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ')' ) ;
    public final EObject ruleClear() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_FillableElement_1 = null;

        EObject this_CheckableElement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:442:28: ( (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:443:1: (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:443:1: (otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:443:3: otherlv_0= 'clear(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleClear1166); 

                	newLeafNode(otherlv_0, grammarAccess.getClearAccess().getClearKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:447:1: (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:448:5: this_FillableElement_1= ruleFillableElement
                    {
                     
                            newCompositeNode(grammarAccess.getClearAccess().getFillableElementParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleClear1189);
                    this_FillableElement_1=ruleFillableElement();

                    state._fsp--;

                     
                            current = this_FillableElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:458:5: this_CheckableElement_2= ruleCheckableElement
                    {
                     
                            newCompositeNode(grammarAccess.getClearAccess().getCheckableElementParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleClear1216);
                    this_CheckableElement_2=ruleCheckableElement();

                    state._fsp--;

                     
                            current = this_CheckableElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleClear1228); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:478:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:479:2: (iv_ruleVerify= ruleVerify EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:480:2: iv_ruleVerify= ruleVerify EOF
            {
             newCompositeNode(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_ruleVerify_in_entryRuleVerify1264);
            iv_ruleVerify=ruleVerify();

            state._fsp--;

             current =iv_ruleVerify; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerify1274); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:487:1: ruleVerify returns [EObject current=null] : (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ')' ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_FillableElement_1 = null;

        EObject this_CheckableElement_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:490:28: ( (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:491:1: (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:491:1: (otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:491:3: otherlv_0= 'verify(' (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleVerify1311); 

                	newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:495:1: (this_FillableElement_1= ruleFillableElement | this_CheckableElement_2= ruleCheckableElement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:496:5: this_FillableElement_1= ruleFillableElement
                    {
                     
                            newCompositeNode(grammarAccess.getVerifyAccess().getFillableElementParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleFillableElement_in_ruleVerify1334);
                    this_FillableElement_1=ruleFillableElement();

                    state._fsp--;

                     
                            current = this_FillableElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:506:5: this_CheckableElement_2= ruleCheckableElement
                    {
                     
                            newCompositeNode(grammarAccess.getVerifyAccess().getCheckableElementParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleCheckableElement_in_ruleVerify1361);
                    this_CheckableElement_2=ruleCheckableElement();

                    state._fsp--;

                     
                            current = this_CheckableElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleVerify1373); 

                	newLeafNode(otherlv_3, grammarAccess.getVerifyAccess().getRightParenthesisKeyword_2());
                

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:526:1: entryRuleExist returns [EObject current=null] : iv_ruleExist= ruleExist EOF ;
    public final EObject entryRuleExist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExist = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:527:2: (iv_ruleExist= ruleExist EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:528:2: iv_ruleExist= ruleExist EOF
            {
             newCompositeNode(grammarAccess.getExistRule()); 
            pushFollow(FOLLOW_ruleExist_in_entryRuleExist1409);
            iv_ruleExist=ruleExist();

            state._fsp--;

             current =iv_ruleExist; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExist1419); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:535:1: ruleExist returns [EObject current=null] : (otherlv_0= 'exist(' this_Element_1= ruleElement otherlv_2= ')' ) ;
    public final EObject ruleExist() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Element_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:538:28: ( (otherlv_0= 'exist(' this_Element_1= ruleElement otherlv_2= ')' ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:539:1: (otherlv_0= 'exist(' this_Element_1= ruleElement otherlv_2= ')' )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:539:1: (otherlv_0= 'exist(' this_Element_1= ruleElement otherlv_2= ')' )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:539:3: otherlv_0= 'exist(' this_Element_1= ruleElement otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleExist1456); 

                	newLeafNode(otherlv_0, grammarAccess.getExistAccess().getExistKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getExistAccess().getElementParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleElement_in_ruleExist1478);
            this_Element_1=ruleElement();

            state._fsp--;

             
                    current = this_Element_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleExist1489); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:564:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:565:2: (iv_ruleGoTo= ruleGoTo EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:566:2: iv_ruleGoTo= ruleGoTo EOF
            {
             newCompositeNode(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_ruleGoTo_in_entryRuleGoTo1525);
            iv_ruleGoTo=ruleGoTo();

            state._fsp--;

             current =iv_ruleGoTo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoTo1535); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:573:1: ruleGoTo returns [EObject current=null] : this_Url_0= ruleUrl ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        EObject this_Url_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:576:28: (this_Url_0= ruleUrl )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:578:5: this_Url_0= ruleUrl
            {
             
                    newCompositeNode(grammarAccess.getGoToAccess().getUrlParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleUrl_in_ruleGoTo1581);
            this_Url_0=ruleUrl();

            state._fsp--;

             
                    current = this_Url_0; 
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
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleCheckbox"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:594:1: entryRuleCheckbox returns [EObject current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final EObject entryRuleCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckbox = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:595:2: (iv_ruleCheckbox= ruleCheckbox EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:596:2: iv_ruleCheckbox= ruleCheckbox EOF
            {
             newCompositeNode(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_ruleCheckbox_in_entryRuleCheckbox1615);
            iv_ruleCheckbox=ruleCheckbox();

            state._fsp--;

             current =iv_ruleCheckbox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckbox1625); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:603:1: ruleCheckbox returns [EObject current=null] : (otherlv_0= 'checkbox ' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:606:28: ( (otherlv_0= 'checkbox ' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:607:1: (otherlv_0= 'checkbox ' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:607:1: (otherlv_0= 'checkbox ' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:607:3: otherlv_0= 'checkbox ' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleCheckbox1662); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:611:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:612:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:612:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:613:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckbox1679); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCheckboxAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCheckboxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:637:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:638:2: (iv_ruleLink= ruleLink EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:639:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink1720);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink1730); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:646:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link ' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:649:28: ( (otherlv_0= 'link ' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:650:1: (otherlv_0= 'link ' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:650:1: (otherlv_0= 'link ' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:650:3: otherlv_0= 'link ' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleLink1767); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:654:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:655:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:655:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:656:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink1784); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLinkAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:680:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:681:2: (iv_ruleButton= ruleButton EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:682:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton1825);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton1835); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:689:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button ' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:692:28: ( (otherlv_0= 'button ' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:693:1: (otherlv_0= 'button ' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:693:1: (otherlv_0= 'button ' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:693:3: otherlv_0= 'button ' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleButton1872); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:697:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:698:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:698:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:699:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButton1889); 

            			newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:723:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:724:2: (iv_ruleImage= ruleImage EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:725:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage1930);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage1940); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:732:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image ' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:735:28: ( (otherlv_0= 'image ' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:736:1: (otherlv_0= 'image ' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:736:1: (otherlv_0= 'image ' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:736:3: otherlv_0= 'image ' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleImage1977); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:740:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:741:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:741:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:742:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImage1994); 

            			newLeafNode(lv_name_1_0, grammarAccess.getImageAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:766:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:767:2: (iv_ruleTextField= ruleTextField EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:768:2: iv_ruleTextField= ruleTextField EOF
            {
             newCompositeNode(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_ruleTextField_in_entryRuleTextField2035);
            iv_ruleTextField=ruleTextField();

            state._fsp--;

             current =iv_ruleTextField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextField2045); 

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
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:775:1: ruleTextField returns [EObject current=null] : (otherlv_0= 'textField ' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:778:28: ( (otherlv_0= 'textField ' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:779:1: (otherlv_0= 'textField ' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:779:1: (otherlv_0= 'textField ' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:779:3: otherlv_0= 'textField ' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleTextField2082); 

                	newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:783:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:784:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:784:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:785:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextField2099); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTextFieldAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

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


    // $ANTLR start "entryRuleUrl"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:809:1: entryRuleUrl returns [EObject current=null] : iv_ruleUrl= ruleUrl EOF ;
    public final EObject entryRuleUrl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrl = null;


        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:810:2: (iv_ruleUrl= ruleUrl EOF )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:811:2: iv_ruleUrl= ruleUrl EOF
            {
             newCompositeNode(grammarAccess.getUrlRule()); 
            pushFollow(FOLLOW_ruleUrl_in_entryRuleUrl2140);
            iv_ruleUrl=ruleUrl();

            state._fsp--;

             current =iv_ruleUrl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrl2150); 

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
    // $ANTLR end "entryRuleUrl"


    // $ANTLR start "ruleUrl"
    // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:818:1: ruleUrl returns [EObject current=null] : (otherlv_0= 'url ' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleUrl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:821:28: ( (otherlv_0= 'url ' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:822:1: (otherlv_0= 'url ' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:822:1: (otherlv_0= 'url ' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:822:3: otherlv_0= 'url ' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleUrl2187); 

                	newLeafNode(otherlv_0, grammarAccess.getUrlAccess().getUrlKeyword_0());
                
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:826:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:827:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:827:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.mda.project.browserdsl/src-gen/org/xtext/mda/project/parser/antlr/internal/InternalBrowserDSL.g:828:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUrl2204); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUrlAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUrlRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleUrl"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleModel130 = new BitSet(new long[]{0x000000000083A802L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_ruleAction223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_ruleAction250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClear_in_ruleAction277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_ruleAction304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExist_in_ruleAction331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_ruleAction358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickableElement_in_ruleElement450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleElement477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleElement504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickableElement_in_entryRuleClickableElement539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClickableElement549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleClickableElement596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleClickableElement623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleClickableElement650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFillableElement_in_entryRuleFillableElement685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFillableElement695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_ruleFillableElement741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_entryRuleCheckableElement775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckableElement785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_ruleCheckableElement831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_entryRuleClick865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClick875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleClick912 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_ruleClickableElement_in_ruleClick934 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleClick945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_entryRuleFill981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFill991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFill1028 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleFill1050 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFill1061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFill1072 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFill1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClear_in_entryRuleClear1119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClear1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleClear1166 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleClear1189 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleClear1216 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleClear1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_entryRuleVerify1264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerify1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleVerify1311 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_ruleFillableElement_in_ruleVerify1334 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleCheckableElement_in_ruleVerify1361 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleVerify1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExist_in_entryRuleExist1409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExist1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleExist1456 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_ruleElement_in_ruleExist1478 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExist1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_entryRuleGoTo1525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoTo1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrl_in_ruleGoTo1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckbox_in_entryRuleCheckbox1615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckbox1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCheckbox1662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckbox1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink1720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleLink1767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton1825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleButton1872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButton1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage1930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleImage1977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImage1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField2035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextField2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTextField2082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextField2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrl_in_entryRuleUrl2140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrl2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleUrl2187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUrl2204 = new BitSet(new long[]{0x0000000000000002L});

}