/**
 */
package spectra.tests;

import junit.textui.TestRunner;

import spectra.SpectraFactory;
import spectra.TemporalMultiplicativeExpr;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Temporal Multiplicative Expr</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalMultiplicativeExprTest extends TemporalExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemporalMultiplicativeExprTest.class);
	}

	/**
	 * Constructs a new Temporal Multiplicative Expr test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalMultiplicativeExprTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Temporal Multiplicative Expr test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TemporalMultiplicativeExpr getFixture() {
		return (TemporalMultiplicativeExpr)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpectraFactory.eINSTANCE.createTemporalMultiplicativeExpr());
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

} //TemporalMultiplicativeExprTest
