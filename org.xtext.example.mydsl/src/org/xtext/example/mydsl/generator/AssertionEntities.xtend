package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.myDsl.AssertionEntity

class AssertionEntities {
	def compile_assertion_entity(AssertionEntity entity)'''
		b = new Automaton("auto14");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
		
		acceptState = new State("q" + counter, StateType.ACCEPT);
		counter++;
				b.addTransition(new Transition("!" +
				"[" + "�entity.context.name�.�entity.entity.name�.�entity.attribute.name� " +
				�FOR a: entity.operator�
					�IF a.greater�
						">"
					�ENDIF�
					�IF a.smaller�
					 	 "<"
					�ENDIF�
					�IF a.greaterequals�
						 ">="
					�ENDIF�
					�IF a.smallerequals�
						"<="
					�ENDIF�
					�IF a.equals�
						"=="
					�ENDIF�
					�IF a.notequals�
						"!="
					�ENDIF�
				�ENDFOR�
				+ 
				�FOR v: entity.value�
					�IF v.value.startsWith("\"")�
						�v.value�
					�ELSE�
						"�v.value�"
					�ENDIF�
				�ENDFOR�
				+ "]"
				, actualState, acceptState));
				
				finalState = new State("q" + counter, StateType.FINAL);
				counter++;
				b.addTransition(new Transition(
				"[" + "�entity.context.name�.�entity.entity.name�.�entity.attribute.name� " +
				�FOR a: entity.operator�
					�IF a.greater�
						">"
					�ENDIF�
					�IF a.smaller�
					 	 "<"
					�ENDIF�
					�IF a.greaterequals�
						 ">="
					�ENDIF�
					�IF a.smallerequals�
						"<="
					�ENDIF�
					�IF a.equals�
						"=="
					�ENDIF�
					�IF a.notequals�
						"!="
					�ENDIF�
				�ENDFOR�
				+ 
				�FOR v: entity.value�
					�IF v.value.startsWith("\"")�
						�v.value�
					�ELSE�
						"�v.value�"
					�ENDIF�
				�ENDFOR�
				+ "]"
				, actualState, acceptState));
				b.addState(acceptState);
				b.addState(finalState);
				b.setFinale(finalState);
	'''
}