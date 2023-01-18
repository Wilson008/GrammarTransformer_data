/**
 */
package QVTOperational.impl;

import QVTOperational.AccessUsage;
import QVTOperational.ExtendsUsage;
import QVTOperational.ModuleUsageGO;
import QVTOperational.QVTOperationalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Usage GO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.ModuleUsageGOImpl#getAccess_usage <em>Access usage</em>}</li>
 *   <li>{@link QVTOperational.impl.ModuleUsageGOImpl#getExtends_usage <em>Extends usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleUsageGOImpl extends MinimalEObjectImpl.Container implements ModuleUsageGO {
	/**
	 * The cached value of the '{@link #getAccess_usage() <em>Access usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess_usage()
	 * @generated
	 * @ordered
	 */
	protected AccessUsage access_usage;

	/**
	 * The cached value of the '{@link #getExtends_usage() <em>Extends usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends_usage()
	 * @generated
	 * @ordered
	 */
	protected ExtendsUsage extends_usage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleUsageGOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.MODULE_USAGE_GO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessUsage getAccess_usage() {
		return access_usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccess_usage(AccessUsage newAccess_usage, NotificationChain msgs) {
		AccessUsage oldAccess_usage = access_usage;
		access_usage = newAccess_usage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODULE_USAGE_GO__ACCESS_USAGE, oldAccess_usage, newAccess_usage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess_usage(AccessUsage newAccess_usage) {
		if (newAccess_usage != access_usage) {
			NotificationChain msgs = null;
			if (access_usage != null)
				msgs = ((InternalEObject)access_usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MODULE_USAGE_GO__ACCESS_USAGE, null, msgs);
			if (newAccess_usage != null)
				msgs = ((InternalEObject)newAccess_usage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MODULE_USAGE_GO__ACCESS_USAGE, null, msgs);
			msgs = basicSetAccess_usage(newAccess_usage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODULE_USAGE_GO__ACCESS_USAGE, newAccess_usage, newAccess_usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendsUsage getExtends_usage() {
		return extends_usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends_usage(ExtendsUsage newExtends_usage, NotificationChain msgs) {
		ExtendsUsage oldExtends_usage = extends_usage;
		extends_usage = newExtends_usage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODULE_USAGE_GO__EXTENDS_USAGE, oldExtends_usage, newExtends_usage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends_usage(ExtendsUsage newExtends_usage) {
		if (newExtends_usage != extends_usage) {
			NotificationChain msgs = null;
			if (extends_usage != null)
				msgs = ((InternalEObject)extends_usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MODULE_USAGE_GO__EXTENDS_USAGE, null, msgs);
			if (newExtends_usage != null)
				msgs = ((InternalEObject)newExtends_usage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MODULE_USAGE_GO__EXTENDS_USAGE, null, msgs);
			msgs = basicSetExtends_usage(newExtends_usage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODULE_USAGE_GO__EXTENDS_USAGE, newExtends_usage, newExtends_usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.MODULE_USAGE_GO__ACCESS_USAGE:
				return basicSetAccess_usage(null, msgs);
			case QVTOperationalPackage.MODULE_USAGE_GO__EXTENDS_USAGE:
				return basicSetExtends_usage(null, msgs);
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
			case QVTOperationalPackage.MODULE_USAGE_GO__ACCESS_USAGE:
				return getAccess_usage();
			case QVTOperationalPackage.MODULE_USAGE_GO__EXTENDS_USAGE:
				return getExtends_usage();
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
			case QVTOperationalPackage.MODULE_USAGE_GO__ACCESS_USAGE:
				setAccess_usage((AccessUsage)newValue);
				return;
			case QVTOperationalPackage.MODULE_USAGE_GO__EXTENDS_USAGE:
				setExtends_usage((ExtendsUsage)newValue);
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
			case QVTOperationalPackage.MODULE_USAGE_GO__ACCESS_USAGE:
				setAccess_usage((AccessUsage)null);
				return;
			case QVTOperationalPackage.MODULE_USAGE_GO__EXTENDS_USAGE:
				setExtends_usage((ExtendsUsage)null);
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
			case QVTOperationalPackage.MODULE_USAGE_GO__ACCESS_USAGE:
				return access_usage != null;
			case QVTOperationalPackage.MODULE_USAGE_GO__EXTENDS_USAGE:
				return extends_usage != null;
		}
		return super.eIsSet(featureID);
	}

} //ModuleUsageGOImpl
