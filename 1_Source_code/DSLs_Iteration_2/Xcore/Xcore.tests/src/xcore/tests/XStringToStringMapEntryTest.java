/**
 */
package xcore.tests;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import xcore.XcoreFactory;
import xcore.XcorePackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XString To String Map Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XStringToStringMapEntryTest extends TestCase {

	/**
	 * The fixture for this XString To String Map Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, String> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XStringToStringMapEntryTest.class);
	}

	/**
	 * Constructs a new XString To String Map Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XStringToStringMapEntryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this XString To String Map Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<String, String> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this XString To String Map Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, String> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		setFixture((Map.Entry<String, String>)XcoreFactory.eINSTANCE.create(XcorePackage.Literals.XSTRING_TO_STRING_MAP_ENTRY));
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

} //XStringToStringMapEntryTest
