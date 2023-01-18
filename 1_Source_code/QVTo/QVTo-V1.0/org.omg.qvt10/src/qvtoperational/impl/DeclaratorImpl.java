/**
 */
package qvtoperational.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qvtoperational.Declarator;
import qvtoperational.InitPart;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.ScopedIdentifier;
import qvtoperational.TypeSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.DeclaratorImpl#getTypespec <em>Typespec</em>}</li>
 *   <li>{@link qvtoperational.impl.DeclaratorImpl#getInit_part <em>Init part</em>}</li>
 *   <li>{@link qvtoperational.impl.DeclaratorImpl#getScoped_identifier <em>Scoped identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclaratorImpl extends MinimalEObjectImpl.Container implements Declarator {
	/**
	 * The cached value of the '{@link #getTypespec() <em>Typespec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypespec()
	 * @generated
	 * @ordered
	 */
	protected TypeSpec typespec;

	/**
	 * The cached value of the '{@link #getInit_part() <em>Init part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit_part()
	 * @generated
	 * @ordered
	 */
	protected InitPart init_part;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.DECLARATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSpec getTypespec() {
		return typespec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypespec(TypeSpec newTypespec, NotificationChain msgs) {
		TypeSpec oldTypespec = typespec;
		typespec = newTypespec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.DECLARATOR__TYPESPEC, oldTypespec, newTypespec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypespec(TypeSpec newTypespec) {
		if (newTypespec != typespec) {
			NotificationChain msgs = null;
			if (typespec != null)
				msgs = ((InternalEObject)typespec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.DECLARATOR__TYPESPEC, null, msgs);
			if (newTypespec != null)
				msgs = ((InternalEObject)newTypespec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.DECLARATOR__TYPESPEC, null, msgs);
			msgs = basicSetTypespec(newTypespec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.DECLARATOR__TYPESPEC, newTypespec, newTypespec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitPart getInit_part() {
		return init_part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInit_part(InitPart newInit_part, NotificationChain msgs) {
		InitPart oldInit_part = init_part;
		init_part = newInit_part;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.DECLARATOR__INIT_PART, oldInit_part, newInit_part);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit_part(InitPart newInit_part) {
		if (newInit_part != init_part) {
			NotificationChain msgs = null;
			if (init_part != null)
				msgs = ((InternalEObject)init_part).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.DECLARATOR__INIT_PART, null, msgs);
			if (newInit_part != null)
				msgs = ((InternalEObject)newInit_part).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.DECLARATOR__INIT_PART, null, msgs);
			msgs = basicSetInit_part(newInit_part, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.DECLARATOR__INIT_PART, newInit_part, newInit_part));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.DECLARATOR__SCOPED_IDENTIFIER, oldScoped_identifier, newScoped_identifier);
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
				msgs = ((InternalEObject)scoped_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.DECLARATOR__SCOPED_IDENTIFIER, null, msgs);
			if (newScoped_identifier != null)
				msgs = ((InternalEObject)newScoped_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.DECLARATOR__SCOPED_IDENTIFIER, null, msgs);
			msgs = basicSetScoped_identifier(newScoped_identifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.DECLARATOR__SCOPED_IDENTIFIER, newScoped_identifier, newScoped_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.DECLARATOR__TYPESPEC:
				return basicSetTypespec(null, msgs);
			case QvtoperationalPackage.DECLARATOR__INIT_PART:
				return basicSetInit_part(null, msgs);
			case QvtoperationalPackage.DECLARATOR__SCOPED_IDENTIFIER:
				return basicSetScoped_identifier(null, msgs);
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
			case QvtoperationalPackage.DECLARATOR__TYPESPEC:
				return getTypespec();
			case QvtoperationalPackage.DECLARATOR__INIT_PART:
				return getInit_part();
			case QvtoperationalPackage.DECLARATOR__SCOPED_IDENTIFIER:
				return getScoped_identifier();
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
			case QvtoperationalPackage.DECLARATOR__TYPESPEC:
				setTypespec((TypeSpec)newValue);
				return;
			case QvtoperationalPackage.DECLARATOR__INIT_PART:
				setInit_part((InitPart)newValue);
				return;
			case QvtoperationalPackage.DECLARATOR__SCOPED_IDENTIFIER:
				setScoped_identifier((ScopedIdentifier)newValue);
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
			case QvtoperationalPackage.DECLARATOR__TYPESPEC:
				setTypespec((TypeSpec)null);
				return;
			case QvtoperationalPackage.DECLARATOR__INIT_PART:
				setInit_part((InitPart)null);
				return;
			case QvtoperationalPackage.DECLARATOR__SCOPED_IDENTIFIER:
				setScoped_identifier((ScopedIdentifier)null);
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
			case QvtoperationalPackage.DECLARATOR__TYPESPEC:
				return typespec != null;
			case QvtoperationalPackage.DECLARATOR__INIT_PART:
				return init_part != null;
			case QvtoperationalPackage.DECLARATOR__SCOPED_IDENTIFIER:
				return scoped_identifier != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclaratorImpl
