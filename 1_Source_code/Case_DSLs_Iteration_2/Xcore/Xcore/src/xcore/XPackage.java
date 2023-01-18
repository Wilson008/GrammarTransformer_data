/**
 */
package xcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XPackage#getImportDirectives <em>Import Directives</em>}</li>
 *   <li>{@link xcore.XPackage#getAnnotationDirectives <em>Annotation Directives</em>}</li>
 *   <li>{@link xcore.XPackage#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXPackage()
 * @model
 * @generated
 */
public interface XPackage extends XNamedElement {
	/**
	 * Returns the value of the '<em><b>Import Directives</b></em>' containment reference list.
	 * The list contents are of type {@link xcore.XImportDirective}.
	 * It is bidirectional and its opposite is '{@link xcore.XImportDirective#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Directives</em>' containment reference list.
	 * @see xcore.XcorePackage#getXPackage_ImportDirectives()
	 * @see xcore.XImportDirective#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<XImportDirective> getImportDirectives();

	/**
	 * Returns the value of the '<em><b>Annotation Directives</b></em>' containment reference list.
	 * The list contents are of type {@link xcore.XAnnotationDirective}.
	 * It is bidirectional and its opposite is '{@link xcore.XAnnotationDirective#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Directives</em>' containment reference list.
	 * @see xcore.XcorePackage#getXPackage_AnnotationDirectives()
	 * @see xcore.XAnnotationDirective#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<XAnnotationDirective> getAnnotationDirectives();

	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link xcore.XClassifier}.
	 * It is bidirectional and its opposite is '{@link xcore.XClassifier#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' containment reference list.
	 * @see xcore.XcorePackage#getXPackage_Classifiers()
	 * @see xcore.XClassifier#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<XClassifier> getClassifiers();

} // XPackage
