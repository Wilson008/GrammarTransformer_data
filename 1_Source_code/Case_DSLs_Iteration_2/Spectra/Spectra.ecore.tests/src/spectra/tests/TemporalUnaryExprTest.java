/**
 */
package spectra.tests;

import junit.textui.TestRunner;

import spectra.SpectraFactory;
import spectra.TemporalUnaryExpr;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Temporal Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalUnaryExprTest extends TemporalExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemporalUnaryExprTest.class);
	}

	/**
	 * Constructs a new Temporal Unary Expr test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalUnaryExprTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Temporal Unary Expr test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TemporalUnaryExpr getFixture() {
		return (TemporalUnaryExpr)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpectraFactory.eINSTANCE.createTemporalUnaryExpr());
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

} //TemporalUnaryExprTest
