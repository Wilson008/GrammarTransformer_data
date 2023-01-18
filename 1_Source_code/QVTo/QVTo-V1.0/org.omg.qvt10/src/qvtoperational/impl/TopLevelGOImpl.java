/**
 */
package qvtoperational.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qvtoperational.ModuleImport;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.TopLevelGO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level GO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.TopLevelGOImpl#getUnit_element <em>Unit element</em>}</li>
 *   <li>{@link qvtoperational.impl.TopLevelGOImpl#getModuleimport <em>Moduleimport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopLevelGOImpl extends MinimalEObjectImpl.Container implements TopLevelGO {
	/**
	 * The cached value of the '{@link #getUnit_element() <em>Unit element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit_element()
	 * @generated
	 * @ordered
	 */
	protected EList<qvtoperational.Module> unit_element;

	/**
	 * The cached value of the '{@link #getModuleimport() <em>Moduleimport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleimport()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleImport> moduleimport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopLevelGOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.TOP_LEVEL_GO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<qvtoperational.Module> getUnit_element() {
		if (unit_element == null) {
			unit_element = new EObjectContainmentEList<qvtoperational.Module>(qvtoperational.Module.class, this, QvtoperationalPackage.TOP_LEVEL_GO__UNIT_ELEMENT);
		}
		return unit_element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleImport> getModuleimport() {
		if (moduleimport == null) {
			moduleimport = new EObjectContainmentEList<ModuleImport>(ModuleImport.class, this, QvtoperationalPackage.TOP_LEVEL_GO__MODULEIMPORT);
		}
		return moduleimport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.TOP_LEVEL_GO__UNIT_ELEMENT:
				return ((InternalEList<?>)getUnit_element()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.TOP_LEVEL_GO__MODULEIMPORT:
				return ((InternalEList<?>)getModuleimport()).basicRemove(otherEnd, msgs);
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
			case QvtoperationalPackage.TOP_LEVEL_GO__UNIT_ELEMENT:
				return getUnit_element();
			case QvtoperationalPackage.TOP_LEVEL_GO__MODULEIMPORT:
				return getModuleimport();
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
			case QvtoperationalPackage.TOP_LEVEL_GO__UNIT_ELEMENT:
				getUnit_element().clear();
				getUnit_element().addAll((Collection<? extends qvtoperational.Module>)newValue);
				return;
			case QvtoperationalPackage.TOP_LEVEL_GO__MODULEIMPORT:
				getModuleimport().clear();
				getModuleimport().addAll((Collection<? extends ModuleImport>)newValue);
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
			case QvtoperationalPackage.TOP_LEVEL_GO__UNIT_ELEMENT:
				getUnit_element().clear();
				return;
			case QvtoperationalPackage.TOP_LEVEL_GO__MODULEIMPORT:
				getModuleimport().clear();
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
			case QvtoperationalPackage.TOP_LEVEL_GO__UNIT_ELEMENT:
				return unit_element != null && !unit_element.isEmpty();
			case QvtoperationalPackage.TOP_LEVEL_GO__MODULEIMPORT:
				return moduleimport != null && !moduleimport.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TopLevelGOImpl
