/**
 */
package dot.tests;

import dot.DotFactory;
import dot.EdgeRhsSubgraph;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Edge Rhs Subgraph</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdgeRhsSubgraphTest extends EdgeRhsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EdgeRhsSubgraphTest.class);
	}

	/**
	 * Constructs a new Edge Rhs Subgraph test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeRhsSubgraphTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Edge Rhs Subgraph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EdgeRhsSubgraph getFixture() {
		return (EdgeRhsSubgraph)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DotFactory.eINSTANCE.createEdgeRhsSubgraph());
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

} //EdgeRhsSubgraphTest
