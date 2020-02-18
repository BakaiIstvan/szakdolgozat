package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.myDsl.Message

class FailMessage {
	
	def compile_fail_past(Message m)'''
		b = new Automaton("auto4");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
		
											
		b.addTransition(new Transition(str, actualState, actualState));
		finalState = new State("q" + counter, StateType.FINAL);
		counter++;
		acceptState = new State("q" + counter, StateType.ACCEPT_ALL);
		counter++;
		b.addTransition(new Transition("!" + "(" + str + ")", actualState, finalState));
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�" , actualState, acceptState));
		b.addTransition(new Transition("1", acceptState, acceptState));
		b.addState(acceptState);
		b.addState(finalState);
		b.setFinale(finalState);
	'''
	
	def compile_fail(Message m)'''
		b = new Automaton("auto5");
		actualState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
		b.setFinale(actualState);
											
		b.addTransition(new Transition("1", actualState, actualState));
		newState = new State("q" + counter, StateType.ACCEPT_ALL);
		counter++;
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�" , actualState, newState));
		b.addState(newState);
		b.addTransition(new Transition("1", newState, newState));
	'''
	
	def compile_strict_fail(Message m)'''
		b = new Automaton("auto10");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		finalState = new State("q" + counter, StateType.FINAL);
		counter++;
		acceptState = new State("q" + counter, StateType.ACCEPT_ALL);
		counter++;
		b.addTransition(new Transition("!(" + "�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�" + ")", actualState, finalState));
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, acceptState));
		b.addTransition(new Transition("1", acceptState, acceptState));
		b.addState(finalState);
		b.addState(acceptState);
		b.setFinale(finalState);
	'''
}