package org.xtext.example.mydsl.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import org.xtext.example.mydsl.myDsl.Entity

class EntityGenerator extends AbstractGenerator {
	
	@Inject extension IQualifiedNameProvider
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (m : resource.allContents.toIterable.filter(Entity)) {
			fsa.generateFile(
				m.fullyQualifiedName.toString("/") + ".java", m.compile
			)
		}
	}
	
	def compile(Entity e)'''
		public class �e.name.toFirstUpper� {
			�FOR a: e.attributes�
				�IF a.int�
					private int �a.name.toFirstLower�;
				�ENDIF�
				�IF a.float�
					private float �a.name.toFirstLower�;
				�ENDIF�
				�IF a.string�
					private String �a.name.toFirstLower�;
				�ENDIF�
				�IF a.boolean�
					private boolean �a.name.toFirstLower�;
				�ENDIF�
			�ENDFOR�
			private boolean exists;
			private EventCreator eventCreator;
			
			public �e.name.toFirstUpper�() {
				�FOR a: e.attributes�
					�IF a.int�
						�IF a.value === null�
							�a.name.toFirstLower� = 0;
						�ELSE�
							�a.name.toFirstLower� = �a.value�;
						�ENDIF�
					�ENDIF�
					�IF a.float�
						�IF a.value === null�
							�a.name.toFirstLower� = 0;
						�ELSE�
							�a.name.toFirstLower� = �a.value�;
						�ENDIF�
					�ENDIF�
					�IF a.string�
						�IF a.value === null�
							�a.name.toFirstLower� = "default";
						�ELSE�
							�a.name.toFirstLower� = "�a.value�";
						�ENDIF�
					�ENDIF�
					�IF a.boolean�
						�IF a.value === null�
							�a.name.toFirstLower� = false;
						�ELSE�
							�a.name.toFirstLower� = �a.value�;
						�ENDIF�
					�ENDIF�
				�ENDFOR�
				exists = false;
			}
			
			public �e.name.toFirstUpper�(EventCreator eventCreator) {
				�FOR a: e.attributes�
					�IF a.int�
						�IF a.value === null�
							�a.name.toFirstLower� = 0;
						�ELSE�
							�a.name.toFirstLower� = �a.value�;
						�ENDIF�
					�ENDIF�
					�IF a.float�
						�IF a.value === null�
							�a.name.toFirstLower� = 0;
						�ELSE�
							�a.name.toFirstLower� = �a.value�;
						�ENDIF�
					�ENDIF�
					�IF a.string�
						�IF a.value === null�
							�a.name.toFirstLower� = "default";
						�ELSE�
							�a.name.toFirstLower� = "�a.value�";
						�ENDIF�
					�ENDIF�
					�IF a.boolean�
						�IF a.value === null�
							�a.name.toFirstLower� = false;
						�ELSE�
							�a.name.toFirstLower� = �a.value�;
						�ENDIF�
					�ENDIF�
				�ENDFOR�
				exists = false;
				this.eventCreator = eventCreator;
			}
				
			public boolean getExists() { return exists; }
			
			public void setAppear() { 
				exists = true;
				eventCreator.appear("�e.name.toFirstUpper�");
			}
			
			public void setDisappear() { 
				exists = false;
				eventCreator.disappear("�e.name.toFirstUpper�");
			}
			
			�FOR a: e.attributes�
				�IF a.int�
					public int get�a.name.toFirstUpper�() { return �a.name.toFirstLower�; }
					
					public void set�a.name.toFirstUpper�(int �a.name.toFirstLower�) { 
						this.�a.name.toFirstLower� = �a.name.toFirstLower�;
						eventCreator.changeTo("�e.name.toFirstUpper�.�a.name.toFirstLower�, " + �a.name.toFirstLower�);
					}
				�ENDIF�
				�IF a.float�
					public float get�a.name.toFirstUpper�() { return �a.name.toFirstLower�; }
											
					public void set�a.name.toFirstUpper�(float �a.name.toFirstLower�) { 
						this.�a.name.toFirstLower� = �a.name.toFirstLower�;
						eventCreator.changeTo("�e.name.toFirstUpper�.�a.name.toFirstLower�, " + �a.name.toFirstLower�);
					}
				�ENDIF�
				�IF a.string�
					public String get�a.name.toFirstUpper�() { return �a.name.toFirstLower�; }
											
					public void set�a.name.toFirstUpper�(String �a.name.toFirstLower�) { 
						this.�a.name.toFirstLower� = �a.name.toFirstLower�;
						eventCreator.changeTo("�e.name.toFirstUpper�.�a.name.toFirstLower�, " + �a.name.toFirstLower�);
					}
				�ENDIF�
				�IF a.boolean�
					public boolean get�a.name.toFirstUpper�() { return �a.name.toFirstLower�; }
											
					public void set�a.name.toFirstUpper�(boolean �a.name.toFirstLower�) { 
						this.�a.name.toFirstLower� = �a.name.toFirstLower�;
						eventCreator.changeTo("�e.name.toFirstUpper�.�a.name.toFirstLower�, " + �a.name.toFirstLower�);
					}
				�ENDIF�
			�ENDFOR�
		}
	'''
	
}