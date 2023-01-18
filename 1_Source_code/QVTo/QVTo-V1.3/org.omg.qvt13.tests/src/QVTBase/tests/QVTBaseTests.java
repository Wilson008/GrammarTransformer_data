/**
 */
package QVTBase.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>QVTBase</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class QVTBaseTests extends TestSuite {

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
		TestSuite suite = new QVTBaseTests("QVTBase Tests");
		suite.addTestSuite(FunctionTest.class);
		suite.addTestSuite(FunctionParameterTest.class);
		suite.addTestSuite(PatternTest.class);
		suite.addTestSuite(PredicateTest.class);
		suite.addTestSuite(TransformationTest.class);
		suite.addTestSuite(TypedModelTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTBaseTests(String name) {
		super(name);
	}

} //QVTBaseTests
