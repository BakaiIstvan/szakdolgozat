/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.ChangeMessage;
import org.xtext.example.mydsl.myDsl.ContextMessageContent;
import org.xtext.example.mydsl.myDsl.MatchMessage;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Message Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ContextMessageContentImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ContextMessageContentImpl#getChange <em>Change</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextMessageContentImpl extends MinimalEObjectImpl.Container implements ContextMessageContent
{
  /**
   * The cached value of the '{@link #getMatch() <em>Match</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatch()
   * @generated
   * @ordered
   */
  protected EList<MatchMessage> match;

  /**
   * The cached value of the '{@link #getChange() <em>Change</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChange()
   * @generated
   * @ordered
   */
  protected EList<ChangeMessage> change;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextMessageContentImpl()
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
    return MyDslPackage.Literals.CONTEXT_MESSAGE_CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MatchMessage> getMatch()
  {
    if (match == null)
    {
      match = new EObjectContainmentEList<MatchMessage>(MatchMessage.class, this, MyDslPackage.CONTEXT_MESSAGE_CONTENT__MATCH);
    }
    return match;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ChangeMessage> getChange()
  {
    if (change == null)
    {
      change = new EObjectContainmentEList<ChangeMessage>(ChangeMessage.class, this, MyDslPackage.CONTEXT_MESSAGE_CONTENT__CHANGE);
    }
    return change;
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
      case MyDslPackage.CONTEXT_MESSAGE_CONTENT__MATCH:
        return ((InternalEList<?>)getMatch()).basicRemove(otherEnd, msgs);
      case MyDslPackage.CONTEXT_MESSAGE_CONTENT__CHANGE:
        return ((InternalEList<?>)getChange()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.CONTEXT_MESSAGE_CONTENT__MATCH:
        return getMatch();
      case MyDslPackage.CONTEXT_MESSAGE_CONTENT__CHANGE:
        return getChange();
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
      case MyDslPackage.CONTEXT_MESSAGE_CONTENT__MATCH:
        getMatch().clear();
        getMatch().addAll((Collection<? extends MatchMessage>)newValue);
        return;
      case MyDslPackage.CONTEXT_MESSAGE_CONTENT__CHANGE:
        getChange().clear();
        getChange().addAll((Collection<? extends ChangeMessage>)newValue);
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
      case MyDslPackage.CONTEXT_MESSAGE_CONTENT__MATCH:
        getMatch().clear();
        return;
      case MyDslPackage.CONTEXT_MESSAGE_CONTENT__CHANGE:
        getChange().clear();
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
      case MyDslPackage.CONTEXT_MESSAGE_CONTENT__MATCH:
        return match != null && !match.isEmpty();
      case MyDslPackage.CONTEXT_MESSAGE_CONTENT__CHANGE:
        return change != null && !change.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ContextMessageContentImpl
