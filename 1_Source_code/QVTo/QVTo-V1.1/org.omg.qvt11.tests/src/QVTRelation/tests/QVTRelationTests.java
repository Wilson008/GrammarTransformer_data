/**
 */
package QVTRelation.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>QVTRelation</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class QVTRelationTests extends TestSuite {

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
		TestSuite suite = new QVTRelationTests("QVTRelation Tests");
		suite.addTestSuite(DomainPatternTest.class);
		suite.addTestSuite(KeyTest.class);
		suite.addTestSuite(OppositePropertyCallExpTest.class);
		suite.addTestSuite(RelationTest.class);
		suite.addTestSuite(RelationCallExpTest.class);
		suite.addTestSuite(RelationDomainTest.class);
		suite.addTestSuite(RelationDomainAssignmentTest.class);
		suite.addTestSuite(RelationImplementationTest.class);
		suite.addTestSuite(RelationalTransformationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTRelationTests(String name) {
		super(name);
	}

} //QVTRelationTests
