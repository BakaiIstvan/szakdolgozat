package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.myDsl.ParameterConstraint

class ParameterConstraints {
	def compile_param_constraint(ParameterConstraint pc) '''
		b = new Automaton("auto13");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
		
		acceptState = new State("q" + counter, StateType.ACCEPT_ALL);
		counter++;
		b.addTransition(new Transition("1", acceptState, acceptState));
		b.addTransition(new Transition("!" + "[" + "«pc.param.name»" +
				«FOR a: pc.operator»
					«IF a.greater»
						">"
					«ENDIF»
					«IF a.smaller»
					 	 "<"
					«ENDIF»
					«IF a.greaterequals»
						 ">="
					«ENDIF»
					«IF a.smallerequals»
						"<="
					«ENDIF»
					«IF a.equals»
						"=="
					«ENDIF»
					«IF a.notequals»
						"!="
					«ENDIF»
				«ENDFOR»
				+ 
				«FOR v: pc.value»
					«IF v.value.startsWith("\"")»
						«v.value»
					«ELSE»
						"«v.value»"
					«ENDIF»
				«ENDFOR»
				+ "]" + " in " + "«pc.object.name»"
		
		, actualState, acceptState));
		
		finalState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("[" + "«pc.param.name»" +
		«FOR a: pc.operator»
			«IF a.greater»
				">"
			«ENDIF»
			«IF a.smaller»
			 	 "<"
			«ENDIF»
			«IF a.greaterequals»
				 ">="
			«ENDIF»
			«IF a.smallerequals»
				"<="
			«ENDIF»
			«IF a.equals»
				"=="
			«ENDIF»
			«IF a.notequals»
				"!="
			«ENDIF»
		«ENDFOR»
		+ 
		«FOR v: pc.value»
			«IF v.value.startsWith("\"")»
				«v.value»
			«ELSE»
				"«v.value»"
			«ENDIF»
		«ENDFOR»
		+ "]" + " in " + "«pc.object.name»"
		, actualState, finalState));
		b.addState(acceptState);
		b.addState(finalState);
		b.setFinale(finalState);
	'''
}