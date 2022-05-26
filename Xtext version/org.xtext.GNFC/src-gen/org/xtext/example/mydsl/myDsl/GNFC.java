/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GNFC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.GNFC#getW <em>W</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.GNFC#getInit <em>Init</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.GNFC#getProductions <em>Productions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGNFC()
 * @model
 * @generated
 */
public interface GNFC extends EObject
{
  /**
   * Returns the value of the '<em><b>W</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Simple}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>W</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGNFC_W()
   * @model containment="true"
   * @generated
   */
  EList<Simple> getW();

  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(Initial)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGNFC_Init()
   * @model containment="true"
   * @generated
   */
  Initial getInit();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.GNFC#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(Initial value);

  /**
   * Returns the value of the '<em><b>Productions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Production}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Productions</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGNFC_Productions()
   * @model containment="true"
   * @generated
   */
  EList<Production> getProductions();

} // GNFC