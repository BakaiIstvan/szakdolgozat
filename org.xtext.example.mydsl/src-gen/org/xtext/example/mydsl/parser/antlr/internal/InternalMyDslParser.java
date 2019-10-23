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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_REAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'{'", "'}'", "'import'", "'contextmodel'", "'contextfragment'", "'attribute'", "'int'", "'float'", "'string'", "'boolean'", "'='", "';'", "'true'", "'false'", "'attributeconstraint'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'entity'", "'entityconstraint'", "'relation'", "'('", "','", "')'", "'relationconstraint'", "'scenario'", "'message'", "'required'", "'fail'", "'strict'", "'->'", "'past'", "'future'", "'constraint'", "'match'", "'appear'", "'.'", "'disappear'", "'changeTo'", "'relationChangeTo'", "'object'", "'alt'", "'par'", "'case'", "'loop'"
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
    public static final int RULE_REAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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
    public static final int RULE_NUMBER=6;
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
    // InternalMyDsl.g:71:1: ruleDomain returns [EObject current=null] : ( ( (lv_specification_0_0= 'specification' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '{' )? ( (lv_includes_3_0= ruleInclude ) )* ( (lv_contextmodels_4_0= ruleContextModel ) )* ( (lv_contextfragments_5_0= ruleContextFragment ) )* ( (lv_objects_6_0= ruleObject ) )* ( (lv_constraints_7_0= ruleConstraint ) )* ( (lv_scenarios_8_0= ruleScenario ) )* (otherlv_9= '}' )? ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token lv_specification_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_9=null;
        EObject lv_includes_3_0 = null;

        EObject lv_contextmodels_4_0 = null;

        EObject lv_contextfragments_5_0 = null;

        EObject lv_objects_6_0 = null;

        EObject lv_constraints_7_0 = null;

        EObject lv_scenarios_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_specification_0_0= 'specification' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '{' )? ( (lv_includes_3_0= ruleInclude ) )* ( (lv_contextmodels_4_0= ruleContextModel ) )* ( (lv_contextfragments_5_0= ruleContextFragment ) )* ( (lv_objects_6_0= ruleObject ) )* ( (lv_constraints_7_0= ruleConstraint ) )* ( (lv_scenarios_8_0= ruleScenario ) )* (otherlv_9= '}' )? ) )
            // InternalMyDsl.g:78:2: ( ( (lv_specification_0_0= 'specification' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '{' )? ( (lv_includes_3_0= ruleInclude ) )* ( (lv_contextmodels_4_0= ruleContextModel ) )* ( (lv_contextfragments_5_0= ruleContextFragment ) )* ( (lv_objects_6_0= ruleObject ) )* ( (lv_constraints_7_0= ruleConstraint ) )* ( (lv_scenarios_8_0= ruleScenario ) )* (otherlv_9= '}' )? )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_specification_0_0= 'specification' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '{' )? ( (lv_includes_3_0= ruleInclude ) )* ( (lv_contextmodels_4_0= ruleContextModel ) )* ( (lv_contextfragments_5_0= ruleContextFragment ) )* ( (lv_objects_6_0= ruleObject ) )* ( (lv_constraints_7_0= ruleConstraint ) )* ( (lv_scenarios_8_0= ruleScenario ) )* (otherlv_9= '}' )? )
            // InternalMyDsl.g:79:3: ( (lv_specification_0_0= 'specification' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '{' )? ( (lv_includes_3_0= ruleInclude ) )* ( (lv_contextmodels_4_0= ruleContextModel ) )* ( (lv_contextfragments_5_0= ruleContextFragment ) )* ( (lv_objects_6_0= ruleObject ) )* ( (lv_constraints_7_0= ruleConstraint ) )* ( (lv_scenarios_8_0= ruleScenario ) )* (otherlv_9= '}' )?
            {
            // InternalMyDsl.g:79:3: ( (lv_specification_0_0= 'specification' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:80:4: (lv_specification_0_0= 'specification' )
                    {
                    // InternalMyDsl.g:80:4: (lv_specification_0_0= 'specification' )
                    // InternalMyDsl.g:81:5: lv_specification_0_0= 'specification'
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

            // InternalMyDsl.g:93:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:94:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:94:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:95:5: lv_name_1_0= RULE_ID
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

            // InternalMyDsl.g:111:3: (otherlv_2= '{' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:112:4: otherlv_2= '{'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:117:3: ( (lv_includes_3_0= ruleInclude ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:118:4: (lv_includes_3_0= ruleInclude )
            	    {
            	    // InternalMyDsl.g:118:4: (lv_includes_3_0= ruleInclude )
            	    // InternalMyDsl.g:119:5: lv_includes_3_0= ruleInclude
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

            // InternalMyDsl.g:136:3: ( (lv_contextmodels_4_0= ruleContextModel ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:137:4: (lv_contextmodels_4_0= ruleContextModel )
            	    {
            	    // InternalMyDsl.g:137:4: (lv_contextmodels_4_0= ruleContextModel )
            	    // InternalMyDsl.g:138:5: lv_contextmodels_4_0= ruleContextModel
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

            // InternalMyDsl.g:155:3: ( (lv_contextfragments_5_0= ruleContextFragment ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:156:4: (lv_contextfragments_5_0= ruleContextFragment )
            	    {
            	    // InternalMyDsl.g:156:4: (lv_contextfragments_5_0= ruleContextFragment )
            	    // InternalMyDsl.g:157:5: lv_contextfragments_5_0= ruleContextFragment
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

            // InternalMyDsl.g:174:3: ( (lv_objects_6_0= ruleObject ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==57) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:175:4: (lv_objects_6_0= ruleObject )
            	    {
            	    // InternalMyDsl.g:175:4: (lv_objects_6_0= ruleObject )
            	    // InternalMyDsl.g:176:5: lv_objects_6_0= ruleObject
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

            // InternalMyDsl.g:193:3: ( (lv_constraints_7_0= ruleConstraint ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==50) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:194:4: (lv_constraints_7_0= ruleConstraint )
            	    {
            	    // InternalMyDsl.g:194:4: (lv_constraints_7_0= ruleConstraint )
            	    // InternalMyDsl.g:195:5: lv_constraints_7_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getConstraintsConstraintParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_constraints_7_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyDsl.g:212:3: ( (lv_scenarios_8_0= ruleScenario ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==42) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:213:4: (lv_scenarios_8_0= ruleScenario )
            	    {
            	    // InternalMyDsl.g:213:4: (lv_scenarios_8_0= ruleScenario )
            	    // InternalMyDsl.g:214:5: lv_scenarios_8_0= ruleScenario
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getScenariosScenarioParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_scenarios_8_0=ruleScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_8_0,
            	    						"org.xtext.example.mydsl.MyDsl.Scenario");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMyDsl.g:231:3: (otherlv_9= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:232:4: otherlv_9= '}'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_9());
                    			

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
    // InternalMyDsl.g:241:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalMyDsl.g:241:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalMyDsl.g:242:2: iv_ruleInclude= ruleInclude EOF
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
    // InternalMyDsl.g:248:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:254:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:255:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:255:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:256:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getImportKeyword_0());
            		
            // InternalMyDsl.g:260:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalMyDsl.g:261:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:261:4: (lv_importURI_1_0= RULE_STRING )
            // InternalMyDsl.g:262:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
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
    // InternalMyDsl.g:282:1: entryRuleContextModel returns [EObject current=null] : iv_ruleContextModel= ruleContextModel EOF ;
    public final EObject entryRuleContextModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextModel = null;


        try {
            // InternalMyDsl.g:282:53: (iv_ruleContextModel= ruleContextModel EOF )
            // InternalMyDsl.g:283:2: iv_ruleContextModel= ruleContextModel EOF
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
    // InternalMyDsl.g:289:1: ruleContextModel returns [EObject current=null] : (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:295:2: ( (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:296:2: (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:296:2: (otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' )
            // InternalMyDsl.g:297:3: otherlv_0= 'contextmodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getContextModelAccess().getContextmodelKeyword_0());
            		
            // InternalMyDsl.g:301:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:302:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:302:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:303:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getContextModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:323:3: ( (lv_entities_3_0= ruleEntity ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:324:4: (lv_entities_3_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:324:4: (lv_entities_3_0= ruleEntity )
            	    // InternalMyDsl.g:325:5: lv_entities_3_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getContextModelAccess().getEntitiesEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    break loop11;
                }
            } while (true);

            // InternalMyDsl.g:342:3: ( (lv_relations_4_0= ruleRelation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:343:4: (lv_relations_4_0= ruleRelation )
            	    {
            	    // InternalMyDsl.g:343:4: (lv_relations_4_0= ruleRelation )
            	    // InternalMyDsl.g:344:5: lv_relations_4_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getContextModelAccess().getRelationsRelationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop12;
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
    // InternalMyDsl.g:369:1: entryRuleContextFragment returns [EObject current=null] : iv_ruleContextFragment= ruleContextFragment EOF ;
    public final EObject entryRuleContextFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextFragment = null;


        try {
            // InternalMyDsl.g:369:56: (iv_ruleContextFragment= ruleContextFragment EOF )
            // InternalMyDsl.g:370:2: iv_ruleContextFragment= ruleContextFragment EOF
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
    // InternalMyDsl.g:376:1: ruleContextFragment returns [EObject current=null] : (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleFEntity ) )* ( (lv_relations_4_0= ruleFRelation ) )* otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:382:2: ( (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleFEntity ) )* ( (lv_relations_4_0= ruleFRelation ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:383:2: (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleFEntity ) )* ( (lv_relations_4_0= ruleFRelation ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:383:2: (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleFEntity ) )* ( (lv_relations_4_0= ruleFRelation ) )* otherlv_5= '}' )
            // InternalMyDsl.g:384:3: otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleFEntity ) )* ( (lv_relations_4_0= ruleFRelation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getContextFragmentAccess().getContextfragmentKeyword_0());
            		
            // InternalMyDsl.g:388:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:389:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:389:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:390:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getContextFragmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:410:3: ( (lv_entities_3_0= ruleFEntity ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==36) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:411:4: (lv_entities_3_0= ruleFEntity )
            	    {
            	    // InternalMyDsl.g:411:4: (lv_entities_3_0= ruleFEntity )
            	    // InternalMyDsl.g:412:5: lv_entities_3_0= ruleFEntity
            	    {

            	    					newCompositeNode(grammarAccess.getContextFragmentAccess().getEntitiesFEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    break loop13;
                }
            } while (true);

            // InternalMyDsl.g:429:3: ( (lv_relations_4_0= ruleFRelation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:430:4: (lv_relations_4_0= ruleFRelation )
            	    {
            	    // InternalMyDsl.g:430:4: (lv_relations_4_0= ruleFRelation )
            	    // InternalMyDsl.g:431:5: lv_relations_4_0= ruleFRelation
            	    {

            	    					newCompositeNode(grammarAccess.getContextFragmentAccess().getRelationsFRelationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop14;
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
    // InternalMyDsl.g:456:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:456:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:457:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalMyDsl.g:463:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) )? otherlv_8= ';' ) ;
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
        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:469:2: ( (otherlv_0= 'attribute' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) )? otherlv_8= ';' ) )
            // InternalMyDsl.g:470:2: (otherlv_0= 'attribute' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) )? otherlv_8= ';' )
            {
            // InternalMyDsl.g:470:2: (otherlv_0= 'attribute' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) )? otherlv_8= ';' )
            // InternalMyDsl.g:471:3: otherlv_0= 'attribute' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalMyDsl.g:475:3: ( (lv_int_1_0= 'int' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:476:4: (lv_int_1_0= 'int' )
                    {
                    // InternalMyDsl.g:476:4: (lv_int_1_0= 'int' )
                    // InternalMyDsl.g:477:5: lv_int_1_0= 'int'
                    {
                    lv_int_1_0=(Token)match(input,20,FOLLOW_19); 

                    					newLeafNode(lv_int_1_0, grammarAccess.getAttributeAccess().getIntIntKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "int", true, "int");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:489:3: ( (lv_float_2_0= 'float' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:490:4: (lv_float_2_0= 'float' )
                    {
                    // InternalMyDsl.g:490:4: (lv_float_2_0= 'float' )
                    // InternalMyDsl.g:491:5: lv_float_2_0= 'float'
                    {
                    lv_float_2_0=(Token)match(input,21,FOLLOW_20); 

                    					newLeafNode(lv_float_2_0, grammarAccess.getAttributeAccess().getFloatFloatKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "float", true, "float");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:503:3: ( (lv_string_3_0= 'string' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:504:4: (lv_string_3_0= 'string' )
                    {
                    // InternalMyDsl.g:504:4: (lv_string_3_0= 'string' )
                    // InternalMyDsl.g:505:5: lv_string_3_0= 'string'
                    {
                    lv_string_3_0=(Token)match(input,22,FOLLOW_21); 

                    					newLeafNode(lv_string_3_0, grammarAccess.getAttributeAccess().getStringStringKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "string", true, "string");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:517:3: ( (lv_boolean_4_0= 'boolean' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:518:4: (lv_boolean_4_0= 'boolean' )
                    {
                    // InternalMyDsl.g:518:4: (lv_boolean_4_0= 'boolean' )
                    // InternalMyDsl.g:519:5: lv_boolean_4_0= 'boolean'
                    {
                    lv_boolean_4_0=(Token)match(input,23,FOLLOW_12); 

                    					newLeafNode(lv_boolean_4_0, grammarAccess.getAttributeAccess().getBooleanBooleanKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "boolean", true, "boolean");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:531:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalMyDsl.g:532:4: (lv_name_5_0= RULE_ID )
            {
            // InternalMyDsl.g:532:4: (lv_name_5_0= RULE_ID )
            // InternalMyDsl.g:533:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalMyDsl.g:549:3: (otherlv_6= '=' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:550:4: otherlv_6= '='
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getEqualsSignKeyword_6());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:555:3: ( (lv_value_7_0= ruleAttributeValue ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||(LA20_0>=RULE_NUMBER && LA20_0<=RULE_REAL)||(LA20_0>=26 && LA20_0<=27)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:556:4: (lv_value_7_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:556:4: (lv_value_7_0= ruleAttributeValue )
                    // InternalMyDsl.g:557:5: lv_value_7_0= ruleAttributeValue
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_24);
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

            otherlv_8=(Token)match(input,25,FOLLOW_2); 

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
    // InternalMyDsl.g:582:1: entryRuleAttributeValue returns [String current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final String entryRuleAttributeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeValue = null;


        try {
            // InternalMyDsl.g:582:54: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalMyDsl.g:583:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue.getText(); 
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
    // InternalMyDsl.g:589:1: ruleAttributeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Number_0= RULE_NUMBER | this_Real_1= RULE_REAL | this_ID_2= RULE_ID | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleAttributeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Number_0=null;
        Token this_Real_1=null;
        Token this_ID_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:595:2: ( (this_Number_0= RULE_NUMBER | this_Real_1= RULE_REAL | this_ID_2= RULE_ID | kw= 'true' | kw= 'false' ) )
            // InternalMyDsl.g:596:2: (this_Number_0= RULE_NUMBER | this_Real_1= RULE_REAL | this_ID_2= RULE_ID | kw= 'true' | kw= 'false' )
            {
            // InternalMyDsl.g:596:2: (this_Number_0= RULE_NUMBER | this_Real_1= RULE_REAL | this_ID_2= RULE_ID | kw= 'true' | kw= 'false' )
            int alt21=5;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt21=1;
                }
                break;
            case RULE_REAL:
                {
                alt21=2;
                }
                break;
            case RULE_ID:
                {
                alt21=3;
                }
                break;
            case 26:
                {
                alt21=4;
                }
                break;
            case 27:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:597:3: this_Number_0= RULE_NUMBER
                    {
                    this_Number_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    			current.merge(this_Number_0);
                    		

                    			newLeafNode(this_Number_0, grammarAccess.getAttributeValueAccess().getNumberTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:605:3: this_Real_1= RULE_REAL
                    {
                    this_Real_1=(Token)match(input,RULE_REAL,FOLLOW_2); 

                    			current.merge(this_Real_1);
                    		

                    			newLeafNode(this_Real_1, grammarAccess.getAttributeValueAccess().getRealTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:613:3: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_2);
                    		

                    			newLeafNode(this_ID_2, grammarAccess.getAttributeValueAccess().getIDTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:621:3: kw= 'true'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeValueAccess().getTrueKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:627:3: kw= 'false'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeValueAccess().getFalseKeyword_4());
                    		

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
    // InternalMyDsl.g:636:1: entryRuleFragmentAttribute returns [EObject current=null] : iv_ruleFragmentAttribute= ruleFragmentAttribute EOF ;
    public final EObject entryRuleFragmentAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragmentAttribute = null;


        try {
            // InternalMyDsl.g:636:58: (iv_ruleFragmentAttribute= ruleFragmentAttribute EOF )
            // InternalMyDsl.g:637:2: iv_ruleFragmentAttribute= ruleFragmentAttribute EOF
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
    // InternalMyDsl.g:643:1: ruleFragmentAttribute returns [EObject current=null] : (otherlv_0= 'attributeconstraint' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_greater_6_0= '>' ) )? ( (lv_smaller_7_0= '<' ) )? ( (lv_greaterequals_8_0= '>=' ) )? ( (lv_smallerequals_9_0= '<=' ) )? ( (lv_equals_10_0= '==' ) )? ( (lv_notequals_11_0= '!=' ) )? ( (lv_value_12_0= ruleAttributeValue ) ) otherlv_13= ';' ) ;
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
        AntlrDatatypeRuleToken lv_value_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:649:2: ( (otherlv_0= 'attributeconstraint' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_greater_6_0= '>' ) )? ( (lv_smaller_7_0= '<' ) )? ( (lv_greaterequals_8_0= '>=' ) )? ( (lv_smallerequals_9_0= '<=' ) )? ( (lv_equals_10_0= '==' ) )? ( (lv_notequals_11_0= '!=' ) )? ( (lv_value_12_0= ruleAttributeValue ) ) otherlv_13= ';' ) )
            // InternalMyDsl.g:650:2: (otherlv_0= 'attributeconstraint' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_greater_6_0= '>' ) )? ( (lv_smaller_7_0= '<' ) )? ( (lv_greaterequals_8_0= '>=' ) )? ( (lv_smallerequals_9_0= '<=' ) )? ( (lv_equals_10_0= '==' ) )? ( (lv_notequals_11_0= '!=' ) )? ( (lv_value_12_0= ruleAttributeValue ) ) otherlv_13= ';' )
            {
            // InternalMyDsl.g:650:2: (otherlv_0= 'attributeconstraint' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_greater_6_0= '>' ) )? ( (lv_smaller_7_0= '<' ) )? ( (lv_greaterequals_8_0= '>=' ) )? ( (lv_smallerequals_9_0= '<=' ) )? ( (lv_equals_10_0= '==' ) )? ( (lv_notequals_11_0= '!=' ) )? ( (lv_value_12_0= ruleAttributeValue ) ) otherlv_13= ';' )
            // InternalMyDsl.g:651:3: otherlv_0= 'attributeconstraint' ( (lv_int_1_0= 'int' ) )? ( (lv_float_2_0= 'float' ) )? ( (lv_string_3_0= 'string' ) )? ( (lv_boolean_4_0= 'boolean' ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_greater_6_0= '>' ) )? ( (lv_smaller_7_0= '<' ) )? ( (lv_greaterequals_8_0= '>=' ) )? ( (lv_smallerequals_9_0= '<=' ) )? ( (lv_equals_10_0= '==' ) )? ( (lv_notequals_11_0= '!=' ) )? ( (lv_value_12_0= ruleAttributeValue ) ) otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getFragmentAttributeAccess().getAttributeconstraintKeyword_0());
            		
            // InternalMyDsl.g:655:3: ( (lv_int_1_0= 'int' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:656:4: (lv_int_1_0= 'int' )
                    {
                    // InternalMyDsl.g:656:4: (lv_int_1_0= 'int' )
                    // InternalMyDsl.g:657:5: lv_int_1_0= 'int'
                    {
                    lv_int_1_0=(Token)match(input,20,FOLLOW_19); 

                    					newLeafNode(lv_int_1_0, grammarAccess.getFragmentAttributeAccess().getIntIntKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "int", true, "int");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:669:3: ( (lv_float_2_0= 'float' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:670:4: (lv_float_2_0= 'float' )
                    {
                    // InternalMyDsl.g:670:4: (lv_float_2_0= 'float' )
                    // InternalMyDsl.g:671:5: lv_float_2_0= 'float'
                    {
                    lv_float_2_0=(Token)match(input,21,FOLLOW_20); 

                    					newLeafNode(lv_float_2_0, grammarAccess.getFragmentAttributeAccess().getFloatFloatKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "float", true, "float");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:683:3: ( (lv_string_3_0= 'string' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:684:4: (lv_string_3_0= 'string' )
                    {
                    // InternalMyDsl.g:684:4: (lv_string_3_0= 'string' )
                    // InternalMyDsl.g:685:5: lv_string_3_0= 'string'
                    {
                    lv_string_3_0=(Token)match(input,22,FOLLOW_21); 

                    					newLeafNode(lv_string_3_0, grammarAccess.getFragmentAttributeAccess().getStringStringKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "string", true, "string");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:697:3: ( (lv_boolean_4_0= 'boolean' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:698:4: (lv_boolean_4_0= 'boolean' )
                    {
                    // InternalMyDsl.g:698:4: (lv_boolean_4_0= 'boolean' )
                    // InternalMyDsl.g:699:5: lv_boolean_4_0= 'boolean'
                    {
                    lv_boolean_4_0=(Token)match(input,23,FOLLOW_12); 

                    					newLeafNode(lv_boolean_4_0, grammarAccess.getFragmentAttributeAccess().getBooleanBooleanKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "boolean", true, "boolean");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:711:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalMyDsl.g:712:4: (lv_name_5_0= RULE_ID )
            {
            // InternalMyDsl.g:712:4: (lv_name_5_0= RULE_ID )
            // InternalMyDsl.g:713:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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

            // InternalMyDsl.g:729:3: ( (lv_greater_6_0= '>' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:730:4: (lv_greater_6_0= '>' )
                    {
                    // InternalMyDsl.g:730:4: (lv_greater_6_0= '>' )
                    // InternalMyDsl.g:731:5: lv_greater_6_0= '>'
                    {
                    lv_greater_6_0=(Token)match(input,29,FOLLOW_26); 

                    					newLeafNode(lv_greater_6_0, grammarAccess.getFragmentAttributeAccess().getGreaterGreaterThanSignKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "greater", true, ">");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:743:3: ( (lv_smaller_7_0= '<' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:744:4: (lv_smaller_7_0= '<' )
                    {
                    // InternalMyDsl.g:744:4: (lv_smaller_7_0= '<' )
                    // InternalMyDsl.g:745:5: lv_smaller_7_0= '<'
                    {
                    lv_smaller_7_0=(Token)match(input,30,FOLLOW_27); 

                    					newLeafNode(lv_smaller_7_0, grammarAccess.getFragmentAttributeAccess().getSmallerLessThanSignKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "smaller", true, "<");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:757:3: ( (lv_greaterequals_8_0= '>=' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:758:4: (lv_greaterequals_8_0= '>=' )
                    {
                    // InternalMyDsl.g:758:4: (lv_greaterequals_8_0= '>=' )
                    // InternalMyDsl.g:759:5: lv_greaterequals_8_0= '>='
                    {
                    lv_greaterequals_8_0=(Token)match(input,31,FOLLOW_28); 

                    					newLeafNode(lv_greaterequals_8_0, grammarAccess.getFragmentAttributeAccess().getGreaterequalsGreaterThanSignEqualsSignKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "greaterequals", true, ">=");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:771:3: ( (lv_smallerequals_9_0= '<=' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:772:4: (lv_smallerequals_9_0= '<=' )
                    {
                    // InternalMyDsl.g:772:4: (lv_smallerequals_9_0= '<=' )
                    // InternalMyDsl.g:773:5: lv_smallerequals_9_0= '<='
                    {
                    lv_smallerequals_9_0=(Token)match(input,32,FOLLOW_29); 

                    					newLeafNode(lv_smallerequals_9_0, grammarAccess.getFragmentAttributeAccess().getSmallerequalsLessThanSignEqualsSignKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "smallerequals", true, "<=");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:785:3: ( (lv_equals_10_0= '==' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:786:4: (lv_equals_10_0= '==' )
                    {
                    // InternalMyDsl.g:786:4: (lv_equals_10_0= '==' )
                    // InternalMyDsl.g:787:5: lv_equals_10_0= '=='
                    {
                    lv_equals_10_0=(Token)match(input,33,FOLLOW_30); 

                    					newLeafNode(lv_equals_10_0, grammarAccess.getFragmentAttributeAccess().getEqualsEqualsSignEqualsSignKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "equals", true, "==");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:799:3: ( (lv_notequals_11_0= '!=' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:800:4: (lv_notequals_11_0= '!=' )
                    {
                    // InternalMyDsl.g:800:4: (lv_notequals_11_0= '!=' )
                    // InternalMyDsl.g:801:5: lv_notequals_11_0= '!='
                    {
                    lv_notequals_11_0=(Token)match(input,34,FOLLOW_31); 

                    					newLeafNode(lv_notequals_11_0, grammarAccess.getFragmentAttributeAccess().getNotequalsExclamationMarkEqualsSignKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentAttributeRule());
                    					}
                    					setWithLastConsumed(current, "notequals", true, "!=");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:813:3: ( (lv_value_12_0= ruleAttributeValue ) )
            // InternalMyDsl.g:814:4: (lv_value_12_0= ruleAttributeValue )
            {
            // InternalMyDsl.g:814:4: (lv_value_12_0= ruleAttributeValue )
            // InternalMyDsl.g:815:5: lv_value_12_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getFragmentAttributeAccess().getValueAttributeValueParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_13=(Token)match(input,25,FOLLOW_2); 

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
    // InternalMyDsl.g:840:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:840:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:841:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalMyDsl.g:847:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:853:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:854:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:854:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalMyDsl.g:855:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:859:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:860:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:860:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:861:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:881:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==19) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:882:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:882:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalMyDsl.g:883:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_32);
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
            	    break loop32;
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
    // InternalMyDsl.g:908:1: entryRuleFEntity returns [EObject current=null] : iv_ruleFEntity= ruleFEntity EOF ;
    public final EObject entryRuleFEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFEntity = null;


        try {
            // InternalMyDsl.g:908:48: (iv_ruleFEntity= ruleFEntity EOF )
            // InternalMyDsl.g:909:2: iv_ruleFEntity= ruleFEntity EOF
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
    // InternalMyDsl.g:915:1: ruleFEntity returns [EObject current=null] : (otherlv_0= 'entityconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleFragmentAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleFEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:921:2: ( (otherlv_0= 'entityconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleFragmentAttribute ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:922:2: (otherlv_0= 'entityconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleFragmentAttribute ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:922:2: (otherlv_0= 'entityconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleFragmentAttribute ) )* otherlv_4= '}' )
            // InternalMyDsl.g:923:3: otherlv_0= 'entityconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleFragmentAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFEntityAccess().getEntityconstraintKeyword_0());
            		
            // InternalMyDsl.g:927:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:928:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:928:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:929:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getFEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:949:3: ( (lv_attributes_3_0= ruleFragmentAttribute ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==28) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:950:4: (lv_attributes_3_0= ruleFragmentAttribute )
            	    {
            	    // InternalMyDsl.g:950:4: (lv_attributes_3_0= ruleFragmentAttribute )
            	    // InternalMyDsl.g:951:5: lv_attributes_3_0= ruleFragmentAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getFEntityAccess().getAttributesFragmentAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop33;
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
    // InternalMyDsl.g:976:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:976:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:977:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalMyDsl.g:983:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:989:2: ( (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:990:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:990:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            // InternalMyDsl.g:991:3: otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalMyDsl.g:995:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:996:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:996:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:997:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1017:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1018:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1018:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1019:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getSenderEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:1034:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1035:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1035:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1036:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getReceiverEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:1055:3: ( (lv_attributes_8_0= ruleAttribute ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==19) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:1056:4: (lv_attributes_8_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:1056:4: (lv_attributes_8_0= ruleAttribute )
            	    // InternalMyDsl.g:1057:5: lv_attributes_8_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_32);
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
            	    break loop34;
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
    // InternalMyDsl.g:1082:1: entryRuleFRelation returns [EObject current=null] : iv_ruleFRelation= ruleFRelation EOF ;
    public final EObject entryRuleFRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFRelation = null;


        try {
            // InternalMyDsl.g:1082:50: (iv_ruleFRelation= ruleFRelation EOF )
            // InternalMyDsl.g:1083:2: iv_ruleFRelation= ruleFRelation EOF
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
    // InternalMyDsl.g:1089:1: ruleFRelation returns [EObject current=null] : (otherlv_0= 'relationconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleFragmentAttribute ) )* otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:1095:2: ( (otherlv_0= 'relationconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleFragmentAttribute ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:1096:2: (otherlv_0= 'relationconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleFragmentAttribute ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:1096:2: (otherlv_0= 'relationconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleFragmentAttribute ) )* otherlv_9= '}' )
            // InternalMyDsl.g:1097:3: otherlv_0= 'relationconstraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleFragmentAttribute ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFRelationAccess().getRelationconstraintKeyword_0());
            		
            // InternalMyDsl.g:1101:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1102:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1102:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1103:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getFRelationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1123:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1124:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1124:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1125:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFRelationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_3, grammarAccess.getFRelationAccess().getSenderFEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getFRelationAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:1140:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1141:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1141:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1142:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFRelationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_5, grammarAccess.getFRelationAccess().getReceiverFEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getFRelationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_7, grammarAccess.getFRelationAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:1161:3: ( (lv_attributes_8_0= ruleFragmentAttribute ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==28) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:1162:4: (lv_attributes_8_0= ruleFragmentAttribute )
            	    {
            	    // InternalMyDsl.g:1162:4: (lv_attributes_8_0= ruleFragmentAttribute )
            	    // InternalMyDsl.g:1163:5: lv_attributes_8_0= ruleFragmentAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getFRelationAccess().getAttributesFragmentAttributeParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop35;
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
    // InternalMyDsl.g:1188:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalMyDsl.g:1188:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalMyDsl.g:1189:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalMyDsl.g:1195:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_scenariocontents_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1201:2: ( (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:1202:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:1202:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' )
            // InternalMyDsl.g:1203:3: otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalMyDsl.g:1207:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1208:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1208:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1209:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1229:3: ( (lv_scenariocontents_3_0= ruleScenarioContent ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==43||(LA36_0>=51 && LA36_0<=52)||(LA36_0>=54 && LA36_0<=56)||(LA36_0>=58 && LA36_0<=59)||LA36_0==61) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:1230:4: (lv_scenariocontents_3_0= ruleScenarioContent )
            	    {
            	    // InternalMyDsl.g:1230:4: (lv_scenariocontents_3_0= ruleScenarioContent )
            	    // InternalMyDsl.g:1231:5: lv_scenariocontents_3_0= ruleScenarioContent
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getScenariocontentsScenarioContentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_37);
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
            	    break loop36;
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
    // InternalMyDsl.g:1256:1: entryRuleScenarioContent returns [EObject current=null] : iv_ruleScenarioContent= ruleScenarioContent EOF ;
    public final EObject entryRuleScenarioContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioContent = null;


        try {
            // InternalMyDsl.g:1256:56: (iv_ruleScenarioContent= ruleScenarioContent EOF )
            // InternalMyDsl.g:1257:2: iv_ruleScenarioContent= ruleScenarioContent EOF
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
    // InternalMyDsl.g:1263:1: ruleScenarioContent returns [EObject current=null] : ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) ) ;
    public final EObject ruleScenarioContent() throws RecognitionException {
        EObject current = null;

        EObject lv_alt_0_0 = null;

        EObject lv_message_1_0 = null;

        EObject lv_par_2_0 = null;

        EObject lv_loop_3_0 = null;

        EObject lv_contextmessage_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1269:2: ( ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) ) )
            // InternalMyDsl.g:1270:2: ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) )
            {
            // InternalMyDsl.g:1270:2: ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt37=1;
                }
                break;
            case 43:
                {
                alt37=2;
                }
                break;
            case 59:
                {
                alt37=3;
                }
                break;
            case 61:
                {
                alt37=4;
                }
                break;
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1271:3: ( (lv_alt_0_0= ruleAlt ) )
                    {
                    // InternalMyDsl.g:1271:3: ( (lv_alt_0_0= ruleAlt ) )
                    // InternalMyDsl.g:1272:4: (lv_alt_0_0= ruleAlt )
                    {
                    // InternalMyDsl.g:1272:4: (lv_alt_0_0= ruleAlt )
                    // InternalMyDsl.g:1273:5: lv_alt_0_0= ruleAlt
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
                    // InternalMyDsl.g:1291:3: ( (lv_message_1_0= ruleMessage ) )
                    {
                    // InternalMyDsl.g:1291:3: ( (lv_message_1_0= ruleMessage ) )
                    // InternalMyDsl.g:1292:4: (lv_message_1_0= ruleMessage )
                    {
                    // InternalMyDsl.g:1292:4: (lv_message_1_0= ruleMessage )
                    // InternalMyDsl.g:1293:5: lv_message_1_0= ruleMessage
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
                    // InternalMyDsl.g:1311:3: ( (lv_par_2_0= rulePar ) )
                    {
                    // InternalMyDsl.g:1311:3: ( (lv_par_2_0= rulePar ) )
                    // InternalMyDsl.g:1312:4: (lv_par_2_0= rulePar )
                    {
                    // InternalMyDsl.g:1312:4: (lv_par_2_0= rulePar )
                    // InternalMyDsl.g:1313:5: lv_par_2_0= rulePar
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
                    // InternalMyDsl.g:1331:3: ( (lv_loop_3_0= ruleLoop ) )
                    {
                    // InternalMyDsl.g:1331:3: ( (lv_loop_3_0= ruleLoop ) )
                    // InternalMyDsl.g:1332:4: (lv_loop_3_0= ruleLoop )
                    {
                    // InternalMyDsl.g:1332:4: (lv_loop_3_0= ruleLoop )
                    // InternalMyDsl.g:1333:5: lv_loop_3_0= ruleLoop
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
                    // InternalMyDsl.g:1351:3: ( (lv_contextmessage_4_0= ruleContextMessage ) )
                    {
                    // InternalMyDsl.g:1351:3: ( (lv_contextmessage_4_0= ruleContextMessage ) )
                    // InternalMyDsl.g:1352:4: (lv_contextmessage_4_0= ruleContextMessage )
                    {
                    // InternalMyDsl.g:1352:4: (lv_contextmessage_4_0= ruleContextMessage )
                    // InternalMyDsl.g:1353:5: lv_contextmessage_4_0= ruleContextMessage
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
    // InternalMyDsl.g:1374:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalMyDsl.g:1374:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMyDsl.g:1375:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalMyDsl.g:1381:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' ) ;
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
            // InternalMyDsl.g:1387:2: ( (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' ) )
            // InternalMyDsl.g:1388:2: (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' )
            {
            // InternalMyDsl.g:1388:2: (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' )
            // InternalMyDsl.g:1389:3: otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
            		
            // InternalMyDsl.g:1393:3: ( (lv_name_1_0= ruleName ) )
            // InternalMyDsl.g:1394:4: (lv_name_1_0= ruleName )
            {
            // InternalMyDsl.g:1394:4: (lv_name_1_0= ruleName )
            // InternalMyDsl.g:1395:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getMessageAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
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

            // InternalMyDsl.g:1412:3: ( (lv_required_2_0= 'required' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1413:4: (lv_required_2_0= 'required' )
                    {
                    // InternalMyDsl.g:1413:4: (lv_required_2_0= 'required' )
                    // InternalMyDsl.g:1414:5: lv_required_2_0= 'required'
                    {
                    lv_required_2_0=(Token)match(input,44,FOLLOW_39); 

                    					newLeafNode(lv_required_2_0, grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1426:3: ( (lv_fail_3_0= 'fail' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==45) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1427:4: (lv_fail_3_0= 'fail' )
                    {
                    // InternalMyDsl.g:1427:4: (lv_fail_3_0= 'fail' )
                    // InternalMyDsl.g:1428:5: lv_fail_3_0= 'fail'
                    {
                    lv_fail_3_0=(Token)match(input,45,FOLLOW_40); 

                    					newLeafNode(lv_fail_3_0, grammarAccess.getMessageAccess().getFailFailKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "fail", true, "fail");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1440:3: ( (lv_strict_4_0= 'strict' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:1441:4: (lv_strict_4_0= 'strict' )
                    {
                    // InternalMyDsl.g:1441:4: (lv_strict_4_0= 'strict' )
                    // InternalMyDsl.g:1442:5: lv_strict_4_0= 'strict'
                    {
                    lv_strict_4_0=(Token)match(input,46,FOLLOW_12); 

                    					newLeafNode(lv_strict_4_0, grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "strict", true, "strict");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1454:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1455:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1455:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1456:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getSenderObjectCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,47,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            // InternalMyDsl.g:1471:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:1472:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:1472:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:1473:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getReceiverObjectCrossReference_7_0());
            				

            }


            }

            // InternalMyDsl.g:1484:3: ( (lv_past_8_0= 'past' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1485:4: (lv_past_8_0= 'past' )
                    {
                    // InternalMyDsl.g:1485:4: (lv_past_8_0= 'past' )
                    // InternalMyDsl.g:1486:5: lv_past_8_0= 'past'
                    {
                    lv_past_8_0=(Token)match(input,48,FOLLOW_43); 

                    					newLeafNode(lv_past_8_0, grammarAccess.getMessageAccess().getPastPastKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "past", true, "past");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1498:3: ( (lv_future_9_0= 'future' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==49) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:1499:4: (lv_future_9_0= 'future' )
                    {
                    // InternalMyDsl.g:1499:4: (lv_future_9_0= 'future' )
                    // InternalMyDsl.g:1500:5: lv_future_9_0= 'future'
                    {
                    lv_future_9_0=(Token)match(input,49,FOLLOW_44); 

                    					newLeafNode(lv_future_9_0, grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "future", true, "future");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1512:3: ( (lv_constraint_10_0= 'constraint' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==50) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:1513:4: (lv_constraint_10_0= 'constraint' )
                    {
                    // InternalMyDsl.g:1513:4: (lv_constraint_10_0= 'constraint' )
                    // InternalMyDsl.g:1514:5: lv_constraint_10_0= 'constraint'
                    {
                    lv_constraint_10_0=(Token)match(input,50,FOLLOW_45); 

                    					newLeafNode(lv_constraint_10_0, grammarAccess.getMessageAccess().getConstraintConstraintKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "constraint", true, "constraint");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1526:3: (otherlv_11= '{' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==14) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:1527:4: otherlv_11= '{'
                    {
                    otherlv_11=(Token)match(input,14,FOLLOW_46); 

                    				newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_11());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1532:3: ( (otherlv_12= RULE_ID ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:1533:4: (otherlv_12= RULE_ID )
                    {
                    // InternalMyDsl.g:1533:4: (otherlv_12= RULE_ID )
                    // InternalMyDsl.g:1534:5: otherlv_12= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    				
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_47); 

                    					newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getCConstraintCrossReference_12_0());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1545:3: (otherlv_13= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==15) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:1546:4: otherlv_13= '}'
                    {
                    otherlv_13=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_13, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_13());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,25,FOLLOW_2); 

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
    // InternalMyDsl.g:1559:1: entryRuleContextMessage returns [EObject current=null] : iv_ruleContextMessage= ruleContextMessage EOF ;
    public final EObject entryRuleContextMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextMessage = null;


        try {
            // InternalMyDsl.g:1559:55: (iv_ruleContextMessage= ruleContextMessage EOF )
            // InternalMyDsl.g:1560:2: iv_ruleContextMessage= ruleContextMessage EOF
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
    // InternalMyDsl.g:1566:1: ruleContextMessage returns [EObject current=null] : ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' ) ;
    public final EObject ruleContextMessage() throws RecognitionException {
        EObject current = null;

        Token lv_required_1_0=null;
        Token lv_fail_2_0=null;
        Token lv_strict_3_0=null;
        Token otherlv_4=null;
        EObject lv_content_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1572:2: ( ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' ) )
            // InternalMyDsl.g:1573:2: ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' )
            {
            // InternalMyDsl.g:1573:2: ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' )
            // InternalMyDsl.g:1574:3: ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';'
            {
            // InternalMyDsl.g:1574:3: ( (lv_content_0_0= ruleContextMessageContent ) )
            // InternalMyDsl.g:1575:4: (lv_content_0_0= ruleContextMessageContent )
            {
            // InternalMyDsl.g:1575:4: (lv_content_0_0= ruleContextMessageContent )
            // InternalMyDsl.g:1576:5: lv_content_0_0= ruleContextMessageContent
            {

            					newCompositeNode(grammarAccess.getContextMessageAccess().getContentContextMessageContentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_48);
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

            // InternalMyDsl.g:1593:3: ( (lv_required_1_0= 'required' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==44) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:1594:4: (lv_required_1_0= 'required' )
                    {
                    // InternalMyDsl.g:1594:4: (lv_required_1_0= 'required' )
                    // InternalMyDsl.g:1595:5: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,44,FOLLOW_49); 

                    					newLeafNode(lv_required_1_0, grammarAccess.getContextMessageAccess().getRequiredRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextMessageRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1607:3: ( (lv_fail_2_0= 'fail' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:1608:4: (lv_fail_2_0= 'fail' )
                    {
                    // InternalMyDsl.g:1608:4: (lv_fail_2_0= 'fail' )
                    // InternalMyDsl.g:1609:5: lv_fail_2_0= 'fail'
                    {
                    lv_fail_2_0=(Token)match(input,45,FOLLOW_50); 

                    					newLeafNode(lv_fail_2_0, grammarAccess.getContextMessageAccess().getFailFailKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextMessageRule());
                    					}
                    					setWithLastConsumed(current, "fail", true, "fail");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1621:3: ( (lv_strict_3_0= 'strict' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==46) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:1622:4: (lv_strict_3_0= 'strict' )
                    {
                    // InternalMyDsl.g:1622:4: (lv_strict_3_0= 'strict' )
                    // InternalMyDsl.g:1623:5: lv_strict_3_0= 'strict'
                    {
                    lv_strict_3_0=(Token)match(input,46,FOLLOW_24); 

                    					newLeafNode(lv_strict_3_0, grammarAccess.getContextMessageAccess().getStrictStrictKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextMessageRule());
                    					}
                    					setWithLastConsumed(current, "strict", true, "strict");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

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
    // InternalMyDsl.g:1643:1: entryRuleContextMessageContent returns [EObject current=null] : iv_ruleContextMessageContent= ruleContextMessageContent EOF ;
    public final EObject entryRuleContextMessageContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextMessageContent = null;


        try {
            // InternalMyDsl.g:1643:62: (iv_ruleContextMessageContent= ruleContextMessageContent EOF )
            // InternalMyDsl.g:1644:2: iv_ruleContextMessageContent= ruleContextMessageContent EOF
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
    // InternalMyDsl.g:1650:1: ruleContextMessageContent returns [EObject current=null] : ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) ) ;
    public final EObject ruleContextMessageContent() throws RecognitionException {
        EObject current = null;

        EObject lv_match_0_0 = null;

        EObject lv_change_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1656:2: ( ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) ) )
            // InternalMyDsl.g:1657:2: ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) )
            {
            // InternalMyDsl.g:1657:2: ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==51) ) {
                alt50=1;
            }
            else if ( (LA50_0==52||(LA50_0>=54 && LA50_0<=56)) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:1658:3: ( (lv_match_0_0= ruleMatchMessage ) )
                    {
                    // InternalMyDsl.g:1658:3: ( (lv_match_0_0= ruleMatchMessage ) )
                    // InternalMyDsl.g:1659:4: (lv_match_0_0= ruleMatchMessage )
                    {
                    // InternalMyDsl.g:1659:4: (lv_match_0_0= ruleMatchMessage )
                    // InternalMyDsl.g:1660:5: lv_match_0_0= ruleMatchMessage
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
                    // InternalMyDsl.g:1678:3: ( (lv_change_1_0= ruleChangeMessage ) )
                    {
                    // InternalMyDsl.g:1678:3: ( (lv_change_1_0= ruleChangeMessage ) )
                    // InternalMyDsl.g:1679:4: (lv_change_1_0= ruleChangeMessage )
                    {
                    // InternalMyDsl.g:1679:4: (lv_change_1_0= ruleChangeMessage )
                    // InternalMyDsl.g:1680:5: lv_change_1_0= ruleChangeMessage
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
    // InternalMyDsl.g:1701:1: entryRuleMatchMessage returns [EObject current=null] : iv_ruleMatchMessage= ruleMatchMessage EOF ;
    public final EObject entryRuleMatchMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchMessage = null;


        try {
            // InternalMyDsl.g:1701:53: (iv_ruleMatchMessage= ruleMatchMessage EOF )
            // InternalMyDsl.g:1702:2: iv_ruleMatchMessage= ruleMatchMessage EOF
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
    // InternalMyDsl.g:1708:1: ruleMatchMessage returns [EObject current=null] : (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' ) ;
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
            // InternalMyDsl.g:1714:2: ( (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:1715:2: (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:1715:2: (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' )
            // InternalMyDsl.g:1716:3: otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchMessageAccess().getMatchKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getMatchMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1724:3: ( (otherlv_2= RULE_ID ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:1725:4: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:1725:4: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:1726:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMatchMessageRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_51); 

                    					newLeafNode(otherlv_2, grammarAccess.getMatchMessageAccess().getContextContextModelCrossReference_2_0());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1737:3: (otherlv_3= ',' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==39) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:1738:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_52); 

                    				newLeafNode(otherlv_3, grammarAccess.getMatchMessageAccess().getCommaKeyword_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1743:3: ( (otherlv_4= RULE_ID ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:1744:4: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:1744:4: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:1745:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMatchMessageRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_36); 

                    					newLeafNode(otherlv_4, grammarAccess.getMatchMessageAccess().getContentContextFragmentCrossReference_4_0());
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,40,FOLLOW_2); 

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
    // InternalMyDsl.g:1764:1: entryRuleChangeMessage returns [EObject current=null] : iv_ruleChangeMessage= ruleChangeMessage EOF ;
    public final EObject entryRuleChangeMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeMessage = null;


        try {
            // InternalMyDsl.g:1764:54: (iv_ruleChangeMessage= ruleChangeMessage EOF )
            // InternalMyDsl.g:1765:2: iv_ruleChangeMessage= ruleChangeMessage EOF
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
    // InternalMyDsl.g:1771:1: ruleChangeMessage returns [EObject current=null] : ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) | ( (lv_changetor_3_0= ruleChangeToRelation ) ) ) ;
    public final EObject ruleChangeMessage() throws RecognitionException {
        EObject current = null;

        EObject lv_disappear_0_0 = null;

        EObject lv_appear_1_0 = null;

        EObject lv_changeto_2_0 = null;

        EObject lv_changetor_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1777:2: ( ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) | ( (lv_changetor_3_0= ruleChangeToRelation ) ) ) )
            // InternalMyDsl.g:1778:2: ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) | ( (lv_changetor_3_0= ruleChangeToRelation ) ) )
            {
            // InternalMyDsl.g:1778:2: ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) | ( (lv_changetor_3_0= ruleChangeToRelation ) ) )
            int alt54=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt54=1;
                }
                break;
            case 52:
                {
                alt54=2;
                }
                break;
            case 55:
                {
                alt54=3;
                }
                break;
            case 56:
                {
                alt54=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:1779:3: ( (lv_disappear_0_0= ruleDisappearMessage ) )
                    {
                    // InternalMyDsl.g:1779:3: ( (lv_disappear_0_0= ruleDisappearMessage ) )
                    // InternalMyDsl.g:1780:4: (lv_disappear_0_0= ruleDisappearMessage )
                    {
                    // InternalMyDsl.g:1780:4: (lv_disappear_0_0= ruleDisappearMessage )
                    // InternalMyDsl.g:1781:5: lv_disappear_0_0= ruleDisappearMessage
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
                    // InternalMyDsl.g:1799:3: ( (lv_appear_1_0= ruleAppearMessage ) )
                    {
                    // InternalMyDsl.g:1799:3: ( (lv_appear_1_0= ruleAppearMessage ) )
                    // InternalMyDsl.g:1800:4: (lv_appear_1_0= ruleAppearMessage )
                    {
                    // InternalMyDsl.g:1800:4: (lv_appear_1_0= ruleAppearMessage )
                    // InternalMyDsl.g:1801:5: lv_appear_1_0= ruleAppearMessage
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
                    // InternalMyDsl.g:1819:3: ( (lv_changeto_2_0= ruleChangeToMessage ) )
                    {
                    // InternalMyDsl.g:1819:3: ( (lv_changeto_2_0= ruleChangeToMessage ) )
                    // InternalMyDsl.g:1820:4: (lv_changeto_2_0= ruleChangeToMessage )
                    {
                    // InternalMyDsl.g:1820:4: (lv_changeto_2_0= ruleChangeToMessage )
                    // InternalMyDsl.g:1821:5: lv_changeto_2_0= ruleChangeToMessage
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
                    // InternalMyDsl.g:1839:3: ( (lv_changetor_3_0= ruleChangeToRelation ) )
                    {
                    // InternalMyDsl.g:1839:3: ( (lv_changetor_3_0= ruleChangeToRelation ) )
                    // InternalMyDsl.g:1840:4: (lv_changetor_3_0= ruleChangeToRelation )
                    {
                    // InternalMyDsl.g:1840:4: (lv_changetor_3_0= ruleChangeToRelation )
                    // InternalMyDsl.g:1841:5: lv_changetor_3_0= ruleChangeToRelation
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
    // InternalMyDsl.g:1862:1: entryRuleAppearMessage returns [EObject current=null] : iv_ruleAppearMessage= ruleAppearMessage EOF ;
    public final EObject entryRuleAppearMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppearMessage = null;


        try {
            // InternalMyDsl.g:1862:54: (iv_ruleAppearMessage= ruleAppearMessage EOF )
            // InternalMyDsl.g:1863:2: iv_ruleAppearMessage= ruleAppearMessage EOF
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
    // InternalMyDsl.g:1869:1: ruleAppearMessage returns [EObject current=null] : (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) ;
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
            // InternalMyDsl.g:1875:2: ( (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:1876:2: (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:1876:2: (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            // InternalMyDsl.g:1877:3: otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getAppearMessageAccess().getAppearKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getAppearMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1885:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:1886:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1886:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:1887:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:1887:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:1888:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAppearMessageRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_53); 

                    						newLeafNode(otherlv_2, grammarAccess.getAppearMessageAccess().getContextContextModelCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,53,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getAppearMessageAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMyDsl.g:1903:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:1904:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:1904:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:1905:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAppearMessageRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						newLeafNode(otherlv_4, grammarAccess.getAppearMessageAccess().getEntityEntityCrossReference_2_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,40,FOLLOW_2); 

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
    // InternalMyDsl.g:1925:1: entryRuleDisappearMessage returns [EObject current=null] : iv_ruleDisappearMessage= ruleDisappearMessage EOF ;
    public final EObject entryRuleDisappearMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisappearMessage = null;


        try {
            // InternalMyDsl.g:1925:57: (iv_ruleDisappearMessage= ruleDisappearMessage EOF )
            // InternalMyDsl.g:1926:2: iv_ruleDisappearMessage= ruleDisappearMessage EOF
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
    // InternalMyDsl.g:1932:1: ruleDisappearMessage returns [EObject current=null] : (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) ;
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
            // InternalMyDsl.g:1938:2: ( (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:1939:2: (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:1939:2: (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            // InternalMyDsl.g:1940:3: otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getDisappearMessageAccess().getDisappearKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getDisappearMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1948:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:1949:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1949:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:1950:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:1950:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:1951:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDisappearMessageRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_53); 

                    						newLeafNode(otherlv_2, grammarAccess.getDisappearMessageAccess().getContextContextModelCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,53,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getDisappearMessageAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMyDsl.g:1966:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:1967:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:1967:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:1968:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDisappearMessageRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						newLeafNode(otherlv_4, grammarAccess.getDisappearMessageAccess().getEntityEntityCrossReference_2_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,40,FOLLOW_2); 

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
    // InternalMyDsl.g:1988:1: entryRuleChangeToMessage returns [EObject current=null] : iv_ruleChangeToMessage= ruleChangeToMessage EOF ;
    public final EObject entryRuleChangeToMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeToMessage = null;


        try {
            // InternalMyDsl.g:1988:56: (iv_ruleChangeToMessage= ruleChangeToMessage EOF )
            // InternalMyDsl.g:1989:2: iv_ruleChangeToMessage= ruleChangeToMessage EOF
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
    // InternalMyDsl.g:1995:1: ruleChangeToMessage returns [EObject current=null] : (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' ) ;
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
        AntlrDatatypeRuleToken lv_changevalue_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2001:2: ( (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' ) )
            // InternalMyDsl.g:2002:2: (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' )
            {
            // InternalMyDsl.g:2002:2: (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' )
            // InternalMyDsl.g:2003:3: otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeToMessageAccess().getChangeToKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeToMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2011:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==53) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:2012:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalMyDsl.g:2012:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:2013:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:2013:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:2014:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToMessageRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_53); 

                    						newLeafNode(otherlv_2, grammarAccess.getChangeToMessageAccess().getContextContextModelCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,53,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getChangeToMessageAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMyDsl.g:2029:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:2030:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:2030:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:2031:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToMessageRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_53); 

                    						newLeafNode(otherlv_4, grammarAccess.getChangeToMessageAccess().getEntityEntityCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,53,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getChangeToMessageAccess().getFullStopKeyword_2_3());
                    			
                    // InternalMyDsl.g:2046:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMyDsl.g:2047:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMyDsl.g:2047:5: (otherlv_6= RULE_ID )
                    // InternalMyDsl.g:2048:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToMessageRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_54); 

                    						newLeafNode(otherlv_6, grammarAccess.getChangeToMessageAccess().getAttributeAttributeCrossReference_2_4_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2060:3: (otherlv_7= ',' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==39) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:2061:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_55); 

                    				newLeafNode(otherlv_7, grammarAccess.getChangeToMessageAccess().getCommaKeyword_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2066:3: ( (lv_changevalue_8_0= ruleAttributeValue ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID||(LA59_0>=RULE_NUMBER && LA59_0<=RULE_REAL)||(LA59_0>=26 && LA59_0<=27)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:2067:4: (lv_changevalue_8_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:2067:4: (lv_changevalue_8_0= ruleAttributeValue )
                    // InternalMyDsl.g:2068:5: lv_changevalue_8_0= ruleAttributeValue
                    {

                    					newCompositeNode(grammarAccess.getChangeToMessageAccess().getChangevalueAttributeValueParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_36);
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

            otherlv_9=(Token)match(input,40,FOLLOW_2); 

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
    // InternalMyDsl.g:2093:1: entryRuleChangeToRelation returns [EObject current=null] : iv_ruleChangeToRelation= ruleChangeToRelation EOF ;
    public final EObject entryRuleChangeToRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeToRelation = null;


        try {
            // InternalMyDsl.g:2093:57: (iv_ruleChangeToRelation= ruleChangeToRelation EOF )
            // InternalMyDsl.g:2094:2: iv_ruleChangeToRelation= ruleChangeToRelation EOF
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
    // InternalMyDsl.g:2100:1: ruleChangeToRelation returns [EObject current=null] : (otherlv_0= 'relationChangeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' ) ;
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
        AntlrDatatypeRuleToken lv_changevalue_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2106:2: ( (otherlv_0= 'relationChangeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' ) )
            // InternalMyDsl.g:2107:2: (otherlv_0= 'relationChangeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' )
            {
            // InternalMyDsl.g:2107:2: (otherlv_0= 'relationChangeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' )
            // InternalMyDsl.g:2108:3: otherlv_0= 'relationChangeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeToRelationAccess().getRelationChangeToKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeToRelationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2116:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==53) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:2117:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalMyDsl.g:2117:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:2118:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:2118:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:2119:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToRelationRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_53); 

                    						newLeafNode(otherlv_2, grammarAccess.getChangeToRelationAccess().getContextContextModelCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,53,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getChangeToRelationAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMyDsl.g:2134:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:2135:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:2135:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:2136:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToRelationRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_53); 

                    						newLeafNode(otherlv_4, grammarAccess.getChangeToRelationAccess().getRelationRelationCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,53,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getChangeToRelationAccess().getFullStopKeyword_2_3());
                    			
                    // InternalMyDsl.g:2151:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMyDsl.g:2152:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMyDsl.g:2152:5: (otherlv_6= RULE_ID )
                    // InternalMyDsl.g:2153:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToRelationRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_54); 

                    						newLeafNode(otherlv_6, grammarAccess.getChangeToRelationAccess().getAttributeAttributeCrossReference_2_4_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2165:3: (otherlv_7= ',' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==39) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:2166:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_55); 

                    				newLeafNode(otherlv_7, grammarAccess.getChangeToRelationAccess().getCommaKeyword_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2171:3: ( (lv_changevalue_8_0= ruleAttributeValue ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID||(LA62_0>=RULE_NUMBER && LA62_0<=RULE_REAL)||(LA62_0>=26 && LA62_0<=27)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMyDsl.g:2172:4: (lv_changevalue_8_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:2172:4: (lv_changevalue_8_0= ruleAttributeValue )
                    // InternalMyDsl.g:2173:5: lv_changevalue_8_0= ruleAttributeValue
                    {

                    					newCompositeNode(grammarAccess.getChangeToRelationAccess().getChangevalueAttributeValueParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_36);
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

            otherlv_9=(Token)match(input,40,FOLLOW_2); 

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


    // $ANTLR start "entryRuleName"
    // InternalMyDsl.g:2198:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalMyDsl.g:2198:44: (iv_ruleName= ruleName EOF )
            // InternalMyDsl.g:2199:2: iv_ruleName= ruleName EOF
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
    // InternalMyDsl.g:2205:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_Number_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2211:2: ( (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' ) )
            // InternalMyDsl.g:2212:2: (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' )
            {
            // InternalMyDsl.g:2212:2: (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' )
            // InternalMyDsl.g:2213:3: this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')'
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,38,FOLLOW_56); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getNameAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2225:3: (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )?
            int alt63=3;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_NUMBER) ) {
                alt63=2;
            }
            switch (alt63) {
                case 1 :
                    // InternalMyDsl.g:2226:4: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_36); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getNameAccess().getIDTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2234:4: this_Number_3= RULE_NUMBER
                    {
                    this_Number_3=(Token)match(input,RULE_NUMBER,FOLLOW_36); 

                    				current.merge(this_Number_3);
                    			

                    				newLeafNode(this_Number_3, grammarAccess.getNameAccess().getNumberTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalMyDsl.g:2251:1: entryRuleObjectType returns [EObject current=null] : iv_ruleObjectType= ruleObjectType EOF ;
    public final EObject entryRuleObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectType = null;


        try {
            // InternalMyDsl.g:2251:51: (iv_ruleObjectType= ruleObjectType EOF )
            // InternalMyDsl.g:2252:2: iv_ruleObjectType= ruleObjectType EOF
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
    // InternalMyDsl.g:2258:1: ruleObjectType returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObjectType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2264:2: ( (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2265:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2265:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2266:3: otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectTypeAccess().getObjectKeyword_0());
            		
            // InternalMyDsl.g:2270:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2271:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2271:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2272:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:2292:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalMyDsl.g:2292:47: (iv_ruleObject= ruleObject EOF )
            // InternalMyDsl.g:2293:2: iv_ruleObject= ruleObject EOF
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
    // InternalMyDsl.g:2299:1: ruleObject returns [EObject current=null] : ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_object_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2305:2: ( ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:2306:2: ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:2306:2: ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMyDsl.g:2307:3: ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalMyDsl.g:2307:3: ( (lv_object_0_0= ruleObjectType ) )
            // InternalMyDsl.g:2308:4: (lv_object_0_0= ruleObjectType )
            {
            // InternalMyDsl.g:2308:4: (lv_object_0_0= ruleObjectType )
            // InternalMyDsl.g:2309:5: lv_object_0_0= ruleObjectType
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

            // InternalMyDsl.g:2326:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2327:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2327:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2328:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

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
    // InternalMyDsl.g:2352:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMyDsl.g:2352:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyDsl.g:2353:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalMyDsl.g:2359:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_messages_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2365:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:2366:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:2366:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            // InternalMyDsl.g:2367:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalMyDsl.g:2371:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2372:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2372:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2373:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2393:3: ( (lv_messages_3_0= ruleMessage ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==43) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalMyDsl.g:2394:4: (lv_messages_3_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:2394:4: (lv_messages_3_0= ruleMessage )
            	    // InternalMyDsl.g:2395:5: lv_messages_3_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintAccess().getMessagesMessageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_57);
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
            	    break loop64;
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
    // InternalMyDsl.g:2420:1: entryRuleAlt returns [EObject current=null] : iv_ruleAlt= ruleAlt EOF ;
    public final EObject entryRuleAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlt = null;


        try {
            // InternalMyDsl.g:2420:44: (iv_ruleAlt= ruleAlt EOF )
            // InternalMyDsl.g:2421:2: iv_ruleAlt= ruleAlt EOF
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
    // InternalMyDsl.g:2427:1: ruleAlt returns [EObject current=null] : (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* ) ;
    public final EObject ruleAlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2433:2: ( (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* ) )
            // InternalMyDsl.g:2434:2: (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* )
            {
            // InternalMyDsl.g:2434:2: (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* )
            // InternalMyDsl.g:2435:3: otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )*
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58); 

            			newLeafNode(otherlv_0, grammarAccess.getAltAccess().getAltKeyword_0());
            		
            // InternalMyDsl.g:2439:3: ( (lv_expressions_1_0= ruleExpression ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==38) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalMyDsl.g:2440:4: (lv_expressions_1_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:2440:4: (lv_expressions_1_0= ruleExpression )
            	    // InternalMyDsl.g:2441:5: lv_expressions_1_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getAltAccess().getExpressionsExpressionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_58);
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
            	    break loop65;
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
    // InternalMyDsl.g:2462:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:2462:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:2463:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:2469:1: ruleExpression returns [EObject current=null] : (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:2475:2: ( (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' ) )
            // InternalMyDsl.g:2476:2: (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' )
            {
            // InternalMyDsl.g:2476:2: (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' )
            // InternalMyDsl.g:2477:3: otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:2481:3: (this_ID_1= RULE_ID )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMyDsl.g:2482:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_59); 

                    				newLeafNode(this_ID_1, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2487:3: (otherlv_2= '=' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==24) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyDsl.g:2488:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_60); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getEqualsSignKeyword_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2493:3: (otherlv_3= '>' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==29) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyDsl.g:2494:4: otherlv_3= '>'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_61); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getGreaterThanSignKeyword_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2499:3: (otherlv_4= '<' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==30) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyDsl.g:2500:4: otherlv_4= '<'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_62); 

                    				newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getLessThanSignKeyword_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2505:3: (otherlv_5= '>=' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==31) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMyDsl.g:2506:4: otherlv_5= '>='
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_63); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getGreaterThanSignEqualsSignKeyword_5());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2511:3: (otherlv_6= '<=' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==32) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyDsl.g:2512:4: otherlv_6= '<='
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_56); 

                    				newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getLessThanSignEqualsSignKeyword_6());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2517:3: (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )?
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID) ) {
                alt72=1;
            }
            else if ( (LA72_0==RULE_NUMBER) ) {
                alt72=2;
            }
            switch (alt72) {
                case 1 :
                    // InternalMyDsl.g:2518:4: this_ID_7= RULE_ID
                    {
                    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_36); 

                    				newLeafNode(this_ID_7, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_7_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2523:4: this_Number_8= RULE_NUMBER
                    {
                    this_Number_8=(Token)match(input,RULE_NUMBER,FOLLOW_36); 

                    				newLeafNode(this_Number_8, grammarAccess.getExpressionAccess().getNumberTerminalRuleCall_7_1());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_57); 

            			newLeafNode(otherlv_10, grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalMyDsl.g:2536:3: ( (lv_messages_11_0= ruleMessage ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==43) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalMyDsl.g:2537:4: (lv_messages_11_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:2537:4: (lv_messages_11_0= ruleMessage )
            	    // InternalMyDsl.g:2538:5: lv_messages_11_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getExpressionAccess().getMessagesMessageParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_57);
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
            	    break loop73;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:2563:1: entryRulePar returns [EObject current=null] : iv_rulePar= rulePar EOF ;
    public final EObject entryRulePar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePar = null;


        try {
            // InternalMyDsl.g:2563:44: (iv_rulePar= rulePar EOF )
            // InternalMyDsl.g:2564:2: iv_rulePar= rulePar EOF
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
    // InternalMyDsl.g:2570:1: rulePar returns [EObject current=null] : (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' ) ;
    public final EObject rulePar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parexpression_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2576:2: ( (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:2577:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:2577:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' )
            // InternalMyDsl.g:2578:3: otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getParAccess().getParKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getParAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:2586:3: ( (lv_parexpression_2_0= ruleParExpression ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==60) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalMyDsl.g:2587:4: (lv_parexpression_2_0= ruleParExpression )
            	    {
            	    // InternalMyDsl.g:2587:4: (lv_parexpression_2_0= ruleParExpression )
            	    // InternalMyDsl.g:2588:5: lv_parexpression_2_0= ruleParExpression
            	    {

            	    					newCompositeNode(grammarAccess.getParAccess().getParexpressionParExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_64);
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
            	    break loop74;
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
    // InternalMyDsl.g:2613:1: entryRuleParExpression returns [EObject current=null] : iv_ruleParExpression= ruleParExpression EOF ;
    public final EObject entryRuleParExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParExpression = null;


        try {
            // InternalMyDsl.g:2613:54: (iv_ruleParExpression= ruleParExpression EOF )
            // InternalMyDsl.g:2614:2: iv_ruleParExpression= ruleParExpression EOF
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
    // InternalMyDsl.g:2620:1: ruleParExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) ;
    public final EObject ruleParExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_messages_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2626:2: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:2627:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:2627:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            // InternalMyDsl.g:2628:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getParExpressionAccess().getCaseKeyword_0());
            		
            // InternalMyDsl.g:2632:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2633:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2633:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2634:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getParExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2654:3: ( (lv_messages_3_0= ruleMessage ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==43) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalMyDsl.g:2655:4: (lv_messages_3_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:2655:4: (lv_messages_3_0= ruleMessage )
            	    // InternalMyDsl.g:2656:5: lv_messages_3_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getParExpressionAccess().getMessagesMessageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_57);
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
            	    break loop75;
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
    // InternalMyDsl.g:2681:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalMyDsl.g:2681:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalMyDsl.g:2682:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalMyDsl.g:2688:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' ) ;
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
            // InternalMyDsl.g:2694:2: ( (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' ) )
            // InternalMyDsl.g:2695:2: (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' )
            {
            // InternalMyDsl.g:2695:2: (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' )
            // InternalMyDsl.g:2696:3: otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2704:3: ( (lv_min_2_0= RULE_NUMBER ) )
            // InternalMyDsl.g:2705:4: (lv_min_2_0= RULE_NUMBER )
            {
            // InternalMyDsl.g:2705:4: (lv_min_2_0= RULE_NUMBER )
            // InternalMyDsl.g:2706:5: lv_min_2_0= RULE_NUMBER
            {
            lv_min_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_35); 

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

            otherlv_3=(Token)match(input,39,FOLLOW_65); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:2726:3: ( (lv_max_4_0= RULE_NUMBER ) )
            // InternalMyDsl.g:2727:4: (lv_max_4_0= RULE_NUMBER )
            {
            // InternalMyDsl.g:2727:4: (lv_max_4_0= RULE_NUMBER )
            // InternalMyDsl.g:2728:5: lv_max_4_0= RULE_NUMBER
            {
            lv_max_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_36); 

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

            otherlv_5=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_57); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:2752:3: ( (lv_messages_7_0= ruleMessage ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==43) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalMyDsl.g:2753:4: (lv_messages_7_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:2753:4: (lv_messages_7_0= ruleMessage )
            	    // InternalMyDsl.g:2754:5: lv_messages_7_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getLoopAccess().getMessagesMessageParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_57);
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
            	    break loop76;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x020404000007C012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x020404000007C002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0204040000078002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0204040000068002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0204040000048002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0204040000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0004040000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000040000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002800008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000021000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000F00010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000E00010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000F0000D0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000E0000D0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000007EC0000D0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000007CC0000D0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000078C0000D0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000070C0000D0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000060C0000D0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000040C0000D0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000C0000D0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x2DD8080000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000700000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000600000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000700000200C010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000600000200C010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000400000200C010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000000200C010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000002008010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000700002000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000600002000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400002000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000018000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000001800C0000D0L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000001000C0000D0L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000010000000050L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00000101E1000050L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00000101E0000050L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00000101C0000050L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000010180000050L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000010100000050L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x1000000000008000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000040L});

}