/**
 */
package qvtoperational.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qvtoperational.ExpressionGO;
import qvtoperational.MappingParameter;
import qvtoperational.ModelParameter;
import qvtoperational.QvtoperationalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.MappingParameterImpl#getRefinedDomain <em>Refined Domain</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingParameterImpl#getExtent <em>Extent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingParameterImpl extends VarParameterImpl implements MappingParameter {
	/**
	 * The cached value of the '{@link #getRefinedDomain() <em>Refined Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedDomain()
	 * @generated
	 * @ordered
	 */
	protected ExpressionGO refinedDomain;

	/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected ModelParameter extent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.MAPPING_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionGO getRefinedDomain() {
		if (refinedDomain != null && refinedDomain.eIsProxy()) {
			InternalEObject oldRefinedDomain = (InternalEObject)refinedDomain;
			refinedDomain = (ExpressionGO)eResolveProxy(oldRefinedDomain);
			if (refinedDomain != oldRefinedDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.MAPPING_PARAMETER__REFINED_DOMAIN, oldRefinedDomain, refinedDomain));
			}
		}
		return refinedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionGO basicGetRefinedDomain() {
		return refinedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedDomain(ExpressionGO newRefinedDomain) {
		ExpressionGO oldRefinedDomain = refinedDomain;
		refinedDomain = newRefinedDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_PARAMETER__REFINED_DOMAIN, oldRefinedDomain, refinedDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParameter getExtent() {
		if (extent != null && extent.eIsProxy()) {
			InternalEObject oldExtent = (InternalEObject)extent;
			extent = (ModelParameter)eResolveProxy(oldExtent);
			if (extent != oldExtent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.MAPPING_PARAMETER__EXTENT, oldExtent, extent));
			}
		}
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParameter basicGetExtent() {
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtent(ModelParameter newExtent) {
		ModelParameter oldExtent = extent;
		extent = newExtent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_PARAMETER__EXTENT, oldExtent, extent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvtoperationalPackage.MAPPING_PARAMETER__REFINED_DOMAIN:
				if (resolve) return getRefinedDomain();
				return basicGetRefinedDomain();
			case QvtoperationalPackage.MAPPING_PARAMETER__EXTENT:
				if (resolve) return getExtent();
				return basicGetExtent();
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
			case QvtoperationalPackage.MAPPING_PARAMETER__REFINED_DOMAIN:
				setRefinedDomain((ExpressionGO)newValue);
				return;
			case QvtoperationalPackage.MAPPING_PARAMETER__EXTENT:
				setExtent((ModelParameter)newValue);
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
			case QvtoperationalPackage.MAPPING_PARAMETER__REFINED_DOMAIN:
				setRefinedDomain((ExpressionGO)null);
				return;
			case QvtoperationalPackage.MAPPING_PARAMETER__EXTENT:
				setExtent((ModelParameter)null);
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
			case QvtoperationalPackage.MAPPING_PARAMETER__REFINED_DOMAIN:
				return refinedDomain != null;
			case QvtoperationalPackage.MAPPING_PARAMETER__EXTENT:
				return extent != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingParameterImpl
