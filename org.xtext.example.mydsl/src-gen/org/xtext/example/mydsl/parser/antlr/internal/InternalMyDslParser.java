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
<<<<<<< HEAD
<<<<<<< HEAD
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'{'", "'}'", "'scenario'", "'message'", "'required'", "'fail'", "'strict'", "'->'", "'past'", "'future'", "'constraint'", "';'", "'('", "')'", "'object'", "'alt'", "'='", "'>'", "'<'", "'>='", "'<='", "'par'", "'case'", "'loop'", "','"
=======
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'{'", "'}'", "'contextmodel'", "'contextfragment'", "'appear'", "'('", "')'", "'distance'", "'changeTo'", "'conditionsAt'", "';'", "'attribute'", "'entity'", "'relation'", "','", "'scenario'", "'message'", "'required'", "'fail'", "'strict'", "'->'", "'past'", "'future'", "'constraint'", "'object'", "'alt'", "'='", "'>'", "'<'", "'>='", "'<='", "'par'", "'case'"
>>>>>>> Added Xtext for context dependent behavior
=======
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'{'", "'}'", "'contextmodel'", "'contextfragment'", "'appear'", "'('", "')'", "'distance'", "'changeTo'", "'conditionsAt'", "';'", "'attribute'", "'entity'", "'relation'", "','", "'scenario'", "'message'", "'required'", "'fail'", "'strict'", "'->'", "'past'", "'future'", "'constraint'", "'match'", "'disappear'", "'object'", "'alt'", "'='", "'>'", "'<'", "'>='", "'<='", "'par'", "'case'"
>>>>>>> [xText] Added new message type: contextMessage
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
<<<<<<< HEAD
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
=======
>>>>>>> Added Xtext for context dependent behavior
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
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
    public static final int RULE_NUMBER=5;
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
        	return "Domain";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomain"
    // InternalMyDsl.g:64:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalMyDsl.g:64:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalMyDsl.g:65:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalMyDsl.g:71:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contextmodels_3_0= ruleContextModel ) )* ( (lv_contextfragments_4_0= ruleContextFragment ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_contextchanges_6_0= ruleContextChange ) )* ( (lv_objects_7_0= ruleObject ) )* ( (lv_constraints_8_0= ruleConstraint ) )* ( (lv_scenarios_9_0= ruleScenario ) )* otherlv_10= '}' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_10=null;
        EObject lv_contextmodels_3_0 = null;

        EObject lv_contextfragments_4_0 = null;

        EObject lv_entities_5_0 = null;

        EObject lv_contextchanges_6_0 = null;

        EObject lv_objects_7_0 = null;

        EObject lv_constraints_8_0 = null;

        EObject lv_scenarios_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contextmodels_3_0= ruleContextModel ) )* ( (lv_contextfragments_4_0= ruleContextFragment ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_contextchanges_6_0= ruleContextChange ) )* ( (lv_objects_7_0= ruleObject ) )* ( (lv_constraints_8_0= ruleConstraint ) )* ( (lv_scenarios_9_0= ruleScenario ) )* otherlv_10= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contextmodels_3_0= ruleContextModel ) )* ( (lv_contextfragments_4_0= ruleContextFragment ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_contextchanges_6_0= ruleContextChange ) )* ( (lv_objects_7_0= ruleObject ) )* ( (lv_constraints_8_0= ruleConstraint ) )* ( (lv_scenarios_9_0= ruleScenario ) )* otherlv_10= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contextmodels_3_0= ruleContextModel ) )* ( (lv_contextfragments_4_0= ruleContextFragment ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_contextchanges_6_0= ruleContextChange ) )* ( (lv_objects_7_0= ruleObject ) )* ( (lv_constraints_8_0= ruleConstraint ) )* ( (lv_scenarios_9_0= ruleScenario ) )* otherlv_10= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contextmodels_3_0= ruleContextModel ) )* ( (lv_contextfragments_4_0= ruleContextFragment ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_contextchanges_6_0= ruleContextChange ) )* ( (lv_objects_7_0= ruleObject ) )* ( (lv_constraints_8_0= ruleConstraint ) )* ( (lv_scenarios_9_0= ruleScenario ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getSpecificationKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:105:3: ( (lv_contextmodels_3_0= ruleContextModel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:106:4: (lv_contextmodels_3_0= ruleContextModel )
            	    {
            	    // InternalMyDsl.g:106:4: (lv_contextmodels_3_0= ruleContextModel )
            	    // InternalMyDsl.g:107:5: lv_contextmodels_3_0= ruleContextModel
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getContextmodelsContextModelParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_contextmodels_3_0=ruleContextModel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contextmodels",
            	    						lv_contextmodels_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.ContextModel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:124:3: ( (lv_contextfragments_4_0= ruleContextFragment ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:125:4: (lv_contextfragments_4_0= ruleContextFragment )
            	    {
            	    // InternalMyDsl.g:125:4: (lv_contextfragments_4_0= ruleContextFragment )
            	    // InternalMyDsl.g:126:5: lv_contextfragments_4_0= ruleContextFragment
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getContextfragmentsContextFragmentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_contextfragments_4_0=ruleContextFragment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contextfragments",
            	    						lv_contextfragments_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.ContextFragment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:143:3: ( (lv_entities_5_0= ruleEntity ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:144:4: (lv_entities_5_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:144:4: (lv_entities_5_0= ruleEntity )
            	    // InternalMyDsl.g:145:5: lv_entities_5_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_entities_5_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:162:3: ( (lv_contextchanges_6_0= ruleContextChange ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17||(LA4_0>=20 && LA4_0<=22)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:163:4: (lv_contextchanges_6_0= ruleContextChange )
            	    {
            	    // InternalMyDsl.g:163:4: (lv_contextchanges_6_0= ruleContextChange )
            	    // InternalMyDsl.g:164:5: lv_contextchanges_6_0= ruleContextChange
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getContextchangesContextChangeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_contextchanges_6_0=ruleContextChange();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contextchanges",
            	    						lv_contextchanges_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.ContextChange");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalMyDsl.g:181:3: ( (lv_objects_7_0= ruleObject ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==39) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:182:4: (lv_objects_7_0= ruleObject )
            	    {
            	    // InternalMyDsl.g:182:4: (lv_objects_7_0= ruleObject )
            	    // InternalMyDsl.g:183:5: lv_objects_7_0= ruleObject
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getObjectsObjectParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_objects_7_0=ruleObject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objects",
            	    						lv_objects_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.Object");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMyDsl.g:200:3: ( (lv_constraints_8_0= ruleConstraint ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==36) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:201:4: (lv_constraints_8_0= ruleConstraint )
            	    {
            	    // InternalMyDsl.g:201:4: (lv_constraints_8_0= ruleConstraint )
            	    // InternalMyDsl.g:202:5: lv_constraints_8_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getConstraintsConstraintParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_constraints_8_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_8_0,
            	    						"org.xtext.example.mydsl.MyDsl.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalMyDsl.g:219:3: ( (lv_scenarios_9_0= ruleScenario ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:220:4: (lv_scenarios_9_0= ruleScenario )
            	    {
            	    // InternalMyDsl.g:220:4: (lv_scenarios_9_0= ruleScenario )
            	    // InternalMyDsl.g:221:5: lv_scenarios_9_0= ruleScenario
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getScenariosScenarioParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_scenarios_9_0=ruleScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_9_0,
            	    						"org.xtext.example.mydsl.MyDsl.Scenario");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleContextModel"
    // InternalMyDsl.g:246:1: entryRuleContextModel returns [EObject current=null] : iv_ruleContextModel= ruleContextModel EOF ;
    public final EObject entryRuleContextModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextModel = null;


        try {
            // InternalMyDsl.g:246:53: (iv_ruleContextModel= ruleContextModel EOF )
            // InternalMyDsl.g:247:2: iv_ruleContextModel= ruleContextModel EOF
            {
             newCompositeNode(grammarAccess.getContextModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextModel=ruleContextModel();

            state._fsp--;

             current =iv_ruleContextModel; 
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
    // $ANTLR end "entryRuleContextModel"


    // $ANTLR start "ruleContextModel"
    // InternalMyDsl.g:253:1: ruleContextModel returns [EObject current=null] : (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' ) ;
    public final EObject ruleContextModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_entities_3_0 = null;

        EObject lv_relations_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:259:2: ( (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:260:2: (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:260:2: (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' )
            // InternalMyDsl.g:261:3: otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextModelAccess().getContextmodelKeyword_0());
            		
            // InternalMyDsl.g:265:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:266:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:266:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:267:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContextModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getContextModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:287:3: ( (lv_entities_3_0= ruleEntity ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:288:4: (lv_entities_3_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:288:4: (lv_entities_3_0= ruleEntity )
            	    // InternalMyDsl.g:289:5: lv_entities_3_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getContextModelAccess().getEntitiesEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyDsl.g:306:3: ( (lv_relations_4_0= ruleRelation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:307:4: (lv_relations_4_0= ruleRelation )
            	    {
            	    // InternalMyDsl.g:307:4: (lv_relations_4_0= ruleRelation )
            	    // InternalMyDsl.g:308:5: lv_relations_4_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getContextModelAccess().getRelationsRelationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_relations_4_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Relation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getContextModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleContextModel"


    // $ANTLR start "entryRuleContextFragment"
    // InternalMyDsl.g:333:1: entryRuleContextFragment returns [EObject current=null] : iv_ruleContextFragment= ruleContextFragment EOF ;
    public final EObject entryRuleContextFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextFragment = null;


        try {
            // InternalMyDsl.g:333:56: (iv_ruleContextFragment= ruleContextFragment EOF )
            // InternalMyDsl.g:334:2: iv_ruleContextFragment= ruleContextFragment EOF
            {
             newCompositeNode(grammarAccess.getContextFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextFragment=ruleContextFragment();

            state._fsp--;

             current =iv_ruleContextFragment; 
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
    // $ANTLR end "entryRuleContextFragment"


    // $ANTLR start "ruleContextFragment"
    // InternalMyDsl.g:340:1: ruleContextFragment returns [EObject current=null] : (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' ) ;
    public final EObject ruleContextFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_entities_3_0 = null;

        EObject lv_relations_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:346:2: ( (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:347:2: (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:347:2: (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' )
            // InternalMyDsl.g:348:3: otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextFragmentAccess().getContextfragmentKeyword_0());
            		
            // InternalMyDsl.g:352:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:353:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:353:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:354:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContextFragmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextFragmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getContextFragmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:374:3: ( (lv_entities_3_0= ruleEntity ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:375:4: (lv_entities_3_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:375:4: (lv_entities_3_0= ruleEntity )
            	    // InternalMyDsl.g:376:5: lv_entities_3_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getContextFragmentAccess().getEntitiesEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextFragmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalMyDsl.g:393:3: ( (lv_relations_4_0= ruleRelation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:394:4: (lv_relations_4_0= ruleRelation )
            	    {
            	    // InternalMyDsl.g:394:4: (lv_relations_4_0= ruleRelation )
            	    // InternalMyDsl.g:395:5: lv_relations_4_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getContextFragmentAccess().getRelationsRelationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_relations_4_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextFragmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Relation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getContextFragmentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleContextFragment"


    // $ANTLR start "entryRuleChangeType"
    // InternalMyDsl.g:420:1: entryRuleChangeType returns [EObject current=null] : iv_ruleChangeType= ruleChangeType EOF ;
    public final EObject entryRuleChangeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeType = null;


        try {
            // InternalMyDsl.g:420:51: (iv_ruleChangeType= ruleChangeType EOF )
            // InternalMyDsl.g:421:2: iv_ruleChangeType= ruleChangeType EOF
            {
             newCompositeNode(grammarAccess.getChangeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeType=ruleChangeType();

            state._fsp--;

             current =iv_ruleChangeType; 
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
    // $ANTLR end "entryRuleChangeType"


    // $ANTLR start "ruleChangeType"
    // InternalMyDsl.g:427:1: ruleChangeType returns [EObject current=null] : ( (otherlv_0= 'appear' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'distance' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) | (otherlv_8= 'changeTo' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'conditionsAt' otherlv_11= '(' otherlv_12= ')' ) ) ;
    public final EObject ruleChangeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyDsl.g:433:2: ( ( (otherlv_0= 'appear' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'distance' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) | (otherlv_8= 'changeTo' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'conditionsAt' otherlv_11= '(' otherlv_12= ')' ) ) )
            // InternalMyDsl.g:434:2: ( (otherlv_0= 'appear' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'distance' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) | (otherlv_8= 'changeTo' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'conditionsAt' otherlv_11= '(' otherlv_12= ')' ) )
            {
            // InternalMyDsl.g:434:2: ( (otherlv_0= 'appear' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'distance' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) | (otherlv_8= 'changeTo' ( (otherlv_9= RULE_ID ) ) ) | (otherlv_10= 'conditionsAt' otherlv_11= '(' otherlv_12= ')' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt12=1;
                }
                break;
            case 20:
                {
                alt12=2;
                }
                break;
            case 21:
                {
                alt12=3;
                }
                break;
            case 22:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:435:3: (otherlv_0= 'appear' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
                    {
                    // InternalMyDsl.g:435:3: (otherlv_0= 'appear' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
                    // InternalMyDsl.g:436:4: otherlv_0= 'appear' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getChangeTypeAccess().getAppearKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getChangeTypeAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalMyDsl.g:444:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:445:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:445:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:446:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeTypeRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_2, grammarAccess.getChangeTypeAccess().getEntityEntityCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getChangeTypeAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:463:3: (otherlv_4= 'distance' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
                    {
                    // InternalMyDsl.g:463:3: (otherlv_4= 'distance' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
                    // InternalMyDsl.g:464:4: otherlv_4= 'distance' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getChangeTypeAccess().getDistanceKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getChangeTypeAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMyDsl.g:472:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMyDsl.g:473:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMyDsl.g:473:5: (otherlv_6= RULE_ID )
                    // InternalMyDsl.g:474:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeTypeRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_6, grammarAccess.getChangeTypeAccess().getEntityEntityCrossReference_1_2_0());
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getChangeTypeAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:491:3: (otherlv_8= 'changeTo' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:491:3: (otherlv_8= 'changeTo' ( (otherlv_9= RULE_ID ) ) )
                    // InternalMyDsl.g:492:4: otherlv_8= 'changeTo' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getChangeTypeAccess().getChangeToKeyword_2_0());
                    			
                    // InternalMyDsl.g:496:4: ( (otherlv_9= RULE_ID ) )
                    // InternalMyDsl.g:497:5: (otherlv_9= RULE_ID )
                    {
                    // InternalMyDsl.g:497:5: (otherlv_9= RULE_ID )
                    // InternalMyDsl.g:498:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeTypeRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_9, grammarAccess.getChangeTypeAccess().getAttributeAttributeCrossReference_2_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:511:3: (otherlv_10= 'conditionsAt' otherlv_11= '(' otherlv_12= ')' )
                    {
                    // InternalMyDsl.g:511:3: (otherlv_10= 'conditionsAt' otherlv_11= '(' otherlv_12= ')' )
                    // InternalMyDsl.g:512:4: otherlv_10= 'conditionsAt' otherlv_11= '(' otherlv_12= ')'
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getChangeTypeAccess().getConditionsAtKeyword_3_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getChangeTypeAccess().getLeftParenthesisKeyword_3_1());
                    			
                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getChangeTypeAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // $ANTLR end "ruleChangeType"


    // $ANTLR start "entryRuleContextChange"
    // InternalMyDsl.g:529:1: entryRuleContextChange returns [EObject current=null] : iv_ruleContextChange= ruleContextChange EOF ;
    public final EObject entryRuleContextChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextChange = null;


        try {
            // InternalMyDsl.g:529:54: (iv_ruleContextChange= ruleContextChange EOF )
            // InternalMyDsl.g:530:2: iv_ruleContextChange= ruleContextChange EOF
            {
             newCompositeNode(grammarAccess.getContextChangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextChange=ruleContextChange();

            state._fsp--;

             current =iv_ruleContextChange; 
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
    // $ANTLR end "entryRuleContextChange"


    // $ANTLR start "ruleContextChange"
    // InternalMyDsl.g:536:1: ruleContextChange returns [EObject current=null] : ( ( (lv_change_0_0= ruleChangeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleContextChange() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_change_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:542:2: ( ( ( (lv_change_0_0= ruleChangeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:543:2: ( ( (lv_change_0_0= ruleChangeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:543:2: ( ( (lv_change_0_0= ruleChangeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMyDsl.g:544:3: ( (lv_change_0_0= ruleChangeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalMyDsl.g:544:3: ( (lv_change_0_0= ruleChangeType ) )
            // InternalMyDsl.g:545:4: (lv_change_0_0= ruleChangeType )
            {
            // InternalMyDsl.g:545:4: (lv_change_0_0= ruleChangeType )
            // InternalMyDsl.g:546:5: lv_change_0_0= ruleChangeType
            {

            					newCompositeNode(grammarAccess.getContextChangeAccess().getChangeChangeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_change_0_0=ruleChangeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextChangeRule());
            					}
            					add(
            						current,
            						"change",
            						lv_change_0_0,
            						"org.xtext.example.mydsl.MyDsl.ChangeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:563:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:564:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:564:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:565:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContextChangeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextChangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getContextChangeAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleContextChange"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:589:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:589:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:590:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:596:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:602:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:603:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:603:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMyDsl.g:604:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalMyDsl.g:608:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:609:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:609:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:610:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:634:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:634:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:635:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:641:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:647:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:648:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:648:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalMyDsl.g:649:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:653:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:654:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:654:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:655:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:675:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:676:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:676:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalMyDsl.g:677:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:702:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:702:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:703:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:709:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_attributes_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:715:2: ( (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:716:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:716:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            // InternalMyDsl.g:717:3: otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalMyDsl.g:721:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:722:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:722:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:723:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:743:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:744:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:744:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:745:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getSenderEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:760:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:761:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:761:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:762:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getReceiverEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:781:3: ( (lv_attributes_8_0= ruleAttribute ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:782:4: (lv_attributes_8_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:782:4: (lv_attributes_8_0= ruleAttribute )
            	    // InternalMyDsl.g:783:5: lv_attributes_8_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_attributes_8_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRelationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_8_0,
            	    						"org.xtext.example.mydsl.MyDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleScenario"
    // InternalMyDsl.g:808:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalMyDsl.g:808:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalMyDsl.g:809:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalMyDsl.g:815:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_scenariocontents_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:821:2: ( (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:822:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:822:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' )
            // InternalMyDsl.g:823:3: otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalMyDsl.g:827:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:828:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:828:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:829:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScenarioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:849:3: ( (lv_scenariocontents_3_0= ruleScenarioContent ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

<<<<<<< HEAD
<<<<<<< HEAD
                if ( (LA4_0==16||LA4_0==28||LA4_0==34||LA4_0==36) ) {
                    alt4=1;
=======
                if ( (LA15_0==29||LA15_0==38||LA15_0==44) ) {
=======
                if ( (LA15_0==17||LA15_0==20||LA15_0==29||(LA15_0>=37 && LA15_0<=38)||LA15_0==40||LA15_0==46) ) {
>>>>>>> [xText] Added new message type: contextMessage
                    alt15=1;
>>>>>>> Added Xtext for context dependent behavior
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:850:4: (lv_scenariocontents_3_0= ruleScenarioContent )
            	    {
            	    // InternalMyDsl.g:850:4: (lv_scenariocontents_3_0= ruleScenarioContent )
            	    // InternalMyDsl.g:851:5: lv_scenariocontents_3_0= ruleScenarioContent
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getScenariocontentsScenarioContentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_scenariocontents_3_0=ruleScenarioContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenariocontents",
            	    						lv_scenariocontents_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.ScenarioContent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleScenarioContent"
    // InternalMyDsl.g:876:1: entryRuleScenarioContent returns [EObject current=null] : iv_ruleScenarioContent= ruleScenarioContent EOF ;
    public final EObject entryRuleScenarioContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioContent = null;


        try {
            // InternalMyDsl.g:876:56: (iv_ruleScenarioContent= ruleScenarioContent EOF )
            // InternalMyDsl.g:877:2: iv_ruleScenarioContent= ruleScenarioContent EOF
            {
             newCompositeNode(grammarAccess.getScenarioContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenarioContent=ruleScenarioContent();

            state._fsp--;

             current =iv_ruleScenarioContent; 
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
    // $ANTLR end "entryRuleScenarioContent"


    // $ANTLR start "ruleScenarioContent"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:245:1: ruleScenarioContent returns [EObject current=null] : ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) ) ;
=======
    // InternalMyDsl.g:883:1: ruleScenarioContent returns [EObject current=null] : ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:883:1: ruleScenarioContent returns [EObject current=null] : ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_contextmessage_3_0= ruleContextMessage ) ) ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject ruleScenarioContent() throws RecognitionException {
        EObject current = null;

        EObject lv_alt_0_0 = null;

        EObject lv_message_1_0 = null;

        EObject lv_par_2_0 = null;

<<<<<<< HEAD
        EObject lv_loop_3_0 = null;
=======
        EObject lv_contextmessage_3_0 = null;
>>>>>>> [xText] Added new message type: contextMessage



        	enterRule();

        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:251:2: ( ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) ) )
            // InternalMyDsl.g:252:2: ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) )
            {
            // InternalMyDsl.g:252:2: ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) )
            int alt5=4;
=======
            // InternalMyDsl.g:889:2: ( ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) ) )
            // InternalMyDsl.g:890:2: ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) )
            {
            // InternalMyDsl.g:890:2: ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) )
            int alt16=3;
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:889:2: ( ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_contextmessage_3_0= ruleContextMessage ) ) ) )
            // InternalMyDsl.g:890:2: ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_contextmessage_3_0= ruleContextMessage ) ) )
            {
            // InternalMyDsl.g:890:2: ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_contextmessage_3_0= ruleContextMessage ) ) )
            int alt16=4;
>>>>>>> [xText] Added new message type: contextMessage
            switch ( input.LA(1) ) {
            case 40:
                {
                alt16=1;
                }
                break;
            case 29:
                {
                alt16=2;
                }
                break;
            case 46:
                {
                alt16=3;
                }
                break;
<<<<<<< HEAD
            case 36:
                {
                alt5=4;
=======
            case 17:
            case 20:
            case 37:
            case 38:
                {
                alt16=4;
>>>>>>> [xText] Added new message type: contextMessage
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:891:3: ( (lv_alt_0_0= ruleAlt ) )
                    {
                    // InternalMyDsl.g:891:3: ( (lv_alt_0_0= ruleAlt ) )
                    // InternalMyDsl.g:892:4: (lv_alt_0_0= ruleAlt )
                    {
                    // InternalMyDsl.g:892:4: (lv_alt_0_0= ruleAlt )
                    // InternalMyDsl.g:893:5: lv_alt_0_0= ruleAlt
                    {

                    					newCompositeNode(grammarAccess.getScenarioContentAccess().getAltAltParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_alt_0_0=ruleAlt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioContentRule());
                    					}
                    					add(
                    						current,
                    						"alt",
                    						lv_alt_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Alt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:911:3: ( (lv_message_1_0= ruleMessage ) )
                    {
                    // InternalMyDsl.g:911:3: ( (lv_message_1_0= ruleMessage ) )
                    // InternalMyDsl.g:912:4: (lv_message_1_0= ruleMessage )
                    {
                    // InternalMyDsl.g:912:4: (lv_message_1_0= ruleMessage )
                    // InternalMyDsl.g:913:5: lv_message_1_0= ruleMessage
                    {

                    					newCompositeNode(grammarAccess.getScenarioContentAccess().getMessageMessageParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_message_1_0=ruleMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioContentRule());
                    					}
                    					add(
                    						current,
                    						"message",
                    						lv_message_1_0,
                    						"org.xtext.example.mydsl.MyDsl.Message");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:931:3: ( (lv_par_2_0= rulePar ) )
                    {
                    // InternalMyDsl.g:931:3: ( (lv_par_2_0= rulePar ) )
                    // InternalMyDsl.g:932:4: (lv_par_2_0= rulePar )
                    {
                    // InternalMyDsl.g:932:4: (lv_par_2_0= rulePar )
                    // InternalMyDsl.g:933:5: lv_par_2_0= rulePar
                    {

                    					newCompositeNode(grammarAccess.getScenarioContentAccess().getParParParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_par_2_0=rulePar();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioContentRule());
                    					}
                    					add(
                    						current,
                    						"par",
                    						lv_par_2_0,
                    						"org.xtext.example.mydsl.MyDsl.Par");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
<<<<<<< HEAD
                    // InternalMyDsl.g:313:3: ( (lv_loop_3_0= ruleLoop ) )
                    {
                    // InternalMyDsl.g:313:3: ( (lv_loop_3_0= ruleLoop ) )
                    // InternalMyDsl.g:314:4: (lv_loop_3_0= ruleLoop )
                    {
                    // InternalMyDsl.g:314:4: (lv_loop_3_0= ruleLoop )
                    // InternalMyDsl.g:315:5: lv_loop_3_0= ruleLoop
                    {

                    					newCompositeNode(grammarAccess.getScenarioContentAccess().getLoopLoopParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_loop_3_0=ruleLoop();
=======
                    // InternalMyDsl.g:951:3: ( (lv_contextmessage_3_0= ruleContextMessage ) )
                    {
                    // InternalMyDsl.g:951:3: ( (lv_contextmessage_3_0= ruleContextMessage ) )
                    // InternalMyDsl.g:952:4: (lv_contextmessage_3_0= ruleContextMessage )
                    {
                    // InternalMyDsl.g:952:4: (lv_contextmessage_3_0= ruleContextMessage )
                    // InternalMyDsl.g:953:5: lv_contextmessage_3_0= ruleContextMessage
                    {

                    					newCompositeNode(grammarAccess.getScenarioContentAccess().getContextmessageContextMessageParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_contextmessage_3_0=ruleContextMessage();
>>>>>>> [xText] Added new message type: contextMessage

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioContentRule());
                    					}
                    					add(
                    						current,
<<<<<<< HEAD
                    						"loop",
                    						lv_loop_3_0,
                    						"org.xtext.example.mydsl.MyDsl.Loop");
=======
                    						"contextmessage",
                    						lv_contextmessage_3_0,
                    						"org.xtext.example.mydsl.MyDsl.ContextMessage");
>>>>>>> [xText] Added new message type: contextMessage
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
    // $ANTLR end "ruleScenarioContent"


    // $ANTLR start "entryRuleMessage"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:336:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
=======
    // InternalMyDsl.g:954:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:974:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:336:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMyDsl.g:337:2: iv_ruleMessage= ruleMessage EOF
=======
            // InternalMyDsl.g:954:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMyDsl.g:955:2: iv_ruleMessage= ruleMessage EOF
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:974:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMyDsl.g:975:2: iv_ruleMessage= ruleMessage EOF
>>>>>>> [xText] Added new message type: contextMessage
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:343:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' ) ;
=======
    // InternalMyDsl.g:961:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:981:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_required_2_0=null;
        Token lv_fail_3_0=null;
        Token lv_strict_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_past_8_0=null;
        Token lv_future_9_0=null;
        Token lv_constraint_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:349:2: ( (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' ) )
            // InternalMyDsl.g:350:2: (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' )
            {
            // InternalMyDsl.g:350:2: (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' )
            // InternalMyDsl.g:351:3: otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';'
=======
            // InternalMyDsl.g:967:2: ( (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' ) )
            // InternalMyDsl.g:968:2: (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' )
            {
            // InternalMyDsl.g:968:2: (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' )
            // InternalMyDsl.g:969:3: otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:987:2: ( (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' ) )
            // InternalMyDsl.g:988:2: (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' )
            {
            // InternalMyDsl.g:988:2: (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' )
            // InternalMyDsl.g:989:3: otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';'
>>>>>>> [xText] Added new message type: contextMessage
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
            		
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:355:3: ( (lv_name_1_0= ruleName ) )
            // InternalMyDsl.g:356:4: (lv_name_1_0= ruleName )
            {
            // InternalMyDsl.g:356:4: (lv_name_1_0= ruleName )
            // InternalMyDsl.g:357:5: lv_name_1_0= ruleName
=======
            // InternalMyDsl.g:973:3: ( (lv_name_1_0= ruleName ) )
            // InternalMyDsl.g:974:4: (lv_name_1_0= ruleName )
            {
            // InternalMyDsl.g:974:4: (lv_name_1_0= ruleName )
            // InternalMyDsl.g:975:5: lv_name_1_0= ruleName
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:993:3: ( (lv_name_1_0= ruleName ) )
            // InternalMyDsl.g:994:4: (lv_name_1_0= ruleName )
            {
            // InternalMyDsl.g:994:4: (lv_name_1_0= ruleName )
            // InternalMyDsl.g:995:5: lv_name_1_0= ruleName
>>>>>>> [xText] Added new message type: contextMessage
            {

            					newCompositeNode(grammarAccess.getMessageAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:374:3: ( (lv_required_2_0= 'required' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);
=======
            // InternalMyDsl.g:992:3: ( (lv_required_2_0= 'required' ) )?
=======
            // InternalMyDsl.g:1012:3: ( (lv_required_2_0= 'required' ) )?
>>>>>>> [xText] Added new message type: contextMessage
            int alt17=2;
            int LA17_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
                    // InternalMyDsl.g:375:4: (lv_required_2_0= 'required' )
                    {
                    // InternalMyDsl.g:375:4: (lv_required_2_0= 'required' )
                    // InternalMyDsl.g:376:5: lv_required_2_0= 'required'
=======
                    // InternalMyDsl.g:993:4: (lv_required_2_0= 'required' )
                    {
                    // InternalMyDsl.g:993:4: (lv_required_2_0= 'required' )
                    // InternalMyDsl.g:994:5: lv_required_2_0= 'required'
>>>>>>> Added Xtext for context dependent behavior
=======
                    // InternalMyDsl.g:1013:4: (lv_required_2_0= 'required' )
                    {
                    // InternalMyDsl.g:1013:4: (lv_required_2_0= 'required' )
                    // InternalMyDsl.g:1014:5: lv_required_2_0= 'required'
>>>>>>> [xText] Added new message type: contextMessage
                    {
                    lv_required_2_0=(Token)match(input,30,FOLLOW_21); 

                    					newLeafNode(lv_required_2_0, grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:388:3: ( (lv_fail_3_0= 'fail' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);
=======
            // InternalMyDsl.g:1006:3: ( (lv_fail_3_0= 'fail' ) )?
=======
            // InternalMyDsl.g:1026:3: ( (lv_fail_3_0= 'fail' ) )?
>>>>>>> [xText] Added new message type: contextMessage
            int alt18=2;
            int LA18_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
                    // InternalMyDsl.g:389:4: (lv_fail_3_0= 'fail' )
                    {
                    // InternalMyDsl.g:389:4: (lv_fail_3_0= 'fail' )
                    // InternalMyDsl.g:390:5: lv_fail_3_0= 'fail'
=======
                    // InternalMyDsl.g:1007:4: (lv_fail_3_0= 'fail' )
                    {
                    // InternalMyDsl.g:1007:4: (lv_fail_3_0= 'fail' )
                    // InternalMyDsl.g:1008:5: lv_fail_3_0= 'fail'
>>>>>>> Added Xtext for context dependent behavior
=======
                    // InternalMyDsl.g:1027:4: (lv_fail_3_0= 'fail' )
                    {
                    // InternalMyDsl.g:1027:4: (lv_fail_3_0= 'fail' )
                    // InternalMyDsl.g:1028:5: lv_fail_3_0= 'fail'
>>>>>>> [xText] Added new message type: contextMessage
                    {
                    lv_fail_3_0=(Token)match(input,31,FOLLOW_22); 

                    					newLeafNode(lv_fail_3_0, grammarAccess.getMessageAccess().getFailFailKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "fail", true, "fail");
                    				

                    }


                    }
                    break;

            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:402:3: ( (lv_strict_4_0= 'strict' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);
=======
            // InternalMyDsl.g:1020:3: ( (lv_strict_4_0= 'strict' ) )?
=======
            // InternalMyDsl.g:1040:3: ( (lv_strict_4_0= 'strict' ) )?
>>>>>>> [xText] Added new message type: contextMessage
            int alt19=2;
            int LA19_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
                    // InternalMyDsl.g:403:4: (lv_strict_4_0= 'strict' )
                    {
                    // InternalMyDsl.g:403:4: (lv_strict_4_0= 'strict' )
                    // InternalMyDsl.g:404:5: lv_strict_4_0= 'strict'
=======
                    // InternalMyDsl.g:1021:4: (lv_strict_4_0= 'strict' )
                    {
                    // InternalMyDsl.g:1021:4: (lv_strict_4_0= 'strict' )
                    // InternalMyDsl.g:1022:5: lv_strict_4_0= 'strict'
>>>>>>> Added Xtext for context dependent behavior
=======
                    // InternalMyDsl.g:1041:4: (lv_strict_4_0= 'strict' )
                    {
                    // InternalMyDsl.g:1041:4: (lv_strict_4_0= 'strict' )
                    // InternalMyDsl.g:1042:5: lv_strict_4_0= 'strict'
>>>>>>> [xText] Added new message type: contextMessage
                    {
                    lv_strict_4_0=(Token)match(input,32,FOLLOW_3); 

                    					newLeafNode(lv_strict_4_0, grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "strict", true, "strict");
                    				

                    }


                    }
                    break;

            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:416:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:417:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:417:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:418:5: otherlv_5= RULE_ID
=======
            // InternalMyDsl.g:1034:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1035:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1035:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1036:5: otherlv_5= RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1054:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1055:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1055:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1056:5: otherlv_5= RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getSenderObjectCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            // InternalMyDsl.g:1071:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:1072:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:1072:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:1073:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getReceiverObjectCrossReference_7_0());
            				

            }


            }

            // InternalMyDsl.g:1084:3: ( (lv_past_8_0= 'past' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1085:4: (lv_past_8_0= 'past' )
                    {
                    // InternalMyDsl.g:1085:4: (lv_past_8_0= 'past' )
                    // InternalMyDsl.g:1086:5: lv_past_8_0= 'past'
                    {
                    lv_past_8_0=(Token)match(input,34,FOLLOW_25); 

                    					newLeafNode(lv_past_8_0, grammarAccess.getMessageAccess().getPastPastKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "past", true, "past");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1098:3: ( (lv_future_9_0= 'future' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1099:4: (lv_future_9_0= 'future' )
                    {
                    // InternalMyDsl.g:1099:4: (lv_future_9_0= 'future' )
                    // InternalMyDsl.g:1100:5: lv_future_9_0= 'future'
                    {
                    lv_future_9_0=(Token)match(input,35,FOLLOW_26); 

                    					newLeafNode(lv_future_9_0, grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "future", true, "future");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1112:3: ( (lv_constraint_10_0= 'constraint' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1113:4: (lv_constraint_10_0= 'constraint' )
                    {
                    // InternalMyDsl.g:1113:4: (lv_constraint_10_0= 'constraint' )
                    // InternalMyDsl.g:1114:5: lv_constraint_10_0= 'constraint'
                    {
                    lv_constraint_10_0=(Token)match(input,36,FOLLOW_27); 

                    					newLeafNode(lv_constraint_10_0, grammarAccess.getMessageAccess().getConstraintConstraintKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "constraint", true, "constraint");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1126:3: (otherlv_11= '{' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1127:4: otherlv_11= '{'
                    {
                    otherlv_11=(Token)match(input,13,FOLLOW_28); 

                    				newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_11());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1132:3: ( (otherlv_12= RULE_ID ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1133:4: (otherlv_12= RULE_ID )
                    {
                    // InternalMyDsl.g:1133:4: (otherlv_12= RULE_ID )
                    // InternalMyDsl.g:1134:5: otherlv_12= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    				
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_29); 

                    					newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getCConstraintCrossReference_12_0());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1145:3: (otherlv_13= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1146:4: otherlv_13= '}'
                    {
                    otherlv_13=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_13());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getMessageAccess().getSemicolonKeyword_14());
            		

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleContextMessage"
    // InternalMyDsl.g:1159:1: entryRuleContextMessage returns [EObject current=null] : iv_ruleContextMessage= ruleContextMessage EOF ;
    public final EObject entryRuleContextMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextMessage = null;


        try {
            // InternalMyDsl.g:1159:55: (iv_ruleContextMessage= ruleContextMessage EOF )
            // InternalMyDsl.g:1160:2: iv_ruleContextMessage= ruleContextMessage EOF
            {
             newCompositeNode(grammarAccess.getContextMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextMessage=ruleContextMessage();

            state._fsp--;

             current =iv_ruleContextMessage; 
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
    // $ANTLR end "entryRuleContextMessage"


    // $ANTLR start "ruleContextMessage"
    // InternalMyDsl.g:1166:1: ruleContextMessage returns [EObject current=null] : (this_ContextMessageContent_0= ruleContextMessageContent ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' ) ;
    public final EObject ruleContextMessage() throws RecognitionException {
        EObject current = null;

        Token lv_required_1_0=null;
        Token lv_fail_2_0=null;
        Token lv_strict_3_0=null;
        Token otherlv_4=null;
        EObject this_ContextMessageContent_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1172:2: ( (this_ContextMessageContent_0= ruleContextMessageContent ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' ) )
            // InternalMyDsl.g:1173:2: (this_ContextMessageContent_0= ruleContextMessageContent ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' )
            {
            // InternalMyDsl.g:1173:2: (this_ContextMessageContent_0= ruleContextMessageContent ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' )
            // InternalMyDsl.g:1174:3: this_ContextMessageContent_0= ruleContextMessageContent ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';'
            {

            			newCompositeNode(grammarAccess.getContextMessageAccess().getContextMessageContentParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_ContextMessageContent_0=ruleContextMessageContent();

            state._fsp--;


            			current = this_ContextMessageContent_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1182:3: ( (lv_required_1_0= 'required' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1183:4: (lv_required_1_0= 'required' )
                    {
                    // InternalMyDsl.g:1183:4: (lv_required_1_0= 'required' )
                    // InternalMyDsl.g:1184:5: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,30,FOLLOW_31); 

                    					newLeafNode(lv_required_1_0, grammarAccess.getContextMessageAccess().getRequiredRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextMessageRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1196:3: ( (lv_fail_2_0= 'fail' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1197:4: (lv_fail_2_0= 'fail' )
                    {
                    // InternalMyDsl.g:1197:4: (lv_fail_2_0= 'fail' )
                    // InternalMyDsl.g:1198:5: lv_fail_2_0= 'fail'
                    {
                    lv_fail_2_0=(Token)match(input,31,FOLLOW_32); 

                    					newLeafNode(lv_fail_2_0, grammarAccess.getContextMessageAccess().getFailFailKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextMessageRule());
                    					}
                    					setWithLastConsumed(current, "fail", true, "fail");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1210:3: ( (lv_strict_3_0= 'strict' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1211:4: (lv_strict_3_0= 'strict' )
                    {
                    // InternalMyDsl.g:1211:4: (lv_strict_3_0= 'strict' )
                    // InternalMyDsl.g:1212:5: lv_strict_3_0= 'strict'
                    {
                    lv_strict_3_0=(Token)match(input,32,FOLLOW_16); 

                    					newLeafNode(lv_strict_3_0, grammarAccess.getContextMessageAccess().getStrictStrictKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextMessageRule());
                    					}
                    					setWithLastConsumed(current, "strict", true, "strict");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getContextMessageAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleContextMessage"


    // $ANTLR start "entryRuleContextMessageContent"
    // InternalMyDsl.g:1232:1: entryRuleContextMessageContent returns [EObject current=null] : iv_ruleContextMessageContent= ruleContextMessageContent EOF ;
    public final EObject entryRuleContextMessageContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextMessageContent = null;


        try {
            // InternalMyDsl.g:1232:62: (iv_ruleContextMessageContent= ruleContextMessageContent EOF )
            // InternalMyDsl.g:1233:2: iv_ruleContextMessageContent= ruleContextMessageContent EOF
            {
             newCompositeNode(grammarAccess.getContextMessageContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextMessageContent=ruleContextMessageContent();

            state._fsp--;

             current =iv_ruleContextMessageContent; 
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
    // $ANTLR end "entryRuleContextMessageContent"


    // $ANTLR start "ruleContextMessageContent"
    // InternalMyDsl.g:1239:1: ruleContextMessageContent returns [EObject current=null] : (this_MatchMessage_0= ruleMatchMessage | this_ChangeMessage_1= ruleChangeMessage ) ;
    public final EObject ruleContextMessageContent() throws RecognitionException {
        EObject current = null;

        EObject this_MatchMessage_0 = null;

        EObject this_ChangeMessage_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1245:2: ( (this_MatchMessage_0= ruleMatchMessage | this_ChangeMessage_1= ruleChangeMessage ) )
            // InternalMyDsl.g:1246:2: (this_MatchMessage_0= ruleMatchMessage | this_ChangeMessage_1= ruleChangeMessage )
            {
            // InternalMyDsl.g:1246:2: (this_MatchMessage_0= ruleMatchMessage | this_ChangeMessage_1= ruleChangeMessage )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            else if ( (LA29_0==17||LA29_0==20||LA29_0==38) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1247:3: this_MatchMessage_0= ruleMatchMessage
                    {

                    			newCompositeNode(grammarAccess.getContextMessageContentAccess().getMatchMessageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MatchMessage_0=ruleMatchMessage();

                    state._fsp--;


                    			current = this_MatchMessage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1256:3: this_ChangeMessage_1= ruleChangeMessage
                    {

                    			newCompositeNode(grammarAccess.getContextMessageContentAccess().getChangeMessageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeMessage_1=ruleChangeMessage();

                    state._fsp--;


                    			current = this_ChangeMessage_1;
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
    // $ANTLR end "ruleContextMessageContent"


    // $ANTLR start "entryRuleMatchMessage"
    // InternalMyDsl.g:1268:1: entryRuleMatchMessage returns [EObject current=null] : iv_ruleMatchMessage= ruleMatchMessage EOF ;
    public final EObject entryRuleMatchMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchMessage = null;


        try {
            // InternalMyDsl.g:1268:53: (iv_ruleMatchMessage= ruleMatchMessage EOF )
            // InternalMyDsl.g:1269:2: iv_ruleMatchMessage= ruleMatchMessage EOF
            {
             newCompositeNode(grammarAccess.getMatchMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatchMessage=ruleMatchMessage();

            state._fsp--;

             current =iv_ruleMatchMessage; 
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
    // $ANTLR end "entryRuleMatchMessage"


    // $ANTLR start "ruleMatchMessage"
    // InternalMyDsl.g:1275:1: ruleMatchMessage returns [EObject current=null] : (otherlv_0= 'match' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' ) ;
    public final EObject ruleMatchMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1281:2: ( (otherlv_0= 'match' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' ) )
            // InternalMyDsl.g:1282:2: (otherlv_0= 'match' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' )
            {
            // InternalMyDsl.g:1282:2: (otherlv_0= 'match' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' )
            // InternalMyDsl.g:1283:3: otherlv_0= 'match' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchMessageAccess().getMatchKeyword_0());
            		
            // InternalMyDsl.g:1287:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1288:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1288:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1289:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMatchMessageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getMatchMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1309:3: ( (otherlv_3= RULE_ID ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1310:4: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:1310:4: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:1311:5: otherlv_3= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMatchMessageRule());
                    					}
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

                    					newLeafNode(otherlv_3, grammarAccess.getMatchMessageAccess().getContentContextFragmentCrossReference_3_0());
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMatchMessageAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleMatchMessage"


    // $ANTLR start "entryRuleChangeMessage"
    // InternalMyDsl.g:1330:1: entryRuleChangeMessage returns [EObject current=null] : iv_ruleChangeMessage= ruleChangeMessage EOF ;
    public final EObject entryRuleChangeMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeMessage = null;


        try {
            // InternalMyDsl.g:1330:54: (iv_ruleChangeMessage= ruleChangeMessage EOF )
            // InternalMyDsl.g:1331:2: iv_ruleChangeMessage= ruleChangeMessage EOF
            {
             newCompositeNode(grammarAccess.getChangeMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeMessage=ruleChangeMessage();

            state._fsp--;

             current =iv_ruleChangeMessage; 
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
    // $ANTLR end "entryRuleChangeMessage"


    // $ANTLR start "ruleChangeMessage"
    // InternalMyDsl.g:1337:1: ruleChangeMessage returns [EObject current=null] : (this_DisappearMessage_0= ruleDisappearMessage | this_AppearMessage_1= ruleAppearMessage | this_DistanceMessage_2= ruleDistanceMessage ) ;
    public final EObject ruleChangeMessage() throws RecognitionException {
        EObject current = null;

        EObject this_DisappearMessage_0 = null;

        EObject this_AppearMessage_1 = null;

        EObject this_DistanceMessage_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1343:2: ( (this_DisappearMessage_0= ruleDisappearMessage | this_AppearMessage_1= ruleAppearMessage | this_DistanceMessage_2= ruleDistanceMessage ) )
            // InternalMyDsl.g:1344:2: (this_DisappearMessage_0= ruleDisappearMessage | this_AppearMessage_1= ruleAppearMessage | this_DistanceMessage_2= ruleDistanceMessage )
            {
            // InternalMyDsl.g:1344:2: (this_DisappearMessage_0= ruleDisappearMessage | this_AppearMessage_1= ruleAppearMessage | this_DistanceMessage_2= ruleDistanceMessage )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt31=1;
                }
                break;
            case 17:
                {
                alt31=2;
                }
                break;
            case 20:
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
                    // InternalMyDsl.g:1345:3: this_DisappearMessage_0= ruleDisappearMessage
                    {

                    			newCompositeNode(grammarAccess.getChangeMessageAccess().getDisappearMessageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DisappearMessage_0=ruleDisappearMessage();

                    state._fsp--;


                    			current = this_DisappearMessage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1354:3: this_AppearMessage_1= ruleAppearMessage
                    {

                    			newCompositeNode(grammarAccess.getChangeMessageAccess().getAppearMessageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AppearMessage_1=ruleAppearMessage();

                    state._fsp--;


                    			current = this_AppearMessage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1363:3: this_DistanceMessage_2= ruleDistanceMessage
                    {

                    			newCompositeNode(grammarAccess.getChangeMessageAccess().getDistanceMessageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DistanceMessage_2=ruleDistanceMessage();

                    state._fsp--;


                    			current = this_DistanceMessage_2;
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
    // $ANTLR end "ruleChangeMessage"


    // $ANTLR start "entryRuleAppearMessage"
    // InternalMyDsl.g:1375:1: entryRuleAppearMessage returns [EObject current=null] : iv_ruleAppearMessage= ruleAppearMessage EOF ;
    public final EObject entryRuleAppearMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppearMessage = null;


        try {
            // InternalMyDsl.g:1375:54: (iv_ruleAppearMessage= ruleAppearMessage EOF )
            // InternalMyDsl.g:1376:2: iv_ruleAppearMessage= ruleAppearMessage EOF
            {
             newCompositeNode(grammarAccess.getAppearMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppearMessage=ruleAppearMessage();

            state._fsp--;

             current =iv_ruleAppearMessage; 
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
    // $ANTLR end "entryRuleAppearMessage"


    // $ANTLR start "ruleAppearMessage"
    // InternalMyDsl.g:1382:1: ruleAppearMessage returns [EObject current=null] : (otherlv_0= 'appear' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' ) ;
    public final EObject ruleAppearMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1388:2: ( (otherlv_0= 'appear' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' ) )
            // InternalMyDsl.g:1389:2: (otherlv_0= 'appear' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' )
            {
            // InternalMyDsl.g:1389:2: (otherlv_0= 'appear' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' )
            // InternalMyDsl.g:1390:3: otherlv_0= 'appear' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppearMessageAccess().getAppearKeyword_0());
            		
            // InternalMyDsl.g:1394:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1395:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1395:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1396:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAppearMessageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppearMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getAppearMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1416:3: ( (otherlv_3= RULE_ID ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1417:4: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:1417:4: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:1418:5: otherlv_3= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAppearMessageRule());
                    					}
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

                    					newLeafNode(otherlv_3, grammarAccess.getAppearMessageAccess().getEntityEntityCrossReference_3_0());
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAppearMessageAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleAppearMessage"


    // $ANTLR start "entryRuleDisappearMessage"
    // InternalMyDsl.g:1437:1: entryRuleDisappearMessage returns [EObject current=null] : iv_ruleDisappearMessage= ruleDisappearMessage EOF ;
    public final EObject entryRuleDisappearMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisappearMessage = null;


        try {
            // InternalMyDsl.g:1437:57: (iv_ruleDisappearMessage= ruleDisappearMessage EOF )
            // InternalMyDsl.g:1438:2: iv_ruleDisappearMessage= ruleDisappearMessage EOF
            {
             newCompositeNode(grammarAccess.getDisappearMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisappearMessage=ruleDisappearMessage();

            state._fsp--;

             current =iv_ruleDisappearMessage; 
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
    // $ANTLR end "entryRuleDisappearMessage"


    // $ANTLR start "ruleDisappearMessage"
    // InternalMyDsl.g:1444:1: ruleDisappearMessage returns [EObject current=null] : (otherlv_0= 'disappear' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' ) ;
    public final EObject ruleDisappearMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1450:2: ( (otherlv_0= 'disappear' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' ) )
            // InternalMyDsl.g:1451:2: (otherlv_0= 'disappear' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' )
            {
            // InternalMyDsl.g:1451:2: (otherlv_0= 'disappear' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' )
            // InternalMyDsl.g:1452:3: otherlv_0= 'disappear' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDisappearMessageAccess().getDisappearKeyword_0());
            		
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:433:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:434:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:434:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:435:5: otherlv_7= RULE_ID
=======
            // InternalMyDsl.g:1051:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:1052:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:1052:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:1053:5: otherlv_7= RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1456:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1457:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1457:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1458:5: lv_name_1_0= RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDisappearMessageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDisappearMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:446:3: ( (lv_past_8_0= 'past' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);
=======
            // InternalMyDsl.g:1064:3: ( (lv_past_8_0= 'past' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior
=======
            otherlv_2=(Token)match(input,18,FOLLOW_33); 
>>>>>>> [xText] Added new message type: contextMessage

            			newLeafNode(otherlv_2, grammarAccess.getDisappearMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1478:3: ( (otherlv_3= RULE_ID ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
                    // InternalMyDsl.g:447:4: (lv_past_8_0= 'past' )
                    {
                    // InternalMyDsl.g:447:4: (lv_past_8_0= 'past' )
                    // InternalMyDsl.g:448:5: lv_past_8_0= 'past'
=======
                    // InternalMyDsl.g:1065:4: (lv_past_8_0= 'past' )
                    {
                    // InternalMyDsl.g:1065:4: (lv_past_8_0= 'past' )
                    // InternalMyDsl.g:1066:5: lv_past_8_0= 'past'
>>>>>>> Added Xtext for context dependent behavior
=======
                    // InternalMyDsl.g:1479:4: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:1479:4: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:1480:5: otherlv_3= RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDisappearMessageRule());
                    					}
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

                    					newLeafNode(otherlv_3, grammarAccess.getDisappearMessageAccess().getEntityEntityCrossReference_3_0());
                    				

                    }


                    }
                    break;

            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:460:3: ( (lv_future_9_0= 'future' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);
=======
            // InternalMyDsl.g:1078:3: ( (lv_future_9_0= 'future' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior
=======
            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDisappearMessageAccess().getRightParenthesisKeyword_4());
            		
>>>>>>> [xText] Added new message type: contextMessage

            }
<<<<<<< HEAD
            switch (alt21) {
                case 1 :
<<<<<<< HEAD
                    // InternalMyDsl.g:461:4: (lv_future_9_0= 'future' )
                    {
                    // InternalMyDsl.g:461:4: (lv_future_9_0= 'future' )
                    // InternalMyDsl.g:462:5: lv_future_9_0= 'future'
=======
                    // InternalMyDsl.g:1079:4: (lv_future_9_0= 'future' )
                    {
                    // InternalMyDsl.g:1079:4: (lv_future_9_0= 'future' )
                    // InternalMyDsl.g:1080:5: lv_future_9_0= 'future'
>>>>>>> Added Xtext for context dependent behavior
                    {
                    lv_future_9_0=(Token)match(input,35,FOLLOW_26); 
=======
>>>>>>> [xText] Added new message type: contextMessage


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
    // $ANTLR end "ruleDisappearMessage"

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:474:3: ( (lv_constraint_10_0= 'constraint' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);
=======
            // InternalMyDsl.g:1092:3: ( (lv_constraint_10_0= 'constraint' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
<<<<<<< HEAD
                    // InternalMyDsl.g:475:4: (lv_constraint_10_0= 'constraint' )
                    {
                    // InternalMyDsl.g:475:4: (lv_constraint_10_0= 'constraint' )
                    // InternalMyDsl.g:476:5: lv_constraint_10_0= 'constraint'
=======
                    // InternalMyDsl.g:1093:4: (lv_constraint_10_0= 'constraint' )
                    {
                    // InternalMyDsl.g:1093:4: (lv_constraint_10_0= 'constraint' )
                    // InternalMyDsl.g:1094:5: lv_constraint_10_0= 'constraint'
>>>>>>> Added Xtext for context dependent behavior
                    {
                    lv_constraint_10_0=(Token)match(input,36,FOLLOW_27); 
=======

    // $ANTLR start "entryRuleDistanceMessage"
    // InternalMyDsl.g:1499:1: entryRuleDistanceMessage returns [EObject current=null] : iv_ruleDistanceMessage= ruleDistanceMessage EOF ;
    public final EObject entryRuleDistanceMessage() throws RecognitionException {
        EObject current = null;
>>>>>>> [xText] Added new message type: contextMessage

        EObject iv_ruleDistanceMessage = null;


        try {
            // InternalMyDsl.g:1499:56: (iv_ruleDistanceMessage= ruleDistanceMessage EOF )
            // InternalMyDsl.g:1500:2: iv_ruleDistanceMessage= ruleDistanceMessage EOF
            {
             newCompositeNode(grammarAccess.getDistanceMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistanceMessage=ruleDistanceMessage();

            state._fsp--;

             current =iv_ruleDistanceMessage; 
            match(input,EOF,FOLLOW_2); 

            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:488:3: (otherlv_11= '{' )?
            int alt12=2;
            int LA12_0 = input.LA(1);
=======
            // InternalMyDsl.g:1106:3: (otherlv_11= '{' )?
            int alt23=2;
            int LA23_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior
=======
        }
>>>>>>> [xText] Added new message type: contextMessage

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
<<<<<<< HEAD
            switch (alt23) {
                case 1 :
<<<<<<< HEAD
                    // InternalMyDsl.g:489:4: otherlv_11= '{'
=======
                    // InternalMyDsl.g:1107:4: otherlv_11= '{'
>>>>>>> Added Xtext for context dependent behavior
                    {
                    otherlv_11=(Token)match(input,13,FOLLOW_28); 
=======
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDistanceMessage"
>>>>>>> [xText] Added new message type: contextMessage


    // $ANTLR start "ruleDistanceMessage"
    // InternalMyDsl.g:1506:1: ruleDistanceMessage returns [EObject current=null] : (otherlv_0= 'distance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' ) ;
    public final EObject ruleDistanceMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1512:2: ( (otherlv_0= 'distance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' ) )
            // InternalMyDsl.g:1513:2: (otherlv_0= 'distance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' )
            {
            // InternalMyDsl.g:1513:2: (otherlv_0= 'distance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')' )
            // InternalMyDsl.g:1514:3: otherlv_0= 'distance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDistanceMessageAccess().getDistanceKeyword_0());
            		
            // InternalMyDsl.g:1518:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1519:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1519:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1520:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDistanceMessageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDistanceMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:494:3: ( (otherlv_12= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);
=======
            // InternalMyDsl.g:1112:3: ( (otherlv_12= RULE_ID ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior
=======
>>>>>>> [xText] Added new message type: contextMessage

            }

            otherlv_2=(Token)match(input,18,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getDistanceMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1540:3: ( (otherlv_3= RULE_ID ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
                    // InternalMyDsl.g:495:4: (otherlv_12= RULE_ID )
                    {
                    // InternalMyDsl.g:495:4: (otherlv_12= RULE_ID )
                    // InternalMyDsl.g:496:5: otherlv_12= RULE_ID
=======
                    // InternalMyDsl.g:1113:4: (otherlv_12= RULE_ID )
                    {
                    // InternalMyDsl.g:1113:4: (otherlv_12= RULE_ID )
                    // InternalMyDsl.g:1114:5: otherlv_12= RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
                    // InternalMyDsl.g:1541:4: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:1541:4: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:1542:5: otherlv_3= RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDistanceMessageRule());
                    					}
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

                    					newLeafNode(otherlv_3, grammarAccess.getDistanceMessageAccess().getEntityEntityCrossReference_3_0());
                    				

                    }


                    }
                    break;

            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:507:3: (otherlv_13= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);
=======
            // InternalMyDsl.g:1125:3: (otherlv_13= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
<<<<<<< HEAD
                    // InternalMyDsl.g:508:4: otherlv_13= '}'
=======
                    // InternalMyDsl.g:1126:4: otherlv_13= '}'
>>>>>>> Added Xtext for context dependent behavior
                    {
                    otherlv_13=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_13());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,23,FOLLOW_2); 
=======
            otherlv_4=(Token)match(input,19,FOLLOW_2); 
>>>>>>> [xText] Added new message type: contextMessage

            			newLeafNode(otherlv_4, grammarAccess.getDistanceMessageAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleDistanceMessage"


    // $ANTLR start "entryRuleName"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:521:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
=======
    // InternalMyDsl.g:1139:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1561:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
>>>>>>> [xText] Added new message type: contextMessage
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:521:44: (iv_ruleName= ruleName EOF )
            // InternalMyDsl.g:522:2: iv_ruleName= ruleName EOF
=======
            // InternalMyDsl.g:1139:44: (iv_ruleName= ruleName EOF )
            // InternalMyDsl.g:1140:2: iv_ruleName= ruleName EOF
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1561:44: (iv_ruleName= ruleName EOF )
            // InternalMyDsl.g:1562:2: iv_ruleName= ruleName EOF
>>>>>>> [xText] Added new message type: contextMessage
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:528:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' ) ;
=======
    // InternalMyDsl.g:1146:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1568:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_Number_3=null;


        	enterRule();

        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:534:2: ( (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' ) )
            // InternalMyDsl.g:535:2: (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' )
            {
            // InternalMyDsl.g:535:2: (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' )
            // InternalMyDsl.g:536:3: this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')'
=======
            // InternalMyDsl.g:1152:2: ( (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' ) )
            // InternalMyDsl.g:1153:2: (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' )
            {
            // InternalMyDsl.g:1153:2: (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' )
            // InternalMyDsl.g:1154:3: this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1574:2: ( (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' ) )
            // InternalMyDsl.g:1575:2: (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' )
            {
            // InternalMyDsl.g:1575:2: (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' )
            // InternalMyDsl.g:1576:3: this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')'
>>>>>>> [xText] Added new message type: contextMessage
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,18,FOLLOW_34); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getNameAccess().getLeftParenthesisKeyword_1());
            		
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:548:3: (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )?
            int alt15=3;
            int LA15_0 = input.LA(1);
=======
            // InternalMyDsl.g:1166:3: (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )?
            int alt26=3;
            int LA26_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1588:3: (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )?
            int alt35=3;
            int LA35_0 = input.LA(1);
>>>>>>> [xText] Added new message type: contextMessage

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_NUMBER) ) {
                alt35=2;
            }
            switch (alt35) {
                case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
                    // InternalMyDsl.g:549:4: this_ID_2= RULE_ID
=======
                    // InternalMyDsl.g:1167:4: this_ID_2= RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
                    // InternalMyDsl.g:1589:4: this_ID_2= RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_15); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getNameAccess().getIDTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
<<<<<<< HEAD
<<<<<<< HEAD
                    // InternalMyDsl.g:557:4: this_Number_3= RULE_NUMBER
=======
                    // InternalMyDsl.g:1175:4: this_Number_3= RULE_NUMBER
>>>>>>> Added Xtext for context dependent behavior
=======
                    // InternalMyDsl.g:1597:4: this_Number_3= RULE_NUMBER
>>>>>>> [xText] Added new message type: contextMessage
                    {
                    this_Number_3=(Token)match(input,RULE_NUMBER,FOLLOW_15); 

                    				current.merge(this_Number_3);
                    			

                    				newLeafNode(this_Number_3, grammarAccess.getNameAccess().getNumberTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,19,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getNameAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleObjectType"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:574:1: entryRuleObjectType returns [EObject current=null] : iv_ruleObjectType= ruleObjectType EOF ;
=======
    // InternalMyDsl.g:1192:1: entryRuleObjectType returns [EObject current=null] : iv_ruleObjectType= ruleObjectType EOF ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1614:1: entryRuleObjectType returns [EObject current=null] : iv_ruleObjectType= ruleObjectType EOF ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject entryRuleObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectType = null;


        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:574:51: (iv_ruleObjectType= ruleObjectType EOF )
            // InternalMyDsl.g:575:2: iv_ruleObjectType= ruleObjectType EOF
=======
            // InternalMyDsl.g:1192:51: (iv_ruleObjectType= ruleObjectType EOF )
            // InternalMyDsl.g:1193:2: iv_ruleObjectType= ruleObjectType EOF
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1614:51: (iv_ruleObjectType= ruleObjectType EOF )
            // InternalMyDsl.g:1615:2: iv_ruleObjectType= ruleObjectType EOF
>>>>>>> [xText] Added new message type: contextMessage
            {
             newCompositeNode(grammarAccess.getObjectTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectType=ruleObjectType();

            state._fsp--;

             current =iv_ruleObjectType; 
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
    // $ANTLR end "entryRuleObjectType"


    // $ANTLR start "ruleObjectType"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:581:1: ruleObjectType returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ) ;
=======
    // InternalMyDsl.g:1199:1: ruleObjectType returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1621:1: ruleObjectType returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject ruleObjectType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:587:2: ( (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:588:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:588:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:589:3: otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) )
=======
            // InternalMyDsl.g:1205:2: ( (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:1206:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1206:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:1207:3: otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) )
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1627:2: ( (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:1628:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1628:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:1629:3: otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectTypeAccess().getObjectKeyword_0());
            		
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:593:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:594:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:594:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:595:5: lv_name_1_0= RULE_ID
=======
            // InternalMyDsl.g:1211:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1212:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1212:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1213:5: lv_name_1_0= RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1633:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1634:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1634:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1635:5: lv_name_1_0= RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjectTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleObjectType"


    // $ANTLR start "entryRuleObject"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:615:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
=======
    // InternalMyDsl.g:1233:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1655:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:615:47: (iv_ruleObject= ruleObject EOF )
            // InternalMyDsl.g:616:2: iv_ruleObject= ruleObject EOF
=======
            // InternalMyDsl.g:1233:47: (iv_ruleObject= ruleObject EOF )
            // InternalMyDsl.g:1234:2: iv_ruleObject= ruleObject EOF
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1655:47: (iv_ruleObject= ruleObject EOF )
            // InternalMyDsl.g:1656:2: iv_ruleObject= ruleObject EOF
>>>>>>> [xText] Added new message type: contextMessage
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:622:1: ruleObject returns [EObject current=null] : ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
=======
    // InternalMyDsl.g:1240:1: ruleObject returns [EObject current=null] : ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1662:1: ruleObject returns [EObject current=null] : ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_object_0_0 = null;



        	enterRule();

        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:628:2: ( ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:629:2: ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:629:2: ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMyDsl.g:630:3: ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalMyDsl.g:630:3: ( (lv_object_0_0= ruleObjectType ) )
            // InternalMyDsl.g:631:4: (lv_object_0_0= ruleObjectType )
            {
            // InternalMyDsl.g:631:4: (lv_object_0_0= ruleObjectType )
            // InternalMyDsl.g:632:5: lv_object_0_0= ruleObjectType
=======
            // InternalMyDsl.g:1246:2: ( ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:1247:2: ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
=======
            // InternalMyDsl.g:1668:2: ( ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:1669:2: ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:1669:2: ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMyDsl.g:1670:3: ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalMyDsl.g:1670:3: ( (lv_object_0_0= ruleObjectType ) )
            // InternalMyDsl.g:1671:4: (lv_object_0_0= ruleObjectType )
            {
<<<<<<< HEAD
            // InternalMyDsl.g:1249:4: (lv_object_0_0= ruleObjectType )
            // InternalMyDsl.g:1250:5: lv_object_0_0= ruleObjectType
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1671:4: (lv_object_0_0= ruleObjectType )
            // InternalMyDsl.g:1672:5: lv_object_0_0= ruleObjectType
>>>>>>> [xText] Added new message type: contextMessage
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getObjectObjectTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_object_0_0=ruleObjectType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectRule());
            					}
            					add(
            						current,
            						"object",
            						lv_object_0_0,
            						"org.xtext.example.mydsl.MyDsl.ObjectType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:649:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:650:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:650:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:651:5: lv_name_1_0= RULE_ID
=======
            // InternalMyDsl.g:1267:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1268:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1268:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1269:5: lv_name_1_0= RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1689:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1690:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1690:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1691:5: lv_name_1_0= RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleConstraint"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:675:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
=======
    // InternalMyDsl.g:1293:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1715:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:675:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyDsl.g:676:2: iv_ruleConstraint= ruleConstraint EOF
=======
            // InternalMyDsl.g:1293:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyDsl.g:1294:2: iv_ruleConstraint= ruleConstraint EOF
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1715:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyDsl.g:1716:2: iv_ruleConstraint= ruleConstraint EOF
>>>>>>> [xText] Added new message type: contextMessage
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:682:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) ;
=======
    // InternalMyDsl.g:1300:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1722:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_messages_3_0 = null;



        	enterRule();

        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:688:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:689:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:689:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            // InternalMyDsl.g:690:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}'
=======
            // InternalMyDsl.g:1306:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:1307:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:1307:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            // InternalMyDsl.g:1308:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1728:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:1729:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:1729:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            // InternalMyDsl.g:1730:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}'
>>>>>>> [xText] Added new message type: contextMessage
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:694:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:695:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:695:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:696:5: lv_name_1_0= RULE_ID
=======
            // InternalMyDsl.g:1312:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1313:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1313:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1314:5: lv_name_1_0= RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1734:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1735:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1735:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1736:5: lv_name_1_0= RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:716:3: ( (lv_messages_3_0= ruleMessage ) )*
            loop16:
=======
            // InternalMyDsl.g:1334:3: ( (lv_messages_3_0= ruleMessage ) )*
            loop27:
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1756:3: ( (lv_messages_3_0= ruleMessage ) )*
            loop36:
>>>>>>> [xText] Added new message type: contextMessage
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==29) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
            	    // InternalMyDsl.g:717:4: (lv_messages_3_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:717:4: (lv_messages_3_0= ruleMessage )
            	    // InternalMyDsl.g:718:5: lv_messages_3_0= ruleMessage
=======
            	    // InternalMyDsl.g:1335:4: (lv_messages_3_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:1335:4: (lv_messages_3_0= ruleMessage )
            	    // InternalMyDsl.g:1336:5: lv_messages_3_0= ruleMessage
>>>>>>> Added Xtext for context dependent behavior
=======
            	    // InternalMyDsl.g:1757:4: (lv_messages_3_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:1757:4: (lv_messages_3_0= ruleMessage )
            	    // InternalMyDsl.g:1758:5: lv_messages_3_0= ruleMessage
>>>>>>> [xText] Added new message type: contextMessage
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintAccess().getMessagesMessageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_messages_3_0=ruleMessage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConstraintRule());
            	    					}
            	    					add(
            	    						current,
            	    						"messages",
            	    						lv_messages_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Message");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleAlt"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:743:1: entryRuleAlt returns [EObject current=null] : iv_ruleAlt= ruleAlt EOF ;
=======
    // InternalMyDsl.g:1361:1: entryRuleAlt returns [EObject current=null] : iv_ruleAlt= ruleAlt EOF ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1783:1: entryRuleAlt returns [EObject current=null] : iv_ruleAlt= ruleAlt EOF ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject entryRuleAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlt = null;


        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:743:44: (iv_ruleAlt= ruleAlt EOF )
            // InternalMyDsl.g:744:2: iv_ruleAlt= ruleAlt EOF
=======
            // InternalMyDsl.g:1361:44: (iv_ruleAlt= ruleAlt EOF )
            // InternalMyDsl.g:1362:2: iv_ruleAlt= ruleAlt EOF
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1783:44: (iv_ruleAlt= ruleAlt EOF )
            // InternalMyDsl.g:1784:2: iv_ruleAlt= ruleAlt EOF
>>>>>>> [xText] Added new message type: contextMessage
            {
             newCompositeNode(grammarAccess.getAltRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlt=ruleAlt();

            state._fsp--;

             current =iv_ruleAlt; 
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
    // $ANTLR end "entryRuleAlt"


    // $ANTLR start "ruleAlt"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:750:1: ruleAlt returns [EObject current=null] : (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* ) ;
=======
    // InternalMyDsl.g:1368:1: ruleAlt returns [EObject current=null] : (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1790:1: ruleAlt returns [EObject current=null] : (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject ruleAlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:756:2: ( (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* ) )
            // InternalMyDsl.g:757:2: (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* )
            {
            // InternalMyDsl.g:757:2: (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* )
            // InternalMyDsl.g:758:3: otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )*
=======
            // InternalMyDsl.g:1374:2: ( (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* ) )
            // InternalMyDsl.g:1375:2: (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* )
            {
            // InternalMyDsl.g:1375:2: (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* )
            // InternalMyDsl.g:1376:3: otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )*
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1796:2: ( (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* ) )
            // InternalMyDsl.g:1797:2: (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* )
            {
            // InternalMyDsl.g:1797:2: (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* )
            // InternalMyDsl.g:1798:3: otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )*
>>>>>>> [xText] Added new message type: contextMessage
            {
            otherlv_0=(Token)match(input,40,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getAltAccess().getAltKeyword_0());
            		
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:762:3: ( (lv_expressions_1_0= ruleExpression ) )*
            loop17:
=======
            // InternalMyDsl.g:1380:3: ( (lv_expressions_1_0= ruleExpression ) )*
            loop28:
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1802:3: ( (lv_expressions_1_0= ruleExpression ) )*
            loop37:
>>>>>>> [xText] Added new message type: contextMessage
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==18) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
            	    // InternalMyDsl.g:763:4: (lv_expressions_1_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:763:4: (lv_expressions_1_0= ruleExpression )
            	    // InternalMyDsl.g:764:5: lv_expressions_1_0= ruleExpression
=======
            	    // InternalMyDsl.g:1381:4: (lv_expressions_1_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:1381:4: (lv_expressions_1_0= ruleExpression )
            	    // InternalMyDsl.g:1382:5: lv_expressions_1_0= ruleExpression
>>>>>>> Added Xtext for context dependent behavior
=======
            	    // InternalMyDsl.g:1803:4: (lv_expressions_1_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:1803:4: (lv_expressions_1_0= ruleExpression )
            	    // InternalMyDsl.g:1804:5: lv_expressions_1_0= ruleExpression
>>>>>>> [xText] Added new message type: contextMessage
            	    {

            	    					newCompositeNode(grammarAccess.getAltAccess().getExpressionsExpressionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_expressions_1_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAltRule());
            	    					}
            	    					add(
            	    						current,
            	    						"expressions",
            	    						lv_expressions_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "ruleAlt"


    // $ANTLR start "entryRuleExpression"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:785:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
=======
    // InternalMyDsl.g:1403:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1825:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:785:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:786:2: iv_ruleExpression= ruleExpression EOF
=======
            // InternalMyDsl.g:1403:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:1404:2: iv_ruleExpression= ruleExpression EOF
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1825:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:1826:2: iv_ruleExpression= ruleExpression EOF
>>>>>>> [xText] Added new message type: contextMessage
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:792:1: ruleExpression returns [EObject current=null] : (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' ) ;
=======
    // InternalMyDsl.g:1410:1: ruleExpression returns [EObject current=null] : (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1832:1: ruleExpression returns [EObject current=null] : (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_ID_7=null;
        Token this_Number_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_messages_11_0 = null;



        	enterRule();

        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:798:2: ( (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' ) )
            // InternalMyDsl.g:799:2: (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' )
            {
            // InternalMyDsl.g:799:2: (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' )
            // InternalMyDsl.g:800:3: otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}'
=======
            // InternalMyDsl.g:1416:2: ( (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' ) )
            // InternalMyDsl.g:1417:2: (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' )
            {
            // InternalMyDsl.g:1417:2: (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' )
            // InternalMyDsl.g:1418:3: otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1838:2: ( (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' ) )
            // InternalMyDsl.g:1839:2: (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' )
            {
            // InternalMyDsl.g:1839:2: (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' )
            // InternalMyDsl.g:1840:3: otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}'
>>>>>>> [xText] Added new message type: contextMessage
            {
            otherlv_0=(Token)match(input,18,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0());
            		
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:804:3: (this_ID_1= RULE_ID )?
            int alt18=2;
            int LA18_0 = input.LA(1);
=======
            // InternalMyDsl.g:1422:3: (this_ID_1= RULE_ID )?
            int alt29=2;
            int LA29_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1844:3: (this_ID_1= RULE_ID )?
            int alt38=2;
            int LA38_0 = input.LA(1);
>>>>>>> [xText] Added new message type: contextMessage

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
                    // InternalMyDsl.g:805:4: this_ID_1= RULE_ID
=======
                    // InternalMyDsl.g:1423:4: this_ID_1= RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
                    // InternalMyDsl.g:1845:4: this_ID_1= RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_37); 

                    				newLeafNode(this_ID_1, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1());
                    			

                    }
                    break;

            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:810:3: (otherlv_2= '=' )?
            int alt19=2;
            int LA19_0 = input.LA(1);
=======
            // InternalMyDsl.g:1428:3: (otherlv_2= '=' )?
            int alt30=2;
            int LA30_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1850:3: (otherlv_2= '=' )?
            int alt39=2;
            int LA39_0 = input.LA(1);
>>>>>>> [xText] Added new message type: contextMessage

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
                    // InternalMyDsl.g:811:4: otherlv_2= '='
=======
                    // InternalMyDsl.g:1429:4: otherlv_2= '='
>>>>>>> Added Xtext for context dependent behavior
=======
                    // InternalMyDsl.g:1851:4: otherlv_2= '='
>>>>>>> [xText] Added new message type: contextMessage
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_38); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getEqualsSignKeyword_2());
                    			

                    }
                    break;

            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:816:3: (otherlv_3= '>' )?
            int alt20=2;
            int LA20_0 = input.LA(1);
=======
            // InternalMyDsl.g:1434:3: (otherlv_3= '>' )?
            int alt31=2;
            int LA31_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1856:3: (otherlv_3= '>' )?
            int alt40=2;
            int LA40_0 = input.LA(1);
>>>>>>> [xText] Added new message type: contextMessage

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
                    // InternalMyDsl.g:817:4: otherlv_3= '>'
=======
                    // InternalMyDsl.g:1435:4: otherlv_3= '>'
>>>>>>> Added Xtext for context dependent behavior
=======
                    // InternalMyDsl.g:1857:4: otherlv_3= '>'
>>>>>>> [xText] Added new message type: contextMessage
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_39); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getGreaterThanSignKeyword_3());
                    			

                    }
                    break;

            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:822:3: (otherlv_4= '<' )?
            int alt21=2;
            int LA21_0 = input.LA(1);
=======
            // InternalMyDsl.g:1440:3: (otherlv_4= '<' )?
            int alt32=2;
            int LA32_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1862:3: (otherlv_4= '<' )?
            int alt41=2;
            int LA41_0 = input.LA(1);
>>>>>>> [xText] Added new message type: contextMessage

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
                    // InternalMyDsl.g:823:4: otherlv_4= '<'
=======
                    // InternalMyDsl.g:1441:4: otherlv_4= '<'
>>>>>>> Added Xtext for context dependent behavior
=======
                    // InternalMyDsl.g:1863:4: otherlv_4= '<'
>>>>>>> [xText] Added new message type: contextMessage
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getLessThanSignKeyword_4());
                    			

                    }
                    break;

            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:828:3: (otherlv_5= '>=' )?
            int alt22=2;
            int LA22_0 = input.LA(1);
=======
            // InternalMyDsl.g:1446:3: (otherlv_5= '>=' )?
            int alt33=2;
            int LA33_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1868:3: (otherlv_5= '>=' )?
            int alt42=2;
            int LA42_0 = input.LA(1);
>>>>>>> [xText] Added new message type: contextMessage

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
                    // InternalMyDsl.g:829:4: otherlv_5= '>='
=======
                    // InternalMyDsl.g:1447:4: otherlv_5= '>='
>>>>>>> Added Xtext for context dependent behavior
=======
                    // InternalMyDsl.g:1869:4: otherlv_5= '>='
>>>>>>> [xText] Added new message type: contextMessage
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_41); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getGreaterThanSignEqualsSignKeyword_5());
                    			

                    }
                    break;

            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:834:3: (otherlv_6= '<=' )?
            int alt23=2;
            int LA23_0 = input.LA(1);
=======
            // InternalMyDsl.g:1452:3: (otherlv_6= '<=' )?
            int alt34=2;
            int LA34_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1874:3: (otherlv_6= '<=' )?
            int alt43=2;
            int LA43_0 = input.LA(1);
>>>>>>> [xText] Added new message type: contextMessage

            if ( (LA43_0==45) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
                    // InternalMyDsl.g:835:4: otherlv_6= '<='
=======
                    // InternalMyDsl.g:1453:4: otherlv_6= '<='
>>>>>>> Added Xtext for context dependent behavior
=======
                    // InternalMyDsl.g:1875:4: otherlv_6= '<='
>>>>>>> [xText] Added new message type: contextMessage
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getLessThanSignEqualsSignKeyword_6());
                    			

                    }
                    break;

            }

<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:840:3: (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )?
            int alt24=3;
            int LA24_0 = input.LA(1);
=======
            // InternalMyDsl.g:1458:3: (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )?
            int alt35=3;
            int LA35_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1880:3: (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )?
            int alt44=3;
            int LA44_0 = input.LA(1);
>>>>>>> [xText] Added new message type: contextMessage

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_NUMBER) ) {
                alt44=2;
            }
            switch (alt44) {
                case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
                    // InternalMyDsl.g:841:4: this_ID_7= RULE_ID
=======
                    // InternalMyDsl.g:1459:4: this_ID_7= RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
                    // InternalMyDsl.g:1881:4: this_ID_7= RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
                    {
                    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_15); 

                    				newLeafNode(this_ID_7, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_7_0());
                    			

                    }
                    break;
                case 2 :
<<<<<<< HEAD
<<<<<<< HEAD
                    // InternalMyDsl.g:846:4: this_Number_8= RULE_NUMBER
=======
                    // InternalMyDsl.g:1464:4: this_Number_8= RULE_NUMBER
>>>>>>> Added Xtext for context dependent behavior
=======
                    // InternalMyDsl.g:1886:4: this_Number_8= RULE_NUMBER
>>>>>>> [xText] Added new message type: contextMessage
                    {
                    this_Number_8=(Token)match(input,RULE_NUMBER,FOLLOW_15); 

                    				newLeafNode(this_Number_8, grammarAccess.getExpressionAccess().getNumberTerminalRuleCall_7_1());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_10, grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_9());
            		
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:859:3: ( (lv_messages_11_0= ruleMessage ) )*
            loop25:
=======
            // InternalMyDsl.g:1477:3: ( (lv_messages_11_0= ruleMessage ) )*
            loop36:
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1899:3: ( (lv_messages_11_0= ruleMessage ) )*
            loop45:
>>>>>>> [xText] Added new message type: contextMessage
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==29) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
            	    // InternalMyDsl.g:860:4: (lv_messages_11_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:860:4: (lv_messages_11_0= ruleMessage )
            	    // InternalMyDsl.g:861:5: lv_messages_11_0= ruleMessage
=======
            	    // InternalMyDsl.g:1478:4: (lv_messages_11_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:1478:4: (lv_messages_11_0= ruleMessage )
            	    // InternalMyDsl.g:1479:5: lv_messages_11_0= ruleMessage
>>>>>>> Added Xtext for context dependent behavior
=======
            	    // InternalMyDsl.g:1900:4: (lv_messages_11_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:1900:4: (lv_messages_11_0= ruleMessage )
            	    // InternalMyDsl.g:1901:5: lv_messages_11_0= ruleMessage
>>>>>>> [xText] Added new message type: contextMessage
            	    {

            	    					newCompositeNode(grammarAccess.getExpressionAccess().getMessagesMessageParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_messages_11_0=ruleMessage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"messages",
            	    						lv_messages_11_0,
            	    						"org.xtext.example.mydsl.MyDsl.Message");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getExpressionAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRulePar"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:886:1: entryRulePar returns [EObject current=null] : iv_rulePar= rulePar EOF ;
=======
    // InternalMyDsl.g:1504:1: entryRulePar returns [EObject current=null] : iv_rulePar= rulePar EOF ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1926:1: entryRulePar returns [EObject current=null] : iv_rulePar= rulePar EOF ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject entryRulePar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePar = null;


        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:886:44: (iv_rulePar= rulePar EOF )
            // InternalMyDsl.g:887:2: iv_rulePar= rulePar EOF
=======
            // InternalMyDsl.g:1504:44: (iv_rulePar= rulePar EOF )
            // InternalMyDsl.g:1505:2: iv_rulePar= rulePar EOF
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1926:44: (iv_rulePar= rulePar EOF )
            // InternalMyDsl.g:1927:2: iv_rulePar= rulePar EOF
>>>>>>> [xText] Added new message type: contextMessage
            {
             newCompositeNode(grammarAccess.getParRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePar=rulePar();

            state._fsp--;

             current =iv_rulePar; 
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
    // $ANTLR end "entryRulePar"


    // $ANTLR start "rulePar"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:893:1: rulePar returns [EObject current=null] : (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' ) ;
=======
    // InternalMyDsl.g:1511:1: rulePar returns [EObject current=null] : (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1933:1: rulePar returns [EObject current=null] : (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject rulePar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parexpression_2_0 = null;



        	enterRule();

        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:899:2: ( (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:900:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:900:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' )
            // InternalMyDsl.g:901:3: otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}'
=======
            // InternalMyDsl.g:1517:2: ( (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:1518:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:1518:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' )
            // InternalMyDsl.g:1519:3: otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1939:2: ( (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:1940:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:1940:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' )
            // InternalMyDsl.g:1941:3: otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}'
>>>>>>> [xText] Added new message type: contextMessage
            {
            otherlv_0=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParAccess().getParKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getParAccess().getLeftCurlyBracketKeyword_1());
            		
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:909:3: ( (lv_parexpression_2_0= ruleParExpression ) )*
            loop26:
=======
            // InternalMyDsl.g:1527:3: ( (lv_parexpression_2_0= ruleParExpression ) )*
            loop37:
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1949:3: ( (lv_parexpression_2_0= ruleParExpression ) )*
            loop46:
>>>>>>> [xText] Added new message type: contextMessage
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==47) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
            	    // InternalMyDsl.g:910:4: (lv_parexpression_2_0= ruleParExpression )
            	    {
            	    // InternalMyDsl.g:910:4: (lv_parexpression_2_0= ruleParExpression )
            	    // InternalMyDsl.g:911:5: lv_parexpression_2_0= ruleParExpression
=======
            	    // InternalMyDsl.g:1528:4: (lv_parexpression_2_0= ruleParExpression )
            	    {
            	    // InternalMyDsl.g:1528:4: (lv_parexpression_2_0= ruleParExpression )
            	    // InternalMyDsl.g:1529:5: lv_parexpression_2_0= ruleParExpression
>>>>>>> Added Xtext for context dependent behavior
=======
            	    // InternalMyDsl.g:1950:4: (lv_parexpression_2_0= ruleParExpression )
            	    {
            	    // InternalMyDsl.g:1950:4: (lv_parexpression_2_0= ruleParExpression )
            	    // InternalMyDsl.g:1951:5: lv_parexpression_2_0= ruleParExpression
>>>>>>> [xText] Added new message type: contextMessage
            	    {

            	    					newCompositeNode(grammarAccess.getParAccess().getParexpressionParExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_parexpression_2_0=ruleParExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parexpression",
            	    						lv_parexpression_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.ParExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulePar"


    // $ANTLR start "entryRuleParExpression"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:936:1: entryRuleParExpression returns [EObject current=null] : iv_ruleParExpression= ruleParExpression EOF ;
=======
    // InternalMyDsl.g:1554:1: entryRuleParExpression returns [EObject current=null] : iv_ruleParExpression= ruleParExpression EOF ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1976:1: entryRuleParExpression returns [EObject current=null] : iv_ruleParExpression= ruleParExpression EOF ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject entryRuleParExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParExpression = null;


        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:936:54: (iv_ruleParExpression= ruleParExpression EOF )
            // InternalMyDsl.g:937:2: iv_ruleParExpression= ruleParExpression EOF
=======
            // InternalMyDsl.g:1554:54: (iv_ruleParExpression= ruleParExpression EOF )
            // InternalMyDsl.g:1555:2: iv_ruleParExpression= ruleParExpression EOF
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1976:54: (iv_ruleParExpression= ruleParExpression EOF )
            // InternalMyDsl.g:1977:2: iv_ruleParExpression= ruleParExpression EOF
>>>>>>> [xText] Added new message type: contextMessage
            {
             newCompositeNode(grammarAccess.getParExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParExpression=ruleParExpression();

            state._fsp--;

             current =iv_ruleParExpression; 
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
    // $ANTLR end "entryRuleParExpression"


    // $ANTLR start "ruleParExpression"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:943:1: ruleParExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) ;
=======
    // InternalMyDsl.g:1561:1: ruleParExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:1983:1: ruleParExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final EObject ruleParExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_messages_3_0 = null;



        	enterRule();

        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:949:2: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:950:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:950:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            // InternalMyDsl.g:951:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}'
=======
            // InternalMyDsl.g:1567:2: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:1568:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:1568:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            // InternalMyDsl.g:1569:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1989:2: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:1990:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:1990:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            // InternalMyDsl.g:1991:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}'
>>>>>>> [xText] Added new message type: contextMessage
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParExpressionAccess().getCaseKeyword_0());
            		
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:955:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:956:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:956:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:957:5: lv_name_1_0= RULE_ID
=======
            // InternalMyDsl.g:1573:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1574:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1574:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1575:5: lv_name_1_0= RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:1995:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1996:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1996:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1997:5: lv_name_1_0= RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParExpressionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getParExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:977:3: ( (lv_messages_3_0= ruleMessage ) )*
            loop27:
=======
            // InternalMyDsl.g:1595:3: ( (lv_messages_3_0= ruleMessage ) )*
            loop38:
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:2017:3: ( (lv_messages_3_0= ruleMessage ) )*
            loop47:
>>>>>>> [xText] Added new message type: contextMessage
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==29) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
<<<<<<< HEAD
<<<<<<< HEAD
            	    // InternalMyDsl.g:978:4: (lv_messages_3_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:978:4: (lv_messages_3_0= ruleMessage )
            	    // InternalMyDsl.g:979:5: lv_messages_3_0= ruleMessage
=======
            	    // InternalMyDsl.g:1596:4: (lv_messages_3_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:1596:4: (lv_messages_3_0= ruleMessage )
            	    // InternalMyDsl.g:1597:5: lv_messages_3_0= ruleMessage
>>>>>>> Added Xtext for context dependent behavior
=======
            	    // InternalMyDsl.g:2018:4: (lv_messages_3_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:2018:4: (lv_messages_3_0= ruleMessage )
            	    // InternalMyDsl.g:2019:5: lv_messages_3_0= ruleMessage
>>>>>>> [xText] Added new message type: contextMessage
            	    {

            	    					newCompositeNode(grammarAccess.getParExpressionAccess().getMessagesMessageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_messages_3_0=ruleMessage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParExpressionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"messages",
            	    						lv_messages_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Message");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParExpressionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParExpression"


    // $ANTLR start "entryRuleLoop"
    // InternalMyDsl.g:1004:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalMyDsl.g:1004:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalMyDsl.g:1005:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalMyDsl.g:1011:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_min_2_0=null;
        Token otherlv_3=null;
        Token lv_max_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_messages_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1017:2: ( (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' ) )
            // InternalMyDsl.g:1018:2: (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' )
            {
            // InternalMyDsl.g:1018:2: (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' )
            // InternalMyDsl.g:1019:3: otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1027:3: ( (lv_min_2_0= RULE_NUMBER ) )
            // InternalMyDsl.g:1028:4: (lv_min_2_0= RULE_NUMBER )
            {
            // InternalMyDsl.g:1028:4: (lv_min_2_0= RULE_NUMBER )
            // InternalMyDsl.g:1029:5: lv_min_2_0= RULE_NUMBER
            {
            lv_min_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_32); 

            					newLeafNode(lv_min_2_0, grammarAccess.getLoopAccess().getMinNumberTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_2_0,
            						"org.xtext.example.mydsl.MyDsl.Number");
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:1049:3: ( (lv_max_4_0= RULE_NUMBER ) )
            // InternalMyDsl.g:1050:4: (lv_max_4_0= RULE_NUMBER )
            {
            // InternalMyDsl.g:1050:4: (lv_max_4_0= RULE_NUMBER )
            // InternalMyDsl.g:1051:5: lv_max_4_0= RULE_NUMBER
            {
            lv_max_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_22); 

            					newLeafNode(lv_max_4_0, grammarAccess.getLoopAccess().getMaxNumberTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_4_0,
            						"org.xtext.example.mydsl.MyDsl.Number");
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:1075:3: ( (lv_messages_7_0= ruleMessage ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:1076:4: (lv_messages_7_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:1076:4: (lv_messages_7_0= ruleMessage )
            	    // InternalMyDsl.g:1077:5: lv_messages_7_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getLoopAccess().getMessagesMessageParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_messages_7_0=ruleMessage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"messages",
            	    						lv_messages_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.Message");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleLoop"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
<<<<<<< HEAD
<<<<<<< HEAD
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000880C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000080C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001410014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E0010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001E06010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001C06010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001806010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001006010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001004010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000003E4000030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000003C4000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000384000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000304000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000204000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
=======
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000301273C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000003012734000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000003012724000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000003010724000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000003010004000L});
=======
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000901273C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000009012734000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000009012724000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000009010724000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000009010004000L});
>>>>>>> [xText] Added new message type: contextMessage
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001010004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000006004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000416020124000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000001C0000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001C00806010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001800806010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000806010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000806010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000804010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000804000L});
<<<<<<< HEAD
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000F8000080030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000F0000080030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000E0000080030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000C0000080030L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000080030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000004000L});
>>>>>>> Added Xtext for context dependent behavior
=======
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000001C0800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000180800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00003E0000080030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00003C0000080030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000380000080030L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000300000080030L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000080030L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000004000L});
>>>>>>> [xText] Added new message type: contextMessage

}