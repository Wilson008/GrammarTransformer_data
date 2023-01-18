/**
 */
package spectra.tests;

import junit.textui.TestRunner;

import spectra.SpectraFactory;
import spectra.TypedParam;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Typed Param</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypedParamTest extends ReferrableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypedParamTest.class);
	}

	/**
	 * Constructs a new Typed Param test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedParamTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Typed Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypedParam getFixture() {
		return (TypedParam)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpectraFactory.eINSTANCE.createTypedParam());
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

} //TypedParamTest
