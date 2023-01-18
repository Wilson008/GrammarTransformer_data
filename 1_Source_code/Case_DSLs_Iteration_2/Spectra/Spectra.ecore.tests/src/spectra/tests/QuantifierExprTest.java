/**
 */
package spectra.tests;

import junit.textui.TestRunner;

import spectra.QuantifierExpr;
import spectra.SpectraFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quantifier Expr</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantifierExprTest extends TemporalExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuantifierExprTest.class);
	}

	/**
	 * Constructs a new Quantifier Expr test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifierExprTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Quantifier Expr test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QuantifierExpr getFixture() {
		return (QuantifierExpr)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpectraFactory.eINSTANCE.createQuantifierExpr());
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

} //QuantifierExprTest
