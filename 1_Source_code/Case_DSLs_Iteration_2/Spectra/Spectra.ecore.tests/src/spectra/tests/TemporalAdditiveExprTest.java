/**
 */
package spectra.tests;

import junit.textui.TestRunner;

import spectra.SpectraFactory;
import spectra.TemporalAdditiveExpr;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Temporal Additive Expr</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalAdditiveExprTest extends TemporalExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemporalAdditiveExprTest.class);
	}

	/**
	 * Constructs a new Temporal Additive Expr test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalAdditiveExprTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Temporal Additive Expr test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TemporalAdditiveExpr getFixture() {
		return (TemporalAdditiveExpr)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpectraFactory.eINSTANCE.createTemporalAdditiveExpr());
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

} //TemporalAdditiveExprTest
