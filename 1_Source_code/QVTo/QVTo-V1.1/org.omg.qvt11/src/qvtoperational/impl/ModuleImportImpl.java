/**
 */
package qvtoperational.impl;

import EMOF.impl.ElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import qvtoperational.ImportKind;
import qvtoperational.ModelType;
import qvtoperational.ModuleImport;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.UnitRefGO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.ModuleImportImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link qvtoperational.impl.ModuleImportImpl#getImportedModule <em>Imported Module</em>}</li>
 *   <li>{@link qvtoperational.impl.ModuleImportImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link qvtoperational.impl.ModuleImportImpl#getModule <em>Module</em>}</li>
 *   <li>{@link qvtoperational.impl.ModuleImportImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link qvtoperational.impl.ModuleImportImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImportImpl extends ElementImpl implements ModuleImport {
	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelType> binding;

	/**
	 * The cached value of the '{@link #getImportedModule() <em>Imported Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedModule()
	 * @generated
	 * @ordered
	 */
	protected qvtoperational.Module importedModule;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ImportKind KIND_EDEFAULT = ImportKind.EXTENSION;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ImportKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitRefGO unit;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<String> identifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.MODULE_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelType> getBinding() {
		if (binding == null) {
			binding = new EObjectResolvingEList<ModelType>(ModelType.class, this, QvtoperationalPackage.MODULE_IMPORT__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public qvtoperational.Module getImportedModule() {
		if (importedModule != null && importedModule.eIsProxy()) {
			InternalEObject oldImportedModule = (InternalEObject)importedModule;
			importedModule = (qvtoperational.Module)eResolveProxy(oldImportedModule);
			if (importedModule != oldImportedModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.MODULE_IMPORT__IMPORTED_MODULE, oldImportedModule, importedModule));
			}
		}
		return importedModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public qvtoperational.Module basicGetImportedModule() {
		return importedModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedModule(qvtoperational.Module newImportedModule) {
		qvtoperational.Module oldImportedModule = importedModule;
		importedModule = newImportedModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODULE_IMPORT__IMPORTED_MODULE, oldImportedModule, importedModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ImportKind newKind) {
		ImportKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODULE_IMPORT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public qvtoperational.Module getModule() {
		if (eContainerFeatureID() != QvtoperationalPackage.MODULE_IMPORT__MODULE) return null;
		return (qvtoperational.Module)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(qvtoperational.Module newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, QvtoperationalPackage.MODULE_IMPORT__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(qvtoperational.Module newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != QvtoperationalPackage.MODULE_IMPORT__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, QvtoperationalPackage.MODULE__MODULE_IMPORT, qvtoperational.Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODULE_IMPORT__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitRefGO getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(UnitRefGO newUnit, NotificationChain msgs) {
		UnitRefGO oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODULE_IMPORT__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(UnitRefGO newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MODULE_IMPORT__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MODULE_IMPORT__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODULE_IMPORT__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIdentifier() {
		if (identifier == null) {
			identifier = new EDataTypeUniqueEList<String>(String.class, this, QvtoperationalPackage.MODULE_IMPORT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.MODULE_IMPORT__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((qvtoperational.Module)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.MODULE_IMPORT__MODULE:
				return basicSetModule(null, msgs);
			case QvtoperationalPackage.MODULE_IMPORT__UNIT:
				return basicSetUnit(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QvtoperationalPackage.MODULE_IMPORT__MODULE:
				return eInternalContainer().eInverseRemove(this, QvtoperationalPackage.MODULE__MODULE_IMPORT, qvtoperational.Module.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvtoperationalPackage.MODULE_IMPORT__BINDING:
				return getBinding();
			case QvtoperationalPackage.MODULE_IMPORT__IMPORTED_MODULE:
				if (resolve) return getImportedModule();
				return basicGetImportedModule();
			case QvtoperationalPackage.MODULE_IMPORT__KIND:
				return getKind();
			case QvtoperationalPackage.MODULE_IMPORT__MODULE:
				return getModule();
			case QvtoperationalPackage.MODULE_IMPORT__UNIT:
				return getUnit();
			case QvtoperationalPackage.MODULE_IMPORT__IDENTIFIER:
				return getIdentifier();
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
			case QvtoperationalPackage.MODULE_IMPORT__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends ModelType>)newValue);
				return;
			case QvtoperationalPackage.MODULE_IMPORT__IMPORTED_MODULE:
				setImportedModule((qvtoperational.Module)newValue);
				return;
			case QvtoperationalPackage.MODULE_IMPORT__KIND:
				setKind((ImportKind)newValue);
				return;
			case QvtoperationalPackage.MODULE_IMPORT__MODULE:
				setModule((qvtoperational.Module)newValue);
				return;
			case QvtoperationalPackage.MODULE_IMPORT__UNIT:
				setUnit((UnitRefGO)newValue);
				return;
			case QvtoperationalPackage.MODULE_IMPORT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends String>)newValue);
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
			case QvtoperationalPackage.MODULE_IMPORT__BINDING:
				getBinding().clear();
				return;
			case QvtoperationalPackage.MODULE_IMPORT__IMPORTED_MODULE:
				setImportedModule((qvtoperational.Module)null);
				return;
			case QvtoperationalPackage.MODULE_IMPORT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case QvtoperationalPackage.MODULE_IMPORT__MODULE:
				setModule((qvtoperational.Module)null);
				return;
			case QvtoperationalPackage.MODULE_IMPORT__UNIT:
				setUnit((UnitRefGO)null);
				return;
			case QvtoperationalPackage.MODULE_IMPORT__IDENTIFIER:
				getIdentifier().clear();
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
			case QvtoperationalPackage.MODULE_IMPORT__BINDING:
				return binding != null && !binding.isEmpty();
			case QvtoperationalPackage.MODULE_IMPORT__IMPORTED_MODULE:
				return importedModule != null;
			case QvtoperationalPackage.MODULE_IMPORT__KIND:
				return kind != KIND_EDEFAULT;
			case QvtoperationalPackage.MODULE_IMPORT__MODULE:
				return getModule() != null;
			case QvtoperationalPackage.MODULE_IMPORT__UNIT:
				return unit != null;
			case QvtoperationalPackage.MODULE_IMPORT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //ModuleImportImpl
