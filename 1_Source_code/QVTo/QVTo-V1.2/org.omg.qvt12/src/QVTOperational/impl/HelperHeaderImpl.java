/**
 */
package QVTOperational.impl;

import QVTOperational.CompleteSignature;
import QVTOperational.HelperHeader;
import QVTOperational.HelperInfo;
import QVTOperational.QVTOperationalPackage;
import QVTOperational.ScopedIdentifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Helper Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.HelperHeaderImpl#getHelper_info <em>Helper info</em>}</li>
 *   <li>{@link QVTOperational.impl.HelperHeaderImpl#getScope_identifier <em>Scope identifier</em>}</li>
 *   <li>{@link QVTOperational.impl.HelperHeaderImpl#getComplete_signature <em>Complete signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HelperHeaderImpl extends MinimalEObjectImpl.Container implements HelperHeader {
	/**
	 * The cached value of the '{@link #getHelper_info() <em>Helper info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelper_info()
	 * @generated
	 * @ordered
	 */
	protected HelperInfo helper_info;

	/**
	 * The cached value of the '{@link #getScope_identifier() <em>Scope identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope_identifier()
	 * @generated
	 * @ordered
	 */
	protected ScopedIdentifier scope_identifier;

	/**
	 * The cached value of the '{@link #getComplete_signature() <em>Complete signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplete_signature()
	 * @generated
	 * @ordered
	 */
	protected CompleteSignature complete_signature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HelperHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.HELPER_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperInfo getHelper_info() {
		return helper_info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHelper_info(HelperInfo newHelper_info, NotificationChain msgs) {
		HelperInfo oldHelper_info = helper_info;
		helper_info = newHelper_info;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.HELPER_HEADER__HELPER_INFO, oldHelper_info, newHelper_info);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelper_info(HelperInfo newHelper_info) {
		if (newHelper_info != helper_info) {
			NotificationChain msgs = null;
			if (helper_info != null)
				msgs = ((InternalEObject)helper_info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.HELPER_HEADER__HELPER_INFO, null, msgs);
			if (newHelper_info != null)
				msgs = ((InternalEObject)newHelper_info).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.HELPER_HEADER__HELPER_INFO, null, msgs);
			msgs = basicSetHelper_info(newHelper_info, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.HELPER_HEADER__HELPER_INFO, newHelper_info, newHelper_info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopedIdentifier getScope_identifier() {
		return scope_identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope_identifier(ScopedIdentifier newScope_identifier, NotificationChain msgs) {
		ScopedIdentifier oldScope_identifier = scope_identifier;
		scope_identifier = newScope_identifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.HELPER_HEADER__SCOPE_IDENTIFIER, oldScope_identifier, newScope_identifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope_identifier(ScopedIdentifier newScope_identifier) {
		if (newScope_identifier != scope_identifier) {
			NotificationChain msgs = null;
			if (scope_identifier != null)
				msgs = ((InternalEObject)scope_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.HELPER_HEADER__SCOPE_IDENTIFIER, null, msgs);
			if (newScope_identifier != null)
				msgs = ((InternalEObject)newScope_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.HELPER_HEADER__SCOPE_IDENTIFIER, null, msgs);
			msgs = basicSetScope_identifier(newScope_identifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.HELPER_HEADER__SCOPE_IDENTIFIER, newScope_identifier, newScope_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteSignature getComplete_signature() {
		return complete_signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplete_signature(CompleteSignature newComplete_signature, NotificationChain msgs) {
		CompleteSignature oldComplete_signature = complete_signature;
		complete_signature = newComplete_signature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.HELPER_HEADER__COMPLETE_SIGNATURE, oldComplete_signature, newComplete_signature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplete_signature(CompleteSignature newComplete_signature) {
		if (newComplete_signature != complete_signature) {
			NotificationChain msgs = null;
			if (complete_signature != null)
				msgs = ((InternalEObject)complete_signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.HELPER_HEADER__COMPLETE_SIGNATURE, null, msgs);
			if (newComplete_signature != null)
				msgs = ((InternalEObject)newComplete_signature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.HELPER_HEADER__COMPLETE_SIGNATURE, null, msgs);
			msgs = basicSetComplete_signature(newComplete_signature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.HELPER_HEADER__COMPLETE_SIGNATURE, newComplete_signature, newComplete_signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.HELPER_HEADER__HELPER_INFO:
				return basicSetHelper_info(null, msgs);
			case QVTOperationalPackage.HELPER_HEADER__SCOPE_IDENTIFIER:
				return basicSetScope_identifier(null, msgs);
			case QVTOperationalPackage.HELPER_HEADER__COMPLETE_SIGNATURE:
				return basicSetComplete_signature(null, msgs);
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
			case QVTOperationalPackage.HELPER_HEADER__HELPER_INFO:
				return getHelper_info();
			case QVTOperationalPackage.HELPER_HEADER__SCOPE_IDENTIFIER:
				return getScope_identifier();
			case QVTOperationalPackage.HELPER_HEADER__COMPLETE_SIGNATURE:
				return getComplete_signature();
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
			case QVTOperationalPackage.HELPER_HEADER__HELPER_INFO:
				setHelper_info((HelperInfo)newValue);
				return;
			case QVTOperationalPackage.HELPER_HEADER__SCOPE_IDENTIFIER:
				setScope_identifier((ScopedIdentifier)newValue);
				return;
			case QVTOperationalPackage.HELPER_HEADER__COMPLETE_SIGNATURE:
				setComplete_signature((CompleteSignature)newValue);
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
			case QVTOperationalPackage.HELPER_HEADER__HELPER_INFO:
				setHelper_info((HelperInfo)null);
				return;
			case QVTOperationalPackage.HELPER_HEADER__SCOPE_IDENTIFIER:
				setScope_identifier((ScopedIdentifier)null);
				return;
			case QVTOperationalPackage.HELPER_HEADER__COMPLETE_SIGNATURE:
				setComplete_signature((CompleteSignature)null);
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
			case QVTOperationalPackage.HELPER_HEADER__HELPER_INFO:
				return helper_info != null;
			case QVTOperationalPackage.HELPER_HEADER__SCOPE_IDENTIFIER:
				return scope_identifier != null;
			case QVTOperationalPackage.HELPER_HEADER__COMPLETE_SIGNATURE:
				return complete_signature != null;
		}
		return super.eIsSet(featureID);
	}

} //HelperHeaderImpl
