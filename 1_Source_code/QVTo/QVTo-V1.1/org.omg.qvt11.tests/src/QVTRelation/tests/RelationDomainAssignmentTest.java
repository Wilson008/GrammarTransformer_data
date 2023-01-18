/**
 */
package QVTRelation.tests;

import EMOF.tests.ElementTest;

import QVTRelation.QVTRelationFactory;
import QVTRelation.RelationDomainAssignment;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Domain Assignment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationDomainAssignmentTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationDomainAssignmentTest.class);
	}

	/**
	 * Constructs a new Relation Domain Assignment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDomainAssignmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation Domain Assignment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationDomainAssignment getFixture() {
		return (RelationDomainAssignment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QVTRelationFactory.eINSTANCE.createRelationDomainAssignment());
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

} //RelationDomainAssignmentTest
