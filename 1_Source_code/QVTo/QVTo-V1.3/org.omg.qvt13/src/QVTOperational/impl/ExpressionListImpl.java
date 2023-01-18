/**
 */
package QVTOperational.impl;

import QVTOperational.ExpressionList;
import QVTOperational.ExpressionSemiList;
import QVTOperational.QVTOperationalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.ExpressionListImpl#getExpression_semi_list <em>Expression semi list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionListImpl extends MinimalEObjectImpl.Container implements ExpressionList {
	/**
	 * The cached value of the '{@link #getExpression_semi_list() <em>Expression semi list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression_semi_list()
	 * @generated
	 * @ordered
	 */
	protected ExpressionSemiList expression_semi_list;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.EXPRESSION_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSemiList getExpression_semi_list() {
		return expression_semi_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression_semi_list(ExpressionSemiList newExpression_semi_list, NotificationChain msgs) {
		ExpressionSemiList oldExpression_semi_list = expression_semi_list;
		expression_semi_list = newExpression_semi_list;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.EXPRESSION_LIST__EXPRESSION_SEMI_LIST, oldExpression_semi_list, newExpression_semi_list);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression_semi_list(ExpressionSemiList newExpression_semi_list) {
		if (newExpression_semi_list != expression_semi_list) {
			NotificationChain msgs = null;
			if (expression_semi_list != null)
				msgs = ((InternalEObject)expression_semi_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.EXPRESSION_LIST__EXPRESSION_SEMI_LIST, null, msgs);
			if (newExpression_semi_list != null)
				msgs = ((InternalEObject)newExpression_semi_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.EXPRESSION_LIST__EXPRESSION_SEMI_LIST, null, msgs);
			msgs = basicSetExpression_semi_list(newExpression_semi_list, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.EXPRESSION_LIST__EXPRESSION_SEMI_LIST, newExpression_semi_list, newExpression_semi_list));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.EXPRESSION_LIST__EXPRESSION_SEMI_LIST:
				return basicSetExpression_semi_list(null, msgs);
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
			case QVTOperationalPackage.EXPRESSION_LIST__EXPRESSION_SEMI_LIST:
				return getExpression_semi_list();
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
			case QVTOperationalPackage.EXPRESSION_LIST__EXPRESSION_SEMI_LIST:
				setExpression_semi_list((ExpressionSemiList)newValue);
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
			case QVTOperationalPackage.EXPRESSION_LIST__EXPRESSION_SEMI_LIST:
				setExpression_semi_list((ExpressionSemiList)null);
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
			case QVTOperationalPackage.EXPRESSION_LIST__EXPRESSION_SEMI_LIST:
				return expression_semi_list != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpressionListImpl
