/**
 */
package xcore.tests;

import junit.textui.TestRunner;

import xcore.XDataType;
import xcore.XcoreFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XData Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XDataTypeTest extends XClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XDataTypeTest.class);
	}

	/**
	 * Constructs a new XData Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDataTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XData Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XDataType getFixture() {
		return (XDataType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XcoreFactory.eINSTANCE.createXDataType());
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

} //XDataTypeTest
