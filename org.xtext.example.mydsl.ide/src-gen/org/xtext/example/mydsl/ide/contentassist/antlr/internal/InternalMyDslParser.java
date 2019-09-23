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
<<<<<<< HEAD
<<<<<<< HEAD
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'{'", "'}'", "'scenario'", "'message'", "'->'", "';'", "'('", "')'", "'object'", "'constraint'", "'alt'", "'='", "'>'", "'<'", "'>='", "'<='", "'par'", "'case'", "'loop'", "','", "'required'", "'fail'", "'strict'", "'past'", "'future'"
=======
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'{'", "'}'", "'contextmodel'", "'contextfragment'", "'appear'", "'('", "')'", "'distance'", "'changeTo'", "'conditionsAt'", "';'", "'attribute'", "'entity'", "'relation'", "','", "'scenario'", "'message'", "'->'", "'object'", "'constraint'", "'alt'", "'='", "'>'", "'<'", "'>='", "'<='", "'par'", "'case'", "'required'", "'fail'", "'strict'", "'past'", "'future'"
>>>>>>> Added Xtext for context dependent behavior
=======
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'{'", "'}'", "'contextmodel'", "'contextfragment'", "'appear'", "'('", "')'", "'distance'", "'changeTo'", "'conditionsAt'", "';'", "'attribute'", "'entity'", "'relation'", "','", "'scenario'", "'message'", "'->'", "'match'", "'disappear'", "'object'", "'constraint'", "'alt'", "'='", "'>'", "'<'", "'>='", "'<='", "'par'", "'case'", "'required'", "'fail'", "'strict'", "'past'", "'future'"
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



    // $ANTLR start "entryRuleDomain"
    // InternalMyDsl.g:53:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleDomain EOF )
            // InternalMyDsl.g:55:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalMyDsl.g:62:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Domain__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Domain__Group__0 )
            // InternalMyDsl.g:69:4: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleContextModel"
    // InternalMyDsl.g:78:1: entryRuleContextModel : ruleContextModel EOF ;
    public final void entryRuleContextModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleContextModel EOF )
            // InternalMyDsl.g:80:1: ruleContextModel EOF
            {
             before(grammarAccess.getContextModelRule()); 
            pushFollow(FOLLOW_1);
            ruleContextModel();

            state._fsp--;

             after(grammarAccess.getContextModelRule()); 
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
    // $ANTLR end "entryRuleContextModel"


    // $ANTLR start "ruleContextModel"
    // InternalMyDsl.g:87:1: ruleContextModel : ( ( rule__ContextModel__Group__0 ) ) ;
    public final void ruleContextModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__ContextModel__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__ContextModel__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__ContextModel__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__ContextModel__Group__0 )
            {
             before(grammarAccess.getContextModelAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__ContextModel__Group__0 )
            // InternalMyDsl.g:94:4: rule__ContextModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextModelAccess().getGroup()); 

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
    // $ANTLR end "ruleContextModel"


    // $ANTLR start "entryRuleContextFragment"
    // InternalMyDsl.g:103:1: entryRuleContextFragment : ruleContextFragment EOF ;
    public final void entryRuleContextFragment() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleContextFragment EOF )
            // InternalMyDsl.g:105:1: ruleContextFragment EOF
            {
             before(grammarAccess.getContextFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleContextFragment();

            state._fsp--;

             after(grammarAccess.getContextFragmentRule()); 
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
    // $ANTLR end "entryRuleContextFragment"


    // $ANTLR start "ruleContextFragment"
    // InternalMyDsl.g:112:1: ruleContextFragment : ( ( rule__ContextFragment__Group__0 ) ) ;
    public final void ruleContextFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__ContextFragment__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__ContextFragment__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__ContextFragment__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__ContextFragment__Group__0 )
            {
             before(grammarAccess.getContextFragmentAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__ContextFragment__Group__0 )
            // InternalMyDsl.g:119:4: rule__ContextFragment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextFragment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextFragmentAccess().getGroup()); 

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
    // $ANTLR end "ruleContextFragment"


    // $ANTLR start "entryRuleChangeType"
    // InternalMyDsl.g:128:1: entryRuleChangeType : ruleChangeType EOF ;
    public final void entryRuleChangeType() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleChangeType EOF )
            // InternalMyDsl.g:130:1: ruleChangeType EOF
            {
             before(grammarAccess.getChangeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleChangeType();

            state._fsp--;

             after(grammarAccess.getChangeTypeRule()); 
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
    // $ANTLR end "entryRuleChangeType"


    // $ANTLR start "ruleChangeType"
    // InternalMyDsl.g:137:1: ruleChangeType : ( ( rule__ChangeType__Alternatives ) ) ;
    public final void ruleChangeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__ChangeType__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__ChangeType__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__ChangeType__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__ChangeType__Alternatives )
            {
             before(grammarAccess.getChangeTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__ChangeType__Alternatives )
            // InternalMyDsl.g:144:4: rule__ChangeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChangeTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleChangeType"


    // $ANTLR start "entryRuleContextChange"
    // InternalMyDsl.g:153:1: entryRuleContextChange : ruleContextChange EOF ;
    public final void entryRuleContextChange() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleContextChange EOF )
            // InternalMyDsl.g:155:1: ruleContextChange EOF
            {
             before(grammarAccess.getContextChangeRule()); 
            pushFollow(FOLLOW_1);
            ruleContextChange();

            state._fsp--;

             after(grammarAccess.getContextChangeRule()); 
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
    // $ANTLR end "entryRuleContextChange"


    // $ANTLR start "ruleContextChange"
    // InternalMyDsl.g:162:1: ruleContextChange : ( ( rule__ContextChange__Group__0 ) ) ;
    public final void ruleContextChange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__ContextChange__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__ContextChange__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__ContextChange__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__ContextChange__Group__0 )
            {
             before(grammarAccess.getContextChangeAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__ContextChange__Group__0 )
            // InternalMyDsl.g:169:4: rule__ContextChange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextChange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextChangeAccess().getGroup()); 

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
    // $ANTLR end "ruleContextChange"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAttribute EOF )
            // InternalMyDsl.g:180:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Attribute__Group__0 )
            // InternalMyDsl.g:194:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:203:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleEntity EOF )
            // InternalMyDsl.g:205:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:212:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Entity__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Entity__Group__0 )
            // InternalMyDsl.g:219:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:228:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleRelation EOF )
            // InternalMyDsl.g:230:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:237:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Relation__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Relation__Group__0 )
            // InternalMyDsl.g:244:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleScenario"
    // InternalMyDsl.g:253:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleScenario EOF )
            // InternalMyDsl.g:255:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalMyDsl.g:262:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Scenario__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Scenario__Group__0 )
            // InternalMyDsl.g:269:4: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleScenarioContent"
    // InternalMyDsl.g:278:1: entryRuleScenarioContent : ruleScenarioContent EOF ;
    public final void entryRuleScenarioContent() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleScenarioContent EOF )
            // InternalMyDsl.g:280:1: ruleScenarioContent EOF
            {
             before(grammarAccess.getScenarioContentRule()); 
            pushFollow(FOLLOW_1);
            ruleScenarioContent();

            state._fsp--;

             after(grammarAccess.getScenarioContentRule()); 
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
    // $ANTLR end "entryRuleScenarioContent"


    // $ANTLR start "ruleScenarioContent"
    // InternalMyDsl.g:287:1: ruleScenarioContent : ( ( rule__ScenarioContent__Alternatives ) ) ;
    public final void ruleScenarioContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__ScenarioContent__Alternatives ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__ScenarioContent__Alternatives ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__ScenarioContent__Alternatives ) )
            // InternalMyDsl.g:293:3: ( rule__ScenarioContent__Alternatives )
            {
             before(grammarAccess.getScenarioContentAccess().getAlternatives()); 
            // InternalMyDsl.g:294:3: ( rule__ScenarioContent__Alternatives )
            // InternalMyDsl.g:294:4: rule__ScenarioContent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioContent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScenarioContentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleScenarioContent"


    // $ANTLR start "entryRuleMessage"
    // InternalMyDsl.g:303:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleMessage EOF )
            // InternalMyDsl.g:305:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalMyDsl.g:312:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Message__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Message__Group__0 )
            // InternalMyDsl.g:319:4: rule__Message__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleContextMessage"
    // InternalMyDsl.g:328:1: entryRuleContextMessage : ruleContextMessage EOF ;
    public final void entryRuleContextMessage() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleContextMessage EOF )
            // InternalMyDsl.g:330:1: ruleContextMessage EOF
            {
             before(grammarAccess.getContextMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleContextMessage();

            state._fsp--;

             after(grammarAccess.getContextMessageRule()); 
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
    // $ANTLR end "entryRuleContextMessage"


    // $ANTLR start "ruleContextMessage"
    // InternalMyDsl.g:337:1: ruleContextMessage : ( ( rule__ContextMessage__Group__0 ) ) ;
    public final void ruleContextMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__ContextMessage__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__ContextMessage__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__ContextMessage__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__ContextMessage__Group__0 )
            {
             before(grammarAccess.getContextMessageAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__ContextMessage__Group__0 )
            // InternalMyDsl.g:344:4: rule__ContextMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextMessageAccess().getGroup()); 

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
    // $ANTLR end "ruleContextMessage"

<<<<<<< HEAD
    // $ANTLR start "entryRuleLoop"
    // InternalMyDsl.g:353:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleLoop EOF )
            // InternalMyDsl.g:355:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalMyDsl.g:362:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Loop__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Loop__Group__0 )
            // InternalMyDsl.g:369:4: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "rule__ScenarioContent__Alternatives"
    // InternalMyDsl.g:377:1: rule__ScenarioContent__Alternatives : ( ( ( rule__ScenarioContent__AltAssignment_0 ) ) | ( ( rule__ScenarioContent__MessageAssignment_1 ) ) | ( ( rule__ScenarioContent__ParAssignment_2 ) ) | ( ( rule__ScenarioContent__LoopAssignment_3 ) ) );
    public final void rule__ScenarioContent__Alternatives() throws RecognitionException {
=======
>>>>>>> Added Xtext for context dependent behavior

    // $ANTLR start "entryRuleContextMessageContent"
    // InternalMyDsl.g:353:1: entryRuleContextMessageContent : ruleContextMessageContent EOF ;
    public final void entryRuleContextMessageContent() throws RecognitionException {
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:381:1: ( ( ( rule__ScenarioContent__AltAssignment_0 ) ) | ( ( rule__ScenarioContent__MessageAssignment_1 ) ) | ( ( rule__ScenarioContent__ParAssignment_2 ) ) | ( ( rule__ScenarioContent__LoopAssignment_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 29:
                {
                alt1=3;
                }
                break;
            case 31:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:382:2: ( ( rule__ScenarioContent__AltAssignment_0 ) )
                    {
                    // InternalMyDsl.g:382:2: ( ( rule__ScenarioContent__AltAssignment_0 ) )
                    // InternalMyDsl.g:383:3: ( rule__ScenarioContent__AltAssignment_0 )
                    {
                     before(grammarAccess.getScenarioContentAccess().getAltAssignment_0()); 
                    // InternalMyDsl.g:384:3: ( rule__ScenarioContent__AltAssignment_0 )
                    // InternalMyDsl.g:384:4: rule__ScenarioContent__AltAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioContent__AltAssignment_0();

                    state._fsp--;


                    }
=======
            // InternalMyDsl.g:354:1: ( ruleObjectType EOF )
            // InternalMyDsl.g:355:1: ruleObjectType EOF
=======
            // InternalMyDsl.g:354:1: ( ruleContextMessageContent EOF )
            // InternalMyDsl.g:355:1: ruleContextMessageContent EOF
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getContextMessageContentRule()); 
            pushFollow(FOLLOW_1);
<<<<<<< HEAD
            ruleObjectType();
>>>>>>> Added Xtext for context dependent behavior
=======
            ruleContextMessageContent();
>>>>>>> [xText] Added new message type: contextMessage

            state._fsp--;

             after(grammarAccess.getContextMessageContentRule()); 
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
    // $ANTLR end "entryRuleContextMessageContent"


    // $ANTLR start "ruleContextMessageContent"
    // InternalMyDsl.g:362:1: ruleContextMessageContent : ( ( rule__ContextMessageContent__Alternatives ) ) ;
    public final void ruleContextMessageContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__ContextMessageContent__Alternatives ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__ContextMessageContent__Alternatives ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__ContextMessageContent__Alternatives ) )
            // InternalMyDsl.g:368:3: ( rule__ContextMessageContent__Alternatives )
            {
             before(grammarAccess.getContextMessageContentAccess().getAlternatives()); 
            // InternalMyDsl.g:369:3: ( rule__ContextMessageContent__Alternatives )
            // InternalMyDsl.g:369:4: rule__ContextMessageContent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ContextMessageContent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContextMessageContentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleContextMessageContent"


    // $ANTLR start "entryRuleMatchMessage"
    // InternalMyDsl.g:378:1: entryRuleMatchMessage : ruleMatchMessage EOF ;
    public final void entryRuleMatchMessage() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleMatchMessage EOF )
            // InternalMyDsl.g:380:1: ruleMatchMessage EOF
            {
             before(grammarAccess.getMatchMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleMatchMessage();

            state._fsp--;

             after(grammarAccess.getMatchMessageRule()); 
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
    // $ANTLR end "entryRuleMatchMessage"


    // $ANTLR start "ruleMatchMessage"
    // InternalMyDsl.g:387:1: ruleMatchMessage : ( ( rule__MatchMessage__Group__0 ) ) ;
    public final void ruleMatchMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__MatchMessage__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__MatchMessage__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__MatchMessage__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__MatchMessage__Group__0 )
            {
             before(grammarAccess.getMatchMessageAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__MatchMessage__Group__0 )
            // InternalMyDsl.g:394:4: rule__MatchMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MatchMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchMessageAccess().getGroup()); 

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
    // $ANTLR end "ruleMatchMessage"


    // $ANTLR start "entryRuleChangeMessage"
    // InternalMyDsl.g:403:1: entryRuleChangeMessage : ruleChangeMessage EOF ;
    public final void entryRuleChangeMessage() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleChangeMessage EOF )
            // InternalMyDsl.g:405:1: ruleChangeMessage EOF
            {
             before(grammarAccess.getChangeMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleChangeMessage();

            state._fsp--;

             after(grammarAccess.getChangeMessageRule()); 
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
    // $ANTLR end "entryRuleChangeMessage"


    // $ANTLR start "ruleChangeMessage"
    // InternalMyDsl.g:412:1: ruleChangeMessage : ( ( rule__ChangeMessage__Alternatives ) ) ;
    public final void ruleChangeMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__ChangeMessage__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__ChangeMessage__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__ChangeMessage__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__ChangeMessage__Alternatives )
            {
             before(grammarAccess.getChangeMessageAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__ChangeMessage__Alternatives )
            // InternalMyDsl.g:419:4: rule__ChangeMessage__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ChangeMessage__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChangeMessageAccess().getAlternatives()); 

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
    // $ANTLR end "ruleChangeMessage"


    // $ANTLR start "entryRuleAppearMessage"
    // InternalMyDsl.g:428:1: entryRuleAppearMessage : ruleAppearMessage EOF ;
    public final void entryRuleAppearMessage() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleAppearMessage EOF )
            // InternalMyDsl.g:430:1: ruleAppearMessage EOF
            {
             before(grammarAccess.getAppearMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleAppearMessage();

            state._fsp--;

             after(grammarAccess.getAppearMessageRule()); 
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
    // $ANTLR end "entryRuleAppearMessage"


    // $ANTLR start "ruleAppearMessage"
    // InternalMyDsl.g:437:1: ruleAppearMessage : ( ( rule__AppearMessage__Group__0 ) ) ;
    public final void ruleAppearMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__AppearMessage__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__AppearMessage__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__AppearMessage__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__AppearMessage__Group__0 )
            {
             before(grammarAccess.getAppearMessageAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__AppearMessage__Group__0 )
            // InternalMyDsl.g:444:4: rule__AppearMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AppearMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppearMessageAccess().getGroup()); 

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
    // $ANTLR end "ruleAppearMessage"


    // $ANTLR start "entryRuleDisappearMessage"
    // InternalMyDsl.g:453:1: entryRuleDisappearMessage : ruleDisappearMessage EOF ;
    public final void entryRuleDisappearMessage() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleDisappearMessage EOF )
            // InternalMyDsl.g:455:1: ruleDisappearMessage EOF
            {
             before(grammarAccess.getDisappearMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleDisappearMessage();

            state._fsp--;

             after(grammarAccess.getDisappearMessageRule()); 
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
    // $ANTLR end "entryRuleDisappearMessage"


    // $ANTLR start "ruleDisappearMessage"
    // InternalMyDsl.g:462:1: ruleDisappearMessage : ( ( rule__DisappearMessage__Group__0 ) ) ;
    public final void ruleDisappearMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__DisappearMessage__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__DisappearMessage__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__DisappearMessage__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__DisappearMessage__Group__0 )
            {
             before(grammarAccess.getDisappearMessageAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__DisappearMessage__Group__0 )
            // InternalMyDsl.g:469:4: rule__DisappearMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DisappearMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisappearMessageAccess().getGroup()); 

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
    // $ANTLR end "ruleDisappearMessage"


    // $ANTLR start "entryRuleDistanceMessage"
    // InternalMyDsl.g:478:1: entryRuleDistanceMessage : ruleDistanceMessage EOF ;
    public final void entryRuleDistanceMessage() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleDistanceMessage EOF )
            // InternalMyDsl.g:480:1: ruleDistanceMessage EOF
            {
             before(grammarAccess.getDistanceMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleDistanceMessage();

            state._fsp--;

             after(grammarAccess.getDistanceMessageRule()); 
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
    // $ANTLR end "entryRuleDistanceMessage"


    // $ANTLR start "ruleDistanceMessage"
    // InternalMyDsl.g:487:1: ruleDistanceMessage : ( ( rule__DistanceMessage__Group__0 ) ) ;
    public final void ruleDistanceMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__DistanceMessage__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__DistanceMessage__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__DistanceMessage__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__DistanceMessage__Group__0 )
            {
             before(grammarAccess.getDistanceMessageAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__DistanceMessage__Group__0 )
            // InternalMyDsl.g:494:4: rule__DistanceMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DistanceMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceMessageAccess().getGroup()); 

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
    // $ANTLR end "ruleDistanceMessage"


    // $ANTLR start "entryRuleName"
    // InternalMyDsl.g:503:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleName EOF )
            // InternalMyDsl.g:505:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalMyDsl.g:512:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Name__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Name__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Name__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Name__Group__0 )
            // InternalMyDsl.g:519:4: rule__Name__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getGroup()); 

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleObjectType"
    // InternalMyDsl.g:528:1: entryRuleObjectType : ruleObjectType EOF ;
    public final void entryRuleObjectType() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleObjectType EOF )
            // InternalMyDsl.g:530:1: ruleObjectType EOF
            {
             before(grammarAccess.getObjectTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectType();

            state._fsp--;

             after(grammarAccess.getObjectTypeRule()); 
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
    // $ANTLR end "entryRuleObjectType"


    // $ANTLR start "ruleObjectType"
    // InternalMyDsl.g:537:1: ruleObjectType : ( ( rule__ObjectType__Group__0 ) ) ;
    public final void ruleObjectType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__ObjectType__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__ObjectType__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__ObjectType__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__ObjectType__Group__0 )
            {
             before(grammarAccess.getObjectTypeAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__ObjectType__Group__0 )
            // InternalMyDsl.g:544:4: rule__ObjectType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectType"


    // $ANTLR start "entryRuleObject"
    // InternalMyDsl.g:553:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleObject EOF )
            // InternalMyDsl.g:555:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalMyDsl.g:562:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Object__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__Object__Group__0 )
            // InternalMyDsl.g:569:4: rule__Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleConstraint"
    // InternalMyDsl.g:578:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleConstraint EOF )
            // InternalMyDsl.g:580:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalMyDsl.g:587:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Constraint__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Constraint__Group__0 )
            // InternalMyDsl.g:594:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleAlt"
    // InternalMyDsl.g:603:1: entryRuleAlt : ruleAlt EOF ;
    public final void entryRuleAlt() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleAlt EOF )
            // InternalMyDsl.g:605:1: ruleAlt EOF
            {
             before(grammarAccess.getAltRule()); 
            pushFollow(FOLLOW_1);
            ruleAlt();

            state._fsp--;

             after(grammarAccess.getAltRule()); 
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
    // $ANTLR end "entryRuleAlt"


    // $ANTLR start "ruleAlt"
    // InternalMyDsl.g:612:1: ruleAlt : ( ( rule__Alt__Group__0 ) ) ;
    public final void ruleAlt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Alt__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Alt__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Alt__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__Alt__Group__0 )
            {
             before(grammarAccess.getAltAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__Alt__Group__0 )
            // InternalMyDsl.g:619:4: rule__Alt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAltAccess().getGroup()); 

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
    // $ANTLR end "ruleAlt"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:628:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleExpression EOF )
            // InternalMyDsl.g:630:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:637:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Expression__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__Expression__Group__0 )
            // InternalMyDsl.g:644:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePar"
    // InternalMyDsl.g:653:1: entryRulePar : rulePar EOF ;
    public final void entryRulePar() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( rulePar EOF )
            // InternalMyDsl.g:655:1: rulePar EOF
            {
             before(grammarAccess.getParRule()); 
            pushFollow(FOLLOW_1);
            rulePar();

            state._fsp--;

             after(grammarAccess.getParRule()); 
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
    // $ANTLR end "entryRulePar"


    // $ANTLR start "rulePar"
    // InternalMyDsl.g:662:1: rulePar : ( ( rule__Par__Group__0 ) ) ;
    public final void rulePar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__Par__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__Par__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__Par__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__Par__Group__0 )
            {
             before(grammarAccess.getParAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__Par__Group__0 )
            // InternalMyDsl.g:669:4: rule__Par__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Par__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParAccess().getGroup()); 

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
    // $ANTLR end "rulePar"


    // $ANTLR start "entryRuleParExpression"
    // InternalMyDsl.g:678:1: entryRuleParExpression : ruleParExpression EOF ;
    public final void entryRuleParExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleParExpression EOF )
            // InternalMyDsl.g:680:1: ruleParExpression EOF
            {
             before(grammarAccess.getParExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleParExpression();

            state._fsp--;

             after(grammarAccess.getParExpressionRule()); 
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
    // $ANTLR end "entryRuleParExpression"


    // $ANTLR start "ruleParExpression"
    // InternalMyDsl.g:687:1: ruleParExpression : ( ( rule__ParExpression__Group__0 ) ) ;
    public final void ruleParExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__ParExpression__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__ParExpression__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__ParExpression__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__ParExpression__Group__0 )
            {
             before(grammarAccess.getParExpressionAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__ParExpression__Group__0 )
            // InternalMyDsl.g:694:4: rule__ParExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleParExpression"


    // $ANTLR start "rule__ChangeType__Alternatives"
    // InternalMyDsl.g:702:1: rule__ChangeType__Alternatives : ( ( ( rule__ChangeType__Group_0__0 ) ) | ( ( rule__ChangeType__Group_1__0 ) ) | ( ( rule__ChangeType__Group_2__0 ) ) | ( ( rule__ChangeType__Group_3__0 ) ) );
    public final void rule__ChangeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( ( ( rule__ChangeType__Group_0__0 ) ) | ( ( rule__ChangeType__Group_1__0 ) ) | ( ( rule__ChangeType__Group_2__0 ) ) | ( ( rule__ChangeType__Group_3__0 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 22:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:707:2: ( ( rule__ChangeType__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:707:2: ( ( rule__ChangeType__Group_0__0 ) )
                    // InternalMyDsl.g:708:3: ( rule__ChangeType__Group_0__0 )
                    {
                     before(grammarAccess.getChangeTypeAccess().getGroup_0()); 
                    // InternalMyDsl.g:709:3: ( rule__ChangeType__Group_0__0 )
                    // InternalMyDsl.g:709:4: rule__ChangeType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChangeTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:713:2: ( ( rule__ChangeType__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:713:2: ( ( rule__ChangeType__Group_1__0 ) )
                    // InternalMyDsl.g:714:3: ( rule__ChangeType__Group_1__0 )
                    {
                     before(grammarAccess.getChangeTypeAccess().getGroup_1()); 
                    // InternalMyDsl.g:715:3: ( rule__ChangeType__Group_1__0 )
                    // InternalMyDsl.g:715:4: rule__ChangeType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChangeTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:719:2: ( ( rule__ChangeType__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:719:2: ( ( rule__ChangeType__Group_2__0 ) )
                    // InternalMyDsl.g:720:3: ( rule__ChangeType__Group_2__0 )
                    {
                     before(grammarAccess.getChangeTypeAccess().getGroup_2()); 
                    // InternalMyDsl.g:721:3: ( rule__ChangeType__Group_2__0 )
                    // InternalMyDsl.g:721:4: rule__ChangeType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChangeTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:725:2: ( ( rule__ChangeType__Group_3__0 ) )
                    {
                    // InternalMyDsl.g:725:2: ( ( rule__ChangeType__Group_3__0 ) )
                    // InternalMyDsl.g:726:3: ( rule__ChangeType__Group_3__0 )
                    {
                     before(grammarAccess.getChangeTypeAccess().getGroup_3()); 
                    // InternalMyDsl.g:727:3: ( rule__ChangeType__Group_3__0 )
                    // InternalMyDsl.g:727:4: rule__ChangeType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeType__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChangeTypeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ChangeType__Alternatives"


    // $ANTLR start "rule__ScenarioContent__Alternatives"
    // InternalMyDsl.g:735:1: rule__ScenarioContent__Alternatives : ( ( ( rule__ScenarioContent__AltAssignment_0 ) ) | ( ( rule__ScenarioContent__MessageAssignment_1 ) ) | ( ( rule__ScenarioContent__ParAssignment_2 ) ) | ( ( rule__ScenarioContent__ContextmessageAssignment_3 ) ) );
    public final void rule__ScenarioContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:739:1: ( ( ( rule__ScenarioContent__AltAssignment_0 ) ) | ( ( rule__ScenarioContent__MessageAssignment_1 ) ) | ( ( rule__ScenarioContent__ParAssignment_2 ) ) | ( ( rule__ScenarioContent__ContextmessageAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            case 17:
            case 20:
            case 31:
            case 32:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:740:2: ( ( rule__ScenarioContent__AltAssignment_0 ) )
                    {
                    // InternalMyDsl.g:740:2: ( ( rule__ScenarioContent__AltAssignment_0 ) )
                    // InternalMyDsl.g:741:3: ( rule__ScenarioContent__AltAssignment_0 )
                    {
                     before(grammarAccess.getScenarioContentAccess().getAltAssignment_0()); 
                    // InternalMyDsl.g:742:3: ( rule__ScenarioContent__AltAssignment_0 )
                    // InternalMyDsl.g:742:4: rule__ScenarioContent__AltAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioContent__AltAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioContentAccess().getAltAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:746:2: ( ( rule__ScenarioContent__MessageAssignment_1 ) )
                    {
                    // InternalMyDsl.g:746:2: ( ( rule__ScenarioContent__MessageAssignment_1 ) )
                    // InternalMyDsl.g:747:3: ( rule__ScenarioContent__MessageAssignment_1 )
                    {
                     before(grammarAccess.getScenarioContentAccess().getMessageAssignment_1()); 
                    // InternalMyDsl.g:748:3: ( rule__ScenarioContent__MessageAssignment_1 )
                    // InternalMyDsl.g:748:4: rule__ScenarioContent__MessageAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioContent__MessageAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioContentAccess().getMessageAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:752:2: ( ( rule__ScenarioContent__ParAssignment_2 ) )
                    {
                    // InternalMyDsl.g:752:2: ( ( rule__ScenarioContent__ParAssignment_2 ) )
                    // InternalMyDsl.g:753:3: ( rule__ScenarioContent__ParAssignment_2 )
                    {
                     before(grammarAccess.getScenarioContentAccess().getParAssignment_2()); 
                    // InternalMyDsl.g:754:3: ( rule__ScenarioContent__ParAssignment_2 )
                    // InternalMyDsl.g:754:4: rule__ScenarioContent__ParAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioContent__ParAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioContentAccess().getParAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:758:2: ( ( rule__ScenarioContent__ContextmessageAssignment_3 ) )
                    {
                    // InternalMyDsl.g:758:2: ( ( rule__ScenarioContent__ContextmessageAssignment_3 ) )
                    // InternalMyDsl.g:759:3: ( rule__ScenarioContent__ContextmessageAssignment_3 )
                    {
                     before(grammarAccess.getScenarioContentAccess().getContextmessageAssignment_3()); 
                    // InternalMyDsl.g:760:3: ( rule__ScenarioContent__ContextmessageAssignment_3 )
                    // InternalMyDsl.g:760:4: rule__ScenarioContent__ContextmessageAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioContent__ContextmessageAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioContentAccess().getContextmessageAssignment_3()); 

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
    // $ANTLR end "rule__ScenarioContent__Alternatives"


    // $ANTLR start "rule__ContextMessageContent__Alternatives"
    // InternalMyDsl.g:768:1: rule__ContextMessageContent__Alternatives : ( ( ruleMatchMessage ) | ( ruleChangeMessage ) );
    public final void rule__ContextMessageContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:772:1: ( ( ruleMatchMessage ) | ( ruleChangeMessage ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==17||LA3_0==20||LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:773:2: ( ruleMatchMessage )
                    {
                    // InternalMyDsl.g:773:2: ( ruleMatchMessage )
                    // InternalMyDsl.g:774:3: ruleMatchMessage
                    {
                     before(grammarAccess.getContextMessageContentAccess().getMatchMessageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMatchMessage();

                    state._fsp--;

                     after(grammarAccess.getContextMessageContentAccess().getMatchMessageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:779:2: ( ruleChangeMessage )
                    {
                    // InternalMyDsl.g:779:2: ( ruleChangeMessage )
                    // InternalMyDsl.g:780:3: ruleChangeMessage
                    {
                     before(grammarAccess.getContextMessageContentAccess().getChangeMessageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleChangeMessage();

                    state._fsp--;

                     after(grammarAccess.getContextMessageContentAccess().getChangeMessageParserRuleCall_1()); 

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
    // $ANTLR end "rule__ContextMessageContent__Alternatives"


    // $ANTLR start "rule__ChangeMessage__Alternatives"
    // InternalMyDsl.g:789:1: rule__ChangeMessage__Alternatives : ( ( ruleDisappearMessage ) | ( ruleAppearMessage ) | ( ruleDistanceMessage ) );
    public final void rule__ChangeMessage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:793:1: ( ( ruleDisappearMessage ) | ( ruleAppearMessage ) | ( ruleDistanceMessage ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 20:
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
                    // InternalMyDsl.g:794:2: ( ruleDisappearMessage )
                    {
                    // InternalMyDsl.g:794:2: ( ruleDisappearMessage )
                    // InternalMyDsl.g:795:3: ruleDisappearMessage
                    {
                     before(grammarAccess.getChangeMessageAccess().getDisappearMessageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDisappearMessage();

                    state._fsp--;

                     after(grammarAccess.getChangeMessageAccess().getDisappearMessageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:800:2: ( ruleAppearMessage )
                    {
                    // InternalMyDsl.g:800:2: ( ruleAppearMessage )
                    // InternalMyDsl.g:801:3: ruleAppearMessage
                    {
                     before(grammarAccess.getChangeMessageAccess().getAppearMessageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAppearMessage();

                    state._fsp--;

                     after(grammarAccess.getChangeMessageAccess().getAppearMessageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:806:2: ( ruleDistanceMessage )
                    {
                    // InternalMyDsl.g:806:2: ( ruleDistanceMessage )
                    // InternalMyDsl.g:807:3: ruleDistanceMessage
                    {
                     before(grammarAccess.getChangeMessageAccess().getDistanceMessageParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDistanceMessage();

                    state._fsp--;

                     after(grammarAccess.getChangeMessageAccess().getDistanceMessageParserRuleCall_2()); 

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
    // $ANTLR end "rule__ChangeMessage__Alternatives"


    // $ANTLR start "rule__Name__Alternatives_2"
    // InternalMyDsl.g:816:1: rule__Name__Alternatives_2 : ( ( RULE_ID ) | ( RULE_NUMBER ) );
    public final void rule__Name__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:820:1: ( ( RULE_ID ) | ( RULE_NUMBER ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_NUMBER) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:821:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:821:2: ( RULE_ID )
                    // InternalMyDsl.g:822:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_2_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:827:2: ( RULE_NUMBER )
                    {
                    // InternalMyDsl.g:827:2: ( RULE_NUMBER )
                    // InternalMyDsl.g:828:3: RULE_NUMBER
                    {
                     before(grammarAccess.getNameAccess().getNumberTerminalRuleCall_2_1()); 
                    match(input,RULE_NUMBER,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getNumberTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__Name__Alternatives_2"


    // $ANTLR start "rule__Expression__Alternatives_7"
    // InternalMyDsl.g:837:1: rule__Expression__Alternatives_7 : ( ( RULE_ID ) | ( RULE_NUMBER ) );
    public final void rule__Expression__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( ( RULE_ID ) | ( RULE_NUMBER ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_NUMBER) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:842:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:842:2: ( RULE_ID )
                    // InternalMyDsl.g:843:3: RULE_ID
                    {
                     before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_7_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:848:2: ( RULE_NUMBER )
                    {
                    // InternalMyDsl.g:848:2: ( RULE_NUMBER )
                    // InternalMyDsl.g:849:3: RULE_NUMBER
                    {
                     before(grammarAccess.getExpressionAccess().getNumberTerminalRuleCall_7_1()); 
                    match(input,RULE_NUMBER,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getNumberTerminalRuleCall_7_1()); 

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
    // $ANTLR end "rule__Expression__Alternatives_7"


    // $ANTLR start "rule__Domain__Group__0"
    // InternalMyDsl.g:858:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:862:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalMyDsl.g:863:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__1();

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
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // InternalMyDsl.g:870:1: rule__Domain__Group__0__Impl : ( 'specification' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:874:1: ( ( 'specification' ) )
            // InternalMyDsl.g:875:1: ( 'specification' )
            {
            // InternalMyDsl.g:875:1: ( 'specification' )
            // InternalMyDsl.g:876:2: 'specification'
            {
             before(grammarAccess.getDomainAccess().getSpecificationKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getSpecificationKeyword_0()); 

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
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // InternalMyDsl.g:885:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:889:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalMyDsl.g:890:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Domain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__2();

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
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // InternalMyDsl.g:897:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:901:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalMyDsl.g:902:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:902:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalMyDsl.g:903:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:904:2: ( rule__Domain__NameAssignment_1 )
            // InternalMyDsl.g:904:3: rule__Domain__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Domain__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Domain__Group__2"
    // InternalMyDsl.g:912:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalMyDsl.g:917:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Domain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__3();

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
    // $ANTLR end "rule__Domain__Group__2"


    // $ANTLR start "rule__Domain__Group__2__Impl"
    // InternalMyDsl.g:924:1: rule__Domain__Group__2__Impl : ( '{' ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( ( '{' ) )
            // InternalMyDsl.g:929:1: ( '{' )
            {
            // InternalMyDsl.g:929:1: ( '{' )
            // InternalMyDsl.g:930:2: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Domain__Group__2__Impl"


    // $ANTLR start "rule__Domain__Group__3"
    // InternalMyDsl.g:939:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:943:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // InternalMyDsl.g:944:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Domain__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__4();

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
    // $ANTLR end "rule__Domain__Group__3"


    // $ANTLR start "rule__Domain__Group__3__Impl"
    // InternalMyDsl.g:951:1: rule__Domain__Group__3__Impl : ( ( rule__Domain__ContextmodelsAssignment_3 )* ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( ( ( rule__Domain__ContextmodelsAssignment_3 )* ) )
            // InternalMyDsl.g:956:1: ( ( rule__Domain__ContextmodelsAssignment_3 )* )
            {
            // InternalMyDsl.g:956:1: ( ( rule__Domain__ContextmodelsAssignment_3 )* )
            // InternalMyDsl.g:957:2: ( rule__Domain__ContextmodelsAssignment_3 )*
            {
             before(grammarAccess.getDomainAccess().getContextmodelsAssignment_3()); 
            // InternalMyDsl.g:958:2: ( rule__Domain__ContextmodelsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:958:3: rule__Domain__ContextmodelsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Domain__ContextmodelsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getContextmodelsAssignment_3()); 

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
    // $ANTLR end "rule__Domain__Group__3__Impl"


    // $ANTLR start "rule__Domain__Group__4"
    // InternalMyDsl.g:966:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // InternalMyDsl.g:971:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Domain__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__5();

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
    // $ANTLR end "rule__Domain__Group__4"


    // $ANTLR start "rule__Domain__Group__4__Impl"
    // InternalMyDsl.g:978:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__ContextfragmentsAssignment_4 )* ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:982:1: ( ( ( rule__Domain__ContextfragmentsAssignment_4 )* ) )
            // InternalMyDsl.g:983:1: ( ( rule__Domain__ContextfragmentsAssignment_4 )* )
            {
            // InternalMyDsl.g:983:1: ( ( rule__Domain__ContextfragmentsAssignment_4 )* )
            // InternalMyDsl.g:984:2: ( rule__Domain__ContextfragmentsAssignment_4 )*
            {
             before(grammarAccess.getDomainAccess().getContextfragmentsAssignment_4()); 
            // InternalMyDsl.g:985:2: ( rule__Domain__ContextfragmentsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:985:3: rule__Domain__ContextfragmentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Domain__ContextfragmentsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getContextfragmentsAssignment_4()); 

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
    // $ANTLR end "rule__Domain__Group__4__Impl"


    // $ANTLR start "rule__Domain__Group__5"
    // InternalMyDsl.g:993:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl rule__Domain__Group__6 ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( rule__Domain__Group__5__Impl rule__Domain__Group__6 )
            // InternalMyDsl.g:998:2: rule__Domain__Group__5__Impl rule__Domain__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Domain__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__6();

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
    // $ANTLR end "rule__Domain__Group__5"


    // $ANTLR start "rule__Domain__Group__5__Impl"
    // InternalMyDsl.g:1005:1: rule__Domain__Group__5__Impl : ( ( rule__Domain__EntitiesAssignment_5 )* ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( ( ( rule__Domain__EntitiesAssignment_5 )* ) )
            // InternalMyDsl.g:1010:1: ( ( rule__Domain__EntitiesAssignment_5 )* )
            {
            // InternalMyDsl.g:1010:1: ( ( rule__Domain__EntitiesAssignment_5 )* )
            // InternalMyDsl.g:1011:2: ( rule__Domain__EntitiesAssignment_5 )*
            {
             before(grammarAccess.getDomainAccess().getEntitiesAssignment_5()); 
            // InternalMyDsl.g:1012:2: ( rule__Domain__EntitiesAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1012:3: rule__Domain__EntitiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Domain__EntitiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getEntitiesAssignment_5()); 

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
    // $ANTLR end "rule__Domain__Group__5__Impl"


    // $ANTLR start "rule__Domain__Group__6"
    // InternalMyDsl.g:1020:1: rule__Domain__Group__6 : rule__Domain__Group__6__Impl rule__Domain__Group__7 ;
    public final void rule__Domain__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1024:1: ( rule__Domain__Group__6__Impl rule__Domain__Group__7 )
            // InternalMyDsl.g:1025:2: rule__Domain__Group__6__Impl rule__Domain__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Domain__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__7();

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
    // $ANTLR end "rule__Domain__Group__6"


    // $ANTLR start "rule__Domain__Group__6__Impl"
    // InternalMyDsl.g:1032:1: rule__Domain__Group__6__Impl : ( ( rule__Domain__ContextchangesAssignment_6 )* ) ;
    public final void rule__Domain__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1036:1: ( ( ( rule__Domain__ContextchangesAssignment_6 )* ) )
            // InternalMyDsl.g:1037:1: ( ( rule__Domain__ContextchangesAssignment_6 )* )
            {
            // InternalMyDsl.g:1037:1: ( ( rule__Domain__ContextchangesAssignment_6 )* )
            // InternalMyDsl.g:1038:2: ( rule__Domain__ContextchangesAssignment_6 )*
            {
             before(grammarAccess.getDomainAccess().getContextchangesAssignment_6()); 
            // InternalMyDsl.g:1039:2: ( rule__Domain__ContextchangesAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17||(LA10_0>=20 && LA10_0<=22)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1039:3: rule__Domain__ContextchangesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Domain__ContextchangesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getContextchangesAssignment_6()); 

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
    // $ANTLR end "rule__Domain__Group__6__Impl"


    // $ANTLR start "rule__Domain__Group__7"
    // InternalMyDsl.g:1047:1: rule__Domain__Group__7 : rule__Domain__Group__7__Impl rule__Domain__Group__8 ;
    public final void rule__Domain__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( rule__Domain__Group__7__Impl rule__Domain__Group__8 )
            // InternalMyDsl.g:1052:2: rule__Domain__Group__7__Impl rule__Domain__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Domain__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__8();

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
    // $ANTLR end "rule__Domain__Group__7"


    // $ANTLR start "rule__Domain__Group__7__Impl"
    // InternalMyDsl.g:1059:1: rule__Domain__Group__7__Impl : ( ( rule__Domain__ObjectsAssignment_7 )* ) ;
    public final void rule__Domain__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1063:1: ( ( ( rule__Domain__ObjectsAssignment_7 )* ) )
            // InternalMyDsl.g:1064:1: ( ( rule__Domain__ObjectsAssignment_7 )* )
            {
            // InternalMyDsl.g:1064:1: ( ( rule__Domain__ObjectsAssignment_7 )* )
            // InternalMyDsl.g:1065:2: ( rule__Domain__ObjectsAssignment_7 )*
            {
             before(grammarAccess.getDomainAccess().getObjectsAssignment_7()); 
            // InternalMyDsl.g:1066:2: ( rule__Domain__ObjectsAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1066:3: rule__Domain__ObjectsAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Domain__ObjectsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getObjectsAssignment_7()); 

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
    // $ANTLR end "rule__Domain__Group__7__Impl"


    // $ANTLR start "rule__Domain__Group__8"
    // InternalMyDsl.g:1074:1: rule__Domain__Group__8 : rule__Domain__Group__8__Impl rule__Domain__Group__9 ;
    public final void rule__Domain__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1078:1: ( rule__Domain__Group__8__Impl rule__Domain__Group__9 )
            // InternalMyDsl.g:1079:2: rule__Domain__Group__8__Impl rule__Domain__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Domain__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__9();

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
    // $ANTLR end "rule__Domain__Group__8"


    // $ANTLR start "rule__Domain__Group__8__Impl"
    // InternalMyDsl.g:1086:1: rule__Domain__Group__8__Impl : ( ( rule__Domain__ConstraintsAssignment_8 )* ) ;
    public final void rule__Domain__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1090:1: ( ( ( rule__Domain__ConstraintsAssignment_8 )* ) )
            // InternalMyDsl.g:1091:1: ( ( rule__Domain__ConstraintsAssignment_8 )* )
            {
            // InternalMyDsl.g:1091:1: ( ( rule__Domain__ConstraintsAssignment_8 )* )
            // InternalMyDsl.g:1092:2: ( rule__Domain__ConstraintsAssignment_8 )*
            {
             before(grammarAccess.getDomainAccess().getConstraintsAssignment_8()); 
            // InternalMyDsl.g:1093:2: ( rule__Domain__ConstraintsAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1093:3: rule__Domain__ConstraintsAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Domain__ConstraintsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getConstraintsAssignment_8()); 

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
    // $ANTLR end "rule__Domain__Group__8__Impl"


    // $ANTLR start "rule__Domain__Group__9"
    // InternalMyDsl.g:1101:1: rule__Domain__Group__9 : rule__Domain__Group__9__Impl rule__Domain__Group__10 ;
    public final void rule__Domain__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( rule__Domain__Group__9__Impl rule__Domain__Group__10 )
            // InternalMyDsl.g:1106:2: rule__Domain__Group__9__Impl rule__Domain__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__Domain__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__10();

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
    // $ANTLR end "rule__Domain__Group__9"


    // $ANTLR start "rule__Domain__Group__9__Impl"
    // InternalMyDsl.g:1113:1: rule__Domain__Group__9__Impl : ( ( rule__Domain__ScenariosAssignment_9 )* ) ;
    public final void rule__Domain__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( ( ( rule__Domain__ScenariosAssignment_9 )* ) )
            // InternalMyDsl.g:1118:1: ( ( rule__Domain__ScenariosAssignment_9 )* )
            {
            // InternalMyDsl.g:1118:1: ( ( rule__Domain__ScenariosAssignment_9 )* )
            // InternalMyDsl.g:1119:2: ( rule__Domain__ScenariosAssignment_9 )*
            {
             before(grammarAccess.getDomainAccess().getScenariosAssignment_9()); 
            // InternalMyDsl.g:1120:2: ( rule__Domain__ScenariosAssignment_9 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1120:3: rule__Domain__ScenariosAssignment_9
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Domain__ScenariosAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getScenariosAssignment_9()); 

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
    // $ANTLR end "rule__Domain__Group__9__Impl"


    // $ANTLR start "rule__Domain__Group__10"
    // InternalMyDsl.g:1128:1: rule__Domain__Group__10 : rule__Domain__Group__10__Impl ;
    public final void rule__Domain__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( rule__Domain__Group__10__Impl )
            // InternalMyDsl.g:1133:2: rule__Domain__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__10__Impl();

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
    // $ANTLR end "rule__Domain__Group__10"


    // $ANTLR start "rule__Domain__Group__10__Impl"
    // InternalMyDsl.g:1139:1: rule__Domain__Group__10__Impl : ( '}' ) ;
    public final void rule__Domain__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1143:1: ( ( '}' ) )
            // InternalMyDsl.g:1144:1: ( '}' )
            {
            // InternalMyDsl.g:1144:1: ( '}' )
            // InternalMyDsl.g:1145:2: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_10()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Domain__Group__10__Impl"


    // $ANTLR start "rule__ContextModel__Group__0"
    // InternalMyDsl.g:1155:1: rule__ContextModel__Group__0 : rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1 ;
    public final void rule__ContextModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1159:1: ( rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1 )
            // InternalMyDsl.g:1160:2: rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ContextModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__1();

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
    // $ANTLR end "rule__ContextModel__Group__0"


    // $ANTLR start "rule__ContextModel__Group__0__Impl"
    // InternalMyDsl.g:1167:1: rule__ContextModel__Group__0__Impl : ( 'contextmodel' ) ;
    public final void rule__ContextModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( ( 'contextmodel' ) )
            // InternalMyDsl.g:1172:1: ( 'contextmodel' )
            {
            // InternalMyDsl.g:1172:1: ( 'contextmodel' )
            // InternalMyDsl.g:1173:2: 'contextmodel'
            {
             before(grammarAccess.getContextModelAccess().getContextmodelKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getContextModelAccess().getContextmodelKeyword_0()); 

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
    // $ANTLR end "rule__ContextModel__Group__0__Impl"


    // $ANTLR start "rule__ContextModel__Group__1"
    // InternalMyDsl.g:1182:1: rule__ContextModel__Group__1 : rule__ContextModel__Group__1__Impl rule__ContextModel__Group__2 ;
    public final void rule__ContextModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( rule__ContextModel__Group__1__Impl rule__ContextModel__Group__2 )
            // InternalMyDsl.g:1187:2: rule__ContextModel__Group__1__Impl rule__ContextModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ContextModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__2();

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
    // $ANTLR end "rule__ContextModel__Group__1"


    // $ANTLR start "rule__ContextModel__Group__1__Impl"
    // InternalMyDsl.g:1194:1: rule__ContextModel__Group__1__Impl : ( ( rule__ContextModel__NameAssignment_1 ) ) ;
    public final void rule__ContextModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( ( ( rule__ContextModel__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1199:1: ( ( rule__ContextModel__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1199:1: ( ( rule__ContextModel__NameAssignment_1 ) )
            // InternalMyDsl.g:1200:2: ( rule__ContextModel__NameAssignment_1 )
            {
             before(grammarAccess.getContextModelAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1201:2: ( rule__ContextModel__NameAssignment_1 )
            // InternalMyDsl.g:1201:3: rule__ContextModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ContextModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ContextModel__Group__1__Impl"


    // $ANTLR start "rule__ContextModel__Group__2"
    // InternalMyDsl.g:1209:1: rule__ContextModel__Group__2 : rule__ContextModel__Group__2__Impl rule__ContextModel__Group__3 ;
    public final void rule__ContextModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1213:1: ( rule__ContextModel__Group__2__Impl rule__ContextModel__Group__3 )
            // InternalMyDsl.g:1214:2: rule__ContextModel__Group__2__Impl rule__ContextModel__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ContextModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__3();

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
    // $ANTLR end "rule__ContextModel__Group__2"


    // $ANTLR start "rule__ContextModel__Group__2__Impl"
    // InternalMyDsl.g:1221:1: rule__ContextModel__Group__2__Impl : ( '{' ) ;
    public final void rule__ContextModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1225:1: ( ( '{' ) )
            // InternalMyDsl.g:1226:1: ( '{' )
            {
            // InternalMyDsl.g:1226:1: ( '{' )
            // InternalMyDsl.g:1227:2: '{'
            {
             before(grammarAccess.getContextModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getContextModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ContextModel__Group__2__Impl"


    // $ANTLR start "rule__ContextModel__Group__3"
    // InternalMyDsl.g:1236:1: rule__ContextModel__Group__3 : rule__ContextModel__Group__3__Impl rule__ContextModel__Group__4 ;
    public final void rule__ContextModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( rule__ContextModel__Group__3__Impl rule__ContextModel__Group__4 )
            // InternalMyDsl.g:1241:2: rule__ContextModel__Group__3__Impl rule__ContextModel__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ContextModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__4();

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
    // $ANTLR end "rule__ContextModel__Group__3"


    // $ANTLR start "rule__ContextModel__Group__3__Impl"
    // InternalMyDsl.g:1248:1: rule__ContextModel__Group__3__Impl : ( ( rule__ContextModel__EntitiesAssignment_3 )* ) ;
    public final void rule__ContextModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1252:1: ( ( ( rule__ContextModel__EntitiesAssignment_3 )* ) )
            // InternalMyDsl.g:1253:1: ( ( rule__ContextModel__EntitiesAssignment_3 )* )
            {
            // InternalMyDsl.g:1253:1: ( ( rule__ContextModel__EntitiesAssignment_3 )* )
            // InternalMyDsl.g:1254:2: ( rule__ContextModel__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getContextModelAccess().getEntitiesAssignment_3()); 
            // InternalMyDsl.g:1255:2: ( rule__ContextModel__EntitiesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1255:3: rule__ContextModel__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ContextModel__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getContextModelAccess().getEntitiesAssignment_3()); 

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
    // $ANTLR end "rule__ContextModel__Group__3__Impl"


    // $ANTLR start "rule__ContextModel__Group__4"
    // InternalMyDsl.g:1263:1: rule__ContextModel__Group__4 : rule__ContextModel__Group__4__Impl rule__ContextModel__Group__5 ;
    public final void rule__ContextModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1267:1: ( rule__ContextModel__Group__4__Impl rule__ContextModel__Group__5 )
            // InternalMyDsl.g:1268:2: rule__ContextModel__Group__4__Impl rule__ContextModel__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__ContextModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__5();

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
    // $ANTLR end "rule__ContextModel__Group__4"


    // $ANTLR start "rule__ContextModel__Group__4__Impl"
    // InternalMyDsl.g:1275:1: rule__ContextModel__Group__4__Impl : ( ( rule__ContextModel__RelationsAssignment_4 )* ) ;
    public final void rule__ContextModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1279:1: ( ( ( rule__ContextModel__RelationsAssignment_4 )* ) )
            // InternalMyDsl.g:1280:1: ( ( rule__ContextModel__RelationsAssignment_4 )* )
            {
            // InternalMyDsl.g:1280:1: ( ( rule__ContextModel__RelationsAssignment_4 )* )
            // InternalMyDsl.g:1281:2: ( rule__ContextModel__RelationsAssignment_4 )*
            {
             before(grammarAccess.getContextModelAccess().getRelationsAssignment_4()); 
            // InternalMyDsl.g:1282:2: ( rule__ContextModel__RelationsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1282:3: rule__ContextModel__RelationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ContextModel__RelationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getContextModelAccess().getRelationsAssignment_4()); 

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
    // $ANTLR end "rule__ContextModel__Group__4__Impl"


    // $ANTLR start "rule__ContextModel__Group__5"
    // InternalMyDsl.g:1290:1: rule__ContextModel__Group__5 : rule__ContextModel__Group__5__Impl ;
    public final void rule__ContextModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( rule__ContextModel__Group__5__Impl )
            // InternalMyDsl.g:1295:2: rule__ContextModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__5__Impl();

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
    // $ANTLR end "rule__ContextModel__Group__5"


    // $ANTLR start "rule__ContextModel__Group__5__Impl"
    // InternalMyDsl.g:1301:1: rule__ContextModel__Group__5__Impl : ( '}' ) ;
    public final void rule__ContextModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1305:1: ( ( '}' ) )
            // InternalMyDsl.g:1306:1: ( '}' )
            {
            // InternalMyDsl.g:1306:1: ( '}' )
            // InternalMyDsl.g:1307:2: '}'
            {
             before(grammarAccess.getContextModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContextModelAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ContextModel__Group__5__Impl"


    // $ANTLR start "rule__ContextFragment__Group__0"
    // InternalMyDsl.g:1317:1: rule__ContextFragment__Group__0 : rule__ContextFragment__Group__0__Impl rule__ContextFragment__Group__1 ;
    public final void rule__ContextFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1321:1: ( rule__ContextFragment__Group__0__Impl rule__ContextFragment__Group__1 )
            // InternalMyDsl.g:1322:2: rule__ContextFragment__Group__0__Impl rule__ContextFragment__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ContextFragment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextFragment__Group__1();

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
    // $ANTLR end "rule__ContextFragment__Group__0"


    // $ANTLR start "rule__ContextFragment__Group__0__Impl"
    // InternalMyDsl.g:1329:1: rule__ContextFragment__Group__0__Impl : ( 'contextfragment' ) ;
    public final void rule__ContextFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1333:1: ( ( 'contextfragment' ) )
            // InternalMyDsl.g:1334:1: ( 'contextfragment' )
            {
            // InternalMyDsl.g:1334:1: ( 'contextfragment' )
            // InternalMyDsl.g:1335:2: 'contextfragment'
            {
             before(grammarAccess.getContextFragmentAccess().getContextfragmentKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getContextFragmentAccess().getContextfragmentKeyword_0()); 

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
    // $ANTLR end "rule__ContextFragment__Group__0__Impl"


    // $ANTLR start "rule__ContextFragment__Group__1"
    // InternalMyDsl.g:1344:1: rule__ContextFragment__Group__1 : rule__ContextFragment__Group__1__Impl rule__ContextFragment__Group__2 ;
    public final void rule__ContextFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( rule__ContextFragment__Group__1__Impl rule__ContextFragment__Group__2 )
            // InternalMyDsl.g:1349:2: rule__ContextFragment__Group__1__Impl rule__ContextFragment__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ContextFragment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextFragment__Group__2();

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
    // $ANTLR end "rule__ContextFragment__Group__1"


    // $ANTLR start "rule__ContextFragment__Group__1__Impl"
    // InternalMyDsl.g:1356:1: rule__ContextFragment__Group__1__Impl : ( ( rule__ContextFragment__NameAssignment_1 ) ) ;
    public final void rule__ContextFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1360:1: ( ( ( rule__ContextFragment__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1361:1: ( ( rule__ContextFragment__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1361:1: ( ( rule__ContextFragment__NameAssignment_1 ) )
            // InternalMyDsl.g:1362:2: ( rule__ContextFragment__NameAssignment_1 )
            {
             before(grammarAccess.getContextFragmentAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1363:2: ( rule__ContextFragment__NameAssignment_1 )
            // InternalMyDsl.g:1363:3: rule__ContextFragment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ContextFragment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextFragmentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ContextFragment__Group__1__Impl"


    // $ANTLR start "rule__ContextFragment__Group__2"
    // InternalMyDsl.g:1371:1: rule__ContextFragment__Group__2 : rule__ContextFragment__Group__2__Impl rule__ContextFragment__Group__3 ;
    public final void rule__ContextFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( rule__ContextFragment__Group__2__Impl rule__ContextFragment__Group__3 )
            // InternalMyDsl.g:1376:2: rule__ContextFragment__Group__2__Impl rule__ContextFragment__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ContextFragment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextFragment__Group__3();

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
    // $ANTLR end "rule__ContextFragment__Group__2"


    // $ANTLR start "rule__ContextFragment__Group__2__Impl"
    // InternalMyDsl.g:1383:1: rule__ContextFragment__Group__2__Impl : ( '{' ) ;
    public final void rule__ContextFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1387:1: ( ( '{' ) )
            // InternalMyDsl.g:1388:1: ( '{' )
            {
            // InternalMyDsl.g:1388:1: ( '{' )
            // InternalMyDsl.g:1389:2: '{'
            {
             before(grammarAccess.getContextFragmentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getContextFragmentAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ContextFragment__Group__2__Impl"


    // $ANTLR start "rule__ContextFragment__Group__3"
    // InternalMyDsl.g:1398:1: rule__ContextFragment__Group__3 : rule__ContextFragment__Group__3__Impl rule__ContextFragment__Group__4 ;
    public final void rule__ContextFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1402:1: ( rule__ContextFragment__Group__3__Impl rule__ContextFragment__Group__4 )
            // InternalMyDsl.g:1403:2: rule__ContextFragment__Group__3__Impl rule__ContextFragment__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ContextFragment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextFragment__Group__4();

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
    // $ANTLR end "rule__ContextFragment__Group__3"


    // $ANTLR start "rule__ContextFragment__Group__3__Impl"
    // InternalMyDsl.g:1410:1: rule__ContextFragment__Group__3__Impl : ( ( rule__ContextFragment__EntitiesAssignment_3 )* ) ;
    public final void rule__ContextFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1414:1: ( ( ( rule__ContextFragment__EntitiesAssignment_3 )* ) )
            // InternalMyDsl.g:1415:1: ( ( rule__ContextFragment__EntitiesAssignment_3 )* )
            {
            // InternalMyDsl.g:1415:1: ( ( rule__ContextFragment__EntitiesAssignment_3 )* )
            // InternalMyDsl.g:1416:2: ( rule__ContextFragment__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getContextFragmentAccess().getEntitiesAssignment_3()); 
            // InternalMyDsl.g:1417:2: ( rule__ContextFragment__EntitiesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1417:3: rule__ContextFragment__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ContextFragment__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getContextFragmentAccess().getEntitiesAssignment_3()); 

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
    // $ANTLR end "rule__ContextFragment__Group__3__Impl"


    // $ANTLR start "rule__ContextFragment__Group__4"
    // InternalMyDsl.g:1425:1: rule__ContextFragment__Group__4 : rule__ContextFragment__Group__4__Impl rule__ContextFragment__Group__5 ;
    public final void rule__ContextFragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1429:1: ( rule__ContextFragment__Group__4__Impl rule__ContextFragment__Group__5 )
            // InternalMyDsl.g:1430:2: rule__ContextFragment__Group__4__Impl rule__ContextFragment__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__ContextFragment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextFragment__Group__5();

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
    // $ANTLR end "rule__ContextFragment__Group__4"


    // $ANTLR start "rule__ContextFragment__Group__4__Impl"
    // InternalMyDsl.g:1437:1: rule__ContextFragment__Group__4__Impl : ( ( rule__ContextFragment__RelationsAssignment_4 )* ) ;
    public final void rule__ContextFragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1441:1: ( ( ( rule__ContextFragment__RelationsAssignment_4 )* ) )
            // InternalMyDsl.g:1442:1: ( ( rule__ContextFragment__RelationsAssignment_4 )* )
            {
            // InternalMyDsl.g:1442:1: ( ( rule__ContextFragment__RelationsAssignment_4 )* )
            // InternalMyDsl.g:1443:2: ( rule__ContextFragment__RelationsAssignment_4 )*
            {
             before(grammarAccess.getContextFragmentAccess().getRelationsAssignment_4()); 
            // InternalMyDsl.g:1444:2: ( rule__ContextFragment__RelationsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1444:3: rule__ContextFragment__RelationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ContextFragment__RelationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getContextFragmentAccess().getRelationsAssignment_4()); 

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
    // $ANTLR end "rule__ContextFragment__Group__4__Impl"


    // $ANTLR start "rule__ContextFragment__Group__5"
    // InternalMyDsl.g:1452:1: rule__ContextFragment__Group__5 : rule__ContextFragment__Group__5__Impl ;
    public final void rule__ContextFragment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( rule__ContextFragment__Group__5__Impl )
            // InternalMyDsl.g:1457:2: rule__ContextFragment__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextFragment__Group__5__Impl();

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
    // $ANTLR end "rule__ContextFragment__Group__5"


    // $ANTLR start "rule__ContextFragment__Group__5__Impl"
    // InternalMyDsl.g:1463:1: rule__ContextFragment__Group__5__Impl : ( '}' ) ;
    public final void rule__ContextFragment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1467:1: ( ( '}' ) )
            // InternalMyDsl.g:1468:1: ( '}' )
            {
            // InternalMyDsl.g:1468:1: ( '}' )
            // InternalMyDsl.g:1469:2: '}'
            {
             before(grammarAccess.getContextFragmentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContextFragmentAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ContextFragment__Group__5__Impl"


    // $ANTLR start "rule__ChangeType__Group_0__0"
    // InternalMyDsl.g:1479:1: rule__ChangeType__Group_0__0 : rule__ChangeType__Group_0__0__Impl rule__ChangeType__Group_0__1 ;
    public final void rule__ChangeType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( rule__ChangeType__Group_0__0__Impl rule__ChangeType__Group_0__1 )
            // InternalMyDsl.g:1484:2: rule__ChangeType__Group_0__0__Impl rule__ChangeType__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__ChangeType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeType__Group_0__1();

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
    // $ANTLR end "rule__ChangeType__Group_0__0"


    // $ANTLR start "rule__ChangeType__Group_0__0__Impl"
    // InternalMyDsl.g:1491:1: rule__ChangeType__Group_0__0__Impl : ( 'appear' ) ;
    public final void rule__ChangeType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1495:1: ( ( 'appear' ) )
            // InternalMyDsl.g:1496:1: ( 'appear' )
            {
            // InternalMyDsl.g:1496:1: ( 'appear' )
            // InternalMyDsl.g:1497:2: 'appear'
            {
             before(grammarAccess.getChangeTypeAccess().getAppearKeyword_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getAppearKeyword_0_0()); 

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
    // $ANTLR end "rule__ChangeType__Group_0__0__Impl"


    // $ANTLR start "rule__ChangeType__Group_0__1"
    // InternalMyDsl.g:1506:1: rule__ChangeType__Group_0__1 : rule__ChangeType__Group_0__1__Impl rule__ChangeType__Group_0__2 ;
    public final void rule__ChangeType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( rule__ChangeType__Group_0__1__Impl rule__ChangeType__Group_0__2 )
            // InternalMyDsl.g:1511:2: rule__ChangeType__Group_0__1__Impl rule__ChangeType__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__ChangeType__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeType__Group_0__2();

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
    // $ANTLR end "rule__ChangeType__Group_0__1"


    // $ANTLR start "rule__ChangeType__Group_0__1__Impl"
    // InternalMyDsl.g:1518:1: rule__ChangeType__Group_0__1__Impl : ( '(' ) ;
    public final void rule__ChangeType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1522:1: ( ( '(' ) )
            // InternalMyDsl.g:1523:1: ( '(' )
            {
            // InternalMyDsl.g:1523:1: ( '(' )
            // InternalMyDsl.g:1524:2: '('
            {
             before(grammarAccess.getChangeTypeAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getLeftParenthesisKeyword_0_1()); 

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
    // $ANTLR end "rule__ChangeType__Group_0__1__Impl"


    // $ANTLR start "rule__ChangeType__Group_0__2"
    // InternalMyDsl.g:1533:1: rule__ChangeType__Group_0__2 : rule__ChangeType__Group_0__2__Impl rule__ChangeType__Group_0__3 ;
    public final void rule__ChangeType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1537:1: ( rule__ChangeType__Group_0__2__Impl rule__ChangeType__Group_0__3 )
            // InternalMyDsl.g:1538:2: rule__ChangeType__Group_0__2__Impl rule__ChangeType__Group_0__3
            {
            pushFollow(FOLLOW_16);
            rule__ChangeType__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeType__Group_0__3();

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
    // $ANTLR end "rule__ChangeType__Group_0__2"


    // $ANTLR start "rule__ChangeType__Group_0__2__Impl"
    // InternalMyDsl.g:1545:1: rule__ChangeType__Group_0__2__Impl : ( ( rule__ChangeType__EntityAssignment_0_2 ) ) ;
    public final void rule__ChangeType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( ( ( rule__ChangeType__EntityAssignment_0_2 ) ) )
            // InternalMyDsl.g:1550:1: ( ( rule__ChangeType__EntityAssignment_0_2 ) )
            {
            // InternalMyDsl.g:1550:1: ( ( rule__ChangeType__EntityAssignment_0_2 ) )
            // InternalMyDsl.g:1551:2: ( rule__ChangeType__EntityAssignment_0_2 )
            {
             before(grammarAccess.getChangeTypeAccess().getEntityAssignment_0_2()); 
            // InternalMyDsl.g:1552:2: ( rule__ChangeType__EntityAssignment_0_2 )
            // InternalMyDsl.g:1552:3: rule__ChangeType__EntityAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__EntityAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getChangeTypeAccess().getEntityAssignment_0_2()); 

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
    // $ANTLR end "rule__ChangeType__Group_0__2__Impl"


    // $ANTLR start "rule__ChangeType__Group_0__3"
    // InternalMyDsl.g:1560:1: rule__ChangeType__Group_0__3 : rule__ChangeType__Group_0__3__Impl ;
    public final void rule__ChangeType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( rule__ChangeType__Group_0__3__Impl )
            // InternalMyDsl.g:1565:2: rule__ChangeType__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__Group_0__3__Impl();

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
    // $ANTLR end "rule__ChangeType__Group_0__3"


    // $ANTLR start "rule__ChangeType__Group_0__3__Impl"
    // InternalMyDsl.g:1571:1: rule__ChangeType__Group_0__3__Impl : ( ')' ) ;
    public final void rule__ChangeType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1575:1: ( ( ')' ) )
            // InternalMyDsl.g:1576:1: ( ')' )
            {
            // InternalMyDsl.g:1576:1: ( ')' )
            // InternalMyDsl.g:1577:2: ')'
            {
             before(grammarAccess.getChangeTypeAccess().getRightParenthesisKeyword_0_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getRightParenthesisKeyword_0_3()); 

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
    // $ANTLR end "rule__ChangeType__Group_0__3__Impl"


    // $ANTLR start "rule__ChangeType__Group_1__0"
    // InternalMyDsl.g:1587:1: rule__ChangeType__Group_1__0 : rule__ChangeType__Group_1__0__Impl rule__ChangeType__Group_1__1 ;
    public final void rule__ChangeType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( rule__ChangeType__Group_1__0__Impl rule__ChangeType__Group_1__1 )
            // InternalMyDsl.g:1592:2: rule__ChangeType__Group_1__0__Impl rule__ChangeType__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__ChangeType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeType__Group_1__1();

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
    // $ANTLR end "rule__ChangeType__Group_1__0"


    // $ANTLR start "rule__ChangeType__Group_1__0__Impl"
    // InternalMyDsl.g:1599:1: rule__ChangeType__Group_1__0__Impl : ( 'distance' ) ;
    public final void rule__ChangeType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1603:1: ( ( 'distance' ) )
            // InternalMyDsl.g:1604:1: ( 'distance' )
            {
            // InternalMyDsl.g:1604:1: ( 'distance' )
            // InternalMyDsl.g:1605:2: 'distance'
            {
             before(grammarAccess.getChangeTypeAccess().getDistanceKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getDistanceKeyword_1_0()); 

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
    // $ANTLR end "rule__ChangeType__Group_1__0__Impl"


    // $ANTLR start "rule__ChangeType__Group_1__1"
    // InternalMyDsl.g:1614:1: rule__ChangeType__Group_1__1 : rule__ChangeType__Group_1__1__Impl rule__ChangeType__Group_1__2 ;
    public final void rule__ChangeType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( rule__ChangeType__Group_1__1__Impl rule__ChangeType__Group_1__2 )
            // InternalMyDsl.g:1619:2: rule__ChangeType__Group_1__1__Impl rule__ChangeType__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__ChangeType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeType__Group_1__2();

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
    // $ANTLR end "rule__ChangeType__Group_1__1"


    // $ANTLR start "rule__ChangeType__Group_1__1__Impl"
    // InternalMyDsl.g:1626:1: rule__ChangeType__Group_1__1__Impl : ( '(' ) ;
    public final void rule__ChangeType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( ( '(' ) )
            // InternalMyDsl.g:1631:1: ( '(' )
            {
            // InternalMyDsl.g:1631:1: ( '(' )
            // InternalMyDsl.g:1632:2: '('
            {
             before(grammarAccess.getChangeTypeAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getLeftParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__ChangeType__Group_1__1__Impl"


    // $ANTLR start "rule__ChangeType__Group_1__2"
    // InternalMyDsl.g:1641:1: rule__ChangeType__Group_1__2 : rule__ChangeType__Group_1__2__Impl rule__ChangeType__Group_1__3 ;
    public final void rule__ChangeType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( rule__ChangeType__Group_1__2__Impl rule__ChangeType__Group_1__3 )
            // InternalMyDsl.g:1646:2: rule__ChangeType__Group_1__2__Impl rule__ChangeType__Group_1__3
            {
            pushFollow(FOLLOW_16);
            rule__ChangeType__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeType__Group_1__3();

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
    // $ANTLR end "rule__ChangeType__Group_1__2"


    // $ANTLR start "rule__ChangeType__Group_1__2__Impl"
    // InternalMyDsl.g:1653:1: rule__ChangeType__Group_1__2__Impl : ( ( rule__ChangeType__EntityAssignment_1_2 ) ) ;
    public final void rule__ChangeType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1657:1: ( ( ( rule__ChangeType__EntityAssignment_1_2 ) ) )
            // InternalMyDsl.g:1658:1: ( ( rule__ChangeType__EntityAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1658:1: ( ( rule__ChangeType__EntityAssignment_1_2 ) )
            // InternalMyDsl.g:1659:2: ( rule__ChangeType__EntityAssignment_1_2 )
            {
             before(grammarAccess.getChangeTypeAccess().getEntityAssignment_1_2()); 
            // InternalMyDsl.g:1660:2: ( rule__ChangeType__EntityAssignment_1_2 )
            // InternalMyDsl.g:1660:3: rule__ChangeType__EntityAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__EntityAssignment_1_2();

            state._fsp--;


<<<<<<< HEAD
                    }
                    break;
                case 2 :
<<<<<<< HEAD
                    // InternalMyDsl.g:388:2: ( ( rule__ScenarioContent__MessageAssignment_1 ) )
                    {
                    // InternalMyDsl.g:388:2: ( ( rule__ScenarioContent__MessageAssignment_1 ) )
                    // InternalMyDsl.g:389:3: ( rule__ScenarioContent__MessageAssignment_1 )
                    {
                     before(grammarAccess.getScenarioContentAccess().getMessageAssignment_1()); 
                    // InternalMyDsl.g:390:3: ( rule__ScenarioContent__MessageAssignment_1 )
                    // InternalMyDsl.g:390:4: rule__ScenarioContent__MessageAssignment_1
=======
                    // InternalMyDsl.g:619:2: ( RULE_NUMBER )
                    {
                    // InternalMyDsl.g:619:2: ( RULE_NUMBER )
                    // InternalMyDsl.g:620:3: RULE_NUMBER
>>>>>>> Added Xtext for context dependent behavior
                    {
                     before(grammarAccess.getExpressionAccess().getNumberTerminalRuleCall_7_1()); 
                    match(input,RULE_NUMBER,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getNumberTerminalRuleCall_7_1()); 
=======
            }
>>>>>>> [xText] Added new message type: contextMessage

             after(grammarAccess.getChangeTypeAccess().getEntityAssignment_1_2()); 

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
    // $ANTLR end "rule__ChangeType__Group_1__2__Impl"


    // $ANTLR start "rule__ChangeType__Group_1__3"
    // InternalMyDsl.g:1668:1: rule__ChangeType__Group_1__3 : rule__ChangeType__Group_1__3__Impl ;
    public final void rule__ChangeType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( rule__ChangeType__Group_1__3__Impl )
            // InternalMyDsl.g:1673:2: rule__ChangeType__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__Group_1__3__Impl();

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
    // $ANTLR end "rule__ChangeType__Group_1__3"


    // $ANTLR start "rule__ChangeType__Group_1__3__Impl"
    // InternalMyDsl.g:1679:1: rule__ChangeType__Group_1__3__Impl : ( ')' ) ;
    public final void rule__ChangeType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1683:1: ( ( ')' ) )
            // InternalMyDsl.g:1684:1: ( ')' )
            {
            // InternalMyDsl.g:1684:1: ( ')' )
            // InternalMyDsl.g:1685:2: ')'
            {
             before(grammarAccess.getChangeTypeAccess().getRightParenthesisKeyword_1_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__ChangeType__Group_1__3__Impl"


    // $ANTLR start "rule__ChangeType__Group_2__0"
    // InternalMyDsl.g:1695:1: rule__ChangeType__Group_2__0 : rule__ChangeType__Group_2__0__Impl rule__ChangeType__Group_2__1 ;
    public final void rule__ChangeType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1699:1: ( rule__ChangeType__Group_2__0__Impl rule__ChangeType__Group_2__1 )
            // InternalMyDsl.g:1700:2: rule__ChangeType__Group_2__0__Impl rule__ChangeType__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ChangeType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeType__Group_2__1();

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
    // $ANTLR end "rule__ChangeType__Group_2__0"


    // $ANTLR start "rule__ChangeType__Group_2__0__Impl"
    // InternalMyDsl.g:1707:1: rule__ChangeType__Group_2__0__Impl : ( 'changeTo' ) ;
    public final void rule__ChangeType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( ( 'changeTo' ) )
            // InternalMyDsl.g:1712:1: ( 'changeTo' )
            {
            // InternalMyDsl.g:1712:1: ( 'changeTo' )
            // InternalMyDsl.g:1713:2: 'changeTo'
            {
             before(grammarAccess.getChangeTypeAccess().getChangeToKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getChangeToKeyword_2_0()); 

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
    // $ANTLR end "rule__ChangeType__Group_2__0__Impl"


    // $ANTLR start "rule__ChangeType__Group_2__1"
    // InternalMyDsl.g:1722:1: rule__ChangeType__Group_2__1 : rule__ChangeType__Group_2__1__Impl ;
    public final void rule__ChangeType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( rule__ChangeType__Group_2__1__Impl )
            // InternalMyDsl.g:1727:2: rule__ChangeType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__Group_2__1__Impl();

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
    // $ANTLR end "rule__ChangeType__Group_2__1"


    // $ANTLR start "rule__ChangeType__Group_2__1__Impl"
    // InternalMyDsl.g:1733:1: rule__ChangeType__Group_2__1__Impl : ( ( rule__ChangeType__AttributeAssignment_2_1 ) ) ;
    public final void rule__ChangeType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1737:1: ( ( ( rule__ChangeType__AttributeAssignment_2_1 ) ) )
            // InternalMyDsl.g:1738:1: ( ( rule__ChangeType__AttributeAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1738:1: ( ( rule__ChangeType__AttributeAssignment_2_1 ) )
            // InternalMyDsl.g:1739:2: ( rule__ChangeType__AttributeAssignment_2_1 )
            {
             before(grammarAccess.getChangeTypeAccess().getAttributeAssignment_2_1()); 
            // InternalMyDsl.g:1740:2: ( rule__ChangeType__AttributeAssignment_2_1 )
            // InternalMyDsl.g:1740:3: rule__ChangeType__AttributeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__AttributeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getChangeTypeAccess().getAttributeAssignment_2_1()); 

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
    // $ANTLR end "rule__ChangeType__Group_2__1__Impl"


    // $ANTLR start "rule__ChangeType__Group_3__0"
    // InternalMyDsl.g:1749:1: rule__ChangeType__Group_3__0 : rule__ChangeType__Group_3__0__Impl rule__ChangeType__Group_3__1 ;
    public final void rule__ChangeType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( rule__ChangeType__Group_3__0__Impl rule__ChangeType__Group_3__1 )
            // InternalMyDsl.g:1754:2: rule__ChangeType__Group_3__0__Impl rule__ChangeType__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__ChangeType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeType__Group_3__1();

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
    // $ANTLR end "rule__ChangeType__Group_3__0"


    // $ANTLR start "rule__ChangeType__Group_3__0__Impl"
    // InternalMyDsl.g:1761:1: rule__ChangeType__Group_3__0__Impl : ( 'conditionsAt' ) ;
    public final void rule__ChangeType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( ( 'conditionsAt' ) )
            // InternalMyDsl.g:1766:1: ( 'conditionsAt' )
            {
            // InternalMyDsl.g:1766:1: ( 'conditionsAt' )
            // InternalMyDsl.g:1767:2: 'conditionsAt'
            {
             before(grammarAccess.getChangeTypeAccess().getConditionsAtKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getConditionsAtKeyword_3_0()); 

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
    // $ANTLR end "rule__ChangeType__Group_3__0__Impl"


    // $ANTLR start "rule__ChangeType__Group_3__1"
    // InternalMyDsl.g:1776:1: rule__ChangeType__Group_3__1 : rule__ChangeType__Group_3__1__Impl rule__ChangeType__Group_3__2 ;
    public final void rule__ChangeType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1780:1: ( rule__ChangeType__Group_3__1__Impl rule__ChangeType__Group_3__2 )
            // InternalMyDsl.g:1781:2: rule__ChangeType__Group_3__1__Impl rule__ChangeType__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__ChangeType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeType__Group_3__2();

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
    // $ANTLR end "rule__ChangeType__Group_3__1"


    // $ANTLR start "rule__ChangeType__Group_3__1__Impl"
    // InternalMyDsl.g:1788:1: rule__ChangeType__Group_3__1__Impl : ( '(' ) ;
    public final void rule__ChangeType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( ( '(' ) )
            // InternalMyDsl.g:1793:1: ( '(' )
            {
            // InternalMyDsl.g:1793:1: ( '(' )
            // InternalMyDsl.g:1794:2: '('
            {
             before(grammarAccess.getChangeTypeAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getLeftParenthesisKeyword_3_1()); 

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
    // $ANTLR end "rule__ChangeType__Group_3__1__Impl"


    // $ANTLR start "rule__ChangeType__Group_3__2"
    // InternalMyDsl.g:1803:1: rule__ChangeType__Group_3__2 : rule__ChangeType__Group_3__2__Impl ;
    public final void rule__ChangeType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( rule__ChangeType__Group_3__2__Impl )
            // InternalMyDsl.g:1808:2: rule__ChangeType__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__Group_3__2__Impl();

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
    // $ANTLR end "rule__ChangeType__Group_3__2"


    // $ANTLR start "rule__ChangeType__Group_3__2__Impl"
    // InternalMyDsl.g:1814:1: rule__ChangeType__Group_3__2__Impl : ( ')' ) ;
    public final void rule__ChangeType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1818:1: ( ( ')' ) )
            // InternalMyDsl.g:1819:1: ( ')' )
            {
            // InternalMyDsl.g:1819:1: ( ')' )
            // InternalMyDsl.g:1820:2: ')'
            {
             before(grammarAccess.getChangeTypeAccess().getRightParenthesisKeyword_3_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__ChangeType__Group_3__2__Impl"


    // $ANTLR start "rule__ContextChange__Group__0"
    // InternalMyDsl.g:1830:1: rule__ContextChange__Group__0 : rule__ContextChange__Group__0__Impl rule__ContextChange__Group__1 ;
    public final void rule__ContextChange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( rule__ContextChange__Group__0__Impl rule__ContextChange__Group__1 )
            // InternalMyDsl.g:1835:2: rule__ContextChange__Group__0__Impl rule__ContextChange__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ContextChange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextChange__Group__1();

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
    // $ANTLR end "rule__ContextChange__Group__0"


    // $ANTLR start "rule__ContextChange__Group__0__Impl"
    // InternalMyDsl.g:1842:1: rule__ContextChange__Group__0__Impl : ( ( rule__ContextChange__ChangeAssignment_0 ) ) ;
    public final void rule__ContextChange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( ( ( rule__ContextChange__ChangeAssignment_0 ) ) )
            // InternalMyDsl.g:1847:1: ( ( rule__ContextChange__ChangeAssignment_0 ) )
            {
            // InternalMyDsl.g:1847:1: ( ( rule__ContextChange__ChangeAssignment_0 ) )
            // InternalMyDsl.g:1848:2: ( rule__ContextChange__ChangeAssignment_0 )
            {
             before(grammarAccess.getContextChangeAccess().getChangeAssignment_0()); 
            // InternalMyDsl.g:1849:2: ( rule__ContextChange__ChangeAssignment_0 )
            // InternalMyDsl.g:1849:3: rule__ContextChange__ChangeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ContextChange__ChangeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContextChangeAccess().getChangeAssignment_0()); 

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
    // $ANTLR end "rule__ContextChange__Group__0__Impl"


    // $ANTLR start "rule__ContextChange__Group__1"
    // InternalMyDsl.g:1857:1: rule__ContextChange__Group__1 : rule__ContextChange__Group__1__Impl rule__ContextChange__Group__2 ;
    public final void rule__ContextChange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1861:1: ( rule__ContextChange__Group__1__Impl rule__ContextChange__Group__2 )
            // InternalMyDsl.g:1862:2: rule__ContextChange__Group__1__Impl rule__ContextChange__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ContextChange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextChange__Group__2();

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
    // $ANTLR end "rule__ContextChange__Group__1"


    // $ANTLR start "rule__ContextChange__Group__1__Impl"
    // InternalMyDsl.g:1869:1: rule__ContextChange__Group__1__Impl : ( ( rule__ContextChange__NameAssignment_1 ) ) ;
    public final void rule__ContextChange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1873:1: ( ( ( rule__ContextChange__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1874:1: ( ( rule__ContextChange__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1874:1: ( ( rule__ContextChange__NameAssignment_1 ) )
            // InternalMyDsl.g:1875:2: ( rule__ContextChange__NameAssignment_1 )
            {
             before(grammarAccess.getContextChangeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1876:2: ( rule__ContextChange__NameAssignment_1 )
            // InternalMyDsl.g:1876:3: rule__ContextChange__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ContextChange__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextChangeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ContextChange__Group__1__Impl"


    // $ANTLR start "rule__ContextChange__Group__2"
    // InternalMyDsl.g:1884:1: rule__ContextChange__Group__2 : rule__ContextChange__Group__2__Impl ;
    public final void rule__ContextChange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( rule__ContextChange__Group__2__Impl )
            // InternalMyDsl.g:1889:2: rule__ContextChange__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextChange__Group__2__Impl();

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
    // $ANTLR end "rule__ContextChange__Group__2"


    // $ANTLR start "rule__ContextChange__Group__2__Impl"
    // InternalMyDsl.g:1895:1: rule__ContextChange__Group__2__Impl : ( ';' ) ;
    public final void rule__ContextChange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1899:1: ( ( ';' ) )
            // InternalMyDsl.g:1900:1: ( ';' )
            {
            // InternalMyDsl.g:1900:1: ( ';' )
            // InternalMyDsl.g:1901:2: ';'
            {
             before(grammarAccess.getContextChangeAccess().getSemicolonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContextChangeAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__ContextChange__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDsl.g:1911:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:1916:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyDsl.g:1923:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( ( 'attribute' ) )
            // InternalMyDsl.g:1928:1: ( 'attribute' )
            {
            // InternalMyDsl.g:1928:1: ( 'attribute' )
            // InternalMyDsl.g:1929:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyDsl.g:1938:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:1943:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyDsl.g:1950:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1954:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1955:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1955:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyDsl.g:1956:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1957:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyDsl.g:1957:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyDsl.g:1965:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( rule__Attribute__Group__2__Impl )
            // InternalMyDsl.g:1970:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyDsl.g:1976:1: rule__Attribute__Group__2__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1980:1: ( ( ';' ) )
            // InternalMyDsl.g:1981:1: ( ';' )
            {
            // InternalMyDsl.g:1981:1: ( ';' )
            // InternalMyDsl.g:1982:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalMyDsl.g:1992:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDsl.g:1997:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalMyDsl.g:2004:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( ( 'entity' ) )
            // InternalMyDsl.g:2009:1: ( 'entity' )
            {
            // InternalMyDsl.g:2009:1: ( 'entity' )
            // InternalMyDsl.g:2010:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalMyDsl.g:2019:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2023:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMyDsl.g:2024:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalMyDsl.g:2031:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2035:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2036:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2036:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalMyDsl.g:2037:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2038:2: ( rule__Entity__NameAssignment_1 )
            // InternalMyDsl.g:2038:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalMyDsl.g:2046:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalMyDsl.g:2051:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalMyDsl.g:2058:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( ( '{' ) )
            // InternalMyDsl.g:2063:1: ( '{' )
            {
            // InternalMyDsl.g:2063:1: ( '{' )
            // InternalMyDsl.g:2064:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalMyDsl.g:2073:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalMyDsl.g:2078:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalMyDsl.g:2085:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2089:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // InternalMyDsl.g:2090:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // InternalMyDsl.g:2090:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // InternalMyDsl.g:2091:2: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // InternalMyDsl.g:2092:2: ( rule__Entity__AttributesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:2092:3: rule__Entity__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Entity__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalMyDsl.g:2100:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2104:1: ( rule__Entity__Group__4__Impl )
            // InternalMyDsl.g:2105:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalMyDsl.g:2111:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2115:1: ( ( '}' ) )
            // InternalMyDsl.g:2116:1: ( '}' )
            {
            // InternalMyDsl.g:2116:1: ( '}' )
            // InternalMyDsl.g:2117:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalMyDsl.g:2127:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalMyDsl.g:2132:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

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
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalMyDsl.g:2139:1: rule__Relation__Group__0__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2143:1: ( ( 'relation' ) )
            // InternalMyDsl.g:2144:1: ( 'relation' )
            {
            // InternalMyDsl.g:2144:1: ( 'relation' )
            // InternalMyDsl.g:2145:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_0()); 

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
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalMyDsl.g:2154:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalMyDsl.g:2159:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

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
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalMyDsl.g:2166:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2170:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2171:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2171:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalMyDsl.g:2172:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2173:2: ( rule__Relation__NameAssignment_1 )
            // InternalMyDsl.g:2173:3: rule__Relation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalMyDsl.g:2181:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2185:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalMyDsl.g:2186:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

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
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalMyDsl.g:2193:1: rule__Relation__Group__2__Impl : ( '(' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( ( '(' ) )
            // InternalMyDsl.g:2198:1: ( '(' )
            {
            // InternalMyDsl.g:2198:1: ( '(' )
            // InternalMyDsl.g:2199:2: '('
            {
             before(grammarAccess.getRelationAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalMyDsl.g:2208:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalMyDsl.g:2213:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__4();

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
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalMyDsl.g:2220:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__SenderAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2224:1: ( ( ( rule__Relation__SenderAssignment_3 ) ) )
            // InternalMyDsl.g:2225:1: ( ( rule__Relation__SenderAssignment_3 ) )
            {
            // InternalMyDsl.g:2225:1: ( ( rule__Relation__SenderAssignment_3 ) )
            // InternalMyDsl.g:2226:2: ( rule__Relation__SenderAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getSenderAssignment_3()); 
            // InternalMyDsl.g:2227:2: ( rule__Relation__SenderAssignment_3 )
            // InternalMyDsl.g:2227:3: rule__Relation__SenderAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Relation__SenderAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getSenderAssignment_3()); 

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
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__4"
    // InternalMyDsl.g:2235:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2239:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalMyDsl.g:2240:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__5();

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
    // $ANTLR end "rule__Relation__Group__4"


    // $ANTLR start "rule__Relation__Group__4__Impl"
    // InternalMyDsl.g:2247:1: rule__Relation__Group__4__Impl : ( ',' ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2251:1: ( ( ',' ) )
            // InternalMyDsl.g:2252:1: ( ',' )
            {
            // InternalMyDsl.g:2252:1: ( ',' )
            // InternalMyDsl.g:2253:2: ','
            {
             before(grammarAccess.getRelationAccess().getCommaKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__Relation__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__5"
    // InternalMyDsl.g:2262:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2266:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // InternalMyDsl.g:2267:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Relation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__6();

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
    // $ANTLR end "rule__Relation__Group__5"


    // $ANTLR start "rule__Relation__Group__5__Impl"
    // InternalMyDsl.g:2274:1: rule__Relation__Group__5__Impl : ( ( rule__Relation__ReceiverAssignment_5 ) ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2278:1: ( ( ( rule__Relation__ReceiverAssignment_5 ) ) )
            // InternalMyDsl.g:2279:1: ( ( rule__Relation__ReceiverAssignment_5 ) )
            {
            // InternalMyDsl.g:2279:1: ( ( rule__Relation__ReceiverAssignment_5 ) )
            // InternalMyDsl.g:2280:2: ( rule__Relation__ReceiverAssignment_5 )
            {
             before(grammarAccess.getRelationAccess().getReceiverAssignment_5()); 
            // InternalMyDsl.g:2281:2: ( rule__Relation__ReceiverAssignment_5 )
            // InternalMyDsl.g:2281:3: rule__Relation__ReceiverAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Relation__ReceiverAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getReceiverAssignment_5()); 

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
    // $ANTLR end "rule__Relation__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group__6"
    // InternalMyDsl.g:2289:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl rule__Relation__Group__7 ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2293:1: ( rule__Relation__Group__6__Impl rule__Relation__Group__7 )
            // InternalMyDsl.g:2294:2: rule__Relation__Group__6__Impl rule__Relation__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Relation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__7();

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
    // $ANTLR end "rule__Relation__Group__6"


    // $ANTLR start "rule__Relation__Group__6__Impl"
    // InternalMyDsl.g:2301:1: rule__Relation__Group__6__Impl : ( ')' ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2305:1: ( ( ')' ) )
            // InternalMyDsl.g:2306:1: ( ')' )
            {
            // InternalMyDsl.g:2306:1: ( ')' )
            // InternalMyDsl.g:2307:2: ')'
            {
             before(grammarAccess.getRelationAccess().getRightParenthesisKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Relation__Group__6__Impl"


    // $ANTLR start "rule__Relation__Group__7"
    // InternalMyDsl.g:2316:1: rule__Relation__Group__7 : rule__Relation__Group__7__Impl rule__Relation__Group__8 ;
    public final void rule__Relation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2320:1: ( rule__Relation__Group__7__Impl rule__Relation__Group__8 )
            // InternalMyDsl.g:2321:2: rule__Relation__Group__7__Impl rule__Relation__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Relation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__8();

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
    // $ANTLR end "rule__Relation__Group__7"


    // $ANTLR start "rule__Relation__Group__7__Impl"
    // InternalMyDsl.g:2328:1: rule__Relation__Group__7__Impl : ( '{' ) ;
    public final void rule__Relation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2332:1: ( ( '{' ) )
            // InternalMyDsl.g:2333:1: ( '{' )
            {
            // InternalMyDsl.g:2333:1: ( '{' )
            // InternalMyDsl.g:2334:2: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Relation__Group__7__Impl"


    // $ANTLR start "rule__Relation__Group__8"
    // InternalMyDsl.g:2343:1: rule__Relation__Group__8 : rule__Relation__Group__8__Impl rule__Relation__Group__9 ;
    public final void rule__Relation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( rule__Relation__Group__8__Impl rule__Relation__Group__9 )
            // InternalMyDsl.g:2348:2: rule__Relation__Group__8__Impl rule__Relation__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Relation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__9();

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
    // $ANTLR end "rule__Relation__Group__8"


    // $ANTLR start "rule__Relation__Group__8__Impl"
    // InternalMyDsl.g:2355:1: rule__Relation__Group__8__Impl : ( ( rule__Relation__AttributesAssignment_8 )* ) ;
    public final void rule__Relation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2359:1: ( ( ( rule__Relation__AttributesAssignment_8 )* ) )
            // InternalMyDsl.g:2360:1: ( ( rule__Relation__AttributesAssignment_8 )* )
            {
            // InternalMyDsl.g:2360:1: ( ( rule__Relation__AttributesAssignment_8 )* )
            // InternalMyDsl.g:2361:2: ( rule__Relation__AttributesAssignment_8 )*
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_8()); 
            // InternalMyDsl.g:2362:2: ( rule__Relation__AttributesAssignment_8 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2362:3: rule__Relation__AttributesAssignment_8
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Relation__AttributesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getRelationAccess().getAttributesAssignment_8()); 

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
    // $ANTLR end "rule__Relation__Group__8__Impl"


    // $ANTLR start "rule__Relation__Group__9"
    // InternalMyDsl.g:2370:1: rule__Relation__Group__9 : rule__Relation__Group__9__Impl ;
    public final void rule__Relation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2374:1: ( rule__Relation__Group__9__Impl )
            // InternalMyDsl.g:2375:2: rule__Relation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__9__Impl();

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
    // $ANTLR end "rule__Relation__Group__9"


    // $ANTLR start "rule__Relation__Group__9__Impl"
    // InternalMyDsl.g:2381:1: rule__Relation__Group__9__Impl : ( '}' ) ;
    public final void rule__Relation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2385:1: ( ( '}' ) )
            // InternalMyDsl.g:2386:1: ( '}' )
            {
            // InternalMyDsl.g:2386:1: ( '}' )
            // InternalMyDsl.g:2387:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Relation__Group__9__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalMyDsl.g:2397:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2401:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalMyDsl.g:2402:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__1();

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
    // $ANTLR end "rule__Scenario__Group__0"


    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // InternalMyDsl.g:2409:1: rule__Scenario__Group__0__Impl : ( 'scenario' ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2413:1: ( ( 'scenario' ) )
            // InternalMyDsl.g:2414:1: ( 'scenario' )
            {
            // InternalMyDsl.g:2414:1: ( 'scenario' )
            // InternalMyDsl.g:2415:2: 'scenario'
            {
             before(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); 

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
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // InternalMyDsl.g:2424:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2428:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalMyDsl.g:2429:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__2();

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
    // $ANTLR end "rule__Scenario__Group__1"


    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // InternalMyDsl.g:2436:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__NameAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2440:1: ( ( ( rule__Scenario__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2441:1: ( ( rule__Scenario__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2441:1: ( ( rule__Scenario__NameAssignment_1 ) )
            // InternalMyDsl.g:2442:2: ( rule__Scenario__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2443:2: ( rule__Scenario__NameAssignment_1 )
            // InternalMyDsl.g:2443:3: rule__Scenario__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__2"
    // InternalMyDsl.g:2451:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2455:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalMyDsl.g:2456:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__3();

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
    // $ANTLR end "rule__Scenario__Group__2"


    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // InternalMyDsl.g:2463:1: rule__Scenario__Group__2__Impl : ( '{' ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2467:1: ( ( '{' ) )
            // InternalMyDsl.g:2468:1: ( '{' )
            {
            // InternalMyDsl.g:2468:1: ( '{' )
            // InternalMyDsl.g:2469:2: '{'
            {
             before(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__3"
    // InternalMyDsl.g:2478:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2482:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalMyDsl.g:2483:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Scenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__4();

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
    // $ANTLR end "rule__Scenario__Group__3"


    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // InternalMyDsl.g:2490:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__ScenariocontentsAssignment_3 )* ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2494:1: ( ( ( rule__Scenario__ScenariocontentsAssignment_3 )* ) )
            // InternalMyDsl.g:2495:1: ( ( rule__Scenario__ScenariocontentsAssignment_3 )* )
            {
            // InternalMyDsl.g:2495:1: ( ( rule__Scenario__ScenariocontentsAssignment_3 )* )
            // InternalMyDsl.g:2496:2: ( rule__Scenario__ScenariocontentsAssignment_3 )*
            {
             before(grammarAccess.getScenarioAccess().getScenariocontentsAssignment_3()); 
            // InternalMyDsl.g:2497:2: ( rule__Scenario__ScenariocontentsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17||LA20_0==20||LA20_0==29||(LA20_0>=31 && LA20_0<=32)||LA20_0==35||LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2497:3: rule__Scenario__ScenariocontentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Scenario__ScenariocontentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getScenariocontentsAssignment_3()); 

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
    // $ANTLR end "rule__Scenario__Group__3__Impl"


    // $ANTLR start "rule__Scenario__Group__4"
    // InternalMyDsl.g:2505:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2509:1: ( rule__Scenario__Group__4__Impl )
            // InternalMyDsl.g:2510:2: rule__Scenario__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__4__Impl();

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
    // $ANTLR end "rule__Scenario__Group__4"


    // $ANTLR start "rule__Scenario__Group__4__Impl"
    // InternalMyDsl.g:2516:1: rule__Scenario__Group__4__Impl : ( '}' ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2520:1: ( ( '}' ) )
            // InternalMyDsl.g:2521:1: ( '}' )
            {
            // InternalMyDsl.g:2521:1: ( '}' )
            // InternalMyDsl.g:2522:2: '}'
            {
             before(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Scenario__Group__4__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // InternalMyDsl.g:2532:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2536:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalMyDsl.g:2537:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__1();

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
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // InternalMyDsl.g:2544:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2548:1: ( ( 'message' ) )
            // InternalMyDsl.g:2549:1: ( 'message' )
            {
            // InternalMyDsl.g:2549:1: ( 'message' )
            // InternalMyDsl.g:2550:2: 'message'
            {
             before(grammarAccess.getMessageAccess().getMessageKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getMessageKeyword_0()); 

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
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // InternalMyDsl.g:2559:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2563:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalMyDsl.g:2564:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Message__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__2();

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
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // InternalMyDsl.g:2571:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2575:1: ( ( ( rule__Message__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2576:1: ( ( rule__Message__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2576:1: ( ( rule__Message__NameAssignment_1 ) )
            // InternalMyDsl.g:2577:2: ( rule__Message__NameAssignment_1 )
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2578:2: ( rule__Message__NameAssignment_1 )
            // InternalMyDsl.g:2578:3: rule__Message__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Message__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__2"
    // InternalMyDsl.g:2586:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2590:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalMyDsl.g:2591:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Message__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__3();

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
    // $ANTLR end "rule__Message__Group__2"


    // $ANTLR start "rule__Message__Group__2__Impl"
    // InternalMyDsl.g:2598:1: rule__Message__Group__2__Impl : ( ( rule__Message__RequiredAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2602:1: ( ( ( rule__Message__RequiredAssignment_2 )? ) )
            // InternalMyDsl.g:2603:1: ( ( rule__Message__RequiredAssignment_2 )? )
            {
            // InternalMyDsl.g:2603:1: ( ( rule__Message__RequiredAssignment_2 )? )
            // InternalMyDsl.g:2604:2: ( rule__Message__RequiredAssignment_2 )?
            {
             before(grammarAccess.getMessageAccess().getRequiredAssignment_2()); 
            // InternalMyDsl.g:2605:2: ( rule__Message__RequiredAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2605:3: rule__Message__RequiredAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__RequiredAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getRequiredAssignment_2()); 

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
    // $ANTLR end "rule__Message__Group__2__Impl"


    // $ANTLR start "rule__Message__Group__3"
    // InternalMyDsl.g:2613:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2617:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalMyDsl.g:2618:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Message__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__4();

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
    // $ANTLR end "rule__Message__Group__3"


    // $ANTLR start "rule__Message__Group__3__Impl"
    // InternalMyDsl.g:2625:1: rule__Message__Group__3__Impl : ( ( rule__Message__FailAssignment_3 )? ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2629:1: ( ( ( rule__Message__FailAssignment_3 )? ) )
            // InternalMyDsl.g:2630:1: ( ( rule__Message__FailAssignment_3 )? )
            {
            // InternalMyDsl.g:2630:1: ( ( rule__Message__FailAssignment_3 )? )
            // InternalMyDsl.g:2631:2: ( rule__Message__FailAssignment_3 )?
            {
             before(grammarAccess.getMessageAccess().getFailAssignment_3()); 
            // InternalMyDsl.g:2632:2: ( rule__Message__FailAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2632:3: rule__Message__FailAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__FailAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getFailAssignment_3()); 

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
    // $ANTLR end "rule__Message__Group__3__Impl"


    // $ANTLR start "rule__Message__Group__4"
    // InternalMyDsl.g:2640:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2644:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // InternalMyDsl.g:2645:2: rule__Message__Group__4__Impl rule__Message__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Message__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__5();

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
    // $ANTLR end "rule__Message__Group__4"


    // $ANTLR start "rule__Message__Group__4__Impl"
    // InternalMyDsl.g:2652:1: rule__Message__Group__4__Impl : ( ( rule__Message__StrictAssignment_4 )? ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2656:1: ( ( ( rule__Message__StrictAssignment_4 )? ) )
            // InternalMyDsl.g:2657:1: ( ( rule__Message__StrictAssignment_4 )? )
            {
            // InternalMyDsl.g:2657:1: ( ( rule__Message__StrictAssignment_4 )? )
            // InternalMyDsl.g:2658:2: ( rule__Message__StrictAssignment_4 )?
            {
             before(grammarAccess.getMessageAccess().getStrictAssignment_4()); 
            // InternalMyDsl.g:2659:2: ( rule__Message__StrictAssignment_4 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2659:3: rule__Message__StrictAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__StrictAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getStrictAssignment_4()); 

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
    // $ANTLR end "rule__Message__Group__4__Impl"


    // $ANTLR start "rule__Message__Group__5"
    // InternalMyDsl.g:2667:1: rule__Message__Group__5 : rule__Message__Group__5__Impl rule__Message__Group__6 ;
    public final void rule__Message__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2671:1: ( rule__Message__Group__5__Impl rule__Message__Group__6 )
            // InternalMyDsl.g:2672:2: rule__Message__Group__5__Impl rule__Message__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Message__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__6();

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
    // $ANTLR end "rule__Message__Group__5"


    // $ANTLR start "rule__Message__Group__5__Impl"
    // InternalMyDsl.g:2679:1: rule__Message__Group__5__Impl : ( ( rule__Message__SenderAssignment_5 ) ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2683:1: ( ( ( rule__Message__SenderAssignment_5 ) ) )
            // InternalMyDsl.g:2684:1: ( ( rule__Message__SenderAssignment_5 ) )
            {
            // InternalMyDsl.g:2684:1: ( ( rule__Message__SenderAssignment_5 ) )
            // InternalMyDsl.g:2685:2: ( rule__Message__SenderAssignment_5 )
            {
             before(grammarAccess.getMessageAccess().getSenderAssignment_5()); 
            // InternalMyDsl.g:2686:2: ( rule__Message__SenderAssignment_5 )
            // InternalMyDsl.g:2686:3: rule__Message__SenderAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Message__SenderAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getSenderAssignment_5()); 

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
    // $ANTLR end "rule__Message__Group__5__Impl"


    // $ANTLR start "rule__Message__Group__6"
    // InternalMyDsl.g:2694:1: rule__Message__Group__6 : rule__Message__Group__6__Impl rule__Message__Group__7 ;
    public final void rule__Message__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2698:1: ( rule__Message__Group__6__Impl rule__Message__Group__7 )
            // InternalMyDsl.g:2699:2: rule__Message__Group__6__Impl rule__Message__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Message__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__7();

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
    // $ANTLR end "rule__Message__Group__6"


    // $ANTLR start "rule__Message__Group__6__Impl"
    // InternalMyDsl.g:2706:1: rule__Message__Group__6__Impl : ( '->' ) ;
    public final void rule__Message__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2710:1: ( ( '->' ) )
            // InternalMyDsl.g:2711:1: ( '->' )
            {
            // InternalMyDsl.g:2711:1: ( '->' )
            // InternalMyDsl.g:2712:2: '->'
            {
             before(grammarAccess.getMessageAccess().getHyphenMinusGreaterThanSignKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getHyphenMinusGreaterThanSignKeyword_6()); 

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
    // $ANTLR end "rule__Message__Group__6__Impl"


    // $ANTLR start "rule__Message__Group__7"
    // InternalMyDsl.g:2721:1: rule__Message__Group__7 : rule__Message__Group__7__Impl rule__Message__Group__8 ;
    public final void rule__Message__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2725:1: ( rule__Message__Group__7__Impl rule__Message__Group__8 )
            // InternalMyDsl.g:2726:2: rule__Message__Group__7__Impl rule__Message__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Message__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__8();

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
    // $ANTLR end "rule__Message__Group__7"


    // $ANTLR start "rule__Message__Group__7__Impl"
    // InternalMyDsl.g:2733:1: rule__Message__Group__7__Impl : ( ( rule__Message__ReceiverAssignment_7 ) ) ;
    public final void rule__Message__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2737:1: ( ( ( rule__Message__ReceiverAssignment_7 ) ) )
            // InternalMyDsl.g:2738:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            {
            // InternalMyDsl.g:2738:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            // InternalMyDsl.g:2739:2: ( rule__Message__ReceiverAssignment_7 )
            {
             before(grammarAccess.getMessageAccess().getReceiverAssignment_7()); 
            // InternalMyDsl.g:2740:2: ( rule__Message__ReceiverAssignment_7 )
            // InternalMyDsl.g:2740:3: rule__Message__ReceiverAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Message__ReceiverAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getReceiverAssignment_7()); 

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
    // $ANTLR end "rule__Message__Group__7__Impl"


    // $ANTLR start "rule__Message__Group__8"
    // InternalMyDsl.g:2748:1: rule__Message__Group__8 : rule__Message__Group__8__Impl rule__Message__Group__9 ;
    public final void rule__Message__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2752:1: ( rule__Message__Group__8__Impl rule__Message__Group__9 )
            // InternalMyDsl.g:2753:2: rule__Message__Group__8__Impl rule__Message__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__Message__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__9();

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
    // $ANTLR end "rule__Message__Group__8"


    // $ANTLR start "rule__Message__Group__8__Impl"
    // InternalMyDsl.g:2760:1: rule__Message__Group__8__Impl : ( ( rule__Message__PastAssignment_8 )? ) ;
    public final void rule__Message__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2764:1: ( ( ( rule__Message__PastAssignment_8 )? ) )
            // InternalMyDsl.g:2765:1: ( ( rule__Message__PastAssignment_8 )? )
            {
            // InternalMyDsl.g:2765:1: ( ( rule__Message__PastAssignment_8 )? )
            // InternalMyDsl.g:2766:2: ( rule__Message__PastAssignment_8 )?
            {
             before(grammarAccess.getMessageAccess().getPastAssignment_8()); 
            // InternalMyDsl.g:2767:2: ( rule__Message__PastAssignment_8 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2767:3: rule__Message__PastAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__PastAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getPastAssignment_8()); 

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
    // $ANTLR end "rule__Message__Group__8__Impl"


    // $ANTLR start "rule__Message__Group__9"
    // InternalMyDsl.g:2775:1: rule__Message__Group__9 : rule__Message__Group__9__Impl rule__Message__Group__10 ;
    public final void rule__Message__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2779:1: ( rule__Message__Group__9__Impl rule__Message__Group__10 )
            // InternalMyDsl.g:2780:2: rule__Message__Group__9__Impl rule__Message__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__Message__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__10();

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
    // $ANTLR end "rule__Message__Group__9"


    // $ANTLR start "rule__Message__Group__9__Impl"
    // InternalMyDsl.g:2787:1: rule__Message__Group__9__Impl : ( ( rule__Message__FutureAssignment_9 )? ) ;
    public final void rule__Message__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2791:1: ( ( ( rule__Message__FutureAssignment_9 )? ) )
            // InternalMyDsl.g:2792:1: ( ( rule__Message__FutureAssignment_9 )? )
            {
            // InternalMyDsl.g:2792:1: ( ( rule__Message__FutureAssignment_9 )? )
            // InternalMyDsl.g:2793:2: ( rule__Message__FutureAssignment_9 )?
            {
             before(grammarAccess.getMessageAccess().getFutureAssignment_9()); 
            // InternalMyDsl.g:2794:2: ( rule__Message__FutureAssignment_9 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:2794:3: rule__Message__FutureAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__FutureAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getFutureAssignment_9()); 

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
    // $ANTLR end "rule__Message__Group__9__Impl"


    // $ANTLR start "rule__Message__Group__10"
    // InternalMyDsl.g:2802:1: rule__Message__Group__10 : rule__Message__Group__10__Impl rule__Message__Group__11 ;
    public final void rule__Message__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2806:1: ( rule__Message__Group__10__Impl rule__Message__Group__11 )
            // InternalMyDsl.g:2807:2: rule__Message__Group__10__Impl rule__Message__Group__11
            {
            pushFollow(FOLLOW_25);
            rule__Message__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__11();

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
    // $ANTLR end "rule__Message__Group__10"


    // $ANTLR start "rule__Message__Group__10__Impl"
    // InternalMyDsl.g:2814:1: rule__Message__Group__10__Impl : ( ( rule__Message__ConstraintAssignment_10 )? ) ;
    public final void rule__Message__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2818:1: ( ( ( rule__Message__ConstraintAssignment_10 )? ) )
            // InternalMyDsl.g:2819:1: ( ( rule__Message__ConstraintAssignment_10 )? )
            {
            // InternalMyDsl.g:2819:1: ( ( rule__Message__ConstraintAssignment_10 )? )
            // InternalMyDsl.g:2820:2: ( rule__Message__ConstraintAssignment_10 )?
            {
             before(grammarAccess.getMessageAccess().getConstraintAssignment_10()); 
            // InternalMyDsl.g:2821:2: ( rule__Message__ConstraintAssignment_10 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2821:3: rule__Message__ConstraintAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__ConstraintAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getConstraintAssignment_10()); 

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
    // $ANTLR end "rule__Message__Group__10__Impl"


    // $ANTLR start "rule__Message__Group__11"
    // InternalMyDsl.g:2829:1: rule__Message__Group__11 : rule__Message__Group__11__Impl rule__Message__Group__12 ;
    public final void rule__Message__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2833:1: ( rule__Message__Group__11__Impl rule__Message__Group__12 )
            // InternalMyDsl.g:2834:2: rule__Message__Group__11__Impl rule__Message__Group__12
            {
            pushFollow(FOLLOW_25);
            rule__Message__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__12();

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
    // $ANTLR end "rule__Message__Group__11"


    // $ANTLR start "rule__Message__Group__11__Impl"
    // InternalMyDsl.g:2841:1: rule__Message__Group__11__Impl : ( ( '{' )? ) ;
    public final void rule__Message__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2845:1: ( ( ( '{' )? ) )
            // InternalMyDsl.g:2846:1: ( ( '{' )? )
            {
            // InternalMyDsl.g:2846:1: ( ( '{' )? )
            // InternalMyDsl.g:2847:2: ( '{' )?
            {
             before(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_11()); 
            // InternalMyDsl.g:2848:2: ( '{' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:2848:3: '{'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Message__Group__11__Impl"


    // $ANTLR start "rule__Message__Group__12"
    // InternalMyDsl.g:2856:1: rule__Message__Group__12 : rule__Message__Group__12__Impl rule__Message__Group__13 ;
    public final void rule__Message__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2860:1: ( rule__Message__Group__12__Impl rule__Message__Group__13 )
            // InternalMyDsl.g:2861:2: rule__Message__Group__12__Impl rule__Message__Group__13
            {
            pushFollow(FOLLOW_25);
            rule__Message__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__13();

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
    // $ANTLR end "rule__Message__Group__12"


    // $ANTLR start "rule__Message__Group__12__Impl"
    // InternalMyDsl.g:2868:1: rule__Message__Group__12__Impl : ( ( rule__Message__CAssignment_12 )? ) ;
    public final void rule__Message__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2872:1: ( ( ( rule__Message__CAssignment_12 )? ) )
            // InternalMyDsl.g:2873:1: ( ( rule__Message__CAssignment_12 )? )
            {
            // InternalMyDsl.g:2873:1: ( ( rule__Message__CAssignment_12 )? )
            // InternalMyDsl.g:2874:2: ( rule__Message__CAssignment_12 )?
            {
             before(grammarAccess.getMessageAccess().getCAssignment_12()); 
            // InternalMyDsl.g:2875:2: ( rule__Message__CAssignment_12 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:2875:3: rule__Message__CAssignment_12
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__CAssignment_12();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getCAssignment_12()); 

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
    // $ANTLR end "rule__Message__Group__12__Impl"


    // $ANTLR start "rule__Message__Group__13"
    // InternalMyDsl.g:2883:1: rule__Message__Group__13 : rule__Message__Group__13__Impl rule__Message__Group__14 ;
    public final void rule__Message__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2887:1: ( rule__Message__Group__13__Impl rule__Message__Group__14 )
            // InternalMyDsl.g:2888:2: rule__Message__Group__13__Impl rule__Message__Group__14
            {
            pushFollow(FOLLOW_25);
            rule__Message__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__14();

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
    // $ANTLR end "rule__Message__Group__13"


    // $ANTLR start "rule__Message__Group__13__Impl"
    // InternalMyDsl.g:2895:1: rule__Message__Group__13__Impl : ( ( '}' )? ) ;
    public final void rule__Message__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2899:1: ( ( ( '}' )? ) )
            // InternalMyDsl.g:2900:1: ( ( '}' )? )
            {
            // InternalMyDsl.g:2900:1: ( ( '}' )? )
            // InternalMyDsl.g:2901:2: ( '}' )?
            {
             before(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_13()); 
            // InternalMyDsl.g:2902:2: ( '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==14) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:2902:3: '}'
                    {
                    match(input,14,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Message__Group__13__Impl"


    // $ANTLR start "rule__Message__Group__14"
    // InternalMyDsl.g:2910:1: rule__Message__Group__14 : rule__Message__Group__14__Impl ;
    public final void rule__Message__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2914:1: ( rule__Message__Group__14__Impl )
            // InternalMyDsl.g:2915:2: rule__Message__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__14__Impl();

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
    // $ANTLR end "rule__Message__Group__14"


    // $ANTLR start "rule__Message__Group__14__Impl"
    // InternalMyDsl.g:2921:1: rule__Message__Group__14__Impl : ( ';' ) ;
    public final void rule__Message__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2925:1: ( ( ';' ) )
            // InternalMyDsl.g:2926:1: ( ';' )
            {
            // InternalMyDsl.g:2926:1: ( ';' )
            // InternalMyDsl.g:2927:2: ';'
            {
             before(grammarAccess.getMessageAccess().getSemicolonKeyword_14()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getSemicolonKeyword_14()); 

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
    // $ANTLR end "rule__Message__Group__14__Impl"


    // $ANTLR start "rule__ContextMessage__Group__0"
    // InternalMyDsl.g:2937:1: rule__ContextMessage__Group__0 : rule__ContextMessage__Group__0__Impl rule__ContextMessage__Group__1 ;
    public final void rule__ContextMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2941:1: ( rule__ContextMessage__Group__0__Impl rule__ContextMessage__Group__1 )
            // InternalMyDsl.g:2942:2: rule__ContextMessage__Group__0__Impl rule__ContextMessage__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ContextMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextMessage__Group__1();

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
    // $ANTLR end "rule__ContextMessage__Group__0"


    // $ANTLR start "rule__ContextMessage__Group__0__Impl"
    // InternalMyDsl.g:2949:1: rule__ContextMessage__Group__0__Impl : ( ruleContextMessageContent ) ;
    public final void rule__ContextMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2953:1: ( ( ruleContextMessageContent ) )
            // InternalMyDsl.g:2954:1: ( ruleContextMessageContent )
            {
            // InternalMyDsl.g:2954:1: ( ruleContextMessageContent )
            // InternalMyDsl.g:2955:2: ruleContextMessageContent
            {
             before(grammarAccess.getContextMessageAccess().getContextMessageContentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleContextMessageContent();

            state._fsp--;

             after(grammarAccess.getContextMessageAccess().getContextMessageContentParserRuleCall_0()); 

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
    // $ANTLR end "rule__ContextMessage__Group__0__Impl"


    // $ANTLR start "rule__ContextMessage__Group__1"
    // InternalMyDsl.g:2964:1: rule__ContextMessage__Group__1 : rule__ContextMessage__Group__1__Impl rule__ContextMessage__Group__2 ;
    public final void rule__ContextMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2968:1: ( rule__ContextMessage__Group__1__Impl rule__ContextMessage__Group__2 )
            // InternalMyDsl.g:2969:2: rule__ContextMessage__Group__1__Impl rule__ContextMessage__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ContextMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextMessage__Group__2();

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
    // $ANTLR end "rule__ContextMessage__Group__1"


    // $ANTLR start "rule__ContextMessage__Group__1__Impl"
    // InternalMyDsl.g:2976:1: rule__ContextMessage__Group__1__Impl : ( ( rule__ContextMessage__RequiredAssignment_1 )? ) ;
    public final void rule__ContextMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2980:1: ( ( ( rule__ContextMessage__RequiredAssignment_1 )? ) )
            // InternalMyDsl.g:2981:1: ( ( rule__ContextMessage__RequiredAssignment_1 )? )
            {
            // InternalMyDsl.g:2981:1: ( ( rule__ContextMessage__RequiredAssignment_1 )? )
            // InternalMyDsl.g:2982:2: ( rule__ContextMessage__RequiredAssignment_1 )?
            {
             before(grammarAccess.getContextMessageAccess().getRequiredAssignment_1()); 
            // InternalMyDsl.g:2983:2: ( rule__ContextMessage__RequiredAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2983:3: rule__ContextMessage__RequiredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContextMessage__RequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextMessageAccess().getRequiredAssignment_1()); 

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
    // $ANTLR end "rule__ContextMessage__Group__1__Impl"


    // $ANTLR start "rule__ContextMessage__Group__2"
    // InternalMyDsl.g:2991:1: rule__ContextMessage__Group__2 : rule__ContextMessage__Group__2__Impl rule__ContextMessage__Group__3 ;
    public final void rule__ContextMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2995:1: ( rule__ContextMessage__Group__2__Impl rule__ContextMessage__Group__3 )
            // InternalMyDsl.g:2996:2: rule__ContextMessage__Group__2__Impl rule__ContextMessage__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__ContextMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextMessage__Group__3();

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
    // $ANTLR end "rule__ContextMessage__Group__2"


    // $ANTLR start "rule__ContextMessage__Group__2__Impl"
    // InternalMyDsl.g:3003:1: rule__ContextMessage__Group__2__Impl : ( ( rule__ContextMessage__FailAssignment_2 )? ) ;
    public final void rule__ContextMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3007:1: ( ( ( rule__ContextMessage__FailAssignment_2 )? ) )
            // InternalMyDsl.g:3008:1: ( ( rule__ContextMessage__FailAssignment_2 )? )
            {
            // InternalMyDsl.g:3008:1: ( ( rule__ContextMessage__FailAssignment_2 )? )
            // InternalMyDsl.g:3009:2: ( rule__ContextMessage__FailAssignment_2 )?
            {
             before(grammarAccess.getContextMessageAccess().getFailAssignment_2()); 
            // InternalMyDsl.g:3010:2: ( rule__ContextMessage__FailAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:3010:3: rule__ContextMessage__FailAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContextMessage__FailAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextMessageAccess().getFailAssignment_2()); 

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
    // $ANTLR end "rule__ContextMessage__Group__2__Impl"


    // $ANTLR start "rule__ContextMessage__Group__3"
    // InternalMyDsl.g:3018:1: rule__ContextMessage__Group__3 : rule__ContextMessage__Group__3__Impl rule__ContextMessage__Group__4 ;
    public final void rule__ContextMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3022:1: ( rule__ContextMessage__Group__3__Impl rule__ContextMessage__Group__4 )
            // InternalMyDsl.g:3023:2: rule__ContextMessage__Group__3__Impl rule__ContextMessage__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__ContextMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextMessage__Group__4();

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
    // $ANTLR end "rule__ContextMessage__Group__3"


    // $ANTLR start "rule__ContextMessage__Group__3__Impl"
    // InternalMyDsl.g:3030:1: rule__ContextMessage__Group__3__Impl : ( ( rule__ContextMessage__StrictAssignment_3 )? ) ;
    public final void rule__ContextMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3034:1: ( ( ( rule__ContextMessage__StrictAssignment_3 )? ) )
            // InternalMyDsl.g:3035:1: ( ( rule__ContextMessage__StrictAssignment_3 )? )
            {
            // InternalMyDsl.g:3035:1: ( ( rule__ContextMessage__StrictAssignment_3 )? )
            // InternalMyDsl.g:3036:2: ( rule__ContextMessage__StrictAssignment_3 )?
            {
             before(grammarAccess.getContextMessageAccess().getStrictAssignment_3()); 
            // InternalMyDsl.g:3037:2: ( rule__ContextMessage__StrictAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:3037:3: rule__ContextMessage__StrictAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContextMessage__StrictAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextMessageAccess().getStrictAssignment_3()); 

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
    // $ANTLR end "rule__ContextMessage__Group__3__Impl"


    // $ANTLR start "rule__ContextMessage__Group__4"
    // InternalMyDsl.g:3045:1: rule__ContextMessage__Group__4 : rule__ContextMessage__Group__4__Impl ;
    public final void rule__ContextMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3049:1: ( rule__ContextMessage__Group__4__Impl )
            // InternalMyDsl.g:3050:2: rule__ContextMessage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextMessage__Group__4__Impl();

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
    // $ANTLR end "rule__ContextMessage__Group__4"


    // $ANTLR start "rule__ContextMessage__Group__4__Impl"
    // InternalMyDsl.g:3056:1: rule__ContextMessage__Group__4__Impl : ( ';' ) ;
    public final void rule__ContextMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3060:1: ( ( ';' ) )
            // InternalMyDsl.g:3061:1: ( ';' )
            {
            // InternalMyDsl.g:3061:1: ( ';' )
            // InternalMyDsl.g:3062:2: ';'
            {
             before(grammarAccess.getContextMessageAccess().getSemicolonKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContextMessageAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__ContextMessage__Group__4__Impl"


    // $ANTLR start "rule__MatchMessage__Group__0"
    // InternalMyDsl.g:3072:1: rule__MatchMessage__Group__0 : rule__MatchMessage__Group__0__Impl rule__MatchMessage__Group__1 ;
    public final void rule__MatchMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3076:1: ( rule__MatchMessage__Group__0__Impl rule__MatchMessage__Group__1 )
            // InternalMyDsl.g:3077:2: rule__MatchMessage__Group__0__Impl rule__MatchMessage__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MatchMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchMessage__Group__1();

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
    // $ANTLR end "rule__MatchMessage__Group__0"


    // $ANTLR start "rule__MatchMessage__Group__0__Impl"
    // InternalMyDsl.g:3084:1: rule__MatchMessage__Group__0__Impl : ( 'match' ) ;
    public final void rule__MatchMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3088:1: ( ( 'match' ) )
            // InternalMyDsl.g:3089:1: ( 'match' )
            {
            // InternalMyDsl.g:3089:1: ( 'match' )
            // InternalMyDsl.g:3090:2: 'match'
            {
             before(grammarAccess.getMatchMessageAccess().getMatchKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMatchMessageAccess().getMatchKeyword_0()); 

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
    // $ANTLR end "rule__MatchMessage__Group__0__Impl"


    // $ANTLR start "rule__MatchMessage__Group__1"
    // InternalMyDsl.g:3099:1: rule__MatchMessage__Group__1 : rule__MatchMessage__Group__1__Impl rule__MatchMessage__Group__2 ;
    public final void rule__MatchMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3103:1: ( rule__MatchMessage__Group__1__Impl rule__MatchMessage__Group__2 )
            // InternalMyDsl.g:3104:2: rule__MatchMessage__Group__1__Impl rule__MatchMessage__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__MatchMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchMessage__Group__2();

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
    // $ANTLR end "rule__MatchMessage__Group__1"


    // $ANTLR start "rule__MatchMessage__Group__1__Impl"
    // InternalMyDsl.g:3111:1: rule__MatchMessage__Group__1__Impl : ( ( rule__MatchMessage__NameAssignment_1 ) ) ;
    public final void rule__MatchMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3115:1: ( ( ( rule__MatchMessage__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3116:1: ( ( rule__MatchMessage__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3116:1: ( ( rule__MatchMessage__NameAssignment_1 ) )
            // InternalMyDsl.g:3117:2: ( rule__MatchMessage__NameAssignment_1 )
            {
             before(grammarAccess.getMatchMessageAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3118:2: ( rule__MatchMessage__NameAssignment_1 )
            // InternalMyDsl.g:3118:3: rule__MatchMessage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchMessage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchMessageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MatchMessage__Group__1__Impl"


    // $ANTLR start "rule__MatchMessage__Group__2"
    // InternalMyDsl.g:3126:1: rule__MatchMessage__Group__2 : rule__MatchMessage__Group__2__Impl rule__MatchMessage__Group__3 ;
    public final void rule__MatchMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3130:1: ( rule__MatchMessage__Group__2__Impl rule__MatchMessage__Group__3 )
            // InternalMyDsl.g:3131:2: rule__MatchMessage__Group__2__Impl rule__MatchMessage__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__MatchMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchMessage__Group__3();

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
    // $ANTLR end "rule__MatchMessage__Group__2"


    // $ANTLR start "rule__MatchMessage__Group__2__Impl"
    // InternalMyDsl.g:3138:1: rule__MatchMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__MatchMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3142:1: ( ( '(' ) )
            // InternalMyDsl.g:3143:1: ( '(' )
            {
            // InternalMyDsl.g:3143:1: ( '(' )
            // InternalMyDsl.g:3144:2: '('
            {
             before(grammarAccess.getMatchMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMatchMessageAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__MatchMessage__Group__2__Impl"


    // $ANTLR start "rule__MatchMessage__Group__3"
    // InternalMyDsl.g:3153:1: rule__MatchMessage__Group__3 : rule__MatchMessage__Group__3__Impl rule__MatchMessage__Group__4 ;
    public final void rule__MatchMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3157:1: ( rule__MatchMessage__Group__3__Impl rule__MatchMessage__Group__4 )
            // InternalMyDsl.g:3158:2: rule__MatchMessage__Group__3__Impl rule__MatchMessage__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__MatchMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchMessage__Group__4();

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
    // $ANTLR end "rule__MatchMessage__Group__3"


    // $ANTLR start "rule__MatchMessage__Group__3__Impl"
    // InternalMyDsl.g:3165:1: rule__MatchMessage__Group__3__Impl : ( ( rule__MatchMessage__ContentAssignment_3 )? ) ;
    public final void rule__MatchMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3169:1: ( ( ( rule__MatchMessage__ContentAssignment_3 )? ) )
            // InternalMyDsl.g:3170:1: ( ( rule__MatchMessage__ContentAssignment_3 )? )
            {
            // InternalMyDsl.g:3170:1: ( ( rule__MatchMessage__ContentAssignment_3 )? )
            // InternalMyDsl.g:3171:2: ( rule__MatchMessage__ContentAssignment_3 )?
            {
             before(grammarAccess.getMatchMessageAccess().getContentAssignment_3()); 
            // InternalMyDsl.g:3172:2: ( rule__MatchMessage__ContentAssignment_3 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:3172:3: rule__MatchMessage__ContentAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MatchMessage__ContentAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchMessageAccess().getContentAssignment_3()); 

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
    // $ANTLR end "rule__MatchMessage__Group__3__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:394:2: ( ( rule__ScenarioContent__ParAssignment_2 ) )
                    {
                    // InternalMyDsl.g:394:2: ( ( rule__ScenarioContent__ParAssignment_2 ) )
                    // InternalMyDsl.g:395:3: ( rule__ScenarioContent__ParAssignment_2 )
                    {
                     before(grammarAccess.getScenarioContentAccess().getParAssignment_2()); 
                    // InternalMyDsl.g:396:3: ( rule__ScenarioContent__ParAssignment_2 )
                    // InternalMyDsl.g:396:4: rule__ScenarioContent__ParAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioContent__ParAssignment_2();
=======
    // $ANTLR start "rule__Relation__Group__9"
    // InternalMyDsl.g:2141:1: rule__Relation__Group__9 : rule__Relation__Group__9__Impl ;
    public final void rule__Relation__Group__9() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__MatchMessage__Group__4"
    // InternalMyDsl.g:3180:1: rule__MatchMessage__Group__4 : rule__MatchMessage__Group__4__Impl ;
    public final void rule__MatchMessage__Group__4() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3184:1: ( rule__MatchMessage__Group__4__Impl )
            // InternalMyDsl.g:3185:2: rule__MatchMessage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchMessage__Group__4__Impl();

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
    // $ANTLR end "rule__MatchMessage__Group__4"


    // $ANTLR start "rule__MatchMessage__Group__4__Impl"
    // InternalMyDsl.g:3191:1: rule__MatchMessage__Group__4__Impl : ( ')' ) ;
    public final void rule__MatchMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3195:1: ( ( ')' ) )
            // InternalMyDsl.g:3196:1: ( ')' )
            {
            // InternalMyDsl.g:3196:1: ( ')' )
            // InternalMyDsl.g:3197:2: ')'
            {
             before(grammarAccess.getMatchMessageAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMatchMessageAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__MatchMessage__Group__4__Impl"


    // $ANTLR start "rule__AppearMessage__Group__0"
    // InternalMyDsl.g:3207:1: rule__AppearMessage__Group__0 : rule__AppearMessage__Group__0__Impl rule__AppearMessage__Group__1 ;
    public final void rule__AppearMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3211:1: ( rule__AppearMessage__Group__0__Impl rule__AppearMessage__Group__1 )
            // InternalMyDsl.g:3212:2: rule__AppearMessage__Group__0__Impl rule__AppearMessage__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AppearMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppearMessage__Group__1();

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
    // $ANTLR end "rule__AppearMessage__Group__0"


    // $ANTLR start "rule__AppearMessage__Group__0__Impl"
    // InternalMyDsl.g:3219:1: rule__AppearMessage__Group__0__Impl : ( 'appear' ) ;
    public final void rule__AppearMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3223:1: ( ( 'appear' ) )
            // InternalMyDsl.g:3224:1: ( 'appear' )
            {
            // InternalMyDsl.g:3224:1: ( 'appear' )
            // InternalMyDsl.g:3225:2: 'appear'
            {
             before(grammarAccess.getAppearMessageAccess().getAppearKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAppearMessageAccess().getAppearKeyword_0()); 

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
    // $ANTLR end "rule__AppearMessage__Group__0__Impl"


    // $ANTLR start "rule__AppearMessage__Group__1"
    // InternalMyDsl.g:3234:1: rule__AppearMessage__Group__1 : rule__AppearMessage__Group__1__Impl rule__AppearMessage__Group__2 ;
    public final void rule__AppearMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3238:1: ( rule__AppearMessage__Group__1__Impl rule__AppearMessage__Group__2 )
            // InternalMyDsl.g:3239:2: rule__AppearMessage__Group__1__Impl rule__AppearMessage__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__AppearMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppearMessage__Group__2();

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
    // $ANTLR end "rule__AppearMessage__Group__1"


    // $ANTLR start "rule__AppearMessage__Group__1__Impl"
    // InternalMyDsl.g:3246:1: rule__AppearMessage__Group__1__Impl : ( ( rule__AppearMessage__NameAssignment_1 ) ) ;
    public final void rule__AppearMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3250:1: ( ( ( rule__AppearMessage__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3251:1: ( ( rule__AppearMessage__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3251:1: ( ( rule__AppearMessage__NameAssignment_1 ) )
            // InternalMyDsl.g:3252:2: ( rule__AppearMessage__NameAssignment_1 )
            {
             before(grammarAccess.getAppearMessageAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3253:2: ( rule__AppearMessage__NameAssignment_1 )
            // InternalMyDsl.g:3253:3: rule__AppearMessage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AppearMessage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAppearMessageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AppearMessage__Group__1__Impl"


    // $ANTLR start "rule__AppearMessage__Group__2"
    // InternalMyDsl.g:3261:1: rule__AppearMessage__Group__2 : rule__AppearMessage__Group__2__Impl rule__AppearMessage__Group__3 ;
    public final void rule__AppearMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3265:1: ( rule__AppearMessage__Group__2__Impl rule__AppearMessage__Group__3 )
            // InternalMyDsl.g:3266:2: rule__AppearMessage__Group__2__Impl rule__AppearMessage__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__AppearMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppearMessage__Group__3();

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
    // $ANTLR end "rule__AppearMessage__Group__2"


    // $ANTLR start "rule__AppearMessage__Group__2__Impl"
    // InternalMyDsl.g:3273:1: rule__AppearMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__AppearMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3277:1: ( ( '(' ) )
            // InternalMyDsl.g:3278:1: ( '(' )
            {
            // InternalMyDsl.g:3278:1: ( '(' )
            // InternalMyDsl.g:3279:2: '('
            {
             before(grammarAccess.getAppearMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAppearMessageAccess().getLeftParenthesisKeyword_2()); 

            }

<<<<<<< HEAD
                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:400:2: ( ( rule__ScenarioContent__LoopAssignment_3 ) )
                    {
                    // InternalMyDsl.g:400:2: ( ( rule__ScenarioContent__LoopAssignment_3 ) )
                    // InternalMyDsl.g:401:3: ( rule__ScenarioContent__LoopAssignment_3 )
                    {
                     before(grammarAccess.getScenarioContentAccess().getLoopAssignment_3()); 
                    // InternalMyDsl.g:402:3: ( rule__ScenarioContent__LoopAssignment_3 )
                    // InternalMyDsl.g:402:4: rule__ScenarioContent__LoopAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioContent__LoopAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioContentAccess().getLoopAssignment_3()); 

                    }


                    }
                    break;
=======
>>>>>>> Added Xtext for context dependent behavior

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
    // $ANTLR end "rule__AppearMessage__Group__2__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Name__Alternatives_2"
    // InternalMyDsl.g:410:1: rule__Name__Alternatives_2 : ( ( RULE_ID ) | ( RULE_NUMBER ) );
    public final void rule__Name__Alternatives_2() throws RecognitionException {
=======
    // $ANTLR start "rule__Scenario__Group__3"
    // InternalMyDsl.g:2249:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__AppearMessage__Group__3"
    // InternalMyDsl.g:3288:1: rule__AppearMessage__Group__3 : rule__AppearMessage__Group__3__Impl rule__AppearMessage__Group__4 ;
    public final void rule__AppearMessage__Group__3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:414:1: ( ( RULE_ID ) | ( RULE_NUMBER ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_NUMBER) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:415:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:415:2: ( RULE_ID )
                    // InternalMyDsl.g:416:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_2_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:421:2: ( RULE_NUMBER )
                    {
                    // InternalMyDsl.g:421:2: ( RULE_NUMBER )
                    // InternalMyDsl.g:422:3: RULE_NUMBER
                    {
                     before(grammarAccess.getNameAccess().getNumberTerminalRuleCall_2_1()); 
                    match(input,RULE_NUMBER,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getNumberTerminalRuleCall_2_1()); 
=======
            // InternalMyDsl.g:2253:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalMyDsl.g:2254:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
=======
            // InternalMyDsl.g:3292:1: ( rule__AppearMessage__Group__3__Impl rule__AppearMessage__Group__4 )
            // InternalMyDsl.g:3293:2: rule__AppearMessage__Group__3__Impl rule__AppearMessage__Group__4
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_27);
            rule__AppearMessage__Group__3__Impl();

            state._fsp--;
>>>>>>> Added Xtext for context dependent behavior

            pushFollow(FOLLOW_2);
            rule__AppearMessage__Group__4();

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
    // $ANTLR end "rule__AppearMessage__Group__3"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Alternatives_7"
    // InternalMyDsl.g:431:1: rule__Expression__Alternatives_7 : ( ( RULE_ID ) | ( RULE_NUMBER ) );
    public final void rule__Expression__Alternatives_7() throws RecognitionException {
=======
    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // InternalMyDsl.g:2261:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__ScenariocontentsAssignment_3 )* ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__AppearMessage__Group__3__Impl"
    // InternalMyDsl.g:3300:1: rule__AppearMessage__Group__3__Impl : ( ( rule__AppearMessage__EntityAssignment_3 )? ) ;
    public final void rule__AppearMessage__Group__3__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:435:1: ( ( RULE_ID ) | ( RULE_NUMBER ) )
            int alt3=2;
            int LA3_0 = input.LA(1);
=======
            // InternalMyDsl.g:2265:1: ( ( ( rule__Scenario__ScenariocontentsAssignment_3 )* ) )
            // InternalMyDsl.g:2266:1: ( ( rule__Scenario__ScenariocontentsAssignment_3 )* )
=======
            // InternalMyDsl.g:3304:1: ( ( ( rule__AppearMessage__EntityAssignment_3 )? ) )
            // InternalMyDsl.g:3305:1: ( ( rule__AppearMessage__EntityAssignment_3 )? )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:3305:1: ( ( rule__AppearMessage__EntityAssignment_3 )? )
            // InternalMyDsl.g:3306:2: ( rule__AppearMessage__EntityAssignment_3 )?
            {
<<<<<<< HEAD
             before(grammarAccess.getScenarioAccess().getScenariocontentsAssignment_3()); 
            // InternalMyDsl.g:2268:2: ( rule__Scenario__ScenariocontentsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);
>>>>>>> Added Xtext for context dependent behavior

                if ( (LA18_0==29||LA18_0==33||LA18_0==39) ) {
                    alt18=1;
                }

<<<<<<< HEAD
                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:436:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:436:2: ( RULE_ID )
                    // InternalMyDsl.g:437:3: RULE_ID
                    {
                     before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_7_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_7_0()); 
=======
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getAppearMessageAccess().getEntityAssignment_3()); 
            // InternalMyDsl.g:3307:2: ( rule__AppearMessage__EntityAssignment_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);
>>>>>>> [xText] Added new message type: contextMessage

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:3307:3: rule__AppearMessage__EntityAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__AppearMessage__EntityAssignment_3();

                    state._fsp--;

<<<<<<< HEAD
                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:442:2: ( RULE_NUMBER )
                    {
                    // InternalMyDsl.g:442:2: ( RULE_NUMBER )
                    // InternalMyDsl.g:443:3: RULE_NUMBER
                    {
                     before(grammarAccess.getExpressionAccess().getNumberTerminalRuleCall_7_1()); 
                    match(input,RULE_NUMBER,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getNumberTerminalRuleCall_7_1()); 
=======
>>>>>>> Added Xtext for context dependent behavior

                    }
                    break;

            }

             after(grammarAccess.getAppearMessageAccess().getEntityAssignment_3()); 

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
    // $ANTLR end "rule__AppearMessage__Group__3__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__0"
    // InternalMyDsl.g:452:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Scenario__Group__4"
    // InternalMyDsl.g:2276:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl ;
    public final void rule__Scenario__Group__4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__AppearMessage__Group__4"
    // InternalMyDsl.g:3315:1: rule__AppearMessage__Group__4 : rule__AppearMessage__Group__4__Impl ;
    public final void rule__AppearMessage__Group__4() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:456:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalMyDsl.g:457:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
=======
            // InternalMyDsl.g:2280:1: ( rule__Scenario__Group__4__Impl )
            // InternalMyDsl.g:2281:2: rule__Scenario__Group__4__Impl
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3319:1: ( rule__AppearMessage__Group__4__Impl )
            // InternalMyDsl.g:3320:2: rule__AppearMessage__Group__4__Impl
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_2);
            rule__AppearMessage__Group__4__Impl();

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
    // $ANTLR end "rule__AppearMessage__Group__4"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__0__Impl"
    // InternalMyDsl.g:464:1: rule__Domain__Group__0__Impl : ( 'specification' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Scenario__Group__4__Impl"
    // InternalMyDsl.g:2287:1: rule__Scenario__Group__4__Impl : ( '}' ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__AppearMessage__Group__4__Impl"
    // InternalMyDsl.g:3326:1: rule__AppearMessage__Group__4__Impl : ( ')' ) ;
    public final void rule__AppearMessage__Group__4__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:468:1: ( ( 'specification' ) )
            // InternalMyDsl.g:469:1: ( 'specification' )
            {
            // InternalMyDsl.g:469:1: ( 'specification' )
            // InternalMyDsl.g:470:2: 'specification'
=======
            // InternalMyDsl.g:2291:1: ( ( '}' ) )
            // InternalMyDsl.g:2292:1: ( '}' )
            {
            // InternalMyDsl.g:2292:1: ( '}' )
            // InternalMyDsl.g:2293:2: '}'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3330:1: ( ( ')' ) )
            // InternalMyDsl.g:3331:1: ( ')' )
            {
            // InternalMyDsl.g:3331:1: ( ')' )
            // InternalMyDsl.g:3332:2: ')'
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getAppearMessageAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAppearMessageAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__AppearMessage__Group__4__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__1"
    // InternalMyDsl.g:479:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__0"
    // InternalMyDsl.g:2303:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DisappearMessage__Group__0"
    // InternalMyDsl.g:3342:1: rule__DisappearMessage__Group__0 : rule__DisappearMessage__Group__0__Impl rule__DisappearMessage__Group__1 ;
    public final void rule__DisappearMessage__Group__0() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:483:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalMyDsl.g:484:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
=======
            // InternalMyDsl.g:2307:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalMyDsl.g:2308:2: rule__Message__Group__0__Impl rule__Message__Group__1
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3346:1: ( rule__DisappearMessage__Group__0__Impl rule__DisappearMessage__Group__1 )
            // InternalMyDsl.g:3347:2: rule__DisappearMessage__Group__0__Impl rule__DisappearMessage__Group__1
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_3);
            rule__DisappearMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DisappearMessage__Group__1();

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
    // $ANTLR end "rule__DisappearMessage__Group__0"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__1__Impl"
    // InternalMyDsl.g:491:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__0__Impl"
    // InternalMyDsl.g:2315:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DisappearMessage__Group__0__Impl"
    // InternalMyDsl.g:3354:1: rule__DisappearMessage__Group__0__Impl : ( 'disappear' ) ;
    public final void rule__DisappearMessage__Group__0__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:495:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalMyDsl.g:496:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:496:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalMyDsl.g:497:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:498:2: ( rule__Domain__NameAssignment_1 )
            // InternalMyDsl.g:498:3: rule__Domain__NameAssignment_1
=======
            // InternalMyDsl.g:2319:1: ( ( 'message' ) )
            // InternalMyDsl.g:2320:1: ( 'message' )
            {
            // InternalMyDsl.g:2320:1: ( 'message' )
            // InternalMyDsl.g:2321:2: 'message'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3358:1: ( ( 'disappear' ) )
            // InternalMyDsl.g:3359:1: ( 'disappear' )
            {
            // InternalMyDsl.g:3359:1: ( 'disappear' )
            // InternalMyDsl.g:3360:2: 'disappear'
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getDisappearMessageAccess().getDisappearKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDisappearMessageAccess().getDisappearKeyword_0()); 

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
    // $ANTLR end "rule__DisappearMessage__Group__0__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__2"
    // InternalMyDsl.g:506:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__1"
    // InternalMyDsl.g:2330:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DisappearMessage__Group__1"
    // InternalMyDsl.g:3369:1: rule__DisappearMessage__Group__1 : rule__DisappearMessage__Group__1__Impl rule__DisappearMessage__Group__2 ;
    public final void rule__DisappearMessage__Group__1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:510:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalMyDsl.g:511:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
=======
            // InternalMyDsl.g:2334:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalMyDsl.g:2335:2: rule__Message__Group__1__Impl rule__Message__Group__2
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3373:1: ( rule__DisappearMessage__Group__1__Impl rule__DisappearMessage__Group__2 )
            // InternalMyDsl.g:3374:2: rule__DisappearMessage__Group__1__Impl rule__DisappearMessage__Group__2
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_15);
            rule__DisappearMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DisappearMessage__Group__2();

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
    // $ANTLR end "rule__DisappearMessage__Group__1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__2__Impl"
    // InternalMyDsl.g:518:1: rule__Domain__Group__2__Impl : ( '{' ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__1__Impl"
    // InternalMyDsl.g:2342:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DisappearMessage__Group__1__Impl"
    // InternalMyDsl.g:3381:1: rule__DisappearMessage__Group__1__Impl : ( ( rule__DisappearMessage__NameAssignment_1 ) ) ;
    public final void rule__DisappearMessage__Group__1__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:522:1: ( ( '{' ) )
            // InternalMyDsl.g:523:1: ( '{' )
            {
            // InternalMyDsl.g:523:1: ( '{' )
            // InternalMyDsl.g:524:2: '{'
=======
            // InternalMyDsl.g:2346:1: ( ( ( rule__Message__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2347:1: ( ( rule__Message__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2347:1: ( ( rule__Message__NameAssignment_1 ) )
            // InternalMyDsl.g:2348:2: ( rule__Message__NameAssignment_1 )
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3385:1: ( ( ( rule__DisappearMessage__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3386:1: ( ( rule__DisappearMessage__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3386:1: ( ( rule__DisappearMessage__NameAssignment_1 ) )
            // InternalMyDsl.g:3387:2: ( rule__DisappearMessage__NameAssignment_1 )
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getDisappearMessageAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3388:2: ( rule__DisappearMessage__NameAssignment_1 )
            // InternalMyDsl.g:3388:3: rule__DisappearMessage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DisappearMessage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDisappearMessageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DisappearMessage__Group__1__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__3"
    // InternalMyDsl.g:533:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__2"
    // InternalMyDsl.g:2357:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DisappearMessage__Group__2"
    // InternalMyDsl.g:3396:1: rule__DisappearMessage__Group__2 : rule__DisappearMessage__Group__2__Impl rule__DisappearMessage__Group__3 ;
    public final void rule__DisappearMessage__Group__2() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:537:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // InternalMyDsl.g:538:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
=======
            // InternalMyDsl.g:2361:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalMyDsl.g:2362:2: rule__Message__Group__2__Impl rule__Message__Group__3
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3400:1: ( rule__DisappearMessage__Group__2__Impl rule__DisappearMessage__Group__3 )
            // InternalMyDsl.g:3401:2: rule__DisappearMessage__Group__2__Impl rule__DisappearMessage__Group__3
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_27);
            rule__DisappearMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DisappearMessage__Group__3();

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
    // $ANTLR end "rule__DisappearMessage__Group__2"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__3__Impl"
    // InternalMyDsl.g:545:1: rule__Domain__Group__3__Impl : ( ( rule__Domain__ObjectsAssignment_3 )* ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__2__Impl"
    // InternalMyDsl.g:2369:1: rule__Message__Group__2__Impl : ( ( rule__Message__RequiredAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DisappearMessage__Group__2__Impl"
    // InternalMyDsl.g:3408:1: rule__DisappearMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__DisappearMessage__Group__2__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:549:1: ( ( ( rule__Domain__ObjectsAssignment_3 )* ) )
            // InternalMyDsl.g:550:1: ( ( rule__Domain__ObjectsAssignment_3 )* )
            {
            // InternalMyDsl.g:550:1: ( ( rule__Domain__ObjectsAssignment_3 )* )
            // InternalMyDsl.g:551:2: ( rule__Domain__ObjectsAssignment_3 )*
            {
             before(grammarAccess.getDomainAccess().getObjectsAssignment_3()); 
            // InternalMyDsl.g:552:2: ( rule__Domain__ObjectsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:552:3: rule__Domain__ObjectsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Domain__ObjectsAssignment_3();
=======
            // InternalMyDsl.g:2373:1: ( ( ( rule__Message__RequiredAssignment_2 )? ) )
            // InternalMyDsl.g:2374:1: ( ( rule__Message__RequiredAssignment_2 )? )
=======
            // InternalMyDsl.g:3412:1: ( ( '(' ) )
            // InternalMyDsl.g:3413:1: ( '(' )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:3413:1: ( '(' )
            // InternalMyDsl.g:3414:2: '('
            {
             before(grammarAccess.getDisappearMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDisappearMessageAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__DisappearMessage__Group__2__Impl"


    // $ANTLR start "rule__DisappearMessage__Group__3"
    // InternalMyDsl.g:3423:1: rule__DisappearMessage__Group__3 : rule__DisappearMessage__Group__3__Impl rule__DisappearMessage__Group__4 ;
    public final void rule__DisappearMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3427:1: ( rule__DisappearMessage__Group__3__Impl rule__DisappearMessage__Group__4 )
            // InternalMyDsl.g:3428:2: rule__DisappearMessage__Group__3__Impl rule__DisappearMessage__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__DisappearMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DisappearMessage__Group__4();

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
    // $ANTLR end "rule__DisappearMessage__Group__3"


    // $ANTLR start "rule__DisappearMessage__Group__3__Impl"
    // InternalMyDsl.g:3435:1: rule__DisappearMessage__Group__3__Impl : ( ( rule__DisappearMessage__EntityAssignment_3 )? ) ;
    public final void rule__DisappearMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3439:1: ( ( ( rule__DisappearMessage__EntityAssignment_3 )? ) )
            // InternalMyDsl.g:3440:1: ( ( rule__DisappearMessage__EntityAssignment_3 )? )
            {
            // InternalMyDsl.g:3440:1: ( ( rule__DisappearMessage__EntityAssignment_3 )? )
            // InternalMyDsl.g:3441:2: ( rule__DisappearMessage__EntityAssignment_3 )?
            {
             before(grammarAccess.getDisappearMessageAccess().getEntityAssignment_3()); 
            // InternalMyDsl.g:3442:2: ( rule__DisappearMessage__EntityAssignment_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:3442:3: rule__DisappearMessage__EntityAssignment_3
                    {
                    pushFollow(FOLLOW_2);
<<<<<<< HEAD
                    rule__Message__RequiredAssignment_2();
>>>>>>> Added Xtext for context dependent behavior
=======
                    rule__DisappearMessage__EntityAssignment_3();
>>>>>>> [xText] Added new message type: contextMessage

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDisappearMessageAccess().getEntityAssignment_3()); 

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
    // $ANTLR end "rule__DisappearMessage__Group__3__Impl"

<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__4"
    // InternalMyDsl.g:560:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {
=======

<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__3"
    // InternalMyDsl.g:2384:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DisappearMessage__Group__4"
    // InternalMyDsl.g:3450:1: rule__DisappearMessage__Group__4 : rule__DisappearMessage__Group__4__Impl ;
    public final void rule__DisappearMessage__Group__4() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:564:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // InternalMyDsl.g:565:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
=======
            // InternalMyDsl.g:2388:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalMyDsl.g:2389:2: rule__Message__Group__3__Impl rule__Message__Group__4
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3454:1: ( rule__DisappearMessage__Group__4__Impl )
            // InternalMyDsl.g:3455:2: rule__DisappearMessage__Group__4__Impl
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_2);
            rule__DisappearMessage__Group__4__Impl();

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
    // $ANTLR end "rule__DisappearMessage__Group__4"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__4__Impl"
    // InternalMyDsl.g:572:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__ConstraintsAssignment_4 )* ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__3__Impl"
    // InternalMyDsl.g:2396:1: rule__Message__Group__3__Impl : ( ( rule__Message__FailAssignment_3 )? ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DisappearMessage__Group__4__Impl"
    // InternalMyDsl.g:3461:1: rule__DisappearMessage__Group__4__Impl : ( ')' ) ;
    public final void rule__DisappearMessage__Group__4__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:576:1: ( ( ( rule__Domain__ConstraintsAssignment_4 )* ) )
            // InternalMyDsl.g:577:1: ( ( rule__Domain__ConstraintsAssignment_4 )* )
            {
            // InternalMyDsl.g:577:1: ( ( rule__Domain__ConstraintsAssignment_4 )* )
            // InternalMyDsl.g:578:2: ( rule__Domain__ConstraintsAssignment_4 )*
            {
             before(grammarAccess.getDomainAccess().getConstraintsAssignment_4()); 
            // InternalMyDsl.g:579:2: ( rule__Domain__ConstraintsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:579:3: rule__Domain__ConstraintsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Domain__ConstraintsAssignment_4();
=======
            // InternalMyDsl.g:2400:1: ( ( ( rule__Message__FailAssignment_3 )? ) )
            // InternalMyDsl.g:2401:1: ( ( rule__Message__FailAssignment_3 )? )
=======
            // InternalMyDsl.g:3465:1: ( ( ')' ) )
            // InternalMyDsl.g:3466:1: ( ')' )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:3466:1: ( ')' )
            // InternalMyDsl.g:3467:2: ')'
            {
<<<<<<< HEAD
             before(grammarAccess.getMessageAccess().getFailAssignment_3()); 
            // InternalMyDsl.g:2403:2: ( rule__Message__FailAssignment_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:2403:3: rule__Message__FailAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__FailAssignment_3();
>>>>>>> Added Xtext for context dependent behavior

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getFailAssignment_3()); 
=======
             before(grammarAccess.getDisappearMessageAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDisappearMessageAccess().getRightParenthesisKeyword_4()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__DisappearMessage__Group__4__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__5"
    // InternalMyDsl.g:587:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl rule__Domain__Group__6 ;
    public final void rule__Domain__Group__5() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__4"
    // InternalMyDsl.g:2411:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DistanceMessage__Group__0"
    // InternalMyDsl.g:3477:1: rule__DistanceMessage__Group__0 : rule__DistanceMessage__Group__0__Impl rule__DistanceMessage__Group__1 ;
    public final void rule__DistanceMessage__Group__0() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:591:1: ( rule__Domain__Group__5__Impl rule__Domain__Group__6 )
            // InternalMyDsl.g:592:2: rule__Domain__Group__5__Impl rule__Domain__Group__6
=======
            // InternalMyDsl.g:2415:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // InternalMyDsl.g:2416:2: rule__Message__Group__4__Impl rule__Message__Group__5
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3481:1: ( rule__DistanceMessage__Group__0__Impl rule__DistanceMessage__Group__1 )
            // InternalMyDsl.g:3482:2: rule__DistanceMessage__Group__0__Impl rule__DistanceMessage__Group__1
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_3);
            rule__DistanceMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceMessage__Group__1();

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
    // $ANTLR end "rule__DistanceMessage__Group__0"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__5__Impl"
    // InternalMyDsl.g:599:1: rule__Domain__Group__5__Impl : ( ( rule__Domain__ScenariosAssignment_5 )* ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__4__Impl"
    // InternalMyDsl.g:2423:1: rule__Message__Group__4__Impl : ( ( rule__Message__StrictAssignment_4 )? ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DistanceMessage__Group__0__Impl"
    // InternalMyDsl.g:3489:1: rule__DistanceMessage__Group__0__Impl : ( 'distance' ) ;
    public final void rule__DistanceMessage__Group__0__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:603:1: ( ( ( rule__Domain__ScenariosAssignment_5 )* ) )
            // InternalMyDsl.g:604:1: ( ( rule__Domain__ScenariosAssignment_5 )* )
            {
            // InternalMyDsl.g:604:1: ( ( rule__Domain__ScenariosAssignment_5 )* )
            // InternalMyDsl.g:605:2: ( rule__Domain__ScenariosAssignment_5 )*
            {
             before(grammarAccess.getDomainAccess().getScenariosAssignment_5()); 
            // InternalMyDsl.g:606:2: ( rule__Domain__ScenariosAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:606:3: rule__Domain__ScenariosAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Domain__ScenariosAssignment_5();
=======
            // InternalMyDsl.g:2427:1: ( ( ( rule__Message__StrictAssignment_4 )? ) )
            // InternalMyDsl.g:2428:1: ( ( rule__Message__StrictAssignment_4 )? )
=======
            // InternalMyDsl.g:3493:1: ( ( 'distance' ) )
            // InternalMyDsl.g:3494:1: ( 'distance' )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:3494:1: ( 'distance' )
            // InternalMyDsl.g:3495:2: 'distance'
            {
<<<<<<< HEAD
             before(grammarAccess.getMessageAccess().getStrictAssignment_4()); 
            // InternalMyDsl.g:2430:2: ( rule__Message__StrictAssignment_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2430:3: rule__Message__StrictAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__StrictAssignment_4();
>>>>>>> Added Xtext for context dependent behavior

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getStrictAssignment_4()); 
=======
             before(grammarAccess.getDistanceMessageAccess().getDistanceKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDistanceMessageAccess().getDistanceKeyword_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__DistanceMessage__Group__0__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__6"
    // InternalMyDsl.g:614:1: rule__Domain__Group__6 : rule__Domain__Group__6__Impl ;
    public final void rule__Domain__Group__6() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__5"
    // InternalMyDsl.g:2438:1: rule__Message__Group__5 : rule__Message__Group__5__Impl rule__Message__Group__6 ;
    public final void rule__Message__Group__5() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DistanceMessage__Group__1"
    // InternalMyDsl.g:3504:1: rule__DistanceMessage__Group__1 : rule__DistanceMessage__Group__1__Impl rule__DistanceMessage__Group__2 ;
    public final void rule__DistanceMessage__Group__1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:618:1: ( rule__Domain__Group__6__Impl )
            // InternalMyDsl.g:619:2: rule__Domain__Group__6__Impl
=======
            // InternalMyDsl.g:2442:1: ( rule__Message__Group__5__Impl rule__Message__Group__6 )
            // InternalMyDsl.g:2443:2: rule__Message__Group__5__Impl rule__Message__Group__6
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3508:1: ( rule__DistanceMessage__Group__1__Impl rule__DistanceMessage__Group__2 )
            // InternalMyDsl.g:3509:2: rule__DistanceMessage__Group__1__Impl rule__DistanceMessage__Group__2
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_15);
            rule__DistanceMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceMessage__Group__2();

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
    // $ANTLR end "rule__DistanceMessage__Group__1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__6__Impl"
    // InternalMyDsl.g:625:1: rule__Domain__Group__6__Impl : ( '}' ) ;
    public final void rule__Domain__Group__6__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__5__Impl"
    // InternalMyDsl.g:2450:1: rule__Message__Group__5__Impl : ( ( rule__Message__SenderAssignment_5 ) ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DistanceMessage__Group__1__Impl"
    // InternalMyDsl.g:3516:1: rule__DistanceMessage__Group__1__Impl : ( ( rule__DistanceMessage__NameAssignment_1 ) ) ;
    public final void rule__DistanceMessage__Group__1__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:629:1: ( ( '}' ) )
            // InternalMyDsl.g:630:1: ( '}' )
            {
            // InternalMyDsl.g:630:1: ( '}' )
            // InternalMyDsl.g:631:2: '}'
=======
            // InternalMyDsl.g:2454:1: ( ( ( rule__Message__SenderAssignment_5 ) ) )
            // InternalMyDsl.g:2455:1: ( ( rule__Message__SenderAssignment_5 ) )
            {
            // InternalMyDsl.g:2455:1: ( ( rule__Message__SenderAssignment_5 ) )
            // InternalMyDsl.g:2456:2: ( rule__Message__SenderAssignment_5 )
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3520:1: ( ( ( rule__DistanceMessage__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3521:1: ( ( rule__DistanceMessage__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3521:1: ( ( rule__DistanceMessage__NameAssignment_1 ) )
            // InternalMyDsl.g:3522:2: ( rule__DistanceMessage__NameAssignment_1 )
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getDistanceMessageAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3523:2: ( rule__DistanceMessage__NameAssignment_1 )
            // InternalMyDsl.g:3523:3: rule__DistanceMessage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DistanceMessage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDistanceMessageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DistanceMessage__Group__1__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__0"
    // InternalMyDsl.g:641:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__6"
    // InternalMyDsl.g:2465:1: rule__Message__Group__6 : rule__Message__Group__6__Impl rule__Message__Group__7 ;
    public final void rule__Message__Group__6() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DistanceMessage__Group__2"
    // InternalMyDsl.g:3531:1: rule__DistanceMessage__Group__2 : rule__DistanceMessage__Group__2__Impl rule__DistanceMessage__Group__3 ;
    public final void rule__DistanceMessage__Group__2() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:645:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalMyDsl.g:646:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
=======
            // InternalMyDsl.g:2469:1: ( rule__Message__Group__6__Impl rule__Message__Group__7 )
            // InternalMyDsl.g:2470:2: rule__Message__Group__6__Impl rule__Message__Group__7
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3535:1: ( rule__DistanceMessage__Group__2__Impl rule__DistanceMessage__Group__3 )
            // InternalMyDsl.g:3536:2: rule__DistanceMessage__Group__2__Impl rule__DistanceMessage__Group__3
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_27);
            rule__DistanceMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceMessage__Group__3();

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
    // $ANTLR end "rule__DistanceMessage__Group__2"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // InternalMyDsl.g:653:1: rule__Scenario__Group__0__Impl : ( 'scenario' ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__6__Impl"
    // InternalMyDsl.g:2477:1: rule__Message__Group__6__Impl : ( '->' ) ;
    public final void rule__Message__Group__6__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DistanceMessage__Group__2__Impl"
    // InternalMyDsl.g:3543:1: rule__DistanceMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__DistanceMessage__Group__2__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:657:1: ( ( 'scenario' ) )
            // InternalMyDsl.g:658:1: ( 'scenario' )
            {
            // InternalMyDsl.g:658:1: ( 'scenario' )
            // InternalMyDsl.g:659:2: 'scenario'
=======
            // InternalMyDsl.g:2481:1: ( ( '->' ) )
            // InternalMyDsl.g:2482:1: ( '->' )
            {
            // InternalMyDsl.g:2482:1: ( '->' )
            // InternalMyDsl.g:2483:2: '->'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3547:1: ( ( '(' ) )
            // InternalMyDsl.g:3548:1: ( '(' )
            {
            // InternalMyDsl.g:3548:1: ( '(' )
            // InternalMyDsl.g:3549:2: '('
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getDistanceMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDistanceMessageAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__DistanceMessage__Group__2__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__1"
    // InternalMyDsl.g:668:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__7"
    // InternalMyDsl.g:2492:1: rule__Message__Group__7 : rule__Message__Group__7__Impl rule__Message__Group__8 ;
    public final void rule__Message__Group__7() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DistanceMessage__Group__3"
    // InternalMyDsl.g:3558:1: rule__DistanceMessage__Group__3 : rule__DistanceMessage__Group__3__Impl rule__DistanceMessage__Group__4 ;
    public final void rule__DistanceMessage__Group__3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:672:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalMyDsl.g:673:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
=======
            // InternalMyDsl.g:2496:1: ( rule__Message__Group__7__Impl rule__Message__Group__8 )
            // InternalMyDsl.g:2497:2: rule__Message__Group__7__Impl rule__Message__Group__8
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3562:1: ( rule__DistanceMessage__Group__3__Impl rule__DistanceMessage__Group__4 )
            // InternalMyDsl.g:3563:2: rule__DistanceMessage__Group__3__Impl rule__DistanceMessage__Group__4
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_27);
            rule__DistanceMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceMessage__Group__4();

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
    // $ANTLR end "rule__DistanceMessage__Group__3"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // InternalMyDsl.g:680:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__NameAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__7__Impl"
    // InternalMyDsl.g:2504:1: rule__Message__Group__7__Impl : ( ( rule__Message__ReceiverAssignment_7 ) ) ;
    public final void rule__Message__Group__7__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DistanceMessage__Group__3__Impl"
    // InternalMyDsl.g:3570:1: rule__DistanceMessage__Group__3__Impl : ( ( rule__DistanceMessage__EntityAssignment_3 )? ) ;
    public final void rule__DistanceMessage__Group__3__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:684:1: ( ( ( rule__Scenario__NameAssignment_1 ) ) )
            // InternalMyDsl.g:685:1: ( ( rule__Scenario__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:685:1: ( ( rule__Scenario__NameAssignment_1 ) )
            // InternalMyDsl.g:686:2: ( rule__Scenario__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:687:2: ( rule__Scenario__NameAssignment_1 )
            // InternalMyDsl.g:687:3: rule__Scenario__NameAssignment_1
=======
            // InternalMyDsl.g:2508:1: ( ( ( rule__Message__ReceiverAssignment_7 ) ) )
            // InternalMyDsl.g:2509:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            {
            // InternalMyDsl.g:2509:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            // InternalMyDsl.g:2510:2: ( rule__Message__ReceiverAssignment_7 )
            {
             before(grammarAccess.getMessageAccess().getReceiverAssignment_7()); 
            // InternalMyDsl.g:2511:2: ( rule__Message__ReceiverAssignment_7 )
            // InternalMyDsl.g:2511:3: rule__Message__ReceiverAssignment_7
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3574:1: ( ( ( rule__DistanceMessage__EntityAssignment_3 )? ) )
            // InternalMyDsl.g:3575:1: ( ( rule__DistanceMessage__EntityAssignment_3 )? )
            {
            // InternalMyDsl.g:3575:1: ( ( rule__DistanceMessage__EntityAssignment_3 )? )
            // InternalMyDsl.g:3576:2: ( rule__DistanceMessage__EntityAssignment_3 )?
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getDistanceMessageAccess().getEntityAssignment_3()); 
            // InternalMyDsl.g:3577:2: ( rule__DistanceMessage__EntityAssignment_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:3577:3: rule__DistanceMessage__EntityAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DistanceMessage__EntityAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDistanceMessageAccess().getEntityAssignment_3()); 

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
    // $ANTLR end "rule__DistanceMessage__Group__3__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__2"
    // InternalMyDsl.g:695:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__8"
    // InternalMyDsl.g:2519:1: rule__Message__Group__8 : rule__Message__Group__8__Impl rule__Message__Group__9 ;
    public final void rule__Message__Group__8() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DistanceMessage__Group__4"
    // InternalMyDsl.g:3585:1: rule__DistanceMessage__Group__4 : rule__DistanceMessage__Group__4__Impl ;
    public final void rule__DistanceMessage__Group__4() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:699:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalMyDsl.g:700:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
=======
            // InternalMyDsl.g:2523:1: ( rule__Message__Group__8__Impl rule__Message__Group__9 )
            // InternalMyDsl.g:2524:2: rule__Message__Group__8__Impl rule__Message__Group__9
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3589:1: ( rule__DistanceMessage__Group__4__Impl )
            // InternalMyDsl.g:3590:2: rule__DistanceMessage__Group__4__Impl
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_2);
            rule__DistanceMessage__Group__4__Impl();

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
    // $ANTLR end "rule__DistanceMessage__Group__4"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // InternalMyDsl.g:707:1: rule__Scenario__Group__2__Impl : ( '{' ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__8__Impl"
    // InternalMyDsl.g:2531:1: rule__Message__Group__8__Impl : ( ( rule__Message__PastAssignment_8 )? ) ;
    public final void rule__Message__Group__8__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__DistanceMessage__Group__4__Impl"
    // InternalMyDsl.g:3596:1: rule__DistanceMessage__Group__4__Impl : ( ')' ) ;
    public final void rule__DistanceMessage__Group__4__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:711:1: ( ( '{' ) )
            // InternalMyDsl.g:712:1: ( '{' )
            {
            // InternalMyDsl.g:712:1: ( '{' )
            // InternalMyDsl.g:713:2: '{'
=======
            // InternalMyDsl.g:2535:1: ( ( ( rule__Message__PastAssignment_8 )? ) )
            // InternalMyDsl.g:2536:1: ( ( rule__Message__PastAssignment_8 )? )
            {
            // InternalMyDsl.g:2536:1: ( ( rule__Message__PastAssignment_8 )? )
            // InternalMyDsl.g:2537:2: ( rule__Message__PastAssignment_8 )?
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3600:1: ( ( ')' ) )
            // InternalMyDsl.g:3601:1: ( ')' )
            {
            // InternalMyDsl.g:3601:1: ( ')' )
            // InternalMyDsl.g:3602:2: ')'
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getDistanceMessageAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDistanceMessageAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__DistanceMessage__Group__4__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__3"
    // InternalMyDsl.g:722:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__9"
    // InternalMyDsl.g:2546:1: rule__Message__Group__9 : rule__Message__Group__9__Impl rule__Message__Group__10 ;
    public final void rule__Message__Group__9() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Name__Group__0"
    // InternalMyDsl.g:3612:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:726:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalMyDsl.g:727:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
=======
            // InternalMyDsl.g:2550:1: ( rule__Message__Group__9__Impl rule__Message__Group__10 )
            // InternalMyDsl.g:2551:2: rule__Message__Group__9__Impl rule__Message__Group__10
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3616:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalMyDsl.g:3617:2: rule__Name__Group__0__Impl rule__Name__Group__1
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_15);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group__1();

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
    // $ANTLR end "rule__Name__Group__0"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // InternalMyDsl.g:734:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__ScenariocontentsAssignment_3 )* ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__9__Impl"
    // InternalMyDsl.g:2558:1: rule__Message__Group__9__Impl : ( ( rule__Message__FutureAssignment_9 )? ) ;
    public final void rule__Message__Group__9__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Name__Group__0__Impl"
    // InternalMyDsl.g:3624:1: rule__Name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:738:1: ( ( ( rule__Scenario__ScenariocontentsAssignment_3 )* ) )
            // InternalMyDsl.g:739:1: ( ( rule__Scenario__ScenariocontentsAssignment_3 )* )
            {
            // InternalMyDsl.g:739:1: ( ( rule__Scenario__ScenariocontentsAssignment_3 )* )
            // InternalMyDsl.g:740:2: ( rule__Scenario__ScenariocontentsAssignment_3 )*
            {
             before(grammarAccess.getScenarioAccess().getScenariocontentsAssignment_3()); 
            // InternalMyDsl.g:741:2: ( rule__Scenario__ScenariocontentsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16||LA7_0==23||LA7_0==29||LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:741:3: rule__Scenario__ScenariocontentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Scenario__ScenariocontentsAssignment_3();
=======
            // InternalMyDsl.g:2562:1: ( ( ( rule__Message__FutureAssignment_9 )? ) )
            // InternalMyDsl.g:2563:1: ( ( rule__Message__FutureAssignment_9 )? )
=======
            // InternalMyDsl.g:3628:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3629:1: ( RULE_ID )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:3629:1: ( RULE_ID )
            // InternalMyDsl.g:3630:2: RULE_ID
            {
<<<<<<< HEAD
             before(grammarAccess.getMessageAccess().getFutureAssignment_9()); 
            // InternalMyDsl.g:2565:2: ( rule__Message__FutureAssignment_9 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2565:3: rule__Message__FutureAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__FutureAssignment_9();
>>>>>>> Added Xtext for context dependent behavior

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getFutureAssignment_9()); 
=======
             before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__Name__Group__0__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__4"
    // InternalMyDsl.g:749:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl ;
    public final void rule__Scenario__Group__4() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__10"
    // InternalMyDsl.g:2573:1: rule__Message__Group__10 : rule__Message__Group__10__Impl rule__Message__Group__11 ;
    public final void rule__Message__Group__10() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Name__Group__1"
    // InternalMyDsl.g:3639:1: rule__Name__Group__1 : rule__Name__Group__1__Impl rule__Name__Group__2 ;
    public final void rule__Name__Group__1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:753:1: ( rule__Scenario__Group__4__Impl )
            // InternalMyDsl.g:754:2: rule__Scenario__Group__4__Impl
=======
            // InternalMyDsl.g:2577:1: ( rule__Message__Group__10__Impl rule__Message__Group__11 )
            // InternalMyDsl.g:2578:2: rule__Message__Group__10__Impl rule__Message__Group__11
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3643:1: ( rule__Name__Group__1__Impl rule__Name__Group__2 )
            // InternalMyDsl.g:3644:2: rule__Name__Group__1__Impl rule__Name__Group__2
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_28);
            rule__Name__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group__2();

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
    // $ANTLR end "rule__Name__Group__1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__4__Impl"
    // InternalMyDsl.g:760:1: rule__Scenario__Group__4__Impl : ( '}' ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__10__Impl"
    // InternalMyDsl.g:2585:1: rule__Message__Group__10__Impl : ( ( rule__Message__ConstraintAssignment_10 )? ) ;
    public final void rule__Message__Group__10__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Name__Group__1__Impl"
    // InternalMyDsl.g:3651:1: rule__Name__Group__1__Impl : ( '(' ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:764:1: ( ( '}' ) )
            // InternalMyDsl.g:765:1: ( '}' )
            {
            // InternalMyDsl.g:765:1: ( '}' )
            // InternalMyDsl.g:766:2: '}'
=======
            // InternalMyDsl.g:2589:1: ( ( ( rule__Message__ConstraintAssignment_10 )? ) )
            // InternalMyDsl.g:2590:1: ( ( rule__Message__ConstraintAssignment_10 )? )
            {
            // InternalMyDsl.g:2590:1: ( ( rule__Message__ConstraintAssignment_10 )? )
            // InternalMyDsl.g:2591:2: ( rule__Message__ConstraintAssignment_10 )?
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3655:1: ( ( '(' ) )
            // InternalMyDsl.g:3656:1: ( '(' )
            {
            // InternalMyDsl.g:3656:1: ( '(' )
            // InternalMyDsl.g:3657:2: '('
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getNameAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Name__Group__1__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__0"
    // InternalMyDsl.g:776:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__11"
    // InternalMyDsl.g:2600:1: rule__Message__Group__11 : rule__Message__Group__11__Impl rule__Message__Group__12 ;
    public final void rule__Message__Group__11() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Name__Group__2"
    // InternalMyDsl.g:3666:1: rule__Name__Group__2 : rule__Name__Group__2__Impl rule__Name__Group__3 ;
    public final void rule__Name__Group__2() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:780:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalMyDsl.g:781:2: rule__Message__Group__0__Impl rule__Message__Group__1
=======
            // InternalMyDsl.g:2604:1: ( rule__Message__Group__11__Impl rule__Message__Group__12 )
            // InternalMyDsl.g:2605:2: rule__Message__Group__11__Impl rule__Message__Group__12
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3670:1: ( rule__Name__Group__2__Impl rule__Name__Group__3 )
            // InternalMyDsl.g:3671:2: rule__Name__Group__2__Impl rule__Name__Group__3
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_28);
            rule__Name__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group__3();

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
    // $ANTLR end "rule__Name__Group__2"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__0__Impl"
    // InternalMyDsl.g:788:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__11__Impl"
    // InternalMyDsl.g:2612:1: rule__Message__Group__11__Impl : ( ( '{' )? ) ;
    public final void rule__Message__Group__11__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Name__Group__2__Impl"
    // InternalMyDsl.g:3678:1: rule__Name__Group__2__Impl : ( ( rule__Name__Alternatives_2 )? ) ;
    public final void rule__Name__Group__2__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:792:1: ( ( 'message' ) )
            // InternalMyDsl.g:793:1: ( 'message' )
            {
            // InternalMyDsl.g:793:1: ( 'message' )
            // InternalMyDsl.g:794:2: 'message'
=======
            // InternalMyDsl.g:2616:1: ( ( ( '{' )? ) )
            // InternalMyDsl.g:2617:1: ( ( '{' )? )
            {
            // InternalMyDsl.g:2617:1: ( ( '{' )? )
            // InternalMyDsl.g:2618:2: ( '{' )?
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3682:1: ( ( ( rule__Name__Alternatives_2 )? ) )
            // InternalMyDsl.g:3683:1: ( ( rule__Name__Alternatives_2 )? )
            {
            // InternalMyDsl.g:3683:1: ( ( rule__Name__Alternatives_2 )? )
            // InternalMyDsl.g:3684:2: ( rule__Name__Alternatives_2 )?
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getNameAccess().getAlternatives_2()); 
            // InternalMyDsl.g:3685:2: ( rule__Name__Alternatives_2 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_NUMBER)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:3685:3: rule__Name__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Name__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNameAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Name__Group__2__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__1"
    // InternalMyDsl.g:803:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__12"
    // InternalMyDsl.g:2627:1: rule__Message__Group__12 : rule__Message__Group__12__Impl rule__Message__Group__13 ;
    public final void rule__Message__Group__12() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Name__Group__3"
    // InternalMyDsl.g:3693:1: rule__Name__Group__3 : rule__Name__Group__3__Impl ;
    public final void rule__Name__Group__3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:807:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalMyDsl.g:808:2: rule__Message__Group__1__Impl rule__Message__Group__2
=======
            // InternalMyDsl.g:2631:1: ( rule__Message__Group__12__Impl rule__Message__Group__13 )
            // InternalMyDsl.g:2632:2: rule__Message__Group__12__Impl rule__Message__Group__13
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3697:1: ( rule__Name__Group__3__Impl )
            // InternalMyDsl.g:3698:2: rule__Name__Group__3__Impl
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__3__Impl();

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
    // $ANTLR end "rule__Name__Group__3"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__1__Impl"
    // InternalMyDsl.g:815:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__12__Impl"
    // InternalMyDsl.g:2639:1: rule__Message__Group__12__Impl : ( ( rule__Message__CAssignment_12 )? ) ;
    public final void rule__Message__Group__12__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Name__Group__3__Impl"
    // InternalMyDsl.g:3704:1: rule__Name__Group__3__Impl : ( ')' ) ;
    public final void rule__Name__Group__3__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:819:1: ( ( ( rule__Message__NameAssignment_1 ) ) )
            // InternalMyDsl.g:820:1: ( ( rule__Message__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:820:1: ( ( rule__Message__NameAssignment_1 ) )
            // InternalMyDsl.g:821:2: ( rule__Message__NameAssignment_1 )
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:822:2: ( rule__Message__NameAssignment_1 )
            // InternalMyDsl.g:822:3: rule__Message__NameAssignment_1
=======
            // InternalMyDsl.g:2643:1: ( ( ( rule__Message__CAssignment_12 )? ) )
            // InternalMyDsl.g:2644:1: ( ( rule__Message__CAssignment_12 )? )
            {
            // InternalMyDsl.g:2644:1: ( ( rule__Message__CAssignment_12 )? )
            // InternalMyDsl.g:2645:2: ( rule__Message__CAssignment_12 )?
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3708:1: ( ( ')' ) )
            // InternalMyDsl.g:3709:1: ( ')' )
            {
            // InternalMyDsl.g:3709:1: ( ')' )
            // InternalMyDsl.g:3710:2: ')'
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getNameAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Name__Group__3__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__2"
    // InternalMyDsl.g:830:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__13"
    // InternalMyDsl.g:2654:1: rule__Message__Group__13 : rule__Message__Group__13__Impl rule__Message__Group__14 ;
    public final void rule__Message__Group__13() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ObjectType__Group__0"
    // InternalMyDsl.g:3720:1: rule__ObjectType__Group__0 : rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1 ;
    public final void rule__ObjectType__Group__0() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:834:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalMyDsl.g:835:2: rule__Message__Group__2__Impl rule__Message__Group__3
=======
            // InternalMyDsl.g:2658:1: ( rule__Message__Group__13__Impl rule__Message__Group__14 )
            // InternalMyDsl.g:2659:2: rule__Message__Group__13__Impl rule__Message__Group__14
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3724:1: ( rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1 )
            // InternalMyDsl.g:3725:2: rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_3);
            rule__ObjectType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectType__Group__1();

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
    // $ANTLR end "rule__ObjectType__Group__0"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__2__Impl"
    // InternalMyDsl.g:842:1: rule__Message__Group__2__Impl : ( ( rule__Message__RequiredAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__13__Impl"
    // InternalMyDsl.g:2666:1: rule__Message__Group__13__Impl : ( ( '}' )? ) ;
    public final void rule__Message__Group__13__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ObjectType__Group__0__Impl"
    // InternalMyDsl.g:3732:1: rule__ObjectType__Group__0__Impl : ( 'object' ) ;
    public final void rule__ObjectType__Group__0__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:846:1: ( ( ( rule__Message__RequiredAssignment_2 )? ) )
            // InternalMyDsl.g:847:1: ( ( rule__Message__RequiredAssignment_2 )? )
            {
            // InternalMyDsl.g:847:1: ( ( rule__Message__RequiredAssignment_2 )? )
            // InternalMyDsl.g:848:2: ( rule__Message__RequiredAssignment_2 )?
            {
             before(grammarAccess.getMessageAccess().getRequiredAssignment_2()); 
            // InternalMyDsl.g:849:2: ( rule__Message__RequiredAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
=======
            // InternalMyDsl.g:2670:1: ( ( ( '}' )? ) )
            // InternalMyDsl.g:2671:1: ( ( '}' )? )
=======
            // InternalMyDsl.g:3736:1: ( ( 'object' ) )
            // InternalMyDsl.g:3737:1: ( 'object' )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:3737:1: ( 'object' )
            // InternalMyDsl.g:3738:2: 'object'
            {
<<<<<<< HEAD
             before(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_13()); 
            // InternalMyDsl.g:2673:2: ( '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==14) ) {
                alt27=1;
>>>>>>> Added Xtext for context dependent behavior
            }
            switch (alt27) {
                case 1 :
<<<<<<< HEAD
                    // InternalMyDsl.g:849:3: rule__Message__RequiredAssignment_2
=======
                    // InternalMyDsl.g:2673:3: '}'
>>>>>>> Added Xtext for context dependent behavior
                    {
                    match(input,14,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_13()); 
=======
             before(grammarAccess.getObjectTypeAccess().getObjectKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getObjectTypeAccess().getObjectKeyword_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__ObjectType__Group__0__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__3"
    // InternalMyDsl.g:857:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__14"
    // InternalMyDsl.g:2681:1: rule__Message__Group__14 : rule__Message__Group__14__Impl ;
    public final void rule__Message__Group__14() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ObjectType__Group__1"
    // InternalMyDsl.g:3747:1: rule__ObjectType__Group__1 : rule__ObjectType__Group__1__Impl ;
    public final void rule__ObjectType__Group__1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:861:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalMyDsl.g:862:2: rule__Message__Group__3__Impl rule__Message__Group__4
=======
            // InternalMyDsl.g:2685:1: ( rule__Message__Group__14__Impl )
            // InternalMyDsl.g:2686:2: rule__Message__Group__14__Impl
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3751:1: ( rule__ObjectType__Group__1__Impl )
            // InternalMyDsl.g:3752:2: rule__ObjectType__Group__1__Impl
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_2);
            rule__ObjectType__Group__1__Impl();

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
    // $ANTLR end "rule__ObjectType__Group__1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__3__Impl"
    // InternalMyDsl.g:869:1: rule__Message__Group__3__Impl : ( ( rule__Message__FailAssignment_3 )? ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__14__Impl"
    // InternalMyDsl.g:2692:1: rule__Message__Group__14__Impl : ( ';' ) ;
    public final void rule__Message__Group__14__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ObjectType__Group__1__Impl"
    // InternalMyDsl.g:3758:1: rule__ObjectType__Group__1__Impl : ( ( rule__ObjectType__NameAssignment_1 ) ) ;
    public final void rule__ObjectType__Group__1__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:873:1: ( ( ( rule__Message__FailAssignment_3 )? ) )
            // InternalMyDsl.g:874:1: ( ( rule__Message__FailAssignment_3 )? )
            {
            // InternalMyDsl.g:874:1: ( ( rule__Message__FailAssignment_3 )? )
            // InternalMyDsl.g:875:2: ( rule__Message__FailAssignment_3 )?
            {
             before(grammarAccess.getMessageAccess().getFailAssignment_3()); 
            // InternalMyDsl.g:876:2: ( rule__Message__FailAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:876:3: rule__Message__FailAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__FailAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getFailAssignment_3()); 
=======
            // InternalMyDsl.g:2696:1: ( ( ';' ) )
            // InternalMyDsl.g:2697:1: ( ';' )
=======
            // InternalMyDsl.g:3762:1: ( ( ( rule__ObjectType__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3763:1: ( ( rule__ObjectType__NameAssignment_1 ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:3763:1: ( ( rule__ObjectType__NameAssignment_1 ) )
            // InternalMyDsl.g:3764:2: ( rule__ObjectType__NameAssignment_1 )
            {
<<<<<<< HEAD
             before(grammarAccess.getMessageAccess().getSemicolonKeyword_14()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getSemicolonKeyword_14()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getObjectTypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3765:2: ( rule__ObjectType__NameAssignment_1 )
            // InternalMyDsl.g:3765:3: rule__ObjectType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectTypeAccess().getNameAssignment_1()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__ObjectType__Group__1__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__4"
    // InternalMyDsl.g:884:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__0"
    // InternalMyDsl.g:2708:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Object__Group__0"
    // InternalMyDsl.g:3774:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:888:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // InternalMyDsl.g:889:2: rule__Message__Group__4__Impl rule__Message__Group__5
=======
            // InternalMyDsl.g:2712:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalMyDsl.g:2713:2: rule__Name__Group__0__Impl rule__Name__Group__1
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3778:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalMyDsl.g:3779:2: rule__Object__Group__0__Impl rule__Object__Group__1
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_3);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__1();

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
    // $ANTLR end "rule__Object__Group__0"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__4__Impl"
    // InternalMyDsl.g:896:1: rule__Message__Group__4__Impl : ( ( rule__Message__StrictAssignment_4 )? ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__0__Impl"
    // InternalMyDsl.g:2720:1: rule__Name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalMyDsl.g:3786:1: rule__Object__Group__0__Impl : ( ( rule__Object__ObjectAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:900:1: ( ( ( rule__Message__StrictAssignment_4 )? ) )
            // InternalMyDsl.g:901:1: ( ( rule__Message__StrictAssignment_4 )? )
            {
            // InternalMyDsl.g:901:1: ( ( rule__Message__StrictAssignment_4 )? )
            // InternalMyDsl.g:902:2: ( rule__Message__StrictAssignment_4 )?
            {
             before(grammarAccess.getMessageAccess().getStrictAssignment_4()); 
            // InternalMyDsl.g:903:2: ( rule__Message__StrictAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:903:3: rule__Message__StrictAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__StrictAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getStrictAssignment_4()); 
=======
            // InternalMyDsl.g:2724:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2725:1: ( RULE_ID )
=======
            // InternalMyDsl.g:3790:1: ( ( ( rule__Object__ObjectAssignment_0 ) ) )
            // InternalMyDsl.g:3791:1: ( ( rule__Object__ObjectAssignment_0 ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:3791:1: ( ( rule__Object__ObjectAssignment_0 ) )
            // InternalMyDsl.g:3792:2: ( rule__Object__ObjectAssignment_0 )
            {
<<<<<<< HEAD
             before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getObjectAccess().getObjectAssignment_0()); 
            // InternalMyDsl.g:3793:2: ( rule__Object__ObjectAssignment_0 )
            // InternalMyDsl.g:3793:3: rule__Object__ObjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Object__ObjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getObjectAssignment_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__Object__Group__0__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__5"
    // InternalMyDsl.g:911:1: rule__Message__Group__5 : rule__Message__Group__5__Impl rule__Message__Group__6 ;
    public final void rule__Message__Group__5() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__1"
    // InternalMyDsl.g:2735:1: rule__Name__Group__1 : rule__Name__Group__1__Impl rule__Name__Group__2 ;
    public final void rule__Name__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Object__Group__1"
    // InternalMyDsl.g:3801:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:915:1: ( rule__Message__Group__5__Impl rule__Message__Group__6 )
            // InternalMyDsl.g:916:2: rule__Message__Group__5__Impl rule__Message__Group__6
=======
            // InternalMyDsl.g:2739:1: ( rule__Name__Group__1__Impl rule__Name__Group__2 )
            // InternalMyDsl.g:2740:2: rule__Name__Group__1__Impl rule__Name__Group__2
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3805:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalMyDsl.g:3806:2: rule__Object__Group__1__Impl rule__Object__Group__2
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_17);
            rule__Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__2();

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
    // $ANTLR end "rule__Object__Group__1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__5__Impl"
    // InternalMyDsl.g:923:1: rule__Message__Group__5__Impl : ( ( rule__Message__SenderAssignment_5 ) ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__1__Impl"
    // InternalMyDsl.g:2747:1: rule__Name__Group__1__Impl : ( '(' ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalMyDsl.g:3813:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:927:1: ( ( ( rule__Message__SenderAssignment_5 ) ) )
            // InternalMyDsl.g:928:1: ( ( rule__Message__SenderAssignment_5 ) )
            {
            // InternalMyDsl.g:928:1: ( ( rule__Message__SenderAssignment_5 ) )
            // InternalMyDsl.g:929:2: ( rule__Message__SenderAssignment_5 )
            {
             before(grammarAccess.getMessageAccess().getSenderAssignment_5()); 
            // InternalMyDsl.g:930:2: ( rule__Message__SenderAssignment_5 )
            // InternalMyDsl.g:930:3: rule__Message__SenderAssignment_5
=======
            // InternalMyDsl.g:2751:1: ( ( '(' ) )
            // InternalMyDsl.g:2752:1: ( '(' )
            {
            // InternalMyDsl.g:2752:1: ( '(' )
            // InternalMyDsl.g:2753:2: '('
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3817:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3818:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3818:1: ( ( rule__Object__NameAssignment_1 ) )
            // InternalMyDsl.g:3819:2: ( rule__Object__NameAssignment_1 )
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3820:2: ( rule__Object__NameAssignment_1 )
            // InternalMyDsl.g:3820:3: rule__Object__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Object__Group__1__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__6"
    // InternalMyDsl.g:938:1: rule__Message__Group__6 : rule__Message__Group__6__Impl rule__Message__Group__7 ;
    public final void rule__Message__Group__6() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__2"
    // InternalMyDsl.g:2762:1: rule__Name__Group__2 : rule__Name__Group__2__Impl rule__Name__Group__3 ;
    public final void rule__Name__Group__2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Object__Group__2"
    // InternalMyDsl.g:3828:1: rule__Object__Group__2 : rule__Object__Group__2__Impl ;
    public final void rule__Object__Group__2() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:942:1: ( rule__Message__Group__6__Impl rule__Message__Group__7 )
            // InternalMyDsl.g:943:2: rule__Message__Group__6__Impl rule__Message__Group__7
=======
            // InternalMyDsl.g:2766:1: ( rule__Name__Group__2__Impl rule__Name__Group__3 )
            // InternalMyDsl.g:2767:2: rule__Name__Group__2__Impl rule__Name__Group__3
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3832:1: ( rule__Object__Group__2__Impl )
            // InternalMyDsl.g:3833:2: rule__Object__Group__2__Impl
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__2__Impl();

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
    // $ANTLR end "rule__Object__Group__2"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__6__Impl"
    // InternalMyDsl.g:950:1: rule__Message__Group__6__Impl : ( '->' ) ;
    public final void rule__Message__Group__6__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__2__Impl"
    // InternalMyDsl.g:2774:1: rule__Name__Group__2__Impl : ( ( rule__Name__Alternatives_2 )? ) ;
    public final void rule__Name__Group__2__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalMyDsl.g:3839:1: rule__Object__Group__2__Impl : ( ';' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:954:1: ( ( '->' ) )
            // InternalMyDsl.g:955:1: ( '->' )
            {
            // InternalMyDsl.g:955:1: ( '->' )
            // InternalMyDsl.g:956:2: '->'
=======
            // InternalMyDsl.g:2778:1: ( ( ( rule__Name__Alternatives_2 )? ) )
            // InternalMyDsl.g:2779:1: ( ( rule__Name__Alternatives_2 )? )
            {
            // InternalMyDsl.g:2779:1: ( ( rule__Name__Alternatives_2 )? )
            // InternalMyDsl.g:2780:2: ( rule__Name__Alternatives_2 )?
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3843:1: ( ( ';' ) )
            // InternalMyDsl.g:3844:1: ( ';' )
            {
            // InternalMyDsl.g:3844:1: ( ';' )
            // InternalMyDsl.g:3845:2: ';'
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getObjectAccess().getSemicolonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Object__Group__2__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__7"
    // InternalMyDsl.g:965:1: rule__Message__Group__7 : rule__Message__Group__7__Impl rule__Message__Group__8 ;
    public final void rule__Message__Group__7() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__3"
    // InternalMyDsl.g:2789:1: rule__Name__Group__3 : rule__Name__Group__3__Impl ;
    public final void rule__Name__Group__3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Constraint__Group__0"
    // InternalMyDsl.g:3855:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:969:1: ( rule__Message__Group__7__Impl rule__Message__Group__8 )
            // InternalMyDsl.g:970:2: rule__Message__Group__7__Impl rule__Message__Group__8
=======
            // InternalMyDsl.g:2793:1: ( rule__Name__Group__3__Impl )
            // InternalMyDsl.g:2794:2: rule__Name__Group__3__Impl
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3859:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalMyDsl.g:3860:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_3);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

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
    // $ANTLR end "rule__Constraint__Group__0"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__7__Impl"
    // InternalMyDsl.g:977:1: rule__Message__Group__7__Impl : ( ( rule__Message__ReceiverAssignment_7 ) ) ;
    public final void rule__Message__Group__7__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__3__Impl"
    // InternalMyDsl.g:2800:1: rule__Name__Group__3__Impl : ( ')' ) ;
    public final void rule__Name__Group__3__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalMyDsl.g:3867:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:981:1: ( ( ( rule__Message__ReceiverAssignment_7 ) ) )
            // InternalMyDsl.g:982:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            {
            // InternalMyDsl.g:982:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            // InternalMyDsl.g:983:2: ( rule__Message__ReceiverAssignment_7 )
            {
             before(grammarAccess.getMessageAccess().getReceiverAssignment_7()); 
            // InternalMyDsl.g:984:2: ( rule__Message__ReceiverAssignment_7 )
            // InternalMyDsl.g:984:3: rule__Message__ReceiverAssignment_7
=======
            // InternalMyDsl.g:2804:1: ( ( ')' ) )
            // InternalMyDsl.g:2805:1: ( ')' )
            {
            // InternalMyDsl.g:2805:1: ( ')' )
            // InternalMyDsl.g:2806:2: ')'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3871:1: ( ( 'constraint' ) )
            // InternalMyDsl.g:3872:1: ( 'constraint' )
            {
            // InternalMyDsl.g:3872:1: ( 'constraint' )
            // InternalMyDsl.g:3873:2: 'constraint'
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 

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
    // $ANTLR end "rule__Constraint__Group__0__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__8"
    // InternalMyDsl.g:992:1: rule__Message__Group__8 : rule__Message__Group__8__Impl rule__Message__Group__9 ;
    public final void rule__Message__Group__8() throws RecognitionException {
=======
    // $ANTLR start "rule__ObjectType__Group__0"
    // InternalMyDsl.g:2816:1: rule__ObjectType__Group__0 : rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1 ;
    public final void rule__ObjectType__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Constraint__Group__1"
    // InternalMyDsl.g:3882:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:996:1: ( rule__Message__Group__8__Impl rule__Message__Group__9 )
            // InternalMyDsl.g:997:2: rule__Message__Group__8__Impl rule__Message__Group__9
=======
            // InternalMyDsl.g:2820:1: ( rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1 )
            // InternalMyDsl.g:2821:2: rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3886:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalMyDsl.g:3887:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_4);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

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
    // $ANTLR end "rule__Constraint__Group__1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__8__Impl"
    // InternalMyDsl.g:1004:1: rule__Message__Group__8__Impl : ( ( rule__Message__PastAssignment_8 )? ) ;
    public final void rule__Message__Group__8__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ObjectType__Group__0__Impl"
    // InternalMyDsl.g:2828:1: rule__ObjectType__Group__0__Impl : ( 'object' ) ;
    public final void rule__ObjectType__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalMyDsl.g:3894:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1008:1: ( ( ( rule__Message__PastAssignment_8 )? ) )
            // InternalMyDsl.g:1009:1: ( ( rule__Message__PastAssignment_8 )? )
            {
            // InternalMyDsl.g:1009:1: ( ( rule__Message__PastAssignment_8 )? )
            // InternalMyDsl.g:1010:2: ( rule__Message__PastAssignment_8 )?
            {
             before(grammarAccess.getMessageAccess().getPastAssignment_8()); 
            // InternalMyDsl.g:1011:2: ( rule__Message__PastAssignment_8 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1011:3: rule__Message__PastAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__PastAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getPastAssignment_8()); 
=======
            // InternalMyDsl.g:2832:1: ( ( 'object' ) )
            // InternalMyDsl.g:2833:1: ( 'object' )
=======
            // InternalMyDsl.g:3898:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3899:1: ( ( rule__Constraint__NameAssignment_1 ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:3899:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalMyDsl.g:3900:2: ( rule__Constraint__NameAssignment_1 )
            {
<<<<<<< HEAD
             before(grammarAccess.getObjectTypeAccess().getObjectKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getObjectTypeAccess().getObjectKeyword_0()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3901:2: ( rule__Constraint__NameAssignment_1 )
            // InternalMyDsl.g:3901:3: rule__Constraint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__Constraint__Group__1__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__9"
    // InternalMyDsl.g:1019:1: rule__Message__Group__9 : rule__Message__Group__9__Impl rule__Message__Group__10 ;
    public final void rule__Message__Group__9() throws RecognitionException {
=======
    // $ANTLR start "rule__ObjectType__Group__1"
    // InternalMyDsl.g:2843:1: rule__ObjectType__Group__1 : rule__ObjectType__Group__1__Impl ;
    public final void rule__ObjectType__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Constraint__Group__2"
    // InternalMyDsl.g:3909:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1023:1: ( rule__Message__Group__9__Impl rule__Message__Group__10 )
            // InternalMyDsl.g:1024:2: rule__Message__Group__9__Impl rule__Message__Group__10
=======
            // InternalMyDsl.g:2847:1: ( rule__ObjectType__Group__1__Impl )
            // InternalMyDsl.g:2848:2: rule__ObjectType__Group__1__Impl
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3913:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalMyDsl.g:3914:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_29);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

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
    // $ANTLR end "rule__Constraint__Group__2"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__9__Impl"
    // InternalMyDsl.g:1031:1: rule__Message__Group__9__Impl : ( ( rule__Message__FutureAssignment_9 )? ) ;
    public final void rule__Message__Group__9__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ObjectType__Group__1__Impl"
    // InternalMyDsl.g:2854:1: rule__ObjectType__Group__1__Impl : ( ( rule__ObjectType__NameAssignment_1 ) ) ;
    public final void rule__ObjectType__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalMyDsl.g:3921:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1035:1: ( ( ( rule__Message__FutureAssignment_9 )? ) )
            // InternalMyDsl.g:1036:1: ( ( rule__Message__FutureAssignment_9 )? )
            {
            // InternalMyDsl.g:1036:1: ( ( rule__Message__FutureAssignment_9 )? )
            // InternalMyDsl.g:1037:2: ( rule__Message__FutureAssignment_9 )?
            {
             before(grammarAccess.getMessageAccess().getFutureAssignment_9()); 
            // InternalMyDsl.g:1038:2: ( rule__Message__FutureAssignment_9 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1038:3: rule__Message__FutureAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__FutureAssignment_9();

                    state._fsp--;
=======
            // InternalMyDsl.g:2858:1: ( ( ( rule__ObjectType__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2859:1: ( ( rule__ObjectType__NameAssignment_1 ) )
=======
            // InternalMyDsl.g:3925:1: ( ( '{' ) )
            // InternalMyDsl.g:3926:1: ( '{' )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:3926:1: ( '{' )
            // InternalMyDsl.g:3927:2: '{'
            {
<<<<<<< HEAD
             before(grammarAccess.getObjectTypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2861:2: ( rule__ObjectType__NameAssignment_1 )
            // InternalMyDsl.g:2861:3: rule__ObjectType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectType__NameAssignment_1();
>>>>>>> Added Xtext for context dependent behavior

            state._fsp--;


            }

             after(grammarAccess.getObjectTypeAccess().getNameAssignment_1()); 
=======
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__Constraint__Group__2__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__10"
    // InternalMyDsl.g:1046:1: rule__Message__Group__10 : rule__Message__Group__10__Impl rule__Message__Group__11 ;
    public final void rule__Message__Group__10() throws RecognitionException {
=======
    // $ANTLR start "rule__Object__Group__0"
    // InternalMyDsl.g:2870:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Constraint__Group__3"
    // InternalMyDsl.g:3936:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1050:1: ( rule__Message__Group__10__Impl rule__Message__Group__11 )
            // InternalMyDsl.g:1051:2: rule__Message__Group__10__Impl rule__Message__Group__11
=======
            // InternalMyDsl.g:2874:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalMyDsl.g:2875:2: rule__Object__Group__0__Impl rule__Object__Group__1
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3940:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalMyDsl.g:3941:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_29);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4();

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
    // $ANTLR end "rule__Constraint__Group__3"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__10__Impl"
    // InternalMyDsl.g:1058:1: rule__Message__Group__10__Impl : ( ( rule__Message__ConstraintAssignment_10 )? ) ;
    public final void rule__Message__Group__10__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalMyDsl.g:2882:1: rule__Object__Group__0__Impl : ( ( rule__Object__ObjectAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalMyDsl.g:3948:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__MessagesAssignment_3 )* ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1062:1: ( ( ( rule__Message__ConstraintAssignment_10 )? ) )
            // InternalMyDsl.g:1063:1: ( ( rule__Message__ConstraintAssignment_10 )? )
            {
            // InternalMyDsl.g:1063:1: ( ( rule__Message__ConstraintAssignment_10 )? )
            // InternalMyDsl.g:1064:2: ( rule__Message__ConstraintAssignment_10 )?
            {
             before(grammarAccess.getMessageAccess().getConstraintAssignment_10()); 
            // InternalMyDsl.g:1065:2: ( rule__Message__ConstraintAssignment_10 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1065:3: rule__Message__ConstraintAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__ConstraintAssignment_10();

                    state._fsp--;
=======
            // InternalMyDsl.g:2886:1: ( ( ( rule__Object__ObjectAssignment_0 ) ) )
            // InternalMyDsl.g:2887:1: ( ( rule__Object__ObjectAssignment_0 ) )
            {
            // InternalMyDsl.g:2887:1: ( ( rule__Object__ObjectAssignment_0 ) )
            // InternalMyDsl.g:2888:2: ( rule__Object__ObjectAssignment_0 )
=======
            // InternalMyDsl.g:3952:1: ( ( ( rule__Constraint__MessagesAssignment_3 )* ) )
            // InternalMyDsl.g:3953:1: ( ( rule__Constraint__MessagesAssignment_3 )* )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:3953:1: ( ( rule__Constraint__MessagesAssignment_3 )* )
            // InternalMyDsl.g:3954:2: ( rule__Constraint__MessagesAssignment_3 )*
            {
<<<<<<< HEAD
            pushFollow(FOLLOW_2);
            rule__Object__ObjectAssignment_0();
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getConstraintAccess().getMessagesAssignment_3()); 
            // InternalMyDsl.g:3955:2: ( rule__Constraint__MessagesAssignment_3 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);
>>>>>>> [xText] Added new message type: contextMessage

                if ( (LA38_0==29) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:3955:3: rule__Constraint__MessagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Constraint__MessagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getConstraintAccess().getMessagesAssignment_3()); 

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
    // $ANTLR end "rule__Constraint__Group__3__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__11"
    // InternalMyDsl.g:1073:1: rule__Message__Group__11 : rule__Message__Group__11__Impl rule__Message__Group__12 ;
    public final void rule__Message__Group__11() throws RecognitionException {
=======
    // $ANTLR start "rule__Object__Group__1"
    // InternalMyDsl.g:2897:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Constraint__Group__4"
    // InternalMyDsl.g:3963:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1077:1: ( rule__Message__Group__11__Impl rule__Message__Group__12 )
            // InternalMyDsl.g:1078:2: rule__Message__Group__11__Impl rule__Message__Group__12
=======
            // InternalMyDsl.g:2901:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalMyDsl.g:2902:2: rule__Object__Group__1__Impl rule__Object__Group__2
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3967:1: ( rule__Constraint__Group__4__Impl )
            // InternalMyDsl.g:3968:2: rule__Constraint__Group__4__Impl
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4__Impl();

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
    // $ANTLR end "rule__Constraint__Group__4"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__11__Impl"
    // InternalMyDsl.g:1085:1: rule__Message__Group__11__Impl : ( ( '{' )? ) ;
    public final void rule__Message__Group__11__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalMyDsl.g:2909:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalMyDsl.g:3974:1: rule__Constraint__Group__4__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1089:1: ( ( ( '{' )? ) )
            // InternalMyDsl.g:1090:1: ( ( '{' )? )
            {
            // InternalMyDsl.g:1090:1: ( ( '{' )? )
            // InternalMyDsl.g:1091:2: ( '{' )?
            {
             before(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_11()); 
            // InternalMyDsl.g:1092:2: ( '{' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1092:3: '{'
                    {
                    match(input,13,FOLLOW_2); 
=======
            // InternalMyDsl.g:2913:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2914:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2914:1: ( ( rule__Object__NameAssignment_1 ) )
            // InternalMyDsl.g:2915:2: ( rule__Object__NameAssignment_1 )
=======
            // InternalMyDsl.g:3978:1: ( ( '}' ) )
            // InternalMyDsl.g:3979:1: ( '}' )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:3979:1: ( '}' )
            // InternalMyDsl.g:3980:2: '}'
            {
<<<<<<< HEAD
            pushFollow(FOLLOW_2);
            rule__Object__NameAssignment_1();

            state._fsp--;
>>>>>>> Added Xtext for context dependent behavior


            }

             after(grammarAccess.getObjectAccess().getNameAssignment_1()); 
=======
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__Constraint__Group__4__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__12"
    // InternalMyDsl.g:1100:1: rule__Message__Group__12 : rule__Message__Group__12__Impl rule__Message__Group__13 ;
    public final void rule__Message__Group__12() throws RecognitionException {
=======
    // $ANTLR start "rule__Object__Group__2"
    // InternalMyDsl.g:2924:1: rule__Object__Group__2 : rule__Object__Group__2__Impl ;
    public final void rule__Object__Group__2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Alt__Group__0"
    // InternalMyDsl.g:3990:1: rule__Alt__Group__0 : rule__Alt__Group__0__Impl rule__Alt__Group__1 ;
    public final void rule__Alt__Group__0() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1104:1: ( rule__Message__Group__12__Impl rule__Message__Group__13 )
            // InternalMyDsl.g:1105:2: rule__Message__Group__12__Impl rule__Message__Group__13
=======
            // InternalMyDsl.g:2928:1: ( rule__Object__Group__2__Impl )
            // InternalMyDsl.g:2929:2: rule__Object__Group__2__Impl
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:3994:1: ( rule__Alt__Group__0__Impl rule__Alt__Group__1 )
            // InternalMyDsl.g:3995:2: rule__Alt__Group__0__Impl rule__Alt__Group__1
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_15);
            rule__Alt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alt__Group__1();

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
    // $ANTLR end "rule__Alt__Group__0"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__12__Impl"
    // InternalMyDsl.g:1112:1: rule__Message__Group__12__Impl : ( ( rule__Message__CAssignment_12 )? ) ;
    public final void rule__Message__Group__12__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalMyDsl.g:2935:1: rule__Object__Group__2__Impl : ( ';' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Alt__Group__0__Impl"
    // InternalMyDsl.g:4002:1: rule__Alt__Group__0__Impl : ( 'alt' ) ;
    public final void rule__Alt__Group__0__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1116:1: ( ( ( rule__Message__CAssignment_12 )? ) )
            // InternalMyDsl.g:1117:1: ( ( rule__Message__CAssignment_12 )? )
            {
            // InternalMyDsl.g:1117:1: ( ( rule__Message__CAssignment_12 )? )
            // InternalMyDsl.g:1118:2: ( rule__Message__CAssignment_12 )?
            {
             before(grammarAccess.getMessageAccess().getCAssignment_12()); 
            // InternalMyDsl.g:1119:2: ( rule__Message__CAssignment_12 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1119:3: rule__Message__CAssignment_12
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__CAssignment_12();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getCAssignment_12()); 
=======
            // InternalMyDsl.g:2939:1: ( ( ';' ) )
            // InternalMyDsl.g:2940:1: ( ';' )
=======
            // InternalMyDsl.g:4006:1: ( ( 'alt' ) )
            // InternalMyDsl.g:4007:1: ( 'alt' )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4007:1: ( 'alt' )
            // InternalMyDsl.g:4008:2: 'alt'
            {
<<<<<<< HEAD
             before(grammarAccess.getObjectAccess().getSemicolonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getSemicolonKeyword_2()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getAltAccess().getAltKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAltAccess().getAltKeyword_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__Alt__Group__0__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__13"
    // InternalMyDsl.g:1127:1: rule__Message__Group__13 : rule__Message__Group__13__Impl rule__Message__Group__14 ;
    public final void rule__Message__Group__13() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__0"
    // InternalMyDsl.g:2951:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Alt__Group__1"
    // InternalMyDsl.g:4017:1: rule__Alt__Group__1 : rule__Alt__Group__1__Impl ;
    public final void rule__Alt__Group__1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1131:1: ( rule__Message__Group__13__Impl rule__Message__Group__14 )
            // InternalMyDsl.g:1132:2: rule__Message__Group__13__Impl rule__Message__Group__14
=======
            // InternalMyDsl.g:2955:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalMyDsl.g:2956:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4021:1: ( rule__Alt__Group__1__Impl )
            // InternalMyDsl.g:4022:2: rule__Alt__Group__1__Impl
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_2);
            rule__Alt__Group__1__Impl();

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
    // $ANTLR end "rule__Alt__Group__1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__13__Impl"
    // InternalMyDsl.g:1139:1: rule__Message__Group__13__Impl : ( ( '}' )? ) ;
    public final void rule__Message__Group__13__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalMyDsl.g:2963:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Alt__Group__1__Impl"
    // InternalMyDsl.g:4028:1: rule__Alt__Group__1__Impl : ( ( rule__Alt__ExpressionsAssignment_1 )* ) ;
    public final void rule__Alt__Group__1__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1143:1: ( ( ( '}' )? ) )
            // InternalMyDsl.g:1144:1: ( ( '}' )? )
            {
            // InternalMyDsl.g:1144:1: ( ( '}' )? )
            // InternalMyDsl.g:1145:2: ( '}' )?
            {
             before(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_13()); 
            // InternalMyDsl.g:1146:2: ( '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1146:3: '}'
                    {
                    match(input,14,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_13()); 
=======
            // InternalMyDsl.g:2967:1: ( ( 'constraint' ) )
            // InternalMyDsl.g:2968:1: ( 'constraint' )
=======
            // InternalMyDsl.g:4032:1: ( ( ( rule__Alt__ExpressionsAssignment_1 )* ) )
            // InternalMyDsl.g:4033:1: ( ( rule__Alt__ExpressionsAssignment_1 )* )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4033:1: ( ( rule__Alt__ExpressionsAssignment_1 )* )
            // InternalMyDsl.g:4034:2: ( rule__Alt__ExpressionsAssignment_1 )*
            {
<<<<<<< HEAD
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getAltAccess().getExpressionsAssignment_1()); 
            // InternalMyDsl.g:4035:2: ( rule__Alt__ExpressionsAssignment_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==18) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMyDsl.g:4035:3: rule__Alt__ExpressionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Alt__ExpressionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getAltAccess().getExpressionsAssignment_1()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__Alt__Group__1__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__14"
    // InternalMyDsl.g:1154:1: rule__Message__Group__14 : rule__Message__Group__14__Impl ;
    public final void rule__Message__Group__14() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__1"
    // InternalMyDsl.g:2978:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__0"
    // InternalMyDsl.g:4044:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1158:1: ( rule__Message__Group__14__Impl )
            // InternalMyDsl.g:1159:2: rule__Message__Group__14__Impl
=======
            // InternalMyDsl.g:2982:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalMyDsl.g:2983:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4048:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMyDsl.g:4049:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_32);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__14__Impl"
    // InternalMyDsl.g:1165:1: rule__Message__Group__14__Impl : ( ';' ) ;
    public final void rule__Message__Group__14__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalMyDsl.g:2990:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMyDsl.g:4056:1: rule__Expression__Group__0__Impl : ( '(' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1169:1: ( ( ';' ) )
            // InternalMyDsl.g:1170:1: ( ';' )
            {
            // InternalMyDsl.g:1170:1: ( ';' )
            // InternalMyDsl.g:1171:2: ';'
=======
            // InternalMyDsl.g:2994:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2995:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2995:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalMyDsl.g:2996:2: ( rule__Constraint__NameAssignment_1 )
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4060:1: ( ( '(' ) )
            // InternalMyDsl.g:4061:1: ( '(' )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4061:1: ( '(' )
            // InternalMyDsl.g:4062:2: '('
            {
             before(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Expression__Group__0__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Name__Group__0"
    // InternalMyDsl.g:1181:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__2"
    // InternalMyDsl.g:3005:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__1"
    // InternalMyDsl.g:4071:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1185:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalMyDsl.g:1186:2: rule__Name__Group__0__Impl rule__Name__Group__1
=======
            // InternalMyDsl.g:3009:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalMyDsl.g:3010:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_27);
            rule__Constraint__Group__2__Impl();
=======
            // InternalMyDsl.g:4075:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // InternalMyDsl.g:4076:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Expression__Group__1__Impl();
>>>>>>> [xText] Added new message type: contextMessage

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__2();

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
    // $ANTLR end "rule__Expression__Group__1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Name__Group__0__Impl"
    // InternalMyDsl.g:1193:1: rule__Name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalMyDsl.g:3017:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMyDsl.g:4083:1: rule__Expression__Group__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1197:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1198:1: ( RULE_ID )
            {
            // InternalMyDsl.g:1198:1: ( RULE_ID )
            // InternalMyDsl.g:1199:2: RULE_ID
=======
            // InternalMyDsl.g:3021:1: ( ( '{' ) )
            // InternalMyDsl.g:3022:1: ( '{' )
            {
            // InternalMyDsl.g:3022:1: ( '{' )
            // InternalMyDsl.g:3023:2: '{'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4087:1: ( ( ( RULE_ID )? ) )
            // InternalMyDsl.g:4088:1: ( ( RULE_ID )? )
            {
            // InternalMyDsl.g:4088:1: ( ( RULE_ID )? )
            // InternalMyDsl.g:4089:2: ( RULE_ID )?
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1()); 
            // InternalMyDsl.g:4090:2: ( RULE_ID )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:4090:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Expression__Group__1__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Name__Group__1"
    // InternalMyDsl.g:1208:1: rule__Name__Group__1 : rule__Name__Group__1__Impl rule__Name__Group__2 ;
    public final void rule__Name__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__3"
    // InternalMyDsl.g:3032:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__2"
    // InternalMyDsl.g:4098:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl rule__Expression__Group__3 ;
    public final void rule__Expression__Group__2() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1212:1: ( rule__Name__Group__1__Impl rule__Name__Group__2 )
            // InternalMyDsl.g:1213:2: rule__Name__Group__1__Impl rule__Name__Group__2
=======
            // InternalMyDsl.g:3036:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalMyDsl.g:3037:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4102:1: ( rule__Expression__Group__2__Impl rule__Expression__Group__3 )
            // InternalMyDsl.g:4103:2: rule__Expression__Group__2__Impl rule__Expression__Group__3
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_32);
            rule__Expression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__3();

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
    // $ANTLR end "rule__Expression__Group__2"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Name__Group__1__Impl"
    // InternalMyDsl.g:1220:1: rule__Name__Group__1__Impl : ( '(' ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalMyDsl.g:3044:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__MessagesAssignment_3 )* ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__2__Impl"
    // InternalMyDsl.g:4110:1: rule__Expression__Group__2__Impl : ( ( '=' )? ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1224:1: ( ( '(' ) )
            // InternalMyDsl.g:1225:1: ( '(' )
            {
            // InternalMyDsl.g:1225:1: ( '(' )
            // InternalMyDsl.g:1226:2: '('
=======
            // InternalMyDsl.g:3048:1: ( ( ( rule__Constraint__MessagesAssignment_3 )* ) )
            // InternalMyDsl.g:3049:1: ( ( rule__Constraint__MessagesAssignment_3 )* )
            {
            // InternalMyDsl.g:3049:1: ( ( rule__Constraint__MessagesAssignment_3 )* )
            // InternalMyDsl.g:3050:2: ( rule__Constraint__MessagesAssignment_3 )*
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4114:1: ( ( ( '=' )? ) )
            // InternalMyDsl.g:4115:1: ( ( '=' )? )
            {
            // InternalMyDsl.g:4115:1: ( ( '=' )? )
            // InternalMyDsl.g:4116:2: ( '=' )?
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getExpressionAccess().getEqualsSignKeyword_2()); 
            // InternalMyDsl.g:4117:2: ( '=' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==36) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:4117:3: '='
                    {
                    match(input,36,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Expression__Group__2__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Name__Group__2"
    // InternalMyDsl.g:1235:1: rule__Name__Group__2 : rule__Name__Group__2__Impl rule__Name__Group__3 ;
    public final void rule__Name__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__4"
    // InternalMyDsl.g:3059:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__3"
    // InternalMyDsl.g:4125:1: rule__Expression__Group__3 : rule__Expression__Group__3__Impl rule__Expression__Group__4 ;
    public final void rule__Expression__Group__3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1239:1: ( rule__Name__Group__2__Impl rule__Name__Group__3 )
            // InternalMyDsl.g:1240:2: rule__Name__Group__2__Impl rule__Name__Group__3
=======
            // InternalMyDsl.g:3063:1: ( rule__Constraint__Group__4__Impl )
            // InternalMyDsl.g:3064:2: rule__Constraint__Group__4__Impl
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4129:1: ( rule__Expression__Group__3__Impl rule__Expression__Group__4 )
            // InternalMyDsl.g:4130:2: rule__Expression__Group__3__Impl rule__Expression__Group__4
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_32);
            rule__Expression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__4();

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
    // $ANTLR end "rule__Expression__Group__3"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Name__Group__2__Impl"
    // InternalMyDsl.g:1247:1: rule__Name__Group__2__Impl : ( ( rule__Name__Alternatives_2 )? ) ;
    public final void rule__Name__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalMyDsl.g:3070:1: rule__Constraint__Group__4__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__3__Impl"
    // InternalMyDsl.g:4137:1: rule__Expression__Group__3__Impl : ( ( '>' )? ) ;
    public final void rule__Expression__Group__3__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1251:1: ( ( ( rule__Name__Alternatives_2 )? ) )
            // InternalMyDsl.g:1252:1: ( ( rule__Name__Alternatives_2 )? )
            {
            // InternalMyDsl.g:1252:1: ( ( rule__Name__Alternatives_2 )? )
            // InternalMyDsl.g:1253:2: ( rule__Name__Alternatives_2 )?
            {
             before(grammarAccess.getNameAccess().getAlternatives_2()); 
            // InternalMyDsl.g:1254:2: ( rule__Name__Alternatives_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_NUMBER)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1254:3: rule__Name__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Name__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNameAccess().getAlternatives_2()); 
=======
            // InternalMyDsl.g:3074:1: ( ( '}' ) )
            // InternalMyDsl.g:3075:1: ( '}' )
=======
            // InternalMyDsl.g:4141:1: ( ( ( '>' )? ) )
            // InternalMyDsl.g:4142:1: ( ( '>' )? )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4142:1: ( ( '>' )? )
            // InternalMyDsl.g:4143:2: ( '>' )?
            {
<<<<<<< HEAD
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getExpressionAccess().getGreaterThanSignKeyword_3()); 
            // InternalMyDsl.g:4144:2: ( '>' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:4144:3: '>'
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGreaterThanSignKeyword_3()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__Expression__Group__3__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Name__Group__3"
    // InternalMyDsl.g:1262:1: rule__Name__Group__3 : rule__Name__Group__3__Impl ;
    public final void rule__Name__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__Alt__Group__0"
    // InternalMyDsl.g:3086:1: rule__Alt__Group__0 : rule__Alt__Group__0__Impl rule__Alt__Group__1 ;
    public final void rule__Alt__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__4"
    // InternalMyDsl.g:4152:1: rule__Expression__Group__4 : rule__Expression__Group__4__Impl rule__Expression__Group__5 ;
    public final void rule__Expression__Group__4() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1266:1: ( rule__Name__Group__3__Impl )
            // InternalMyDsl.g:1267:2: rule__Name__Group__3__Impl
=======
            // InternalMyDsl.g:3090:1: ( rule__Alt__Group__0__Impl rule__Alt__Group__1 )
            // InternalMyDsl.g:3091:2: rule__Alt__Group__0__Impl rule__Alt__Group__1
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4156:1: ( rule__Expression__Group__4__Impl rule__Expression__Group__5 )
            // InternalMyDsl.g:4157:2: rule__Expression__Group__4__Impl rule__Expression__Group__5
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_32);
            rule__Expression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__5();

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
    // $ANTLR end "rule__Expression__Group__4"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Name__Group__3__Impl"
    // InternalMyDsl.g:1273:1: rule__Name__Group__3__Impl : ( ')' ) ;
    public final void rule__Name__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Alt__Group__0__Impl"
    // InternalMyDsl.g:3098:1: rule__Alt__Group__0__Impl : ( 'alt' ) ;
    public final void rule__Alt__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__4__Impl"
    // InternalMyDsl.g:4164:1: rule__Expression__Group__4__Impl : ( ( '<' )? ) ;
    public final void rule__Expression__Group__4__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1277:1: ( ( ')' ) )
            // InternalMyDsl.g:1278:1: ( ')' )
            {
            // InternalMyDsl.g:1278:1: ( ')' )
            // InternalMyDsl.g:1279:2: ')'
=======
            // InternalMyDsl.g:3102:1: ( ( 'alt' ) )
            // InternalMyDsl.g:3103:1: ( 'alt' )
            {
            // InternalMyDsl.g:3103:1: ( 'alt' )
            // InternalMyDsl.g:3104:2: 'alt'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4168:1: ( ( ( '<' )? ) )
            // InternalMyDsl.g:4169:1: ( ( '<' )? )
            {
            // InternalMyDsl.g:4169:1: ( ( '<' )? )
            // InternalMyDsl.g:4170:2: ( '<' )?
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getExpressionAccess().getLessThanSignKeyword_4()); 
            // InternalMyDsl.g:4171:2: ( '<' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:4171:3: '<'
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getLessThanSignKeyword_4()); 

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
    // $ANTLR end "rule__Expression__Group__4__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__ObjectType__Group__0"
    // InternalMyDsl.g:1289:1: rule__ObjectType__Group__0 : rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1 ;
    public final void rule__ObjectType__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Alt__Group__1"
    // InternalMyDsl.g:3113:1: rule__Alt__Group__1 : rule__Alt__Group__1__Impl ;
    public final void rule__Alt__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__5"
    // InternalMyDsl.g:4179:1: rule__Expression__Group__5 : rule__Expression__Group__5__Impl rule__Expression__Group__6 ;
    public final void rule__Expression__Group__5() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1293:1: ( rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1 )
            // InternalMyDsl.g:1294:2: rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1
=======
            // InternalMyDsl.g:3117:1: ( rule__Alt__Group__1__Impl )
            // InternalMyDsl.g:3118:2: rule__Alt__Group__1__Impl
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4183:1: ( rule__Expression__Group__5__Impl rule__Expression__Group__6 )
            // InternalMyDsl.g:4184:2: rule__Expression__Group__5__Impl rule__Expression__Group__6
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_32);
            rule__Expression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__6();

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
    // $ANTLR end "rule__Expression__Group__5"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__ObjectType__Group__0__Impl"
    // InternalMyDsl.g:1301:1: rule__ObjectType__Group__0__Impl : ( 'object' ) ;
    public final void rule__ObjectType__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Alt__Group__1__Impl"
    // InternalMyDsl.g:3124:1: rule__Alt__Group__1__Impl : ( ( rule__Alt__ExpressionsAssignment_1 )* ) ;
    public final void rule__Alt__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__5__Impl"
    // InternalMyDsl.g:4191:1: rule__Expression__Group__5__Impl : ( ( '>=' )? ) ;
    public final void rule__Expression__Group__5__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1305:1: ( ( 'object' ) )
            // InternalMyDsl.g:1306:1: ( 'object' )
            {
            // InternalMyDsl.g:1306:1: ( 'object' )
            // InternalMyDsl.g:1307:2: 'object'
=======
            // InternalMyDsl.g:3128:1: ( ( ( rule__Alt__ExpressionsAssignment_1 )* ) )
            // InternalMyDsl.g:3129:1: ( ( rule__Alt__ExpressionsAssignment_1 )* )
            {
            // InternalMyDsl.g:3129:1: ( ( rule__Alt__ExpressionsAssignment_1 )* )
            // InternalMyDsl.g:3130:2: ( rule__Alt__ExpressionsAssignment_1 )*
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4195:1: ( ( ( '>=' )? ) )
            // InternalMyDsl.g:4196:1: ( ( '>=' )? )
            {
            // InternalMyDsl.g:4196:1: ( ( '>=' )? )
            // InternalMyDsl.g:4197:2: ( '>=' )?
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getExpressionAccess().getGreaterThanSignEqualsSignKeyword_5()); 
            // InternalMyDsl.g:4198:2: ( '>=' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:4198:3: '>='
                    {
                    match(input,39,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGreaterThanSignEqualsSignKeyword_5()); 

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
    // $ANTLR end "rule__Expression__Group__5__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__ObjectType__Group__1"
    // InternalMyDsl.g:1316:1: rule__ObjectType__Group__1 : rule__ObjectType__Group__1__Impl ;
    public final void rule__ObjectType__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__0"
    // InternalMyDsl.g:3140:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__6"
    // InternalMyDsl.g:4206:1: rule__Expression__Group__6 : rule__Expression__Group__6__Impl rule__Expression__Group__7 ;
    public final void rule__Expression__Group__6() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1320:1: ( rule__ObjectType__Group__1__Impl )
            // InternalMyDsl.g:1321:2: rule__ObjectType__Group__1__Impl
=======
            // InternalMyDsl.g:3144:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMyDsl.g:3145:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4210:1: ( rule__Expression__Group__6__Impl rule__Expression__Group__7 )
            // InternalMyDsl.g:4211:2: rule__Expression__Group__6__Impl rule__Expression__Group__7
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_32);
            rule__Expression__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__7();

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
    // $ANTLR end "rule__Expression__Group__6"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__ObjectType__Group__1__Impl"
    // InternalMyDsl.g:1327:1: rule__ObjectType__Group__1__Impl : ( ( rule__ObjectType__NameAssignment_1 ) ) ;
    public final void rule__ObjectType__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMyDsl.g:3152:1: rule__Expression__Group__0__Impl : ( '(' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__6__Impl"
    // InternalMyDsl.g:4218:1: rule__Expression__Group__6__Impl : ( ( '<=' )? ) ;
    public final void rule__Expression__Group__6__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1331:1: ( ( ( rule__ObjectType__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1332:1: ( ( rule__ObjectType__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1332:1: ( ( rule__ObjectType__NameAssignment_1 ) )
            // InternalMyDsl.g:1333:2: ( rule__ObjectType__NameAssignment_1 )
            {
             before(grammarAccess.getObjectTypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1334:2: ( rule__ObjectType__NameAssignment_1 )
            // InternalMyDsl.g:1334:3: rule__ObjectType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectTypeAccess().getNameAssignment_1()); 
=======
            // InternalMyDsl.g:3156:1: ( ( '(' ) )
            // InternalMyDsl.g:3157:1: ( '(' )
=======
            // InternalMyDsl.g:4222:1: ( ( ( '<=' )? ) )
            // InternalMyDsl.g:4223:1: ( ( '<=' )? )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4223:1: ( ( '<=' )? )
            // InternalMyDsl.g:4224:2: ( '<=' )?
            {
<<<<<<< HEAD
             before(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getExpressionAccess().getLessThanSignEqualsSignKeyword_6()); 
            // InternalMyDsl.g:4225:2: ( '<=' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==40) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:4225:3: '<='
                    {
                    match(input,40,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getLessThanSignEqualsSignKeyword_6()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__Expression__Group__6__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Object__Group__0"
    // InternalMyDsl.g:1343:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__1"
    // InternalMyDsl.g:3167:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__7"
    // InternalMyDsl.g:4233:1: rule__Expression__Group__7 : rule__Expression__Group__7__Impl rule__Expression__Group__8 ;
    public final void rule__Expression__Group__7() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1347:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalMyDsl.g:1348:2: rule__Object__Group__0__Impl rule__Object__Group__1
=======
            // InternalMyDsl.g:3171:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // InternalMyDsl.g:3172:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4237:1: ( rule__Expression__Group__7__Impl rule__Expression__Group__8 )
            // InternalMyDsl.g:4238:2: rule__Expression__Group__7__Impl rule__Expression__Group__8
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_32);
            rule__Expression__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__8();

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
    // $ANTLR end "rule__Expression__Group__7"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalMyDsl.g:1355:1: rule__Object__Group__0__Impl : ( ( rule__Object__ObjectAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMyDsl.g:3179:1: rule__Expression__Group__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__7__Impl"
    // InternalMyDsl.g:4245:1: rule__Expression__Group__7__Impl : ( ( rule__Expression__Alternatives_7 )? ) ;
    public final void rule__Expression__Group__7__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1359:1: ( ( ( rule__Object__ObjectAssignment_0 ) ) )
            // InternalMyDsl.g:1360:1: ( ( rule__Object__ObjectAssignment_0 ) )
            {
            // InternalMyDsl.g:1360:1: ( ( rule__Object__ObjectAssignment_0 ) )
            // InternalMyDsl.g:1361:2: ( rule__Object__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectAccess().getObjectAssignment_0()); 
            // InternalMyDsl.g:1362:2: ( rule__Object__ObjectAssignment_0 )
            // InternalMyDsl.g:1362:3: rule__Object__ObjectAssignment_0
=======
            // InternalMyDsl.g:3183:1: ( ( ( RULE_ID )? ) )
            // InternalMyDsl.g:3184:1: ( ( RULE_ID )? )
            {
            // InternalMyDsl.g:3184:1: ( ( RULE_ID )? )
            // InternalMyDsl.g:3185:2: ( RULE_ID )?
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4249:1: ( ( ( rule__Expression__Alternatives_7 )? ) )
            // InternalMyDsl.g:4250:1: ( ( rule__Expression__Alternatives_7 )? )
            {
            // InternalMyDsl.g:4250:1: ( ( rule__Expression__Alternatives_7 )? )
            // InternalMyDsl.g:4251:2: ( rule__Expression__Alternatives_7 )?
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_7()); 
            // InternalMyDsl.g:4252:2: ( rule__Expression__Alternatives_7 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_NUMBER)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:4252:3: rule__Expression__Alternatives_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Alternatives_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getAlternatives_7()); 

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
    // $ANTLR end "rule__Expression__Group__7__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Object__Group__1"
    // InternalMyDsl.g:1370:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__2"
    // InternalMyDsl.g:3194:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl rule__Expression__Group__3 ;
    public final void rule__Expression__Group__2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__8"
    // InternalMyDsl.g:4260:1: rule__Expression__Group__8 : rule__Expression__Group__8__Impl rule__Expression__Group__9 ;
    public final void rule__Expression__Group__8() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1374:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalMyDsl.g:1375:2: rule__Object__Group__1__Impl rule__Object__Group__2
=======
            // InternalMyDsl.g:3198:1: ( rule__Expression__Group__2__Impl rule__Expression__Group__3 )
            // InternalMyDsl.g:3199:2: rule__Expression__Group__2__Impl rule__Expression__Group__3
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4264:1: ( rule__Expression__Group__8__Impl rule__Expression__Group__9 )
            // InternalMyDsl.g:4265:2: rule__Expression__Group__8__Impl rule__Expression__Group__9
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_4);
            rule__Expression__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__9();

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
    // $ANTLR end "rule__Expression__Group__8"

<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalMyDsl.g:1382:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__2__Impl"
    // InternalMyDsl.g:3206:1: rule__Expression__Group__2__Impl : ( ( '=' )? ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======

    // $ANTLR start "rule__Expression__Group__8__Impl"
    // InternalMyDsl.g:4272:1: rule__Expression__Group__8__Impl : ( ')' ) ;
    public final void rule__Expression__Group__8__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1386:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1387:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1387:1: ( ( rule__Object__NameAssignment_1 ) )
            // InternalMyDsl.g:1388:2: ( rule__Object__NameAssignment_1 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1389:2: ( rule__Object__NameAssignment_1 )
            // InternalMyDsl.g:1389:3: rule__Object__NameAssignment_1
=======
            // InternalMyDsl.g:3210:1: ( ( ( '=' )? ) )
            // InternalMyDsl.g:3211:1: ( ( '=' )? )
            {
            // InternalMyDsl.g:3211:1: ( ( '=' )? )
            // InternalMyDsl.g:3212:2: ( '=' )?
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4276:1: ( ( ')' ) )
            // InternalMyDsl.g:4277:1: ( ')' )
            {
            // InternalMyDsl.g:4277:1: ( ')' )
            // InternalMyDsl.g:4278:2: ')'
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_8()); 

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
    // $ANTLR end "rule__Expression__Group__8__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Object__Group__2"
    // InternalMyDsl.g:1397:1: rule__Object__Group__2 : rule__Object__Group__2__Impl ;
    public final void rule__Object__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__3"
    // InternalMyDsl.g:3221:1: rule__Expression__Group__3 : rule__Expression__Group__3__Impl rule__Expression__Group__4 ;
    public final void rule__Expression__Group__3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__9"
    // InternalMyDsl.g:4287:1: rule__Expression__Group__9 : rule__Expression__Group__9__Impl rule__Expression__Group__10 ;
    public final void rule__Expression__Group__9() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1401:1: ( rule__Object__Group__2__Impl )
            // InternalMyDsl.g:1402:2: rule__Object__Group__2__Impl
=======
            // InternalMyDsl.g:3225:1: ( rule__Expression__Group__3__Impl rule__Expression__Group__4 )
            // InternalMyDsl.g:3226:2: rule__Expression__Group__3__Impl rule__Expression__Group__4
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4291:1: ( rule__Expression__Group__9__Impl rule__Expression__Group__10 )
            // InternalMyDsl.g:4292:2: rule__Expression__Group__9__Impl rule__Expression__Group__10
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_29);
            rule__Expression__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__10();

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
    // $ANTLR end "rule__Expression__Group__9"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalMyDsl.g:1408:1: rule__Object__Group__2__Impl : ( ';' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__3__Impl"
    // InternalMyDsl.g:3233:1: rule__Expression__Group__3__Impl : ( ( '>' )? ) ;
    public final void rule__Expression__Group__3__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__9__Impl"
    // InternalMyDsl.g:4299:1: rule__Expression__Group__9__Impl : ( '{' ) ;
    public final void rule__Expression__Group__9__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1412:1: ( ( ';' ) )
            // InternalMyDsl.g:1413:1: ( ';' )
            {
            // InternalMyDsl.g:1413:1: ( ';' )
            // InternalMyDsl.g:1414:2: ';'
=======
            // InternalMyDsl.g:3237:1: ( ( ( '>' )? ) )
            // InternalMyDsl.g:3238:1: ( ( '>' )? )
            {
            // InternalMyDsl.g:3238:1: ( ( '>' )? )
            // InternalMyDsl.g:3239:2: ( '>' )?
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4303:1: ( ( '{' ) )
            // InternalMyDsl.g:4304:1: ( '{' )
            {
            // InternalMyDsl.g:4304:1: ( '{' )
            // InternalMyDsl.g:4305:2: '{'
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Expression__Group__9__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Constraint__Group__0"
    // InternalMyDsl.g:1424:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__4"
    // InternalMyDsl.g:3248:1: rule__Expression__Group__4 : rule__Expression__Group__4__Impl rule__Expression__Group__5 ;
    public final void rule__Expression__Group__4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__10"
    // InternalMyDsl.g:4314:1: rule__Expression__Group__10 : rule__Expression__Group__10__Impl rule__Expression__Group__11 ;
    public final void rule__Expression__Group__10() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1428:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalMyDsl.g:1429:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
=======
            // InternalMyDsl.g:3252:1: ( rule__Expression__Group__4__Impl rule__Expression__Group__5 )
            // InternalMyDsl.g:3253:2: rule__Expression__Group__4__Impl rule__Expression__Group__5
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4318:1: ( rule__Expression__Group__10__Impl rule__Expression__Group__11 )
            // InternalMyDsl.g:4319:2: rule__Expression__Group__10__Impl rule__Expression__Group__11
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_29);
            rule__Expression__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__11();

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
    // $ANTLR end "rule__Expression__Group__10"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalMyDsl.g:1436:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__4__Impl"
    // InternalMyDsl.g:3260:1: rule__Expression__Group__4__Impl : ( ( '<' )? ) ;
    public final void rule__Expression__Group__4__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__10__Impl"
    // InternalMyDsl.g:4326:1: rule__Expression__Group__10__Impl : ( ( rule__Expression__MessagesAssignment_10 )* ) ;
    public final void rule__Expression__Group__10__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1440:1: ( ( 'constraint' ) )
            // InternalMyDsl.g:1441:1: ( 'constraint' )
            {
            // InternalMyDsl.g:1441:1: ( 'constraint' )
            // InternalMyDsl.g:1442:2: 'constraint'
=======
            // InternalMyDsl.g:3264:1: ( ( ( '<' )? ) )
            // InternalMyDsl.g:3265:1: ( ( '<' )? )
            {
            // InternalMyDsl.g:3265:1: ( ( '<' )? )
            // InternalMyDsl.g:3266:2: ( '<' )?
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4330:1: ( ( ( rule__Expression__MessagesAssignment_10 )* ) )
            // InternalMyDsl.g:4331:1: ( ( rule__Expression__MessagesAssignment_10 )* )
            {
            // InternalMyDsl.g:4331:1: ( ( rule__Expression__MessagesAssignment_10 )* )
            // InternalMyDsl.g:4332:2: ( rule__Expression__MessagesAssignment_10 )*
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getExpressionAccess().getMessagesAssignment_10()); 
            // InternalMyDsl.g:4333:2: ( rule__Expression__MessagesAssignment_10 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==29) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMyDsl.g:4333:3: rule__Expression__MessagesAssignment_10
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Expression__MessagesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getMessagesAssignment_10()); 

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
    // $ANTLR end "rule__Expression__Group__10__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Constraint__Group__1"
    // InternalMyDsl.g:1451:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__5"
    // InternalMyDsl.g:3275:1: rule__Expression__Group__5 : rule__Expression__Group__5__Impl rule__Expression__Group__6 ;
    public final void rule__Expression__Group__5() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__11"
    // InternalMyDsl.g:4341:1: rule__Expression__Group__11 : rule__Expression__Group__11__Impl ;
    public final void rule__Expression__Group__11() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1455:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalMyDsl.g:1456:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
=======
            // InternalMyDsl.g:3279:1: ( rule__Expression__Group__5__Impl rule__Expression__Group__6 )
            // InternalMyDsl.g:3280:2: rule__Expression__Group__5__Impl rule__Expression__Group__6
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4345:1: ( rule__Expression__Group__11__Impl )
            // InternalMyDsl.g:4346:2: rule__Expression__Group__11__Impl
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__11__Impl();

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
    // $ANTLR end "rule__Expression__Group__11"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalMyDsl.g:1463:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__5__Impl"
    // InternalMyDsl.g:3287:1: rule__Expression__Group__5__Impl : ( ( '>=' )? ) ;
    public final void rule__Expression__Group__5__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Expression__Group__11__Impl"
    // InternalMyDsl.g:4352:1: rule__Expression__Group__11__Impl : ( '}' ) ;
    public final void rule__Expression__Group__11__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1467:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1468:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1468:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalMyDsl.g:1469:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1470:2: ( rule__Constraint__NameAssignment_1 )
            // InternalMyDsl.g:1470:3: rule__Constraint__NameAssignment_1
=======
            // InternalMyDsl.g:3291:1: ( ( ( '>=' )? ) )
            // InternalMyDsl.g:3292:1: ( ( '>=' )? )
            {
            // InternalMyDsl.g:3292:1: ( ( '>=' )? )
            // InternalMyDsl.g:3293:2: ( '>=' )?
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4356:1: ( ( '}' ) )
            // InternalMyDsl.g:4357:1: ( '}' )
            {
            // InternalMyDsl.g:4357:1: ( '}' )
            // InternalMyDsl.g:4358:2: '}'
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getExpressionAccess().getRightCurlyBracketKeyword_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Expression__Group__11__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Constraint__Group__2"
    // InternalMyDsl.g:1478:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__6"
    // InternalMyDsl.g:3302:1: rule__Expression__Group__6 : rule__Expression__Group__6__Impl rule__Expression__Group__7 ;
    public final void rule__Expression__Group__6() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Par__Group__0"
    // InternalMyDsl.g:4368:1: rule__Par__Group__0 : rule__Par__Group__0__Impl rule__Par__Group__1 ;
    public final void rule__Par__Group__0() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1482:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalMyDsl.g:1483:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
=======
            // InternalMyDsl.g:3306:1: ( rule__Expression__Group__6__Impl rule__Expression__Group__7 )
            // InternalMyDsl.g:3307:2: rule__Expression__Group__6__Impl rule__Expression__Group__7
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4372:1: ( rule__Par__Group__0__Impl rule__Par__Group__1 )
            // InternalMyDsl.g:4373:2: rule__Par__Group__0__Impl rule__Par__Group__1
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_4);
            rule__Par__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Par__Group__1();

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
    // $ANTLR end "rule__Par__Group__0"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalMyDsl.g:1490:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__6__Impl"
    // InternalMyDsl.g:3314:1: rule__Expression__Group__6__Impl : ( ( '<=' )? ) ;
    public final void rule__Expression__Group__6__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Par__Group__0__Impl"
    // InternalMyDsl.g:4380:1: rule__Par__Group__0__Impl : ( 'par' ) ;
    public final void rule__Par__Group__0__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1494:1: ( ( '{' ) )
            // InternalMyDsl.g:1495:1: ( '{' )
            {
            // InternalMyDsl.g:1495:1: ( '{' )
            // InternalMyDsl.g:1496:2: '{'
=======
            // InternalMyDsl.g:3318:1: ( ( ( '<=' )? ) )
            // InternalMyDsl.g:3319:1: ( ( '<=' )? )
            {
            // InternalMyDsl.g:3319:1: ( ( '<=' )? )
            // InternalMyDsl.g:3320:2: ( '<=' )?
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4384:1: ( ( 'par' ) )
            // InternalMyDsl.g:4385:1: ( 'par' )
            {
            // InternalMyDsl.g:4385:1: ( 'par' )
            // InternalMyDsl.g:4386:2: 'par'
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getParAccess().getParKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getParAccess().getParKeyword_0()); 

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
    // $ANTLR end "rule__Par__Group__0__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Constraint__Group__3"
    // InternalMyDsl.g:1505:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__7"
    // InternalMyDsl.g:3329:1: rule__Expression__Group__7 : rule__Expression__Group__7__Impl rule__Expression__Group__8 ;
    public final void rule__Expression__Group__7() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Par__Group__1"
    // InternalMyDsl.g:4395:1: rule__Par__Group__1 : rule__Par__Group__1__Impl rule__Par__Group__2 ;
    public final void rule__Par__Group__1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1509:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalMyDsl.g:1510:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
=======
            // InternalMyDsl.g:3333:1: ( rule__Expression__Group__7__Impl rule__Expression__Group__8 )
            // InternalMyDsl.g:3334:2: rule__Expression__Group__7__Impl rule__Expression__Group__8
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4399:1: ( rule__Par__Group__1__Impl rule__Par__Group__2 )
            // InternalMyDsl.g:4400:2: rule__Par__Group__1__Impl rule__Par__Group__2
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_33);
            rule__Par__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Par__Group__2();

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
    // $ANTLR end "rule__Par__Group__1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalMyDsl.g:1517:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__MessagesAssignment_3 )* ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__7__Impl"
    // InternalMyDsl.g:3341:1: rule__Expression__Group__7__Impl : ( ( rule__Expression__Alternatives_7 )? ) ;
    public final void rule__Expression__Group__7__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Par__Group__1__Impl"
    // InternalMyDsl.g:4407:1: rule__Par__Group__1__Impl : ( '{' ) ;
    public final void rule__Par__Group__1__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1521:1: ( ( ( rule__Constraint__MessagesAssignment_3 )* ) )
            // InternalMyDsl.g:1522:1: ( ( rule__Constraint__MessagesAssignment_3 )* )
            {
            // InternalMyDsl.g:1522:1: ( ( rule__Constraint__MessagesAssignment_3 )* )
            // InternalMyDsl.g:1523:2: ( rule__Constraint__MessagesAssignment_3 )*
            {
             before(grammarAccess.getConstraintAccess().getMessagesAssignment_3()); 
            // InternalMyDsl.g:1524:2: ( rule__Constraint__MessagesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1524:3: rule__Constraint__MessagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Constraint__MessagesAssignment_3();
=======
            // InternalMyDsl.g:3345:1: ( ( ( rule__Expression__Alternatives_7 )? ) )
            // InternalMyDsl.g:3346:1: ( ( rule__Expression__Alternatives_7 )? )
=======
            // InternalMyDsl.g:4411:1: ( ( '{' ) )
            // InternalMyDsl.g:4412:1: ( '{' )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4412:1: ( '{' )
            // InternalMyDsl.g:4413:2: '{'
            {
<<<<<<< HEAD
             before(grammarAccess.getExpressionAccess().getAlternatives_7()); 
            // InternalMyDsl.g:3348:2: ( rule__Expression__Alternatives_7 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_NUMBER)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:3348:3: rule__Expression__Alternatives_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Alternatives_7();
>>>>>>> Added Xtext for context dependent behavior

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getAlternatives_7()); 
=======
             before(grammarAccess.getParAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getParAccess().getLeftCurlyBracketKeyword_1()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__Par__Group__1__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Constraint__Group__4"
    // InternalMyDsl.g:1532:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__8"
    // InternalMyDsl.g:3356:1: rule__Expression__Group__8 : rule__Expression__Group__8__Impl rule__Expression__Group__9 ;
    public final void rule__Expression__Group__8() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Par__Group__2"
    // InternalMyDsl.g:4422:1: rule__Par__Group__2 : rule__Par__Group__2__Impl rule__Par__Group__3 ;
    public final void rule__Par__Group__2() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1536:1: ( rule__Constraint__Group__4__Impl )
            // InternalMyDsl.g:1537:2: rule__Constraint__Group__4__Impl
=======
            // InternalMyDsl.g:3360:1: ( rule__Expression__Group__8__Impl rule__Expression__Group__9 )
            // InternalMyDsl.g:3361:2: rule__Expression__Group__8__Impl rule__Expression__Group__9
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4426:1: ( rule__Par__Group__2__Impl rule__Par__Group__3 )
            // InternalMyDsl.g:4427:2: rule__Par__Group__2__Impl rule__Par__Group__3
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_33);
            rule__Par__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Par__Group__3();

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
    // $ANTLR end "rule__Par__Group__2"


    // $ANTLR start "rule__Par__Group__2__Impl"
    // InternalMyDsl.g:4434:1: rule__Par__Group__2__Impl : ( ( rule__Par__ParexpressionAssignment_2 )* ) ;
    public final void rule__Par__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4438:1: ( ( ( rule__Par__ParexpressionAssignment_2 )* ) )
            // InternalMyDsl.g:4439:1: ( ( rule__Par__ParexpressionAssignment_2 )* )
            {
            // InternalMyDsl.g:4439:1: ( ( rule__Par__ParexpressionAssignment_2 )* )
            // InternalMyDsl.g:4440:2: ( rule__Par__ParexpressionAssignment_2 )*
            {
             before(grammarAccess.getParAccess().getParexpressionAssignment_2()); 
            // InternalMyDsl.g:4441:2: ( rule__Par__ParexpressionAssignment_2 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==42) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMyDsl.g:4441:3: rule__Par__ParexpressionAssignment_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Par__ParexpressionAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalMyDsl.g:1543:1: rule__Constraint__Group__4__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__8__Impl"
    // InternalMyDsl.g:3368:1: rule__Expression__Group__8__Impl : ( ')' ) ;
    public final void rule__Expression__Group__8__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1547:1: ( ( '}' ) )
            // InternalMyDsl.g:1548:1: ( '}' )
            {
            // InternalMyDsl.g:1548:1: ( '}' )
            // InternalMyDsl.g:1549:2: '}'
=======
            // InternalMyDsl.g:3372:1: ( ( ')' ) )
            // InternalMyDsl.g:3373:1: ( ')' )
            {
            // InternalMyDsl.g:3373:1: ( ')' )
            // InternalMyDsl.g:3374:2: ')'
>>>>>>> Added Xtext for context dependent behavior
            {
             before(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_8()); 
=======
            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getParAccess().getParexpressionAssignment_2()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__Par__Group__2__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Alt__Group__0"
    // InternalMyDsl.g:1559:1: rule__Alt__Group__0 : rule__Alt__Group__0__Impl rule__Alt__Group__1 ;
    public final void rule__Alt__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__9"
    // InternalMyDsl.g:3383:1: rule__Expression__Group__9 : rule__Expression__Group__9__Impl rule__Expression__Group__10 ;
    public final void rule__Expression__Group__9() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Par__Group__3"
    // InternalMyDsl.g:4449:1: rule__Par__Group__3 : rule__Par__Group__3__Impl ;
    public final void rule__Par__Group__3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1563:1: ( rule__Alt__Group__0__Impl rule__Alt__Group__1 )
            // InternalMyDsl.g:1564:2: rule__Alt__Group__0__Impl rule__Alt__Group__1
=======
            // InternalMyDsl.g:3387:1: ( rule__Expression__Group__9__Impl rule__Expression__Group__10 )
            // InternalMyDsl.g:3388:2: rule__Expression__Group__9__Impl rule__Expression__Group__10
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4453:1: ( rule__Par__Group__3__Impl )
            // InternalMyDsl.g:4454:2: rule__Par__Group__3__Impl
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_2);
            rule__Par__Group__3__Impl();

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
    // $ANTLR end "rule__Par__Group__3"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Alt__Group__0__Impl"
    // InternalMyDsl.g:1571:1: rule__Alt__Group__0__Impl : ( 'alt' ) ;
    public final void rule__Alt__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__9__Impl"
    // InternalMyDsl.g:3395:1: rule__Expression__Group__9__Impl : ( '{' ) ;
    public final void rule__Expression__Group__9__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Par__Group__3__Impl"
    // InternalMyDsl.g:4460:1: rule__Par__Group__3__Impl : ( '}' ) ;
    public final void rule__Par__Group__3__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1575:1: ( ( 'alt' ) )
            // InternalMyDsl.g:1576:1: ( 'alt' )
            {
            // InternalMyDsl.g:1576:1: ( 'alt' )
            // InternalMyDsl.g:1577:2: 'alt'
=======
            // InternalMyDsl.g:3399:1: ( ( '{' ) )
            // InternalMyDsl.g:3400:1: ( '{' )
            {
            // InternalMyDsl.g:3400:1: ( '{' )
            // InternalMyDsl.g:3401:2: '{'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4464:1: ( ( '}' ) )
            // InternalMyDsl.g:4465:1: ( '}' )
            {
            // InternalMyDsl.g:4465:1: ( '}' )
            // InternalMyDsl.g:4466:2: '}'
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getParAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getParAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Par__Group__3__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Alt__Group__1"
    // InternalMyDsl.g:1586:1: rule__Alt__Group__1 : rule__Alt__Group__1__Impl ;
    public final void rule__Alt__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__10"
    // InternalMyDsl.g:3410:1: rule__Expression__Group__10 : rule__Expression__Group__10__Impl rule__Expression__Group__11 ;
    public final void rule__Expression__Group__10() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ParExpression__Group__0"
    // InternalMyDsl.g:4476:1: rule__ParExpression__Group__0 : rule__ParExpression__Group__0__Impl rule__ParExpression__Group__1 ;
    public final void rule__ParExpression__Group__0() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1590:1: ( rule__Alt__Group__1__Impl )
            // InternalMyDsl.g:1591:2: rule__Alt__Group__1__Impl
=======
            // InternalMyDsl.g:3414:1: ( rule__Expression__Group__10__Impl rule__Expression__Group__11 )
            // InternalMyDsl.g:3415:2: rule__Expression__Group__10__Impl rule__Expression__Group__11
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4480:1: ( rule__ParExpression__Group__0__Impl rule__ParExpression__Group__1 )
            // InternalMyDsl.g:4481:2: rule__ParExpression__Group__0__Impl rule__ParExpression__Group__1
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_3);
            rule__ParExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParExpression__Group__1();

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
    // $ANTLR end "rule__ParExpression__Group__0"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Alt__Group__1__Impl"
    // InternalMyDsl.g:1597:1: rule__Alt__Group__1__Impl : ( ( rule__Alt__ExpressionsAssignment_1 )* ) ;
    public final void rule__Alt__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__10__Impl"
    // InternalMyDsl.g:3422:1: rule__Expression__Group__10__Impl : ( ( rule__Expression__MessagesAssignment_10 )* ) ;
    public final void rule__Expression__Group__10__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ParExpression__Group__0__Impl"
    // InternalMyDsl.g:4488:1: rule__ParExpression__Group__0__Impl : ( 'case' ) ;
    public final void rule__ParExpression__Group__0__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1601:1: ( ( ( rule__Alt__ExpressionsAssignment_1 )* ) )
            // InternalMyDsl.g:1602:1: ( ( rule__Alt__ExpressionsAssignment_1 )* )
            {
            // InternalMyDsl.g:1602:1: ( ( rule__Alt__ExpressionsAssignment_1 )* )
            // InternalMyDsl.g:1603:2: ( rule__Alt__ExpressionsAssignment_1 )*
            {
             before(grammarAccess.getAltAccess().getExpressionsAssignment_1()); 
            // InternalMyDsl.g:1604:2: ( rule__Alt__ExpressionsAssignment_1 )*
            loop19:
=======
            // InternalMyDsl.g:3426:1: ( ( ( rule__Expression__MessagesAssignment_10 )* ) )
            // InternalMyDsl.g:3427:1: ( ( rule__Expression__MessagesAssignment_10 )* )
=======
            // InternalMyDsl.g:4492:1: ( ( 'case' ) )
            // InternalMyDsl.g:4493:1: ( 'case' )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4493:1: ( 'case' )
            // InternalMyDsl.g:4494:2: 'case'
            {
<<<<<<< HEAD
             before(grammarAccess.getExpressionAccess().getMessagesAssignment_10()); 
            // InternalMyDsl.g:3429:2: ( rule__Expression__MessagesAssignment_10 )*
            loop38:
>>>>>>> Added Xtext for context dependent behavior
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==29) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
<<<<<<< HEAD
            	    // InternalMyDsl.g:1604:3: rule__Alt__ExpressionsAssignment_1
=======
            	    // InternalMyDsl.g:3429:3: rule__Expression__MessagesAssignment_10
>>>>>>> Added Xtext for context dependent behavior
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Expression__MessagesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getMessagesAssignment_10()); 
=======
             before(grammarAccess.getParExpressionAccess().getCaseKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParExpressionAccess().getCaseKeyword_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__ParExpression__Group__0__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__0"
    // InternalMyDsl.g:1613:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__11"
    // InternalMyDsl.g:3437:1: rule__Expression__Group__11 : rule__Expression__Group__11__Impl ;
    public final void rule__Expression__Group__11() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ParExpression__Group__1"
    // InternalMyDsl.g:4503:1: rule__ParExpression__Group__1 : rule__ParExpression__Group__1__Impl rule__ParExpression__Group__2 ;
    public final void rule__ParExpression__Group__1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1617:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMyDsl.g:1618:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
=======
            // InternalMyDsl.g:3441:1: ( rule__Expression__Group__11__Impl )
            // InternalMyDsl.g:3442:2: rule__Expression__Group__11__Impl
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4507:1: ( rule__ParExpression__Group__1__Impl rule__ParExpression__Group__2 )
            // InternalMyDsl.g:4508:2: rule__ParExpression__Group__1__Impl rule__ParExpression__Group__2
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_4);
            rule__ParExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParExpression__Group__2();

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
    // $ANTLR end "rule__ParExpression__Group__1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMyDsl.g:1625:1: rule__Expression__Group__0__Impl : ( '(' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__11__Impl"
    // InternalMyDsl.g:3448:1: rule__Expression__Group__11__Impl : ( '}' ) ;
    public final void rule__Expression__Group__11__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ParExpression__Group__1__Impl"
    // InternalMyDsl.g:4515:1: rule__ParExpression__Group__1__Impl : ( ( rule__ParExpression__NameAssignment_1 ) ) ;
    public final void rule__ParExpression__Group__1__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1629:1: ( ( '(' ) )
            // InternalMyDsl.g:1630:1: ( '(' )
            {
            // InternalMyDsl.g:1630:1: ( '(' )
            // InternalMyDsl.g:1631:2: '('
=======
            // InternalMyDsl.g:3452:1: ( ( '}' ) )
            // InternalMyDsl.g:3453:1: ( '}' )
            {
            // InternalMyDsl.g:3453:1: ( '}' )
            // InternalMyDsl.g:3454:2: '}'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4519:1: ( ( ( rule__ParExpression__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4520:1: ( ( rule__ParExpression__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4520:1: ( ( rule__ParExpression__NameAssignment_1 ) )
            // InternalMyDsl.g:4521:2: ( rule__ParExpression__NameAssignment_1 )
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getParExpressionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4522:2: ( rule__ParExpression__NameAssignment_1 )
            // InternalMyDsl.g:4522:3: rule__ParExpression__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParExpression__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParExpressionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ParExpression__Group__1__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__1"
    // InternalMyDsl.g:1640:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Par__Group__0"
    // InternalMyDsl.g:3464:1: rule__Par__Group__0 : rule__Par__Group__0__Impl rule__Par__Group__1 ;
    public final void rule__Par__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ParExpression__Group__2"
    // InternalMyDsl.g:4530:1: rule__ParExpression__Group__2 : rule__ParExpression__Group__2__Impl rule__ParExpression__Group__3 ;
    public final void rule__ParExpression__Group__2() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1644:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // InternalMyDsl.g:1645:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
=======
            // InternalMyDsl.g:3468:1: ( rule__Par__Group__0__Impl rule__Par__Group__1 )
            // InternalMyDsl.g:3469:2: rule__Par__Group__0__Impl rule__Par__Group__1
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4534:1: ( rule__ParExpression__Group__2__Impl rule__ParExpression__Group__3 )
            // InternalMyDsl.g:4535:2: rule__ParExpression__Group__2__Impl rule__ParExpression__Group__3
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_29);
            rule__ParExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParExpression__Group__3();

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
    // $ANTLR end "rule__ParExpression__Group__2"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMyDsl.g:1652:1: rule__Expression__Group__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Par__Group__0__Impl"
    // InternalMyDsl.g:3476:1: rule__Par__Group__0__Impl : ( 'par' ) ;
    public final void rule__Par__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ParExpression__Group__2__Impl"
    // InternalMyDsl.g:4542:1: rule__ParExpression__Group__2__Impl : ( '{' ) ;
    public final void rule__ParExpression__Group__2__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1656:1: ( ( ( RULE_ID )? ) )
            // InternalMyDsl.g:1657:1: ( ( RULE_ID )? )
            {
            // InternalMyDsl.g:1657:1: ( ( RULE_ID )? )
            // InternalMyDsl.g:1658:2: ( RULE_ID )?
            {
             before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1()); 
            // InternalMyDsl.g:1659:2: ( RULE_ID )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1659:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1()); 
=======
            // InternalMyDsl.g:3480:1: ( ( 'par' ) )
            // InternalMyDsl.g:3481:1: ( 'par' )
=======
            // InternalMyDsl.g:4546:1: ( ( '{' ) )
            // InternalMyDsl.g:4547:1: ( '{' )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4547:1: ( '{' )
            // InternalMyDsl.g:4548:2: '{'
            {
<<<<<<< HEAD
             before(grammarAccess.getParAccess().getParKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getParAccess().getParKeyword_0()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getParExpressionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getParExpressionAccess().getLeftCurlyBracketKeyword_2()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__ParExpression__Group__2__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__2"
    // InternalMyDsl.g:1667:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl rule__Expression__Group__3 ;
    public final void rule__Expression__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Par__Group__1"
    // InternalMyDsl.g:3491:1: rule__Par__Group__1 : rule__Par__Group__1__Impl rule__Par__Group__2 ;
    public final void rule__Par__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ParExpression__Group__3"
    // InternalMyDsl.g:4557:1: rule__ParExpression__Group__3 : rule__ParExpression__Group__3__Impl rule__ParExpression__Group__4 ;
    public final void rule__ParExpression__Group__3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1671:1: ( rule__Expression__Group__2__Impl rule__Expression__Group__3 )
            // InternalMyDsl.g:1672:2: rule__Expression__Group__2__Impl rule__Expression__Group__3
=======
            // InternalMyDsl.g:3495:1: ( rule__Par__Group__1__Impl rule__Par__Group__2 )
            // InternalMyDsl.g:3496:2: rule__Par__Group__1__Impl rule__Par__Group__2
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4561:1: ( rule__ParExpression__Group__3__Impl rule__ParExpression__Group__4 )
            // InternalMyDsl.g:4562:2: rule__ParExpression__Group__3__Impl rule__ParExpression__Group__4
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_29);
            rule__ParExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParExpression__Group__4();

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
    // $ANTLR end "rule__ParExpression__Group__3"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__2__Impl"
    // InternalMyDsl.g:1679:1: rule__Expression__Group__2__Impl : ( ( '=' )? ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Par__Group__1__Impl"
    // InternalMyDsl.g:3503:1: rule__Par__Group__1__Impl : ( '{' ) ;
    public final void rule__Par__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ParExpression__Group__3__Impl"
    // InternalMyDsl.g:4569:1: rule__ParExpression__Group__3__Impl : ( ( rule__ParExpression__MessagesAssignment_3 )* ) ;
    public final void rule__ParExpression__Group__3__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1683:1: ( ( ( '=' )? ) )
            // InternalMyDsl.g:1684:1: ( ( '=' )? )
            {
            // InternalMyDsl.g:1684:1: ( ( '=' )? )
            // InternalMyDsl.g:1685:2: ( '=' )?
            {
             before(grammarAccess.getExpressionAccess().getEqualsSignKeyword_2()); 
            // InternalMyDsl.g:1686:2: ( '=' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1686:3: '='
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getEqualsSignKeyword_2()); 
=======
            // InternalMyDsl.g:3507:1: ( ( '{' ) )
            // InternalMyDsl.g:3508:1: ( '{' )
=======
            // InternalMyDsl.g:4573:1: ( ( ( rule__ParExpression__MessagesAssignment_3 )* ) )
            // InternalMyDsl.g:4574:1: ( ( rule__ParExpression__MessagesAssignment_3 )* )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4574:1: ( ( rule__ParExpression__MessagesAssignment_3 )* )
            // InternalMyDsl.g:4575:2: ( rule__ParExpression__MessagesAssignment_3 )*
            {
<<<<<<< HEAD
             before(grammarAccess.getParAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getParAccess().getLeftCurlyBracketKeyword_1()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getParExpressionAccess().getMessagesAssignment_3()); 
            // InternalMyDsl.g:4576:2: ( rule__ParExpression__MessagesAssignment_3 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==29) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMyDsl.g:4576:3: rule__ParExpression__MessagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ParExpression__MessagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getParExpressionAccess().getMessagesAssignment_3()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__ParExpression__Group__3__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__3"
    // InternalMyDsl.g:1694:1: rule__Expression__Group__3 : rule__Expression__Group__3__Impl rule__Expression__Group__4 ;
    public final void rule__Expression__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__Par__Group__2"
    // InternalMyDsl.g:3518:1: rule__Par__Group__2 : rule__Par__Group__2__Impl rule__Par__Group__3 ;
    public final void rule__Par__Group__2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ParExpression__Group__4"
    // InternalMyDsl.g:4584:1: rule__ParExpression__Group__4 : rule__ParExpression__Group__4__Impl ;
    public final void rule__ParExpression__Group__4() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1698:1: ( rule__Expression__Group__3__Impl rule__Expression__Group__4 )
            // InternalMyDsl.g:1699:2: rule__Expression__Group__3__Impl rule__Expression__Group__4
=======
            // InternalMyDsl.g:3522:1: ( rule__Par__Group__2__Impl rule__Par__Group__3 )
            // InternalMyDsl.g:3523:2: rule__Par__Group__2__Impl rule__Par__Group__3
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4588:1: ( rule__ParExpression__Group__4__Impl )
            // InternalMyDsl.g:4589:2: rule__ParExpression__Group__4__Impl
>>>>>>> [xText] Added new message type: contextMessage
            {
            pushFollow(FOLLOW_2);
            rule__ParExpression__Group__4__Impl();

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
    // $ANTLR end "rule__ParExpression__Group__4"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__3__Impl"
    // InternalMyDsl.g:1706:1: rule__Expression__Group__3__Impl : ( ( '>' )? ) ;
    public final void rule__Expression__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Par__Group__2__Impl"
    // InternalMyDsl.g:3530:1: rule__Par__Group__2__Impl : ( ( rule__Par__ParexpressionAssignment_2 )* ) ;
    public final void rule__Par__Group__2__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ParExpression__Group__4__Impl"
    // InternalMyDsl.g:4595:1: rule__ParExpression__Group__4__Impl : ( '}' ) ;
    public final void rule__ParExpression__Group__4__Impl() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1710:1: ( ( ( '>' )? ) )
            // InternalMyDsl.g:1711:1: ( ( '>' )? )
            {
            // InternalMyDsl.g:1711:1: ( ( '>' )? )
            // InternalMyDsl.g:1712:2: ( '>' )?
            {
             before(grammarAccess.getExpressionAccess().getGreaterThanSignKeyword_3()); 
            // InternalMyDsl.g:1713:2: ( '>' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1713:3: '>'
                    {
                    match(input,25,FOLLOW_2); 
=======
            // InternalMyDsl.g:3534:1: ( ( ( rule__Par__ParexpressionAssignment_2 )* ) )
            // InternalMyDsl.g:3535:1: ( ( rule__Par__ParexpressionAssignment_2 )* )
=======
            // InternalMyDsl.g:4599:1: ( ( '}' ) )
            // InternalMyDsl.g:4600:1: ( '}' )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4600:1: ( '}' )
            // InternalMyDsl.g:4601:2: '}'
            {
<<<<<<< HEAD
             before(grammarAccess.getParAccess().getParexpressionAssignment_2()); 
            // InternalMyDsl.g:3537:2: ( rule__Par__ParexpressionAssignment_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==40) ) {
                    alt39=1;
                }
>>>>>>> Added Xtext for context dependent behavior


                switch (alt39) {
            	case 1 :
            	    // InternalMyDsl.g:3537:3: rule__Par__ParexpressionAssignment_2
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Par__ParexpressionAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getParAccess().getParexpressionAssignment_2()); 
=======
             before(grammarAccess.getParExpressionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getParExpressionAccess().getRightCurlyBracketKeyword_4()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__ParExpression__Group__4__Impl"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__4"
    // InternalMyDsl.g:1721:1: rule__Expression__Group__4 : rule__Expression__Group__4__Impl rule__Expression__Group__5 ;
    public final void rule__Expression__Group__4() throws RecognitionException {
=======
    // $ANTLR start "rule__Par__Group__3"
    // InternalMyDsl.g:3545:1: rule__Par__Group__3 : rule__Par__Group__3__Impl ;
    public final void rule__Par__Group__3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Domain__NameAssignment_1"
    // InternalMyDsl.g:4611:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1725:1: ( rule__Expression__Group__4__Impl rule__Expression__Group__5 )
            // InternalMyDsl.g:1726:2: rule__Expression__Group__4__Impl rule__Expression__Group__5
=======
            // InternalMyDsl.g:3549:1: ( rule__Par__Group__3__Impl )
            // InternalMyDsl.g:3550:2: rule__Par__Group__3__Impl
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4615:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4616:2: ( RULE_ID )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4616:2: ( RULE_ID )
            // InternalMyDsl.g:4617:3: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0()); 

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
<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR end "rule__Expression__Group__4"


    // $ANTLR start "rule__Expression__Group__4__Impl"
    // InternalMyDsl.g:1733:1: rule__Expression__Group__4__Impl : ( ( '<' )? ) ;
    public final void rule__Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1737:1: ( ( ( '<' )? ) )
            // InternalMyDsl.g:1738:1: ( ( '<' )? )
            {
            // InternalMyDsl.g:1738:1: ( ( '<' )? )
            // InternalMyDsl.g:1739:2: ( '<' )?
            {
             before(grammarAccess.getExpressionAccess().getLessThanSignKeyword_4()); 
            // InternalMyDsl.g:1740:2: ( '<' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1740:3: '<'
                    {
                    match(input,26,FOLLOW_2); 
=======
    // $ANTLR end "rule__Par__Group__3"
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR end "rule__Domain__NameAssignment_1"
>>>>>>> [xText] Added new message type: contextMessage


    // $ANTLR start "rule__Domain__ContextmodelsAssignment_3"
    // InternalMyDsl.g:4626:1: rule__Domain__ContextmodelsAssignment_3 : ( ruleContextModel ) ;
    public final void rule__Domain__ContextmodelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4630:1: ( ( ruleContextModel ) )
            // InternalMyDsl.g:4631:2: ( ruleContextModel )
            {
            // InternalMyDsl.g:4631:2: ( ruleContextModel )
            // InternalMyDsl.g:4632:3: ruleContextModel
            {
             before(grammarAccess.getDomainAccess().getContextmodelsContextModelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleContextModel();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getContextmodelsContextModelParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Domain__ContextmodelsAssignment_3"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__5"
    // InternalMyDsl.g:1748:1: rule__Expression__Group__5 : rule__Expression__Group__5__Impl rule__Expression__Group__6 ;
    public final void rule__Expression__Group__5() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__0"
    // InternalMyDsl.g:3572:1: rule__ParExpression__Group__0 : rule__ParExpression__Group__0__Impl rule__ParExpression__Group__1 ;
    public final void rule__ParExpression__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Domain__ContextfragmentsAssignment_4"
    // InternalMyDsl.g:4641:1: rule__Domain__ContextfragmentsAssignment_4 : ( ruleContextFragment ) ;
    public final void rule__Domain__ContextfragmentsAssignment_4() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1752:1: ( rule__Expression__Group__5__Impl rule__Expression__Group__6 )
            // InternalMyDsl.g:1753:2: rule__Expression__Group__5__Impl rule__Expression__Group__6
=======
            // InternalMyDsl.g:3576:1: ( rule__ParExpression__Group__0__Impl rule__ParExpression__Group__1 )
            // InternalMyDsl.g:3577:2: rule__ParExpression__Group__0__Impl rule__ParExpression__Group__1
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4645:1: ( ( ruleContextFragment ) )
            // InternalMyDsl.g:4646:2: ( ruleContextFragment )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4646:2: ( ruleContextFragment )
            // InternalMyDsl.g:4647:3: ruleContextFragment
            {
             before(grammarAccess.getDomainAccess().getContextfragmentsContextFragmentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleContextFragment();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getContextfragmentsContextFragmentParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Domain__ContextfragmentsAssignment_4"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__5__Impl"
    // InternalMyDsl.g:1760:1: rule__Expression__Group__5__Impl : ( ( '>=' )? ) ;
    public final void rule__Expression__Group__5__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__0__Impl"
    // InternalMyDsl.g:3584:1: rule__ParExpression__Group__0__Impl : ( 'case' ) ;
    public final void rule__ParExpression__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Domain__EntitiesAssignment_5"
    // InternalMyDsl.g:4656:1: rule__Domain__EntitiesAssignment_5 : ( ruleEntity ) ;
    public final void rule__Domain__EntitiesAssignment_5() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1764:1: ( ( ( '>=' )? ) )
            // InternalMyDsl.g:1765:1: ( ( '>=' )? )
            {
            // InternalMyDsl.g:1765:1: ( ( '>=' )? )
            // InternalMyDsl.g:1766:2: ( '>=' )?
            {
             before(grammarAccess.getExpressionAccess().getGreaterThanSignEqualsSignKeyword_5()); 
            // InternalMyDsl.g:1767:2: ( '>=' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1767:3: '>='
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGreaterThanSignEqualsSignKeyword_5()); 
=======
            // InternalMyDsl.g:3588:1: ( ( 'case' ) )
            // InternalMyDsl.g:3589:1: ( 'case' )
=======
            // InternalMyDsl.g:4660:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:4661:2: ( ruleEntity )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4661:2: ( ruleEntity )
            // InternalMyDsl.g:4662:3: ruleEntity
            {
<<<<<<< HEAD
             before(grammarAccess.getParExpressionAccess().getCaseKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getParExpressionAccess().getCaseKeyword_0()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_5_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__Domain__EntitiesAssignment_5"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__6"
    // InternalMyDsl.g:1775:1: rule__Expression__Group__6 : rule__Expression__Group__6__Impl rule__Expression__Group__7 ;
    public final void rule__Expression__Group__6() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__1"
    // InternalMyDsl.g:3599:1: rule__ParExpression__Group__1 : rule__ParExpression__Group__1__Impl rule__ParExpression__Group__2 ;
    public final void rule__ParExpression__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Domain__ContextchangesAssignment_6"
    // InternalMyDsl.g:4671:1: rule__Domain__ContextchangesAssignment_6 : ( ruleContextChange ) ;
    public final void rule__Domain__ContextchangesAssignment_6() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1779:1: ( rule__Expression__Group__6__Impl rule__Expression__Group__7 )
            // InternalMyDsl.g:1780:2: rule__Expression__Group__6__Impl rule__Expression__Group__7
=======
            // InternalMyDsl.g:3603:1: ( rule__ParExpression__Group__1__Impl rule__ParExpression__Group__2 )
            // InternalMyDsl.g:3604:2: rule__ParExpression__Group__1__Impl rule__ParExpression__Group__2
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4675:1: ( ( ruleContextChange ) )
            // InternalMyDsl.g:4676:2: ( ruleContextChange )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4676:2: ( ruleContextChange )
            // InternalMyDsl.g:4677:3: ruleContextChange
            {
             before(grammarAccess.getDomainAccess().getContextchangesContextChangeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleContextChange();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getContextchangesContextChangeParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Domain__ContextchangesAssignment_6"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__6__Impl"
    // InternalMyDsl.g:1787:1: rule__Expression__Group__6__Impl : ( ( '<=' )? ) ;
    public final void rule__Expression__Group__6__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__1__Impl"
    // InternalMyDsl.g:3611:1: rule__ParExpression__Group__1__Impl : ( ( rule__ParExpression__NameAssignment_1 ) ) ;
    public final void rule__ParExpression__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Domain__ObjectsAssignment_7"
    // InternalMyDsl.g:4686:1: rule__Domain__ObjectsAssignment_7 : ( ruleObject ) ;
    public final void rule__Domain__ObjectsAssignment_7() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1791:1: ( ( ( '<=' )? ) )
            // InternalMyDsl.g:1792:1: ( ( '<=' )? )
            {
            // InternalMyDsl.g:1792:1: ( ( '<=' )? )
            // InternalMyDsl.g:1793:2: ( '<=' )?
            {
             before(grammarAccess.getExpressionAccess().getLessThanSignEqualsSignKeyword_6()); 
            // InternalMyDsl.g:1794:2: ( '<=' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1794:3: '<='
                    {
                    match(input,28,FOLLOW_2); 
=======
            // InternalMyDsl.g:3615:1: ( ( ( rule__ParExpression__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3616:1: ( ( rule__ParExpression__NameAssignment_1 ) )
=======
            // InternalMyDsl.g:4690:1: ( ( ruleObject ) )
            // InternalMyDsl.g:4691:2: ( ruleObject )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4691:2: ( ruleObject )
            // InternalMyDsl.g:4692:3: ruleObject
            {
             before(grammarAccess.getDomainAccess().getObjectsObjectParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;
>>>>>>> Added Xtext for context dependent behavior

             after(grammarAccess.getDomainAccess().getObjectsObjectParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Domain__ObjectsAssignment_7"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__7"
    // InternalMyDsl.g:1802:1: rule__Expression__Group__7 : rule__Expression__Group__7__Impl rule__Expression__Group__8 ;
    public final void rule__Expression__Group__7() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__2"
    // InternalMyDsl.g:3626:1: rule__ParExpression__Group__2 : rule__ParExpression__Group__2__Impl rule__ParExpression__Group__3 ;
    public final void rule__ParExpression__Group__2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Domain__ConstraintsAssignment_8"
    // InternalMyDsl.g:4701:1: rule__Domain__ConstraintsAssignment_8 : ( ruleConstraint ) ;
    public final void rule__Domain__ConstraintsAssignment_8() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1806:1: ( rule__Expression__Group__7__Impl rule__Expression__Group__8 )
            // InternalMyDsl.g:1807:2: rule__Expression__Group__7__Impl rule__Expression__Group__8
=======
            // InternalMyDsl.g:3630:1: ( rule__ParExpression__Group__2__Impl rule__ParExpression__Group__3 )
            // InternalMyDsl.g:3631:2: rule__ParExpression__Group__2__Impl rule__ParExpression__Group__3
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4705:1: ( ( ruleConstraint ) )
            // InternalMyDsl.g:4706:2: ( ruleConstraint )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4706:2: ( ruleConstraint )
            // InternalMyDsl.g:4707:3: ruleConstraint
            {
             before(grammarAccess.getDomainAccess().getConstraintsConstraintParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getConstraintsConstraintParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Domain__ConstraintsAssignment_8"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__7__Impl"
    // InternalMyDsl.g:1814:1: rule__Expression__Group__7__Impl : ( ( rule__Expression__Alternatives_7 )? ) ;
    public final void rule__Expression__Group__7__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__2__Impl"
    // InternalMyDsl.g:3638:1: rule__ParExpression__Group__2__Impl : ( '{' ) ;
    public final void rule__ParExpression__Group__2__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Domain__ScenariosAssignment_9"
    // InternalMyDsl.g:4716:1: rule__Domain__ScenariosAssignment_9 : ( ruleScenario ) ;
    public final void rule__Domain__ScenariosAssignment_9() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1818:1: ( ( ( rule__Expression__Alternatives_7 )? ) )
            // InternalMyDsl.g:1819:1: ( ( rule__Expression__Alternatives_7 )? )
            {
            // InternalMyDsl.g:1819:1: ( ( rule__Expression__Alternatives_7 )? )
            // InternalMyDsl.g:1820:2: ( rule__Expression__Alternatives_7 )?
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_7()); 
            // InternalMyDsl.g:1821:2: ( rule__Expression__Alternatives_7 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_NUMBER)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1821:3: rule__Expression__Alternatives_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Alternatives_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getAlternatives_7()); 
=======
            // InternalMyDsl.g:3642:1: ( ( '{' ) )
            // InternalMyDsl.g:3643:1: ( '{' )
            {
            // InternalMyDsl.g:3643:1: ( '{' )
            // InternalMyDsl.g:3644:2: '{'
            {
             before(grammarAccess.getParExpressionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getParExpressionAccess().getLeftCurlyBracketKeyword_2()); 
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4720:1: ( ( ruleScenario ) )
            // InternalMyDsl.g:4721:2: ( ruleScenario )
            {
            // InternalMyDsl.g:4721:2: ( ruleScenario )
            // InternalMyDsl.g:4722:3: ruleScenario
            {
             before(grammarAccess.getDomainAccess().getScenariosScenarioParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getScenariosScenarioParserRuleCall_9_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__Domain__ScenariosAssignment_9"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__8"
    // InternalMyDsl.g:1829:1: rule__Expression__Group__8 : rule__Expression__Group__8__Impl rule__Expression__Group__9 ;
    public final void rule__Expression__Group__8() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__3"
    // InternalMyDsl.g:3653:1: rule__ParExpression__Group__3 : rule__ParExpression__Group__3__Impl rule__ParExpression__Group__4 ;
    public final void rule__ParExpression__Group__3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ContextModel__NameAssignment_1"
    // InternalMyDsl.g:4731:1: rule__ContextModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContextModel__NameAssignment_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1833:1: ( rule__Expression__Group__8__Impl rule__Expression__Group__9 )
            // InternalMyDsl.g:1834:2: rule__Expression__Group__8__Impl rule__Expression__Group__9
=======
            // InternalMyDsl.g:3657:1: ( rule__ParExpression__Group__3__Impl rule__ParExpression__Group__4 )
            // InternalMyDsl.g:3658:2: rule__ParExpression__Group__3__Impl rule__ParExpression__Group__4
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4735:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4736:2: ( RULE_ID )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4736:2: ( RULE_ID )
            // InternalMyDsl.g:4737:3: RULE_ID
            {
             before(grammarAccess.getContextModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ContextModel__NameAssignment_1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__8__Impl"
    // InternalMyDsl.g:1841:1: rule__Expression__Group__8__Impl : ( ')' ) ;
    public final void rule__Expression__Group__8__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__3__Impl"
    // InternalMyDsl.g:3665:1: rule__ParExpression__Group__3__Impl : ( ( rule__ParExpression__MessagesAssignment_3 )* ) ;
    public final void rule__ParExpression__Group__3__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ContextModel__EntitiesAssignment_3"
    // InternalMyDsl.g:4746:1: rule__ContextModel__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__ContextModel__EntitiesAssignment_3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1845:1: ( ( ')' ) )
            // InternalMyDsl.g:1846:1: ( ')' )
            {
            // InternalMyDsl.g:1846:1: ( ')' )
            // InternalMyDsl.g:1847:2: ')'
=======
            // InternalMyDsl.g:3669:1: ( ( ( rule__ParExpression__MessagesAssignment_3 )* ) )
            // InternalMyDsl.g:3670:1: ( ( rule__ParExpression__MessagesAssignment_3 )* )
            {
            // InternalMyDsl.g:3670:1: ( ( rule__ParExpression__MessagesAssignment_3 )* )
            // InternalMyDsl.g:3671:2: ( rule__ParExpression__MessagesAssignment_3 )*
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4750:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:4751:2: ( ruleEntity )
            {
            // InternalMyDsl.g:4751:2: ( ruleEntity )
            // InternalMyDsl.g:4752:3: ruleEntity
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getContextModelAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getContextModelAccess().getEntitiesEntityParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ContextModel__EntitiesAssignment_3"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__9"
    // InternalMyDsl.g:1856:1: rule__Expression__Group__9 : rule__Expression__Group__9__Impl rule__Expression__Group__10 ;
    public final void rule__Expression__Group__9() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__4"
    // InternalMyDsl.g:3680:1: rule__ParExpression__Group__4 : rule__ParExpression__Group__4__Impl ;
    public final void rule__ParExpression__Group__4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ContextModel__RelationsAssignment_4"
    // InternalMyDsl.g:4761:1: rule__ContextModel__RelationsAssignment_4 : ( ruleRelation ) ;
    public final void rule__ContextModel__RelationsAssignment_4() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1860:1: ( rule__Expression__Group__9__Impl rule__Expression__Group__10 )
            // InternalMyDsl.g:1861:2: rule__Expression__Group__9__Impl rule__Expression__Group__10
=======
            // InternalMyDsl.g:3684:1: ( rule__ParExpression__Group__4__Impl )
            // InternalMyDsl.g:3685:2: rule__ParExpression__Group__4__Impl
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4765:1: ( ( ruleRelation ) )
            // InternalMyDsl.g:4766:2: ( ruleRelation )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4766:2: ( ruleRelation )
            // InternalMyDsl.g:4767:3: ruleRelation
            {
             before(grammarAccess.getContextModelAccess().getRelationsRelationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getContextModelAccess().getRelationsRelationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ContextModel__RelationsAssignment_4"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__9__Impl"
    // InternalMyDsl.g:1868:1: rule__Expression__Group__9__Impl : ( '{' ) ;
    public final void rule__Expression__Group__9__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__4__Impl"
    // InternalMyDsl.g:3691:1: rule__ParExpression__Group__4__Impl : ( '}' ) ;
    public final void rule__ParExpression__Group__4__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ContextFragment__NameAssignment_1"
    // InternalMyDsl.g:4776:1: rule__ContextFragment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContextFragment__NameAssignment_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1872:1: ( ( '{' ) )
            // InternalMyDsl.g:1873:1: ( '{' )
            {
            // InternalMyDsl.g:1873:1: ( '{' )
            // InternalMyDsl.g:1874:2: '{'
=======
            // InternalMyDsl.g:3695:1: ( ( '}' ) )
            // InternalMyDsl.g:3696:1: ( '}' )
            {
            // InternalMyDsl.g:3696:1: ( '}' )
            // InternalMyDsl.g:3697:2: '}'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4780:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4781:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4781:2: ( RULE_ID )
            // InternalMyDsl.g:4782:3: RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getContextFragmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextFragmentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ContextFragment__NameAssignment_1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__10"
    // InternalMyDsl.g:1883:1: rule__Expression__Group__10 : rule__Expression__Group__10__Impl rule__Expression__Group__11 ;
    public final void rule__Expression__Group__10() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__NameAssignment_1"
    // InternalMyDsl.g:3707:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ContextFragment__EntitiesAssignment_3"
    // InternalMyDsl.g:4791:1: rule__ContextFragment__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__ContextFragment__EntitiesAssignment_3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1887:1: ( rule__Expression__Group__10__Impl rule__Expression__Group__11 )
            // InternalMyDsl.g:1888:2: rule__Expression__Group__10__Impl rule__Expression__Group__11
=======
            // InternalMyDsl.g:3711:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3712:2: ( RULE_ID )
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4795:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:4796:2: ( ruleEntity )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4796:2: ( ruleEntity )
            // InternalMyDsl.g:4797:3: ruleEntity
            {
             before(grammarAccess.getContextFragmentAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getContextFragmentAccess().getEntitiesEntityParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ContextFragment__EntitiesAssignment_3"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__10__Impl"
    // InternalMyDsl.g:1895:1: rule__Expression__Group__10__Impl : ( ( rule__Expression__MessagesAssignment_10 )* ) ;
    public final void rule__Expression__Group__10__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__ContextmodelsAssignment_3"
    // InternalMyDsl.g:3722:1: rule__Domain__ContextmodelsAssignment_3 : ( ruleContextModel ) ;
    public final void rule__Domain__ContextmodelsAssignment_3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ContextFragment__RelationsAssignment_4"
    // InternalMyDsl.g:4806:1: rule__ContextFragment__RelationsAssignment_4 : ( ruleRelation ) ;
    public final void rule__ContextFragment__RelationsAssignment_4() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1899:1: ( ( ( rule__Expression__MessagesAssignment_10 )* ) )
            // InternalMyDsl.g:1900:1: ( ( rule__Expression__MessagesAssignment_10 )* )
            {
            // InternalMyDsl.g:1900:1: ( ( rule__Expression__MessagesAssignment_10 )* )
            // InternalMyDsl.g:1901:2: ( rule__Expression__MessagesAssignment_10 )*
            {
             before(grammarAccess.getExpressionAccess().getMessagesAssignment_10()); 
            // InternalMyDsl.g:1902:2: ( rule__Expression__MessagesAssignment_10 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==16) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:1902:3: rule__Expression__MessagesAssignment_10
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Expression__MessagesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;
=======
            // InternalMyDsl.g:3726:1: ( ( ruleContextModel ) )
            // InternalMyDsl.g:3727:2: ( ruleContextModel )
=======
            // InternalMyDsl.g:4810:1: ( ( ruleRelation ) )
            // InternalMyDsl.g:4811:2: ( ruleRelation )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4811:2: ( ruleRelation )
            // InternalMyDsl.g:4812:3: ruleRelation
            {
             before(grammarAccess.getContextFragmentAccess().getRelationsRelationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
<<<<<<< HEAD
            ruleContextModel();
>>>>>>> Added Xtext for context dependent behavior
=======
            ruleRelation();
>>>>>>> [xText] Added new message type: contextMessage

            state._fsp--;

             after(grammarAccess.getContextFragmentAccess().getRelationsRelationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ContextFragment__RelationsAssignment_4"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__11"
    // InternalMyDsl.g:1910:1: rule__Expression__Group__11 : rule__Expression__Group__11__Impl ;
    public final void rule__Expression__Group__11() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__ContextfragmentsAssignment_4"
    // InternalMyDsl.g:3737:1: rule__Domain__ContextfragmentsAssignment_4 : ( ruleContextFragment ) ;
    public final void rule__Domain__ContextfragmentsAssignment_4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ChangeType__EntityAssignment_0_2"
    // InternalMyDsl.g:4821:1: rule__ChangeType__EntityAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeType__EntityAssignment_0_2() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1914:1: ( rule__Expression__Group__11__Impl )
            // InternalMyDsl.g:1915:2: rule__Expression__Group__11__Impl
=======
            // InternalMyDsl.g:3741:1: ( ( ruleContextFragment ) )
            // InternalMyDsl.g:3742:2: ( ruleContextFragment )
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4825:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4826:2: ( ( RULE_ID ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4826:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4827:3: ( RULE_ID )
            {
             before(grammarAccess.getChangeTypeAccess().getEntityEntityCrossReference_0_2_0()); 
            // InternalMyDsl.g:4828:3: ( RULE_ID )
            // InternalMyDsl.g:4829:4: RULE_ID
            {
             before(grammarAccess.getChangeTypeAccess().getEntityEntityIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getEntityEntityIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getChangeTypeAccess().getEntityEntityCrossReference_0_2_0()); 

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
    // $ANTLR end "rule__ChangeType__EntityAssignment_0_2"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__11__Impl"
    // InternalMyDsl.g:1921:1: rule__Expression__Group__11__Impl : ( '}' ) ;
    public final void rule__Expression__Group__11__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__EntitiesAssignment_5"
    // InternalMyDsl.g:3752:1: rule__Domain__EntitiesAssignment_5 : ( ruleEntity ) ;
    public final void rule__Domain__EntitiesAssignment_5() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ChangeType__EntityAssignment_1_2"
    // InternalMyDsl.g:4840:1: rule__ChangeType__EntityAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeType__EntityAssignment_1_2() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1925:1: ( ( '}' ) )
            // InternalMyDsl.g:1926:1: ( '}' )
            {
            // InternalMyDsl.g:1926:1: ( '}' )
            // InternalMyDsl.g:1927:2: '}'
=======
            // InternalMyDsl.g:3756:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:3757:2: ( ruleEntity )
            {
            // InternalMyDsl.g:3757:2: ( ruleEntity )
            // InternalMyDsl.g:3758:3: ruleEntity
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4844:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4845:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4845:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4846:3: ( RULE_ID )
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getChangeTypeAccess().getEntityEntityCrossReference_1_2_0()); 
            // InternalMyDsl.g:4847:3: ( RULE_ID )
            // InternalMyDsl.g:4848:4: RULE_ID
            {
             before(grammarAccess.getChangeTypeAccess().getEntityEntityIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getEntityEntityIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getChangeTypeAccess().getEntityEntityCrossReference_1_2_0()); 

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
    // $ANTLR end "rule__ChangeType__EntityAssignment_1_2"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Par__Group__0"
    // InternalMyDsl.g:1937:1: rule__Par__Group__0 : rule__Par__Group__0__Impl rule__Par__Group__1 ;
    public final void rule__Par__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__ContextchangesAssignment_6"
    // InternalMyDsl.g:3767:1: rule__Domain__ContextchangesAssignment_6 : ( ruleContextChange ) ;
    public final void rule__Domain__ContextchangesAssignment_6() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ChangeType__AttributeAssignment_2_1"
    // InternalMyDsl.g:4859:1: rule__ChangeType__AttributeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeType__AttributeAssignment_2_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1941:1: ( rule__Par__Group__0__Impl rule__Par__Group__1 )
            // InternalMyDsl.g:1942:2: rule__Par__Group__0__Impl rule__Par__Group__1
=======
            // InternalMyDsl.g:3771:1: ( ( ruleContextChange ) )
            // InternalMyDsl.g:3772:2: ( ruleContextChange )
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4863:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4864:2: ( ( RULE_ID ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4864:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4865:3: ( RULE_ID )
            {
             before(grammarAccess.getChangeTypeAccess().getAttributeAttributeCrossReference_2_1_0()); 
            // InternalMyDsl.g:4866:3: ( RULE_ID )
            // InternalMyDsl.g:4867:4: RULE_ID
            {
             before(grammarAccess.getChangeTypeAccess().getAttributeAttributeIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getAttributeAttributeIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getChangeTypeAccess().getAttributeAttributeCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__ChangeType__AttributeAssignment_2_1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Par__Group__0__Impl"
    // InternalMyDsl.g:1949:1: rule__Par__Group__0__Impl : ( 'par' ) ;
    public final void rule__Par__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__ObjectsAssignment_7"
    // InternalMyDsl.g:3782:1: rule__Domain__ObjectsAssignment_7 : ( ruleObject ) ;
    public final void rule__Domain__ObjectsAssignment_7() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ContextChange__ChangeAssignment_0"
    // InternalMyDsl.g:4878:1: rule__ContextChange__ChangeAssignment_0 : ( ruleChangeType ) ;
    public final void rule__ContextChange__ChangeAssignment_0() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1953:1: ( ( 'par' ) )
            // InternalMyDsl.g:1954:1: ( 'par' )
            {
            // InternalMyDsl.g:1954:1: ( 'par' )
            // InternalMyDsl.g:1955:2: 'par'
=======
            // InternalMyDsl.g:3786:1: ( ( ruleObject ) )
            // InternalMyDsl.g:3787:2: ( ruleObject )
            {
            // InternalMyDsl.g:3787:2: ( ruleObject )
            // InternalMyDsl.g:3788:3: ruleObject
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4882:1: ( ( ruleChangeType ) )
            // InternalMyDsl.g:4883:2: ( ruleChangeType )
            {
            // InternalMyDsl.g:4883:2: ( ruleChangeType )
            // InternalMyDsl.g:4884:3: ruleChangeType
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getContextChangeAccess().getChangeChangeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleChangeType();

            state._fsp--;

             after(grammarAccess.getContextChangeAccess().getChangeChangeTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ContextChange__ChangeAssignment_0"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Par__Group__1"
    // InternalMyDsl.g:1964:1: rule__Par__Group__1 : rule__Par__Group__1__Impl rule__Par__Group__2 ;
    public final void rule__Par__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__ConstraintsAssignment_8"
    // InternalMyDsl.g:3797:1: rule__Domain__ConstraintsAssignment_8 : ( ruleConstraint ) ;
    public final void rule__Domain__ConstraintsAssignment_8() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ContextChange__NameAssignment_1"
    // InternalMyDsl.g:4893:1: rule__ContextChange__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContextChange__NameAssignment_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1968:1: ( rule__Par__Group__1__Impl rule__Par__Group__2 )
            // InternalMyDsl.g:1969:2: rule__Par__Group__1__Impl rule__Par__Group__2
=======
            // InternalMyDsl.g:3801:1: ( ( ruleConstraint ) )
            // InternalMyDsl.g:3802:2: ( ruleConstraint )
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4897:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4898:2: ( RULE_ID )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4898:2: ( RULE_ID )
            // InternalMyDsl.g:4899:3: RULE_ID
            {
             before(grammarAccess.getContextChangeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextChangeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ContextChange__NameAssignment_1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Par__Group__1__Impl"
    // InternalMyDsl.g:1976:1: rule__Par__Group__1__Impl : ( '{' ) ;
    public final void rule__Par__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__ScenariosAssignment_9"
    // InternalMyDsl.g:3812:1: rule__Domain__ScenariosAssignment_9 : ( ruleScenario ) ;
    public final void rule__Domain__ScenariosAssignment_9() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyDsl.g:4908:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1980:1: ( ( '{' ) )
            // InternalMyDsl.g:1981:1: ( '{' )
            {
            // InternalMyDsl.g:1981:1: ( '{' )
            // InternalMyDsl.g:1982:2: '{'
=======
            // InternalMyDsl.g:3816:1: ( ( ruleScenario ) )
            // InternalMyDsl.g:3817:2: ( ruleScenario )
            {
            // InternalMyDsl.g:3817:2: ( ruleScenario )
            // InternalMyDsl.g:3818:3: ruleScenario
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4912:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4913:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4913:2: ( RULE_ID )
            // InternalMyDsl.g:4914:3: RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Par__Group__2"
    // InternalMyDsl.g:1991:1: rule__Par__Group__2 : rule__Par__Group__2__Impl rule__Par__Group__3 ;
    public final void rule__Par__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextModel__NameAssignment_1"
    // InternalMyDsl.g:3827:1: rule__ContextModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContextModel__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalMyDsl.g:4923:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:1995:1: ( rule__Par__Group__2__Impl rule__Par__Group__3 )
            // InternalMyDsl.g:1996:2: rule__Par__Group__2__Impl rule__Par__Group__3
=======
            // InternalMyDsl.g:3831:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3832:2: ( RULE_ID )
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4927:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4928:2: ( RULE_ID )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4928:2: ( RULE_ID )
            // InternalMyDsl.g:4929:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Par__Group__2__Impl"
    // InternalMyDsl.g:2003:1: rule__Par__Group__2__Impl : ( ( rule__Par__ParexpressionAssignment_2 )* ) ;
    public final void rule__Par__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextModel__EntitiesAssignment_3"
    // InternalMyDsl.g:3842:1: rule__ContextModel__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__ContextModel__EntitiesAssignment_3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Entity__AttributesAssignment_3"
    // InternalMyDsl.g:4938:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2007:1: ( ( ( rule__Par__ParexpressionAssignment_2 )* ) )
            // InternalMyDsl.g:2008:1: ( ( rule__Par__ParexpressionAssignment_2 )* )
            {
            // InternalMyDsl.g:2008:1: ( ( rule__Par__ParexpressionAssignment_2 )* )
            // InternalMyDsl.g:2009:2: ( rule__Par__ParexpressionAssignment_2 )*
            {
             before(grammarAccess.getParAccess().getParexpressionAssignment_2()); 
            // InternalMyDsl.g:2010:2: ( rule__Par__ParexpressionAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==30) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:2010:3: rule__Par__ParexpressionAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Par__ParexpressionAssignment_2();

            	    state._fsp--;


            	    }
            	    break;
=======
            // InternalMyDsl.g:3846:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:3847:2: ( ruleEntity )
=======
            // InternalMyDsl.g:4942:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:4943:2: ( ruleAttribute )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4943:2: ( ruleAttribute )
            // InternalMyDsl.g:4944:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
<<<<<<< HEAD
            ruleEntity();
>>>>>>> Added Xtext for context dependent behavior
=======
            ruleAttribute();
>>>>>>> [xText] Added new message type: contextMessage

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entity__AttributesAssignment_3"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Par__Group__3"
    // InternalMyDsl.g:2018:1: rule__Par__Group__3 : rule__Par__Group__3__Impl ;
    public final void rule__Par__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextModel__RelationsAssignment_4"
    // InternalMyDsl.g:3857:1: rule__ContextModel__RelationsAssignment_4 : ( ruleRelation ) ;
    public final void rule__ContextModel__RelationsAssignment_4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Relation__NameAssignment_1"
    // InternalMyDsl.g:4953:1: rule__Relation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2022:1: ( rule__Par__Group__3__Impl )
            // InternalMyDsl.g:2023:2: rule__Par__Group__3__Impl
=======
            // InternalMyDsl.g:3861:1: ( ( ruleRelation ) )
            // InternalMyDsl.g:3862:2: ( ruleRelation )
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4957:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4958:2: ( RULE_ID )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4958:2: ( RULE_ID )
            // InternalMyDsl.g:4959:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Relation__NameAssignment_1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Par__Group__3__Impl"
    // InternalMyDsl.g:2029:1: rule__Par__Group__3__Impl : ( '}' ) ;
    public final void rule__Par__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextFragment__NameAssignment_1"
    // InternalMyDsl.g:3872:1: rule__ContextFragment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContextFragment__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Relation__SenderAssignment_3"
    // InternalMyDsl.g:4968:1: rule__Relation__SenderAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__SenderAssignment_3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2033:1: ( ( '}' ) )
            // InternalMyDsl.g:2034:1: ( '}' )
            {
            // InternalMyDsl.g:2034:1: ( '}' )
            // InternalMyDsl.g:2035:2: '}'
=======
            // InternalMyDsl.g:3876:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3877:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3877:2: ( RULE_ID )
            // InternalMyDsl.g:3878:3: RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4972:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4973:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4973:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4974:3: ( RULE_ID )
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getRelationAccess().getSenderEntityCrossReference_3_0()); 
            // InternalMyDsl.g:4975:3: ( RULE_ID )
            // InternalMyDsl.g:4976:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getSenderEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getSenderEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getSenderEntityCrossReference_3_0()); 

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
    // $ANTLR end "rule__Relation__SenderAssignment_3"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__ParExpression__Group__0"
    // InternalMyDsl.g:2045:1: rule__ParExpression__Group__0 : rule__ParExpression__Group__0__Impl rule__ParExpression__Group__1 ;
    public final void rule__ParExpression__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextFragment__EntitiesAssignment_3"
    // InternalMyDsl.g:3887:1: rule__ContextFragment__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__ContextFragment__EntitiesAssignment_3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Relation__ReceiverAssignment_5"
    // InternalMyDsl.g:4987:1: rule__Relation__ReceiverAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ReceiverAssignment_5() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2049:1: ( rule__ParExpression__Group__0__Impl rule__ParExpression__Group__1 )
            // InternalMyDsl.g:2050:2: rule__ParExpression__Group__0__Impl rule__ParExpression__Group__1
=======
            // InternalMyDsl.g:3891:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:3892:2: ( ruleEntity )
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:4991:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4992:2: ( ( RULE_ID ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:4992:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4993:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getReceiverEntityCrossReference_5_0()); 
            // InternalMyDsl.g:4994:3: ( RULE_ID )
            // InternalMyDsl.g:4995:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getReceiverEntityIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getReceiverEntityIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getReceiverEntityCrossReference_5_0()); 

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
    // $ANTLR end "rule__Relation__ReceiverAssignment_5"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__ParExpression__Group__0__Impl"
    // InternalMyDsl.g:2057:1: rule__ParExpression__Group__0__Impl : ( 'case' ) ;
    public final void rule__ParExpression__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextFragment__RelationsAssignment_4"
    // InternalMyDsl.g:3902:1: rule__ContextFragment__RelationsAssignment_4 : ( ruleRelation ) ;
    public final void rule__ContextFragment__RelationsAssignment_4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Relation__AttributesAssignment_8"
    // InternalMyDsl.g:5006:1: rule__Relation__AttributesAssignment_8 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_8() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2061:1: ( ( 'case' ) )
            // InternalMyDsl.g:2062:1: ( 'case' )
            {
            // InternalMyDsl.g:2062:1: ( 'case' )
            // InternalMyDsl.g:2063:2: 'case'
=======
            // InternalMyDsl.g:3906:1: ( ( ruleRelation ) )
            // InternalMyDsl.g:3907:2: ( ruleRelation )
            {
            // InternalMyDsl.g:3907:2: ( ruleRelation )
            // InternalMyDsl.g:3908:3: ruleRelation
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5010:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:5011:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:5011:2: ( ruleAttribute )
            // InternalMyDsl.g:5012:3: ruleAttribute
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Relation__AttributesAssignment_8"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__ParExpression__Group__1"
    // InternalMyDsl.g:2072:1: rule__ParExpression__Group__1 : rule__ParExpression__Group__1__Impl rule__ParExpression__Group__2 ;
    public final void rule__ParExpression__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__ChangeType__EntityAssignment_0_2"
    // InternalMyDsl.g:3917:1: rule__ChangeType__EntityAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeType__EntityAssignment_0_2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Scenario__NameAssignment_1"
    // InternalMyDsl.g:5021:1: rule__Scenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scenario__NameAssignment_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2076:1: ( rule__ParExpression__Group__1__Impl rule__ParExpression__Group__2 )
            // InternalMyDsl.g:2077:2: rule__ParExpression__Group__1__Impl rule__ParExpression__Group__2
=======
            // InternalMyDsl.g:3921:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3922:2: ( ( RULE_ID ) )
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5025:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5026:2: ( RULE_ID )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5026:2: ( RULE_ID )
            // InternalMyDsl.g:5027:3: RULE_ID
            {
             before(grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Scenario__NameAssignment_1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__ParExpression__Group__1__Impl"
    // InternalMyDsl.g:2084:1: rule__ParExpression__Group__1__Impl : ( ( rule__ParExpression__NameAssignment_1 ) ) ;
    public final void rule__ParExpression__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ChangeType__EntityAssignment_1_2"
    // InternalMyDsl.g:3936:1: rule__ChangeType__EntityAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeType__EntityAssignment_1_2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Scenario__ScenariocontentsAssignment_3"
    // InternalMyDsl.g:5036:1: rule__Scenario__ScenariocontentsAssignment_3 : ( ruleScenarioContent ) ;
    public final void rule__Scenario__ScenariocontentsAssignment_3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2088:1: ( ( ( rule__ParExpression__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2089:1: ( ( rule__ParExpression__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2089:1: ( ( rule__ParExpression__NameAssignment_1 ) )
            // InternalMyDsl.g:2090:2: ( rule__ParExpression__NameAssignment_1 )
            {
             before(grammarAccess.getParExpressionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2091:2: ( rule__ParExpression__NameAssignment_1 )
            // InternalMyDsl.g:2091:3: rule__ParExpression__NameAssignment_1
=======
            // InternalMyDsl.g:3940:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3941:2: ( ( RULE_ID ) )
=======
            // InternalMyDsl.g:5040:1: ( ( ruleScenarioContent ) )
            // InternalMyDsl.g:5041:2: ( ruleScenarioContent )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5041:2: ( ruleScenarioContent )
            // InternalMyDsl.g:5042:3: ruleScenarioContent
            {
<<<<<<< HEAD
             before(grammarAccess.getChangeTypeAccess().getEntityEntityCrossReference_1_2_0()); 
            // InternalMyDsl.g:3943:3: ( RULE_ID )
            // InternalMyDsl.g:3944:4: RULE_ID
>>>>>>> Added Xtext for context dependent behavior
            {
             before(grammarAccess.getChangeTypeAccess().getEntityEntityIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getEntityEntityIDTerminalRuleCall_1_2_0_1()); 
=======
             before(grammarAccess.getScenarioAccess().getScenariocontentsScenarioContentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleScenarioContent();
>>>>>>> [xText] Added new message type: contextMessage

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getScenariocontentsScenarioContentParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Scenario__ScenariocontentsAssignment_3"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__ParExpression__Group__2"
    // InternalMyDsl.g:2099:1: rule__ParExpression__Group__2 : rule__ParExpression__Group__2__Impl rule__ParExpression__Group__3 ;
    public final void rule__ParExpression__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__ChangeType__AttributeAssignment_2_1"
    // InternalMyDsl.g:3955:1: rule__ChangeType__AttributeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeType__AttributeAssignment_2_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ScenarioContent__AltAssignment_0"
    // InternalMyDsl.g:5051:1: rule__ScenarioContent__AltAssignment_0 : ( ruleAlt ) ;
    public final void rule__ScenarioContent__AltAssignment_0() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2103:1: ( rule__ParExpression__Group__2__Impl rule__ParExpression__Group__3 )
            // InternalMyDsl.g:2104:2: rule__ParExpression__Group__2__Impl rule__ParExpression__Group__3
=======
            // InternalMyDsl.g:3959:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3960:2: ( ( RULE_ID ) )
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5055:1: ( ( ruleAlt ) )
            // InternalMyDsl.g:5056:2: ( ruleAlt )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5056:2: ( ruleAlt )
            // InternalMyDsl.g:5057:3: ruleAlt
            {
             before(grammarAccess.getScenarioContentAccess().getAltAltParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAlt();

            state._fsp--;

             after(grammarAccess.getScenarioContentAccess().getAltAltParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ScenarioContent__AltAssignment_0"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__ParExpression__Group__2__Impl"
    // InternalMyDsl.g:2111:1: rule__ParExpression__Group__2__Impl : ( '{' ) ;
    public final void rule__ParExpression__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextChange__ChangeAssignment_0"
    // InternalMyDsl.g:3974:1: rule__ContextChange__ChangeAssignment_0 : ( ruleChangeType ) ;
    public final void rule__ContextChange__ChangeAssignment_0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ScenarioContent__MessageAssignment_1"
    // InternalMyDsl.g:5066:1: rule__ScenarioContent__MessageAssignment_1 : ( ruleMessage ) ;
    public final void rule__ScenarioContent__MessageAssignment_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2115:1: ( ( '{' ) )
            // InternalMyDsl.g:2116:1: ( '{' )
            {
            // InternalMyDsl.g:2116:1: ( '{' )
            // InternalMyDsl.g:2117:2: '{'
=======
            // InternalMyDsl.g:3978:1: ( ( ruleChangeType ) )
            // InternalMyDsl.g:3979:2: ( ruleChangeType )
            {
            // InternalMyDsl.g:3979:2: ( ruleChangeType )
            // InternalMyDsl.g:3980:3: ruleChangeType
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5070:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:5071:2: ( ruleMessage )
            {
            // InternalMyDsl.g:5071:2: ( ruleMessage )
            // InternalMyDsl.g:5072:3: ruleMessage
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getScenarioContentAccess().getMessageMessageParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getScenarioContentAccess().getMessageMessageParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ScenarioContent__MessageAssignment_1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__ParExpression__Group__3"
    // InternalMyDsl.g:2126:1: rule__ParExpression__Group__3 : rule__ParExpression__Group__3__Impl rule__ParExpression__Group__4 ;
    public final void rule__ParExpression__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextChange__NameAssignment_1"
    // InternalMyDsl.g:3989:1: rule__ContextChange__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContextChange__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ScenarioContent__ParAssignment_2"
    // InternalMyDsl.g:5081:1: rule__ScenarioContent__ParAssignment_2 : ( rulePar ) ;
    public final void rule__ScenarioContent__ParAssignment_2() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2130:1: ( rule__ParExpression__Group__3__Impl rule__ParExpression__Group__4 )
            // InternalMyDsl.g:2131:2: rule__ParExpression__Group__3__Impl rule__ParExpression__Group__4
=======
            // InternalMyDsl.g:3993:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3994:2: ( RULE_ID )
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5085:1: ( ( rulePar ) )
            // InternalMyDsl.g:5086:2: ( rulePar )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5086:2: ( rulePar )
            // InternalMyDsl.g:5087:3: rulePar
            {
             before(grammarAccess.getScenarioContentAccess().getParParParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePar();

            state._fsp--;

             after(grammarAccess.getScenarioContentAccess().getParParParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ScenarioContent__ParAssignment_2"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__ParExpression__Group__3__Impl"
    // InternalMyDsl.g:2138:1: rule__ParExpression__Group__3__Impl : ( ( rule__ParExpression__MessagesAssignment_3 )* ) ;
    public final void rule__ParExpression__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyDsl.g:4004:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__ScenarioContent__ContextmessageAssignment_3"
    // InternalMyDsl.g:5096:1: rule__ScenarioContent__ContextmessageAssignment_3 : ( ruleContextMessage ) ;
    public final void rule__ScenarioContent__ContextmessageAssignment_3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2142:1: ( ( ( rule__ParExpression__MessagesAssignment_3 )* ) )
            // InternalMyDsl.g:2143:1: ( ( rule__ParExpression__MessagesAssignment_3 )* )
            {
            // InternalMyDsl.g:2143:1: ( ( rule__ParExpression__MessagesAssignment_3 )* )
            // InternalMyDsl.g:2144:2: ( rule__ParExpression__MessagesAssignment_3 )*
            {
             before(grammarAccess.getParExpressionAccess().getMessagesAssignment_3()); 
            // InternalMyDsl.g:2145:2: ( rule__ParExpression__MessagesAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:2145:3: rule__ParExpression__MessagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ParExpression__MessagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getParExpressionAccess().getMessagesAssignment_3()); 
=======
            // InternalMyDsl.g:4008:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4009:2: ( RULE_ID )
=======
            // InternalMyDsl.g:5100:1: ( ( ruleContextMessage ) )
            // InternalMyDsl.g:5101:2: ( ruleContextMessage )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5101:2: ( ruleContextMessage )
            // InternalMyDsl.g:5102:3: ruleContextMessage
            {
<<<<<<< HEAD
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getScenarioContentAccess().getContextmessageContextMessageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleContextMessage();

            state._fsp--;

             after(grammarAccess.getScenarioContentAccess().getContextmessageContextMessageParserRuleCall_3_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__ScenarioContent__ContextmessageAssignment_3"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__ParExpression__Group__4"
    // InternalMyDsl.g:2153:1: rule__ParExpression__Group__4 : rule__ParExpression__Group__4__Impl ;
    public final void rule__ParExpression__Group__4() throws RecognitionException {
=======
    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalMyDsl.g:4019:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Message__NameAssignment_1"
    // InternalMyDsl.g:5111:1: rule__Message__NameAssignment_1 : ( ruleName ) ;
    public final void rule__Message__NameAssignment_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2157:1: ( rule__ParExpression__Group__4__Impl )
            // InternalMyDsl.g:2158:2: rule__ParExpression__Group__4__Impl
=======
            // InternalMyDsl.g:4023:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4024:2: ( RULE_ID )
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5115:1: ( ( ruleName ) )
            // InternalMyDsl.g:5116:2: ( ruleName )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5116:2: ( ruleName )
            // InternalMyDsl.g:5117:3: ruleName
            {
             before(grammarAccess.getMessageAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getNameNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Message__NameAssignment_1"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__ParExpression__Group__4__Impl"
    // InternalMyDsl.g:2164:1: rule__ParExpression__Group__4__Impl : ( '}' ) ;
    public final void rule__ParExpression__Group__4__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Entity__AttributesAssignment_3"
    // InternalMyDsl.g:4034:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Message__RequiredAssignment_2"
    // InternalMyDsl.g:5126:1: rule__Message__RequiredAssignment_2 : ( ( 'required' ) ) ;
    public final void rule__Message__RequiredAssignment_2() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2168:1: ( ( '}' ) )
            // InternalMyDsl.g:2169:1: ( '}' )
            {
            // InternalMyDsl.g:2169:1: ( '}' )
            // InternalMyDsl.g:2170:2: '}'
=======
            // InternalMyDsl.g:4038:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:4039:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:4039:2: ( ruleAttribute )
            // InternalMyDsl.g:4040:3: ruleAttribute
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5130:1: ( ( ( 'required' ) ) )
            // InternalMyDsl.g:5131:2: ( ( 'required' ) )
            {
            // InternalMyDsl.g:5131:2: ( ( 'required' ) )
            // InternalMyDsl.g:5132:3: ( 'required' )
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0()); 
            // InternalMyDsl.g:5133:3: ( 'required' )
            // InternalMyDsl.g:5134:4: 'required'
            {
             before(grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0()); 

            }

             after(grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0()); 

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
    // $ANTLR end "rule__Message__RequiredAssignment_2"


<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR start "rule__Loop__Group__0"
    // InternalMyDsl.g:2180:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Relation__NameAssignment_1"
    // InternalMyDsl.g:4049:1: rule__Relation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR start "rule__Message__FailAssignment_3"
    // InternalMyDsl.g:5145:1: rule__Message__FailAssignment_3 : ( ( 'fail' ) ) ;
    public final void rule__Message__FailAssignment_3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2184:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalMyDsl.g:2185:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Loop__Group__0__Impl();
=======
            // InternalMyDsl.g:4053:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4054:2: ( RULE_ID )
=======
            // InternalMyDsl.g:5149:1: ( ( ( 'fail' ) ) )
            // InternalMyDsl.g:5150:2: ( ( 'fail' ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5150:2: ( ( 'fail' ) )
            // InternalMyDsl.g:5151:3: ( 'fail' )
            {
<<<<<<< HEAD
             before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getMessageAccess().getFailFailKeyword_3_0()); 
            // InternalMyDsl.g:5152:3: ( 'fail' )
            // InternalMyDsl.g:5153:4: 'fail'
            {
             before(grammarAccess.getMessageAccess().getFailFailKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getFailFailKeyword_3_0()); 

            }

             after(grammarAccess.getMessageAccess().getFailFailKeyword_3_0()); 
>>>>>>> [xText] Added new message type: contextMessage

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__1();

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
<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // InternalMyDsl.g:2192:1: rule__Loop__Group__0__Impl : ( 'loop' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR end "rule__Relation__NameAssignment_1"


    // $ANTLR start "rule__Relation__SenderAssignment_3"
    // InternalMyDsl.g:4064:1: rule__Relation__SenderAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__SenderAssignment_3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR end "rule__Message__FailAssignment_3"


    // $ANTLR start "rule__Message__StrictAssignment_4"
    // InternalMyDsl.g:5164:1: rule__Message__StrictAssignment_4 : ( ( 'strict' ) ) ;
    public final void rule__Message__StrictAssignment_4() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2196:1: ( ( 'loop' ) )
            // InternalMyDsl.g:2197:1: ( 'loop' )
            {
            // InternalMyDsl.g:2197:1: ( 'loop' )
            // InternalMyDsl.g:2198:2: 'loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopKeyword_0()); 
=======
            // InternalMyDsl.g:4068:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4069:2: ( ( RULE_ID ) )
=======
            // InternalMyDsl.g:5168:1: ( ( ( 'strict' ) ) )
            // InternalMyDsl.g:5169:2: ( ( 'strict' ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5169:2: ( ( 'strict' ) )
            // InternalMyDsl.g:5170:3: ( 'strict' )
            {
             before(grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0()); 
            // InternalMyDsl.g:5171:3: ( 'strict' )
            // InternalMyDsl.g:5172:4: 'strict'
            {
             before(grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0()); 

            }

<<<<<<< HEAD
             after(grammarAccess.getRelationAccess().getSenderEntityCrossReference_3_0()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             after(grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // InternalMyDsl.g:2207:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {
=======
    // $ANTLR end "rule__Relation__SenderAssignment_3"


    // $ANTLR start "rule__Relation__ReceiverAssignment_5"
    // InternalMyDsl.g:4083:1: rule__Relation__ReceiverAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ReceiverAssignment_5() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR end "rule__Message__StrictAssignment_4"


    // $ANTLR start "rule__Message__SenderAssignment_5"
    // InternalMyDsl.g:5183:1: rule__Message__SenderAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Message__SenderAssignment_5() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2211:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalMyDsl.g:2212:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Loop__Group__1__Impl();
=======
            // InternalMyDsl.g:4087:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4088:2: ( ( RULE_ID ) )
=======
            // InternalMyDsl.g:5187:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5188:2: ( ( RULE_ID ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5188:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5189:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getSenderObjectCrossReference_5_0()); 
            // InternalMyDsl.g:5190:3: ( RULE_ID )
            // InternalMyDsl.g:5191:4: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getSenderObjectIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
<<<<<<< HEAD
             after(grammarAccess.getRelationAccess().getReceiverEntityIDTerminalRuleCall_5_0_1()); 
>>>>>>> Added Xtext for context dependent behavior

            }

<<<<<<< HEAD
            pushFollow(FOLLOW_2);
            rule__Loop__Group__2();
=======
             after(grammarAccess.getRelationAccess().getReceiverEntityCrossReference_5_0()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             after(grammarAccess.getMessageAccess().getSenderObjectIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMessageAccess().getSenderObjectCrossReference_5_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // InternalMyDsl.g:2219:1: rule__Loop__Group__1__Impl : ( '(' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR end "rule__Relation__ReceiverAssignment_5"


    // $ANTLR start "rule__Relation__AttributesAssignment_8"
    // InternalMyDsl.g:4102:1: rule__Relation__AttributesAssignment_8 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_8() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR end "rule__Message__SenderAssignment_5"


    // $ANTLR start "rule__Message__ReceiverAssignment_7"
    // InternalMyDsl.g:5202:1: rule__Message__ReceiverAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Message__ReceiverAssignment_7() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2223:1: ( ( '(' ) )
            // InternalMyDsl.g:2224:1: ( '(' )
            {
            // InternalMyDsl.g:2224:1: ( '(' )
            // InternalMyDsl.g:2225:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1()); 
=======
            // InternalMyDsl.g:4106:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:4107:2: ( ruleAttribute )
=======
            // InternalMyDsl.g:5206:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5207:2: ( ( RULE_ID ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5207:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5208:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getReceiverObjectCrossReference_7_0()); 
            // InternalMyDsl.g:5209:3: ( RULE_ID )
            // InternalMyDsl.g:5210:4: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getReceiverObjectIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getReceiverObjectIDTerminalRuleCall_7_0_1()); 

            }

<<<<<<< HEAD
             after(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_8_0()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             after(grammarAccess.getMessageAccess().getReceiverObjectCrossReference_7_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
<<<<<<< HEAD
<<<<<<< HEAD
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__2"
    // InternalMyDsl.g:2234:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {
=======
    // $ANTLR end "rule__Relation__AttributesAssignment_8"


    // $ANTLR start "rule__Scenario__NameAssignment_1"
    // InternalMyDsl.g:4117:1: rule__Scenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scenario__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR end "rule__Message__ReceiverAssignment_7"


    // $ANTLR start "rule__Message__PastAssignment_8"
    // InternalMyDsl.g:5221:1: rule__Message__PastAssignment_8 : ( ( 'past' ) ) ;
    public final void rule__Message__PastAssignment_8() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2238:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalMyDsl.g:2239:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
=======
            // InternalMyDsl.g:4121:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4122:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4122:2: ( RULE_ID )
            // InternalMyDsl.g:4123:3: RULE_ID
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_24);
            rule__Loop__Group__2__Impl();
=======
            // InternalMyDsl.g:5225:1: ( ( ( 'past' ) ) )
            // InternalMyDsl.g:5226:2: ( ( 'past' ) )
            {
            // InternalMyDsl.g:5226:2: ( ( 'past' ) )
            // InternalMyDsl.g:5227:3: ( 'past' )
            {
             before(grammarAccess.getMessageAccess().getPastPastKeyword_8_0()); 
            // InternalMyDsl.g:5228:3: ( 'past' )
            // InternalMyDsl.g:5229:4: 'past'
            {
             before(grammarAccess.getMessageAccess().getPastPastKeyword_8_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getPastPastKeyword_8_0()); 

            }

             after(grammarAccess.getMessageAccess().getPastPastKeyword_8_0()); 
>>>>>>> [xText] Added new message type: contextMessage

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__3();

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
<<<<<<< HEAD
    // $ANTLR end "rule__Loop__Group__2"


<<<<<<< HEAD
    // $ANTLR start "rule__Loop__Group__2__Impl"
    // InternalMyDsl.g:2246:1: rule__Loop__Group__2__Impl : ( ( rule__Loop__MinAssignment_2 ) ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Scenario__ScenariocontentsAssignment_3"
    // InternalMyDsl.g:4132:1: rule__Scenario__ScenariocontentsAssignment_3 : ( ruleScenarioContent ) ;
    public final void rule__Scenario__ScenariocontentsAssignment_3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR end "rule__Message__PastAssignment_8"


    // $ANTLR start "rule__Message__FutureAssignment_9"
    // InternalMyDsl.g:5240:1: rule__Message__FutureAssignment_9 : ( ( 'future' ) ) ;
    public final void rule__Message__FutureAssignment_9() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2250:1: ( ( ( rule__Loop__MinAssignment_2 ) ) )
            // InternalMyDsl.g:2251:1: ( ( rule__Loop__MinAssignment_2 ) )
            {
            // InternalMyDsl.g:2251:1: ( ( rule__Loop__MinAssignment_2 ) )
            // InternalMyDsl.g:2252:2: ( rule__Loop__MinAssignment_2 )
            {
             before(grammarAccess.getLoopAccess().getMinAssignment_2()); 
            // InternalMyDsl.g:2253:2: ( rule__Loop__MinAssignment_2 )
            // InternalMyDsl.g:2253:3: rule__Loop__MinAssignment_2
=======
            // InternalMyDsl.g:4136:1: ( ( ruleScenarioContent ) )
            // InternalMyDsl.g:4137:2: ( ruleScenarioContent )
            {
            // InternalMyDsl.g:4137:2: ( ruleScenarioContent )
            // InternalMyDsl.g:4138:3: ruleScenarioContent
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_2);
            rule__Loop__MinAssignment_2();
=======
            // InternalMyDsl.g:5244:1: ( ( ( 'future' ) ) )
            // InternalMyDsl.g:5245:2: ( ( 'future' ) )
            {
            // InternalMyDsl.g:5245:2: ( ( 'future' ) )
            // InternalMyDsl.g:5246:3: ( 'future' )
            {
             before(grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0()); 
            // InternalMyDsl.g:5247:3: ( 'future' )
            // InternalMyDsl.g:5248:4: 'future'
            {
             before(grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0()); 
>>>>>>> [xText] Added new message type: contextMessage

            }

<<<<<<< HEAD

            }

             after(grammarAccess.getLoopAccess().getMinAssignment_2()); 
=======
             after(grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
<<<<<<< HEAD
    // $ANTLR end "rule__Loop__Group__2__Impl"


<<<<<<< HEAD
    // $ANTLR start "rule__Loop__Group__3"
    // InternalMyDsl.g:2261:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__ScenarioContent__AltAssignment_0"
    // InternalMyDsl.g:4147:1: rule__ScenarioContent__AltAssignment_0 : ( ruleAlt ) ;
    public final void rule__ScenarioContent__AltAssignment_0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR end "rule__Message__FutureAssignment_9"


    // $ANTLR start "rule__Message__ConstraintAssignment_10"
    // InternalMyDsl.g:5259:1: rule__Message__ConstraintAssignment_10 : ( ( 'constraint' ) ) ;
    public final void rule__Message__ConstraintAssignment_10() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2265:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalMyDsl.g:2266:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Loop__Group__3__Impl();
=======
            // InternalMyDsl.g:4151:1: ( ( ruleAlt ) )
            // InternalMyDsl.g:4152:2: ( ruleAlt )
=======
            // InternalMyDsl.g:5263:1: ( ( ( 'constraint' ) ) )
            // InternalMyDsl.g:5264:2: ( ( 'constraint' ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5264:2: ( ( 'constraint' ) )
            // InternalMyDsl.g:5265:3: ( 'constraint' )
            {
<<<<<<< HEAD
             before(grammarAccess.getScenarioContentAccess().getAltAltParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAlt();
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getMessageAccess().getConstraintConstraintKeyword_10_0()); 
            // InternalMyDsl.g:5266:3: ( 'constraint' )
            // InternalMyDsl.g:5267:4: 'constraint'
            {
             before(grammarAccess.getMessageAccess().getConstraintConstraintKeyword_10_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getConstraintConstraintKeyword_10_0()); 
>>>>>>> [xText] Added new message type: contextMessage

            }

<<<<<<< HEAD
            pushFollow(FOLLOW_2);
            rule__Loop__Group__4();
=======
             after(grammarAccess.getMessageAccess().getConstraintConstraintKeyword_10_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
<<<<<<< HEAD
    // $ANTLR end "rule__Loop__Group__3"


<<<<<<< HEAD
    // $ANTLR start "rule__Loop__Group__3__Impl"
    // InternalMyDsl.g:2273:1: rule__Loop__Group__3__Impl : ( ',' ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ScenarioContent__MessageAssignment_1"
    // InternalMyDsl.g:4162:1: rule__ScenarioContent__MessageAssignment_1 : ( ruleMessage ) ;
    public final void rule__ScenarioContent__MessageAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR end "rule__Message__ConstraintAssignment_10"


    // $ANTLR start "rule__Message__CAssignment_12"
    // InternalMyDsl.g:5278:1: rule__Message__CAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Message__CAssignment_12() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2277:1: ( ( ',' ) )
            // InternalMyDsl.g:2278:1: ( ',' )
            {
            // InternalMyDsl.g:2278:1: ( ',' )
            // InternalMyDsl.g:2279:2: ','
=======
            // InternalMyDsl.g:4166:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4167:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4167:2: ( ruleMessage )
            // InternalMyDsl.g:4168:3: ruleMessage
>>>>>>> Added Xtext for context dependent behavior
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_3()); 
=======
            // InternalMyDsl.g:5282:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5283:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5283:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5284:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getCConstraintCrossReference_12_0()); 
            // InternalMyDsl.g:5285:3: ( RULE_ID )
            // InternalMyDsl.g:5286:4: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getCConstraintIDTerminalRuleCall_12_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getCConstraintIDTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getMessageAccess().getCConstraintCrossReference_12_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
<<<<<<< HEAD
    // $ANTLR end "rule__Loop__Group__3__Impl"


<<<<<<< HEAD
    // $ANTLR start "rule__Loop__Group__4"
    // InternalMyDsl.g:2288:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl rule__Loop__Group__5 ;
    public final void rule__Loop__Group__4() throws RecognitionException {
=======
    // $ANTLR start "rule__ScenarioContent__ParAssignment_2"
    // InternalMyDsl.g:4177:1: rule__ScenarioContent__ParAssignment_2 : ( rulePar ) ;
    public final void rule__ScenarioContent__ParAssignment_2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR end "rule__Message__CAssignment_12"


    // $ANTLR start "rule__ContextMessage__RequiredAssignment_1"
    // InternalMyDsl.g:5297:1: rule__ContextMessage__RequiredAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__ContextMessage__RequiredAssignment_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2292:1: ( rule__Loop__Group__4__Impl rule__Loop__Group__5 )
            // InternalMyDsl.g:2293:2: rule__Loop__Group__4__Impl rule__Loop__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Loop__Group__4__Impl();
=======
            // InternalMyDsl.g:4181:1: ( ( rulePar ) )
            // InternalMyDsl.g:4182:2: ( rulePar )
=======
            // InternalMyDsl.g:5301:1: ( ( ( 'required' ) ) )
            // InternalMyDsl.g:5302:2: ( ( 'required' ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5302:2: ( ( 'required' ) )
            // InternalMyDsl.g:5303:3: ( 'required' )
            {
<<<<<<< HEAD
             before(grammarAccess.getScenarioContentAccess().getParParParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePar();
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getContextMessageAccess().getRequiredRequiredKeyword_1_0()); 
            // InternalMyDsl.g:5304:3: ( 'required' )
            // InternalMyDsl.g:5305:4: 'required'
            {
             before(grammarAccess.getContextMessageAccess().getRequiredRequiredKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getContextMessageAccess().getRequiredRequiredKeyword_1_0()); 
>>>>>>> [xText] Added new message type: contextMessage

            }

<<<<<<< HEAD
            pushFollow(FOLLOW_2);
            rule__Loop__Group__5();
=======
             after(grammarAccess.getContextMessageAccess().getRequiredRequiredKeyword_1_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
<<<<<<< HEAD
    // $ANTLR end "rule__Loop__Group__4"


<<<<<<< HEAD
    // $ANTLR start "rule__Loop__Group__4__Impl"
    // InternalMyDsl.g:2300:1: rule__Loop__Group__4__Impl : ( ( rule__Loop__MaxAssignment_4 ) ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__NameAssignment_1"
    // InternalMyDsl.g:4192:1: rule__Message__NameAssignment_1 : ( ruleName ) ;
    public final void rule__Message__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR end "rule__ContextMessage__RequiredAssignment_1"


    // $ANTLR start "rule__ContextMessage__FailAssignment_2"
    // InternalMyDsl.g:5316:1: rule__ContextMessage__FailAssignment_2 : ( ( 'fail' ) ) ;
    public final void rule__ContextMessage__FailAssignment_2() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2304:1: ( ( ( rule__Loop__MaxAssignment_4 ) ) )
            // InternalMyDsl.g:2305:1: ( ( rule__Loop__MaxAssignment_4 ) )
            {
            // InternalMyDsl.g:2305:1: ( ( rule__Loop__MaxAssignment_4 ) )
            // InternalMyDsl.g:2306:2: ( rule__Loop__MaxAssignment_4 )
            {
             before(grammarAccess.getLoopAccess().getMaxAssignment_4()); 
            // InternalMyDsl.g:2307:2: ( rule__Loop__MaxAssignment_4 )
            // InternalMyDsl.g:2307:3: rule__Loop__MaxAssignment_4
=======
            // InternalMyDsl.g:4196:1: ( ( ruleName ) )
            // InternalMyDsl.g:4197:2: ( ruleName )
            {
            // InternalMyDsl.g:4197:2: ( ruleName )
            // InternalMyDsl.g:4198:3: ruleName
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_2);
            rule__Loop__MaxAssignment_4();
=======
            // InternalMyDsl.g:5320:1: ( ( ( 'fail' ) ) )
            // InternalMyDsl.g:5321:2: ( ( 'fail' ) )
            {
            // InternalMyDsl.g:5321:2: ( ( 'fail' ) )
            // InternalMyDsl.g:5322:3: ( 'fail' )
            {
             before(grammarAccess.getContextMessageAccess().getFailFailKeyword_2_0()); 
            // InternalMyDsl.g:5323:3: ( 'fail' )
            // InternalMyDsl.g:5324:4: 'fail'
            {
             before(grammarAccess.getContextMessageAccess().getFailFailKeyword_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getContextMessageAccess().getFailFailKeyword_2_0()); 
>>>>>>> [xText] Added new message type: contextMessage

            }

<<<<<<< HEAD

            }

             after(grammarAccess.getLoopAccess().getMaxAssignment_4()); 
=======
             after(grammarAccess.getContextMessageAccess().getFailFailKeyword_2_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
<<<<<<< HEAD
    // $ANTLR end "rule__Loop__Group__4__Impl"


<<<<<<< HEAD
    // $ANTLR start "rule__Loop__Group__5"
    // InternalMyDsl.g:2315:1: rule__Loop__Group__5 : rule__Loop__Group__5__Impl rule__Loop__Group__6 ;
    public final void rule__Loop__Group__5() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__RequiredAssignment_2"
    // InternalMyDsl.g:4207:1: rule__Message__RequiredAssignment_2 : ( ( 'required' ) ) ;
    public final void rule__Message__RequiredAssignment_2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR end "rule__ContextMessage__FailAssignment_2"


    // $ANTLR start "rule__ContextMessage__StrictAssignment_3"
    // InternalMyDsl.g:5335:1: rule__ContextMessage__StrictAssignment_3 : ( ( 'strict' ) ) ;
    public final void rule__ContextMessage__StrictAssignment_3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2319:1: ( rule__Loop__Group__5__Impl rule__Loop__Group__6 )
            // InternalMyDsl.g:2320:2: rule__Loop__Group__5__Impl rule__Loop__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Loop__Group__5__Impl();
=======
            // InternalMyDsl.g:4211:1: ( ( ( 'required' ) ) )
            // InternalMyDsl.g:4212:2: ( ( 'required' ) )
=======
            // InternalMyDsl.g:5339:1: ( ( ( 'strict' ) ) )
            // InternalMyDsl.g:5340:2: ( ( 'strict' ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5340:2: ( ( 'strict' ) )
            // InternalMyDsl.g:5341:3: ( 'strict' )
            {
             before(grammarAccess.getContextMessageAccess().getStrictStrictKeyword_3_0()); 
            // InternalMyDsl.g:5342:3: ( 'strict' )
            // InternalMyDsl.g:5343:4: 'strict'
            {
<<<<<<< HEAD
             before(grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getContextMessageAccess().getStrictStrictKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getContextMessageAccess().getStrictStrictKeyword_3_0()); 
>>>>>>> [xText] Added new message type: contextMessage

            state._fsp--;

<<<<<<< HEAD
            pushFollow(FOLLOW_2);
            rule__Loop__Group__6();
=======
             after(grammarAccess.getContextMessageAccess().getStrictStrictKeyword_3_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
<<<<<<< HEAD
    // $ANTLR end "rule__Loop__Group__5"


<<<<<<< HEAD
    // $ANTLR start "rule__Loop__Group__5__Impl"
    // InternalMyDsl.g:2327:1: rule__Loop__Group__5__Impl : ( ')' ) ;
    public final void rule__Loop__Group__5__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__FailAssignment_3"
    // InternalMyDsl.g:4226:1: rule__Message__FailAssignment_3 : ( ( 'fail' ) ) ;
    public final void rule__Message__FailAssignment_3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR end "rule__ContextMessage__StrictAssignment_3"


    // $ANTLR start "rule__MatchMessage__NameAssignment_1"
    // InternalMyDsl.g:5354:1: rule__MatchMessage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MatchMessage__NameAssignment_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2331:1: ( ( ')' ) )
            // InternalMyDsl.g:2332:1: ( ')' )
            {
            // InternalMyDsl.g:2332:1: ( ')' )
            // InternalMyDsl.g:2333:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_5()); 
=======
            // InternalMyDsl.g:4230:1: ( ( ( 'fail' ) ) )
            // InternalMyDsl.g:4231:2: ( ( 'fail' ) )
=======
            // InternalMyDsl.g:5358:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5359:2: ( RULE_ID )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5359:2: ( RULE_ID )
            // InternalMyDsl.g:5360:3: RULE_ID
            {
<<<<<<< HEAD
             before(grammarAccess.getMessageAccess().getFailFailKeyword_3_0()); 
            // InternalMyDsl.g:4233:3: ( 'fail' )
            // InternalMyDsl.g:4234:4: 'fail'
            {
             before(grammarAccess.getMessageAccess().getFailFailKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getFailFailKeyword_3_0()); 

            }

             after(grammarAccess.getMessageAccess().getFailFailKeyword_3_0()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getMatchMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMatchMessageAccess().getNameIDTerminalRuleCall_1_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
<<<<<<< HEAD
    // $ANTLR end "rule__Loop__Group__5__Impl"


<<<<<<< HEAD
    // $ANTLR start "rule__Loop__Group__6"
    // InternalMyDsl.g:2342:1: rule__Loop__Group__6 : rule__Loop__Group__6__Impl rule__Loop__Group__7 ;
    public final void rule__Loop__Group__6() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__StrictAssignment_4"
    // InternalMyDsl.g:4245:1: rule__Message__StrictAssignment_4 : ( ( 'strict' ) ) ;
    public final void rule__Message__StrictAssignment_4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior
=======
    // $ANTLR end "rule__MatchMessage__NameAssignment_1"


    // $ANTLR start "rule__MatchMessage__ContentAssignment_3"
    // InternalMyDsl.g:5369:1: rule__MatchMessage__ContentAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MatchMessage__ContentAssignment_3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2346:1: ( rule__Loop__Group__6__Impl rule__Loop__Group__7 )
            // InternalMyDsl.g:2347:2: rule__Loop__Group__6__Impl rule__Loop__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Loop__Group__6__Impl();
=======
            // InternalMyDsl.g:4249:1: ( ( ( 'strict' ) ) )
            // InternalMyDsl.g:4250:2: ( ( 'strict' ) )
=======
            // InternalMyDsl.g:5373:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5374:2: ( ( RULE_ID ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5374:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5375:3: ( RULE_ID )
            {
             before(grammarAccess.getMatchMessageAccess().getContentContextFragmentCrossReference_3_0()); 
            // InternalMyDsl.g:5376:3: ( RULE_ID )
            // InternalMyDsl.g:5377:4: RULE_ID
            {
<<<<<<< HEAD
             before(grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0()); 
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getMatchMessageAccess().getContentContextFragmentIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMatchMessageAccess().getContentContextFragmentIDTerminalRuleCall_3_0_1()); 
>>>>>>> [xText] Added new message type: contextMessage

            state._fsp--;

<<<<<<< HEAD
            pushFollow(FOLLOW_2);
            rule__Loop__Group__7();
=======
             after(grammarAccess.getMatchMessageAccess().getContentContextFragmentCrossReference_3_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__Loop__Group__6"


<<<<<<< HEAD
    // $ANTLR start "rule__Loop__Group__6__Impl"
    // InternalMyDsl.g:2354:1: rule__Loop__Group__6__Impl : ( '{' ) ;
    public final void rule__Loop__Group__6__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__SenderAssignment_5"
    // InternalMyDsl.g:4264:1: rule__Message__SenderAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Message__SenderAssignment_5() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2358:1: ( ( '{' ) )
            // InternalMyDsl.g:2359:1: ( '{' )
            {
            // InternalMyDsl.g:2359:1: ( '{' )
            // InternalMyDsl.g:2360:2: '{'
=======
            // InternalMyDsl.g:4268:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4269:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4269:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4270:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getSenderObjectCrossReference_5_0()); 
            // InternalMyDsl.g:4271:3: ( RULE_ID )
            // InternalMyDsl.g:4272:4: RULE_ID
>>>>>>> Added Xtext for context dependent behavior
            {
             before(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Loop__Group__6__Impl"


<<<<<<< HEAD
    // $ANTLR start "rule__Loop__Group__7"
    // InternalMyDsl.g:2369:1: rule__Loop__Group__7 : rule__Loop__Group__7__Impl rule__Loop__Group__8 ;
    public final void rule__Loop__Group__7() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__ReceiverAssignment_7"
    // InternalMyDsl.g:4283:1: rule__Message__ReceiverAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Message__ReceiverAssignment_7() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2373:1: ( rule__Loop__Group__7__Impl rule__Loop__Group__8 )
            // InternalMyDsl.g:2374:2: rule__Loop__Group__7__Impl rule__Loop__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Loop__Group__7__Impl();
=======
            // InternalMyDsl.g:4287:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4288:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4288:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4289:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getReceiverObjectCrossReference_7_0()); 
            // InternalMyDsl.g:4290:3: ( RULE_ID )
            // InternalMyDsl.g:4291:4: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getReceiverObjectIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getReceiverObjectIDTerminalRuleCall_7_0_1()); 
>>>>>>> Added Xtext for context dependent behavior

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__8();

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
    // $ANTLR end "rule__Loop__Group__7"


    // $ANTLR start "rule__Loop__Group__7__Impl"
    // InternalMyDsl.g:2381:1: rule__Loop__Group__7__Impl : ( ( rule__Loop__MessagesAssignment_7 )* ) ;
    public final void rule__Loop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2385:1: ( ( ( rule__Loop__MessagesAssignment_7 )* ) )
            // InternalMyDsl.g:2386:1: ( ( rule__Loop__MessagesAssignment_7 )* )
            {
            // InternalMyDsl.g:2386:1: ( ( rule__Loop__MessagesAssignment_7 )* )
            // InternalMyDsl.g:2387:2: ( rule__Loop__MessagesAssignment_7 )*
            {
             before(grammarAccess.getLoopAccess().getMessagesAssignment_7()); 
            // InternalMyDsl.g:2388:2: ( rule__Loop__MessagesAssignment_7 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==16) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:2388:3: rule__Loop__MessagesAssignment_7
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Loop__MessagesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getMessagesAssignment_7()); 

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
    // $ANTLR end "rule__Loop__Group__7__Impl"


    // $ANTLR start "rule__Loop__Group__8"
    // InternalMyDsl.g:2396:1: rule__Loop__Group__8 : rule__Loop__Group__8__Impl ;
    public final void rule__Loop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2400:1: ( rule__Loop__Group__8__Impl )
            // InternalMyDsl.g:2401:2: rule__Loop__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__8__Impl();

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
    // $ANTLR end "rule__Loop__Group__8"


    // $ANTLR start "rule__Loop__Group__8__Impl"
    // InternalMyDsl.g:2407:1: rule__Loop__Group__8__Impl : ( '}' ) ;
    public final void rule__Loop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2411:1: ( ( '}' ) )
            // InternalMyDsl.g:2412:1: ( '}' )
            {
            // InternalMyDsl.g:2412:1: ( '}' )
            // InternalMyDsl.g:2413:2: '}'
            {
             before(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Loop__Group__8__Impl"


    // $ANTLR start "rule__Domain__NameAssignment_1"
    // InternalMyDsl.g:2423:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2427:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2428:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2428:2: ( RULE_ID )
            // InternalMyDsl.g:2429:3: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Domain__NameAssignment_1"


    // $ANTLR start "rule__Domain__ObjectsAssignment_3"
    // InternalMyDsl.g:2438:1: rule__Domain__ObjectsAssignment_3 : ( ruleObject ) ;
    public final void rule__Domain__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2442:1: ( ( ruleObject ) )
            // InternalMyDsl.g:2443:2: ( ruleObject )
            {
            // InternalMyDsl.g:2443:2: ( ruleObject )
            // InternalMyDsl.g:2444:3: ruleObject
            {
             before(grammarAccess.getDomainAccess().getObjectsObjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getObjectsObjectParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Domain__ObjectsAssignment_3"


    // $ANTLR start "rule__Domain__ConstraintsAssignment_4"
    // InternalMyDsl.g:2453:1: rule__Domain__ConstraintsAssignment_4 : ( ruleConstraint ) ;
    public final void rule__Domain__ConstraintsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2457:1: ( ( ruleConstraint ) )
            // InternalMyDsl.g:2458:2: ( ruleConstraint )
            {
            // InternalMyDsl.g:2458:2: ( ruleConstraint )
            // InternalMyDsl.g:2459:3: ruleConstraint
            {
             before(grammarAccess.getDomainAccess().getConstraintsConstraintParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getConstraintsConstraintParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Domain__ConstraintsAssignment_4"


    // $ANTLR start "rule__Domain__ScenariosAssignment_5"
    // InternalMyDsl.g:2468:1: rule__Domain__ScenariosAssignment_5 : ( ruleScenario ) ;
    public final void rule__Domain__ScenariosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2472:1: ( ( ruleScenario ) )
            // InternalMyDsl.g:2473:2: ( ruleScenario )
            {
            // InternalMyDsl.g:2473:2: ( ruleScenario )
            // InternalMyDsl.g:2474:3: ruleScenario
            {
             before(grammarAccess.getDomainAccess().getScenariosScenarioParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getScenariosScenarioParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Domain__ScenariosAssignment_5"


    // $ANTLR start "rule__Scenario__NameAssignment_1"
    // InternalMyDsl.g:2483:1: rule__Scenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2487:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2488:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2488:2: ( RULE_ID )
            // InternalMyDsl.g:2489:3: RULE_ID
            {
             before(grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Scenario__NameAssignment_1"


    // $ANTLR start "rule__Scenario__ScenariocontentsAssignment_3"
    // InternalMyDsl.g:2498:1: rule__Scenario__ScenariocontentsAssignment_3 : ( ruleScenarioContent ) ;
    public final void rule__Scenario__ScenariocontentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2502:1: ( ( ruleScenarioContent ) )
            // InternalMyDsl.g:2503:2: ( ruleScenarioContent )
            {
            // InternalMyDsl.g:2503:2: ( ruleScenarioContent )
            // InternalMyDsl.g:2504:3: ruleScenarioContent
            {
             before(grammarAccess.getScenarioAccess().getScenariocontentsScenarioContentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleScenarioContent();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getScenariocontentsScenarioContentParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Scenario__ScenariocontentsAssignment_3"


    // $ANTLR start "rule__ScenarioContent__AltAssignment_0"
    // InternalMyDsl.g:2513:1: rule__ScenarioContent__AltAssignment_0 : ( ruleAlt ) ;
    public final void rule__ScenarioContent__AltAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2517:1: ( ( ruleAlt ) )
            // InternalMyDsl.g:2518:2: ( ruleAlt )
            {
            // InternalMyDsl.g:2518:2: ( ruleAlt )
            // InternalMyDsl.g:2519:3: ruleAlt
            {
             before(grammarAccess.getScenarioContentAccess().getAltAltParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAlt();

            state._fsp--;

             after(grammarAccess.getScenarioContentAccess().getAltAltParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ScenarioContent__AltAssignment_0"


    // $ANTLR start "rule__ScenarioContent__MessageAssignment_1"
    // InternalMyDsl.g:2528:1: rule__ScenarioContent__MessageAssignment_1 : ( ruleMessage ) ;
    public final void rule__ScenarioContent__MessageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2532:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:2533:2: ( ruleMessage )
            {
            // InternalMyDsl.g:2533:2: ( ruleMessage )
            // InternalMyDsl.g:2534:3: ruleMessage
            {
             before(grammarAccess.getScenarioContentAccess().getMessageMessageParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getScenarioContentAccess().getMessageMessageParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ScenarioContent__MessageAssignment_1"


    // $ANTLR start "rule__ScenarioContent__ParAssignment_2"
    // InternalMyDsl.g:2543:1: rule__ScenarioContent__ParAssignment_2 : ( rulePar ) ;
    public final void rule__ScenarioContent__ParAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2547:1: ( ( rulePar ) )
            // InternalMyDsl.g:2548:2: ( rulePar )
            {
            // InternalMyDsl.g:2548:2: ( rulePar )
            // InternalMyDsl.g:2549:3: rulePar
            {
             before(grammarAccess.getScenarioContentAccess().getParParParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePar();

            state._fsp--;

             after(grammarAccess.getScenarioContentAccess().getParParParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ScenarioContent__ParAssignment_2"


    // $ANTLR start "rule__ScenarioContent__LoopAssignment_3"
    // InternalMyDsl.g:2558:1: rule__ScenarioContent__LoopAssignment_3 : ( ruleLoop ) ;
    public final void rule__ScenarioContent__LoopAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2562:1: ( ( ruleLoop ) )
            // InternalMyDsl.g:2563:2: ( ruleLoop )
            {
            // InternalMyDsl.g:2563:2: ( ruleLoop )
            // InternalMyDsl.g:2564:3: ruleLoop
            {
             before(grammarAccess.getScenarioContentAccess().getLoopLoopParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getScenarioContentAccess().getLoopLoopParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ScenarioContent__LoopAssignment_3"


    // $ANTLR start "rule__Message__NameAssignment_1"
    // InternalMyDsl.g:2573:1: rule__Message__NameAssignment_1 : ( ruleName ) ;
    public final void rule__Message__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2577:1: ( ( ruleName ) )
            // InternalMyDsl.g:2578:2: ( ruleName )
            {
            // InternalMyDsl.g:2578:2: ( ruleName )
            // InternalMyDsl.g:2579:3: ruleName
            {
             before(grammarAccess.getMessageAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getNameNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Message__NameAssignment_1"


    // $ANTLR start "rule__Message__RequiredAssignment_2"
    // InternalMyDsl.g:2588:1: rule__Message__RequiredAssignment_2 : ( ( 'required' ) ) ;
    public final void rule__Message__RequiredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2592:1: ( ( ( 'required' ) ) )
            // InternalMyDsl.g:2593:2: ( ( 'required' ) )
            {
            // InternalMyDsl.g:2593:2: ( ( 'required' ) )
            // InternalMyDsl.g:2594:3: ( 'required' )
            {
             before(grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0()); 
            // InternalMyDsl.g:2595:3: ( 'required' )
            // InternalMyDsl.g:2596:4: 'required'
            {
             before(grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0()); 

            }

             after(grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0()); 

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
    // $ANTLR end "rule__Message__RequiredAssignment_2"


    // $ANTLR start "rule__Message__FailAssignment_3"
    // InternalMyDsl.g:2607:1: rule__Message__FailAssignment_3 : ( ( 'fail' ) ) ;
    public final void rule__Message__FailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2611:1: ( ( ( 'fail' ) ) )
            // InternalMyDsl.g:2612:2: ( ( 'fail' ) )
            {
            // InternalMyDsl.g:2612:2: ( ( 'fail' ) )
            // InternalMyDsl.g:2613:3: ( 'fail' )
            {
             before(grammarAccess.getMessageAccess().getFailFailKeyword_3_0()); 
            // InternalMyDsl.g:2614:3: ( 'fail' )
            // InternalMyDsl.g:2615:4: 'fail'
            {
             before(grammarAccess.getMessageAccess().getFailFailKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getFailFailKeyword_3_0()); 

            }

             after(grammarAccess.getMessageAccess().getFailFailKeyword_3_0()); 

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
    // $ANTLR end "rule__Message__FailAssignment_3"


    // $ANTLR start "rule__Message__StrictAssignment_4"
    // InternalMyDsl.g:2626:1: rule__Message__StrictAssignment_4 : ( ( 'strict' ) ) ;
    public final void rule__Message__StrictAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2630:1: ( ( ( 'strict' ) ) )
            // InternalMyDsl.g:2631:2: ( ( 'strict' ) )
            {
            // InternalMyDsl.g:2631:2: ( ( 'strict' ) )
            // InternalMyDsl.g:2632:3: ( 'strict' )
            {
             before(grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0()); 
            // InternalMyDsl.g:2633:3: ( 'strict' )
            // InternalMyDsl.g:2634:4: 'strict'
            {
             before(grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0()); 

            }

             after(grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0()); 

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
    // $ANTLR end "rule__MatchMessage__ContentAssignment_3"


<<<<<<< HEAD
    // $ANTLR start "rule__Message__SenderAssignment_5"
    // InternalMyDsl.g:2645:1: rule__Message__SenderAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Message__SenderAssignment_5() throws RecognitionException {
=======
    // $ANTLR start "rule__AppearMessage__NameAssignment_1"
    // InternalMyDsl.g:5388:1: rule__AppearMessage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AppearMessage__NameAssignment_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2649:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2650:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2650:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2651:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getSenderObjectCrossReference_5_0()); 
            // InternalMyDsl.g:2652:3: ( RULE_ID )
            // InternalMyDsl.g:2653:4: RULE_ID
=======
            // InternalMyDsl.g:5392:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5393:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5393:2: ( RULE_ID )
            // InternalMyDsl.g:5394:3: RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getAppearMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAppearMessageAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AppearMessage__NameAssignment_1"


<<<<<<< HEAD
    // $ANTLR start "rule__Message__ReceiverAssignment_7"
    // InternalMyDsl.g:2664:1: rule__Message__ReceiverAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Message__ReceiverAssignment_7() throws RecognitionException {
=======
    // $ANTLR start "rule__AppearMessage__EntityAssignment_3"
    // InternalMyDsl.g:5403:1: rule__AppearMessage__EntityAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AppearMessage__EntityAssignment_3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2668:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2669:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2669:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2670:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getReceiverObjectCrossReference_7_0()); 
            // InternalMyDsl.g:2671:3: ( RULE_ID )
            // InternalMyDsl.g:2672:4: RULE_ID
=======
            // InternalMyDsl.g:5407:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5408:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5408:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5409:3: ( RULE_ID )
            {
             before(grammarAccess.getAppearMessageAccess().getEntityEntityCrossReference_3_0()); 
            // InternalMyDsl.g:5410:3: ( RULE_ID )
            // InternalMyDsl.g:5411:4: RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getAppearMessageAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAppearMessageAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAppearMessageAccess().getEntityEntityCrossReference_3_0()); 

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
    // $ANTLR end "rule__AppearMessage__EntityAssignment_3"


<<<<<<< HEAD
    // $ANTLR start "rule__Message__PastAssignment_8"
<<<<<<< HEAD
    // InternalMyDsl.g:2683:1: rule__Message__PastAssignment_8 : ( ( 'past' ) ) ;
=======
    // InternalMyDsl.g:4302:1: rule__Message__PastAssignment_8 : ( ( 'past' ) ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__Message__PastAssignment_8() throws RecognitionException {
=======
    // $ANTLR start "rule__DisappearMessage__NameAssignment_1"
    // InternalMyDsl.g:5422:1: rule__DisappearMessage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DisappearMessage__NameAssignment_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2687:1: ( ( ( 'past' ) ) )
            // InternalMyDsl.g:2688:2: ( ( 'past' ) )
            {
            // InternalMyDsl.g:2688:2: ( ( 'past' ) )
            // InternalMyDsl.g:2689:3: ( 'past' )
            {
             before(grammarAccess.getMessageAccess().getPastPastKeyword_8_0()); 
            // InternalMyDsl.g:2690:3: ( 'past' )
            // InternalMyDsl.g:2691:4: 'past'
            {
             before(grammarAccess.getMessageAccess().getPastPastKeyword_8_0()); 
            match(input,36,FOLLOW_2); 
=======
            // InternalMyDsl.g:4306:1: ( ( ( 'past' ) ) )
            // InternalMyDsl.g:4307:2: ( ( 'past' ) )
=======
            // InternalMyDsl.g:5426:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5427:2: ( RULE_ID )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5427:2: ( RULE_ID )
            // InternalMyDsl.g:5428:3: RULE_ID
            {
<<<<<<< HEAD
             before(grammarAccess.getMessageAccess().getPastPastKeyword_8_0()); 
            // InternalMyDsl.g:4309:3: ( 'past' )
            // InternalMyDsl.g:4310:4: 'past'
            {
             before(grammarAccess.getMessageAccess().getPastPastKeyword_8_0()); 
            match(input,44,FOLLOW_2); 
>>>>>>> Added Xtext for context dependent behavior
             after(grammarAccess.getMessageAccess().getPastPastKeyword_8_0()); 

            }

             after(grammarAccess.getMessageAccess().getPastPastKeyword_8_0()); 
=======
             before(grammarAccess.getDisappearMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDisappearMessageAccess().getNameIDTerminalRuleCall_1_0()); 
>>>>>>> [xText] Added new message type: contextMessage

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
    // $ANTLR end "rule__DisappearMessage__NameAssignment_1"


<<<<<<< HEAD
    // $ANTLR start "rule__Message__FutureAssignment_9"
<<<<<<< HEAD
    // InternalMyDsl.g:2702:1: rule__Message__FutureAssignment_9 : ( ( 'future' ) ) ;
=======
    // InternalMyDsl.g:4321:1: rule__Message__FutureAssignment_9 : ( ( 'future' ) ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__Message__FutureAssignment_9() throws RecognitionException {
=======
    // $ANTLR start "rule__DisappearMessage__EntityAssignment_3"
    // InternalMyDsl.g:5437:1: rule__DisappearMessage__EntityAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DisappearMessage__EntityAssignment_3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2706:1: ( ( ( 'future' ) ) )
            // InternalMyDsl.g:2707:2: ( ( 'future' ) )
            {
            // InternalMyDsl.g:2707:2: ( ( 'future' ) )
            // InternalMyDsl.g:2708:3: ( 'future' )
            {
             before(grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0()); 
            // InternalMyDsl.g:2709:3: ( 'future' )
            // InternalMyDsl.g:2710:4: 'future'
            {
             before(grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0()); 
            match(input,37,FOLLOW_2); 
=======
            // InternalMyDsl.g:4325:1: ( ( ( 'future' ) ) )
            // InternalMyDsl.g:4326:2: ( ( 'future' ) )
=======
            // InternalMyDsl.g:5441:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5442:2: ( ( RULE_ID ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5442:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5443:3: ( RULE_ID )
            {
             before(grammarAccess.getDisappearMessageAccess().getEntityEntityCrossReference_3_0()); 
            // InternalMyDsl.g:5444:3: ( RULE_ID )
            // InternalMyDsl.g:5445:4: RULE_ID
            {
<<<<<<< HEAD
             before(grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0()); 
            match(input,45,FOLLOW_2); 
>>>>>>> Added Xtext for context dependent behavior
             after(grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0()); 
=======
             before(grammarAccess.getDisappearMessageAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDisappearMessageAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 
>>>>>>> [xText] Added new message type: contextMessage

            }

             after(grammarAccess.getDisappearMessageAccess().getEntityEntityCrossReference_3_0()); 

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
    // $ANTLR end "rule__DisappearMessage__EntityAssignment_3"


<<<<<<< HEAD
    // $ANTLR start "rule__Message__ConstraintAssignment_10"
<<<<<<< HEAD
    // InternalMyDsl.g:2721:1: rule__Message__ConstraintAssignment_10 : ( ( 'constraint' ) ) ;
=======
    // InternalMyDsl.g:4340:1: rule__Message__ConstraintAssignment_10 : ( ( 'constraint' ) ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__Message__ConstraintAssignment_10() throws RecognitionException {
=======
    // $ANTLR start "rule__DistanceMessage__NameAssignment_1"
    // InternalMyDsl.g:5456:1: rule__DistanceMessage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DistanceMessage__NameAssignment_1() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2725:1: ( ( ( 'constraint' ) ) )
            // InternalMyDsl.g:2726:2: ( ( 'constraint' ) )
            {
            // InternalMyDsl.g:2726:2: ( ( 'constraint' ) )
            // InternalMyDsl.g:2727:3: ( 'constraint' )
            {
             before(grammarAccess.getMessageAccess().getConstraintConstraintKeyword_10_0()); 
            // InternalMyDsl.g:2728:3: ( 'constraint' )
            // InternalMyDsl.g:2729:4: 'constraint'
=======
            // InternalMyDsl.g:4344:1: ( ( ( 'constraint' ) ) )
            // InternalMyDsl.g:4345:2: ( ( 'constraint' ) )
            {
            // InternalMyDsl.g:4345:2: ( ( 'constraint' ) )
            // InternalMyDsl.g:4346:3: ( 'constraint' )
            {
             before(grammarAccess.getMessageAccess().getConstraintConstraintKeyword_10_0()); 
            // InternalMyDsl.g:4347:3: ( 'constraint' )
            // InternalMyDsl.g:4348:4: 'constraint'
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5460:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5461:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5461:2: ( RULE_ID )
            // InternalMyDsl.g:5462:3: RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getDistanceMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDistanceMessageAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DistanceMessage__NameAssignment_1"


<<<<<<< HEAD
    // $ANTLR start "rule__Message__CAssignment_12"
<<<<<<< HEAD
    // InternalMyDsl.g:2740:1: rule__Message__CAssignment_12 : ( ( RULE_ID ) ) ;
=======
    // InternalMyDsl.g:4359:1: rule__Message__CAssignment_12 : ( ( RULE_ID ) ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__Message__CAssignment_12() throws RecognitionException {
=======
    // $ANTLR start "rule__DistanceMessage__EntityAssignment_3"
    // InternalMyDsl.g:5471:1: rule__DistanceMessage__EntityAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DistanceMessage__EntityAssignment_3() throws RecognitionException {
>>>>>>> [xText] Added new message type: contextMessage

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2744:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2745:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2745:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2746:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getCConstraintCrossReference_12_0()); 
            // InternalMyDsl.g:2747:3: ( RULE_ID )
            // InternalMyDsl.g:2748:4: RULE_ID
=======
            // InternalMyDsl.g:4363:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4364:2: ( ( RULE_ID ) )
=======
            // InternalMyDsl.g:5475:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5476:2: ( ( RULE_ID ) )
>>>>>>> [xText] Added new message type: contextMessage
            {
            // InternalMyDsl.g:5476:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5477:3: ( RULE_ID )
            {
<<<<<<< HEAD
             before(grammarAccess.getMessageAccess().getCConstraintCrossReference_12_0()); 
            // InternalMyDsl.g:4366:3: ( RULE_ID )
            // InternalMyDsl.g:4367:4: RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
             before(grammarAccess.getDistanceMessageAccess().getEntityEntityCrossReference_3_0()); 
            // InternalMyDsl.g:5478:3: ( RULE_ID )
            // InternalMyDsl.g:5479:4: RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getDistanceMessageAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDistanceMessageAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDistanceMessageAccess().getEntityEntityCrossReference_3_0()); 

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
    // $ANTLR end "rule__DistanceMessage__EntityAssignment_3"


    // $ANTLR start "rule__ObjectType__NameAssignment_1"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:2759:1: rule__ObjectType__NameAssignment_1 : ( RULE_ID ) ;
=======
    // InternalMyDsl.g:4378:1: rule__ObjectType__NameAssignment_1 : ( RULE_ID ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:5490:1: rule__ObjectType__NameAssignment_1 : ( RULE_ID ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final void rule__ObjectType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2763:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2764:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2764:2: ( RULE_ID )
            // InternalMyDsl.g:2765:3: RULE_ID
=======
            // InternalMyDsl.g:4382:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4383:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4383:2: ( RULE_ID )
            // InternalMyDsl.g:4384:3: RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5494:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5495:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5495:2: ( RULE_ID )
            // InternalMyDsl.g:5496:3: RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getObjectTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ObjectType__NameAssignment_1"


    // $ANTLR start "rule__Object__ObjectAssignment_0"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:2774:1: rule__Object__ObjectAssignment_0 : ( ruleObjectType ) ;
=======
    // InternalMyDsl.g:4393:1: rule__Object__ObjectAssignment_0 : ( ruleObjectType ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:5505:1: rule__Object__ObjectAssignment_0 : ( ruleObjectType ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final void rule__Object__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2778:1: ( ( ruleObjectType ) )
            // InternalMyDsl.g:2779:2: ( ruleObjectType )
            {
            // InternalMyDsl.g:2779:2: ( ruleObjectType )
            // InternalMyDsl.g:2780:3: ruleObjectType
=======
            // InternalMyDsl.g:4397:1: ( ( ruleObjectType ) )
            // InternalMyDsl.g:4398:2: ( ruleObjectType )
            {
            // InternalMyDsl.g:4398:2: ( ruleObjectType )
            // InternalMyDsl.g:4399:3: ruleObjectType
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5509:1: ( ( ruleObjectType ) )
            // InternalMyDsl.g:5510:2: ( ruleObjectType )
            {
            // InternalMyDsl.g:5510:2: ( ruleObjectType )
            // InternalMyDsl.g:5511:3: ruleObjectType
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getObjectAccess().getObjectObjectTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectType();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getObjectObjectTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Object__ObjectAssignment_0"


    // $ANTLR start "rule__Object__NameAssignment_1"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:2789:1: rule__Object__NameAssignment_1 : ( RULE_ID ) ;
=======
    // InternalMyDsl.g:4408:1: rule__Object__NameAssignment_1 : ( RULE_ID ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:5520:1: rule__Object__NameAssignment_1 : ( RULE_ID ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final void rule__Object__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2793:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2794:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2794:2: ( RULE_ID )
            // InternalMyDsl.g:2795:3: RULE_ID
=======
            // InternalMyDsl.g:4412:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4413:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4413:2: ( RULE_ID )
            // InternalMyDsl.g:4414:3: RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5524:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5525:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5525:2: ( RULE_ID )
            // InternalMyDsl.g:5526:3: RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Object__NameAssignment_1"


    // $ANTLR start "rule__Constraint__NameAssignment_1"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:2804:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
=======
    // InternalMyDsl.g:4423:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:5535:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2808:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2809:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2809:2: ( RULE_ID )
            // InternalMyDsl.g:2810:3: RULE_ID
=======
            // InternalMyDsl.g:4427:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4428:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4428:2: ( RULE_ID )
            // InternalMyDsl.g:4429:3: RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5539:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5540:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5540:2: ( RULE_ID )
            // InternalMyDsl.g:5541:3: RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Constraint__NameAssignment_1"


    // $ANTLR start "rule__Constraint__MessagesAssignment_3"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:2819:1: rule__Constraint__MessagesAssignment_3 : ( ruleMessage ) ;
=======
    // InternalMyDsl.g:4438:1: rule__Constraint__MessagesAssignment_3 : ( ruleMessage ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:5550:1: rule__Constraint__MessagesAssignment_3 : ( ruleMessage ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final void rule__Constraint__MessagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2823:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:2824:2: ( ruleMessage )
            {
            // InternalMyDsl.g:2824:2: ( ruleMessage )
            // InternalMyDsl.g:2825:3: ruleMessage
=======
            // InternalMyDsl.g:4442:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4443:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4443:2: ( ruleMessage )
            // InternalMyDsl.g:4444:3: ruleMessage
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5554:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:5555:2: ( ruleMessage )
            {
            // InternalMyDsl.g:5555:2: ( ruleMessage )
            // InternalMyDsl.g:5556:3: ruleMessage
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getConstraintAccess().getMessagesMessageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getMessagesMessageParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Constraint__MessagesAssignment_3"


    // $ANTLR start "rule__Alt__ExpressionsAssignment_1"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:2834:1: rule__Alt__ExpressionsAssignment_1 : ( ruleExpression ) ;
=======
    // InternalMyDsl.g:4453:1: rule__Alt__ExpressionsAssignment_1 : ( ruleExpression ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:5565:1: rule__Alt__ExpressionsAssignment_1 : ( ruleExpression ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final void rule__Alt__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2838:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2839:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2839:2: ( ruleExpression )
            // InternalMyDsl.g:2840:3: ruleExpression
=======
            // InternalMyDsl.g:4457:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:4458:2: ( ruleExpression )
            {
            // InternalMyDsl.g:4458:2: ( ruleExpression )
            // InternalMyDsl.g:4459:3: ruleExpression
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5569:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5570:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5570:2: ( ruleExpression )
            // InternalMyDsl.g:5571:3: ruleExpression
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getAltAccess().getExpressionsExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAltAccess().getExpressionsExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Alt__ExpressionsAssignment_1"


    // $ANTLR start "rule__Expression__MessagesAssignment_10"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:2849:1: rule__Expression__MessagesAssignment_10 : ( ruleMessage ) ;
=======
    // InternalMyDsl.g:4468:1: rule__Expression__MessagesAssignment_10 : ( ruleMessage ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:5580:1: rule__Expression__MessagesAssignment_10 : ( ruleMessage ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final void rule__Expression__MessagesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2853:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:2854:2: ( ruleMessage )
            {
            // InternalMyDsl.g:2854:2: ( ruleMessage )
            // InternalMyDsl.g:2855:3: ruleMessage
=======
            // InternalMyDsl.g:4472:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4473:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4473:2: ( ruleMessage )
            // InternalMyDsl.g:4474:3: ruleMessage
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5584:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:5585:2: ( ruleMessage )
            {
            // InternalMyDsl.g:5585:2: ( ruleMessage )
            // InternalMyDsl.g:5586:3: ruleMessage
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getExpressionAccess().getMessagesMessageParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getMessagesMessageParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Expression__MessagesAssignment_10"


    // $ANTLR start "rule__Par__ParexpressionAssignment_2"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:2864:1: rule__Par__ParexpressionAssignment_2 : ( ruleParExpression ) ;
=======
    // InternalMyDsl.g:4483:1: rule__Par__ParexpressionAssignment_2 : ( ruleParExpression ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:5595:1: rule__Par__ParexpressionAssignment_2 : ( ruleParExpression ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final void rule__Par__ParexpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2868:1: ( ( ruleParExpression ) )
            // InternalMyDsl.g:2869:2: ( ruleParExpression )
            {
            // InternalMyDsl.g:2869:2: ( ruleParExpression )
            // InternalMyDsl.g:2870:3: ruleParExpression
=======
            // InternalMyDsl.g:4487:1: ( ( ruleParExpression ) )
            // InternalMyDsl.g:4488:2: ( ruleParExpression )
            {
            // InternalMyDsl.g:4488:2: ( ruleParExpression )
            // InternalMyDsl.g:4489:3: ruleParExpression
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5599:1: ( ( ruleParExpression ) )
            // InternalMyDsl.g:5600:2: ( ruleParExpression )
            {
            // InternalMyDsl.g:5600:2: ( ruleParExpression )
            // InternalMyDsl.g:5601:3: ruleParExpression
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getParAccess().getParexpressionParExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParExpression();

            state._fsp--;

             after(grammarAccess.getParAccess().getParexpressionParExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Par__ParexpressionAssignment_2"


    // $ANTLR start "rule__ParExpression__NameAssignment_1"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:2879:1: rule__ParExpression__NameAssignment_1 : ( RULE_ID ) ;
=======
    // InternalMyDsl.g:4498:1: rule__ParExpression__NameAssignment_1 : ( RULE_ID ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:5610:1: rule__ParExpression__NameAssignment_1 : ( RULE_ID ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final void rule__ParExpression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2883:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2884:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2884:2: ( RULE_ID )
            // InternalMyDsl.g:2885:3: RULE_ID
=======
            // InternalMyDsl.g:4502:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4503:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4503:2: ( RULE_ID )
            // InternalMyDsl.g:4504:3: RULE_ID
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5614:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5615:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5615:2: ( RULE_ID )
            // InternalMyDsl.g:5616:3: RULE_ID
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getParExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParExpressionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ParExpression__NameAssignment_1"


    // $ANTLR start "rule__ParExpression__MessagesAssignment_3"
<<<<<<< HEAD
<<<<<<< HEAD
    // InternalMyDsl.g:2894:1: rule__ParExpression__MessagesAssignment_3 : ( ruleMessage ) ;
=======
    // InternalMyDsl.g:4513:1: rule__ParExpression__MessagesAssignment_3 : ( ruleMessage ) ;
>>>>>>> Added Xtext for context dependent behavior
=======
    // InternalMyDsl.g:5625:1: rule__ParExpression__MessagesAssignment_3 : ( ruleMessage ) ;
>>>>>>> [xText] Added new message type: contextMessage
    public final void rule__ParExpression__MessagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
<<<<<<< HEAD
            // InternalMyDsl.g:2898:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:2899:2: ( ruleMessage )
            {
            // InternalMyDsl.g:2899:2: ( ruleMessage )
            // InternalMyDsl.g:2900:3: ruleMessage
=======
            // InternalMyDsl.g:4517:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:4518:2: ( ruleMessage )
            {
            // InternalMyDsl.g:4518:2: ( ruleMessage )
            // InternalMyDsl.g:4519:3: ruleMessage
>>>>>>> Added Xtext for context dependent behavior
=======
            // InternalMyDsl.g:5629:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:5630:2: ( ruleMessage )
            {
            // InternalMyDsl.g:5630:2: ( ruleMessage )
            // InternalMyDsl.g:5631:3: ruleMessage
>>>>>>> [xText] Added new message type: contextMessage
            {
             before(grammarAccess.getParExpressionAccess().getMessagesMessageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getParExpressionAccess().getMessagesMessageParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ParExpression__MessagesAssignment_3"


    // $ANTLR start "rule__Loop__MinAssignment_2"
    // InternalMyDsl.g:2909:1: rule__Loop__MinAssignment_2 : ( RULE_NUMBER ) ;
    public final void rule__Loop__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2913:1: ( ( RULE_NUMBER ) )
            // InternalMyDsl.g:2914:2: ( RULE_NUMBER )
            {
            // InternalMyDsl.g:2914:2: ( RULE_NUMBER )
            // InternalMyDsl.g:2915:3: RULE_NUMBER
            {
             before(grammarAccess.getLoopAccess().getMinNumberTerminalRuleCall_2_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getMinNumberTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Loop__MinAssignment_2"


    // $ANTLR start "rule__Loop__MaxAssignment_4"
    // InternalMyDsl.g:2924:1: rule__Loop__MaxAssignment_4 : ( RULE_NUMBER ) ;
    public final void rule__Loop__MaxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2928:1: ( ( RULE_NUMBER ) )
            // InternalMyDsl.g:2929:2: ( RULE_NUMBER )
            {
            // InternalMyDsl.g:2929:2: ( RULE_NUMBER )
            // InternalMyDsl.g:2930:3: RULE_NUMBER
            {
             before(grammarAccess.getLoopAccess().getMaxNumberTerminalRuleCall_4_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getMaxNumberTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Loop__MaxAssignment_4"


    // $ANTLR start "rule__Loop__MessagesAssignment_7"
    // InternalMyDsl.g:2939:1: rule__Loop__MessagesAssignment_7 : ( ruleMessage ) ;
    public final void rule__Loop__MessagesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2943:1: ( ( ruleMessage ) )
            // InternalMyDsl.g:2944:2: ( ruleMessage )
            {
            // InternalMyDsl.g:2944:2: ( ruleMessage )
            // InternalMyDsl.g:2945:3: ruleMessage
            {
             before(grammarAccess.getLoopAccess().getMessagesMessageParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getMessagesMessageParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Loop__MessagesAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
<<<<<<< HEAD
<<<<<<< HEAD
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000060C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000A0814000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000A0810002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000E00000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003000446010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001F100030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L});
=======
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000019273C000L});
=======
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000061273C000L});
>>>>>>> [xText] Added new message type: contextMessage
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000720002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000209A0124000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000209A0120002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000380000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
<<<<<<< HEAD
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000300100806010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000007C00080030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000002L});
>>>>>>> Added Xtext for context dependent behavior
=======
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000C00400806010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000380000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000001F000080030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000004000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000002L});
>>>>>>> [xText] Added new message type: contextMessage

}