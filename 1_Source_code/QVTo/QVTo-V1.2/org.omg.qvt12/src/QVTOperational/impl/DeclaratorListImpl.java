/**
 */
package QVTOperational.impl;

import QVTOperational.Declarator;
import QVTOperational.DeclaratorList;
import QVTOperational.QVTOperationalPackage;

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
 * An implementation of the model object '<em><b>Declarator List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.DeclaratorListImpl#getDeclarator <em>Declarator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclaratorListImpl extends MinimalEObjectImpl.Container implements DeclaratorList {
	/**
	 * The cached value of the '{@link #getDeclarator() <em>Declarator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarator()
	 * @generated
	 * @ordered
	 */
	protected EList<Declarator> declarator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaratorListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.DECLARATOR_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declarator> getDeclarator() {
		if (declarator == null) {
			declarator = new EObjectContainmentEList<Declarator>(Declarator.class, this, QVTOperationalPackage.DECLARATOR_LIST__DECLARATOR);
		}
		return declarator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.DECLARATOR_LIST__DECLARATOR:
				return ((InternalEList<?>)getDeclarator()).basicRemove(otherEnd, msgs);
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
			case QVTOperationalPackage.DECLARATOR_LIST__DECLARATOR:
				return getDeclarator();
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
			case QVTOperationalPackage.DECLARATOR_LIST__DECLARATOR:
				getDeclarator().clear();
				getDeclarator().addAll((Collection<? extends Declarator>)newValue);
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
			case QVTOperationalPackage.DECLARATOR_LIST__DECLARATOR:
				getDeclarator().clear();
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
			case QVTOperationalPackage.DECLARATOR_LIST__DECLARATOR:
				return declarator != null && !declarator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeclaratorListImpl
