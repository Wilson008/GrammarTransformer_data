/**
 */
package qvtoperational.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qvtoperational.EntryHeader;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.SimpleSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.EntryHeaderImpl#getSimple_signature <em>Simple signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryHeaderImpl extends MinimalEObjectImpl.Container implements EntryHeader {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.ENTRY_HEADER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.ENTRY_HEADER__SIMPLE_SIGNATURE, oldSimple_signature, newSimple_signature);
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
				msgs = ((InternalEObject)simple_signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.ENTRY_HEADER__SIMPLE_SIGNATURE, null, msgs);
			if (newSimple_signature != null)
				msgs = ((InternalEObject)newSimple_signature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.ENTRY_HEADER__SIMPLE_SIGNATURE, null, msgs);
			msgs = basicSetSimple_signature(newSimple_signature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.ENTRY_HEADER__SIMPLE_SIGNATURE, newSimple_signature, newSimple_signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.ENTRY_HEADER__SIMPLE_SIGNATURE:
				return basicSetSimple_signature(null, msgs);
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
			case QvtoperationalPackage.ENTRY_HEADER__SIMPLE_SIGNATURE:
				return getSimple_signature();
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
			case QvtoperationalPackage.ENTRY_HEADER__SIMPLE_SIGNATURE:
				setSimple_signature((SimpleSignature)newValue);
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
			case QvtoperationalPackage.ENTRY_HEADER__SIMPLE_SIGNATURE:
				setSimple_signature((SimpleSignature)null);
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
			case QvtoperationalPackage.ENTRY_HEADER__SIMPLE_SIGNATURE:
				return simple_signature != null;
		}
		return super.eIsSet(featureID);
	}

} //EntryHeaderImpl
