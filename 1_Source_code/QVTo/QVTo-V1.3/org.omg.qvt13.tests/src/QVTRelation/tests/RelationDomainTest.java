/**
 */
package QVTRelation.tests;

import QVTBase.tests.DomainTest;

import QVTRelation.QVTRelationFactory;
import QVTRelation.RelationDomain;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Domain</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationDomainTest extends DomainTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationDomainTest.class);
	}

	/**
	 * Constructs a new Relation Domain test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDomainTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation Domain test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationDomain getFixture() {
		return (RelationDomain)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QVTRelationFactory.eINSTANCE.createRelationDomain());
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

} //RelationDomainTest
