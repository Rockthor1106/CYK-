/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

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
      case MyDslPackage.GNFC:
      {
        GNFC gnfc = (GNFC)theEObject;
        T result = caseGNFC(gnfc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INITIAL:
      {
        Initial initial = (Initial)theEObject;
        T result = caseInitial(initial);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PRODUCTION:
      {
        Production production = (Production)theEObject;
        T result = caseProduction(production);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RIGTH:
      {
        Rigth rigth = (Rigth)theEObject;
        T result = caseRigth(rigth);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SIMPLE:
      {
        Simple simple = (Simple)theEObject;
        T result = caseSimple(simple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.NON_TERMINAL:
      {
        NonTerminal nonTerminal = (NonTerminal)theEObject;
        T result = caseNonTerminal(nonTerminal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BINARY:
      {
        Binary binary = (Binary)theEObject;
        T result = caseBinary(binary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GNFC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GNFC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGNFC(GNFC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initial</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initial</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitial(Initial object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Production</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Production</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProduction(Production object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rigth</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rigth</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRigth(Rigth object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimple(Simple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Terminal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Terminal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonTerminal(NonTerminal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinary(Binary object)
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
