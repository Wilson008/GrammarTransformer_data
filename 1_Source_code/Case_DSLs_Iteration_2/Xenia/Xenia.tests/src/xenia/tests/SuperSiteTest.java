/**
 */
package xenia.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import xenia.SuperSite;
import xenia.XeniaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Super Site</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperSiteTest extends TestCase {

	/**
	 * The fixture for this Super Site test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperSite fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SuperSiteTest.class);
	}

	/**
	 * Constructs a new Super Site test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperSiteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Super Site test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SuperSite fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Super Site test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperSite getFixture() {
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
		setFixture(XeniaFactory.eINSTANCE.createSuperSite());
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

} //SuperSiteTest
