/**
 */
package spectra.tests;

import junit.textui.TestRunner;

import spectra.DomainVarDecl;
import spectra.SpectraFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Domain Var Decl</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainVarDeclTest extends ReferrableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomainVarDeclTest.class);
	}

	/**
	 * Constructs a new Domain Var Decl test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainVarDeclTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Domain Var Decl test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DomainVarDecl getFixture() {
		return (DomainVarDecl)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpectraFactory.eINSTANCE.createDomainVarDecl());
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

} //DomainVarDeclTest
