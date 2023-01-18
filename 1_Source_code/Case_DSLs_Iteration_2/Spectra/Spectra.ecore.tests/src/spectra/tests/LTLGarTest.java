/**
 */
package spectra.tests;

import junit.textui.TestRunner;

import spectra.LTLGar;
import spectra.SpectraFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>LTL Gar</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LTLGarTest extends DeclTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LTLGarTest.class);
	}

	/**
	 * Constructs a new LTL Gar test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTLGarTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this LTL Gar test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LTLGar getFixture() {
		return (LTLGar)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpectraFactory.eINSTANCE.createLTLGar());
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

} //LTLGarTest
