/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.scoping

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.xtext.example.mydsl.myDsl.ChangeToMessage
import org.xtext.example.mydsl.myDsl.AppearMessage
import org.xtext.example.mydsl.myDsl.DisappearMessage
import org.xtext.example.mydsl.myDsl.ChangeToRelation

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MyDslScopeProvider extends AbstractDeclarativeScopeProvider {

    def IScope scope_ChangeToMessage_attribute(ChangeToMessage ctx, EReference ref) {
        return Scopes.scopeFor(ctx.entity.attributes)
    }
    
    def IScope scope_ChangeToMessage_entity(ChangeToMessage ctx, EReference ref) {
    	return Scopes.scopeFor(ctx.context.entities)
    }
    
    def IScope scope_ChangeToRelation_relation(ChangeToRelation ctx, EReference ref) {
    	return Scopes.scopeFor(ctx.context.relations)
    }
    
    def IScope scope_ChangeToRelation_attribute(ChangeToRelation ctx, EReference ref) {
    	return Scopes.scopeFor(ctx.relation.attributes)
    }
    
    def IScope scope_AppearMessage_entity(AppearMessage app, EReference ref) {
    	return Scopes.scopeFor(app.context.entities)
    }
    
    def IScope scope_DisappearMessage_entity(DisappearMessage dis, EReference ref) {
    	return Scopes.scopeFor(dis.context.entities)
    }
    

}
