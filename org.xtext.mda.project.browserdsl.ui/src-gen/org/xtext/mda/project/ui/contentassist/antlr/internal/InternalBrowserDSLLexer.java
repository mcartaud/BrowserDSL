package org.xtext.mda.project.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrowserDSLLexer extends Lexer {
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

    public InternalBrowserDSLLexer() {;} 
    public InternalBrowserDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBrowserDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:11:7: ( 'true' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:11:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:12:7: ( 'false' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:12:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:13:7: ( 'Chrome' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:13:9: 'Chrome'
            {
            match("Chrome"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:14:7: ( 'Firefox' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:14:9: 'Firefox'
            {
            match("Firefox"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:15:7: ( 'browser ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:15:9: 'browser '
            {
            match("browser "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:16:7: ( ';' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:17:7: ( 'sub ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:17:9: 'sub '
            {
            match("sub "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:18:7: ( '{' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:18:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:19:7: ( '}' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:20:7: ( '()' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:20:9: '()'
            {
            match("()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:21:7: ( '(var ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:21:9: '(var '
            {
            match("(var "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:22:7: ( ')' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:22:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:23:7: ( ', var ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:23:9: ', var '
            {
            match(", var "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:24:7: ( 'main' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:24:9: 'main'
            {
            match("main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:25:7: ( '(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:25:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:26:7: ( ', ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:26:9: ', '
            {
            match(", "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:27:7: ( 'var ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:27:9: 'var '
            {
            match("var "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:28:7: ( ' = ' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:28:9: ' = '
            {
            match(" = "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:29:7: ( 'goTo(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:29:9: 'goTo('
            {
            match("goTo("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:30:7: ( 'checkbox(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:30:9: 'checkbox('
            {
            match("checkbox("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:31:7: ( 'link(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:31:9: 'link('
            {
            match("link("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:32:7: ( 'button(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:32:9: 'button('
            {
            match("button("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:33:7: ( 'image(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:33:9: 'image('
            {
            match("image("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:34:7: ( 'textField(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:34:9: 'textField('
            {
            match("textField("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:35:7: ( '.isCheck(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:35:9: '.isCheck('
            {
            match(".isCheck("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:36:7: ( '.verify(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:36:9: '.verify('
            {
            match(".verify("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:37:7: ( '.fill(' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:37:9: '.fill('
            {
            match(".fill("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:38:7: ( '.click()' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:38:9: '.click()'
            {
            match(".click()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:39:7: ( '.clear()' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:39:9: '.clear()'
            {
            match(".clear()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_URL"
    public final void mRULE_URL() throws RecognitionException {
        try {
            int _type = RULE_URL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:10: ( ( 'a' .. 'z' )+ '://' ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ) ( ':' ( '0' .. '9' )+ )? ( '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ( '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )* )? )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:12: ( 'a' .. 'z' )+ '://' ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ) ( ':' ( '0' .. '9' )+ )? ( '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ( '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )* )?
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:12: ( 'a' .. 'z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:13: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match("://"); 

            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:30: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                alt9=1;
            }
            else if ( ((LA9_0>='A' && LA9_0<='Z')||(LA9_0>='a' && LA9_0<='z')) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:31: ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:31: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:32: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    match('.'); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:47: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:48: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    match('.'); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:63: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:64: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    match('.'); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:79: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:80: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:91: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:111: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=9;
                        alt6 = dfa6.predict(input);
                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:112: 'a' .. 'z'
                    	    {
                    	    matchRange('a','z'); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:121: 'A' .. 'Z'
                    	    {
                    	    matchRange('A','Z'); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:130: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:139: '$'
                    	    {
                    	    match('$'); 

                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:143: '-'
                    	    {
                    	    match('-'); 

                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:147: '_'
                    	    {
                    	    match('_'); 

                    	    }
                    	    break;
                    	case 7 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:151: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    {
                    	    match('\\'); 
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}

                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 8 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:214: '%' '0' .. '9' '0' .. '9'
                    	    {
                    	    match('%'); 
                    	    matchRange('0','9'); 
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:238: ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='.') ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:239: '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
                    	    {
                    	    match('.'); 
                    	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}

                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:263: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
                    	    loop7:
                    	    do {
                    	        int alt7=9;
                    	        alt7 = dfa7.predict(input);
                    	        switch (alt7) {
                    	    	case 1 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:264: 'a' .. 'z'
                    	    	    {
                    	    	    matchRange('a','z'); 

                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:273: 'A' .. 'Z'
                    	    	    {
                    	    	    matchRange('A','Z'); 

                    	    	    }
                    	    	    break;
                    	    	case 3 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:282: '0' .. '9'
                    	    	    {
                    	    	    matchRange('0','9'); 

                    	    	    }
                    	    	    break;
                    	    	case 4 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:291: '$'
                    	    	    {
                    	    	    match('$'); 

                    	    	    }
                    	    	    break;
                    	    	case 5 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:295: '-'
                    	    	    {
                    	    	    match('-'); 

                    	    	    }
                    	    	    break;
                    	    	case 6 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:299: '_'
                    	    	    {
                    	    	    match('_'); 

                    	    	    }
                    	    	    break;
                    	    	case 7 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:303: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    	    {
                    	    	    match('\\'); 
                    	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	    	        input.consume();

                    	    	    }
                    	    	    else {
                    	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	    	        recover(mse);
                    	    	        throw mse;}

                    	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	    	        input.consume();

                    	    	    }
                    	    	    else {
                    	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	    	        recover(mse);
                    	    	        throw mse;}


                    	    	    }
                    	    	    break;
                    	    	case 8 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:366: '%' '0' .. '9' '0' .. '9'
                    	    	    {
                    	    	    match('%'); 
                    	    	    matchRange('0','9'); 
                    	    	    matchRange('0','9'); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop7;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:393: ( ':' ( '0' .. '9' )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==':') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:394: ':' ( '0' .. '9' )+
                    {
                    match(':'); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:398: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:399: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:412: ( '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='/') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:413: '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
            	    {
            	    match('/'); 
            	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:417: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
            	    loop12:
            	    do {
            	        int alt12=12;
            	        alt12 = dfa12.predict(input);
            	        switch (alt12) {
            	    	case 1 :
            	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:418: 'a' .. 'z'
            	    	    {
            	    	    matchRange('a','z'); 

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:427: 'A' .. 'Z'
            	    	    {
            	    	    matchRange('A','Z'); 

            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:436: '0' .. '9'
            	    	    {
            	    	    matchRange('0','9'); 

            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:445: '$'
            	    	    {
            	    	    match('$'); 

            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:449: '-'
            	    	    {
            	    	    match('-'); 

            	    	    }
            	    	    break;
            	    	case 6 :
            	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:453: '_'
            	    	    {
            	    	    match('_'); 

            	    	    }
            	    	    break;
            	    	case 7 :
            	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:457: '~'
            	    	    {
            	    	    match('~'); 

            	    	    }
            	    	    break;
            	    	case 8 :
            	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:461: '+'
            	    	    {
            	    	    match('+'); 

            	    	    }
            	    	    break;
            	    	case 9 :
            	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:465: '.'
            	    	    {
            	    	    match('.'); 

            	    	    }
            	    	    break;
            	    	case 10 :
            	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:469: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            	    	    {
            	    	    match('\\'); 
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}

            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;
            	    	case 11 :
            	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:532: '%' '0' .. '9' '0' .. '9'
            	    	    {
            	    	    match('%'); 
            	    	    matchRange('0','9'); 
            	    	    matchRange('0','9'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:558: ( '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='?') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:559: '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )*
                    {
                    match('?'); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:563: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=12;
                        alt14 = dfa14.predict(input);
                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:564: 'a' .. 'z'
                    	    {
                    	    matchRange('a','z'); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:573: 'A' .. 'Z'
                    	    {
                    	    matchRange('A','Z'); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:582: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:591: '$'
                    	    {
                    	    match('$'); 

                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:595: '-'
                    	    {
                    	    match('-'); 

                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:599: '_'
                    	    {
                    	    match('_'); 

                    	    }
                    	    break;
                    	case 7 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:603: '='
                    	    {
                    	    match('='); 

                    	    }
                    	    break;
                    	case 8 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:607: '&'
                    	    {
                    	    match('&'); 

                    	    }
                    	    break;
                    	case 9 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:611: ';'
                    	    {
                    	    match(';'); 

                    	    }
                    	    break;
                    	case 10 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:615: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    {
                    	    match('\\'); 
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}

                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 11 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:678: '%' '0' .. '9' '0' .. '9'
                    	    {
                    	    match('%'); 
                    	    matchRange('0','9'); 
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:702: ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='+') ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:703: '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+
                    	    {
                    	    match('+'); 
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:707: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+
                    	    int cnt15=0;
                    	    loop15:
                    	    do {
                    	        int alt15=12;
                    	        alt15 = dfa15.predict(input);
                    	        switch (alt15) {
                    	    	case 1 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:708: 'a' .. 'z'
                    	    	    {
                    	    	    matchRange('a','z'); 

                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:717: 'A' .. 'Z'
                    	    	    {
                    	    	    matchRange('A','Z'); 

                    	    	    }
                    	    	    break;
                    	    	case 3 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:726: '0' .. '9'
                    	    	    {
                    	    	    matchRange('0','9'); 

                    	    	    }
                    	    	    break;
                    	    	case 4 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:735: '$'
                    	    	    {
                    	    	    match('$'); 

                    	    	    }
                    	    	    break;
                    	    	case 5 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:739: '-'
                    	    	    {
                    	    	    match('-'); 

                    	    	    }
                    	    	    break;
                    	    	case 6 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:743: '_'
                    	    	    {
                    	    	    match('_'); 

                    	    	    }
                    	    	    break;
                    	    	case 7 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:747: '='
                    	    	    {
                    	    	    match('='); 

                    	    	    }
                    	    	    break;
                    	    	case 8 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:751: '&'
                    	    	    {
                    	    	    match('&'); 

                    	    	    }
                    	    	    break;
                    	    	case 9 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:755: ';'
                    	    	    {
                    	    	    match(';'); 

                    	    	    }
                    	    	    break;
                    	    	case 10 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:759: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    	    {
                    	    	    match('\\'); 
                    	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	    	        input.consume();

                    	    	    }
                    	    	    else {
                    	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	    	        recover(mse);
                    	    	        throw mse;}

                    	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	    	        input.consume();

                    	    	    }
                    	    	    else {
                    	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	    	        recover(mse);
                    	    	        throw mse;}


                    	    	    }
                    	    	    break;
                    	    	case 11 :
                    	    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4795:822: '%' '0' .. '9' '0' .. '9'
                    	    	    {
                    	    	    match('%'); 
                    	    	    matchRange('0','9'); 
                    	    	    matchRange('0','9'); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt15 >= 1 ) break loop15;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(15, input);
                    	                throw eee;
                    	        }
                    	        cnt15++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_URL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4797:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4797:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4797:11: ( '^' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='^') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4797:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4797:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4799:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4799:12: ( '0' .. '9' )+
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4799:12: ( '0' .. '9' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4799:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4801:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4801:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4801:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\"') ) {
                alt23=1;
            }
            else if ( (LA23_0=='\'') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4801:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4801:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop21:
                    do {
                        int alt21=3;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='\\') ) {
                            alt21=1;
                        }
                        else if ( ((LA21_0>='\u0000' && LA21_0<='!')||(LA21_0>='#' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                            alt21=2;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4801:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4801:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4801:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4801:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop22:
                    do {
                        int alt22=3;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0=='\\') ) {
                            alt22=1;
                        }
                        else if ( ((LA22_0>='\u0000' && LA22_0<='&')||(LA22_0>='(' && LA22_0<='[')||(LA22_0>=']' && LA22_0<='\uFFFF')) ) {
                            alt22=2;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4801:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4801:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4803:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4803:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4803:24: ( options {greedy=false; } : . )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='*') ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1=='/') ) {
                        alt24=2;
                    }
                    else if ( ((LA24_1>='\u0000' && LA24_1<='.')||(LA24_1>='0' && LA24_1<='\uFFFF')) ) {
                        alt24=1;
                    }


                }
                else if ( ((LA24_0>='\u0000' && LA24_0<=')')||(LA24_0>='+' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4803:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4805:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4805:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4805:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\u0000' && LA25_0<='\t')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4805:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4805:40: ( ( '\\r' )? '\\n' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\n'||LA27_0=='\r') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4805:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4805:41: ( '\\r' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='\r') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4805:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4807:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4807:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4807:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4809:16: ( . )
            // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:4809:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_URL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt29=37;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:184: RULE_URL
                {
                mRULE_URL(); 

                }
                break;
            case 31 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:193: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 32 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:201: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 33 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:210: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:222: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:238: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:254: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // ../org.xtext.mda.project.browserdsl.ui/src-gen/org/xtext/mda/project/ui/contentassist/antlr/internal/InternalBrowserDSL.g:1:262: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA6_eotS =
        "\1\1\11\uffff";
    static final String DFA6_eofS =
        "\12\uffff";
    static final String DFA6_minS =
        "\1\44\11\uffff";
    static final String DFA6_maxS =
        "\1\172\11\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA6_specialS =
        "\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\5\1\11\7\uffff\1\6\2\uffff\12\4\7\uffff\32\3\1\uffff\1\10\2\uffff\1\7\1\uffff\32\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 4795:111: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*";
        }
    }
    static final String DFA7_eotS =
        "\1\1\11\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\44\11\uffff";
    static final String DFA7_maxS =
        "\1\172\11\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA7_specialS =
        "\12\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\5\1\11\7\uffff\1\6\2\uffff\12\4\7\uffff\32\3\1\uffff\1\10\2\uffff\1\7\1\uffff\32\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 4795:263: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*";
        }
    }
    static final String DFA12_eotS =
        "\1\1\14\uffff";
    static final String DFA12_eofS =
        "\15\uffff";
    static final String DFA12_minS =
        "\1\44\14\uffff";
    static final String DFA12_maxS =
        "\1\176\14\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA12_specialS =
        "\15\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\5\1\14\5\uffff\1\11\1\uffff\1\6\1\12\1\uffff\12\4\7\uffff\32\3\1\uffff\1\13\2\uffff\1\7\1\uffff\32\2\3\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "()* loopback of 4795:417: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*";
        }
    }
    static final String DFA14_eotS =
        "\1\1\14\uffff";
    static final String DFA14_eofS =
        "\15\uffff";
    static final String DFA14_minS =
        "\1\44\14\uffff";
    static final String DFA14_maxS =
        "\1\172\14\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA14_specialS =
        "\15\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\5\1\14\1\11\6\uffff\1\6\2\uffff\12\4\1\uffff\1\12\1\uffff\1\10\3\uffff\32\3\1\uffff\1\13\2\uffff\1\7\1\uffff\32\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()+ loopback of 4795:563: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+";
        }
    }
    static final String DFA15_eotS =
        "\1\1\14\uffff";
    static final String DFA15_eofS =
        "\15\uffff";
    static final String DFA15_minS =
        "\1\44\14\uffff";
    static final String DFA15_maxS =
        "\1\172\14\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA15_specialS =
        "\15\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\5\1\14\1\11\6\uffff\1\6\2\uffff\12\4\1\uffff\1\12\1\uffff\1\10\3\uffff\32\3\1\uffff\1\13\2\uffff\1\7\1\uffff\32\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()+ loopback of 4795:707: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+";
        }
    }
    static final String DFA29_eotS =
        "\1\uffff\5\42\1\uffff\1\42\2\uffff\1\56\1\uffff\1\35\2\42\1\64\4\42\1\35\1\42\1\35\2\uffff\3\35\2\uffff\2\42\1\uffff\1\42\1\uffff\5\42\1\uffff\1\42\6\uffff\1\112\2\42\2\uffff\4\42\10\uffff\10\42\2\uffff\6\42\1\uffff\1\142\6\42\1\uffff\1\151\1\uffff\4\42\3\uffff\1\42\1\157\4\42\2\uffff\1\42\1\uffff\2\42\1\uffff\1\167\4\42\1\uffff\1\42\1\uffff\1\175\1\42\1\uffff\2\42\2\uffff\2\42\2\uffff";
    static final String DFA29_eofS =
        "\u0083\uffff";
    static final String DFA29_minS =
        "\1\0\2\72\1\150\1\151\1\72\1\uffff\1\72\2\uffff\1\51\1\uffff\1\40\2\72\1\75\4\72\1\143\1\72\1\101\2\uffff\2\0\1\52\2\uffff\2\72\1\uffff\1\72\1\uffff\1\72\2\162\2\72\1\uffff\1\72\6\uffff\1\166\2\72\2\uffff\4\72\3\uffff\1\154\4\uffff\3\72\1\157\1\145\2\72\1\40\2\uffff\1\72\1\40\1\157\3\72\1\145\1\60\2\72\1\155\1\146\2\72\1\uffff\1\60\1\uffff\1\50\1\72\1\50\1\72\3\uffff\1\151\1\60\1\145\1\157\2\72\2\uffff\1\72\1\uffff\1\50\1\145\1\uffff\1\60\1\170\1\72\1\50\1\72\1\uffff\1\154\1\uffff\1\60\1\40\1\uffff\1\72\1\144\2\uffff\2\50\2\uffff";
    static final String DFA29_maxS =
        "\1\uffff\2\172\1\150\1\151\1\172\1\uffff\1\172\2\uffff\1\166\1\uffff\1\40\2\172\1\75\4\172\1\166\2\172\2\uffff\2\uffff\1\57\2\uffff\2\172\1\uffff\1\172\1\uffff\1\172\2\162\2\172\1\uffff\1\172\6\uffff\1\166\2\172\2\uffff\4\172\3\uffff\1\154\4\uffff\3\172\1\157\1\145\3\172\2\uffff\2\172\1\157\3\172\1\151\3\172\1\155\1\146\2\172\1\uffff\1\172\1\uffff\1\50\3\172\3\uffff\1\151\1\172\1\145\1\157\2\172\2\uffff\1\172\1\uffff\1\172\1\145\1\uffff\1\172\1\170\3\172\1\uffff\1\154\1\uffff\2\172\1\uffff\1\172\1\144\2\uffff\1\172\1\50\2\uffff";
    static final String DFA29_acceptS =
        "\6\uffff\1\6\1\uffff\1\10\1\11\1\uffff\1\14\13\uffff\1\37\1\40\3\uffff\1\44\1\45\2\uffff\1\36\1\uffff\1\37\5\uffff\1\6\1\uffff\1\10\1\11\1\12\1\13\1\17\1\14\3\uffff\1\22\1\44\4\uffff\1\31\1\32\1\33\1\uffff\1\40\1\41\1\42\1\43\10\uffff\1\15\1\20\16\uffff\1\7\1\uffff\1\21\4\uffff\1\34\1\35\1\1\6\uffff\1\16\1\23\1\uffff\1\25\2\uffff\1\2\5\uffff\1\27\1\uffff\1\3\2\uffff\1\26\2\uffff\1\4\1\5\2\uffff\1\24\1\30";
    static final String DFA29_specialS =
        "\1\2\30\uffff\1\1\1\0\150\uffff}>";
    static final String[] DFA29_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\17\1\35\1\31\4\35\1\32\1\12\1\13\2\35\1\14\1\35\1\24\1\33\12\30\1\35\1\6\5\35\2\27\1\3\2\27\1\4\24\27\3\35\1\26\1\27\1\35\1\25\1\5\1\21\2\25\1\2\1\20\1\25\1\23\2\25\1\22\1\15\5\25\1\7\1\1\1\25\1\16\4\25\1\10\1\35\1\11\uff82\35",
            "\1\40\46\uffff\4\41\1\37\14\41\1\36\10\41",
            "\1\40\46\uffff\1\43\31\41",
            "\1\44",
            "\1\45",
            "\1\40\46\uffff\21\41\1\46\2\41\1\47\5\41",
            "",
            "\1\40\46\uffff\24\41\1\51\5\41",
            "",
            "",
            "\1\54\114\uffff\1\55",
            "",
            "\1\60",
            "\1\40\46\uffff\1\61\31\41",
            "\1\40\46\uffff\1\62\31\41",
            "\1\63",
            "\1\40\46\uffff\16\41\1\65\13\41",
            "\1\40\46\uffff\7\41\1\66\22\41",
            "\1\40\46\uffff\10\41\1\67\21\41",
            "\1\40\46\uffff\14\41\1\70\15\41",
            "\1\74\2\uffff\1\73\2\uffff\1\71\14\uffff\1\72",
            "\1\40\46\uffff\32\41",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\0\76",
            "\0\76",
            "\1\77\4\uffff\1\100",
            "",
            "",
            "\1\40\46\uffff\24\41\1\101\5\41",
            "\1\40\46\uffff\27\41\1\102\2\41",
            "",
            "\1\40\46\uffff\32\41",
            "",
            "\1\40\46\uffff\13\41\1\103\16\41",
            "\1\104",
            "\1\105",
            "\1\40\46\uffff\16\41\1\106\13\41",
            "\1\40\46\uffff\23\41\1\107\6\41",
            "",
            "\1\40\46\uffff\1\41\1\110\30\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\40\46\uffff\10\41\1\113\21\41",
            "\1\40\46\uffff\21\41\1\114\10\41",
            "",
            "",
            "\1\40\31\uffff\1\115\14\uffff\32\41",
            "\1\40\46\uffff\4\41\1\116\25\41",
            "\1\40\46\uffff\15\41\1\117\14\41",
            "\1\40\46\uffff\1\120\31\41",
            "",
            "",
            "",
            "\1\121",
            "",
            "",
            "",
            "",
            "\1\40\46\uffff\4\41\1\122\25\41",
            "\1\40\46\uffff\23\41\1\123\6\41",
            "\1\40\46\uffff\22\41\1\124\7\41",
            "\1\125",
            "\1\126",
            "\1\40\46\uffff\26\41\1\127\3\41",
            "\1\40\46\uffff\23\41\1\130\6\41",
            "\1\131\31\uffff\1\40\46\uffff\32\41",
            "",
            "",
            "\1\40\46\uffff\15\41\1\132\14\41",
            "\1\133\31\uffff\1\40\46\uffff\32\41",
            "\1\134",
            "\1\40\46\uffff\2\41\1\135\27\41",
            "\1\40\46\uffff\12\41\1\136\17\41",
            "\1\40\46\uffff\6\41\1\137\23\41",
            "\1\141\3\uffff\1\140",
            "\12\42\1\40\6\uffff\32\42\4\uffff\1\42\1\uffff\32\41",
            "\1\40\13\uffff\1\143\32\uffff\32\41",
            "\1\40\46\uffff\4\41\1\144\25\41",
            "\1\145",
            "\1\146",
            "\1\40\46\uffff\22\41\1\147\7\41",
            "\1\40\46\uffff\16\41\1\150\13\41",
            "",
            "\12\42\1\40\6\uffff\32\42\4\uffff\1\42\1\uffff\32\41",
            "",
            "\1\152",
            "\1\40\46\uffff\12\41\1\153\17\41",
            "\1\154\21\uffff\1\40\46\uffff\32\41",
            "\1\40\46\uffff\4\41\1\155\25\41",
            "",
            "",
            "",
            "\1\156",
            "\12\42\1\40\6\uffff\32\42\4\uffff\1\42\1\uffff\32\41",
            "\1\160",
            "\1\161",
            "\1\40\46\uffff\4\41\1\162\25\41",
            "\1\40\46\uffff\15\41\1\163\14\41",
            "",
            "",
            "\1\40\46\uffff\1\41\1\164\30\41",
            "",
            "\1\165\21\uffff\1\40\46\uffff\32\41",
            "\1\166",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\170",
            "\1\40\46\uffff\21\41\1\171\10\41",
            "\1\172\21\uffff\1\40\46\uffff\32\41",
            "\1\40\46\uffff\16\41\1\173\13\41",
            "",
            "\1\174",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\176\31\uffff\1\40\46\uffff\32\41",
            "",
            "\1\40\46\uffff\27\41\1\177\2\41",
            "\1\u0080",
            "",
            "",
            "\1\u0081\21\uffff\1\40\46\uffff\32\41",
            "\1\u0082",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_URL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_26 = input.LA(1);

                        s = -1;
                        if ( ((LA29_26>='\u0000' && LA29_26<='\uFFFF')) ) {s = 62;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_25 = input.LA(1);

                        s = -1;
                        if ( ((LA29_25>='\u0000' && LA29_25<='\uFFFF')) ) {s = 62;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_0 = input.LA(1);

                        s = -1;
                        if ( (LA29_0=='t') ) {s = 1;}

                        else if ( (LA29_0=='f') ) {s = 2;}

                        else if ( (LA29_0=='C') ) {s = 3;}

                        else if ( (LA29_0=='F') ) {s = 4;}

                        else if ( (LA29_0=='b') ) {s = 5;}

                        else if ( (LA29_0==';') ) {s = 6;}

                        else if ( (LA29_0=='s') ) {s = 7;}

                        else if ( (LA29_0=='{') ) {s = 8;}

                        else if ( (LA29_0=='}') ) {s = 9;}

                        else if ( (LA29_0=='(') ) {s = 10;}

                        else if ( (LA29_0==')') ) {s = 11;}

                        else if ( (LA29_0==',') ) {s = 12;}

                        else if ( (LA29_0=='m') ) {s = 13;}

                        else if ( (LA29_0=='v') ) {s = 14;}

                        else if ( (LA29_0==' ') ) {s = 15;}

                        else if ( (LA29_0=='g') ) {s = 16;}

                        else if ( (LA29_0=='c') ) {s = 17;}

                        else if ( (LA29_0=='l') ) {s = 18;}

                        else if ( (LA29_0=='i') ) {s = 19;}

                        else if ( (LA29_0=='.') ) {s = 20;}

                        else if ( (LA29_0=='a'||(LA29_0>='d' && LA29_0<='e')||LA29_0=='h'||(LA29_0>='j' && LA29_0<='k')||(LA29_0>='n' && LA29_0<='r')||LA29_0=='u'||(LA29_0>='w' && LA29_0<='z')) ) {s = 21;}

                        else if ( (LA29_0=='^') ) {s = 22;}

                        else if ( ((LA29_0>='A' && LA29_0<='B')||(LA29_0>='D' && LA29_0<='E')||(LA29_0>='G' && LA29_0<='Z')||LA29_0=='_') ) {s = 23;}

                        else if ( ((LA29_0>='0' && LA29_0<='9')) ) {s = 24;}

                        else if ( (LA29_0=='\"') ) {s = 25;}

                        else if ( (LA29_0=='\'') ) {s = 26;}

                        else if ( (LA29_0=='/') ) {s = 27;}

                        else if ( ((LA29_0>='\t' && LA29_0<='\n')||LA29_0=='\r') ) {s = 28;}

                        else if ( ((LA29_0>='\u0000' && LA29_0<='\b')||(LA29_0>='\u000B' && LA29_0<='\f')||(LA29_0>='\u000E' && LA29_0<='\u001F')||LA29_0=='!'||(LA29_0>='#' && LA29_0<='&')||(LA29_0>='*' && LA29_0<='+')||LA29_0=='-'||LA29_0==':'||(LA29_0>='<' && LA29_0<='@')||(LA29_0>='[' && LA29_0<=']')||LA29_0=='`'||LA29_0=='|'||(LA29_0>='~' && LA29_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}