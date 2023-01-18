/**
 */
package qvtoperational.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qvtoperational.ModuleRefGO;
import qvtoperational.ModuleUsageGO;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.TransformationUsageRefine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Usage Refine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.TransformationUsageRefineImpl#getModule_usage <em>Module usage</em>}</li>
 *   <li>{@link qvtoperational.impl.TransformationUsageRefineImpl#getTransformation_refine <em>Transformation refine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationUsageRefineImpl extends MinimalEObjectImpl.Container implements TransformationUsageRefine {
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
	 * The cached value of the '{@link #getTransformation_refine() <em>Transformation refine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation_refine()
	 * @generated
	 * @ordered
	 */
	protected ModuleRefGO transformation_refine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationUsageRefineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.TRANSFORMATION_USAGE_REFINE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__MODULE_USAGE, oldModule_usage, newModule_usage);
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
				msgs = ((InternalEObject)module_usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__MODULE_USAGE, null, msgs);
			if (newModule_usage != null)
				msgs = ((InternalEObject)newModule_usage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__MODULE_USAGE, null, msgs);
			msgs = basicSetModule_usage(newModule_usage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__MODULE_USAGE, newModule_usage, newModule_usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRefGO getTransformation_refine() {
		return transformation_refine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation_refine(ModuleRefGO newTransformation_refine, NotificationChain msgs) {
		ModuleRefGO oldTransformation_refine = transformation_refine;
		transformation_refine = newTransformation_refine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__TRANSFORMATION_REFINE, oldTransformation_refine, newTransformation_refine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation_refine(ModuleRefGO newTransformation_refine) {
		if (newTransformation_refine != transformation_refine) {
			NotificationChain msgs = null;
			if (transformation_refine != null)
				msgs = ((InternalEObject)transformation_refine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__TRANSFORMATION_REFINE, null, msgs);
			if (newTransformation_refine != null)
				msgs = ((InternalEObject)newTransformation_refine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__TRANSFORMATION_REFINE, null, msgs);
			msgs = basicSetTransformation_refine(newTransformation_refine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__TRANSFORMATION_REFINE, newTransformation_refine, newTransformation_refine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__MODULE_USAGE:
				return basicSetModule_usage(null, msgs);
			case QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__TRANSFORMATION_REFINE:
				return basicSetTransformation_refine(null, msgs);
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
			case QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__MODULE_USAGE:
				return getModule_usage();
			case QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__TRANSFORMATION_REFINE:
				return getTransformation_refine();
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
			case QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__MODULE_USAGE:
				setModule_usage((ModuleUsageGO)newValue);
				return;
			case QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__TRANSFORMATION_REFINE:
				setTransformation_refine((ModuleRefGO)newValue);
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
			case QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__MODULE_USAGE:
				setModule_usage((ModuleUsageGO)null);
				return;
			case QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__TRANSFORMATION_REFINE:
				setTransformation_refine((ModuleRefGO)null);
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
			case QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__MODULE_USAGE:
				return module_usage != null;
			case QvtoperationalPackage.TRANSFORMATION_USAGE_REFINE__TRANSFORMATION_REFINE:
				return transformation_refine != null;
		}
		return super.eIsSet(featureID);
	}

} //TransformationUsageRefineImpl
