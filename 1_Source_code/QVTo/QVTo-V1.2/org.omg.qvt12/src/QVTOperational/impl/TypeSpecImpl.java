/**
 */
package QVTOperational.impl;

import QVTOperational.QVTOperationalPackage;
import QVTOperational.TypeReference;
import QVTOperational.TypeSpec;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.TypeSpecImpl#getType_reference <em>Type reference</em>}</li>
 *   <li>{@link QVTOperational.impl.TypeSpecImpl#getExtent_location <em>Extent location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeSpecImpl extends MinimalEObjectImpl.Container implements TypeSpec {
	/**
	 * The cached value of the '{@link #getType_reference() <em>Type reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_reference()
	 * @generated
	 * @ordered
	 */
	protected TypeReference type_reference;

	/**
	 * The default value of the '{@link #getExtent_location() <em>Extent location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent_location()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENT_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtent_location() <em>Extent location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent_location()
	 * @generated
	 * @ordered
	 */
	protected String extent_location = EXTENT_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.TYPE_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getType_reference() {
		return type_reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType_reference(TypeReference newType_reference, NotificationChain msgs) {
		TypeReference oldType_reference = type_reference;
		type_reference = newType_reference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_SPEC__TYPE_REFERENCE, oldType_reference, newType_reference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_reference(TypeReference newType_reference) {
		if (newType_reference != type_reference) {
			NotificationChain msgs = null;
			if (type_reference != null)
				msgs = ((InternalEObject)type_reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.TYPE_SPEC__TYPE_REFERENCE, null, msgs);
			if (newType_reference != null)
				msgs = ((InternalEObject)newType_reference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.TYPE_SPEC__TYPE_REFERENCE, null, msgs);
			msgs = basicSetType_reference(newType_reference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_SPEC__TYPE_REFERENCE, newType_reference, newType_reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtent_location() {
		return extent_location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtent_location(String newExtent_location) {
		String oldExtent_location = extent_location;
		extent_location = newExtent_location;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_SPEC__EXTENT_LOCATION, oldExtent_location, extent_location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.TYPE_SPEC__TYPE_REFERENCE:
				return basicSetType_reference(null, msgs);
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
			case QVTOperationalPackage.TYPE_SPEC__TYPE_REFERENCE:
				return getType_reference();
			case QVTOperationalPackage.TYPE_SPEC__EXTENT_LOCATION:
				return getExtent_location();
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
			case QVTOperationalPackage.TYPE_SPEC__TYPE_REFERENCE:
				setType_reference((TypeReference)newValue);
				return;
			case QVTOperationalPackage.TYPE_SPEC__EXTENT_LOCATION:
				setExtent_location((String)newValue);
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
			case QVTOperationalPackage.TYPE_SPEC__TYPE_REFERENCE:
				setType_reference((TypeReference)null);
				return;
			case QVTOperationalPackage.TYPE_SPEC__EXTENT_LOCATION:
				setExtent_location(EXTENT_LOCATION_EDEFAULT);
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
			case QVTOperationalPackage.TYPE_SPEC__TYPE_REFERENCE:
				return type_reference != null;
			case QVTOperationalPackage.TYPE_SPEC__EXTENT_LOCATION:
				return EXTENT_LOCATION_EDEFAULT == null ? extent_location != null : !EXTENT_LOCATION_EDEFAULT.equals(extent_location);
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
		result.append(" (extent_location: ");
		result.append(extent_location);
		result.append(')');
		return result.toString();
	}

} //TypeSpecImpl
