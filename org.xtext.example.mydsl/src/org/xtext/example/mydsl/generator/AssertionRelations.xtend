package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.myDsl.AssertionRelation

class AssertionRelations {
	def compile_assertion_relation(AssertionRelation relation)'''
		b = new Automaton("auto14");
				actualState = new State("q" + counter, StateType.NORMAL);
				counter++;
				b.addState(actualState);
				b.setInitial(actualState);
				
				acceptState = new State("q" + counter, StateType.ACCEPT_ALL);
				counter++;
						b.addTransition(new Transition("1", acceptState, acceptState));
						b.addTransition(new Transition("!" +
						"[" + "�relation.context.name�.�relation.relation.name�.�relation.attribute.name� " +
						�FOR a: relation.operator�
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
						�FOR v: relation.value�
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
						"[" + "�relation.context.name�.�relation.relation.name�.�relation.attribute.name� " +
						�FOR a: relation.operator�
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
						�FOR v: relation.value�
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