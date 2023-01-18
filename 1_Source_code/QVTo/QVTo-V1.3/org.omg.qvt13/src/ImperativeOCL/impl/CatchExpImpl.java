/**
 */
package ImperativeOCL.impl;

import EMOF.Type;

import EssentialOCL.OclExpression;
import EssentialOCL.Variable;

import ImperativeOCL.CatchExp;
import ImperativeOCL.ImperativeOCLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catch Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.impl.CatchExpImpl#getBody <em>Body</em>}</li>
 *   <li>{@link ImperativeOCL.impl.CatchExpImpl#getException <em>Exception</em>}</li>
 *   <li>{@link ImperativeOCL.impl.CatchExpImpl#getExceptionVariable <em>Exception Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatchExpImpl extends ImperativeExpressionImpl implements CatchExp {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<OclExpression> body;

	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> exception;

	/**
	 * The cached value of the '{@link #getExceptionVariable() <em>Exception Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable exceptionVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLPackage.Literals.CATCH_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OclExpression> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<OclExpression>(OclExpression.class, this, ImperativeOCLPackage.CATCH_EXP__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getException() {
		if (exception == null) {
			exception = new EObjectResolvingEList<Type>(Type.class, this, ImperativeOCLPackage.CATCH_EXP__EXCEPTION);
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getExceptionVariable() {
		return exceptionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionVariable(Variable newExceptionVariable, NotificationChain msgs) {
		Variable oldExceptionVariable = exceptionVariable;
		exceptionVariable = newExceptionVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLPackage.CATCH_EXP__EXCEPTION_VARIABLE, oldExceptionVariable, newExceptionVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionVariable(Variable newExceptionVariable) {
		if (newExceptionVariable != exceptionVariable) {
			NotificationChain msgs = null;
			if (exceptionVariable != null)
				msgs = ((InternalEObject)exceptionVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLPackage.CATCH_EXP__EXCEPTION_VARIABLE, null, msgs);
			if (newExceptionVariable != null)
				msgs = ((InternalEObject)newExceptionVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLPackage.CATCH_EXP__EXCEPTION_VARIABLE, null, msgs);
			msgs = basicSetExceptionVariable(newExceptionVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLPackage.CATCH_EXP__EXCEPTION_VARIABLE, newExceptionVariable, newExceptionVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeOCLPackage.CATCH_EXP__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
			case ImperativeOCLPackage.CATCH_EXP__EXCEPTION_VARIABLE:
				return basicSetExceptionVariable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImperativeOCLPackage.CATCH_EXP__BODY:
				return getBody();
			case ImperativeOCLPackage.CATCH_EXP__EXCEPTION:
				return getException();
			case ImperativeOCLPackage.CATCH_EXP__EXCEPTION_VARIABLE:
				return getExceptionVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImperativeOCLPackage.CATCH_EXP__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends OclExpression>)newValue);
				return;
			case ImperativeOCLPackage.CATCH_EXP__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends Type>)newValue);
				return;
			case ImperativeOCLPackage.CATCH_EXP__EXCEPTION_VARIABLE:
				setExceptionVariable((Variable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImperativeOCLPackage.CATCH_EXP__BODY:
				getBody().clear();
				return;
			case ImperativeOCLPackage.CATCH_EXP__EXCEPTION:
				getException().clear();
				return;
			case ImperativeOCLPackage.CATCH_EXP__EXCEPTION_VARIABLE:
				setExceptionVariable((Variable)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImperativeOCLPackage.CATCH_EXP__BODY:
				return body != null && !body.isEmpty();
			case ImperativeOCLPackage.CATCH_EXP__EXCEPTION:
				return exception != null && !exception.isEmpty();
			case ImperativeOCLPackage.CATCH_EXP__EXCEPTION_VARIABLE:
				return exceptionVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //CatchExpImpl
