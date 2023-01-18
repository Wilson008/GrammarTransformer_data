/**
 */
package qvtoperational.tests;

import junit.textui.TestRunner;

import qvtoperational.QvtoperationalFactory;
import qvtoperational.ResolveInExp;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resolve In Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResolveInExpTest extends ResolveExpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResolveInExpTest.class);
	}

	/**
	 * Constructs a new Resolve In Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveInExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resolve In Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResolveInExp getFixture() {
		return (ResolveInExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QvtoperationalFactory.eINSTANCE.createResolveInExp());
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

} //ResolveInExpTest
