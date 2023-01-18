/**
 */
package EssentialOCL.tests;

import EMOF.tests.TypedElementTest;

import EssentialOCL.EssentialOCLFactory;
import EssentialOCL.ExpressionInOcl;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Expression In Ocl</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionInOclTest extends TypedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExpressionInOclTest.class);
	}

	/**
	 * Constructs a new Expression In Ocl test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOclTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Expression In Ocl test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExpressionInOcl getFixture() {
		return (ExpressionInOcl)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EssentialOCLFactory.eINSTANCE.createExpressionInOcl());
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

} //ExpressionInOclTest
