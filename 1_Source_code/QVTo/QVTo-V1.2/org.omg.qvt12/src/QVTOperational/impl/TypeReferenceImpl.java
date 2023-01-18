/**
 */
package QVTOperational.impl;

import QVTOperational.ComplexType;
import QVTOperational.QVTOperationalPackage;
import QVTOperational.ScopedIdentifier;
import QVTOperational.TypeReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.TypeReferenceImpl#getScoped_identifier <em>Scoped identifier</em>}</li>
 *   <li>{@link QVTOperational.impl.TypeReferenceImpl#getComplex_type <em>Complex type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeReferenceImpl extends MinimalEObjectImpl.Container implements TypeReference {
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
	 * The cached value of the '{@link #getComplex_type() <em>Complex type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplex_type()
	 * @generated
	 * @ordered
	 */
	protected ComplexType complex_type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.TYPE_REFERENCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_REFERENCE__SCOPED_IDENTIFIER, oldScoped_identifier, newScoped_identifier);
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
				msgs = ((InternalEObject)scoped_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.TYPE_REFERENCE__SCOPED_IDENTIFIER, null, msgs);
			if (newScoped_identifier != null)
				msgs = ((InternalEObject)newScoped_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.TYPE_REFERENCE__SCOPED_IDENTIFIER, null, msgs);
			msgs = basicSetScoped_identifier(newScoped_identifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_REFERENCE__SCOPED_IDENTIFIER, newScoped_identifier, newScoped_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType getComplex_type() {
		return complex_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplex_type(ComplexType newComplex_type, NotificationChain msgs) {
		ComplexType oldComplex_type = complex_type;
		complex_type = newComplex_type;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_REFERENCE__COMPLEX_TYPE, oldComplex_type, newComplex_type);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplex_type(ComplexType newComplex_type) {
		if (newComplex_type != complex_type) {
			NotificationChain msgs = null;
			if (complex_type != null)
				msgs = ((InternalEObject)complex_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.TYPE_REFERENCE__COMPLEX_TYPE, null, msgs);
			if (newComplex_type != null)
				msgs = ((InternalEObject)newComplex_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.TYPE_REFERENCE__COMPLEX_TYPE, null, msgs);
			msgs = basicSetComplex_type(newComplex_type, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_REFERENCE__COMPLEX_TYPE, newComplex_type, newComplex_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.TYPE_REFERENCE__SCOPED_IDENTIFIER:
				return basicSetScoped_identifier(null, msgs);
			case QVTOperationalPackage.TYPE_REFERENCE__COMPLEX_TYPE:
				return basicSetComplex_type(null, msgs);
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
			case QVTOperationalPackage.TYPE_REFERENCE__SCOPED_IDENTIFIER:
				return getScoped_identifier();
			case QVTOperationalPackage.TYPE_REFERENCE__COMPLEX_TYPE:
				return getComplex_type();
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
			case QVTOperationalPackage.TYPE_REFERENCE__SCOPED_IDENTIFIER:
				setScoped_identifier((ScopedIdentifier)newValue);
				return;
			case QVTOperationalPackage.TYPE_REFERENCE__COMPLEX_TYPE:
				setComplex_type((ComplexType)newValue);
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
			case QVTOperationalPackage.TYPE_REFERENCE__SCOPED_IDENTIFIER:
				setScoped_identifier((ScopedIdentifier)null);
				return;
			case QVTOperationalPackage.TYPE_REFERENCE__COMPLEX_TYPE:
				setComplex_type((ComplexType)null);
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
			case QVTOperationalPackage.TYPE_REFERENCE__SCOPED_IDENTIFIER:
				return scoped_identifier != null;
			case QVTOperationalPackage.TYPE_REFERENCE__COMPLEX_TYPE:
				return complex_type != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeReferenceImpl
