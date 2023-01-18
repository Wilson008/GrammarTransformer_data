/**
 */
package xcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XImport Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XImportDirective#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link xcore.XImportDirective#getImportedObject <em>Imported Object</em>}</li>
 *   <li>{@link xcore.XImportDirective#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXImportDirective()
 * @model
 * @generated
 */
public interface XImportDirective extends XModelElement {
	/**
	 * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Namespace</em>' attribute.
	 * @see #setImportedNamespace(String)
	 * @see xcore.XcorePackage#getXImportDirective_ImportedNamespace()
	 * @model
	 * @generated
	 */
	String getImportedNamespace();

	/**
	 * Sets the value of the '{@link xcore.XImportDirective#getImportedNamespace <em>Imported Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Namespace</em>' attribute.
	 * @see #getImportedNamespace()
	 * @generated
	 */
	void setImportedNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Imported Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Object</em>' reference.
	 * @see #setImportedObject(EObject)
	 * @see xcore.XcorePackage#getXImportDirective_ImportedObject()
	 * @model
	 * @generated
	 */
	EObject getImportedObject();

	/**
	 * Sets the value of the '{@link xcore.XImportDirective#getImportedObject <em>Imported Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Object</em>' reference.
	 * @see #getImportedObject()
	 * @generated
	 */
	void setImportedObject(EObject value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xcore.XPackage#getImportDirectives <em>Import Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see xcore.XcorePackage#getXImportDirective_Package()
	 * @see xcore.XPackage#getImportDirectives
	 * @model opposite="importDirectives" changeable="false"
	 * @generated
	 */
	XPackage getPackage();

} // XImportDirective
