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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_REAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'{'", "'}'", "'import'", "'contextmodel'", "'contextfragment'", "'attribute'", "'('", "')'", "';'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'true'", "'false'", "'entity'", "'relation'", "','", "'scenario'", "'message'", "'required'", "'fail'", "'strict'", "'->'", "'past'", "'future'", "'constraint'", "'match'", "'appear'", "'.'", "'disappear'", "'changeTo'", "'object'", "'alt'", "'='", "'par'", "'case'", "'loop'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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

                if ( (LA7_0==48) ) {
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

                if ( (LA8_0==42) ) {
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

                if ( (LA9_0==34) ) {
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

                if ( (LA11_0==31) ) {
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

                if ( (LA12_0==32) ) {
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
    // InternalMyDsl.g:376:1: ruleContextFragment returns [EObject current=null] : (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:382:2: ( (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:383:2: (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:383:2: (otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' )
            // InternalMyDsl.g:384:3: otherlv_0= 'contextfragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}'
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

            otherlv_2=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getContextFragmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:410:3: ( (lv_entities_3_0= ruleEntity ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:411:4: (lv_entities_3_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:411:4: (lv_entities_3_0= ruleEntity )
            	    // InternalMyDsl.g:412:5: lv_entities_3_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getContextFragmentAccess().getEntitiesEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    break loop13;
                }
            } while (true);

            // InternalMyDsl.g:429:3: ( (lv_relations_4_0= ruleRelation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:430:4: (lv_relations_4_0= ruleRelation )
            	    {
            	    // InternalMyDsl.g:430:4: (lv_relations_4_0= ruleRelation )
            	    // InternalMyDsl.g:431:5: lv_relations_4_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getContextFragmentAccess().getRelationsRelationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:463:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ')' otherlv_5= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:469:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ')' otherlv_5= ';' ) )
            // InternalMyDsl.g:470:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ')' otherlv_5= ';' )
            {
            // InternalMyDsl.g:470:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ')' otherlv_5= ';' )
            // InternalMyDsl.g:471:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ')' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalMyDsl.g:475:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:476:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:476:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:477:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:497:3: ( (lv_value_3_0= ruleAttributeValue ) )
            // InternalMyDsl.g:498:4: (lv_value_3_0= ruleAttributeValue )
            {
            // InternalMyDsl.g:498:4: (lv_value_3_0= ruleAttributeValue )
            // InternalMyDsl.g:499:5: lv_value_3_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_value_3_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.mydsl.MyDsl.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getSemicolonKeyword_5());
            		

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
    // InternalMyDsl.g:528:1: entryRuleAttributeValue returns [String current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final String entryRuleAttributeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeValue = null;


        try {
            // InternalMyDsl.g:528:54: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalMyDsl.g:529:2: iv_ruleAttributeValue= ruleAttributeValue EOF
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
    // InternalMyDsl.g:535:1: ruleAttributeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_6= RULE_NUMBER ) | ( (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_13= RULE_REAL ) | (this_ID_14= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_ID_21= RULE_ID ) | (this_ID_22= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_29= RULE_NUMBER ) | (this_ID_30= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_37= RULE_REAL ) | (this_ID_38= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? (kw= 'true' )? (kw= 'false' )? ) ) ;
    public final AntlrDatatypeRuleToken ruleAttributeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_Number_6=null;
        Token this_Real_13=null;
        Token this_ID_14=null;
        Token this_ID_21=null;
        Token this_ID_22=null;
        Token this_Number_29=null;
        Token this_ID_30=null;
        Token this_Real_37=null;
        Token this_ID_38=null;


        	enterRule();

        try {
            // InternalMyDsl.g:541:2: ( ( ( (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_6= RULE_NUMBER ) | ( (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_13= RULE_REAL ) | (this_ID_14= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_ID_21= RULE_ID ) | (this_ID_22= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_29= RULE_NUMBER ) | (this_ID_30= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_37= RULE_REAL ) | (this_ID_38= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? (kw= 'true' )? (kw= 'false' )? ) ) )
            // InternalMyDsl.g:542:2: ( ( (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_6= RULE_NUMBER ) | ( (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_13= RULE_REAL ) | (this_ID_14= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_ID_21= RULE_ID ) | (this_ID_22= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_29= RULE_NUMBER ) | (this_ID_30= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_37= RULE_REAL ) | (this_ID_38= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? (kw= 'true' )? (kw= 'false' )? ) )
            {
            // InternalMyDsl.g:542:2: ( ( (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_6= RULE_NUMBER ) | ( (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_13= RULE_REAL ) | (this_ID_14= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_ID_21= RULE_ID ) | (this_ID_22= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_29= RULE_NUMBER ) | (this_ID_30= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_37= RULE_REAL ) | (this_ID_38= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? (kw= 'true' )? (kw= 'false' )? ) )
            int alt53=6;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:543:3: ( (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_6= RULE_NUMBER )
                    {
                    // InternalMyDsl.g:543:3: ( (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_6= RULE_NUMBER )
                    // InternalMyDsl.g:544:4: (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_6= RULE_NUMBER
                    {
                    // InternalMyDsl.g:544:4: (kw= '>' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==23) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMyDsl.g:545:5: kw= '>'
                            {
                            kw=(Token)match(input,23,FOLLOW_20); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getGreaterThanSignKeyword_0_0());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:551:4: (kw= '<' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==24) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalMyDsl.g:552:5: kw= '<'
                            {
                            kw=(Token)match(input,24,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getLessThanSignKeyword_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:558:4: (kw= '>=' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==25) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMyDsl.g:559:5: kw= '>='
                            {
                            kw=(Token)match(input,25,FOLLOW_22); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getGreaterThanSignEqualsSignKeyword_0_2());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:565:4: (kw= '<=' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==26) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMyDsl.g:566:5: kw= '<='
                            {
                            kw=(Token)match(input,26,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getLessThanSignEqualsSignKeyword_0_3());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:572:4: (kw= '==' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==27) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalMyDsl.g:573:5: kw= '=='
                            {
                            kw=(Token)match(input,27,FOLLOW_24); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getEqualsSignEqualsSignKeyword_0_4());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:579:4: (kw= '!=' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==28) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalMyDsl.g:580:5: kw= '!='
                            {
                            kw=(Token)match(input,28,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getExclamationMarkEqualsSignKeyword_0_5());
                            				

                            }
                            break;

                    }

                    this_Number_6=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    				current.merge(this_Number_6);
                    			

                    				newLeafNode(this_Number_6, grammarAccess.getAttributeValueAccess().getNumberTerminalRuleCall_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:595:3: ( (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_13= RULE_REAL )
                    {
                    // InternalMyDsl.g:595:3: ( (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_13= RULE_REAL )
                    // InternalMyDsl.g:596:4: (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_13= RULE_REAL
                    {
                    // InternalMyDsl.g:596:4: (kw= '>' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==23) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMyDsl.g:597:5: kw= '>'
                            {
                            kw=(Token)match(input,23,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getGreaterThanSignKeyword_1_0());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:603:4: (kw= '<' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==24) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalMyDsl.g:604:5: kw= '<'
                            {
                            kw=(Token)match(input,24,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getLessThanSignKeyword_1_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:610:4: (kw= '>=' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==25) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalMyDsl.g:611:5: kw= '>='
                            {
                            kw=(Token)match(input,25,FOLLOW_28); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getGreaterThanSignEqualsSignKeyword_1_2());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:617:4: (kw= '<=' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==26) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalMyDsl.g:618:5: kw= '<='
                            {
                            kw=(Token)match(input,26,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getLessThanSignEqualsSignKeyword_1_3());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:624:4: (kw= '==' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==27) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalMyDsl.g:625:5: kw= '=='
                            {
                            kw=(Token)match(input,27,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getEqualsSignEqualsSignKeyword_1_4());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:631:4: (kw= '!=' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==28) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalMyDsl.g:632:5: kw= '!='
                            {
                            kw=(Token)match(input,28,FOLLOW_31); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getExclamationMarkEqualsSignKeyword_1_5());
                            				

                            }
                            break;

                    }

                    this_Real_13=(Token)match(input,RULE_REAL,FOLLOW_2); 

                    				current.merge(this_Real_13);
                    			

                    				newLeafNode(this_Real_13, grammarAccess.getAttributeValueAccess().getRealTerminalRuleCall_1_6());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:647:3: (this_ID_14= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_ID_21= RULE_ID )
                    {
                    // InternalMyDsl.g:647:3: (this_ID_14= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_ID_21= RULE_ID )
                    // InternalMyDsl.g:648:4: this_ID_14= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_ID_21= RULE_ID
                    {
                    this_ID_14=(Token)match(input,RULE_ID,FOLLOW_32); 

                    				current.merge(this_ID_14);
                    			

                    				newLeafNode(this_ID_14, grammarAccess.getAttributeValueAccess().getIDTerminalRuleCall_2_0());
                    			
                    // InternalMyDsl.g:655:4: (kw= '>' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==23) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalMyDsl.g:656:5: kw= '>'
                            {
                            kw=(Token)match(input,23,FOLLOW_33); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getGreaterThanSignKeyword_2_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:662:4: (kw= '<' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==24) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalMyDsl.g:663:5: kw= '<'
                            {
                            kw=(Token)match(input,24,FOLLOW_34); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getLessThanSignKeyword_2_2());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:669:4: (kw= '>=' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==25) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalMyDsl.g:670:5: kw= '>='
                            {
                            kw=(Token)match(input,25,FOLLOW_35); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getGreaterThanSignEqualsSignKeyword_2_3());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:676:4: (kw= '<=' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==26) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalMyDsl.g:677:5: kw= '<='
                            {
                            kw=(Token)match(input,26,FOLLOW_36); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getLessThanSignEqualsSignKeyword_2_4());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:683:4: (kw= '==' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==27) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalMyDsl.g:684:5: kw= '=='
                            {
                            kw=(Token)match(input,27,FOLLOW_37); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getEqualsSignEqualsSignKeyword_2_5());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:690:4: (kw= '!=' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==28) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalMyDsl.g:691:5: kw= '!='
                            {
                            kw=(Token)match(input,28,FOLLOW_12); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getExclamationMarkEqualsSignKeyword_2_6());
                            				

                            }
                            break;

                    }

                    this_ID_21=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_21);
                    			

                    				newLeafNode(this_ID_21, grammarAccess.getAttributeValueAccess().getIDTerminalRuleCall_2_7());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:706:3: (this_ID_22= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_29= RULE_NUMBER )
                    {
                    // InternalMyDsl.g:706:3: (this_ID_22= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_29= RULE_NUMBER )
                    // InternalMyDsl.g:707:4: this_ID_22= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_29= RULE_NUMBER
                    {
                    this_ID_22=(Token)match(input,RULE_ID,FOLLOW_38); 

                    				current.merge(this_ID_22);
                    			

                    				newLeafNode(this_ID_22, grammarAccess.getAttributeValueAccess().getIDTerminalRuleCall_3_0());
                    			
                    // InternalMyDsl.g:714:4: (kw= '>' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==23) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalMyDsl.g:715:5: kw= '>'
                            {
                            kw=(Token)match(input,23,FOLLOW_20); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getGreaterThanSignKeyword_3_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:721:4: (kw= '<' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==24) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalMyDsl.g:722:5: kw= '<'
                            {
                            kw=(Token)match(input,24,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getLessThanSignKeyword_3_2());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:728:4: (kw= '>=' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==25) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalMyDsl.g:729:5: kw= '>='
                            {
                            kw=(Token)match(input,25,FOLLOW_22); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getGreaterThanSignEqualsSignKeyword_3_3());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:735:4: (kw= '<=' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==26) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalMyDsl.g:736:5: kw= '<='
                            {
                            kw=(Token)match(input,26,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getLessThanSignEqualsSignKeyword_3_4());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:742:4: (kw= '==' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==27) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalMyDsl.g:743:5: kw= '=='
                            {
                            kw=(Token)match(input,27,FOLLOW_24); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getEqualsSignEqualsSignKeyword_3_5());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:749:4: (kw= '!=' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==28) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalMyDsl.g:750:5: kw= '!='
                            {
                            kw=(Token)match(input,28,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getExclamationMarkEqualsSignKeyword_3_6());
                            				

                            }
                            break;

                    }

                    this_Number_29=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    				current.merge(this_Number_29);
                    			

                    				newLeafNode(this_Number_29, grammarAccess.getAttributeValueAccess().getNumberTerminalRuleCall_3_7());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:765:3: (this_ID_30= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_37= RULE_REAL )
                    {
                    // InternalMyDsl.g:765:3: (this_ID_30= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_37= RULE_REAL )
                    // InternalMyDsl.g:766:4: this_ID_30= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_37= RULE_REAL
                    {
                    this_ID_30=(Token)match(input,RULE_ID,FOLLOW_39); 

                    				current.merge(this_ID_30);
                    			

                    				newLeafNode(this_ID_30, grammarAccess.getAttributeValueAccess().getIDTerminalRuleCall_4_0());
                    			
                    // InternalMyDsl.g:773:4: (kw= '>' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==23) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalMyDsl.g:774:5: kw= '>'
                            {
                            kw=(Token)match(input,23,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getGreaterThanSignKeyword_4_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:780:4: (kw= '<' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==24) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalMyDsl.g:781:5: kw= '<'
                            {
                            kw=(Token)match(input,24,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getLessThanSignKeyword_4_2());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:787:4: (kw= '>=' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==25) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalMyDsl.g:788:5: kw= '>='
                            {
                            kw=(Token)match(input,25,FOLLOW_28); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getGreaterThanSignEqualsSignKeyword_4_3());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:794:4: (kw= '<=' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==26) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalMyDsl.g:795:5: kw= '<='
                            {
                            kw=(Token)match(input,26,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getLessThanSignEqualsSignKeyword_4_4());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:801:4: (kw= '==' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==27) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalMyDsl.g:802:5: kw= '=='
                            {
                            kw=(Token)match(input,27,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getEqualsSignEqualsSignKeyword_4_5());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:808:4: (kw= '!=' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==28) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalMyDsl.g:809:5: kw= '!='
                            {
                            kw=(Token)match(input,28,FOLLOW_31); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getExclamationMarkEqualsSignKeyword_4_6());
                            				

                            }
                            break;

                    }

                    this_Real_37=(Token)match(input,RULE_REAL,FOLLOW_2); 

                    				current.merge(this_Real_37);
                    			

                    				newLeafNode(this_Real_37, grammarAccess.getAttributeValueAccess().getRealTerminalRuleCall_4_7());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:824:3: (this_ID_38= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? (kw= 'true' )? (kw= 'false' )? )
                    {
                    // InternalMyDsl.g:824:3: (this_ID_38= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? (kw= 'true' )? (kw= 'false' )? )
                    // InternalMyDsl.g:825:4: this_ID_38= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? (kw= 'true' )? (kw= 'false' )?
                    {
                    this_ID_38=(Token)match(input,RULE_ID,FOLLOW_40); 

                    				current.merge(this_ID_38);
                    			

                    				newLeafNode(this_ID_38, grammarAccess.getAttributeValueAccess().getIDTerminalRuleCall_5_0());
                    			
                    // InternalMyDsl.g:832:4: (kw= '>' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==23) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalMyDsl.g:833:5: kw= '>'
                            {
                            kw=(Token)match(input,23,FOLLOW_41); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getGreaterThanSignKeyword_5_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:839:4: (kw= '<' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==24) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalMyDsl.g:840:5: kw= '<'
                            {
                            kw=(Token)match(input,24,FOLLOW_42); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getLessThanSignKeyword_5_2());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:846:4: (kw= '>=' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==25) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalMyDsl.g:847:5: kw= '>='
                            {
                            kw=(Token)match(input,25,FOLLOW_43); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getGreaterThanSignEqualsSignKeyword_5_3());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:853:4: (kw= '<=' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==26) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalMyDsl.g:854:5: kw= '<='
                            {
                            kw=(Token)match(input,26,FOLLOW_44); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getLessThanSignEqualsSignKeyword_5_4());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:860:4: (kw= '==' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==27) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalMyDsl.g:861:5: kw= '=='
                            {
                            kw=(Token)match(input,27,FOLLOW_45); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getEqualsSignEqualsSignKeyword_5_5());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:867:4: (kw= '!=' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==28) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalMyDsl.g:868:5: kw= '!='
                            {
                            kw=(Token)match(input,28,FOLLOW_46); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getExclamationMarkEqualsSignKeyword_5_6());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:874:4: (kw= 'true' )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==29) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalMyDsl.g:875:5: kw= 'true'
                            {
                            kw=(Token)match(input,29,FOLLOW_47); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getTrueKeyword_5_7());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:881:4: (kw= 'false' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==30) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalMyDsl.g:882:5: kw= 'false'
                            {
                            kw=(Token)match(input,30,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getFalseKeyword_5_8());
                            				

                            }
                            break;

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


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:893:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:893:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:894:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalMyDsl.g:900:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:906:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:907:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:907:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalMyDsl.g:908:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:912:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:913:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:913:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:914:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:934:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==19) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalMyDsl.g:935:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:935:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalMyDsl.g:936:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_48);
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
            	    break loop54;
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


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:961:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:961:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:962:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalMyDsl.g:968:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) ;
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
            // InternalMyDsl.g:974:2: ( (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:975:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:975:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            // InternalMyDsl.g:976:3: otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalMyDsl.g:980:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:981:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:981:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:982:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1002:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1003:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1003:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1004:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_49); 

            					newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getSenderEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:1019:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1020:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1020:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1021:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getReceiverEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_48); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:1040:3: ( (lv_attributes_8_0= ruleAttribute ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==19) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalMyDsl.g:1041:4: (lv_attributes_8_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:1041:4: (lv_attributes_8_0= ruleAttribute )
            	    // InternalMyDsl.g:1042:5: lv_attributes_8_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_48);
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
            	    break loop55;
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


    // $ANTLR start "entryRuleScenario"
    // InternalMyDsl.g:1067:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalMyDsl.g:1067:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalMyDsl.g:1068:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalMyDsl.g:1074:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_scenariocontents_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1080:2: ( (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:1081:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:1081:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}' )
            // InternalMyDsl.g:1082:3: otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_scenariocontents_3_0= ruleScenarioContent ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalMyDsl.g:1086:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1087:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1087:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1088:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1108:3: ( (lv_scenariocontents_3_0= ruleScenarioContent ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==35||(LA56_0>=43 && LA56_0<=44)||(LA56_0>=46 && LA56_0<=47)||LA56_0==49||LA56_0==51||LA56_0==53) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMyDsl.g:1109:4: (lv_scenariocontents_3_0= ruleScenarioContent )
            	    {
            	    // InternalMyDsl.g:1109:4: (lv_scenariocontents_3_0= ruleScenarioContent )
            	    // InternalMyDsl.g:1110:5: lv_scenariocontents_3_0= ruleScenarioContent
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getScenariocontentsScenarioContentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_50);
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
            	    break loop56;
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
    // InternalMyDsl.g:1135:1: entryRuleScenarioContent returns [EObject current=null] : iv_ruleScenarioContent= ruleScenarioContent EOF ;
    public final EObject entryRuleScenarioContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioContent = null;


        try {
            // InternalMyDsl.g:1135:56: (iv_ruleScenarioContent= ruleScenarioContent EOF )
            // InternalMyDsl.g:1136:2: iv_ruleScenarioContent= ruleScenarioContent EOF
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
    // InternalMyDsl.g:1142:1: ruleScenarioContent returns [EObject current=null] : ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) ) ;
    public final EObject ruleScenarioContent() throws RecognitionException {
        EObject current = null;

        EObject lv_alt_0_0 = null;

        EObject lv_message_1_0 = null;

        EObject lv_par_2_0 = null;

        EObject lv_loop_3_0 = null;

        EObject lv_contextmessage_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1148:2: ( ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) ) )
            // InternalMyDsl.g:1149:2: ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) )
            {
            // InternalMyDsl.g:1149:2: ( ( (lv_alt_0_0= ruleAlt ) ) | ( (lv_message_1_0= ruleMessage ) ) | ( (lv_par_2_0= rulePar ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_contextmessage_4_0= ruleContextMessage ) ) )
            int alt57=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt57=1;
                }
                break;
            case 35:
                {
                alt57=2;
                }
                break;
            case 51:
                {
                alt57=3;
                }
                break;
            case 53:
                {
                alt57=4;
                }
                break;
            case 43:
            case 44:
            case 46:
            case 47:
                {
                alt57=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:1150:3: ( (lv_alt_0_0= ruleAlt ) )
                    {
                    // InternalMyDsl.g:1150:3: ( (lv_alt_0_0= ruleAlt ) )
                    // InternalMyDsl.g:1151:4: (lv_alt_0_0= ruleAlt )
                    {
                    // InternalMyDsl.g:1151:4: (lv_alt_0_0= ruleAlt )
                    // InternalMyDsl.g:1152:5: lv_alt_0_0= ruleAlt
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
                    // InternalMyDsl.g:1170:3: ( (lv_message_1_0= ruleMessage ) )
                    {
                    // InternalMyDsl.g:1170:3: ( (lv_message_1_0= ruleMessage ) )
                    // InternalMyDsl.g:1171:4: (lv_message_1_0= ruleMessage )
                    {
                    // InternalMyDsl.g:1171:4: (lv_message_1_0= ruleMessage )
                    // InternalMyDsl.g:1172:5: lv_message_1_0= ruleMessage
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
                    // InternalMyDsl.g:1190:3: ( (lv_par_2_0= rulePar ) )
                    {
                    // InternalMyDsl.g:1190:3: ( (lv_par_2_0= rulePar ) )
                    // InternalMyDsl.g:1191:4: (lv_par_2_0= rulePar )
                    {
                    // InternalMyDsl.g:1191:4: (lv_par_2_0= rulePar )
                    // InternalMyDsl.g:1192:5: lv_par_2_0= rulePar
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
                    // InternalMyDsl.g:1210:3: ( (lv_loop_3_0= ruleLoop ) )
                    {
                    // InternalMyDsl.g:1210:3: ( (lv_loop_3_0= ruleLoop ) )
                    // InternalMyDsl.g:1211:4: (lv_loop_3_0= ruleLoop )
                    {
                    // InternalMyDsl.g:1211:4: (lv_loop_3_0= ruleLoop )
                    // InternalMyDsl.g:1212:5: lv_loop_3_0= ruleLoop
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
                    // InternalMyDsl.g:1230:3: ( (lv_contextmessage_4_0= ruleContextMessage ) )
                    {
                    // InternalMyDsl.g:1230:3: ( (lv_contextmessage_4_0= ruleContextMessage ) )
                    // InternalMyDsl.g:1231:4: (lv_contextmessage_4_0= ruleContextMessage )
                    {
                    // InternalMyDsl.g:1231:4: (lv_contextmessage_4_0= ruleContextMessage )
                    // InternalMyDsl.g:1232:5: lv_contextmessage_4_0= ruleContextMessage
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
    // InternalMyDsl.g:1253:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalMyDsl.g:1253:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMyDsl.g:1254:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalMyDsl.g:1260:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' ) ;
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
            // InternalMyDsl.g:1266:2: ( (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' ) )
            // InternalMyDsl.g:1267:2: (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' )
            {
            // InternalMyDsl.g:1267:2: (otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';' )
            // InternalMyDsl.g:1268:3: otherlv_0= 'message' ( (lv_name_1_0= ruleName ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_fail_3_0= 'fail' ) )? ( (lv_strict_4_0= 'strict' ) )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) ( (lv_past_8_0= 'past' ) )? ( (lv_future_9_0= 'future' ) )? ( (lv_constraint_10_0= 'constraint' ) )? (otherlv_11= '{' )? ( (otherlv_12= RULE_ID ) )? (otherlv_13= '}' )? otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
            		
            // InternalMyDsl.g:1272:3: ( (lv_name_1_0= ruleName ) )
            // InternalMyDsl.g:1273:4: (lv_name_1_0= ruleName )
            {
            // InternalMyDsl.g:1273:4: (lv_name_1_0= ruleName )
            // InternalMyDsl.g:1274:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getMessageAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_51);
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

            // InternalMyDsl.g:1291:3: ( (lv_required_2_0= 'required' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==36) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:1292:4: (lv_required_2_0= 'required' )
                    {
                    // InternalMyDsl.g:1292:4: (lv_required_2_0= 'required' )
                    // InternalMyDsl.g:1293:5: lv_required_2_0= 'required'
                    {
                    lv_required_2_0=(Token)match(input,36,FOLLOW_52); 

                    					newLeafNode(lv_required_2_0, grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1305:3: ( (lv_fail_3_0= 'fail' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==37) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:1306:4: (lv_fail_3_0= 'fail' )
                    {
                    // InternalMyDsl.g:1306:4: (lv_fail_3_0= 'fail' )
                    // InternalMyDsl.g:1307:5: lv_fail_3_0= 'fail'
                    {
                    lv_fail_3_0=(Token)match(input,37,FOLLOW_53); 

                    					newLeafNode(lv_fail_3_0, grammarAccess.getMessageAccess().getFailFailKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "fail", true, "fail");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1319:3: ( (lv_strict_4_0= 'strict' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==38) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:1320:4: (lv_strict_4_0= 'strict' )
                    {
                    // InternalMyDsl.g:1320:4: (lv_strict_4_0= 'strict' )
                    // InternalMyDsl.g:1321:5: lv_strict_4_0= 'strict'
                    {
                    lv_strict_4_0=(Token)match(input,38,FOLLOW_12); 

                    					newLeafNode(lv_strict_4_0, grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "strict", true, "strict");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1333:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1334:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1334:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1335:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_54); 

            					newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getSenderObjectCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            // InternalMyDsl.g:1350:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:1351:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:1351:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:1352:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getReceiverObjectCrossReference_7_0());
            				

            }


            }

            // InternalMyDsl.g:1363:3: ( (lv_past_8_0= 'past' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==40) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:1364:4: (lv_past_8_0= 'past' )
                    {
                    // InternalMyDsl.g:1364:4: (lv_past_8_0= 'past' )
                    // InternalMyDsl.g:1365:5: lv_past_8_0= 'past'
                    {
                    lv_past_8_0=(Token)match(input,40,FOLLOW_56); 

                    					newLeafNode(lv_past_8_0, grammarAccess.getMessageAccess().getPastPastKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "past", true, "past");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1377:3: ( (lv_future_9_0= 'future' ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==41) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMyDsl.g:1378:4: (lv_future_9_0= 'future' )
                    {
                    // InternalMyDsl.g:1378:4: (lv_future_9_0= 'future' )
                    // InternalMyDsl.g:1379:5: lv_future_9_0= 'future'
                    {
                    lv_future_9_0=(Token)match(input,41,FOLLOW_57); 

                    					newLeafNode(lv_future_9_0, grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "future", true, "future");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1391:3: ( (lv_constraint_10_0= 'constraint' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==42) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMyDsl.g:1392:4: (lv_constraint_10_0= 'constraint' )
                    {
                    // InternalMyDsl.g:1392:4: (lv_constraint_10_0= 'constraint' )
                    // InternalMyDsl.g:1393:5: lv_constraint_10_0= 'constraint'
                    {
                    lv_constraint_10_0=(Token)match(input,42,FOLLOW_58); 

                    					newLeafNode(lv_constraint_10_0, grammarAccess.getMessageAccess().getConstraintConstraintKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    					setWithLastConsumed(current, "constraint", true, "constraint");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1405:3: (otherlv_11= '{' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==14) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMyDsl.g:1406:4: otherlv_11= '{'
                    {
                    otherlv_11=(Token)match(input,14,FOLLOW_59); 

                    				newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_11());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1411:3: ( (otherlv_12= RULE_ID ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyDsl.g:1412:4: (otherlv_12= RULE_ID )
                    {
                    // InternalMyDsl.g:1412:4: (otherlv_12= RULE_ID )
                    // InternalMyDsl.g:1413:5: otherlv_12= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMessageRule());
                    					}
                    				
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_60); 

                    					newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getCConstraintCrossReference_12_0());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1424:3: (otherlv_13= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==15) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMyDsl.g:1425:4: otherlv_13= '}'
                    {
                    otherlv_13=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_13());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:1438:1: entryRuleContextMessage returns [EObject current=null] : iv_ruleContextMessage= ruleContextMessage EOF ;
    public final EObject entryRuleContextMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextMessage = null;


        try {
            // InternalMyDsl.g:1438:55: (iv_ruleContextMessage= ruleContextMessage EOF )
            // InternalMyDsl.g:1439:2: iv_ruleContextMessage= ruleContextMessage EOF
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
    // InternalMyDsl.g:1445:1: ruleContextMessage returns [EObject current=null] : ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' ) ;
    public final EObject ruleContextMessage() throws RecognitionException {
        EObject current = null;

        Token lv_required_1_0=null;
        Token lv_fail_2_0=null;
        Token lv_strict_3_0=null;
        Token otherlv_4=null;
        EObject lv_content_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1451:2: ( ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' ) )
            // InternalMyDsl.g:1452:2: ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' )
            {
            // InternalMyDsl.g:1452:2: ( ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';' )
            // InternalMyDsl.g:1453:3: ( (lv_content_0_0= ruleContextMessageContent ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_fail_2_0= 'fail' ) )? ( (lv_strict_3_0= 'strict' ) )? otherlv_4= ';'
            {
            // InternalMyDsl.g:1453:3: ( (lv_content_0_0= ruleContextMessageContent ) )
            // InternalMyDsl.g:1454:4: (lv_content_0_0= ruleContextMessageContent )
            {
            // InternalMyDsl.g:1454:4: (lv_content_0_0= ruleContextMessageContent )
            // InternalMyDsl.g:1455:5: lv_content_0_0= ruleContextMessageContent
            {

            					newCompositeNode(grammarAccess.getContextMessageAccess().getContentContextMessageContentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_61);
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

            // InternalMyDsl.g:1472:3: ( (lv_required_1_0= 'required' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==36) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyDsl.g:1473:4: (lv_required_1_0= 'required' )
                    {
                    // InternalMyDsl.g:1473:4: (lv_required_1_0= 'required' )
                    // InternalMyDsl.g:1474:5: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,36,FOLLOW_62); 

                    					newLeafNode(lv_required_1_0, grammarAccess.getContextMessageAccess().getRequiredRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextMessageRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1486:3: ( (lv_fail_2_0= 'fail' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==37) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyDsl.g:1487:4: (lv_fail_2_0= 'fail' )
                    {
                    // InternalMyDsl.g:1487:4: (lv_fail_2_0= 'fail' )
                    // InternalMyDsl.g:1488:5: lv_fail_2_0= 'fail'
                    {
                    lv_fail_2_0=(Token)match(input,37,FOLLOW_63); 

                    					newLeafNode(lv_fail_2_0, grammarAccess.getContextMessageAccess().getFailFailKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextMessageRule());
                    					}
                    					setWithLastConsumed(current, "fail", true, "fail");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1500:3: ( (lv_strict_3_0= 'strict' ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==38) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyDsl.g:1501:4: (lv_strict_3_0= 'strict' )
                    {
                    // InternalMyDsl.g:1501:4: (lv_strict_3_0= 'strict' )
                    // InternalMyDsl.g:1502:5: lv_strict_3_0= 'strict'
                    {
                    lv_strict_3_0=(Token)match(input,38,FOLLOW_19); 

                    					newLeafNode(lv_strict_3_0, grammarAccess.getContextMessageAccess().getStrictStrictKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextMessageRule());
                    					}
                    					setWithLastConsumed(current, "strict", true, "strict");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:1522:1: entryRuleContextMessageContent returns [EObject current=null] : iv_ruleContextMessageContent= ruleContextMessageContent EOF ;
    public final EObject entryRuleContextMessageContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextMessageContent = null;


        try {
            // InternalMyDsl.g:1522:62: (iv_ruleContextMessageContent= ruleContextMessageContent EOF )
            // InternalMyDsl.g:1523:2: iv_ruleContextMessageContent= ruleContextMessageContent EOF
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
    // InternalMyDsl.g:1529:1: ruleContextMessageContent returns [EObject current=null] : ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) ) ;
    public final EObject ruleContextMessageContent() throws RecognitionException {
        EObject current = null;

        EObject lv_match_0_0 = null;

        EObject lv_change_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1535:2: ( ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) ) )
            // InternalMyDsl.g:1536:2: ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) )
            {
            // InternalMyDsl.g:1536:2: ( ( (lv_match_0_0= ruleMatchMessage ) ) | ( (lv_change_1_0= ruleChangeMessage ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==43) ) {
                alt70=1;
            }
            else if ( (LA70_0==44||(LA70_0>=46 && LA70_0<=47)) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalMyDsl.g:1537:3: ( (lv_match_0_0= ruleMatchMessage ) )
                    {
                    // InternalMyDsl.g:1537:3: ( (lv_match_0_0= ruleMatchMessage ) )
                    // InternalMyDsl.g:1538:4: (lv_match_0_0= ruleMatchMessage )
                    {
                    // InternalMyDsl.g:1538:4: (lv_match_0_0= ruleMatchMessage )
                    // InternalMyDsl.g:1539:5: lv_match_0_0= ruleMatchMessage
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
                    // InternalMyDsl.g:1557:3: ( (lv_change_1_0= ruleChangeMessage ) )
                    {
                    // InternalMyDsl.g:1557:3: ( (lv_change_1_0= ruleChangeMessage ) )
                    // InternalMyDsl.g:1558:4: (lv_change_1_0= ruleChangeMessage )
                    {
                    // InternalMyDsl.g:1558:4: (lv_change_1_0= ruleChangeMessage )
                    // InternalMyDsl.g:1559:5: lv_change_1_0= ruleChangeMessage
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
    // InternalMyDsl.g:1580:1: entryRuleMatchMessage returns [EObject current=null] : iv_ruleMatchMessage= ruleMatchMessage EOF ;
    public final EObject entryRuleMatchMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchMessage = null;


        try {
            // InternalMyDsl.g:1580:53: (iv_ruleMatchMessage= ruleMatchMessage EOF )
            // InternalMyDsl.g:1581:2: iv_ruleMatchMessage= ruleMatchMessage EOF
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
    // InternalMyDsl.g:1587:1: ruleMatchMessage returns [EObject current=null] : (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' ) ;
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
            // InternalMyDsl.g:1593:2: ( (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:1594:2: (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:1594:2: (otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' )
            // InternalMyDsl.g:1595:3: otherlv_0= 'match' otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' )? ( (otherlv_4= RULE_ID ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchMessageAccess().getMatchKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getMatchMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1603:3: ( (otherlv_2= RULE_ID ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyDsl.g:1604:4: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:1604:4: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:1605:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMatchMessageRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_64); 

                    					newLeafNode(otherlv_2, grammarAccess.getMatchMessageAccess().getContextContextModelCrossReference_2_0());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1616:3: (otherlv_3= ',' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==33) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalMyDsl.g:1617:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_65); 

                    				newLeafNode(otherlv_3, grammarAccess.getMatchMessageAccess().getCommaKeyword_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1622:3: ( (otherlv_4= RULE_ID ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalMyDsl.g:1623:4: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:1623:4: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:1624:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMatchMessageRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_18); 

                    					newLeafNode(otherlv_4, grammarAccess.getMatchMessageAccess().getContentContextFragmentCrossReference_4_0());
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:1643:1: entryRuleChangeMessage returns [EObject current=null] : iv_ruleChangeMessage= ruleChangeMessage EOF ;
    public final EObject entryRuleChangeMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeMessage = null;


        try {
            // InternalMyDsl.g:1643:54: (iv_ruleChangeMessage= ruleChangeMessage EOF )
            // InternalMyDsl.g:1644:2: iv_ruleChangeMessage= ruleChangeMessage EOF
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
    // InternalMyDsl.g:1650:1: ruleChangeMessage returns [EObject current=null] : ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) ) ;
    public final EObject ruleChangeMessage() throws RecognitionException {
        EObject current = null;

        EObject lv_disappear_0_0 = null;

        EObject lv_appear_1_0 = null;

        EObject lv_changeto_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1656:2: ( ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) ) )
            // InternalMyDsl.g:1657:2: ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) )
            {
            // InternalMyDsl.g:1657:2: ( ( (lv_disappear_0_0= ruleDisappearMessage ) ) | ( (lv_appear_1_0= ruleAppearMessage ) ) | ( (lv_changeto_2_0= ruleChangeToMessage ) ) )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt74=1;
                }
                break;
            case 44:
                {
                alt74=2;
                }
                break;
            case 47:
                {
                alt74=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalMyDsl.g:1658:3: ( (lv_disappear_0_0= ruleDisappearMessage ) )
                    {
                    // InternalMyDsl.g:1658:3: ( (lv_disappear_0_0= ruleDisappearMessage ) )
                    // InternalMyDsl.g:1659:4: (lv_disappear_0_0= ruleDisappearMessage )
                    {
                    // InternalMyDsl.g:1659:4: (lv_disappear_0_0= ruleDisappearMessage )
                    // InternalMyDsl.g:1660:5: lv_disappear_0_0= ruleDisappearMessage
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
                    // InternalMyDsl.g:1678:3: ( (lv_appear_1_0= ruleAppearMessage ) )
                    {
                    // InternalMyDsl.g:1678:3: ( (lv_appear_1_0= ruleAppearMessage ) )
                    // InternalMyDsl.g:1679:4: (lv_appear_1_0= ruleAppearMessage )
                    {
                    // InternalMyDsl.g:1679:4: (lv_appear_1_0= ruleAppearMessage )
                    // InternalMyDsl.g:1680:5: lv_appear_1_0= ruleAppearMessage
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
                    // InternalMyDsl.g:1698:3: ( (lv_changeto_2_0= ruleChangeToMessage ) )
                    {
                    // InternalMyDsl.g:1698:3: ( (lv_changeto_2_0= ruleChangeToMessage ) )
                    // InternalMyDsl.g:1699:4: (lv_changeto_2_0= ruleChangeToMessage )
                    {
                    // InternalMyDsl.g:1699:4: (lv_changeto_2_0= ruleChangeToMessage )
                    // InternalMyDsl.g:1700:5: lv_changeto_2_0= ruleChangeToMessage
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
    // InternalMyDsl.g:1721:1: entryRuleAppearMessage returns [EObject current=null] : iv_ruleAppearMessage= ruleAppearMessage EOF ;
    public final EObject entryRuleAppearMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppearMessage = null;


        try {
            // InternalMyDsl.g:1721:54: (iv_ruleAppearMessage= ruleAppearMessage EOF )
            // InternalMyDsl.g:1722:2: iv_ruleAppearMessage= ruleAppearMessage EOF
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
    // InternalMyDsl.g:1728:1: ruleAppearMessage returns [EObject current=null] : (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) ;
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
            // InternalMyDsl.g:1734:2: ( (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:1735:2: (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:1735:2: (otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            // InternalMyDsl.g:1736:3: otherlv_0= 'appear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getAppearMessageAccess().getAppearKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getAppearMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1744:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalMyDsl.g:1745:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1745:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:1746:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:1746:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:1747:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAppearMessageRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_66); 

                    						newLeafNode(otherlv_2, grammarAccess.getAppearMessageAccess().getContextContextModelCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,45,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getAppearMessageAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMyDsl.g:1762:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:1763:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:1763:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:1764:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAppearMessageRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_4, grammarAccess.getAppearMessageAccess().getEntityEntityCrossReference_2_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:1784:1: entryRuleDisappearMessage returns [EObject current=null] : iv_ruleDisappearMessage= ruleDisappearMessage EOF ;
    public final EObject entryRuleDisappearMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisappearMessage = null;


        try {
            // InternalMyDsl.g:1784:57: (iv_ruleDisappearMessage= ruleDisappearMessage EOF )
            // InternalMyDsl.g:1785:2: iv_ruleDisappearMessage= ruleDisappearMessage EOF
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
    // InternalMyDsl.g:1791:1: ruleDisappearMessage returns [EObject current=null] : (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) ;
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
            // InternalMyDsl.g:1797:2: ( (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:1798:2: (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:1798:2: (otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')' )
            // InternalMyDsl.g:1799:3: otherlv_0= 'disappear' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDisappearMessageAccess().getDisappearKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getDisappearMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1807:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalMyDsl.g:1808:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1808:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:1809:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:1809:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:1810:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDisappearMessageRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_66); 

                    						newLeafNode(otherlv_2, grammarAccess.getDisappearMessageAccess().getContextContextModelCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,45,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getDisappearMessageAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMyDsl.g:1825:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:1826:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:1826:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:1827:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDisappearMessageRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_4, grammarAccess.getDisappearMessageAccess().getEntityEntityCrossReference_2_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:1847:1: entryRuleChangeToMessage returns [EObject current=null] : iv_ruleChangeToMessage= ruleChangeToMessage EOF ;
    public final EObject entryRuleChangeToMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeToMessage = null;


        try {
            // InternalMyDsl.g:1847:56: (iv_ruleChangeToMessage= ruleChangeToMessage EOF )
            // InternalMyDsl.g:1848:2: iv_ruleChangeToMessage= ruleChangeToMessage EOF
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
    // InternalMyDsl.g:1854:1: ruleChangeToMessage returns [EObject current=null] : (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' ) ;
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
            // InternalMyDsl.g:1860:2: ( (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' ) )
            // InternalMyDsl.g:1861:2: (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' )
            {
            // InternalMyDsl.g:1861:2: (otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')' )
            // InternalMyDsl.g:1862:3: otherlv_0= 'changeTo' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= ',' )? ( (lv_changevalue_8_0= ruleAttributeValue ) )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeToMessageAccess().getChangeToKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_67); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeToMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1870:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==45) ) {
                    alt77=1;
                }
            }
            switch (alt77) {
                case 1 :
                    // InternalMyDsl.g:1871:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1871:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:1872:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:1872:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:1873:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToMessageRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_66); 

                    						newLeafNode(otherlv_2, grammarAccess.getChangeToMessageAccess().getContextContextModelCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,45,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getChangeToMessageAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMyDsl.g:1888:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:1889:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:1889:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:1890:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToMessageRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_66); 

                    						newLeafNode(otherlv_4, grammarAccess.getChangeToMessageAccess().getEntityEntityCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,45,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getChangeToMessageAccess().getFullStopKeyword_2_3());
                    			
                    // InternalMyDsl.g:1905:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMyDsl.g:1906:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMyDsl.g:1906:5: (otherlv_6= RULE_ID )
                    // InternalMyDsl.g:1907:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeToMessageRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_67); 

                    						newLeafNode(otherlv_6, grammarAccess.getChangeToMessageAccess().getAttributeAttributeCrossReference_2_4_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1919:3: (otherlv_7= ',' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==33) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalMyDsl.g:1920:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_68); 

                    				newLeafNode(otherlv_7, grammarAccess.getChangeToMessageAccess().getCommaKeyword_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1925:3: ( (lv_changevalue_8_0= ruleAttributeValue ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID||(LA79_0>=RULE_NUMBER && LA79_0<=RULE_REAL)||(LA79_0>=23 && LA79_0<=28)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalMyDsl.g:1926:4: (lv_changevalue_8_0= ruleAttributeValue )
                    {
                    // InternalMyDsl.g:1926:4: (lv_changevalue_8_0= ruleAttributeValue )
                    // InternalMyDsl.g:1927:5: lv_changevalue_8_0= ruleAttributeValue
                    {

                    					newCompositeNode(grammarAccess.getChangeToMessageAccess().getChangevalueAttributeValueParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_changevalue_8_0=ruleAttributeValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getChangeToMessageRule());
                    					}
                    					add(
                    						current,
                    						"changevalue",
                    						lv_changevalue_8_0,
                    						"org.xtext.example.mydsl.MyDsl.AttributeValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleName"
    // InternalMyDsl.g:1952:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalMyDsl.g:1952:44: (iv_ruleName= ruleName EOF )
            // InternalMyDsl.g:1953:2: iv_ruleName= ruleName EOF
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
    // InternalMyDsl.g:1959:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_Number_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1965:2: ( (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' ) )
            // InternalMyDsl.g:1966:2: (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' )
            {
            // InternalMyDsl.g:1966:2: (this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')' )
            // InternalMyDsl.g:1967:3: this_ID_0= RULE_ID kw= '(' (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )? kw= ')'
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,20,FOLLOW_69); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getNameAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1979:3: (this_ID_2= RULE_ID | this_Number_3= RULE_NUMBER )?
            int alt80=3;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID) ) {
                alt80=1;
            }
            else if ( (LA80_0==RULE_NUMBER) ) {
                alt80=2;
            }
            switch (alt80) {
                case 1 :
                    // InternalMyDsl.g:1980:4: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_18); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getNameAccess().getIDTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1988:4: this_Number_3= RULE_NUMBER
                    {
                    this_Number_3=(Token)match(input,RULE_NUMBER,FOLLOW_18); 

                    				current.merge(this_Number_3);
                    			

                    				newLeafNode(this_Number_3, grammarAccess.getNameAccess().getNumberTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:2005:1: entryRuleObjectType returns [EObject current=null] : iv_ruleObjectType= ruleObjectType EOF ;
    public final EObject entryRuleObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectType = null;


        try {
            // InternalMyDsl.g:2005:51: (iv_ruleObjectType= ruleObjectType EOF )
            // InternalMyDsl.g:2006:2: iv_ruleObjectType= ruleObjectType EOF
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
    // InternalMyDsl.g:2012:1: ruleObjectType returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObjectType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2018:2: ( (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2019:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2019:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2020:3: otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectTypeAccess().getObjectKeyword_0());
            		
            // InternalMyDsl.g:2024:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2025:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2025:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2026:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:2046:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalMyDsl.g:2046:47: (iv_ruleObject= ruleObject EOF )
            // InternalMyDsl.g:2047:2: iv_ruleObject= ruleObject EOF
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
    // InternalMyDsl.g:2053:1: ruleObject returns [EObject current=null] : ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_object_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2059:2: ( ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:2060:2: ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:2060:2: ( ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMyDsl.g:2061:3: ( (lv_object_0_0= ruleObjectType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalMyDsl.g:2061:3: ( (lv_object_0_0= ruleObjectType ) )
            // InternalMyDsl.g:2062:4: (lv_object_0_0= ruleObjectType )
            {
            // InternalMyDsl.g:2062:4: (lv_object_0_0= ruleObjectType )
            // InternalMyDsl.g:2063:5: lv_object_0_0= ruleObjectType
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

            // InternalMyDsl.g:2080:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2081:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2081:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2082:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:2106:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMyDsl.g:2106:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyDsl.g:2107:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalMyDsl.g:2113:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_messages_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2119:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:2120:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:2120:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            // InternalMyDsl.g:2121:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalMyDsl.g:2125:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2126:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2126:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2127:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2147:3: ( (lv_messages_3_0= ruleMessage ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==35) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalMyDsl.g:2148:4: (lv_messages_3_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:2148:4: (lv_messages_3_0= ruleMessage )
            	    // InternalMyDsl.g:2149:5: lv_messages_3_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintAccess().getMessagesMessageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_70);
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
            	    break loop81;
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
    // InternalMyDsl.g:2174:1: entryRuleAlt returns [EObject current=null] : iv_ruleAlt= ruleAlt EOF ;
    public final EObject entryRuleAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlt = null;


        try {
            // InternalMyDsl.g:2174:44: (iv_ruleAlt= ruleAlt EOF )
            // InternalMyDsl.g:2175:2: iv_ruleAlt= ruleAlt EOF
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
    // InternalMyDsl.g:2181:1: ruleAlt returns [EObject current=null] : (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* ) ;
    public final EObject ruleAlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2187:2: ( (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* ) )
            // InternalMyDsl.g:2188:2: (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* )
            {
            // InternalMyDsl.g:2188:2: (otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )* )
            // InternalMyDsl.g:2189:3: otherlv_0= 'alt' ( (lv_expressions_1_0= ruleExpression ) )*
            {
            otherlv_0=(Token)match(input,49,FOLLOW_71); 

            			newLeafNode(otherlv_0, grammarAccess.getAltAccess().getAltKeyword_0());
            		
            // InternalMyDsl.g:2193:3: ( (lv_expressions_1_0= ruleExpression ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==20) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalMyDsl.g:2194:4: (lv_expressions_1_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:2194:4: (lv_expressions_1_0= ruleExpression )
            	    // InternalMyDsl.g:2195:5: lv_expressions_1_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getAltAccess().getExpressionsExpressionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_71);
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
    // $ANTLR end "ruleAlt"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:2216:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:2216:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:2217:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:2223:1: ruleExpression returns [EObject current=null] : (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:2229:2: ( (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' ) )
            // InternalMyDsl.g:2230:2: (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' )
            {
            // InternalMyDsl.g:2230:2: (otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}' )
            // InternalMyDsl.g:2231:3: otherlv_0= '(' (this_ID_1= RULE_ID )? (otherlv_2= '=' )? (otherlv_3= '>' )? (otherlv_4= '<' )? (otherlv_5= '>=' )? (otherlv_6= '<=' )? (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )? otherlv_9= ')' otherlv_10= '{' ( (lv_messages_11_0= ruleMessage ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_72); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:2235:3: (this_ID_1= RULE_ID )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ID) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalMyDsl.g:2236:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_72); 

                    				newLeafNode(this_ID_1, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2241:3: (otherlv_2= '=' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==50) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalMyDsl.g:2242:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_73); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getEqualsSignKeyword_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2247:3: (otherlv_3= '>' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==23) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalMyDsl.g:2248:4: otherlv_3= '>'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_74); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getGreaterThanSignKeyword_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2253:3: (otherlv_4= '<' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==24) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalMyDsl.g:2254:4: otherlv_4= '<'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_75); 

                    				newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getLessThanSignKeyword_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2259:3: (otherlv_5= '>=' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==25) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalMyDsl.g:2260:4: otherlv_5= '>='
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_76); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getGreaterThanSignEqualsSignKeyword_5());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2265:3: (otherlv_6= '<=' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==26) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalMyDsl.g:2266:4: otherlv_6= '<='
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_69); 

                    				newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getLessThanSignEqualsSignKeyword_6());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2271:3: (this_ID_7= RULE_ID | this_Number_8= RULE_NUMBER )?
            int alt89=3;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID) ) {
                alt89=1;
            }
            else if ( (LA89_0==RULE_NUMBER) ) {
                alt89=2;
            }
            switch (alt89) {
                case 1 :
                    // InternalMyDsl.g:2272:4: this_ID_7= RULE_ID
                    {
                    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_18); 

                    				newLeafNode(this_ID_7, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_7_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2277:4: this_Number_8= RULE_NUMBER
                    {
                    this_Number_8=(Token)match(input,RULE_NUMBER,FOLLOW_18); 

                    				newLeafNode(this_Number_8, grammarAccess.getExpressionAccess().getNumberTerminalRuleCall_7_1());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_70); 

            			newLeafNode(otherlv_10, grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalMyDsl.g:2290:3: ( (lv_messages_11_0= ruleMessage ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==35) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalMyDsl.g:2291:4: (lv_messages_11_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:2291:4: (lv_messages_11_0= ruleMessage )
            	    // InternalMyDsl.g:2292:5: lv_messages_11_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getExpressionAccess().getMessagesMessageParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_70);
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
            	    break loop90;
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
    // InternalMyDsl.g:2317:1: entryRulePar returns [EObject current=null] : iv_rulePar= rulePar EOF ;
    public final EObject entryRulePar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePar = null;


        try {
            // InternalMyDsl.g:2317:44: (iv_rulePar= rulePar EOF )
            // InternalMyDsl.g:2318:2: iv_rulePar= rulePar EOF
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
    // InternalMyDsl.g:2324:1: rulePar returns [EObject current=null] : (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' ) ;
    public final EObject rulePar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parexpression_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2330:2: ( (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:2331:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:2331:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}' )
            // InternalMyDsl.g:2332:3: otherlv_0= 'par' otherlv_1= '{' ( (lv_parexpression_2_0= ruleParExpression ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getParAccess().getParKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_77); 

            			newLeafNode(otherlv_1, grammarAccess.getParAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:2340:3: ( (lv_parexpression_2_0= ruleParExpression ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==52) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalMyDsl.g:2341:4: (lv_parexpression_2_0= ruleParExpression )
            	    {
            	    // InternalMyDsl.g:2341:4: (lv_parexpression_2_0= ruleParExpression )
            	    // InternalMyDsl.g:2342:5: lv_parexpression_2_0= ruleParExpression
            	    {

            	    					newCompositeNode(grammarAccess.getParAccess().getParexpressionParExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_77);
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
            	    break loop91;
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
    // InternalMyDsl.g:2367:1: entryRuleParExpression returns [EObject current=null] : iv_ruleParExpression= ruleParExpression EOF ;
    public final EObject entryRuleParExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParExpression = null;


        try {
            // InternalMyDsl.g:2367:54: (iv_ruleParExpression= ruleParExpression EOF )
            // InternalMyDsl.g:2368:2: iv_ruleParExpression= ruleParExpression EOF
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
    // InternalMyDsl.g:2374:1: ruleParExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) ;
    public final EObject ruleParExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_messages_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2380:2: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:2381:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:2381:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}' )
            // InternalMyDsl.g:2382:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_messages_3_0= ruleMessage ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getParExpressionAccess().getCaseKeyword_0());
            		
            // InternalMyDsl.g:2386:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2387:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2387:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2388:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getParExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2408:3: ( (lv_messages_3_0= ruleMessage ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==35) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalMyDsl.g:2409:4: (lv_messages_3_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:2409:4: (lv_messages_3_0= ruleMessage )
            	    // InternalMyDsl.g:2410:5: lv_messages_3_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getParExpressionAccess().getMessagesMessageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_70);
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
            	    break loop92;
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
    // InternalMyDsl.g:2435:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalMyDsl.g:2435:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalMyDsl.g:2436:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalMyDsl.g:2442:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' ) ;
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
            // InternalMyDsl.g:2448:2: ( (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' ) )
            // InternalMyDsl.g:2449:2: (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' )
            {
            // InternalMyDsl.g:2449:2: (otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}' )
            // InternalMyDsl.g:2450:3: otherlv_0= 'loop' otherlv_1= '(' ( (lv_min_2_0= RULE_NUMBER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_NUMBER ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_messages_7_0= ruleMessage ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2458:3: ( (lv_min_2_0= RULE_NUMBER ) )
            // InternalMyDsl.g:2459:4: (lv_min_2_0= RULE_NUMBER )
            {
            // InternalMyDsl.g:2459:4: (lv_min_2_0= RULE_NUMBER )
            // InternalMyDsl.g:2460:5: lv_min_2_0= RULE_NUMBER
            {
            lv_min_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_49); 

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

            otherlv_3=(Token)match(input,33,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:2480:3: ( (lv_max_4_0= RULE_NUMBER ) )
            // InternalMyDsl.g:2481:4: (lv_max_4_0= RULE_NUMBER )
            {
            // InternalMyDsl.g:2481:4: (lv_max_4_0= RULE_NUMBER )
            // InternalMyDsl.g:2482:5: lv_max_4_0= RULE_NUMBER
            {
            lv_max_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_18); 

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

            otherlv_5=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_70); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:2506:3: ( (lv_messages_7_0= ruleMessage ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==35) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalMyDsl.g:2507:4: (lv_messages_7_0= ruleMessage )
            	    {
            	    // InternalMyDsl.g:2507:4: (lv_messages_7_0= ruleMessage )
            	    // InternalMyDsl.g:2508:5: lv_messages_7_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getLoopAccess().getMessagesMessageParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_70);
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
            	    break loop93;
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


    protected DFA53 dfa53 = new DFA53(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\11\uffff\7\21\4\uffff";
    static final String dfa_3s = "\1\4\6\6\2\uffff\7\4\4\uffff";
    static final String dfa_4s = "\6\34\1\7\2\uffff\7\36\4\uffff";
    static final String dfa_5s = "\7\uffff\1\1\1\2\7\uffff\1\4\1\6\1\3\1\5";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\11\1\uffff\1\7\1\10\17\uffff\1\1\1\2\1\3\1\4\1\5\1\6",
            "\1\7\1\10\20\uffff\1\2\1\3\1\4\1\5\1\6",
            "\1\7\1\10\21\uffff\1\3\1\4\1\5\1\6",
            "\1\7\1\10\22\uffff\1\4\1\5\1\6",
            "\1\7\1\10\23\uffff\1\5\1\6",
            "\1\7\1\10\24\uffff\1\6",
            "\1\7\1\10",
            "",
            "",
            "\1\22\1\uffff\1\20\1\23\15\uffff\1\21\1\uffff\1\12\1\13\1\14\1\15\1\16\1\17\2\21",
            "\1\22\1\uffff\1\20\1\23\15\uffff\1\21\2\uffff\1\13\1\14\1\15\1\16\1\17\2\21",
            "\1\22\1\uffff\1\20\1\23\15\uffff\1\21\3\uffff\1\14\1\15\1\16\1\17\2\21",
            "\1\22\1\uffff\1\20\1\23\15\uffff\1\21\4\uffff\1\15\1\16\1\17\2\21",
            "\1\22\1\uffff\1\20\1\23\15\uffff\1\21\5\uffff\1\16\1\17\2\21",
            "\1\22\1\uffff\1\20\1\23\15\uffff\1\21\6\uffff\1\17\2\21",
            "\1\22\1\uffff\1\20\1\23\15\uffff\1\21\7\uffff\2\21",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "542:2: ( ( (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_6= RULE_NUMBER ) | ( (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_13= RULE_REAL ) | (this_ID_14= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_ID_21= RULE_ID ) | (this_ID_22= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Number_29= RULE_NUMBER ) | (this_ID_30= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? this_Real_37= RULE_REAL ) | (this_ID_38= RULE_ID (kw= '>' )? (kw= '<' )? (kw= '>=' )? (kw= '<=' )? (kw= '==' )? (kw= '!=' )? (kw= 'true' )? (kw= 'false' )? ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000104040007C012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000104040007C002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001040400078002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0001040400068002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0001040400048002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001040400008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040400008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000180008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000001F8000D0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001F000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000001E000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000001C000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000018000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000001F000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000001E000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000001C000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000018000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000001F800010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000001F000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000001E000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000001C000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000001F800040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000001F800080L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000007F800002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000000007F000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000007E000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x002AD80800008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000007000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000006000000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000007000040C010L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x000006000040C010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000004000040C010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x000000000040C010L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000408010L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000007000400000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000006000400000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000004000400000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000200200010L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x000000021FA000D0L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x000000001FA000D0L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0004000007A00050L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000007A00050L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000007200050L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000006200050L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000004200050L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0010000000008000L});

}