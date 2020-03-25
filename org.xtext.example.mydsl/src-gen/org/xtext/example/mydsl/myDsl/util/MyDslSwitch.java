/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.Alt;
import org.xtext.example.mydsl.myDsl.AltCondition;
import org.xtext.example.mydsl.myDsl.AppearMessage;
import org.xtext.example.mydsl.myDsl.AssertionEntity;
import org.xtext.example.mydsl.myDsl.AssertionRelation;
import org.xtext.example.mydsl.myDsl.Attribute;
import org.xtext.example.mydsl.myDsl.AttributeValue;
import org.xtext.example.mydsl.myDsl.ChangeMessage;
import org.xtext.example.mydsl.myDsl.ChangeToMessage;
import org.xtext.example.mydsl.myDsl.ChangeToRelation;
import org.xtext.example.mydsl.myDsl.Clock;
import org.xtext.example.mydsl.myDsl.ClockConstraint;
import org.xtext.example.mydsl.myDsl.ClockConstraintExpression;
import org.xtext.example.mydsl.myDsl.ConstantParams;
import org.xtext.example.mydsl.myDsl.Constraint;
import org.xtext.example.mydsl.myDsl.ContextFragment;
import org.xtext.example.mydsl.myDsl.ContextMessage;
import org.xtext.example.mydsl.myDsl.ContextMessageContent;
import org.xtext.example.mydsl.myDsl.ContextModel;
import org.xtext.example.mydsl.myDsl.DisappearMessage;
import org.xtext.example.mydsl.myDsl.Domain;
import org.xtext.example.mydsl.myDsl.Entity;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.FEntity;
import org.xtext.example.mydsl.myDsl.FRelation;
import org.xtext.example.mydsl.myDsl.FragmentAttribute;
import org.xtext.example.mydsl.myDsl.Include;
import org.xtext.example.mydsl.myDsl.Loop;
import org.xtext.example.mydsl.myDsl.MatchMessage;
import org.xtext.example.mydsl.myDsl.Message;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.ObjectType;
import org.xtext.example.mydsl.myDsl.Operator;
import org.xtext.example.mydsl.myDsl.Par;
import org.xtext.example.mydsl.myDsl.ParExpression;
import org.xtext.example.mydsl.myDsl.Parameter;
import org.xtext.example.mydsl.myDsl.ParameterConstraint;
import org.xtext.example.mydsl.myDsl.Params;
import org.xtext.example.mydsl.myDsl.Relation;
import org.xtext.example.mydsl.myDsl.ResetClock;
import org.xtext.example.mydsl.myDsl.Scenario;
import org.xtext.example.mydsl.myDsl.ScenarioContent;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.DOMAIN:
      {
        Domain domain = (Domain)theEObject;
        T result = caseDomain(domain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INCLUDE:
      {
        Include include = (Include)theEObject;
        T result = caseInclude(include);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONTEXT_MODEL:
      {
        ContextModel contextModel = (ContextModel)theEObject;
        T result = caseContextModel(contextModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONTEXT_FRAGMENT:
      {
        ContextFragment contextFragment = (ContextFragment)theEObject;
        T result = caseContextFragment(contextFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ATTRIBUTE_VALUE:
      {
        AttributeValue attributeValue = (AttributeValue)theEObject;
        T result = caseAttributeValue(attributeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FRAGMENT_ATTRIBUTE:
      {
        FragmentAttribute fragmentAttribute = (FragmentAttribute)theEObject;
        T result = caseFragmentAttribute(fragmentAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FENTITY:
      {
        FEntity fEntity = (FEntity)theEObject;
        T result = caseFEntity(fEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RELATION:
      {
        Relation relation = (Relation)theEObject;
        T result = caseRelation(relation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FRELATION:
      {
        FRelation fRelation = (FRelation)theEObject;
        T result = caseFRelation(fRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SCENARIO:
      {
        Scenario scenario = (Scenario)theEObject;
        T result = caseScenario(scenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SCENARIO_CONTENT:
      {
        ScenarioContent scenarioContent = (ScenarioContent)theEObject;
        T result = caseScenarioContent(scenarioContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MESSAGE:
      {
        Message message = (Message)theEObject;
        T result = caseMessage(message);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RESET_CLOCK:
      {
        ResetClock resetClock = (ResetClock)theEObject;
        T result = caseResetClock(resetClock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CLOCK_CONSTRAINT:
      {
        ClockConstraint clockConstraint = (ClockConstraint)theEObject;
        T result = caseClockConstraint(clockConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CLOCK_CONSTRAINT_EXPRESSION:
      {
        ClockConstraintExpression clockConstraintExpression = (ClockConstraintExpression)theEObject;
        T result = caseClockConstraintExpression(clockConstraintExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONTEXT_MESSAGE:
      {
        ContextMessage contextMessage = (ContextMessage)theEObject;
        T result = caseContextMessage(contextMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONTEXT_MESSAGE_CONTENT:
      {
        ContextMessageContent contextMessageContent = (ContextMessageContent)theEObject;
        T result = caseContextMessageContent(contextMessageContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MATCH_MESSAGE:
      {
        MatchMessage matchMessage = (MatchMessage)theEObject;
        T result = caseMatchMessage(matchMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CHANGE_MESSAGE:
      {
        ChangeMessage changeMessage = (ChangeMessage)theEObject;
        T result = caseChangeMessage(changeMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.APPEAR_MESSAGE:
      {
        AppearMessage appearMessage = (AppearMessage)theEObject;
        T result = caseAppearMessage(appearMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DISAPPEAR_MESSAGE:
      {
        DisappearMessage disappearMessage = (DisappearMessage)theEObject;
        T result = caseDisappearMessage(disappearMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CHANGE_TO_MESSAGE:
      {
        ChangeToMessage changeToMessage = (ChangeToMessage)theEObject;
        T result = caseChangeToMessage(changeToMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CHANGE_TO_RELATION:
      {
        ChangeToRelation changeToRelation = (ChangeToRelation)theEObject;
        T result = caseChangeToRelation(changeToRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ASSERTION_ENTITY:
      {
        AssertionEntity assertionEntity = (AssertionEntity)theEObject;
        T result = caseAssertionEntity(assertionEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ASSERTION_RELATION:
      {
        AssertionRelation assertionRelation = (AssertionRelation)theEObject;
        T result = caseAssertionRelation(assertionRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PARAMS:
      {
        Params params = (Params)theEObject;
        T result = caseParams(params);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONSTANT_PARAMS:
      {
        ConstantParams constantParams = (ConstantParams)theEObject;
        T result = caseConstantParams(constantParams);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PARAMETER_CONSTRAINT:
      {
        ParameterConstraint parameterConstraint = (ParameterConstraint)theEObject;
        T result = caseParameterConstraint(parameterConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.OPERATOR:
      {
        Operator operator = (Operator)theEObject;
        T result = caseOperator(operator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CLOCK:
      {
        Clock clock = (Clock)theEObject;
        T result = caseClock(clock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.OBJECT_TYPE:
      {
        ObjectType objectType = (ObjectType)theEObject;
        T result = caseObjectType(objectType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.OBJECT:
      {
        org.xtext.example.mydsl.myDsl.Object object = (org.xtext.example.mydsl.myDsl.Object)theEObject;
        T result = caseObject(object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ALT:
      {
        Alt alt = (Alt)theEObject;
        T result = caseAlt(alt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ALT_CONDITION:
      {
        AltCondition altCondition = (AltCondition)theEObject;
        T result = caseAltCondition(altCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PAR:
      {
        Par par = (Par)theEObject;
        T result = casePar(par);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PAR_EXPRESSION:
      {
        ParExpression parExpression = (ParExpression)theEObject;
        T result = caseParExpression(parExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LOOP:
      {
        Loop loop = (Loop)theEObject;
        T result = caseLoop(loop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomain(Domain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInclude(Include object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextModel(ContextModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextFragment(ContextFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeValue(AttributeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fragment Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fragment Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFragmentAttribute(FragmentAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FEntity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FEntity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFEntity(FEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelation(Relation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FRelation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FRelation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFRelation(FRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenario(Scenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenarioContent(ScenarioContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessage(Message object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reset Clock</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reset Clock</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResetClock(ResetClock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clock Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clock Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClockConstraint(ClockConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clock Constraint Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clock Constraint Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClockConstraintExpression(ClockConstraintExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextMessage(ContextMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Message Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Message Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextMessageContent(ContextMessageContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Match Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Match Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatchMessage(MatchMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Change Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Change Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChangeMessage(ChangeMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Appear Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Appear Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppearMessage(AppearMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disappear Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disappear Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisappearMessage(DisappearMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Change To Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Change To Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChangeToMessage(ChangeToMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Change To Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Change To Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChangeToRelation(ChangeToRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assertion Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assertion Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertionEntity(AssertionEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assertion Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assertion Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertionRelation(AssertionRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Params</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Params</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParams(Params object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Params</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Params</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantParams(ConstantParams object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterConstraint(ParameterConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperator(Operator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clock</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clock</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClock(Clock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectType(ObjectType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject(org.xtext.example.mydsl.myDsl.Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlt(Alt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alt Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alt Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAltCondition(AltCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Par</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Par</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePar(Par object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Par Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Par Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParExpression(ParExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoop(Loop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
