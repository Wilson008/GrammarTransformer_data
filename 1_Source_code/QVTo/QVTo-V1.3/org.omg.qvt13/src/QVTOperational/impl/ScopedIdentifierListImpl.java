/**
 */
package QVTOperational.impl;

import QVTOperational.QVTOperationalPackage;
import QVTOperational.ScopedIdentifier;
import QVTOperational.ScopedIdentifierList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scoped Identifier List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.ScopedIdentifierListImpl#getScoped_identifier_list <em>Scoped identifier list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopedIdentifierListImpl extends MinimalEObjectImpl.Container implements ScopedIdentifierList {
	/**
	 * The cached value of the '{@link #getScoped_identifier_list() <em>Scoped identifier list</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoped_identifier_list()
	 * @generated
	 * @ordered
	 */
	protected EList<ScopedIdentifier> scoped_identifier_list;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopedIdentifierListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.SCOPED_IDENTIFIER_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScopedIdentifier> getScoped_identifier_list() {
		if (scoped_identifier_list == null) {
			scoped_identifier_list = new EObjectContainmentEList<ScopedIdentifier>(ScopedIdentifier.class, this, QVTOperationalPackage.SCOPED_IDENTIFIER_LIST__SCOPED_IDENTIFIER_LIST);
		}
		return scoped_identifier_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.SCOPED_IDENTIFIER_LIST__SCOPED_IDENTIFIER_LIST:
				return ((InternalEList<?>)getScoped_identifier_list()).basicRemove(otherEnd, msgs);
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
			case QVTOperationalPackage.SCOPED_IDENTIFIER_LIST__SCOPED_IDENTIFIER_LIST:
				return getScoped_identifier_list();
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
			case QVTOperationalPackage.SCOPED_IDENTIFIER_LIST__SCOPED_IDENTIFIER_LIST:
				getScoped_identifier_list().clear();
				getScoped_identifier_list().addAll((Collection<? extends ScopedIdentifier>)newValue);
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
			case QVTOperationalPackage.SCOPED_IDENTIFIER_LIST__SCOPED_IDENTIFIER_LIST:
				getScoped_identifier_list().clear();
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
			case QVTOperationalPackage.SCOPED_IDENTIFIER_LIST__SCOPED_IDENTIFIER_LIST:
				return scoped_identifier_list != null && !scoped_identifier_list.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScopedIdentifierListImpl
