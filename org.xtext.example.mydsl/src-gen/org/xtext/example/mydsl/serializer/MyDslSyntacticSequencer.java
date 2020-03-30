/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Attribute_EqualsSignKeyword_6_q;
	protected AbstractElementAlias match_ChangeToMessage_CommaKeyword_3_q;
	protected AbstractElementAlias match_ChangeToRelation_CommaKeyword_3_q;
	protected AbstractElementAlias match_ClockConstraintExpression_LeftParenthesisKeyword_0_1_q;
	protected AbstractElementAlias match_ClockConstraintExpression_RightParenthesisKeyword_0_3_q;
	protected AbstractElementAlias match_Domain_LeftCurlyBracketKeyword_2_q;
	protected AbstractElementAlias match_Domain_RightCurlyBracketKeyword_11_q;
	protected AbstractElementAlias match_MatchMessage_CommaKeyword_3_q;
	protected AbstractElementAlias match_Message_CommaKeyword_15_q;
	protected AbstractElementAlias match_Message_CommaKeyword_17_q;
	protected AbstractElementAlias match_Message_LeftCurlyBracketKeyword_13_q;
	protected AbstractElementAlias match_Message_LeftCurlyBracketKeyword_21_q;
	protected AbstractElementAlias match_Message_RightCurlyBracketKeyword_19_q;
	protected AbstractElementAlias match_Message_RightCurlyBracketKeyword_23_q;
	protected AbstractElementAlias match_Parameter_EqualsSignKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_Attribute_EqualsSignKeyword_6_q = new TokenAlias(false, true, grammarAccess.getAttributeAccess().getEqualsSignKeyword_6());
		match_ChangeToMessage_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getChangeToMessageAccess().getCommaKeyword_3());
		match_ChangeToRelation_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getChangeToRelationAccess().getCommaKeyword_3());
		match_ClockConstraintExpression_LeftParenthesisKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getClockConstraintExpressionAccess().getLeftParenthesisKeyword_0_1());
		match_ClockConstraintExpression_RightParenthesisKeyword_0_3_q = new TokenAlias(false, true, grammarAccess.getClockConstraintExpressionAccess().getRightParenthesisKeyword_0_3());
		match_Domain_LeftCurlyBracketKeyword_2_q = new TokenAlias(false, true, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_2());
		match_Domain_RightCurlyBracketKeyword_11_q = new TokenAlias(false, true, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_11());
		match_MatchMessage_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getMatchMessageAccess().getCommaKeyword_3());
		match_Message_CommaKeyword_15_q = new TokenAlias(false, true, grammarAccess.getMessageAccess().getCommaKeyword_15());
		match_Message_CommaKeyword_17_q = new TokenAlias(false, true, grammarAccess.getMessageAccess().getCommaKeyword_17());
		match_Message_LeftCurlyBracketKeyword_13_q = new TokenAlias(false, true, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_13());
		match_Message_LeftCurlyBracketKeyword_21_q = new TokenAlias(false, true, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_21());
		match_Message_RightCurlyBracketKeyword_19_q = new TokenAlias(false, true, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_19());
		match_Message_RightCurlyBracketKeyword_23_q = new TokenAlias(false, true, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_23());
		match_Parameter_EqualsSignKeyword_2_q = new TokenAlias(false, true, grammarAccess.getParameterAccess().getEqualsSignKeyword_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Attribute_EqualsSignKeyword_6_q.equals(syntax))
				emit_Attribute_EqualsSignKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ChangeToMessage_CommaKeyword_3_q.equals(syntax))
				emit_ChangeToMessage_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ChangeToRelation_CommaKeyword_3_q.equals(syntax))
				emit_ChangeToRelation_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ClockConstraintExpression_LeftParenthesisKeyword_0_1_q.equals(syntax))
				emit_ClockConstraintExpression_LeftParenthesisKeyword_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ClockConstraintExpression_RightParenthesisKeyword_0_3_q.equals(syntax))
				emit_ClockConstraintExpression_RightParenthesisKeyword_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Domain_LeftCurlyBracketKeyword_2_q.equals(syntax))
				emit_Domain_LeftCurlyBracketKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Domain_RightCurlyBracketKeyword_11_q.equals(syntax))
				emit_Domain_RightCurlyBracketKeyword_11_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MatchMessage_CommaKeyword_3_q.equals(syntax))
				emit_MatchMessage_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Message_CommaKeyword_15_q.equals(syntax))
				emit_Message_CommaKeyword_15_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Message_CommaKeyword_17_q.equals(syntax))
				emit_Message_CommaKeyword_17_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Message_LeftCurlyBracketKeyword_13_q.equals(syntax))
				emit_Message_LeftCurlyBracketKeyword_13_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Message_LeftCurlyBracketKeyword_21_q.equals(syntax))
				emit_Message_LeftCurlyBracketKeyword_21_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Message_RightCurlyBracketKeyword_19_q.equals(syntax))
				emit_Message_RightCurlyBracketKeyword_19_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Message_RightCurlyBracketKeyword_23_q.equals(syntax))
				emit_Message_RightCurlyBracketKeyword_23_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Parameter_EqualsSignKeyword_2_q.equals(syntax))
				emit_Parameter_EqualsSignKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '='?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) ';' (rule end)
	 *     name=ID (ambiguity) value=AttributeValue
	 */
	protected void emit_Attribute_EqualsSignKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'changeTo' '(' (ambiguity) ')' (rule start)
	 *     (rule start) 'changeTo' '(' (ambiguity) changevalue=AttributeValue
	 *     attribute=[Attribute|ID] (ambiguity) ')' (rule end)
	 *     attribute=[Attribute|ID] (ambiguity) changevalue=AttributeValue
	 */
	protected void emit_ChangeToMessage_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'relationChangeTo' '(' (ambiguity) ')' (rule start)
	 *     (rule start) 'relationChangeTo' '(' (ambiguity) changevalue=AttributeValue
	 *     attribute=[Attribute|ID] (ambiguity) ')' (rule end)
	 *     attribute=[Attribute|ID] (ambiguity) changevalue=AttributeValue
	 */
	protected void emit_ChangeToRelation_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) lclockconstraint=ClockConstraint
	 *     not?='not' (ambiguity) lclockconstraint=ClockConstraint
	 */
	protected void emit_ClockConstraintExpression_LeftParenthesisKeyword_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ')'?
	 *
	 * This ambiguous syntax occurs at:
	 *     lclockconstraint=ClockConstraint (ambiguity) (rule end)
	 */
	protected void emit_ClockConstraintExpression_RightParenthesisKeyword_0_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '{'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '}'? (rule start)
	 *     (rule start) (ambiguity) clocks+=Clock
	 *     (rule start) (ambiguity) constraints+=Constraint
	 *     (rule start) (ambiguity) contextfragments+=ContextFragment
	 *     (rule start) (ambiguity) contextmodels+=ContextModel
	 *     (rule start) (ambiguity) includes+=Include
	 *     (rule start) (ambiguity) objects+=Object
	 *     (rule start) (ambiguity) parameters+=Parameter
	 *     (rule start) (ambiguity) scenarios+=Scenario
	 *     name=ID (ambiguity) '}'? (rule end)
	 *     name=ID (ambiguity) clocks+=Clock
	 *     name=ID (ambiguity) constraints+=Constraint
	 *     name=ID (ambiguity) contextfragments+=ContextFragment
	 *     name=ID (ambiguity) contextmodels+=ContextModel
	 *     name=ID (ambiguity) includes+=Include
	 *     name=ID (ambiguity) objects+=Object
	 *     name=ID (ambiguity) parameters+=Parameter
	 *     name=ID (ambiguity) scenarios+=Scenario
	 *     specification='specification' (ambiguity) '}'? (rule end)
	 *     specification='specification' (ambiguity) clocks+=Clock
	 *     specification='specification' (ambiguity) constraints+=Constraint
	 *     specification='specification' (ambiguity) contextfragments+=ContextFragment
	 *     specification='specification' (ambiguity) contextmodels+=ContextModel
	 *     specification='specification' (ambiguity) includes+=Include
	 *     specification='specification' (ambiguity) objects+=Object
	 *     specification='specification' (ambiguity) parameters+=Parameter
	 *     specification='specification' (ambiguity) scenarios+=Scenario
	 */
	protected void emit_Domain_LeftCurlyBracketKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '}'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '{' (ambiguity) (rule start)
	 *     (rule start) '{'? (ambiguity) (rule start)
	 *     clocks+=Clock (ambiguity) (rule end)
	 *     constraints+=Constraint (ambiguity) (rule end)
	 *     contextfragments+=ContextFragment (ambiguity) (rule end)
	 *     contextmodels+=ContextModel (ambiguity) (rule end)
	 *     includes+=Include (ambiguity) (rule end)
	 *     name=ID '{'? (ambiguity) (rule end)
	 *     objects+=Object (ambiguity) (rule end)
	 *     parameters+=Parameter (ambiguity) (rule end)
	 *     scenarios+=Scenario (ambiguity) (rule end)
	 *     specification='specification' '{'? (ambiguity) (rule end)
	 */
	protected void emit_Domain_RightCurlyBracketKeyword_11_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'match' '(' (ambiguity) ')' (rule start)
	 *     (rule start) 'match' '(' (ambiguity) content=[ContextFragment|ID]
	 *     context=[ContextModel|ID] (ambiguity) ')' (rule end)
	 *     context=[ContextModel|ID] (ambiguity) content=[ContextFragment|ID]
	 */
	protected void emit_MatchMessage_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     c=[Constraint|ID] (ambiguity) ','? '}'? '{'? '}'? ';' (rule end)
	 *     c=[Constraint|ID] (ambiguity) ','? '}'? '{'? '}'? resetclock=ResetClock
	 *     c=[Constraint|ID] (ambiguity) ','? '}'? '{'? cConstraint=ClockConstraintExpression
	 *     c=[Constraint|ID] (ambiguity) ','? '}'? clockconstraint?='clockConstraint'
	 *     c=[Constraint|ID] (ambiguity) ','? resetinconstraint=ResetClock
	 *     c=[Constraint|ID] (ambiguity) constraintexp=ClockConstraintExpression
	 *     future?='futureConstraint' '{'? (ambiguity) ','? '}'? '{'? '}'? ';' (rule end)
	 *     future?='futureConstraint' '{'? (ambiguity) ','? '}'? '{'? '}'? resetclock=ResetClock
	 *     future?='futureConstraint' '{'? (ambiguity) ','? '}'? '{'? cConstraint=ClockConstraintExpression
	 *     future?='futureConstraint' '{'? (ambiguity) ','? '}'? clockconstraint?='clockConstraint'
	 *     future?='futureConstraint' '{'? (ambiguity) ','? resetinconstraint=ResetClock
	 *     future?='futureConstraint' '{'? (ambiguity) constraintexp=ClockConstraintExpression
	 *     past?='pastConstraint' '{'? (ambiguity) ','? '}'? '{'? '}'? ';' (rule end)
	 *     past?='pastConstraint' '{'? (ambiguity) ','? '}'? '{'? '}'? resetclock=ResetClock
	 *     past?='pastConstraint' '{'? (ambiguity) ','? '}'? '{'? cConstraint=ClockConstraintExpression
	 *     past?='pastConstraint' '{'? (ambiguity) ','? '}'? clockconstraint?='clockConstraint'
	 *     past?='pastConstraint' '{'? (ambiguity) ','? resetinconstraint=ResetClock
	 *     past?='pastConstraint' '{'? (ambiguity) constraintexp=ClockConstraintExpression
	 *     receiver=[Object|ID] '{'? (ambiguity) ','? '}'? '{'? '}'? ';' (rule end)
	 *     receiver=[Object|ID] '{'? (ambiguity) ','? '}'? '{'? '}'? resetclock=ResetClock
	 *     receiver=[Object|ID] '{'? (ambiguity) ','? '}'? '{'? cConstraint=ClockConstraintExpression
	 *     receiver=[Object|ID] '{'? (ambiguity) ','? '}'? clockconstraint?='clockConstraint'
	 *     receiver=[Object|ID] '{'? (ambiguity) ','? resetinconstraint=ResetClock
	 *     receiver=[Object|ID] '{'? (ambiguity) constraintexp=ClockConstraintExpression
	 */
	protected void emit_Message_CommaKeyword_15_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     c=[Constraint|ID] ','? (ambiguity) '}'? '{'? '}'? ';' (rule end)
	 *     c=[Constraint|ID] ','? (ambiguity) '}'? '{'? '}'? resetclock=ResetClock
	 *     c=[Constraint|ID] ','? (ambiguity) '}'? '{'? cConstraint=ClockConstraintExpression
	 *     c=[Constraint|ID] ','? (ambiguity) '}'? clockconstraint?='clockConstraint'
	 *     c=[Constraint|ID] ','? (ambiguity) resetinconstraint=ResetClock
	 *     constraintexp=ClockConstraintExpression (ambiguity) '}'? '{'? '}'? ';' (rule end)
	 *     constraintexp=ClockConstraintExpression (ambiguity) '}'? '{'? '}'? resetclock=ResetClock
	 *     constraintexp=ClockConstraintExpression (ambiguity) '}'? '{'? cConstraint=ClockConstraintExpression
	 *     constraintexp=ClockConstraintExpression (ambiguity) '}'? clockconstraint?='clockConstraint'
	 *     constraintexp=ClockConstraintExpression (ambiguity) resetinconstraint=ResetClock
	 *     future?='futureConstraint' '{'? ','? (ambiguity) '}'? '{'? '}'? ';' (rule end)
	 *     future?='futureConstraint' '{'? ','? (ambiguity) '}'? '{'? '}'? resetclock=ResetClock
	 *     future?='futureConstraint' '{'? ','? (ambiguity) '}'? '{'? cConstraint=ClockConstraintExpression
	 *     future?='futureConstraint' '{'? ','? (ambiguity) '}'? clockconstraint?='clockConstraint'
	 *     future?='futureConstraint' '{'? ','? (ambiguity) resetinconstraint=ResetClock
	 *     past?='pastConstraint' '{'? ','? (ambiguity) '}'? '{'? '}'? ';' (rule end)
	 *     past?='pastConstraint' '{'? ','? (ambiguity) '}'? '{'? '}'? resetclock=ResetClock
	 *     past?='pastConstraint' '{'? ','? (ambiguity) '}'? '{'? cConstraint=ClockConstraintExpression
	 *     past?='pastConstraint' '{'? ','? (ambiguity) '}'? clockconstraint?='clockConstraint'
	 *     past?='pastConstraint' '{'? ','? (ambiguity) resetinconstraint=ResetClock
	 *     receiver=[Object|ID] '{'? ','? (ambiguity) '}'? '{'? '}'? ';' (rule end)
	 *     receiver=[Object|ID] '{'? ','? (ambiguity) '}'? '{'? '}'? resetclock=ResetClock
	 *     receiver=[Object|ID] '{'? ','? (ambiguity) '}'? '{'? cConstraint=ClockConstraintExpression
	 *     receiver=[Object|ID] '{'? ','? (ambiguity) '}'? clockconstraint?='clockConstraint'
	 *     receiver=[Object|ID] '{'? ','? (ambiguity) resetinconstraint=ResetClock
	 */
	protected void emit_Message_CommaKeyword_17_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '{'?
	 *
	 * This ambiguous syntax occurs at:
	 *     future?='futureConstraint' (ambiguity) ','? ','? '}'? '{'? '}'? ';' (rule end)
	 *     future?='futureConstraint' (ambiguity) ','? ','? '}'? '{'? '}'? resetclock=ResetClock
	 *     future?='futureConstraint' (ambiguity) ','? ','? '}'? '{'? cConstraint=ClockConstraintExpression
	 *     future?='futureConstraint' (ambiguity) ','? ','? '}'? clockconstraint?='clockConstraint'
	 *     future?='futureConstraint' (ambiguity) ','? ','? resetinconstraint=ResetClock
	 *     future?='futureConstraint' (ambiguity) ','? constraintexp=ClockConstraintExpression
	 *     future?='futureConstraint' (ambiguity) c=[Constraint|ID]
	 *     past?='pastConstraint' (ambiguity) ','? ','? '}'? '{'? '}'? ';' (rule end)
	 *     past?='pastConstraint' (ambiguity) ','? ','? '}'? '{'? '}'? resetclock=ResetClock
	 *     past?='pastConstraint' (ambiguity) ','? ','? '}'? '{'? cConstraint=ClockConstraintExpression
	 *     past?='pastConstraint' (ambiguity) ','? ','? '}'? clockconstraint?='clockConstraint'
	 *     past?='pastConstraint' (ambiguity) ','? ','? resetinconstraint=ResetClock
	 *     past?='pastConstraint' (ambiguity) ','? constraintexp=ClockConstraintExpression
	 *     past?='pastConstraint' (ambiguity) c=[Constraint|ID]
	 *     receiver=[Object|ID] (ambiguity) ','? ','? '}'? '{'? '}'? ';' (rule end)
	 *     receiver=[Object|ID] (ambiguity) ','? ','? '}'? '{'? '}'? resetclock=ResetClock
	 *     receiver=[Object|ID] (ambiguity) ','? ','? '}'? '{'? cConstraint=ClockConstraintExpression
	 *     receiver=[Object|ID] (ambiguity) ','? ','? '}'? clockconstraint?='clockConstraint'
	 *     receiver=[Object|ID] (ambiguity) ','? ','? resetinconstraint=ResetClock
	 *     receiver=[Object|ID] (ambiguity) ','? constraintexp=ClockConstraintExpression
	 *     receiver=[Object|ID] (ambiguity) c=[Constraint|ID]
	 */
	protected void emit_Message_LeftCurlyBracketKeyword_13_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '{'?
	 *
	 * This ambiguous syntax occurs at:
	 *     c=[Constraint|ID] ','? ','? '}'? (ambiguity) '}'? ';' (rule end)
	 *     c=[Constraint|ID] ','? ','? '}'? (ambiguity) '}'? resetclock=ResetClock
	 *     c=[Constraint|ID] ','? ','? '}'? (ambiguity) cConstraint=ClockConstraintExpression
	 *     clockconstraint?='clockConstraint' (ambiguity) '}'? ';' (rule end)
	 *     clockconstraint?='clockConstraint' (ambiguity) '}'? resetclock=ResetClock
	 *     clockconstraint?='clockConstraint' (ambiguity) cConstraint=ClockConstraintExpression
	 *     constraintexp=ClockConstraintExpression ','? '}'? (ambiguity) '}'? ';' (rule end)
	 *     constraintexp=ClockConstraintExpression ','? '}'? (ambiguity) '}'? resetclock=ResetClock
	 *     constraintexp=ClockConstraintExpression ','? '}'? (ambiguity) cConstraint=ClockConstraintExpression
	 *     future?='futureConstraint' '{'? ','? ','? '}'? (ambiguity) '}'? ';' (rule end)
	 *     future?='futureConstraint' '{'? ','? ','? '}'? (ambiguity) '}'? resetclock=ResetClock
	 *     future?='futureConstraint' '{'? ','? ','? '}'? (ambiguity) cConstraint=ClockConstraintExpression
	 *     past?='pastConstraint' '{'? ','? ','? '}'? (ambiguity) '}'? ';' (rule end)
	 *     past?='pastConstraint' '{'? ','? ','? '}'? (ambiguity) '}'? resetclock=ResetClock
	 *     past?='pastConstraint' '{'? ','? ','? '}'? (ambiguity) cConstraint=ClockConstraintExpression
	 *     receiver=[Object|ID] '{'? ','? ','? '}'? (ambiguity) '}'? ';' (rule end)
	 *     receiver=[Object|ID] '{'? ','? ','? '}'? (ambiguity) '}'? resetclock=ResetClock
	 *     receiver=[Object|ID] '{'? ','? ','? '}'? (ambiguity) cConstraint=ClockConstraintExpression
	 *     resetinconstraint=ResetClock '}'? (ambiguity) '}'? ';' (rule end)
	 *     resetinconstraint=ResetClock '}'? (ambiguity) '}'? resetclock=ResetClock
	 *     resetinconstraint=ResetClock '}'? (ambiguity) cConstraint=ClockConstraintExpression
	 */
	protected void emit_Message_LeftCurlyBracketKeyword_21_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '}'?
	 *
	 * This ambiguous syntax occurs at:
	 *     c=[Constraint|ID] ','? ','? (ambiguity) '{'? '}'? ';' (rule end)
	 *     c=[Constraint|ID] ','? ','? (ambiguity) '{'? '}'? resetclock=ResetClock
	 *     c=[Constraint|ID] ','? ','? (ambiguity) '{'? cConstraint=ClockConstraintExpression
	 *     c=[Constraint|ID] ','? ','? (ambiguity) clockconstraint?='clockConstraint'
	 *     constraintexp=ClockConstraintExpression ','? (ambiguity) '{'? '}'? ';' (rule end)
	 *     constraintexp=ClockConstraintExpression ','? (ambiguity) '{'? '}'? resetclock=ResetClock
	 *     constraintexp=ClockConstraintExpression ','? (ambiguity) '{'? cConstraint=ClockConstraintExpression
	 *     constraintexp=ClockConstraintExpression ','? (ambiguity) clockconstraint?='clockConstraint'
	 *     future?='futureConstraint' '{'? ','? ','? (ambiguity) '{'? '}'? ';' (rule end)
	 *     future?='futureConstraint' '{'? ','? ','? (ambiguity) '{'? '}'? resetclock=ResetClock
	 *     future?='futureConstraint' '{'? ','? ','? (ambiguity) '{'? cConstraint=ClockConstraintExpression
	 *     future?='futureConstraint' '{'? ','? ','? (ambiguity) clockconstraint?='clockConstraint'
	 *     past?='pastConstraint' '{'? ','? ','? (ambiguity) '{'? '}'? ';' (rule end)
	 *     past?='pastConstraint' '{'? ','? ','? (ambiguity) '{'? '}'? resetclock=ResetClock
	 *     past?='pastConstraint' '{'? ','? ','? (ambiguity) '{'? cConstraint=ClockConstraintExpression
	 *     past?='pastConstraint' '{'? ','? ','? (ambiguity) clockconstraint?='clockConstraint'
	 *     receiver=[Object|ID] '{'? ','? ','? (ambiguity) '{'? '}'? ';' (rule end)
	 *     receiver=[Object|ID] '{'? ','? ','? (ambiguity) '{'? '}'? resetclock=ResetClock
	 *     receiver=[Object|ID] '{'? ','? ','? (ambiguity) '{'? cConstraint=ClockConstraintExpression
	 *     receiver=[Object|ID] '{'? ','? ','? (ambiguity) clockconstraint?='clockConstraint'
	 *     resetinconstraint=ResetClock (ambiguity) '{'? '}'? ';' (rule end)
	 *     resetinconstraint=ResetClock (ambiguity) '{'? '}'? resetclock=ResetClock
	 *     resetinconstraint=ResetClock (ambiguity) '{'? cConstraint=ClockConstraintExpression
	 *     resetinconstraint=ResetClock (ambiguity) clockconstraint?='clockConstraint'
	 */
	protected void emit_Message_RightCurlyBracketKeyword_19_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '}'?
	 *
	 * This ambiguous syntax occurs at:
	 *     c=[Constraint|ID] ','? ','? '}'? '{'? (ambiguity) ';' (rule end)
	 *     c=[Constraint|ID] ','? ','? '}'? '{'? (ambiguity) resetclock=ResetClock
	 *     cConstraint=ClockConstraintExpression (ambiguity) ';' (rule end)
	 *     cConstraint=ClockConstraintExpression (ambiguity) resetclock=ResetClock
	 *     clockconstraint?='clockConstraint' '{'? (ambiguity) ';' (rule end)
	 *     clockconstraint?='clockConstraint' '{'? (ambiguity) resetclock=ResetClock
	 *     constraintexp=ClockConstraintExpression ','? '}'? '{'? (ambiguity) ';' (rule end)
	 *     constraintexp=ClockConstraintExpression ','? '}'? '{'? (ambiguity) resetclock=ResetClock
	 *     future?='futureConstraint' '{'? ','? ','? '}'? '{'? (ambiguity) ';' (rule end)
	 *     future?='futureConstraint' '{'? ','? ','? '}'? '{'? (ambiguity) resetclock=ResetClock
	 *     past?='pastConstraint' '{'? ','? ','? '}'? '{'? (ambiguity) ';' (rule end)
	 *     past?='pastConstraint' '{'? ','? ','? '}'? '{'? (ambiguity) resetclock=ResetClock
	 *     receiver=[Object|ID] '{'? ','? ','? '}'? '{'? (ambiguity) ';' (rule end)
	 *     receiver=[Object|ID] '{'? ','? ','? '}'? '{'? (ambiguity) resetclock=ResetClock
	 *     resetinconstraint=ResetClock '}'? '{'? (ambiguity) ';' (rule end)
	 *     resetinconstraint=ResetClock '}'? '{'? (ambiguity) resetclock=ResetClock
	 */
	protected void emit_Message_RightCurlyBracketKeyword_23_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '='?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) ';' (rule end)
	 *     name=ID (ambiguity) value=AttributeValue
	 */
	protected void emit_Parameter_EqualsSignKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
