/**
 */
package QVTOperational.impl;

import EMOF.impl.ElementImpl;

import QVTOperational.ImportKind;
import QVTOperational.ModelType;
import QVTOperational.ModuleImport;
import QVTOperational.QVTOperationalPackage;
import QVTOperational.UnitRefGO;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.ModuleImportImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link QVTOperational.impl.ModuleImportImpl#getImportedModule <em>Imported Module</em>}</li>
 *   <li>{@link QVTOperational.impl.ModuleImportImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link QVTOperational.impl.ModuleImportImpl#getModule <em>Module</em>}</li>
 *   <li>{@link QVTOperational.impl.ModuleImportImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link QVTOperational.impl.ModuleImportImpl#getIdentifier <em>Identifier</em>}</li>
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
	protected QVTOperational.Module importedModule;

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
		return QVTOperationalPackage.Literals.MODULE_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelType> getBinding() {
		if (binding == null) {
			binding = new EObjectResolvingEList<ModelType>(ModelType.class, this, QVTOperationalPackage.MODULE_IMPORT__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTOperational.Module getImportedModule() {
		if (importedModule != null && importedModule.eIsProxy()) {
			InternalEObject oldImportedModule = (InternalEObject)importedModule;
			importedModule = (QVTOperational.Module)eResolveProxy(oldImportedModule);
			if (importedModule != oldImportedModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QVTOperationalPackage.MODULE_IMPORT__IMPORTED_MODULE, oldImportedModule, importedModule));
			}
		}
		return importedModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTOperational.Module basicGetImportedModule() {
		return importedModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedModule(QVTOperational.Module newImportedModule) {
		QVTOperational.Module oldImportedModule = importedModule;
		importedModule = newImportedModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODULE_IMPORT__IMPORTED_MODULE, oldImportedModule, importedModule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODULE_IMPORT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTOperational.Module getModule() {
		if (eContainerFeatureID() != QVTOperationalPackage.MODULE_IMPORT__MODULE) return null;
		return (QVTOperational.Module)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(QVTOperational.Module newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, QVTOperationalPackage.MODULE_IMPORT__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(QVTOperational.Module newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != QVTOperationalPackage.MODULE_IMPORT__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, QVTOperationalPackage.MODULE__MODULE_IMPORT, QVTOperational.Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODULE_IMPORT__MODULE, newModule, newModule));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODULE_IMPORT__UNIT, oldUnit, newUnit);
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
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MODULE_IMPORT__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MODULE_IMPORT__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MODULE_IMPORT__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIdentifier() {
		if (identifier == null) {
			identifier = new EDataTypeUniqueEList<String>(String.class, this, QVTOperationalPackage.MODULE_IMPORT__IDENTIFIER);
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
			case QVTOperationalPackage.MODULE_IMPORT__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((QVTOperational.Module)otherEnd, msgs);
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
			case QVTOperationalPackage.MODULE_IMPORT__MODULE:
				return basicSetModule(null, msgs);
			case QVTOperationalPackage.MODULE_IMPORT__UNIT:
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
			case QVTOperationalPackage.MODULE_IMPORT__MODULE:
				return eInternalContainer().eInverseRemove(this, QVTOperationalPackage.MODULE__MODULE_IMPORT, QVTOperational.Module.class, msgs);
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
			case QVTOperationalPackage.MODULE_IMPORT__BINDING:
				return getBinding();
			case QVTOperationalPackage.MODULE_IMPORT__IMPORTED_MODULE:
				if (resolve) return getImportedModule();
				return basicGetImportedModule();
			case QVTOperationalPackage.MODULE_IMPORT__KIND:
				return getKind();
			case QVTOperationalPackage.MODULE_IMPORT__MODULE:
				return getModule();
			case QVTOperationalPackage.MODULE_IMPORT__UNIT:
				return getUnit();
			case QVTOperationalPackage.MODULE_IMPORT__IDENTIFIER:
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
			case QVTOperationalPackage.MODULE_IMPORT__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends ModelType>)newValue);
				return;
			case QVTOperationalPackage.MODULE_IMPORT__IMPORTED_MODULE:
				setImportedModule((QVTOperational.Module)newValue);
				return;
			case QVTOperationalPackage.MODULE_IMPORT__KIND:
				setKind((ImportKind)newValue);
				return;
			case QVTOperationalPackage.MODULE_IMPORT__MODULE:
				setModule((QVTOperational.Module)newValue);
				return;
			case QVTOperationalPackage.MODULE_IMPORT__UNIT:
				setUnit((UnitRefGO)newValue);
				return;
			case QVTOperationalPackage.MODULE_IMPORT__IDENTIFIER:
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
			case QVTOperationalPackage.MODULE_IMPORT__BINDING:
				getBinding().clear();
				return;
			case QVTOperationalPackage.MODULE_IMPORT__IMPORTED_MODULE:
				setImportedModule((QVTOperational.Module)null);
				return;
			case QVTOperationalPackage.MODULE_IMPORT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case QVTOperationalPackage.MODULE_IMPORT__MODULE:
				setModule((QVTOperational.Module)null);
				return;
			case QVTOperationalPackage.MODULE_IMPORT__UNIT:
				setUnit((UnitRefGO)null);
				return;
			case QVTOperationalPackage.MODULE_IMPORT__IDENTIFIER:
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
			case QVTOperationalPackage.MODULE_IMPORT__BINDING:
				return binding != null && !binding.isEmpty();
			case QVTOperationalPackage.MODULE_IMPORT__IMPORTED_MODULE:
				return importedModule != null;
			case QVTOperationalPackage.MODULE_IMPORT__KIND:
				return kind != KIND_EDEFAULT;
			case QVTOperationalPackage.MODULE_IMPORT__MODULE:
				return getModule() != null;
			case QVTOperationalPackage.MODULE_IMPORT__UNIT:
				return unit != null;
			case QVTOperationalPackage.MODULE_IMPORT__IDENTIFIER:
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
