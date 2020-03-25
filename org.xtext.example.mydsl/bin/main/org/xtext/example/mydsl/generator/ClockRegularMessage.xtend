package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.myDsl.Message

class ClockRegularMessage {

	def compile_msg_clock(Message m)'''
		b = new Automaton("auto30");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		b.addTransition(new Transition("!(" + "«m.sender.name»" + "." +	
			"«m.name»" + "("
			«FOR p: m.params»
				«FOR param: 0..<p.params.size»
					+ "«p.params.get(param).name»"
					«IF param != p.params.size - 1»
						+ ", "
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			«FOR p: m.constantparams»
				«FOR param: 0..<p.values.size»
					+
					«IF p.values.get(param).value.startsWith("\"")»
						«p.values.get(param).value»
					«ELSE»
					"«p.values.get(param).value»"
					«ENDIF»
					«IF param != p.values.size - 1»
						+ ", "
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			+ ")"
			
			+ "." + "«m.receiver.name»), " + 
			
			«IF m.CConstraint.rclockconstraint === null»
				«IF m.CConstraint.not»
					"!" + 
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.greater»
					"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.smaller»
				 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.greaterequals»
					 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.smallerequals»
					"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.equals»
					"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.notequals»
					"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
			«ELSE»
				«IF m.CConstraint.lclockconstraint.op.greater»
					"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.smaller»
				 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.greaterequals»
					 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.smallerequals»
					"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.equals»
					"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.notequals»
					"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				
				+ " & " + 
				
				«IF m.CConstraint.rclockconstraint.op.greater»
					"«m.CConstraint.rclockconstraint.clock.name» > «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.rclockconstraint.op.smaller»
				 	 "«m.CConstraint.rclockconstraint.clock.name» < «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.rclockconstraint.op.greaterequals»
					 "«m.CConstraint.rclockconstraint.clock.name» >= «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.rclockconstraint.op.smallerequals»
					"«m.CConstraint.rclockconstraint.clock.name» <= «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.rclockconstraint.op.equals»
					"«m.CConstraint.rclockconstraint.clock.name» == «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.rclockconstraint.op.notequals»
					"«m.CConstraint.rclockconstraint.clock.name» != «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
			«ENDIF»
			
			, actualState, actualState));
		
		newState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("«m.sender.name»" + "." +
		
		"«m.name»" + "("
		«FOR p: m.params»
			«FOR param: 0..<p.params.size»
				+ "«p.params.get(param).name»"
				«IF param != p.params.size - 1»
					+ ", "
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		«FOR p: m.constantparams»
			«FOR param: 0..<p.values.size»
				+
				«IF p.values.get(param).value.startsWith("\"")»
					«p.values.get(param).value»
				«ELSE»
				"«p.values.get(param).value»"
				«ENDIF»
				«IF param != p.values.size - 1»
					+ ", "
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		+ ")"
		
		+ "." + "«m.receiver.name», " +
		
		«IF m.CConstraint.rclockconstraint === null»
			«IF m.CConstraint.not»
				"!" + 
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.greater»
				"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smaller»
			 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.greaterequals»
				 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smallerequals»
				"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.equals»
				"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.notequals»
				"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
		«ELSE»
			«IF m.CConstraint.lclockconstraint.op.greater»
				"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smaller»
			 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.greaterequals»
				 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smallerequals»
				"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.equals»
				"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.notequals»
				"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			
			+ " & " + 
			
			«IF m.CConstraint.rclockconstraint.op.greater»
				"«m.CConstraint.rclockconstraint.clock.name» > «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.smaller»
			 	 "«m.CConstraint.rclockconstraint.clock.name» < «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.greaterequals»
				 "«m.CConstraint.rclockconstraint.clock.name» >= «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.smallerequals»
				"«m.CConstraint.rclockconstraint.clock.name» <= «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.equals»
				"«m.CConstraint.rclockconstraint.clock.name» == «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.notequals»
				"«m.CConstraint.rclockconstraint.clock.name» != «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
		«ENDIF»
		
		«IF m.resetclock !== null»
			+ ", «m.resetclock.clock.name» := 0"
		«ENDIF»
		
		 , actualState, newState));
		b.addState(newState);
		b.setFinale(newState);
	'''
	
	def compile_strict_clock(Message m)'''
		b = new Automaton("auto12");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
												
		newState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("«m.sender.name»" + "." +
		"«m.name»" + "("
		«FOR p: m.params»
			«FOR param: 0..<p.params.size»
				+ "«p.params.get(param).name»"
				«IF param != p.params.size - 1»
					+ ", "
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		«FOR p: m.constantparams»
			«FOR param: 0..<p.values.size»
				+
				«IF p.values.get(param).value.startsWith("\"")»
					«p.values.get(param).value»
				«ELSE»
				"«p.values.get(param).value»"
				«ENDIF»
				«IF param != p.values.size - 1»
					+ ", "
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		+ ")"
		+ "." + "«m.receiver.name»" +
		
		«IF m.CConstraint.rclockconstraint === null»
			«IF m.CConstraint.not»
				"!" + 
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.greater»
				"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smaller»
			 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.greaterequals»
				 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smallerequals»
				"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.equals»
				"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.notequals»
				"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
		«ELSE»
			«IF m.CConstraint.lclockconstraint.op.greater»
				"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smaller»
			 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.greaterequals»
				 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smallerequals»
				"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.equals»
				"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.notequals»
				"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			
			+ " & " + 
			
			«IF m.CConstraint.rclockconstraint.op.greater»
				"«m.CConstraint.rclockconstraint.clock.name» > «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.smaller»
			 	 "«m.CConstraint.rclockconstraint.clock.name» < «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.greaterequals»
				 "«m.CConstraint.rclockconstraint.clock.name» >= «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.smallerequals»
				"«m.CConstraint.rclockconstraint.clock.name» <= «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.equals»
				"«m.CConstraint.rclockconstraint.clock.name» == «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.notequals»
				"«m.CConstraint.rclockconstraint.clock.name» != «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
		«ENDIF»
		
		«IF m.resetclock !== null»
			+ ", «m.resetclock.clock.name» := 0"
		«ENDIF»
		
		, actualState, newState));
		b.addState(newState);
		b.setFinale(newState);
	'''
	
	def compile_past_clock(Message m)'''
		b = new Automaton("auto7");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
												
		b.addTransition(new Transition(str + " & " + "!(" + "«m.sender.name»" + "." +	
			"«m.name»" + "("
			«FOR p: m.params»
				«FOR param: 0..<p.params.size»
					+ "«p.params.get(param).name»"
					«IF param != p.params.size - 1»
						+ ", "
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			«FOR p: m.constantparams»
				«FOR param: 0..<p.values.size»
					+
					«IF p.values.get(param).value.startsWith("\"")»
						«p.values.get(param).value»
					«ELSE»
					"«p.values.get(param).value»"
					«ENDIF»
					«IF param != p.values.size - 1»
						+ ", "
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			+ ")"
			
			+ "." + "«m.receiver.name»), " + 
			
			«IF m.CConstraint.rclockconstraint === null»
				«IF m.CConstraint.not»
					"!" + 
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.greater»
					"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.smaller»
				 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.greaterequals»
					 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.smallerequals»
					"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.equals»
					"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.notequals»
					"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
			«ELSE»
				«IF m.CConstraint.lclockconstraint.op.greater»
					"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.smaller»
				 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.greaterequals»
					 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.smallerequals»
					"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.equals»
					"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.notequals»
					"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				
				+ " & " + 
				
				«IF m.CConstraint.rclockconstraint.op.greater»
					"«m.CConstraint.rclockconstraint.clock.name» > «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.rclockconstraint.op.smaller»
				 	 "«m.CConstraint.rclockconstraint.clock.name» < «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.rclockconstraint.op.greaterequals»
					 "«m.CConstraint.rclockconstraint.clock.name» >= «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.rclockconstraint.op.smallerequals»
					"«m.CConstraint.rclockconstraint.clock.name» <= «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.rclockconstraint.op.equals»
					"«m.CConstraint.rclockconstraint.clock.name» == «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.rclockconstraint.op.notequals»
					"«m.CConstraint.rclockconstraint.clock.name» != «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
			«ENDIF»
			
			, actualState, actualState));
						
		newState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("«m.sender.name»" + "." +
		"«m.name»" + "("
		«FOR p: m.params»
			«FOR param: 0..<p.params.size»
				+ "«p.params.get(param).name»"
			«ENDFOR»
		«ENDFOR»
		«FOR p: m.constantparams»
			«FOR param: 0..<p.values.size»
				+
				«IF p.values.get(param).value.startsWith("\"")»
					«p.values.get(param).value»
				«ELSE»
				"«p.values.get(param).value»"
				«ENDIF»
				«IF param != p.values.size - 1»
					+ ", "
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		+ ")"
		+ "." + "«m.receiver.name»" + 
		
		«IF m.CConstraint.rclockconstraint === null»
			«IF m.CConstraint.not»
				"!" + 
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.greater»
				"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smaller»
			 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.greaterequals»
				 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smallerequals»
				"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.equals»
				"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.notequals»
				"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
		«ELSE»
			«IF m.CConstraint.lclockconstraint.op.greater»
				"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smaller»
			 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.greaterequals»
				 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smallerequals»
				"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.equals»
				"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.notequals»
				"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			
			+ " & " + 
			
			«IF m.CConstraint.rclockconstraint.op.greater»
				"«m.CConstraint.rclockconstraint.clock.name» > «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.smaller»
			 	 "«m.CConstraint.rclockconstraint.clock.name» < «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.greaterequals»
				 "«m.CConstraint.rclockconstraint.clock.name» >= «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.smallerequals»
				"«m.CConstraint.rclockconstraint.clock.name» <= «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.equals»
				"«m.CConstraint.rclockconstraint.clock.name» == «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.notequals»
				"«m.CConstraint.rclockconstraint.clock.name» != «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
		«ENDIF»
		
		«IF m.resetclock !== null»
			+ ", «m.resetclock.clock.name» := 0"
		«ENDIF»
		
		, actualState, newState));
		b.addState(newState);
		b.setFinale(newState);
	'''

	def compile_future_clock(Message m)'''
		b = new Automaton("auto30");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		b.addTransition(new Transition("!(" + "«m.sender.name»" + "." +	
			"«m.name»" + "("
			«FOR p: m.params»
				«FOR param: 0..<p.params.size»
					+ "«p.params.get(param).name»"
					«IF param != p.params.size - 1»
						+ ", "
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			«FOR p: m.constantparams»
				«FOR param: 0..<p.values.size»
					+
					«IF p.values.get(param).value.startsWith("\"")»
						«p.values.get(param).value»
					«ELSE»
					"«p.values.get(param).value»"
					«ENDIF»
					«IF param != p.values.size - 1»
						+ ", "
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			+ ")"
			
			+ "." + "«m.receiver.name»), " + 
			
			«IF m.CConstraint.rclockconstraint === null»
				«IF m.CConstraint.not»
					"!" + 
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.greater»
					"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.smaller»
				 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.greaterequals»
					 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.smallerequals»
					"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.equals»
					"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.notequals»
					"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
			«ELSE»
				«IF m.CConstraint.lclockconstraint.op.greater»
					"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.smaller»
				 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.greaterequals»
					 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.smallerequals»
					"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.equals»
					"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.lclockconstraint.op.notequals»
					"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
				«ENDIF»
				
				+ " & " + 
				
				«IF m.CConstraint.rclockconstraint.op.greater»
					"«m.CConstraint.rclockconstraint.clock.name» > «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.rclockconstraint.op.smaller»
				 	 "«m.CConstraint.rclockconstraint.clock.name» < «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.rclockconstraint.op.greaterequals»
					 "«m.CConstraint.rclockconstraint.clock.name» >= «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.rclockconstraint.op.smallerequals»
					"«m.CConstraint.rclockconstraint.clock.name» <= «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.rclockconstraint.op.equals»
					"«m.CConstraint.rclockconstraint.clock.name» == «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
				«IF m.CConstraint.rclockconstraint.op.notequals»
					"«m.CConstraint.rclockconstraint.clock.name» != «m.CConstraint.rclockconstraint.constant»"
				«ENDIF»
			«ENDIF»
			
			, actualState, actualState));
		
		newState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition(str + " & " + "«m.sender.name»" + "." +
		"«m.name»" + "("
		«FOR p: m.params»
			«FOR param: 0..<p.params.size»
				+ "«p.params.get(param).name»"
				«IF param != p.params.size - 1»
					+ ", "
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		«FOR p: m.constantparams»
			«FOR param: 0..<p.values.size»
				+
				«IF p.values.get(param).value.startsWith("\"")»
					«p.values.get(param).value»
				«ELSE»
				"«p.values.get(param).value»"
				«ENDIF»
				«IF param != p.values.size - 1»
					+ ", "
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		+ ")"
		
		+ "." + "«m.receiver.name», " +
		
		«IF m.CConstraint.rclockconstraint === null»
			«IF m.CConstraint.not»
				"!" + 
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.greater»
				"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smaller»
			 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.greaterequals»
				 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smallerequals»
				"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.equals»
				"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.notequals»
				"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
		«ELSE»
			«IF m.CConstraint.lclockconstraint.op.greater»
				"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smaller»
			 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.greaterequals»
				 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smallerequals»
				"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.equals»
				"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.notequals»
				"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			
			+ " & " + 
			
			«IF m.CConstraint.rclockconstraint.op.greater»
				"«m.CConstraint.rclockconstraint.clock.name» > «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.smaller»
			 	 "«m.CConstraint.rclockconstraint.clock.name» < «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.greaterequals»
				 "«m.CConstraint.rclockconstraint.clock.name» >= «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.smallerequals»
				"«m.CConstraint.rclockconstraint.clock.name» <= «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.equals»
				"«m.CConstraint.rclockconstraint.clock.name» == «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.notequals»
				"«m.CConstraint.rclockconstraint.clock.name» != «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
		«ENDIF»
		
		«IF m.resetclock !== null»
			+ ", «m.resetclock.clock.name» := 0"
		«ENDIF»
		
		 , actualState, newState));
		b.addState(newState);
		b.setFinale(newState);
	'''
	
	def compile_future_strict_clock(Message m)'''
		b = new Automaton("auto12");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
												
		newState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition(str + " & " + "«m.sender.name»" + "." +
		"«m.name»" + "("
		«FOR p: m.params»
			«FOR param: 0..<p.params.size»
				+ "«p.params.get(param).name»"
				«IF param != p.params.size - 1»
					+ ", "
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		«FOR p: m.constantparams»
			«FOR param: 0..<p.values.size»
				+
				«IF p.values.get(param).value.startsWith("\"")»
					«p.values.get(param).value»
				«ELSE»
				"«p.values.get(param).value»"
				«ENDIF»
				«IF param != p.values.size - 1»
					+ ", "
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		+ ")"
		+ "." + "«m.receiver.name»" +
		
		«IF m.CConstraint.rclockconstraint === null»
			«IF m.CConstraint.not»
				"!" + 
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.greater»
				"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smaller»
			 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.greaterequals»
				 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smallerequals»
				"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.equals»
				"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.notequals»
				"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
		«ELSE»
			«IF m.CConstraint.lclockconstraint.op.greater»
				"«m.CConstraint.lclockconstraint.clock.name» > «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smaller»
			 	 "«m.CConstraint.lclockconstraint.clock.name» < «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.greaterequals»
				 "«m.CConstraint.lclockconstraint.clock.name» >= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.smallerequals»
				"«m.CConstraint.lclockconstraint.clock.name» <= «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.equals»
				"«m.CConstraint.lclockconstraint.clock.name» == «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.lclockconstraint.op.notequals»
				"«m.CConstraint.lclockconstraint.clock.name» != «m.CConstraint.lclockconstraint.constant»"
			«ENDIF»
			
			+ " & " + 
			
			«IF m.CConstraint.rclockconstraint.op.greater»
				"«m.CConstraint.rclockconstraint.clock.name» > «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.smaller»
			 	 "«m.CConstraint.rclockconstraint.clock.name» < «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.greaterequals»
				 "«m.CConstraint.rclockconstraint.clock.name» >= «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.smallerequals»
				"«m.CConstraint.rclockconstraint.clock.name» <= «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.equals»
				"«m.CConstraint.rclockconstraint.clock.name» == «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
			«IF m.CConstraint.rclockconstraint.op.notequals»
				"«m.CConstraint.rclockconstraint.clock.name» != «m.CConstraint.rclockconstraint.constant»"
			«ENDIF»
		«ENDIF»
		
		«IF m.resetclock !== null»
			+ ", «m.resetclock.clock.name» := 0"
		«ENDIF»
		
		, actualState, newState));
		b.addState(newState);
		b.setFinale(newState);
	'''
	
}