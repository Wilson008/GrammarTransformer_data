/**
 */
package QVTOperational.impl;

import QVTOperational.ExpressionBlock;
import QVTOperational.ExpressionList;
import QVTOperational.QVTOperationalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.ExpressionBlockImpl#getExpression_list <em>Expression list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionBlockImpl extends MinimalEObjectImpl.Container implements ExpressionBlock {
	/**
	 * The cached value of the '{@link #getExpression_list() <em>Expression list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression_list()
	 * @generated
	 * @ordered
	 */
	protected ExpressionList expression_list;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.EXPRESSION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionList getExpression_list() {
		return expression_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression_list(ExpressionList newExpression_list, NotificationChain msgs) {
		ExpressionList oldExpression_list = expression_list;
		expression_list = newExpression_list;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.EXPRESSION_BLOCK__EXPRESSION_LIST, oldExpression_list, newExpression_list);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression_list(ExpressionList newExpression_list) {
		if (newExpression_list != expression_list) {
			NotificationChain msgs = null;
			if (expression_list != null)
				msgs = ((InternalEObject)expression_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.EXPRESSION_BLOCK__EXPRESSION_LIST, null, msgs);
			if (newExpression_list != null)
				msgs = ((InternalEObject)newExpression_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.EXPRESSION_BLOCK__EXPRESSION_LIST, null, msgs);
			msgs = basicSetExpression_list(newExpression_list, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.EXPRESSION_BLOCK__EXPRESSION_LIST, newExpression_list, newExpression_list));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.EXPRESSION_BLOCK__EXPRESSION_LIST:
				return basicSetExpression_list(null, msgs);
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
			case QVTOperationalPackage.EXPRESSION_BLOCK__EXPRESSION_LIST:
				return getExpression_list();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QVTOperationalPackage.EXPRESSION_BLOCK__EXPRESSION_LIST:
				setExpression_list((ExpressionList)newValue);
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
			case QVTOperationalPackage.EXPRESSION_BLOCK__EXPRESSION_LIST:
				setExpression_list((ExpressionList)null);
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
			case QVTOperationalPackage.EXPRESSION_BLOCK__EXPRESSION_LIST:
				return expression_list != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpressionBlockImpl
