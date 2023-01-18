/**
 */
package QVTRelation.tests;

import QVTBase.tests.TransformationTest;

import QVTRelation.QVTRelationFactory;
import QVTRelation.RelationalTransformation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relational Transformation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationalTransformationTest extends TransformationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationalTransformationTest.class);
	}

	/**
	 * Constructs a new Relational Transformation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTransformationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relational Transformation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationalTransformation getFixture() {
		return (RelationalTransformation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QVTRelationFactory.eINSTANCE.createRelationalTransformation());
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

} //RelationalTransformationTest
