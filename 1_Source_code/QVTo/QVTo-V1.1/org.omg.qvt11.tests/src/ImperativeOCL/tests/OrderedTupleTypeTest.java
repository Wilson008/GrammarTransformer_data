/**
 */
package ImperativeOCL.tests;

import EMOF.tests.ClassTest;

import ImperativeOCL.ImperativeOCLFactory;
import ImperativeOCL.OrderedTupleType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ordered Tuple Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrderedTupleTypeTest extends ClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrderedTupleTypeTest.class);
	}

	/**
	 * Constructs a new Ordered Tuple Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedTupleTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ordered Tuple Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OrderedTupleType getFixture() {
		return (OrderedTupleType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImperativeOCLFactory.eINSTANCE.createOrderedTupleType());
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

} //OrderedTupleTypeTest
