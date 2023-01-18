/**
 */
package qvtoperational.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import qvtoperational.EnumerationGO;
import qvtoperational.EnumerationHeader;
import qvtoperational.QvtoperationalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration GO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.EnumerationGOImpl#getEnumeration_h <em>Enumeration h</em>}</li>
 *   <li>{@link qvtoperational.impl.EnumerationGOImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationGOImpl extends MinimalEObjectImpl.Container implements EnumerationGO {
	/**
	 * The cached value of the '{@link #getEnumeration_h() <em>Enumeration h</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeration_h()
	 * @generated
	 * @ordered
	 */
	protected EnumerationHeader enumeration_h;

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
	protected EnumerationGOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.ENUMERATION_GO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationHeader getEnumeration_h() {
		return enumeration_h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumeration_h(EnumerationHeader newEnumeration_h, NotificationChain msgs) {
		EnumerationHeader oldEnumeration_h = enumeration_h;
		enumeration_h = newEnumeration_h;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.ENUMERATION_GO__ENUMERATION_H, oldEnumeration_h, newEnumeration_h);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeration_h(EnumerationHeader newEnumeration_h) {
		if (newEnumeration_h != enumeration_h) {
			NotificationChain msgs = null;
			if (enumeration_h != null)
				msgs = ((InternalEObject)enumeration_h).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.ENUMERATION_GO__ENUMERATION_H, null, msgs);
			if (newEnumeration_h != null)
				msgs = ((InternalEObject)newEnumeration_h).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.ENUMERATION_GO__ENUMERATION_H, null, msgs);
			msgs = basicSetEnumeration_h(newEnumeration_h, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.ENUMERATION_GO__ENUMERATION_H, newEnumeration_h, newEnumeration_h));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIdentifier() {
		if (identifier == null) {
			identifier = new EDataTypeUniqueEList<String>(String.class, this, QvtoperationalPackage.ENUMERATION_GO__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.ENUMERATION_GO__ENUMERATION_H:
				return basicSetEnumeration_h(null, msgs);
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
			case QvtoperationalPackage.ENUMERATION_GO__ENUMERATION_H:
				return getEnumeration_h();
			case QvtoperationalPackage.ENUMERATION_GO__IDENTIFIER:
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
			case QvtoperationalPackage.ENUMERATION_GO__ENUMERATION_H:
				setEnumeration_h((EnumerationHeader)newValue);
				return;
			case QvtoperationalPackage.ENUMERATION_GO__IDENTIFIER:
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
			case QvtoperationalPackage.ENUMERATION_GO__ENUMERATION_H:
				setEnumeration_h((EnumerationHeader)null);
				return;
			case QvtoperationalPackage.ENUMERATION_GO__IDENTIFIER:
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
			case QvtoperationalPackage.ENUMERATION_GO__ENUMERATION_H:
				return enumeration_h != null;
			case QvtoperationalPackage.ENUMERATION_GO__IDENTIFIER:
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //EnumerationGOImpl
