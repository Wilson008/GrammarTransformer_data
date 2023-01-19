/**
 */
package BIBTEX.tests;

import BIBTEX.BIBTEXFactory;
import BIBTEX.Booklet;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Booklet</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookletTest extends EntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BookletTest.class);
	}

	/**
	 * Constructs a new Booklet test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookletTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Booklet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Booklet getFixture() {
		return (Booklet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BIBTEXFactory.eINSTANCE.createBooklet());
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

} //BookletTest
