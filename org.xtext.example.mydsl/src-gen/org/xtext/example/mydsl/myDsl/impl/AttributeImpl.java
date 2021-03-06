/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Attribute;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AttributeImpl#isInt <em>Int</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AttributeImpl#isFloat <em>Float</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AttributeImpl#isString <em>String</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AttributeImpl#isBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AttributeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
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
  protected AttributeImpl()
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
    return MyDslPackage.Literals.ATTRIBUTE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATTRIBUTE__INT, oldInt, int_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATTRIBUTE__FLOAT, oldFloat, float_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATTRIBUTE__STRING, oldString, string));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATTRIBUTE__BOOLEAN, oldBoolean, boolean_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATTRIBUTE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATTRIBUTE__VALUE, oldValue, value));
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
      case MyDslPackage.ATTRIBUTE__INT:
        return isInt();
      case MyDslPackage.ATTRIBUTE__FLOAT:
        return isFloat();
      case MyDslPackage.ATTRIBUTE__STRING:
        return isString();
      case MyDslPackage.ATTRIBUTE__BOOLEAN:
        return isBoolean();
      case MyDslPackage.ATTRIBUTE__NAME:
        return getName();
      case MyDslPackage.ATTRIBUTE__VALUE:
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
      case MyDslPackage.ATTRIBUTE__INT:
        setInt((Boolean)newValue);
        return;
      case MyDslPackage.ATTRIBUTE__FLOAT:
        setFloat((Boolean)newValue);
        return;
      case MyDslPackage.ATTRIBUTE__STRING:
        setString((Boolean)newValue);
        return;
      case MyDslPackage.ATTRIBUTE__BOOLEAN:
        setBoolean((Boolean)newValue);
        return;
      case MyDslPackage.ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.ATTRIBUTE__VALUE:
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
      case MyDslPackage.ATTRIBUTE__INT:
        setInt(INT_EDEFAULT);
        return;
      case MyDslPackage.ATTRIBUTE__FLOAT:
        setFloat(FLOAT_EDEFAULT);
        return;
      case MyDslPackage.ATTRIBUTE__STRING:
        setString(STRING_EDEFAULT);
        return;
      case MyDslPackage.ATTRIBUTE__BOOLEAN:
        setBoolean(BOOLEAN_EDEFAULT);
        return;
      case MyDslPackage.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.ATTRIBUTE__VALUE:
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
      case MyDslPackage.ATTRIBUTE__INT:
        return int_ != INT_EDEFAULT;
      case MyDslPackage.ATTRIBUTE__FLOAT:
        return float_ != FLOAT_EDEFAULT;
      case MyDslPackage.ATTRIBUTE__STRING:
        return string != STRING_EDEFAULT;
      case MyDslPackage.ATTRIBUTE__BOOLEAN:
        return boolean_ != BOOLEAN_EDEFAULT;
      case MyDslPackage.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.ATTRIBUTE__VALUE:
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
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
