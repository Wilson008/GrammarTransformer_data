/**
 */
package dot.tests;

import dot.DotFactory;
import dot.EdgeRhsNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Edge Rhs Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdgeRhsNodeTest extends EdgeRhsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EdgeRhsNodeTest.class);
	}

	/**
	 * Constructs a new Edge Rhs Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeRhsNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Edge Rhs Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EdgeRhsNode getFixture() {
		return (EdgeRhsNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DotFactory.eINSTANCE.createEdgeRhsNode());
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

} //EdgeRhsNodeTest
