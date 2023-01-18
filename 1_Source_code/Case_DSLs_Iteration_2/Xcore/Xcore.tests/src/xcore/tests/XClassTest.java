/**
 */
package xcore.tests;

import junit.textui.TestRunner;

import xcore.XClass;
import xcore.XcoreFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XClass</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XClassTest extends XClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XClassTest.class);
	}

	/**
	 * Constructs a new XClass test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XClass test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XClass getFixture() {
		return (XClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XcoreFactory.eINSTANCE.createXClass());
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

} //XClassTest
