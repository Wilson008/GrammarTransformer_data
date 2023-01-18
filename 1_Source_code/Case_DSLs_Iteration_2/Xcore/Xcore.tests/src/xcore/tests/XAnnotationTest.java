/**
 */
package xcore.tests;

import junit.textui.TestRunner;

import xcore.XAnnotation;
import xcore.XcoreFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XAnnotation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XAnnotationTest extends XModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XAnnotationTest.class);
	}

	/**
	 * Constructs a new XAnnotation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAnnotationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XAnnotation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XAnnotation getFixture() {
		return (XAnnotation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XcoreFactory.eINSTANCE.createXAnnotation());
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

} //XAnnotationTest
