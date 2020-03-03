/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.AssertionRelation;
import org.xtext.example.mydsl.myDsl.Attribute;
import org.xtext.example.mydsl.myDsl.AttributeValue;
import org.xtext.example.mydsl.myDsl.ContextModel;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Operator;
import org.xtext.example.mydsl.myDsl.Relation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AssertionRelationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AssertionRelationImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AssertionRelationImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AssertionRelationImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AssertionRelationImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertionRelationImpl extends MinimalEObjectImpl.Container implements AssertionRelation
{
  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected ContextModel context;

  /**
   * The cached value of the '{@link #getRelation() <em>Relation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected Relation relation;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected Attribute attribute;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected EList<Operator> operator;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EList<AttributeValue> value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionRelationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.ASSERTION_RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextModel getContext()
  {
    if (context != null && context.eIsProxy())
    {
      InternalEObject oldContext = (InternalEObject)context;
      context = (ContextModel)eResolveProxy(oldContext);
      if (context != oldContext)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.ASSERTION_RELATION__CONTEXT, oldContext, context));
      }
    }
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextModel basicGetContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContext(ContextModel newContext)
  {
    ContextModel oldContext = context;
    context = newContext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ASSERTION_RELATION__CONTEXT, oldContext, context));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation getRelation()
  {
    if (relation != null && relation.eIsProxy())
    {
      InternalEObject oldRelation = (InternalEObject)relation;
      relation = (Relation)eResolveProxy(oldRelation);
      if (relation != oldRelation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.ASSERTION_RELATION__RELATION, oldRelation, relation));
      }
    }
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation basicGetRelation()
  {
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelation(Relation newRelation)
  {
    Relation oldRelation = relation;
    relation = newRelation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ASSERTION_RELATION__RELATION, oldRelation, relation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAttribute()
  {
    if (attribute != null && attribute.eIsProxy())
    {
      InternalEObject oldAttribute = (InternalEObject)attribute;
      attribute = (Attribute)eResolveProxy(oldAttribute);
      if (attribute != oldAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.ASSERTION_RELATION__ATTRIBUTE, oldAttribute, attribute));
      }
    }
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(Attribute newAttribute)
  {
    Attribute oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ASSERTION_RELATION__ATTRIBUTE, oldAttribute, attribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operator> getOperator()
  {
    if (operator == null)
    {
      operator = new EObjectContainmentEList<Operator>(Operator.class, this, MyDslPackage.ASSERTION_RELATION__OPERATOR);
    }
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeValue> getValue()
  {
    if (value == null)
    {
      value = new EObjectContainmentEList<AttributeValue>(AttributeValue.class, this, MyDslPackage.ASSERTION_RELATION__VALUE);
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.ASSERTION_RELATION__OPERATOR:
        return ((InternalEList<?>)getOperator()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ASSERTION_RELATION__VALUE:
        return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.ASSERTION_RELATION__CONTEXT:
        if (resolve) return getContext();
        return basicGetContext();
      case MyDslPackage.ASSERTION_RELATION__RELATION:
        if (resolve) return getRelation();
        return basicGetRelation();
      case MyDslPackage.ASSERTION_RELATION__ATTRIBUTE:
        if (resolve) return getAttribute();
        return basicGetAttribute();
      case MyDslPackage.ASSERTION_RELATION__OPERATOR:
        return getOperator();
      case MyDslPackage.ASSERTION_RELATION__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.ASSERTION_RELATION__CONTEXT:
        setContext((ContextModel)newValue);
        return;
      case MyDslPackage.ASSERTION_RELATION__RELATION:
        setRelation((Relation)newValue);
        return;
      case MyDslPackage.ASSERTION_RELATION__ATTRIBUTE:
        setAttribute((Attribute)newValue);
        return;
      case MyDslPackage.ASSERTION_RELATION__OPERATOR:
        getOperator().clear();
        getOperator().addAll((Collection<? extends Operator>)newValue);
        return;
      case MyDslPackage.ASSERTION_RELATION__VALUE:
        getValue().clear();
        getValue().addAll((Collection<? extends AttributeValue>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ASSERTION_RELATION__CONTEXT:
        setContext((ContextModel)null);
        return;
      case MyDslPackage.ASSERTION_RELATION__RELATION:
        setRelation((Relation)null);
        return;
      case MyDslPackage.ASSERTION_RELATION__ATTRIBUTE:
        setAttribute((Attribute)null);
        return;
      case MyDslPackage.ASSERTION_RELATION__OPERATOR:
        getOperator().clear();
        return;
      case MyDslPackage.ASSERTION_RELATION__VALUE:
        getValue().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ASSERTION_RELATION__CONTEXT:
        return context != null;
      case MyDslPackage.ASSERTION_RELATION__RELATION:
        return relation != null;
      case MyDslPackage.ASSERTION_RELATION__ATTRIBUTE:
        return attribute != null;
      case MyDslPackage.ASSERTION_RELATION__OPERATOR:
        return operator != null && !operator.isEmpty();
      case MyDslPackage.ASSERTION_RELATION__VALUE:
        return value != null && !value.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AssertionRelationImpl