/**
 */
package xenia.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import xenia.InfoEntity;
import xenia.XeniaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Info Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfoEntityTest extends TestCase {

	/**
	 * The fixture for this Info Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoEntity fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InfoEntityTest.class);
	}

	/**
	 * Constructs a new Info Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoEntityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Info Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InfoEntity fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Info Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoEntity getFixture() {
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
		setFixture(XeniaFactory.eINSTANCE.createInfoEntity());
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

} //InfoEntityTest
