/**
 */
package spectra.tests;

import junit.textui.TestRunner;

import spectra.Counter;
import spectra.SpectraFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CounterTest extends DeclTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CounterTest.class);
	}

	/**
	 * Constructs a new Counter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CounterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Counter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Counter getFixture() {
		return (Counter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpectraFactory.eINSTANCE.createCounter());
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

} //CounterTest
