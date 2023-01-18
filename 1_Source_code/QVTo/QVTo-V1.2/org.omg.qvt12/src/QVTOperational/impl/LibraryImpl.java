/**
 */
package QVTOperational.impl;

import QVTOperational.ImperativeOperation;
import QVTOperational.Library;
import QVTOperational.LibraryHeader;
import QVTOperational.QVTOperationalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.LibraryImpl#getLibrary_h <em>Library h</em>}</li>
 *   <li>{@link QVTOperational.impl.LibraryImpl#getModule_element <em>Module element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends ModuleImpl implements Library {
	/**
	 * The cached value of the '{@link #getLibrary_h() <em>Library h</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary_h()
	 * @generated
	 * @ordered
	 */
	protected LibraryHeader library_h;

	/**
	 * The cached value of the '{@link #getModule_element() <em>Module element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule_element()
	 * @generated
	 * @ordered
	 */
	protected EList<ImperativeOperation> module_element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryHeader getLibrary_h() {
		return library_h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary_h(LibraryHeader newLibrary_h, NotificationChain msgs) {
		LibraryHeader oldLibrary_h = library_h;
		library_h = newLibrary_h;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.LIBRARY__LIBRARY_H, oldLibrary_h, newLibrary_h);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary_h(LibraryHeader newLibrary_h) {
		if (newLibrary_h != library_h) {
			NotificationChain msgs = null;
			if (library_h != null)
				msgs = ((InternalEObject)library_h).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.LIBRARY__LIBRARY_H, null, msgs);
			if (newLibrary_h != null)
				msgs = ((InternalEObject)newLibrary_h).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.LIBRARY__LIBRARY_H, null, msgs);
			msgs = basicSetLibrary_h(newLibrary_h, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.LIBRARY__LIBRARY_H, newLibrary_h, newLibrary_h));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImperativeOperation> getModule_element() {
		if (module_element == null) {
			module_element = new EObjectContainmentEList<ImperativeOperation>(ImperativeOperation.class, this, QVTOperationalPackage.LIBRARY__MODULE_ELEMENT);
		}
		return module_element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.LIBRARY__LIBRARY_H:
				return basicSetLibrary_h(null, msgs);
			case QVTOperationalPackage.LIBRARY__MODULE_ELEMENT:
				return ((InternalEList<?>)getModule_element()).basicRemove(otherEnd, msgs);
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
			case QVTOperationalPackage.LIBRARY__LIBRARY_H:
				return getLibrary_h();
			case QVTOperationalPackage.LIBRARY__MODULE_ELEMENT:
				return getModule_element();
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
			case QVTOperationalPackage.LIBRARY__LIBRARY_H:
				setLibrary_h((LibraryHeader)newValue);
				return;
			case QVTOperationalPackage.LIBRARY__MODULE_ELEMENT:
				getModule_element().clear();
				getModule_element().addAll((Collection<? extends ImperativeOperation>)newValue);
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
			case QVTOperationalPackage.LIBRARY__LIBRARY_H:
				setLibrary_h((LibraryHeader)null);
				return;
			case QVTOperationalPackage.LIBRARY__MODULE_ELEMENT:
				getModule_element().clear();
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
			case QVTOperationalPackage.LIBRARY__LIBRARY_H:
				return library_h != null;
			case QVTOperationalPackage.LIBRARY__MODULE_ELEMENT:
				return module_element != null && !module_element.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LibraryImpl
