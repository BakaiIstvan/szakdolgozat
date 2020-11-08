package org.xtext.example.mydsl.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class IMonitorGenerator extends AbstractGenerator {
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("IMonitor.java",
			'''
				public interface IMonitor {
					public boolean goodStateReached();
					public void update(String sender, String receiver, String messageType, String[] parameters);
					public boolean requirementSatisfied();
					public void errorDetected(String sender, String receiver, String messageType, String[] parameters);
				}

			''')
			
			fsa.generateFile("Monitor.java",
				'''
				import java.util.ArrayList;
				import java.util.Arrays;
				import java.util.List;
				
				public class Monitor implements IMonitor {
					private Automaton automaton;
					private State actualState;
					private List<State> goodStates;
					
					public Monitor(Automaton automaton) {
						this.automaton = automaton;
						this.actualState = automaton.getInitial();
						this.goodStates = new ArrayList<State>();
						this.goodStates.add(automaton.getFinale());
					}
					
					@Override
					public boolean goodStateReached() {
						return this.goodStates.contains(actualState);
					}
				
					@Override
					public void update(String sender, String receiver, String messageType, String[] parameters) {
						List<Transition> transitions = automaton.findSender(this.actualState);
						for (Transition transition : transitions) {
							if (!transition.getId().contains("!")
						     && transition.getMessageType().equals(messageType)
						     && transition.getSenderName().equals(sender)
						     && transition.getReceiverName().equals(receiver)
						     && Arrays.equals(transition.getParameters(), parameters)) {
				
								this.actualState = transition.getReceiver();
								System.out.println("transition: " + transition.getId());
								break;
							} else if (transition.getId().contains("!")
									&& (!transition.getMessageType().equals(messageType)
									|| !transition.getSenderName().equals(sender)
									|| !transition.getReceiverName().equals(receiver)
									|| !Arrays.equals(transition.getParameters(), parameters))) {
				
								this.actualState = transition.getReceiver();
								System.out.println("transition: " + transition.getId());
								break;
							}
						}
						
						System.out.println(actualState.getId());
						
						if (goodStateReached()) {
							Main.monitorStatus("System is in good state.");
						} else {
							Main.monitorStatus("System is in bad state.");
						}
					}
				
					@Override
					public boolean requirementSatisfied() {
						return this.actualState == this.automaton.getFinale();
					}
				
					@Override
					public void errorDetected(String sender, String receiver, String messageType, String[] parameters) {
						// TODO Auto-generated method stub
						
					}
				
				}
				''')
	}
}