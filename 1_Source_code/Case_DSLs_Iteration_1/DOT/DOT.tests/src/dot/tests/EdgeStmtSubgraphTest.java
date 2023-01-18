/**
 */
package dot.tests;

import dot.DotFactory;
import dot.EdgeStmtSubgraph;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Edge Stmt Subgraph</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdgeStmtSubgraphTest extends SubgraphOrEdgeStmtSubgraphTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EdgeStmtSubgraphTest.class);
	}

	/**
	 * Constructs a new Edge Stmt Subgraph test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeStmtSubgraphTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Edge Stmt Subgraph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EdgeStmtSubgraph getFixture() {
		return (EdgeStmtSubgraph)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DotFactory.eINSTANCE.createEdgeStmtSubgraph());
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

} //EdgeStmtSubgraphTest
