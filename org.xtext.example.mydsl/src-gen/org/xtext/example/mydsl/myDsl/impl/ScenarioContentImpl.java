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

import org.xtext.example.mydsl.myDsl.Alt;
<<<<<<< HEAD
import org.xtext.example.mydsl.myDsl.Loop;
=======
import org.xtext.example.mydsl.myDsl.ContextMessage;
>>>>>>> [xText] Added new message type: contextMessage
import org.xtext.example.mydsl.myDsl.Message;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Par;
import org.xtext.example.mydsl.myDsl.ScenarioContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ScenarioContentImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ScenarioContentImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ScenarioContentImpl#getPar <em>Par</em>}</li>
<<<<<<< HEAD
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ScenarioContentImpl#getLoop <em>Loop</em>}</li>
=======
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ScenarioContentImpl#getContextmessage <em>Contextmessage</em>}</li>
>>>>>>> [xText] Added new message type: contextMessage
 * </ul>
 *
 * @generated
 */
public class ScenarioContentImpl extends MinimalEObjectImpl.Container implements ScenarioContent
{
  /**
   * The cached value of the '{@link #getAlt() <em>Alt</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlt()
   * @generated
   * @ordered
   */
  protected EList<Alt> alt;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected EList<Message> message;

  /**
   * The cached value of the '{@link #getPar() <em>Par</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar()
   * @generated
   * @ordered
   */
  protected EList<Par> par;

  /**
<<<<<<< HEAD
   * The cached value of the '{@link #getLoop() <em>Loop</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoop()
   * @generated
   * @ordered
   */
  protected EList<Loop> loop;
=======
   * The cached value of the '{@link #getContextmessage() <em>Contextmessage</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextmessage()
   * @generated
   * @ordered
   */
  protected EList<ContextMessage> contextmessage;
>>>>>>> [xText] Added new message type: contextMessage

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioContentImpl()
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
    return MyDslPackage.Literals.SCENARIO_CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Alt> getAlt()
  {
    if (alt == null)
    {
      alt = new EObjectContainmentEList<Alt>(Alt.class, this, MyDslPackage.SCENARIO_CONTENT__ALT);
    }
    return alt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Message> getMessage()
  {
    if (message == null)
    {
      message = new EObjectContainmentEList<Message>(Message.class, this, MyDslPackage.SCENARIO_CONTENT__MESSAGE);
    }
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Par> getPar()
  {
    if (par == null)
    {
      par = new EObjectContainmentEList<Par>(Par.class, this, MyDslPackage.SCENARIO_CONTENT__PAR);
    }
    return par;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
<<<<<<< HEAD
  public EList<Loop> getLoop()
  {
    if (loop == null)
    {
      loop = new EObjectContainmentEList<Loop>(Loop.class, this, MyDslPackage.SCENARIO_CONTENT__LOOP);
    }
    return loop;
=======
  public EList<ContextMessage> getContextmessage()
  {
    if (contextmessage == null)
    {
      contextmessage = new EObjectContainmentEList<ContextMessage>(ContextMessage.class, this, MyDslPackage.SCENARIO_CONTENT__CONTEXTMESSAGE);
    }
    return contextmessage;
>>>>>>> [xText] Added new message type: contextMessage
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
      case MyDslPackage.SCENARIO_CONTENT__ALT:
        return ((InternalEList<?>)getAlt()).basicRemove(otherEnd, msgs);
      case MyDslPackage.SCENARIO_CONTENT__MESSAGE:
        return ((InternalEList<?>)getMessage()).basicRemove(otherEnd, msgs);
      case MyDslPackage.SCENARIO_CONTENT__PAR:
        return ((InternalEList<?>)getPar()).basicRemove(otherEnd, msgs);
<<<<<<< HEAD
      case MyDslPackage.SCENARIO_CONTENT__LOOP:
        return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
=======
      case MyDslPackage.SCENARIO_CONTENT__CONTEXTMESSAGE:
        return ((InternalEList<?>)getContextmessage()).basicRemove(otherEnd, msgs);
>>>>>>> [xText] Added new message type: contextMessage
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
      case MyDslPackage.SCENARIO_CONTENT__ALT:
        return getAlt();
      case MyDslPackage.SCENARIO_CONTENT__MESSAGE:
        return getMessage();
      case MyDslPackage.SCENARIO_CONTENT__PAR:
        return getPar();
<<<<<<< HEAD
      case MyDslPackage.SCENARIO_CONTENT__LOOP:
        return getLoop();
=======
      case MyDslPackage.SCENARIO_CONTENT__CONTEXTMESSAGE:
        return getContextmessage();
>>>>>>> [xText] Added new message type: contextMessage
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
      case MyDslPackage.SCENARIO_CONTENT__ALT:
        getAlt().clear();
        getAlt().addAll((Collection<? extends Alt>)newValue);
        return;
      case MyDslPackage.SCENARIO_CONTENT__MESSAGE:
        getMessage().clear();
        getMessage().addAll((Collection<? extends Message>)newValue);
        return;
      case MyDslPackage.SCENARIO_CONTENT__PAR:
        getPar().clear();
        getPar().addAll((Collection<? extends Par>)newValue);
        return;
<<<<<<< HEAD
      case MyDslPackage.SCENARIO_CONTENT__LOOP:
        getLoop().clear();
        getLoop().addAll((Collection<? extends Loop>)newValue);
=======
      case MyDslPackage.SCENARIO_CONTENT__CONTEXTMESSAGE:
        getContextmessage().clear();
        getContextmessage().addAll((Collection<? extends ContextMessage>)newValue);
>>>>>>> [xText] Added new message type: contextMessage
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
      case MyDslPackage.SCENARIO_CONTENT__ALT:
        getAlt().clear();
        return;
      case MyDslPackage.SCENARIO_CONTENT__MESSAGE:
        getMessage().clear();
        return;
      case MyDslPackage.SCENARIO_CONTENT__PAR:
        getPar().clear();
        return;
<<<<<<< HEAD
      case MyDslPackage.SCENARIO_CONTENT__LOOP:
        getLoop().clear();
=======
      case MyDslPackage.SCENARIO_CONTENT__CONTEXTMESSAGE:
        getContextmessage().clear();
>>>>>>> [xText] Added new message type: contextMessage
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
      case MyDslPackage.SCENARIO_CONTENT__ALT:
        return alt != null && !alt.isEmpty();
      case MyDslPackage.SCENARIO_CONTENT__MESSAGE:
        return message != null && !message.isEmpty();
      case MyDslPackage.SCENARIO_CONTENT__PAR:
        return par != null && !par.isEmpty();
<<<<<<< HEAD
      case MyDslPackage.SCENARIO_CONTENT__LOOP:
        return loop != null && !loop.isEmpty();
=======
      case MyDslPackage.SCENARIO_CONTENT__CONTEXTMESSAGE:
        return contextmessage != null && !contextmessage.isEmpty();
>>>>>>> [xText] Added new message type: contextMessage
    }
    return super.eIsSet(featureID);
  }

} //ScenarioContentImpl
