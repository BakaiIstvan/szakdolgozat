/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Expression#getAltCondition <em>Alt Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Expression#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Alt Condition</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.AltCondition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alt Condition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alt Condition</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExpression_AltCondition()
   * @model containment="true"
   * @generated
   */
  EList<AltCondition> getAltCondition();

  /**
   * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Message}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Messages</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExpression_Messages()
   * @model containment="true"
   * @generated
   */
  EList<Message> getMessages();

} // Expression
