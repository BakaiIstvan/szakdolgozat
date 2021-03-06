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
import org.xtext.example.mydsl.myDsl.ChangeMessage;
import org.xtext.example.mydsl.myDsl.ChangeToMessage;
import org.xtext.example.mydsl.myDsl.ChangeToRelation;
import org.xtext.example.mydsl.myDsl.Constraint;
import org.xtext.example.mydsl.myDsl.ContextFragment;
import org.xtext.example.mydsl.myDsl.ContextMessage;
import org.xtext.example.mydsl.myDsl.ContextMessageContent;
import org.xtext.example.mydsl.myDsl.ContextModel;
import org.xtext.example.mydsl.myDsl.DisappearMessage;
import org.xtext.example.mydsl.myDsl.Domain;
import org.xtext.example.mydsl.myDsl.Entity;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.FEntity;
import org.xtext.example.mydsl.myDsl.FRelation;
import org.xtext.example.mydsl.myDsl.FragmentAttribute;
import org.xtext.example.mydsl.myDsl.Include;
import org.xtext.example.mydsl.myDsl.Loop;
import org.xtext.example.mydsl.myDsl.MatchMessage;
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
				sequence_AppearMessage(context, (AppearMessage) semanticObject); 
				return; 
			case MyDslPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case MyDslPackage.CHANGE_MESSAGE:
				sequence_ChangeMessage(context, (ChangeMessage) semanticObject); 
				return; 
			case MyDslPackage.CHANGE_TO_MESSAGE:
				sequence_ChangeToMessage(context, (ChangeToMessage) semanticObject); 
				return; 
			case MyDslPackage.CHANGE_TO_RELATION:
				sequence_ChangeToRelation(context, (ChangeToRelation) semanticObject); 
				return; 
			case MyDslPackage.CONSTRAINT:
				sequence_Constraint(context, (Constraint) semanticObject); 
				return; 
			case MyDslPackage.CONTEXT_FRAGMENT:
				sequence_ContextFragment(context, (ContextFragment) semanticObject); 
				return; 
			case MyDslPackage.CONTEXT_MESSAGE:
				sequence_ContextMessage(context, (ContextMessage) semanticObject); 
				return; 
			case MyDslPackage.CONTEXT_MESSAGE_CONTENT:
				sequence_ContextMessageContent(context, (ContextMessageContent) semanticObject); 
				return; 
			case MyDslPackage.CONTEXT_MODEL:
				sequence_ContextModel(context, (ContextModel) semanticObject); 
				return; 
			case MyDslPackage.DISAPPEAR_MESSAGE:
				sequence_DisappearMessage(context, (DisappearMessage) semanticObject); 
				return; 
			case MyDslPackage.DOMAIN:
				sequence_Domain(context, (Domain) semanticObject); 
				return; 
			case MyDslPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case MyDslPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case MyDslPackage.FENTITY:
				sequence_FEntity(context, (FEntity) semanticObject); 
				return; 
			case MyDslPackage.FRELATION:
				sequence_FRelation(context, (FRelation) semanticObject); 
				return; 
			case MyDslPackage.FRAGMENT_ATTRIBUTE:
				sequence_FragmentAttribute(context, (FragmentAttribute) semanticObject); 
				return; 
			case MyDslPackage.INCLUDE:
				sequence_Include(context, (Include) semanticObject); 
				return; 
			case MyDslPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			case MyDslPackage.MATCH_MESSAGE:
				sequence_MatchMessage(context, (MatchMessage) semanticObject); 
				return; 
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
	 *     AppearMessage returns AppearMessage
	 *
	 * Constraint:
	 *     (context=[ContextModel|ID] entity=[Entity|ID])
	 */
	protected void sequence_AppearMessage(ISerializationContext context, AppearMessage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.APPEAR_MESSAGE__CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.APPEAR_MESSAGE__CONTEXT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.APPEAR_MESSAGE__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.APPEAR_MESSAGE__ENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAppearMessageAccess().getContextContextModelIDTerminalRuleCall_2_0_0_1(), semanticObject.eGet(MyDslPackage.Literals.APPEAR_MESSAGE__CONTEXT, false));
		feeder.accept(grammarAccess.getAppearMessageAccess().getEntityEntityIDTerminalRuleCall_2_2_0_1(), semanticObject.eGet(MyDslPackage.Literals.APPEAR_MESSAGE__ENTITY, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (
	 *         int?='int'? 
	 *         float?='float'? 
	 *         string?='string'? 
	 *         boolean?='boolean'? 
	 *         name=ID 
	 *         value=AttributeValue?
	 *     )
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChangeMessage returns ChangeMessage
	 *
	 * Constraint:
	 *     (disappear+=DisappearMessage | appear+=AppearMessage | changeto+=ChangeToMessage | changetor+=ChangeToRelation)
	 */
	protected void sequence_ChangeMessage(ISerializationContext context, ChangeMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChangeToMessage returns ChangeToMessage
	 *
	 * Constraint:
	 *     ((context=[ContextModel|ID] entity=[Entity|ID] attribute=[Attribute|ID])? changevalue=AttributeValue?)
	 */
	protected void sequence_ChangeToMessage(ISerializationContext context, ChangeToMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChangeToRelation returns ChangeToRelation
	 *
	 * Constraint:
	 *     ((context=[ContextModel|ID] relation=[Relation|ID] attribute=[Attribute|ID])? changevalue=AttributeValue?)
	 */
	protected void sequence_ChangeToRelation(ISerializationContext context, ChangeToRelation semanticObject) {
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
	 *     ContextFragment returns ContextFragment
	 *
	 * Constraint:
	 *     (name=ID entities+=FEntity* relations+=FRelation*)
	 */
	protected void sequence_ContextFragment(ISerializationContext context, ContextFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContextMessageContent returns ContextMessageContent
	 *
	 * Constraint:
	 *     (match+=MatchMessage | change+=ChangeMessage)
	 */
	protected void sequence_ContextMessageContent(ISerializationContext context, ContextMessageContent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContextMessage returns ContextMessage
	 *
	 * Constraint:
	 *     (content+=ContextMessageContent required?='required'? fail?='fail'? strict?='strict'?)
	 */
	protected void sequence_ContextMessage(ISerializationContext context, ContextMessage semanticObject) {
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
	 *     DisappearMessage returns DisappearMessage
	 *
	 * Constraint:
	 *     (context=[ContextModel|ID] entity=[Entity|ID])
	 */
	protected void sequence_DisappearMessage(ISerializationContext context, DisappearMessage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DISAPPEAR_MESSAGE__CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DISAPPEAR_MESSAGE__CONTEXT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DISAPPEAR_MESSAGE__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DISAPPEAR_MESSAGE__ENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDisappearMessageAccess().getContextContextModelIDTerminalRuleCall_2_0_0_1(), semanticObject.eGet(MyDslPackage.Literals.DISAPPEAR_MESSAGE__CONTEXT, false));
		feeder.accept(grammarAccess.getDisappearMessageAccess().getEntityEntityIDTerminalRuleCall_2_2_0_1(), semanticObject.eGet(MyDslPackage.Literals.DISAPPEAR_MESSAGE__ENTITY, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Domain returns Domain
	 *
	 * Constraint:
	 *     (
	 *         specification='specification'? 
	 *         name=ID? 
	 *         includes+=Include* 
	 *         contextmodels+=ContextModel* 
	 *         contextfragments+=ContextFragment* 
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
	 *     FEntity returns FEntity
	 *
	 * Constraint:
	 *     (name=ID attributes+=FragmentAttribute*)
	 */
	protected void sequence_FEntity(ISerializationContext context, FEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FRelation returns FRelation
	 *
	 * Constraint:
	 *     (name=ID sender=[FEntity|ID] receiver=[FEntity|ID] attributes+=FragmentAttribute*)
	 */
	protected void sequence_FRelation(ISerializationContext context, FRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FragmentAttribute returns FragmentAttribute
	 *
	 * Constraint:
	 *     (
	 *         int?='int'? 
	 *         float?='float'? 
	 *         string?='string'? 
	 *         boolean?='boolean'? 
	 *         name=ID 
	 *         greater?='>'? 
	 *         smaller?='<'? 
	 *         greaterequals?='>='? 
	 *         smallerequals?='<='? 
	 *         equals?='=='? 
	 *         notequals?='!='? 
	 *         value=AttributeValue
	 *     )
	 */
	protected void sequence_FragmentAttribute(ISerializationContext context, FragmentAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Include returns Include
	 *
	 * Constraint:
	 *     (context=[ContextModel|ID] importURI=STRING)
	 */
	protected void sequence_Include(ISerializationContext context, Include semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.INCLUDE__CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.INCLUDE__CONTEXT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.INCLUDE__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.INCLUDE__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIncludeAccess().getContextContextModelIDTerminalRuleCall_1_0_1(), semanticObject.eGet(MyDslPackage.Literals.INCLUDE__CONTEXT, false));
		feeder.accept(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_3_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     (min=Number max=Number messages+=Message*)
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MatchMessage returns MatchMessage
	 *
	 * Constraint:
	 *     (context=[ContextModel|ID]? content=[ContextFragment|ID]?)
	 */
	protected void sequence_MatchMessage(ISerializationContext context, MatchMessage semanticObject) {
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
	 *     (alt+=Alt | message+=Message | par+=Par | loop+=Loop | contextmessage+=ContextMessage)
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
