/**
 */
package QVTOperational.impl;

import QVTOperational.Multiplicity;
import QVTOperational.QVTOperationalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.MultiplicityImpl#getMultiplicity_range <em>Multiplicity range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicityImpl extends MinimalEObjectImpl.Container implements Multiplicity {
	/**
	 * The default value of the '{@link #getMultiplicity_range() <em>Multiplicity range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity_range()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicity_range() <em>Multiplicity range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity_range()
	 * @generated
	 * @ordered
	 */
	protected String multiplicity_range = MULTIPLICITY_RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.MULTIPLICITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicity_range() {
		return multiplicity_range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity_range(String newMultiplicity_range) {
		String oldMultiplicity_range = multiplicity_range;
		multiplicity_range = newMultiplicity_range;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MULTIPLICITY__MULTIPLICITY_RANGE, oldMultiplicity_range, multiplicity_range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QVTOperationalPackage.MULTIPLICITY__MULTIPLICITY_RANGE:
				return getMultiplicity_range();
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
			case QVTOperationalPackage.MULTIPLICITY__MULTIPLICITY_RANGE:
				setMultiplicity_range((String)newValue);
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
			case QVTOperationalPackage.MULTIPLICITY__MULTIPLICITY_RANGE:
				setMultiplicity_range(MULTIPLICITY_RANGE_EDEFAULT);
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
			case QVTOperationalPackage.MULTIPLICITY__MULTIPLICITY_RANGE:
				return MULTIPLICITY_RANGE_EDEFAULT == null ? multiplicity_range != null : !MULTIPLICITY_RANGE_EDEFAULT.equals(multiplicity_range);
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
		result.append(" (multiplicity_range: ");
		result.append(multiplicity_range);
		result.append(')');
		return result.toString();
	}

} //MultiplicityImpl
