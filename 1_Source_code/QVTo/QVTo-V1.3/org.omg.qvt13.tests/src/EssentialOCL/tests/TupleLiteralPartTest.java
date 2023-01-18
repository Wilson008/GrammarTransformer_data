/**
 */
package EssentialOCL.tests;

import EMOF.tests.TypedElementTest;

import EssentialOCL.EssentialOCLFactory;
import EssentialOCL.TupleLiteralPart;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tuple Literal Part</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TupleLiteralPartTest extends TypedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TupleLiteralPartTest.class);
	}

	/**
	 * Constructs a new Tuple Literal Part test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleLiteralPartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tuple Literal Part test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TupleLiteralPart getFixture() {
		return (TupleLiteralPart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EssentialOCLFactory.eINSTANCE.createTupleLiteralPart());
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

} //TupleLiteralPartTest
