/**
 */
package QVTRelation.tests;

import EssentialOCL.tests.PropertyCallExpTest;

import QVTRelation.OppositePropertyCallExp;
import QVTRelation.QVTRelationFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Opposite Property Call Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OppositePropertyCallExpTest extends PropertyCallExpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OppositePropertyCallExpTest.class);
	}

	/**
	 * Constructs a new Opposite Property Call Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OppositePropertyCallExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Opposite Property Call Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OppositePropertyCallExp getFixture() {
		return (OppositePropertyCallExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QVTRelationFactory.eINSTANCE.createOppositePropertyCallExp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //OppositePropertyCallExpTest
