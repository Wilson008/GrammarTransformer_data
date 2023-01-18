/**
 */
package QVTOperational.impl;

import QVTOperational.GeneralQualifier;
import QVTOperational.HelperInfo;
import QVTOperational.HelperKind;
import QVTOperational.QVTOperationalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Helper Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.HelperInfoImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link QVTOperational.impl.HelperInfoImpl#getHelper_kind <em>Helper kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HelperInfoImpl extends MinimalEObjectImpl.Container implements HelperInfo {
	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralQualifier> qualifier;

	/**
	 * The default value of the '{@link #getHelper_kind() <em>Helper kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelper_kind()
	 * @generated
	 * @ordered
	 */
	protected static final HelperKind HELPER_KIND_EDEFAULT = HelperKind.HELPER;

	/**
	 * The cached value of the '{@link #getHelper_kind() <em>Helper kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelper_kind()
	 * @generated
	 * @ordered
	 */
	protected HelperKind helper_kind = HELPER_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HelperInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.HELPER_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralQualifier> getQualifier() {
		if (qualifier == null) {
			qualifier = new EDataTypeUniqueEList<GeneralQualifier>(GeneralQualifier.class, this, QVTOperationalPackage.HELPER_INFO__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperKind getHelper_kind() {
		return helper_kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelper_kind(HelperKind newHelper_kind) {
		HelperKind oldHelper_kind = helper_kind;
		helper_kind = newHelper_kind == null ? HELPER_KIND_EDEFAULT : newHelper_kind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.HELPER_INFO__HELPER_KIND, oldHelper_kind, helper_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QVTOperationalPackage.HELPER_INFO__QUALIFIER:
				return getQualifier();
			case QVTOperationalPackage.HELPER_INFO__HELPER_KIND:
				return getHelper_kind();
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
			case QVTOperationalPackage.HELPER_INFO__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends GeneralQualifier>)newValue);
				return;
			case QVTOperationalPackage.HELPER_INFO__HELPER_KIND:
				setHelper_kind((HelperKind)newValue);
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
			case QVTOperationalPackage.HELPER_INFO__QUALIFIER:
				getQualifier().clear();
				return;
			case QVTOperationalPackage.HELPER_INFO__HELPER_KIND:
				setHelper_kind(HELPER_KIND_EDEFAULT);
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
			case QVTOperationalPackage.HELPER_INFO__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case QVTOperationalPackage.HELPER_INFO__HELPER_KIND:
				return helper_kind != HELPER_KIND_EDEFAULT;
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
		result.append(" (qualifier: ");
		result.append(qualifier);
		result.append(", helper_kind: ");
		result.append(helper_kind);
		result.append(')');
		return result.toString();
	}

} //HelperInfoImpl
