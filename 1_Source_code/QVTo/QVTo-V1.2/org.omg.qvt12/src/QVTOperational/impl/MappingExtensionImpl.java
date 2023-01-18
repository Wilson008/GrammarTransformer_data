/**
 */
package QVTOperational.impl;

import QVTOperational.MappingExtension;
import QVTOperational.MappingExtensionKey;
import QVTOperational.QVTOperationalPackage;
import QVTOperational.ScopedIdentifierList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.MappingExtensionImpl#getMapping_extension_key <em>Mapping extension key</em>}</li>
 *   <li>{@link QVTOperational.impl.MappingExtensionImpl#getScoped_identifier_list <em>Scoped identifier list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingExtensionImpl extends MinimalEObjectImpl.Container implements MappingExtension {
	/**
	 * The default value of the '{@link #getMapping_extension_key() <em>Mapping extension key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping_extension_key()
	 * @generated
	 * @ordered
	 */
	protected static final MappingExtensionKey MAPPING_EXTENSION_KEY_EDEFAULT = MappingExtensionKey.INHERITS;

	/**
	 * The cached value of the '{@link #getMapping_extension_key() <em>Mapping extension key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping_extension_key()
	 * @generated
	 * @ordered
	 */
	protected MappingExtensionKey mapping_extension_key = MAPPING_EXTENSION_KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScoped_identifier_list() <em>Scoped identifier list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoped_identifier_list()
	 * @generated
	 * @ordered
	 */
	protected ScopedIdentifierList scoped_identifier_list;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.MAPPING_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingExtensionKey getMapping_extension_key() {
		return mapping_extension_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping_extension_key(MappingExtensionKey newMapping_extension_key) {
		MappingExtensionKey oldMapping_extension_key = mapping_extension_key;
		mapping_extension_key = newMapping_extension_key == null ? MAPPING_EXTENSION_KEY_EDEFAULT : newMapping_extension_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_EXTENSION__MAPPING_EXTENSION_KEY, oldMapping_extension_key, mapping_extension_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopedIdentifierList getScoped_identifier_list() {
		return scoped_identifier_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScoped_identifier_list(ScopedIdentifierList newScoped_identifier_list, NotificationChain msgs) {
		ScopedIdentifierList oldScoped_identifier_list = scoped_identifier_list;
		scoped_identifier_list = newScoped_identifier_list;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_EXTENSION__SCOPED_IDENTIFIER_LIST, oldScoped_identifier_list, newScoped_identifier_list);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScoped_identifier_list(ScopedIdentifierList newScoped_identifier_list) {
		if (newScoped_identifier_list != scoped_identifier_list) {
			NotificationChain msgs = null;
			if (scoped_identifier_list != null)
				msgs = ((InternalEObject)scoped_identifier_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_EXTENSION__SCOPED_IDENTIFIER_LIST, null, msgs);
			if (newScoped_identifier_list != null)
				msgs = ((InternalEObject)newScoped_identifier_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_EXTENSION__SCOPED_IDENTIFIER_LIST, null, msgs);
			msgs = basicSetScoped_identifier_list(newScoped_identifier_list, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_EXTENSION__SCOPED_IDENTIFIER_LIST, newScoped_identifier_list, newScoped_identifier_list));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.MAPPING_EXTENSION__SCOPED_IDENTIFIER_LIST:
				return basicSetScoped_identifier_list(null, msgs);
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
			case QVTOperationalPackage.MAPPING_EXTENSION__MAPPING_EXTENSION_KEY:
				return getMapping_extension_key();
			case QVTOperationalPackage.MAPPING_EXTENSION__SCOPED_IDENTIFIER_LIST:
				return getScoped_identifier_list();
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
			case QVTOperationalPackage.MAPPING_EXTENSION__MAPPING_EXTENSION_KEY:
				setMapping_extension_key((MappingExtensionKey)newValue);
				return;
			case QVTOperationalPackage.MAPPING_EXTENSION__SCOPED_IDENTIFIER_LIST:
				setScoped_identifier_list((ScopedIdentifierList)newValue);
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
			case QVTOperationalPackage.MAPPING_EXTENSION__MAPPING_EXTENSION_KEY:
				setMapping_extension_key(MAPPING_EXTENSION_KEY_EDEFAULT);
				return;
			case QVTOperationalPackage.MAPPING_EXTENSION__SCOPED_IDENTIFIER_LIST:
				setScoped_identifier_list((ScopedIdentifierList)null);
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
			case QVTOperationalPackage.MAPPING_EXTENSION__MAPPING_EXTENSION_KEY:
				return mapping_extension_key != MAPPING_EXTENSION_KEY_EDEFAULT;
			case QVTOperationalPackage.MAPPING_EXTENSION__SCOPED_IDENTIFIER_LIST:
				return scoped_identifier_list != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mapping_extension_key: ");
		result.append(mapping_extension_key);
		result.append(')');
		return result.toString();
	}

} //MappingExtensionImpl
