/**
 */
package QVTOperational.impl;

import QVTOperational.ModuleRefGO;
import QVTOperational.QVTOperationalPackage;
import QVTOperational.ScopedIdentifier;
import QVTOperational.SimpleSignature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Ref GO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.ModuleRefGOImpl#getScoped_identifier <em>Scoped identifier</em>}</li>
 *   <li>{@link QVTOperational.impl.ModuleRefGOImpl#getSimple_signature <em>Simple signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleRefGOImpl extends MinimalEObjectImpl.Container implements ModuleRefGO {
	/**
	 * The cached value of the '{@link #getScoped_identifier() <em>Scoped identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoped_identifier()
	 * @generated
	 * @ordered
	 */
	protected ScopedIdentifier scoped_identifier;

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
	protected ModuleRefGOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.MODULE_REF_GO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopedIdentifier getScoped_identifier() {
		return scoped_identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScoped_identifier(ScopedIdentifier newScoped_identifier, NotificationChain msgs) {
		ScopedIdentifier oldScoped_identifier = scoped_identifier;
		scoped_identifier = newScoped_identifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODULE_REF_GO__SCOPED_IDENTIFIER, oldScoped_identifier, newScoped_identifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScoped_identifier(ScopedIdentifier newScoped_identifier) {
		if (newScoped_identifier != scoped_identifier) {
			NotificationChain msgs = null;
			if (scoped_identifier != null)
				msgs = ((InternalEObject)scoped_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MODULE_REF_GO__SCOPED_IDENTIFIER, null, msgs);
			if (newScoped_identifier != null)
				msgs = ((InternalEObject)newScoped_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MODULE_REF_GO__SCOPED_IDENTIFIER, null, msgs);
			msgs = basicSetScoped_identifier(newScoped_identifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODULE_REF_GO__SCOPED_IDENTIFIER, newScoped_identifier, newScoped_identifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODULE_REF_GO__SIMPLE_SIGNATURE, oldSimple_signature, newSimple_signature);
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
				msgs = ((InternalEObject)simple_signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MODULE_REF_GO__SIMPLE_SIGNATURE, null, msgs);
			if (newSimple_signature != null)
				msgs = ((InternalEObject)newSimple_signature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MODULE_REF_GO__SIMPLE_SIGNATURE, null, msgs);
			msgs = basicSetSimple_signature(newSimple_signature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODULE_REF_GO__SIMPLE_SIGNATURE, newSimple_signature, newSimple_signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.MODULE_REF_GO__SCOPED_IDENTIFIER:
				return basicSetScoped_identifier(null, msgs);
			case QVTOperationalPackage.MODULE_REF_GO__SIMPLE_SIGNATURE:
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
			case QVTOperationalPackage.MODULE_REF_GO__SCOPED_IDENTIFIER:
				return getScoped_identifier();
			case QVTOperationalPackage.MODULE_REF_GO__SIMPLE_SIGNATURE:
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
			case QVTOperationalPackage.MODULE_REF_GO__SCOPED_IDENTIFIER:
				setScoped_identifier((ScopedIdentifier)newValue);
				return;
			case QVTOperationalPackage.MODULE_REF_GO__SIMPLE_SIGNATURE:
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
			case QVTOperationalPackage.MODULE_REF_GO__SCOPED_IDENTIFIER:
				setScoped_identifier((ScopedIdentifier)null);
				return;
			case QVTOperationalPackage.MODULE_REF_GO__SIMPLE_SIGNATURE:
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
			case QVTOperationalPackage.MODULE_REF_GO__SCOPED_IDENTIFIER:
				return scoped_identifier != null;
			case QVTOperationalPackage.MODULE_REF_GO__SIMPLE_SIGNATURE:
				return simple_signature != null;
		}
		return super.eIsSet(featureID);
	}

} //ModuleRefGOImpl
