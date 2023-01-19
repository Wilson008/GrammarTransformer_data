/**
 */
package xenia.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import xenia.MappedEntity;
import xenia.XeniaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mapped Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappedEntityTest extends TestCase {

	/**
	 * The fixture for this Mapped Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappedEntity fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MappedEntityTest.class);
	}

	/**
	 * Constructs a new Mapped Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedEntityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Mapped Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MappedEntity fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Mapped Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappedEntity getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XeniaFactory.eINSTANCE.createMappedEntity());
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

} //MappedEntityTest
