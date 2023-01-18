/**
 */
package xcore.tests;

import junit.textui.TestRunner;

import xcore.XPackage;
import xcore.XcoreFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XPackage</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPackageTest extends XNamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XPackageTest.class);
	}

	/**
	 * Constructs a new XPackage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XPackage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XPackage getFixture() {
		return (XPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XcoreFactory.eINSTANCE.createXPackage());
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

} //XPackageTest
