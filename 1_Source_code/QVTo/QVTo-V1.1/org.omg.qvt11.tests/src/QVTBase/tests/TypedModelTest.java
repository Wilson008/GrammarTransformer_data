/**
 */
package QVTBase.tests;

import EMOF.tests.NamedElementTest;

import QVTBase.QVTBaseFactory;
import QVTBase.TypedModel;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Typed Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypedModelTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypedModelTest.class);
	}

	/**
	 * Constructs a new Typed Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Typed Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypedModel getFixture() {
		return (TypedModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QVTBaseFactory.eINSTANCE.createTypedModel());
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

} //TypedModelTest
