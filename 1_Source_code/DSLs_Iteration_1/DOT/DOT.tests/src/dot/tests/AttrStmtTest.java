/**
 */
package dot.tests;

import dot.AttrStmt;
import dot.DotFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attr Stmt</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttrStmtTest extends StmtTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttrStmtTest.class);
	}

	/**
	 * Constructs a new Attr Stmt test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttrStmtTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attr Stmt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttrStmt getFixture() {
		return (AttrStmt)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DotFactory.eINSTANCE.createAttrStmt());
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

} //AttrStmtTest
