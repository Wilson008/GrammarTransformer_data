/**
 */
package qvtoperational.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qvtoperational.LibraryHeader;
import qvtoperational.ModuleUsageGO;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.SimpleSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.LibraryHeaderImpl#getName <em>Name</em>}</li>
 *   <li>{@link qvtoperational.impl.LibraryHeaderImpl#getLibrary_signature <em>Library signature</em>}</li>
 *   <li>{@link qvtoperational.impl.LibraryHeaderImpl#getModule_usage <em>Module usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryHeaderImpl extends MinimalEObjectImpl.Container implements LibraryHeader {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLibrary_signature() <em>Library signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary_signature()
	 * @generated
	 * @ordered
	 */
	protected SimpleSignature library_signature;

	/**
	 * The cached value of the '{@link #getModule_usage() <em>Module usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule_usage()
	 * @generated
	 * @ordered
	 */
	protected ModuleUsageGO module_usage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.LIBRARY_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.LIBRARY_HEADER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSignature getLibrary_signature() {
		return library_signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary_signature(SimpleSignature newLibrary_signature, NotificationChain msgs) {
		SimpleSignature oldLibrary_signature = library_signature;
		library_signature = newLibrary_signature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.LIBRARY_HEADER__LIBRARY_SIGNATURE, oldLibrary_signature, newLibrary_signature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary_signature(SimpleSignature newLibrary_signature) {
		if (newLibrary_signature != library_signature) {
			NotificationChain msgs = null;
			if (library_signature != null)
				msgs = ((InternalEObject)library_signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.LIBRARY_HEADER__LIBRARY_SIGNATURE, null, msgs);
			if (newLibrary_signature != null)
				msgs = ((InternalEObject)newLibrary_signature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.LIBRARY_HEADER__LIBRARY_SIGNATURE, null, msgs);
			msgs = basicSetLibrary_signature(newLibrary_signature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.LIBRARY_HEADER__LIBRARY_SIGNATURE, newLibrary_signature, newLibrary_signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleUsageGO getModule_usage() {
		return module_usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule_usage(ModuleUsageGO newModule_usage, NotificationChain msgs) {
		ModuleUsageGO oldModule_usage = module_usage;
		module_usage = newModule_usage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.LIBRARY_HEADER__MODULE_USAGE, oldModule_usage, newModule_usage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule_usage(ModuleUsageGO newModule_usage) {
		if (newModule_usage != module_usage) {
			NotificationChain msgs = null;
			if (module_usage != null)
				msgs = ((InternalEObject)module_usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.LIBRARY_HEADER__MODULE_USAGE, null, msgs);
			if (newModule_usage != null)
				msgs = ((InternalEObject)newModule_usage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.LIBRARY_HEADER__MODULE_USAGE, null, msgs);
			msgs = basicSetModule_usage(newModule_usage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.LIBRARY_HEADER__MODULE_USAGE, newModule_usage, newModule_usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.LIBRARY_HEADER__LIBRARY_SIGNATURE:
				return basicSetLibrary_signature(null, msgs);
			case QvtoperationalPackage.LIBRARY_HEADER__MODULE_USAGE:
				return basicSetModule_usage(null, msgs);
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
			case QvtoperationalPackage.LIBRARY_HEADER__NAME:
				return getName();
			case QvtoperationalPackage.LIBRARY_HEADER__LIBRARY_SIGNATURE:
				return getLibrary_signature();
			case QvtoperationalPackage.LIBRARY_HEADER__MODULE_USAGE:
				return getModule_usage();
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
			case QvtoperationalPackage.LIBRARY_HEADER__NAME:
				setName((String)newValue);
				return;
			case QvtoperationalPackage.LIBRARY_HEADER__LIBRARY_SIGNATURE:
				setLibrary_signature((SimpleSignature)newValue);
				return;
			case QvtoperationalPackage.LIBRARY_HEADER__MODULE_USAGE:
				setModule_usage((ModuleUsageGO)newValue);
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
			case QvtoperationalPackage.LIBRARY_HEADER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QvtoperationalPackage.LIBRARY_HEADER__LIBRARY_SIGNATURE:
				setLibrary_signature((SimpleSignature)null);
				return;
			case QvtoperationalPackage.LIBRARY_HEADER__MODULE_USAGE:
				setModule_usage((ModuleUsageGO)null);
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
			case QvtoperationalPackage.LIBRARY_HEADER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QvtoperationalPackage.LIBRARY_HEADER__LIBRARY_SIGNATURE:
				return library_signature != null;
			case QvtoperationalPackage.LIBRARY_HEADER__MODULE_USAGE:
				return module_usage != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LibraryHeaderImpl
