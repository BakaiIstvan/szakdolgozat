package org.xtext.example.mydsl.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

@SuppressWarnings("all")
public class IMonitorGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public interface IMonitor {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean goodStateReached();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void update(String sender, String receiver, String messageType, String[] parameters);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean requirementSatisfied();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void errorDetected(String sender, String receiver, String messageType, String[] parameters);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    fsa.generateFile("IMonitor.java", _builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import java.util.ArrayList;");
    _builder_1.newLine();
    _builder_1.append("import java.util.Arrays;");
    _builder_1.newLine();
    _builder_1.append("import java.util.List;");
    _builder_1.newLine();
    _builder_1.append("import java.util.ListIterator;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class Monitor implements IMonitor {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("private Automaton automaton;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("private State actualState;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("private List<State> goodStates;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("private boolean requirementFullfilled;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public Monitor(Automaton automaton) {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("this.automaton = automaton;");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("this.actualState = automaton.getInitial();");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("this.goodStates = new ArrayList<State>();");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("this.goodStates.add(automaton.getFinale());");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("this.requirementFullfilled = true;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("@Override");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public boolean goodStateReached() {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("return this.goodStates.contains(actualState) && this.requirementFullfilled;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("@Override");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public void update(String sender, String receiver, String messageType, String[] parameters) {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("List<Transition> transitions = automaton.findSender(this.actualState);");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("String receivedMessage = getReceivedMessage(sender, receiver, messageType, parameters);");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("System.out.println(\"Received Message: \" + receivedMessage);");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("boolean edgeTriggered = false;");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("ListIterator<Transition> iterator = transitions.listIterator();");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("while (iterator.hasNext()) {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("Transition transition = iterator.next();");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("System.out.println(\"Transition: \" + transition.getId());");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("if (transition.getId().contains(\"epsilon\")) {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("List<Transition> newTransitions = new ArrayList<Transition>(automaton.findSender(transition.getReceiver()));");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("for (Transition t : newTransitions) {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("iterator.add(t);");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("iterator.previous();");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("Transition prevTransition = iterator.previous();");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("System.out.println(\"PrevTransition: \" + prevTransition.getId());");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("this.actualState = transition.getReceiver();");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("updateMonitorStatus(transition);");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("iterator.remove();");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("} else if(transitions.stream().anyMatch(t -> t.getId().contains(\"epsilon\"))) {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("// do nothing");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("} else {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("edgeTriggered = updateState(transition, messageType, sender, receiver, parameters, receivedMessage);");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("if (edgeTriggered) {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("break;");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("if (!edgeTriggered) {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("this.requirementFullfilled = false;");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("System.out.println(\"Failure: receivedMessage didn\'t match any transitions.\");");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("private boolean updateState(Transition transition");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t   ");
    _builder_1.append(", String messageType");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t   ");
    _builder_1.append(", String sender");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t   ");
    _builder_1.append(", String receiver");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t   ");
    _builder_1.append(", String[] parameters");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t   ");
    _builder_1.append(", String receivedMessage) {");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("if (!transition.getId().contains(\"&\")) {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("if (!transition.getId().contains(\"!\")");
    _builder_1.newLine();
    _builder_1.append("\t\t     ");
    _builder_1.append("&& transition.getMessageType().equals(messageType)");
    _builder_1.newLine();
    _builder_1.append("\t\t     ");
    _builder_1.append("&& transition.getSenderName().equals(sender)");
    _builder_1.newLine();
    _builder_1.append("\t\t     ");
    _builder_1.append("&& transition.getReceiverName().equals(receiver)");
    _builder_1.newLine();
    _builder_1.append("\t\t     ");
    _builder_1.append("&& Arrays.equals(transition.getParameters(), parameters)) {");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("this.actualState = transition.getReceiver();");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("updateMonitorStatus(transition);");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("return true;");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("} else if (transition.getId().contains(\"!\")");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("&& (!transition.getMessageType().equals(messageType)");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("|| !transition.getSenderName().equals(sender)");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("|| !transition.getReceiverName().equals(receiver)");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("|| !Arrays.equals(transition.getParameters(), parameters))) {");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("this.actualState = transition.getReceiver();");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("updateMonitorStatus(transition);");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("return true;");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("} else if (!transition.getId().contains(receivedMessage)) {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("this.actualState = transition.getReceiver();");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("updateMonitorStatus(transition);");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("return true;");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("return false;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("private void updateMonitorStatus(Transition transition) {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("if (actualState.getType().equals(StateType.FINAL)) {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("List<Transition> transitions = automaton.findSender(this.actualState);");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("if (transitions.size() == 1 ");
    _builder_1.newLine();
    _builder_1.append("\t\t\t ");
    _builder_1.append("&& transitions.stream().anyMatch(t -> t.getId().equals(\"epsilon\"))");
    _builder_1.newLine();
    _builder_1.append("\t\t\t ");
    _builder_1.append("&& transitions.get(0).getReceiver().getType().equals(StateType.FINAL)) {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("transition = transitions.get(0);");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("this.actualState = transition.getReceiver();");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("System.out.println(\"transition: \" + transition.getId());");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("System.out.println(actualState.getId());");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("if (goodStateReached()) {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("Main.monitorStatus(\"System is in good state.\");");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("} else {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("Main.monitorStatus(\"System is in bad state.\");");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("private String getReceivedMessage(String sender, String receiver, String messageType, String[] parameters) {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("String receivedMessage = sender + \".\" + messageType + \"(\";");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("for (String param : parameters) {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("receivedMessage += param;");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("if (!(parameters[parameters.length - 1]).equals(param)) {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("receivedMessage += \", \";");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("receivedMessage += \").\" + receiver;");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("return receivedMessage;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("@Override");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public boolean requirementSatisfied() {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("return this.actualState == this.automaton.getFinale();");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("@Override");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public void errorDetected(String sender, String receiver, String messageType, String[] parameters) {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("// TODO Auto-generated method stub");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    fsa.generateFile("Monitor.java", _builder_1);
  }
}
