package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.myDsl.Message

class RegularMessage {

	def compile_msg(Message m)'''
			b = new Automaton("auto7");
			actualState = new State("q" + counter, StateType.NORMAL);
			counter++;
			b.addState(actualState);
			b.setInitial(actualState);
												
			b.addTransition(new Transition("1", actualState, actualState));
			newState = new State("q" + counter, StateType.FINAL);
			counter++;
			b.addTransition(new Transition("«m.sender.name»" + "." + "«m.name»" + "." + "«m.receiver.name»" , actualState, newState));
			b.addState(newState);
			b.setFinale(newState);
	'''
	
	def compile_future(Message m)'''
			b = new Automaton("auto6");
			actualState = new State("q" + counter, StateType.NORMAL);
			counter++;
			b.addState(actualState);
			b.setInitial(actualState);
												
			b.addTransition(new Transition("1", actualState, actualState));
			newState = new State("q" + counter, StateType.FINAL);
			counter++;
			b.addTransition(new Transition("«m.sender.name»" + "." + "«m.name»" + "." + "«m.receiver.name»" , actualState, newState));
			b.addState(newState);
			b.addTransition(new Transition(str, newState, newState));
			b.setFinale(newState);
	'''
	
	def compile_past(Message m)'''
		b = new Automaton("auto7");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
												
		b.addTransition(new Transition(str, actualState, actualState));
		newState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("«m.sender.name»" + "." + "«m.name»" + "." + "«m.receiver.name»", actualState, newState));
		b.addState(newState);
		b.setFinale(newState);
	'''
	
	def compile_strict_future(Message m)'''
		b = new Automaton("auto11");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		newState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("«m.sender.name»" + "." + "«m.name»" + "." + "«m.receiver.name»", actualState, newState));
		b.addState(newState);
		b.addTransition(new Transition(str, newState, newState));
		b.setFinale(newState);
	'''
	
	def compile_strict(Message m)'''
		b = new Automaton("auto12");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
												
		newState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("«m.sender.name»" + "." + "«m.name»" + "." + "«m.receiver.name»", actualState, newState));
		b.addState(newState);
		b.setFinale(newState);
	'''
	
}