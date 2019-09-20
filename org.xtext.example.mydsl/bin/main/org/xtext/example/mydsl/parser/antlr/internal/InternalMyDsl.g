/*
 * generated by Xtext 2.16.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDomain
entryRuleDomain returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDomainRule()); }
	iv_ruleDomain=ruleDomain
	{ $current=$iv_ruleDomain.current; }
	EOF;

// Rule Domain
ruleDomain returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='specification'
		{
			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getSpecificationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDomainRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDomainAccess().getObjectsObjectParserRuleCall_3_0());
				}
				lv_objects_3_0=ruleObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainRule());
					}
					add(
						$current,
						"objects",
						lv_objects_3_0,
						"org.xtext.example.mydsl.MyDsl.Object");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getDomainAccess().getConstraintsConstraintParserRuleCall_4_0());
				}
				lv_constraints_4_0=ruleConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainRule());
					}
					add(
						$current,
						"constraints",
						lv_constraints_4_0,
						"org.xtext.example.mydsl.MyDsl.Constraint");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getDomainAccess().getScenariosScenarioParserRuleCall_5_0());
				}
				lv_scenarios_5_0=ruleScenario
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainRule());
					}
					add(
						$current,
						"scenarios",
						lv_scenarios_5_0,
						"org.xtext.example.mydsl.MyDsl.Scenario");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleScenario
entryRuleScenario returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenarioRule()); }
	iv_ruleScenario=ruleScenario
	{ $current=$iv_ruleScenario.current; }
	EOF;

// Rule Scenario
ruleScenario returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='scenario'
		{
			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScenarioRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getScenariocontentsScenarioContentParserRuleCall_3_0());
				}
				lv_scenariocontents_3_0=ruleScenarioContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					add(
						$current,
						"scenariocontents",
						lv_scenariocontents_3_0,
						"org.xtext.example.mydsl.MyDsl.ScenarioContent");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleScenarioContent
entryRuleScenarioContent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenarioContentRule()); }
	iv_ruleScenarioContent=ruleScenarioContent
	{ $current=$iv_ruleScenarioContent.current; }
	EOF;

// Rule ScenarioContent
ruleScenarioContent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioContentAccess().getAltAltParserRuleCall_0_0());
				}
				lv_alt_0_0=ruleAlt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioContentRule());
					}
					add(
						$current,
						"alt",
						lv_alt_0_0,
						"org.xtext.example.mydsl.MyDsl.Alt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioContentAccess().getMessageMessageParserRuleCall_1_0());
				}
				lv_message_1_0=ruleMessage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioContentRule());
					}
					add(
						$current,
						"message",
						lv_message_1_0,
						"org.xtext.example.mydsl.MyDsl.Message");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioContentAccess().getParParParserRuleCall_2_0());
				}
				lv_par_2_0=rulePar
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioContentRule());
					}
					add(
						$current,
						"par",
						lv_par_2_0,
						"org.xtext.example.mydsl.MyDsl.Par");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMessage
entryRuleMessage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMessageRule()); }
	iv_ruleMessage=ruleMessage
	{ $current=$iv_ruleMessage.current; }
	EOF;

// Rule Message
ruleMessage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='message'
		{
			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMessageAccess().getNameNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMessageRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_required_2_0='required'
				{
					newLeafNode(lv_required_2_0, grammarAccess.getMessageAccess().getRequiredRequiredKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
					setWithLastConsumed($current, "required", true, "required");
				}
			)
		)?
		(
			(
				lv_fail_3_0='fail'
				{
					newLeafNode(lv_fail_3_0, grammarAccess.getMessageAccess().getFailFailKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
					setWithLastConsumed($current, "fail", true, "fail");
				}
			)
		)?
		(
			(
				lv_strict_4_0='strict'
				{
					newLeafNode(lv_strict_4_0, grammarAccess.getMessageAccess().getStrictStrictKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
					setWithLastConsumed($current, "strict", true, "strict");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getSenderObjectCrossReference_5_0());
				}
			)
		)
		otherlv_6='->'
		{
			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getHyphenMinusGreaterThanSignKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getReceiverObjectCrossReference_7_0());
				}
			)
		)
		(
			(
				lv_past_8_0='past'
				{
					newLeafNode(lv_past_8_0, grammarAccess.getMessageAccess().getPastPastKeyword_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
					setWithLastConsumed($current, "past", true, "past");
				}
			)
		)?
		(
			(
				lv_future_9_0='future'
				{
					newLeafNode(lv_future_9_0, grammarAccess.getMessageAccess().getFutureFutureKeyword_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
					setWithLastConsumed($current, "future", true, "future");
				}
			)
		)?
		(
			(
				lv_constraint_10_0='constraint'
				{
					newLeafNode(lv_constraint_10_0, grammarAccess.getMessageAccess().getConstraintConstraintKeyword_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
					setWithLastConsumed($current, "constraint", true, "constraint");
				}
			)
		)?
		(
			otherlv_11='{'
			{
				newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_11());
			}
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
				}
				otherlv_12=RULE_ID
				{
					newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getCConstraintCrossReference_12_0());
				}
			)
		)?
		(
			otherlv_13='}'
			{
				newLeafNode(otherlv_13, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_13());
			}
		)?
		otherlv_14=';'
		{
			newLeafNode(otherlv_14, grammarAccess.getMessageAccess().getSemicolonKeyword_14());
		}
	)
;

// Entry rule entryRuleName
entryRuleName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNameRule()); }
	iv_ruleName=ruleName
	{ $current=$iv_ruleName.current.getText(); }
	EOF;

// Rule Name
ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getNameAccess().getLeftParenthesisKeyword_1());
		}
		(
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getNameAccess().getIDTerminalRuleCall_2_0());
			}
			    |
			this_Number_3=RULE_NUMBER
			{
				$current.merge(this_Number_3);
			}
			{
				newLeafNode(this_Number_3, grammarAccess.getNameAccess().getNumberTerminalRuleCall_2_1());
			}
		)?
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getNameAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleObjectType
entryRuleObjectType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectTypeRule()); }
	iv_ruleObjectType=ruleObjectType
	{ $current=$iv_ruleObjectType.current; }
	EOF;

// Rule ObjectType
ruleObjectType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='object'
		{
			newLeafNode(otherlv_0, grammarAccess.getObjectTypeAccess().getObjectKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getObjectTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleObject
entryRuleObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectRule()); }
	iv_ruleObject=ruleObject
	{ $current=$iv_ruleObject.current; }
	EOF;

// Rule Object
ruleObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getObjectAccess().getObjectObjectTypeParserRuleCall_0_0());
				}
				lv_object_0_0=ruleObjectType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObjectRule());
					}
					add(
						$current,
						"object",
						lv_object_0_0,
						"org.xtext.example.mydsl.MyDsl.ObjectType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleConstraint
entryRuleConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstraintRule()); }
	iv_ruleConstraint=ruleConstraint
	{ $current=$iv_ruleConstraint.current; }
	EOF;

// Rule Constraint
ruleConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='constraint'
		{
			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstraintRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConstraintAccess().getMessagesMessageParserRuleCall_3_0());
				}
				lv_messages_3_0=ruleMessage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConstraintRule());
					}
					add(
						$current,
						"messages",
						lv_messages_3_0,
						"org.xtext.example.mydsl.MyDsl.Message");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleAlt
entryRuleAlt returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAltRule()); }
	iv_ruleAlt=ruleAlt
	{ $current=$iv_ruleAlt.current; }
	EOF;

// Rule Alt
ruleAlt returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='alt'
		{
			newLeafNode(otherlv_0, grammarAccess.getAltAccess().getAltKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAltAccess().getExpressionsExpressionParserRuleCall_1_0());
				}
				lv_expressions_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAltRule());
					}
					add(
						$current,
						"expressions",
						lv_expressions_1_0,
						"org.xtext.example.mydsl.MyDsl.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0());
		}
		(
			this_ID_1=RULE_ID
			{
				newLeafNode(this_ID_1, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1());
			}
		)?
		(
			otherlv_2='='
			{
				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getEqualsSignKeyword_2());
			}
		)?
		(
			otherlv_3='>'
			{
				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getGreaterThanSignKeyword_3());
			}
		)?
		(
			otherlv_4='<'
			{
				newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getLessThanSignKeyword_4());
			}
		)?
		(
			otherlv_5='>='
			{
				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getGreaterThanSignEqualsSignKeyword_5());
			}
		)?
		(
			otherlv_6='<='
			{
				newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getLessThanSignEqualsSignKeyword_6());
			}
		)?
		(
			this_ID_7=RULE_ID
			{
				newLeafNode(this_ID_7, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_7_0());
			}
			    |
			this_Number_8=RULE_NUMBER
			{
				newLeafNode(this_Number_8, grammarAccess.getExpressionAccess().getNumberTerminalRuleCall_7_1());
			}
		)?
		otherlv_9=')'
		{
			newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_8());
		}
		otherlv_10='{'
		{
			newLeafNode(otherlv_10, grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExpressionAccess().getMessagesMessageParserRuleCall_10_0());
				}
				lv_messages_11_0=ruleMessage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpressionRule());
					}
					add(
						$current,
						"messages",
						lv_messages_11_0,
						"org.xtext.example.mydsl.MyDsl.Message");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getExpressionAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRulePar
entryRulePar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParRule()); }
	iv_rulePar=rulePar
	{ $current=$iv_rulePar.current; }
	EOF;

// Rule Par
rulePar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='par'
		{
			newLeafNode(otherlv_0, grammarAccess.getParAccess().getParKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getParAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParAccess().getParexpressionParExpressionParserRuleCall_2_0());
				}
				lv_parexpression_2_0=ruleParExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParRule());
					}
					add(
						$current,
						"parexpression",
						lv_parexpression_2_0,
						"org.xtext.example.mydsl.MyDsl.ParExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getParAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleParExpression
entryRuleParExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParExpressionRule()); }
	iv_ruleParExpression=ruleParExpression
	{ $current=$iv_ruleParExpression.current; }
	EOF;

// Rule ParExpression
ruleParExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='case'
		{
			newLeafNode(otherlv_0, grammarAccess.getParExpressionAccess().getCaseKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getParExpressionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParExpressionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getParExpressionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParExpressionAccess().getMessagesMessageParserRuleCall_3_0());
				}
				lv_messages_3_0=ruleMessage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParExpressionRule());
					}
					add(
						$current,
						"messages",
						lv_messages_3_0,
						"org.xtext.example.mydsl.MyDsl.Message");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getParExpressionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

RULE_NUMBER : ('0'..'9')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
