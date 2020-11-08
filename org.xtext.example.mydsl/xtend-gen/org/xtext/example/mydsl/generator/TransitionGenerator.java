package org.xtext.example.mydsl.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

@SuppressWarnings("all")
public class TransitionGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class Transition {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String id;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private State sender;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private State receiver;");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Transition() {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("this.id = \"t0\";");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("this.sender = new State();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("this.receiver = new State();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Transition(String id, State sender, State receiver) {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("if(id.equals(\"1\")){");
    _builder.newLine();
    _builder.append("    \t\t");
    _builder.append("this.id = \"true\";");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("}else{");
    _builder.newLine();
    _builder.append("        \t");
    _builder.append("this.id = id;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.sender = sender;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.receiver = receiver;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getMessageType() {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("String messageType = this.id.substring(2, this.id.length() - 1);");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("messageType = messageType.substring(messageType.indexOf(\".\") + 1);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("messageType = messageType.substring(0, messageType.indexOf(\"(\"));");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("return messageType;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String[] getParameters() {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("String messageType = this.id.substring(2, this.id.length() - 1);");
    _builder.newLine();
    _builder.append("    \t ");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("messageType = messageType.substring(messageType.indexOf(\"(\") + 1);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("messageType = messageType.substring(0, messageType.indexOf(\")\"));");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("if (messageType.equals(\"\")) {");
    _builder.newLine();
    _builder.append("    \t\t");
    _builder.append("return new String[0];");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    \t");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("return messageType.split(\",\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getSenderName() {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("String sender = this.id;");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("if (this.id.contains(\"!\")) {");
    _builder.newLine();
    _builder.append("    \t\t");
    _builder.append("sender = this.id.substring(2, this.id.length() - 1);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    \t");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("sender = sender.substring(0, sender.indexOf(\".\"));");
    _builder.newLine();
    _builder.append("    \t");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("return sender;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getReceiverName() {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("String receiver = this.id;");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("if (this.id.contains(\"!\")) {");
    _builder.newLine();
    _builder.append("    \t\t");
    _builder.append("receiver = this.id.substring(2, this.id.length() - 1);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    \t");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("receiver = receiver.substring(receiver.indexOf(\")\") + 2);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("return receiver;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getId() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return id;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public State getSender() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return sender;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public State getReceiver() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return receiver;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setReceiver(State receiver) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.receiver = receiver;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setSender(State sender) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.sender = sender;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setId(String id) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if(id.equals(\"1\")){");
    _builder.newLine();
    _builder.append("        \t");
    _builder.append("this.id = \"true\";");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}else{");
    _builder.newLine();
    _builder.append("        \t");
    _builder.append("this.id = id;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void writeTransition(){");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("System.out.println(this.id + \" \" + this.sender.getId() + \"->\" + this.receiver.getId());");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    fsa.generateFile("Transition.java", _builder);
  }
}
