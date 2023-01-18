/**
 */
package QVTOperational.impl;

import QVTOperational.FeatureKey;
import QVTOperational.FeatureQualifier;
import QVTOperational.QVTOperationalPackage;
import QVTOperational.StereotypeQualifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Qualifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.FeatureQualifierImpl#getStereotype_qualifier <em>Stereotype qualifier</em>}</li>
 *   <li>{@link QVTOperational.impl.FeatureQualifierImpl#getFeature_key <em>Feature key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureQualifierImpl extends MinimalEObjectImpl.Container implements FeatureQualifier {
	/**
	 * The cached value of the '{@link #getStereotype_qualifier() <em>Stereotype qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype_qualifier()
	 * @generated
	 * @ordered
	 */
	protected StereotypeQualifier stereotype_qualifier;

	/**
	 * The cached value of the '{@link #getFeature_key() <em>Feature key</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature_key()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureKey> feature_key;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureQualifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.FEATURE_QUALIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StereotypeQualifier getStereotype_qualifier() {
		return stereotype_qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStereotype_qualifier(StereotypeQualifier newStereotype_qualifier, NotificationChain msgs) {
		StereotypeQualifier oldStereotype_qualifier = stereotype_qualifier;
		stereotype_qualifier = newStereotype_qualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.FEATURE_QUALIFIER__STEREOTYPE_QUALIFIER, oldStereotype_qualifier, newStereotype_qualifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype_qualifier(StereotypeQualifier newStereotype_qualifier) {
		if (newStereotype_qualifier != stereotype_qualifier) {
			NotificationChain msgs = null;
			if (stereotype_qualifier != null)
				msgs = ((InternalEObject)stereotype_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.FEATURE_QUALIFIER__STEREOTYPE_QUALIFIER, null, msgs);
			if (newStereotype_qualifier != null)
				msgs = ((InternalEObject)newStereotype_qualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.FEATURE_QUALIFIER__STEREOTYPE_QUALIFIER, null, msgs);
			msgs = basicSetStereotype_qualifier(newStereotype_qualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.FEATURE_QUALIFIER__STEREOTYPE_QUALIFIER, newStereotype_qualifier, newStereotype_qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureKey> getFeature_key() {
		if (feature_key == null) {
			feature_key = new EDataTypeUniqueEList<FeatureKey>(FeatureKey.class, this, QVTOperationalPackage.FEATURE_QUALIFIER__FEATURE_KEY);
		}
		return feature_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.FEATURE_QUALIFIER__STEREOTYPE_QUALIFIER:
				return basicSetStereotype_qualifier(null, msgs);
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
			case QVTOperationalPackage.FEATURE_QUALIFIER__STEREOTYPE_QUALIFIER:
				return getStereotype_qualifier();
			case QVTOperationalPackage.FEATURE_QUALIFIER__FEATURE_KEY:
				return getFeature_key();
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
			case QVTOperationalPackage.FEATURE_QUALIFIER__STEREOTYPE_QUALIFIER:
				setStereotype_qualifier((StereotypeQualifier)newValue);
				return;
			case QVTOperationalPackage.FEATURE_QUALIFIER__FEATURE_KEY:
				getFeature_key().clear();
				getFeature_key().addAll((Collection<? extends FeatureKey>)newValue);
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
			case QVTOperationalPackage.FEATURE_QUALIFIER__STEREOTYPE_QUALIFIER:
				setStereotype_qualifier((StereotypeQualifier)null);
				return;
			case QVTOperationalPackage.FEATURE_QUALIFIER__FEATURE_KEY:
				getFeature_key().clear();
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
			case QVTOperationalPackage.FEATURE_QUALIFIER__STEREOTYPE_QUALIFIER:
				return stereotype_qualifier != null;
			case QVTOperationalPackage.FEATURE_QUALIFIER__FEATURE_KEY:
				return feature_key != null && !feature_key.isEmpty();
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
		result.append(" (feature_key: ");
		result.append(feature_key);
		result.append(')');
		return result.toString();
	}

} //FeatureQualifierImpl
