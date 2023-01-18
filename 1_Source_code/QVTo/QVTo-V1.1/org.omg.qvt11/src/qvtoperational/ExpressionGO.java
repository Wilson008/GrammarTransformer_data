/**
 */
package qvtoperational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression GO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.ExpressionGO#getDummyContent <em>Dummy Content</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getExpressionGO()
 * @model
 * @generated
 */
public interface ExpressionGO extends EObject {
	/**
	 * Returns the value of the '<em><b>Dummy Content</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dummy Content</em>' attribute list.
	 * @see qvtoperational.QvtoperationalPackage#getExpressionGO_DummyContent()
	 * @model
	 * @generated
	 */
	EList<String> getDummyContent();

} // ExpressionGO
