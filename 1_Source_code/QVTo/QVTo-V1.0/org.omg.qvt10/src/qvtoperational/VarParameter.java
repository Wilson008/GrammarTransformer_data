/**
 */
package qvtoperational;

import emof.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.VarParameter#getCtxOwner <em>Ctx Owner</em>}</li>
 *   <li>{@link qvtoperational.VarParameter#getResOwner <em>Res Owner</em>}</li>
 *   <li>{@link qvtoperational.VarParameter#getKind <em>Kind</em>}</li>
 *   <li>{@link qvtoperational.VarParameter#getDeclarator <em>Declarator</em>}</li>
 * </ul>
 *
 * @see qvtoperational.QvtoperationalPackage#getVarParameter()
 * @model
 * @generated
 */
public interface VarParameter extends Parameter, ExpressionGO {
	/**
	 * Returns the value of the '<em><b>Ctx Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctx Owner</em>' reference.
	 * @see #setCtxOwner(ImperativeOperation)
	 * @see qvtoperational.QvtoperationalPackage#getVarParameter_CtxOwner()
	 * @model transient="true"
	 * @generated
	 */
	ImperativeOperation getCtxOwner();

	/**
	 * Sets the value of the '{@link qvtoperational.VarParameter#getCtxOwner <em>Ctx Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctx Owner</em>' reference.
	 * @see #getCtxOwner()
	 * @generated
	 */
	void setCtxOwner(ImperativeOperation value);

	/**
	 * Returns the value of the '<em><b>Res Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qvtoperational.ImperativeOperation#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Owner</em>' container reference.
	 * @see #setResOwner(ImperativeOperation)
	 * @see qvtoperational.QvtoperationalPackage#getVarParameter_ResOwner()
	 * @see qvtoperational.ImperativeOperation#getResult
	 * @model opposite="result"
	 * @generated
	 */
	ImperativeOperation getResOwner();

	/**
	 * Sets the value of the '{@link qvtoperational.VarParameter#getResOwner <em>Res Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Owner</em>' container reference.
	 * @see #getResOwner()
	 * @generated
	 */
	void setResOwner(ImperativeOperation value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link qvtoperational.DirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see qvtoperational.DirectionKind
	 * @see #setKind(DirectionKind)
	 * @see qvtoperational.QvtoperationalPackage#getVarParameter_Kind()
	 * @model
	 * @generated
	 */
	DirectionKind getKind();

	/**
	 * Sets the value of the '{@link qvtoperational.VarParameter#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see qvtoperational.DirectionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DirectionKind value);

	/**
	 * Returns the value of the '<em><b>Declarator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarator</em>' containment reference.
	 * @see #setDeclarator(Declarator)
	 * @see qvtoperational.QvtoperationalPackage#getVarParameter_Declarator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Declarator getDeclarator();

	/**
	 * Sets the value of the '{@link qvtoperational.VarParameter#getDeclarator <em>Declarator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declarator</em>' containment reference.
	 * @see #getDeclarator()
	 * @generated
	 */
	void setDeclarator(Declarator value);

} // VarParameter
