/**
 */
package ImperativeOCL.tests;

import EssentialOCL.tests.CollectionTypeTest;

import ImperativeOCL.ImperativeOCLFactory;
import ImperativeOCL.ListType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ListTypeTest extends CollectionTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ListTypeTest.class);
	}

	/**
	 * Constructs a new List Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this List Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ListType getFixture() {
		return (ListType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImperativeOCLFactory.eINSTANCE.createListType());
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

} //ListTypeTest
