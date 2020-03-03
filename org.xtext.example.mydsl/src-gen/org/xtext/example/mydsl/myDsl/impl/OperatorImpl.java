/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Operator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.OperatorImpl#isGreater <em>Greater</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.OperatorImpl#isSmaller <em>Smaller</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.OperatorImpl#isGreaterequals <em>Greaterequals</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.OperatorImpl#isSmallerequals <em>Smallerequals</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.OperatorImpl#isEquals <em>Equals</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.OperatorImpl#isNotequals <em>Notequals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatorImpl extends MinimalEObjectImpl.Container implements Operator
{
  /**
   * The default value of the '{@link #isGreater() <em>Greater</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGreater()
   * @generated
   * @ordered
   */
  protected static final boolean GREATER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGreater() <em>Greater</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGreater()
   * @generated
   * @ordered
   */
  protected boolean greater = GREATER_EDEFAULT;

  /**
   * The default value of the '{@link #isSmaller() <em>Smaller</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSmaller()
   * @generated
   * @ordered
   */
  protected static final boolean SMALLER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSmaller() <em>Smaller</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSmaller()
   * @generated
   * @ordered
   */
  protected boolean smaller = SMALLER_EDEFAULT;

  /**
   * The default value of the '{@link #isGreaterequals() <em>Greaterequals</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGreaterequals()
   * @generated
   * @ordered
   */
  protected static final boolean GREATEREQUALS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGreaterequals() <em>Greaterequals</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGreaterequals()
   * @generated
   * @ordered
   */
  protected boolean greaterequals = GREATEREQUALS_EDEFAULT;

  /**
   * The default value of the '{@link #isSmallerequals() <em>Smallerequals</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSmallerequals()
   * @generated
   * @ordered
   */
  protected static final boolean SMALLEREQUALS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSmallerequals() <em>Smallerequals</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSmallerequals()
   * @generated
   * @ordered
   */
  protected boolean smallerequals = SMALLEREQUALS_EDEFAULT;

  /**
   * The default value of the '{@link #isEquals() <em>Equals</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEquals()
   * @generated
   * @ordered
   */
  protected static final boolean EQUALS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEquals() <em>Equals</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEquals()
   * @generated
   * @ordered
   */
  protected boolean equals = EQUALS_EDEFAULT;

  /**
   * The default value of the '{@link #isNotequals() <em>Notequals</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotequals()
   * @generated
   * @ordered
   */
  protected static final boolean NOTEQUALS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNotequals() <em>Notequals</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotequals()
   * @generated
   * @ordered
   */
  protected boolean notequals = NOTEQUALS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperatorImpl()
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
    return MyDslPackage.Literals.OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGreater()
  {
    return greater;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreater(boolean newGreater)
  {
    boolean oldGreater = greater;
    greater = newGreater;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OPERATOR__GREATER, oldGreater, greater));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSmaller()
  {
    return smaller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSmaller(boolean newSmaller)
  {
    boolean oldSmaller = smaller;
    smaller = newSmaller;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OPERATOR__SMALLER, oldSmaller, smaller));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGreaterequals()
  {
    return greaterequals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreaterequals(boolean newGreaterequals)
  {
    boolean oldGreaterequals = greaterequals;
    greaterequals = newGreaterequals;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OPERATOR__GREATEREQUALS, oldGreaterequals, greaterequals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSmallerequals()
  {
    return smallerequals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSmallerequals(boolean newSmallerequals)
  {
    boolean oldSmallerequals = smallerequals;
    smallerequals = newSmallerequals;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OPERATOR__SMALLEREQUALS, oldSmallerequals, smallerequals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEquals()
  {
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEquals(boolean newEquals)
  {
    boolean oldEquals = equals;
    equals = newEquals;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OPERATOR__EQUALS, oldEquals, equals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNotequals()
  {
    return notequals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotequals(boolean newNotequals)
  {
    boolean oldNotequals = notequals;
    notequals = newNotequals;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OPERATOR__NOTEQUALS, oldNotequals, notequals));
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
      case MyDslPackage.OPERATOR__GREATER:
        return isGreater();
      case MyDslPackage.OPERATOR__SMALLER:
        return isSmaller();
      case MyDslPackage.OPERATOR__GREATEREQUALS:
        return isGreaterequals();
      case MyDslPackage.OPERATOR__SMALLEREQUALS:
        return isSmallerequals();
      case MyDslPackage.OPERATOR__EQUALS:
        return isEquals();
      case MyDslPackage.OPERATOR__NOTEQUALS:
        return isNotequals();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.OPERATOR__GREATER:
        setGreater((Boolean)newValue);
        return;
      case MyDslPackage.OPERATOR__SMALLER:
        setSmaller((Boolean)newValue);
        return;
      case MyDslPackage.OPERATOR__GREATEREQUALS:
        setGreaterequals((Boolean)newValue);
        return;
      case MyDslPackage.OPERATOR__SMALLEREQUALS:
        setSmallerequals((Boolean)newValue);
        return;
      case MyDslPackage.OPERATOR__EQUALS:
        setEquals((Boolean)newValue);
        return;
      case MyDslPackage.OPERATOR__NOTEQUALS:
        setNotequals((Boolean)newValue);
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
      case MyDslPackage.OPERATOR__GREATER:
        setGreater(GREATER_EDEFAULT);
        return;
      case MyDslPackage.OPERATOR__SMALLER:
        setSmaller(SMALLER_EDEFAULT);
        return;
      case MyDslPackage.OPERATOR__GREATEREQUALS:
        setGreaterequals(GREATEREQUALS_EDEFAULT);
        return;
      case MyDslPackage.OPERATOR__SMALLEREQUALS:
        setSmallerequals(SMALLEREQUALS_EDEFAULT);
        return;
      case MyDslPackage.OPERATOR__EQUALS:
        setEquals(EQUALS_EDEFAULT);
        return;
      case MyDslPackage.OPERATOR__NOTEQUALS:
        setNotequals(NOTEQUALS_EDEFAULT);
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
      case MyDslPackage.OPERATOR__GREATER:
        return greater != GREATER_EDEFAULT;
      case MyDslPackage.OPERATOR__SMALLER:
        return smaller != SMALLER_EDEFAULT;
      case MyDslPackage.OPERATOR__GREATEREQUALS:
        return greaterequals != GREATEREQUALS_EDEFAULT;
      case MyDslPackage.OPERATOR__SMALLEREQUALS:
        return smallerequals != SMALLEREQUALS_EDEFAULT;
      case MyDslPackage.OPERATOR__EQUALS:
        return equals != EQUALS_EDEFAULT;
      case MyDslPackage.OPERATOR__NOTEQUALS:
        return notequals != NOTEQUALS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (greater: ");
    result.append(greater);
    result.append(", smaller: ");
    result.append(smaller);
    result.append(", greaterequals: ");
    result.append(greaterequals);
    result.append(", smallerequals: ");
    result.append(smallerequals);
    result.append(", equals: ");
    result.append(equals);
    result.append(", notequals: ");
    result.append(notequals);
    result.append(')');
    return result.toString();
  }

} //OperatorImpl