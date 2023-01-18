/**
 */
package QVTRelation.tests;

import EMOF.tests.ElementTest;

import QVTRelation.QVTRelationFactory;
import QVTRelation.RelationImplementation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Implementation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationImplementationTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationImplementationTest.class);
	}

	/**
	 * Constructs a new Relation Implementation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationImplementationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation Implementation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationImplementation getFixture() {
		return (RelationImplementation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QVTRelationFactory.eINSTANCE.createRelationImplementation());
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

} //RelationImplementationTest
