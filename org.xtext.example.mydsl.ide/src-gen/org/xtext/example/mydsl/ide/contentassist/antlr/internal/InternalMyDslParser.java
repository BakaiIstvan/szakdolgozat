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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'{'", "'}'", "'scenario'", "'message'", "'->'", "';'", "'('", "')'", "'object'", "'constraint'", "'alt'", "'='", "'>'", "'<'", "'>='", "'<='", "'par'", "'case'", "'loop'", "','", "'required'", "'fail'", "'strict'", "'past'", "'future'"
=======
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'{'", "'}'", "'contextmodel'", "'contextfragment'", "'appear'", "'('", "')'", "'distance'", "'changeTo'", "'conditionsAt'", "';'", "'attribute'", "'entity'", "'relation'", "','", "'scenario'", "'message'", "'->'", "'object'", "'constraint'", "'alt'", "'='", "'>'", "'<'", "'>='", "'<='", "'par'", "'case'", "'required'", "'fail'", "'strict'", "'past'", "'future'"
>>>>>>> Added Xtext for context dependent behavior
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


    // $ANTLR start "entryRuleName"
    // InternalMyDsl.g:328:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleName EOF )
            // InternalMyDsl.g:330:1: ruleName EOF
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
    // InternalMyDsl.g:337:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Name__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Name__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Name__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Name__Group__0 )
            // InternalMyDsl.g:344:4: rule__Name__Group__0
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

    // $ANTLR start "entryRuleObjectType"
    // InternalMyDsl.g:353:1: entryRuleObjectType : ruleObjectType EOF ;
    public final void entryRuleObjectType() throws RecognitionException {
        try {
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
            {
             before(grammarAccess.getObjectTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectType();
>>>>>>> Added Xtext for context dependent behavior

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
    // InternalMyDsl.g:362:1: ruleObjectType : ( ( rule__ObjectType__Group__0 ) ) ;
    public final void ruleObjectType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__ObjectType__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__ObjectType__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__ObjectType__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__ObjectType__Group__0 )
            {
             before(grammarAccess.getObjectTypeAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__ObjectType__Group__0 )
            // InternalMyDsl.g:369:4: rule__ObjectType__Group__0
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
    // InternalMyDsl.g:378:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleObject EOF )
            // InternalMyDsl.g:380:1: ruleObject EOF
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
    // InternalMyDsl.g:387:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Object__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Object__Group__0 )
            // InternalMyDsl.g:394:4: rule__Object__Group__0
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
    // InternalMyDsl.g:403:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleConstraint EOF )
            // InternalMyDsl.g:405:1: ruleConstraint EOF
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
    // InternalMyDsl.g:412:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Constraint__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Constraint__Group__0 )
            // InternalMyDsl.g:419:4: rule__Constraint__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleAlt : ruleAlt EOF ;
    public final void entryRuleAlt() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleAlt EOF )
            // InternalMyDsl.g:430:1: ruleAlt EOF
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
    // InternalMyDsl.g:437:1: ruleAlt : ( ( rule__Alt__Group__0 ) ) ;
    public final void ruleAlt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Alt__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Alt__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Alt__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Alt__Group__0 )
            {
             before(grammarAccess.getAltAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Alt__Group__0 )
            // InternalMyDsl.g:444:4: rule__Alt__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleExpression EOF )
            // InternalMyDsl.g:455:1: ruleExpression EOF
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
    // InternalMyDsl.g:462:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Expression__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Expression__Group__0 )
            // InternalMyDsl.g:469:4: rule__Expression__Group__0
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
    // InternalMyDsl.g:478:1: entryRulePar : rulePar EOF ;
    public final void entryRulePar() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( rulePar EOF )
            // InternalMyDsl.g:480:1: rulePar EOF
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
    // InternalMyDsl.g:487:1: rulePar : ( ( rule__Par__Group__0 ) ) ;
    public final void rulePar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Par__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Par__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Par__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Par__Group__0 )
            {
             before(grammarAccess.getParAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Par__Group__0 )
            // InternalMyDsl.g:494:4: rule__Par__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleParExpression : ruleParExpression EOF ;
    public final void entryRuleParExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleParExpression EOF )
            // InternalMyDsl.g:505:1: ruleParExpression EOF
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
    // InternalMyDsl.g:512:1: ruleParExpression : ( ( rule__ParExpression__Group__0 ) ) ;
    public final void ruleParExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__ParExpression__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__ParExpression__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__ParExpression__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__ParExpression__Group__0 )
            {
             before(grammarAccess.getParExpressionAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__ParExpression__Group__0 )
            // InternalMyDsl.g:519:4: rule__ParExpression__Group__0
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
    // InternalMyDsl.g:527:1: rule__ChangeType__Alternatives : ( ( ( rule__ChangeType__Group_0__0 ) ) | ( ( rule__ChangeType__Group_1__0 ) ) | ( ( rule__ChangeType__Group_2__0 ) ) | ( ( rule__ChangeType__Group_3__0 ) ) );
    public final void rule__ChangeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:531:1: ( ( ( rule__ChangeType__Group_0__0 ) ) | ( ( rule__ChangeType__Group_1__0 ) ) | ( ( rule__ChangeType__Group_2__0 ) ) | ( ( rule__ChangeType__Group_3__0 ) ) )
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
                    // InternalMyDsl.g:532:2: ( ( rule__ChangeType__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:532:2: ( ( rule__ChangeType__Group_0__0 ) )
                    // InternalMyDsl.g:533:3: ( rule__ChangeType__Group_0__0 )
                    {
                     before(grammarAccess.getChangeTypeAccess().getGroup_0()); 
                    // InternalMyDsl.g:534:3: ( rule__ChangeType__Group_0__0 )
                    // InternalMyDsl.g:534:4: rule__ChangeType__Group_0__0
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
                    // InternalMyDsl.g:538:2: ( ( rule__ChangeType__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:538:2: ( ( rule__ChangeType__Group_1__0 ) )
                    // InternalMyDsl.g:539:3: ( rule__ChangeType__Group_1__0 )
                    {
                     before(grammarAccess.getChangeTypeAccess().getGroup_1()); 
                    // InternalMyDsl.g:540:3: ( rule__ChangeType__Group_1__0 )
                    // InternalMyDsl.g:540:4: rule__ChangeType__Group_1__0
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
                    // InternalMyDsl.g:544:2: ( ( rule__ChangeType__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:544:2: ( ( rule__ChangeType__Group_2__0 ) )
                    // InternalMyDsl.g:545:3: ( rule__ChangeType__Group_2__0 )
                    {
                     before(grammarAccess.getChangeTypeAccess().getGroup_2()); 
                    // InternalMyDsl.g:546:3: ( rule__ChangeType__Group_2__0 )
                    // InternalMyDsl.g:546:4: rule__ChangeType__Group_2__0
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
                    // InternalMyDsl.g:550:2: ( ( rule__ChangeType__Group_3__0 ) )
                    {
                    // InternalMyDsl.g:550:2: ( ( rule__ChangeType__Group_3__0 ) )
                    // InternalMyDsl.g:551:3: ( rule__ChangeType__Group_3__0 )
                    {
                     before(grammarAccess.getChangeTypeAccess().getGroup_3()); 
                    // InternalMyDsl.g:552:3: ( rule__ChangeType__Group_3__0 )
                    // InternalMyDsl.g:552:4: rule__ChangeType__Group_3__0
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
    // InternalMyDsl.g:560:1: rule__ScenarioContent__Alternatives : ( ( ( rule__ScenarioContent__AltAssignment_0 ) ) | ( ( rule__ScenarioContent__MessageAssignment_1 ) ) | ( ( rule__ScenarioContent__ParAssignment_2 ) ) );
    public final void rule__ScenarioContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:564:1: ( ( ( rule__ScenarioContent__AltAssignment_0 ) ) | ( ( rule__ScenarioContent__MessageAssignment_1 ) ) | ( ( rule__ScenarioContent__ParAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case 39:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:565:2: ( ( rule__ScenarioContent__AltAssignment_0 ) )
                    {
                    // InternalMyDsl.g:565:2: ( ( rule__ScenarioContent__AltAssignment_0 ) )
                    // InternalMyDsl.g:566:3: ( rule__ScenarioContent__AltAssignment_0 )
                    {
                     before(grammarAccess.getScenarioContentAccess().getAltAssignment_0()); 
                    // InternalMyDsl.g:567:3: ( rule__ScenarioContent__AltAssignment_0 )
                    // InternalMyDsl.g:567:4: rule__ScenarioContent__AltAssignment_0
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
                    // InternalMyDsl.g:571:2: ( ( rule__ScenarioContent__MessageAssignment_1 ) )
                    {
                    // InternalMyDsl.g:571:2: ( ( rule__ScenarioContent__MessageAssignment_1 ) )
                    // InternalMyDsl.g:572:3: ( rule__ScenarioContent__MessageAssignment_1 )
                    {
                     before(grammarAccess.getScenarioContentAccess().getMessageAssignment_1()); 
                    // InternalMyDsl.g:573:3: ( rule__ScenarioContent__MessageAssignment_1 )
                    // InternalMyDsl.g:573:4: rule__ScenarioContent__MessageAssignment_1
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
                    // InternalMyDsl.g:577:2: ( ( rule__ScenarioContent__ParAssignment_2 ) )
                    {
                    // InternalMyDsl.g:577:2: ( ( rule__ScenarioContent__ParAssignment_2 ) )
                    // InternalMyDsl.g:578:3: ( rule__ScenarioContent__ParAssignment_2 )
                    {
                     before(grammarAccess.getScenarioContentAccess().getParAssignment_2()); 
                    // InternalMyDsl.g:579:3: ( rule__ScenarioContent__ParAssignment_2 )
                    // InternalMyDsl.g:579:4: rule__ScenarioContent__ParAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioContent__ParAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioContentAccess().getParAssignment_2()); 

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


    // $ANTLR start "rule__Name__Alternatives_2"
    // InternalMyDsl.g:587:1: rule__Name__Alternatives_2 : ( ( RULE_ID ) | ( RULE_NUMBER ) );
    public final void rule__Name__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:1: ( ( RULE_ID ) | ( RULE_NUMBER ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_NUMBER) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:592:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:592:2: ( RULE_ID )
                    // InternalMyDsl.g:593:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_2_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:598:2: ( RULE_NUMBER )
                    {
                    // InternalMyDsl.g:598:2: ( RULE_NUMBER )
                    // InternalMyDsl.g:599:3: RULE_NUMBER
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
    // InternalMyDsl.g:608:1: rule__Expression__Alternatives_7 : ( ( RULE_ID ) | ( RULE_NUMBER ) );
    public final void rule__Expression__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:612:1: ( ( RULE_ID ) | ( RULE_NUMBER ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_NUMBER) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:613:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:613:2: ( RULE_ID )
                    // InternalMyDsl.g:614:3: RULE_ID
                    {
                     before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_7_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_7_0()); 

                    }


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
    // InternalMyDsl.g:629:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:633:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalMyDsl.g:634:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalMyDsl.g:641:1: rule__Domain__Group__0__Impl : ( 'specification' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:645:1: ( ( 'specification' ) )
            // InternalMyDsl.g:646:1: ( 'specification' )
            {
            // InternalMyDsl.g:646:1: ( 'specification' )
            // InternalMyDsl.g:647:2: 'specification'
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
    // InternalMyDsl.g:656:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:660:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalMyDsl.g:661:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
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
    // InternalMyDsl.g:668:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:672:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalMyDsl.g:673:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:673:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalMyDsl.g:674:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:675:2: ( rule__Domain__NameAssignment_1 )
            // InternalMyDsl.g:675:3: rule__Domain__NameAssignment_1
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
    // InternalMyDsl.g:683:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:687:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalMyDsl.g:688:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
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
    // InternalMyDsl.g:695:1: rule__Domain__Group__2__Impl : ( '{' ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:699:1: ( ( '{' ) )
            // InternalMyDsl.g:700:1: ( '{' )
            {
            // InternalMyDsl.g:700:1: ( '{' )
            // InternalMyDsl.g:701:2: '{'
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
    // InternalMyDsl.g:710:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:714:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // InternalMyDsl.g:715:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
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
    // InternalMyDsl.g:722:1: rule__Domain__Group__3__Impl : ( ( rule__Domain__ContextmodelsAssignment_3 )* ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:726:1: ( ( ( rule__Domain__ContextmodelsAssignment_3 )* ) )
            // InternalMyDsl.g:727:1: ( ( rule__Domain__ContextmodelsAssignment_3 )* )
            {
            // InternalMyDsl.g:727:1: ( ( rule__Domain__ContextmodelsAssignment_3 )* )
            // InternalMyDsl.g:728:2: ( rule__Domain__ContextmodelsAssignment_3 )*
            {
             before(grammarAccess.getDomainAccess().getContextmodelsAssignment_3()); 
            // InternalMyDsl.g:729:2: ( rule__Domain__ContextmodelsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:729:3: rule__Domain__ContextmodelsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Domain__ContextmodelsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalMyDsl.g:737:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // InternalMyDsl.g:742:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
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
    // InternalMyDsl.g:749:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__ContextfragmentsAssignment_4 )* ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:753:1: ( ( ( rule__Domain__ContextfragmentsAssignment_4 )* ) )
            // InternalMyDsl.g:754:1: ( ( rule__Domain__ContextfragmentsAssignment_4 )* )
            {
            // InternalMyDsl.g:754:1: ( ( rule__Domain__ContextfragmentsAssignment_4 )* )
            // InternalMyDsl.g:755:2: ( rule__Domain__ContextfragmentsAssignment_4 )*
            {
             before(grammarAccess.getDomainAccess().getContextfragmentsAssignment_4()); 
            // InternalMyDsl.g:756:2: ( rule__Domain__ContextfragmentsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:756:3: rule__Domain__ContextfragmentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Domain__ContextfragmentsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalMyDsl.g:764:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl rule__Domain__Group__6 ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:768:1: ( rule__Domain__Group__5__Impl rule__Domain__Group__6 )
            // InternalMyDsl.g:769:2: rule__Domain__Group__5__Impl rule__Domain__Group__6
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
    // InternalMyDsl.g:776:1: rule__Domain__Group__5__Impl : ( ( rule__Domain__EntitiesAssignment_5 )* ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:780:1: ( ( ( rule__Domain__EntitiesAssignment_5 )* ) )
            // InternalMyDsl.g:781:1: ( ( rule__Domain__EntitiesAssignment_5 )* )
            {
            // InternalMyDsl.g:781:1: ( ( rule__Domain__EntitiesAssignment_5 )* )
            // InternalMyDsl.g:782:2: ( rule__Domain__EntitiesAssignment_5 )*
            {
             before(grammarAccess.getDomainAccess().getEntitiesAssignment_5()); 
            // InternalMyDsl.g:783:2: ( rule__Domain__EntitiesAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:783:3: rule__Domain__EntitiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Domain__EntitiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMyDsl.g:791:1: rule__Domain__Group__6 : rule__Domain__Group__6__Impl rule__Domain__Group__7 ;
    public final void rule__Domain__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:795:1: ( rule__Domain__Group__6__Impl rule__Domain__Group__7 )
            // InternalMyDsl.g:796:2: rule__Domain__Group__6__Impl rule__Domain__Group__7
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
    // InternalMyDsl.g:803:1: rule__Domain__Group__6__Impl : ( ( rule__Domain__ContextchangesAssignment_6 )* ) ;
    public final void rule__Domain__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:807:1: ( ( ( rule__Domain__ContextchangesAssignment_6 )* ) )
            // InternalMyDsl.g:808:1: ( ( rule__Domain__ContextchangesAssignment_6 )* )
            {
            // InternalMyDsl.g:808:1: ( ( rule__Domain__ContextchangesAssignment_6 )* )
            // InternalMyDsl.g:809:2: ( rule__Domain__ContextchangesAssignment_6 )*
            {
             before(grammarAccess.getDomainAccess().getContextchangesAssignment_6()); 
            // InternalMyDsl.g:810:2: ( rule__Domain__ContextchangesAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17||(LA8_0>=20 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:810:3: rule__Domain__ContextchangesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Domain__ContextchangesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMyDsl.g:818:1: rule__Domain__Group__7 : rule__Domain__Group__7__Impl rule__Domain__Group__8 ;
    public final void rule__Domain__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:822:1: ( rule__Domain__Group__7__Impl rule__Domain__Group__8 )
            // InternalMyDsl.g:823:2: rule__Domain__Group__7__Impl rule__Domain__Group__8
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
    // InternalMyDsl.g:830:1: rule__Domain__Group__7__Impl : ( ( rule__Domain__ObjectsAssignment_7 )* ) ;
    public final void rule__Domain__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:834:1: ( ( ( rule__Domain__ObjectsAssignment_7 )* ) )
            // InternalMyDsl.g:835:1: ( ( rule__Domain__ObjectsAssignment_7 )* )
            {
            // InternalMyDsl.g:835:1: ( ( rule__Domain__ObjectsAssignment_7 )* )
            // InternalMyDsl.g:836:2: ( rule__Domain__ObjectsAssignment_7 )*
            {
             before(grammarAccess.getDomainAccess().getObjectsAssignment_7()); 
            // InternalMyDsl.g:837:2: ( rule__Domain__ObjectsAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:837:3: rule__Domain__ObjectsAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Domain__ObjectsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMyDsl.g:845:1: rule__Domain__Group__8 : rule__Domain__Group__8__Impl rule__Domain__Group__9 ;
    public final void rule__Domain__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:849:1: ( rule__Domain__Group__8__Impl rule__Domain__Group__9 )
            // InternalMyDsl.g:850:2: rule__Domain__Group__8__Impl rule__Domain__Group__9
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
    // InternalMyDsl.g:857:1: rule__Domain__Group__8__Impl : ( ( rule__Domain__ConstraintsAssignment_8 )* ) ;
    public final void rule__Domain__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:861:1: ( ( ( rule__Domain__ConstraintsAssignment_8 )* ) )
            // InternalMyDsl.g:862:1: ( ( rule__Domain__ConstraintsAssignment_8 )* )
            {
            // InternalMyDsl.g:862:1: ( ( rule__Domain__ConstraintsAssignment_8 )* )
            // InternalMyDsl.g:863:2: ( rule__Domain__ConstraintsAssignment_8 )*
            {
             before(grammarAccess.getDomainAccess().getConstraintsAssignment_8()); 
            // InternalMyDsl.g:864:2: ( rule__Domain__ConstraintsAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:864:3: rule__Domain__ConstraintsAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Domain__ConstraintsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMyDsl.g:872:1: rule__Domain__Group__9 : rule__Domain__Group__9__Impl rule__Domain__Group__10 ;
    public final void rule__Domain__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:876:1: ( rule__Domain__Group__9__Impl rule__Domain__Group__10 )
            // InternalMyDsl.g:877:2: rule__Domain__Group__9__Impl rule__Domain__Group__10
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
    // InternalMyDsl.g:884:1: rule__Domain__Group__9__Impl : ( ( rule__Domain__ScenariosAssignment_9 )* ) ;
    public final void rule__Domain__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:888:1: ( ( ( rule__Domain__ScenariosAssignment_9 )* ) )
            // InternalMyDsl.g:889:1: ( ( rule__Domain__ScenariosAssignment_9 )* )
            {
            // InternalMyDsl.g:889:1: ( ( rule__Domain__ScenariosAssignment_9 )* )
            // InternalMyDsl.g:890:2: ( rule__Domain__ScenariosAssignment_9 )*
            {
             before(grammarAccess.getDomainAccess().getScenariosAssignment_9()); 
            // InternalMyDsl.g:891:2: ( rule__Domain__ScenariosAssignment_9 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:891:3: rule__Domain__ScenariosAssignment_9
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Domain__ScenariosAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMyDsl.g:899:1: rule__Domain__Group__10 : rule__Domain__Group__10__Impl ;
    public final void rule__Domain__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:903:1: ( rule__Domain__Group__10__Impl )
            // InternalMyDsl.g:904:2: rule__Domain__Group__10__Impl
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
    // InternalMyDsl.g:910:1: rule__Domain__Group__10__Impl : ( '}' ) ;
    public final void rule__Domain__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:914:1: ( ( '}' ) )
            // InternalMyDsl.g:915:1: ( '}' )
            {
            // InternalMyDsl.g:915:1: ( '}' )
            // InternalMyDsl.g:916:2: '}'
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
    // InternalMyDsl.g:926:1: rule__ContextModel__Group__0 : rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1 ;
    public final void rule__ContextModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:930:1: ( rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1 )
            // InternalMyDsl.g:931:2: rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1
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
    // InternalMyDsl.g:938:1: rule__ContextModel__Group__0__Impl : ( 'contextmodel' ) ;
    public final void rule__ContextModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:942:1: ( ( 'contextmodel' ) )
            // InternalMyDsl.g:943:1: ( 'contextmodel' )
            {
            // InternalMyDsl.g:943:1: ( 'contextmodel' )
            // InternalMyDsl.g:944:2: 'contextmodel'
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
    // InternalMyDsl.g:953:1: rule__ContextModel__Group__1 : rule__ContextModel__Group__1__Impl rule__ContextModel__Group__2 ;
    public final void rule__ContextModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:957:1: ( rule__ContextModel__Group__1__Impl rule__ContextModel__Group__2 )
            // InternalMyDsl.g:958:2: rule__ContextModel__Group__1__Impl rule__ContextModel__Group__2
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
    // InternalMyDsl.g:965:1: rule__ContextModel__Group__1__Impl : ( ( rule__ContextModel__NameAssignment_1 ) ) ;
    public final void rule__ContextModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:969:1: ( ( ( rule__ContextModel__NameAssignment_1 ) ) )
            // InternalMyDsl.g:970:1: ( ( rule__ContextModel__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:970:1: ( ( rule__ContextModel__NameAssignment_1 ) )
            // InternalMyDsl.g:971:2: ( rule__ContextModel__NameAssignment_1 )
            {
             before(grammarAccess.getContextModelAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:972:2: ( rule__ContextModel__NameAssignment_1 )
            // InternalMyDsl.g:972:3: rule__ContextModel__NameAssignment_1
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
    // InternalMyDsl.g:980:1: rule__ContextModel__Group__2 : rule__ContextModel__Group__2__Impl rule__ContextModel__Group__3 ;
    public final void rule__ContextModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:984:1: ( rule__ContextModel__Group__2__Impl rule__ContextModel__Group__3 )
            // InternalMyDsl.g:985:2: rule__ContextModel__Group__2__Impl rule__ContextModel__Group__3
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
    // InternalMyDsl.g:992:1: rule__ContextModel__Group__2__Impl : ( '{' ) ;
    public final void rule__ContextModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:996:1: ( ( '{' ) )
            // InternalMyDsl.g:997:1: ( '{' )
            {
            // InternalMyDsl.g:997:1: ( '{' )
            // InternalMyDsl.g:998:2: '{'
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
    // InternalMyDsl.g:1007:1: rule__ContextModel__Group__3 : rule__ContextModel__Group__3__Impl rule__ContextModel__Group__4 ;
    public final void rule__ContextModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1011:1: ( rule__ContextModel__Group__3__Impl rule__ContextModel__Group__4 )
            // InternalMyDsl.g:1012:2: rule__ContextModel__Group__3__Impl rule__ContextModel__Group__4
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
    // InternalMyDsl.g:1019:1: rule__ContextModel__Group__3__Impl : ( ( rule__ContextModel__EntitiesAssignment_3 )* ) ;
    public final void rule__ContextModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1023:1: ( ( ( rule__ContextModel__EntitiesAssignment_3 )* ) )
            // InternalMyDsl.g:1024:1: ( ( rule__ContextModel__EntitiesAssignment_3 )* )
            {
            // InternalMyDsl.g:1024:1: ( ( rule__ContextModel__EntitiesAssignment_3 )* )
            // InternalMyDsl.g:1025:2: ( rule__ContextModel__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getContextModelAccess().getEntitiesAssignment_3()); 
            // InternalMyDsl.g:1026:2: ( rule__ContextModel__EntitiesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1026:3: rule__ContextModel__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ContextModel__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMyDsl.g:1034:1: rule__ContextModel__Group__4 : rule__ContextModel__Group__4__Impl rule__ContextModel__Group__5 ;
    public final void rule__ContextModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1038:1: ( rule__ContextModel__Group__4__Impl rule__ContextModel__Group__5 )
            // InternalMyDsl.g:1039:2: rule__ContextModel__Group__4__Impl rule__ContextModel__Group__5
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
    // InternalMyDsl.g:1046:1: rule__ContextModel__Group__4__Impl : ( ( rule__ContextModel__RelationsAssignment_4 )* ) ;
    public final void rule__ContextModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1050:1: ( ( ( rule__ContextModel__RelationsAssignment_4 )* ) )
            // InternalMyDsl.g:1051:1: ( ( rule__ContextModel__RelationsAssignment_4 )* )
            {
            // InternalMyDsl.g:1051:1: ( ( rule__ContextModel__RelationsAssignment_4 )* )
            // InternalMyDsl.g:1052:2: ( rule__ContextModel__RelationsAssignment_4 )*
            {
             before(grammarAccess.getContextModelAccess().getRelationsAssignment_4()); 
            // InternalMyDsl.g:1053:2: ( rule__ContextModel__RelationsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1053:3: rule__ContextModel__RelationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ContextModel__RelationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMyDsl.g:1061:1: rule__ContextModel__Group__5 : rule__ContextModel__Group__5__Impl ;
    public final void rule__ContextModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1065:1: ( rule__ContextModel__Group__5__Impl )
            // InternalMyDsl.g:1066:2: rule__ContextModel__Group__5__Impl
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
    // InternalMyDsl.g:1072:1: rule__ContextModel__Group__5__Impl : ( '}' ) ;
    public final void rule__ContextModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( ( '}' ) )
            // InternalMyDsl.g:1077:1: ( '}' )
            {
            // InternalMyDsl.g:1077:1: ( '}' )
            // InternalMyDsl.g:1078:2: '}'
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
    // InternalMyDsl.g:1088:1: rule__ContextFragment__Group__0 : rule__ContextFragment__Group__0__Impl rule__ContextFragment__Group__1 ;
    public final void rule__ContextFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1092:1: ( rule__ContextFragment__Group__0__Impl rule__ContextFragment__Group__1 )
            // InternalMyDsl.g:1093:2: rule__ContextFragment__Group__0__Impl rule__ContextFragment__Group__1
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
    // InternalMyDsl.g:1100:1: rule__ContextFragment__Group__0__Impl : ( 'contextfragment' ) ;
    public final void rule__ContextFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1104:1: ( ( 'contextfragment' ) )
            // InternalMyDsl.g:1105:1: ( 'contextfragment' )
            {
            // InternalMyDsl.g:1105:1: ( 'contextfragment' )
            // InternalMyDsl.g:1106:2: 'contextfragment'
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
    // InternalMyDsl.g:1115:1: rule__ContextFragment__Group__1 : rule__ContextFragment__Group__1__Impl rule__ContextFragment__Group__2 ;
    public final void rule__ContextFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1119:1: ( rule__ContextFragment__Group__1__Impl rule__ContextFragment__Group__2 )
            // InternalMyDsl.g:1120:2: rule__ContextFragment__Group__1__Impl rule__ContextFragment__Group__2
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
    // InternalMyDsl.g:1127:1: rule__ContextFragment__Group__1__Impl : ( ( rule__ContextFragment__NameAssignment_1 ) ) ;
    public final void rule__ContextFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1131:1: ( ( ( rule__ContextFragment__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1132:1: ( ( rule__ContextFragment__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1132:1: ( ( rule__ContextFragment__NameAssignment_1 ) )
            // InternalMyDsl.g:1133:2: ( rule__ContextFragment__NameAssignment_1 )
            {
             before(grammarAccess.getContextFragmentAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1134:2: ( rule__ContextFragment__NameAssignment_1 )
            // InternalMyDsl.g:1134:3: rule__ContextFragment__NameAssignment_1
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
    // InternalMyDsl.g:1142:1: rule__ContextFragment__Group__2 : rule__ContextFragment__Group__2__Impl rule__ContextFragment__Group__3 ;
    public final void rule__ContextFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1146:1: ( rule__ContextFragment__Group__2__Impl rule__ContextFragment__Group__3 )
            // InternalMyDsl.g:1147:2: rule__ContextFragment__Group__2__Impl rule__ContextFragment__Group__3
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
    // InternalMyDsl.g:1154:1: rule__ContextFragment__Group__2__Impl : ( '{' ) ;
    public final void rule__ContextFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1158:1: ( ( '{' ) )
            // InternalMyDsl.g:1159:1: ( '{' )
            {
            // InternalMyDsl.g:1159:1: ( '{' )
            // InternalMyDsl.g:1160:2: '{'
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
    // InternalMyDsl.g:1169:1: rule__ContextFragment__Group__3 : rule__ContextFragment__Group__3__Impl rule__ContextFragment__Group__4 ;
    public final void rule__ContextFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1173:1: ( rule__ContextFragment__Group__3__Impl rule__ContextFragment__Group__4 )
            // InternalMyDsl.g:1174:2: rule__ContextFragment__Group__3__Impl rule__ContextFragment__Group__4
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
    // InternalMyDsl.g:1181:1: rule__ContextFragment__Group__3__Impl : ( ( rule__ContextFragment__EntitiesAssignment_3 )* ) ;
    public final void rule__ContextFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1185:1: ( ( ( rule__ContextFragment__EntitiesAssignment_3 )* ) )
            // InternalMyDsl.g:1186:1: ( ( rule__ContextFragment__EntitiesAssignment_3 )* )
            {
            // InternalMyDsl.g:1186:1: ( ( rule__ContextFragment__EntitiesAssignment_3 )* )
            // InternalMyDsl.g:1187:2: ( rule__ContextFragment__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getContextFragmentAccess().getEntitiesAssignment_3()); 
            // InternalMyDsl.g:1188:2: ( rule__ContextFragment__EntitiesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1188:3: rule__ContextFragment__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ContextFragment__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMyDsl.g:1196:1: rule__ContextFragment__Group__4 : rule__ContextFragment__Group__4__Impl rule__ContextFragment__Group__5 ;
    public final void rule__ContextFragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1200:1: ( rule__ContextFragment__Group__4__Impl rule__ContextFragment__Group__5 )
            // InternalMyDsl.g:1201:2: rule__ContextFragment__Group__4__Impl rule__ContextFragment__Group__5
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
    // InternalMyDsl.g:1208:1: rule__ContextFragment__Group__4__Impl : ( ( rule__ContextFragment__RelationsAssignment_4 )* ) ;
    public final void rule__ContextFragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1212:1: ( ( ( rule__ContextFragment__RelationsAssignment_4 )* ) )
            // InternalMyDsl.g:1213:1: ( ( rule__ContextFragment__RelationsAssignment_4 )* )
            {
            // InternalMyDsl.g:1213:1: ( ( rule__ContextFragment__RelationsAssignment_4 )* )
            // InternalMyDsl.g:1214:2: ( rule__ContextFragment__RelationsAssignment_4 )*
            {
             before(grammarAccess.getContextFragmentAccess().getRelationsAssignment_4()); 
            // InternalMyDsl.g:1215:2: ( rule__ContextFragment__RelationsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1215:3: rule__ContextFragment__RelationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ContextFragment__RelationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyDsl.g:1223:1: rule__ContextFragment__Group__5 : rule__ContextFragment__Group__5__Impl ;
    public final void rule__ContextFragment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1227:1: ( rule__ContextFragment__Group__5__Impl )
            // InternalMyDsl.g:1228:2: rule__ContextFragment__Group__5__Impl
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
    // InternalMyDsl.g:1234:1: rule__ContextFragment__Group__5__Impl : ( '}' ) ;
    public final void rule__ContextFragment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( ( '}' ) )
            // InternalMyDsl.g:1239:1: ( '}' )
            {
            // InternalMyDsl.g:1239:1: ( '}' )
            // InternalMyDsl.g:1240:2: '}'
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
    // InternalMyDsl.g:1250:1: rule__ChangeType__Group_0__0 : rule__ChangeType__Group_0__0__Impl rule__ChangeType__Group_0__1 ;
    public final void rule__ChangeType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1254:1: ( rule__ChangeType__Group_0__0__Impl rule__ChangeType__Group_0__1 )
            // InternalMyDsl.g:1255:2: rule__ChangeType__Group_0__0__Impl rule__ChangeType__Group_0__1
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
    // InternalMyDsl.g:1262:1: rule__ChangeType__Group_0__0__Impl : ( 'appear' ) ;
    public final void rule__ChangeType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1266:1: ( ( 'appear' ) )
            // InternalMyDsl.g:1267:1: ( 'appear' )
            {
            // InternalMyDsl.g:1267:1: ( 'appear' )
            // InternalMyDsl.g:1268:2: 'appear'
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
    // InternalMyDsl.g:1277:1: rule__ChangeType__Group_0__1 : rule__ChangeType__Group_0__1__Impl rule__ChangeType__Group_0__2 ;
    public final void rule__ChangeType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1281:1: ( rule__ChangeType__Group_0__1__Impl rule__ChangeType__Group_0__2 )
            // InternalMyDsl.g:1282:2: rule__ChangeType__Group_0__1__Impl rule__ChangeType__Group_0__2
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
    // InternalMyDsl.g:1289:1: rule__ChangeType__Group_0__1__Impl : ( '(' ) ;
    public final void rule__ChangeType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1293:1: ( ( '(' ) )
            // InternalMyDsl.g:1294:1: ( '(' )
            {
            // InternalMyDsl.g:1294:1: ( '(' )
            // InternalMyDsl.g:1295:2: '('
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
    // InternalMyDsl.g:1304:1: rule__ChangeType__Group_0__2 : rule__ChangeType__Group_0__2__Impl rule__ChangeType__Group_0__3 ;
    public final void rule__ChangeType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1308:1: ( rule__ChangeType__Group_0__2__Impl rule__ChangeType__Group_0__3 )
            // InternalMyDsl.g:1309:2: rule__ChangeType__Group_0__2__Impl rule__ChangeType__Group_0__3
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
    // InternalMyDsl.g:1316:1: rule__ChangeType__Group_0__2__Impl : ( ( rule__ChangeType__EntityAssignment_0_2 ) ) ;
    public final void rule__ChangeType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1320:1: ( ( ( rule__ChangeType__EntityAssignment_0_2 ) ) )
            // InternalMyDsl.g:1321:1: ( ( rule__ChangeType__EntityAssignment_0_2 ) )
            {
            // InternalMyDsl.g:1321:1: ( ( rule__ChangeType__EntityAssignment_0_2 ) )
            // InternalMyDsl.g:1322:2: ( rule__ChangeType__EntityAssignment_0_2 )
            {
             before(grammarAccess.getChangeTypeAccess().getEntityAssignment_0_2()); 
            // InternalMyDsl.g:1323:2: ( rule__ChangeType__EntityAssignment_0_2 )
            // InternalMyDsl.g:1323:3: rule__ChangeType__EntityAssignment_0_2
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
    // InternalMyDsl.g:1331:1: rule__ChangeType__Group_0__3 : rule__ChangeType__Group_0__3__Impl ;
    public final void rule__ChangeType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1335:1: ( rule__ChangeType__Group_0__3__Impl )
            // InternalMyDsl.g:1336:2: rule__ChangeType__Group_0__3__Impl
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
    // InternalMyDsl.g:1342:1: rule__ChangeType__Group_0__3__Impl : ( ')' ) ;
    public final void rule__ChangeType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1346:1: ( ( ')' ) )
            // InternalMyDsl.g:1347:1: ( ')' )
            {
            // InternalMyDsl.g:1347:1: ( ')' )
            // InternalMyDsl.g:1348:2: ')'
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
    // InternalMyDsl.g:1358:1: rule__ChangeType__Group_1__0 : rule__ChangeType__Group_1__0__Impl rule__ChangeType__Group_1__1 ;
    public final void rule__ChangeType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1362:1: ( rule__ChangeType__Group_1__0__Impl rule__ChangeType__Group_1__1 )
            // InternalMyDsl.g:1363:2: rule__ChangeType__Group_1__0__Impl rule__ChangeType__Group_1__1
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
    // InternalMyDsl.g:1370:1: rule__ChangeType__Group_1__0__Impl : ( 'distance' ) ;
    public final void rule__ChangeType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1374:1: ( ( 'distance' ) )
            // InternalMyDsl.g:1375:1: ( 'distance' )
            {
            // InternalMyDsl.g:1375:1: ( 'distance' )
            // InternalMyDsl.g:1376:2: 'distance'
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
    // InternalMyDsl.g:1385:1: rule__ChangeType__Group_1__1 : rule__ChangeType__Group_1__1__Impl rule__ChangeType__Group_1__2 ;
    public final void rule__ChangeType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1389:1: ( rule__ChangeType__Group_1__1__Impl rule__ChangeType__Group_1__2 )
            // InternalMyDsl.g:1390:2: rule__ChangeType__Group_1__1__Impl rule__ChangeType__Group_1__2
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
    // InternalMyDsl.g:1397:1: rule__ChangeType__Group_1__1__Impl : ( '(' ) ;
    public final void rule__ChangeType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1401:1: ( ( '(' ) )
            // InternalMyDsl.g:1402:1: ( '(' )
            {
            // InternalMyDsl.g:1402:1: ( '(' )
            // InternalMyDsl.g:1403:2: '('
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
    // InternalMyDsl.g:1412:1: rule__ChangeType__Group_1__2 : rule__ChangeType__Group_1__2__Impl rule__ChangeType__Group_1__3 ;
    public final void rule__ChangeType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1416:1: ( rule__ChangeType__Group_1__2__Impl rule__ChangeType__Group_1__3 )
            // InternalMyDsl.g:1417:2: rule__ChangeType__Group_1__2__Impl rule__ChangeType__Group_1__3
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
    // InternalMyDsl.g:1424:1: rule__ChangeType__Group_1__2__Impl : ( ( rule__ChangeType__EntityAssignment_1_2 ) ) ;
    public final void rule__ChangeType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1428:1: ( ( ( rule__ChangeType__EntityAssignment_1_2 ) ) )
            // InternalMyDsl.g:1429:1: ( ( rule__ChangeType__EntityAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1429:1: ( ( rule__ChangeType__EntityAssignment_1_2 ) )
            // InternalMyDsl.g:1430:2: ( rule__ChangeType__EntityAssignment_1_2 )
            {
             before(grammarAccess.getChangeTypeAccess().getEntityAssignment_1_2()); 
            // InternalMyDsl.g:1431:2: ( rule__ChangeType__EntityAssignment_1_2 )
            // InternalMyDsl.g:1431:3: rule__ChangeType__EntityAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__EntityAssignment_1_2();

            state._fsp--;


            }

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
    // InternalMyDsl.g:1439:1: rule__ChangeType__Group_1__3 : rule__ChangeType__Group_1__3__Impl ;
    public final void rule__ChangeType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1443:1: ( rule__ChangeType__Group_1__3__Impl )
            // InternalMyDsl.g:1444:2: rule__ChangeType__Group_1__3__Impl
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
    // InternalMyDsl.g:1450:1: rule__ChangeType__Group_1__3__Impl : ( ')' ) ;
    public final void rule__ChangeType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1454:1: ( ( ')' ) )
            // InternalMyDsl.g:1455:1: ( ')' )
            {
            // InternalMyDsl.g:1455:1: ( ')' )
            // InternalMyDsl.g:1456:2: ')'
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
    // InternalMyDsl.g:1466:1: rule__ChangeType__Group_2__0 : rule__ChangeType__Group_2__0__Impl rule__ChangeType__Group_2__1 ;
    public final void rule__ChangeType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1470:1: ( rule__ChangeType__Group_2__0__Impl rule__ChangeType__Group_2__1 )
            // InternalMyDsl.g:1471:2: rule__ChangeType__Group_2__0__Impl rule__ChangeType__Group_2__1
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
    // InternalMyDsl.g:1478:1: rule__ChangeType__Group_2__0__Impl : ( 'changeTo' ) ;
    public final void rule__ChangeType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1482:1: ( ( 'changeTo' ) )
            // InternalMyDsl.g:1483:1: ( 'changeTo' )
            {
            // InternalMyDsl.g:1483:1: ( 'changeTo' )
            // InternalMyDsl.g:1484:2: 'changeTo'
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
    // InternalMyDsl.g:1493:1: rule__ChangeType__Group_2__1 : rule__ChangeType__Group_2__1__Impl ;
    public final void rule__ChangeType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1497:1: ( rule__ChangeType__Group_2__1__Impl )
            // InternalMyDsl.g:1498:2: rule__ChangeType__Group_2__1__Impl
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
    // InternalMyDsl.g:1504:1: rule__ChangeType__Group_2__1__Impl : ( ( rule__ChangeType__AttributeAssignment_2_1 ) ) ;
    public final void rule__ChangeType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1508:1: ( ( ( rule__ChangeType__AttributeAssignment_2_1 ) ) )
            // InternalMyDsl.g:1509:1: ( ( rule__ChangeType__AttributeAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1509:1: ( ( rule__ChangeType__AttributeAssignment_2_1 ) )
            // InternalMyDsl.g:1510:2: ( rule__ChangeType__AttributeAssignment_2_1 )
            {
             before(grammarAccess.getChangeTypeAccess().getAttributeAssignment_2_1()); 
            // InternalMyDsl.g:1511:2: ( rule__ChangeType__AttributeAssignment_2_1 )
            // InternalMyDsl.g:1511:3: rule__ChangeType__AttributeAssignment_2_1
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
    // InternalMyDsl.g:1520:1: rule__ChangeType__Group_3__0 : rule__ChangeType__Group_3__0__Impl rule__ChangeType__Group_3__1 ;
    public final void rule__ChangeType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1524:1: ( rule__ChangeType__Group_3__0__Impl rule__ChangeType__Group_3__1 )
            // InternalMyDsl.g:1525:2: rule__ChangeType__Group_3__0__Impl rule__ChangeType__Group_3__1
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
    // InternalMyDsl.g:1532:1: rule__ChangeType__Group_3__0__Impl : ( 'conditionsAt' ) ;
    public final void rule__ChangeType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1536:1: ( ( 'conditionsAt' ) )
            // InternalMyDsl.g:1537:1: ( 'conditionsAt' )
            {
            // InternalMyDsl.g:1537:1: ( 'conditionsAt' )
            // InternalMyDsl.g:1538:2: 'conditionsAt'
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
    // InternalMyDsl.g:1547:1: rule__ChangeType__Group_3__1 : rule__ChangeType__Group_3__1__Impl rule__ChangeType__Group_3__2 ;
    public final void rule__ChangeType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1551:1: ( rule__ChangeType__Group_3__1__Impl rule__ChangeType__Group_3__2 )
            // InternalMyDsl.g:1552:2: rule__ChangeType__Group_3__1__Impl rule__ChangeType__Group_3__2
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
    // InternalMyDsl.g:1559:1: rule__ChangeType__Group_3__1__Impl : ( '(' ) ;
    public final void rule__ChangeType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1563:1: ( ( '(' ) )
            // InternalMyDsl.g:1564:1: ( '(' )
            {
            // InternalMyDsl.g:1564:1: ( '(' )
            // InternalMyDsl.g:1565:2: '('
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
    // InternalMyDsl.g:1574:1: rule__ChangeType__Group_3__2 : rule__ChangeType__Group_3__2__Impl ;
    public final void rule__ChangeType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1578:1: ( rule__ChangeType__Group_3__2__Impl )
            // InternalMyDsl.g:1579:2: rule__ChangeType__Group_3__2__Impl
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
    // InternalMyDsl.g:1585:1: rule__ChangeType__Group_3__2__Impl : ( ')' ) ;
    public final void rule__ChangeType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1589:1: ( ( ')' ) )
            // InternalMyDsl.g:1590:1: ( ')' )
            {
            // InternalMyDsl.g:1590:1: ( ')' )
            // InternalMyDsl.g:1591:2: ')'
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
    // InternalMyDsl.g:1601:1: rule__ContextChange__Group__0 : rule__ContextChange__Group__0__Impl rule__ContextChange__Group__1 ;
    public final void rule__ContextChange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1605:1: ( rule__ContextChange__Group__0__Impl rule__ContextChange__Group__1 )
            // InternalMyDsl.g:1606:2: rule__ContextChange__Group__0__Impl rule__ContextChange__Group__1
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
    // InternalMyDsl.g:1613:1: rule__ContextChange__Group__0__Impl : ( ( rule__ContextChange__ChangeAssignment_0 ) ) ;
    public final void rule__ContextChange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1617:1: ( ( ( rule__ContextChange__ChangeAssignment_0 ) ) )
            // InternalMyDsl.g:1618:1: ( ( rule__ContextChange__ChangeAssignment_0 ) )
            {
            // InternalMyDsl.g:1618:1: ( ( rule__ContextChange__ChangeAssignment_0 ) )
            // InternalMyDsl.g:1619:2: ( rule__ContextChange__ChangeAssignment_0 )
            {
             before(grammarAccess.getContextChangeAccess().getChangeAssignment_0()); 
            // InternalMyDsl.g:1620:2: ( rule__ContextChange__ChangeAssignment_0 )
            // InternalMyDsl.g:1620:3: rule__ContextChange__ChangeAssignment_0
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
    // InternalMyDsl.g:1628:1: rule__ContextChange__Group__1 : rule__ContextChange__Group__1__Impl rule__ContextChange__Group__2 ;
    public final void rule__ContextChange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1632:1: ( rule__ContextChange__Group__1__Impl rule__ContextChange__Group__2 )
            // InternalMyDsl.g:1633:2: rule__ContextChange__Group__1__Impl rule__ContextChange__Group__2
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
    // InternalMyDsl.g:1640:1: rule__ContextChange__Group__1__Impl : ( ( rule__ContextChange__NameAssignment_1 ) ) ;
    public final void rule__ContextChange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1644:1: ( ( ( rule__ContextChange__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1645:1: ( ( rule__ContextChange__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1645:1: ( ( rule__ContextChange__NameAssignment_1 ) )
            // InternalMyDsl.g:1646:2: ( rule__ContextChange__NameAssignment_1 )
            {
             before(grammarAccess.getContextChangeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1647:2: ( rule__ContextChange__NameAssignment_1 )
            // InternalMyDsl.g:1647:3: rule__ContextChange__NameAssignment_1
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
    // InternalMyDsl.g:1655:1: rule__ContextChange__Group__2 : rule__ContextChange__Group__2__Impl ;
    public final void rule__ContextChange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1659:1: ( rule__ContextChange__Group__2__Impl )
            // InternalMyDsl.g:1660:2: rule__ContextChange__Group__2__Impl
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
    // InternalMyDsl.g:1666:1: rule__ContextChange__Group__2__Impl : ( ';' ) ;
    public final void rule__ContextChange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1670:1: ( ( ';' ) )
            // InternalMyDsl.g:1671:1: ( ';' )
            {
            // InternalMyDsl.g:1671:1: ( ';' )
            // InternalMyDsl.g:1672:2: ';'
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
    // InternalMyDsl.g:1682:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1686:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:1687:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalMyDsl.g:1694:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1698:1: ( ( 'attribute' ) )
            // InternalMyDsl.g:1699:1: ( 'attribute' )
            {
            // InternalMyDsl.g:1699:1: ( 'attribute' )
            // InternalMyDsl.g:1700:2: 'attribute'
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
    // InternalMyDsl.g:1709:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1713:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:1714:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalMyDsl.g:1721:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1725:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1726:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1726:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyDsl.g:1727:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1728:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyDsl.g:1728:3: rule__Attribute__NameAssignment_1
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
    // InternalMyDsl.g:1736:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1740:1: ( rule__Attribute__Group__2__Impl )
            // InternalMyDsl.g:1741:2: rule__Attribute__Group__2__Impl
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
    // InternalMyDsl.g:1747:1: rule__Attribute__Group__2__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1751:1: ( ( ';' ) )
            // InternalMyDsl.g:1752:1: ( ';' )
            {
            // InternalMyDsl.g:1752:1: ( ';' )
            // InternalMyDsl.g:1753:2: ';'
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
    // InternalMyDsl.g:1763:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1767:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDsl.g:1768:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalMyDsl.g:1775:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1779:1: ( ( 'entity' ) )
            // InternalMyDsl.g:1780:1: ( 'entity' )
            {
            // InternalMyDsl.g:1780:1: ( 'entity' )
            // InternalMyDsl.g:1781:2: 'entity'
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
    // InternalMyDsl.g:1790:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1794:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMyDsl.g:1795:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalMyDsl.g:1802:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1806:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1807:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1807:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalMyDsl.g:1808:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1809:2: ( rule__Entity__NameAssignment_1 )
            // InternalMyDsl.g:1809:3: rule__Entity__NameAssignment_1
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
    // InternalMyDsl.g:1817:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1821:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalMyDsl.g:1822:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalMyDsl.g:1829:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1833:1: ( ( '{' ) )
            // InternalMyDsl.g:1834:1: ( '{' )
            {
            // InternalMyDsl.g:1834:1: ( '{' )
            // InternalMyDsl.g:1835:2: '{'
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
    // InternalMyDsl.g:1844:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1848:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalMyDsl.g:1849:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalMyDsl.g:1856:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1860:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // InternalMyDsl.g:1861:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // InternalMyDsl.g:1861:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // InternalMyDsl.g:1862:2: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // InternalMyDsl.g:1863:2: ( rule__Entity__AttributesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1863:3: rule__Entity__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Entity__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMyDsl.g:1871:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1875:1: ( rule__Entity__Group__4__Impl )
            // InternalMyDsl.g:1876:2: rule__Entity__Group__4__Impl
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
    // InternalMyDsl.g:1882:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1886:1: ( ( '}' ) )
            // InternalMyDsl.g:1887:1: ( '}' )
            {
            // InternalMyDsl.g:1887:1: ( '}' )
            // InternalMyDsl.g:1888:2: '}'
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
    // InternalMyDsl.g:1898:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1902:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalMyDsl.g:1903:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
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
    // InternalMyDsl.g:1910:1: rule__Relation__Group__0__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1914:1: ( ( 'relation' ) )
            // InternalMyDsl.g:1915:1: ( 'relation' )
            {
            // InternalMyDsl.g:1915:1: ( 'relation' )
            // InternalMyDsl.g:1916:2: 'relation'
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
    // InternalMyDsl.g:1925:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1929:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalMyDsl.g:1930:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
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
    // InternalMyDsl.g:1937:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1941:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1942:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1942:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalMyDsl.g:1943:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1944:2: ( rule__Relation__NameAssignment_1 )
            // InternalMyDsl.g:1944:3: rule__Relation__NameAssignment_1
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
    // InternalMyDsl.g:1952:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1956:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalMyDsl.g:1957:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
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
    // InternalMyDsl.g:1964:1: rule__Relation__Group__2__Impl : ( '(' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1968:1: ( ( '(' ) )
            // InternalMyDsl.g:1969:1: ( '(' )
            {
            // InternalMyDsl.g:1969:1: ( '(' )
            // InternalMyDsl.g:1970:2: '('
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
    // InternalMyDsl.g:1979:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1983:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalMyDsl.g:1984:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
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
    // InternalMyDsl.g:1991:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__SenderAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1995:1: ( ( ( rule__Relation__SenderAssignment_3 ) ) )
            // InternalMyDsl.g:1996:1: ( ( rule__Relation__SenderAssignment_3 ) )
            {
            // InternalMyDsl.g:1996:1: ( ( rule__Relation__SenderAssignment_3 ) )
            // InternalMyDsl.g:1997:2: ( rule__Relation__SenderAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getSenderAssignment_3()); 
            // InternalMyDsl.g:1998:2: ( rule__Relation__SenderAssignment_3 )
            // InternalMyDsl.g:1998:3: rule__Relation__SenderAssignment_3
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
    // InternalMyDsl.g:2006:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2010:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalMyDsl.g:2011:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
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
    // InternalMyDsl.g:2018:1: rule__Relation__Group__4__Impl : ( ',' ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2022:1: ( ( ',' ) )
            // InternalMyDsl.g:2023:1: ( ',' )
            {
            // InternalMyDsl.g:2023:1: ( ',' )
            // InternalMyDsl.g:2024:2: ','
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
    // InternalMyDsl.g:2033:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2037:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // InternalMyDsl.g:2038:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
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
    // InternalMyDsl.g:2045:1: rule__Relation__Group__5__Impl : ( ( rule__Relation__ReceiverAssignment_5 ) ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2049:1: ( ( ( rule__Relation__ReceiverAssignment_5 ) ) )
            // InternalMyDsl.g:2050:1: ( ( rule__Relation__ReceiverAssignment_5 ) )
            {
            // InternalMyDsl.g:2050:1: ( ( rule__Relation__ReceiverAssignment_5 ) )
            // InternalMyDsl.g:2051:2: ( rule__Relation__ReceiverAssignment_5 )
            {
             before(grammarAccess.getRelationAccess().getReceiverAssignment_5()); 
            // InternalMyDsl.g:2052:2: ( rule__Relation__ReceiverAssignment_5 )
            // InternalMyDsl.g:2052:3: rule__Relation__ReceiverAssignment_5
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
    // InternalMyDsl.g:2060:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl rule__Relation__Group__7 ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2064:1: ( rule__Relation__Group__6__Impl rule__Relation__Group__7 )
            // InternalMyDsl.g:2065:2: rule__Relation__Group__6__Impl rule__Relation__Group__7
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
    // InternalMyDsl.g:2072:1: rule__Relation__Group__6__Impl : ( ')' ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2076:1: ( ( ')' ) )
            // InternalMyDsl.g:2077:1: ( ')' )
            {
            // InternalMyDsl.g:2077:1: ( ')' )
            // InternalMyDsl.g:2078:2: ')'
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
    // InternalMyDsl.g:2087:1: rule__Relation__Group__7 : rule__Relation__Group__7__Impl rule__Relation__Group__8 ;
    public final void rule__Relation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2091:1: ( rule__Relation__Group__7__Impl rule__Relation__Group__8 )
            // InternalMyDsl.g:2092:2: rule__Relation__Group__7__Impl rule__Relation__Group__8
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
    // InternalMyDsl.g:2099:1: rule__Relation__Group__7__Impl : ( '{' ) ;
    public final void rule__Relation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2103:1: ( ( '{' ) )
            // InternalMyDsl.g:2104:1: ( '{' )
            {
            // InternalMyDsl.g:2104:1: ( '{' )
            // InternalMyDsl.g:2105:2: '{'
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
    // InternalMyDsl.g:2114:1: rule__Relation__Group__8 : rule__Relation__Group__8__Impl rule__Relation__Group__9 ;
    public final void rule__Relation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2118:1: ( rule__Relation__Group__8__Impl rule__Relation__Group__9 )
            // InternalMyDsl.g:2119:2: rule__Relation__Group__8__Impl rule__Relation__Group__9
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
    // InternalMyDsl.g:2126:1: rule__Relation__Group__8__Impl : ( ( rule__Relation__AttributesAssignment_8 )* ) ;
    public final void rule__Relation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2130:1: ( ( ( rule__Relation__AttributesAssignment_8 )* ) )
            // InternalMyDsl.g:2131:1: ( ( rule__Relation__AttributesAssignment_8 )* )
            {
            // InternalMyDsl.g:2131:1: ( ( rule__Relation__AttributesAssignment_8 )* )
            // InternalMyDsl.g:2132:2: ( rule__Relation__AttributesAssignment_8 )*
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_8()); 
            // InternalMyDsl.g:2133:2: ( rule__Relation__AttributesAssignment_8 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:2133:3: rule__Relation__AttributesAssignment_8
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Relation__AttributesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2145:1: ( rule__Relation__Group__9__Impl )
            // InternalMyDsl.g:2146:2: rule__Relation__Group__9__Impl
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
    // InternalMyDsl.g:2152:1: rule__Relation__Group__9__Impl : ( '}' ) ;
    public final void rule__Relation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2156:1: ( ( '}' ) )
            // InternalMyDsl.g:2157:1: ( '}' )
            {
            // InternalMyDsl.g:2157:1: ( '}' )
            // InternalMyDsl.g:2158:2: '}'
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
    // InternalMyDsl.g:2168:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2172:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalMyDsl.g:2173:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
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
    // InternalMyDsl.g:2180:1: rule__Scenario__Group__0__Impl : ( 'scenario' ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2184:1: ( ( 'scenario' ) )
            // InternalMyDsl.g:2185:1: ( 'scenario' )
            {
            // InternalMyDsl.g:2185:1: ( 'scenario' )
            // InternalMyDsl.g:2186:2: 'scenario'
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
    // InternalMyDsl.g:2195:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2199:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalMyDsl.g:2200:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
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
    // InternalMyDsl.g:2207:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__NameAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2211:1: ( ( ( rule__Scenario__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2212:1: ( ( rule__Scenario__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2212:1: ( ( rule__Scenario__NameAssignment_1 ) )
            // InternalMyDsl.g:2213:2: ( rule__Scenario__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2214:2: ( rule__Scenario__NameAssignment_1 )
            // InternalMyDsl.g:2214:3: rule__Scenario__NameAssignment_1
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
    // InternalMyDsl.g:2222:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2226:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalMyDsl.g:2227:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
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
    // InternalMyDsl.g:2234:1: rule__Scenario__Group__2__Impl : ( '{' ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2238:1: ( ( '{' ) )
            // InternalMyDsl.g:2239:1: ( '{' )
            {
            // InternalMyDsl.g:2239:1: ( '{' )
            // InternalMyDsl.g:2240:2: '{'
            {
             before(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Scenario__Group__2__Impl"


<<<<<<< HEAD
    // $ANTLR start "rule__Name__Alternatives_2"
    // InternalMyDsl.g:410:1: rule__Name__Alternatives_2 : ( ( RULE_ID ) | ( RULE_NUMBER ) );
    public final void rule__Name__Alternatives_2() throws RecognitionException {
=======
    // $ANTLR start "rule__Scenario__Group__3"
    // InternalMyDsl.g:2249:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            pushFollow(FOLLOW_21);
            rule__Scenario__Group__3__Impl();

            state._fsp--;
>>>>>>> Added Xtext for context dependent behavior

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


<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Alternatives_7"
    // InternalMyDsl.g:431:1: rule__Expression__Alternatives_7 : ( ( RULE_ID ) | ( RULE_NUMBER ) );
    public final void rule__Expression__Alternatives_7() throws RecognitionException {
=======
    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // InternalMyDsl.g:2261:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__ScenariocontentsAssignment_3 )* ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:435:1: ( ( RULE_ID ) | ( RULE_NUMBER ) )
            int alt3=2;
            int LA3_0 = input.LA(1);
=======
            // InternalMyDsl.g:2265:1: ( ( ( rule__Scenario__ScenariocontentsAssignment_3 )* ) )
            // InternalMyDsl.g:2266:1: ( ( rule__Scenario__ScenariocontentsAssignment_3 )* )
            {
            // InternalMyDsl.g:2266:1: ( ( rule__Scenario__ScenariocontentsAssignment_3 )* )
            // InternalMyDsl.g:2267:2: ( rule__Scenario__ScenariocontentsAssignment_3 )*
            {
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

                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:2268:3: rule__Scenario__ScenariocontentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Scenario__ScenariocontentsAssignment_3();

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

            	default :
            	    break loop18;
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


<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__0"
    // InternalMyDsl.g:452:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Scenario__Group__4"
    // InternalMyDsl.g:2276:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl ;
    public final void rule__Scenario__Group__4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:456:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalMyDsl.g:457:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
=======
            // InternalMyDsl.g:2280:1: ( rule__Scenario__Group__4__Impl )
            // InternalMyDsl.g:2281:2: rule__Scenario__Group__4__Impl
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__0__Impl"
    // InternalMyDsl.g:464:1: rule__Domain__Group__0__Impl : ( 'specification' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Scenario__Group__4__Impl"
    // InternalMyDsl.g:2287:1: rule__Scenario__Group__4__Impl : ( '}' ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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


<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__1"
    // InternalMyDsl.g:479:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__0"
    // InternalMyDsl.g:2303:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:483:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalMyDsl.g:484:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
=======
            // InternalMyDsl.g:2307:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalMyDsl.g:2308:2: rule__Message__Group__0__Impl rule__Message__Group__1
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__1__Impl"
    // InternalMyDsl.g:491:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__0__Impl"
    // InternalMyDsl.g:2315:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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


<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__2"
    // InternalMyDsl.g:506:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__1"
    // InternalMyDsl.g:2330:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:510:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalMyDsl.g:511:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
=======
            // InternalMyDsl.g:2334:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalMyDsl.g:2335:2: rule__Message__Group__1__Impl rule__Message__Group__2
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__2__Impl"
    // InternalMyDsl.g:518:1: rule__Domain__Group__2__Impl : ( '{' ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__1__Impl"
    // InternalMyDsl.g:2342:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2349:2: ( rule__Message__NameAssignment_1 )
            // InternalMyDsl.g:2349:3: rule__Message__NameAssignment_1
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


<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__3"
    // InternalMyDsl.g:533:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__2"
    // InternalMyDsl.g:2357:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:537:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // InternalMyDsl.g:538:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
=======
            // InternalMyDsl.g:2361:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalMyDsl.g:2362:2: rule__Message__Group__2__Impl rule__Message__Group__3
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__3__Impl"
    // InternalMyDsl.g:545:1: rule__Domain__Group__3__Impl : ( ( rule__Domain__ObjectsAssignment_3 )* ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__2__Impl"
    // InternalMyDsl.g:2369:1: rule__Message__Group__2__Impl : ( ( rule__Message__RequiredAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:2374:1: ( ( rule__Message__RequiredAssignment_2 )? )
            // InternalMyDsl.g:2375:2: ( rule__Message__RequiredAssignment_2 )?
            {
             before(grammarAccess.getMessageAccess().getRequiredAssignment_2()); 
            // InternalMyDsl.g:2376:2: ( rule__Message__RequiredAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2376:3: rule__Message__RequiredAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__RequiredAssignment_2();
>>>>>>> Added Xtext for context dependent behavior

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

<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__4"
    // InternalMyDsl.g:560:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {
=======

    // $ANTLR start "rule__Message__Group__3"
    // InternalMyDsl.g:2384:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:564:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // InternalMyDsl.g:565:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
=======
            // InternalMyDsl.g:2388:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalMyDsl.g:2389:2: rule__Message__Group__3__Impl rule__Message__Group__4
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__4__Impl"
    // InternalMyDsl.g:572:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__ConstraintsAssignment_4 )* ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__3__Impl"
    // InternalMyDsl.g:2396:1: rule__Message__Group__3__Impl : ( ( rule__Message__FailAssignment_3 )? ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:2401:1: ( ( rule__Message__FailAssignment_3 )? )
            // InternalMyDsl.g:2402:2: ( rule__Message__FailAssignment_3 )?
            {
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

            }


            }

        }
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


<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__5"
    // InternalMyDsl.g:587:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl rule__Domain__Group__6 ;
    public final void rule__Domain__Group__5() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__4"
    // InternalMyDsl.g:2411:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:591:1: ( rule__Domain__Group__5__Impl rule__Domain__Group__6 )
            // InternalMyDsl.g:592:2: rule__Domain__Group__5__Impl rule__Domain__Group__6
=======
            // InternalMyDsl.g:2415:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // InternalMyDsl.g:2416:2: rule__Message__Group__4__Impl rule__Message__Group__5
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__5__Impl"
    // InternalMyDsl.g:599:1: rule__Domain__Group__5__Impl : ( ( rule__Domain__ScenariosAssignment_5 )* ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__4__Impl"
    // InternalMyDsl.g:2423:1: rule__Message__Group__4__Impl : ( ( rule__Message__StrictAssignment_4 )? ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:2428:1: ( ( rule__Message__StrictAssignment_4 )? )
            // InternalMyDsl.g:2429:2: ( rule__Message__StrictAssignment_4 )?
            {
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

            }


            }

        }
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


<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__6"
    // InternalMyDsl.g:614:1: rule__Domain__Group__6 : rule__Domain__Group__6__Impl ;
    public final void rule__Domain__Group__6() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__5"
    // InternalMyDsl.g:2438:1: rule__Message__Group__5 : rule__Message__Group__5__Impl rule__Message__Group__6 ;
    public final void rule__Message__Group__5() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:618:1: ( rule__Domain__Group__6__Impl )
            // InternalMyDsl.g:619:2: rule__Domain__Group__6__Impl
=======
            // InternalMyDsl.g:2442:1: ( rule__Message__Group__5__Impl rule__Message__Group__6 )
            // InternalMyDsl.g:2443:2: rule__Message__Group__5__Impl rule__Message__Group__6
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Domain__Group__6__Impl"
    // InternalMyDsl.g:625:1: rule__Domain__Group__6__Impl : ( '}' ) ;
    public final void rule__Domain__Group__6__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__5__Impl"
    // InternalMyDsl.g:2450:1: rule__Message__Group__5__Impl : ( ( rule__Message__SenderAssignment_5 ) ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getMessageAccess().getSenderAssignment_5()); 
            // InternalMyDsl.g:2457:2: ( rule__Message__SenderAssignment_5 )
            // InternalMyDsl.g:2457:3: rule__Message__SenderAssignment_5
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


<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__0"
    // InternalMyDsl.g:641:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__6"
    // InternalMyDsl.g:2465:1: rule__Message__Group__6 : rule__Message__Group__6__Impl rule__Message__Group__7 ;
    public final void rule__Message__Group__6() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:645:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalMyDsl.g:646:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
=======
            // InternalMyDsl.g:2469:1: ( rule__Message__Group__6__Impl rule__Message__Group__7 )
            // InternalMyDsl.g:2470:2: rule__Message__Group__6__Impl rule__Message__Group__7
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // InternalMyDsl.g:653:1: rule__Scenario__Group__0__Impl : ( 'scenario' ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__6__Impl"
    // InternalMyDsl.g:2477:1: rule__Message__Group__6__Impl : ( '->' ) ;
    public final void rule__Message__Group__6__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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


<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__1"
    // InternalMyDsl.g:668:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__7"
    // InternalMyDsl.g:2492:1: rule__Message__Group__7 : rule__Message__Group__7__Impl rule__Message__Group__8 ;
    public final void rule__Message__Group__7() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:672:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalMyDsl.g:673:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
=======
            // InternalMyDsl.g:2496:1: ( rule__Message__Group__7__Impl rule__Message__Group__8 )
            // InternalMyDsl.g:2497:2: rule__Message__Group__7__Impl rule__Message__Group__8
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // InternalMyDsl.g:680:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__NameAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__7__Impl"
    // InternalMyDsl.g:2504:1: rule__Message__Group__7__Impl : ( ( rule__Message__ReceiverAssignment_7 ) ) ;
    public final void rule__Message__Group__7__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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


<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__2"
    // InternalMyDsl.g:695:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__8"
    // InternalMyDsl.g:2519:1: rule__Message__Group__8 : rule__Message__Group__8__Impl rule__Message__Group__9 ;
    public final void rule__Message__Group__8() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:699:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalMyDsl.g:700:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
=======
            // InternalMyDsl.g:2523:1: ( rule__Message__Group__8__Impl rule__Message__Group__9 )
            // InternalMyDsl.g:2524:2: rule__Message__Group__8__Impl rule__Message__Group__9
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // InternalMyDsl.g:707:1: rule__Scenario__Group__2__Impl : ( '{' ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__8__Impl"
    // InternalMyDsl.g:2531:1: rule__Message__Group__8__Impl : ( ( rule__Message__PastAssignment_8 )? ) ;
    public final void rule__Message__Group__8__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getMessageAccess().getPastAssignment_8()); 
            // InternalMyDsl.g:2538:2: ( rule__Message__PastAssignment_8 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2538:3: rule__Message__PastAssignment_8
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


<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__3"
    // InternalMyDsl.g:722:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__9"
    // InternalMyDsl.g:2546:1: rule__Message__Group__9 : rule__Message__Group__9__Impl rule__Message__Group__10 ;
    public final void rule__Message__Group__9() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:726:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalMyDsl.g:727:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
=======
            // InternalMyDsl.g:2550:1: ( rule__Message__Group__9__Impl rule__Message__Group__10 )
            // InternalMyDsl.g:2551:2: rule__Message__Group__9__Impl rule__Message__Group__10
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // InternalMyDsl.g:734:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__ScenariocontentsAssignment_3 )* ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__9__Impl"
    // InternalMyDsl.g:2558:1: rule__Message__Group__9__Impl : ( ( rule__Message__FutureAssignment_9 )? ) ;
    public final void rule__Message__Group__9__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:2563:1: ( ( rule__Message__FutureAssignment_9 )? )
            // InternalMyDsl.g:2564:2: ( rule__Message__FutureAssignment_9 )?
            {
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

            }


            }

        }
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


<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__4"
    // InternalMyDsl.g:749:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl ;
    public final void rule__Scenario__Group__4() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__10"
    // InternalMyDsl.g:2573:1: rule__Message__Group__10 : rule__Message__Group__10__Impl rule__Message__Group__11 ;
    public final void rule__Message__Group__10() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:753:1: ( rule__Scenario__Group__4__Impl )
            // InternalMyDsl.g:754:2: rule__Scenario__Group__4__Impl
=======
            // InternalMyDsl.g:2577:1: ( rule__Message__Group__10__Impl rule__Message__Group__11 )
            // InternalMyDsl.g:2578:2: rule__Message__Group__10__Impl rule__Message__Group__11
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Scenario__Group__4__Impl"
    // InternalMyDsl.g:760:1: rule__Scenario__Group__4__Impl : ( '}' ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__10__Impl"
    // InternalMyDsl.g:2585:1: rule__Message__Group__10__Impl : ( ( rule__Message__ConstraintAssignment_10 )? ) ;
    public final void rule__Message__Group__10__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getMessageAccess().getConstraintAssignment_10()); 
            // InternalMyDsl.g:2592:2: ( rule__Message__ConstraintAssignment_10 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2592:3: rule__Message__ConstraintAssignment_10
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


<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__0"
    // InternalMyDsl.g:776:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__11"
    // InternalMyDsl.g:2600:1: rule__Message__Group__11 : rule__Message__Group__11__Impl rule__Message__Group__12 ;
    public final void rule__Message__Group__11() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:780:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalMyDsl.g:781:2: rule__Message__Group__0__Impl rule__Message__Group__1
=======
            // InternalMyDsl.g:2604:1: ( rule__Message__Group__11__Impl rule__Message__Group__12 )
            // InternalMyDsl.g:2605:2: rule__Message__Group__11__Impl rule__Message__Group__12
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__0__Impl"
    // InternalMyDsl.g:788:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__11__Impl"
    // InternalMyDsl.g:2612:1: rule__Message__Group__11__Impl : ( ( '{' )? ) ;
    public final void rule__Message__Group__11__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_11()); 
            // InternalMyDsl.g:2619:2: ( '{' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:2619:3: '{'
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


<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__1"
    // InternalMyDsl.g:803:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__12"
    // InternalMyDsl.g:2627:1: rule__Message__Group__12 : rule__Message__Group__12__Impl rule__Message__Group__13 ;
    public final void rule__Message__Group__12() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:807:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalMyDsl.g:808:2: rule__Message__Group__1__Impl rule__Message__Group__2
=======
            // InternalMyDsl.g:2631:1: ( rule__Message__Group__12__Impl rule__Message__Group__13 )
            // InternalMyDsl.g:2632:2: rule__Message__Group__12__Impl rule__Message__Group__13
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__1__Impl"
    // InternalMyDsl.g:815:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__12__Impl"
    // InternalMyDsl.g:2639:1: rule__Message__Group__12__Impl : ( ( rule__Message__CAssignment_12 )? ) ;
    public final void rule__Message__Group__12__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getMessageAccess().getCAssignment_12()); 
            // InternalMyDsl.g:2646:2: ( rule__Message__CAssignment_12 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2646:3: rule__Message__CAssignment_12
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


<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__2"
    // InternalMyDsl.g:830:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__13"
    // InternalMyDsl.g:2654:1: rule__Message__Group__13 : rule__Message__Group__13__Impl rule__Message__Group__14 ;
    public final void rule__Message__Group__13() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:834:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalMyDsl.g:835:2: rule__Message__Group__2__Impl rule__Message__Group__3
=======
            // InternalMyDsl.g:2658:1: ( rule__Message__Group__13__Impl rule__Message__Group__14 )
            // InternalMyDsl.g:2659:2: rule__Message__Group__13__Impl rule__Message__Group__14
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__2__Impl"
    // InternalMyDsl.g:842:1: rule__Message__Group__2__Impl : ( ( rule__Message__RequiredAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__13__Impl"
    // InternalMyDsl.g:2666:1: rule__Message__Group__13__Impl : ( ( '}' )? ) ;
    public final void rule__Message__Group__13__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:2671:1: ( ( '}' )? )
            // InternalMyDsl.g:2672:2: ( '}' )?
            {
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

            }


            }

        }
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


<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__3"
    // InternalMyDsl.g:857:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__14"
    // InternalMyDsl.g:2681:1: rule__Message__Group__14 : rule__Message__Group__14__Impl ;
    public final void rule__Message__Group__14() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:861:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalMyDsl.g:862:2: rule__Message__Group__3__Impl rule__Message__Group__4
=======
            // InternalMyDsl.g:2685:1: ( rule__Message__Group__14__Impl )
            // InternalMyDsl.g:2686:2: rule__Message__Group__14__Impl
>>>>>>> Added Xtext for context dependent behavior
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


<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__3__Impl"
    // InternalMyDsl.g:869:1: rule__Message__Group__3__Impl : ( ( rule__Message__FailAssignment_3 )? ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Message__Group__14__Impl"
    // InternalMyDsl.g:2692:1: rule__Message__Group__14__Impl : ( ';' ) ;
    public final void rule__Message__Group__14__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:2697:1: ( ';' )
            // InternalMyDsl.g:2698:2: ';'
            {
             before(grammarAccess.getMessageAccess().getSemicolonKeyword_14()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getSemicolonKeyword_14()); 
>>>>>>> Added Xtext for context dependent behavior

            }


            }

        }
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


<<<<<<< HEAD
    // $ANTLR start "rule__Message__Group__4"
    // InternalMyDsl.g:884:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__0"
    // InternalMyDsl.g:2708:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:888:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // InternalMyDsl.g:889:2: rule__Message__Group__4__Impl rule__Message__Group__5
=======
            // InternalMyDsl.g:2712:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalMyDsl.g:2713:2: rule__Name__Group__0__Impl rule__Name__Group__1
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Message__Group__4__Impl"
    // InternalMyDsl.g:896:1: rule__Message__Group__4__Impl : ( ( rule__Message__StrictAssignment_4 )? ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__0__Impl"
    // InternalMyDsl.g:2720:1: rule__Name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:2725:1: ( RULE_ID )
            // InternalMyDsl.g:2726:2: RULE_ID
            {
             before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
>>>>>>> Added Xtext for context dependent behavior

            }


            }

        }
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
    // $ANTLR start "rule__Message__Group__5"
    // InternalMyDsl.g:911:1: rule__Message__Group__5 : rule__Message__Group__5__Impl rule__Message__Group__6 ;
    public final void rule__Message__Group__5() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__1"
    // InternalMyDsl.g:2735:1: rule__Name__Group__1 : rule__Name__Group__1__Impl rule__Name__Group__2 ;
    public final void rule__Name__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:915:1: ( rule__Message__Group__5__Impl rule__Message__Group__6 )
            // InternalMyDsl.g:916:2: rule__Message__Group__5__Impl rule__Message__Group__6
=======
            // InternalMyDsl.g:2739:1: ( rule__Name__Group__1__Impl rule__Name__Group__2 )
            // InternalMyDsl.g:2740:2: rule__Name__Group__1__Impl rule__Name__Group__2
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_26);
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
    // $ANTLR start "rule__Message__Group__5__Impl"
    // InternalMyDsl.g:923:1: rule__Message__Group__5__Impl : ( ( rule__Message__SenderAssignment_5 ) ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__1__Impl"
    // InternalMyDsl.g:2747:1: rule__Name__Group__1__Impl : ( '(' ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
    // $ANTLR start "rule__Message__Group__6"
    // InternalMyDsl.g:938:1: rule__Message__Group__6 : rule__Message__Group__6__Impl rule__Message__Group__7 ;
    public final void rule__Message__Group__6() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__2"
    // InternalMyDsl.g:2762:1: rule__Name__Group__2 : rule__Name__Group__2__Impl rule__Name__Group__3 ;
    public final void rule__Name__Group__2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:942:1: ( rule__Message__Group__6__Impl rule__Message__Group__7 )
            // InternalMyDsl.g:943:2: rule__Message__Group__6__Impl rule__Message__Group__7
=======
            // InternalMyDsl.g:2766:1: ( rule__Name__Group__2__Impl rule__Name__Group__3 )
            // InternalMyDsl.g:2767:2: rule__Name__Group__2__Impl rule__Name__Group__3
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_26);
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
    // $ANTLR start "rule__Message__Group__6__Impl"
    // InternalMyDsl.g:950:1: rule__Message__Group__6__Impl : ( '->' ) ;
    public final void rule__Message__Group__6__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__2__Impl"
    // InternalMyDsl.g:2774:1: rule__Name__Group__2__Impl : ( ( rule__Name__Alternatives_2 )? ) ;
    public final void rule__Name__Group__2__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getNameAccess().getAlternatives_2()); 
            // InternalMyDsl.g:2781:2: ( rule__Name__Alternatives_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_NUMBER)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:2781:3: rule__Name__Alternatives_2
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
    // $ANTLR start "rule__Message__Group__7"
    // InternalMyDsl.g:965:1: rule__Message__Group__7 : rule__Message__Group__7__Impl rule__Message__Group__8 ;
    public final void rule__Message__Group__7() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__3"
    // InternalMyDsl.g:2789:1: rule__Name__Group__3 : rule__Name__Group__3__Impl ;
    public final void rule__Name__Group__3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:969:1: ( rule__Message__Group__7__Impl rule__Message__Group__8 )
            // InternalMyDsl.g:970:2: rule__Message__Group__7__Impl rule__Message__Group__8
=======
            // InternalMyDsl.g:2793:1: ( rule__Name__Group__3__Impl )
            // InternalMyDsl.g:2794:2: rule__Name__Group__3__Impl
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Message__Group__7__Impl"
    // InternalMyDsl.g:977:1: rule__Message__Group__7__Impl : ( ( rule__Message__ReceiverAssignment_7 ) ) ;
    public final void rule__Message__Group__7__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Name__Group__3__Impl"
    // InternalMyDsl.g:2800:1: rule__Name__Group__3__Impl : ( ')' ) ;
    public final void rule__Name__Group__3__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
    // $ANTLR start "rule__Message__Group__8"
    // InternalMyDsl.g:992:1: rule__Message__Group__8 : rule__Message__Group__8__Impl rule__Message__Group__9 ;
    public final void rule__Message__Group__8() throws RecognitionException {
=======
    // $ANTLR start "rule__ObjectType__Group__0"
    // InternalMyDsl.g:2816:1: rule__ObjectType__Group__0 : rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1 ;
    public final void rule__ObjectType__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:996:1: ( rule__Message__Group__8__Impl rule__Message__Group__9 )
            // InternalMyDsl.g:997:2: rule__Message__Group__8__Impl rule__Message__Group__9
=======
            // InternalMyDsl.g:2820:1: ( rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1 )
            // InternalMyDsl.g:2821:2: rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Message__Group__8__Impl"
    // InternalMyDsl.g:1004:1: rule__Message__Group__8__Impl : ( ( rule__Message__PastAssignment_8 )? ) ;
    public final void rule__Message__Group__8__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ObjectType__Group__0__Impl"
    // InternalMyDsl.g:2828:1: rule__ObjectType__Group__0__Impl : ( 'object' ) ;
    public final void rule__ObjectType__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:2833:1: ( 'object' )
            // InternalMyDsl.g:2834:2: 'object'
            {
             before(grammarAccess.getObjectTypeAccess().getObjectKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getObjectTypeAccess().getObjectKeyword_0()); 
>>>>>>> Added Xtext for context dependent behavior

            }


            }

        }
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
    // $ANTLR start "rule__Message__Group__9"
    // InternalMyDsl.g:1019:1: rule__Message__Group__9 : rule__Message__Group__9__Impl rule__Message__Group__10 ;
    public final void rule__Message__Group__9() throws RecognitionException {
=======
    // $ANTLR start "rule__ObjectType__Group__1"
    // InternalMyDsl.g:2843:1: rule__ObjectType__Group__1 : rule__ObjectType__Group__1__Impl ;
    public final void rule__ObjectType__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1023:1: ( rule__Message__Group__9__Impl rule__Message__Group__10 )
            // InternalMyDsl.g:1024:2: rule__Message__Group__9__Impl rule__Message__Group__10
=======
            // InternalMyDsl.g:2847:1: ( rule__ObjectType__Group__1__Impl )
            // InternalMyDsl.g:2848:2: rule__ObjectType__Group__1__Impl
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Message__Group__9__Impl"
    // InternalMyDsl.g:1031:1: rule__Message__Group__9__Impl : ( ( rule__Message__FutureAssignment_9 )? ) ;
    public final void rule__Message__Group__9__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ObjectType__Group__1__Impl"
    // InternalMyDsl.g:2854:1: rule__ObjectType__Group__1__Impl : ( ( rule__ObjectType__NameAssignment_1 ) ) ;
    public final void rule__ObjectType__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:2859:1: ( ( rule__ObjectType__NameAssignment_1 ) )
            // InternalMyDsl.g:2860:2: ( rule__ObjectType__NameAssignment_1 )
            {
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

            }


            }

        }
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
    // $ANTLR start "rule__Message__Group__10"
    // InternalMyDsl.g:1046:1: rule__Message__Group__10 : rule__Message__Group__10__Impl rule__Message__Group__11 ;
    public final void rule__Message__Group__10() throws RecognitionException {
=======
    // $ANTLR start "rule__Object__Group__0"
    // InternalMyDsl.g:2870:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1050:1: ( rule__Message__Group__10__Impl rule__Message__Group__11 )
            // InternalMyDsl.g:1051:2: rule__Message__Group__10__Impl rule__Message__Group__11
=======
            // InternalMyDsl.g:2874:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalMyDsl.g:2875:2: rule__Object__Group__0__Impl rule__Object__Group__1
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Message__Group__10__Impl"
    // InternalMyDsl.g:1058:1: rule__Message__Group__10__Impl : ( ( rule__Message__ConstraintAssignment_10 )? ) ;
    public final void rule__Message__Group__10__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalMyDsl.g:2882:1: rule__Object__Group__0__Impl : ( ( rule__Object__ObjectAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getObjectAccess().getObjectAssignment_0()); 
            // InternalMyDsl.g:2889:2: ( rule__Object__ObjectAssignment_0 )
            // InternalMyDsl.g:2889:3: rule__Object__ObjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Object__ObjectAssignment_0();
>>>>>>> Added Xtext for context dependent behavior

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getObjectAssignment_0()); 

            }


            }

        }
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
    // $ANTLR start "rule__Message__Group__11"
    // InternalMyDsl.g:1073:1: rule__Message__Group__11 : rule__Message__Group__11__Impl rule__Message__Group__12 ;
    public final void rule__Message__Group__11() throws RecognitionException {
=======
    // $ANTLR start "rule__Object__Group__1"
    // InternalMyDsl.g:2897:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1077:1: ( rule__Message__Group__11__Impl rule__Message__Group__12 )
            // InternalMyDsl.g:1078:2: rule__Message__Group__11__Impl rule__Message__Group__12
=======
            // InternalMyDsl.g:2901:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalMyDsl.g:2902:2: rule__Object__Group__1__Impl rule__Object__Group__2
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Message__Group__11__Impl"
    // InternalMyDsl.g:1085:1: rule__Message__Group__11__Impl : ( ( '{' )? ) ;
    public final void rule__Message__Group__11__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalMyDsl.g:2909:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2916:2: ( rule__Object__NameAssignment_1 )
            // InternalMyDsl.g:2916:3: rule__Object__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__NameAssignment_1();

            state._fsp--;
>>>>>>> Added Xtext for context dependent behavior


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
    // $ANTLR start "rule__Message__Group__12"
    // InternalMyDsl.g:1100:1: rule__Message__Group__12 : rule__Message__Group__12__Impl rule__Message__Group__13 ;
    public final void rule__Message__Group__12() throws RecognitionException {
=======
    // $ANTLR start "rule__Object__Group__2"
    // InternalMyDsl.g:2924:1: rule__Object__Group__2 : rule__Object__Group__2__Impl ;
    public final void rule__Object__Group__2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1104:1: ( rule__Message__Group__12__Impl rule__Message__Group__13 )
            // InternalMyDsl.g:1105:2: rule__Message__Group__12__Impl rule__Message__Group__13
=======
            // InternalMyDsl.g:2928:1: ( rule__Object__Group__2__Impl )
            // InternalMyDsl.g:2929:2: rule__Object__Group__2__Impl
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Message__Group__12__Impl"
    // InternalMyDsl.g:1112:1: rule__Message__Group__12__Impl : ( ( rule__Message__CAssignment_12 )? ) ;
    public final void rule__Message__Group__12__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalMyDsl.g:2935:1: rule__Object__Group__2__Impl : ( ';' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:2940:1: ( ';' )
            // InternalMyDsl.g:2941:2: ';'
            {
             before(grammarAccess.getObjectAccess().getSemicolonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getSemicolonKeyword_2()); 
>>>>>>> Added Xtext for context dependent behavior

            }


            }

        }
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
    // $ANTLR start "rule__Message__Group__13"
    // InternalMyDsl.g:1127:1: rule__Message__Group__13 : rule__Message__Group__13__Impl rule__Message__Group__14 ;
    public final void rule__Message__Group__13() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__0"
    // InternalMyDsl.g:2951:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1131:1: ( rule__Message__Group__13__Impl rule__Message__Group__14 )
            // InternalMyDsl.g:1132:2: rule__Message__Group__13__Impl rule__Message__Group__14
=======
            // InternalMyDsl.g:2955:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalMyDsl.g:2956:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Message__Group__13__Impl"
    // InternalMyDsl.g:1139:1: rule__Message__Group__13__Impl : ( ( '}' )? ) ;
    public final void rule__Message__Group__13__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalMyDsl.g:2963:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:2968:1: ( 'constraint' )
            // InternalMyDsl.g:2969:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
>>>>>>> Added Xtext for context dependent behavior

            }


            }

        }
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
    // $ANTLR start "rule__Message__Group__14"
    // InternalMyDsl.g:1154:1: rule__Message__Group__14 : rule__Message__Group__14__Impl ;
    public final void rule__Message__Group__14() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__1"
    // InternalMyDsl.g:2978:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1158:1: ( rule__Message__Group__14__Impl )
            // InternalMyDsl.g:1159:2: rule__Message__Group__14__Impl
=======
            // InternalMyDsl.g:2982:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalMyDsl.g:2983:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Message__Group__14__Impl"
    // InternalMyDsl.g:1165:1: rule__Message__Group__14__Impl : ( ';' ) ;
    public final void rule__Message__Group__14__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalMyDsl.g:2990:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2997:2: ( rule__Constraint__NameAssignment_1 )
            // InternalMyDsl.g:2997:3: rule__Constraint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // $ANTLR start "rule__Name__Group__0"
    // InternalMyDsl.g:1181:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__2"
    // InternalMyDsl.g:3005:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
    // $ANTLR start "rule__Name__Group__0__Impl"
    // InternalMyDsl.g:1193:1: rule__Name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalMyDsl.g:3017:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // $ANTLR start "rule__Name__Group__1"
    // InternalMyDsl.g:1208:1: rule__Name__Group__1 : rule__Name__Group__1__Impl rule__Name__Group__2 ;
    public final void rule__Name__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__3"
    // InternalMyDsl.g:3032:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1212:1: ( rule__Name__Group__1__Impl rule__Name__Group__2 )
            // InternalMyDsl.g:1213:2: rule__Name__Group__1__Impl rule__Name__Group__2
=======
            // InternalMyDsl.g:3036:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalMyDsl.g:3037:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_27);
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
    // $ANTLR start "rule__Name__Group__1__Impl"
    // InternalMyDsl.g:1220:1: rule__Name__Group__1__Impl : ( '(' ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalMyDsl.g:3044:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__MessagesAssignment_3 )* ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getConstraintAccess().getMessagesAssignment_3()); 
            // InternalMyDsl.g:3051:2: ( rule__Constraint__MessagesAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==29) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:3051:3: rule__Constraint__MessagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Constraint__MessagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR start "rule__Name__Group__2"
    // InternalMyDsl.g:1235:1: rule__Name__Group__2 : rule__Name__Group__2__Impl rule__Name__Group__3 ;
    public final void rule__Name__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__4"
    // InternalMyDsl.g:3059:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1239:1: ( rule__Name__Group__2__Impl rule__Name__Group__3 )
            // InternalMyDsl.g:1240:2: rule__Name__Group__2__Impl rule__Name__Group__3
=======
            // InternalMyDsl.g:3063:1: ( rule__Constraint__Group__4__Impl )
            // InternalMyDsl.g:3064:2: rule__Constraint__Group__4__Impl
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Name__Group__2__Impl"
    // InternalMyDsl.g:1247:1: rule__Name__Group__2__Impl : ( ( rule__Name__Alternatives_2 )? ) ;
    public final void rule__Name__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalMyDsl.g:3070:1: rule__Constraint__Group__4__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:3075:1: ( '}' )
            // InternalMyDsl.g:3076:2: '}'
            {
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4()); 
>>>>>>> Added Xtext for context dependent behavior

            }


            }

        }
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
    // $ANTLR start "rule__Name__Group__3"
    // InternalMyDsl.g:1262:1: rule__Name__Group__3 : rule__Name__Group__3__Impl ;
    public final void rule__Name__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__Alt__Group__0"
    // InternalMyDsl.g:3086:1: rule__Alt__Group__0 : rule__Alt__Group__0__Impl rule__Alt__Group__1 ;
    public final void rule__Alt__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1266:1: ( rule__Name__Group__3__Impl )
            // InternalMyDsl.g:1267:2: rule__Name__Group__3__Impl
=======
            // InternalMyDsl.g:3090:1: ( rule__Alt__Group__0__Impl rule__Alt__Group__1 )
            // InternalMyDsl.g:3091:2: rule__Alt__Group__0__Impl rule__Alt__Group__1
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Name__Group__3__Impl"
    // InternalMyDsl.g:1273:1: rule__Name__Group__3__Impl : ( ')' ) ;
    public final void rule__Name__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Alt__Group__0__Impl"
    // InternalMyDsl.g:3098:1: rule__Alt__Group__0__Impl : ( 'alt' ) ;
    public final void rule__Alt__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getAltAccess().getAltKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAltAccess().getAltKeyword_0()); 

            }


            }

        }
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
    // $ANTLR start "rule__ObjectType__Group__0"
    // InternalMyDsl.g:1289:1: rule__ObjectType__Group__0 : rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1 ;
    public final void rule__ObjectType__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Alt__Group__1"
    // InternalMyDsl.g:3113:1: rule__Alt__Group__1 : rule__Alt__Group__1__Impl ;
    public final void rule__Alt__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1293:1: ( rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1 )
            // InternalMyDsl.g:1294:2: rule__ObjectType__Group__0__Impl rule__ObjectType__Group__1
=======
            // InternalMyDsl.g:3117:1: ( rule__Alt__Group__1__Impl )
            // InternalMyDsl.g:3118:2: rule__Alt__Group__1__Impl
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__ObjectType__Group__0__Impl"
    // InternalMyDsl.g:1301:1: rule__ObjectType__Group__0__Impl : ( 'object' ) ;
    public final void rule__ObjectType__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Alt__Group__1__Impl"
    // InternalMyDsl.g:3124:1: rule__Alt__Group__1__Impl : ( ( rule__Alt__ExpressionsAssignment_1 )* ) ;
    public final void rule__Alt__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getAltAccess().getExpressionsAssignment_1()); 
            // InternalMyDsl.g:3131:2: ( rule__Alt__ExpressionsAssignment_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==18) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:3131:3: rule__Alt__ExpressionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Alt__ExpressionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getAltAccess().getExpressionsAssignment_1()); 

            }


            }

        }
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
    // $ANTLR start "rule__ObjectType__Group__1"
    // InternalMyDsl.g:1316:1: rule__ObjectType__Group__1 : rule__ObjectType__Group__1__Impl ;
    public final void rule__ObjectType__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__0"
    // InternalMyDsl.g:3140:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1320:1: ( rule__ObjectType__Group__1__Impl )
            // InternalMyDsl.g:1321:2: rule__ObjectType__Group__1__Impl
=======
            // InternalMyDsl.g:3144:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMyDsl.g:3145:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_30);
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
    // $ANTLR start "rule__ObjectType__Group__1__Impl"
    // InternalMyDsl.g:1327:1: rule__ObjectType__Group__1__Impl : ( ( rule__ObjectType__NameAssignment_1 ) ) ;
    public final void rule__ObjectType__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMyDsl.g:3152:1: rule__Expression__Group__0__Impl : ( '(' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:3157:1: ( '(' )
            // InternalMyDsl.g:3158:2: '('
            {
             before(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0()); 
>>>>>>> Added Xtext for context dependent behavior

            }


            }

        }
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
    // $ANTLR start "rule__Object__Group__0"
    // InternalMyDsl.g:1343:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__1"
    // InternalMyDsl.g:3167:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1347:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalMyDsl.g:1348:2: rule__Object__Group__0__Impl rule__Object__Group__1
=======
            // InternalMyDsl.g:3171:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // InternalMyDsl.g:3172:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_30);
            rule__Expression__Group__1__Impl();

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
    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalMyDsl.g:1355:1: rule__Object__Group__0__Impl : ( ( rule__Object__ObjectAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMyDsl.g:3179:1: rule__Expression__Group__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1()); 
            // InternalMyDsl.g:3186:2: ( RULE_ID )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:3186:3: RULE_ID
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
    // $ANTLR start "rule__Object__Group__1"
    // InternalMyDsl.g:1370:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__2"
    // InternalMyDsl.g:3194:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl rule__Expression__Group__3 ;
    public final void rule__Expression__Group__2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1374:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalMyDsl.g:1375:2: rule__Object__Group__1__Impl rule__Object__Group__2
=======
            // InternalMyDsl.g:3198:1: ( rule__Expression__Group__2__Impl rule__Expression__Group__3 )
            // InternalMyDsl.g:3199:2: rule__Expression__Group__2__Impl rule__Expression__Group__3
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_30);
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
    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalMyDsl.g:1382:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__2__Impl"
    // InternalMyDsl.g:3206:1: rule__Expression__Group__2__Impl : ( ( '=' )? ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getExpressionAccess().getEqualsSignKeyword_2()); 
            // InternalMyDsl.g:3213:2: ( '=' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:3213:3: '='
                    {
                    match(input,34,FOLLOW_2); 

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
    // $ANTLR start "rule__Object__Group__2"
    // InternalMyDsl.g:1397:1: rule__Object__Group__2 : rule__Object__Group__2__Impl ;
    public final void rule__Object__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__3"
    // InternalMyDsl.g:3221:1: rule__Expression__Group__3 : rule__Expression__Group__3__Impl rule__Expression__Group__4 ;
    public final void rule__Expression__Group__3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1401:1: ( rule__Object__Group__2__Impl )
            // InternalMyDsl.g:1402:2: rule__Object__Group__2__Impl
=======
            // InternalMyDsl.g:3225:1: ( rule__Expression__Group__3__Impl rule__Expression__Group__4 )
            // InternalMyDsl.g:3226:2: rule__Expression__Group__3__Impl rule__Expression__Group__4
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_30);
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
    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalMyDsl.g:1408:1: rule__Object__Group__2__Impl : ( ';' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__3__Impl"
    // InternalMyDsl.g:3233:1: rule__Expression__Group__3__Impl : ( ( '>' )? ) ;
    public final void rule__Expression__Group__3__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getExpressionAccess().getGreaterThanSignKeyword_3()); 
            // InternalMyDsl.g:3240:2: ( '>' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:3240:3: '>'
                    {
                    match(input,35,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
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
    // $ANTLR start "rule__Constraint__Group__0"
    // InternalMyDsl.g:1424:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__4"
    // InternalMyDsl.g:3248:1: rule__Expression__Group__4 : rule__Expression__Group__4__Impl rule__Expression__Group__5 ;
    public final void rule__Expression__Group__4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1428:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalMyDsl.g:1429:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
=======
            // InternalMyDsl.g:3252:1: ( rule__Expression__Group__4__Impl rule__Expression__Group__5 )
            // InternalMyDsl.g:3253:2: rule__Expression__Group__4__Impl rule__Expression__Group__5
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_30);
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
    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalMyDsl.g:1436:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__4__Impl"
    // InternalMyDsl.g:3260:1: rule__Expression__Group__4__Impl : ( ( '<' )? ) ;
    public final void rule__Expression__Group__4__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getExpressionAccess().getLessThanSignKeyword_4()); 
            // InternalMyDsl.g:3267:2: ( '<' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:3267:3: '<'
                    {
                    match(input,36,FOLLOW_2); 

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
    // $ANTLR start "rule__Constraint__Group__1"
    // InternalMyDsl.g:1451:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__5"
    // InternalMyDsl.g:3275:1: rule__Expression__Group__5 : rule__Expression__Group__5__Impl rule__Expression__Group__6 ;
    public final void rule__Expression__Group__5() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1455:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalMyDsl.g:1456:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
=======
            // InternalMyDsl.g:3279:1: ( rule__Expression__Group__5__Impl rule__Expression__Group__6 )
            // InternalMyDsl.g:3280:2: rule__Expression__Group__5__Impl rule__Expression__Group__6
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_30);
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
    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalMyDsl.g:1463:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__5__Impl"
    // InternalMyDsl.g:3287:1: rule__Expression__Group__5__Impl : ( ( '>=' )? ) ;
    public final void rule__Expression__Group__5__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getExpressionAccess().getGreaterThanSignEqualsSignKeyword_5()); 
            // InternalMyDsl.g:3294:2: ( '>=' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:3294:3: '>='
                    {
                    match(input,37,FOLLOW_2); 

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
    // $ANTLR start "rule__Constraint__Group__2"
    // InternalMyDsl.g:1478:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__6"
    // InternalMyDsl.g:3302:1: rule__Expression__Group__6 : rule__Expression__Group__6__Impl rule__Expression__Group__7 ;
    public final void rule__Expression__Group__6() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1482:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalMyDsl.g:1483:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
=======
            // InternalMyDsl.g:3306:1: ( rule__Expression__Group__6__Impl rule__Expression__Group__7 )
            // InternalMyDsl.g:3307:2: rule__Expression__Group__6__Impl rule__Expression__Group__7
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_30);
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
    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalMyDsl.g:1490:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__6__Impl"
    // InternalMyDsl.g:3314:1: rule__Expression__Group__6__Impl : ( ( '<=' )? ) ;
    public final void rule__Expression__Group__6__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getExpressionAccess().getLessThanSignEqualsSignKeyword_6()); 
            // InternalMyDsl.g:3321:2: ( '<=' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:3321:3: '<='
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getLessThanSignEqualsSignKeyword_6()); 

            }


            }

        }
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
    // $ANTLR start "rule__Constraint__Group__3"
    // InternalMyDsl.g:1505:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__7"
    // InternalMyDsl.g:3329:1: rule__Expression__Group__7 : rule__Expression__Group__7__Impl rule__Expression__Group__8 ;
    public final void rule__Expression__Group__7() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1509:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalMyDsl.g:1510:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
=======
            // InternalMyDsl.g:3333:1: ( rule__Expression__Group__7__Impl rule__Expression__Group__8 )
            // InternalMyDsl.g:3334:2: rule__Expression__Group__7__Impl rule__Expression__Group__8
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_30);
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
    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalMyDsl.g:1517:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__MessagesAssignment_3 )* ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__7__Impl"
    // InternalMyDsl.g:3341:1: rule__Expression__Group__7__Impl : ( ( rule__Expression__Alternatives_7 )? ) ;
    public final void rule__Expression__Group__7__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:3346:1: ( ( rule__Expression__Alternatives_7 )? )
            // InternalMyDsl.g:3347:2: ( rule__Expression__Alternatives_7 )?
            {
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

            }


            }

        }
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
    // $ANTLR start "rule__Constraint__Group__4"
    // InternalMyDsl.g:1532:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__8"
    // InternalMyDsl.g:3356:1: rule__Expression__Group__8 : rule__Expression__Group__8__Impl rule__Expression__Group__9 ;
    public final void rule__Expression__Group__8() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1536:1: ( rule__Constraint__Group__4__Impl )
            // InternalMyDsl.g:1537:2: rule__Constraint__Group__4__Impl
=======
            // InternalMyDsl.g:3360:1: ( rule__Expression__Group__8__Impl rule__Expression__Group__9 )
            // InternalMyDsl.g:3361:2: rule__Expression__Group__8__Impl rule__Expression__Group__9
>>>>>>> Added Xtext for context dependent behavior
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

            }


            }

        }
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
    // $ANTLR start "rule__Alt__Group__0"
    // InternalMyDsl.g:1559:1: rule__Alt__Group__0 : rule__Alt__Group__0__Impl rule__Alt__Group__1 ;
    public final void rule__Alt__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__9"
    // InternalMyDsl.g:3383:1: rule__Expression__Group__9 : rule__Expression__Group__9__Impl rule__Expression__Group__10 ;
    public final void rule__Expression__Group__9() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1563:1: ( rule__Alt__Group__0__Impl rule__Alt__Group__1 )
            // InternalMyDsl.g:1564:2: rule__Alt__Group__0__Impl rule__Alt__Group__1
=======
            // InternalMyDsl.g:3387:1: ( rule__Expression__Group__9__Impl rule__Expression__Group__10 )
            // InternalMyDsl.g:3388:2: rule__Expression__Group__9__Impl rule__Expression__Group__10
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_27);
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
    // $ANTLR start "rule__Alt__Group__0__Impl"
    // InternalMyDsl.g:1571:1: rule__Alt__Group__0__Impl : ( 'alt' ) ;
    public final void rule__Alt__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__9__Impl"
    // InternalMyDsl.g:3395:1: rule__Expression__Group__9__Impl : ( '{' ) ;
    public final void rule__Expression__Group__9__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
    // $ANTLR start "rule__Alt__Group__1"
    // InternalMyDsl.g:1586:1: rule__Alt__Group__1 : rule__Alt__Group__1__Impl ;
    public final void rule__Alt__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__10"
    // InternalMyDsl.g:3410:1: rule__Expression__Group__10 : rule__Expression__Group__10__Impl rule__Expression__Group__11 ;
    public final void rule__Expression__Group__10() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1590:1: ( rule__Alt__Group__1__Impl )
            // InternalMyDsl.g:1591:2: rule__Alt__Group__1__Impl
=======
            // InternalMyDsl.g:3414:1: ( rule__Expression__Group__10__Impl rule__Expression__Group__11 )
            // InternalMyDsl.g:3415:2: rule__Expression__Group__10__Impl rule__Expression__Group__11
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_27);
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
    // $ANTLR start "rule__Alt__Group__1__Impl"
    // InternalMyDsl.g:1597:1: rule__Alt__Group__1__Impl : ( ( rule__Alt__ExpressionsAssignment_1 )* ) ;
    public final void rule__Alt__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__10__Impl"
    // InternalMyDsl.g:3422:1: rule__Expression__Group__10__Impl : ( ( rule__Expression__MessagesAssignment_10 )* ) ;
    public final void rule__Expression__Group__10__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:3427:1: ( ( rule__Expression__MessagesAssignment_10 )* )
            // InternalMyDsl.g:3428:2: ( rule__Expression__MessagesAssignment_10 )*
            {
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

            }


            }

        }
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
    // $ANTLR start "rule__Expression__Group__0"
    // InternalMyDsl.g:1613:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__11"
    // InternalMyDsl.g:3437:1: rule__Expression__Group__11 : rule__Expression__Group__11__Impl ;
    public final void rule__Expression__Group__11() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1617:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMyDsl.g:1618:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
=======
            // InternalMyDsl.g:3441:1: ( rule__Expression__Group__11__Impl )
            // InternalMyDsl.g:3442:2: rule__Expression__Group__11__Impl
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMyDsl.g:1625:1: rule__Expression__Group__0__Impl : ( '(' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Expression__Group__11__Impl"
    // InternalMyDsl.g:3448:1: rule__Expression__Group__11__Impl : ( '}' ) ;
    public final void rule__Expression__Group__11__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
    // $ANTLR start "rule__Expression__Group__1"
    // InternalMyDsl.g:1640:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Par__Group__0"
    // InternalMyDsl.g:3464:1: rule__Par__Group__0 : rule__Par__Group__0__Impl rule__Par__Group__1 ;
    public final void rule__Par__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1644:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // InternalMyDsl.g:1645:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
=======
            // InternalMyDsl.g:3468:1: ( rule__Par__Group__0__Impl rule__Par__Group__1 )
            // InternalMyDsl.g:3469:2: rule__Par__Group__0__Impl rule__Par__Group__1
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMyDsl.g:1652:1: rule__Expression__Group__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Par__Group__0__Impl"
    // InternalMyDsl.g:3476:1: rule__Par__Group__0__Impl : ( 'par' ) ;
    public final void rule__Par__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:3481:1: ( 'par' )
            // InternalMyDsl.g:3482:2: 'par'
            {
             before(grammarAccess.getParAccess().getParKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getParAccess().getParKeyword_0()); 
>>>>>>> Added Xtext for context dependent behavior

            }


            }

        }
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
    // $ANTLR start "rule__Expression__Group__2"
    // InternalMyDsl.g:1667:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl rule__Expression__Group__3 ;
    public final void rule__Expression__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Par__Group__1"
    // InternalMyDsl.g:3491:1: rule__Par__Group__1 : rule__Par__Group__1__Impl rule__Par__Group__2 ;
    public final void rule__Par__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1671:1: ( rule__Expression__Group__2__Impl rule__Expression__Group__3 )
            // InternalMyDsl.g:1672:2: rule__Expression__Group__2__Impl rule__Expression__Group__3
=======
            // InternalMyDsl.g:3495:1: ( rule__Par__Group__1__Impl rule__Par__Group__2 )
            // InternalMyDsl.g:3496:2: rule__Par__Group__1__Impl rule__Par__Group__2
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_31);
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
    // $ANTLR start "rule__Expression__Group__2__Impl"
    // InternalMyDsl.g:1679:1: rule__Expression__Group__2__Impl : ( ( '=' )? ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Par__Group__1__Impl"
    // InternalMyDsl.g:3503:1: rule__Par__Group__1__Impl : ( '{' ) ;
    public final void rule__Par__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:3508:1: ( '{' )
            // InternalMyDsl.g:3509:2: '{'
            {
             before(grammarAccess.getParAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getParAccess().getLeftCurlyBracketKeyword_1()); 
>>>>>>> Added Xtext for context dependent behavior

            }


            }

        }
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
    // $ANTLR start "rule__Expression__Group__3"
    // InternalMyDsl.g:1694:1: rule__Expression__Group__3 : rule__Expression__Group__3__Impl rule__Expression__Group__4 ;
    public final void rule__Expression__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__Par__Group__2"
    // InternalMyDsl.g:3518:1: rule__Par__Group__2 : rule__Par__Group__2__Impl rule__Par__Group__3 ;
    public final void rule__Par__Group__2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1698:1: ( rule__Expression__Group__3__Impl rule__Expression__Group__4 )
            // InternalMyDsl.g:1699:2: rule__Expression__Group__3__Impl rule__Expression__Group__4
=======
            // InternalMyDsl.g:3522:1: ( rule__Par__Group__2__Impl rule__Par__Group__3 )
            // InternalMyDsl.g:3523:2: rule__Par__Group__2__Impl rule__Par__Group__3
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_31);
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


<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__3__Impl"
    // InternalMyDsl.g:1706:1: rule__Expression__Group__3__Impl : ( ( '>' )? ) ;
    public final void rule__Expression__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Par__Group__2__Impl"
    // InternalMyDsl.g:3530:1: rule__Par__Group__2__Impl : ( ( rule__Par__ParexpressionAssignment_2 )* ) ;
    public final void rule__Par__Group__2__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:3535:1: ( ( rule__Par__ParexpressionAssignment_2 )* )
            // InternalMyDsl.g:3536:2: ( rule__Par__ParexpressionAssignment_2 )*
            {
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

            }


            }

        }
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
    // $ANTLR start "rule__Expression__Group__4"
    // InternalMyDsl.g:1721:1: rule__Expression__Group__4 : rule__Expression__Group__4__Impl rule__Expression__Group__5 ;
    public final void rule__Expression__Group__4() throws RecognitionException {
=======
    // $ANTLR start "rule__Par__Group__3"
    // InternalMyDsl.g:3545:1: rule__Par__Group__3 : rule__Par__Group__3__Impl ;
    public final void rule__Par__Group__3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1725:1: ( rule__Expression__Group__4__Impl rule__Expression__Group__5 )
            // InternalMyDsl.g:1726:2: rule__Expression__Group__4__Impl rule__Expression__Group__5
=======
            // InternalMyDsl.g:3549:1: ( rule__Par__Group__3__Impl )
            // InternalMyDsl.g:3550:2: rule__Par__Group__3__Impl
>>>>>>> Added Xtext for context dependent behavior
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


    // $ANTLR start "rule__Par__Group__3__Impl"
    // InternalMyDsl.g:3556:1: rule__Par__Group__3__Impl : ( '}' ) ;
    public final void rule__Par__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3560:1: ( ( '}' ) )
            // InternalMyDsl.g:3561:1: ( '}' )
            {
            // InternalMyDsl.g:3561:1: ( '}' )
            // InternalMyDsl.g:3562:2: '}'
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
    // $ANTLR start "rule__Expression__Group__5"
    // InternalMyDsl.g:1748:1: rule__Expression__Group__5 : rule__Expression__Group__5__Impl rule__Expression__Group__6 ;
    public final void rule__Expression__Group__5() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__0"
    // InternalMyDsl.g:3572:1: rule__ParExpression__Group__0 : rule__ParExpression__Group__0__Impl rule__ParExpression__Group__1 ;
    public final void rule__ParExpression__Group__0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1752:1: ( rule__Expression__Group__5__Impl rule__Expression__Group__6 )
            // InternalMyDsl.g:1753:2: rule__Expression__Group__5__Impl rule__Expression__Group__6
=======
            // InternalMyDsl.g:3576:1: ( rule__ParExpression__Group__0__Impl rule__ParExpression__Group__1 )
            // InternalMyDsl.g:3577:2: rule__ParExpression__Group__0__Impl rule__ParExpression__Group__1
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Expression__Group__5__Impl"
    // InternalMyDsl.g:1760:1: rule__Expression__Group__5__Impl : ( ( '>=' )? ) ;
    public final void rule__Expression__Group__5__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__0__Impl"
    // InternalMyDsl.g:3584:1: rule__ParExpression__Group__0__Impl : ( 'case' ) ;
    public final void rule__ParExpression__Group__0__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:3589:1: ( 'case' )
            // InternalMyDsl.g:3590:2: 'case'
            {
             before(grammarAccess.getParExpressionAccess().getCaseKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getParExpressionAccess().getCaseKeyword_0()); 
>>>>>>> Added Xtext for context dependent behavior

            }


            }

        }
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
    // $ANTLR start "rule__Expression__Group__6"
    // InternalMyDsl.g:1775:1: rule__Expression__Group__6 : rule__Expression__Group__6__Impl rule__Expression__Group__7 ;
    public final void rule__Expression__Group__6() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__1"
    // InternalMyDsl.g:3599:1: rule__ParExpression__Group__1 : rule__ParExpression__Group__1__Impl rule__ParExpression__Group__2 ;
    public final void rule__ParExpression__Group__1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1779:1: ( rule__Expression__Group__6__Impl rule__Expression__Group__7 )
            // InternalMyDsl.g:1780:2: rule__Expression__Group__6__Impl rule__Expression__Group__7
=======
            // InternalMyDsl.g:3603:1: ( rule__ParExpression__Group__1__Impl rule__ParExpression__Group__2 )
            // InternalMyDsl.g:3604:2: rule__ParExpression__Group__1__Impl rule__ParExpression__Group__2
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Expression__Group__6__Impl"
    // InternalMyDsl.g:1787:1: rule__Expression__Group__6__Impl : ( ( '<=' )? ) ;
    public final void rule__Expression__Group__6__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__1__Impl"
    // InternalMyDsl.g:3611:1: rule__ParExpression__Group__1__Impl : ( ( rule__ParExpression__NameAssignment_1 ) ) ;
    public final void rule__ParExpression__Group__1__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:3616:1: ( ( rule__ParExpression__NameAssignment_1 ) )
            // InternalMyDsl.g:3617:2: ( rule__ParExpression__NameAssignment_1 )
            {
             before(grammarAccess.getParExpressionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3618:2: ( rule__ParExpression__NameAssignment_1 )
            // InternalMyDsl.g:3618:3: rule__ParExpression__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParExpression__NameAssignment_1();

            state._fsp--;
>>>>>>> Added Xtext for context dependent behavior


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
    // $ANTLR start "rule__Expression__Group__7"
    // InternalMyDsl.g:1802:1: rule__Expression__Group__7 : rule__Expression__Group__7__Impl rule__Expression__Group__8 ;
    public final void rule__Expression__Group__7() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__2"
    // InternalMyDsl.g:3626:1: rule__ParExpression__Group__2 : rule__ParExpression__Group__2__Impl rule__ParExpression__Group__3 ;
    public final void rule__ParExpression__Group__2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1806:1: ( rule__Expression__Group__7__Impl rule__Expression__Group__8 )
            // InternalMyDsl.g:1807:2: rule__Expression__Group__7__Impl rule__Expression__Group__8
=======
            // InternalMyDsl.g:3630:1: ( rule__ParExpression__Group__2__Impl rule__ParExpression__Group__3 )
            // InternalMyDsl.g:3631:2: rule__ParExpression__Group__2__Impl rule__ParExpression__Group__3
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_27);
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
    // $ANTLR start "rule__Expression__Group__7__Impl"
    // InternalMyDsl.g:1814:1: rule__Expression__Group__7__Impl : ( ( rule__Expression__Alternatives_7 )? ) ;
    public final void rule__Expression__Group__7__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__2__Impl"
    // InternalMyDsl.g:3638:1: rule__ParExpression__Group__2__Impl : ( '{' ) ;
    public final void rule__ParExpression__Group__2__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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

            }


            }

        }
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
    // $ANTLR start "rule__Expression__Group__8"
    // InternalMyDsl.g:1829:1: rule__Expression__Group__8 : rule__Expression__Group__8__Impl rule__Expression__Group__9 ;
    public final void rule__Expression__Group__8() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__3"
    // InternalMyDsl.g:3653:1: rule__ParExpression__Group__3 : rule__ParExpression__Group__3__Impl rule__ParExpression__Group__4 ;
    public final void rule__ParExpression__Group__3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1833:1: ( rule__Expression__Group__8__Impl rule__Expression__Group__9 )
            // InternalMyDsl.g:1834:2: rule__Expression__Group__8__Impl rule__Expression__Group__9
=======
            // InternalMyDsl.g:3657:1: ( rule__ParExpression__Group__3__Impl rule__ParExpression__Group__4 )
            // InternalMyDsl.g:3658:2: rule__ParExpression__Group__3__Impl rule__ParExpression__Group__4
>>>>>>> Added Xtext for context dependent behavior
            {
            pushFollow(FOLLOW_27);
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
    // $ANTLR start "rule__Expression__Group__8__Impl"
    // InternalMyDsl.g:1841:1: rule__Expression__Group__8__Impl : ( ')' ) ;
    public final void rule__Expression__Group__8__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__3__Impl"
    // InternalMyDsl.g:3665:1: rule__ParExpression__Group__3__Impl : ( ( rule__ParExpression__MessagesAssignment_3 )* ) ;
    public final void rule__ParExpression__Group__3__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getParExpressionAccess().getMessagesAssignment_3()); 
            // InternalMyDsl.g:3672:2: ( rule__ParExpression__MessagesAssignment_3 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==29) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMyDsl.g:3672:3: rule__ParExpression__MessagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__ParExpression__MessagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getParExpressionAccess().getMessagesAssignment_3()); 

            }


            }

        }
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
    // $ANTLR start "rule__Expression__Group__9"
    // InternalMyDsl.g:1856:1: rule__Expression__Group__9 : rule__Expression__Group__9__Impl rule__Expression__Group__10 ;
    public final void rule__Expression__Group__9() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__4"
    // InternalMyDsl.g:3680:1: rule__ParExpression__Group__4 : rule__ParExpression__Group__4__Impl ;
    public final void rule__ParExpression__Group__4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1860:1: ( rule__Expression__Group__9__Impl rule__Expression__Group__10 )
            // InternalMyDsl.g:1861:2: rule__Expression__Group__9__Impl rule__Expression__Group__10
=======
            // InternalMyDsl.g:3684:1: ( rule__ParExpression__Group__4__Impl )
            // InternalMyDsl.g:3685:2: rule__ParExpression__Group__4__Impl
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__Expression__Group__9__Impl"
    // InternalMyDsl.g:1868:1: rule__Expression__Group__9__Impl : ( '{' ) ;
    public final void rule__Expression__Group__9__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ParExpression__Group__4__Impl"
    // InternalMyDsl.g:3691:1: rule__ParExpression__Group__4__Impl : ( '}' ) ;
    public final void rule__ParExpression__Group__4__Impl() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getParExpressionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getParExpressionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // $ANTLR start "rule__Expression__Group__10"
    // InternalMyDsl.g:1883:1: rule__Expression__Group__10 : rule__Expression__Group__10__Impl rule__Expression__Group__11 ;
    public final void rule__Expression__Group__10() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__NameAssignment_1"
    // InternalMyDsl.g:3707:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1887:1: ( rule__Expression__Group__10__Impl rule__Expression__Group__11 )
            // InternalMyDsl.g:1888:2: rule__Expression__Group__10__Impl rule__Expression__Group__11
=======
            // InternalMyDsl.g:3711:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3712:2: ( RULE_ID )
>>>>>>> Added Xtext for context dependent behavior
            {
            // InternalMyDsl.g:3712:2: ( RULE_ID )
            // InternalMyDsl.g:3713:3: RULE_ID
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


<<<<<<< HEAD
    // $ANTLR start "rule__Expression__Group__10__Impl"
    // InternalMyDsl.g:1895:1: rule__Expression__Group__10__Impl : ( ( rule__Expression__MessagesAssignment_10 )* ) ;
    public final void rule__Expression__Group__10__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__ContextmodelsAssignment_3"
    // InternalMyDsl.g:3722:1: rule__Domain__ContextmodelsAssignment_3 : ( ruleContextModel ) ;
    public final void rule__Domain__ContextmodelsAssignment_3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:3727:2: ( ruleContextModel )
            // InternalMyDsl.g:3728:3: ruleContextModel
            {
             before(grammarAccess.getDomainAccess().getContextmodelsContextModelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleContextModel();
>>>>>>> Added Xtext for context dependent behavior

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
    // $ANTLR start "rule__Expression__Group__11"
    // InternalMyDsl.g:1910:1: rule__Expression__Group__11 : rule__Expression__Group__11__Impl ;
    public final void rule__Expression__Group__11() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__ContextfragmentsAssignment_4"
    // InternalMyDsl.g:3737:1: rule__Domain__ContextfragmentsAssignment_4 : ( ruleContextFragment ) ;
    public final void rule__Domain__ContextfragmentsAssignment_4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1914:1: ( rule__Expression__Group__11__Impl )
            // InternalMyDsl.g:1915:2: rule__Expression__Group__11__Impl
=======
            // InternalMyDsl.g:3741:1: ( ( ruleContextFragment ) )
            // InternalMyDsl.g:3742:2: ( ruleContextFragment )
>>>>>>> Added Xtext for context dependent behavior
            {
            // InternalMyDsl.g:3742:2: ( ruleContextFragment )
            // InternalMyDsl.g:3743:3: ruleContextFragment
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
    // $ANTLR start "rule__Expression__Group__11__Impl"
    // InternalMyDsl.g:1921:1: rule__Expression__Group__11__Impl : ( '}' ) ;
    public final void rule__Expression__Group__11__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__EntitiesAssignment_5"
    // InternalMyDsl.g:3752:1: rule__Domain__EntitiesAssignment_5 : ( ruleEntity ) ;
    public final void rule__Domain__EntitiesAssignment_5() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_5_0()); 

            }


            }

        }
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
    // $ANTLR start "rule__Par__Group__0"
    // InternalMyDsl.g:1937:1: rule__Par__Group__0 : rule__Par__Group__0__Impl rule__Par__Group__1 ;
    public final void rule__Par__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__ContextchangesAssignment_6"
    // InternalMyDsl.g:3767:1: rule__Domain__ContextchangesAssignment_6 : ( ruleContextChange ) ;
    public final void rule__Domain__ContextchangesAssignment_6() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1941:1: ( rule__Par__Group__0__Impl rule__Par__Group__1 )
            // InternalMyDsl.g:1942:2: rule__Par__Group__0__Impl rule__Par__Group__1
=======
            // InternalMyDsl.g:3771:1: ( ( ruleContextChange ) )
            // InternalMyDsl.g:3772:2: ( ruleContextChange )
>>>>>>> Added Xtext for context dependent behavior
            {
            // InternalMyDsl.g:3772:2: ( ruleContextChange )
            // InternalMyDsl.g:3773:3: ruleContextChange
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
    // $ANTLR start "rule__Par__Group__0__Impl"
    // InternalMyDsl.g:1949:1: rule__Par__Group__0__Impl : ( 'par' ) ;
    public final void rule__Par__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__ObjectsAssignment_7"
    // InternalMyDsl.g:3782:1: rule__Domain__ObjectsAssignment_7 : ( ruleObject ) ;
    public final void rule__Domain__ObjectsAssignment_7() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getDomainAccess().getObjectsObjectParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

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
    // $ANTLR start "rule__Par__Group__1"
    // InternalMyDsl.g:1964:1: rule__Par__Group__1 : rule__Par__Group__1__Impl rule__Par__Group__2 ;
    public final void rule__Par__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__ConstraintsAssignment_8"
    // InternalMyDsl.g:3797:1: rule__Domain__ConstraintsAssignment_8 : ( ruleConstraint ) ;
    public final void rule__Domain__ConstraintsAssignment_8() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1968:1: ( rule__Par__Group__1__Impl rule__Par__Group__2 )
            // InternalMyDsl.g:1969:2: rule__Par__Group__1__Impl rule__Par__Group__2
=======
            // InternalMyDsl.g:3801:1: ( ( ruleConstraint ) )
            // InternalMyDsl.g:3802:2: ( ruleConstraint )
>>>>>>> Added Xtext for context dependent behavior
            {
            // InternalMyDsl.g:3802:2: ( ruleConstraint )
            // InternalMyDsl.g:3803:3: ruleConstraint
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
    // $ANTLR start "rule__Par__Group__1__Impl"
    // InternalMyDsl.g:1976:1: rule__Par__Group__1__Impl : ( '{' ) ;
    public final void rule__Par__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Domain__ScenariosAssignment_9"
    // InternalMyDsl.g:3812:1: rule__Domain__ScenariosAssignment_9 : ( ruleScenario ) ;
    public final void rule__Domain__ScenariosAssignment_9() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getDomainAccess().getScenariosScenarioParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getScenariosScenarioParserRuleCall_9_0()); 

            }


            }

        }
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
    // $ANTLR start "rule__Par__Group__2"
    // InternalMyDsl.g:1991:1: rule__Par__Group__2 : rule__Par__Group__2__Impl rule__Par__Group__3 ;
    public final void rule__Par__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextModel__NameAssignment_1"
    // InternalMyDsl.g:3827:1: rule__ContextModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContextModel__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:1995:1: ( rule__Par__Group__2__Impl rule__Par__Group__3 )
            // InternalMyDsl.g:1996:2: rule__Par__Group__2__Impl rule__Par__Group__3
=======
            // InternalMyDsl.g:3831:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3832:2: ( RULE_ID )
>>>>>>> Added Xtext for context dependent behavior
            {
            // InternalMyDsl.g:3832:2: ( RULE_ID )
            // InternalMyDsl.g:3833:3: RULE_ID
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
    // $ANTLR start "rule__Par__Group__2__Impl"
    // InternalMyDsl.g:2003:1: rule__Par__Group__2__Impl : ( ( rule__Par__ParexpressionAssignment_2 )* ) ;
    public final void rule__Par__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextModel__EntitiesAssignment_3"
    // InternalMyDsl.g:3842:1: rule__ContextModel__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__ContextModel__EntitiesAssignment_3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:3847:2: ( ruleEntity )
            // InternalMyDsl.g:3848:3: ruleEntity
            {
             before(grammarAccess.getContextModelAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();
>>>>>>> Added Xtext for context dependent behavior

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
    // $ANTLR start "rule__Par__Group__3"
    // InternalMyDsl.g:2018:1: rule__Par__Group__3 : rule__Par__Group__3__Impl ;
    public final void rule__Par__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextModel__RelationsAssignment_4"
    // InternalMyDsl.g:3857:1: rule__ContextModel__RelationsAssignment_4 : ( ruleRelation ) ;
    public final void rule__ContextModel__RelationsAssignment_4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2022:1: ( rule__Par__Group__3__Impl )
            // InternalMyDsl.g:2023:2: rule__Par__Group__3__Impl
=======
            // InternalMyDsl.g:3861:1: ( ( ruleRelation ) )
            // InternalMyDsl.g:3862:2: ( ruleRelation )
>>>>>>> Added Xtext for context dependent behavior
            {
            // InternalMyDsl.g:3862:2: ( ruleRelation )
            // InternalMyDsl.g:3863:3: ruleRelation
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
    // $ANTLR start "rule__Par__Group__3__Impl"
    // InternalMyDsl.g:2029:1: rule__Par__Group__3__Impl : ( '}' ) ;
    public final void rule__Par__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextFragment__NameAssignment_1"
    // InternalMyDsl.g:3872:1: rule__ContextFragment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContextFragment__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
    // $ANTLR start "rule__ParExpression__Group__0"
    // InternalMyDsl.g:2045:1: rule__ParExpression__Group__0 : rule__ParExpression__Group__0__Impl rule__ParExpression__Group__1 ;
    public final void rule__ParExpression__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextFragment__EntitiesAssignment_3"
    // InternalMyDsl.g:3887:1: rule__ContextFragment__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__ContextFragment__EntitiesAssignment_3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2049:1: ( rule__ParExpression__Group__0__Impl rule__ParExpression__Group__1 )
            // InternalMyDsl.g:2050:2: rule__ParExpression__Group__0__Impl rule__ParExpression__Group__1
=======
            // InternalMyDsl.g:3891:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:3892:2: ( ruleEntity )
>>>>>>> Added Xtext for context dependent behavior
            {
            // InternalMyDsl.g:3892:2: ( ruleEntity )
            // InternalMyDsl.g:3893:3: ruleEntity
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
    // $ANTLR start "rule__ParExpression__Group__0__Impl"
    // InternalMyDsl.g:2057:1: rule__ParExpression__Group__0__Impl : ( 'case' ) ;
    public final void rule__ParExpression__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextFragment__RelationsAssignment_4"
    // InternalMyDsl.g:3902:1: rule__ContextFragment__RelationsAssignment_4 : ( ruleRelation ) ;
    public final void rule__ContextFragment__RelationsAssignment_4() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getContextFragmentAccess().getRelationsRelationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

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
    // $ANTLR start "rule__ParExpression__Group__1"
    // InternalMyDsl.g:2072:1: rule__ParExpression__Group__1 : rule__ParExpression__Group__1__Impl rule__ParExpression__Group__2 ;
    public final void rule__ParExpression__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__ChangeType__EntityAssignment_0_2"
    // InternalMyDsl.g:3917:1: rule__ChangeType__EntityAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeType__EntityAssignment_0_2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2076:1: ( rule__ParExpression__Group__1__Impl rule__ParExpression__Group__2 )
            // InternalMyDsl.g:2077:2: rule__ParExpression__Group__1__Impl rule__ParExpression__Group__2
=======
            // InternalMyDsl.g:3921:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3922:2: ( ( RULE_ID ) )
>>>>>>> Added Xtext for context dependent behavior
            {
            // InternalMyDsl.g:3922:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3923:3: ( RULE_ID )
            {
             before(grammarAccess.getChangeTypeAccess().getEntityEntityCrossReference_0_2_0()); 
            // InternalMyDsl.g:3924:3: ( RULE_ID )
            // InternalMyDsl.g:3925:4: RULE_ID
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
    // $ANTLR start "rule__ParExpression__Group__1__Impl"
    // InternalMyDsl.g:2084:1: rule__ParExpression__Group__1__Impl : ( ( rule__ParExpression__NameAssignment_1 ) ) ;
    public final void rule__ParExpression__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ChangeType__EntityAssignment_1_2"
    // InternalMyDsl.g:3936:1: rule__ChangeType__EntityAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeType__EntityAssignment_1_2() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:3941:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3942:3: ( RULE_ID )
            {
             before(grammarAccess.getChangeTypeAccess().getEntityEntityCrossReference_1_2_0()); 
            // InternalMyDsl.g:3943:3: ( RULE_ID )
            // InternalMyDsl.g:3944:4: RULE_ID
>>>>>>> Added Xtext for context dependent behavior
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
    // $ANTLR start "rule__ParExpression__Group__2"
    // InternalMyDsl.g:2099:1: rule__ParExpression__Group__2 : rule__ParExpression__Group__2__Impl rule__ParExpression__Group__3 ;
    public final void rule__ParExpression__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__ChangeType__AttributeAssignment_2_1"
    // InternalMyDsl.g:3955:1: rule__ChangeType__AttributeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeType__AttributeAssignment_2_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2103:1: ( rule__ParExpression__Group__2__Impl rule__ParExpression__Group__3 )
            // InternalMyDsl.g:2104:2: rule__ParExpression__Group__2__Impl rule__ParExpression__Group__3
=======
            // InternalMyDsl.g:3959:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3960:2: ( ( RULE_ID ) )
>>>>>>> Added Xtext for context dependent behavior
            {
            // InternalMyDsl.g:3960:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3961:3: ( RULE_ID )
            {
             before(grammarAccess.getChangeTypeAccess().getAttributeAttributeCrossReference_2_1_0()); 
            // InternalMyDsl.g:3962:3: ( RULE_ID )
            // InternalMyDsl.g:3963:4: RULE_ID
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
    // $ANTLR start "rule__ParExpression__Group__2__Impl"
    // InternalMyDsl.g:2111:1: rule__ParExpression__Group__2__Impl : ( '{' ) ;
    public final void rule__ParExpression__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextChange__ChangeAssignment_0"
    // InternalMyDsl.g:3974:1: rule__ContextChange__ChangeAssignment_0 : ( ruleChangeType ) ;
    public final void rule__ContextChange__ChangeAssignment_0() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
    // $ANTLR start "rule__ParExpression__Group__3"
    // InternalMyDsl.g:2126:1: rule__ParExpression__Group__3 : rule__ParExpression__Group__3__Impl rule__ParExpression__Group__4 ;
    public final void rule__ParExpression__Group__3() throws RecognitionException {
=======
    // $ANTLR start "rule__ContextChange__NameAssignment_1"
    // InternalMyDsl.g:3989:1: rule__ContextChange__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContextChange__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2130:1: ( rule__ParExpression__Group__3__Impl rule__ParExpression__Group__4 )
            // InternalMyDsl.g:2131:2: rule__ParExpression__Group__3__Impl rule__ParExpression__Group__4
=======
            // InternalMyDsl.g:3993:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3994:2: ( RULE_ID )
>>>>>>> Added Xtext for context dependent behavior
            {
            // InternalMyDsl.g:3994:2: ( RULE_ID )
            // InternalMyDsl.g:3995:3: RULE_ID
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
    // $ANTLR start "rule__ParExpression__Group__3__Impl"
    // InternalMyDsl.g:2138:1: rule__ParExpression__Group__3__Impl : ( ( rule__ParExpression__MessagesAssignment_3 )* ) ;
    public final void rule__ParExpression__Group__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyDsl.g:4004:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:4009:2: ( RULE_ID )
            // InternalMyDsl.g:4010:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
>>>>>>> Added Xtext for context dependent behavior

            }


            }

        }
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
    // $ANTLR start "rule__ParExpression__Group__4"
    // InternalMyDsl.g:2153:1: rule__ParExpression__Group__4 : rule__ParExpression__Group__4__Impl ;
    public final void rule__ParExpression__Group__4() throws RecognitionException {
=======
    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalMyDsl.g:4019:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2157:1: ( rule__ParExpression__Group__4__Impl )
            // InternalMyDsl.g:2158:2: rule__ParExpression__Group__4__Impl
=======
            // InternalMyDsl.g:4023:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4024:2: ( RULE_ID )
>>>>>>> Added Xtext for context dependent behavior
            {
            // InternalMyDsl.g:4024:2: ( RULE_ID )
            // InternalMyDsl.g:4025:3: RULE_ID
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
    // $ANTLR start "rule__ParExpression__Group__4__Impl"
    // InternalMyDsl.g:2164:1: rule__ParExpression__Group__4__Impl : ( '}' ) ;
    public final void rule__ParExpression__Group__4__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Entity__AttributesAssignment_3"
    // InternalMyDsl.g:4034:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

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
    // $ANTLR start "rule__Loop__Group__0"
    // InternalMyDsl.g:2180:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Relation__NameAssignment_1"
    // InternalMyDsl.g:4049:1: rule__Relation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {
>>>>>>> Added Xtext for context dependent behavior

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2184:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalMyDsl.g:2185:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Loop__Group__0__Impl();
=======
            // InternalMyDsl.g:4053:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4054:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4054:2: ( RULE_ID )
            // InternalMyDsl.g:4055:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 
>>>>>>> Added Xtext for context dependent behavior

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

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:4069:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4070:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getSenderEntityCrossReference_3_0()); 
            // InternalMyDsl.g:4071:3: ( RULE_ID )
            // InternalMyDsl.g:4072:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getSenderEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getSenderEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getSenderEntityCrossReference_3_0()); 
>>>>>>> Added Xtext for context dependent behavior

            }


            }

        }
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

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2211:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalMyDsl.g:2212:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Loop__Group__1__Impl();
=======
            // InternalMyDsl.g:4087:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4088:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4088:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4089:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getReceiverEntityCrossReference_5_0()); 
            // InternalMyDsl.g:4090:3: ( RULE_ID )
            // InternalMyDsl.g:4091:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getReceiverEntityIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getReceiverEntityIDTerminalRuleCall_5_0_1()); 
>>>>>>> Added Xtext for context dependent behavior

            }

<<<<<<< HEAD
            pushFollow(FOLLOW_2);
            rule__Loop__Group__2();
=======
             after(grammarAccess.getRelationAccess().getReceiverEntityCrossReference_5_0()); 
>>>>>>> Added Xtext for context dependent behavior

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

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:4107:2: ( ruleAttribute )
            // InternalMyDsl.g:4108:3: ruleAttribute
            {
             before(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_8_0()); 
>>>>>>> Added Xtext for context dependent behavior

            }


            }

        }
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

        		int stackSize = keepStackSize();
        	
        try {
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

        		int stackSize = keepStackSize();
        	
        try {
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

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getMinAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
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

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2265:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalMyDsl.g:2266:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Loop__Group__3__Impl();
=======
            // InternalMyDsl.g:4151:1: ( ( ruleAlt ) )
            // InternalMyDsl.g:4152:2: ( ruleAlt )
            {
            // InternalMyDsl.g:4152:2: ( ruleAlt )
            // InternalMyDsl.g:4153:3: ruleAlt
            {
             before(grammarAccess.getScenarioContentAccess().getAltAltParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAlt();
>>>>>>> Added Xtext for context dependent behavior

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__4();

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

        		int stackSize = keepStackSize();
        	
        try {
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

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
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

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2292:1: ( rule__Loop__Group__4__Impl rule__Loop__Group__5 )
            // InternalMyDsl.g:2293:2: rule__Loop__Group__4__Impl rule__Loop__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Loop__Group__4__Impl();
=======
            // InternalMyDsl.g:4181:1: ( ( rulePar ) )
            // InternalMyDsl.g:4182:2: ( rulePar )
            {
            // InternalMyDsl.g:4182:2: ( rulePar )
            // InternalMyDsl.g:4183:3: rulePar
            {
             before(grammarAccess.getScenarioContentAccess().getParParParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePar();
>>>>>>> Added Xtext for context dependent behavior

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__5();

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

        		int stackSize = keepStackSize();
        	
        try {
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

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getMaxAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
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

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2319:1: ( rule__Loop__Group__5__Impl rule__Loop__Group__6 )
            // InternalMyDsl.g:2320:2: rule__Loop__Group__5__Impl rule__Loop__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Loop__Group__5__Impl();
=======
            // InternalMyDsl.g:4211:1: ( ( ( 'required' ) ) )
            // InternalMyDsl.g:4212:2: ( ( 'required' ) )
            {
            // InternalMyDsl.g:4212:2: ( ( 'required' ) )
            // InternalMyDsl.g:4213:3: ( 'required' )
            {
             before(grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0()); 
            // InternalMyDsl.g:4214:3: ( 'required' )
            // InternalMyDsl.g:4215:4: 'required'
            {
             before(grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0()); 
>>>>>>> Added Xtext for context dependent behavior

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__6();

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

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:4231:2: ( ( 'fail' ) )
            // InternalMyDsl.g:4232:3: ( 'fail' )
            {
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

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
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

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalMyDsl.g:2346:1: ( rule__Loop__Group__6__Impl rule__Loop__Group__7 )
            // InternalMyDsl.g:2347:2: rule__Loop__Group__6__Impl rule__Loop__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Loop__Group__6__Impl();
=======
            // InternalMyDsl.g:4249:1: ( ( ( 'strict' ) ) )
            // InternalMyDsl.g:4250:2: ( ( 'strict' ) )
            {
            // InternalMyDsl.g:4250:2: ( ( 'strict' ) )
            // InternalMyDsl.g:4251:3: ( 'strict' )
            {
             before(grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0()); 
            // InternalMyDsl.g:4252:3: ( 'strict' )
            // InternalMyDsl.g:4253:4: 'strict'
            {
             before(grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0()); 
>>>>>>> Added Xtext for context dependent behavior

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__7();

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
    // $ANTLR end "rule__Message__StrictAssignment_4"


    // $ANTLR start "rule__Message__SenderAssignment_5"
    // InternalMyDsl.g:2645:1: rule__Message__SenderAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Message__SenderAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2649:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2650:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2650:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2651:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getSenderObjectCrossReference_5_0()); 
            // InternalMyDsl.g:2652:3: ( RULE_ID )
            // InternalMyDsl.g:2653:4: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getSenderObjectIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getSenderObjectIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMessageAccess().getSenderObjectCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__SenderAssignment_5"


    // $ANTLR start "rule__Message__ReceiverAssignment_7"
    // InternalMyDsl.g:2664:1: rule__Message__ReceiverAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Message__ReceiverAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2668:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2669:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2669:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2670:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getReceiverObjectCrossReference_7_0()); 
            // InternalMyDsl.g:2671:3: ( RULE_ID )
            // InternalMyDsl.g:2672:4: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getReceiverObjectIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getReceiverObjectIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getMessageAccess().getReceiverObjectCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__ReceiverAssignment_7"


    // $ANTLR start "rule__Message__PastAssignment_8"
<<<<<<< HEAD
    // InternalMyDsl.g:2683:1: rule__Message__PastAssignment_8 : ( ( 'past' ) ) ;
=======
    // InternalMyDsl.g:4302:1: rule__Message__PastAssignment_8 : ( ( 'past' ) ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__Message__PastAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:4307:2: ( ( 'past' ) )
            // InternalMyDsl.g:4308:3: ( 'past' )
            {
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

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__PastAssignment_8"


    // $ANTLR start "rule__Message__FutureAssignment_9"
<<<<<<< HEAD
    // InternalMyDsl.g:2702:1: rule__Message__FutureAssignment_9 : ( ( 'future' ) ) ;
=======
    // InternalMyDsl.g:4321:1: rule__Message__FutureAssignment_9 : ( ( 'future' ) ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__Message__FutureAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:4326:2: ( ( 'future' ) )
            // InternalMyDsl.g:4327:3: ( 'future' )
            {
             before(grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0()); 
            // InternalMyDsl.g:4328:3: ( 'future' )
            // InternalMyDsl.g:4329:4: 'future'
            {
             before(grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0()); 
            match(input,45,FOLLOW_2); 
>>>>>>> Added Xtext for context dependent behavior
             after(grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0()); 

            }

             after(grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__FutureAssignment_9"


    // $ANTLR start "rule__Message__ConstraintAssignment_10"
<<<<<<< HEAD
    // InternalMyDsl.g:2721:1: rule__Message__ConstraintAssignment_10 : ( ( 'constraint' ) ) ;
=======
    // InternalMyDsl.g:4340:1: rule__Message__ConstraintAssignment_10 : ( ( 'constraint' ) ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__Message__ConstraintAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
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
            {
             before(grammarAccess.getMessageAccess().getConstraintConstraintKeyword_10_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getConstraintConstraintKeyword_10_0()); 

            }

             after(grammarAccess.getMessageAccess().getConstraintConstraintKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__ConstraintAssignment_10"


    // $ANTLR start "rule__Message__CAssignment_12"
<<<<<<< HEAD
    // InternalMyDsl.g:2740:1: rule__Message__CAssignment_12 : ( ( RULE_ID ) ) ;
=======
    // InternalMyDsl.g:4359:1: rule__Message__CAssignment_12 : ( ( RULE_ID ) ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__Message__CAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
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
            {
            // InternalMyDsl.g:4364:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4365:3: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getCConstraintCrossReference_12_0()); 
            // InternalMyDsl.g:4366:3: ( RULE_ID )
            // InternalMyDsl.g:4367:4: RULE_ID
>>>>>>> Added Xtext for context dependent behavior
            {
             before(grammarAccess.getMessageAccess().getCConstraintIDTerminalRuleCall_12_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getCConstraintIDTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getMessageAccess().getCConstraintCrossReference_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__CAssignment_12"


    // $ANTLR start "rule__ObjectType__NameAssignment_1"
<<<<<<< HEAD
    // InternalMyDsl.g:2759:1: rule__ObjectType__NameAssignment_1 : ( RULE_ID ) ;
=======
    // InternalMyDsl.g:4378:1: rule__ObjectType__NameAssignment_1 : ( RULE_ID ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__ObjectType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
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
    // InternalMyDsl.g:2774:1: rule__Object__ObjectAssignment_0 : ( ruleObjectType ) ;
=======
    // InternalMyDsl.g:4393:1: rule__Object__ObjectAssignment_0 : ( ruleObjectType ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__Object__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
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
    // InternalMyDsl.g:2789:1: rule__Object__NameAssignment_1 : ( RULE_ID ) ;
=======
    // InternalMyDsl.g:4408:1: rule__Object__NameAssignment_1 : ( RULE_ID ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__Object__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
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
    // InternalMyDsl.g:2804:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
=======
    // InternalMyDsl.g:4423:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
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
    // InternalMyDsl.g:2819:1: rule__Constraint__MessagesAssignment_3 : ( ruleMessage ) ;
=======
    // InternalMyDsl.g:4438:1: rule__Constraint__MessagesAssignment_3 : ( ruleMessage ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__Constraint__MessagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
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
    // InternalMyDsl.g:2834:1: rule__Alt__ExpressionsAssignment_1 : ( ruleExpression ) ;
=======
    // InternalMyDsl.g:4453:1: rule__Alt__ExpressionsAssignment_1 : ( ruleExpression ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__Alt__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
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
    // InternalMyDsl.g:2849:1: rule__Expression__MessagesAssignment_10 : ( ruleMessage ) ;
=======
    // InternalMyDsl.g:4468:1: rule__Expression__MessagesAssignment_10 : ( ruleMessage ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__Expression__MessagesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
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
    // InternalMyDsl.g:2864:1: rule__Par__ParexpressionAssignment_2 : ( ruleParExpression ) ;
=======
    // InternalMyDsl.g:4483:1: rule__Par__ParexpressionAssignment_2 : ( ruleParExpression ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__Par__ParexpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
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
    // InternalMyDsl.g:2879:1: rule__ParExpression__NameAssignment_1 : ( RULE_ID ) ;
=======
    // InternalMyDsl.g:4498:1: rule__ParExpression__NameAssignment_1 : ( RULE_ID ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__ParExpression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
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
    // InternalMyDsl.g:2894:1: rule__ParExpression__MessagesAssignment_3 : ( ruleMessage ) ;
=======
    // InternalMyDsl.g:4513:1: rule__ParExpression__MessagesAssignment_3 : ( ruleMessage ) ;
>>>>>>> Added Xtext for context dependent behavior
    public final void rule__ParExpression__MessagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000720002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008220004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008220000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000E0000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000300100806010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000007C00080030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000002L});
>>>>>>> Added Xtext for context dependent behavior

}