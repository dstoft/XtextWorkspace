package sdu.mdsd.math.interpreter.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sdu.mdsd.math.interpreter.services.MathInterpreterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathInterpreterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMathInterpreterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathInterpreterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathInterpreterParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMathInterpreter.g"; }



     	private MathInterpreterGrammarAccess grammarAccess;

        public InternalMathInterpreterParser(TokenStream input, MathInterpreterGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathInterpreterGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMathInterpreter.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMathInterpreter.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMathInterpreter.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMathInterpreter.g:71:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:77:2: ( (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) ) )
            // InternalMathInterpreter.g:78:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) )
            {
            // InternalMathInterpreter.g:78:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) )
            // InternalMathInterpreter.g:79:3: otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getResultKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMathExpAccess().getIsKeyword_1());
            		
            // InternalMathInterpreter.g:87:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalMathInterpreter.g:88:4: (lv_exp_2_0= ruleExp )
            {
            // InternalMathInterpreter.g:88:4: (lv_exp_2_0= ruleExp )
            // InternalMathInterpreter.g:89:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"sdu.mdsd.math.interpreter.MathInterpreter.Exp");
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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMathInterpreter.g:110:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMathInterpreter.g:110:44: (iv_ruleExp= ruleExp EOF )
            // InternalMathInterpreter.g:111:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMathInterpreter.g:117:1: ruleExp returns [EObject current=null] : ( ( (lv_left_0_0= ruleFactor ) ) ( ( ( (lv_operator_1_0= ruleExpOp ) ) () ) ( (lv_right_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_operator_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:123:2: ( ( ( (lv_left_0_0= ruleFactor ) ) ( ( ( (lv_operator_1_0= ruleExpOp ) ) () ) ( (lv_right_3_0= ruleFactor ) ) )* ) )
            // InternalMathInterpreter.g:124:2: ( ( (lv_left_0_0= ruleFactor ) ) ( ( ( (lv_operator_1_0= ruleExpOp ) ) () ) ( (lv_right_3_0= ruleFactor ) ) )* )
            {
            // InternalMathInterpreter.g:124:2: ( ( (lv_left_0_0= ruleFactor ) ) ( ( ( (lv_operator_1_0= ruleExpOp ) ) () ) ( (lv_right_3_0= ruleFactor ) ) )* )
            // InternalMathInterpreter.g:125:3: ( (lv_left_0_0= ruleFactor ) ) ( ( ( (lv_operator_1_0= ruleExpOp ) ) () ) ( (lv_right_3_0= ruleFactor ) ) )*
            {
            // InternalMathInterpreter.g:125:3: ( (lv_left_0_0= ruleFactor ) )
            // InternalMathInterpreter.g:126:4: (lv_left_0_0= ruleFactor )
            {
            // InternalMathInterpreter.g:126:4: (lv_left_0_0= ruleFactor )
            // InternalMathInterpreter.g:127:5: lv_left_0_0= ruleFactor
            {

            					newCompositeNode(grammarAccess.getExpAccess().getLeftFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_left_0_0=ruleFactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"sdu.mdsd.math.interpreter.MathInterpreter.Factor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMathInterpreter.g:144:3: ( ( ( (lv_operator_1_0= ruleExpOp ) ) () ) ( (lv_right_3_0= ruleFactor ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMathInterpreter.g:145:4: ( ( (lv_operator_1_0= ruleExpOp ) ) () ) ( (lv_right_3_0= ruleFactor ) )
            	    {
            	    // InternalMathInterpreter.g:145:4: ( ( (lv_operator_1_0= ruleExpOp ) ) () )
            	    // InternalMathInterpreter.g:146:5: ( (lv_operator_1_0= ruleExpOp ) ) ()
            	    {
            	    // InternalMathInterpreter.g:146:5: ( (lv_operator_1_0= ruleExpOp ) )
            	    // InternalMathInterpreter.g:147:6: (lv_operator_1_0= ruleExpOp )
            	    {
            	    // InternalMathInterpreter.g:147:6: (lv_operator_1_0= ruleExpOp )
            	    // InternalMathInterpreter.g:148:7: lv_operator_1_0= ruleExpOp
            	    {

            	    							newCompositeNode(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0_0());
            	    						
            	    pushFollow(FOLLOW_4);
            	    lv_operator_1_0=ruleExpOp();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"operator",
            	    								lv_operator_1_0,
            	    								"sdu.mdsd.math.interpreter.MathInterpreter.ExpOp");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMathInterpreter.g:165:5: ()
            	    // InternalMathInterpreter.g:166:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpAccess().getExpLeftLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }


            	    }

            	    // InternalMathInterpreter.g:173:4: ( (lv_right_3_0= ruleFactor ) )
            	    // InternalMathInterpreter.g:174:5: (lv_right_3_0= ruleFactor )
            	    {
            	    // InternalMathInterpreter.g:174:5: (lv_right_3_0= ruleFactor )
            	    // InternalMathInterpreter.g:175:6: lv_right_3_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_right_3_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"sdu.mdsd.math.interpreter.MathInterpreter.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleExpOp"
    // InternalMathInterpreter.g:197:1: entryRuleExpOp returns [EObject current=null] : iv_ruleExpOp= ruleExpOp EOF ;
    public final EObject entryRuleExpOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpOp = null;


        try {
            // InternalMathInterpreter.g:197:46: (iv_ruleExpOp= ruleExpOp EOF )
            // InternalMathInterpreter.g:198:2: iv_ruleExpOp= ruleExpOp EOF
            {
             newCompositeNode(grammarAccess.getExpOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpOp=ruleExpOp();

            state._fsp--;

             current =iv_ruleExpOp; 
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
    // $ANTLR end "entryRuleExpOp"


    // $ANTLR start "ruleExpOp"
    // InternalMathInterpreter.g:204:1: ruleExpOp returns [EObject current=null] : ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) ;
    public final EObject ruleExpOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMathInterpreter.g:210:2: ( ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) )
            // InternalMathInterpreter.g:211:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            {
            // InternalMathInterpreter.g:211:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMathInterpreter.g:212:3: ( () otherlv_1= '+' )
                    {
                    // InternalMathInterpreter.g:212:3: ( () otherlv_1= '+' )
                    // InternalMathInterpreter.g:213:4: () otherlv_1= '+'
                    {
                    // InternalMathInterpreter.g:213:4: ()
                    // InternalMathInterpreter.g:214:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpOpAccess().getPlusAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMathInterpreter.g:226:3: ( () otherlv_3= '-' )
                    {
                    // InternalMathInterpreter.g:226:3: ( () otherlv_3= '-' )
                    // InternalMathInterpreter.g:227:4: () otherlv_3= '-'
                    {
                    // InternalMathInterpreter.g:227:4: ()
                    // InternalMathInterpreter.g:228:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpOpAccess().getMinusAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1());
                    			

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
    // $ANTLR end "ruleExpOp"


    // $ANTLR start "entryRuleFactor"
    // InternalMathInterpreter.g:243:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMathInterpreter.g:243:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMathInterpreter.g:244:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMathInterpreter.g:250:1: ruleFactor returns [EObject current=null] : ( ( (lv_left_0_0= rulePrimary ) ) ( ( ( (lv_operator_1_0= ruleFactorOp ) ) () ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_operator_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:256:2: ( ( ( (lv_left_0_0= rulePrimary ) ) ( ( ( (lv_operator_1_0= ruleFactorOp ) ) () ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalMathInterpreter.g:257:2: ( ( (lv_left_0_0= rulePrimary ) ) ( ( ( (lv_operator_1_0= ruleFactorOp ) ) () ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalMathInterpreter.g:257:2: ( ( (lv_left_0_0= rulePrimary ) ) ( ( ( (lv_operator_1_0= ruleFactorOp ) ) () ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalMathInterpreter.g:258:3: ( (lv_left_0_0= rulePrimary ) ) ( ( ( (lv_operator_1_0= ruleFactorOp ) ) () ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            // InternalMathInterpreter.g:258:3: ( (lv_left_0_0= rulePrimary ) )
            // InternalMathInterpreter.g:259:4: (lv_left_0_0= rulePrimary )
            {
            // InternalMathInterpreter.g:259:4: (lv_left_0_0= rulePrimary )
            // InternalMathInterpreter.g:260:5: lv_left_0_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getFactorAccess().getLeftPrimaryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_left_0_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFactorRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"sdu.mdsd.math.interpreter.MathInterpreter.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMathInterpreter.g:277:3: ( ( ( (lv_operator_1_0= ruleFactorOp ) ) () ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=16)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMathInterpreter.g:278:4: ( ( (lv_operator_1_0= ruleFactorOp ) ) () ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMathInterpreter.g:278:4: ( ( (lv_operator_1_0= ruleFactorOp ) ) () )
            	    // InternalMathInterpreter.g:279:5: ( (lv_operator_1_0= ruleFactorOp ) ) ()
            	    {
            	    // InternalMathInterpreter.g:279:5: ( (lv_operator_1_0= ruleFactorOp ) )
            	    // InternalMathInterpreter.g:280:6: (lv_operator_1_0= ruleFactorOp )
            	    {
            	    // InternalMathInterpreter.g:280:6: (lv_operator_1_0= ruleFactorOp )
            	    // InternalMathInterpreter.g:281:7: lv_operator_1_0= ruleFactorOp
            	    {

            	    							newCompositeNode(grammarAccess.getFactorAccess().getOperatorFactorOpParserRuleCall_1_0_0_0());
            	    						
            	    pushFollow(FOLLOW_4);
            	    lv_operator_1_0=ruleFactorOp();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFactorRule());
            	    							}
            	    							set(
            	    								current,
            	    								"operator",
            	    								lv_operator_1_0,
            	    								"sdu.mdsd.math.interpreter.MathInterpreter.FactorOp");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMathInterpreter.g:298:5: ()
            	    // InternalMathInterpreter.g:299:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getFactorAccess().getFactorLeftLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }


            	    }

            	    // InternalMathInterpreter.g:306:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMathInterpreter.g:307:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMathInterpreter.g:307:5: (lv_right_3_0= rulePrimary )
            	    // InternalMathInterpreter.g:308:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"sdu.mdsd.math.interpreter.MathInterpreter.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleFactorOp"
    // InternalMathInterpreter.g:330:1: entryRuleFactorOp returns [EObject current=null] : iv_ruleFactorOp= ruleFactorOp EOF ;
    public final EObject entryRuleFactorOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactorOp = null;


        try {
            // InternalMathInterpreter.g:330:49: (iv_ruleFactorOp= ruleFactorOp EOF )
            // InternalMathInterpreter.g:331:2: iv_ruleFactorOp= ruleFactorOp EOF
            {
             newCompositeNode(grammarAccess.getFactorOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactorOp=ruleFactorOp();

            state._fsp--;

             current =iv_ruleFactorOp; 
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
    // $ANTLR end "entryRuleFactorOp"


    // $ANTLR start "ruleFactorOp"
    // InternalMathInterpreter.g:337:1: ruleFactorOp returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) ;
    public final EObject ruleFactorOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMathInterpreter.g:343:2: ( ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) )
            // InternalMathInterpreter.g:344:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            {
            // InternalMathInterpreter.g:344:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMathInterpreter.g:345:3: ( () otherlv_1= '*' )
                    {
                    // InternalMathInterpreter.g:345:3: ( () otherlv_1= '*' )
                    // InternalMathInterpreter.g:346:4: () otherlv_1= '*'
                    {
                    // InternalMathInterpreter.g:346:4: ()
                    // InternalMathInterpreter.g:347:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFactorOpAccess().getMultAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getFactorOpAccess().getAsteriskKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMathInterpreter.g:359:3: ( () otherlv_3= '/' )
                    {
                    // InternalMathInterpreter.g:359:3: ( () otherlv_3= '/' )
                    // InternalMathInterpreter.g:360:4: () otherlv_3= '/'
                    {
                    // InternalMathInterpreter.g:360:4: ()
                    // InternalMathInterpreter.g:361:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFactorOpAccess().getDivAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFactorOpAccess().getSolidusKeyword_1_1());
                    			

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
    // $ANTLR end "ruleFactorOp"


    // $ANTLR start "entryRulePrimary"
    // InternalMathInterpreter.g:376:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMathInterpreter.g:376:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMathInterpreter.g:377:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMathInterpreter.g:383:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:389:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis ) )
            // InternalMathInterpreter.g:390:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis )
            {
            // InternalMathInterpreter.g:390:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMathInterpreter.g:391:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMathInterpreter.g:400:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMathInterpreter.g:412:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMathInterpreter.g:412:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMathInterpreter.g:413:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMathInterpreter.g:419:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:425:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalMathInterpreter.g:426:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalMathInterpreter.g:426:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalMathInterpreter.g:427:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMathInterpreter.g:431:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalMathInterpreter.g:432:4: (lv_exp_1_0= ruleExp )
            {
            // InternalMathInterpreter.g:432:4: (lv_exp_1_0= ruleExp )
            // InternalMathInterpreter.g:433:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_exp_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"sdu.mdsd.math.interpreter.MathInterpreter.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMathInterpreter.g:458:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMathInterpreter.g:458:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMathInterpreter.g:459:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMathInterpreter.g:465:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMathInterpreter.g:471:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMathInterpreter.g:472:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMathInterpreter.g:472:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMathInterpreter.g:473:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMathInterpreter.g:473:3: (lv_value_0_0= RULE_INT )
            // InternalMathInterpreter.g:474:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});

}