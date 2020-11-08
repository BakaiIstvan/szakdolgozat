package org.xtext.example.mydsl.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class TransitionGenerator extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
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
				    
				    public String getMessageType() {
				    	String messageType = this.id.substring(2, this.id.length() - 1);
				 
				    	messageType = messageType.substring(messageType.indexOf(".") + 1);
				    	messageType = messageType.substring(0, messageType.indexOf("("));
				
				    	return messageType;
				    }
				    
				    public String[] getParameters() {
				    	String messageType = this.id.substring(2, this.id.length() - 1);
				    	 
				    	messageType = messageType.substring(messageType.indexOf("(") + 1);
				    	messageType = messageType.substring(0, messageType.indexOf(")"));
				
				    	if (messageType.equals("")) {
				    		return new String[0];
				    	}
				    	
				    	return messageType.split(",");
				    }
				    
				    public String getSenderName() {
				    	String sender = this.id;
				    	if (this.id.contains("!")) {
				    		sender = this.id.substring(2, this.id.length() - 1);
				    	}
				    	
				    	sender = sender.substring(0, sender.indexOf("."));
				    	
				    	return sender;
				    }
				    
				    public String getReceiverName() {
				    	String receiver = this.id;
				    	if (this.id.contains("!")) {
				    		receiver = this.id.substring(2, this.id.length() - 1);
				    	}
				    	
				    	receiver = receiver.substring(receiver.indexOf(")") + 2);
				    	
				    	return receiver;
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
	}
	
}