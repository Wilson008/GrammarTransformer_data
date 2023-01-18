/**
 */
package QVTOperational;

import EMOF.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.VarParameter#getCtxOwner <em>Ctx Owner</em>}</li>
 *   <li>{@link QVTOperational.VarParameter#getKind <em>Kind</em>}</li>
 *   <li>{@link QVTOperational.VarParameter#getResOwner <em>Res Owner</em>}</li>
 *   <li>{@link QVTOperational.VarParameter#getDeclarator <em>Declarator</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getVarParameter()
 * @model
 * @generated
 */
public interface VarParameter extends ExpressionGO, Parameter {
	/**
	 * Returns the value of the '<em><b>Ctx Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QVTOperational.ImperativeOperation#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctx Owner</em>' container reference.
	 * @see #setCtxOwner(ImperativeOperation)
	 * @see QVTOperational.QVTOperationalPackage#getVarParameter_CtxOwner()
	 * @see QVTOperational.ImperativeOperation#getContext
	 * @model opposite="context" resolveProxies="false"
	 * @generated
	 */
	ImperativeOperation getCtxOwner();

	/**
	 * Sets the value of the '{@link QVTOperational.VarParameter#getCtxOwner <em>Ctx Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctx Owner</em>' container reference.
	 * @see #getCtxOwner()
	 * @generated
	 */
	void setCtxOwner(ImperativeOperation value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link QVTOperational.DirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see QVTOperational.DirectionKind
	 * @see #setKind(DirectionKind)
	 * @see QVTOperational.QVTOperationalPackage#getVarParameter_Kind()
	 * @model
	 * @generated
	 */
	DirectionKind getKind();

	/**
	 * Sets the value of the '{@link QVTOperational.VarParameter#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see QVTOperational.DirectionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DirectionKind value);

	/**
	 * Returns the value of the '<em><b>Res Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QVTOperational.ImperativeOperation#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Owner</em>' container reference.
	 * @see #setResOwner(ImperativeOperation)
	 * @see QVTOperational.QVTOperationalPackage#getVarParameter_ResOwner()
	 * @see QVTOperational.ImperativeOperation#getResult
	 * @model opposite="result" resolveProxies="false"
	 * @generated
	 */
	ImperativeOperation getResOwner();

	/**
	 * Sets the value of the '{@link QVTOperational.VarParameter#getResOwner <em>Res Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Owner</em>' container reference.
	 * @see #getResOwner()
	 * @generated
	 */
	void setResOwner(ImperativeOperation value);

	/**
	 * Returns the value of the '<em><b>Declarator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarator</em>' containment reference.
	 * @see #setDeclarator(Declarator)
	 * @see QVTOperational.QVTOperationalPackage#getVarParameter_Declarator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Declarator getDeclarator();

	/**
	 * Sets the value of the '{@link QVTOperational.VarParameter#getDeclarator <em>Declarator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declarator</em>' containment reference.
	 * @see #getDeclarator()
	 * @generated
	 */
	void setDeclarator(Declarator value);

} // VarParameter
