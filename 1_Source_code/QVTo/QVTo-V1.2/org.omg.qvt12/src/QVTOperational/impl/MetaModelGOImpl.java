/**
 */
package QVTOperational.impl;

import QVTOperational.MetaModelElement;
import QVTOperational.MetaModelGO;
import QVTOperational.MetaModelHeader;
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
 * An implementation of the model object '<em><b>Meta Model GO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.MetaModelGOImpl#getMetamodel_h <em>Metamodel h</em>}</li>
 *   <li>{@link QVTOperational.impl.MetaModelGOImpl#getMetamodel_element <em>Metamodel element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaModelGOImpl extends ModuleImpl implements MetaModelGO {
	/**
	 * The cached value of the '{@link #getMetamodel_h() <em>Metamodel h</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel_h()
	 * @generated
	 * @ordered
	 */
	protected MetaModelHeader metamodel_h;

	/**
	 * The cached value of the '{@link #getMetamodel_element() <em>Metamodel element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel_element()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaModelElement> metamodel_element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaModelGOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.META_MODEL_GO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelHeader getMetamodel_h() {
		return metamodel_h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetamodel_h(MetaModelHeader newMetamodel_h, NotificationChain msgs) {
		MetaModelHeader oldMetamodel_h = metamodel_h;
		metamodel_h = newMetamodel_h;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.META_MODEL_GO__METAMODEL_H, oldMetamodel_h, newMetamodel_h);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel_h(MetaModelHeader newMetamodel_h) {
		if (newMetamodel_h != metamodel_h) {
			NotificationChain msgs = null;
			if (metamodel_h != null)
				msgs = ((InternalEObject)metamodel_h).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.META_MODEL_GO__METAMODEL_H, null, msgs);
			if (newMetamodel_h != null)
				msgs = ((InternalEObject)newMetamodel_h).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.META_MODEL_GO__METAMODEL_H, null, msgs);
			msgs = basicSetMetamodel_h(newMetamodel_h, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.META_MODEL_GO__METAMODEL_H, newMetamodel_h, newMetamodel_h));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaModelElement> getMetamodel_element() {
		if (metamodel_element == null) {
			metamodel_element = new EObjectContainmentEList<MetaModelElement>(MetaModelElement.class, this, QVTOperationalPackage.META_MODEL_GO__METAMODEL_ELEMENT);
		}
		return metamodel_element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.META_MODEL_GO__METAMODEL_H:
				return basicSetMetamodel_h(null, msgs);
			case QVTOperationalPackage.META_MODEL_GO__METAMODEL_ELEMENT:
				return ((InternalEList<?>)getMetamodel_element()).basicRemove(otherEnd, msgs);
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
			case QVTOperationalPackage.META_MODEL_GO__METAMODEL_H:
				return getMetamodel_h();
			case QVTOperationalPackage.META_MODEL_GO__METAMODEL_ELEMENT:
				return getMetamodel_element();
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
			case QVTOperationalPackage.META_MODEL_GO__METAMODEL_H:
				setMetamodel_h((MetaModelHeader)newValue);
				return;
			case QVTOperationalPackage.META_MODEL_GO__METAMODEL_ELEMENT:
				getMetamodel_element().clear();
				getMetamodel_element().addAll((Collection<? extends MetaModelElement>)newValue);
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
			case QVTOperationalPackage.META_MODEL_GO__METAMODEL_H:
				setMetamodel_h((MetaModelHeader)null);
				return;
			case QVTOperationalPackage.META_MODEL_GO__METAMODEL_ELEMENT:
				getMetamodel_element().clear();
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
			case QVTOperationalPackage.META_MODEL_GO__METAMODEL_H:
				return metamodel_h != null;
			case QVTOperationalPackage.META_MODEL_GO__METAMODEL_ELEMENT:
				return metamodel_element != null && !metamodel_element.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetaModelGOImpl
