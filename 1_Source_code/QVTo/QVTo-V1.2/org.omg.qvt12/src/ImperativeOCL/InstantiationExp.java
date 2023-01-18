/**
 */
package ImperativeOCL;

import EMOF.Operation;

import EssentialOCL.OclExpression;
import EssentialOCL.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.InstantiationExp#getArgument <em>Argument</em>}</li>
 *   <li>{@link ImperativeOCL.InstantiationExp#getExtent <em>Extent</em>}</li>
 *   <li>{@link ImperativeOCL.InstantiationExp#getInstantiatedClass <em>Instantiated Class</em>}</li>
 *   <li>{@link ImperativeOCL.InstantiationExp#getInitializationOperation <em>Initialization Operation</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getInstantiationExp()
 * @model
 * @generated
 */
public interface InstantiationExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link EssentialOCL.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see ImperativeOCL.ImperativeOCLPackage#getInstantiationExp_Argument()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='argOwner'"
	 * @generated
	 */
	EList<OclExpression> getArgument();

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' reference.
	 * @see #setExtent(Variable)
	 * @see ImperativeOCL.ImperativeOCLPackage#getInstantiationExp_Extent()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='instantiationExp'"
	 * @generated
	 */
	Variable getExtent();

	/**
	 * Sets the value of the '{@link ImperativeOCL.InstantiationExp#getExtent <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(Variable value);

	/**
	 * Returns the value of the '<em><b>Instantiated Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiated Class</em>' reference.
	 * @see #setInstantiatedClass(EMOF.Class)
	 * @see ImperativeOCL.ImperativeOCLPackage#getInstantiationExp_InstantiatedClass()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='instantiationExp'"
	 * @generated
	 */
	EMOF.Class getInstantiatedClass();

	/**
	 * Sets the value of the '{@link ImperativeOCL.InstantiationExp#getInstantiatedClass <em>Instantiated Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Class</em>' reference.
	 * @see #getInstantiatedClass()
	 * @generated
	 */
	void setInstantiatedClass(EMOF.Class value);

	/**
	 * Returns the value of the '<em><b>Initialization Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization Operation</em>' reference.
	 * @see #setInitializationOperation(Operation)
	 * @see ImperativeOCL.ImperativeOCLPackage#getInstantiationExp_InitializationOperation()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='instantiationExp'"
	 * @generated
	 */
	Operation getInitializationOperation();

	/**
	 * Sets the value of the '{@link ImperativeOCL.InstantiationExp#getInitializationOperation <em>Initialization Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization Operation</em>' reference.
	 * @see #getInitializationOperation()
	 * @generated
	 */
	void setInitializationOperation(Operation value);

} // InstantiationExp
