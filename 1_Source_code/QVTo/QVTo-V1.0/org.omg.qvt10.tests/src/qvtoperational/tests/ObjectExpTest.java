/**
 */
package qvtoperational.tests;

import junit.textui.TestRunner;

import qvtoperational.ObjectExp;
import qvtoperational.QvtoperationalFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Object Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectExpTest extends ExpressionGOTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObjectExpTest.class);
	}

	/**
	 * Constructs a new Object Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Object Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ObjectExp getFixture() {
		return (ObjectExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QvtoperationalFactory.eINSTANCE.createObjectExp());
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

} //ObjectExpTest
