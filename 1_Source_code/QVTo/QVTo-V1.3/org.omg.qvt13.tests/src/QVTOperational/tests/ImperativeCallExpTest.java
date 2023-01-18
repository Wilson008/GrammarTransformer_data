/**
 */
package QVTOperational.tests;

import QVTOperational.ImperativeCallExp;
import QVTOperational.QVTOperationalFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Imperative Call Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImperativeCallExpTest extends ExpressionGOTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImperativeCallExpTest.class);
	}

	/**
	 * Constructs a new Imperative Call Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeCallExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Imperative Call Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImperativeCallExp getFixture() {
		return (ImperativeCallExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QVTOperationalFactory.eINSTANCE.createImperativeCallExp());
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

} //ImperativeCallExpTest
