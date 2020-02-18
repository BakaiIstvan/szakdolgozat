package org.xtext.example.mydsl.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.example.mydsl.myDsl.DisappearMessage;

@SuppressWarnings("all")
public class DisappearMessages {
  public CharSequence compile_disappear_required(final DisappearMessage dm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("b = new Automaton(\"auto3\");");
    _builder.newLine();
    _builder.append("actualState = new State(\"q\" + counter, StateType.ACCEPT);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addState(actualState);");
    _builder.newLine();
    _builder.append("b.setInitial(actualState);");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(\"!(\"+ \"disappear(\" + \"");
    String _name = dm.getContext().getName();
    _builder.append(_name);
    _builder.append("\" + \".\" + \"");
    String _name_1 = dm.getEntity().getName();
    _builder.append(_name_1);
    _builder.append("\" + \"))\", actualState, actualState));");
    _builder.newLineIfNotEmpty();
    _builder.append("newState = new State(\"q\" + counter, StateType.FINAL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(\"disappear(\" + \"");
    String _name_2 = dm.getContext().getName();
    _builder.append(_name_2);
    _builder.append("\" + \".\" + \"");
    String _name_3 = dm.getEntity().getName();
    _builder.append(_name_3);
    _builder.append("\" + \")\", actualState, newState));");
    _builder.newLineIfNotEmpty();
    _builder.append("b.addState(newState);");
    _builder.newLine();
    _builder.append("b.setFinale(newState);");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile_disappear_fail(final DisappearMessage dm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("b = new Automaton(\"auto5\");");
    _builder.newLine();
    _builder.append("actualState = new State(\"q\" + counter, StateType.FINAL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addState(actualState);");
    _builder.newLine();
    _builder.append("b.setInitial(actualState);");
    _builder.newLine();
    _builder.append("b.setFinale(actualState);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(\"1\", actualState, actualState));");
    _builder.newLine();
    _builder.append("newState = new State(\"q\" + counter, StateType.ACCEPT_ALL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(\"disappear(\" + \"");
    String _name = dm.getContext().getName();
    _builder.append(_name);
    _builder.append("\" + \".\" + \"");
    String _name_1 = dm.getEntity().getName();
    _builder.append(_name_1);
    _builder.append("\" + \")\" , actualState, newState));");
    _builder.newLineIfNotEmpty();
    _builder.append("b.addState(newState);");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(\"1\", newState, newState));");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile_disappear_msg(final DisappearMessage dm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("b = new Automaton(\"match1\");");
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
    _builder.append("b.addTransition(new Transition(\"disappear(\" + \"");
    String _name = dm.getContext().getName();
    _builder.append(_name);
    _builder.append("\" + \".\" + \"");
    String _name_1 = dm.getEntity().getName();
    _builder.append(_name_1);
    _builder.append("\" + \")\" , actualState, newState));");
    _builder.newLineIfNotEmpty();
    _builder.append("b.addState(newState);");
    _builder.newLine();
    _builder.append("b.setFinale(newState);");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile_disappear_strict_required(final DisappearMessage dm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("b = new Automaton(\"auto9\");");
    _builder.newLine();
    _builder.append("actualState = new State(\"q\" + counter, StateType.ACCEPT);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addState(actualState);");
    _builder.newLine();
    _builder.append("b.setInitial(actualState);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("finalState = new State(\"q\" + counter, StateType.FINAL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("acceptState = new State(\"q\" + counter, StateType.ACCEPT_ALL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(\"disappear(\" + \"");
    String _name = dm.getContext().getName();
    _builder.append(_name);
    _builder.append("\" + \".\" + \"");
    String _name_1 = dm.getEntity().getName();
    _builder.append(_name_1);
    _builder.append("\" + \")\" , actualState, finalState));");
    _builder.newLineIfNotEmpty();
    _builder.append("b.addTransition(new Transition(\"!(\" + \"disappear(\" + \"");
    String _name_2 = dm.getContext().getName();
    _builder.append(_name_2);
    _builder.append("\" + \".\" + \"");
    String _name_3 = dm.getEntity().getName();
    _builder.append(_name_3);
    _builder.append("\" + \"))\" , actualState, acceptState));");
    _builder.newLineIfNotEmpty();
    _builder.append("b.addTransition(new Transition(\"1\", acceptState, acceptState));");
    _builder.newLine();
    _builder.append("b.addState(acceptState);");
    _builder.newLine();
    _builder.append("b.addState(finalState);");
    _builder.newLine();
    _builder.append("b.setFinale(finalState);");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile_disappear_strict_fail(final DisappearMessage dm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("b = new Automaton(\"auto10\");");
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
    _builder.append("finalState = new State(\"q\" + counter, StateType.FINAL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("acceptState = new State(\"q\" + counter, StateType.ACCEPT_ALL);");
    _builder.newLine();
    _builder.append("counter++;");
    _builder.newLine();
    _builder.append("b.addTransition(new Transition(\"!(\" + \"disappear(\" + \"");
    String _name = dm.getContext().getName();
    _builder.append(_name);
    _builder.append("\" + \".\" + \"");
    String _name_1 = dm.getEntity().getName();
    _builder.append(_name_1);
    _builder.append("\" + \"))\", actualState, finalState));");
    _builder.newLineIfNotEmpty();
    _builder.append("b.addTransition(new Transition(\"disappear(\" + \"");
    String _name_2 = dm.getContext().getName();
    _builder.append(_name_2);
    _builder.append("\" + \".\" + \"");
    String _name_3 = dm.getEntity().getName();
    _builder.append(_name_3);
    _builder.append("\" + \")\", actualState, acceptState));");
    _builder.newLineIfNotEmpty();
    _builder.append("b.addTransition(new Transition(\"1\", acceptState, acceptState));");
    _builder.newLine();
    _builder.append("b.addState(finalState);");
    _builder.newLine();
    _builder.append("b.addState(acceptState);");
    _builder.newLine();
    _builder.append("b.setFinale(finalState);");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile_disappear_strict(final DisappearMessage dm) {
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
    _builder.append("b.addTransition(new Transition(\"disappear\" + \"(\" + \"");
    String _name = dm.getContext().getName();
    _builder.append(_name);
    _builder.append("\" + \".\" + \"");
    String _name_1 = dm.getEntity().getName();
    _builder.append(_name_1);
    _builder.append("\" + \")\", actualState, newState));");
    _builder.newLineIfNotEmpty();
    _builder.append("b.addState(newState);");
    _builder.newLine();
    _builder.append("b.setFinale(newState);");
    _builder.newLine();
    return _builder;
  }
}
