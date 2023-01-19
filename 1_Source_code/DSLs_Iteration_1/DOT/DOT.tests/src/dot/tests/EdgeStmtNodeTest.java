/**
 */
package dot.tests;

import dot.DotFactory;
import dot.EdgeStmtNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Edge Stmt Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdgeStmtNodeTest extends StmtTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EdgeStmtNodeTest.class);
	}

	/**
	 * Constructs a new Edge Stmt Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeStmtNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Edge Stmt Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EdgeStmtNode getFixture() {
		return (EdgeStmtNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DotFactory.eINSTANCE.createEdgeStmtNode());
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

} //EdgeStmtNodeTest
