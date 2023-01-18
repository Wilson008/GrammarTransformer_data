/**
 */
package xcore.tests;

import junit.textui.TestRunner;

import xcore.XAnnotationDirective;
import xcore.XcoreFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XAnnotation Directive</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XAnnotationDirectiveTest extends XNamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XAnnotationDirectiveTest.class);
	}

	/**
	 * Constructs a new XAnnotation Directive test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAnnotationDirectiveTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XAnnotation Directive test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XAnnotationDirective getFixture() {
		return (XAnnotationDirective)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XcoreFactory.eINSTANCE.createXAnnotationDirective());
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

} //XAnnotationDirectiveTest
