/**
 */
package ImperativeOCL.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ImperativeOCL</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImperativeOCLTests extends TestSuite {

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
		TestSuite suite = new ImperativeOCLTests("ImperativeOCL Tests");
		suite.addTestSuite(AltExpTest.class);
		suite.addTestSuite(AssertExpTest.class);
		suite.addTestSuite(AssignExpTest.class);
		suite.addTestSuite(BlockExpTest.class);
		suite.addTestSuite(BreakExpTest.class);
		suite.addTestSuite(CatchExpTest.class);
		suite.addTestSuite(ComputeExpTest.class);
		suite.addTestSuite(ContinueExpTest.class);
		suite.addTestSuite(DictLiteralExpTest.class);
		suite.addTestSuite(DictLiteralPartTest.class);
		suite.addTestSuite(DictionaryTypeTest.class);
		suite.addTestSuite(ForExpTest.class);
		suite.addTestSuite(ImperativeIterateExpTest.class);
		suite.addTestSuite(InstantiationExpTest.class);
		suite.addTestSuite(ListLiteralExpTest.class);
		suite.addTestSuite(ListTypeTest.class);
		suite.addTestSuite(LogExpTest.class);
		suite.addTestSuite(OrderedTupleLiteralExpTest.class);
		suite.addTestSuite(OrderedTupleLiteralPartTest.class);
		suite.addTestSuite(OrderedTupleTypeTest.class);
		suite.addTestSuite(RaiseExpTest.class);
		suite.addTestSuite(ReturnExpTest.class);
		suite.addTestSuite(SwitchExpTest.class);
		suite.addTestSuite(TryExpTest.class);
		suite.addTestSuite(TypedefTest.class);
		suite.addTestSuite(UnlinkExpTest.class);
		suite.addTestSuite(UnpackExpTest.class);
		suite.addTestSuite(VariableInitExpTest.class);
		suite.addTestSuite(WhileExpTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOCLTests(String name) {
		super(name);
	}

} //ImperativeOCLTests
