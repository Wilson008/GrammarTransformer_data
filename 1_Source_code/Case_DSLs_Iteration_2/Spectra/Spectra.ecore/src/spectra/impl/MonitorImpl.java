/**
 */
package spectra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spectra.Monitor;
import spectra.Referrable;
import spectra.SpectraPackage;
import spectra.TemporalExpression;
import spectra.VarType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.MonitorImpl#getName <em>Name</em>}</li>
 *   <li>{@link spectra.impl.MonitorImpl#getType <em>Type</em>}</li>
 *   <li>{@link spectra.impl.MonitorImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link spectra.impl.MonitorImpl#getSafety <em>Safety</em>}</li>
 *   <li>{@link spectra.impl.MonitorImpl#getStateInv <em>State Inv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitorImpl extends DeclImpl implements Monitor {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VarType type;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalExpression> initial;

	/**
	 * The cached value of the '{@link #getSafety() <em>Safety</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafety()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalExpression> safety;

	/**
	 * The cached value of the '{@link #getStateInv() <em>State Inv</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateInv()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalExpression> stateInv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.MONITOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.MONITOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(VarType newType, NotificationChain msgs) {
		VarType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.MONITOR__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(VarType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.MONITOR__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.MONITOR__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.MONITOR__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporalExpression> getInitial() {
		if (initial == null) {
			initial = new EObjectContainmentEList<TemporalExpression>(TemporalExpression.class, this, SpectraPackage.MONITOR__INITIAL);
		}
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporalExpression> getSafety() {
		if (safety == null) {
			safety = new EObjectContainmentEList<TemporalExpression>(TemporalExpression.class, this, SpectraPackage.MONITOR__SAFETY);
		}
		return safety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporalExpression> getStateInv() {
		if (stateInv == null) {
			stateInv = new EObjectContainmentEList<TemporalExpression>(TemporalExpression.class, this, SpectraPackage.MONITOR__STATE_INV);
		}
		return stateInv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.MONITOR__TYPE:
				return basicSetType(null, msgs);
			case SpectraPackage.MONITOR__INITIAL:
				return ((InternalEList<?>)getInitial()).basicRemove(otherEnd, msgs);
			case SpectraPackage.MONITOR__SAFETY:
				return ((InternalEList<?>)getSafety()).basicRemove(otherEnd, msgs);
			case SpectraPackage.MONITOR__STATE_INV:
				return ((InternalEList<?>)getStateInv()).basicRemove(otherEnd, msgs);
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
			case SpectraPackage.MONITOR__NAME:
				return getName();
			case SpectraPackage.MONITOR__TYPE:
				return getType();
			case SpectraPackage.MONITOR__INITIAL:
				return getInitial();
			case SpectraPackage.MONITOR__SAFETY:
				return getSafety();
			case SpectraPackage.MONITOR__STATE_INV:
				return getStateInv();
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
			case SpectraPackage.MONITOR__NAME:
				setName((String)newValue);
				return;
			case SpectraPackage.MONITOR__TYPE:
				setType((VarType)newValue);
				return;
			case SpectraPackage.MONITOR__INITIAL:
				getInitial().clear();
				getInitial().addAll((Collection<? extends TemporalExpression>)newValue);
				return;
			case SpectraPackage.MONITOR__SAFETY:
				getSafety().clear();
				getSafety().addAll((Collection<? extends TemporalExpression>)newValue);
				return;
			case SpectraPackage.MONITOR__STATE_INV:
				getStateInv().clear();
				getStateInv().addAll((Collection<? extends TemporalExpression>)newValue);
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
			case SpectraPackage.MONITOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpectraPackage.MONITOR__TYPE:
				setType((VarType)null);
				return;
			case SpectraPackage.MONITOR__INITIAL:
				getInitial().clear();
				return;
			case SpectraPackage.MONITOR__SAFETY:
				getSafety().clear();
				return;
			case SpectraPackage.MONITOR__STATE_INV:
				getStateInv().clear();
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
			case SpectraPackage.MONITOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpectraPackage.MONITOR__TYPE:
				return type != null;
			case SpectraPackage.MONITOR__INITIAL:
				return initial != null && !initial.isEmpty();
			case SpectraPackage.MONITOR__SAFETY:
				return safety != null && !safety.isEmpty();
			case SpectraPackage.MONITOR__STATE_INV:
				return stateInv != null && !stateInv.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Referrable.class) {
			switch (derivedFeatureID) {
				case SpectraPackage.MONITOR__NAME: return SpectraPackage.REFERRABLE__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Referrable.class) {
			switch (baseFeatureID) {
				case SpectraPackage.REFERRABLE__NAME: return SpectraPackage.MONITOR__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //MonitorImpl
