package org.xtext.example.mydsl.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.example.mydsl.myDsl.Message;

@SuppressWarnings("all")
public class RegularMessage {
  public CharSequence compile_msg(final Message m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("b = new Automaton(\"auto7\");");
    _builder.newLine();
    _builder.append("actualState = new State(\"q\" + counter, StateType.NORMAL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addState(actualState);");
    _builder.newLine();
    _builder.append("b.setInitial(actualState);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(\"1\", actualState, actualState));");
    _builder.newLine();
    _builder.append("newState = new State(\"q\" + counter, StateType.FINAL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(\"");
    String _name = m.getSender().getName();
    _builder.append(_name);
    _builder.append("\" + \".\" + \"");
    String _name_1 = m.getName();
    _builder.append(_name_1);
    _builder.append("\" + \".\" + \"");
    String _name_2 = m.getReceiver().getName();
    _builder.append(_name_2);
    _builder.append("\" , actualState, newState));");
    _builder.newLineIfNotEmpty();
    _builder.append("b.addState(newState);");
    _builder.newLine();
    _builder.append("b.setFinale(newState);");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile_future(final Message m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("b = new Automaton(\"auto6\");");
    _builder.newLine();
    _builder.append("actualState = new State(\"q\" + counter, StateType.NORMAL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addState(actualState);");
    _builder.newLine();
    _builder.append("b.setInitial(actualState);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(\"1\", actualState, actualState));");
    _builder.newLine();
    _builder.append("newState = new State(\"q\" + counter, StateType.FINAL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(\"");
    String _name = m.getSender().getName();
    _builder.append(_name);
    _builder.append("\" + \".\" + \"");
    String _name_1 = m.getName();
    _builder.append(_name_1);
    _builder.append("\" + \".\" + \"");
    String _name_2 = m.getReceiver().getName();
    _builder.append(_name_2);
    _builder.append("\" , actualState, newState));");
    _builder.newLineIfNotEmpty();
    _builder.append("b.addState(newState);");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(str, newState, newState));");
    _builder.newLine();
    _builder.append("b.setFinale(newState);");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile_past(final Message m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("b = new Automaton(\"auto7\");");
    _builder.newLine();
    _builder.append("actualState = new State(\"q\" + counter, StateType.NORMAL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addState(actualState);");
    _builder.newLine();
    _builder.append("b.setInitial(actualState);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(str, actualState, actualState));");
    _builder.newLine();
    _builder.append("newState = new State(\"q\" + counter, StateType.FINAL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(\"");
    String _name = m.getSender().getName();
    _builder.append(_name);
    _builder.append("\" + \".\" + \"");
    String _name_1 = m.getName();
    _builder.append(_name_1);
    _builder.append("\" + \".\" + \"");
    String _name_2 = m.getReceiver().getName();
    _builder.append(_name_2);
    _builder.append("\", actualState, newState));");
    _builder.newLineIfNotEmpty();
    _builder.append("b.addState(newState);");
    _builder.newLine();
    _builder.append("b.setFinale(newState);");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile_strict_future(final Message m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("b = new Automaton(\"auto11\");");
    _builder.newLine();
    _builder.append("actualState = new State(\"q\" + counter, StateType.NORMAL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addState(actualState);");
    _builder.newLine();
    _builder.append("b.setInitial(actualState);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("newState = new State(\"q\" + counter, StateType.FINAL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(\"");
    String _name = m.getSender().getName();
    _builder.append(_name);
    _builder.append("\" + \".\" + \"");
    String _name_1 = m.getName();
    _builder.append(_name_1);
    _builder.append("\" + \".\" + \"");
    String _name_2 = m.getReceiver().getName();
    _builder.append(_name_2);
    _builder.append("\", actualState, newState));");
    _builder.newLineIfNotEmpty();
    _builder.append("b.addState(newState);");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(str, newState, newState));");
    _builder.newLine();
    _builder.append("b.setFinale(newState);");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile_strict(final Message m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("b = new Automaton(\"auto12\");");
    _builder.newLine();
    _builder.append("actualState = new State(\"q\" + counter, StateType.NORMAL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addState(actualState);");
    _builder.newLine();
    _builder.append("b.setInitial(actualState);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("newState = new State(\"q\" + counter, StateType.FINAL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(\"");
    String _name = m.getSender().getName();
    _builder.append(_name);
    _builder.append("\" + \".\" + \"");
    String _name_1 = m.getName();
    _builder.append(_name_1);
    _builder.append("\" + \".\" + \"");
    String _name_2 = m.getReceiver().getName();
    _builder.append(_name_2);
    _builder.append("\", actualState, newState));");
    _builder.newLineIfNotEmpty();
    _builder.append("b.addState(newState);");
    _builder.newLine();
    _builder.append("b.setFinale(newState);");
    _builder.newLine();
    return _builder;
  }
}
