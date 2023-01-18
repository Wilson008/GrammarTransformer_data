/**
 */
package spectra.tests;

import junit.textui.TestRunner;

import spectra.SpectraFactory;
import spectra.TemporalPrimaryExpr;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Temporal Primary Expr</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalPrimaryExprTest extends TemporalExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemporalPrimaryExprTest.class);
	}

	/**
	 * Constructs a new Temporal Primary Expr test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalPrimaryExprTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Temporal Primary Expr test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TemporalPrimaryExpr getFixture() {
		return (TemporalPrimaryExpr)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpectraFactory.eINSTANCE.createTemporalPrimaryExpr());
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

} //TemporalPrimaryExprTest
