/**
 */
package ATLnoOCL.tests;

import ATLnoOCL.ATLnoOCLFactory;
import ATLnoOCL.OutPattern;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Out Pattern</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutPatternTest extends LocatedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutPatternTest.class);
	}

	/**
	 * Constructs a new Out Pattern test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPatternTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Out Pattern test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OutPattern getFixture() {
		return (OutPattern)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ATLnoOCLFactory.eINSTANCE.createOutPattern());
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

} //OutPatternTest
