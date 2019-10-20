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

import org.xtext.example.mydsl.myDsl.AppearMessage;
import org.xtext.example.mydsl.myDsl.ChangeMessage;
import org.xtext.example.mydsl.myDsl.ChangeToMessage;
import org.xtext.example.mydsl.myDsl.ChangeToRelation;
import org.xtext.example.mydsl.myDsl.DisappearMessage;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ChangeMessageImpl#getDisappear <em>Disappear</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ChangeMessageImpl#getAppear <em>Appear</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ChangeMessageImpl#getChangeto <em>Changeto</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ChangeMessageImpl#getChangetor <em>Changetor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeMessageImpl extends MinimalEObjectImpl.Container implements ChangeMessage
{
  /**
   * The cached value of the '{@link #getDisappear() <em>Disappear</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisappear()
   * @generated
   * @ordered
   */
  protected EList<DisappearMessage> disappear;

  /**
   * The cached value of the '{@link #getAppear() <em>Appear</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppear()
   * @generated
   * @ordered
   */
  protected EList<AppearMessage> appear;

  /**
   * The cached value of the '{@link #getChangeto() <em>Changeto</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChangeto()
   * @generated
   * @ordered
   */
  protected EList<ChangeToMessage> changeto;

  /**
   * The cached value of the '{@link #getChangetor() <em>Changetor</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChangetor()
   * @generated
   * @ordered
   */
  protected EList<ChangeToRelation> changetor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChangeMessageImpl()
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
    return MyDslPackage.Literals.CHANGE_MESSAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DisappearMessage> getDisappear()
  {
    if (disappear == null)
    {
      disappear = new EObjectContainmentEList<DisappearMessage>(DisappearMessage.class, this, MyDslPackage.CHANGE_MESSAGE__DISAPPEAR);
    }
    return disappear;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AppearMessage> getAppear()
  {
    if (appear == null)
    {
      appear = new EObjectContainmentEList<AppearMessage>(AppearMessage.class, this, MyDslPackage.CHANGE_MESSAGE__APPEAR);
    }
    return appear;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ChangeToMessage> getChangeto()
  {
    if (changeto == null)
    {
      changeto = new EObjectContainmentEList<ChangeToMessage>(ChangeToMessage.class, this, MyDslPackage.CHANGE_MESSAGE__CHANGETO);
    }
    return changeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ChangeToRelation> getChangetor()
  {
    if (changetor == null)
    {
      changetor = new EObjectContainmentEList<ChangeToRelation>(ChangeToRelation.class, this, MyDslPackage.CHANGE_MESSAGE__CHANGETOR);
    }
    return changetor;
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
      case MyDslPackage.CHANGE_MESSAGE__DISAPPEAR:
        return ((InternalEList<?>)getDisappear()).basicRemove(otherEnd, msgs);
      case MyDslPackage.CHANGE_MESSAGE__APPEAR:
        return ((InternalEList<?>)getAppear()).basicRemove(otherEnd, msgs);
      case MyDslPackage.CHANGE_MESSAGE__CHANGETO:
        return ((InternalEList<?>)getChangeto()).basicRemove(otherEnd, msgs);
      case MyDslPackage.CHANGE_MESSAGE__CHANGETOR:
        return ((InternalEList<?>)getChangetor()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.CHANGE_MESSAGE__DISAPPEAR:
        return getDisappear();
      case MyDslPackage.CHANGE_MESSAGE__APPEAR:
        return getAppear();
      case MyDslPackage.CHANGE_MESSAGE__CHANGETO:
        return getChangeto();
      case MyDslPackage.CHANGE_MESSAGE__CHANGETOR:
        return getChangetor();
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
      case MyDslPackage.CHANGE_MESSAGE__DISAPPEAR:
        getDisappear().clear();
        getDisappear().addAll((Collection<? extends DisappearMessage>)newValue);
        return;
      case MyDslPackage.CHANGE_MESSAGE__APPEAR:
        getAppear().clear();
        getAppear().addAll((Collection<? extends AppearMessage>)newValue);
        return;
      case MyDslPackage.CHANGE_MESSAGE__CHANGETO:
        getChangeto().clear();
        getChangeto().addAll((Collection<? extends ChangeToMessage>)newValue);
        return;
      case MyDslPackage.CHANGE_MESSAGE__CHANGETOR:
        getChangetor().clear();
        getChangetor().addAll((Collection<? extends ChangeToRelation>)newValue);
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
      case MyDslPackage.CHANGE_MESSAGE__DISAPPEAR:
        getDisappear().clear();
        return;
      case MyDslPackage.CHANGE_MESSAGE__APPEAR:
        getAppear().clear();
        return;
      case MyDslPackage.CHANGE_MESSAGE__CHANGETO:
        getChangeto().clear();
        return;
      case MyDslPackage.CHANGE_MESSAGE__CHANGETOR:
        getChangetor().clear();
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
      case MyDslPackage.CHANGE_MESSAGE__DISAPPEAR:
        return disappear != null && !disappear.isEmpty();
      case MyDslPackage.CHANGE_MESSAGE__APPEAR:
        return appear != null && !appear.isEmpty();
      case MyDslPackage.CHANGE_MESSAGE__CHANGETO:
        return changeto != null && !changeto.isEmpty();
      case MyDslPackage.CHANGE_MESSAGE__CHANGETOR:
        return changetor != null && !changetor.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ChangeMessageImpl
