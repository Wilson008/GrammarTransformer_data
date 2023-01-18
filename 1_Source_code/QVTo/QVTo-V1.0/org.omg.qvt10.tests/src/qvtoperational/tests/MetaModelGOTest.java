/**
 */
package qvtoperational.tests;

import junit.textui.TestRunner;

import qvtoperational.MetaModelGO;
import qvtoperational.QvtoperationalFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Meta Model GO</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaModelGOTest extends ModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MetaModelGOTest.class);
	}

	/**
	 * Constructs a new Meta Model GO test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelGOTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Meta Model GO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MetaModelGO getFixture() {
		return (MetaModelGO)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QvtoperationalFactory.eINSTANCE.createMetaModelGO());
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

} //MetaModelGOTest
