/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#getConstantparams <em>Constantparams</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#isRequired <em>Required</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#isFail <em>Fail</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#isStrict <em>Strict</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#getSender <em>Sender</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#isPast <em>Past</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#isFuture <em>Future</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#isConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#getConstraintexp <em>Constraintexp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#getResetinconstraint <em>Resetinconstraint</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#isClockconstraint <em>Clockconstraint</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#getCConstraint <em>CConstraint</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Message#getResetclock <em>Resetclock</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Message#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Params}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_Params()
   * @model containment="true"
   * @generated
   */
  EList<Params> getParams();

  /**
   * Returns the value of the '<em><b>Constantparams</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ConstantParams}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constantparams</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constantparams</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_Constantparams()
   * @model containment="true"
   * @generated
   */
  EList<ConstantParams> getConstantparams();

  /**
   * Returns the value of the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required</em>' attribute.
   * @see #setRequired(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_Required()
   * @model
   * @generated
   */
  boolean isRequired();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Message#isRequired <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required</em>' attribute.
   * @see #isRequired()
   * @generated
   */
  void setRequired(boolean value);

  /**
   * Returns the value of the '<em><b>Fail</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fail</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fail</em>' attribute.
   * @see #setFail(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_Fail()
   * @model
   * @generated
   */
  boolean isFail();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Message#isFail <em>Fail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fail</em>' attribute.
   * @see #isFail()
   * @generated
   */
  void setFail(boolean value);

  /**
   * Returns the value of the '<em><b>Strict</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strict</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strict</em>' attribute.
   * @see #setStrict(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_Strict()
   * @model
   * @generated
   */
  boolean isStrict();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Message#isStrict <em>Strict</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strict</em>' attribute.
   * @see #isStrict()
   * @generated
   */
  void setStrict(boolean value);

  /**
   * Returns the value of the '<em><b>Sender</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sender</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sender</em>' reference.
   * @see #setSender(org.xtext.example.mydsl.myDsl.Object)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_Sender()
   * @model
   * @generated
   */
  org.xtext.example.mydsl.myDsl.Object getSender();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Message#getSender <em>Sender</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sender</em>' reference.
   * @see #getSender()
   * @generated
   */
  void setSender(org.xtext.example.mydsl.myDsl.Object value);

  /**
   * Returns the value of the '<em><b>Receiver</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver</em>' reference.
   * @see #setReceiver(org.xtext.example.mydsl.myDsl.Object)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_Receiver()
   * @model
   * @generated
   */
  org.xtext.example.mydsl.myDsl.Object getReceiver();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Message#getReceiver <em>Receiver</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver</em>' reference.
   * @see #getReceiver()
   * @generated
   */
  void setReceiver(org.xtext.example.mydsl.myDsl.Object value);

  /**
   * Returns the value of the '<em><b>Past</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Past</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Past</em>' attribute.
   * @see #setPast(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_Past()
   * @model
   * @generated
   */
  boolean isPast();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Message#isPast <em>Past</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Past</em>' attribute.
   * @see #isPast()
   * @generated
   */
  void setPast(boolean value);

  /**
   * Returns the value of the '<em><b>Future</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Future</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Future</em>' attribute.
   * @see #setFuture(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_Future()
   * @model
   * @generated
   */
  boolean isFuture();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Message#isFuture <em>Future</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Future</em>' attribute.
   * @see #isFuture()
   * @generated
   */
  void setFuture(boolean value);

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' attribute.
   * @see #setConstraint(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_Constraint()
   * @model
   * @generated
   */
  boolean isConstraint();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Message#isConstraint <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' attribute.
   * @see #isConstraint()
   * @generated
   */
  void setConstraint(boolean value);

  /**
   * Returns the value of the '<em><b>C</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' reference.
   * @see #setC(Constraint)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_C()
   * @model
   * @generated
   */
  Constraint getC();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Message#getC <em>C</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' reference.
   * @see #getC()
   * @generated
   */
  void setC(Constraint value);

  /**
   * Returns the value of the '<em><b>Constraintexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraintexp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraintexp</em>' containment reference.
   * @see #setConstraintexp(ClockConstraintExpression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_Constraintexp()
   * @model containment="true"
   * @generated
   */
  ClockConstraintExpression getConstraintexp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Message#getConstraintexp <em>Constraintexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraintexp</em>' containment reference.
   * @see #getConstraintexp()
   * @generated
   */
  void setConstraintexp(ClockConstraintExpression value);

  /**
   * Returns the value of the '<em><b>Resetinconstraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resetinconstraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resetinconstraint</em>' containment reference.
   * @see #setResetinconstraint(ResetClock)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_Resetinconstraint()
   * @model containment="true"
   * @generated
   */
  ResetClock getResetinconstraint();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Message#getResetinconstraint <em>Resetinconstraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resetinconstraint</em>' containment reference.
   * @see #getResetinconstraint()
   * @generated
   */
  void setResetinconstraint(ResetClock value);

  /**
   * Returns the value of the '<em><b>Clockconstraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clockconstraint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clockconstraint</em>' attribute.
   * @see #setClockconstraint(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_Clockconstraint()
   * @model
   * @generated
   */
  boolean isClockconstraint();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Message#isClockconstraint <em>Clockconstraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clockconstraint</em>' attribute.
   * @see #isClockconstraint()
   * @generated
   */
  void setClockconstraint(boolean value);

  /**
   * Returns the value of the '<em><b>CConstraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>CConstraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>CConstraint</em>' containment reference.
   * @see #setCConstraint(ClockConstraintExpression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_CConstraint()
   * @model containment="true"
   * @generated
   */
  ClockConstraintExpression getCConstraint();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Message#getCConstraint <em>CConstraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CConstraint</em>' containment reference.
   * @see #getCConstraint()
   * @generated
   */
  void setCConstraint(ClockConstraintExpression value);

  /**
   * Returns the value of the '<em><b>Resetclock</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resetclock</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resetclock</em>' containment reference.
   * @see #setResetclock(ResetClock)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMessage_Resetclock()
   * @model containment="true"
   * @generated
   */
  ResetClock getResetclock();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Message#getResetclock <em>Resetclock</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resetclock</em>' containment reference.
   * @see #getResetclock()
   * @generated
   */
  void setResetclock(ResetClock value);

} // Message
