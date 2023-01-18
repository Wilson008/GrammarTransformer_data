/**
 */
package qvtoperational.tests;

import junit.textui.TestRunner;

import qvtoperational.QvtoperationalFactory;
import qvtoperational.TagGO;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tag GO</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TagGOTest extends ModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TagGOTest.class);
	}

	/**
	 * Constructs a new Tag GO test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagGOTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tag GO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TagGO getFixture() {
		return (TagGO)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QvtoperationalFactory.eINSTANCE.createTagGO());
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

} //TagGOTest
