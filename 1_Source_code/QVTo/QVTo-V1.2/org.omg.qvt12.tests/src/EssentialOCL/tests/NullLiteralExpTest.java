/**
 */
package EssentialOCL.tests;

import EssentialOCL.EssentialOCLFactory;
import EssentialOCL.NullLiteralExp;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Null Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NullLiteralExpTest extends LiteralExpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NullLiteralExpTest.class);
	}

	/**
	 * Constructs a new Null Literal Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteralExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Null Literal Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NullLiteralExp getFixture() {
		return (NullLiteralExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EssentialOCLFactory.eINSTANCE.createNullLiteralExp());
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

} //NullLiteralExpTest
