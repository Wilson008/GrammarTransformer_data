/**
 */
package ImperativeOCL.tests;

import EMOF.tests.ElementTest;

import ImperativeOCL.ImperativeOCLFactory;
import ImperativeOCL.OrderedTupleLiteralPart;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ordered Tuple Literal Part</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrderedTupleLiteralPartTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrderedTupleLiteralPartTest.class);
	}

	/**
	 * Constructs a new Ordered Tuple Literal Part test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedTupleLiteralPartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ordered Tuple Literal Part test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OrderedTupleLiteralPart getFixture() {
		return (OrderedTupleLiteralPart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImperativeOCLFactory.eINSTANCE.createOrderedTupleLiteralPart());
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

} //OrderedTupleLiteralPartTest
