/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.GNFCImpl <em>GNFC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.GNFCImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getGNFC()
   * @generated
   */
  int GNFC = 0;

  /**
   * The feature id for the '<em><b>W</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GNFC__W = 0;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GNFC__INIT = 1;

  /**
   * The feature id for the '<em><b>Productions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GNFC__PRODUCTIONS = 2;

  /**
   * The number of structural features of the '<em>GNFC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GNFC_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.InitialImpl <em>Initial</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.InitialImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInitial()
   * @generated
   */
  int INITIAL = 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL__LEFT = 0;

  /**
   * The feature id for the '<em><b>Rigth</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL__RIGTH = 1;

  /**
   * The number of structural features of the '<em>Initial</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ProductionImpl <em>Production</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ProductionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getProduction()
   * @generated
   */
  int PRODUCTION = 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCTION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Rigth</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCTION__RIGTH = 1;

  /**
   * The number of structural features of the '<em>Production</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RigthImpl <em>Rigth</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RigthImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRigth()
   * @generated
   */
  int RIGTH = 3;

  /**
   * The feature id for the '<em><b>Simple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGTH__SIMPLE = 0;

  /**
   * The feature id for the '<em><b>Binary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGTH__BINARY = 1;

  /**
   * The number of structural features of the '<em>Rigth</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGTH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SimpleImpl <em>Simple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SimpleImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSimple()
   * @generated
   */
  int SIMPLE = 4;

  /**
   * The feature id for the '<em><b>Alpha</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE__ALPHA = 0;

  /**
   * The number of structural features of the '<em>Simple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NonTerminalImpl <em>Non Terminal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NonTerminalImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNonTerminal()
   * @generated
   */
  int NON_TERMINAL = 5;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_TERMINAL__VAR = 0;

  /**
   * The number of structural features of the '<em>Non Terminal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_TERMINAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BinaryImpl <em>Binary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BinaryImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBinary()
   * @generated
   */
  int BINARY = 6;

  /**
   * The feature id for the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY__FIRST = 0;

  /**
   * The feature id for the '<em><b>Second</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY__SECOND = 1;

  /**
   * The number of structural features of the '<em>Binary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.GNFC <em>GNFC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GNFC</em>'.
   * @see org.xtext.example.mydsl.myDsl.GNFC
   * @generated
   */
  EClass getGNFC();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.GNFC#getW <em>W</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>W</em>'.
   * @see org.xtext.example.mydsl.myDsl.GNFC#getW()
   * @see #getGNFC()
   * @generated
   */
  EReference getGNFC_W();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.GNFC#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.xtext.example.mydsl.myDsl.GNFC#getInit()
   * @see #getGNFC()
   * @generated
   */
  EReference getGNFC_Init();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.GNFC#getProductions <em>Productions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Productions</em>'.
   * @see org.xtext.example.mydsl.myDsl.GNFC#getProductions()
   * @see #getGNFC()
   * @generated
   */
  EReference getGNFC_Productions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Initial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initial</em>'.
   * @see org.xtext.example.mydsl.myDsl.Initial
   * @generated
   */
  EClass getInitial();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Initial#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see org.xtext.example.mydsl.myDsl.Initial#getLeft()
   * @see #getInitial()
   * @generated
   */
  EAttribute getInitial_Left();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Initial#getRigth <em>Rigth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rigth</em>'.
   * @see org.xtext.example.mydsl.myDsl.Initial#getRigth()
   * @see #getInitial()
   * @generated
   */
  EReference getInitial_Rigth();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Production <em>Production</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Production</em>'.
   * @see org.xtext.example.mydsl.myDsl.Production
   * @generated
   */
  EClass getProduction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Production#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.myDsl.Production#getLeft()
   * @see #getProduction()
   * @generated
   */
  EReference getProduction_Left();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Production#getRigth <em>Rigth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rigth</em>'.
   * @see org.xtext.example.mydsl.myDsl.Production#getRigth()
   * @see #getProduction()
   * @generated
   */
  EReference getProduction_Rigth();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Rigth <em>Rigth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rigth</em>'.
   * @see org.xtext.example.mydsl.myDsl.Rigth
   * @generated
   */
  EClass getRigth();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Rigth#getSimple <em>Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Simple</em>'.
   * @see org.xtext.example.mydsl.myDsl.Rigth#getSimple()
   * @see #getRigth()
   * @generated
   */
  EReference getRigth_Simple();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Rigth#getBinary <em>Binary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary</em>'.
   * @see org.xtext.example.mydsl.myDsl.Rigth#getBinary()
   * @see #getRigth()
   * @generated
   */
  EReference getRigth_Binary();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Simple <em>Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple</em>'.
   * @see org.xtext.example.mydsl.myDsl.Simple
   * @generated
   */
  EClass getSimple();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Simple#getAlpha <em>Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alpha</em>'.
   * @see org.xtext.example.mydsl.myDsl.Simple#getAlpha()
   * @see #getSimple()
   * @generated
   */
  EAttribute getSimple_Alpha();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.NonTerminal <em>Non Terminal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Terminal</em>'.
   * @see org.xtext.example.mydsl.myDsl.NonTerminal
   * @generated
   */
  EClass getNonTerminal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.NonTerminal#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see org.xtext.example.mydsl.myDsl.NonTerminal#getVar()
   * @see #getNonTerminal()
   * @generated
   */
  EAttribute getNonTerminal_Var();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Binary <em>Binary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary</em>'.
   * @see org.xtext.example.mydsl.myDsl.Binary
   * @generated
   */
  EClass getBinary();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Binary#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First</em>'.
   * @see org.xtext.example.mydsl.myDsl.Binary#getFirst()
   * @see #getBinary()
   * @generated
   */
  EReference getBinary_First();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Binary#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second</em>'.
   * @see org.xtext.example.mydsl.myDsl.Binary#getSecond()
   * @see #getBinary()
   * @generated
   */
  EReference getBinary_Second();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.GNFCImpl <em>GNFC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.GNFCImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getGNFC()
     * @generated
     */
    EClass GNFC = eINSTANCE.getGNFC();

    /**
     * The meta object literal for the '<em><b>W</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GNFC__W = eINSTANCE.getGNFC_W();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GNFC__INIT = eINSTANCE.getGNFC_Init();

    /**
     * The meta object literal for the '<em><b>Productions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GNFC__PRODUCTIONS = eINSTANCE.getGNFC_Productions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.InitialImpl <em>Initial</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.InitialImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInitial()
     * @generated
     */
    EClass INITIAL = eINSTANCE.getInitial();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INITIAL__LEFT = eINSTANCE.getInitial_Left();

    /**
     * The meta object literal for the '<em><b>Rigth</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIAL__RIGTH = eINSTANCE.getInitial_Rigth();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ProductionImpl <em>Production</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ProductionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getProduction()
     * @generated
     */
    EClass PRODUCTION = eINSTANCE.getProduction();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCTION__LEFT = eINSTANCE.getProduction_Left();

    /**
     * The meta object literal for the '<em><b>Rigth</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCTION__RIGTH = eINSTANCE.getProduction_Rigth();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RigthImpl <em>Rigth</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RigthImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRigth()
     * @generated
     */
    EClass RIGTH = eINSTANCE.getRigth();

    /**
     * The meta object literal for the '<em><b>Simple</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGTH__SIMPLE = eINSTANCE.getRigth_Simple();

    /**
     * The meta object literal for the '<em><b>Binary</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGTH__BINARY = eINSTANCE.getRigth_Binary();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SimpleImpl <em>Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SimpleImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSimple()
     * @generated
     */
    EClass SIMPLE = eINSTANCE.getSimple();

    /**
     * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE__ALPHA = eINSTANCE.getSimple_Alpha();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NonTerminalImpl <em>Non Terminal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NonTerminalImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNonTerminal()
     * @generated
     */
    EClass NON_TERMINAL = eINSTANCE.getNonTerminal();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NON_TERMINAL__VAR = eINSTANCE.getNonTerminal_Var();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BinaryImpl <em>Binary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BinaryImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBinary()
     * @generated
     */
    EClass BINARY = eINSTANCE.getBinary();

    /**
     * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY__FIRST = eINSTANCE.getBinary_First();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY__SECOND = eINSTANCE.getBinary_Second();

  }

} //MyDslPackage
