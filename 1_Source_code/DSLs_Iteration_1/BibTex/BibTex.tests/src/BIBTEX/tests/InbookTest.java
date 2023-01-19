/**
 */
package BIBTEX.tests;

import BIBTEX.BIBTEXFactory;
import BIBTEX.Inbook;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Inbook</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InbookTest extends EntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InbookTest.class);
	}

	/**
	 * Constructs a new Inbook test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InbookTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Inbook test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Inbook getFixture() {
		return (Inbook)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BIBTEXFactory.eINSTANCE.createInbook());
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

} //InbookTest
