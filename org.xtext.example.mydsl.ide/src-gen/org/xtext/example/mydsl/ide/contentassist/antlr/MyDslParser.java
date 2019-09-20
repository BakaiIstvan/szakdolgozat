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
			builder.put(grammarAccess.getScenarioContentAccess().getAlternatives(), "rule__ScenarioContent__Alternatives");
			builder.put(grammarAccess.getNameAccess().getAlternatives_2(), "rule__Name__Alternatives_2");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives_7(), "rule__Expression__Alternatives_7");
			builder.put(grammarAccess.getDomainAccess().getGroup(), "rule__Domain__Group__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup(), "rule__Scenario__Group__0");
			builder.put(grammarAccess.getMessageAccess().getGroup(), "rule__Message__Group__0");
			builder.put(grammarAccess.getNameAccess().getGroup(), "rule__Name__Group__0");
			builder.put(grammarAccess.getObjectTypeAccess().getGroup(), "rule__ObjectType__Group__0");
			builder.put(grammarAccess.getObjectAccess().getGroup(), "rule__Object__Group__0");
			builder.put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
			builder.put(grammarAccess.getAltAccess().getGroup(), "rule__Alt__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
			builder.put(grammarAccess.getParAccess().getGroup(), "rule__Par__Group__0");
			builder.put(grammarAccess.getParExpressionAccess().getGroup(), "rule__ParExpression__Group__0");
			builder.put(grammarAccess.getDomainAccess().getNameAssignment_1(), "rule__Domain__NameAssignment_1");
			builder.put(grammarAccess.getDomainAccess().getObjectsAssignment_3(), "rule__Domain__ObjectsAssignment_3");
			builder.put(grammarAccess.getDomainAccess().getConstraintsAssignment_4(), "rule__Domain__ConstraintsAssignment_4");
			builder.put(grammarAccess.getDomainAccess().getScenariosAssignment_5(), "rule__Domain__ScenariosAssignment_5");
			builder.put(grammarAccess.getScenarioAccess().getNameAssignment_1(), "rule__Scenario__NameAssignment_1");
			builder.put(grammarAccess.getScenarioAccess().getScenariocontentsAssignment_3(), "rule__Scenario__ScenariocontentsAssignment_3");
			builder.put(grammarAccess.getScenarioContentAccess().getAltAssignment_0(), "rule__ScenarioContent__AltAssignment_0");
			builder.put(grammarAccess.getScenarioContentAccess().getMessageAssignment_1(), "rule__ScenarioContent__MessageAssignment_1");
			builder.put(grammarAccess.getScenarioContentAccess().getParAssignment_2(), "rule__ScenarioContent__ParAssignment_2");
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
