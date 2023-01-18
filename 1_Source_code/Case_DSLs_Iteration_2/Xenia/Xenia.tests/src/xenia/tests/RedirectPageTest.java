/**
 */
package xenia.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import xenia.RedirectPage;
import xenia.XeniaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Redirect Page</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RedirectPageTest extends TestCase {

	/**
	 * The fixture for this Redirect Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedirectPage fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RedirectPageTest.class);
	}

	/**
	 * Constructs a new Redirect Page test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedirectPageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Redirect Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RedirectPage fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Redirect Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedirectPage getFixture() {
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
		setFixture(XeniaFactory.eINSTANCE.createRedirectPage());
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

} //RedirectPageTest
