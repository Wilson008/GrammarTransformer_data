/**
 */
package spectra.tests;

import junit.textui.TestRunner;

import spectra.BinaryRegExp;
import spectra.SpectraFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Binary Reg Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryRegExpTest extends RegExpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BinaryRegExpTest.class);
	}

	/**
	 * Constructs a new Binary Reg Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryRegExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Binary Reg Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BinaryRegExp getFixture() {
		return (BinaryRegExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpectraFactory.eINSTANCE.createBinaryRegExp());
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

} //BinaryRegExpTest
