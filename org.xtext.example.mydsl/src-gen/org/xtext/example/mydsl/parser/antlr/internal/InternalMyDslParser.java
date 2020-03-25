package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_REAL", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'{'", "'}'", "'import'", "'from'", "'contextmodel'", "'contextfragment'", "'attribute'", "'int'", "'float'", "'string'", "'boolean'", "'='", "';'", "'true'", "'false'", "'attributeconstraint'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'entity'", "'entityconstraint'", "'relation'", "'('", "','", "')'", "'relationconstraint'", "'scenario'", "'message'", "'required'", "'fail'", "'strict'", "'->'", "'past'", "'future'", "'constraint'", "'clockConstraint'", "'reset'", "'not'", "'and'", "'match'", "'appear'", "'.'", "'disappear'", "'changeTo'", "'relationChangeTo'", "'assertEntityAttribute'", "'['", "']'", "'assertRelationAttribute'", "'assertParameter'", "'in'", "'clock'", "'object'", "'alt'", "'else'", "'par'", "'case'", "'loop'", "'integer'", "'bool'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
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
    public static final int RULE_REAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER=7;
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
        	return "Domain";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomain"
    // InternalMyDsl.g:65:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalMyDsl.g:65:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalMyDsl.g:66:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalMyDsl.g:72:1: ruleDomain returns [EObject current=null] : ( ( (lv_specification_0_0= 'specification' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '{' )? ( (lv_includes_3_0= ruleInclude ) )* ( (lv_contextmodels_4_0= ruleContextModel ) )* ( (lv_contextfragments_5_0= ruleContextFragment ) )* ( (lv_objects_6_0= ruleObject ) )* ( (lv_parameters_7_0= ruleParameter ) )* ( (lv_clocks_8_0= ruleClock ) )* ( (lv_constraints_9_0= ruleConstraint ) )* ( (lv_scenarios_10_0= ruleScenario ) )* (otherlv_11= '}' )? ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token lv_specification_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_11=null;
        EObject lv_includes_3_0 = null;

        EObject lv_contextmodels_4_0 = null;

        EObject lv_contextfragments_5_0 = null;

        EObject lv_objects_6_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_clocks_8_0 = null;

        EObject lv_constraints_9_0 = null;

        EObject lv_scenarios_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( ( (lv_specification_0_0= 'specification' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '{' )? ( (lv_includes_3_0= ruleInclude ) )* ( (lv_contextmodels_4_0= ruleContextModel ) )* ( (lv_contextfragments_5_0= ruleContextFragment ) )* ( (lv_objects_6_0= ruleObject ) )* ( (lv_parameters_7_0= ruleParameter ) )* ( (lv_clocks_8_0= ruleClock ) )* ( (lv_constraints_9_0= ruleConstraint ) )* ( (lv_scenarios_10_0= ruleScenario ) )* (otherlv_11= '}' )? ) )
            // InternalMyDsl.g:79:2: ( ( (lv_specification_0_0= 'specification' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '{' )? ( (lv_includes_3_0= ruleInclude ) )* ( (lv_contextmodels_4_0= ruleContextModel ) )* ( (lv_contextfragments_5_0= ruleContextFragment ) )* ( (lv_objects_6_0= ruleObject ) )* ( (lv_parameters_7_0= ruleParameter ) )* ( (lv_clocks_8_0= ruleClock ) )* ( (lv_constraints_9_0= ruleConstraint ) )* ( (lv_scenarios_10_0= ruleScenario ) )* (otherlv_11= '}' )? )
            {
            // InternalMyDsl.g:79:2: ( ( (lv_specification_0_0= 'specification' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '{' )? ( (lv_includes_3_0= ruleInclude ) )* ( (lv_contextmodels_4_0= ruleContextModel ) )* ( (lv_contextfragments_5_0= ruleContextFragment ) )* ( (lv_objects_6_0= ruleObject ) )* ( (lv_parameters_7_0= ruleParameter ) )* ( (lv_clocks_8_0= ruleClock ) )* ( (lv_constraints_9_0= ruleConstraint ) )* ( (lv_scenarios_10_0= ruleScenario ) )* (otherlv_11= '}' )? )
            // InternalMyDsl.g:80:3: ( (lv_specification_0_0= 'specification' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '{' )? ( (lv_includes_3_0= ruleInclude ) )* ( (lv_contextmodels_4_0= ruleContextModel ) )* ( (lv_contextfragments_5_0= ruleContextFragment ) )* ( (lv_objects_6_0= ruleObject ) )* ( (lv_parameters_7_0= ruleParameter ) )* ( (lv_clocks_8_0= ruleClock ) )* ( (lv_constraints_9_0= ruleConstraint ) )* ( (lv_scenarios_10_0= ruleScenario ) )* (otherlv_11= '}' )?
            {
            // InternalMyDsl.g:80:3: ( (lv_specification_0_0= 'specification' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:81:4: (lv_specification_0_0= 'specification' )
                    {
                    // InternalMyDsl.g:81:4: (lv_specification_0_0= 'specification' )
                    // InternalMyDsl.g:82:5: lv_specification_0_0= 'specification'
                    {
                    lv_specification_0_0=(Token)match(input,13,FOLLOW_3); 

                    					newLeafNode(lv_specification_0_0, grammarAccess.getDomainAccess().getSpecificationSpecificationKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDomainRule());
                    					}
                    					setWithLastConsumed(current, "specification", lv_specification_0_0, "specification");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:94:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:95:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:95:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:96:5: lv_name_1_0= RULE_ID
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
                    break;

            }

            // InternalMyDsl.g:112:3: (otherlv_2= '{' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:113:4: otherlv_2= '{'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:118:3: ( (lv_includes_3_0= ruleInclude ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:119:4: (lv_includes_3_0= ruleInclude )
            	    {
            	    // InternalMyDsl.g:119:4: (lv_includes_3_0= ruleInclude )
            	    // InternalMyDsl.g:120:5: lv_includes_3_0= ruleInclude
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getIncludesIncludeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_includes_3_0=ruleInclude();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"includes",
            	    						lv_includes_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Include");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalMyDsl.g:137:3: ( (lv_contextmodels_4_0= ruleContextModel ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:138:4: (lv_contextmodels_4_0= ruleContextModel )
            	    {
            	    // InternalMyDsl.g:138:4: (lv_contextmodels_4_0= ruleContextModel )
            	    // InternalMyDsl.g:139:5: lv_contextmodels_4_0= ruleContextModel
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getContextmodelsContextModelParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_contextmodels_4_0=ruleContextModel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contextmodels",
            	    						lv_contextmodels_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.ContextModel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMyDsl.g:156:3: ( (lv_contextfragments_5_0= ruleContextFragment ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:157:4: (lv_contextfragments_5_0= ruleContextFragment )
            	    {
            	    // InternalMyDsl.g:157:4: (lv_contextfragments_5_0= ruleContextFragment )
            	    // InternalMyDsl.g:158:5: lv_contextfragments_5_0= ruleContextFragment
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getContextfragmentsContextFragmentParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_contextfragments_5_0=ruleContextFragment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contextfragments",
            	    						lv_contextfragments_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.ContextFragment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalMyDsl.g:175:3: ( (lv_objects_6_0= ruleObject ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==69) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:176:4: (lv_objects_6_0= ruleObject )
            	    {
            	    // InternalMyDsl.g:176:4: (lv_objects_6_0= ruleObject )
            	    // InternalMyDsl.g:177:5: lv_objects_6_0= ruleObject
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getObjectsObjectParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_objects_6_0=ruleObject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objects",
            	    						lv_objects_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.Object");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalMyDsl.g:194:3: ( (lv_parameters_7_0= ruleParameter ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=22 && LA8_0<=23)||(LA8_0>=75 && LA8_0<=76)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:195:4: (lv_parameters_7_0= ruleParameter )
            	    {
            	    // InternalMyDsl.g:195:4: (lv_parameters_7_0= ruleParameter )
            	    // InternalMyDsl.g:196:5: lv_parameters_7_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getParametersParameterParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_parameters_7_0=ruleParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.Parameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyDsl.g:213:3: ( (lv_clocks_8_0= ruleClock ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==68) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:214:4: (lv_clocks_8_0= ruleClock )
            	    {
            	    // InternalMyDsl.g:214:4: (lv_clocks_8_0= ruleClock )
            	    // InternalMyDsl.g:215:5: lv_clocks_8_0= ruleClock
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getClocksClockParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_clocks_8_0=ruleClock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clocks",
            	    						lv_clocks_8_0,
            	    						"org.xtext.example.mydsl.MyDsl.Clock");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMyDsl.g:232:3: ( (lv_constraints_9_0= ruleConstraint ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==51) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:233:4: (lv_constraints_9_0= ruleConstraint )
            	    {
            	    // InternalMyDsl.g:233:4: (lv_constraints_9_0= ruleConstraint )
            	    // InternalMyDsl.g:234:5: lv_constraints_9_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getConstraintsConstraintParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_constraints_9_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_9_0,
            	    						"org.xtext.example.mydsl.MyDsl.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalMyDsl.g:251:3: ( (lv_scenarios_10_0= ruleScenario ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==43) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:252:4: (lv_scenarios_10_0= ruleScenario )
            	    {
            	    // InternalMyDsl.g:252:4: (lv_scenarios_10_0= ruleScenario )
            	    // InternalMyDsl.g:253:5: lv_scenarios_10_0= ruleScenario
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getScenariosScenarioParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_scenarios_10_0=ruleScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_10_0,
            	    						"org.xtext.example.mydsl.MyDsl.Scenario");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalMyDsl.g:270:3: (otherlv_11= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:271:4: otherlv_11= '}'
                    {
                    otherlv_11=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_11());
                    			

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleInclude"
    // InternalMyDsl.g:280:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalMyDsl.g:280:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalMyDsl.g:281:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalMyDsl.g:287:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (lv_importURI_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_importURI_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:293:2: ( (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (lv_importURI_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:294:2: (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (lv_importURI_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:294:2: (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (lv_importURI_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:295:3: otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (lv_importURI_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getImportKeyword_0());
            		
            // InternalMyDsl.g:299:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:300:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:300:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:301:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getContextContextModelCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getFromKeyword_2());
            		
            // InternalMyDsl.g:316:3: ( (lv_importURI_3_0= RULE_STRING ) )
            // InternalMyDsl.g:317:4: (lv_importURI_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:317:4: (lv_importURI_3_0= RULE_STRING )
            // InternalMyDsl.g:318:5: lv_importURI_3_0= RULE_STRING
            {
            lv_importURI_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_3_0, grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleContextModel"
    // InternalMyDsl.g:338:1: entryRuleContextModel returns [EObject current=null] : iv_ruleContextModel= ruleContextModel EOF ;
    public final EObject entryRuleContextModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextModel = null;


        try {
            // InternalMyDsl.g:338:53: (iv_ruleContextModel= ruleContextModel EOF )
            // InternalMyDsl.g:339:2: iv_ruleContextModel= ruleContextModel EOF
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
    // InternalMyDsl.g:345:1: ruleContextModel returns [EObject current=null] : (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:351:2: ( (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:352:2: (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:352:2: (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' )
            // InternalMyDsl.g:353:3: otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getContextModelAccess().getContextmodelKeyword_0());
            		
            // InternalMyDsl.g:357:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:358:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:358:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:359:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getContextModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:379:3: ( (lv_entities_3_0= ruleEntity ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==36) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:380:4: (lv_entities_3_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:380:4: (lv_entities_3_0= ruleEntity )
            	    // InternalMyDsl.g:381:5: lv_entities_3_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getContextModelAccess().getEntitiesEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop13;
                }
            } while (true);

            // InternalMyDsl.g:398:3: ( (lv_relations_4_0= ruleRelation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:399:4: (lv_relations_4_0= ruleRelation )
            	    {
            	    // InternalMyDsl.g:399:4: (lv_relations_4_0= ruleRelation )
            	    // InternalMyDsl.g:400:5: lv_relations_4_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getContextModelAccess().getRelationsRelationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:425:1: entryRuleContextFragment returns [EObject current=null] : iv_ruleContextFragment= ruleContextFragment EOF ;
    public final EObject entryRuleContextFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextFragment = null;


        try {
            // InternalMyDsl.g:425:56: (iv_ruleContextFragment= ruleContextFragment EOF )
            // InternalMyDsl.g:426:2: iv_ruleContextFragment= ruleContextFragment EOF
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
    // InternalMyDsl.g:432:1: ruleContextFragment returns [EObject current=null] : (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleFEntity ) )* ( (lv_relations_4_0= ruleFRelation ) )* otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:438:2: ( (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleFEntity ) )* ( (lv_relations_4_0= ruleFRelation ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:439:2: (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleFEntity ) )* ( (lv_relations_4_0= ruleFRelation ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:439:2: (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleFEntity ) )* ( (lv_relations_4_0= ruleFRelation ) )* otherlv_5= '}' )
            // InternalMyDsl.g:440:3: otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleFEntity ) )* ( (lv_relations_4_0= ruleFRelation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getContextFragmentAccess().getContextfragmentKeyword_0());
            		
            // InternalMyDsl.g:444:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:445:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:445:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:446:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getContextFragmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:466:3: ( (lv_entities_3_0= ruleFEntity ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:467:4: (lv_entities_3_0= ruleFEntity )
            	    {
            	    // InternalMyDsl.g:467:4: (lv_entities_3_0= ruleFEntity )
            	    // InternalMyDsl.g:468:5: lv_entities_3_0= ruleFEntity
            	    {

            	    					newCompositeNode(grammarAccess.getContextFragmentAccess().getEntitiesFEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_entities_3_0=ruleFEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextFragmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.FEntity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalMyDsl.g:485:3: ( (lv_relations_4_0= ruleFRelation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==42) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:486:4: (lv_relations_4_0= ruleFRelation )
            	    {
            	    // InternalMyDsl.g:486:4: (lv_relations_4_0= ruleFRelation )
            	    // InternalMyDsl.g:487:5: lv_relations_4_0= ruleFRelation
            	    {

            	    					newCompositeNode(grammarAccess.getContextFragmentAccess().getRelationsFRelationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_relations_4_0=ruleFRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextFragmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.FRelation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:512:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:512:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:513:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalMyDsl.g:519:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) )? otherlv_8= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_int_1_0=null;
        Token lv_float_2_0=null;
        Token lv_string_3_0=null;
        Token lv_boolean_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:525:2: ( (otherlv_0= 'attribute' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) )? otherlv_8= ';' ) )
            // InternalMyDsl.g:526:2: (otherlv_0= 'attribute' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) )? otherlv_8= ';' )
            {
            // InternalMyDsl.g:526:2: (otherlv_0= 'attribute' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) )? otherlv_8= ';' )
            // InternalMyDsl.g:527:3: otherlv_0= 'attribute' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalMyDsl.g:531:3: ( (lv_int_1_0= 'int' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:532:4: (lv_int_1_0= 'int' )
                    {
                    // InternalMyDsl.g:532:4: (lv_int_1_0= 'int' )
                    // InternalMyDsl.g:533:5: lv_int_1_0= 'int'
                    {
                    lv_int_1_0=(Token)match(input,21,FOLLOW_22); 

                    					newLeafNode(lv_int_1_0, grammarAccess.getAttributeAccess().getIntIntKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "int", true, "int");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:545:3: ( (lv_float_2_0= 'float' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:546:4: (lv_float_2_0= 'float' )
                    {
                    // InternalMyDsl.g:546:4: (lv_float_2_0= 'float' )
                    // InternalMyDsl.g:547:5: lv_float_2_0= 'float'
                    {
                    lv_float_2_0=(Token)match(input,22,FOLLOW_23); 

                    					newLeafNode(lv_float_2_0, grammarAccess.getAttributeAccess().getFloatFloatKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "float", true, "float");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:559:3: ( (lv_string_3_0= 'string' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:560:4: (lv_string_3_0= 'string' )
                    {
                    // InternalMyDsl.g:560:4: (lv_string_3_0= 'string' )
                    // InternalMyDsl.g:561:5: lv_string_3_0= 'string'
                    {
                    lv_string_3_0=(Token)match(input,23,FOLLOW_24); 

                    					newLeafNode(lv_string_3_0, grammarAccess.getAttributeAccess().getStringStringKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "string", true, "string");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:573:3: ( (lv_boolean_4_0= 'boolean' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:574:4: (lv_boolean_4_0= 'boolean' )
                    {
                    // InternalMyDsl.g:574:4: (lv_boolean_4_0= 'boolean' )
                    // InternalMyDsl.g:575:5: lv_boolean_4_0= 'boolean'
                    {
                    lv_boolean_4_0=(Token)match(input,24,FOLLOW_13); 

                    					newLeafNode(lv_boolean_4_0, grammarAccess.getAttributeAccess().getBooleanBooleanKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "boolean", true, "boolean");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:587:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalMyDsl.g:588:4: (lv_name_5_0= RULE_ID )
            {
            // InternalMyDsl.g:588:4: (lv_name_5_0= RULE_ID )
            // InternalMyDsl.g:589:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_5_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:605:3: (otherlv_6= '=' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:606:4: otherlv_6= '='
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getEqualsSignKeyword_6());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:611:3: ( (lv_value_7_0= ruleAttributeValue ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_NUMBER)||(LA22_0>=27 && LA22_0<=28)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:612:4: (lv_value_7_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:612:4: (lv_value_7_0= ruleAttributeValue )
                    // InternalMyDsl.g:613:5: lv_value_7_0= ruleAttributeValue
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_value_7_0=ruleAttributeValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_7_0,
                    						"org.xtext.example.mydsl.MyDsl.AttributeValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getSemicolonKeyword_8());
            		

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


    // $ANTLR start "entryRuleAttributeValue"
    // InternalMyDsl.g:638:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalMyDsl.g:638:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalMyDsl.g:639:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalMyDsl.g:645:1: ruleAttributeValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_value_1_0= RULE_REAL ) ) | ( (lv_value_2_0= RULE_NUMBER ) ) | ( (lv_value_3_0= 'true' ) ) | ( (lv_value_4_0= 'false' ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:651:2: ( ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_value_1_0= RULE_REAL ) ) | ( (lv_value_2_0= RULE_NUMBER ) ) | ( (lv_value_3_0= 'true' ) ) | ( (lv_value_4_0= 'false' ) ) ) )
            // InternalMyDsl.g:652:2: ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_value_1_0= RULE_REAL ) ) | ( (lv_value_2_0= RULE_NUMBER ) ) | ( (lv_value_3_0= 'true' ) ) | ( (lv_value_4_0= 'false' ) ) )
            {
            // InternalMyDsl.g:652:2: ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_value_1_0= RULE_REAL ) ) | ( (lv_value_2_0= RULE_NUMBER ) ) | ( (lv_value_3_0= 'true' ) ) | ( (lv_value_4_0= 'false' ) ) )
            int alt23=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt23=1;
                }
                break;
            case RULE_REAL:
                {
                alt23=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt23=3;
                }
                break;
            case 27:
                {
                alt23=4;
                }
                break;
            case 28:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:653:3: ( (lv_value_0_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:653:3: ( (lv_value_0_0= RULE_STRING ) )
                    // InternalMyDsl.g:654:4: (lv_value_0_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:654:4: (lv_value_0_0= RULE_STRING )
                    // InternalMyDsl.g:655:5: lv_value_0_0= RULE_STRING
                    {
                    lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getAttributeValueAccess().getValueSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:672:3: ( (lv_value_1_0= RULE_REAL ) )
                    {
                    // InternalMyDsl.g:672:3: ( (lv_value_1_0= RULE_REAL ) )
                    // InternalMyDsl.g:673:4: (lv_value_1_0= RULE_REAL )
                    {
                    // InternalMyDsl.g:673:4: (lv_value_1_0= RULE_REAL )
                    // InternalMyDsl.g:674:5: lv_value_1_0= RULE_REAL
                    {
                    lv_value_1_0=(Token)match(input,RULE_REAL,FOLLOW_2); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getAttributeValueAccess().getValueRealTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"org.xtext.example.mydsl.MyDsl.Real");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:691:3: ( (lv_value_2_0= RULE_NUMBER ) )
                    {
                    // InternalMyDsl.g:691:3: ( (lv_value_2_0= RULE_NUMBER ) )
                    // InternalMyDsl.g:692:4: (lv_value_2_0= RULE_NUMBER )
                    {
                    // InternalMyDsl.g:692:4: (lv_value_2_0= RULE_NUMBER )
                    // InternalMyDsl.g:693:5: lv_value_2_0= RULE_NUMBER
                    {
                    lv_value_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_value_2_0, grammarAccess.getAttributeValueAccess().getValueNumberTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.MyDsl.Number");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:710:3: ( (lv_value_3_0= 'true' ) )
                    {
                    // InternalMyDsl.g:710:3: ( (lv_value_3_0= 'true' ) )
                    // InternalMyDsl.g:711:4: (lv_value_3_0= 'true' )
                    {
                    // InternalMyDsl.g:711:4: (lv_value_3_0= 'true' )
                    // InternalMyDsl.g:712:5: lv_value_3_0= 'true'
                    {
                    lv_value_3_0=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_value_3_0, grammarAccess.getAttributeValueAccess().getValueTrueKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_3_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:725:3: ( (lv_value_4_0= 'false' ) )
                    {
                    // InternalMyDsl.g:725:3: ( (lv_value_4_0= 'false' ) )
                    // InternalMyDsl.g:726:4: (lv_value_4_0= 'false' )
                    {
                    // InternalMyDsl.g:726:4: (lv_value_4_0= 'false' )
                    // InternalMyDsl.g:727:5: lv_value_4_0= 'false'
                    {
                    lv_value_4_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_value_4_0, grammarAccess.getAttributeValueAccess().getValueFalseKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_4_0, "false");
                    				

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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleFragmentAttribute"
    // InternalMyDsl.g:743:1: entryRuleFragmentAttribute returns [EObject current=null] : iv_ruleFragmentAttribute= ruleFragmentAttribute EOF ;
    public final EObject entryRuleFragmentAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragmentAttribute = null;


        try {
            // InternalMyDsl.g:743:58: (iv_ruleFragmentAttribute= ruleFragmentAttribute EOF )
            // InternalMyDsl.g:744:2: iv_ruleFragmentAttribute= ruleFragmentAttribute EOF
            {
             newCompositeNode(grammarAccess.getFragmentAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFragmentAttribute=ruleFragmentAttribute();

            state._fsp--;

             current =iv_ruleFragmentAttribute; 
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
    // $ANTLR end "entryRuleFragmentAttribute"


    // $ANTLR start "ruleFragmentAttribute"
    // InternalMyDsl.g:750:1: ruleFragmentAttribute returns [EObject current=null] : (otherlv_0= 'attributeconstraint' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_greater_6_0= '>' ) )? ( (lv_smaller_7_0= '<' ) )? ( (lv_greaterequals_8_0= '>=' ) )? ( (lv_smallerequals_9_0= '<=' ) )? ( (lv_equals_10_0= '==' ) )? ( (lv_notequals_11_0= '!=' ) )? ( (lv_value_12_0= ruleAttributeValue ) ) otherlv_13= ';' ) ;
    public final EObject ruleFragmentAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_int_1_0=null;
        Token lv_float_2_0=null;
        Token lv_string_3_0=null;
        Token lv_boolean_4_0=null;
        Token lv_name_5_0=null;
        Token lv_greater_6_0=null;
        Token lv_smaller_7_0=null;
        Token lv_greaterequals_8_0=null;
        Token lv_smallerequals_9_0=null;
        Token lv_equals_10_0=null;
        Token lv_notequals_11_0=null;
        Token otherlv_13=null;
        EObject lv_value_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:756:2: ( (otherlv_0= 'attributeconstraint' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_greater_6_0= '>' ) )? ( (lv_smaller_7_0= '<' ) )? ( (lv_greaterequals_8_0= '>=' ) )? ( (lv_smallerequals_9_0= '<=' ) )? ( (lv_equals_10_0= '==' ) )? ( (lv_notequals_11_0= '!=' ) )? ( (lv_value_12_0= ruleAttributeValue ) ) otherlv_13= ';' ) )
            // InternalMyDsl.g:757:2: (otherlv_0= 'attributeconstraint' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_greater_6_0= '>' ) )? ( (lv_smaller_7_0= '<' ) )? ( (lv_greaterequals_8_0= '>=' ) )? ( (lv_smallerequals_9_0= '<=' ) )? ( (lv_equals_10_0= '==' ) )? ( (lv_notequals_11_0= '!=' ) )? ( (lv_value_12_0= ruleAttributeValue ) ) otherlv_13= ';' )
            {
            // InternalMyDsl.g:757:2: (otherlv_0= 'attributeconstraint' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_greater_6_0= '>' ) )? ( (lv_smaller_7_0= '<' ) )? ( (lv_greaterequals_8_0= '>=' ) )? ( (lv_smallerequals_9_0= '<=' ) )? ( (lv_equals_10_0= '==' ) )? ( (lv_notequals_11_0= '!=' ) )? ( (lv_value_12_0= ruleAttributeValue ) ) otherlv_13= ';' )
            // InternalMyDsl.g:758:3: otherlv_0= 'attributeconstraint' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_greater_6_0= '>' ) )? ( (lv_smaller_7_0= '<' ) )? ( (lv_greaterequals_8_0= '>=' ) )? ( (lv_smallerequals_9_0= '<=' ) )? ( (lv_equals_10_0= '==' ) )? ( (lv_notequals_11_0= '!=' ) )? ( (lv_value_12_0= ruleAttributeValue ) ) otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getFragmentAttributeAccess().getAttributeconstraintKeyword_0());
            		
            // InternalMyDsl.g:762:3: ( (lv_int_1_0= 'int' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:763:4: (lv_int_1_0= 'int' )
                    {
                    // InternalMyDsl.g:763:4: (lv_int_1_0= 'int' )
                    // InternalMyDsl.g:764:5: lv_int_1_0= 'int'
                    {
                    lv_int_1_0=(Token)match(input,21,FOLLOW_22); 

                    					newLeafNode(lv_int_1_0, grammarAccess.getFragmentAttributeAccess().getIntIntKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "int", true, "int");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:776:3: ( (lv_float_2_0= 'float' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:777:4: (lv_float_2_0= 'float' )
                    {
                    // InternalMyDsl.g:777:4: (lv_float_2_0= 'float' )
                    // InternalMyDsl.g:778:5: lv_float_2_0= 'float'
                    {
                    lv_float_2_0=(Token)match(input,22,FOLLOW_23); 

                    					newLeafNode(lv_float_2_0, grammarAccess.getFragmentAttributeAccess().getFloatFloatKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "float", true, "float");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:790:3: ( (lv_string_3_0= 'string' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:791:4: (lv_string_3_0= 'string' )
                    {
                    // InternalMyDsl.g:791:4: (lv_string_3_0= 'string' )
                    // InternalMyDsl.g:792:5: lv_string_3_0= 'string'
                    {
                    lv_string_3_0=(Token)match(input,23,FOLLOW_24); 

                    					newLeafNode(lv_string_3_0, grammarAccess.getFragmentAttributeAccess().getStringStringKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "string", true, "string");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:804:3: ( (lv_boolean_4_0= 'boolean' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:805:4: (lv_boolean_4_0= 'boolean' )
                    {
                    // InternalMyDsl.g:805:4: (lv_boolean_4_0= 'boolean' )
                    // InternalMyDsl.g:806:5: lv_boolean_4_0= 'boolean'
                    {
                    lv_boolean_4_0=(Token)match(input,24,FOLLOW_13); 

                    					newLeafNode(lv_boolean_4_0, grammarAccess.getFragmentAttributeAccess().getBooleanBooleanKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "boolean", true, "boolean");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:818:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalMyDsl.g:819:4: (lv_name_5_0= RULE_ID )
            {
            // InternalMyDsl.g:819:4: (lv_name_5_0= RULE_ID )
            // InternalMyDsl.g:820:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_5_0, grammarAccess.getFragmentAttributeAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFragmentAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:836:3: ( (lv_greater_6_0= '>' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:837:4: (lv_greater_6_0= '>' )
                    {
                    // InternalMyDsl.g:837:4: (lv_greater_6_0= '>' )
                    // InternalMyDsl.g:838:5: lv_greater_6_0= '>'
                    {
                    lv_greater_6_0=(Token)match(input,30,FOLLOW_29); 

                    					newLeafNode(lv_greater_6_0, grammarAccess.getFragmentAttributeAccess().getGreaterGreaterThanSignKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "greater", true, ">");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:850:3: ( (lv_smaller_7_0= '<' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:851:4: (lv_smaller_7_0= '<' )
                    {
                    // InternalMyDsl.g:851:4: (lv_smaller_7_0= '<' )
                    // InternalMyDsl.g:852:5: lv_smaller_7_0= '<'
                    {
                    lv_smaller_7_0=(Token)match(input,31,FOLLOW_30); 

                    					newLeafNode(lv_smaller_7_0, grammarAccess.getFragmentAttributeAccess().getSmallerLessThanSignKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "smaller", true, "<");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:864:3: ( (lv_greaterequals_8_0= '>=' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:865:4: (lv_greaterequals_8_0= '>=' )
                    {
                    // InternalMyDsl.g:865:4: (lv_greaterequals_8_0= '>=' )
                    // InternalMyDsl.g:866:5: lv_greaterequals_8_0= '>='
                    {
                    lv_greaterequals_8_0=(Token)match(input,32,FOLLOW_31); 

                    					newLeafNode(lv_greaterequals_8_0, grammarAccess.getFragmentAttributeAccess().getGreaterequalsGreaterThanSignEqualsSignKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "greaterequals", true, ">=");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:878:3: ( (lv_smallerequals_9_0= '<=' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:879:4: (lv_smallerequals_9_0= '<=' )
                    {
                    // InternalMyDsl.g:879:4: (lv_smallerequals_9_0= '<=' )
                    // InternalMyDsl.g:880:5: lv_smallerequals_9_0= '<='
                    {
                    lv_smallerequals_9_0=(Token)match(input,33,FOLLOW_32); 

                    					newLeafNode(lv_smallerequals_9_0, grammarAccess.getFragmentAttributeAccess().getSmallerequalsLessThanSignEqualsSignKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "smallerequals", true, "<=");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:892:3: ( (lv_equals_10_0= '==' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:893:4: (lv_equals_10_0= '==' )
                    {
                    // InternalMyDsl.g:893:4: (lv_equals_10_0= '==' )
                    // InternalMyDsl.g:894:5: lv_equals_10_0= '=='
                    {
                    lv_equals_10_0=(Token)match(input,34,FOLLOW_33); 

                    					newLeafNode(lv_equals_10_0, grammarAccess.getFragmentAttributeAccess().getEqualsEqualsSignEqualsSignKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "equals", true, "==");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:906:3: ( (lv_notequals_11_0= '!=' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:907:4: (lv_notequals_11_0= '!=' )
                    {
                    // InternalMyDsl.g:907:4: (lv_notequals_11_0= '!=' )
                    // InternalMyDsl.g:908:5: lv_notequals_11_0= '!='
                    {
                    lv_notequals_11_0=(Token)match(input,35,FOLLOW_34); 

                    					newLeafNode(lv_notequals_11_0, grammarAccess.getFragmentAttributeAccess().getNotequalsExclamationMarkEqualsSignKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "notequals", true, "!=");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:920:3: ( (lv_value_12_0= ruleAttributeValue ) )
            // InternalMyDsl.g:921:4: (lv_value_12_0= ruleAttributeValue )
            {
            // InternalMyDsl.g:921:4: (lv_value_12_0= ruleAttributeValue )
            // InternalMyDsl.g:922:5: lv_value_12_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getFragmentAttributeAccess().getValueAttributeValueParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_27);
            lv_value_12_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFragmentAttributeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_12_0,
            						"org.xtext.example.mydsl.MyDsl.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getFragmentAttributeAccess().getSemicolonKeyword_13());
            		

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
    // $ANTLR end "ruleFragmentAttribute"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:947:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:947:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:948:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalMyDsl.g:954:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:960:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:961:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:961:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalMyDsl.g:962:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:966:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:967:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:967:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:968:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:988:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==20) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:989:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:989:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalMyDsl.g:990:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    break loop34;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFEntity"
    // InternalMyDsl.g:1015:1: entryRuleFEntity returns [EObject current=null] : iv_ruleFEntity= ruleFEntity EOF ;
    public final EObject entryRuleFEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFEntity = null;


        try {
            // InternalMyDsl.g:1015:48: (iv_ruleFEntity= ruleFEntity EOF )
            // InternalMyDsl.g:1016:2: iv_ruleFEntity= ruleFEntity EOF
            {
             newCompositeNode(grammarAccess.getFEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFEntity=ruleFEntity();

            state._fsp--;

             current =iv_ruleFEntity; 
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
    // $ANTLR end "entryRuleFEntity"


    // $ANTLR start "ruleFEntity"
    // InternalMyDsl.g:1022:1: ruleFEntity returns [EObject current=null] : (otherlv_0= 'entityconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleFragmentAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleFEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1028:2: ( (otherlv_0= 'entityconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleFragmentAttribute ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:1029:2: (otherlv_0= 'entityconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleFragmentAttribute ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:1029:2: (otherlv_0= 'entityconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleFragmentAttribute ) )* otherlv_4= '}' )
            // InternalMyDsl.g:1030:3: otherlv_0= 'entityconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleFragmentAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFEntityAccess().getEntityconstraintKeyword_0());
            		
            // InternalMyDsl.g:1034:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1035:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1035:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1036:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getFEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1056:3: ( (lv_attributes_3_0= ruleFragmentAttribute ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==29) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:1057:4: (lv_attributes_3_0= ruleFragmentAttribute )
            	    {
            	    // InternalMyDsl.g:1057:4: (lv_attributes_3_0= ruleFragmentAttribute )
            	    // InternalMyDsl.g:1058:5: lv_attributes_3_0= ruleFragmentAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getFEntityAccess().getAttributesFragmentAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_attributes_3_0=ruleFragmentAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.FragmentAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFEntityAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleFEntity"


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:1083:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:1083:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:1084:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalMyDsl.g:1090:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:1096:2: ( (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:1097:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:1097:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            // InternalMyDsl.g:1098:3: otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalMyDsl.g:1102:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1103:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1103:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1104:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); 

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

            otherlv_2=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1124:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1125:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1125:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1126:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getSenderEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:1141:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1142:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1142:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1143:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getReceiverEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_35); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:1162:3: ( (lv_attributes_8_0= ruleAttribute ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==20) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:1163:4: (lv_attributes_8_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:1163:4: (lv_attributes_8_0= ruleAttribute )
            	    // InternalMyDsl.g:1164:5: lv_attributes_8_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    break loop36;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFRelation"
    // InternalMyDsl.g:1189:1: entryRuleFRelation returns [EObject current=null] : iv_ruleFRelation= ruleFRelation EOF ;
    public final EObject entryRuleFRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFRelation = null;


        try {
            // InternalMyDsl.g:1189:50: (iv_ruleFRelation= ruleFRelation EOF )
            // InternalMyDsl.g:1190:2: iv_ruleFRelation= ruleFRelation EOF
            {
             newCompositeNode(grammarAccess.getFRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFRelation=ruleFRelation();

            state._fsp--;

             current =iv_ruleFRelation; 
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
    // $ANTLR end "entryRuleFRelation"


    // $ANTLR start "ruleFRelation"
    // InternalMyDsl.g:1196:1: ruleFRelation returns [EObject current=null] : (otherlv_0= 'relationconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleFragmentAttribute ) )* otherlv_9= '}' ) ;
    public final EObject ruleFRelation() throws RecognitionException {
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
            // InternalMyDsl.g:1202:2: ( (otherlv_0= 'relationconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleFragmentAttribute ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:1203:2: (otherlv_0= 'relationconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleFragmentAttribute ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:1203:2: (otherlv_0= 'relationconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleFragmentAttribute ) )* otherlv_9= '}' )
            // InternalMyDsl.g:1204:3: otherlv_0= 'relationconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleFragmentAttribute ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFRelationAccess().getRelationconstraintKeyword_0());
            		
            // InternalMyDsl.g:1208:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1209:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1209:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1210:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFRelationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFRelationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1230:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1231:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1231:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1232:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFRelationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_3, grammarAccess.getFRelationAccess().getSenderFEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getFRelationAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:1247:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1248:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1248:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1249:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFRelationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_5, grammarAccess.getFRelationAccess().getReceiverFEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getFRelationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_7, grammarAccess.getFRelationAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:1268:3: ( (lv_attributes_8_0= ruleFragmentAttribute ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==29) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:1269:4: (lv_attributes_8_0= ruleFragmentAttribute )
            	    {
            	    // InternalMyDsl.g:1269:4: (lv_attributes_8_0= ruleFragmentAttribute )
            	    // InternalMyDsl.g:1270:5: lv_attributes_8_0= ruleFragmentAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getFRelationAccess().getAttributesFragmentAttributeParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_attributes_8_0=ruleFragmentAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFRelationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_8_0,
            	    						"org.xtext.example.mydsl.MyDsl.FragmentAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFRelationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleFRelation"


    // $ANTLR start "entryRuleScenario"
    // InternalMyDsl.g:1295:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalMyDsl.g:1295:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalMyDsl.g:1296:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalMyDsl.g:1302:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_scenariocontents_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1308:2: ( (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:1309:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:1309:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' )
            // InternalMyDsl.g:1310:3: otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalMyDsl.g:1314:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1315:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1315:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1316:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1336:3: ( (lv_scenariocontents_3_0= ruleScenarioContent ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==44||(LA38_0>=56 && LA38_0<=57)||(LA38_0>=59 && LA38_0<=62)||(LA38_0>=65 && LA38_0<=66)||LA38_0==70||LA38_0==72||LA38_0==74) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:1337:4: (lv_scenariocontents_3_0= ruleScenarioContent )
            	    {
            	    // InternalMyDsl.g:1337:4: (lv_scenariocontents_3_0= ruleScenarioContent )
            	    // InternalMyDsl.g:1338:5: lv_scenariocontents_3_0= ruleScenarioContent
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getScenariocontentsScenarioContentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_40);
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
            	    break loop38;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:1363:1: entryRuleScenarioContent returns [EObject current=null] : iv_ruleScenarioContent= ruleScenarioContent EOF ;
    public final EObject entryRuleScenarioContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioContent = null;


        try {
            // InternalMyDsl.g:1363:56: (iv_ruleScenarioContent= ruleScenarioContent EOF )
            // InternalMyDsl.g:1364:2: iv_ruleScenarioContent= ruleScenarioContent EOF
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
    // InternalMyDsl.g:1370:1: ruleScenarioContent returns [EObject current=null] : ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) | ( (lv_paramConstraint_5_0= ruleParameterConstraint ) ) | ( (lv_assertentity_6_0= ruleAssertionEntity ) ) | ( (lv_assertrelation_7_0= ruleAssertionRelation ) ) ) ;
    public final EObject ruleScenarioContent() throws RecognitionException {
        EObject current = null;

        EObject lv_alt_0_0 = null;

        EObject lv_message_1_0 = null;

        EObject lv_par_2_0 = null;

        EObject lv_loop_3_0 = null;

        EObject lv_contextmessage_4_0 = null;

        EObject lv_paramConstraint_5_0 = null;

        EObject lv_assertentity_6_0 = null;

        EObject lv_assertrelation_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1376:2: ( ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) | ( (lv_paramConstraint_5_0= ruleParameterConstraint ) ) | ( (lv_assertentity_6_0= ruleAssertionEntity ) ) | ( (lv_assertrelation_7_0= ruleAssertionRelation ) ) ) )
            // InternalMyDsl.g:1377:2: ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) | ( (lv_paramConstraint_5_0= ruleParameterConstraint ) ) | ( (lv_assertentity_6_0= ruleAssertionEntity ) ) | ( (lv_assertrelation_7_0= ruleAssertionRelation ) ) )
            {
            // InternalMyDsl.g:1377:2: ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) | ( (lv_paramConstraint_5_0= ruleParameterConstraint ) ) | ( (lv_assertentity_6_0= ruleAssertionEntity ) ) | ( (lv_assertrelation_7_0= ruleAssertionRelation ) ) )
            int alt39=8;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt39=1;
                }
                break;
            case 44:
                {
                alt39=2;
                }
                break;
            case 72:
                {
                alt39=3;
                }
                break;
            case 74:
                {
                alt39=4;
                }
                break;
            case 56:
            case 57:
            case 59:
            case 60:
            case 61:
                {
                alt39=5;
                }
                break;
            case 66:
                {
                alt39=6;
                }
                break;
            case 62:
                {
                alt39=7;
                }
                break;
            case 65:
                {
                alt39=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1378:3: ( (lv_alt_0_0= ruleAlt ) )
                    {
                    // InternalMyDsl.g:1378:3: ( (lv_alt_0_0= ruleAlt ) )
                    // InternalMyDsl.g:1379:4: (lv_alt_0_0= ruleAlt )
                    {
                    // InternalMyDsl.g:1379:4: (lv_alt_0_0= ruleAlt )
                    // InternalMyDsl.g:1380:5: lv_alt_0_0= ruleAlt
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
                    // InternalMyDsl.g:1398:3: ( (lv_message_1_0= ruleMessage ) )
                    {
                    // InternalMyDsl.g:1398:3: ( (lv_message_1_0= ruleMessage ) )
                    // InternalMyDsl.g:1399:4: (lv_message_1_0= ruleMessage )
                    {
                    // InternalMyDsl.g:1399:4: (lv_message_1_0= ruleMessage )
                    // InternalMyDsl.g:1400:5: lv_message_1_0= ruleMessage
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
                    // InternalMyDsl.g:1418:3: ( (lv_par_2_0= rulePar ) )
                    {
                    // InternalMyDsl.g:1418:3: ( (lv_par_2_0= rulePar ) )
                    // InternalMyDsl.g:1419:4: (lv_par_2_0= rulePar )
                    {
                    // InternalMyDsl.g:1419:4: (lv_par_2_0= rulePar )
                    // InternalMyDsl.g:1420:5: lv_par_2_0= rulePar
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
                    // InternalMyDsl.g:1438:3: ( (lv_loop_3_0= ruleLoop ) )
                    {
                    // InternalMyDsl.g:1438:3: ( (lv_loop_3_0= ruleLoop ) )
                    // InternalMyDsl.g:1439:4: (lv_loop_3_0= ruleLoop )
                    {
                    // InternalMyDsl.g:1439:4: (lv_loop_3_0= ruleLoop )
                    // InternalMyDsl.g:1440:5: lv_loop_3_0= ruleLoop
                    {

                    					newCompositeNode(grammarAccess.getScenarioContentAccess().getLoopLoopParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_loop_3_0=ruleLoop();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioContentRule());
                    					}
                    					add(
                    						current,
                    						"loop",
                    						lv_loop_3_0,
                    						"org.xtext.example.mydsl.MyDsl.Loop");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1458:3: ( (lv_contextmessage_4_0= ruleContextMessage ) )
                    {
                    // InternalMyDsl.g:1458:3: ( (lv_contextmessage_4_0= ruleContextMessage ) )
                    // InternalMyDsl.g:1459:4: (lv_contextmessage_4_0= ruleContextMessage )
                    {
                    // InternalMyDsl.g:1459:4: (lv_contextmessage_4_0= ruleContextMessage )
                    // InternalMyDsl.g:1460:5: lv_contextmessage_4_0= ruleContextMessage
                    {

                    					newCompositeNode(grammarAccess.getScenarioContentAccess().getContextmessageContextMessageParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_contextmessage_4_0=ruleContextMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioContentRule());
                    					}
                    					add(
                    						current,
                    						"contextmessage",
                    						lv_contextmessage_4_0,
                    						"org.xtext.example.mydsl.MyDsl.ContextMessage");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1478:3: ( (lv_paramConstraint_5_0= ruleParameterConstraint ) )
                    {
                    // InternalMyDsl.g:1478:3: ( (lv_paramConstraint_5_0= ruleParameterConstraint ) )
                    // InternalMyDsl.g:1479:4: (lv_paramConstraint_5_0= ruleParameterConstraint )
                    {
                    // InternalMyDsl.g:1479:4: (lv_paramConstraint_5_0= ruleParameterConstraint )
                    // InternalMyDsl.g:1480:5: lv_paramConstraint_5_0= ruleParameterConstraint
                    {

                    					newCompositeNode(grammarAccess.getScenarioContentAccess().getParamConstraintParameterConstraintParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_paramConstraint_5_0=ruleParameterConstraint();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioContentRule());
                    					}
                    					add(
                    						current,
                    						"paramConstraint",
                    						lv_paramConstraint_5_0,
                    						"org.xtext.example.mydsl.MyDsl.ParameterConstraint");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1498:3: ( (lv_assertentity_6_0= ruleAssertionEntity ) )
                    {
                    // InternalMyDsl.g:1498:3: ( (lv_assertentity_6_0= ruleAssertionEntity ) )
                    // InternalMyDsl.g:1499:4: (lv_assertentity_6_0= ruleAssertionEntity )
                    {
                    // InternalMyDsl.g:1499:4: (lv_assertentity_6_0= ruleAssertionEntity )
                    // InternalMyDsl.g:1500:5: lv_assertentity_6_0= ruleAssertionEntity
                    {

                    					newCompositeNode(grammarAccess.getScenarioContentAccess().getAssertentityAssertionEntityParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_assertentity_6_0=ruleAssertionEntity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioContentRule());
                    					}
                    					add(
                    						current,
                    						"assertentity",
                    						lv_assertentity_6_0,
                    						"org.xtext.example.mydsl.MyDsl.AssertionEntity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1518:3: ( (lv_assertrelation_7_0= ruleAssertionRelation ) )
                    {
                    // InternalMyDsl.g:1518:3: ( (lv_assertrelation_7_0= ruleAssertionRelation ) )
                    // InternalMyDsl.g:1519:4: (lv_assertrelation_7_0= ruleAssertionRelation )
                    {
                    // InternalMyDsl.g:1519:4: (lv_assertrelation_7_0= ruleAssertionRelation )
                    // InternalMyDsl.g:1520:5: lv_assertrelation_7_0= ruleAssertionRelation
                    {

                    					newCompositeNode(grammarAccess.getScenarioContentAccess().getAssertrelationAssertionRelationParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_assertrelation_7_0=ruleAssertionRelation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioContentRule());
                    					}
                    					add(
                    						current,
                    						"assertrelation",
                    						lv_assertrelation_7_0,
                    						"org.xtext.example.mydsl.MyDsl.AssertionRelation");
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
    // InternalMyDsl.g:1541:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalMyDsl.g:1541:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMyDsl.g:1542:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalMyDsl.g:1548:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParams ) ) | ( (lv_constantparams_4_0= ruleConstantParams ) ) ) otherlv_5= ')' ( (lv_required_6_0= 'required' ) )? ( (lv_fail_7_0= 'fail' ) )? ( (lv_strict_8_0= 'strict' ) )? ( (otherlv_9= RULE_ID ) ) otherlv_10= '->' ( (otherlv_11= RULE_ID ) ) ( (lv_past_12_0= 'past' ) )? ( (lv_future_13_0= 'future' ) )? ( (lv_constraint_14_0= 'constraint' ) )? (otherlv_15= '{' )? ( (otherlv_16= RULE_ID ) )? (otherlv_17= ',' )? ( (lv_constraintexp_18_0= ruleClockConstraintExpression ) )? (otherlv_19= ',' )? ( (lv_resetinconstraint_20_0= ruleResetClock ) )? (otherlv_21= '}' )? ( (lv_clockconstraint_22_0= 'clockConstraint' ) )? (otherlv_23= '{' )? ( (lv_cConstraint_24_0= ruleClockConstraintExpression ) )? (otherlv_25= '}' )? ( (lv_resetclock_26_0= ruleResetClock ) )? otherlv_27= ';' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token lv_required_6_0=null;
        Token lv_fail_7_0=null;
        Token lv_strict_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_past_12_0=null;
        Token lv_future_13_0=null;
        Token lv_constraint_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token lv_clockconstraint_22_0=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        EObject lv_params_3_0 = null;

        EObject lv_constantparams_4_0 = null;

        EObject lv_constraintexp_18_0 = null;

        EObject lv_resetinconstraint_20_0 = null;

        EObject lv_cConstraint_24_0 = null;

        EObject lv_resetclock_26_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1554:2: ( (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParams ) ) | ( (lv_constantparams_4_0= ruleConstantParams ) ) ) otherlv_5= ')' ( (lv_required_6_0= 'required' ) )? ( (lv_fail_7_0= 'fail' ) )? ( (lv_strict_8_0= 'strict' ) )? ( (otherlv_9= RULE_ID ) ) otherlv_10= '->' ( (otherlv_11= RULE_ID ) ) ( (lv_past_12_0= 'past' ) )? ( (lv_future_13_0= 'future' ) )? ( (lv_constraint_14_0= 'constraint' ) )? (otherlv_15= '{' )? ( (otherlv_16= RULE_ID ) )? (otherlv_17= ',' )? ( (lv_constraintexp_18_0= ruleClockConstraintExpression ) )? (otherlv_19= ',' )? ( (lv_resetinconstraint_20_0= ruleResetClock ) )? (otherlv_21= '}' )? ( (lv_clockconstraint_22_0= 'clockConstraint' ) )? (otherlv_23= '{' )? ( (lv_cConstraint_24_0= ruleClockConstraintExpression ) )? (otherlv_25= '}' )? ( (lv_resetclock_26_0= ruleResetClock ) )? otherlv_27= ';' ) )
            // InternalMyDsl.g:1555:2: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParams ) ) | ( (lv_constantparams_4_0= ruleConstantParams ) ) ) otherlv_5= ')' ( (lv_required_6_0= 'required' ) )? ( (lv_fail_7_0= 'fail' ) )? ( (lv_strict_8_0= 'strict' ) )? ( (otherlv_9= RULE_ID ) ) otherlv_10= '->' ( (otherlv_11= RULE_ID ) ) ( (lv_past_12_0= 'past' ) )? ( (lv_future_13_0= 'future' ) )? ( (lv_constraint_14_0= 'constraint' ) )? (otherlv_15= '{' )? ( (otherlv_16= RULE_ID ) )? (otherlv_17= ',' )? ( (lv_constraintexp_18_0= ruleClockConstraintExpression ) )? (otherlv_19= ',' )? ( (lv_resetinconstraint_20_0= ruleResetClock ) )? (otherlv_21= '}' )? ( (lv_clockconstraint_22_0= 'clockConstraint' ) )? (otherlv_23= '{' )? ( (lv_cConstraint_24_0= ruleClockConstraintExpression ) )? (otherlv_25= '}' )? ( (lv_resetclock_26_0= ruleResetClock ) )? otherlv_27= ';' )
            {
            // InternalMyDsl.g:1555:2: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParams ) ) | ( (lv_constantparams_4_0= ruleConstantParams ) ) ) otherlv_5= ')' ( (lv_required_6_0= 'required' ) )? ( (lv_fail_7_0= 'fail' ) )? ( (lv_strict_8_0= 'strict' ) )? ( (otherlv_9= RULE_ID ) ) otherlv_10= '->' ( (otherlv_11= RULE_ID ) ) ( (lv_past_12_0= 'past' ) )? ( (lv_future_13_0= 'future' ) )? ( (lv_constraint_14_0= 'constraint' ) )? (otherlv_15= '{' )? ( (otherlv_16= RULE_ID ) )? (otherlv_17= ',' )? ( (lv_constraintexp_18_0= ruleClockConstraintExpression ) )? (otherlv_19= ',' )? ( (lv_resetinconstraint_20_0= ruleResetClock ) )? (otherlv_21= '}' )? ( (lv_clockconstraint_22_0= 'clockConstraint' ) )? (otherlv_23= '{' )? ( (lv_cConstraint_24_0= ruleClockConstraintExpression ) )? (otherlv_25= '}' )? ( (lv_resetclock_26_0= ruleResetClock ) )? otherlv_27= ';' )
            // InternalMyDsl.g:1556:3: otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParams ) ) | ( (lv_constantparams_4_0= ruleConstantParams ) ) ) otherlv_5= ')' ( (lv_required_6_0= 'required' ) )? ( (lv_fail_7_0= 'fail' ) )? ( (lv_strict_8_0= 'strict' ) )? ( (otherlv_9= RULE_ID ) ) otherlv_10= '->' ( (otherlv_11= RULE_ID ) ) ( (lv_past_12_0= 'past' ) )? ( (lv_future_13_0= 'future' ) )? ( (lv_constraint_14_0= 'constraint' ) )? (otherlv_15= '{' )? ( (otherlv_16= RULE_ID ) )? (otherlv_17= ',' )? ( (lv_constraintexp_18_0= ruleClockConstraintExpression ) )? (otherlv_19= ',' )? ( (lv_resetinconstraint_20_0= ruleResetClock ) )? (otherlv_21= '}' )? ( (lv_clockconstraint_22_0= 'clockConstraint' ) )? (otherlv_23= '{' )? ( (lv_cConstraint_24_0= ruleClockConstraintExpression ) )? (otherlv_25= '}' )? ( (lv_resetclock_26_0= ruleResetClock ) )? otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
            		
            // InternalMyDsl.g:1560:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1561:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1561:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1562:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1582:3: ( ( (lv_params_3_0= ruleParams ) ) | ( (lv_constantparams_4_0= ruleConstantParams ) ) )
            int alt40=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt40=1;
                }
                break;
            case 40:
                {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==RULE_ID) ) {
                    alt40=1;
                }
                else if ( ((LA40_2>=RULE_STRING && LA40_2<=RULE_NUMBER)||(LA40_2>=27 && LA40_2<=28)) ) {
                    alt40=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt40=1;
                }
                break;
            case RULE_STRING:
            case RULE_REAL:
            case RULE_NUMBER:
            case 27:
            case 28:
                {
                alt40=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:1583:4: ( (lv_params_3_0= ruleParams ) )
                    {
                    // InternalMyDsl.g:1583:4: ( (lv_params_3_0= ruleParams ) )
                    // InternalMyDsl.g:1584:5: (lv_params_3_0= ruleParams )
                    {
                    // InternalMyDsl.g:1584:5: (lv_params_3_0= ruleParams )
                    // InternalMyDsl.g:1585:6: lv_params_3_0= ruleParams
                    {

                    						newCompositeNode(grammarAccess.getMessageAccess().getParamsParamsParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_params_3_0=ruleParams();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_3_0,
                    							"org.xtext.example.mydsl.MyDsl.Params");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1603:4: ( (lv_constantparams_4_0= ruleConstantParams ) )
                    {
                    // InternalMyDsl.g:1603:4: ( (lv_constantparams_4_0= ruleConstantParams ) )
                    // InternalMyDsl.g:1604:5: (lv_constantparams_4_0= ruleConstantParams )
                    {
                    // InternalMyDsl.g:1604:5: (lv_constantparams_4_0= ruleConstantParams )
                    // InternalMyDsl.g:1605:6: lv_constantparams_4_0= ruleConstantParams
                    {

                    						newCompositeNode(grammarAccess.getMessageAccess().getConstantparamsConstantParamsParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_constantparams_4_0=ruleConstantParams();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageRule());
                    						}
                    						add(
                    							current,
                    							"constantparams",
                    							lv_constantparams_4_0,
                    							"org.xtext.example.mydsl.MyDsl.ConstantParams");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,41,FOLLOW_42); 

            			newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getRightParenthesisKeyword_4());
            		
            // InternalMyDsl.g:1627:3: ( (lv_required_6_0= 'required' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1628:4: (lv_required_6_0= 'required' )
                    {
                    // InternalMyDsl.g:1628:4: (lv_required_6_0= 'required' )
                    // InternalMyDsl.g:1629:5: lv_required_6_0= 'required'
                    {
                    lv_required_6_0=(Token)match(input,45,FOLLOW_43); 

                    					newLeafNode(lv_required_6_0, grammarAccess.getMessageAccess().getRequiredRequiredKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1641:3: ( (lv_fail_7_0= 'fail' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:1642:4: (lv_fail_7_0= 'fail' )
                    {
                    // InternalMyDsl.g:1642:4: (lv_fail_7_0= 'fail' )
                    // InternalMyDsl.g:1643:5: lv_fail_7_0= 'fail'
                    {
                    lv_fail_7_0=(Token)match(input,46,FOLLOW_44); 

                    					newLeafNode(lv_fail_7_0, grammarAccess.getMessageAccess().getFailFailKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "fail", true, "fail");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1655:3: ( (lv_strict_8_0= 'strict' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:1656:4: (lv_strict_8_0= 'strict' )
                    {
                    // InternalMyDsl.g:1656:4: (lv_strict_8_0= 'strict' )
                    // InternalMyDsl.g:1657:5: lv_strict_8_0= 'strict'
                    {
                    lv_strict_8_0=(Token)match(input,47,FOLLOW_13); 

                    					newLeafNode(lv_strict_8_0, grammarAccess.getMessageAccess().getStrictStrictKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "strict", true, "strict");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1669:3: ( (otherlv_9= RULE_ID ) )
            // InternalMyDsl.g:1670:4: (otherlv_9= RULE_ID )
            {
            // InternalMyDsl.g:1670:4: (otherlv_9= RULE_ID )
            // InternalMyDsl.g:1671:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(otherlv_9, grammarAccess.getMessageAccess().getSenderObjectCrossReference_8_0());
            				

            }


            }

            otherlv_10=(Token)match(input,48,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getMessageAccess().getHyphenMinusGreaterThanSignKeyword_9());
            		
            // InternalMyDsl.g:1686:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:1687:4: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:1687:4: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:1688:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getReceiverObjectCrossReference_10_0());
            				

            }


            }

            // InternalMyDsl.g:1699:3: ( (lv_past_12_0= 'past' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:1700:4: (lv_past_12_0= 'past' )
                    {
                    // InternalMyDsl.g:1700:4: (lv_past_12_0= 'past' )
                    // InternalMyDsl.g:1701:5: lv_past_12_0= 'past'
                    {
                    lv_past_12_0=(Token)match(input,49,FOLLOW_47); 

                    					newLeafNode(lv_past_12_0, grammarAccess.getMessageAccess().getPastPastKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "past", true, "past");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1713:3: ( (lv_future_13_0= 'future' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==50) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:1714:4: (lv_future_13_0= 'future' )
                    {
                    // InternalMyDsl.g:1714:4: (lv_future_13_0= 'future' )
                    // InternalMyDsl.g:1715:5: lv_future_13_0= 'future'
                    {
                    lv_future_13_0=(Token)match(input,50,FOLLOW_48); 

                    					newLeafNode(lv_future_13_0, grammarAccess.getMessageAccess().getFutureFutureKeyword_12_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "future", true, "future");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1727:3: ( (lv_constraint_14_0= 'constraint' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==51) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:1728:4: (lv_constraint_14_0= 'constraint' )
                    {
                    // InternalMyDsl.g:1728:4: (lv_constraint_14_0= 'constraint' )
                    // InternalMyDsl.g:1729:5: lv_constraint_14_0= 'constraint'
                    {
                    lv_constraint_14_0=(Token)match(input,51,FOLLOW_49); 

                    					newLeafNode(lv_constraint_14_0, grammarAccess.getMessageAccess().getConstraintConstraintKeyword_13_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "constraint", true, "constraint");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1741:3: (otherlv_15= '{' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==14) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:1742:4: otherlv_15= '{'
                    {
                    otherlv_15=(Token)match(input,14,FOLLOW_49); 

                    				newLeafNode(otherlv_15, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_14());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1747:3: ( (otherlv_16= RULE_ID ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==RULE_ID||(LA48_1>=14 && LA48_1<=15)||LA48_1==26||(LA48_1>=39 && LA48_1<=40)||(LA48_1>=52 && LA48_1<=54)) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:1748:4: (otherlv_16= RULE_ID )
                    {
                    // InternalMyDsl.g:1748:4: (otherlv_16= RULE_ID )
                    // InternalMyDsl.g:1749:5: otherlv_16= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    				
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_49); 

                    					newLeafNode(otherlv_16, grammarAccess.getMessageAccess().getCConstraintCrossReference_15_0());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1760:3: (otherlv_17= ',' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==40) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:1761:4: otherlv_17= ','
                    {
                    otherlv_17=(Token)match(input,40,FOLLOW_49); 

                    				newLeafNode(otherlv_17, grammarAccess.getMessageAccess().getCommaKeyword_16());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1766:3: ( (lv_constraintexp_18_0= ruleClockConstraintExpression ) )?
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:1767:4: (lv_constraintexp_18_0= ruleClockConstraintExpression )
                    {
                    // InternalMyDsl.g:1767:4: (lv_constraintexp_18_0= ruleClockConstraintExpression )
                    // InternalMyDsl.g:1768:5: lv_constraintexp_18_0= ruleClockConstraintExpression
                    {

                    					newCompositeNode(grammarAccess.getMessageAccess().getConstraintexpClockConstraintExpressionParserRuleCall_17_0());
                    				
                    pushFollow(FOLLOW_49);
                    lv_constraintexp_18_0=ruleClockConstraintExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMessageRule());
                    					}
                    					set(
                    						current,
                    						"constraintexp",
                    						lv_constraintexp_18_0,
                    						"org.xtext.example.mydsl.MyDsl.ClockConstraintExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1785:3: (otherlv_19= ',' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==40) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:1786:4: otherlv_19= ','
                    {
                    otherlv_19=(Token)match(input,40,FOLLOW_50); 

                    				newLeafNode(otherlv_19, grammarAccess.getMessageAccess().getCommaKeyword_18());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1791:3: ( (lv_resetinconstraint_20_0= ruleResetClock ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==53) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==RULE_ID) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:1792:4: (lv_resetinconstraint_20_0= ruleResetClock )
                    {
                    // InternalMyDsl.g:1792:4: (lv_resetinconstraint_20_0= ruleResetClock )
                    // InternalMyDsl.g:1793:5: lv_resetinconstraint_20_0= ruleResetClock
                    {

                    					newCompositeNode(grammarAccess.getMessageAccess().getResetinconstraintResetClockParserRuleCall_19_0());
                    				
                    pushFollow(FOLLOW_50);
                    lv_resetinconstraint_20_0=ruleResetClock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMessageRule());
                    					}
                    					set(
                    						current,
                    						"resetinconstraint",
                    						lv_resetinconstraint_20_0,
                    						"org.xtext.example.mydsl.MyDsl.ResetClock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1810:3: (otherlv_21= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==15) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:1811:4: otherlv_21= '}'
                    {
                    otherlv_21=(Token)match(input,15,FOLLOW_50); 

                    				newLeafNode(otherlv_21, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_20());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1816:3: ( (lv_clockconstraint_22_0= 'clockConstraint' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==52) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:1817:4: (lv_clockconstraint_22_0= 'clockConstraint' )
                    {
                    // InternalMyDsl.g:1817:4: (lv_clockconstraint_22_0= 'clockConstraint' )
                    // InternalMyDsl.g:1818:5: lv_clockconstraint_22_0= 'clockConstraint'
                    {
                    lv_clockconstraint_22_0=(Token)match(input,52,FOLLOW_51); 

                    					newLeafNode(lv_clockconstraint_22_0, grammarAccess.getMessageAccess().getClockconstraintClockConstraintKeyword_21_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "clockconstraint", true, "clockConstraint");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1830:3: (otherlv_23= '{' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==14) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:1831:4: otherlv_23= '{'
                    {
                    otherlv_23=(Token)match(input,14,FOLLOW_52); 

                    				newLeafNode(otherlv_23, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_22());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1836:3: ( (lv_cConstraint_24_0= ruleClockConstraintExpression ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID||LA56_0==39||LA56_0==54) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:1837:4: (lv_cConstraint_24_0= ruleClockConstraintExpression )
                    {
                    // InternalMyDsl.g:1837:4: (lv_cConstraint_24_0= ruleClockConstraintExpression )
                    // InternalMyDsl.g:1838:5: lv_cConstraint_24_0= ruleClockConstraintExpression
                    {

                    					newCompositeNode(grammarAccess.getMessageAccess().getCConstraintClockConstraintExpressionParserRuleCall_23_0());
                    				
                    pushFollow(FOLLOW_53);
                    lv_cConstraint_24_0=ruleClockConstraintExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMessageRule());
                    					}
                    					set(
                    						current,
                    						"cConstraint",
                    						lv_cConstraint_24_0,
                    						"org.xtext.example.mydsl.MyDsl.ClockConstraintExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1855:3: (otherlv_25= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==15) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:1856:4: otherlv_25= '}'
                    {
                    otherlv_25=(Token)match(input,15,FOLLOW_54); 

                    				newLeafNode(otherlv_25, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_24());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1861:3: ( (lv_resetclock_26_0= ruleResetClock ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==53) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:1862:4: (lv_resetclock_26_0= ruleResetClock )
                    {
                    // InternalMyDsl.g:1862:4: (lv_resetclock_26_0= ruleResetClock )
                    // InternalMyDsl.g:1863:5: lv_resetclock_26_0= ruleResetClock
                    {

                    					newCompositeNode(grammarAccess.getMessageAccess().getResetclockResetClockParserRuleCall_25_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_resetclock_26_0=ruleResetClock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMessageRule());
                    					}
                    					set(
                    						current,
                    						"resetclock",
                    						lv_resetclock_26_0,
                    						"org.xtext.example.mydsl.MyDsl.ResetClock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_27=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getMessageAccess().getSemicolonKeyword_26());
            		

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


    // $ANTLR start "entryRuleResetClock"
    // InternalMyDsl.g:1888:1: entryRuleResetClock returns [EObject current=null] : iv_ruleResetClock= ruleResetClock EOF ;
    public final EObject entryRuleResetClock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResetClock = null;


        try {
            // InternalMyDsl.g:1888:51: (iv_ruleResetClock= ruleResetClock EOF )
            // InternalMyDsl.g:1889:2: iv_ruleResetClock= ruleResetClock EOF
            {
             newCompositeNode(grammarAccess.getResetClockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResetClock=ruleResetClock();

            state._fsp--;

             current =iv_ruleResetClock; 
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
    // $ANTLR end "entryRuleResetClock"


    // $ANTLR start "ruleResetClock"
    // InternalMyDsl.g:1895:1: ruleResetClock returns [EObject current=null] : (otherlv_0= 'reset' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleResetClock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1901:2: ( (otherlv_0= 'reset' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1902:2: (otherlv_0= 'reset' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1902:2: (otherlv_0= 'reset' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1903:3: otherlv_0= 'reset' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getResetClockAccess().getResetKeyword_0());
            		
            // InternalMyDsl.g:1907:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1908:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1908:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1909:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResetClockRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getResetClockAccess().getClockClockCrossReference_1_0());
            				

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
    // $ANTLR end "ruleResetClock"


    // $ANTLR start "entryRuleClockConstraint"
    // InternalMyDsl.g:1924:1: entryRuleClockConstraint returns [EObject current=null] : iv_ruleClockConstraint= ruleClockConstraint EOF ;
    public final EObject entryRuleClockConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClockConstraint = null;


        try {
            // InternalMyDsl.g:1924:56: (iv_ruleClockConstraint= ruleClockConstraint EOF )
            // InternalMyDsl.g:1925:2: iv_ruleClockConstraint= ruleClockConstraint EOF
            {
             newCompositeNode(grammarAccess.getClockConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClockConstraint=ruleClockConstraint();

            state._fsp--;

             current =iv_ruleClockConstraint; 
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
    // $ANTLR end "entryRuleClockConstraint"


    // $ANTLR start "ruleClockConstraint"
    // InternalMyDsl.g:1931:1: ruleClockConstraint returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleOperator ) ) ( (lv_constant_2_0= RULE_NUMBER ) ) ) ;
    public final EObject ruleClockConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_constant_2_0=null;
        EObject lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1937:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleOperator ) ) ( (lv_constant_2_0= RULE_NUMBER ) ) ) )
            // InternalMyDsl.g:1938:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleOperator ) ) ( (lv_constant_2_0= RULE_NUMBER ) ) )
            {
            // InternalMyDsl.g:1938:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleOperator ) ) ( (lv_constant_2_0= RULE_NUMBER ) ) )
            // InternalMyDsl.g:1939:3: ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleOperator ) ) ( (lv_constant_2_0= RULE_NUMBER ) )
            {
            // InternalMyDsl.g:1939:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:1940:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:1940:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:1941:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClockConstraintRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(otherlv_0, grammarAccess.getClockConstraintAccess().getClockClockCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:1952:3: ( (lv_op_1_0= ruleOperator ) )
            // InternalMyDsl.g:1953:4: (lv_op_1_0= ruleOperator )
            {
            // InternalMyDsl.g:1953:4: (lv_op_1_0= ruleOperator )
            // InternalMyDsl.g:1954:5: lv_op_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getClockConstraintAccess().getOpOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_56);
            lv_op_1_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClockConstraintRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.xtext.example.mydsl.MyDsl.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1971:3: ( (lv_constant_2_0= RULE_NUMBER ) )
            // InternalMyDsl.g:1972:4: (lv_constant_2_0= RULE_NUMBER )
            {
            // InternalMyDsl.g:1972:4: (lv_constant_2_0= RULE_NUMBER )
            // InternalMyDsl.g:1973:5: lv_constant_2_0= RULE_NUMBER
            {
            lv_constant_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

            					newLeafNode(lv_constant_2_0, grammarAccess.getClockConstraintAccess().getConstantNumberTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClockConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"constant",
            						lv_constant_2_0,
            						"org.xtext.example.mydsl.MyDsl.Number");
            				

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
    // $ANTLR end "ruleClockConstraint"


    // $ANTLR start "entryRuleClockConstraintExpression"
    // InternalMyDsl.g:1993:1: entryRuleClockConstraintExpression returns [EObject current=null] : iv_ruleClockConstraintExpression= ruleClockConstraintExpression EOF ;
    public final EObject entryRuleClockConstraintExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClockConstraintExpression = null;


        try {
            // InternalMyDsl.g:1993:66: (iv_ruleClockConstraintExpression= ruleClockConstraintExpression EOF )
            // InternalMyDsl.g:1994:2: iv_ruleClockConstraintExpression= ruleClockConstraintExpression EOF
            {
             newCompositeNode(grammarAccess.getClockConstraintExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClockConstraintExpression=ruleClockConstraintExpression();

            state._fsp--;

             current =iv_ruleClockConstraintExpression; 
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
    // $ANTLR end "entryRuleClockConstraintExpression"


    // $ANTLR start "ruleClockConstraintExpression"
    // InternalMyDsl.g:2000:1: ruleClockConstraintExpression returns [EObject current=null] : ( ( ( (lv_not_0_0= 'not' ) )? (otherlv_1= '(' )? ( (lv_lclockconstraint_2_0= ruleClockConstraint ) ) (otherlv_3= ')' )? ) | ( ( (lv_lclockconstraint_4_0= ruleClockConstraint ) ) otherlv_5= 'and' ( (lv_rclockconstraint_6_0= ruleClockConstraint ) ) ) ) ;
    public final EObject ruleClockConstraintExpression() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lclockconstraint_2_0 = null;

        EObject lv_lclockconstraint_4_0 = null;

        EObject lv_rclockconstraint_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2006:2: ( ( ( ( (lv_not_0_0= 'not' ) )? (otherlv_1= '(' )? ( (lv_lclockconstraint_2_0= ruleClockConstraint ) ) (otherlv_3= ')' )? ) | ( ( (lv_lclockconstraint_4_0= ruleClockConstraint ) ) otherlv_5= 'and' ( (lv_rclockconstraint_6_0= ruleClockConstraint ) ) ) ) )
            // InternalMyDsl.g:2007:2: ( ( ( (lv_not_0_0= 'not' ) )? (otherlv_1= '(' )? ( (lv_lclockconstraint_2_0= ruleClockConstraint ) ) (otherlv_3= ')' )? ) | ( ( (lv_lclockconstraint_4_0= ruleClockConstraint ) ) otherlv_5= 'and' ( (lv_rclockconstraint_6_0= ruleClockConstraint ) ) ) )
            {
            // InternalMyDsl.g:2007:2: ( ( ( (lv_not_0_0= 'not' ) )? (otherlv_1= '(' )? ( (lv_lclockconstraint_2_0= ruleClockConstraint ) ) (otherlv_3= ')' )? ) | ( ( (lv_lclockconstraint_4_0= ruleClockConstraint ) ) otherlv_5= 'and' ( (lv_rclockconstraint_6_0= ruleClockConstraint ) ) ) )
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // InternalMyDsl.g:2008:3: ( ( (lv_not_0_0= 'not' ) )? (otherlv_1= '(' )? ( (lv_lclockconstraint_2_0= ruleClockConstraint ) ) (otherlv_3= ')' )? )
                    {
                    // InternalMyDsl.g:2008:3: ( ( (lv_not_0_0= 'not' ) )? (otherlv_1= '(' )? ( (lv_lclockconstraint_2_0= ruleClockConstraint ) ) (otherlv_3= ')' )? )
                    // InternalMyDsl.g:2009:4: ( (lv_not_0_0= 'not' ) )? (otherlv_1= '(' )? ( (lv_lclockconstraint_2_0= ruleClockConstraint ) ) (otherlv_3= ')' )?
                    {
                    // InternalMyDsl.g:2009:4: ( (lv_not_0_0= 'not' ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==54) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalMyDsl.g:2010:5: (lv_not_0_0= 'not' )
                            {
                            // InternalMyDsl.g:2010:5: (lv_not_0_0= 'not' )
                            // InternalMyDsl.g:2011:6: lv_not_0_0= 'not'
                            {
                            lv_not_0_0=(Token)match(input,54,FOLLOW_57); 

                            						newLeafNode(lv_not_0_0, grammarAccess.getClockConstraintExpressionAccess().getNotNotKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getClockConstraintExpressionRule());
                            						}
                            						setWithLastConsumed(current, "not", true, "not");
                            					

                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:2023:4: (otherlv_1= '(' )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==39) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalMyDsl.g:2024:5: otherlv_1= '('
                            {
                            otherlv_1=(Token)match(input,39,FOLLOW_57); 

                            					newLeafNode(otherlv_1, grammarAccess.getClockConstraintExpressionAccess().getLeftParenthesisKeyword_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:2029:4: ( (lv_lclockconstraint_2_0= ruleClockConstraint ) )
                    // InternalMyDsl.g:2030:5: (lv_lclockconstraint_2_0= ruleClockConstraint )
                    {
                    // InternalMyDsl.g:2030:5: (lv_lclockconstraint_2_0= ruleClockConstraint )
                    // InternalMyDsl.g:2031:6: lv_lclockconstraint_2_0= ruleClockConstraint
                    {

                    						newCompositeNode(grammarAccess.getClockConstraintExpressionAccess().getLclockconstraintClockConstraintParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_lclockconstraint_2_0=ruleClockConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClockConstraintExpressionRule());
                    						}
                    						set(
                    							current,
                    							"lclockconstraint",
                    							lv_lclockconstraint_2_0,
                    							"org.xtext.example.mydsl.MyDsl.ClockConstraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2048:4: (otherlv_3= ')' )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==41) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalMyDsl.g:2049:5: otherlv_3= ')'
                            {
                            otherlv_3=(Token)match(input,41,FOLLOW_2); 

                            					newLeafNode(otherlv_3, grammarAccess.getClockConstraintExpressionAccess().getRightParenthesisKeyword_0_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2056:3: ( ( (lv_lclockconstraint_4_0= ruleClockConstraint ) ) otherlv_5= 'and' ( (lv_rclockconstraint_6_0= ruleClockConstraint ) ) )
                    {
                    // InternalMyDsl.g:2056:3: ( ( (lv_lclockconstraint_4_0= ruleClockConstraint ) ) otherlv_5= 'and' ( (lv_rclockconstraint_6_0= ruleClockConstraint ) ) )
                    // InternalMyDsl.g:2057:4: ( (lv_lclockconstraint_4_0= ruleClockConstraint ) ) otherlv_5= 'and' ( (lv_rclockconstraint_6_0= ruleClockConstraint ) )
                    {
                    // InternalMyDsl.g:2057:4: ( (lv_lclockconstraint_4_0= ruleClockConstraint ) )
                    // InternalMyDsl.g:2058:5: (lv_lclockconstraint_4_0= ruleClockConstraint )
                    {
                    // InternalMyDsl.g:2058:5: (lv_lclockconstraint_4_0= ruleClockConstraint )
                    // InternalMyDsl.g:2059:6: lv_lclockconstraint_4_0= ruleClockConstraint
                    {

                    						newCompositeNode(grammarAccess.getClockConstraintExpressionAccess().getLclockconstraintClockConstraintParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_lclockconstraint_4_0=ruleClockConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClockConstraintExpressionRule());
                    						}
                    						set(
                    							current,
                    							"lclockconstraint",
                    							lv_lclockconstraint_4_0,
                    							"org.xtext.example.mydsl.MyDsl.ClockConstraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,55,FOLLOW_57); 

                    				newLeafNode(otherlv_5, grammarAccess.getClockConstraintExpressionAccess().getAndKeyword_1_1());
                    			
                    // InternalMyDsl.g:2080:4: ( (lv_rclockconstraint_6_0= ruleClockConstraint ) )
                    // InternalMyDsl.g:2081:5: (lv_rclockconstraint_6_0= ruleClockConstraint )
                    {
                    // InternalMyDsl.g:2081:5: (lv_rclockconstraint_6_0= ruleClockConstraint )
                    // InternalMyDsl.g:2082:6: lv_rclockconstraint_6_0= ruleClockConstraint
                    {

                    						newCompositeNode(grammarAccess.getClockConstraintExpressionAccess().getRclockconstraintClockConstraintParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rclockconstraint_6_0=ruleClockConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClockConstraintExpressionRule());
                    						}
                    						set(
                    							current,
                    							"rclockconstraint",
                    							lv_rclockconstraint_6_0,
                    							"org.xtext.example.mydsl.MyDsl.ClockConstraint");
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
    // $ANTLR end "ruleClockConstraintExpression"


    // $ANTLR start "entryRuleContextMessage"
    // InternalMyDsl.g:2104:1: entryRuleContextMessage returns [EObject current=null] : iv_ruleContextMessage= ruleContextMessage EOF ;
    public final EObject entryRuleContextMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextMessage = null;


        try {
            // InternalMyDsl.g:2104:55: (iv_ruleContextMessage= ruleContextMessage EOF )
            // InternalMyDsl.g:2105:2: iv_ruleContextMessage= ruleContextMessage EOF
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
    // InternalMyDsl.g:2111:1: ruleContextMessage returns [EObject current=null] : ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' ) ;
    public final EObject ruleContextMessage() throws RecognitionException {
        EObject current = null;

        Token lv_required_1_0=null;
        Token lv_fail_2_0=null;
        Token lv_strict_3_0=null;
        Token otherlv_4=null;
        EObject lv_content_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2117:2: ( ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' ) )
            // InternalMyDsl.g:2118:2: ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' )
            {
            // InternalMyDsl.g:2118:2: ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' )
            // InternalMyDsl.g:2119:3: ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';'
            {
            // InternalMyDsl.g:2119:3: ( (lv_content_0_0= ruleContextMessageContent ) )
            // InternalMyDsl.g:2120:4: (lv_content_0_0= ruleContextMessageContent )
            {
            // InternalMyDsl.g:2120:4: (lv_content_0_0= ruleContextMessageContent )
            // InternalMyDsl.g:2121:5: lv_content_0_0= ruleContextMessageContent
            {

            					newCompositeNode(grammarAccess.getContextMessageAccess().getContentContextMessageContentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_60);
            lv_content_0_0=ruleContextMessageContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextMessageRule());
            					}
            					add(
            						current,
            						"content",
            						lv_content_0_0,
            						"org.xtext.example.mydsl.MyDsl.ContextMessageContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2138:3: ( (lv_required_1_0= 'required' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==45) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMyDsl.g:2139:4: (lv_required_1_0= 'required' )
                    {
                    // InternalMyDsl.g:2139:4: (lv_required_1_0= 'required' )
                    // InternalMyDsl.g:2140:5: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,45,FOLLOW_61); 

                    					newLeafNode(lv_required_1_0, grammarAccess.getContextMessageAccess().getRequiredRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextMessageRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2152:3: ( (lv_fail_2_0= 'fail' ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==46) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMyDsl.g:2153:4: (lv_fail_2_0= 'fail' )
                    {
                    // InternalMyDsl.g:2153:4: (lv_fail_2_0= 'fail' )
                    // InternalMyDsl.g:2154:5: lv_fail_2_0= 'fail'
                    {
                    lv_fail_2_0=(Token)match(input,46,FOLLOW_62); 

                    					newLeafNode(lv_fail_2_0, grammarAccess.getContextMessageAccess().getFailFailKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextMessageRule());
                    					}
                    					setWithLastConsumed(current, "fail", true, "fail");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2166:3: ( (lv_strict_3_0= 'strict' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==47) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyDsl.g:2167:4: (lv_strict_3_0= 'strict' )
                    {
                    // InternalMyDsl.g:2167:4: (lv_strict_3_0= 'strict' )
                    // InternalMyDsl.g:2168:5: lv_strict_3_0= 'strict'
                    {
                    lv_strict_3_0=(Token)match(input,47,FOLLOW_27); 

                    					newLeafNode(lv_strict_3_0, grammarAccess.getContextMessageAccess().getStrictStrictKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextMessageRule());
                    					}
                    					setWithLastConsumed(current, "strict", true, "strict");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

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
    // InternalMyDsl.g:2188:1: entryRuleContextMessageContent returns [EObject current=null] : iv_ruleContextMessageContent= ruleContextMessageContent EOF ;
    public final EObject entryRuleContextMessageContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextMessageContent = null;


        try {
            // InternalMyDsl.g:2188:62: (iv_ruleContextMessageContent= ruleContextMessageContent EOF )
            // InternalMyDsl.g:2189:2: iv_ruleContextMessageContent= ruleContextMessageContent EOF
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
    // InternalMyDsl.g:2195:1: ruleContextMessageContent returns [EObject current=null] : ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) ) ;
    public final EObject ruleContextMessageContent() throws RecognitionException {
        EObject current = null;

        EObject lv_match_0_0 = null;

        EObject lv_change_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2201:2: ( ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) ) )
            // InternalMyDsl.g:2202:2: ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) )
            {
            // InternalMyDsl.g:2202:2: ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==56) ) {
                alt66=1;
            }
            else if ( (LA66_0==57||(LA66_0>=59 && LA66_0<=61)) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalMyDsl.g:2203:3: ( (lv_match_0_0= ruleMatchMessage ) )
                    {
                    // InternalMyDsl.g:2203:3: ( (lv_match_0_0= ruleMatchMessage ) )
                    // InternalMyDsl.g:2204:4: (lv_match_0_0= ruleMatchMessage )
                    {
                    // InternalMyDsl.g:2204:4: (lv_match_0_0= ruleMatchMessage )
                    // InternalMyDsl.g:2205:5: lv_match_0_0= ruleMatchMessage
                    {

                    					newCompositeNode(grammarAccess.getContextMessageContentAccess().getMatchMatchMessageParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_match_0_0=ruleMatchMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContextMessageContentRule());
                    					}
                    					add(
                    						current,
                    						"match",
                    						lv_match_0_0,
                    						"org.xtext.example.mydsl.MyDsl.MatchMessage");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2223:3: ( (lv_change_1_0= ruleChangeMessage ) )
                    {
                    // InternalMyDsl.g:2223:3: ( (lv_change_1_0= ruleChangeMessage ) )
                    // InternalMyDsl.g:2224:4: (lv_change_1_0= ruleChangeMessage )
                    {
                    // InternalMyDsl.g:2224:4: (lv_change_1_0= ruleChangeMessage )
                    // InternalMyDsl.g:2225:5: lv_change_1_0= ruleChangeMessage
                    {

                    					newCompositeNode(grammarAccess.getContextMessageContentAccess().getChangeChangeMessageParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_change_1_0=ruleChangeMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContextMessageContentRule());
                    					}
                    					add(
                    						current,
                    						"change",
                    						lv_change_1_0,
                    						"org.xtext.example.mydsl.MyDsl.ChangeMessage");
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
    // $ANTLR end "ruleContextMessageContent"


    // $ANTLR start "entryRuleMatchMessage"
    // InternalMyDsl.g:2246:1: entryRuleMatchMessage returns [EObject current=null] : iv_ruleMatchMessage= ruleMatchMessage EOF ;
    public final EObject entryRuleMatchMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchMessage = null;


        try {
            // InternalMyDsl.g:2246:53: (iv_ruleMatchMessage= ruleMatchMessage EOF )
            // InternalMyDsl.g:2247:2: iv_ruleMatchMessage= ruleMatchMessage EOF
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
    // InternalMyDsl.g:2253:1: ruleMatchMessage returns [EObject current=null] : (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' ) ;
    public final EObject ruleMatchMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2259:2: ( (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:2260:2: (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:2260:2: (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' )
            // InternalMyDsl.g:2261:3: otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchMessageAccess().getMatchKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_63); 

            			newLeafNode(otherlv_1, grammarAccess.getMatchMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2269:3: ( (otherlv_2= RULE_ID ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyDsl.g:2270:4: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:2270:4: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:2271:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMatchMessageRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_63); 

                    					newLeafNode(otherlv_2, grammarAccess.getMatchMessageAccess().getContextContextModelCrossReference_2_0());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2282:3: (otherlv_3= ',' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==40) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyDsl.g:2283:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_64); 

                    				newLeafNode(otherlv_3, grammarAccess.getMatchMessageAccess().getCommaKeyword_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2288:3: ( (otherlv_4= RULE_ID ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyDsl.g:2289:4: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:2289:4: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:2290:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMatchMessageRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_39); 

                    					newLeafNode(otherlv_4, grammarAccess.getMatchMessageAccess().getContentContextFragmentCrossReference_4_0());
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMatchMessageAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalMyDsl.g:2309:1: entryRuleChangeMessage returns [EObject current=null] : iv_ruleChangeMessage= ruleChangeMessage EOF ;
    public final EObject entryRuleChangeMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeMessage = null;


        try {
            // InternalMyDsl.g:2309:54: (iv_ruleChangeMessage= ruleChangeMessage EOF )
            // InternalMyDsl.g:2310:2: iv_ruleChangeMessage= ruleChangeMessage EOF
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
    // InternalMyDsl.g:2316:1: ruleChangeMessage returns [EObject current=null] : ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) | ( (lv_changetor_3_0= ruleChangeToRelation ) ) ) ;
    public final EObject ruleChangeMessage() throws RecognitionException {
        EObject current = null;

        EObject lv_disappear_0_0 = null;

        EObject lv_appear_1_0 = null;

        EObject lv_changeto_2_0 = null;

        EObject lv_changetor_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2322:2: ( ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) | ( (lv_changetor_3_0= ruleChangeToRelation ) ) ) )
            // InternalMyDsl.g:2323:2: ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) | ( (lv_changetor_3_0= ruleChangeToRelation ) ) )
            {
            // InternalMyDsl.g:2323:2: ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) | ( (lv_changetor_3_0= ruleChangeToRelation ) ) )
            int alt70=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt70=1;
                }
                break;
            case 57:
                {
                alt70=2;
                }
                break;
            case 60:
                {
                alt70=3;
                }
                break;
            case 61:
                {
                alt70=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalMyDsl.g:2324:3: ( (lv_disappear_0_0= ruleDisappearMessage ) )
                    {
                    // InternalMyDsl.g:2324:3: ( (lv_disappear_0_0= ruleDisappearMessage ) )
                    // InternalMyDsl.g:2325:4: (lv_disappear_0_0= ruleDisappearMessage )
                    {
                    // InternalMyDsl.g:2325:4: (lv_disappear_0_0= ruleDisappearMessage )
                    // InternalMyDsl.g:2326:5: lv_disappear_0_0= ruleDisappearMessage
                    {

                    					newCompositeNode(grammarAccess.getChangeMessageAccess().getDisappearDisappearMessageParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_disappear_0_0=ruleDisappearMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getChangeMessageRule());
                    					}
                    					add(
                    						current,
                    						"disappear",
                    						lv_disappear_0_0,
                    						"org.xtext.example.mydsl.MyDsl.DisappearMessage");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2344:3: ( (lv_appear_1_0= ruleAppearMessage ) )
                    {
                    // InternalMyDsl.g:2344:3: ( (lv_appear_1_0= ruleAppearMessage ) )
                    // InternalMyDsl.g:2345:4: (lv_appear_1_0= ruleAppearMessage )
                    {
                    // InternalMyDsl.g:2345:4: (lv_appear_1_0= ruleAppearMessage )
                    // InternalMyDsl.g:2346:5: lv_appear_1_0= ruleAppearMessage
                    {

                    					newCompositeNode(grammarAccess.getChangeMessageAccess().getAppearAppearMessageParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_appear_1_0=ruleAppearMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getChangeMessageRule());
                    					}
                    					add(
                    						current,
                    						"appear",
                    						lv_appear_1_0,
                    						"org.xtext.example.mydsl.MyDsl.AppearMessage");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2364:3: ( (lv_changeto_2_0= ruleChangeToMessage ) )
                    {
                    // InternalMyDsl.g:2364:3: ( (lv_changeto_2_0= ruleChangeToMessage ) )
                    // InternalMyDsl.g:2365:4: (lv_changeto_2_0= ruleChangeToMessage )
                    {
                    // InternalMyDsl.g:2365:4: (lv_changeto_2_0= ruleChangeToMessage )
                    // InternalMyDsl.g:2366:5: lv_changeto_2_0= ruleChangeToMessage
                    {

                    					newCompositeNode(grammarAccess.getChangeMessageAccess().getChangetoChangeToMessageParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_changeto_2_0=ruleChangeToMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getChangeMessageRule());
                    					}
                    					add(
                    						current,
                    						"changeto",
                    						lv_changeto_2_0,
                    						"org.xtext.example.mydsl.MyDsl.ChangeToMessage");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2384:3: ( (lv_changetor_3_0= ruleChangeToRelation ) )
                    {
                    // InternalMyDsl.g:2384:3: ( (lv_changetor_3_0= ruleChangeToRelation ) )
                    // InternalMyDsl.g:2385:4: (lv_changetor_3_0= ruleChangeToRelation )
                    {
                    // InternalMyDsl.g:2385:4: (lv_changetor_3_0= ruleChangeToRelation )
                    // InternalMyDsl.g:2386:5: lv_changetor_3_0= ruleChangeToRelation
                    {

                    					newCompositeNode(grammarAccess.getChangeMessageAccess().getChangetorChangeToRelationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_changetor_3_0=ruleChangeToRelation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getChangeMessageRule());
                    					}
                    					add(
                    						current,
                    						"changetor",
                    						lv_changetor_3_0,
                    						"org.xtext.example.mydsl.MyDsl.ChangeToRelation");
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
    // $ANTLR end "ruleChangeMessage"


    // $ANTLR start "entryRuleAppearMessage"
    // InternalMyDsl.g:2407:1: entryRuleAppearMessage returns [EObject current=null] : iv_ruleAppearMessage= ruleAppearMessage EOF ;
    public final EObject entryRuleAppearMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppearMessage = null;


        try {
            // InternalMyDsl.g:2407:54: (iv_ruleAppearMessage= ruleAppearMessage EOF )
            // InternalMyDsl.g:2408:2: iv_ruleAppearMessage= ruleAppearMessage EOF
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
    // InternalMyDsl.g:2414:1: ruleAppearMessage returns [EObject current=null] : (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleAppearMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2420:2: ( (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:2421:2: (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:2421:2: (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            // InternalMyDsl.g:2422:3: otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getAppearMessageAccess().getAppearKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getAppearMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2430:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyDsl.g:2431:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMyDsl.g:2431:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:2432:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:2432:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:2433:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAppearMessageRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_65); 

                    						newLeafNode(otherlv_2, grammarAccess.getAppearMessageAccess().getContextContextModelCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,58,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getAppearMessageAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMyDsl.g:2448:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:2449:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:2449:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:2450:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAppearMessageRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_39); 

                    						newLeafNode(otherlv_4, grammarAccess.getAppearMessageAccess().getEntityEntityCrossReference_2_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAppearMessageAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalMyDsl.g:2470:1: entryRuleDisappearMessage returns [EObject current=null] : iv_ruleDisappearMessage= ruleDisappearMessage EOF ;
    public final EObject entryRuleDisappearMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisappearMessage = null;


        try {
            // InternalMyDsl.g:2470:57: (iv_ruleDisappearMessage= ruleDisappearMessage EOF )
            // InternalMyDsl.g:2471:2: iv_ruleDisappearMessage= ruleDisappearMessage EOF
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
    // InternalMyDsl.g:2477:1: ruleDisappearMessage returns [EObject current=null] : (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleDisappearMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2483:2: ( (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:2484:2: (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:2484:2: (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            // InternalMyDsl.g:2485:3: otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getDisappearMessageAccess().getDisappearKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getDisappearMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2493:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalMyDsl.g:2494:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMyDsl.g:2494:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:2495:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:2495:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:2496:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDisappearMessageRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_65); 

                    						newLeafNode(otherlv_2, grammarAccess.getDisappearMessageAccess().getContextContextModelCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,58,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getDisappearMessageAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMyDsl.g:2511:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:2512:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:2512:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:2513:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDisappearMessageRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_39); 

                    						newLeafNode(otherlv_4, grammarAccess.getDisappearMessageAccess().getEntityEntityCrossReference_2_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDisappearMessageAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleDisappearMessage"


    // $ANTLR start "entryRuleChangeToMessage"
    // InternalMyDsl.g:2533:1: entryRuleChangeToMessage returns [EObject current=null] : iv_ruleChangeToMessage= ruleChangeToMessage EOF ;
    public final EObject entryRuleChangeToMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeToMessage = null;


        try {
            // InternalMyDsl.g:2533:56: (iv_ruleChangeToMessage= ruleChangeToMessage EOF )
            // InternalMyDsl.g:2534:2: iv_ruleChangeToMessage= ruleChangeToMessage EOF
            {
             newCompositeNode(grammarAccess.getChangeToMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeToMessage=ruleChangeToMessage();

            state._fsp--;

             current =iv_ruleChangeToMessage; 
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
    // $ANTLR end "entryRuleChangeToMessage"


    // $ANTLR start "ruleChangeToMessage"
    // InternalMyDsl.g:2540:1: ruleChangeToMessage returns [EObject current=null] : (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' ) ;
    public final EObject ruleChangeToMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_changevalue_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2546:2: ( (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' ) )
            // InternalMyDsl.g:2547:2: (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' )
            {
            // InternalMyDsl.g:2547:2: (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' )
            // InternalMyDsl.g:2548:3: otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeToMessageAccess().getChangeToKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeToMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2556:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalMyDsl.g:2557:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalMyDsl.g:2557:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:2558:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:2558:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:2559:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToMessageRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_65); 

                    						newLeafNode(otherlv_2, grammarAccess.getChangeToMessageAccess().getContextContextModelCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,58,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getChangeToMessageAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMyDsl.g:2574:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:2575:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:2575:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:2576:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToMessageRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_65); 

                    						newLeafNode(otherlv_4, grammarAccess.getChangeToMessageAccess().getEntityEntityCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,58,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getChangeToMessageAccess().getFullStopKeyword_2_3());
                    			
                    // InternalMyDsl.g:2591:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMyDsl.g:2592:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMyDsl.g:2592:5: (otherlv_6= RULE_ID )
                    // InternalMyDsl.g:2593:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToMessageRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_66); 

                    						newLeafNode(otherlv_6, grammarAccess.getChangeToMessageAccess().getAttributeAttributeCrossReference_2_4_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2605:3: (otherlv_7= ',' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==40) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalMyDsl.g:2606:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_67); 

                    				newLeafNode(otherlv_7, grammarAccess.getChangeToMessageAccess().getCommaKeyword_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2611:3: ( (lv_changevalue_8_0= ruleAttributeValue ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_STRING && LA75_0<=RULE_NUMBER)||(LA75_0>=27 && LA75_0<=28)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalMyDsl.g:2612:4: (lv_changevalue_8_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:2612:4: (lv_changevalue_8_0= ruleAttributeValue )
                    // InternalMyDsl.g:2613:5: lv_changevalue_8_0= ruleAttributeValue
                    {

                    					newCompositeNode(grammarAccess.getChangeToMessageAccess().getChangevalueAttributeValueParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_39);
                    lv_changevalue_8_0=ruleAttributeValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getChangeToMessageRule());
                    					}
                    					set(
                    						current,
                    						"changevalue",
                    						lv_changevalue_8_0,
                    						"org.xtext.example.mydsl.MyDsl.AttributeValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getChangeToMessageAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleChangeToMessage"


    // $ANTLR start "entryRuleChangeToRelation"
    // InternalMyDsl.g:2638:1: entryRuleChangeToRelation returns [EObject current=null] : iv_ruleChangeToRelation= ruleChangeToRelation EOF ;
    public final EObject entryRuleChangeToRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeToRelation = null;


        try {
            // InternalMyDsl.g:2638:57: (iv_ruleChangeToRelation= ruleChangeToRelation EOF )
            // InternalMyDsl.g:2639:2: iv_ruleChangeToRelation= ruleChangeToRelation EOF
            {
             newCompositeNode(grammarAccess.getChangeToRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeToRelation=ruleChangeToRelation();

            state._fsp--;

             current =iv_ruleChangeToRelation; 
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
    // $ANTLR end "entryRuleChangeToRelation"


    // $ANTLR start "ruleChangeToRelation"
    // InternalMyDsl.g:2645:1: ruleChangeToRelation returns [EObject current=null] : (otherlv_0= 'relationChangeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' ) ;
    public final EObject ruleChangeToRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_changevalue_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2651:2: ( (otherlv_0= 'relationChangeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' ) )
            // InternalMyDsl.g:2652:2: (otherlv_0= 'relationChangeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' )
            {
            // InternalMyDsl.g:2652:2: (otherlv_0= 'relationChangeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' )
            // InternalMyDsl.g:2653:3: otherlv_0= 'relationChangeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeToRelationAccess().getRelationChangeToKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeToRelationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2661:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalMyDsl.g:2662:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalMyDsl.g:2662:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:2663:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:2663:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:2664:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToRelationRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_65); 

                    						newLeafNode(otherlv_2, grammarAccess.getChangeToRelationAccess().getContextContextModelCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,58,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getChangeToRelationAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMyDsl.g:2679:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:2680:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:2680:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:2681:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToRelationRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_65); 

                    						newLeafNode(otherlv_4, grammarAccess.getChangeToRelationAccess().getRelationRelationCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,58,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getChangeToRelationAccess().getFullStopKeyword_2_3());
                    			
                    // InternalMyDsl.g:2696:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMyDsl.g:2697:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMyDsl.g:2697:5: (otherlv_6= RULE_ID )
                    // InternalMyDsl.g:2698:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToRelationRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_66); 

                    						newLeafNode(otherlv_6, grammarAccess.getChangeToRelationAccess().getAttributeAttributeCrossReference_2_4_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2710:3: (otherlv_7= ',' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==40) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalMyDsl.g:2711:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_67); 

                    				newLeafNode(otherlv_7, grammarAccess.getChangeToRelationAccess().getCommaKeyword_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2716:3: ( (lv_changevalue_8_0= ruleAttributeValue ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=RULE_STRING && LA78_0<=RULE_NUMBER)||(LA78_0>=27 && LA78_0<=28)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalMyDsl.g:2717:4: (lv_changevalue_8_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:2717:4: (lv_changevalue_8_0= ruleAttributeValue )
                    // InternalMyDsl.g:2718:5: lv_changevalue_8_0= ruleAttributeValue
                    {

                    					newCompositeNode(grammarAccess.getChangeToRelationAccess().getChangevalueAttributeValueParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_39);
                    lv_changevalue_8_0=ruleAttributeValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getChangeToRelationRule());
                    					}
                    					set(
                    						current,
                    						"changevalue",
                    						lv_changevalue_8_0,
                    						"org.xtext.example.mydsl.MyDsl.AttributeValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getChangeToRelationAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleChangeToRelation"


    // $ANTLR start "entryRuleAssertionEntity"
    // InternalMyDsl.g:2743:1: entryRuleAssertionEntity returns [EObject current=null] : iv_ruleAssertionEntity= ruleAssertionEntity EOF ;
    public final EObject entryRuleAssertionEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionEntity = null;


        try {
            // InternalMyDsl.g:2743:56: (iv_ruleAssertionEntity= ruleAssertionEntity EOF )
            // InternalMyDsl.g:2744:2: iv_ruleAssertionEntity= ruleAssertionEntity EOF
            {
             newCompositeNode(grammarAccess.getAssertionEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertionEntity=ruleAssertionEntity();

            state._fsp--;

             current =iv_ruleAssertionEntity; 
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
    // $ANTLR end "entryRuleAssertionEntity"


    // $ANTLR start "ruleAssertionEntity"
    // InternalMyDsl.g:2750:1: ruleAssertionEntity returns [EObject current=null] : (otherlv_0= 'assertEntityAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' ) ;
    public final EObject ruleAssertionEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_operator_7_0 = null;

        EObject lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2756:2: ( (otherlv_0= 'assertEntityAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' ) )
            // InternalMyDsl.g:2757:2: (otherlv_0= 'assertEntityAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' )
            {
            // InternalMyDsl.g:2757:2: (otherlv_0= 'assertEntityAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' )
            // InternalMyDsl.g:2758:3: otherlv_0= 'assertEntityAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_68); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertionEntityAccess().getAssertEntityAttributeKeyword_0());
            		
            otherlv_1=(Token)match(input,63,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertionEntityAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:2766:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:2767:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:2767:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:2768:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertionEntityRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_65); 

            					newLeafNode(otherlv_2, grammarAccess.getAssertionEntityAccess().getContextContextModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,58,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAssertionEntityAccess().getFullStopKeyword_3());
            		
            // InternalMyDsl.g:2783:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:2784:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:2784:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:2785:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertionEntityRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_65); 

            					newLeafNode(otherlv_4, grammarAccess.getAssertionEntityAccess().getEntityEntityCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,58,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getAssertionEntityAccess().getFullStopKeyword_5());
            		
            // InternalMyDsl.g:2800:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:2801:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:2801:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:2802:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertionEntityRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(otherlv_6, grammarAccess.getAssertionEntityAccess().getAttributeAttributeCrossReference_6_0());
            				

            }


            }

            // InternalMyDsl.g:2813:3: ( (lv_operator_7_0= ruleOperator ) )
            // InternalMyDsl.g:2814:4: (lv_operator_7_0= ruleOperator )
            {
            // InternalMyDsl.g:2814:4: (lv_operator_7_0= ruleOperator )
            // InternalMyDsl.g:2815:5: lv_operator_7_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getAssertionEntityAccess().getOperatorOperatorParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_34);
            lv_operator_7_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertionEntityRule());
            					}
            					add(
            						current,
            						"operator",
            						lv_operator_7_0,
            						"org.xtext.example.mydsl.MyDsl.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2832:3: ( (lv_value_8_0= ruleAttributeValue ) )
            // InternalMyDsl.g:2833:4: (lv_value_8_0= ruleAttributeValue )
            {
            // InternalMyDsl.g:2833:4: (lv_value_8_0= ruleAttributeValue )
            // InternalMyDsl.g:2834:5: lv_value_8_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getAssertionEntityAccess().getValueAttributeValueParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_69);
            lv_value_8_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertionEntityRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_8_0,
            						"org.xtext.example.mydsl.MyDsl.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,64,FOLLOW_27); 

            			newLeafNode(otherlv_9, grammarAccess.getAssertionEntityAccess().getRightSquareBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAssertionEntityAccess().getSemicolonKeyword_10());
            		

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
    // $ANTLR end "ruleAssertionEntity"


    // $ANTLR start "entryRuleAssertionRelation"
    // InternalMyDsl.g:2863:1: entryRuleAssertionRelation returns [EObject current=null] : iv_ruleAssertionRelation= ruleAssertionRelation EOF ;
    public final EObject entryRuleAssertionRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionRelation = null;


        try {
            // InternalMyDsl.g:2863:58: (iv_ruleAssertionRelation= ruleAssertionRelation EOF )
            // InternalMyDsl.g:2864:2: iv_ruleAssertionRelation= ruleAssertionRelation EOF
            {
             newCompositeNode(grammarAccess.getAssertionRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertionRelation=ruleAssertionRelation();

            state._fsp--;

             current =iv_ruleAssertionRelation; 
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
    // $ANTLR end "entryRuleAssertionRelation"


    // $ANTLR start "ruleAssertionRelation"
    // InternalMyDsl.g:2870:1: ruleAssertionRelation returns [EObject current=null] : (otherlv_0= 'assertRelationAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' ) ;
    public final EObject ruleAssertionRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_operator_7_0 = null;

        EObject lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2876:2: ( (otherlv_0= 'assertRelationAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' ) )
            // InternalMyDsl.g:2877:2: (otherlv_0= 'assertRelationAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' )
            {
            // InternalMyDsl.g:2877:2: (otherlv_0= 'assertRelationAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' )
            // InternalMyDsl.g:2878:3: otherlv_0= 'assertRelationAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_68); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertionRelationAccess().getAssertRelationAttributeKeyword_0());
            		
            otherlv_1=(Token)match(input,63,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertionRelationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:2886:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:2887:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:2887:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:2888:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertionRelationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_65); 

            					newLeafNode(otherlv_2, grammarAccess.getAssertionRelationAccess().getContextContextModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,58,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAssertionRelationAccess().getFullStopKeyword_3());
            		
            // InternalMyDsl.g:2903:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:2904:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:2904:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:2905:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertionRelationRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_65); 

            					newLeafNode(otherlv_4, grammarAccess.getAssertionRelationAccess().getRelationRelationCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,58,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getAssertionRelationAccess().getFullStopKeyword_5());
            		
            // InternalMyDsl.g:2920:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:2921:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:2921:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:2922:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertionRelationRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(otherlv_6, grammarAccess.getAssertionRelationAccess().getAttributeAttributeCrossReference_6_0());
            				

            }


            }

            // InternalMyDsl.g:2933:3: ( (lv_operator_7_0= ruleOperator ) )
            // InternalMyDsl.g:2934:4: (lv_operator_7_0= ruleOperator )
            {
            // InternalMyDsl.g:2934:4: (lv_operator_7_0= ruleOperator )
            // InternalMyDsl.g:2935:5: lv_operator_7_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getAssertionRelationAccess().getOperatorOperatorParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_34);
            lv_operator_7_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertionRelationRule());
            					}
            					add(
            						current,
            						"operator",
            						lv_operator_7_0,
            						"org.xtext.example.mydsl.MyDsl.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2952:3: ( (lv_value_8_0= ruleAttributeValue ) )
            // InternalMyDsl.g:2953:4: (lv_value_8_0= ruleAttributeValue )
            {
            // InternalMyDsl.g:2953:4: (lv_value_8_0= ruleAttributeValue )
            // InternalMyDsl.g:2954:5: lv_value_8_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getAssertionRelationAccess().getValueAttributeValueParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_69);
            lv_value_8_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertionRelationRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_8_0,
            						"org.xtext.example.mydsl.MyDsl.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,64,FOLLOW_27); 

            			newLeafNode(otherlv_9, grammarAccess.getAssertionRelationAccess().getRightSquareBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAssertionRelationAccess().getSemicolonKeyword_10());
            		

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
    // $ANTLR end "ruleAssertionRelation"


    // $ANTLR start "entryRuleParams"
    // InternalMyDsl.g:2983:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // InternalMyDsl.g:2983:47: (iv_ruleParams= ruleParams EOF )
            // InternalMyDsl.g:2984:2: iv_ruleParams= ruleParams EOF
            {
             newCompositeNode(grammarAccess.getParamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParams=ruleParams();

            state._fsp--;

             current =iv_ruleParams; 
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
    // $ANTLR end "entryRuleParams"


    // $ANTLR start "ruleParams"
    // InternalMyDsl.g:2990:1: ruleParams returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) )? (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2996:2: ( ( ( (otherlv_0= RULE_ID ) )? (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalMyDsl.g:2997:2: ( ( (otherlv_0= RULE_ID ) )? (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalMyDsl.g:2997:2: ( ( (otherlv_0= RULE_ID ) )? (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalMyDsl.g:2998:3: ( (otherlv_0= RULE_ID ) )? (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalMyDsl.g:2998:3: ( (otherlv_0= RULE_ID ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalMyDsl.g:2999:4: (otherlv_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2999:4: (otherlv_0= RULE_ID )
                    // InternalMyDsl.g:3000:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParamsRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_70); 

                    					newLeafNode(otherlv_0, grammarAccess.getParamsAccess().getParamsParameterCrossReference_0_0());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:3011:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==40) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalMyDsl.g:3012:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,40,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParamsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:3016:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalMyDsl.g:3017:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalMyDsl.g:3017:5: (otherlv_2= RULE_ID )
            	    // InternalMyDsl.g:3018:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getParamsRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_70); 

            	    						newLeafNode(otherlv_2, grammarAccess.getParamsAccess().getParamsParameterCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
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
    // $ANTLR end "ruleParams"


    // $ANTLR start "entryRuleConstantParams"
    // InternalMyDsl.g:3034:1: entryRuleConstantParams returns [EObject current=null] : iv_ruleConstantParams= ruleConstantParams EOF ;
    public final EObject entryRuleConstantParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantParams = null;


        try {
            // InternalMyDsl.g:3034:55: (iv_ruleConstantParams= ruleConstantParams EOF )
            // InternalMyDsl.g:3035:2: iv_ruleConstantParams= ruleConstantParams EOF
            {
             newCompositeNode(grammarAccess.getConstantParamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantParams=ruleConstantParams();

            state._fsp--;

             current =iv_ruleConstantParams; 
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
    // $ANTLR end "entryRuleConstantParams"


    // $ANTLR start "ruleConstantParams"
    // InternalMyDsl.g:3041:1: ruleConstantParams returns [EObject current=null] : ( ( (lv_values_0_0= ruleAttributeValue ) )? (otherlv_1= ',' ( (lv_values_2_0= ruleAttributeValue ) ) )* ) ;
    public final EObject ruleConstantParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3047:2: ( ( ( (lv_values_0_0= ruleAttributeValue ) )? (otherlv_1= ',' ( (lv_values_2_0= ruleAttributeValue ) ) )* ) )
            // InternalMyDsl.g:3048:2: ( ( (lv_values_0_0= ruleAttributeValue ) )? (otherlv_1= ',' ( (lv_values_2_0= ruleAttributeValue ) ) )* )
            {
            // InternalMyDsl.g:3048:2: ( ( (lv_values_0_0= ruleAttributeValue ) )? (otherlv_1= ',' ( (lv_values_2_0= ruleAttributeValue ) ) )* )
            // InternalMyDsl.g:3049:3: ( (lv_values_0_0= ruleAttributeValue ) )? (otherlv_1= ',' ( (lv_values_2_0= ruleAttributeValue ) ) )*
            {
            // InternalMyDsl.g:3049:3: ( (lv_values_0_0= ruleAttributeValue ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=RULE_STRING && LA81_0<=RULE_NUMBER)||(LA81_0>=27 && LA81_0<=28)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalMyDsl.g:3050:4: (lv_values_0_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:3050:4: (lv_values_0_0= ruleAttributeValue )
                    // InternalMyDsl.g:3051:5: lv_values_0_0= ruleAttributeValue
                    {

                    					newCompositeNode(grammarAccess.getConstantParamsAccess().getValuesAttributeValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_70);
                    lv_values_0_0=ruleAttributeValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstantParamsRule());
                    					}
                    					add(
                    						current,
                    						"values",
                    						lv_values_0_0,
                    						"org.xtext.example.mydsl.MyDsl.AttributeValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:3068:3: (otherlv_1= ',' ( (lv_values_2_0= ruleAttributeValue ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==40) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalMyDsl.g:3069:4: otherlv_1= ',' ( (lv_values_2_0= ruleAttributeValue ) )
            	    {
            	    otherlv_1=(Token)match(input,40,FOLLOW_34); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConstantParamsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:3073:4: ( (lv_values_2_0= ruleAttributeValue ) )
            	    // InternalMyDsl.g:3074:5: (lv_values_2_0= ruleAttributeValue )
            	    {
            	    // InternalMyDsl.g:3074:5: (lv_values_2_0= ruleAttributeValue )
            	    // InternalMyDsl.g:3075:6: lv_values_2_0= ruleAttributeValue
            	    {

            	    						newCompositeNode(grammarAccess.getConstantParamsAccess().getValuesAttributeValueParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_70);
            	    lv_values_2_0=ruleAttributeValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstantParamsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.AttributeValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
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
    // $ANTLR end "ruleConstantParams"


    // $ANTLR start "entryRuleParameter"
    // InternalMyDsl.g:3097:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMyDsl.g:3097:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMyDsl.g:3098:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMyDsl.g:3104:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' )? ( (lv_value_3_0= ruleAttributeValue ) )? otherlv_4= ';' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3110:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' )? ( (lv_value_3_0= ruleAttributeValue ) )? otherlv_4= ';' ) )
            // InternalMyDsl.g:3111:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' )? ( (lv_value_3_0= ruleAttributeValue ) )? otherlv_4= ';' )
            {
            // InternalMyDsl.g:3111:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' )? ( (lv_value_3_0= ruleAttributeValue ) )? otherlv_4= ';' )
            // InternalMyDsl.g:3112:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' )? ( (lv_value_3_0= ruleAttributeValue ) )? otherlv_4= ';'
            {
            // InternalMyDsl.g:3112:3: ( (lv_type_0_0= ruleType ) )
            // InternalMyDsl.g:3113:4: (lv_type_0_0= ruleType )
            {
            // InternalMyDsl.g:3113:4: (lv_type_0_0= ruleType )
            // InternalMyDsl.g:3114:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					add(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3131:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3132:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3132:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3133:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:3149:3: (otherlv_2= '=' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==25) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalMyDsl.g:3150:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEqualsSignKeyword_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3155:3: ( (lv_value_3_0= ruleAttributeValue ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=RULE_STRING && LA84_0<=RULE_NUMBER)||(LA84_0>=27 && LA84_0<=28)) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalMyDsl.g:3156:4: (lv_value_3_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:3156:4: (lv_value_3_0= ruleAttributeValue )
                    // InternalMyDsl.g:3157:5: lv_value_3_0= ruleAttributeValue
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getValueAttributeValueParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_value_3_0=ruleAttributeValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"org.xtext.example.mydsl.MyDsl.AttributeValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterConstraint"
    // InternalMyDsl.g:3182:1: entryRuleParameterConstraint returns [EObject current=null] : iv_ruleParameterConstraint= ruleParameterConstraint EOF ;
    public final EObject entryRuleParameterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterConstraint = null;


        try {
            // InternalMyDsl.g:3182:60: (iv_ruleParameterConstraint= ruleParameterConstraint EOF )
            // InternalMyDsl.g:3183:2: iv_ruleParameterConstraint= ruleParameterConstraint EOF
            {
             newCompositeNode(grammarAccess.getParameterConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterConstraint=ruleParameterConstraint();

            state._fsp--;

             current =iv_ruleParameterConstraint; 
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
    // $ANTLR end "entryRuleParameterConstraint"


    // $ANTLR start "ruleParameterConstraint"
    // InternalMyDsl.g:3189:1: ruleParameterConstraint returns [EObject current=null] : (otherlv_0= 'assertParameter' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_value_4_0= ruleAttributeValue ) ) otherlv_5= ']' otherlv_6= 'in' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) ;
    public final EObject ruleParameterConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_operator_3_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3195:2: ( (otherlv_0= 'assertParameter' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_value_4_0= ruleAttributeValue ) ) otherlv_5= ']' otherlv_6= 'in' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) )
            // InternalMyDsl.g:3196:2: (otherlv_0= 'assertParameter' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_value_4_0= ruleAttributeValue ) ) otherlv_5= ']' otherlv_6= 'in' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            {
            // InternalMyDsl.g:3196:2: (otherlv_0= 'assertParameter' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_value_4_0= ruleAttributeValue ) ) otherlv_5= ']' otherlv_6= 'in' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            // InternalMyDsl.g:3197:3: otherlv_0= 'assertParameter' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_value_4_0= ruleAttributeValue ) ) otherlv_5= ']' otherlv_6= 'in' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_68); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterConstraintAccess().getAssertParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,63,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterConstraintAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:3205:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:3206:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:3206:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:3207:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterConstraintRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(otherlv_2, grammarAccess.getParameterConstraintAccess().getParamParameterCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:3218:3: ( (lv_operator_3_0= ruleOperator ) )
            // InternalMyDsl.g:3219:4: (lv_operator_3_0= ruleOperator )
            {
            // InternalMyDsl.g:3219:4: (lv_operator_3_0= ruleOperator )
            // InternalMyDsl.g:3220:5: lv_operator_3_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getParameterConstraintAccess().getOperatorOperatorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_operator_3_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterConstraintRule());
            					}
            					add(
            						current,
            						"operator",
            						lv_operator_3_0,
            						"org.xtext.example.mydsl.MyDsl.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3237:3: ( (lv_value_4_0= ruleAttributeValue ) )
            // InternalMyDsl.g:3238:4: (lv_value_4_0= ruleAttributeValue )
            {
            // InternalMyDsl.g:3238:4: (lv_value_4_0= ruleAttributeValue )
            // InternalMyDsl.g:3239:5: lv_value_4_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getParameterConstraintAccess().getValueAttributeValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_69);
            lv_value_4_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterConstraintRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.xtext.example.mydsl.MyDsl.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,64,FOLLOW_71); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterConstraintAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,67,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterConstraintAccess().getInKeyword_6());
            		
            // InternalMyDsl.g:3264:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:3265:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:3265:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:3266:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterConstraintRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_7, grammarAccess.getParameterConstraintAccess().getObjectObjectCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getParameterConstraintAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleParameterConstraint"


    // $ANTLR start "entryRuleOperator"
    // InternalMyDsl.g:3285:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalMyDsl.g:3285:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalMyDsl.g:3286:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalMyDsl.g:3292:1: ruleOperator returns [EObject current=null] : ( ( (lv_greater_0_0= '>' ) ) | ( (lv_smaller_1_0= '<' ) ) | ( (lv_greaterequals_2_0= '>=' ) ) | ( (lv_smallerequals_3_0= '<=' ) ) | ( (lv_equals_4_0= '==' ) ) | ( (lv_notequals_5_0= '!=' ) ) ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token lv_greater_0_0=null;
        Token lv_smaller_1_0=null;
        Token lv_greaterequals_2_0=null;
        Token lv_smallerequals_3_0=null;
        Token lv_equals_4_0=null;
        Token lv_notequals_5_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3298:2: ( ( ( (lv_greater_0_0= '>' ) ) | ( (lv_smaller_1_0= '<' ) ) | ( (lv_greaterequals_2_0= '>=' ) ) | ( (lv_smallerequals_3_0= '<=' ) ) | ( (lv_equals_4_0= '==' ) ) | ( (lv_notequals_5_0= '!=' ) ) ) )
            // InternalMyDsl.g:3299:2: ( ( (lv_greater_0_0= '>' ) ) | ( (lv_smaller_1_0= '<' ) ) | ( (lv_greaterequals_2_0= '>=' ) ) | ( (lv_smallerequals_3_0= '<=' ) ) | ( (lv_equals_4_0= '==' ) ) | ( (lv_notequals_5_0= '!=' ) ) )
            {
            // InternalMyDsl.g:3299:2: ( ( (lv_greater_0_0= '>' ) ) | ( (lv_smaller_1_0= '<' ) ) | ( (lv_greaterequals_2_0= '>=' ) ) | ( (lv_smallerequals_3_0= '<=' ) ) | ( (lv_equals_4_0= '==' ) ) | ( (lv_notequals_5_0= '!=' ) ) )
            int alt85=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt85=1;
                }
                break;
            case 31:
                {
                alt85=2;
                }
                break;
            case 32:
                {
                alt85=3;
                }
                break;
            case 33:
                {
                alt85=4;
                }
                break;
            case 34:
                {
                alt85=5;
                }
                break;
            case 35:
                {
                alt85=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalMyDsl.g:3300:3: ( (lv_greater_0_0= '>' ) )
                    {
                    // InternalMyDsl.g:3300:3: ( (lv_greater_0_0= '>' ) )
                    // InternalMyDsl.g:3301:4: (lv_greater_0_0= '>' )
                    {
                    // InternalMyDsl.g:3301:4: (lv_greater_0_0= '>' )
                    // InternalMyDsl.g:3302:5: lv_greater_0_0= '>'
                    {
                    lv_greater_0_0=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_greater_0_0, grammarAccess.getOperatorAccess().getGreaterGreaterThanSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(current, "greater", true, ">");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3315:3: ( (lv_smaller_1_0= '<' ) )
                    {
                    // InternalMyDsl.g:3315:3: ( (lv_smaller_1_0= '<' ) )
                    // InternalMyDsl.g:3316:4: (lv_smaller_1_0= '<' )
                    {
                    // InternalMyDsl.g:3316:4: (lv_smaller_1_0= '<' )
                    // InternalMyDsl.g:3317:5: lv_smaller_1_0= '<'
                    {
                    lv_smaller_1_0=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_smaller_1_0, grammarAccess.getOperatorAccess().getSmallerLessThanSignKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(current, "smaller", true, "<");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3330:3: ( (lv_greaterequals_2_0= '>=' ) )
                    {
                    // InternalMyDsl.g:3330:3: ( (lv_greaterequals_2_0= '>=' ) )
                    // InternalMyDsl.g:3331:4: (lv_greaterequals_2_0= '>=' )
                    {
                    // InternalMyDsl.g:3331:4: (lv_greaterequals_2_0= '>=' )
                    // InternalMyDsl.g:3332:5: lv_greaterequals_2_0= '>='
                    {
                    lv_greaterequals_2_0=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_greaterequals_2_0, grammarAccess.getOperatorAccess().getGreaterequalsGreaterThanSignEqualsSignKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(current, "greaterequals", true, ">=");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3345:3: ( (lv_smallerequals_3_0= '<=' ) )
                    {
                    // InternalMyDsl.g:3345:3: ( (lv_smallerequals_3_0= '<=' ) )
                    // InternalMyDsl.g:3346:4: (lv_smallerequals_3_0= '<=' )
                    {
                    // InternalMyDsl.g:3346:4: (lv_smallerequals_3_0= '<=' )
                    // InternalMyDsl.g:3347:5: lv_smallerequals_3_0= '<='
                    {
                    lv_smallerequals_3_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_smallerequals_3_0, grammarAccess.getOperatorAccess().getSmallerequalsLessThanSignEqualsSignKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(current, "smallerequals", true, "<=");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3360:3: ( (lv_equals_4_0= '==' ) )
                    {
                    // InternalMyDsl.g:3360:3: ( (lv_equals_4_0= '==' ) )
                    // InternalMyDsl.g:3361:4: (lv_equals_4_0= '==' )
                    {
                    // InternalMyDsl.g:3361:4: (lv_equals_4_0= '==' )
                    // InternalMyDsl.g:3362:5: lv_equals_4_0= '=='
                    {
                    lv_equals_4_0=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_equals_4_0, grammarAccess.getOperatorAccess().getEqualsEqualsSignEqualsSignKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(current, "equals", true, "==");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3375:3: ( (lv_notequals_5_0= '!=' ) )
                    {
                    // InternalMyDsl.g:3375:3: ( (lv_notequals_5_0= '!=' ) )
                    // InternalMyDsl.g:3376:4: (lv_notequals_5_0= '!=' )
                    {
                    // InternalMyDsl.g:3376:4: (lv_notequals_5_0= '!=' )
                    // InternalMyDsl.g:3377:5: lv_notequals_5_0= '!='
                    {
                    lv_notequals_5_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_notequals_5_0, grammarAccess.getOperatorAccess().getNotequalsExclamationMarkEqualsSignKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(current, "notequals", true, "!=");
                    				

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleClock"
    // InternalMyDsl.g:3393:1: entryRuleClock returns [EObject current=null] : iv_ruleClock= ruleClock EOF ;
    public final EObject entryRuleClock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClock = null;


        try {
            // InternalMyDsl.g:3393:46: (iv_ruleClock= ruleClock EOF )
            // InternalMyDsl.g:3394:2: iv_ruleClock= ruleClock EOF
            {
             newCompositeNode(grammarAccess.getClockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClock=ruleClock();

            state._fsp--;

             current =iv_ruleClock; 
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
    // $ANTLR end "entryRuleClock"


    // $ANTLR start "ruleClock"
    // InternalMyDsl.g:3400:1: ruleClock returns [EObject current=null] : (otherlv_0= 'clock' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleClock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3406:2: ( (otherlv_0= 'clock' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:3407:2: (otherlv_0= 'clock' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:3407:2: (otherlv_0= 'clock' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMyDsl.g:3408:3: otherlv_0= 'clock' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getClockAccess().getClockKeyword_0());
            		
            // InternalMyDsl.g:3412:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3413:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3413:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3414:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClockAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getClockAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleClock"


    // $ANTLR start "entryRuleObjectType"
    // InternalMyDsl.g:3438:1: entryRuleObjectType returns [EObject current=null] : iv_ruleObjectType= ruleObjectType EOF ;
    public final EObject entryRuleObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectType = null;


        try {
            // InternalMyDsl.g:3438:51: (iv_ruleObjectType= ruleObjectType EOF )
            // InternalMyDsl.g:3439:2: iv_ruleObjectType= ruleObjectType EOF
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
    // InternalMyDsl.g:3445:1: ruleObjectType returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObjectType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3451:2: ( (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:3452:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:3452:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:3453:3: otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectTypeAccess().getObjectKeyword_0());
            		
            // InternalMyDsl.g:3457:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3458:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3458:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3459:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:3479:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalMyDsl.g:3479:47: (iv_ruleObject= ruleObject EOF )
            // InternalMyDsl.g:3480:2: iv_ruleObject= ruleObject EOF
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
    // InternalMyDsl.g:3486:1: ruleObject returns [EObject current=null] : ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_object_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3492:2: ( ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:3493:2: ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:3493:2: ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMyDsl.g:3494:3: ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalMyDsl.g:3494:3: ( (lv_object_0_0= ruleObjectType ) )
            // InternalMyDsl.g:3495:4: (lv_object_0_0= ruleObjectType )
            {
            // InternalMyDsl.g:3495:4: (lv_object_0_0= ruleObjectType )
            // InternalMyDsl.g:3496:5: lv_object_0_0= ruleObjectType
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getObjectObjectTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalMyDsl.g:3513:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3514:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3514:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3515:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_2); 

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
    // InternalMyDsl.g:3539:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMyDsl.g:3539:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyDsl.g:3540:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalMyDsl.g:3546:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_messages_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3552:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:3553:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:3553:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            // InternalMyDsl.g:3554:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalMyDsl.g:3558:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3559:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3559:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3560:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3580:3: ( (lv_messages_3_0= ruleMessage ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==44) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalMyDsl.g:3581:4: (lv_messages_3_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:3581:4: (lv_messages_3_0= ruleMessage )
            	    // InternalMyDsl.g:3582:5: lv_messages_3_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintAccess().getMessagesMessageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_72);
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
            	    break loop86;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:3607:1: entryRuleAlt returns [EObject current=null] : iv_ruleAlt= ruleAlt EOF ;
    public final EObject entryRuleAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlt = null;


        try {
            // InternalMyDsl.g:3607:44: (iv_ruleAlt= ruleAlt EOF )
            // InternalMyDsl.g:3608:2: iv_ruleAlt= ruleAlt EOF
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
    // InternalMyDsl.g:3614:1: ruleAlt returns [EObject current=null] : (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* ) ;
    public final EObject ruleAlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3620:2: ( (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* ) )
            // InternalMyDsl.g:3621:2: (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* )
            {
            // InternalMyDsl.g:3621:2: (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* )
            // InternalMyDsl.g:3622:3: otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )*
            {
            otherlv_0=(Token)match(input,70,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getAltAccess().getAltKeyword_0());
            		
            // InternalMyDsl.g:3626:3: ( (lv_expressions_1_0= ruleExpression ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==39) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalMyDsl.g:3627:4: (lv_expressions_1_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:3627:4: (lv_expressions_1_0= ruleExpression )
            	    // InternalMyDsl.g:3628:5: lv_expressions_1_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getAltAccess().getExpressionsExpressionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_73);
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
            	    break loop87;
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


    // $ANTLR start "entryRuleAltCondition"
    // InternalMyDsl.g:3649:1: entryRuleAltCondition returns [EObject current=null] : iv_ruleAltCondition= ruleAltCondition EOF ;
    public final EObject entryRuleAltCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAltCondition = null;


        try {
            // InternalMyDsl.g:3649:53: (iv_ruleAltCondition= ruleAltCondition EOF )
            // InternalMyDsl.g:3650:2: iv_ruleAltCondition= ruleAltCondition EOF
            {
             newCompositeNode(grammarAccess.getAltConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAltCondition=ruleAltCondition();

            state._fsp--;

             current =iv_ruleAltCondition; 
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
    // $ANTLR end "entryRuleAltCondition"


    // $ANTLR start "ruleAltCondition"
    // InternalMyDsl.g:3656:1: ruleAltCondition returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleAttributeValue ) ) ) | ( (lv_else_3_0= 'else' ) ) ) ;
    public final EObject ruleAltCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_else_3_0=null;
        EObject lv_operator_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3662:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleAttributeValue ) ) ) | ( (lv_else_3_0= 'else' ) ) ) )
            // InternalMyDsl.g:3663:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleAttributeValue ) ) ) | ( (lv_else_3_0= 'else' ) ) )
            {
            // InternalMyDsl.g:3663:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleAttributeValue ) ) ) | ( (lv_else_3_0= 'else' ) ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_ID) ) {
                alt88=1;
            }
            else if ( (LA88_0==71) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalMyDsl.g:3664:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleAttributeValue ) ) )
                    {
                    // InternalMyDsl.g:3664:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleAttributeValue ) ) )
                    // InternalMyDsl.g:3665:4: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleAttributeValue ) )
                    {
                    // InternalMyDsl.g:3665:4: ( (otherlv_0= RULE_ID ) )
                    // InternalMyDsl.g:3666:5: (otherlv_0= RULE_ID )
                    {
                    // InternalMyDsl.g:3666:5: (otherlv_0= RULE_ID )
                    // InternalMyDsl.g:3667:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAltConditionRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_55); 

                    						newLeafNode(otherlv_0, grammarAccess.getAltConditionAccess().getParamParameterCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:3678:4: ( (lv_operator_1_0= ruleOperator ) )
                    // InternalMyDsl.g:3679:5: (lv_operator_1_0= ruleOperator )
                    {
                    // InternalMyDsl.g:3679:5: (lv_operator_1_0= ruleOperator )
                    // InternalMyDsl.g:3680:6: lv_operator_1_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getAltConditionAccess().getOperatorOperatorParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_operator_1_0=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAltConditionRule());
                    						}
                    						add(
                    							current,
                    							"operator",
                    							lv_operator_1_0,
                    							"org.xtext.example.mydsl.MyDsl.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:3697:4: ( (lv_value_2_0= ruleAttributeValue ) )
                    // InternalMyDsl.g:3698:5: (lv_value_2_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:3698:5: (lv_value_2_0= ruleAttributeValue )
                    // InternalMyDsl.g:3699:6: lv_value_2_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getAltConditionAccess().getValueAttributeValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAltConditionRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.xtext.example.mydsl.MyDsl.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3718:3: ( (lv_else_3_0= 'else' ) )
                    {
                    // InternalMyDsl.g:3718:3: ( (lv_else_3_0= 'else' ) )
                    // InternalMyDsl.g:3719:4: (lv_else_3_0= 'else' )
                    {
                    // InternalMyDsl.g:3719:4: (lv_else_3_0= 'else' )
                    // InternalMyDsl.g:3720:5: lv_else_3_0= 'else'
                    {
                    lv_else_3_0=(Token)match(input,71,FOLLOW_2); 

                    					newLeafNode(lv_else_3_0, grammarAccess.getAltConditionAccess().getElseElseKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAltConditionRule());
                    					}
                    					setWithLastConsumed(current, "else", true, "else");
                    				

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
    // $ANTLR end "ruleAltCondition"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:3736:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:3736:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:3737:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:3743:1: ruleExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_altCondition_1_0= ruleAltCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) )* otherlv_5= '}' ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_altCondition_1_0 = null;

        EObject lv_messages_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3749:2: ( (otherlv_0= '(' ( (lv_altCondition_1_0= ruleAltCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:3750:2: (otherlv_0= '(' ( (lv_altCondition_1_0= ruleAltCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:3750:2: (otherlv_0= '(' ( (lv_altCondition_1_0= ruleAltCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) )* otherlv_5= '}' )
            // InternalMyDsl.g:3751:3: otherlv_0= '(' ( (lv_altCondition_1_0= ruleAltCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_74); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:3755:3: ( (lv_altCondition_1_0= ruleAltCondition ) )
            // InternalMyDsl.g:3756:4: (lv_altCondition_1_0= ruleAltCondition )
            {
            // InternalMyDsl.g:3756:4: (lv_altCondition_1_0= ruleAltCondition )
            // InternalMyDsl.g:3757:5: lv_altCondition_1_0= ruleAltCondition
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getAltConditionAltConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_altCondition_1_0=ruleAltCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					add(
            						current,
            						"altCondition",
            						lv_altCondition_1_0,
            						"org.xtext.example.mydsl.MyDsl.AltCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_72); 

            			newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:3782:3: ( (lv_messages_4_0= ruleMessage ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==44) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalMyDsl.g:3783:4: (lv_messages_4_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:3783:4: (lv_messages_4_0= ruleMessage )
            	    // InternalMyDsl.g:3784:5: lv_messages_4_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getExpressionAccess().getMessagesMessageParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_72);
            	    lv_messages_4_0=ruleMessage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"messages",
            	    						lv_messages_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Message");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalMyDsl.g:3809:1: entryRulePar returns [EObject current=null] : iv_rulePar= rulePar EOF ;
    public final EObject entryRulePar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePar = null;


        try {
            // InternalMyDsl.g:3809:44: (iv_rulePar= rulePar EOF )
            // InternalMyDsl.g:3810:2: iv_rulePar= rulePar EOF
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
    // InternalMyDsl.g:3816:1: rulePar returns [EObject current=null] : (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' ) ;
    public final EObject rulePar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parexpression_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3822:2: ( (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:3823:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:3823:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' )
            // InternalMyDsl.g:3824:3: otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getParAccess().getParKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_75); 

            			newLeafNode(otherlv_1, grammarAccess.getParAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:3832:3: ( (lv_parexpression_2_0= ruleParExpression ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==73) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalMyDsl.g:3833:4: (lv_parexpression_2_0= ruleParExpression )
            	    {
            	    // InternalMyDsl.g:3833:4: (lv_parexpression_2_0= ruleParExpression )
            	    // InternalMyDsl.g:3834:5: lv_parexpression_2_0= ruleParExpression
            	    {

            	    					newCompositeNode(grammarAccess.getParAccess().getParexpressionParExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_75);
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
            	    break loop90;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:3859:1: entryRuleParExpression returns [EObject current=null] : iv_ruleParExpression= ruleParExpression EOF ;
    public final EObject entryRuleParExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParExpression = null;


        try {
            // InternalMyDsl.g:3859:54: (iv_ruleParExpression= ruleParExpression EOF )
            // InternalMyDsl.g:3860:2: iv_ruleParExpression= ruleParExpression EOF
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
    // InternalMyDsl.g:3866:1: ruleParExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) ;
    public final EObject ruleParExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_messages_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3872:2: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:3873:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:3873:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            // InternalMyDsl.g:3874:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getParExpressionAccess().getCaseKeyword_0());
            		
            // InternalMyDsl.g:3878:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3879:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3879:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3880:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getParExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3900:3: ( (lv_messages_3_0= ruleMessage ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==44) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalMyDsl.g:3901:4: (lv_messages_3_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:3901:4: (lv_messages_3_0= ruleMessage )
            	    // InternalMyDsl.g:3902:5: lv_messages_3_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getParExpressionAccess().getMessagesMessageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_72);
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
            	    break loop91;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:3927:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalMyDsl.g:3927:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalMyDsl.g:3928:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalMyDsl.g:3934:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' ) ;
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
            // InternalMyDsl.g:3940:2: ( (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' ) )
            // InternalMyDsl.g:3941:2: (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' )
            {
            // InternalMyDsl.g:3941:2: (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' )
            // InternalMyDsl.g:3942:3: otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:3950:3: ( (lv_min_2_0= RULE_NUMBER ) )
            // InternalMyDsl.g:3951:4: (lv_min_2_0= RULE_NUMBER )
            {
            // InternalMyDsl.g:3951:4: (lv_min_2_0= RULE_NUMBER )
            // InternalMyDsl.g:3952:5: lv_min_2_0= RULE_NUMBER
            {
            lv_min_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_38); 

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

            otherlv_3=(Token)match(input,40,FOLLOW_56); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:3972:3: ( (lv_max_4_0= RULE_NUMBER ) )
            // InternalMyDsl.g:3973:4: (lv_max_4_0= RULE_NUMBER )
            {
            // InternalMyDsl.g:3973:4: (lv_max_4_0= RULE_NUMBER )
            // InternalMyDsl.g:3974:5: lv_max_4_0= RULE_NUMBER
            {
            lv_max_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_39); 

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

            otherlv_5=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_72); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:3998:3: ( (lv_messages_7_0= ruleMessage ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==44) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalMyDsl.g:3999:4: (lv_messages_7_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:3999:4: (lv_messages_7_0= ruleMessage )
            	    // InternalMyDsl.g:4000:5: lv_messages_7_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getLoopAccess().getMessagesMessageParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_72);
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
            	    break loop92;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:4025:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'string' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4031:2: ( ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'string' ) ) )
            // InternalMyDsl.g:4032:2: ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'string' ) )
            {
            // InternalMyDsl.g:4032:2: ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'string' ) )
            int alt93=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt93=1;
                }
                break;
            case 22:
                {
                alt93=2;
                }
                break;
            case 76:
                {
                alt93=3;
                }
                break;
            case 23:
                {
                alt93=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalMyDsl.g:4033:3: (enumLiteral_0= 'integer' )
                    {
                    // InternalMyDsl.g:4033:3: (enumLiteral_0= 'integer' )
                    // InternalMyDsl.g:4034:4: enumLiteral_0= 'integer'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4041:3: (enumLiteral_1= 'float' )
                    {
                    // InternalMyDsl.g:4041:3: (enumLiteral_1= 'float' )
                    // InternalMyDsl.g:4042:4: enumLiteral_1= 'float'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:4049:3: (enumLiteral_2= 'bool' )
                    {
                    // InternalMyDsl.g:4049:3: (enumLiteral_2= 'bool' )
                    // InternalMyDsl.g:4050:4: enumLiteral_2= 'bool'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBoolEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBoolEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:4057:3: (enumLiteral_3= 'string' )
                    {
                    // InternalMyDsl.g:4057:3: (enumLiteral_3= 'string' )
                    // InternalMyDsl.g:4058:4: enumLiteral_3= 'string'
                    {
                    enumLiteral_3=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleType"

    // Delegated rules


    protected DFA50 dfa50 = new DFA50(this);
    protected DFA62 dfa62 = new DFA62(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\3\4\1\36\1\uffff\1\36\14\7\2\uffff";
    static final String dfa_3s = "\1\66\1\47\1\4\1\43\1\uffff\1\43\14\7\2\uffff";
    static final String dfa_4s = "\4\uffff\1\2\15\uffff\2\1";
    static final String dfa_5s = "\24\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\11\uffff\2\4\12\uffff\1\4\14\uffff\1\2\1\4\13\uffff\2\4\1\1",
            "\1\5\42\uffff\1\2",
            "\1\5",
            "\1\6\1\7\1\10\1\11\1\12\1\13",
            "",
            "\1\14\1\15\1\16\1\17\1\20\1\21",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1766:3: ( (lv_constraintexp_18_0= ruleClockConstraintExpression ) )?";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\11\uffff\1\1\1\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\36\6\7\1\4\1\uffff";
    static final String dfa_10s = "\1\66\1\uffff\1\43\6\7\1\67\1\uffff";
    static final String dfa_11s = "\1\uffff\1\1\10\uffff\1\2";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\42\uffff\1\1\16\uffff\1\1",
            "",
            "\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\1\11\uffff\2\1\12\uffff\1\1\14\uffff\3\1\12\uffff\3\1\1\12",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2007:2: ( ( ( (lv_not_0_0= 'not' ) )? (otherlv_1= '(' )? ( (lv_lclockconstraint_2_0= ruleClockConstraint ) ) (otherlv_3= ')' )? ) | ( ( (lv_lclockconstraint_4_0= ruleClockConstraint ) ) otherlv_5= 'and' ( (lv_rclockconstraint_6_0= ruleClockConstraint ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0008080000CDC012L,0x0000000000001830L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0008080000CDC002L,0x0000000000001830L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008080000CD8002L,0x0000000000001830L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0008080000CC8002L,0x0000000000001830L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0008080000C88002L,0x0000000000001830L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0008080000C08002L,0x0000000000001830L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0008080000C08002L,0x0000000000001810L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0008080000008002L,0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0008080000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000008002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000005000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000042000008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001E00010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001C00010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000001E0000E0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000001C0000E0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000FD80000E0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000F980000E0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000F180000E0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000E180000E0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000C180000E0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000008180000E0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000180000E0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x7B00100000008000L,0x0000000000000546L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000300180000F0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000E00000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000C00000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x007E01800400C010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x007C01800400C010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x007801800400C010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x007001800400C010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x007000800400C010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x006000800400C010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0060008004008010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000004008000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000004000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000FC0000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0040008000000010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000E00004000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000C00004000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000030000000010L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x00000300180000E0L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x00000200180000E0L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});

}