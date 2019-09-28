/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.myDsl.Scenario
import org.xtext.example.mydsl.myDsl.Domain
import org.xtext.example.mydsl.myDsl.Message

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("State.java", 
			'''
				public class State {
				    private String id;
				    private StateType type;
				
				    public State() {
				        this.id = "q0";
				        this.type = StateType.NORMAL;
				    }
				
				    public State(String id, StateType stateType) {
				        this.id = id;
				        this.type = stateType;
				    }
				
				    public String getId() {
				        return id;
				    }
				
				    public StateType getType() {
				        return type;
				    }
				
				    public void setType(StateType type) {
				        this.type = type;
				    }
				
				    public void setId(String id) {
				        this.id = id;
				    }
				    
				    public void writeState(){
				    	System.out.println(this.id + " " + this.type);
				    }
				}
			''')
		
		fsa.generateFile("StateType.java",
			'''
				public enum StateType {
				    NORMAL, ACCEPT, FINAL, ACCEPT_ALL
				}
				
			''')
			
		fsa.generateFile("Transition.java",
			'''
				public class Transition {
				    private String id;
				    private State sender;
				    private State receiver;
				    
				    public Transition() {
				            this.id = "t0";
				            this.sender = new State();
				            this.receiver = new State();
				    }
				
				    public Transition(String id, State sender, State receiver) {
				    	if(id.equals("1")){
				    		this.id = "true";
				    	}else{
				        	this.id = id;
				        }
				        this.sender = sender;
				        this.receiver = receiver;
				    }
				
				    public String getId() {
				        return id;
				    }
				
				    public State getSender() {
				        return sender;
				    }
				
				    public State getReceiver() {
				        return receiver;
				    }
				
				    public void setReceiver(State receiver) {
				        this.receiver = receiver;
				    }
				
				    public void setSender(State sender) {
				        this.sender = sender;
				    }
				
				    public void setId(String id) {
				        if(id.equals("1")){
				        	this.id = "true";
				        }else{
				        	this.id = id;
				        }
				    }
				    
				    public void writeTransition(){
				    	System.out.println(this.id + " " + this.sender.getId() + "->" + this.receiver.getId());
				    }
				}
			''')
			
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
		for(s : resource.allContents.toIterable.filter(Domain)){
			fsa.generateFile("Specification.java", s.compile)
		}
	}
	
	def compile(Domain s) '''
		import java.io.FileNotFoundException;
		import java.io.PrintWriter;
		import java.io.UnsupportedEncodingException;
		import java.util.ArrayList;
		
		public class Specification{
			private String id = "�s.name�";
			private ArrayList<Automaton> automatas;
			
			public Specification(){
				automatas = new ArrayList<Automaton>();
				String str;
				State actualState;
				State acceptState;
				State finalState;
				State newState;
				State acceptState_new;
				�FOR scenario:s.scenarios�
					Automaton a = new Automaton("�scenario.name�");
					Automaton b;
					ArrayList<Automaton> altauto;
					ArrayList<Automaton> parauto;
					Automaton loopauto;
					Automaton expression;
					int counter = 0;
					
					�FOR sc : scenario.scenariocontents�
						�FOR l :sc.loop�
							loopauto = new Automaton("loopauto" + counter);
							�FOR m : l.messages�
								�IF m.constraint�
									str = "" 
									�FOR msg : m.c.messages�
										+ "!" + "�msg.sender.name�" + "." + "�msg.name�" + "." + "�msg.receiver.name�" + " & "
									�ENDFOR�;
									str= str.substring(0, str.length() - 3);
								�ENDIF�
								�IF !m.strict�
									�IF m.required�
										�IF m.future�
											�m.compile_required_future�
											loopauto.collapse(b);
										�ENDIF�
										�IF m.past�
											�m.compile_required_past�
											loopauto.collapse(b);
										�ENDIF�
										�IF !m.past && !m.future�
											�m.compile_required�
											loopauto.collapse(b);
										�ENDIF�
									�ENDIF�
									�IF m.fail�
										�IF m.past�
											�m.compile_fail_past�
											loopauto.collapse(b);
										�ENDIF�
										�IF !m.past && !m.future�
											�m.compile_fail�
											loopauto.collapse(b);
										�ENDIF�
									�ENDIF�
									�IF !m.fail && !m.required�
										�IF m.future�
											�m.compile_future�
											loopauto.collapse(b);
										�ENDIF�
										�IF m.past�
											�m.compile_past�
											loopauto.collapse(b);
										�ENDIF�
										�IF !m.past && !m.future�
											�m.compile_msg�
											loopauto.collapse(b);
										�ENDIF�
									�ENDIF�
								�ENDIF�
								
								�IF m.strict�
									�IF m.required�
										�IF m.future�
											�m.compile_strict_required_future�
											loopauto.collapse(b);
										�ENDIF�
										�IF !m.past && !m.future�
											�m.compile_strict_required�
											loopauto.collapse(b);
										�ENDIF�
									�ENDIF�
									�IF m.fail�
										�IF !m.past && !m.future�
											�m.compile_strict_fail�
											loopauto.collapse(b);
										�ENDIF�
									�ENDIF�
									�IF !m.fail && !m.required�
										�IF m.future�
											�m.compile_strict_future�
											loopauto.collapse(b);
										�ENDIF�
										�IF !m.past && !m.future�
											�m.compile_strict�
											loopauto.collapse(b);
										�ENDIF� 
									�ENDIF�
								�ENDIF�
							�ENDFOR�
							a.merge(loopSetup(loopauto, �l.min�, �l.max�));
						�ENDFOR�
						�FOR p : sc.par�
							parauto = new ArrayList<Automaton>();
							�FOR pe : p.parexpression�
								expression = new Automaton("expauto" + counter);
								�FOR m : pe.messages�
									�IF m.constraint�
										str = "" 
										�FOR msg : m.c.messages�
											+ "!" + "�msg.sender.name�" + "." + "�msg.name�" + "." + "�msg.receiver.name�" + " & "
										�ENDFOR�;
										str= str.substring(0, str.length() - 3);
									�ENDIF�
									�IF !m.strict�
										�IF m.required�
											�IF m.future�
												�m.compile_required_future�
												expression.collapse(b);
											�ENDIF�
											�IF m.past�
												�m.compile_required_past�
												expression.collapse(b);
											�ENDIF�
											�IF !m.past && !m.future�
												�m.compile_required�
												expression.collapse(b);
											�ENDIF�
										�ENDIF�
										�IF m.fail�
											�IF m.past�
												�m.compile_fail_past�
												expression.collapse(b);
											�ENDIF�
											�IF !m.past && !m.future�
												�m.compile_fail�
												expression.collapse(b);
											�ENDIF�
										�ENDIF�
										�IF !m.fail && !m.required�
											�IF m.future�
												�m.compile_future�
												expression.collapse(b);
											�ENDIF�
											�IF m.past�
												�m.compile_past�
												expression.collapse(b);
											�ENDIF�
											�IF !m.past && !m.future�
												�m.compile_msg�
												expression.collapse(b);
											�ENDIF�
										�ENDIF�
									�ENDIF�
									
									�IF m.strict�
										�IF m.required�
											�IF m.future�
												�m.compile_strict_required_future�
												expression.collapse(b);
											�ENDIF�
											�IF !m.past && !m.future�
												�m.compile_strict_required�
												expression.collapse(b);
											�ENDIF�
										�ENDIF�
										�IF m.fail�
											�IF !m.past && !m.future�
												�m.compile_strict_fail�
												expression.collapse(b);
											�ENDIF�
										�ENDIF�
										�IF !m.fail && !m.required�
											�IF m.future�
												�m.compile_strict_future�
												expression.collapse(b);
											�ENDIF�
											�IF !m.past && !m.future�
												�m.compile_strict�
												expression.collapse(b);
											�ENDIF� 
										�ENDIF�
									�ENDIF�
								�ENDFOR�
								parauto.add(expression);			
							�ENDFOR�
							a.merge(par(parauto));
						�ENDFOR�
						�FOR a : sc.alt�
						altauto = new ArrayList<Automaton>();
							�FOR e : a.expressions�
								expression = new Automaton("expauto" + counter);
								�FOR m : e.messages�
									�IF m.constraint�
										str = "" 
										�FOR msg : m.c.messages�
											+ "!" + "�msg.sender.name�" + "." + "�msg.name�" + "." + "�msg.receiver.name�" + " & "
										�ENDFOR�;
										str= str.substring(0, str.length() - 3);
									�ENDIF�
									�IF !m.strict�
										�IF m.required�
											�IF m.future�
												�m.compile_required_future�
												expression.collapse(b);
											�ENDIF�
											�IF m.past�
												�m.compile_required_past�
												expression.collapse(b);
											�ENDIF�
											�IF !m.past && !m.future�
												�m.compile_required�
												expression.collapse(b);
											�ENDIF�
										�ENDIF�
										�IF m.fail�
											�IF m.past�
												�m.compile_fail_past�
												expression.collapse(b);
											�ENDIF�
											�IF !m.past && !m.future�
												�m.compile_fail�
												expression.collapse(b);
											�ENDIF�
										�ENDIF�
										�IF !m.fail && !m.required�
											�IF m.future�
												�m.compile_future�
												expression.collapse(b);
											�ENDIF�
											�IF m.past�
												�m.compile_past�
												expression.collapse(b);
											�ENDIF�
											�IF !m.past && !m.future�
												�m.compile_msg�
												expression.collapse(b);
											�ENDIF�
										�ENDIF�
									�ENDIF�
									
									�IF m.strict�
										�IF m.required�
											�IF m.future�
												�m.compile_strict_required_future�
												expression.collapse(b);
											�ENDIF�
											�IF !m.past && !m.future�
												�m.compile_strict_required�
												expression.collapse(b);
											�ENDIF�
										�ENDIF�
										�IF m.fail�
											�IF !m.past && !m.future�
												�m.compile_strict_fail�
												expression.collapse(b);
											�ENDIF�
										�ENDIF�
										�IF !m.fail && !m.required�
											�IF m.future�
												�m.compile_strict_future�
												expression.collapse(b);
											�ENDIF�
											�IF !m.past && !m.future�
												�m.compile_strict�
												expression.collapse(b);
											�ENDIF� 
										�ENDIF�
									�ENDIF�
								�ENDFOR�
								altauto.add(expression);						
							�ENDFOR�
							a.merge(altauto);
						�ENDFOR�
						�FOR m : sc.message�
							�IF m.constraint�
								str = "" 
								�FOR msg : m.c.messages�
									+ "!" + "�msg.sender.name�" + "." + "�msg.name�" + "." + "�msg.receiver.name�" + " & "
								�ENDFOR�;
								str= str.substring(0, str.length() - 3);
							�ENDIF�
							�IF !m.strict�
								�IF m.required�
									�IF m.future�
										�m.compile_required_future�
										a.collapse(b);
									�ENDIF�
									�IF m.past�
										�m.compile_required_past�
										a.collapse(b);
									�ENDIF�
									�IF !m.past && !m.future�
										�m.compile_required�
										a.collapse(b);
									�ENDIF�
								�ENDIF�
								�IF m.fail�
									�IF m.past�
										�m.compile_fail_past�
										a.collapse(b);
									�ENDIF�
									�IF !m.past && !m.future�
										�m.compile_fail�
										a.collapse(b);
									�ENDIF�
								�ENDIF�
								�IF !m.fail && !m.required�
									�IF m.future�
										�m.compile_future�
										a.collapse(b);
									�ENDIF�
									�IF m.past�
										�m.compile_past�
										a.collapse(b);
									�ENDIF�
									�IF !m.past && !m.future�
										�m.compile_msg�
										a.collapse(b);
									�ENDIF�
								�ENDIF�
							�ENDIF�
							
							�IF m.strict�
								�IF m.required�
									�IF m.future�
										�m.compile_strict_required_future�
										a.collapse(b);
									�ENDIF�
									�IF !m.past && !m.future�
										�m.compile_strict_required�
										a.collapse(b);
									�ENDIF�
								�ENDIF�
								�IF m.fail�
									�IF !m.past && !m.future�
										�m.compile_strict_fail�
										a.collapse(b);
									�ENDIF�
								�ENDIF�
								�IF !m.fail && !m.required�
									�IF m.future�
										�m.compile_strict_future�
										a.collapse(b);
									�ENDIF�
									�IF !m.past && !m.future�
										�m.compile_strict�
										a.collapse(b);
									�ENDIF� 
								�ENDIF�
							�ENDIF�
						�ENDFOR�
					�ENDFOR�
					a.rename();
					automatas.add(a);
				�ENDFOR�
			}
			
			public void listAutomatas(){
				for(Automaton a : this.automatas){
					for(State s : a.getStates()){
						s.writeState();	
					}
					
					for(Transition t : a.getTransitions()){
						t.writeTransition();
					}
				}
			}
			
			public ArrayList<Automaton> par(ArrayList<Automaton> automatas) {
			        ArrayList<ArrayList<Automaton>> automataList = new ArrayList<>();
			        permute(automataList, new ArrayList<>(), automatas);
			        return listConverter((automataList));
			}
		
		    private void permute(ArrayList<ArrayList<Automaton>> list, ArrayList<Automaton> resultList, ArrayList<Automaton> automatas) {
		        if (resultList.size() == automatas.size()) {
		            list.add(new ArrayList<>(resultList));
		        } else {
		            for (int i = 0; i < automatas.size(); i++) {
		                if (resultList.contains((automatas.get(i)))) {
		                    continue;
		                }
		
		                resultList.add(automatas.get(i));
		                permute(list, resultList, automatas);
		                resultList.remove(resultList.size() - 1);
		            }
		        }
		    }
		
		    private ArrayList<Automaton> listConverter(ArrayList<ArrayList<Automaton>> list) {
		        ArrayList<Automaton> result = new ArrayList<>();
		        for (ArrayList<Automaton> alist : list) {
		            Automaton newauto = new Automaton("listConverter");
		            for (Automaton auto : alist) {
		                newauto.collapse(copyAutomaton(auto));
		            }
		            result.add(newauto);
		        }
		        return result;
		    }
		    
		    public ArrayList<Automaton> loopSetup(Automaton loopauto, int min, int max) {
	            ArrayList<Automaton> result = new ArrayList<>();
	    
	            for (int i = min; i <= max; i++) {
	                Automaton newauto = new Automaton("loopauto");
	                for (int j = 0; j < i; j++) {
	                    newauto.collapse(copyAutomaton(loopauto));
	                }
	                result.add(newauto);
	            }
	            return result;
		    }
		    
		    public Automaton copyAutomaton(Automaton referenceAuto) {
		            Automaton result = new Automaton("copy automaton");
		            int count = 0;
		    
		            for (Transition t : referenceAuto.getTransitions()) {
		                State sender = new State();
		                State receiver = new State();
		                Transition transition = new Transition();
		                Automaton temp = new Automaton("temp");
		    
		                sender.setId("c" + count);
		                count++;
		                sender.setType(t.getSender().getType());
		    
		                receiver.setId("c" + count);
		                count++;
		                receiver.setType(t.getReceiver().getType());
		    
		                transition.setId(t.getId());
		                transition.setSender(sender);
		                transition.setReceiver(receiver);
		    
		                temp.addState(sender);
		                temp.addState(receiver);
		                temp.addTransition(transition);
		                temp.setInitial(sender);
		                temp.setFinale(receiver);
		    
		                result.collapse(temp);
		            }
		    
		            return result;
		        }
			
			public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
				Specification specification = new Specification();
				specification.listAutomatas();
				boolean acceptState = false;
				
				PrintWriter writer = new PrintWriter("�s.name�" + ".txt", "UTF-8");
				for(Automaton a : specification.automatas){
					writer.println("never{ /*" + a.getId() + "*/");
					for(State s : a.getStates()){
						if(s == a.getInitial()){
							writer.println("T0_init:");
							writer.println(" do");
							for(Transition t : a.findSender(s)){
								if(t.getReceiver() == a.getInitial()){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto T0_init");
								}else if(t.getReceiver().getType().equals(StateType.NORMAL)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto T0_" + t.getReceiver().getId());
								}else if(t.getReceiver().getType().equals(StateType.ACCEPT_ALL)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto accept_all" );
								}else if(t.getReceiver().getType().equals(StateType.FINAL)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto T0_" + t.getReceiver().getId());
								}else if(t.getReceiver().getType().equals(StateType.ACCEPT)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto accept_" + t.getReceiver().getId());
								}
							}
							writer.println(" od;");
						}else if(s.getType().equals(StateType.NORMAL)){
							writer.println("T0_" + s.getId() + ":");
							writer.println(" do");
							for(Transition t : a.findSender(s)){
								if(t.getReceiver() == a.getInitial()){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto T0_init");
								}else if(t.getReceiver().getType().equals(StateType.NORMAL)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto T0_" + t.getReceiver().getId());
								}else if(t.getReceiver().getType().equals(StateType.ACCEPT_ALL)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto accept_all" );
								}else if(t.getReceiver().getType().equals(StateType.FINAL)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto T0_" + t.getReceiver().getId());
								}else if(t.getReceiver().getType().equals(StateType.ACCEPT)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto accept_" + t.getReceiver().getId());
								}
							}
							writer.println(" od;");
						}else if(s.getType().equals(StateType.ACCEPT_ALL) && !acceptState){
							writer.println("accept_all:");
							writer.println("skip");
							acceptState = true;
						}else if(s.getType().equals(StateType.FINAL)){
							writer.println("T0_" + s.getId() + ":");
							writer.println(" do");
							for(Transition t : a.findSender(s)){
								if(t.getReceiver() == a.getInitial()){
									writer.println(" :: (" + t.getId() + ")" + "->" + " goto T0_init");
								}else if(t.getReceiver().getType().equals(StateType.NORMAL)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto T0_" + t.getReceiver().getId());
								}else if(t.getReceiver().getType().equals(StateType.ACCEPT_ALL)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto accept_all" );
								}else if(t.getReceiver().getType().equals(StateType.FINAL)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto T0_" + t.getReceiver().getId());
								}else if(t.getReceiver().getType().equals(StateType.ACCEPT)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto accept_" + t.getReceiver().getId());
								}
							}
							writer.println(" od;");
						}else if(s.getType().equals(StateType.ACCEPT)){
							writer.println("accept_" + s.getId() + ":");
							writer.println(" do");
							for(Transition t : a.findSender(s)){
								if(t.getReceiver() == a.getInitial()){
									writer.println(" :: (" + t.getId() + ")" + "->" + " goto T0_init");
								}else if(t.getReceiver().getType().equals(StateType.NORMAL)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto T0_" + t.getReceiver().getId());
								}else if(t.getReceiver().getType().equals(StateType.ACCEPT_ALL)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto accept_all" );
								}else if(t.getReceiver().getType().equals(StateType.FINAL)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto T0_" + t.getReceiver().getId());
								}else if(t.getReceiver().getType().equals(StateType.ACCEPT)){
									writer.println(" :: (" + t.getId() + ") " + "->" + " goto accept_" + t.getReceiver().getId());
								}
							}
							writer.println(" od;");
						}
						
					}
					writer.println("}");
				}
				writer.close();
			}
		}
	'''
	
	def compile_required_future(Message m)'''
		b = new Automaton("auto1");
		actualState = new State("q" + counter, StateType.ACCEPT);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		b.addTransition(new Transition("!" + "�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, actualState));
		finalState = new State("q" + counter, StateType.FINAL);
		counter++;
		acceptState = new State("q" + counter, StateType.ACCEPT_ALL);
		counter++;
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, finalState));
		b.addTransition(new Transition(str, finalState, finalState));
		b.addTransition(new Transition("!" + "(" + str + ")", finalState, acceptState));
		b.addTransition(new Transition("1", acceptState, acceptState));
		b.addState(acceptState);
		b.addState(finalState);
		b.setFinale(finalState);
		
	'''
	
	def compile_required_past(Message m)'''
		b = new Automaton("auto2");
		actualState = new State("q" + counter, StateType.ACCEPT);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
		
											
		b.addTransition(new Transition("!" + "�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�" + " & " + str, actualState, actualState));
		acceptState = new State("q" + counter, StateType.ACCEPT_ALL);
		counter++;
		finalState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, finalState));
		b.addTransition(new Transition("!" + "(" + str + ")", actualState, acceptState));
		b.addTransition(new Transition("1", acceptState, acceptState));
		b.addState(acceptState);
		b.addState(finalState);
		b.setFinale(finalState);
	'''
	
	def compile_required(Message m)'''
		b = new Automaton("auto3");
		actualState = new State("q" + counter, StateType.ACCEPT);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
		
		
		b.addTransition(new Transition("!" + "�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, actualState));
		newState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, newState));
		b.addState(newState);
		b.setFinale(newState);
	'''
	
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
	
	def compile_future(Message m)'''
		b = new Automaton("auto6");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		b.addTransition(new Transition("1", actualState, actualState));
		newState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�" , actualState, newState));
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
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, newState));
		b.addState(newState);
		b.setFinale(newState);
	'''
	
	def compile_msg(Message m)'''
		b = new Automaton("auto7");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		b.addTransition(new Transition("1", actualState, actualState));
		newState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�" , actualState, newState));
		b.addState(newState);
		b.setFinale(newState);
	'''
		
	def compile_strict_required_future(Message m)'''
		b = new Automaton("auto8");
		actualState = new State("q" + counter, StateType.ACCEPT);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		finalState = new State("q" + counter, StateType.FINAL);
		counter++;
		acceptState = new State("q" + counter, StateType.ACCEPT_ALL);
		counter++;
		acceptState_new = new State("q" + counter, StateType.ACCEPT_ALL);
		counter++;
		b.addTransition(new Transition("!" + "�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, acceptState_new));
		b.addTransition(new Transition("1", acceptState_new, acceptState_new));
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, finalState));
		b.addTransition(new Transition(str, finalState, finalState));
		b.addTransition(new Transition("!" + "(" + str + ")", finalState, acceptState));
		b.addTransition(new Transition("1", acceptState, acceptState));
		b.addState(finalState);
		b.addState(acceptState);
		b.addState(acceptState_new);
		b.setFinale(finalState);
	'''
	
	def compile_strict_required(Message m)'''
		b = new Automaton("auto9");
		actualState = new State("q" + counter, StateType.ACCEPT);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		finalState = new State("q" + counter, StateType.FINAL);
		counter++;
		acceptState = new State("q" + counter, StateType.ACCEPT_ALL);
		counter++;
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�" , actualState, finalState));
		b.addTransition(new Transition("!" + "�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�" , actualState, acceptState));
		b.addTransition(new Transition("1", acceptState, acceptState));
		b.addState(acceptState);
		b.addState(finalState);
		b.setFinale(finalState);
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
		b.addTransition(new Transition("!" + "�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, finalState));
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, acceptState));
		b.addTransition(new Transition("1", acceptState, acceptState));
		b.addState(finalState);
		b.addState(acceptState);
		b.setFinale(finalState);
	'''
	
	def compile_strict_future(Message m)'''
		b = new Automaton("auto11");
		actualState = new State("q" + counter, StateType.NORMAL);
		counter++;
		b.addState(actualState);
		b.setInitial(actualState);
											
		newState = new State("q" + counter, StateType.FINAL);
		counter++;
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, newState));
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
		b.addTransition(new Transition("�m.sender.name�" + "." + "�m.name�" + "." + "�m.receiver.name�", actualState, newState));
		b.addState(newState);
		b.setFinale(newState);
	'''
}
