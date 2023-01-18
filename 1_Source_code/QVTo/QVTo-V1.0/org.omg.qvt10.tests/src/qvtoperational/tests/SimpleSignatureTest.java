/**
 */
package qvtoperational.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import qvtoperational.QvtoperationalFactory;
import qvtoperational.SimpleSignature;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Signature</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleSignatureTest extends TestCase {

	/**
	 * The fixture for this Simple Signature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleSignature fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleSignatureTest.class);
	}

	/**
	 * Constructs a new Simple Signature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSignatureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Simple Signature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SimpleSignature fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Simple Signature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleSignature getFixture() {
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
		setFixture(QvtoperationalFactory.eINSTANCE.createSimpleSignature());
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

} //SimpleSignatureTest
