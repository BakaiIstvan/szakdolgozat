package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.myDsl.Message

class RequiredMessage {

	def compile_required_future(Message m)'''
		b = new Automaton("auto1");
		actualState = new State("q" + counter, StateType.ACCEPT);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		b.addTransition(new Transition("!(" + "�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�" + ")", actualState, actualState));
		finalState = new State("q" + counter, StateType.FINAL);
		counter++;
		acceptState = new State("q" + counter, StateType.ACCEPT_ALL);
		counter++;
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, finalState));
		b.addTransition(new Transition(str, finalState, finalState));
		b.addTransition(new Transition("!" + "(" + str + ")", finalState, acceptState));
		b.addTransition(new Transition("1", acceptState, acceptState));
		b.addState(acceptState);
		b.addState(finalState);
		b.setFinale(finalState);
		
	'''
	
	def compile_required_past(Message m)'''
		b = new Automaton("auto2");
		actualState = new State("q" + counter, StateType.ACCEPT);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
		
											
		b.addTransition(new Transition("!(" + "�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�" + " & " + str + ")", actualState, actualState));
		acceptState = new State("q" + counter, StateType.ACCEPT_ALL);
		counter++;
		finalState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, finalState));
		b.addTransition(new Transition("!" + "(" + str + ")", actualState, acceptState));
		b.addTransition(new Transition("1", acceptState, acceptState));
		b.addState(acceptState);
		b.addState(finalState);
		b.setFinale(finalState);
	'''
	
	def compile_required(Message m)'''
		b = new Automaton("auto3");
		actualState = new State("q" + counter, StateType.ACCEPT);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
		
		
		b.addTransition(new Transition("!(" + "�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�" + ")", actualState, actualState));
		newState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, newState));
		b.addState(newState);
		b.setFinale(newState);
	'''
	
	def compile_strict_required_future(Message m)'''
		b = new Automaton("auto8");
		actualState = new State("q" + counter, StateType.ACCEPT);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		finalState = new State("q" + counter, StateType.FINAL);
		counter++;
		acceptState = new State("q" + counter, StateType.ACCEPT_ALL);
		counter++;
		acceptState_new = new State("q" + counter, StateType.ACCEPT_ALL);
		counter++;
		b.addTransition(new Transition("!(" + "�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�" + ")", actualState, acceptState_new));
		b.addTransition(new Transition("1", acceptState_new, acceptState_new));
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, finalState));
		b.addTransition(new Transition(str, finalState, finalState));
		b.addTransition(new Transition("!" + "(" + str + ")", finalState, acceptState));
		b.addTransition(new Transition("1", acceptState, acceptState));
		b.addState(finalState);
		b.addState(acceptState);
		b.addState(acceptState_new);
		b.setFinale(finalState);
	'''
	
	def compile_strict_required(Message m)'''
		b = new Automaton("auto9");
		actualState = new State("q" + counter, StateType.ACCEPT);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		finalState = new State("q" + counter, StateType.FINAL);
		counter++;
		acceptState = new State("q" + counter, StateType.ACCEPT_ALL);
		counter++;
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�" , actualState, finalState));
		b.addTransition(new Transition("!(" + "�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�" + ")", actualState, acceptState));
		b.addTransition(new Transition("1", acceptState, acceptState));
		b.addState(acceptState);
		b.addState(finalState);
		b.setFinale(finalState);
	'''
}