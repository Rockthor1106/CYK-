package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'S'", "'->'", "'|'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'v'", "'w'", "'x'", "'y'", "'z'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GNFC";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGNFC"
    // InternalMyDsl.g:64:1: entryRuleGNFC returns [EObject current=null] : iv_ruleGNFC= ruleGNFC EOF ;
    public final EObject entryRuleGNFC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNFC = null;


        try {
            // InternalMyDsl.g:64:45: (iv_ruleGNFC= ruleGNFC EOF )
            // InternalMyDsl.g:65:2: iv_ruleGNFC= ruleGNFC EOF
            {
             newCompositeNode(grammarAccess.getGNFCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGNFC=ruleGNFC();

            state._fsp--;

             current =iv_ruleGNFC; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGNFC"


    // $ANTLR start "ruleGNFC"
    // InternalMyDsl.g:71:1: ruleGNFC returns [EObject current=null] : ( ( (lv_w_0_0= ruleSimple ) ) ( (lv_w_1_0= ruleSimple ) )* ( (lv_init_2_0= ruleInitial ) ) ( (lv_productions_3_0= ruleProduction ) )* ) ;
    public final EObject ruleGNFC() throws RecognitionException {
        EObject current = null;

        EObject lv_w_0_0 = null;

        EObject lv_w_1_0 = null;

        EObject lv_init_2_0 = null;

        EObject lv_productions_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_w_0_0= ruleSimple ) ) ( (lv_w_1_0= ruleSimple ) )* ( (lv_init_2_0= ruleInitial ) ) ( (lv_productions_3_0= ruleProduction ) )* ) )
            // InternalMyDsl.g:78:2: ( ( (lv_w_0_0= ruleSimple ) ) ( (lv_w_1_0= ruleSimple ) )* ( (lv_init_2_0= ruleInitial ) ) ( (lv_productions_3_0= ruleProduction ) )* )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_w_0_0= ruleSimple ) ) ( (lv_w_1_0= ruleSimple ) )* ( (lv_init_2_0= ruleInitial ) ) ( (lv_productions_3_0= ruleProduction ) )* )
            // InternalMyDsl.g:79:3: ( (lv_w_0_0= ruleSimple ) ) ( (lv_w_1_0= ruleSimple ) )* ( (lv_init_2_0= ruleInitial ) ) ( (lv_productions_3_0= ruleProduction ) )*
            {
            // InternalMyDsl.g:79:3: ( (lv_w_0_0= ruleSimple ) )
            // InternalMyDsl.g:80:4: (lv_w_0_0= ruleSimple )
            {
            // InternalMyDsl.g:80:4: (lv_w_0_0= ruleSimple )
            // InternalMyDsl.g:81:5: lv_w_0_0= ruleSimple
            {

            					newCompositeNode(grammarAccess.getGNFCAccess().getWSimpleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_w_0_0=ruleSimple();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGNFCRule());
            					}
            					add(
            						current,
            						"w",
            						lv_w_0_0,
            						"org.xtext.example.mydsl.MyDsl.Simple");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:98:3: ( (lv_w_1_0= ruleSimple ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=38)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:99:4: (lv_w_1_0= ruleSimple )
            	    {
            	    // InternalMyDsl.g:99:4: (lv_w_1_0= ruleSimple )
            	    // InternalMyDsl.g:100:5: lv_w_1_0= ruleSimple
            	    {

            	    					newCompositeNode(grammarAccess.getGNFCAccess().getWSimpleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_w_1_0=ruleSimple();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGNFCRule());
            	    					}
            	    					add(
            	    						current,
            	    						"w",
            	    						lv_w_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Simple");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:117:3: ( (lv_init_2_0= ruleInitial ) )
            // InternalMyDsl.g:118:4: (lv_init_2_0= ruleInitial )
            {
            // InternalMyDsl.g:118:4: (lv_init_2_0= ruleInitial )
            // InternalMyDsl.g:119:5: lv_init_2_0= ruleInitial
            {

            					newCompositeNode(grammarAccess.getGNFCAccess().getInitInitialParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_init_2_0=ruleInitial();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGNFCRule());
            					}
            					set(
            						current,
            						"init",
            						lv_init_2_0,
            						"org.xtext.example.mydsl.MyDsl.Initial");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:136:3: ( (lv_productions_3_0= ruleProduction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=39 && LA2_0<=63)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:137:4: (lv_productions_3_0= ruleProduction )
            	    {
            	    // InternalMyDsl.g:137:4: (lv_productions_3_0= ruleProduction )
            	    // InternalMyDsl.g:138:5: lv_productions_3_0= ruleProduction
            	    {

            	    					newCompositeNode(grammarAccess.getGNFCAccess().getProductionsProductionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_productions_3_0=ruleProduction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGNFCRule());
            	    					}
            	    					add(
            	    						current,
            	    						"productions",
            	    						lv_productions_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Production");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleGNFC"


    // $ANTLR start "entryRuleInitial"
    // InternalMyDsl.g:159:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalMyDsl.g:159:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalMyDsl.g:160:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalMyDsl.g:166:1: ruleInitial returns [EObject current=null] : ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rigth_2_0 = null;

        EObject lv_rigth_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:172:2: ( ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* ) )
            // InternalMyDsl.g:173:2: ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* )
            {
            // InternalMyDsl.g:173:2: ( ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* )
            // InternalMyDsl.g:174:3: ( (lv_left_0_0= 'S' ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )*
            {
            // InternalMyDsl.g:174:3: ( (lv_left_0_0= 'S' ) )
            // InternalMyDsl.g:175:4: (lv_left_0_0= 'S' )
            {
            // InternalMyDsl.g:175:4: (lv_left_0_0= 'S' )
            // InternalMyDsl.g:176:5: lv_left_0_0= 'S'
            {
            lv_left_0_0=(Token)match(input,11,FOLLOW_5); 

            					newLeafNode(lv_left_0_0, grammarAccess.getInitialAccess().getLeftSKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialRule());
            					}
            					setWithLastConsumed(current, "left", lv_left_0_0, "S");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMyDsl.g:192:3: ( (lv_rigth_2_0= ruleRigth ) )
            // InternalMyDsl.g:193:4: (lv_rigth_2_0= ruleRigth )
            {
            // InternalMyDsl.g:193:4: (lv_rigth_2_0= ruleRigth )
            // InternalMyDsl.g:194:5: lv_rigth_2_0= ruleRigth
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_rigth_2_0=ruleRigth();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					add(
            						current,
            						"rigth",
            						lv_rigth_2_0,
            						"org.xtext.example.mydsl.MyDsl.Rigth");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:211:3: ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:212:4: (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) )
            	    {
            	    // InternalMyDsl.g:212:4: (otherlv_3= '|' )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==13) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:213:5: otherlv_3= '|'
            	    	    {
            	    	    otherlv_3=(Token)match(input,13,FOLLOW_8); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0());
            	    	    				

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

            	    // InternalMyDsl.g:218:4: ( (lv_rigth_4_0= ruleRigth ) )
            	    // InternalMyDsl.g:219:5: (lv_rigth_4_0= ruleRigth )
            	    {
            	    // InternalMyDsl.g:219:5: (lv_rigth_4_0= ruleRigth )
            	    // InternalMyDsl.g:220:6: lv_rigth_4_0= ruleRigth
            	    {

            	    						newCompositeNode(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_rigth_4_0=ruleRigth();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInitialRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rigth",
            	    							lv_rigth_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.Rigth");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleProduction"
    // InternalMyDsl.g:242:1: entryRuleProduction returns [EObject current=null] : iv_ruleProduction= ruleProduction EOF ;
    public final EObject entryRuleProduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduction = null;


        try {
            // InternalMyDsl.g:242:51: (iv_ruleProduction= ruleProduction EOF )
            // InternalMyDsl.g:243:2: iv_ruleProduction= ruleProduction EOF
            {
             newCompositeNode(grammarAccess.getProductionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProduction=ruleProduction();

            state._fsp--;

             current =iv_ruleProduction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProduction"


    // $ANTLR start "ruleProduction"
    // InternalMyDsl.g:249:1: ruleProduction returns [EObject current=null] : ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* ) ;
    public final EObject ruleProduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_rigth_2_0 = null;

        EObject lv_rigth_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:255:2: ( ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* ) )
            // InternalMyDsl.g:256:2: ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* )
            {
            // InternalMyDsl.g:256:2: ( ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )* )
            // InternalMyDsl.g:257:3: ( (lv_left_0_0= ruleNonTerminal ) ) otherlv_1= '->' ( (lv_rigth_2_0= ruleRigth ) ) ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )*
            {
            // InternalMyDsl.g:257:3: ( (lv_left_0_0= ruleNonTerminal ) )
            // InternalMyDsl.g:258:4: (lv_left_0_0= ruleNonTerminal )
            {
            // InternalMyDsl.g:258:4: (lv_left_0_0= ruleNonTerminal )
            // InternalMyDsl.g:259:5: lv_left_0_0= ruleNonTerminal
            {

            					newCompositeNode(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_left_0_0=ruleNonTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.example.mydsl.MyDsl.NonTerminal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMyDsl.g:280:3: ( (lv_rigth_2_0= ruleRigth ) )
            // InternalMyDsl.g:281:4: (lv_rigth_2_0= ruleRigth )
            {
            // InternalMyDsl.g:281:4: (lv_rigth_2_0= ruleRigth )
            // InternalMyDsl.g:282:5: lv_rigth_2_0= ruleRigth
            {

            					newCompositeNode(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_rigth_2_0=ruleRigth();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductionRule());
            					}
            					add(
            						current,
            						"rigth",
            						lv_rigth_2_0,
            						"org.xtext.example.mydsl.MyDsl.Rigth");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:299:3: ( (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:300:4: (otherlv_3= '|' )+ ( (lv_rigth_4_0= ruleRigth ) )
            	    {
            	    // InternalMyDsl.g:300:4: (otherlv_3= '|' )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==13) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:301:5: otherlv_3= '|'
            	    	    {
            	    	    otherlv_3=(Token)match(input,13,FOLLOW_8); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0());
            	    	    				

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

            	    // InternalMyDsl.g:306:4: ( (lv_rigth_4_0= ruleRigth ) )
            	    // InternalMyDsl.g:307:5: (lv_rigth_4_0= ruleRigth )
            	    {
            	    // InternalMyDsl.g:307:5: (lv_rigth_4_0= ruleRigth )
            	    // InternalMyDsl.g:308:6: lv_rigth_4_0= ruleRigth
            	    {

            	    						newCompositeNode(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_rigth_4_0=ruleRigth();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProductionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rigth",
            	    							lv_rigth_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.Rigth");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleProduction"


    // $ANTLR start "entryRuleRigth"
    // InternalMyDsl.g:330:1: entryRuleRigth returns [EObject current=null] : iv_ruleRigth= ruleRigth EOF ;
    public final EObject entryRuleRigth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRigth = null;


        try {
            // InternalMyDsl.g:330:46: (iv_ruleRigth= ruleRigth EOF )
            // InternalMyDsl.g:331:2: iv_ruleRigth= ruleRigth EOF
            {
             newCompositeNode(grammarAccess.getRigthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRigth=ruleRigth();

            state._fsp--;

             current =iv_ruleRigth; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRigth"


    // $ANTLR start "ruleRigth"
    // InternalMyDsl.g:337:1: ruleRigth returns [EObject current=null] : ( ( (lv_simple_0_0= ruleSimple ) ) | ( (lv_binary_1_0= ruleBinary ) ) ) ;
    public final EObject ruleRigth() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_binary_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:343:2: ( ( ( (lv_simple_0_0= ruleSimple ) ) | ( (lv_binary_1_0= ruleBinary ) ) ) )
            // InternalMyDsl.g:344:2: ( ( (lv_simple_0_0= ruleSimple ) ) | ( (lv_binary_1_0= ruleBinary ) ) )
            {
            // InternalMyDsl.g:344:2: ( ( (lv_simple_0_0= ruleSimple ) ) | ( (lv_binary_1_0= ruleBinary ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=14 && LA7_0<=38)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=39 && LA7_0<=63)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:345:3: ( (lv_simple_0_0= ruleSimple ) )
                    {
                    // InternalMyDsl.g:345:3: ( (lv_simple_0_0= ruleSimple ) )
                    // InternalMyDsl.g:346:4: (lv_simple_0_0= ruleSimple )
                    {
                    // InternalMyDsl.g:346:4: (lv_simple_0_0= ruleSimple )
                    // InternalMyDsl.g:347:5: lv_simple_0_0= ruleSimple
                    {

                    					newCompositeNode(grammarAccess.getRigthAccess().getSimpleSimpleParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simple_0_0=ruleSimple();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRigthRule());
                    					}
                    					set(
                    						current,
                    						"simple",
                    						lv_simple_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Simple");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:365:3: ( (lv_binary_1_0= ruleBinary ) )
                    {
                    // InternalMyDsl.g:365:3: ( (lv_binary_1_0= ruleBinary ) )
                    // InternalMyDsl.g:366:4: (lv_binary_1_0= ruleBinary )
                    {
                    // InternalMyDsl.g:366:4: (lv_binary_1_0= ruleBinary )
                    // InternalMyDsl.g:367:5: lv_binary_1_0= ruleBinary
                    {

                    					newCompositeNode(grammarAccess.getRigthAccess().getBinaryBinaryParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_binary_1_0=ruleBinary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRigthRule());
                    					}
                    					set(
                    						current,
                    						"binary",
                    						lv_binary_1_0,
                    						"org.xtext.example.mydsl.MyDsl.Binary");
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
    // $ANTLR end "ruleRigth"


    // $ANTLR start "entryRuleSimple"
    // InternalMyDsl.g:388:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalMyDsl.g:388:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalMyDsl.g:389:2: iv_ruleSimple= ruleSimple EOF
            {
             newCompositeNode(grammarAccess.getSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimple=ruleSimple();

            state._fsp--;

             current =iv_ruleSimple; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimple"


    // $ANTLR start "ruleSimple"
    // InternalMyDsl.g:395:1: ruleSimple returns [EObject current=null] : ( () ( ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) ) ) ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        Token lv_alpha_1_1=null;
        Token lv_alpha_1_2=null;
        Token lv_alpha_1_3=null;
        Token lv_alpha_1_4=null;
        Token lv_alpha_1_5=null;
        Token lv_alpha_1_6=null;
        Token lv_alpha_1_7=null;
        Token lv_alpha_1_8=null;
        Token lv_alpha_1_9=null;
        Token lv_alpha_1_10=null;
        Token lv_alpha_1_11=null;
        Token lv_alpha_1_12=null;
        Token lv_alpha_1_13=null;
        Token lv_alpha_1_14=null;
        Token lv_alpha_1_15=null;
        Token lv_alpha_1_16=null;
        Token lv_alpha_1_17=null;
        Token lv_alpha_1_18=null;
        Token lv_alpha_1_19=null;
        Token lv_alpha_1_20=null;
        Token lv_alpha_1_21=null;
        Token lv_alpha_1_22=null;
        Token lv_alpha_1_23=null;
        Token lv_alpha_1_24=null;
        Token lv_alpha_1_25=null;


        	enterRule();

        try {
            // InternalMyDsl.g:401:2: ( ( () ( ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) ) ) ) )
            // InternalMyDsl.g:402:2: ( () ( ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) ) ) )
            {
            // InternalMyDsl.g:402:2: ( () ( ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) ) ) )
            // InternalMyDsl.g:403:3: () ( ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) ) )
            {
            // InternalMyDsl.g:403:3: ()
            // InternalMyDsl.g:404:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleAccess().getSimpleAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:410:3: ( ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) ) )
            // InternalMyDsl.g:411:4: ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) )
            {
            // InternalMyDsl.g:411:4: ( (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' ) )
            // InternalMyDsl.g:412:5: (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' )
            {
            // InternalMyDsl.g:412:5: (lv_alpha_1_1= 'a' | lv_alpha_1_2= 'b' | lv_alpha_1_3= 'c' | lv_alpha_1_4= 'd' | lv_alpha_1_5= 'e' | lv_alpha_1_6= 'f' | lv_alpha_1_7= 'g' | lv_alpha_1_8= 'h' | lv_alpha_1_9= 'i' | lv_alpha_1_10= 'j' | lv_alpha_1_11= 'k' | lv_alpha_1_12= 'l' | lv_alpha_1_13= 'm' | lv_alpha_1_14= 'n' | lv_alpha_1_15= 'o' | lv_alpha_1_16= 'p' | lv_alpha_1_17= 'q' | lv_alpha_1_18= 'r' | lv_alpha_1_19= 's' | lv_alpha_1_20= 't' | lv_alpha_1_21= 'v' | lv_alpha_1_22= 'w' | lv_alpha_1_23= 'x' | lv_alpha_1_24= 'y' | lv_alpha_1_25= 'z' )
            int alt8=25;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
                {
                alt8=3;
                }
                break;
            case 17:
                {
                alt8=4;
                }
                break;
            case 18:
                {
                alt8=5;
                }
                break;
            case 19:
                {
                alt8=6;
                }
                break;
            case 20:
                {
                alt8=7;
                }
                break;
            case 21:
                {
                alt8=8;
                }
                break;
            case 22:
                {
                alt8=9;
                }
                break;
            case 23:
                {
                alt8=10;
                }
                break;
            case 24:
                {
                alt8=11;
                }
                break;
            case 25:
                {
                alt8=12;
                }
                break;
            case 26:
                {
                alt8=13;
                }
                break;
            case 27:
                {
                alt8=14;
                }
                break;
            case 28:
                {
                alt8=15;
                }
                break;
            case 29:
                {
                alt8=16;
                }
                break;
            case 30:
                {
                alt8=17;
                }
                break;
            case 31:
                {
                alt8=18;
                }
                break;
            case 32:
                {
                alt8=19;
                }
                break;
            case 33:
                {
                alt8=20;
                }
                break;
            case 34:
                {
                alt8=21;
                }
                break;
            case 35:
                {
                alt8=22;
                }
                break;
            case 36:
                {
                alt8=23;
                }
                break;
            case 37:
                {
                alt8=24;
                }
                break;
            case 38:
                {
                alt8=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:413:6: lv_alpha_1_1= 'a'
                    {
                    lv_alpha_1_1=(Token)match(input,14,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_1, grammarAccess.getSimpleAccess().getAlphaAKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:424:6: lv_alpha_1_2= 'b'
                    {
                    lv_alpha_1_2=(Token)match(input,15,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_2, grammarAccess.getSimpleAccess().getAlphaBKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:435:6: lv_alpha_1_3= 'c'
                    {
                    lv_alpha_1_3=(Token)match(input,16,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_3, grammarAccess.getSimpleAccess().getAlphaCKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:446:6: lv_alpha_1_4= 'd'
                    {
                    lv_alpha_1_4=(Token)match(input,17,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_4, grammarAccess.getSimpleAccess().getAlphaDKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:457:6: lv_alpha_1_5= 'e'
                    {
                    lv_alpha_1_5=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_5, grammarAccess.getSimpleAccess().getAlphaEKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:468:6: lv_alpha_1_6= 'f'
                    {
                    lv_alpha_1_6=(Token)match(input,19,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_6, grammarAccess.getSimpleAccess().getAlphaFKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:479:6: lv_alpha_1_7= 'g'
                    {
                    lv_alpha_1_7=(Token)match(input,20,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_7, grammarAccess.getSimpleAccess().getAlphaGKeyword_1_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:490:6: lv_alpha_1_8= 'h'
                    {
                    lv_alpha_1_8=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_8, grammarAccess.getSimpleAccess().getAlphaHKeyword_1_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:501:6: lv_alpha_1_9= 'i'
                    {
                    lv_alpha_1_9=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_9, grammarAccess.getSimpleAccess().getAlphaIKeyword_1_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:512:6: lv_alpha_1_10= 'j'
                    {
                    lv_alpha_1_10=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_10, grammarAccess.getSimpleAccess().getAlphaJKeyword_1_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:523:6: lv_alpha_1_11= 'k'
                    {
                    lv_alpha_1_11=(Token)match(input,24,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_11, grammarAccess.getSimpleAccess().getAlphaKKeyword_1_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:534:6: lv_alpha_1_12= 'l'
                    {
                    lv_alpha_1_12=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_12, grammarAccess.getSimpleAccess().getAlphaLKeyword_1_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_12, null);
                    					

                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:545:6: lv_alpha_1_13= 'm'
                    {
                    lv_alpha_1_13=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_13, grammarAccess.getSimpleAccess().getAlphaMKeyword_1_0_12());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_13, null);
                    					

                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:556:6: lv_alpha_1_14= 'n'
                    {
                    lv_alpha_1_14=(Token)match(input,27,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_14, grammarAccess.getSimpleAccess().getAlphaNKeyword_1_0_13());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_14, null);
                    					

                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:567:6: lv_alpha_1_15= 'o'
                    {
                    lv_alpha_1_15=(Token)match(input,28,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_15, grammarAccess.getSimpleAccess().getAlphaOKeyword_1_0_14());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_15, null);
                    					

                    }
                    break;
                case 16 :
                    // InternalMyDsl.g:578:6: lv_alpha_1_16= 'p'
                    {
                    lv_alpha_1_16=(Token)match(input,29,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_16, grammarAccess.getSimpleAccess().getAlphaPKeyword_1_0_15());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_16, null);
                    					

                    }
                    break;
                case 17 :
                    // InternalMyDsl.g:589:6: lv_alpha_1_17= 'q'
                    {
                    lv_alpha_1_17=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_17, grammarAccess.getSimpleAccess().getAlphaQKeyword_1_0_16());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_17, null);
                    					

                    }
                    break;
                case 18 :
                    // InternalMyDsl.g:600:6: lv_alpha_1_18= 'r'
                    {
                    lv_alpha_1_18=(Token)match(input,31,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_18, grammarAccess.getSimpleAccess().getAlphaRKeyword_1_0_17());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_18, null);
                    					

                    }
                    break;
                case 19 :
                    // InternalMyDsl.g:611:6: lv_alpha_1_19= 's'
                    {
                    lv_alpha_1_19=(Token)match(input,32,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_19, grammarAccess.getSimpleAccess().getAlphaSKeyword_1_0_18());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_19, null);
                    					

                    }
                    break;
                case 20 :
                    // InternalMyDsl.g:622:6: lv_alpha_1_20= 't'
                    {
                    lv_alpha_1_20=(Token)match(input,33,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_20, grammarAccess.getSimpleAccess().getAlphaTKeyword_1_0_19());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_20, null);
                    					

                    }
                    break;
                case 21 :
                    // InternalMyDsl.g:633:6: lv_alpha_1_21= 'v'
                    {
                    lv_alpha_1_21=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_21, grammarAccess.getSimpleAccess().getAlphaVKeyword_1_0_20());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_21, null);
                    					

                    }
                    break;
                case 22 :
                    // InternalMyDsl.g:644:6: lv_alpha_1_22= 'w'
                    {
                    lv_alpha_1_22=(Token)match(input,35,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_22, grammarAccess.getSimpleAccess().getAlphaWKeyword_1_0_21());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_22, null);
                    					

                    }
                    break;
                case 23 :
                    // InternalMyDsl.g:655:6: lv_alpha_1_23= 'x'
                    {
                    lv_alpha_1_23=(Token)match(input,36,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_23, grammarAccess.getSimpleAccess().getAlphaXKeyword_1_0_22());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_23, null);
                    					

                    }
                    break;
                case 24 :
                    // InternalMyDsl.g:666:6: lv_alpha_1_24= 'y'
                    {
                    lv_alpha_1_24=(Token)match(input,37,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_24, grammarAccess.getSimpleAccess().getAlphaYKeyword_1_0_23());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_24, null);
                    					

                    }
                    break;
                case 25 :
                    // InternalMyDsl.g:677:6: lv_alpha_1_25= 'z'
                    {
                    lv_alpha_1_25=(Token)match(input,38,FOLLOW_2); 

                    						newLeafNode(lv_alpha_1_25, grammarAccess.getSimpleAccess().getAlphaZKeyword_1_0_24());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleRule());
                    						}
                    						setWithLastConsumed(current, "alpha", lv_alpha_1_25, null);
                    					

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
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleNonTerminal"
    // InternalMyDsl.g:694:1: entryRuleNonTerminal returns [EObject current=null] : iv_ruleNonTerminal= ruleNonTerminal EOF ;
    public final EObject entryRuleNonTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonTerminal = null;


        try {
            // InternalMyDsl.g:694:52: (iv_ruleNonTerminal= ruleNonTerminal EOF )
            // InternalMyDsl.g:695:2: iv_ruleNonTerminal= ruleNonTerminal EOF
            {
             newCompositeNode(grammarAccess.getNonTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonTerminal=ruleNonTerminal();

            state._fsp--;

             current =iv_ruleNonTerminal; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNonTerminal"


    // $ANTLR start "ruleNonTerminal"
    // InternalMyDsl.g:701:1: ruleNonTerminal returns [EObject current=null] : ( () ( ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) ) ) ) ;
    public final EObject ruleNonTerminal() throws RecognitionException {
        EObject current = null;

        Token lv_var_1_1=null;
        Token lv_var_1_2=null;
        Token lv_var_1_3=null;
        Token lv_var_1_4=null;
        Token lv_var_1_5=null;
        Token lv_var_1_6=null;
        Token lv_var_1_7=null;
        Token lv_var_1_8=null;
        Token lv_var_1_9=null;
        Token lv_var_1_10=null;
        Token lv_var_1_11=null;
        Token lv_var_1_12=null;
        Token lv_var_1_13=null;
        Token lv_var_1_14=null;
        Token lv_var_1_15=null;
        Token lv_var_1_16=null;
        Token lv_var_1_17=null;
        Token lv_var_1_18=null;
        Token lv_var_1_19=null;
        Token lv_var_1_20=null;
        Token lv_var_1_21=null;
        Token lv_var_1_22=null;
        Token lv_var_1_23=null;
        Token lv_var_1_24=null;
        Token lv_var_1_25=null;


        	enterRule();

        try {
            // InternalMyDsl.g:707:2: ( ( () ( ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) ) ) ) )
            // InternalMyDsl.g:708:2: ( () ( ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) ) ) )
            {
            // InternalMyDsl.g:708:2: ( () ( ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) ) ) )
            // InternalMyDsl.g:709:3: () ( ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) ) )
            {
            // InternalMyDsl.g:709:3: ()
            // InternalMyDsl.g:710:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNonTerminalAccess().getNonTerminalAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:716:3: ( ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) ) )
            // InternalMyDsl.g:717:4: ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) )
            {
            // InternalMyDsl.g:717:4: ( (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' ) )
            // InternalMyDsl.g:718:5: (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' )
            {
            // InternalMyDsl.g:718:5: (lv_var_1_1= 'A' | lv_var_1_2= 'B' | lv_var_1_3= 'C' | lv_var_1_4= 'D' | lv_var_1_5= 'E' | lv_var_1_6= 'F' | lv_var_1_7= 'G' | lv_var_1_8= 'H' | lv_var_1_9= 'I' | lv_var_1_10= 'J' | lv_var_1_11= 'K' | lv_var_1_12= 'L' | lv_var_1_13= 'M' | lv_var_1_14= 'N' | lv_var_1_15= 'O' | lv_var_1_16= 'P' | lv_var_1_17= 'Q' | lv_var_1_18= 'R' | lv_var_1_19= 'T' | lv_var_1_20= 'U' | lv_var_1_21= 'V' | lv_var_1_22= 'W' | lv_var_1_23= 'X' | lv_var_1_24= 'Y' | lv_var_1_25= 'Z' )
            int alt9=25;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt9=1;
                }
                break;
            case 40:
                {
                alt9=2;
                }
                break;
            case 41:
                {
                alt9=3;
                }
                break;
            case 42:
                {
                alt9=4;
                }
                break;
            case 43:
                {
                alt9=5;
                }
                break;
            case 44:
                {
                alt9=6;
                }
                break;
            case 45:
                {
                alt9=7;
                }
                break;
            case 46:
                {
                alt9=8;
                }
                break;
            case 47:
                {
                alt9=9;
                }
                break;
            case 48:
                {
                alt9=10;
                }
                break;
            case 49:
                {
                alt9=11;
                }
                break;
            case 50:
                {
                alt9=12;
                }
                break;
            case 51:
                {
                alt9=13;
                }
                break;
            case 52:
                {
                alt9=14;
                }
                break;
            case 53:
                {
                alt9=15;
                }
                break;
            case 54:
                {
                alt9=16;
                }
                break;
            case 55:
                {
                alt9=17;
                }
                break;
            case 56:
                {
                alt9=18;
                }
                break;
            case 57:
                {
                alt9=19;
                }
                break;
            case 58:
                {
                alt9=20;
                }
                break;
            case 59:
                {
                alt9=21;
                }
                break;
            case 60:
                {
                alt9=22;
                }
                break;
            case 61:
                {
                alt9=23;
                }
                break;
            case 62:
                {
                alt9=24;
                }
                break;
            case 63:
                {
                alt9=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:719:6: lv_var_1_1= 'A'
                    {
                    lv_var_1_1=(Token)match(input,39,FOLLOW_2); 

                    						newLeafNode(lv_var_1_1, grammarAccess.getNonTerminalAccess().getVarAKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:730:6: lv_var_1_2= 'B'
                    {
                    lv_var_1_2=(Token)match(input,40,FOLLOW_2); 

                    						newLeafNode(lv_var_1_2, grammarAccess.getNonTerminalAccess().getVarBKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:741:6: lv_var_1_3= 'C'
                    {
                    lv_var_1_3=(Token)match(input,41,FOLLOW_2); 

                    						newLeafNode(lv_var_1_3, grammarAccess.getNonTerminalAccess().getVarCKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:752:6: lv_var_1_4= 'D'
                    {
                    lv_var_1_4=(Token)match(input,42,FOLLOW_2); 

                    						newLeafNode(lv_var_1_4, grammarAccess.getNonTerminalAccess().getVarDKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:763:6: lv_var_1_5= 'E'
                    {
                    lv_var_1_5=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_var_1_5, grammarAccess.getNonTerminalAccess().getVarEKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:774:6: lv_var_1_6= 'F'
                    {
                    lv_var_1_6=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_var_1_6, grammarAccess.getNonTerminalAccess().getVarFKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:785:6: lv_var_1_7= 'G'
                    {
                    lv_var_1_7=(Token)match(input,45,FOLLOW_2); 

                    						newLeafNode(lv_var_1_7, grammarAccess.getNonTerminalAccess().getVarGKeyword_1_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:796:6: lv_var_1_8= 'H'
                    {
                    lv_var_1_8=(Token)match(input,46,FOLLOW_2); 

                    						newLeafNode(lv_var_1_8, grammarAccess.getNonTerminalAccess().getVarHKeyword_1_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:807:6: lv_var_1_9= 'I'
                    {
                    lv_var_1_9=(Token)match(input,47,FOLLOW_2); 

                    						newLeafNode(lv_var_1_9, grammarAccess.getNonTerminalAccess().getVarIKeyword_1_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:818:6: lv_var_1_10= 'J'
                    {
                    lv_var_1_10=(Token)match(input,48,FOLLOW_2); 

                    						newLeafNode(lv_var_1_10, grammarAccess.getNonTerminalAccess().getVarJKeyword_1_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:829:6: lv_var_1_11= 'K'
                    {
                    lv_var_1_11=(Token)match(input,49,FOLLOW_2); 

                    						newLeafNode(lv_var_1_11, grammarAccess.getNonTerminalAccess().getVarKKeyword_1_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:840:6: lv_var_1_12= 'L'
                    {
                    lv_var_1_12=(Token)match(input,50,FOLLOW_2); 

                    						newLeafNode(lv_var_1_12, grammarAccess.getNonTerminalAccess().getVarLKeyword_1_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_12, null);
                    					

                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:851:6: lv_var_1_13= 'M'
                    {
                    lv_var_1_13=(Token)match(input,51,FOLLOW_2); 

                    						newLeafNode(lv_var_1_13, grammarAccess.getNonTerminalAccess().getVarMKeyword_1_0_12());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_13, null);
                    					

                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:862:6: lv_var_1_14= 'N'
                    {
                    lv_var_1_14=(Token)match(input,52,FOLLOW_2); 

                    						newLeafNode(lv_var_1_14, grammarAccess.getNonTerminalAccess().getVarNKeyword_1_0_13());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_14, null);
                    					

                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:873:6: lv_var_1_15= 'O'
                    {
                    lv_var_1_15=(Token)match(input,53,FOLLOW_2); 

                    						newLeafNode(lv_var_1_15, grammarAccess.getNonTerminalAccess().getVarOKeyword_1_0_14());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_15, null);
                    					

                    }
                    break;
                case 16 :
                    // InternalMyDsl.g:884:6: lv_var_1_16= 'P'
                    {
                    lv_var_1_16=(Token)match(input,54,FOLLOW_2); 

                    						newLeafNode(lv_var_1_16, grammarAccess.getNonTerminalAccess().getVarPKeyword_1_0_15());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_16, null);
                    					

                    }
                    break;
                case 17 :
                    // InternalMyDsl.g:895:6: lv_var_1_17= 'Q'
                    {
                    lv_var_1_17=(Token)match(input,55,FOLLOW_2); 

                    						newLeafNode(lv_var_1_17, grammarAccess.getNonTerminalAccess().getVarQKeyword_1_0_16());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_17, null);
                    					

                    }
                    break;
                case 18 :
                    // InternalMyDsl.g:906:6: lv_var_1_18= 'R'
                    {
                    lv_var_1_18=(Token)match(input,56,FOLLOW_2); 

                    						newLeafNode(lv_var_1_18, grammarAccess.getNonTerminalAccess().getVarRKeyword_1_0_17());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_18, null);
                    					

                    }
                    break;
                case 19 :
                    // InternalMyDsl.g:917:6: lv_var_1_19= 'T'
                    {
                    lv_var_1_19=(Token)match(input,57,FOLLOW_2); 

                    						newLeafNode(lv_var_1_19, grammarAccess.getNonTerminalAccess().getVarTKeyword_1_0_18());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_19, null);
                    					

                    }
                    break;
                case 20 :
                    // InternalMyDsl.g:928:6: lv_var_1_20= 'U'
                    {
                    lv_var_1_20=(Token)match(input,58,FOLLOW_2); 

                    						newLeafNode(lv_var_1_20, grammarAccess.getNonTerminalAccess().getVarUKeyword_1_0_19());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_20, null);
                    					

                    }
                    break;
                case 21 :
                    // InternalMyDsl.g:939:6: lv_var_1_21= 'V'
                    {
                    lv_var_1_21=(Token)match(input,59,FOLLOW_2); 

                    						newLeafNode(lv_var_1_21, grammarAccess.getNonTerminalAccess().getVarVKeyword_1_0_20());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_21, null);
                    					

                    }
                    break;
                case 22 :
                    // InternalMyDsl.g:950:6: lv_var_1_22= 'W'
                    {
                    lv_var_1_22=(Token)match(input,60,FOLLOW_2); 

                    						newLeafNode(lv_var_1_22, grammarAccess.getNonTerminalAccess().getVarWKeyword_1_0_21());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_22, null);
                    					

                    }
                    break;
                case 23 :
                    // InternalMyDsl.g:961:6: lv_var_1_23= 'X'
                    {
                    lv_var_1_23=(Token)match(input,61,FOLLOW_2); 

                    						newLeafNode(lv_var_1_23, grammarAccess.getNonTerminalAccess().getVarXKeyword_1_0_22());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_23, null);
                    					

                    }
                    break;
                case 24 :
                    // InternalMyDsl.g:972:6: lv_var_1_24= 'Y'
                    {
                    lv_var_1_24=(Token)match(input,62,FOLLOW_2); 

                    						newLeafNode(lv_var_1_24, grammarAccess.getNonTerminalAccess().getVarYKeyword_1_0_23());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_24, null);
                    					

                    }
                    break;
                case 25 :
                    // InternalMyDsl.g:983:6: lv_var_1_25= 'Z'
                    {
                    lv_var_1_25=(Token)match(input,63,FOLLOW_2); 

                    						newLeafNode(lv_var_1_25, grammarAccess.getNonTerminalAccess().getVarZKeyword_1_0_24());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonTerminalRule());
                    						}
                    						setWithLastConsumed(current, "var", lv_var_1_25, null);
                    					

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
    // $ANTLR end "ruleNonTerminal"


    // $ANTLR start "entryRuleBinary"
    // InternalMyDsl.g:1000:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // InternalMyDsl.g:1000:47: (iv_ruleBinary= ruleBinary EOF )
            // InternalMyDsl.g:1001:2: iv_ruleBinary= ruleBinary EOF
            {
             newCompositeNode(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinary=ruleBinary();

            state._fsp--;

             current =iv_ruleBinary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBinary"


    // $ANTLR start "ruleBinary"
    // InternalMyDsl.g:1007:1: ruleBinary returns [EObject current=null] : ( () ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) ) ) ;
    public final EObject ruleBinary() throws RecognitionException {
        EObject current = null;

        EObject lv_first_1_0 = null;

        EObject lv_second_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1013:2: ( ( () ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) ) ) )
            // InternalMyDsl.g:1014:2: ( () ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) ) )
            {
            // InternalMyDsl.g:1014:2: ( () ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) ) )
            // InternalMyDsl.g:1015:3: () ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) )
            {
            // InternalMyDsl.g:1015:3: ()
            // InternalMyDsl.g:1016:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBinaryAccess().getBinaryAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1022:3: ( ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) ) )
            // InternalMyDsl.g:1023:4: ( (lv_first_1_0= ruleNonTerminal ) ) ( (lv_second_2_0= ruleNonTerminal ) )
            {
            // InternalMyDsl.g:1023:4: ( (lv_first_1_0= ruleNonTerminal ) )
            // InternalMyDsl.g:1024:5: (lv_first_1_0= ruleNonTerminal )
            {
            // InternalMyDsl.g:1024:5: (lv_first_1_0= ruleNonTerminal )
            // InternalMyDsl.g:1025:6: lv_first_1_0= ruleNonTerminal
            {

            						newCompositeNode(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_9);
            lv_first_1_0=ruleNonTerminal();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBinaryRule());
            						}
            						set(
            							current,
            							"first",
            							lv_first_1_0,
            							"org.xtext.example.mydsl.MyDsl.NonTerminal");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMyDsl.g:1042:4: ( (lv_second_2_0= ruleNonTerminal ) )
            // InternalMyDsl.g:1043:5: (lv_second_2_0= ruleNonTerminal )
            {
            // InternalMyDsl.g:1043:5: (lv_second_2_0= ruleNonTerminal )
            // InternalMyDsl.g:1044:6: lv_second_2_0= ruleNonTerminal
            {

            						newCompositeNode(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_second_2_0=ruleNonTerminal();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBinaryRule());
            						}
            						set(
            							current,
            							"second",
            							lv_second_2_0,
            							"org.xtext.example.mydsl.MyDsl.NonTerminal");
            						afterParserOrEnumRuleCall();
            					

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
    // $ANTLR end "ruleBinary"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000007FFFFFC800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0xFFFFFF8000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xFFFFFFFFFFFFC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xFFFFFFFFFFFFE000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0xFFFFFF8000000000L});

}