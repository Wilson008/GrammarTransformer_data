/**
 */
package spectra.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import spectra.SpectraFactory;
import spectra.ValueInRange;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Value In Range</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueInRangeTest extends TestCase {

	/**
	 * The fixture for this Value In Range test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueInRange fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValueInRangeTest.class);
	}

	/**
	 * Constructs a new Value In Range test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueInRangeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Value In Range test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ValueInRange fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Value In Range test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueInRange getFixture() {
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
		setFixture(SpectraFactory.eINSTANCE.createValueInRange());
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

} //ValueInRangeTest
