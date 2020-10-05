/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greater Than Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.GreaterThanExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.GreaterThanExpression#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGreaterThanExpression()
 * @model
 * @generated
 */
public interface GreaterThanExpression extends BinaryLogicalExpression
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' reference.
   * @see #setLhs(Parameter)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGreaterThanExpression_Lhs()
   * @model
   * @generated
   */
  Parameter getLhs();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.GreaterThanExpression#getLhs <em>Lhs</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Parameter value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' attribute.
   * @see #setRhs(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGreaterThanExpression_Rhs()
   * @model
   * @generated
   */
  int getRhs();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.GreaterThanExpression#getRhs <em>Rhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' attribute.
   * @see #getRhs()
   * @generated
   */
  void setRhs(int value);

} // GreaterThanExpression
