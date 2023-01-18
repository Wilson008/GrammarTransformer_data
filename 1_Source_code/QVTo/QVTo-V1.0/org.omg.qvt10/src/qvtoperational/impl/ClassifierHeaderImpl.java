/**
 */
package qvtoperational.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qvtoperational.ClassifierExtension;
import qvtoperational.ClassifierHeader;
import qvtoperational.ClassifierInfo;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.ScopedIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.ClassifierHeaderImpl#getClassifier_info <em>Classifier info</em>}</li>
 *   <li>{@link qvtoperational.impl.ClassifierHeaderImpl#getScoped_identifier <em>Scoped identifier</em>}</li>
 *   <li>{@link qvtoperational.impl.ClassifierHeaderImpl#getClassifier_extension <em>Classifier extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierHeaderImpl extends MinimalEObjectImpl.Container implements ClassifierHeader {
	/**
	 * The cached value of the '{@link #getClassifier_info() <em>Classifier info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier_info()
	 * @generated
	 * @ordered
	 */
	protected ClassifierInfo classifier_info;

	/**
	 * The cached value of the '{@link #getScoped_identifier() <em>Scoped identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoped_identifier()
	 * @generated
	 * @ordered
	 */
	protected ScopedIdentifier scoped_identifier;

	/**
	 * The cached value of the '{@link #getClassifier_extension() <em>Classifier extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier_extension()
	 * @generated
	 * @ordered
	 */
	protected ClassifierExtension classifier_extension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.CLASSIFIER_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierInfo getClassifier_info() {
		return classifier_info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifier_info(ClassifierInfo newClassifier_info, NotificationChain msgs) {
		ClassifierInfo oldClassifier_info = classifier_info;
		classifier_info = newClassifier_info;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_INFO, oldClassifier_info, newClassifier_info);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier_info(ClassifierInfo newClassifier_info) {
		if (newClassifier_info != classifier_info) {
			NotificationChain msgs = null;
			if (classifier_info != null)
				msgs = ((InternalEObject)classifier_info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_INFO, null, msgs);
			if (newClassifier_info != null)
				msgs = ((InternalEObject)newClassifier_info).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_INFO, null, msgs);
			msgs = basicSetClassifier_info(newClassifier_info, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_INFO, newClassifier_info, newClassifier_info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopedIdentifier getScoped_identifier() {
		return scoped_identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScoped_identifier(ScopedIdentifier newScoped_identifier, NotificationChain msgs) {
		ScopedIdentifier oldScoped_identifier = scoped_identifier;
		scoped_identifier = newScoped_identifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.CLASSIFIER_HEADER__SCOPED_IDENTIFIER, oldScoped_identifier, newScoped_identifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScoped_identifier(ScopedIdentifier newScoped_identifier) {
		if (newScoped_identifier != scoped_identifier) {
			NotificationChain msgs = null;
			if (scoped_identifier != null)
				msgs = ((InternalEObject)scoped_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.CLASSIFIER_HEADER__SCOPED_IDENTIFIER, null, msgs);
			if (newScoped_identifier != null)
				msgs = ((InternalEObject)newScoped_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.CLASSIFIER_HEADER__SCOPED_IDENTIFIER, null, msgs);
			msgs = basicSetScoped_identifier(newScoped_identifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.CLASSIFIER_HEADER__SCOPED_IDENTIFIER, newScoped_identifier, newScoped_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierExtension getClassifier_extension() {
		return classifier_extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifier_extension(ClassifierExtension newClassifier_extension, NotificationChain msgs) {
		ClassifierExtension oldClassifier_extension = classifier_extension;
		classifier_extension = newClassifier_extension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_EXTENSION, oldClassifier_extension, newClassifier_extension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier_extension(ClassifierExtension newClassifier_extension) {
		if (newClassifier_extension != classifier_extension) {
			NotificationChain msgs = null;
			if (classifier_extension != null)
				msgs = ((InternalEObject)classifier_extension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_EXTENSION, null, msgs);
			if (newClassifier_extension != null)
				msgs = ((InternalEObject)newClassifier_extension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_EXTENSION, null, msgs);
			msgs = basicSetClassifier_extension(newClassifier_extension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_EXTENSION, newClassifier_extension, newClassifier_extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_INFO:
				return basicSetClassifier_info(null, msgs);
			case QvtoperationalPackage.CLASSIFIER_HEADER__SCOPED_IDENTIFIER:
				return basicSetScoped_identifier(null, msgs);
			case QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_EXTENSION:
				return basicSetClassifier_extension(null, msgs);
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
			case QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_INFO:
				return getClassifier_info();
			case QvtoperationalPackage.CLASSIFIER_HEADER__SCOPED_IDENTIFIER:
				return getScoped_identifier();
			case QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_EXTENSION:
				return getClassifier_extension();
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
			case QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_INFO:
				setClassifier_info((ClassifierInfo)newValue);
				return;
			case QvtoperationalPackage.CLASSIFIER_HEADER__SCOPED_IDENTIFIER:
				setScoped_identifier((ScopedIdentifier)newValue);
				return;
			case QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_EXTENSION:
				setClassifier_extension((ClassifierExtension)newValue);
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
			case QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_INFO:
				setClassifier_info((ClassifierInfo)null);
				return;
			case QvtoperationalPackage.CLASSIFIER_HEADER__SCOPED_IDENTIFIER:
				setScoped_identifier((ScopedIdentifier)null);
				return;
			case QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_EXTENSION:
				setClassifier_extension((ClassifierExtension)null);
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
			case QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_INFO:
				return classifier_info != null;
			case QvtoperationalPackage.CLASSIFIER_HEADER__SCOPED_IDENTIFIER:
				return scoped_identifier != null;
			case QvtoperationalPackage.CLASSIFIER_HEADER__CLASSIFIER_EXTENSION:
				return classifier_extension != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassifierHeaderImpl
