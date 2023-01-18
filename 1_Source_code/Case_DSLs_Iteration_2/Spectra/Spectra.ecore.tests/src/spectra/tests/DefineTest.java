/**
 */
package spectra.tests;

import junit.textui.TestRunner;

import spectra.Define;
import spectra.SpectraFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Define</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefineTest extends DeclTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DefineTest.class);
	}

	/**
	 * Constructs a new Define test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Define test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Define getFixture() {
		return (Define)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpectraFactory.eINSTANCE.createDefine());
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

} //DefineTest
