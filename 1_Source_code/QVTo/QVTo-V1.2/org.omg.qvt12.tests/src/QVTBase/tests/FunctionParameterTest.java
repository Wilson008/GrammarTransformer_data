/**
 */
package QVTBase.tests;

import EssentialOCL.tests.VariableTest;

import QVTBase.FunctionParameter;
import QVTBase.QVTBaseFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionParameterTest extends VariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionParameterTest.class);
	}

	/**
	 * Constructs a new Function Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionParameter getFixture() {
		return (FunctionParameter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QVTBaseFactory.eINSTANCE.createFunctionParameter());
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

} //FunctionParameterTest
