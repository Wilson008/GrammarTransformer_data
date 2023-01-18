/**
 */
package qvtoperational.tests;

import emof.tests.ParameterTest;

import junit.textui.TestRunner;

import qvtoperational.QvtoperationalFactory;
import qvtoperational.VarParameter;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Var Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VarParameterTest extends ParameterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VarParameterTest.class);
	}

	/**
	 * Constructs a new Var Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Var Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VarParameter getFixture() {
		return (VarParameter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QvtoperationalFactory.eINSTANCE.createVarParameter());
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

} //VarParameterTest
