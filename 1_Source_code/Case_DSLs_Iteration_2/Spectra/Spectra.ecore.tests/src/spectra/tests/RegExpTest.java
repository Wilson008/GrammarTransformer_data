/**
 */
package spectra.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import spectra.RegExp;
import spectra.SpectraFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reg Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegExpTest extends TestCase {

	/**
	 * The fixture for this Reg Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegExp fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RegExpTest.class);
	}

	/**
	 * Constructs a new Reg Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegExpTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reg Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RegExp fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reg Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegExp getFixture() {
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
		setFixture(SpectraFactory.eINSTANCE.createRegExp());
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

} //RegExpTest
