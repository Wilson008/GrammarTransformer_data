/**
 */
package qvtoperational.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qvtoperational.ClassifierGO;
import qvtoperational.EnumerationGO;
import qvtoperational.MetaModelElement;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.TagGO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.MetaModelElementImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link qvtoperational.impl.MetaModelElementImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link qvtoperational.impl.MetaModelElementImpl#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaModelElementImpl extends MinimalEObjectImpl.Container implements MetaModelElement {
	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected ClassifierGO classifier;

	/**
	 * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeration()
	 * @generated
	 * @ordered
	 */
	protected EnumerationGO enumeration;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected TagGO tag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.META_MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierGO getClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifier(ClassifierGO newClassifier, NotificationChain msgs) {
		ClassifierGO oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.META_MODEL_ELEMENT__CLASSIFIER, oldClassifier, newClassifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(ClassifierGO newClassifier) {
		if (newClassifier != classifier) {
			NotificationChain msgs = null;
			if (classifier != null)
				msgs = ((InternalEObject)classifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.META_MODEL_ELEMENT__CLASSIFIER, null, msgs);
			if (newClassifier != null)
				msgs = ((InternalEObject)newClassifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.META_MODEL_ELEMENT__CLASSIFIER, null, msgs);
			msgs = basicSetClassifier(newClassifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.META_MODEL_ELEMENT__CLASSIFIER, newClassifier, newClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationGO getEnumeration() {
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumeration(EnumerationGO newEnumeration, NotificationChain msgs) {
		EnumerationGO oldEnumeration = enumeration;
		enumeration = newEnumeration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.META_MODEL_ELEMENT__ENUMERATION, oldEnumeration, newEnumeration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeration(EnumerationGO newEnumeration) {
		if (newEnumeration != enumeration) {
			NotificationChain msgs = null;
			if (enumeration != null)
				msgs = ((InternalEObject)enumeration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.META_MODEL_ELEMENT__ENUMERATION, null, msgs);
			if (newEnumeration != null)
				msgs = ((InternalEObject)newEnumeration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.META_MODEL_ELEMENT__ENUMERATION, null, msgs);
			msgs = basicSetEnumeration(newEnumeration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.META_MODEL_ELEMENT__ENUMERATION, newEnumeration, newEnumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagGO getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTag(TagGO newTag, NotificationChain msgs) {
		TagGO oldTag = tag;
		tag = newTag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.META_MODEL_ELEMENT__TAG, oldTag, newTag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(TagGO newTag) {
		if (newTag != tag) {
			NotificationChain msgs = null;
			if (tag != null)
				msgs = ((InternalEObject)tag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.META_MODEL_ELEMENT__TAG, null, msgs);
			if (newTag != null)
				msgs = ((InternalEObject)newTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.META_MODEL_ELEMENT__TAG, null, msgs);
			msgs = basicSetTag(newTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.META_MODEL_ELEMENT__TAG, newTag, newTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.META_MODEL_ELEMENT__CLASSIFIER:
				return basicSetClassifier(null, msgs);
			case QvtoperationalPackage.META_MODEL_ELEMENT__ENUMERATION:
				return basicSetEnumeration(null, msgs);
			case QvtoperationalPackage.META_MODEL_ELEMENT__TAG:
				return basicSetTag(null, msgs);
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
			case QvtoperationalPackage.META_MODEL_ELEMENT__CLASSIFIER:
				return getClassifier();
			case QvtoperationalPackage.META_MODEL_ELEMENT__ENUMERATION:
				return getEnumeration();
			case QvtoperationalPackage.META_MODEL_ELEMENT__TAG:
				return getTag();
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
			case QvtoperationalPackage.META_MODEL_ELEMENT__CLASSIFIER:
				setClassifier((ClassifierGO)newValue);
				return;
			case QvtoperationalPackage.META_MODEL_ELEMENT__ENUMERATION:
				setEnumeration((EnumerationGO)newValue);
				return;
			case QvtoperationalPackage.META_MODEL_ELEMENT__TAG:
				setTag((TagGO)newValue);
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
			case QvtoperationalPackage.META_MODEL_ELEMENT__CLASSIFIER:
				setClassifier((ClassifierGO)null);
				return;
			case QvtoperationalPackage.META_MODEL_ELEMENT__ENUMERATION:
				setEnumeration((EnumerationGO)null);
				return;
			case QvtoperationalPackage.META_MODEL_ELEMENT__TAG:
				setTag((TagGO)null);
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
			case QvtoperationalPackage.META_MODEL_ELEMENT__CLASSIFIER:
				return classifier != null;
			case QvtoperationalPackage.META_MODEL_ELEMENT__ENUMERATION:
				return enumeration != null;
			case QvtoperationalPackage.META_MODEL_ELEMENT__TAG:
				return tag != null;
		}
		return super.eIsSet(featureID);
	}

} //MetaModelElementImpl
