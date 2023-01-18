/**
 */
package QVTOperational.impl;

import QVTOperational.CompleteSignature;
import QVTOperational.ParamList;
import QVTOperational.QVTOperationalPackage;
import QVTOperational.SimpleSignature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.CompleteSignatureImpl#getSimple_signature <em>Simple signature</em>}</li>
 *   <li>{@link QVTOperational.impl.CompleteSignatureImpl#getParam_list <em>Param list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompleteSignatureImpl extends MinimalEObjectImpl.Container implements CompleteSignature {
	/**
	 * The cached value of the '{@link #getSimple_signature() <em>Simple signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimple_signature()
	 * @generated
	 * @ordered
	 */
	protected SimpleSignature simple_signature;

	/**
	 * The cached value of the '{@link #getParam_list() <em>Param list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_list()
	 * @generated
	 * @ordered
	 */
	protected ParamList param_list;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompleteSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.COMPLETE_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSignature getSimple_signature() {
		return simple_signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimple_signature(SimpleSignature newSimple_signature, NotificationChain msgs) {
		SimpleSignature oldSimple_signature = simple_signature;
		simple_signature = newSimple_signature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.COMPLETE_SIGNATURE__SIMPLE_SIGNATURE, oldSimple_signature, newSimple_signature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimple_signature(SimpleSignature newSimple_signature) {
		if (newSimple_signature != simple_signature) {
			NotificationChain msgs = null;
			if (simple_signature != null)
				msgs = ((InternalEObject)simple_signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.COMPLETE_SIGNATURE__SIMPLE_SIGNATURE, null, msgs);
			if (newSimple_signature != null)
				msgs = ((InternalEObject)newSimple_signature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.COMPLETE_SIGNATURE__SIMPLE_SIGNATURE, null, msgs);
			msgs = basicSetSimple_signature(newSimple_signature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.COMPLETE_SIGNATURE__SIMPLE_SIGNATURE, newSimple_signature, newSimple_signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamList getParam_list() {
		return param_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParam_list(ParamList newParam_list, NotificationChain msgs) {
		ParamList oldParam_list = param_list;
		param_list = newParam_list;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.COMPLETE_SIGNATURE__PARAM_LIST, oldParam_list, newParam_list);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam_list(ParamList newParam_list) {
		if (newParam_list != param_list) {
			NotificationChain msgs = null;
			if (param_list != null)
				msgs = ((InternalEObject)param_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.COMPLETE_SIGNATURE__PARAM_LIST, null, msgs);
			if (newParam_list != null)
				msgs = ((InternalEObject)newParam_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.COMPLETE_SIGNATURE__PARAM_LIST, null, msgs);
			msgs = basicSetParam_list(newParam_list, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.COMPLETE_SIGNATURE__PARAM_LIST, newParam_list, newParam_list));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.COMPLETE_SIGNATURE__SIMPLE_SIGNATURE:
				return basicSetSimple_signature(null, msgs);
			case QVTOperationalPackage.COMPLETE_SIGNATURE__PARAM_LIST:
				return basicSetParam_list(null, msgs);
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
			case QVTOperationalPackage.COMPLETE_SIGNATURE__SIMPLE_SIGNATURE:
				return getSimple_signature();
			case QVTOperationalPackage.COMPLETE_SIGNATURE__PARAM_LIST:
				return getParam_list();
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
			case QVTOperationalPackage.COMPLETE_SIGNATURE__SIMPLE_SIGNATURE:
				setSimple_signature((SimpleSignature)newValue);
				return;
			case QVTOperationalPackage.COMPLETE_SIGNATURE__PARAM_LIST:
				setParam_list((ParamList)newValue);
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
			case QVTOperationalPackage.COMPLETE_SIGNATURE__SIMPLE_SIGNATURE:
				setSimple_signature((SimpleSignature)null);
				return;
			case QVTOperationalPackage.COMPLETE_SIGNATURE__PARAM_LIST:
				setParam_list((ParamList)null);
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
			case QVTOperationalPackage.COMPLETE_SIGNATURE__SIMPLE_SIGNATURE:
				return simple_signature != null;
			case QVTOperationalPackage.COMPLETE_SIGNATURE__PARAM_LIST:
				return param_list != null;
		}
		return super.eIsSet(featureID);
	}

} //CompleteSignatureImpl
