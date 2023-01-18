/**
 */
package qvtoperational.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qvtoperational.AccessUsage;
import qvtoperational.ModuleKind;
import qvtoperational.ModuleRefGO;
import qvtoperational.QvtoperationalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.AccessUsageImpl#getModule_kind <em>Module kind</em>}</li>
 *   <li>{@link qvtoperational.impl.AccessUsageImpl#getModuleref_list <em>Moduleref list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessUsageImpl extends MinimalEObjectImpl.Container implements AccessUsage {
	/**
	 * The default value of the '{@link #getModule_kind() <em>Module kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule_kind()
	 * @generated
	 * @ordered
	 */
	protected static final ModuleKind MODULE_KIND_EDEFAULT = ModuleKind.TRANSFORMATION;

	/**
	 * The cached value of the '{@link #getModule_kind() <em>Module kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule_kind()
	 * @generated
	 * @ordered
	 */
	protected ModuleKind module_kind = MODULE_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModuleref_list() <em>Moduleref list</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleref_list()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleRefGO> moduleref_list;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.ACCESS_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleKind getModule_kind() {
		return module_kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule_kind(ModuleKind newModule_kind) {
		ModuleKind oldModule_kind = module_kind;
		module_kind = newModule_kind == null ? MODULE_KIND_EDEFAULT : newModule_kind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.ACCESS_USAGE__MODULE_KIND, oldModule_kind, module_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleRefGO> getModuleref_list() {
		if (moduleref_list == null) {
			moduleref_list = new EObjectContainmentEList<ModuleRefGO>(ModuleRefGO.class, this, QvtoperationalPackage.ACCESS_USAGE__MODULEREF_LIST);
		}
		return moduleref_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.ACCESS_USAGE__MODULEREF_LIST:
				return ((InternalEList<?>)getModuleref_list()).basicRemove(otherEnd, msgs);
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
			case QvtoperationalPackage.ACCESS_USAGE__MODULE_KIND:
				return getModule_kind();
			case QvtoperationalPackage.ACCESS_USAGE__MODULEREF_LIST:
				return getModuleref_list();
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
			case QvtoperationalPackage.ACCESS_USAGE__MODULE_KIND:
				setModule_kind((ModuleKind)newValue);
				return;
			case QvtoperationalPackage.ACCESS_USAGE__MODULEREF_LIST:
				getModuleref_list().clear();
				getModuleref_list().addAll((Collection<? extends ModuleRefGO>)newValue);
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
			case QvtoperationalPackage.ACCESS_USAGE__MODULE_KIND:
				setModule_kind(MODULE_KIND_EDEFAULT);
				return;
			case QvtoperationalPackage.ACCESS_USAGE__MODULEREF_LIST:
				getModuleref_list().clear();
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
			case QvtoperationalPackage.ACCESS_USAGE__MODULE_KIND:
				return module_kind != MODULE_KIND_EDEFAULT;
			case QvtoperationalPackage.ACCESS_USAGE__MODULEREF_LIST:
				return moduleref_list != null && !moduleref_list.isEmpty();
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
		result.append(" (module_kind: ");
		result.append(module_kind);
		result.append(')');
		return result.toString();
	}

} //AccessUsageImpl
