/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Domain#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Domain#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Domain#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Domain#getContextmodels <em>Contextmodels</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Domain#getContextfragments <em>Contextfragments</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Domain#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Domain#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Domain#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject
{
  /**
   * Returns the value of the '<em><b>Specification</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specification</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specification</em>' attribute.
   * @see #setSpecification(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDomain_Specification()
   * @model
   * @generated
   */
  String getSpecification();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Domain#getSpecification <em>Specification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specification</em>' attribute.
   * @see #getSpecification()
   * @generated
   */
  void setSpecification(String value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDomain_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Domain#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Include}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDomain_Includes()
   * @model containment="true"
   * @generated
   */
  EList<Include> getIncludes();

  /**
   * Returns the value of the '<em><b>Contextmodels</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ContextModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contextmodels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contextmodels</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDomain_Contextmodels()
   * @model containment="true"
   * @generated
   */
  EList<ContextModel> getContextmodels();

  /**
   * Returns the value of the '<em><b>Contextfragments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ContextFragment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contextfragments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contextfragments</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDomain_Contextfragments()
   * @model containment="true"
   * @generated
   */
  EList<ContextFragment> getContextfragments();

  /**
   * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Object}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objects</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDomain_Objects()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.example.mydsl.myDsl.Object> getObjects();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDomain_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

  /**
   * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Scenario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenarios</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDomain_Scenarios()
   * @model containment="true"
   * @generated
   */
  EList<Scenario> getScenarios();

} // Domain
