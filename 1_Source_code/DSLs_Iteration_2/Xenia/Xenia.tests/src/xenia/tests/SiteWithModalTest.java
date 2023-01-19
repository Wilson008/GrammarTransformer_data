/**
 */
package xenia.tests;

import junit.textui.TestRunner;

import xenia.SiteWithModal;
import xenia.XeniaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Site With Modal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SiteWithModalTest extends SuperSiteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SiteWithModalTest.class);
	}

	/**
	 * Constructs a new Site With Modal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteWithModalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Site With Modal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SiteWithModal getFixture() {
		return (SiteWithModal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XeniaFactory.eINSTANCE.createSiteWithModal());
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

} //SiteWithModalTest
