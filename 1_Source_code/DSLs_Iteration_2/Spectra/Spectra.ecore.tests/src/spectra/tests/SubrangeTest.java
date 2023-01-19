/**
 */
package spectra.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import spectra.SpectraFactory;
import spectra.Subrange;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subrange</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubrangeTest extends TestCase {

	/**
	 * The fixture for this Subrange test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Subrange fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubrangeTest.class);
	}

	/**
	 * Constructs a new Subrange test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Subrange test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Subrange fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Subrange test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Subrange getFixture() {
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
		setFixture(SpectraFactory.eINSTANCE.createSubrange());
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

} //SubrangeTest
