/**
 */
package dot.tests;

import dot.DotFactory;
import dot.Subgraph;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subgraph</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubgraphTest extends SubgraphOrEdgeStmtSubgraphTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubgraphTest.class);
	}

	/**
	 * Constructs a new Subgraph test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubgraphTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subgraph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Subgraph getFixture() {
		return (Subgraph)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DotFactory.eINSTANCE.createSubgraph());
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

} //SubgraphTest
