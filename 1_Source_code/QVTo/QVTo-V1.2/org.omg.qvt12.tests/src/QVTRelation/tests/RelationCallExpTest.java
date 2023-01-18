/**
 */
package QVTRelation.tests;

import EssentialOCL.tests.OclExpressionTest;

import QVTRelation.QVTRelationFactory;
import QVTRelation.RelationCallExp;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Call Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationCallExpTest extends OclExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationCallExpTest.class);
	}

	/**
	 * Constructs a new Relation Call Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationCallExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation Call Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationCallExp getFixture() {
		return (RelationCallExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QVTRelationFactory.eINSTANCE.createRelationCallExp());
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

} //RelationCallExpTest
