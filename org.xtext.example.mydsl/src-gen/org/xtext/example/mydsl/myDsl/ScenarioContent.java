/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ScenarioContent#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ScenarioContent#getMessage <em>Message</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ScenarioContent#getPar <em>Par</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ScenarioContent#getLoop <em>Loop</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getScenarioContent()
 * @model
 * @generated
 */
public interface ScenarioContent extends EObject
{
  /**
   * Returns the value of the '<em><b>Alt</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Alt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alt</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alt</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getScenarioContent_Alt()
   * @model containment="true"
   * @generated
   */
  EList<Alt> getAlt();

  /**
   * Returns the value of the '<em><b>Message</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Message}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getScenarioContent_Message()
   * @model containment="true"
   * @generated
   */
  EList<Message> getMessage();

  /**
   * Returns the value of the '<em><b>Par</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Par}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getScenarioContent_Par()
   * @model containment="true"
   * @generated
   */
  EList<Par> getPar();

  /**
   * Returns the value of the '<em><b>Loop</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Loop}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loop</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getScenarioContent_Loop()
   * @model containment="true"
   * @generated
   */
  EList<Loop> getLoop();

} // ScenarioContent
