/**
 */
package ImperativeOCL.tests;

import EssentialOCL.tests.LiteralExpTest;

import ImperativeOCL.ImperativeOCLFactory;
import ImperativeOCL.ListLiteralExp;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>List Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ListLiteralExpTest extends LiteralExpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ListLiteralExpTest.class);
	}

	/**
	 * Constructs a new List Literal Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListLiteralExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this List Literal Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ListLiteralExp getFixture() {
		return (ListLiteralExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImperativeOCLFactory.eINSTANCE.createListLiteralExp());
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

} //ListLiteralExpTest
