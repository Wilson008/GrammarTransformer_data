/**
 */
package QVTOperational.tests;

import QVTOperational.MappingCallExp;
import QVTOperational.QVTOperationalFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mapping Call Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingCallExpTest extends ImperativeCallExpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MappingCallExpTest.class);
	}

	/**
	 * Constructs a new Mapping Call Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingCallExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mapping Call Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MappingCallExp getFixture() {
		return (MappingCallExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QVTOperationalFactory.eINSTANCE.createMappingCallExp());
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

} //MappingCallExpTest
