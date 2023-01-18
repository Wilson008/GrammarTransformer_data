/**
 */
package EMOF.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>EMOF</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMOFTests extends TestSuite {

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
		TestSuite suite = new EMOFTests("EMOF Tests");
		suite.addTestSuite(ClassTest.class);
		suite.addTestSuite(CommentTest.class);
		suite.addTestSuite(DataTypeTest.class);
		suite.addTestSuite(EnumerationTest.class);
		suite.addTestSuite(EnumerationLiteralTest.class);
		suite.addTestSuite(ExtentTest.class);
		suite.addTestSuite(FactoryTest.class);
		suite.addTestSuite(OperationTest.class);
		suite.addTestSuite(PackageTest.class);
		suite.addTestSuite(ParameterTest.class);
		suite.addTestSuite(PrimitiveTypeTest.class);
		suite.addTestSuite(PropertyTest.class);
		suite.addTestSuite(ReflectiveCollectionTest.class);
		suite.addTestSuite(ReflectiveSequenceTest.class);
		suite.addTestSuite(TagTest.class);
		suite.addTestSuite(URIExtentTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOFTests(String name) {
		super(name);
	}

} //EMOFTests
