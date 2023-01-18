/**
 */
package EssentialOCL.tests;

import EssentialOCL.EssentialOCLFactory;
import EssentialOCL.InvalidLiteralExp;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Invalid Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InvalidLiteralExpTest extends LiteralExpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InvalidLiteralExpTest.class);
	}

	/**
	 * Constructs a new Invalid Literal Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidLiteralExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Invalid Literal Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InvalidLiteralExp getFixture() {
		return (InvalidLiteralExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EssentialOCLFactory.eINSTANCE.createInvalidLiteralExp());
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

} //InvalidLiteralExpTest
