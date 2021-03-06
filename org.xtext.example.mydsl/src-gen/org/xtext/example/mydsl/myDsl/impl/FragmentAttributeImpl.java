/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.FragmentAttribute;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FragmentAttributeImpl#isInt <em>Int</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FragmentAttributeImpl#isFloat <em>Float</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FragmentAttributeImpl#isString <em>String</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FragmentAttributeImpl#isBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FragmentAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FragmentAttributeImpl#isGreater <em>Greater</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FragmentAttributeImpl#isSmaller <em>Smaller</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FragmentAttributeImpl#isGreaterequals <em>Greaterequals</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FragmentAttributeImpl#isSmallerequals <em>Smallerequals</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FragmentAttributeImpl#isEquals <em>Equals</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FragmentAttributeImpl#isNotequals <em>Notequals</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FragmentAttributeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FragmentAttributeImpl extends MinimalEObjectImpl.Container implements FragmentAttribute
{
  /**
   * The default value of the '{@link #isInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInt()
   * @generated
   * @ordered
   */
  protected static final boolean INT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInt()
   * @generated
   * @ordered
   */
  protected boolean int_ = INT_EDEFAULT;

  /**
   * The default value of the '{@link #isFloat() <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFloat()
   * @generated
   * @ordered
   */
  protected static final boolean FLOAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFloat() <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFloat()
   * @generated
   * @ordered
   */
  protected boolean float_ = FLOAT_EDEFAULT;

  /**
   * The default value of the '{@link #isString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isString()
   * @generated
   * @ordered
   */
  protected static final boolean STRING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isString()
   * @generated
   * @ordered
   */
  protected boolean string = STRING_EDEFAULT;

  /**
   * The default value of the '{@link #isBoolean() <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBoolean()
   * @generated
   * @ordered
   */
  protected static final boolean BOOLEAN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBoolean() <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBoolean()
   * @generated
   * @ordered
   */
  protected boolean boolean_ = BOOLEAN_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FragmentAttributeImpl()
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
    return MyDslPackage.Literals.FRAGMENT_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isInt()
  {
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInt(boolean newInt)
  {
    boolean oldInt = int_;
    int_ = newInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FRAGMENT_ATTRIBUTE__INT, oldInt, int_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFloat()
  {
    return float_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFloat(boolean newFloat)
  {
    boolean oldFloat = float_;
    float_ = newFloat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FRAGMENT_ATTRIBUTE__FLOAT, oldFloat, float_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setString(boolean newString)
  {
    boolean oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FRAGMENT_ATTRIBUTE__STRING, oldString, string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isBoolean()
  {
    return boolean_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBoolean(boolean newBoolean)
  {
    boolean oldBoolean = boolean_;
    boolean_ = newBoolean;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FRAGMENT_ATTRIBUTE__BOOLEAN, oldBoolean, boolean_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FRAGMENT_ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isGreater()
  {
    return greater;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGreater(boolean newGreater)
  {
    boolean oldGreater = greater;
    greater = newGreater;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FRAGMENT_ATTRIBUTE__GREATER, oldGreater, greater));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isSmaller()
  {
    return smaller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSmaller(boolean newSmaller)
  {
    boolean oldSmaller = smaller;
    smaller = newSmaller;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FRAGMENT_ATTRIBUTE__SMALLER, oldSmaller, smaller));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isGreaterequals()
  {
    return greaterequals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGreaterequals(boolean newGreaterequals)
  {
    boolean oldGreaterequals = greaterequals;
    greaterequals = newGreaterequals;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FRAGMENT_ATTRIBUTE__GREATEREQUALS, oldGreaterequals, greaterequals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isSmallerequals()
  {
    return smallerequals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSmallerequals(boolean newSmallerequals)
  {
    boolean oldSmallerequals = smallerequals;
    smallerequals = newSmallerequals;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FRAGMENT_ATTRIBUTE__SMALLEREQUALS, oldSmallerequals, smallerequals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isEquals()
  {
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEquals(boolean newEquals)
  {
    boolean oldEquals = equals;
    equals = newEquals;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FRAGMENT_ATTRIBUTE__EQUALS, oldEquals, equals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isNotequals()
  {
    return notequals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNotequals(boolean newNotequals)
  {
    boolean oldNotequals = notequals;
    notequals = newNotequals;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FRAGMENT_ATTRIBUTE__NOTEQUALS, oldNotequals, notequals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FRAGMENT_ATTRIBUTE__VALUE, oldValue, value));
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
      case MyDslPackage.FRAGMENT_ATTRIBUTE__INT:
        return isInt();
      case MyDslPackage.FRAGMENT_ATTRIBUTE__FLOAT:
        return isFloat();
      case MyDslPackage.FRAGMENT_ATTRIBUTE__STRING:
        return isString();
      case MyDslPackage.FRAGMENT_ATTRIBUTE__BOOLEAN:
        return isBoolean();
      case MyDslPackage.FRAGMENT_ATTRIBUTE__NAME:
        return getName();
      case MyDslPackage.FRAGMENT_ATTRIBUTE__GREATER:
        return isGreater();
      case MyDslPackage.FRAGMENT_ATTRIBUTE__SMALLER:
        return isSmaller();
      case MyDslPackage.FRAGMENT_ATTRIBUTE__GREATEREQUALS:
        return isGreaterequals();
      case MyDslPackage.FRAGMENT_ATTRIBUTE__SMALLEREQUALS:
        return isSmallerequals();
      case MyDslPackage.FRAGMENT_ATTRIBUTE__EQUALS:
        return isEquals();
      case MyDslPackage.FRAGMENT_ATTRIBUTE__NOTEQUALS:
        return isNotequals();
      case MyDslPackage.FRAGMENT_ATTRIBUTE__VALUE:
        return getValue();
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
      case MyDslPackage.FRAGMENT_ATTRIBUTE__INT:
        setInt((Boolean)newValue);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__FLOAT:
        setFloat((Boolean)newValue);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__STRING:
        setString((Boolean)newValue);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__BOOLEAN:
        setBoolean((Boolean)newValue);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__GREATER:
        setGreater((Boolean)newValue);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__SMALLER:
        setSmaller((Boolean)newValue);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__GREATEREQUALS:
        setGreaterequals((Boolean)newValue);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__SMALLEREQUALS:
        setSmallerequals((Boolean)newValue);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__EQUALS:
        setEquals((Boolean)newValue);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__NOTEQUALS:
        setNotequals((Boolean)newValue);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__VALUE:
        setValue((String)newValue);
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
      case MyDslPackage.FRAGMENT_ATTRIBUTE__INT:
        setInt(INT_EDEFAULT);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__FLOAT:
        setFloat(FLOAT_EDEFAULT);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__STRING:
        setString(STRING_EDEFAULT);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__BOOLEAN:
        setBoolean(BOOLEAN_EDEFAULT);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__GREATER:
        setGreater(GREATER_EDEFAULT);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__SMALLER:
        setSmaller(SMALLER_EDEFAULT);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__GREATEREQUALS:
        setGreaterequals(GREATEREQUALS_EDEFAULT);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__SMALLEREQUALS:
        setSmallerequals(SMALLEREQUALS_EDEFAULT);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__EQUALS:
        setEquals(EQUALS_EDEFAULT);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__NOTEQUALS:
        setNotequals(NOTEQUALS_EDEFAULT);
        return;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case MyDslPackage.FRAGMENT_ATTRIBUTE__INT:
        return int_ != INT_EDEFAULT;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__FLOAT:
        return float_ != FLOAT_EDEFAULT;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__STRING:
        return string != STRING_EDEFAULT;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__BOOLEAN:
        return boolean_ != BOOLEAN_EDEFAULT;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.FRAGMENT_ATTRIBUTE__GREATER:
        return greater != GREATER_EDEFAULT;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__SMALLER:
        return smaller != SMALLER_EDEFAULT;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__GREATEREQUALS:
        return greaterequals != GREATEREQUALS_EDEFAULT;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__SMALLEREQUALS:
        return smallerequals != SMALLEREQUALS_EDEFAULT;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__EQUALS:
        return equals != EQUALS_EDEFAULT;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__NOTEQUALS:
        return notequals != NOTEQUALS_EDEFAULT;
      case MyDslPackage.FRAGMENT_ATTRIBUTE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (int: ");
    result.append(int_);
    result.append(", float: ");
    result.append(float_);
    result.append(", string: ");
    result.append(string);
    result.append(", boolean: ");
    result.append(boolean_);
    result.append(", name: ");
    result.append(name);
    result.append(", greater: ");
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
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //FragmentAttributeImpl
