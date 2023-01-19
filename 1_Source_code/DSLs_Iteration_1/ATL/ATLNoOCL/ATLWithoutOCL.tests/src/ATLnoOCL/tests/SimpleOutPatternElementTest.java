/**
 */
package ATLnoOCL.tests;

import ATLnoOCL.ATLnoOCLFactory;
import ATLnoOCL.SimpleOutPatternElement;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Out Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleOutPatternElementTest extends OutPatternElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleOutPatternElementTest.class);
	}

	/**
	 * Constructs a new Simple Out Pattern Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleOutPatternElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Out Pattern Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleOutPatternElement getFixture() {
		return (SimpleOutPatternElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ATLnoOCLFactory.eINSTANCE.createSimpleOutPatternElement());
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

} //SimpleOutPatternElementTest
