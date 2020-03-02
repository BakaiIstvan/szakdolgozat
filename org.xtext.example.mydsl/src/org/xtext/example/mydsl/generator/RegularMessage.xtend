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
			b.addTransition(new Transition("«m.sender.name»" + "." +
			
			"«m.name»" + "(" +
			«FOR p: m.params»
				«FOR param: 0..<p.params.size»
					«IF p.params.get(param).value.value.startsWith("\"")»
						«p.params.get(param).value.value»
					«ELSE»
					"«p.params.get(param).value.value»"
					«ENDIF»
					«IF param != p.params.size - 1»
						+ ", " +
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			«FOR p: m.constantparams»
				«FOR param: 0..<p.values.size»
					«IF p.values.get(param).value.startsWith("\"")»
						«p.values.get(param).value»
					«ELSE»
					"«p.values.get(param).value»"
					«ENDIF»
					«IF param != p.values.size - 1»
						+ ", " +
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			+ ")"
			
			+ "." + "«m.receiver.name»" , actualState, newState));
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
			b.addTransition(new Transition("«m.sender.name»" + "." +
			
			"«m.name»" + "(" +
			«FOR p: m.params»
				«FOR param: 0..<p.params.size»
					«IF p.params.get(param).value.value.startsWith("\"")»
						«p.params.get(param).value.value»
					«ELSE»
					"«p.params.get(param).value.value»"
					«ENDIF»
					«IF param != p.params.size - 1»
						+ ", " +
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			«FOR p: m.constantparams»
				«FOR param: 0..<p.values.size»
					«IF p.values.get(param).value.startsWith("\"")»
						«p.values.get(param).value»
					«ELSE»
					"«p.values.get(param).value»"
					«ENDIF»
					«IF param != p.values.size - 1»
						+ ", " +
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			+ ")"
			
			+ "." + "«m.receiver.name»" , actualState, newState));
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
		b.addTransition(new Transition("«m.sender.name»" + "." +
		"«m.name»" + "(" +
		«FOR p: m.params»
			«FOR param: 0..<p.params.size»
				«IF p.params.get(param).value.value.startsWith("\"")»
					«p.params.get(param).value.value»
				«ELSE»
				"«p.params.get(param).value.value»"
				«ENDIF»
				«IF param != p.params.size - 1»
					+ ", " +
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		«FOR p: m.constantparams»
			«FOR param: 0..<p.values.size»
				«IF p.values.get(param).value.startsWith("\"")»
					«p.values.get(param).value»
				«ELSE»
				"«p.values.get(param).value»"
				«ENDIF»
				«IF param != p.values.size - 1»
					+ ", " +
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		+ ")"
		+ "." + "«m.receiver.name»", actualState, newState));
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
		b.addTransition(new Transition("«m.sender.name»" + "." +
		"«m.name»" + "(" +
		«FOR p: m.params»
			«FOR param: 0..<p.params.size»
				«IF p.params.get(param).value.value.startsWith("\"")»
					«p.params.get(param).value.value»
				«ELSE»
				"«p.params.get(param).value.value»"
				«ENDIF»
				«IF param != p.params.size - 1»
					+ ", " +
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		«FOR p: m.constantparams»
			«FOR param: 0..<p.values.size»
				«IF p.values.get(param).value.startsWith("\"")»
					«p.values.get(param).value»
				«ELSE»
				"«p.values.get(param).value»"
				«ENDIF»
				«IF param != p.values.size - 1»
					+ ", " +
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		+ ")"
		
		+ "." + "«m.receiver.name»", actualState, newState));
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
		b.addTransition(new Transition("«m.sender.name»" + "." +
		"«m.name»" + "(" +
		«FOR p: m.params»
			«FOR param: 0..<p.params.size»
				«IF p.params.get(param).value.value.startsWith("\"")»
					«p.params.get(param).value.value»
				«ELSE»
				"«p.params.get(param).value.value»"
				«ENDIF»
				«IF param != p.params.size - 1»
					+ ", " +
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		«FOR p: m.constantparams»
			«FOR param: 0..<p.values.size»
				«IF p.values.get(param).value.startsWith("\"")»
					«p.values.get(param).value»
				«ELSE»
				"«p.values.get(param).value»"
				«ENDIF»
				«IF param != p.values.size - 1»
					+ ", " +
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		+ ")"
		+ "." + "«m.receiver.name»", actualState, newState));
		b.addState(newState);
		b.setFinale(newState);
	'''
	
}