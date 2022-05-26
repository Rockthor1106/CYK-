package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'v'", "'w'", "'x'", "'y'", "'z'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "'->'", "'|'", "'S'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGNFC"
    // InternalMyDsl.g:53:1: entryRuleGNFC : ruleGNFC EOF ;
    public final void entryRuleGNFC() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleGNFC EOF )
            // InternalMyDsl.g:55:1: ruleGNFC EOF
            {
             before(grammarAccess.getGNFCRule()); 
            pushFollow(FOLLOW_1);
            ruleGNFC();

            state._fsp--;

             after(grammarAccess.getGNFCRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGNFC"


    // $ANTLR start "ruleGNFC"
    // InternalMyDsl.g:62:1: ruleGNFC : ( ( rule__GNFC__Group__0 ) ) ;
    public final void ruleGNFC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__GNFC__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__GNFC__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__GNFC__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__GNFC__Group__0 )
            {
             before(grammarAccess.getGNFCAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__GNFC__Group__0 )
            // InternalMyDsl.g:69:4: rule__GNFC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GNFC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGNFCAccess().getGroup()); 

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
    // $ANTLR end "ruleGNFC"


    // $ANTLR start "entryRuleInitial"
    // InternalMyDsl.g:78:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleInitial EOF )
            // InternalMyDsl.g:80:1: ruleInitial EOF
            {
             before(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getInitialRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalMyDsl.g:87:1: ruleInitial : ( ( rule__Initial__Group__0 ) ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Initial__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Initial__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Initial__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Initial__Group__0 )
            {
             before(grammarAccess.getInitialAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Initial__Group__0 )
            // InternalMyDsl.g:94:4: rule__Initial__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getGroup()); 

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
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleProduction"
    // InternalMyDsl.g:103:1: entryRuleProduction : ruleProduction EOF ;
    public final void entryRuleProduction() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleProduction EOF )
            // InternalMyDsl.g:105:1: ruleProduction EOF
            {
             before(grammarAccess.getProductionRule()); 
            pushFollow(FOLLOW_1);
            ruleProduction();

            state._fsp--;

             after(grammarAccess.getProductionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProduction"


    // $ANTLR start "ruleProduction"
    // InternalMyDsl.g:112:1: ruleProduction : ( ( rule__Production__Group__0 ) ) ;
    public final void ruleProduction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Production__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Production__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Production__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Production__Group__0 )
            {
             before(grammarAccess.getProductionAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Production__Group__0 )
            // InternalMyDsl.g:119:4: rule__Production__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Production__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductionAccess().getGroup()); 

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
    // $ANTLR end "ruleProduction"


    // $ANTLR start "entryRuleRigth"
    // InternalMyDsl.g:128:1: entryRuleRigth : ruleRigth EOF ;
    public final void entryRuleRigth() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRigth EOF )
            // InternalMyDsl.g:130:1: ruleRigth EOF
            {
             before(grammarAccess.getRigthRule()); 
            pushFollow(FOLLOW_1);
            ruleRigth();

            state._fsp--;

             after(grammarAccess.getRigthRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRigth"


    // $ANTLR start "ruleRigth"
    // InternalMyDsl.g:137:1: ruleRigth : ( ( rule__Rigth__Alternatives ) ) ;
    public final void ruleRigth() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Rigth__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Rigth__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Rigth__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Rigth__Alternatives )
            {
             before(grammarAccess.getRigthAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Rigth__Alternatives )
            // InternalMyDsl.g:144:4: rule__Rigth__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Rigth__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRigthAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRigth"


    // $ANTLR start "entryRuleSimple"
    // InternalMyDsl.g:153:1: entryRuleSimple : ruleSimple EOF ;
    public final void entryRuleSimple() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleSimple EOF )
            // InternalMyDsl.g:155:1: ruleSimple EOF
            {
             before(grammarAccess.getSimpleRule()); 
            pushFollow(FOLLOW_1);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getSimpleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimple"


    // $ANTLR start "ruleSimple"
    // InternalMyDsl.g:162:1: ruleSimple : ( ( rule__Simple__Group__0 ) ) ;
    public final void ruleSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Simple__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Simple__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Simple__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Simple__Group__0 )
            {
             before(grammarAccess.getSimpleAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Simple__Group__0 )
            // InternalMyDsl.g:169:4: rule__Simple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getGroup()); 

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
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleNonTerminal"
    // InternalMyDsl.g:178:1: entryRuleNonTerminal : ruleNonTerminal EOF ;
    public final void entryRuleNonTerminal() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleNonTerminal EOF )
            // InternalMyDsl.g:180:1: ruleNonTerminal EOF
            {
             before(grammarAccess.getNonTerminalRule()); 
            pushFollow(FOLLOW_1);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getNonTerminalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNonTerminal"


    // $ANTLR start "ruleNonTerminal"
    // InternalMyDsl.g:187:1: ruleNonTerminal : ( ( rule__NonTerminal__Group__0 ) ) ;
    public final void ruleNonTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__NonTerminal__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__NonTerminal__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__NonTerminal__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__NonTerminal__Group__0 )
            {
             before(grammarAccess.getNonTerminalAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__NonTerminal__Group__0 )
            // InternalMyDsl.g:194:4: rule__NonTerminal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NonTerminal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonTerminalAccess().getGroup()); 

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
    // $ANTLR end "ruleNonTerminal"


    // $ANTLR start "entryRuleBinary"
    // InternalMyDsl.g:203:1: entryRuleBinary : ruleBinary EOF ;
    public final void entryRuleBinary() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleBinary EOF )
            // InternalMyDsl.g:205:1: ruleBinary EOF
            {
             before(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_1);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getBinaryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBinary"


    // $ANTLR start "ruleBinary"
    // InternalMyDsl.g:212:1: ruleBinary : ( ( rule__Binary__Group__0 ) ) ;
    public final void ruleBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Binary__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Binary__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Binary__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Binary__Group__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Binary__Group__0 )
            // InternalMyDsl.g:219:4: rule__Binary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getGroup()); 

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
    // $ANTLR end "ruleBinary"


    // $ANTLR start "rule__Rigth__Alternatives"
    // InternalMyDsl.g:227:1: rule__Rigth__Alternatives : ( ( ( rule__Rigth__SimpleAssignment_0 ) ) | ( ( rule__Rigth__BinaryAssignment_1 ) ) );
    public final void rule__Rigth__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:231:1: ( ( ( rule__Rigth__SimpleAssignment_0 ) ) | ( ( rule__Rigth__BinaryAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=35)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=36 && LA1_0<=60)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:232:2: ( ( rule__Rigth__SimpleAssignment_0 ) )
                    {
                    // InternalMyDsl.g:232:2: ( ( rule__Rigth__SimpleAssignment_0 ) )
                    // InternalMyDsl.g:233:3: ( rule__Rigth__SimpleAssignment_0 )
                    {
                     before(grammarAccess.getRigthAccess().getSimpleAssignment_0()); 
                    // InternalMyDsl.g:234:3: ( rule__Rigth__SimpleAssignment_0 )
                    // InternalMyDsl.g:234:4: rule__Rigth__SimpleAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rigth__SimpleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRigthAccess().getSimpleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:238:2: ( ( rule__Rigth__BinaryAssignment_1 ) )
                    {
                    // InternalMyDsl.g:238:2: ( ( rule__Rigth__BinaryAssignment_1 ) )
                    // InternalMyDsl.g:239:3: ( rule__Rigth__BinaryAssignment_1 )
                    {
                     before(grammarAccess.getRigthAccess().getBinaryAssignment_1()); 
                    // InternalMyDsl.g:240:3: ( rule__Rigth__BinaryAssignment_1 )
                    // InternalMyDsl.g:240:4: rule__Rigth__BinaryAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rigth__BinaryAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRigthAccess().getBinaryAssignment_1()); 

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
    // $ANTLR end "rule__Rigth__Alternatives"


    // $ANTLR start "rule__Simple__AlphaAlternatives_1_0"
    // InternalMyDsl.g:248:1: rule__Simple__AlphaAlternatives_1_0 : ( ( 'a' ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) | ( 'g' ) | ( 'h' ) | ( 'i' ) | ( 'j' ) | ( 'k' ) | ( 'l' ) | ( 'm' ) | ( 'n' ) | ( 'o' ) | ( 'p' ) | ( 'q' ) | ( 'r' ) | ( 's' ) | ( 't' ) | ( 'v' ) | ( 'w' ) | ( 'x' ) | ( 'y' ) | ( 'z' ) );
    public final void rule__Simple__AlphaAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:252:1: ( ( 'a' ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) | ( 'g' ) | ( 'h' ) | ( 'i' ) | ( 'j' ) | ( 'k' ) | ( 'l' ) | ( 'm' ) | ( 'n' ) | ( 'o' ) | ( 'p' ) | ( 'q' ) | ( 'r' ) | ( 's' ) | ( 't' ) | ( 'v' ) | ( 'w' ) | ( 'x' ) | ( 'y' ) | ( 'z' ) )
            int alt2=25;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            case 20:
                {
                alt2=10;
                }
                break;
            case 21:
                {
                alt2=11;
                }
                break;
            case 22:
                {
                alt2=12;
                }
                break;
            case 23:
                {
                alt2=13;
                }
                break;
            case 24:
                {
                alt2=14;
                }
                break;
            case 25:
                {
                alt2=15;
                }
                break;
            case 26:
                {
                alt2=16;
                }
                break;
            case 27:
                {
                alt2=17;
                }
                break;
            case 28:
                {
                alt2=18;
                }
                break;
            case 29:
                {
                alt2=19;
                }
                break;
            case 30:
                {
                alt2=20;
                }
                break;
            case 31:
                {
                alt2=21;
                }
                break;
            case 32:
                {
                alt2=22;
                }
                break;
            case 33:
                {
                alt2=23;
                }
                break;
            case 34:
                {
                alt2=24;
                }
                break;
            case 35:
                {
                alt2=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:253:2: ( 'a' )
                    {
                    // InternalMyDsl.g:253:2: ( 'a' )
                    // InternalMyDsl.g:254:3: 'a'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaAKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaAKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:259:2: ( 'b' )
                    {
                    // InternalMyDsl.g:259:2: ( 'b' )
                    // InternalMyDsl.g:260:3: 'b'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaBKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaBKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:265:2: ( 'c' )
                    {
                    // InternalMyDsl.g:265:2: ( 'c' )
                    // InternalMyDsl.g:266:3: 'c'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaCKeyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaCKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:271:2: ( 'd' )
                    {
                    // InternalMyDsl.g:271:2: ( 'd' )
                    // InternalMyDsl.g:272:3: 'd'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaDKeyword_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaDKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:277:2: ( 'e' )
                    {
                    // InternalMyDsl.g:277:2: ( 'e' )
                    // InternalMyDsl.g:278:3: 'e'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaEKeyword_1_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaEKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:283:2: ( 'f' )
                    {
                    // InternalMyDsl.g:283:2: ( 'f' )
                    // InternalMyDsl.g:284:3: 'f'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaFKeyword_1_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaFKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:289:2: ( 'g' )
                    {
                    // InternalMyDsl.g:289:2: ( 'g' )
                    // InternalMyDsl.g:290:3: 'g'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaGKeyword_1_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaGKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:295:2: ( 'h' )
                    {
                    // InternalMyDsl.g:295:2: ( 'h' )
                    // InternalMyDsl.g:296:3: 'h'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaHKeyword_1_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaHKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:301:2: ( 'i' )
                    {
                    // InternalMyDsl.g:301:2: ( 'i' )
                    // InternalMyDsl.g:302:3: 'i'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaIKeyword_1_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaIKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:307:2: ( 'j' )
                    {
                    // InternalMyDsl.g:307:2: ( 'j' )
                    // InternalMyDsl.g:308:3: 'j'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaJKeyword_1_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaJKeyword_1_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:313:2: ( 'k' )
                    {
                    // InternalMyDsl.g:313:2: ( 'k' )
                    // InternalMyDsl.g:314:3: 'k'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaKKeyword_1_0_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaKKeyword_1_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:319:2: ( 'l' )
                    {
                    // InternalMyDsl.g:319:2: ( 'l' )
                    // InternalMyDsl.g:320:3: 'l'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaLKeyword_1_0_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaLKeyword_1_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:325:2: ( 'm' )
                    {
                    // InternalMyDsl.g:325:2: ( 'm' )
                    // InternalMyDsl.g:326:3: 'm'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaMKeyword_1_0_12()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaMKeyword_1_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:331:2: ( 'n' )
                    {
                    // InternalMyDsl.g:331:2: ( 'n' )
                    // InternalMyDsl.g:332:3: 'n'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaNKeyword_1_0_13()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaNKeyword_1_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:337:2: ( 'o' )
                    {
                    // InternalMyDsl.g:337:2: ( 'o' )
                    // InternalMyDsl.g:338:3: 'o'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaOKeyword_1_0_14()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaOKeyword_1_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalMyDsl.g:343:2: ( 'p' )
                    {
                    // InternalMyDsl.g:343:2: ( 'p' )
                    // InternalMyDsl.g:344:3: 'p'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaPKeyword_1_0_15()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaPKeyword_1_0_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalMyDsl.g:349:2: ( 'q' )
                    {
                    // InternalMyDsl.g:349:2: ( 'q' )
                    // InternalMyDsl.g:350:3: 'q'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaQKeyword_1_0_16()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaQKeyword_1_0_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalMyDsl.g:355:2: ( 'r' )
                    {
                    // InternalMyDsl.g:355:2: ( 'r' )
                    // InternalMyDsl.g:356:3: 'r'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaRKeyword_1_0_17()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaRKeyword_1_0_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalMyDsl.g:361:2: ( 's' )
                    {
                    // InternalMyDsl.g:361:2: ( 's' )
                    // InternalMyDsl.g:362:3: 's'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaSKeyword_1_0_18()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaSKeyword_1_0_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalMyDsl.g:367:2: ( 't' )
                    {
                    // InternalMyDsl.g:367:2: ( 't' )
                    // InternalMyDsl.g:368:3: 't'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaTKeyword_1_0_19()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaTKeyword_1_0_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalMyDsl.g:373:2: ( 'v' )
                    {
                    // InternalMyDsl.g:373:2: ( 'v' )
                    // InternalMyDsl.g:374:3: 'v'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaVKeyword_1_0_20()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaVKeyword_1_0_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalMyDsl.g:379:2: ( 'w' )
                    {
                    // InternalMyDsl.g:379:2: ( 'w' )
                    // InternalMyDsl.g:380:3: 'w'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaWKeyword_1_0_21()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaWKeyword_1_0_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalMyDsl.g:385:2: ( 'x' )
                    {
                    // InternalMyDsl.g:385:2: ( 'x' )
                    // InternalMyDsl.g:386:3: 'x'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaXKeyword_1_0_22()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaXKeyword_1_0_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalMyDsl.g:391:2: ( 'y' )
                    {
                    // InternalMyDsl.g:391:2: ( 'y' )
                    // InternalMyDsl.g:392:3: 'y'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaYKeyword_1_0_23()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaYKeyword_1_0_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalMyDsl.g:397:2: ( 'z' )
                    {
                    // InternalMyDsl.g:397:2: ( 'z' )
                    // InternalMyDsl.g:398:3: 'z'
                    {
                     before(grammarAccess.getSimpleAccess().getAlphaZKeyword_1_0_24()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getSimpleAccess().getAlphaZKeyword_1_0_24()); 

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
    // $ANTLR end "rule__Simple__AlphaAlternatives_1_0"


    // $ANTLR start "rule__NonTerminal__VarAlternatives_1_0"
    // InternalMyDsl.g:407:1: rule__NonTerminal__VarAlternatives_1_0 : ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'H' ) | ( 'I' ) | ( 'J' ) | ( 'K' ) | ( 'L' ) | ( 'M' ) | ( 'N' ) | ( 'O' ) | ( 'P' ) | ( 'Q' ) | ( 'R' ) | ( 'T' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'X' ) | ( 'Y' ) | ( 'Z' ) );
    public final void rule__NonTerminal__VarAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:411:1: ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'H' ) | ( 'I' ) | ( 'J' ) | ( 'K' ) | ( 'L' ) | ( 'M' ) | ( 'N' ) | ( 'O' ) | ( 'P' ) | ( 'Q' ) | ( 'R' ) | ( 'T' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'X' ) | ( 'Y' ) | ( 'Z' ) )
            int alt3=25;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 38:
                {
                alt3=3;
                }
                break;
            case 39:
                {
                alt3=4;
                }
                break;
            case 40:
                {
                alt3=5;
                }
                break;
            case 41:
                {
                alt3=6;
                }
                break;
            case 42:
                {
                alt3=7;
                }
                break;
            case 43:
                {
                alt3=8;
                }
                break;
            case 44:
                {
                alt3=9;
                }
                break;
            case 45:
                {
                alt3=10;
                }
                break;
            case 46:
                {
                alt3=11;
                }
                break;
            case 47:
                {
                alt3=12;
                }
                break;
            case 48:
                {
                alt3=13;
                }
                break;
            case 49:
                {
                alt3=14;
                }
                break;
            case 50:
                {
                alt3=15;
                }
                break;
            case 51:
                {
                alt3=16;
                }
                break;
            case 52:
                {
                alt3=17;
                }
                break;
            case 53:
                {
                alt3=18;
                }
                break;
            case 54:
                {
                alt3=19;
                }
                break;
            case 55:
                {
                alt3=20;
                }
                break;
            case 56:
                {
                alt3=21;
                }
                break;
            case 57:
                {
                alt3=22;
                }
                break;
            case 58:
                {
                alt3=23;
                }
                break;
            case 59:
                {
                alt3=24;
                }
                break;
            case 60:
                {
                alt3=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:412:2: ( 'A' )
                    {
                    // InternalMyDsl.g:412:2: ( 'A' )
                    // InternalMyDsl.g:413:3: 'A'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarAKeyword_1_0_0()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarAKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:418:2: ( 'B' )
                    {
                    // InternalMyDsl.g:418:2: ( 'B' )
                    // InternalMyDsl.g:419:3: 'B'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarBKeyword_1_0_1()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarBKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:424:2: ( 'C' )
                    {
                    // InternalMyDsl.g:424:2: ( 'C' )
                    // InternalMyDsl.g:425:3: 'C'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarCKeyword_1_0_2()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarCKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:430:2: ( 'D' )
                    {
                    // InternalMyDsl.g:430:2: ( 'D' )
                    // InternalMyDsl.g:431:3: 'D'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarDKeyword_1_0_3()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarDKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:436:2: ( 'E' )
                    {
                    // InternalMyDsl.g:436:2: ( 'E' )
                    // InternalMyDsl.g:437:3: 'E'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarEKeyword_1_0_4()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarEKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:442:2: ( 'F' )
                    {
                    // InternalMyDsl.g:442:2: ( 'F' )
                    // InternalMyDsl.g:443:3: 'F'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarFKeyword_1_0_5()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarFKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:448:2: ( 'G' )
                    {
                    // InternalMyDsl.g:448:2: ( 'G' )
                    // InternalMyDsl.g:449:3: 'G'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarGKeyword_1_0_6()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarGKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:454:2: ( 'H' )
                    {
                    // InternalMyDsl.g:454:2: ( 'H' )
                    // InternalMyDsl.g:455:3: 'H'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarHKeyword_1_0_7()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarHKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:460:2: ( 'I' )
                    {
                    // InternalMyDsl.g:460:2: ( 'I' )
                    // InternalMyDsl.g:461:3: 'I'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarIKeyword_1_0_8()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarIKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:466:2: ( 'J' )
                    {
                    // InternalMyDsl.g:466:2: ( 'J' )
                    // InternalMyDsl.g:467:3: 'J'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarJKeyword_1_0_9()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarJKeyword_1_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:472:2: ( 'K' )
                    {
                    // InternalMyDsl.g:472:2: ( 'K' )
                    // InternalMyDsl.g:473:3: 'K'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarKKeyword_1_0_10()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarKKeyword_1_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:478:2: ( 'L' )
                    {
                    // InternalMyDsl.g:478:2: ( 'L' )
                    // InternalMyDsl.g:479:3: 'L'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarLKeyword_1_0_11()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarLKeyword_1_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:484:2: ( 'M' )
                    {
                    // InternalMyDsl.g:484:2: ( 'M' )
                    // InternalMyDsl.g:485:3: 'M'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarMKeyword_1_0_12()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarMKeyword_1_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:490:2: ( 'N' )
                    {
                    // InternalMyDsl.g:490:2: ( 'N' )
                    // InternalMyDsl.g:491:3: 'N'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarNKeyword_1_0_13()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarNKeyword_1_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:496:2: ( 'O' )
                    {
                    // InternalMyDsl.g:496:2: ( 'O' )
                    // InternalMyDsl.g:497:3: 'O'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarOKeyword_1_0_14()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarOKeyword_1_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalMyDsl.g:502:2: ( 'P' )
                    {
                    // InternalMyDsl.g:502:2: ( 'P' )
                    // InternalMyDsl.g:503:3: 'P'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarPKeyword_1_0_15()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarPKeyword_1_0_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalMyDsl.g:508:2: ( 'Q' )
                    {
                    // InternalMyDsl.g:508:2: ( 'Q' )
                    // InternalMyDsl.g:509:3: 'Q'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarQKeyword_1_0_16()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarQKeyword_1_0_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalMyDsl.g:514:2: ( 'R' )
                    {
                    // InternalMyDsl.g:514:2: ( 'R' )
                    // InternalMyDsl.g:515:3: 'R'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarRKeyword_1_0_17()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarRKeyword_1_0_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalMyDsl.g:520:2: ( 'T' )
                    {
                    // InternalMyDsl.g:520:2: ( 'T' )
                    // InternalMyDsl.g:521:3: 'T'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarTKeyword_1_0_18()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarTKeyword_1_0_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalMyDsl.g:526:2: ( 'U' )
                    {
                    // InternalMyDsl.g:526:2: ( 'U' )
                    // InternalMyDsl.g:527:3: 'U'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarUKeyword_1_0_19()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarUKeyword_1_0_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalMyDsl.g:532:2: ( 'V' )
                    {
                    // InternalMyDsl.g:532:2: ( 'V' )
                    // InternalMyDsl.g:533:3: 'V'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarVKeyword_1_0_20()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarVKeyword_1_0_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalMyDsl.g:538:2: ( 'W' )
                    {
                    // InternalMyDsl.g:538:2: ( 'W' )
                    // InternalMyDsl.g:539:3: 'W'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarWKeyword_1_0_21()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarWKeyword_1_0_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalMyDsl.g:544:2: ( 'X' )
                    {
                    // InternalMyDsl.g:544:2: ( 'X' )
                    // InternalMyDsl.g:545:3: 'X'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarXKeyword_1_0_22()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarXKeyword_1_0_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalMyDsl.g:550:2: ( 'Y' )
                    {
                    // InternalMyDsl.g:550:2: ( 'Y' )
                    // InternalMyDsl.g:551:3: 'Y'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarYKeyword_1_0_23()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarYKeyword_1_0_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalMyDsl.g:556:2: ( 'Z' )
                    {
                    // InternalMyDsl.g:556:2: ( 'Z' )
                    // InternalMyDsl.g:557:3: 'Z'
                    {
                     before(grammarAccess.getNonTerminalAccess().getVarZKeyword_1_0_24()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getNonTerminalAccess().getVarZKeyword_1_0_24()); 

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
    // $ANTLR end "rule__NonTerminal__VarAlternatives_1_0"


    // $ANTLR start "rule__GNFC__Group__0"
    // InternalMyDsl.g:566:1: rule__GNFC__Group__0 : rule__GNFC__Group__0__Impl rule__GNFC__Group__1 ;
    public final void rule__GNFC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:570:1: ( rule__GNFC__Group__0__Impl rule__GNFC__Group__1 )
            // InternalMyDsl.g:571:2: rule__GNFC__Group__0__Impl rule__GNFC__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GNFC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GNFC__Group__1();

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
    // $ANTLR end "rule__GNFC__Group__0"


    // $ANTLR start "rule__GNFC__Group__0__Impl"
    // InternalMyDsl.g:578:1: rule__GNFC__Group__0__Impl : ( ( rule__GNFC__WAssignment_0 ) ) ;
    public final void rule__GNFC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( ( ( rule__GNFC__WAssignment_0 ) ) )
            // InternalMyDsl.g:583:1: ( ( rule__GNFC__WAssignment_0 ) )
            {
            // InternalMyDsl.g:583:1: ( ( rule__GNFC__WAssignment_0 ) )
            // InternalMyDsl.g:584:2: ( rule__GNFC__WAssignment_0 )
            {
             before(grammarAccess.getGNFCAccess().getWAssignment_0()); 
            // InternalMyDsl.g:585:2: ( rule__GNFC__WAssignment_0 )
            // InternalMyDsl.g:585:3: rule__GNFC__WAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GNFC__WAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGNFCAccess().getWAssignment_0()); 

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
    // $ANTLR end "rule__GNFC__Group__0__Impl"


    // $ANTLR start "rule__GNFC__Group__1"
    // InternalMyDsl.g:593:1: rule__GNFC__Group__1 : rule__GNFC__Group__1__Impl rule__GNFC__Group__2 ;
    public final void rule__GNFC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:597:1: ( rule__GNFC__Group__1__Impl rule__GNFC__Group__2 )
            // InternalMyDsl.g:598:2: rule__GNFC__Group__1__Impl rule__GNFC__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__GNFC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GNFC__Group__2();

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
    // $ANTLR end "rule__GNFC__Group__1"


    // $ANTLR start "rule__GNFC__Group__1__Impl"
    // InternalMyDsl.g:605:1: rule__GNFC__Group__1__Impl : ( ( rule__GNFC__WAssignment_1 )* ) ;
    public final void rule__GNFC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:609:1: ( ( ( rule__GNFC__WAssignment_1 )* ) )
            // InternalMyDsl.g:610:1: ( ( rule__GNFC__WAssignment_1 )* )
            {
            // InternalMyDsl.g:610:1: ( ( rule__GNFC__WAssignment_1 )* )
            // InternalMyDsl.g:611:2: ( rule__GNFC__WAssignment_1 )*
            {
             before(grammarAccess.getGNFCAccess().getWAssignment_1()); 
            // InternalMyDsl.g:612:2: ( rule__GNFC__WAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=35)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:612:3: rule__GNFC__WAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__GNFC__WAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getGNFCAccess().getWAssignment_1()); 

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
    // $ANTLR end "rule__GNFC__Group__1__Impl"


    // $ANTLR start "rule__GNFC__Group__2"
    // InternalMyDsl.g:620:1: rule__GNFC__Group__2 : rule__GNFC__Group__2__Impl rule__GNFC__Group__3 ;
    public final void rule__GNFC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:624:1: ( rule__GNFC__Group__2__Impl rule__GNFC__Group__3 )
            // InternalMyDsl.g:625:2: rule__GNFC__Group__2__Impl rule__GNFC__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__GNFC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GNFC__Group__3();

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
    // $ANTLR end "rule__GNFC__Group__2"


    // $ANTLR start "rule__GNFC__Group__2__Impl"
    // InternalMyDsl.g:632:1: rule__GNFC__Group__2__Impl : ( ( rule__GNFC__InitAssignment_2 ) ) ;
    public final void rule__GNFC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:636:1: ( ( ( rule__GNFC__InitAssignment_2 ) ) )
            // InternalMyDsl.g:637:1: ( ( rule__GNFC__InitAssignment_2 ) )
            {
            // InternalMyDsl.g:637:1: ( ( rule__GNFC__InitAssignment_2 ) )
            // InternalMyDsl.g:638:2: ( rule__GNFC__InitAssignment_2 )
            {
             before(grammarAccess.getGNFCAccess().getInitAssignment_2()); 
            // InternalMyDsl.g:639:2: ( rule__GNFC__InitAssignment_2 )
            // InternalMyDsl.g:639:3: rule__GNFC__InitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GNFC__InitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGNFCAccess().getInitAssignment_2()); 

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
    // $ANTLR end "rule__GNFC__Group__2__Impl"


    // $ANTLR start "rule__GNFC__Group__3"
    // InternalMyDsl.g:647:1: rule__GNFC__Group__3 : rule__GNFC__Group__3__Impl ;
    public final void rule__GNFC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:651:1: ( rule__GNFC__Group__3__Impl )
            // InternalMyDsl.g:652:2: rule__GNFC__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GNFC__Group__3__Impl();

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
    // $ANTLR end "rule__GNFC__Group__3"


    // $ANTLR start "rule__GNFC__Group__3__Impl"
    // InternalMyDsl.g:658:1: rule__GNFC__Group__3__Impl : ( ( rule__GNFC__ProductionsAssignment_3 )* ) ;
    public final void rule__GNFC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:662:1: ( ( ( rule__GNFC__ProductionsAssignment_3 )* ) )
            // InternalMyDsl.g:663:1: ( ( rule__GNFC__ProductionsAssignment_3 )* )
            {
            // InternalMyDsl.g:663:1: ( ( rule__GNFC__ProductionsAssignment_3 )* )
            // InternalMyDsl.g:664:2: ( rule__GNFC__ProductionsAssignment_3 )*
            {
             before(grammarAccess.getGNFCAccess().getProductionsAssignment_3()); 
            // InternalMyDsl.g:665:2: ( rule__GNFC__ProductionsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=36 && LA5_0<=60)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:665:3: rule__GNFC__ProductionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GNFC__ProductionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGNFCAccess().getProductionsAssignment_3()); 

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
    // $ANTLR end "rule__GNFC__Group__3__Impl"


    // $ANTLR start "rule__Initial__Group__0"
    // InternalMyDsl.g:674:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:678:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // InternalMyDsl.g:679:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Initial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__1();

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
    // $ANTLR end "rule__Initial__Group__0"


    // $ANTLR start "rule__Initial__Group__0__Impl"
    // InternalMyDsl.g:686:1: rule__Initial__Group__0__Impl : ( ( rule__Initial__LeftAssignment_0 ) ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:690:1: ( ( ( rule__Initial__LeftAssignment_0 ) ) )
            // InternalMyDsl.g:691:1: ( ( rule__Initial__LeftAssignment_0 ) )
            {
            // InternalMyDsl.g:691:1: ( ( rule__Initial__LeftAssignment_0 ) )
            // InternalMyDsl.g:692:2: ( rule__Initial__LeftAssignment_0 )
            {
             before(grammarAccess.getInitialAccess().getLeftAssignment_0()); 
            // InternalMyDsl.g:693:2: ( rule__Initial__LeftAssignment_0 )
            // InternalMyDsl.g:693:3: rule__Initial__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Initial__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__Initial__Group__0__Impl"


    // $ANTLR start "rule__Initial__Group__1"
    // InternalMyDsl.g:701:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:705:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // InternalMyDsl.g:706:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Initial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__2();

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
    // $ANTLR end "rule__Initial__Group__1"


    // $ANTLR start "rule__Initial__Group__1__Impl"
    // InternalMyDsl.g:713:1: rule__Initial__Group__1__Impl : ( '->' ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:1: ( ( '->' ) )
            // InternalMyDsl.g:718:1: ( '->' )
            {
            // InternalMyDsl.g:718:1: ( '->' )
            // InternalMyDsl.g:719:2: '->'
            {
             before(grammarAccess.getInitialAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__Initial__Group__1__Impl"


    // $ANTLR start "rule__Initial__Group__2"
    // InternalMyDsl.g:728:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl rule__Initial__Group__3 ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:732:1: ( rule__Initial__Group__2__Impl rule__Initial__Group__3 )
            // InternalMyDsl.g:733:2: rule__Initial__Group__2__Impl rule__Initial__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Initial__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__3();

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
    // $ANTLR end "rule__Initial__Group__2"


    // $ANTLR start "rule__Initial__Group__2__Impl"
    // InternalMyDsl.g:740:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__RigthAssignment_2 ) ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( ( ( rule__Initial__RigthAssignment_2 ) ) )
            // InternalMyDsl.g:745:1: ( ( rule__Initial__RigthAssignment_2 ) )
            {
            // InternalMyDsl.g:745:1: ( ( rule__Initial__RigthAssignment_2 ) )
            // InternalMyDsl.g:746:2: ( rule__Initial__RigthAssignment_2 )
            {
             before(grammarAccess.getInitialAccess().getRigthAssignment_2()); 
            // InternalMyDsl.g:747:2: ( rule__Initial__RigthAssignment_2 )
            // InternalMyDsl.g:747:3: rule__Initial__RigthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Initial__RigthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getRigthAssignment_2()); 

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
    // $ANTLR end "rule__Initial__Group__2__Impl"


    // $ANTLR start "rule__Initial__Group__3"
    // InternalMyDsl.g:755:1: rule__Initial__Group__3 : rule__Initial__Group__3__Impl ;
    public final void rule__Initial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:759:1: ( rule__Initial__Group__3__Impl )
            // InternalMyDsl.g:760:2: rule__Initial__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Group__3__Impl();

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
    // $ANTLR end "rule__Initial__Group__3"


    // $ANTLR start "rule__Initial__Group__3__Impl"
    // InternalMyDsl.g:766:1: rule__Initial__Group__3__Impl : ( ( rule__Initial__Group_3__0 )* ) ;
    public final void rule__Initial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:770:1: ( ( ( rule__Initial__Group_3__0 )* ) )
            // InternalMyDsl.g:771:1: ( ( rule__Initial__Group_3__0 )* )
            {
            // InternalMyDsl.g:771:1: ( ( rule__Initial__Group_3__0 )* )
            // InternalMyDsl.g:772:2: ( rule__Initial__Group_3__0 )*
            {
             before(grammarAccess.getInitialAccess().getGroup_3()); 
            // InternalMyDsl.g:773:2: ( rule__Initial__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==62) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:773:3: rule__Initial__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Initial__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getInitialAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Initial__Group__3__Impl"


    // $ANTLR start "rule__Initial__Group_3__0"
    // InternalMyDsl.g:782:1: rule__Initial__Group_3__0 : rule__Initial__Group_3__0__Impl rule__Initial__Group_3__1 ;
    public final void rule__Initial__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:786:1: ( rule__Initial__Group_3__0__Impl rule__Initial__Group_3__1 )
            // InternalMyDsl.g:787:2: rule__Initial__Group_3__0__Impl rule__Initial__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Initial__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group_3__1();

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
    // $ANTLR end "rule__Initial__Group_3__0"


    // $ANTLR start "rule__Initial__Group_3__0__Impl"
    // InternalMyDsl.g:794:1: rule__Initial__Group_3__0__Impl : ( ( ( '|' ) ) ( ( '|' )* ) ) ;
    public final void rule__Initial__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( ( ( ( '|' ) ) ( ( '|' )* ) ) )
            // InternalMyDsl.g:799:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            {
            // InternalMyDsl.g:799:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            // InternalMyDsl.g:800:2: ( ( '|' ) ) ( ( '|' )* )
            {
            // InternalMyDsl.g:800:2: ( ( '|' ) )
            // InternalMyDsl.g:801:3: ( '|' )
            {
             before(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); 
            // InternalMyDsl.g:802:3: ( '|' )
            // InternalMyDsl.g:802:4: '|'
            {
            match(input,62,FOLLOW_10); 

            }

             after(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); 

            }

            // InternalMyDsl.g:805:2: ( ( '|' )* )
            // InternalMyDsl.g:806:3: ( '|' )*
            {
             before(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); 
            // InternalMyDsl.g:807:3: ( '|' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==62) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:807:4: '|'
            	    {
            	    match(input,62,FOLLOW_10); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); 

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
    // $ANTLR end "rule__Initial__Group_3__0__Impl"


    // $ANTLR start "rule__Initial__Group_3__1"
    // InternalMyDsl.g:816:1: rule__Initial__Group_3__1 : rule__Initial__Group_3__1__Impl ;
    public final void rule__Initial__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:820:1: ( rule__Initial__Group_3__1__Impl )
            // InternalMyDsl.g:821:2: rule__Initial__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Group_3__1__Impl();

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
    // $ANTLR end "rule__Initial__Group_3__1"


    // $ANTLR start "rule__Initial__Group_3__1__Impl"
    // InternalMyDsl.g:827:1: rule__Initial__Group_3__1__Impl : ( ( rule__Initial__RigthAssignment_3_1 ) ) ;
    public final void rule__Initial__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:831:1: ( ( ( rule__Initial__RigthAssignment_3_1 ) ) )
            // InternalMyDsl.g:832:1: ( ( rule__Initial__RigthAssignment_3_1 ) )
            {
            // InternalMyDsl.g:832:1: ( ( rule__Initial__RigthAssignment_3_1 ) )
            // InternalMyDsl.g:833:2: ( rule__Initial__RigthAssignment_3_1 )
            {
             before(grammarAccess.getInitialAccess().getRigthAssignment_3_1()); 
            // InternalMyDsl.g:834:2: ( rule__Initial__RigthAssignment_3_1 )
            // InternalMyDsl.g:834:3: rule__Initial__RigthAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Initial__RigthAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getRigthAssignment_3_1()); 

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
    // $ANTLR end "rule__Initial__Group_3__1__Impl"


    // $ANTLR start "rule__Production__Group__0"
    // InternalMyDsl.g:843:1: rule__Production__Group__0 : rule__Production__Group__0__Impl rule__Production__Group__1 ;
    public final void rule__Production__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:847:1: ( rule__Production__Group__0__Impl rule__Production__Group__1 )
            // InternalMyDsl.g:848:2: rule__Production__Group__0__Impl rule__Production__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Production__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Production__Group__1();

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
    // $ANTLR end "rule__Production__Group__0"


    // $ANTLR start "rule__Production__Group__0__Impl"
    // InternalMyDsl.g:855:1: rule__Production__Group__0__Impl : ( ( rule__Production__LeftAssignment_0 ) ) ;
    public final void rule__Production__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:859:1: ( ( ( rule__Production__LeftAssignment_0 ) ) )
            // InternalMyDsl.g:860:1: ( ( rule__Production__LeftAssignment_0 ) )
            {
            // InternalMyDsl.g:860:1: ( ( rule__Production__LeftAssignment_0 ) )
            // InternalMyDsl.g:861:2: ( rule__Production__LeftAssignment_0 )
            {
             before(grammarAccess.getProductionAccess().getLeftAssignment_0()); 
            // InternalMyDsl.g:862:2: ( rule__Production__LeftAssignment_0 )
            // InternalMyDsl.g:862:3: rule__Production__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Production__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProductionAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__Production__Group__0__Impl"


    // $ANTLR start "rule__Production__Group__1"
    // InternalMyDsl.g:870:1: rule__Production__Group__1 : rule__Production__Group__1__Impl rule__Production__Group__2 ;
    public final void rule__Production__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:874:1: ( rule__Production__Group__1__Impl rule__Production__Group__2 )
            // InternalMyDsl.g:875:2: rule__Production__Group__1__Impl rule__Production__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Production__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Production__Group__2();

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
    // $ANTLR end "rule__Production__Group__1"


    // $ANTLR start "rule__Production__Group__1__Impl"
    // InternalMyDsl.g:882:1: rule__Production__Group__1__Impl : ( '->' ) ;
    public final void rule__Production__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:886:1: ( ( '->' ) )
            // InternalMyDsl.g:887:1: ( '->' )
            {
            // InternalMyDsl.g:887:1: ( '->' )
            // InternalMyDsl.g:888:2: '->'
            {
             before(grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__Production__Group__1__Impl"


    // $ANTLR start "rule__Production__Group__2"
    // InternalMyDsl.g:897:1: rule__Production__Group__2 : rule__Production__Group__2__Impl rule__Production__Group__3 ;
    public final void rule__Production__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:901:1: ( rule__Production__Group__2__Impl rule__Production__Group__3 )
            // InternalMyDsl.g:902:2: rule__Production__Group__2__Impl rule__Production__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Production__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Production__Group__3();

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
    // $ANTLR end "rule__Production__Group__2"


    // $ANTLR start "rule__Production__Group__2__Impl"
    // InternalMyDsl.g:909:1: rule__Production__Group__2__Impl : ( ( rule__Production__RigthAssignment_2 ) ) ;
    public final void rule__Production__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:913:1: ( ( ( rule__Production__RigthAssignment_2 ) ) )
            // InternalMyDsl.g:914:1: ( ( rule__Production__RigthAssignment_2 ) )
            {
            // InternalMyDsl.g:914:1: ( ( rule__Production__RigthAssignment_2 ) )
            // InternalMyDsl.g:915:2: ( rule__Production__RigthAssignment_2 )
            {
             before(grammarAccess.getProductionAccess().getRigthAssignment_2()); 
            // InternalMyDsl.g:916:2: ( rule__Production__RigthAssignment_2 )
            // InternalMyDsl.g:916:3: rule__Production__RigthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Production__RigthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProductionAccess().getRigthAssignment_2()); 

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
    // $ANTLR end "rule__Production__Group__2__Impl"


    // $ANTLR start "rule__Production__Group__3"
    // InternalMyDsl.g:924:1: rule__Production__Group__3 : rule__Production__Group__3__Impl ;
    public final void rule__Production__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( rule__Production__Group__3__Impl )
            // InternalMyDsl.g:929:2: rule__Production__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Production__Group__3__Impl();

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
    // $ANTLR end "rule__Production__Group__3"


    // $ANTLR start "rule__Production__Group__3__Impl"
    // InternalMyDsl.g:935:1: rule__Production__Group__3__Impl : ( ( rule__Production__Group_3__0 )* ) ;
    public final void rule__Production__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( ( ( rule__Production__Group_3__0 )* ) )
            // InternalMyDsl.g:940:1: ( ( rule__Production__Group_3__0 )* )
            {
            // InternalMyDsl.g:940:1: ( ( rule__Production__Group_3__0 )* )
            // InternalMyDsl.g:941:2: ( rule__Production__Group_3__0 )*
            {
             before(grammarAccess.getProductionAccess().getGroup_3()); 
            // InternalMyDsl.g:942:2: ( rule__Production__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==62) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:942:3: rule__Production__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Production__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProductionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Production__Group__3__Impl"


    // $ANTLR start "rule__Production__Group_3__0"
    // InternalMyDsl.g:951:1: rule__Production__Group_3__0 : rule__Production__Group_3__0__Impl rule__Production__Group_3__1 ;
    public final void rule__Production__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( rule__Production__Group_3__0__Impl rule__Production__Group_3__1 )
            // InternalMyDsl.g:956:2: rule__Production__Group_3__0__Impl rule__Production__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Production__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Production__Group_3__1();

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
    // $ANTLR end "rule__Production__Group_3__0"


    // $ANTLR start "rule__Production__Group_3__0__Impl"
    // InternalMyDsl.g:963:1: rule__Production__Group_3__0__Impl : ( ( ( '|' ) ) ( ( '|' )* ) ) ;
    public final void rule__Production__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:967:1: ( ( ( ( '|' ) ) ( ( '|' )* ) ) )
            // InternalMyDsl.g:968:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            {
            // InternalMyDsl.g:968:1: ( ( ( '|' ) ) ( ( '|' )* ) )
            // InternalMyDsl.g:969:2: ( ( '|' ) ) ( ( '|' )* )
            {
            // InternalMyDsl.g:969:2: ( ( '|' ) )
            // InternalMyDsl.g:970:3: ( '|' )
            {
             before(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 
            // InternalMyDsl.g:971:3: ( '|' )
            // InternalMyDsl.g:971:4: '|'
            {
            match(input,62,FOLLOW_10); 

            }

             after(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 

            }

            // InternalMyDsl.g:974:2: ( ( '|' )* )
            // InternalMyDsl.g:975:3: ( '|' )*
            {
             before(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 
            // InternalMyDsl.g:976:3: ( '|' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==62) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:976:4: '|'
            	    {
            	    match(input,62,FOLLOW_10); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); 

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
    // $ANTLR end "rule__Production__Group_3__0__Impl"


    // $ANTLR start "rule__Production__Group_3__1"
    // InternalMyDsl.g:985:1: rule__Production__Group_3__1 : rule__Production__Group_3__1__Impl ;
    public final void rule__Production__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( rule__Production__Group_3__1__Impl )
            // InternalMyDsl.g:990:2: rule__Production__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Production__Group_3__1__Impl();

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
    // $ANTLR end "rule__Production__Group_3__1"


    // $ANTLR start "rule__Production__Group_3__1__Impl"
    // InternalMyDsl.g:996:1: rule__Production__Group_3__1__Impl : ( ( rule__Production__RigthAssignment_3_1 ) ) ;
    public final void rule__Production__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( ( ( rule__Production__RigthAssignment_3_1 ) ) )
            // InternalMyDsl.g:1001:1: ( ( rule__Production__RigthAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1001:1: ( ( rule__Production__RigthAssignment_3_1 ) )
            // InternalMyDsl.g:1002:2: ( rule__Production__RigthAssignment_3_1 )
            {
             before(grammarAccess.getProductionAccess().getRigthAssignment_3_1()); 
            // InternalMyDsl.g:1003:2: ( rule__Production__RigthAssignment_3_1 )
            // InternalMyDsl.g:1003:3: rule__Production__RigthAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Production__RigthAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProductionAccess().getRigthAssignment_3_1()); 

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
    // $ANTLR end "rule__Production__Group_3__1__Impl"


    // $ANTLR start "rule__Simple__Group__0"
    // InternalMyDsl.g:1012:1: rule__Simple__Group__0 : rule__Simple__Group__0__Impl rule__Simple__Group__1 ;
    public final void rule__Simple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( rule__Simple__Group__0__Impl rule__Simple__Group__1 )
            // InternalMyDsl.g:1017:2: rule__Simple__Group__0__Impl rule__Simple__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Simple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple__Group__1();

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
    // $ANTLR end "rule__Simple__Group__0"


    // $ANTLR start "rule__Simple__Group__0__Impl"
    // InternalMyDsl.g:1024:1: rule__Simple__Group__0__Impl : ( () ) ;
    public final void rule__Simple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( ( () ) )
            // InternalMyDsl.g:1029:1: ( () )
            {
            // InternalMyDsl.g:1029:1: ( () )
            // InternalMyDsl.g:1030:2: ()
            {
             before(grammarAccess.getSimpleAccess().getSimpleAction_0()); 
            // InternalMyDsl.g:1031:2: ()
            // InternalMyDsl.g:1031:3: 
            {
            }

             after(grammarAccess.getSimpleAccess().getSimpleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple__Group__0__Impl"


    // $ANTLR start "rule__Simple__Group__1"
    // InternalMyDsl.g:1039:1: rule__Simple__Group__1 : rule__Simple__Group__1__Impl ;
    public final void rule__Simple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1043:1: ( rule__Simple__Group__1__Impl )
            // InternalMyDsl.g:1044:2: rule__Simple__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple__Group__1__Impl();

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
    // $ANTLR end "rule__Simple__Group__1"


    // $ANTLR start "rule__Simple__Group__1__Impl"
    // InternalMyDsl.g:1050:1: rule__Simple__Group__1__Impl : ( ( rule__Simple__AlphaAssignment_1 ) ) ;
    public final void rule__Simple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1054:1: ( ( ( rule__Simple__AlphaAssignment_1 ) ) )
            // InternalMyDsl.g:1055:1: ( ( rule__Simple__AlphaAssignment_1 ) )
            {
            // InternalMyDsl.g:1055:1: ( ( rule__Simple__AlphaAssignment_1 ) )
            // InternalMyDsl.g:1056:2: ( rule__Simple__AlphaAssignment_1 )
            {
             before(grammarAccess.getSimpleAccess().getAlphaAssignment_1()); 
            // InternalMyDsl.g:1057:2: ( rule__Simple__AlphaAssignment_1 )
            // InternalMyDsl.g:1057:3: rule__Simple__AlphaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Simple__AlphaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getAlphaAssignment_1()); 

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
    // $ANTLR end "rule__Simple__Group__1__Impl"


    // $ANTLR start "rule__NonTerminal__Group__0"
    // InternalMyDsl.g:1066:1: rule__NonTerminal__Group__0 : rule__NonTerminal__Group__0__Impl rule__NonTerminal__Group__1 ;
    public final void rule__NonTerminal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( rule__NonTerminal__Group__0__Impl rule__NonTerminal__Group__1 )
            // InternalMyDsl.g:1071:2: rule__NonTerminal__Group__0__Impl rule__NonTerminal__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__NonTerminal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonTerminal__Group__1();

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
    // $ANTLR end "rule__NonTerminal__Group__0"


    // $ANTLR start "rule__NonTerminal__Group__0__Impl"
    // InternalMyDsl.g:1078:1: rule__NonTerminal__Group__0__Impl : ( () ) ;
    public final void rule__NonTerminal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( ( () ) )
            // InternalMyDsl.g:1083:1: ( () )
            {
            // InternalMyDsl.g:1083:1: ( () )
            // InternalMyDsl.g:1084:2: ()
            {
             before(grammarAccess.getNonTerminalAccess().getNonTerminalAction_0()); 
            // InternalMyDsl.g:1085:2: ()
            // InternalMyDsl.g:1085:3: 
            {
            }

             after(grammarAccess.getNonTerminalAccess().getNonTerminalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonTerminal__Group__0__Impl"


    // $ANTLR start "rule__NonTerminal__Group__1"
    // InternalMyDsl.g:1093:1: rule__NonTerminal__Group__1 : rule__NonTerminal__Group__1__Impl ;
    public final void rule__NonTerminal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( rule__NonTerminal__Group__1__Impl )
            // InternalMyDsl.g:1098:2: rule__NonTerminal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonTerminal__Group__1__Impl();

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
    // $ANTLR end "rule__NonTerminal__Group__1"


    // $ANTLR start "rule__NonTerminal__Group__1__Impl"
    // InternalMyDsl.g:1104:1: rule__NonTerminal__Group__1__Impl : ( ( rule__NonTerminal__VarAssignment_1 ) ) ;
    public final void rule__NonTerminal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1108:1: ( ( ( rule__NonTerminal__VarAssignment_1 ) ) )
            // InternalMyDsl.g:1109:1: ( ( rule__NonTerminal__VarAssignment_1 ) )
            {
            // InternalMyDsl.g:1109:1: ( ( rule__NonTerminal__VarAssignment_1 ) )
            // InternalMyDsl.g:1110:2: ( rule__NonTerminal__VarAssignment_1 )
            {
             before(grammarAccess.getNonTerminalAccess().getVarAssignment_1()); 
            // InternalMyDsl.g:1111:2: ( rule__NonTerminal__VarAssignment_1 )
            // InternalMyDsl.g:1111:3: rule__NonTerminal__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NonTerminal__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNonTerminalAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__NonTerminal__Group__1__Impl"


    // $ANTLR start "rule__Binary__Group__0"
    // InternalMyDsl.g:1120:1: rule__Binary__Group__0 : rule__Binary__Group__0__Impl rule__Binary__Group__1 ;
    public final void rule__Binary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( rule__Binary__Group__0__Impl rule__Binary__Group__1 )
            // InternalMyDsl.g:1125:2: rule__Binary__Group__0__Impl rule__Binary__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Binary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group__1();

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
    // $ANTLR end "rule__Binary__Group__0"


    // $ANTLR start "rule__Binary__Group__0__Impl"
    // InternalMyDsl.g:1132:1: rule__Binary__Group__0__Impl : ( () ) ;
    public final void rule__Binary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( ( () ) )
            // InternalMyDsl.g:1137:1: ( () )
            {
            // InternalMyDsl.g:1137:1: ( () )
            // InternalMyDsl.g:1138:2: ()
            {
             before(grammarAccess.getBinaryAccess().getBinaryAction_0()); 
            // InternalMyDsl.g:1139:2: ()
            // InternalMyDsl.g:1139:3: 
            {
            }

             after(grammarAccess.getBinaryAccess().getBinaryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__0__Impl"


    // $ANTLR start "rule__Binary__Group__1"
    // InternalMyDsl.g:1147:1: rule__Binary__Group__1 : rule__Binary__Group__1__Impl ;
    public final void rule__Binary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( rule__Binary__Group__1__Impl )
            // InternalMyDsl.g:1152:2: rule__Binary__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group__1__Impl();

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
    // $ANTLR end "rule__Binary__Group__1"


    // $ANTLR start "rule__Binary__Group__1__Impl"
    // InternalMyDsl.g:1158:1: rule__Binary__Group__1__Impl : ( ( rule__Binary__Group_1__0 ) ) ;
    public final void rule__Binary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( ( ( rule__Binary__Group_1__0 ) ) )
            // InternalMyDsl.g:1163:1: ( ( rule__Binary__Group_1__0 ) )
            {
            // InternalMyDsl.g:1163:1: ( ( rule__Binary__Group_1__0 ) )
            // InternalMyDsl.g:1164:2: ( rule__Binary__Group_1__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup_1()); 
            // InternalMyDsl.g:1165:2: ( rule__Binary__Group_1__0 )
            // InternalMyDsl.g:1165:3: rule__Binary__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Binary__Group__1__Impl"


    // $ANTLR start "rule__Binary__Group_1__0"
    // InternalMyDsl.g:1174:1: rule__Binary__Group_1__0 : rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 ;
    public final void rule__Binary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 )
            // InternalMyDsl.g:1179:2: rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Binary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group_1__1();

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
    // $ANTLR end "rule__Binary__Group_1__0"


    // $ANTLR start "rule__Binary__Group_1__0__Impl"
    // InternalMyDsl.g:1186:1: rule__Binary__Group_1__0__Impl : ( ( rule__Binary__FirstAssignment_1_0 ) ) ;
    public final void rule__Binary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1190:1: ( ( ( rule__Binary__FirstAssignment_1_0 ) ) )
            // InternalMyDsl.g:1191:1: ( ( rule__Binary__FirstAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1191:1: ( ( rule__Binary__FirstAssignment_1_0 ) )
            // InternalMyDsl.g:1192:2: ( rule__Binary__FirstAssignment_1_0 )
            {
             before(grammarAccess.getBinaryAccess().getFirstAssignment_1_0()); 
            // InternalMyDsl.g:1193:2: ( rule__Binary__FirstAssignment_1_0 )
            // InternalMyDsl.g:1193:3: rule__Binary__FirstAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Binary__FirstAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getFirstAssignment_1_0()); 

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
    // $ANTLR end "rule__Binary__Group_1__0__Impl"


    // $ANTLR start "rule__Binary__Group_1__1"
    // InternalMyDsl.g:1201:1: rule__Binary__Group_1__1 : rule__Binary__Group_1__1__Impl ;
    public final void rule__Binary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( rule__Binary__Group_1__1__Impl )
            // InternalMyDsl.g:1206:2: rule__Binary__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group_1__1__Impl();

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
    // $ANTLR end "rule__Binary__Group_1__1"


    // $ANTLR start "rule__Binary__Group_1__1__Impl"
    // InternalMyDsl.g:1212:1: rule__Binary__Group_1__1__Impl : ( ( rule__Binary__SecondAssignment_1_1 ) ) ;
    public final void rule__Binary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( ( ( rule__Binary__SecondAssignment_1_1 ) ) )
            // InternalMyDsl.g:1217:1: ( ( rule__Binary__SecondAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1217:1: ( ( rule__Binary__SecondAssignment_1_1 ) )
            // InternalMyDsl.g:1218:2: ( rule__Binary__SecondAssignment_1_1 )
            {
             before(grammarAccess.getBinaryAccess().getSecondAssignment_1_1()); 
            // InternalMyDsl.g:1219:2: ( rule__Binary__SecondAssignment_1_1 )
            // InternalMyDsl.g:1219:3: rule__Binary__SecondAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Binary__SecondAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getSecondAssignment_1_1()); 

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
    // $ANTLR end "rule__Binary__Group_1__1__Impl"


    // $ANTLR start "rule__GNFC__WAssignment_0"
    // InternalMyDsl.g:1228:1: rule__GNFC__WAssignment_0 : ( ruleSimple ) ;
    public final void rule__GNFC__WAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( ( ruleSimple ) )
            // InternalMyDsl.g:1233:2: ( ruleSimple )
            {
            // InternalMyDsl.g:1233:2: ( ruleSimple )
            // InternalMyDsl.g:1234:3: ruleSimple
            {
             before(grammarAccess.getGNFCAccess().getWSimpleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getGNFCAccess().getWSimpleParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__GNFC__WAssignment_0"


    // $ANTLR start "rule__GNFC__WAssignment_1"
    // InternalMyDsl.g:1243:1: rule__GNFC__WAssignment_1 : ( ruleSimple ) ;
    public final void rule__GNFC__WAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( ( ruleSimple ) )
            // InternalMyDsl.g:1248:2: ( ruleSimple )
            {
            // InternalMyDsl.g:1248:2: ( ruleSimple )
            // InternalMyDsl.g:1249:3: ruleSimple
            {
             before(grammarAccess.getGNFCAccess().getWSimpleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getGNFCAccess().getWSimpleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__GNFC__WAssignment_1"


    // $ANTLR start "rule__GNFC__InitAssignment_2"
    // InternalMyDsl.g:1258:1: rule__GNFC__InitAssignment_2 : ( ruleInitial ) ;
    public final void rule__GNFC__InitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1262:1: ( ( ruleInitial ) )
            // InternalMyDsl.g:1263:2: ( ruleInitial )
            {
            // InternalMyDsl.g:1263:2: ( ruleInitial )
            // InternalMyDsl.g:1264:3: ruleInitial
            {
             before(grammarAccess.getGNFCAccess().getInitInitialParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getGNFCAccess().getInitInitialParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__GNFC__InitAssignment_2"


    // $ANTLR start "rule__GNFC__ProductionsAssignment_3"
    // InternalMyDsl.g:1273:1: rule__GNFC__ProductionsAssignment_3 : ( ruleProduction ) ;
    public final void rule__GNFC__ProductionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1277:1: ( ( ruleProduction ) )
            // InternalMyDsl.g:1278:2: ( ruleProduction )
            {
            // InternalMyDsl.g:1278:2: ( ruleProduction )
            // InternalMyDsl.g:1279:3: ruleProduction
            {
             before(grammarAccess.getGNFCAccess().getProductionsProductionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProduction();

            state._fsp--;

             after(grammarAccess.getGNFCAccess().getProductionsProductionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__GNFC__ProductionsAssignment_3"


    // $ANTLR start "rule__Initial__LeftAssignment_0"
    // InternalMyDsl.g:1288:1: rule__Initial__LeftAssignment_0 : ( ( 'S' ) ) ;
    public final void rule__Initial__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1292:1: ( ( ( 'S' ) ) )
            // InternalMyDsl.g:1293:2: ( ( 'S' ) )
            {
            // InternalMyDsl.g:1293:2: ( ( 'S' ) )
            // InternalMyDsl.g:1294:3: ( 'S' )
            {
             before(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); 
            // InternalMyDsl.g:1295:3: ( 'S' )
            // InternalMyDsl.g:1296:4: 'S'
            {
             before(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); 

            }

             after(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); 

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
    // $ANTLR end "rule__Initial__LeftAssignment_0"


    // $ANTLR start "rule__Initial__RigthAssignment_2"
    // InternalMyDsl.g:1307:1: rule__Initial__RigthAssignment_2 : ( ruleRigth ) ;
    public final void rule__Initial__RigthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1311:1: ( ( ruleRigth ) )
            // InternalMyDsl.g:1312:2: ( ruleRigth )
            {
            // InternalMyDsl.g:1312:2: ( ruleRigth )
            // InternalMyDsl.g:1313:3: ruleRigth
            {
             before(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRigth();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Initial__RigthAssignment_2"


    // $ANTLR start "rule__Initial__RigthAssignment_3_1"
    // InternalMyDsl.g:1322:1: rule__Initial__RigthAssignment_3_1 : ( ruleRigth ) ;
    public final void rule__Initial__RigthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1326:1: ( ( ruleRigth ) )
            // InternalMyDsl.g:1327:2: ( ruleRigth )
            {
            // InternalMyDsl.g:1327:2: ( ruleRigth )
            // InternalMyDsl.g:1328:3: ruleRigth
            {
             before(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRigth();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Initial__RigthAssignment_3_1"


    // $ANTLR start "rule__Production__LeftAssignment_0"
    // InternalMyDsl.g:1337:1: rule__Production__LeftAssignment_0 : ( ruleNonTerminal ) ;
    public final void rule__Production__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1341:1: ( ( ruleNonTerminal ) )
            // InternalMyDsl.g:1342:2: ( ruleNonTerminal )
            {
            // InternalMyDsl.g:1342:2: ( ruleNonTerminal )
            // InternalMyDsl.g:1343:3: ruleNonTerminal
            {
             before(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Production__LeftAssignment_0"


    // $ANTLR start "rule__Production__RigthAssignment_2"
    // InternalMyDsl.g:1352:1: rule__Production__RigthAssignment_2 : ( ruleRigth ) ;
    public final void rule__Production__RigthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1356:1: ( ( ruleRigth ) )
            // InternalMyDsl.g:1357:2: ( ruleRigth )
            {
            // InternalMyDsl.g:1357:2: ( ruleRigth )
            // InternalMyDsl.g:1358:3: ruleRigth
            {
             before(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRigth();

            state._fsp--;

             after(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Production__RigthAssignment_2"


    // $ANTLR start "rule__Production__RigthAssignment_3_1"
    // InternalMyDsl.g:1367:1: rule__Production__RigthAssignment_3_1 : ( ruleRigth ) ;
    public final void rule__Production__RigthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1371:1: ( ( ruleRigth ) )
            // InternalMyDsl.g:1372:2: ( ruleRigth )
            {
            // InternalMyDsl.g:1372:2: ( ruleRigth )
            // InternalMyDsl.g:1373:3: ruleRigth
            {
             before(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRigth();

            state._fsp--;

             after(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Production__RigthAssignment_3_1"


    // $ANTLR start "rule__Rigth__SimpleAssignment_0"
    // InternalMyDsl.g:1382:1: rule__Rigth__SimpleAssignment_0 : ( ruleSimple ) ;
    public final void rule__Rigth__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1386:1: ( ( ruleSimple ) )
            // InternalMyDsl.g:1387:2: ( ruleSimple )
            {
            // InternalMyDsl.g:1387:2: ( ruleSimple )
            // InternalMyDsl.g:1388:3: ruleSimple
            {
             before(grammarAccess.getRigthAccess().getSimpleSimpleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimple();

            state._fsp--;

             after(grammarAccess.getRigthAccess().getSimpleSimpleParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Rigth__SimpleAssignment_0"


    // $ANTLR start "rule__Rigth__BinaryAssignment_1"
    // InternalMyDsl.g:1397:1: rule__Rigth__BinaryAssignment_1 : ( ruleBinary ) ;
    public final void rule__Rigth__BinaryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1401:1: ( ( ruleBinary ) )
            // InternalMyDsl.g:1402:2: ( ruleBinary )
            {
            // InternalMyDsl.g:1402:2: ( ruleBinary )
            // InternalMyDsl.g:1403:3: ruleBinary
            {
             before(grammarAccess.getRigthAccess().getBinaryBinaryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getRigthAccess().getBinaryBinaryParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rigth__BinaryAssignment_1"


    // $ANTLR start "rule__Simple__AlphaAssignment_1"
    // InternalMyDsl.g:1412:1: rule__Simple__AlphaAssignment_1 : ( ( rule__Simple__AlphaAlternatives_1_0 ) ) ;
    public final void rule__Simple__AlphaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1416:1: ( ( ( rule__Simple__AlphaAlternatives_1_0 ) ) )
            // InternalMyDsl.g:1417:2: ( ( rule__Simple__AlphaAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:1417:2: ( ( rule__Simple__AlphaAlternatives_1_0 ) )
            // InternalMyDsl.g:1418:3: ( rule__Simple__AlphaAlternatives_1_0 )
            {
             before(grammarAccess.getSimpleAccess().getAlphaAlternatives_1_0()); 
            // InternalMyDsl.g:1419:3: ( rule__Simple__AlphaAlternatives_1_0 )
            // InternalMyDsl.g:1419:4: rule__Simple__AlphaAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Simple__AlphaAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAccess().getAlphaAlternatives_1_0()); 

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
    // $ANTLR end "rule__Simple__AlphaAssignment_1"


    // $ANTLR start "rule__NonTerminal__VarAssignment_1"
    // InternalMyDsl.g:1427:1: rule__NonTerminal__VarAssignment_1 : ( ( rule__NonTerminal__VarAlternatives_1_0 ) ) ;
    public final void rule__NonTerminal__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1431:1: ( ( ( rule__NonTerminal__VarAlternatives_1_0 ) ) )
            // InternalMyDsl.g:1432:2: ( ( rule__NonTerminal__VarAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:1432:2: ( ( rule__NonTerminal__VarAlternatives_1_0 ) )
            // InternalMyDsl.g:1433:3: ( rule__NonTerminal__VarAlternatives_1_0 )
            {
             before(grammarAccess.getNonTerminalAccess().getVarAlternatives_1_0()); 
            // InternalMyDsl.g:1434:3: ( rule__NonTerminal__VarAlternatives_1_0 )
            // InternalMyDsl.g:1434:4: rule__NonTerminal__VarAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NonTerminal__VarAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNonTerminalAccess().getVarAlternatives_1_0()); 

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
    // $ANTLR end "rule__NonTerminal__VarAssignment_1"


    // $ANTLR start "rule__Binary__FirstAssignment_1_0"
    // InternalMyDsl.g:1442:1: rule__Binary__FirstAssignment_1_0 : ( ruleNonTerminal ) ;
    public final void rule__Binary__FirstAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1446:1: ( ( ruleNonTerminal ) )
            // InternalMyDsl.g:1447:2: ( ruleNonTerminal )
            {
            // InternalMyDsl.g:1447:2: ( ruleNonTerminal )
            // InternalMyDsl.g:1448:3: ruleNonTerminal
            {
             before(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Binary__FirstAssignment_1_0"


    // $ANTLR start "rule__Binary__SecondAssignment_1_1"
    // InternalMyDsl.g:1457:1: rule__Binary__SecondAssignment_1_1 : ( ruleNonTerminal ) ;
    public final void rule__Binary__SecondAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1461:1: ( ( ruleNonTerminal ) )
            // InternalMyDsl.g:1462:2: ( ruleNonTerminal )
            {
            // InternalMyDsl.g:1462:2: ( ruleNonTerminal )
            // InternalMyDsl.g:1463:3: ruleNonTerminal
            {
             before(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Binary__SecondAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x8000000FFFFFF800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000FFFFFF802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x1FFFFFF000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x1FFFFFF000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x1FFFFFFFFFFFF800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000FFFFFF800L});

}