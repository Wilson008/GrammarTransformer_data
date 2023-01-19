/**
 */
package xcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XAnnotation Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XAnnotationDirective#getSourceURI <em>Source URI</em>}</li>
 *   <li>{@link xcore.XAnnotationDirective#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXAnnotationDirective()
 * @model
 * @generated
 */
public interface XAnnotationDirective extends XNamedElement {
	/**
	 * Returns the value of the '<em><b>Source URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source URI</em>' attribute.
	 * @see #setSourceURI(String)
	 * @see xcore.XcorePackage#getXAnnotationDirective_SourceURI()
	 * @model
	 * @generated
	 */
	String getSourceURI();

	/**
	 * Sets the value of the '{@link xcore.XAnnotationDirective#getSourceURI <em>Source URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source URI</em>' attribute.
	 * @see #getSourceURI()
	 * @generated
	 */
	void setSourceURI(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xcore.XPackage#getAnnotationDirectives <em>Annotation Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see xcore.XcorePackage#getXAnnotationDirective_Package()
	 * @see xcore.XPackage#getAnnotationDirectives
	 * @model opposite="annotationDirectives" changeable="false"
	 * @generated
	 */
	XPackage getPackage();

} // XAnnotationDirective
