package org.xtext.example.mydsl.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class AutomatonGenerator extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("Automaton.java", 
			'''
				import java.util.ArrayList;
				
				public class Automaton {
				    private String id;
				    private ArrayList<State> states;
				    private ArrayList<Transition> transitions;
				    private State initial;
				    private State finale;
				
				    public Automaton(String id) {
				        this.id = id;
				        this.states = new ArrayList<>();
				        this.transitions = new ArrayList<>();
				    }
				    
				    public void setFinale(State state){
				        this.finale = state;
				    }
				    
				    public State getFinale(){
				        return this.finale;
				    }
				    
				    public void setInitial(State state){
				    	this.initial = state;
				    }
				    
				    public State getInitial(){
				    	return this.initial;
				    }	
				    
				    public ArrayList<State> getStates(){
				    	return states;
				    }
				    
				    public ArrayList<Transition> getTransitions(){
				    	return transitions;
				    }
				
				    public String getId() {
				        return id;
				    }
				
				    public void setId(String id) {
				        this.id = id;
				    }
				
				    public void addState(State newState){
				        states.add(newState);
				    }
				    
				    public void rename(){
				       int counter = 0;
				       int _counter = 0;
				       for(State s : this.states) {
				       	if(s.getId().equals("qinit") || s.getId().equals("qfinal") || s.getId().equals("qaccepting")){
				       		s.setId(s.getId() + _counter);
				       		_counter++;
				       	}else{
				         	s.setId("q" + counter);
				         	counter++;
				         }
				       }  
				    }
				    
				    public ArrayList<Transition> findSender(State state){
				    	ArrayList<Transition> senderTransitions = new ArrayList<Transition>();
				    	for(Transition t : this.transitions){
				    		if(t.getSender().getId().equals(state.getId()))
				    			senderTransitions.add(t);
				    	}	
				    	return senderTransitions;
				    }
				    
				    public ArrayList<Transition> findReceiver(State state){
				       ArrayList<Transition> receiverTransitions = new ArrayList<Transition>();
				       for(Transition t : this.transitions){
				       	 if(t.getReceiver().getId().equals(state.getId()))
				            receiverTransitions.add(t);
				         }
				       return receiverTransitions;
				     }
				     			
				    public void addTransition(Transition newTransition){
				   		if(transitions.isEmpty()){
				   			transitions.add(newTransition);
				   		    return;
				   		}
				   		        
				   		for(Transition t : transitions){
				   			if(t.getId().equals(newTransition.getId()) 
				   		    	&& t.getSender().equals(newTransition.getSender()) 
				   		        && t.getReceiver().equals(newTransition.getReceiver()))
				   		        	return;
				   		}
				   		        
				   		transitions.add(newTransition);
				   }
				   
				   public void collapse(Automaton automaton){
				           if(this.states.isEmpty() && this.transitions.isEmpty()){
				               for (State s : automaton.states)
				                   this.addState(s);
				               
				   
				               for (Transition t : automaton.transitions)
				                   this.addTransition(t);
				                   
				               this.initial = automaton.initial;
				               this.finale = automaton.finale;
				               
				           }else {
				               ArrayList<Transition> receive = findReceiver(this.finale);
				               ArrayList<Transition> send = findSender(this.finale);
				   
				               for (State s : automaton.states) 
				                   this.addState(s);
				               
				   
				               for (Transition t : automaton.transitions) 
				                   this.addTransition(t);
				               
				   
				               for (Transition t : receive) 
				                   t.setReceiver(automaton.initial);
				               
				   
				               for (Transition t : send) 
				                   t.setSender(automaton.initial);
				               
				   
				               this.states.remove(finale);
				               this.finale = automaton.finale;
				           }
				   }
				   public void merge(ArrayList<Automaton> automatas){
				   
				           State qinit = new State("qinit", StateType.NORMAL);
				           State qfinal = new State("qfinal", StateType.FINAL);
				           
				           if(this.states.isEmpty() && this.transitions.isEmpty()){
				               this.initial = qinit;
				           }else{
				               this.addTransition(new Transition("epsilon", this.finale, qinit));
				           }
				   
				           this.addState(qinit);
				           this.addState(qfinal);
				           this.finale = qfinal;
				           
				           State qaccepting = new State("qaccepting", StateType.ACCEPT_ALL);
				           this.addState(qaccepting);
				   
				           for (Automaton a : automatas) {
				               for (Transition t : a.transitions)
				                   this.addTransition(t);
				   
				   
				               for (State s : a.states) {
				                   this.addState(s);
				                   if (s.getType().equals(StateType.FINAL))
				                       this.addTransition(new Transition("epsilon", s, qfinal));
				                   if (s.getType().equals(StateType.ACCEPT_ALL))
				                       this.addTransition(new Transition("epsilon", s, qaccepting));
				               }
				               this.addTransition(new Transition("epsilon", qinit, a.initial));
				           }
				           
				    }
				}
			''')
	}
	
}