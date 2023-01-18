/**
 */
package qvtoperational.tests;

import EMOF.tests.EMOFTests;
import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>QVTOperational</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class QVTOperationalAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new QVTOperationalAllTests("QVTOperational Tests");
		suite.addTest(QvtoperationalTests.suite());
		suite.addTest(EMOFTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTOperationalAllTests(String name) {
		super(name);
	}

} //QVTOperationalAllTests
