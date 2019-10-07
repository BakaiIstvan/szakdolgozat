/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAttributeValueAccess().getAlternatives(), "rule__AttributeValue__Alternatives");
			builder.put(grammarAccess.getScenarioContentAccess().getAlternatives(), "rule__ScenarioContent__Alternatives");
			builder.put(grammarAccess.getContextMessageContentAccess().getAlternatives(), "rule__ContextMessageContent__Alternatives");
			builder.put(grammarAccess.getChangeMessageAccess().getAlternatives(), "rule__ChangeMessage__Alternatives");
			builder.put(grammarAccess.getNameAccess().getAlternatives_2(), "rule__Name__Alternatives_2");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives_7(), "rule__Expression__Alternatives_7");
			builder.put(grammarAccess.getDomainAccess().getGroup(), "rule__Domain__Group__0");
			builder.put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
			builder.put(grammarAccess.getContextModelAccess().getGroup(), "rule__ContextModel__Group__0");
			builder.put(grammarAccess.getContextFragmentAccess().getGroup(), "rule__ContextFragment__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getAttributeValueAccess().getGroup_0(), "rule__AttributeValue__Group_0__0");
			builder.put(grammarAccess.getAttributeValueAccess().getGroup_1(), "rule__AttributeValue__Group_1__0");
			builder.put(grammarAccess.getAttributeValueAccess().getGroup_2(), "rule__AttributeValue__Group_2__0");
			builder.put(grammarAccess.getAttributeValueAccess().getGroup_3(), "rule__AttributeValue__Group_3__0");
			builder.put(grammarAccess.getAttributeValueAccess().getGroup_4(), "rule__AttributeValue__Group_4__0");
			builder.put(grammarAccess.getAttributeValueAccess().getGroup_5(), "rule__AttributeValue__Group_5__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getRelationAccess().getGroup(), "rule__Relation__Group__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup(), "rule__Scenario__Group__0");
			builder.put(grammarAccess.getMessageAccess().getGroup(), "rule__Message__Group__0");
			builder.put(grammarAccess.getContextMessageAccess().getGroup(), "rule__ContextMessage__Group__0");
			builder.put(grammarAccess.getMatchMessageAccess().getGroup(), "rule__MatchMessage__Group__0");
			builder.put(grammarAccess.getAppearMessageAccess().getGroup(), "rule__AppearMessage__Group__0");
			builder.put(grammarAccess.getAppearMessageAccess().getGroup_2(), "rule__AppearMessage__Group_2__0");
			builder.put(grammarAccess.getDisappearMessageAccess().getGroup(), "rule__DisappearMessage__Group__0");
			builder.put(grammarAccess.getDisappearMessageAccess().getGroup_2(), "rule__DisappearMessage__Group_2__0");
			builder.put(grammarAccess.getChangeToMessageAccess().getGroup(), "rule__ChangeToMessage__Group__0");
			builder.put(grammarAccess.getChangeToMessageAccess().getGroup_2(), "rule__ChangeToMessage__Group_2__0");
			builder.put(grammarAccess.getNameAccess().getGroup(), "rule__Name__Group__0");
			builder.put(grammarAccess.getObjectTypeAccess().getGroup(), "rule__ObjectType__Group__0");
			builder.put(grammarAccess.getObjectAccess().getGroup(), "rule__Object__Group__0");
			builder.put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
			builder.put(grammarAccess.getAltAccess().getGroup(), "rule__Alt__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
			builder.put(grammarAccess.getParAccess().getGroup(), "rule__Par__Group__0");
			builder.put(grammarAccess.getParExpressionAccess().getGroup(), "rule__ParExpression__Group__0");
			builder.put(grammarAccess.getLoopAccess().getGroup(), "rule__Loop__Group__0");
			builder.put(grammarAccess.getDomainAccess().getSpecificationAssignment_0(), "rule__Domain__SpecificationAssignment_0");
			builder.put(grammarAccess.getDomainAccess().getNameAssignment_1(), "rule__Domain__NameAssignment_1");
			builder.put(grammarAccess.getDomainAccess().getIncludesAssignment_3(), "rule__Domain__IncludesAssignment_3");
			builder.put(grammarAccess.getDomainAccess().getContextmodelsAssignment_4(), "rule__Domain__ContextmodelsAssignment_4");
			builder.put(grammarAccess.getDomainAccess().getContextfragmentsAssignment_5(), "rule__Domain__ContextfragmentsAssignment_5");
			builder.put(grammarAccess.getDomainAccess().getObjectsAssignment_6(), "rule__Domain__ObjectsAssignment_6");
			builder.put(grammarAccess.getDomainAccess().getConstraintsAssignment_7(), "rule__Domain__ConstraintsAssignment_7");
			builder.put(grammarAccess.getDomainAccess().getScenariosAssignment_8(), "rule__Domain__ScenariosAssignment_8");
			builder.put(grammarAccess.getIncludeAccess().getImportURIAssignment_1(), "rule__Include__ImportURIAssignment_1");
			builder.put(grammarAccess.getContextModelAccess().getNameAssignment_1(), "rule__ContextModel__NameAssignment_1");
			builder.put(grammarAccess.getContextModelAccess().getEntitiesAssignment_3(), "rule__ContextModel__EntitiesAssignment_3");
			builder.put(grammarAccess.getContextModelAccess().getRelationsAssignment_4(), "rule__ContextModel__RelationsAssignment_4");
			builder.put(grammarAccess.getContextFragmentAccess().getNameAssignment_1(), "rule__ContextFragment__NameAssignment_1");
			builder.put(grammarAccess.getContextFragmentAccess().getEntitiesAssignment_3(), "rule__ContextFragment__EntitiesAssignment_3");
			builder.put(grammarAccess.getContextFragmentAccess().getRelationsAssignment_4(), "rule__ContextFragment__RelationsAssignment_4");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getValueAssignment_3(), "rule__Attribute__ValueAssignment_3");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getAttributesAssignment_3(), "rule__Entity__AttributesAssignment_3");
			builder.put(grammarAccess.getRelationAccess().getNameAssignment_1(), "rule__Relation__NameAssignment_1");
			builder.put(grammarAccess.getRelationAccess().getSenderAssignment_3(), "rule__Relation__SenderAssignment_3");
			builder.put(grammarAccess.getRelationAccess().getReceiverAssignment_5(), "rule__Relation__ReceiverAssignment_5");
			builder.put(grammarAccess.getRelationAccess().getAttributesAssignment_8(), "rule__Relation__AttributesAssignment_8");
			builder.put(grammarAccess.getScenarioAccess().getNameAssignment_1(), "rule__Scenario__NameAssignment_1");
			builder.put(grammarAccess.getScenarioAccess().getScenariocontentsAssignment_3(), "rule__Scenario__ScenariocontentsAssignment_3");
			builder.put(grammarAccess.getScenarioContentAccess().getAltAssignment_0(), "rule__ScenarioContent__AltAssignment_0");
			builder.put(grammarAccess.getScenarioContentAccess().getMessageAssignment_1(), "rule__ScenarioContent__MessageAssignment_1");
			builder.put(grammarAccess.getScenarioContentAccess().getParAssignment_2(), "rule__ScenarioContent__ParAssignment_2");
			builder.put(grammarAccess.getScenarioContentAccess().getLoopAssignment_3(), "rule__ScenarioContent__LoopAssignment_3");
			builder.put(grammarAccess.getScenarioContentAccess().getContextmessageAssignment_4(), "rule__ScenarioContent__ContextmessageAssignment_4");
			builder.put(grammarAccess.getMessageAccess().getNameAssignment_1(), "rule__Message__NameAssignment_1");
			builder.put(grammarAccess.getMessageAccess().getRequiredAssignment_2(), "rule__Message__RequiredAssignment_2");
			builder.put(grammarAccess.getMessageAccess().getFailAssignment_3(), "rule__Message__FailAssignment_3");
			builder.put(grammarAccess.getMessageAccess().getStrictAssignment_4(), "rule__Message__StrictAssignment_4");
			builder.put(grammarAccess.getMessageAccess().getSenderAssignment_5(), "rule__Message__SenderAssignment_5");
			builder.put(grammarAccess.getMessageAccess().getReceiverAssignment_7(), "rule__Message__ReceiverAssignment_7");
			builder.put(grammarAccess.getMessageAccess().getPastAssignment_8(), "rule__Message__PastAssignment_8");
			builder.put(grammarAccess.getMessageAccess().getFutureAssignment_9(), "rule__Message__FutureAssignment_9");
			builder.put(grammarAccess.getMessageAccess().getConstraintAssignment_10(), "rule__Message__ConstraintAssignment_10");
			builder.put(grammarAccess.getMessageAccess().getCAssignment_12(), "rule__Message__CAssignment_12");
			builder.put(grammarAccess.getContextMessageAccess().getContentAssignment_0(), "rule__ContextMessage__ContentAssignment_0");
			builder.put(grammarAccess.getContextMessageAccess().getRequiredAssignment_1(), "rule__ContextMessage__RequiredAssignment_1");
			builder.put(grammarAccess.getContextMessageAccess().getFailAssignment_2(), "rule__ContextMessage__FailAssignment_2");
			builder.put(grammarAccess.getContextMessageAccess().getStrictAssignment_3(), "rule__ContextMessage__StrictAssignment_3");
			builder.put(grammarAccess.getContextMessageContentAccess().getMatchAssignment_0(), "rule__ContextMessageContent__MatchAssignment_0");
			builder.put(grammarAccess.getContextMessageContentAccess().getChangeAssignment_1(), "rule__ContextMessageContent__ChangeAssignment_1");
			builder.put(grammarAccess.getMatchMessageAccess().getContextAssignment_2(), "rule__MatchMessage__ContextAssignment_2");
			builder.put(grammarAccess.getMatchMessageAccess().getContentAssignment_4(), "rule__MatchMessage__ContentAssignment_4");
			builder.put(grammarAccess.getChangeMessageAccess().getDisappearAssignment_0(), "rule__ChangeMessage__DisappearAssignment_0");
			builder.put(grammarAccess.getChangeMessageAccess().getAppearAssignment_1(), "rule__ChangeMessage__AppearAssignment_1");
			builder.put(grammarAccess.getChangeMessageAccess().getChangetoAssignment_2(), "rule__ChangeMessage__ChangetoAssignment_2");
			builder.put(grammarAccess.getAppearMessageAccess().getContextAssignment_2_0(), "rule__AppearMessage__ContextAssignment_2_0");
			builder.put(grammarAccess.getAppearMessageAccess().getEntityAssignment_2_2(), "rule__AppearMessage__EntityAssignment_2_2");
			builder.put(grammarAccess.getDisappearMessageAccess().getContextAssignment_2_0(), "rule__DisappearMessage__ContextAssignment_2_0");
			builder.put(grammarAccess.getDisappearMessageAccess().getEntityAssignment_2_2(), "rule__DisappearMessage__EntityAssignment_2_2");
			builder.put(grammarAccess.getChangeToMessageAccess().getContextAssignment_2_0(), "rule__ChangeToMessage__ContextAssignment_2_0");
			builder.put(grammarAccess.getChangeToMessageAccess().getEntityAssignment_2_2(), "rule__ChangeToMessage__EntityAssignment_2_2");
			builder.put(grammarAccess.getChangeToMessageAccess().getAttributeAssignment_2_4(), "rule__ChangeToMessage__AttributeAssignment_2_4");
			builder.put(grammarAccess.getChangeToMessageAccess().getChangevalueAssignment_4(), "rule__ChangeToMessage__ChangevalueAssignment_4");
			builder.put(grammarAccess.getObjectTypeAccess().getNameAssignment_1(), "rule__ObjectType__NameAssignment_1");
			builder.put(grammarAccess.getObjectAccess().getObjectAssignment_0(), "rule__Object__ObjectAssignment_0");
			builder.put(grammarAccess.getObjectAccess().getNameAssignment_1(), "rule__Object__NameAssignment_1");
			builder.put(grammarAccess.getConstraintAccess().getNameAssignment_1(), "rule__Constraint__NameAssignment_1");
			builder.put(grammarAccess.getConstraintAccess().getMessagesAssignment_3(), "rule__Constraint__MessagesAssignment_3");
			builder.put(grammarAccess.getAltAccess().getExpressionsAssignment_1(), "rule__Alt__ExpressionsAssignment_1");
			builder.put(grammarAccess.getExpressionAccess().getMessagesAssignment_10(), "rule__Expression__MessagesAssignment_10");
			builder.put(grammarAccess.getParAccess().getParexpressionAssignment_2(), "rule__Par__ParexpressionAssignment_2");
			builder.put(grammarAccess.getParExpressionAccess().getNameAssignment_1(), "rule__ParExpression__NameAssignment_1");
			builder.put(grammarAccess.getParExpressionAccess().getMessagesAssignment_3(), "rule__ParExpression__MessagesAssignment_3");
			builder.put(grammarAccess.getLoopAccess().getMinAssignment_2(), "rule__Loop__MinAssignment_2");
			builder.put(grammarAccess.getLoopAccess().getMaxAssignment_4(), "rule__Loop__MaxAssignment_4");
			builder.put(grammarAccess.getLoopAccess().getMessagesAssignment_7(), "rule__Loop__MessagesAssignment_7");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
