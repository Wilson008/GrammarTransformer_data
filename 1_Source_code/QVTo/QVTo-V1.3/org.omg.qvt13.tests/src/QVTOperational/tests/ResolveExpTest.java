/**
 */
package QVTOperational.tests;

import QVTOperational.QVTOperationalFactory;
import QVTOperational.ResolveExp;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resolve Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResolveExpTest extends ExpressionGOTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResolveExpTest.class);
	}

	/**
	 * Constructs a new Resolve Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resolve Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResolveExp getFixture() {
		return (ResolveExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QVTOperationalFactory.eINSTANCE.createResolveExp());
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

} //ResolveExpTest
