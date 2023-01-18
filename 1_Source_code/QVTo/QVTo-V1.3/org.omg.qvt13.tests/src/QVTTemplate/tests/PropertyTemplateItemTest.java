/**
 */
package QVTTemplate.tests;

import EMOF.tests.ElementTest;

import QVTTemplate.PropertyTemplateItem;
import QVTTemplate.QVTTemplateFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property Template Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyTemplateItemTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertyTemplateItemTest.class);
	}

	/**
	 * Constructs a new Property Template Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTemplateItemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Property Template Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PropertyTemplateItem getFixture() {
		return (PropertyTemplateItem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QVTTemplateFactory.eINSTANCE.createPropertyTemplateItem());
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

} //PropertyTemplateItemTest
