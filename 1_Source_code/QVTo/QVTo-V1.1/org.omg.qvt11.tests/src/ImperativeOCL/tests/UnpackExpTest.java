/**
 */
package ImperativeOCL.tests;

import ImperativeOCL.ImperativeOCLFactory;
import ImperativeOCL.UnpackExp;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unpack Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnpackExpTest extends ImperativeExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnpackExpTest.class);
	}

	/**
	 * Constructs a new Unpack Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnpackExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unpack Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnpackExp getFixture() {
		return (UnpackExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImperativeOCLFactory.eINSTANCE.createUnpackExp());
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

} //UnpackExpTest
