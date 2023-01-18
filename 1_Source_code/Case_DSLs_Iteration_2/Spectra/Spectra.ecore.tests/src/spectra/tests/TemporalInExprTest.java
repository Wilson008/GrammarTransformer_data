/**
 */
package spectra.tests;

import junit.textui.TestRunner;

import spectra.SpectraFactory;
import spectra.TemporalInExpr;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Temporal In Expr</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalInExprTest extends TemporalExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemporalInExprTest.class);
	}

	/**
	 * Constructs a new Temporal In Expr test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalInExprTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Temporal In Expr test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TemporalInExpr getFixture() {
		return (TemporalInExpr)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpectraFactory.eINSTANCE.createTemporalInExpr());
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

} //TemporalInExprTest
