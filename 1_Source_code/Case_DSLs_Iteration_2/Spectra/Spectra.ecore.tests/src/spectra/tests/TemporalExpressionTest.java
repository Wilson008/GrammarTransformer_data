/**
 */
package spectra.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import spectra.SpectraFactory;
import spectra.TemporalExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Temporal Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalExpressionTest extends TestCase {

	/**
	 * The fixture for this Temporal Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalExpression fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemporalExpressionTest.class);
	}

	/**
	 * Constructs a new Temporal Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Temporal Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TemporalExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Temporal Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalExpression getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpectraFactory.eINSTANCE.createTemporalExpression());
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

} //TemporalExpressionTest
