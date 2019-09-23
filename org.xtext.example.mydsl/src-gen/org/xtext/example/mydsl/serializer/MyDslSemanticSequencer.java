/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Alt;
import org.xtext.example.mydsl.myDsl.AppearMessage;
import org.xtext.example.mydsl.myDsl.Attribute;
import org.xtext.example.mydsl.myDsl.ChangeType;
import org.xtext.example.mydsl.myDsl.Constraint;
import org.xtext.example.mydsl.myDsl.ContextChange;
import org.xtext.example.mydsl.myDsl.ContextFragment;
import org.xtext.example.mydsl.myDsl.ContextModel;
import org.xtext.example.mydsl.myDsl.DisappearMessage;
import org.xtext.example.mydsl.myDsl.DistanceMessage;
import org.xtext.example.mydsl.myDsl.Domain;
import org.xtext.example.mydsl.myDsl.Entity;
import org.xtext.example.mydsl.myDsl.Expression;
<<<<<<< HEAD
import org.xtext.example.mydsl.myDsl.Loop;
=======
import org.xtext.example.mydsl.myDsl.MatchMessage;
>>>>>>> [xText] Added new message type: contextMessage
import org.xtext.example.mydsl.myDsl.Message;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.ObjectType;
import org.xtext.example.mydsl.myDsl.Par;
import org.xtext.example.mydsl.myDsl.ParExpression;
import org.xtext.example.mydsl.myDsl.Relation;
import org.xtext.example.mydsl.myDsl.Scenario;
import org.xtext.example.mydsl.myDsl.ScenarioContent;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ALT:
				sequence_Alt(context, (Alt) semanticObject); 
				return; 
			case MyDslPackage.APPEAR_MESSAGE:
				if (rule == grammarAccess.getContextMessageContentRule()
						|| rule == grammarAccess.getChangeMessageRule()
						|| rule == grammarAccess.getAppearMessageRule()) {
					sequence_AppearMessage(context, (AppearMessage) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getContextMessageRule()) {
					sequence_AppearMessage_ContextMessage(context, (AppearMessage) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case MyDslPackage.CHANGE_TYPE:
				sequence_ChangeType(context, (ChangeType) semanticObject); 
				return; 
			case MyDslPackage.CONSTRAINT:
				sequence_Constraint(context, (Constraint) semanticObject); 
				return; 
			case MyDslPackage.CONTEXT_CHANGE:
				sequence_ContextChange(context, (ContextChange) semanticObject); 
				return; 
			case MyDslPackage.CONTEXT_FRAGMENT:
				sequence_ContextFragment(context, (ContextFragment) semanticObject); 
				return; 
			case MyDslPackage.CONTEXT_MODEL:
				sequence_ContextModel(context, (ContextModel) semanticObject); 
				return; 
			case MyDslPackage.DISAPPEAR_MESSAGE:
				if (rule == grammarAccess.getContextMessageRule()) {
					sequence_ContextMessage_DisappearMessage(context, (DisappearMessage) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getContextMessageContentRule()
						|| rule == grammarAccess.getChangeMessageRule()
						|| rule == grammarAccess.getDisappearMessageRule()) {
					sequence_DisappearMessage(context, (DisappearMessage) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.DISTANCE_MESSAGE:
				if (rule == grammarAccess.getContextMessageRule()) {
					sequence_ContextMessage_DistanceMessage(context, (DistanceMessage) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getContextMessageContentRule()
						|| rule == grammarAccess.getChangeMessageRule()
						|| rule == grammarAccess.getDistanceMessageRule()) {
					sequence_DistanceMessage(context, (DistanceMessage) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.DOMAIN:
				sequence_Domain(context, (Domain) semanticObject); 
				return; 
			case MyDslPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case MyDslPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
<<<<<<< HEAD
			case MyDslPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
=======
			case MyDslPackage.MATCH_MESSAGE:
				if (rule == grammarAccess.getContextMessageRule()) {
					sequence_ContextMessage_MatchMessage(context, (MatchMessage) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getContextMessageContentRule()
						|| rule == grammarAccess.getMatchMessageRule()) {
					sequence_MatchMessage(context, (MatchMessage) semanticObject); 
					return; 
				}
				else break;
>>>>>>> [xText] Added new message type: contextMessage
			case MyDslPackage.MESSAGE:
				sequence_Message(context, (Message) semanticObject); 
				return; 
			case MyDslPackage.OBJECT:
				sequence_Object(context, (org.xtext.example.mydsl.myDsl.Object) semanticObject); 
				return; 
			case MyDslPackage.OBJECT_TYPE:
				sequence_ObjectType(context, (ObjectType) semanticObject); 
				return; 
			case MyDslPackage.PAR:
				sequence_Par(context, (Par) semanticObject); 
				return; 
			case MyDslPackage.PAR_EXPRESSION:
				sequence_ParExpression(context, (ParExpression) semanticObject); 
				return; 
			case MyDslPackage.RELATION:
				sequence_Relation(context, (Relation) semanticObject); 
				return; 
			case MyDslPackage.SCENARIO:
				sequence_Scenario(context, (Scenario) semanticObject); 
				return; 
			case MyDslPackage.SCENARIO_CONTENT:
				sequence_ScenarioContent(context, (ScenarioContent) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Alt returns Alt
	 *
	 * Constraint:
	 *     expressions+=Expression+
	 */
	protected void sequence_Alt(ISerializationContext context, Alt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContextMessageContent returns AppearMessage
	 *     ChangeMessage returns AppearMessage
	 *     AppearMessage returns AppearMessage
	 *
	 * Constraint:
	 *     (name=ID entity=[Entity|ID]?)
	 */
	protected void sequence_AppearMessage(ISerializationContext context, AppearMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContextMessage returns AppearMessage
	 *
	 * Constraint:
	 *     (name=ID entity=[Entity|ID]? required?='required'? fail?='fail'? strict?='strict'?)
	 */
	protected void sequence_AppearMessage_ContextMessage(ISerializationContext context, AppearMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ATTRIBUTE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ChangeType returns ChangeType
	 *
	 * Constraint:
	 *     (entity=[Entity|ID] | entity=[Entity|ID] | attribute=[Attribute|ID])
	 */
	protected void sequence_ChangeType(ISerializationContext context, ChangeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns Constraint
	 *
	 * Constraint:
	 *     (name=ID messages+=Message*)
	 */
	protected void sequence_Constraint(ISerializationContext context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContextChange returns ContextChange
	 *
	 * Constraint:
	 *     (change+=ChangeType name=ID)
	 */
	protected void sequence_ContextChange(ISerializationContext context, ContextChange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContextFragment returns ContextFragment
	 *
	 * Constraint:
	 *     (name=ID entities+=Entity* relations+=Relation*)
	 */
	protected void sequence_ContextFragment(ISerializationContext context, ContextFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContextMessage returns DisappearMessage
	 *
	 * Constraint:
	 *     (name=ID entity=[Entity|ID]? required?='required'? fail?='fail'? strict?='strict'?)
	 */
	protected void sequence_ContextMessage_DisappearMessage(ISerializationContext context, DisappearMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContextMessage returns DistanceMessage
	 *
	 * Constraint:
	 *     (name=ID entity=[Entity|ID]? required?='required'? fail?='fail'? strict?='strict'?)
	 */
	protected void sequence_ContextMessage_DistanceMessage(ISerializationContext context, DistanceMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContextMessage returns MatchMessage
	 *
	 * Constraint:
	 *     (name=ID content=[ContextFragment|ID]? required?='required'? fail?='fail'? strict?='strict'?)
	 */
	protected void sequence_ContextMessage_MatchMessage(ISerializationContext context, MatchMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContextModel returns ContextModel
	 *
	 * Constraint:
	 *     (name=ID entities+=Entity* relations+=Relation*)
	 */
	protected void sequence_ContextModel(ISerializationContext context, ContextModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContextMessageContent returns DisappearMessage
	 *     ChangeMessage returns DisappearMessage
	 *     DisappearMessage returns DisappearMessage
	 *
	 * Constraint:
	 *     (name=ID entity=[Entity|ID]?)
	 */
	protected void sequence_DisappearMessage(ISerializationContext context, DisappearMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContextMessageContent returns DistanceMessage
	 *     ChangeMessage returns DistanceMessage
	 *     DistanceMessage returns DistanceMessage
	 *
	 * Constraint:
	 *     (name=ID entity=[Entity|ID]?)
	 */
	protected void sequence_DistanceMessage(ISerializationContext context, DistanceMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Domain returns Domain
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         contextmodels+=ContextModel* 
	 *         contextfragments+=ContextFragment* 
	 *         entities+=Entity* 
	 *         contextchanges+=ContextChange* 
	 *         objects+=Object* 
	 *         constraints+=Constraint* 
	 *         scenarios+=Scenario*
	 *     )
	 */
	protected void sequence_Domain(ISerializationContext context, Domain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID attributes+=Attribute*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *
	 * Constraint:
	 *     messages+=Message+
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
<<<<<<< HEAD
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     (min=Number max=Number messages+=Message*)
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
=======
	 *     ContextMessageContent returns MatchMessage
	 *     MatchMessage returns MatchMessage
	 *
	 * Constraint:
	 *     (name=ID content=[ContextFragment|ID]?)
	 */
	protected void sequence_MatchMessage(ISerializationContext context, MatchMessage semanticObject) {
>>>>>>> [xText] Added new message type: contextMessage
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Message returns Message
	 *
	 * Constraint:
	 *     (
	 *         name=Name 
	 *         required?='required'? 
	 *         fail?='fail'? 
	 *         strict?='strict'? 
	 *         sender=[Object|ID] 
	 *         receiver=[Object|ID] 
	 *         past?='past'? 
	 *         future?='future'? 
	 *         constraint?='constraint'? 
	 *         c=[Constraint|ID]?
	 *     )
	 */
	protected void sequence_Message(ISerializationContext context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ObjectType returns ObjectType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ObjectType(ISerializationContext context, ObjectType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.OBJECT_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.OBJECT_TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObjectTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Object returns Object
	 *
	 * Constraint:
	 *     (object+=ObjectType name=ID)
	 */
	protected void sequence_Object(ISerializationContext context, org.xtext.example.mydsl.myDsl.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParExpression returns ParExpression
	 *
	 * Constraint:
	 *     (name=ID messages+=Message*)
	 */
	protected void sequence_ParExpression(ISerializationContext context, ParExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Par returns Par
	 *
	 * Constraint:
	 *     parexpression+=ParExpression+
	 */
	protected void sequence_Par(ISerializationContext context, Par semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relation returns Relation
	 *
	 * Constraint:
	 *     (name=ID sender=[Entity|ID] receiver=[Entity|ID] attributes+=Attribute*)
	 */
	protected void sequence_Relation(ISerializationContext context, Relation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ScenarioContent returns ScenarioContent
	 *
	 * Constraint:
<<<<<<< HEAD
	 *     (alt+=Alt | message+=Message | par+=Par | loop+=Loop)
=======
	 *     (alt+=Alt | message+=Message | par+=Par | contextmessage+=ContextMessage)
>>>>>>> [xText] Added new message type: contextMessage
	 */
	protected void sequence_ScenarioContent(ISerializationContext context, ScenarioContent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scenario returns Scenario
	 *
	 * Constraint:
	 *     (name=ID scenariocontents+=ScenarioContent*)
	 */
	protected void sequence_Scenario(ISerializationContext context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
