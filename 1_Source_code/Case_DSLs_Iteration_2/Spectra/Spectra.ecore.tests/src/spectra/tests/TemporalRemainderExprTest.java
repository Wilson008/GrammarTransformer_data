/**
 */
package spectra.tests;

import junit.textui.TestRunner;

import spectra.SpectraFactory;
import spectra.TemporalRemainderExpr;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Temporal Remainder Expr</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalRemainderExprTest extends TemporalExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemporalRemainderExprTest.class);
	}

	/**
	 * Constructs a new Temporal Remainder Expr test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalRemainderExprTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Temporal Remainder Expr test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TemporalRemainderExpr getFixture() {
		return (TemporalRemainderExpr)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpectraFactory.eINSTANCE.createTemporalRemainderExpr());
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

} //TemporalRemainderExprTest
