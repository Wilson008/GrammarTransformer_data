/**
 */
package xcore;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XAnnotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XAnnotation#getSource <em>Source</em>}</li>
 *   <li>{@link xcore.XAnnotation#getDetails <em>Details</em>}</li>
 *   <li>{@link xcore.XAnnotation#getModelElement <em>Model Element</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXAnnotation()
 * @model
 * @generated
 */
public interface XAnnotation extends XModelElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(XAnnotationDirective)
	 * @see xcore.XcorePackage#getXAnnotation_Source()
	 * @model
	 * @generated
	 */
	XAnnotationDirective getSource();

	/**
	 * Sets the value of the '{@link xcore.XAnnotation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(XAnnotationDirective value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' map.
	 * @see xcore.XcorePackage#getXAnnotation_Details()
	 * @model mapType="xcore.XStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getDetails();

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xcore.XModelElement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' container reference.
	 * @see #setModelElement(XModelElement)
	 * @see xcore.XcorePackage#getXAnnotation_ModelElement()
	 * @see xcore.XModelElement#getAnnotations
	 * @model opposite="annotations" resolveProxies="false"
	 * @generated
	 */
	XModelElement getModelElement();

	/**
	 * Sets the value of the '{@link xcore.XAnnotation#getModelElement <em>Model Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' container reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(XModelElement value);

} // XAnnotation
