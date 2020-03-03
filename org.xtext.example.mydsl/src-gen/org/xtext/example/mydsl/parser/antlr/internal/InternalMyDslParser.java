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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_REAL", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'{'", "'}'", "'import'", "'from'", "'contextmodel'", "'contextfragment'", "'attribute'", "'int'", "'float'", "'string'", "'boolean'", "'='", "';'", "'true'", "'false'", "'attributeconstraint'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'entity'", "'entityconstraint'", "'relation'", "'('", "','", "')'", "'relationconstraint'", "'scenario'", "'message'", "'required'", "'fail'", "'strict'", "'->'", "'past'", "'future'", "'constraint'", "'match'", "'appear'", "'.'", "'disappear'", "'changeTo'", "'relationChangeTo'", "'assertEntityAttribute'", "'['", "']'", "'assertRelationAttribute'", "'assertParameter'", "'in'", "'object'", "'alt'", "'else'", "'par'", "'case'", "'loop'", "'integer'", "'bool'"
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
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
    // InternalMyDsl.g:72:1: ruleDomain returns [EObject current=null] : ( ( (lv_specification_0_0= 'specification' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '{' )? ( (lv_includes_3_0= ruleInclude ) )* ( (lv_contextmodels_4_0= ruleContextModel ) )* ( (lv_contextfragments_5_0= ruleContextFragment ) )* ( (lv_objects_6_0= ruleObject ) )* ( (lv_parameters_7_0= ruleParameter ) )* ( (lv_constraints_8_0= ruleConstraint ) )* ( (lv_scenarios_9_0= ruleScenario ) )* (otherlv_10= '}' )? ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token lv_specification_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_10=null;
        EObject lv_includes_3_0 = null;

        EObject lv_contextmodels_4_0 = null;

        EObject lv_contextfragments_5_0 = null;

        EObject lv_objects_6_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_constraints_8_0 = null;

        EObject lv_scenarios_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( ( (lv_specification_0_0= 'specification' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '{' )? ( (lv_includes_3_0= ruleInclude ) )* ( (lv_contextmodels_4_0= ruleContextModel ) )* ( (lv_contextfragments_5_0= ruleContextFragment ) )* ( (lv_objects_6_0= ruleObject ) )* ( (lv_parameters_7_0= ruleParameter ) )* ( (lv_constraints_8_0= ruleConstraint ) )* ( (lv_scenarios_9_0= ruleScenario ) )* (otherlv_10= '}' )? ) )
            // InternalMyDsl.g:79:2: ( ( (lv_specification_0_0= 'specification' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '{' )? ( (lv_includes_3_0= ruleInclude ) )* ( (lv_contextmodels_4_0= ruleContextModel ) )* ( (lv_contextfragments_5_0= ruleContextFragment ) )* ( (lv_objects_6_0= ruleObject ) )* ( (lv_parameters_7_0= ruleParameter ) )* ( (lv_constraints_8_0= ruleConstraint ) )* ( (lv_scenarios_9_0= ruleScenario ) )* (otherlv_10= '}' )? )
            {
            // InternalMyDsl.g:79:2: ( ( (lv_specification_0_0= 'specification' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '{' )? ( (lv_includes_3_0= ruleInclude ) )* ( (lv_contextmodels_4_0= ruleContextModel ) )* ( (lv_contextfragments_5_0= ruleContextFragment ) )* ( (lv_objects_6_0= ruleObject ) )* ( (lv_parameters_7_0= ruleParameter ) )* ( (lv_constraints_8_0= ruleConstraint ) )* ( (lv_scenarios_9_0= ruleScenario ) )* (otherlv_10= '}' )? )
            // InternalMyDsl.g:80:3: ( (lv_specification_0_0= 'specification' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '{' )? ( (lv_includes_3_0= ruleInclude ) )* ( (lv_contextmodels_4_0= ruleContextModel ) )* ( (lv_contextfragments_5_0= ruleContextFragment ) )* ( (lv_objects_6_0= ruleObject ) )* ( (lv_parameters_7_0= ruleParameter ) )* ( (lv_constraints_8_0= ruleConstraint ) )* ( (lv_scenarios_9_0= ruleScenario ) )* (otherlv_10= '}' )?
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

                if ( (LA7_0==64) ) {
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

                if ( ((LA8_0>=22 && LA8_0<=23)||(LA8_0>=70 && LA8_0<=71)) ) {
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

            // InternalMyDsl.g:213:3: ( (lv_constraints_8_0= ruleConstraint ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==51) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:214:4: (lv_constraints_8_0= ruleConstraint )
            	    {
            	    // InternalMyDsl.g:214:4: (lv_constraints_8_0= ruleConstraint )
            	    // InternalMyDsl.g:215:5: lv_constraints_8_0= ruleConstraint
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
            	    break loop9;
                }
            } while (true);

            // InternalMyDsl.g:232:3: ( (lv_scenarios_9_0= ruleScenario ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==43) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:233:4: (lv_scenarios_9_0= ruleScenario )
            	    {
            	    // InternalMyDsl.g:233:4: (lv_scenarios_9_0= ruleScenario )
            	    // InternalMyDsl.g:234:5: lv_scenarios_9_0= ruleScenario
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
            	    break loop10;
                }
            } while (true);

            // InternalMyDsl.g:251:3: (otherlv_10= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:252:4: otherlv_10= '}'
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_10());
                    			

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
    // InternalMyDsl.g:261:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalMyDsl.g:261:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalMyDsl.g:262:2: iv_ruleInclude= ruleInclude EOF
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
    // InternalMyDsl.g:268:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (lv_importURI_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_importURI_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:274:2: ( (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (lv_importURI_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:275:2: (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (lv_importURI_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:275:2: (otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (lv_importURI_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:276:3: otherlv_0= 'import' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (lv_importURI_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getImportKeyword_0());
            		
            // InternalMyDsl.g:280:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:281:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:281:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:282:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getContextContextModelCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getFromKeyword_2());
            		
            // InternalMyDsl.g:297:3: ( (lv_importURI_3_0= RULE_STRING ) )
            // InternalMyDsl.g:298:4: (lv_importURI_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:298:4: (lv_importURI_3_0= RULE_STRING )
            // InternalMyDsl.g:299:5: lv_importURI_3_0= RULE_STRING
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
    // InternalMyDsl.g:319:1: entryRuleContextModel returns [EObject current=null] : iv_ruleContextModel= ruleContextModel EOF ;
    public final EObject entryRuleContextModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextModel = null;


        try {
            // InternalMyDsl.g:319:53: (iv_ruleContextModel= ruleContextModel EOF )
            // InternalMyDsl.g:320:2: iv_ruleContextModel= ruleContextModel EOF
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
    // InternalMyDsl.g:326:1: ruleContextModel returns [EObject current=null] : (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:332:2: ( (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:333:2: (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:333:2: (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' )
            // InternalMyDsl.g:334:3: otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getContextModelAccess().getContextmodelKeyword_0());
            		
            // InternalMyDsl.g:338:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:339:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:339:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:340:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getContextModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:360:3: ( (lv_entities_3_0= ruleEntity ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:361:4: (lv_entities_3_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:361:4: (lv_entities_3_0= ruleEntity )
            	    // InternalMyDsl.g:362:5: lv_entities_3_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getContextModelAccess().getEntitiesEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    break loop12;
                }
            } while (true);

            // InternalMyDsl.g:379:3: ( (lv_relations_4_0= ruleRelation ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==38) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:380:4: (lv_relations_4_0= ruleRelation )
            	    {
            	    // InternalMyDsl.g:380:4: (lv_relations_4_0= ruleRelation )
            	    // InternalMyDsl.g:381:5: lv_relations_4_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getContextModelAccess().getRelationsRelationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop13;
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
    // InternalMyDsl.g:406:1: entryRuleContextFragment returns [EObject current=null] : iv_ruleContextFragment= ruleContextFragment EOF ;
    public final EObject entryRuleContextFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextFragment = null;


        try {
            // InternalMyDsl.g:406:56: (iv_ruleContextFragment= ruleContextFragment EOF )
            // InternalMyDsl.g:407:2: iv_ruleContextFragment= ruleContextFragment EOF
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
    // InternalMyDsl.g:413:1: ruleContextFragment returns [EObject current=null] : (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleFEntity ) )* ( (lv_relations_4_0= ruleFRelation ) )* otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:419:2: ( (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleFEntity ) )* ( (lv_relations_4_0= ruleFRelation ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:420:2: (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleFEntity ) )* ( (lv_relations_4_0= ruleFRelation ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:420:2: (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleFEntity ) )* ( (lv_relations_4_0= ruleFRelation ) )* otherlv_5= '}' )
            // InternalMyDsl.g:421:3: otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleFEntity ) )* ( (lv_relations_4_0= ruleFRelation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getContextFragmentAccess().getContextfragmentKeyword_0());
            		
            // InternalMyDsl.g:425:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:426:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:426:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:427:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getContextFragmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:447:3: ( (lv_entities_3_0= ruleFEntity ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:448:4: (lv_entities_3_0= ruleFEntity )
            	    {
            	    // InternalMyDsl.g:448:4: (lv_entities_3_0= ruleFEntity )
            	    // InternalMyDsl.g:449:5: lv_entities_3_0= ruleFEntity
            	    {

            	    					newCompositeNode(grammarAccess.getContextFragmentAccess().getEntitiesFEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
            	    break loop14;
                }
            } while (true);

            // InternalMyDsl.g:466:3: ( (lv_relations_4_0= ruleFRelation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==42) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:467:4: (lv_relations_4_0= ruleFRelation )
            	    {
            	    // InternalMyDsl.g:467:4: (lv_relations_4_0= ruleFRelation )
            	    // InternalMyDsl.g:468:5: lv_relations_4_0= ruleFRelation
            	    {

            	    					newCompositeNode(grammarAccess.getContextFragmentAccess().getRelationsFRelationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop15;
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
    // InternalMyDsl.g:493:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:493:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:494:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalMyDsl.g:500:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) )? otherlv_8= ';' ) ;
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
            // InternalMyDsl.g:506:2: ( (otherlv_0= 'attribute' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) )? otherlv_8= ';' ) )
            // InternalMyDsl.g:507:2: (otherlv_0= 'attribute' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) )? otherlv_8= ';' )
            {
            // InternalMyDsl.g:507:2: (otherlv_0= 'attribute' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) )? otherlv_8= ';' )
            // InternalMyDsl.g:508:3: otherlv_0= 'attribute' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalMyDsl.g:512:3: ( (lv_int_1_0= 'int' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:513:4: (lv_int_1_0= 'int' )
                    {
                    // InternalMyDsl.g:513:4: (lv_int_1_0= 'int' )
                    // InternalMyDsl.g:514:5: lv_int_1_0= 'int'
                    {
                    lv_int_1_0=(Token)match(input,21,FOLLOW_21); 

                    					newLeafNode(lv_int_1_0, grammarAccess.getAttributeAccess().getIntIntKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "int", true, "int");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:526:3: ( (lv_float_2_0= 'float' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:527:4: (lv_float_2_0= 'float' )
                    {
                    // InternalMyDsl.g:527:4: (lv_float_2_0= 'float' )
                    // InternalMyDsl.g:528:5: lv_float_2_0= 'float'
                    {
                    lv_float_2_0=(Token)match(input,22,FOLLOW_22); 

                    					newLeafNode(lv_float_2_0, grammarAccess.getAttributeAccess().getFloatFloatKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "float", true, "float");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:540:3: ( (lv_string_3_0= 'string' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:541:4: (lv_string_3_0= 'string' )
                    {
                    // InternalMyDsl.g:541:4: (lv_string_3_0= 'string' )
                    // InternalMyDsl.g:542:5: lv_string_3_0= 'string'
                    {
                    lv_string_3_0=(Token)match(input,23,FOLLOW_23); 

                    					newLeafNode(lv_string_3_0, grammarAccess.getAttributeAccess().getStringStringKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "string", true, "string");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:554:3: ( (lv_boolean_4_0= 'boolean' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:555:4: (lv_boolean_4_0= 'boolean' )
                    {
                    // InternalMyDsl.g:555:4: (lv_boolean_4_0= 'boolean' )
                    // InternalMyDsl.g:556:5: lv_boolean_4_0= 'boolean'
                    {
                    lv_boolean_4_0=(Token)match(input,24,FOLLOW_12); 

                    					newLeafNode(lv_boolean_4_0, grammarAccess.getAttributeAccess().getBooleanBooleanKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "boolean", true, "boolean");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:568:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalMyDsl.g:569:4: (lv_name_5_0= RULE_ID )
            {
            // InternalMyDsl.g:569:4: (lv_name_5_0= RULE_ID )
            // InternalMyDsl.g:570:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalMyDsl.g:586:3: (otherlv_6= '=' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:587:4: otherlv_6= '='
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getEqualsSignKeyword_6());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:592:3: ( (lv_value_7_0= ruleAttributeValue ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_NUMBER)||(LA21_0>=27 && LA21_0<=28)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:593:4: (lv_value_7_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:593:4: (lv_value_7_0= ruleAttributeValue )
                    // InternalMyDsl.g:594:5: lv_value_7_0= ruleAttributeValue
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:619:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalMyDsl.g:619:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalMyDsl.g:620:2: iv_ruleAttributeValue= ruleAttributeValue EOF
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
    // InternalMyDsl.g:626:1: ruleAttributeValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_value_1_0= RULE_REAL ) ) | ( (lv_value_2_0= RULE_NUMBER ) ) | ( (lv_value_3_0= 'true' ) ) | ( (lv_value_4_0= 'false' ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:632:2: ( ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_value_1_0= RULE_REAL ) ) | ( (lv_value_2_0= RULE_NUMBER ) ) | ( (lv_value_3_0= 'true' ) ) | ( (lv_value_4_0= 'false' ) ) ) )
            // InternalMyDsl.g:633:2: ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_value_1_0= RULE_REAL ) ) | ( (lv_value_2_0= RULE_NUMBER ) ) | ( (lv_value_3_0= 'true' ) ) | ( (lv_value_4_0= 'false' ) ) )
            {
            // InternalMyDsl.g:633:2: ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_value_1_0= RULE_REAL ) ) | ( (lv_value_2_0= RULE_NUMBER ) ) | ( (lv_value_3_0= 'true' ) ) | ( (lv_value_4_0= 'false' ) ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt22=1;
                }
                break;
            case RULE_REAL:
                {
                alt22=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt22=3;
                }
                break;
            case 27:
                {
                alt22=4;
                }
                break;
            case 28:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:634:3: ( (lv_value_0_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:634:3: ( (lv_value_0_0= RULE_STRING ) )
                    // InternalMyDsl.g:635:4: (lv_value_0_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:635:4: (lv_value_0_0= RULE_STRING )
                    // InternalMyDsl.g:636:5: lv_value_0_0= RULE_STRING
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
                    // InternalMyDsl.g:653:3: ( (lv_value_1_0= RULE_REAL ) )
                    {
                    // InternalMyDsl.g:653:3: ( (lv_value_1_0= RULE_REAL ) )
                    // InternalMyDsl.g:654:4: (lv_value_1_0= RULE_REAL )
                    {
                    // InternalMyDsl.g:654:4: (lv_value_1_0= RULE_REAL )
                    // InternalMyDsl.g:655:5: lv_value_1_0= RULE_REAL
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
                    // InternalMyDsl.g:672:3: ( (lv_value_2_0= RULE_NUMBER ) )
                    {
                    // InternalMyDsl.g:672:3: ( (lv_value_2_0= RULE_NUMBER ) )
                    // InternalMyDsl.g:673:4: (lv_value_2_0= RULE_NUMBER )
                    {
                    // InternalMyDsl.g:673:4: (lv_value_2_0= RULE_NUMBER )
                    // InternalMyDsl.g:674:5: lv_value_2_0= RULE_NUMBER
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
                    // InternalMyDsl.g:691:3: ( (lv_value_3_0= 'true' ) )
                    {
                    // InternalMyDsl.g:691:3: ( (lv_value_3_0= 'true' ) )
                    // InternalMyDsl.g:692:4: (lv_value_3_0= 'true' )
                    {
                    // InternalMyDsl.g:692:4: (lv_value_3_0= 'true' )
                    // InternalMyDsl.g:693:5: lv_value_3_0= 'true'
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
                    // InternalMyDsl.g:706:3: ( (lv_value_4_0= 'false' ) )
                    {
                    // InternalMyDsl.g:706:3: ( (lv_value_4_0= 'false' ) )
                    // InternalMyDsl.g:707:4: (lv_value_4_0= 'false' )
                    {
                    // InternalMyDsl.g:707:4: (lv_value_4_0= 'false' )
                    // InternalMyDsl.g:708:5: lv_value_4_0= 'false'
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
    // InternalMyDsl.g:724:1: entryRuleFragmentAttribute returns [EObject current=null] : iv_ruleFragmentAttribute= ruleFragmentAttribute EOF ;
    public final EObject entryRuleFragmentAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragmentAttribute = null;


        try {
            // InternalMyDsl.g:724:58: (iv_ruleFragmentAttribute= ruleFragmentAttribute EOF )
            // InternalMyDsl.g:725:2: iv_ruleFragmentAttribute= ruleFragmentAttribute EOF
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
    // InternalMyDsl.g:731:1: ruleFragmentAttribute returns [EObject current=null] : (otherlv_0= 'attributeconstraint' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_greater_6_0= '>' ) )? ( (lv_smaller_7_0= '<' ) )? ( (lv_greaterequals_8_0= '>=' ) )? ( (lv_smallerequals_9_0= '<=' ) )? ( (lv_equals_10_0= '==' ) )? ( (lv_notequals_11_0= '!=' ) )? ( (lv_value_12_0= ruleAttributeValue ) ) otherlv_13= ';' ) ;
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
            // InternalMyDsl.g:737:2: ( (otherlv_0= 'attributeconstraint' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_greater_6_0= '>' ) )? ( (lv_smaller_7_0= '<' ) )? ( (lv_greaterequals_8_0= '>=' ) )? ( (lv_smallerequals_9_0= '<=' ) )? ( (lv_equals_10_0= '==' ) )? ( (lv_notequals_11_0= '!=' ) )? ( (lv_value_12_0= ruleAttributeValue ) ) otherlv_13= ';' ) )
            // InternalMyDsl.g:738:2: (otherlv_0= 'attributeconstraint' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_greater_6_0= '>' ) )? ( (lv_smaller_7_0= '<' ) )? ( (lv_greaterequals_8_0= '>=' ) )? ( (lv_smallerequals_9_0= '<=' ) )? ( (lv_equals_10_0= '==' ) )? ( (lv_notequals_11_0= '!=' ) )? ( (lv_value_12_0= ruleAttributeValue ) ) otherlv_13= ';' )
            {
            // InternalMyDsl.g:738:2: (otherlv_0= 'attributeconstraint' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_greater_6_0= '>' ) )? ( (lv_smaller_7_0= '<' ) )? ( (lv_greaterequals_8_0= '>=' ) )? ( (lv_smallerequals_9_0= '<=' ) )? ( (lv_equals_10_0= '==' ) )? ( (lv_notequals_11_0= '!=' ) )? ( (lv_value_12_0= ruleAttributeValue ) ) otherlv_13= ';' )
            // InternalMyDsl.g:739:3: otherlv_0= 'attributeconstraint' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_greater_6_0= '>' ) )? ( (lv_smaller_7_0= '<' ) )? ( (lv_greaterequals_8_0= '>=' ) )? ( (lv_smallerequals_9_0= '<=' ) )? ( (lv_equals_10_0= '==' ) )? ( (lv_notequals_11_0= '!=' ) )? ( (lv_value_12_0= ruleAttributeValue ) ) otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getFragmentAttributeAccess().getAttributeconstraintKeyword_0());
            		
            // InternalMyDsl.g:743:3: ( (lv_int_1_0= 'int' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:744:4: (lv_int_1_0= 'int' )
                    {
                    // InternalMyDsl.g:744:4: (lv_int_1_0= 'int' )
                    // InternalMyDsl.g:745:5: lv_int_1_0= 'int'
                    {
                    lv_int_1_0=(Token)match(input,21,FOLLOW_21); 

                    					newLeafNode(lv_int_1_0, grammarAccess.getFragmentAttributeAccess().getIntIntKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "int", true, "int");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:757:3: ( (lv_float_2_0= 'float' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:758:4: (lv_float_2_0= 'float' )
                    {
                    // InternalMyDsl.g:758:4: (lv_float_2_0= 'float' )
                    // InternalMyDsl.g:759:5: lv_float_2_0= 'float'
                    {
                    lv_float_2_0=(Token)match(input,22,FOLLOW_22); 

                    					newLeafNode(lv_float_2_0, grammarAccess.getFragmentAttributeAccess().getFloatFloatKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "float", true, "float");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:771:3: ( (lv_string_3_0= 'string' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:772:4: (lv_string_3_0= 'string' )
                    {
                    // InternalMyDsl.g:772:4: (lv_string_3_0= 'string' )
                    // InternalMyDsl.g:773:5: lv_string_3_0= 'string'
                    {
                    lv_string_3_0=(Token)match(input,23,FOLLOW_23); 

                    					newLeafNode(lv_string_3_0, grammarAccess.getFragmentAttributeAccess().getStringStringKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "string", true, "string");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:785:3: ( (lv_boolean_4_0= 'boolean' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:786:4: (lv_boolean_4_0= 'boolean' )
                    {
                    // InternalMyDsl.g:786:4: (lv_boolean_4_0= 'boolean' )
                    // InternalMyDsl.g:787:5: lv_boolean_4_0= 'boolean'
                    {
                    lv_boolean_4_0=(Token)match(input,24,FOLLOW_12); 

                    					newLeafNode(lv_boolean_4_0, grammarAccess.getFragmentAttributeAccess().getBooleanBooleanKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "boolean", true, "boolean");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:799:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalMyDsl.g:800:4: (lv_name_5_0= RULE_ID )
            {
            // InternalMyDsl.g:800:4: (lv_name_5_0= RULE_ID )
            // InternalMyDsl.g:801:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            // InternalMyDsl.g:817:3: ( (lv_greater_6_0= '>' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:818:4: (lv_greater_6_0= '>' )
                    {
                    // InternalMyDsl.g:818:4: (lv_greater_6_0= '>' )
                    // InternalMyDsl.g:819:5: lv_greater_6_0= '>'
                    {
                    lv_greater_6_0=(Token)match(input,30,FOLLOW_28); 

                    					newLeafNode(lv_greater_6_0, grammarAccess.getFragmentAttributeAccess().getGreaterGreaterThanSignKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "greater", true, ">");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:831:3: ( (lv_smaller_7_0= '<' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:832:4: (lv_smaller_7_0= '<' )
                    {
                    // InternalMyDsl.g:832:4: (lv_smaller_7_0= '<' )
                    // InternalMyDsl.g:833:5: lv_smaller_7_0= '<'
                    {
                    lv_smaller_7_0=(Token)match(input,31,FOLLOW_29); 

                    					newLeafNode(lv_smaller_7_0, grammarAccess.getFragmentAttributeAccess().getSmallerLessThanSignKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "smaller", true, "<");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:845:3: ( (lv_greaterequals_8_0= '>=' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:846:4: (lv_greaterequals_8_0= '>=' )
                    {
                    // InternalMyDsl.g:846:4: (lv_greaterequals_8_0= '>=' )
                    // InternalMyDsl.g:847:5: lv_greaterequals_8_0= '>='
                    {
                    lv_greaterequals_8_0=(Token)match(input,32,FOLLOW_30); 

                    					newLeafNode(lv_greaterequals_8_0, grammarAccess.getFragmentAttributeAccess().getGreaterequalsGreaterThanSignEqualsSignKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "greaterequals", true, ">=");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:859:3: ( (lv_smallerequals_9_0= '<=' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:860:4: (lv_smallerequals_9_0= '<=' )
                    {
                    // InternalMyDsl.g:860:4: (lv_smallerequals_9_0= '<=' )
                    // InternalMyDsl.g:861:5: lv_smallerequals_9_0= '<='
                    {
                    lv_smallerequals_9_0=(Token)match(input,33,FOLLOW_31); 

                    					newLeafNode(lv_smallerequals_9_0, grammarAccess.getFragmentAttributeAccess().getSmallerequalsLessThanSignEqualsSignKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "smallerequals", true, "<=");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:873:3: ( (lv_equals_10_0= '==' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:874:4: (lv_equals_10_0= '==' )
                    {
                    // InternalMyDsl.g:874:4: (lv_equals_10_0= '==' )
                    // InternalMyDsl.g:875:5: lv_equals_10_0= '=='
                    {
                    lv_equals_10_0=(Token)match(input,34,FOLLOW_32); 

                    					newLeafNode(lv_equals_10_0, grammarAccess.getFragmentAttributeAccess().getEqualsEqualsSignEqualsSignKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "equals", true, "==");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:887:3: ( (lv_notequals_11_0= '!=' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:888:4: (lv_notequals_11_0= '!=' )
                    {
                    // InternalMyDsl.g:888:4: (lv_notequals_11_0= '!=' )
                    // InternalMyDsl.g:889:5: lv_notequals_11_0= '!='
                    {
                    lv_notequals_11_0=(Token)match(input,35,FOLLOW_33); 

                    					newLeafNode(lv_notequals_11_0, grammarAccess.getFragmentAttributeAccess().getNotequalsExclamationMarkEqualsSignKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "notequals", true, "!=");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:901:3: ( (lv_value_12_0= ruleAttributeValue ) )
            // InternalMyDsl.g:902:4: (lv_value_12_0= ruleAttributeValue )
            {
            // InternalMyDsl.g:902:4: (lv_value_12_0= ruleAttributeValue )
            // InternalMyDsl.g:903:5: lv_value_12_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getFragmentAttributeAccess().getValueAttributeValueParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:928:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:928:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:929:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalMyDsl.g:935:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:941:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:942:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:942:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalMyDsl.g:943:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:947:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:948:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:948:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:949:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:969:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==20) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:970:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:970:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalMyDsl.g:971:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_34);
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
            	    break loop33;
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
    // InternalMyDsl.g:996:1: entryRuleFEntity returns [EObject current=null] : iv_ruleFEntity= ruleFEntity EOF ;
    public final EObject entryRuleFEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFEntity = null;


        try {
            // InternalMyDsl.g:996:48: (iv_ruleFEntity= ruleFEntity EOF )
            // InternalMyDsl.g:997:2: iv_ruleFEntity= ruleFEntity EOF
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
    // InternalMyDsl.g:1003:1: ruleFEntity returns [EObject current=null] : (otherlv_0= 'entityconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleFragmentAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleFEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1009:2: ( (otherlv_0= 'entityconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleFragmentAttribute ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:1010:2: (otherlv_0= 'entityconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleFragmentAttribute ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:1010:2: (otherlv_0= 'entityconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleFragmentAttribute ) )* otherlv_4= '}' )
            // InternalMyDsl.g:1011:3: otherlv_0= 'entityconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleFragmentAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFEntityAccess().getEntityconstraintKeyword_0());
            		
            // InternalMyDsl.g:1015:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1016:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1016:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1017:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getFEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1037:3: ( (lv_attributes_3_0= ruleFragmentAttribute ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==29) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:1038:4: (lv_attributes_3_0= ruleFragmentAttribute )
            	    {
            	    // InternalMyDsl.g:1038:4: (lv_attributes_3_0= ruleFragmentAttribute )
            	    // InternalMyDsl.g:1039:5: lv_attributes_3_0= ruleFragmentAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getFEntityAccess().getAttributesFragmentAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    break loop34;
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
    // InternalMyDsl.g:1064:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:1064:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:1065:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalMyDsl.g:1071:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:1077:2: ( (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:1078:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:1078:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            // InternalMyDsl.g:1079:3: otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalMyDsl.g:1083:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1084:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1084:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1085:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

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

            otherlv_2=(Token)match(input,39,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1105:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1106:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1106:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1107:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getSenderEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:1122:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1123:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1123:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1124:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getReceiverEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_34); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:1143:3: ( (lv_attributes_8_0= ruleAttribute ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==20) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:1144:4: (lv_attributes_8_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:1144:4: (lv_attributes_8_0= ruleAttribute )
            	    // InternalMyDsl.g:1145:5: lv_attributes_8_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_34);
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
            	    break loop35;
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
    // InternalMyDsl.g:1170:1: entryRuleFRelation returns [EObject current=null] : iv_ruleFRelation= ruleFRelation EOF ;
    public final EObject entryRuleFRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFRelation = null;


        try {
            // InternalMyDsl.g:1170:50: (iv_ruleFRelation= ruleFRelation EOF )
            // InternalMyDsl.g:1171:2: iv_ruleFRelation= ruleFRelation EOF
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
    // InternalMyDsl.g:1177:1: ruleFRelation returns [EObject current=null] : (otherlv_0= 'relationconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleFragmentAttribute ) )* otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:1183:2: ( (otherlv_0= 'relationconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleFragmentAttribute ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:1184:2: (otherlv_0= 'relationconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleFragmentAttribute ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:1184:2: (otherlv_0= 'relationconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleFragmentAttribute ) )* otherlv_9= '}' )
            // InternalMyDsl.g:1185:3: otherlv_0= 'relationconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleFragmentAttribute ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFRelationAccess().getRelationconstraintKeyword_0());
            		
            // InternalMyDsl.g:1189:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1190:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1190:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1191:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

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

            otherlv_2=(Token)match(input,39,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getFRelationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1211:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1212:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1212:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1213:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFRelationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_3, grammarAccess.getFRelationAccess().getSenderFEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getFRelationAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:1228:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1229:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1229:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1230:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFRelationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_5, grammarAccess.getFRelationAccess().getReceiverFEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getFRelationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_35); 

            			newLeafNode(otherlv_7, grammarAccess.getFRelationAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:1249:3: ( (lv_attributes_8_0= ruleFragmentAttribute ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==29) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:1250:4: (lv_attributes_8_0= ruleFragmentAttribute )
            	    {
            	    // InternalMyDsl.g:1250:4: (lv_attributes_8_0= ruleFragmentAttribute )
            	    // InternalMyDsl.g:1251:5: lv_attributes_8_0= ruleFragmentAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getFRelationAccess().getAttributesFragmentAttributeParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    break loop36;
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
    // InternalMyDsl.g:1276:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalMyDsl.g:1276:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalMyDsl.g:1277:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalMyDsl.g:1283:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_scenariocontents_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1289:2: ( (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:1290:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:1290:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' )
            // InternalMyDsl.g:1291:3: otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalMyDsl.g:1295:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1296:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1296:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1297:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1317:3: ( (lv_scenariocontents_3_0= ruleScenarioContent ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==44||(LA37_0>=52 && LA37_0<=53)||(LA37_0>=55 && LA37_0<=58)||(LA37_0>=61 && LA37_0<=62)||LA37_0==65||LA37_0==67||LA37_0==69) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:1318:4: (lv_scenariocontents_3_0= ruleScenarioContent )
            	    {
            	    // InternalMyDsl.g:1318:4: (lv_scenariocontents_3_0= ruleScenarioContent )
            	    // InternalMyDsl.g:1319:5: lv_scenariocontents_3_0= ruleScenarioContent
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getScenariocontentsScenarioContentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_39);
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
            	    break loop37;
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
    // InternalMyDsl.g:1344:1: entryRuleScenarioContent returns [EObject current=null] : iv_ruleScenarioContent= ruleScenarioContent EOF ;
    public final EObject entryRuleScenarioContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioContent = null;


        try {
            // InternalMyDsl.g:1344:56: (iv_ruleScenarioContent= ruleScenarioContent EOF )
            // InternalMyDsl.g:1345:2: iv_ruleScenarioContent= ruleScenarioContent EOF
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
    // InternalMyDsl.g:1351:1: ruleScenarioContent returns [EObject current=null] : ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) | ( (lv_paramConstraint_5_0= ruleParameterConstraint ) ) | ( (lv_assertentity_6_0= ruleAssertionEntity ) ) | ( (lv_assertrelation_7_0= ruleAssertionRelation ) ) ) ;
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
            // InternalMyDsl.g:1357:2: ( ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) | ( (lv_paramConstraint_5_0= ruleParameterConstraint ) ) | ( (lv_assertentity_6_0= ruleAssertionEntity ) ) | ( (lv_assertrelation_7_0= ruleAssertionRelation ) ) ) )
            // InternalMyDsl.g:1358:2: ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) | ( (lv_paramConstraint_5_0= ruleParameterConstraint ) ) | ( (lv_assertentity_6_0= ruleAssertionEntity ) ) | ( (lv_assertrelation_7_0= ruleAssertionRelation ) ) )
            {
            // InternalMyDsl.g:1358:2: ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) | ( (lv_paramConstraint_5_0= ruleParameterConstraint ) ) | ( (lv_assertentity_6_0= ruleAssertionEntity ) ) | ( (lv_assertrelation_7_0= ruleAssertionRelation ) ) )
            int alt38=8;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt38=1;
                }
                break;
            case 44:
                {
                alt38=2;
                }
                break;
            case 67:
                {
                alt38=3;
                }
                break;
            case 69:
                {
                alt38=4;
                }
                break;
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
                {
                alt38=5;
                }
                break;
            case 62:
                {
                alt38=6;
                }
                break;
            case 58:
                {
                alt38=7;
                }
                break;
            case 61:
                {
                alt38=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1359:3: ( (lv_alt_0_0= ruleAlt ) )
                    {
                    // InternalMyDsl.g:1359:3: ( (lv_alt_0_0= ruleAlt ) )
                    // InternalMyDsl.g:1360:4: (lv_alt_0_0= ruleAlt )
                    {
                    // InternalMyDsl.g:1360:4: (lv_alt_0_0= ruleAlt )
                    // InternalMyDsl.g:1361:5: lv_alt_0_0= ruleAlt
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
                    // InternalMyDsl.g:1379:3: ( (lv_message_1_0= ruleMessage ) )
                    {
                    // InternalMyDsl.g:1379:3: ( (lv_message_1_0= ruleMessage ) )
                    // InternalMyDsl.g:1380:4: (lv_message_1_0= ruleMessage )
                    {
                    // InternalMyDsl.g:1380:4: (lv_message_1_0= ruleMessage )
                    // InternalMyDsl.g:1381:5: lv_message_1_0= ruleMessage
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
                    // InternalMyDsl.g:1399:3: ( (lv_par_2_0= rulePar ) )
                    {
                    // InternalMyDsl.g:1399:3: ( (lv_par_2_0= rulePar ) )
                    // InternalMyDsl.g:1400:4: (lv_par_2_0= rulePar )
                    {
                    // InternalMyDsl.g:1400:4: (lv_par_2_0= rulePar )
                    // InternalMyDsl.g:1401:5: lv_par_2_0= rulePar
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
                    // InternalMyDsl.g:1419:3: ( (lv_loop_3_0= ruleLoop ) )
                    {
                    // InternalMyDsl.g:1419:3: ( (lv_loop_3_0= ruleLoop ) )
                    // InternalMyDsl.g:1420:4: (lv_loop_3_0= ruleLoop )
                    {
                    // InternalMyDsl.g:1420:4: (lv_loop_3_0= ruleLoop )
                    // InternalMyDsl.g:1421:5: lv_loop_3_0= ruleLoop
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
                    // InternalMyDsl.g:1439:3: ( (lv_contextmessage_4_0= ruleContextMessage ) )
                    {
                    // InternalMyDsl.g:1439:3: ( (lv_contextmessage_4_0= ruleContextMessage ) )
                    // InternalMyDsl.g:1440:4: (lv_contextmessage_4_0= ruleContextMessage )
                    {
                    // InternalMyDsl.g:1440:4: (lv_contextmessage_4_0= ruleContextMessage )
                    // InternalMyDsl.g:1441:5: lv_contextmessage_4_0= ruleContextMessage
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
                    // InternalMyDsl.g:1459:3: ( (lv_paramConstraint_5_0= ruleParameterConstraint ) )
                    {
                    // InternalMyDsl.g:1459:3: ( (lv_paramConstraint_5_0= ruleParameterConstraint ) )
                    // InternalMyDsl.g:1460:4: (lv_paramConstraint_5_0= ruleParameterConstraint )
                    {
                    // InternalMyDsl.g:1460:4: (lv_paramConstraint_5_0= ruleParameterConstraint )
                    // InternalMyDsl.g:1461:5: lv_paramConstraint_5_0= ruleParameterConstraint
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
                    // InternalMyDsl.g:1479:3: ( (lv_assertentity_6_0= ruleAssertionEntity ) )
                    {
                    // InternalMyDsl.g:1479:3: ( (lv_assertentity_6_0= ruleAssertionEntity ) )
                    // InternalMyDsl.g:1480:4: (lv_assertentity_6_0= ruleAssertionEntity )
                    {
                    // InternalMyDsl.g:1480:4: (lv_assertentity_6_0= ruleAssertionEntity )
                    // InternalMyDsl.g:1481:5: lv_assertentity_6_0= ruleAssertionEntity
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
                    // InternalMyDsl.g:1499:3: ( (lv_assertrelation_7_0= ruleAssertionRelation ) )
                    {
                    // InternalMyDsl.g:1499:3: ( (lv_assertrelation_7_0= ruleAssertionRelation ) )
                    // InternalMyDsl.g:1500:4: (lv_assertrelation_7_0= ruleAssertionRelation )
                    {
                    // InternalMyDsl.g:1500:4: (lv_assertrelation_7_0= ruleAssertionRelation )
                    // InternalMyDsl.g:1501:5: lv_assertrelation_7_0= ruleAssertionRelation
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
    // InternalMyDsl.g:1522:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalMyDsl.g:1522:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMyDsl.g:1523:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalMyDsl.g:1529:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParams ) ) | ( (lv_constantparams_4_0= ruleConstantParams ) ) ) otherlv_5= ')' ( (lv_required_6_0= 'required' ) )? ( (lv_fail_7_0= 'fail' ) )? ( (lv_strict_8_0= 'strict' ) )? ( (otherlv_9= RULE_ID ) ) otherlv_10= '->' ( (otherlv_11= RULE_ID ) ) ( (lv_past_12_0= 'past' ) )? ( (lv_future_13_0= 'future' ) )? ( (lv_constraint_14_0= 'constraint' ) )? (otherlv_15= '{' )? ( (otherlv_16= RULE_ID ) )? (otherlv_17= '}' )? otherlv_18= ';' ) ;
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
        Token otherlv_18=null;
        EObject lv_params_3_0 = null;

        EObject lv_constantparams_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1535:2: ( (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParams ) ) | ( (lv_constantparams_4_0= ruleConstantParams ) ) ) otherlv_5= ')' ( (lv_required_6_0= 'required' ) )? ( (lv_fail_7_0= 'fail' ) )? ( (lv_strict_8_0= 'strict' ) )? ( (otherlv_9= RULE_ID ) ) otherlv_10= '->' ( (otherlv_11= RULE_ID ) ) ( (lv_past_12_0= 'past' ) )? ( (lv_future_13_0= 'future' ) )? ( (lv_constraint_14_0= 'constraint' ) )? (otherlv_15= '{' )? ( (otherlv_16= RULE_ID ) )? (otherlv_17= '}' )? otherlv_18= ';' ) )
            // InternalMyDsl.g:1536:2: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParams ) ) | ( (lv_constantparams_4_0= ruleConstantParams ) ) ) otherlv_5= ')' ( (lv_required_6_0= 'required' ) )? ( (lv_fail_7_0= 'fail' ) )? ( (lv_strict_8_0= 'strict' ) )? ( (otherlv_9= RULE_ID ) ) otherlv_10= '->' ( (otherlv_11= RULE_ID ) ) ( (lv_past_12_0= 'past' ) )? ( (lv_future_13_0= 'future' ) )? ( (lv_constraint_14_0= 'constraint' ) )? (otherlv_15= '{' )? ( (otherlv_16= RULE_ID ) )? (otherlv_17= '}' )? otherlv_18= ';' )
            {
            // InternalMyDsl.g:1536:2: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParams ) ) | ( (lv_constantparams_4_0= ruleConstantParams ) ) ) otherlv_5= ')' ( (lv_required_6_0= 'required' ) )? ( (lv_fail_7_0= 'fail' ) )? ( (lv_strict_8_0= 'strict' ) )? ( (otherlv_9= RULE_ID ) ) otherlv_10= '->' ( (otherlv_11= RULE_ID ) ) ( (lv_past_12_0= 'past' ) )? ( (lv_future_13_0= 'future' ) )? ( (lv_constraint_14_0= 'constraint' ) )? (otherlv_15= '{' )? ( (otherlv_16= RULE_ID ) )? (otherlv_17= '}' )? otherlv_18= ';' )
            // InternalMyDsl.g:1537:3: otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParams ) ) | ( (lv_constantparams_4_0= ruleConstantParams ) ) ) otherlv_5= ')' ( (lv_required_6_0= 'required' ) )? ( (lv_fail_7_0= 'fail' ) )? ( (lv_strict_8_0= 'strict' ) )? ( (otherlv_9= RULE_ID ) ) otherlv_10= '->' ( (otherlv_11= RULE_ID ) ) ( (lv_past_12_0= 'past' ) )? ( (lv_future_13_0= 'future' ) )? ( (lv_constraint_14_0= 'constraint' ) )? (otherlv_15= '{' )? ( (otherlv_16= RULE_ID ) )? (otherlv_17= '}' )? otherlv_18= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
            		
            // InternalMyDsl.g:1541:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1542:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1542:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1543:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

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

            otherlv_2=(Token)match(input,39,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1563:3: ( ( (lv_params_3_0= ruleParams ) ) | ( (lv_constantparams_4_0= ruleConstantParams ) ) )
            int alt39=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt39=1;
                }
                break;
            case 40:
                {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==RULE_ID) ) {
                    alt39=1;
                }
                else if ( ((LA39_2>=RULE_STRING && LA39_2<=RULE_NUMBER)||(LA39_2>=27 && LA39_2<=28)) ) {
                    alt39=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt39=1;
                }
                break;
            case RULE_STRING:
            case RULE_REAL:
            case RULE_NUMBER:
            case 27:
            case 28:
                {
                alt39=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1564:4: ( (lv_params_3_0= ruleParams ) )
                    {
                    // InternalMyDsl.g:1564:4: ( (lv_params_3_0= ruleParams ) )
                    // InternalMyDsl.g:1565:5: (lv_params_3_0= ruleParams )
                    {
                    // InternalMyDsl.g:1565:5: (lv_params_3_0= ruleParams )
                    // InternalMyDsl.g:1566:6: lv_params_3_0= ruleParams
                    {

                    						newCompositeNode(grammarAccess.getMessageAccess().getParamsParamsParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_38);
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
                    // InternalMyDsl.g:1584:4: ( (lv_constantparams_4_0= ruleConstantParams ) )
                    {
                    // InternalMyDsl.g:1584:4: ( (lv_constantparams_4_0= ruleConstantParams ) )
                    // InternalMyDsl.g:1585:5: (lv_constantparams_4_0= ruleConstantParams )
                    {
                    // InternalMyDsl.g:1585:5: (lv_constantparams_4_0= ruleConstantParams )
                    // InternalMyDsl.g:1586:6: lv_constantparams_4_0= ruleConstantParams
                    {

                    						newCompositeNode(grammarAccess.getMessageAccess().getConstantparamsConstantParamsParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_38);
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

            otherlv_5=(Token)match(input,41,FOLLOW_41); 

            			newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getRightParenthesisKeyword_4());
            		
            // InternalMyDsl.g:1608:3: ( (lv_required_6_0= 'required' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:1609:4: (lv_required_6_0= 'required' )
                    {
                    // InternalMyDsl.g:1609:4: (lv_required_6_0= 'required' )
                    // InternalMyDsl.g:1610:5: lv_required_6_0= 'required'
                    {
                    lv_required_6_0=(Token)match(input,45,FOLLOW_42); 

                    					newLeafNode(lv_required_6_0, grammarAccess.getMessageAccess().getRequiredRequiredKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1622:3: ( (lv_fail_7_0= 'fail' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==46) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1623:4: (lv_fail_7_0= 'fail' )
                    {
                    // InternalMyDsl.g:1623:4: (lv_fail_7_0= 'fail' )
                    // InternalMyDsl.g:1624:5: lv_fail_7_0= 'fail'
                    {
                    lv_fail_7_0=(Token)match(input,46,FOLLOW_43); 

                    					newLeafNode(lv_fail_7_0, grammarAccess.getMessageAccess().getFailFailKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "fail", true, "fail");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1636:3: ( (lv_strict_8_0= 'strict' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==47) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:1637:4: (lv_strict_8_0= 'strict' )
                    {
                    // InternalMyDsl.g:1637:4: (lv_strict_8_0= 'strict' )
                    // InternalMyDsl.g:1638:5: lv_strict_8_0= 'strict'
                    {
                    lv_strict_8_0=(Token)match(input,47,FOLLOW_12); 

                    					newLeafNode(lv_strict_8_0, grammarAccess.getMessageAccess().getStrictStrictKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "strict", true, "strict");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1650:3: ( (otherlv_9= RULE_ID ) )
            // InternalMyDsl.g:1651:4: (otherlv_9= RULE_ID )
            {
            // InternalMyDsl.g:1651:4: (otherlv_9= RULE_ID )
            // InternalMyDsl.g:1652:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(otherlv_9, grammarAccess.getMessageAccess().getSenderObjectCrossReference_8_0());
            				

            }


            }

            otherlv_10=(Token)match(input,48,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getMessageAccess().getHyphenMinusGreaterThanSignKeyword_9());
            		
            // InternalMyDsl.g:1667:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:1668:4: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:1668:4: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:1669:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getReceiverObjectCrossReference_10_0());
            				

            }


            }

            // InternalMyDsl.g:1680:3: ( (lv_past_12_0= 'past' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==49) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:1681:4: (lv_past_12_0= 'past' )
                    {
                    // InternalMyDsl.g:1681:4: (lv_past_12_0= 'past' )
                    // InternalMyDsl.g:1682:5: lv_past_12_0= 'past'
                    {
                    lv_past_12_0=(Token)match(input,49,FOLLOW_46); 

                    					newLeafNode(lv_past_12_0, grammarAccess.getMessageAccess().getPastPastKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "past", true, "past");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1694:3: ( (lv_future_13_0= 'future' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:1695:4: (lv_future_13_0= 'future' )
                    {
                    // InternalMyDsl.g:1695:4: (lv_future_13_0= 'future' )
                    // InternalMyDsl.g:1696:5: lv_future_13_0= 'future'
                    {
                    lv_future_13_0=(Token)match(input,50,FOLLOW_47); 

                    					newLeafNode(lv_future_13_0, grammarAccess.getMessageAccess().getFutureFutureKeyword_12_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "future", true, "future");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1708:3: ( (lv_constraint_14_0= 'constraint' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==51) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:1709:4: (lv_constraint_14_0= 'constraint' )
                    {
                    // InternalMyDsl.g:1709:4: (lv_constraint_14_0= 'constraint' )
                    // InternalMyDsl.g:1710:5: lv_constraint_14_0= 'constraint'
                    {
                    lv_constraint_14_0=(Token)match(input,51,FOLLOW_48); 

                    					newLeafNode(lv_constraint_14_0, grammarAccess.getMessageAccess().getConstraintConstraintKeyword_13_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "constraint", true, "constraint");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1722:3: (otherlv_15= '{' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==14) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:1723:4: otherlv_15= '{'
                    {
                    otherlv_15=(Token)match(input,14,FOLLOW_49); 

                    				newLeafNode(otherlv_15, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_14());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1728:3: ( (otherlv_16= RULE_ID ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:1729:4: (otherlv_16= RULE_ID )
                    {
                    // InternalMyDsl.g:1729:4: (otherlv_16= RULE_ID )
                    // InternalMyDsl.g:1730:5: otherlv_16= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    				
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_50); 

                    					newLeafNode(otherlv_16, grammarAccess.getMessageAccess().getCConstraintCrossReference_15_0());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1741:3: (otherlv_17= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==15) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:1742:4: otherlv_17= '}'
                    {
                    otherlv_17=(Token)match(input,15,FOLLOW_26); 

                    				newLeafNode(otherlv_17, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_16());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getMessageAccess().getSemicolonKeyword_17());
            		

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
    // InternalMyDsl.g:1755:1: entryRuleContextMessage returns [EObject current=null] : iv_ruleContextMessage= ruleContextMessage EOF ;
    public final EObject entryRuleContextMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextMessage = null;


        try {
            // InternalMyDsl.g:1755:55: (iv_ruleContextMessage= ruleContextMessage EOF )
            // InternalMyDsl.g:1756:2: iv_ruleContextMessage= ruleContextMessage EOF
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
    // InternalMyDsl.g:1762:1: ruleContextMessage returns [EObject current=null] : ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' ) ;
    public final EObject ruleContextMessage() throws RecognitionException {
        EObject current = null;

        Token lv_required_1_0=null;
        Token lv_fail_2_0=null;
        Token lv_strict_3_0=null;
        Token otherlv_4=null;
        EObject lv_content_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1768:2: ( ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' ) )
            // InternalMyDsl.g:1769:2: ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' )
            {
            // InternalMyDsl.g:1769:2: ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' )
            // InternalMyDsl.g:1770:3: ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';'
            {
            // InternalMyDsl.g:1770:3: ( (lv_content_0_0= ruleContextMessageContent ) )
            // InternalMyDsl.g:1771:4: (lv_content_0_0= ruleContextMessageContent )
            {
            // InternalMyDsl.g:1771:4: (lv_content_0_0= ruleContextMessageContent )
            // InternalMyDsl.g:1772:5: lv_content_0_0= ruleContextMessageContent
            {

            					newCompositeNode(grammarAccess.getContextMessageAccess().getContentContextMessageContentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_51);
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

            // InternalMyDsl.g:1789:3: ( (lv_required_1_0= 'required' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==45) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:1790:4: (lv_required_1_0= 'required' )
                    {
                    // InternalMyDsl.g:1790:4: (lv_required_1_0= 'required' )
                    // InternalMyDsl.g:1791:5: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,45,FOLLOW_52); 

                    					newLeafNode(lv_required_1_0, grammarAccess.getContextMessageAccess().getRequiredRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextMessageRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1803:3: ( (lv_fail_2_0= 'fail' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:1804:4: (lv_fail_2_0= 'fail' )
                    {
                    // InternalMyDsl.g:1804:4: (lv_fail_2_0= 'fail' )
                    // InternalMyDsl.g:1805:5: lv_fail_2_0= 'fail'
                    {
                    lv_fail_2_0=(Token)match(input,46,FOLLOW_53); 

                    					newLeafNode(lv_fail_2_0, grammarAccess.getContextMessageAccess().getFailFailKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextMessageRule());
                    					}
                    					setWithLastConsumed(current, "fail", true, "fail");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1817:3: ( (lv_strict_3_0= 'strict' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==47) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:1818:4: (lv_strict_3_0= 'strict' )
                    {
                    // InternalMyDsl.g:1818:4: (lv_strict_3_0= 'strict' )
                    // InternalMyDsl.g:1819:5: lv_strict_3_0= 'strict'
                    {
                    lv_strict_3_0=(Token)match(input,47,FOLLOW_26); 

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
    // InternalMyDsl.g:1839:1: entryRuleContextMessageContent returns [EObject current=null] : iv_ruleContextMessageContent= ruleContextMessageContent EOF ;
    public final EObject entryRuleContextMessageContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextMessageContent = null;


        try {
            // InternalMyDsl.g:1839:62: (iv_ruleContextMessageContent= ruleContextMessageContent EOF )
            // InternalMyDsl.g:1840:2: iv_ruleContextMessageContent= ruleContextMessageContent EOF
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
    // InternalMyDsl.g:1846:1: ruleContextMessageContent returns [EObject current=null] : ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) ) ;
    public final EObject ruleContextMessageContent() throws RecognitionException {
        EObject current = null;

        EObject lv_match_0_0 = null;

        EObject lv_change_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1852:2: ( ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) ) )
            // InternalMyDsl.g:1853:2: ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) )
            {
            // InternalMyDsl.g:1853:2: ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==52) ) {
                alt52=1;
            }
            else if ( (LA52_0==53||(LA52_0>=55 && LA52_0<=57)) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:1854:3: ( (lv_match_0_0= ruleMatchMessage ) )
                    {
                    // InternalMyDsl.g:1854:3: ( (lv_match_0_0= ruleMatchMessage ) )
                    // InternalMyDsl.g:1855:4: (lv_match_0_0= ruleMatchMessage )
                    {
                    // InternalMyDsl.g:1855:4: (lv_match_0_0= ruleMatchMessage )
                    // InternalMyDsl.g:1856:5: lv_match_0_0= ruleMatchMessage
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
                    // InternalMyDsl.g:1874:3: ( (lv_change_1_0= ruleChangeMessage ) )
                    {
                    // InternalMyDsl.g:1874:3: ( (lv_change_1_0= ruleChangeMessage ) )
                    // InternalMyDsl.g:1875:4: (lv_change_1_0= ruleChangeMessage )
                    {
                    // InternalMyDsl.g:1875:4: (lv_change_1_0= ruleChangeMessage )
                    // InternalMyDsl.g:1876:5: lv_change_1_0= ruleChangeMessage
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
    // InternalMyDsl.g:1897:1: entryRuleMatchMessage returns [EObject current=null] : iv_ruleMatchMessage= ruleMatchMessage EOF ;
    public final EObject entryRuleMatchMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchMessage = null;


        try {
            // InternalMyDsl.g:1897:53: (iv_ruleMatchMessage= ruleMatchMessage EOF )
            // InternalMyDsl.g:1898:2: iv_ruleMatchMessage= ruleMatchMessage EOF
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
    // InternalMyDsl.g:1904:1: ruleMatchMessage returns [EObject current=null] : (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' ) ;
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
            // InternalMyDsl.g:1910:2: ( (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:1911:2: (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:1911:2: (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' )
            // InternalMyDsl.g:1912:3: otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchMessageAccess().getMatchKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getMatchMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1920:3: ( (otherlv_2= RULE_ID ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:1921:4: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:1921:4: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:1922:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMatchMessageRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_54); 

                    					newLeafNode(otherlv_2, grammarAccess.getMatchMessageAccess().getContextContextModelCrossReference_2_0());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1933:3: (otherlv_3= ',' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==40) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:1934:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_55); 

                    				newLeafNode(otherlv_3, grammarAccess.getMatchMessageAccess().getCommaKeyword_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1939:3: ( (otherlv_4= RULE_ID ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:1940:4: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:1940:4: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:1941:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMatchMessageRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_38); 

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
    // InternalMyDsl.g:1960:1: entryRuleChangeMessage returns [EObject current=null] : iv_ruleChangeMessage= ruleChangeMessage EOF ;
    public final EObject entryRuleChangeMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeMessage = null;


        try {
            // InternalMyDsl.g:1960:54: (iv_ruleChangeMessage= ruleChangeMessage EOF )
            // InternalMyDsl.g:1961:2: iv_ruleChangeMessage= ruleChangeMessage EOF
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
    // InternalMyDsl.g:1967:1: ruleChangeMessage returns [EObject current=null] : ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) | ( (lv_changetor_3_0= ruleChangeToRelation ) ) ) ;
    public final EObject ruleChangeMessage() throws RecognitionException {
        EObject current = null;

        EObject lv_disappear_0_0 = null;

        EObject lv_appear_1_0 = null;

        EObject lv_changeto_2_0 = null;

        EObject lv_changetor_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1973:2: ( ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) | ( (lv_changetor_3_0= ruleChangeToRelation ) ) ) )
            // InternalMyDsl.g:1974:2: ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) | ( (lv_changetor_3_0= ruleChangeToRelation ) ) )
            {
            // InternalMyDsl.g:1974:2: ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) | ( (lv_changetor_3_0= ruleChangeToRelation ) ) )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt56=1;
                }
                break;
            case 53:
                {
                alt56=2;
                }
                break;
            case 56:
                {
                alt56=3;
                }
                break;
            case 57:
                {
                alt56=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:1975:3: ( (lv_disappear_0_0= ruleDisappearMessage ) )
                    {
                    // InternalMyDsl.g:1975:3: ( (lv_disappear_0_0= ruleDisappearMessage ) )
                    // InternalMyDsl.g:1976:4: (lv_disappear_0_0= ruleDisappearMessage )
                    {
                    // InternalMyDsl.g:1976:4: (lv_disappear_0_0= ruleDisappearMessage )
                    // InternalMyDsl.g:1977:5: lv_disappear_0_0= ruleDisappearMessage
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
                    // InternalMyDsl.g:1995:3: ( (lv_appear_1_0= ruleAppearMessage ) )
                    {
                    // InternalMyDsl.g:1995:3: ( (lv_appear_1_0= ruleAppearMessage ) )
                    // InternalMyDsl.g:1996:4: (lv_appear_1_0= ruleAppearMessage )
                    {
                    // InternalMyDsl.g:1996:4: (lv_appear_1_0= ruleAppearMessage )
                    // InternalMyDsl.g:1997:5: lv_appear_1_0= ruleAppearMessage
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
                    // InternalMyDsl.g:2015:3: ( (lv_changeto_2_0= ruleChangeToMessage ) )
                    {
                    // InternalMyDsl.g:2015:3: ( (lv_changeto_2_0= ruleChangeToMessage ) )
                    // InternalMyDsl.g:2016:4: (lv_changeto_2_0= ruleChangeToMessage )
                    {
                    // InternalMyDsl.g:2016:4: (lv_changeto_2_0= ruleChangeToMessage )
                    // InternalMyDsl.g:2017:5: lv_changeto_2_0= ruleChangeToMessage
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
                    // InternalMyDsl.g:2035:3: ( (lv_changetor_3_0= ruleChangeToRelation ) )
                    {
                    // InternalMyDsl.g:2035:3: ( (lv_changetor_3_0= ruleChangeToRelation ) )
                    // InternalMyDsl.g:2036:4: (lv_changetor_3_0= ruleChangeToRelation )
                    {
                    // InternalMyDsl.g:2036:4: (lv_changetor_3_0= ruleChangeToRelation )
                    // InternalMyDsl.g:2037:5: lv_changetor_3_0= ruleChangeToRelation
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
    // InternalMyDsl.g:2058:1: entryRuleAppearMessage returns [EObject current=null] : iv_ruleAppearMessage= ruleAppearMessage EOF ;
    public final EObject entryRuleAppearMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppearMessage = null;


        try {
            // InternalMyDsl.g:2058:54: (iv_ruleAppearMessage= ruleAppearMessage EOF )
            // InternalMyDsl.g:2059:2: iv_ruleAppearMessage= ruleAppearMessage EOF
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
    // InternalMyDsl.g:2065:1: ruleAppearMessage returns [EObject current=null] : (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) ;
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
            // InternalMyDsl.g:2071:2: ( (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:2072:2: (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:2072:2: (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            // InternalMyDsl.g:2073:3: otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getAppearMessageAccess().getAppearKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getAppearMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2081:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:2082:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMyDsl.g:2082:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:2083:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:2083:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:2084:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAppearMessageRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_56); 

                    						newLeafNode(otherlv_2, grammarAccess.getAppearMessageAccess().getContextContextModelCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,54,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getAppearMessageAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMyDsl.g:2099:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:2100:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:2100:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:2101:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAppearMessageRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_38); 

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
    // InternalMyDsl.g:2121:1: entryRuleDisappearMessage returns [EObject current=null] : iv_ruleDisappearMessage= ruleDisappearMessage EOF ;
    public final EObject entryRuleDisappearMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisappearMessage = null;


        try {
            // InternalMyDsl.g:2121:57: (iv_ruleDisappearMessage= ruleDisappearMessage EOF )
            // InternalMyDsl.g:2122:2: iv_ruleDisappearMessage= ruleDisappearMessage EOF
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
    // InternalMyDsl.g:2128:1: ruleDisappearMessage returns [EObject current=null] : (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) ;
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
            // InternalMyDsl.g:2134:2: ( (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:2135:2: (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:2135:2: (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            // InternalMyDsl.g:2136:3: otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getDisappearMessageAccess().getDisappearKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getDisappearMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2144:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:2145:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMyDsl.g:2145:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:2146:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:2146:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:2147:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDisappearMessageRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_56); 

                    						newLeafNode(otherlv_2, grammarAccess.getDisappearMessageAccess().getContextContextModelCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,54,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getDisappearMessageAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMyDsl.g:2162:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:2163:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:2163:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:2164:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDisappearMessageRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_38); 

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
    // InternalMyDsl.g:2184:1: entryRuleChangeToMessage returns [EObject current=null] : iv_ruleChangeToMessage= ruleChangeToMessage EOF ;
    public final EObject entryRuleChangeToMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeToMessage = null;


        try {
            // InternalMyDsl.g:2184:56: (iv_ruleChangeToMessage= ruleChangeToMessage EOF )
            // InternalMyDsl.g:2185:2: iv_ruleChangeToMessage= ruleChangeToMessage EOF
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
    // InternalMyDsl.g:2191:1: ruleChangeToMessage returns [EObject current=null] : (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' ) ;
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
            // InternalMyDsl.g:2197:2: ( (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' ) )
            // InternalMyDsl.g:2198:2: (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' )
            {
            // InternalMyDsl.g:2198:2: (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' )
            // InternalMyDsl.g:2199:3: otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeToMessageAccess().getChangeToKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeToMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2207:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:2208:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalMyDsl.g:2208:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:2209:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:2209:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:2210:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToMessageRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_56); 

                    						newLeafNode(otherlv_2, grammarAccess.getChangeToMessageAccess().getContextContextModelCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,54,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getChangeToMessageAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMyDsl.g:2225:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:2226:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:2226:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:2227:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToMessageRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_56); 

                    						newLeafNode(otherlv_4, grammarAccess.getChangeToMessageAccess().getEntityEntityCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,54,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getChangeToMessageAccess().getFullStopKeyword_2_3());
                    			
                    // InternalMyDsl.g:2242:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMyDsl.g:2243:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMyDsl.g:2243:5: (otherlv_6= RULE_ID )
                    // InternalMyDsl.g:2244:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToMessageRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_57); 

                    						newLeafNode(otherlv_6, grammarAccess.getChangeToMessageAccess().getAttributeAttributeCrossReference_2_4_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2256:3: (otherlv_7= ',' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==40) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:2257:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_58); 

                    				newLeafNode(otherlv_7, grammarAccess.getChangeToMessageAccess().getCommaKeyword_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2262:3: ( (lv_changevalue_8_0= ruleAttributeValue ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_STRING && LA61_0<=RULE_NUMBER)||(LA61_0>=27 && LA61_0<=28)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:2263:4: (lv_changevalue_8_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:2263:4: (lv_changevalue_8_0= ruleAttributeValue )
                    // InternalMyDsl.g:2264:5: lv_changevalue_8_0= ruleAttributeValue
                    {

                    					newCompositeNode(grammarAccess.getChangeToMessageAccess().getChangevalueAttributeValueParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:2289:1: entryRuleChangeToRelation returns [EObject current=null] : iv_ruleChangeToRelation= ruleChangeToRelation EOF ;
    public final EObject entryRuleChangeToRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeToRelation = null;


        try {
            // InternalMyDsl.g:2289:57: (iv_ruleChangeToRelation= ruleChangeToRelation EOF )
            // InternalMyDsl.g:2290:2: iv_ruleChangeToRelation= ruleChangeToRelation EOF
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
    // InternalMyDsl.g:2296:1: ruleChangeToRelation returns [EObject current=null] : (otherlv_0= 'relationChangeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' ) ;
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
            // InternalMyDsl.g:2302:2: ( (otherlv_0= 'relationChangeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' ) )
            // InternalMyDsl.g:2303:2: (otherlv_0= 'relationChangeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' )
            {
            // InternalMyDsl.g:2303:2: (otherlv_0= 'relationChangeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' )
            // InternalMyDsl.g:2304:3: otherlv_0= 'relationChangeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeToRelationAccess().getRelationChangeToKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeToRelationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2312:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMyDsl.g:2313:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalMyDsl.g:2313:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:2314:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:2314:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:2315:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToRelationRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_56); 

                    						newLeafNode(otherlv_2, grammarAccess.getChangeToRelationAccess().getContextContextModelCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,54,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getChangeToRelationAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMyDsl.g:2330:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:2331:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:2331:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:2332:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToRelationRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_56); 

                    						newLeafNode(otherlv_4, grammarAccess.getChangeToRelationAccess().getRelationRelationCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,54,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getChangeToRelationAccess().getFullStopKeyword_2_3());
                    			
                    // InternalMyDsl.g:2347:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMyDsl.g:2348:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMyDsl.g:2348:5: (otherlv_6= RULE_ID )
                    // InternalMyDsl.g:2349:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToRelationRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_57); 

                    						newLeafNode(otherlv_6, grammarAccess.getChangeToRelationAccess().getAttributeAttributeCrossReference_2_4_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2361:3: (otherlv_7= ',' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==40) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMyDsl.g:2362:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_58); 

                    				newLeafNode(otherlv_7, grammarAccess.getChangeToRelationAccess().getCommaKeyword_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2367:3: ( (lv_changevalue_8_0= ruleAttributeValue ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_NUMBER)||(LA64_0>=27 && LA64_0<=28)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMyDsl.g:2368:4: (lv_changevalue_8_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:2368:4: (lv_changevalue_8_0= ruleAttributeValue )
                    // InternalMyDsl.g:2369:5: lv_changevalue_8_0= ruleAttributeValue
                    {

                    					newCompositeNode(grammarAccess.getChangeToRelationAccess().getChangevalueAttributeValueParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:2394:1: entryRuleAssertionEntity returns [EObject current=null] : iv_ruleAssertionEntity= ruleAssertionEntity EOF ;
    public final EObject entryRuleAssertionEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionEntity = null;


        try {
            // InternalMyDsl.g:2394:56: (iv_ruleAssertionEntity= ruleAssertionEntity EOF )
            // InternalMyDsl.g:2395:2: iv_ruleAssertionEntity= ruleAssertionEntity EOF
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
    // InternalMyDsl.g:2401:1: ruleAssertionEntity returns [EObject current=null] : (otherlv_0= 'assertEntityAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' ) ;
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
            // InternalMyDsl.g:2407:2: ( (otherlv_0= 'assertEntityAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' ) )
            // InternalMyDsl.g:2408:2: (otherlv_0= 'assertEntityAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' )
            {
            // InternalMyDsl.g:2408:2: (otherlv_0= 'assertEntityAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' )
            // InternalMyDsl.g:2409:3: otherlv_0= 'assertEntityAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertionEntityAccess().getAssertEntityAttributeKeyword_0());
            		
            otherlv_1=(Token)match(input,59,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertionEntityAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:2417:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:2418:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:2418:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:2419:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertionEntityRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_56); 

            					newLeafNode(otherlv_2, grammarAccess.getAssertionEntityAccess().getContextContextModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,54,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getAssertionEntityAccess().getFullStopKeyword_3());
            		
            // InternalMyDsl.g:2434:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:2435:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:2435:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:2436:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertionEntityRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_56); 

            					newLeafNode(otherlv_4, grammarAccess.getAssertionEntityAccess().getEntityEntityCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,54,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getAssertionEntityAccess().getFullStopKeyword_5());
            		
            // InternalMyDsl.g:2451:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:2452:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:2452:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:2453:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertionEntityRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_60); 

            					newLeafNode(otherlv_6, grammarAccess.getAssertionEntityAccess().getAttributeAttributeCrossReference_6_0());
            				

            }


            }

            // InternalMyDsl.g:2464:3: ( (lv_operator_7_0= ruleOperator ) )
            // InternalMyDsl.g:2465:4: (lv_operator_7_0= ruleOperator )
            {
            // InternalMyDsl.g:2465:4: (lv_operator_7_0= ruleOperator )
            // InternalMyDsl.g:2466:5: lv_operator_7_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getAssertionEntityAccess().getOperatorOperatorParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalMyDsl.g:2483:3: ( (lv_value_8_0= ruleAttributeValue ) )
            // InternalMyDsl.g:2484:4: (lv_value_8_0= ruleAttributeValue )
            {
            // InternalMyDsl.g:2484:4: (lv_value_8_0= ruleAttributeValue )
            // InternalMyDsl.g:2485:5: lv_value_8_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getAssertionEntityAccess().getValueAttributeValueParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_61);
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

            otherlv_9=(Token)match(input,60,FOLLOW_26); 

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
    // InternalMyDsl.g:2514:1: entryRuleAssertionRelation returns [EObject current=null] : iv_ruleAssertionRelation= ruleAssertionRelation EOF ;
    public final EObject entryRuleAssertionRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionRelation = null;


        try {
            // InternalMyDsl.g:2514:58: (iv_ruleAssertionRelation= ruleAssertionRelation EOF )
            // InternalMyDsl.g:2515:2: iv_ruleAssertionRelation= ruleAssertionRelation EOF
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
    // InternalMyDsl.g:2521:1: ruleAssertionRelation returns [EObject current=null] : (otherlv_0= 'assertRelationAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' ) ;
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
            // InternalMyDsl.g:2527:2: ( (otherlv_0= 'assertRelationAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' ) )
            // InternalMyDsl.g:2528:2: (otherlv_0= 'assertRelationAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' )
            {
            // InternalMyDsl.g:2528:2: (otherlv_0= 'assertRelationAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';' )
            // InternalMyDsl.g:2529:3: otherlv_0= 'assertRelationAttribute' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) ( (lv_operator_7_0= ruleOperator ) ) ( (lv_value_8_0= ruleAttributeValue ) ) otherlv_9= ']' otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertionRelationAccess().getAssertRelationAttributeKeyword_0());
            		
            otherlv_1=(Token)match(input,59,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertionRelationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:2537:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:2538:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:2538:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:2539:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertionRelationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_56); 

            					newLeafNode(otherlv_2, grammarAccess.getAssertionRelationAccess().getContextContextModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,54,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getAssertionRelationAccess().getFullStopKeyword_3());
            		
            // InternalMyDsl.g:2554:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:2555:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:2555:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:2556:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertionRelationRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_56); 

            					newLeafNode(otherlv_4, grammarAccess.getAssertionRelationAccess().getRelationRelationCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,54,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getAssertionRelationAccess().getFullStopKeyword_5());
            		
            // InternalMyDsl.g:2571:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:2572:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:2572:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:2573:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertionRelationRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_60); 

            					newLeafNode(otherlv_6, grammarAccess.getAssertionRelationAccess().getAttributeAttributeCrossReference_6_0());
            				

            }


            }

            // InternalMyDsl.g:2584:3: ( (lv_operator_7_0= ruleOperator ) )
            // InternalMyDsl.g:2585:4: (lv_operator_7_0= ruleOperator )
            {
            // InternalMyDsl.g:2585:4: (lv_operator_7_0= ruleOperator )
            // InternalMyDsl.g:2586:5: lv_operator_7_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getAssertionRelationAccess().getOperatorOperatorParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalMyDsl.g:2603:3: ( (lv_value_8_0= ruleAttributeValue ) )
            // InternalMyDsl.g:2604:4: (lv_value_8_0= ruleAttributeValue )
            {
            // InternalMyDsl.g:2604:4: (lv_value_8_0= ruleAttributeValue )
            // InternalMyDsl.g:2605:5: lv_value_8_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getAssertionRelationAccess().getValueAttributeValueParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_61);
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

            otherlv_9=(Token)match(input,60,FOLLOW_26); 

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
    // InternalMyDsl.g:2634:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // InternalMyDsl.g:2634:47: (iv_ruleParams= ruleParams EOF )
            // InternalMyDsl.g:2635:2: iv_ruleParams= ruleParams EOF
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
    // InternalMyDsl.g:2641:1: ruleParams returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) )? (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2647:2: ( ( ( (otherlv_0= RULE_ID ) )? (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalMyDsl.g:2648:2: ( ( (otherlv_0= RULE_ID ) )? (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalMyDsl.g:2648:2: ( ( (otherlv_0= RULE_ID ) )? (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalMyDsl.g:2649:3: ( (otherlv_0= RULE_ID ) )? (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalMyDsl.g:2649:3: ( (otherlv_0= RULE_ID ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyDsl.g:2650:4: (otherlv_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2650:4: (otherlv_0= RULE_ID )
                    // InternalMyDsl.g:2651:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParamsRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_62); 

                    					newLeafNode(otherlv_0, grammarAccess.getParamsAccess().getParamsParameterCrossReference_0_0());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2662:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==40) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalMyDsl.g:2663:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,40,FOLLOW_12); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParamsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:2667:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalMyDsl.g:2668:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalMyDsl.g:2668:5: (otherlv_2= RULE_ID )
            	    // InternalMyDsl.g:2669:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getParamsRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_62); 

            	    						newLeafNode(otherlv_2, grammarAccess.getParamsAccess().getParamsParameterCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
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
    // InternalMyDsl.g:2685:1: entryRuleConstantParams returns [EObject current=null] : iv_ruleConstantParams= ruleConstantParams EOF ;
    public final EObject entryRuleConstantParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantParams = null;


        try {
            // InternalMyDsl.g:2685:55: (iv_ruleConstantParams= ruleConstantParams EOF )
            // InternalMyDsl.g:2686:2: iv_ruleConstantParams= ruleConstantParams EOF
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
    // InternalMyDsl.g:2692:1: ruleConstantParams returns [EObject current=null] : ( ( (lv_values_0_0= ruleAttributeValue ) )? (otherlv_1= ',' ( (lv_values_2_0= ruleAttributeValue ) ) )* ) ;
    public final EObject ruleConstantParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2698:2: ( ( ( (lv_values_0_0= ruleAttributeValue ) )? (otherlv_1= ',' ( (lv_values_2_0= ruleAttributeValue ) ) )* ) )
            // InternalMyDsl.g:2699:2: ( ( (lv_values_0_0= ruleAttributeValue ) )? (otherlv_1= ',' ( (lv_values_2_0= ruleAttributeValue ) ) )* )
            {
            // InternalMyDsl.g:2699:2: ( ( (lv_values_0_0= ruleAttributeValue ) )? (otherlv_1= ',' ( (lv_values_2_0= ruleAttributeValue ) ) )* )
            // InternalMyDsl.g:2700:3: ( (lv_values_0_0= ruleAttributeValue ) )? (otherlv_1= ',' ( (lv_values_2_0= ruleAttributeValue ) ) )*
            {
            // InternalMyDsl.g:2700:3: ( (lv_values_0_0= ruleAttributeValue ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_NUMBER)||(LA67_0>=27 && LA67_0<=28)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyDsl.g:2701:4: (lv_values_0_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:2701:4: (lv_values_0_0= ruleAttributeValue )
                    // InternalMyDsl.g:2702:5: lv_values_0_0= ruleAttributeValue
                    {

                    					newCompositeNode(grammarAccess.getConstantParamsAccess().getValuesAttributeValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_62);
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

            // InternalMyDsl.g:2719:3: (otherlv_1= ',' ( (lv_values_2_0= ruleAttributeValue ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==40) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalMyDsl.g:2720:4: otherlv_1= ',' ( (lv_values_2_0= ruleAttributeValue ) )
            	    {
            	    otherlv_1=(Token)match(input,40,FOLLOW_33); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConstantParamsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:2724:4: ( (lv_values_2_0= ruleAttributeValue ) )
            	    // InternalMyDsl.g:2725:5: (lv_values_2_0= ruleAttributeValue )
            	    {
            	    // InternalMyDsl.g:2725:5: (lv_values_2_0= ruleAttributeValue )
            	    // InternalMyDsl.g:2726:6: lv_values_2_0= ruleAttributeValue
            	    {

            	    						newCompositeNode(grammarAccess.getConstantParamsAccess().getValuesAttributeValueParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_62);
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
            	    break loop68;
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
    // InternalMyDsl.g:2748:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMyDsl.g:2748:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMyDsl.g:2749:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalMyDsl.g:2755:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' )? ( (lv_value_3_0= ruleAttributeValue ) )? otherlv_4= ';' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2761:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' )? ( (lv_value_3_0= ruleAttributeValue ) )? otherlv_4= ';' ) )
            // InternalMyDsl.g:2762:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' )? ( (lv_value_3_0= ruleAttributeValue ) )? otherlv_4= ';' )
            {
            // InternalMyDsl.g:2762:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' )? ( (lv_value_3_0= ruleAttributeValue ) )? otherlv_4= ';' )
            // InternalMyDsl.g:2763:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' )? ( (lv_value_3_0= ruleAttributeValue ) )? otherlv_4= ';'
            {
            // InternalMyDsl.g:2763:3: ( (lv_type_0_0= ruleType ) )
            // InternalMyDsl.g:2764:4: (lv_type_0_0= ruleType )
            {
            // InternalMyDsl.g:2764:4: (lv_type_0_0= ruleType )
            // InternalMyDsl.g:2765:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalMyDsl.g:2782:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2783:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2783:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2784:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalMyDsl.g:2800:3: (otherlv_2= '=' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==25) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyDsl.g:2801:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEqualsSignKeyword_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2806:3: ( (lv_value_3_0= ruleAttributeValue ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_STRING && LA70_0<=RULE_NUMBER)||(LA70_0>=27 && LA70_0<=28)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMyDsl.g:2807:4: (lv_value_3_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:2807:4: (lv_value_3_0= ruleAttributeValue )
                    // InternalMyDsl.g:2808:5: lv_value_3_0= ruleAttributeValue
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getValueAttributeValueParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2833:1: entryRuleParameterConstraint returns [EObject current=null] : iv_ruleParameterConstraint= ruleParameterConstraint EOF ;
    public final EObject entryRuleParameterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterConstraint = null;


        try {
            // InternalMyDsl.g:2833:60: (iv_ruleParameterConstraint= ruleParameterConstraint EOF )
            // InternalMyDsl.g:2834:2: iv_ruleParameterConstraint= ruleParameterConstraint EOF
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
    // InternalMyDsl.g:2840:1: ruleParameterConstraint returns [EObject current=null] : (otherlv_0= 'assertParameter' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_value_4_0= ruleAttributeValue ) ) otherlv_5= ']' otherlv_6= 'in' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) ;
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
            // InternalMyDsl.g:2846:2: ( (otherlv_0= 'assertParameter' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_value_4_0= ruleAttributeValue ) ) otherlv_5= ']' otherlv_6= 'in' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) )
            // InternalMyDsl.g:2847:2: (otherlv_0= 'assertParameter' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_value_4_0= ruleAttributeValue ) ) otherlv_5= ']' otherlv_6= 'in' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            {
            // InternalMyDsl.g:2847:2: (otherlv_0= 'assertParameter' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_value_4_0= ruleAttributeValue ) ) otherlv_5= ']' otherlv_6= 'in' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            // InternalMyDsl.g:2848:3: otherlv_0= 'assertParameter' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_value_4_0= ruleAttributeValue ) ) otherlv_5= ']' otherlv_6= 'in' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterConstraintAccess().getAssertParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,59,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterConstraintAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:2856:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:2857:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:2857:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:2858:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterConstraintRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_60); 

            					newLeafNode(otherlv_2, grammarAccess.getParameterConstraintAccess().getParamParameterCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:2869:3: ( (lv_operator_3_0= ruleOperator ) )
            // InternalMyDsl.g:2870:4: (lv_operator_3_0= ruleOperator )
            {
            // InternalMyDsl.g:2870:4: (lv_operator_3_0= ruleOperator )
            // InternalMyDsl.g:2871:5: lv_operator_3_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getParameterConstraintAccess().getOperatorOperatorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalMyDsl.g:2888:3: ( (lv_value_4_0= ruleAttributeValue ) )
            // InternalMyDsl.g:2889:4: (lv_value_4_0= ruleAttributeValue )
            {
            // InternalMyDsl.g:2889:4: (lv_value_4_0= ruleAttributeValue )
            // InternalMyDsl.g:2890:5: lv_value_4_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getParameterConstraintAccess().getValueAttributeValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_61);
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

            otherlv_5=(Token)match(input,60,FOLLOW_63); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterConstraintAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,63,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterConstraintAccess().getInKeyword_6());
            		
            // InternalMyDsl.g:2915:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:2916:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:2916:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:2917:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterConstraintRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_26); 

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
    // InternalMyDsl.g:2936:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalMyDsl.g:2936:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalMyDsl.g:2937:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalMyDsl.g:2943:1: ruleOperator returns [EObject current=null] : ( ( (lv_greater_0_0= '>' ) ) | ( (lv_smaller_1_0= '<' ) ) | ( (lv_greaterequals_2_0= '>=' ) ) | ( (lv_smallerequals_3_0= '<=' ) ) | ( (lv_equals_4_0= '==' ) ) | ( (lv_notequals_5_0= '!=' ) ) ) ;
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
            // InternalMyDsl.g:2949:2: ( ( ( (lv_greater_0_0= '>' ) ) | ( (lv_smaller_1_0= '<' ) ) | ( (lv_greaterequals_2_0= '>=' ) ) | ( (lv_smallerequals_3_0= '<=' ) ) | ( (lv_equals_4_0= '==' ) ) | ( (lv_notequals_5_0= '!=' ) ) ) )
            // InternalMyDsl.g:2950:2: ( ( (lv_greater_0_0= '>' ) ) | ( (lv_smaller_1_0= '<' ) ) | ( (lv_greaterequals_2_0= '>=' ) ) | ( (lv_smallerequals_3_0= '<=' ) ) | ( (lv_equals_4_0= '==' ) ) | ( (lv_notequals_5_0= '!=' ) ) )
            {
            // InternalMyDsl.g:2950:2: ( ( (lv_greater_0_0= '>' ) ) | ( (lv_smaller_1_0= '<' ) ) | ( (lv_greaterequals_2_0= '>=' ) ) | ( (lv_smallerequals_3_0= '<=' ) ) | ( (lv_equals_4_0= '==' ) ) | ( (lv_notequals_5_0= '!=' ) ) )
            int alt71=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt71=1;
                }
                break;
            case 31:
                {
                alt71=2;
                }
                break;
            case 32:
                {
                alt71=3;
                }
                break;
            case 33:
                {
                alt71=4;
                }
                break;
            case 34:
                {
                alt71=5;
                }
                break;
            case 35:
                {
                alt71=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalMyDsl.g:2951:3: ( (lv_greater_0_0= '>' ) )
                    {
                    // InternalMyDsl.g:2951:3: ( (lv_greater_0_0= '>' ) )
                    // InternalMyDsl.g:2952:4: (lv_greater_0_0= '>' )
                    {
                    // InternalMyDsl.g:2952:4: (lv_greater_0_0= '>' )
                    // InternalMyDsl.g:2953:5: lv_greater_0_0= '>'
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
                    // InternalMyDsl.g:2966:3: ( (lv_smaller_1_0= '<' ) )
                    {
                    // InternalMyDsl.g:2966:3: ( (lv_smaller_1_0= '<' ) )
                    // InternalMyDsl.g:2967:4: (lv_smaller_1_0= '<' )
                    {
                    // InternalMyDsl.g:2967:4: (lv_smaller_1_0= '<' )
                    // InternalMyDsl.g:2968:5: lv_smaller_1_0= '<'
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
                    // InternalMyDsl.g:2981:3: ( (lv_greaterequals_2_0= '>=' ) )
                    {
                    // InternalMyDsl.g:2981:3: ( (lv_greaterequals_2_0= '>=' ) )
                    // InternalMyDsl.g:2982:4: (lv_greaterequals_2_0= '>=' )
                    {
                    // InternalMyDsl.g:2982:4: (lv_greaterequals_2_0= '>=' )
                    // InternalMyDsl.g:2983:5: lv_greaterequals_2_0= '>='
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
                    // InternalMyDsl.g:2996:3: ( (lv_smallerequals_3_0= '<=' ) )
                    {
                    // InternalMyDsl.g:2996:3: ( (lv_smallerequals_3_0= '<=' ) )
                    // InternalMyDsl.g:2997:4: (lv_smallerequals_3_0= '<=' )
                    {
                    // InternalMyDsl.g:2997:4: (lv_smallerequals_3_0= '<=' )
                    // InternalMyDsl.g:2998:5: lv_smallerequals_3_0= '<='
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
                    // InternalMyDsl.g:3011:3: ( (lv_equals_4_0= '==' ) )
                    {
                    // InternalMyDsl.g:3011:3: ( (lv_equals_4_0= '==' ) )
                    // InternalMyDsl.g:3012:4: (lv_equals_4_0= '==' )
                    {
                    // InternalMyDsl.g:3012:4: (lv_equals_4_0= '==' )
                    // InternalMyDsl.g:3013:5: lv_equals_4_0= '=='
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
                    // InternalMyDsl.g:3026:3: ( (lv_notequals_5_0= '!=' ) )
                    {
                    // InternalMyDsl.g:3026:3: ( (lv_notequals_5_0= '!=' ) )
                    // InternalMyDsl.g:3027:4: (lv_notequals_5_0= '!=' )
                    {
                    // InternalMyDsl.g:3027:4: (lv_notequals_5_0= '!=' )
                    // InternalMyDsl.g:3028:5: lv_notequals_5_0= '!='
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


    // $ANTLR start "entryRuleObjectType"
    // InternalMyDsl.g:3044:1: entryRuleObjectType returns [EObject current=null] : iv_ruleObjectType= ruleObjectType EOF ;
    public final EObject entryRuleObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectType = null;


        try {
            // InternalMyDsl.g:3044:51: (iv_ruleObjectType= ruleObjectType EOF )
            // InternalMyDsl.g:3045:2: iv_ruleObjectType= ruleObjectType EOF
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
    // InternalMyDsl.g:3051:1: ruleObjectType returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObjectType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3057:2: ( (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:3058:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:3058:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:3059:3: otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectTypeAccess().getObjectKeyword_0());
            		
            // InternalMyDsl.g:3063:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3064:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3064:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3065:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:3085:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalMyDsl.g:3085:47: (iv_ruleObject= ruleObject EOF )
            // InternalMyDsl.g:3086:2: iv_ruleObject= ruleObject EOF
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
    // InternalMyDsl.g:3092:1: ruleObject returns [EObject current=null] : ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_object_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3098:2: ( ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:3099:2: ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:3099:2: ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMyDsl.g:3100:3: ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalMyDsl.g:3100:3: ( (lv_object_0_0= ruleObjectType ) )
            // InternalMyDsl.g:3101:4: (lv_object_0_0= ruleObjectType )
            {
            // InternalMyDsl.g:3101:4: (lv_object_0_0= ruleObjectType )
            // InternalMyDsl.g:3102:5: lv_object_0_0= ruleObjectType
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getObjectObjectTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalMyDsl.g:3119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3120:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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
    // InternalMyDsl.g:3145:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMyDsl.g:3145:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyDsl.g:3146:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalMyDsl.g:3152:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_messages_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3158:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:3159:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:3159:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            // InternalMyDsl.g:3160:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalMyDsl.g:3164:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3165:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3165:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3166:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_64); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3186:3: ( (lv_messages_3_0= ruleMessage ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==44) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalMyDsl.g:3187:4: (lv_messages_3_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:3187:4: (lv_messages_3_0= ruleMessage )
            	    // InternalMyDsl.g:3188:5: lv_messages_3_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintAccess().getMessagesMessageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_64);
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
            	    break loop72;
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
    // InternalMyDsl.g:3213:1: entryRuleAlt returns [EObject current=null] : iv_ruleAlt= ruleAlt EOF ;
    public final EObject entryRuleAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlt = null;


        try {
            // InternalMyDsl.g:3213:44: (iv_ruleAlt= ruleAlt EOF )
            // InternalMyDsl.g:3214:2: iv_ruleAlt= ruleAlt EOF
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
    // InternalMyDsl.g:3220:1: ruleAlt returns [EObject current=null] : (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* ) ;
    public final EObject ruleAlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3226:2: ( (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* ) )
            // InternalMyDsl.g:3227:2: (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* )
            {
            // InternalMyDsl.g:3227:2: (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* )
            // InternalMyDsl.g:3228:3: otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )*
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65); 

            			newLeafNode(otherlv_0, grammarAccess.getAltAccess().getAltKeyword_0());
            		
            // InternalMyDsl.g:3232:3: ( (lv_expressions_1_0= ruleExpression ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==39) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalMyDsl.g:3233:4: (lv_expressions_1_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:3233:4: (lv_expressions_1_0= ruleExpression )
            	    // InternalMyDsl.g:3234:5: lv_expressions_1_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getAltAccess().getExpressionsExpressionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_65);
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
            	    break loop73;
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
    // InternalMyDsl.g:3255:1: entryRuleAltCondition returns [EObject current=null] : iv_ruleAltCondition= ruleAltCondition EOF ;
    public final EObject entryRuleAltCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAltCondition = null;


        try {
            // InternalMyDsl.g:3255:53: (iv_ruleAltCondition= ruleAltCondition EOF )
            // InternalMyDsl.g:3256:2: iv_ruleAltCondition= ruleAltCondition EOF
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
    // InternalMyDsl.g:3262:1: ruleAltCondition returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleAttributeValue ) ) ) | ( (lv_else_3_0= 'else' ) ) ) ;
    public final EObject ruleAltCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_else_3_0=null;
        EObject lv_operator_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3268:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleAttributeValue ) ) ) | ( (lv_else_3_0= 'else' ) ) ) )
            // InternalMyDsl.g:3269:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleAttributeValue ) ) ) | ( (lv_else_3_0= 'else' ) ) )
            {
            // InternalMyDsl.g:3269:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleAttributeValue ) ) ) | ( (lv_else_3_0= 'else' ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_ID) ) {
                alt74=1;
            }
            else if ( (LA74_0==66) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalMyDsl.g:3270:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleAttributeValue ) ) )
                    {
                    // InternalMyDsl.g:3270:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleAttributeValue ) ) )
                    // InternalMyDsl.g:3271:4: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleAttributeValue ) )
                    {
                    // InternalMyDsl.g:3271:4: ( (otherlv_0= RULE_ID ) )
                    // InternalMyDsl.g:3272:5: (otherlv_0= RULE_ID )
                    {
                    // InternalMyDsl.g:3272:5: (otherlv_0= RULE_ID )
                    // InternalMyDsl.g:3273:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAltConditionRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_60); 

                    						newLeafNode(otherlv_0, grammarAccess.getAltConditionAccess().getParamParameterCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:3284:4: ( (lv_operator_1_0= ruleOperator ) )
                    // InternalMyDsl.g:3285:5: (lv_operator_1_0= ruleOperator )
                    {
                    // InternalMyDsl.g:3285:5: (lv_operator_1_0= ruleOperator )
                    // InternalMyDsl.g:3286:6: lv_operator_1_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getAltConditionAccess().getOperatorOperatorParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalMyDsl.g:3303:4: ( (lv_value_2_0= ruleAttributeValue ) )
                    // InternalMyDsl.g:3304:5: (lv_value_2_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:3304:5: (lv_value_2_0= ruleAttributeValue )
                    // InternalMyDsl.g:3305:6: lv_value_2_0= ruleAttributeValue
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
                    // InternalMyDsl.g:3324:3: ( (lv_else_3_0= 'else' ) )
                    {
                    // InternalMyDsl.g:3324:3: ( (lv_else_3_0= 'else' ) )
                    // InternalMyDsl.g:3325:4: (lv_else_3_0= 'else' )
                    {
                    // InternalMyDsl.g:3325:4: (lv_else_3_0= 'else' )
                    // InternalMyDsl.g:3326:5: lv_else_3_0= 'else'
                    {
                    lv_else_3_0=(Token)match(input,66,FOLLOW_2); 

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
    // InternalMyDsl.g:3342:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:3342:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:3343:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:3349:1: ruleExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_altCondition_1_0= ruleAltCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) )* otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:3355:2: ( (otherlv_0= '(' ( (lv_altCondition_1_0= ruleAltCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:3356:2: (otherlv_0= '(' ( (lv_altCondition_1_0= ruleAltCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:3356:2: (otherlv_0= '(' ( (lv_altCondition_1_0= ruleAltCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) )* otherlv_5= '}' )
            // InternalMyDsl.g:3357:3: otherlv_0= '(' ( (lv_altCondition_1_0= ruleAltCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_66); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:3361:3: ( (lv_altCondition_1_0= ruleAltCondition ) )
            // InternalMyDsl.g:3362:4: (lv_altCondition_1_0= ruleAltCondition )
            {
            // InternalMyDsl.g:3362:4: (lv_altCondition_1_0= ruleAltCondition )
            // InternalMyDsl.g:3363:5: lv_altCondition_1_0= ruleAltCondition
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getAltConditionAltConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
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

            otherlv_2=(Token)match(input,41,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_64); 

            			newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:3388:3: ( (lv_messages_4_0= ruleMessage ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==44) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalMyDsl.g:3389:4: (lv_messages_4_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:3389:4: (lv_messages_4_0= ruleMessage )
            	    // InternalMyDsl.g:3390:5: lv_messages_4_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getExpressionAccess().getMessagesMessageParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_64);
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
            	    break loop75;
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
    // InternalMyDsl.g:3415:1: entryRulePar returns [EObject current=null] : iv_rulePar= rulePar EOF ;
    public final EObject entryRulePar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePar = null;


        try {
            // InternalMyDsl.g:3415:44: (iv_rulePar= rulePar EOF )
            // InternalMyDsl.g:3416:2: iv_rulePar= rulePar EOF
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
    // InternalMyDsl.g:3422:1: rulePar returns [EObject current=null] : (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' ) ;
    public final EObject rulePar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parexpression_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3428:2: ( (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:3429:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:3429:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' )
            // InternalMyDsl.g:3430:3: otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getParAccess().getParKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_67); 

            			newLeafNode(otherlv_1, grammarAccess.getParAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:3438:3: ( (lv_parexpression_2_0= ruleParExpression ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==68) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalMyDsl.g:3439:4: (lv_parexpression_2_0= ruleParExpression )
            	    {
            	    // InternalMyDsl.g:3439:4: (lv_parexpression_2_0= ruleParExpression )
            	    // InternalMyDsl.g:3440:5: lv_parexpression_2_0= ruleParExpression
            	    {

            	    					newCompositeNode(grammarAccess.getParAccess().getParexpressionParExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_67);
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
            	    break loop76;
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
    // InternalMyDsl.g:3465:1: entryRuleParExpression returns [EObject current=null] : iv_ruleParExpression= ruleParExpression EOF ;
    public final EObject entryRuleParExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParExpression = null;


        try {
            // InternalMyDsl.g:3465:54: (iv_ruleParExpression= ruleParExpression EOF )
            // InternalMyDsl.g:3466:2: iv_ruleParExpression= ruleParExpression EOF
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
    // InternalMyDsl.g:3472:1: ruleParExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) ;
    public final EObject ruleParExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_messages_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3478:2: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:3479:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:3479:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            // InternalMyDsl.g:3480:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getParExpressionAccess().getCaseKeyword_0());
            		
            // InternalMyDsl.g:3484:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3485:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3485:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3486:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_64); 

            			newLeafNode(otherlv_2, grammarAccess.getParExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3506:3: ( (lv_messages_3_0= ruleMessage ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==44) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalMyDsl.g:3507:4: (lv_messages_3_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:3507:4: (lv_messages_3_0= ruleMessage )
            	    // InternalMyDsl.g:3508:5: lv_messages_3_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getParExpressionAccess().getMessagesMessageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_64);
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
            	    break loop77;
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
    // InternalMyDsl.g:3533:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalMyDsl.g:3533:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalMyDsl.g:3534:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalMyDsl.g:3540:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' ) ;
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
            // InternalMyDsl.g:3546:2: ( (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' ) )
            // InternalMyDsl.g:3547:2: (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' )
            {
            // InternalMyDsl.g:3547:2: (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' )
            // InternalMyDsl.g:3548:3: otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:3556:3: ( (lv_min_2_0= RULE_NUMBER ) )
            // InternalMyDsl.g:3557:4: (lv_min_2_0= RULE_NUMBER )
            {
            // InternalMyDsl.g:3557:4: (lv_min_2_0= RULE_NUMBER )
            // InternalMyDsl.g:3558:5: lv_min_2_0= RULE_NUMBER
            {
            lv_min_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_37); 

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

            otherlv_3=(Token)match(input,40,FOLLOW_68); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:3578:3: ( (lv_max_4_0= RULE_NUMBER ) )
            // InternalMyDsl.g:3579:4: (lv_max_4_0= RULE_NUMBER )
            {
            // InternalMyDsl.g:3579:4: (lv_max_4_0= RULE_NUMBER )
            // InternalMyDsl.g:3580:5: lv_max_4_0= RULE_NUMBER
            {
            lv_max_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_38); 

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

            otherlv_5=(Token)match(input,41,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_64); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:3604:3: ( (lv_messages_7_0= ruleMessage ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==44) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalMyDsl.g:3605:4: (lv_messages_7_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:3605:4: (lv_messages_7_0= ruleMessage )
            	    // InternalMyDsl.g:3606:5: lv_messages_7_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getLoopAccess().getMessagesMessageParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_64);
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
            	    break loop78;
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
    // InternalMyDsl.g:3631:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'string' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3637:2: ( ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'string' ) ) )
            // InternalMyDsl.g:3638:2: ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'string' ) )
            {
            // InternalMyDsl.g:3638:2: ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'string' ) )
            int alt79=4;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt79=1;
                }
                break;
            case 22:
                {
                alt79=2;
                }
                break;
            case 71:
                {
                alt79=3;
                }
                break;
            case 23:
                {
                alt79=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalMyDsl.g:3639:3: (enumLiteral_0= 'integer' )
                    {
                    // InternalMyDsl.g:3639:3: (enumLiteral_0= 'integer' )
                    // InternalMyDsl.g:3640:4: enumLiteral_0= 'integer'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getIntegerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3647:3: (enumLiteral_1= 'float' )
                    {
                    // InternalMyDsl.g:3647:3: (enumLiteral_1= 'float' )
                    // InternalMyDsl.g:3648:4: enumLiteral_1= 'float'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3655:3: (enumLiteral_2= 'bool' )
                    {
                    // InternalMyDsl.g:3655:3: (enumLiteral_2= 'bool' )
                    // InternalMyDsl.g:3656:4: enumLiteral_2= 'bool'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBoolEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBoolEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3663:3: (enumLiteral_3= 'string' )
                    {
                    // InternalMyDsl.g:3663:3: (enumLiteral_3= 'string' )
                    // InternalMyDsl.g:3664:4: enumLiteral_3= 'string'
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0008080000CDC012L,0x00000000000000C1L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0008080000CDC002L,0x00000000000000C1L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008080000CD8002L,0x00000000000000C1L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0008080000CC8002L,0x00000000000000C1L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0008080000C88002L,0x00000000000000C1L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0008080000C08002L,0x00000000000000C1L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0008080000C08002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0008080000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000005000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000042000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001E00010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001C00010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000001E0000E0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000001C0000E0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000FD80000E0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000F980000E0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000F180000E0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000E180000E0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000C180000E0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000008180000E0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000180000E0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x67B0100000008000L,0x000000000000002AL});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000300180000F0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000E00000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000C00000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000E00000400C010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000C00000400C010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000800000400C010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x000000000400C010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000004008010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000E00004000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000C00004000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000030000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00000300180000E0L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00000200180000E0L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000FC0000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000080L});

}