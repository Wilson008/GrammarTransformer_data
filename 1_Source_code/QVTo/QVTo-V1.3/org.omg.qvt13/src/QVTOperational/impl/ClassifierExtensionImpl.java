/**
 */
package QVTOperational.impl;

import QVTOperational.ClassifierExtension;
import QVTOperational.QVTOperationalPackage;
import QVTOperational.ScopedIdentifierList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.ClassifierExtensionImpl#getScoped_identifier_list <em>Scoped identifier list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierExtensionImpl extends MinimalEObjectImpl.Container implements ClassifierExtension {
	/**
	 * The cached value of the '{@link #getScoped_identifier_list() <em>Scoped identifier list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoped_identifier_list()
	 * @generated
	 * @ordered
	 */
	protected ScopedIdentifierList scoped_identifier_list;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.CLASSIFIER_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopedIdentifierList getScoped_identifier_list() {
		return scoped_identifier_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScoped_identifier_list(ScopedIdentifierList newScoped_identifier_list, NotificationChain msgs) {
		ScopedIdentifierList oldScoped_identifier_list = scoped_identifier_list;
		scoped_identifier_list = newScoped_identifier_list;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CLASSIFIER_EXTENSION__SCOPED_IDENTIFIER_LIST, oldScoped_identifier_list, newScoped_identifier_list);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScoped_identifier_list(ScopedIdentifierList newScoped_identifier_list) {
		if (newScoped_identifier_list != scoped_identifier_list) {
			NotificationChain msgs = null;
			if (scoped_identifier_list != null)
				msgs = ((InternalEObject)scoped_identifier_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CLASSIFIER_EXTENSION__SCOPED_IDENTIFIER_LIST, null, msgs);
			if (newScoped_identifier_list != null)
				msgs = ((InternalEObject)newScoped_identifier_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CLASSIFIER_EXTENSION__SCOPED_IDENTIFIER_LIST, null, msgs);
			msgs = basicSetScoped_identifier_list(newScoped_identifier_list, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CLASSIFIER_EXTENSION__SCOPED_IDENTIFIER_LIST, newScoped_identifier_list, newScoped_identifier_list));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.CLASSIFIER_EXTENSION__SCOPED_IDENTIFIER_LIST:
				return basicSetScoped_identifier_list(null, msgs);
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
			case QVTOperationalPackage.CLASSIFIER_EXTENSION__SCOPED_IDENTIFIER_LIST:
				return getScoped_identifier_list();
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
			case QVTOperationalPackage.CLASSIFIER_EXTENSION__SCOPED_IDENTIFIER_LIST:
				setScoped_identifier_list((ScopedIdentifierList)newValue);
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
			case QVTOperationalPackage.CLASSIFIER_EXTENSION__SCOPED_IDENTIFIER_LIST:
				setScoped_identifier_list((ScopedIdentifierList)null);
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
			case QVTOperationalPackage.CLASSIFIER_EXTENSION__SCOPED_IDENTIFIER_LIST:
				return scoped_identifier_list != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassifierExtensionImpl
