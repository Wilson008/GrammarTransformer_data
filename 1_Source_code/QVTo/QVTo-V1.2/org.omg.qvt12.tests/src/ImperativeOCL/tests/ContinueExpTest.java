/**
 */
package ImperativeOCL.tests;

import ImperativeOCL.ContinueExp;
import ImperativeOCL.ImperativeOCLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Continue Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContinueExpTest extends ImperativeExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContinueExpTest.class);
	}

	/**
	 * Constructs a new Continue Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinueExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Continue Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContinueExp getFixture() {
		return (ContinueExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImperativeOCLFactory.eINSTANCE.createContinueExp());
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

} //ContinueExpTest
