/**
 */
package ImperativeOCL.tests;

import ImperativeOCL.ImperativeIterateExp;
import ImperativeOCL.ImperativeOCLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Imperative Iterate Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImperativeIterateExpTest extends ImperativeLoopExpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImperativeIterateExpTest.class);
	}

	/**
	 * Constructs a new Imperative Iterate Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeIterateExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Imperative Iterate Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImperativeIterateExp getFixture() {
		return (ImperativeIterateExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImperativeOCLFactory.eINSTANCE.createImperativeIterateExp());
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

} //ImperativeIterateExpTest
