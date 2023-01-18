/**
 */
package QVTOperational.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>QVTOperational</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class QVTOperationalTests extends TestSuite {

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
		TestSuite suite = new QVTOperationalTests("QVTOperational Tests");
		suite.addTestSuite(ConstructorTest.class);
		suite.addTestSuite(ConstructorBodyTest.class);
		suite.addTestSuite(ContextualPropertyTest.class);
		suite.addTestSuite(EntryOperationTest.class);
		suite.addTestSuite(HelperTest.class);
		suite.addTestSuite(ImperativeOperationTest.class);
		suite.addTestSuite(LibraryTest.class);
		suite.addTestSuite(MappingBodyTest.class);
		suite.addTestSuite(MappingOperationTest.class);
		suite.addTestSuite(MappingParameterTest.class);
		suite.addTestSuite(ModelParameterTest.class);
		suite.addTestSuite(ModelTypeTest.class);
		suite.addTestSuite(ModuleTest.class);
		suite.addTestSuite(ModuleImportTest.class);
		suite.addTestSuite(OperationBodyTest.class);
		suite.addTestSuite(OperationalTransformationTest.class);
		suite.addTestSuite(VarParameterTest.class);
		suite.addTestSuite(TagGOTest.class);
		suite.addTestSuite(MetaModelGOTest.class);
		suite.addTestSuite(AccessDeclTest.class);
		suite.addTestSuite(TypeDefTest.class);
		suite.addTestSuite(ClassifierGOTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTOperationalTests(String name) {
		super(name);
	}

} //QVTOperationalTests
