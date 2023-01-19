/**
 */
package ATLnoOCL.tests;

import ATLnoOCL.ATLnoOCLFactory;
import ATLnoOCL.CalledRule;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Called Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CalledRuleTest extends RuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CalledRuleTest.class);
	}

	/**
	 * Constructs a new Called Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalledRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Called Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CalledRule getFixture() {
		return (CalledRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ATLnoOCLFactory.eINSTANCE.createCalledRule());
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

} //CalledRuleTest
