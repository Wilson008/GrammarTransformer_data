/**
 */
package EssentialOCL.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>EssentialOCL</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EssentialOCLTests extends TestSuite {

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
		TestSuite suite = new EssentialOCLTests("EssentialOCL Tests");
		suite.addTestSuite(AnyTypeTest.class);
		suite.addTestSuite(BagTypeTest.class);
		suite.addTestSuite(BooleanLiteralExpTest.class);
		suite.addTestSuite(CollectionItemTest.class);
		suite.addTestSuite(CollectionLiteralExpTest.class);
		suite.addTestSuite(CollectionRangeTest.class);
		suite.addTestSuite(CollectionTypeTest.class);
		suite.addTestSuite(EnumLiteralExpTest.class);
		suite.addTestSuite(ExpressionInOclTest.class);
		suite.addTestSuite(IfExpTest.class);
		suite.addTestSuite(IntegerLiteralExpTest.class);
		suite.addTestSuite(InvalidLiteralExpTest.class);
		suite.addTestSuite(InvalidTypeTest.class);
		suite.addTestSuite(IterateExpTest.class);
		suite.addTestSuite(IteratorExpTest.class);
		suite.addTestSuite(LetExpTest.class);
		suite.addTestSuite(NavigationCallExpTest.class);
		suite.addTestSuite(NullLiteralExpTest.class);
		suite.addTestSuite(OperationCallExpTest.class);
		suite.addTestSuite(OrderedSetTypeTest.class);
		suite.addTestSuite(PropertyCallExpTest.class);
		suite.addTestSuite(RealLiteralExpTest.class);
		suite.addTestSuite(SequenceTypeTest.class);
		suite.addTestSuite(SetTypeTest.class);
		suite.addTestSuite(StringLiteralExpTest.class);
		suite.addTestSuite(TemplateParameterTypeTest.class);
		suite.addTestSuite(TupleLiteralExpTest.class);
		suite.addTestSuite(TupleLiteralPartTest.class);
		suite.addTestSuite(TupleTypeTest.class);
		suite.addTestSuite(TypeExpTest.class);
		suite.addTestSuite(UnlimitedNaturalExpTest.class);
		suite.addTestSuite(VariableTest.class);
		suite.addTestSuite(VariableExpTest.class);
		suite.addTestSuite(VoidTypeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EssentialOCLTests(String name) {
		super(name);
	}

} //EssentialOCLTests
