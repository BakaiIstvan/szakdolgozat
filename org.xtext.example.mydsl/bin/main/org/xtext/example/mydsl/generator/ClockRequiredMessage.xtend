package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.myDsl.Message

class ClockRequiredMessage {
	def compile_required_message(Message m)'''
		"�m.sender.name�" + "." +
		"�m.name�" + "("
		�FOR p: m.params�
			�FOR param: 0..<p.params.size�
				+ "�p.params.get(param).name�"
				�IF param != p.params.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		�FOR p: m.constantparams�
			�FOR param: 0..<p.values.size�
				+
				�IF p.values.get(param).value.startsWith("\"")�
					�p.values.get(param).value�
				�ELSE�
				"�p.values.get(param).value�"
				�ENDIF�
				�IF param != p.values.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
	'''


	def compile_clock_constraint(Message m)'''
		�IF m.CConstraint.rclockconstraint === null�
			�IF m.CConstraint.not�
				"!" + 
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.greater�
				"�m.CConstraint.lclockconstraint.clock.name� > �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.smaller�
			 	 "�m.CConstraint.lclockconstraint.clock.name� < �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.greaterequals�
				 "�m.CConstraint.lclockconstraint.clock.name� >= �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.smallerequals�
				"�m.CConstraint.lclockconstraint.clock.name� <= �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.equals�
				"�m.CConstraint.lclockconstraint.clock.name� == �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.notequals�
				"�m.CConstraint.lclockconstraint.clock.name� != �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
		�ELSE�
			�IF m.CConstraint.lclockconstraint.op.greater�
				"�m.CConstraint.lclockconstraint.clock.name� > �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.smaller�
			 	 "�m.CConstraint.lclockconstraint.clock.name� < �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.greaterequals�
				 "�m.CConstraint.lclockconstraint.clock.name� >= �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.smallerequals�
				"�m.CConstraint.lclockconstraint.clock.name� <= �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.equals�
				"�m.CConstraint.lclockconstraint.clock.name� == �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.notequals�
				"�m.CConstraint.lclockconstraint.clock.name� != �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			
			+ " & " + 
			
			�IF m.CConstraint.rclockconstraint.op.greater�
				"�m.CConstraint.rclockconstraint.clock.name� > �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.rclockconstraint.op.smaller�
			 	 "�m.CConstraint.rclockconstraint.clock.name� < �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.rclockconstraint.op.greaterequals�
				 "�m.CConstraint.rclockconstraint.clock.name� >= �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.rclockconstraint.op.smallerequals�
				"�m.CConstraint.rclockconstraint.clock.name� <= �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.rclockconstraint.op.equals�
				"�m.CConstraint.rclockconstraint.clock.name� == �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.rclockconstraint.op.notequals�
				"�m.CConstraint.rclockconstraint.clock.name� != �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
		�ENDIF�
	'''

	def compile_required_clock(Message m)'''
		b = new Automaton("auto31");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
		
		b.addTransition(new Transition("!(" + "�m.sender.name�" + "." +
		"�m.name�" + "("
		�FOR p: m.params�
			�FOR param: 0..<p.params.size�
				+ "�p.params.get(param).name�"
				�IF param != p.params.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		�FOR p: m.constantparams�
			�FOR param: 0..<p.values.size�
				+
				�IF p.values.get(param).value.startsWith("\"")�
					�p.values.get(param).value�
				�ELSE�
				"�p.values.get(param).value�"
				�ENDIF�
				�IF param != p.values.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		+ ")"
		
		+ "." + "�m.receiver.name�" + "), " +
		
		�IF m.CConstraint.rclockconstraint === null�
			�IF m.CConstraint.not�
				"!" + 
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.greater�
				"�m.CConstraint.lclockconstraint.clock.name� > �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.smaller�
			 	 "�m.CConstraint.lclockconstraint.clock.name� < �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.greaterequals�
				 "�m.CConstraint.lclockconstraint.clock.name� >= �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.smallerequals�
				"�m.CConstraint.lclockconstraint.clock.name� <= �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.equals�
				"�m.CConstraint.lclockconstraint.clock.name� == �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.notequals�
				"�m.CConstraint.lclockconstraint.clock.name� != �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
		�ELSE�
			�IF m.CConstraint.lclockconstraint.op.greater�
				"�m.CConstraint.lclockconstraint.clock.name� > �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.smaller�
			 	 "�m.CConstraint.lclockconstraint.clock.name� < �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.greaterequals�
				 "�m.CConstraint.lclockconstraint.clock.name� >= �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.smallerequals�
				"�m.CConstraint.lclockconstraint.clock.name� <= �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.equals�
				"�m.CConstraint.lclockconstraint.clock.name� == �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.notequals�
				"�m.CConstraint.lclockconstraint.clock.name� != �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			
			+ " & " + 
			
			�IF m.CConstraint.rclockconstraint.op.greater�
				"�m.CConstraint.rclockconstraint.clock.name� > �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.rclockconstraint.op.smaller�
			 	 "�m.CConstraint.rclockconstraint.clock.name� < �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.rclockconstraint.op.greaterequals�
				 "�m.CConstraint.rclockconstraint.clock.name� >= �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.rclockconstraint.op.smallerequals�
				"�m.CConstraint.rclockconstraint.clock.name� <= �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.rclockconstraint.op.equals�
				"�m.CConstraint.rclockconstraint.clock.name� == �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.rclockconstraint.op.notequals�
				"�m.CConstraint.rclockconstraint.clock.name� != �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
		�ENDIF�
		
		, actualState, actualState));
		
		acceptState = new State("q" + counter, StateType.ACCEPT);
		counter++;
		
		b.addTransition(new Transition("(" + "�m.sender.name�" + "." +
			"�m.name�" + "("
			�FOR p: m.params�
				�FOR param: 0..<p.params.size�
					+ "�p.params.get(param).name�"
					�IF param != p.params.size - 1�
						+ ", "
					�ENDIF�
				�ENDFOR�
			�ENDFOR�
			�FOR p: m.constantparams�
				�FOR param: 0..<p.values.size�
					+
					�IF p.values.get(param).value.startsWith("\"")�
						�p.values.get(param).value�
					�ELSE�
					"�p.values.get(param).value�"
					�ENDIF�
					�IF param != p.values.size - 1�
						+ ", "
					�ENDIF�
				�ENDFOR�
			�ENDFOR�
			+ ")"
			
			+ "." + "�m.receiver.name�, " + 
			
			"pre(" + �compile_clock_constraint(m)� +
			")) || (1, succ(" + �compile_clock_constraint(m)� + ")", actualState, acceptState));
		
		b.addState(acceptState);
		
		newState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("�m.sender.name�" + "." +
		"�m.name�" + "("
		�FOR p: m.params�
			�FOR param: 0..<p.params.size�
				+ "�p.params.get(param).name�"
				�IF param != p.params.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		�FOR p: m.constantparams�
			�FOR param: 0..<p.values.size�
				+
				�IF p.values.get(param).value.startsWith("\"")�
					�p.values.get(param).value�
				�ELSE�
				"�p.values.get(param).value�"
				�ENDIF�
				�IF param != p.values.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		+ ")"
		+ "." + "�m.receiver.name�, " +
		
		�IF m.CConstraint.rclockconstraint === null�
			�IF m.CConstraint.not�
				"!" + 
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.greater�
				"�m.CConstraint.lclockconstraint.clock.name� > �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.smaller�
			 	 "�m.CConstraint.lclockconstraint.clock.name� < �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.greaterequals�
				 "�m.CConstraint.lclockconstraint.clock.name� >= �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.smallerequals�
				"�m.CConstraint.lclockconstraint.clock.name� <= �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.equals�
				"�m.CConstraint.lclockconstraint.clock.name� == �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.notequals�
				"�m.CConstraint.lclockconstraint.clock.name� != �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
		�ELSE�
			�IF m.CConstraint.lclockconstraint.op.greater�
				"�m.CConstraint.lclockconstraint.clock.name� > �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.smaller�
			 	 "�m.CConstraint.lclockconstraint.clock.name� < �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.greaterequals�
				 "�m.CConstraint.lclockconstraint.clock.name� >= �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.smallerequals�
				"�m.CConstraint.lclockconstraint.clock.name� <= �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.equals�
				"�m.CConstraint.lclockconstraint.clock.name� == �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.lclockconstraint.op.notequals�
				"�m.CConstraint.lclockconstraint.clock.name� != �m.CConstraint.lclockconstraint.constant�"
			�ENDIF�
			
			+ " & " + 
			
			�IF m.CConstraint.rclockconstraint.op.greater�
				"�m.CConstraint.rclockconstraint.clock.name� > �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.rclockconstraint.op.smaller�
			 	 "�m.CConstraint.rclockconstraint.clock.name� < �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.rclockconstraint.op.greaterequals�
				 "�m.CConstraint.rclockconstraint.clock.name� >= �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.rclockconstraint.op.smallerequals�
				"�m.CConstraint.rclockconstraint.clock.name� <= �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.rclockconstraint.op.equals�
				"�m.CConstraint.rclockconstraint.clock.name� == �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
			�IF m.CConstraint.rclockconstraint.op.notequals�
				"�m.CConstraint.rclockconstraint.clock.name� != �m.CConstraint.rclockconstraint.constant�"
			�ENDIF�
		�ENDIF�
		
		�IF m.resetclock !== null�
			+ ", �m.resetclock.clock.name� := 0"
		�ENDIF�
		
		, actualState, newState));
		b.addState(newState);
		b.setFinale(newState);
	'''
	
	def compile_strict_required_clock(Message m)'''
		b = new Automaton("auto9");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		finalState = new State("q" + counter, StateType.FINAL);
		counter++;
		acceptState = new State("q" + counter, StateType.ACCEPT);
		counter++;
		b.addTransition(new Transition("�m.sender.name�" + "." +
		"�m.name�" + "("
		�FOR p: m.params�
			�FOR param: 0..<p.params.size�
				+ "�p.params.get(param).name�"
				�IF param != p.params.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		�FOR p: m.constantparams�
			�FOR param: 0..<p.values.size�
				+
				�IF p.values.get(param).value.startsWith("\"")�
					�p.values.get(param).value�
				�ELSE�
				"�p.values.get(param).value�"
				�ENDIF�
				�IF param != p.values.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		+ ")"
		+ "." + "�m.receiver.name�" + 
		
		�compile_clock_constraint(m)�
		
		�IF m.resetclock !== null�
			+ ", �m.resetclock.clock.name� := 0"
		�ENDIF�
		
		, actualState, finalState));
		b.addTransition(new Transition("!(" + "�m.sender.name�" + "." +
		"�m.name�" + "("
		�FOR p: m.params�
			�FOR param: 0..<p.params.size�
				+ "�p.params.get(param).name�"
				�IF param != p.params.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		�FOR p: m.constantparams�
			�FOR param: 0..<p.values.size�
				+
				�IF p.values.get(param).value.startsWith("\"")�
					�p.values.get(param).value�
				�ELSE�
				"�p.values.get(param).value�"
				�ENDIF�
				�IF param != p.values.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		+ ")"
		+ "." + "�m.receiver.name�" + "), " + �compile_clock_constraint(m)�
		+ " || (" + �compile_required_message(m)� +", pre(" + �compile_clock_constraint(m)� + ")) || (1, succ(" + �compile_clock_constraint(m)� + "))"
		
		, actualState, acceptState));
		b.addState(acceptState);
		b.addState(finalState);
		b.setFinale(finalState);
	'''
	
	def compile_required_past_clock(Message m)'''
		b = new Automaton("auto2");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
		
											
		b.addTransition(new Transition("!(" + "�m.sender.name�" + "." +
		"�m.name�" + "("
		�FOR p: m.params�
			�FOR param: 0..<p.params.size�
				+ "�p.params.get(param).name�"
				�IF param != p.params.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		�FOR p: m.constantparams�
			�FOR param: 0..<p.values.size�
				+
				�IF p.values.get(param).value.startsWith("\"")�
					�p.values.get(param).value�
				�ELSE�
				"�p.values.get(param).value�"
				�ENDIF�
				�IF param != p.values.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		+ ")"
		+ "." + "�m.receiver.name�), " + �compile_clock_constraint(m)� + " & " + str + ")", actualState, actualState));
		acceptState = new State("q" + counter, StateType.ACCEPT);
		counter++;
		finalState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("�m.sender.name�" + "." +
		"�m.name�" + "("
		�FOR p: m.params�
			�FOR param: 0..<p.params.size�
				+ "�p.params.get(param).name�"
				�IF param != p.params.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		�FOR p: m.constantparams�
			�FOR param: 0..<p.values.size�
				+
				�IF p.values.get(param).value.startsWith("\"")�
					�p.values.get(param).value�
				�ELSE�
				"�p.values.get(param).value�"
				�ENDIF�
				�IF param != p.values.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		+ ")"
		+ "." + "�m.receiver.name�, " + 
		
		�compile_clock_constraint(m)�
		
		�IF m.resetclock !== null�
			+ ", �m.resetclock.clock.name� := 0"
		�ENDIF�
		
		, actualState, finalState));
		b.addTransition(new Transition("(!" + "(" + str + "), " + �compile_clock_constraint(m)� + ") || " + "(" + "�m.sender.name�" + "." +
			"�m.name�" + "("
			�FOR p: m.params�
				�FOR param: 0..<p.params.size�
					+ "�p.params.get(param).name�"
					�IF param != p.params.size - 1�
						+ ", "
					�ENDIF�
				�ENDFOR�
			�ENDFOR�
			�FOR p: m.constantparams�
				�FOR param: 0..<p.values.size�
					+
					�IF p.values.get(param).value.startsWith("\"")�
						�p.values.get(param).value�
					�ELSE�
					"�p.values.get(param).value�"
					�ENDIF�
					�IF param != p.values.size - 1�
						+ ", "
					�ENDIF�
				�ENDFOR�
			�ENDFOR�
			+ ")"
			+ "." + "�m.receiver.name�, pre(" + �compile_clock_constraint(m)� + ")) || (1, succ(" + �compile_clock_constraint(m)� + "))", actualState, acceptState));
				
		b.addState(acceptState);
		b.addState(finalState);
		b.setFinale(finalState);
	'''
	
	def compile_required_future_clock(Message m)'''
		b = new Automaton("auto1");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		b.addTransition(new Transition("!(" + "�m.sender.name�" + "." +
		"�m.name�" + "("
		�FOR p: m.params�
			�FOR param: 0..<p.params.size�
				+ "�p.params.get(param).name�"
				�IF param != p.params.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		�FOR p: m.constantparams�
			�FOR param: 0..<p.values.size�
				+
				�IF p.values.get(param).value.startsWith("\"")�
					�p.values.get(param).value�
				�ELSE�
				"�p.values.get(param).value�"
				�ENDIF�
				�IF param != p.values.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		+ ")"
		+ "." + "�m.receiver.name�" + "), " + �compile_clock_constraint(m)�, actualState, actualState));
		finalState = new State("q" + counter, StateType.FINAL);
		counter++;
		acceptState = new State("q" + counter, StateType.ACCEPT);
		counter++;
		acceptState_new = new State("q" + counter, StateType.ACCEPT);
		counter++;
		
		b.addTransition(new Transition("�m.sender.name�" + "." +
			"�m.name�" + "("
			�FOR p: m.params�
				�FOR param: 0..<p.params.size�
					+ "�p.params.get(param).name�"
					�IF param != p.params.size - 1�
						+ ", "
					�ENDIF�
				�ENDFOR�
			�ENDFOR�
			�FOR p: m.constantparams�
				�FOR param: 0..<p.values.size�
					+
					�IF p.values.get(param).value.startsWith("\"")�
						�p.values.get(param).value�
					�ELSE�
					"�p.values.get(param).value�"
					�ENDIF�
					�IF param != p.values.size - 1�
						+ ", "
					�ENDIF�
				�ENDFOR�
			�ENDFOR�
			+ ")"
			+ "." + "�m.receiver.name�, pre(" + �compile_clock_constraint(m)� + ") || 1, succ(" + �compile_clock_constraint(m)� + ")", actualState, acceptState_new));
		
		b.addTransition(new Transition("�m.sender.name�" + "." +
		"�m.name�" + "("
		�FOR p: m.params�
			�FOR param: 0..<p.params.size�
				+ "�p.params.get(param).name�"
				�IF param != p.params.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		�FOR p: m.constantparams�
			�FOR param: 0..<p.values.size�
				+
				�IF p.values.get(param).value.startsWith("\"")�
					�p.values.get(param).value�
				�ELSE�
				"�p.values.get(param).value�"
				�ENDIF�
				�IF param != p.values.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		+ ")"
		+ "." + "�m.receiver.name�, " + �compile_clock_constraint(m)�
		
		�IF m.resetclock !== null�
			+ ", �m.resetclock.clock.name� := 0"
		�ENDIF�
		
		, actualState, finalState));
		b.addTransition(new Transition(str, finalState, finalState));
		b.addTransition(new Transition("!" + "(" + str + ")", finalState, acceptState));
		b.addState(acceptState);
		b.addState(acceptState_new);
		b.addState(finalState);
		b.setFinale(finalState);
	'''
	
	def compile_strict_required_future_clock(Message m)'''
		b = new Automaton("auto1");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		finalState = new State("q" + counter, StateType.FINAL);
		counter++;
		acceptState = new State("q" + counter, StateType.ACCEPT);
		counter++;
		acceptState_new = new State("q" + counter, StateType.ACCEPT);
		counter++;
		
		b.addTransition(new Transition("�m.sender.name�" + "." +
			"�m.name�" + "("
			�FOR p: m.params�
				�FOR param: 0..<p.params.size�
					+ "�p.params.get(param).name�"
					�IF param != p.params.size - 1�
						+ ", "
					�ENDIF�
				�ENDFOR�
			�ENDFOR�
			�FOR p: m.constantparams�
				�FOR param: 0..<p.values.size�
					+
					�IF p.values.get(param).value.startsWith("\"")�
						�p.values.get(param).value�
					�ELSE�
					"�p.values.get(param).value�"
					�ENDIF�
					�IF param != p.values.size - 1�
						+ ", "
					�ENDIF�
				�ENDFOR�
			�ENDFOR�
			+ ")"
			+ "." + "�m.receiver.name�, pre(" + �compile_clock_constraint(m)� + ") || 1, succ(" + �compile_clock_constraint(m)� + ") || "
			
			+ "!(" + �compile_required_message(m)� + "), " + �compile_clock_constraint(m)� 
			
			, actualState, acceptState_new));
		
		b.addTransition(new Transition("�m.sender.name�" + "." +
		"�m.name�" + "("
		�FOR p: m.params�
			�FOR param: 0..<p.params.size�
				+ "�p.params.get(param).name�"
				�IF param != p.params.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		�FOR p: m.constantparams�
			�FOR param: 0..<p.values.size�
				+
				�IF p.values.get(param).value.startsWith("\"")�
					�p.values.get(param).value�
				�ELSE�
				"�p.values.get(param).value�"
				�ENDIF�
				�IF param != p.values.size - 1�
					+ ", "
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		+ ")"
		+ "." + "�m.receiver.name�, " + �compile_clock_constraint(m)�
		
		�IF m.resetclock !== null�
			+ ", �m.resetclock.clock.name� := 0"
		�ENDIF�
		
		, actualState, finalState));
		b.addTransition(new Transition(str, finalState, finalState));
		b.addTransition(new Transition("!" + "(" + str + ")", finalState, acceptState));
		b.addState(acceptState);
		b.addState(acceptState_new);
		b.addState(finalState);
		b.setFinale(finalState);
	'''
}