/**
 */
package xcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XModel Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XModelElement#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXModelElement()
 * @model abstract="true"
 * @generated
 */
public interface XModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link xcore.XAnnotation}.
	 * It is bidirectional and its opposite is '{@link xcore.XAnnotation#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see xcore.XcorePackage#getXModelElement_Annotations()
	 * @see xcore.XAnnotation#getModelElement
	 * @model opposite="modelElement" containment="true"
	 * @generated
	 */
	EList<XAnnotation> getAnnotations();

} // XModelElement
