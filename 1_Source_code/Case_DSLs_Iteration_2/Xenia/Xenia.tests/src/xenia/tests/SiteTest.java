/**
 */
package xenia.tests;

import junit.textui.TestRunner;

import xenia.Site;
import xenia.XeniaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SiteTest extends SuperSiteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SiteTest.class);
	}

	/**
	 * Constructs a new Site test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Site test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Site getFixture() {
		return (Site)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XeniaFactory.eINSTANCE.createSite());
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

} //SiteTest
