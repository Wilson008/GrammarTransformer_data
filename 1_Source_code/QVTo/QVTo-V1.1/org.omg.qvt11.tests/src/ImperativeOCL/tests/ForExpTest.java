/**
 */
package ImperativeOCL.tests;

import ImperativeOCL.ForExp;
import ImperativeOCL.ImperativeOCLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>For Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForExpTest extends ImperativeLoopExpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ForExpTest.class);
	}

	/**
	 * Constructs a new For Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this For Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ForExp getFixture() {
		return (ForExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImperativeOCLFactory.eINSTANCE.createForExp());
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

} //ForExpTest
