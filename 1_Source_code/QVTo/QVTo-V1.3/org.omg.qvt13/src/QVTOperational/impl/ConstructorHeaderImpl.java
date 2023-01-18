/**
 */
package QVTOperational.impl;

import QVTOperational.ConstructorHeader;
import QVTOperational.GeneralQualifier;
import QVTOperational.QVTOperationalPackage;
import QVTOperational.ScopedIdentifier;
import QVTOperational.SimpleSignature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.ConstructorHeaderImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link QVTOperational.impl.ConstructorHeaderImpl#getScoped_identifier <em>Scoped identifier</em>}</li>
 *   <li>{@link QVTOperational.impl.ConstructorHeaderImpl#getSimple_signature <em>Simple signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorHeaderImpl extends MinimalEObjectImpl.Container implements ConstructorHeader {
	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralQualifier> qualifier;

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
	 * The cached value of the '{@link #getSimple_signature() <em>Simple signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimple_signature()
	 * @generated
	 * @ordered
	 */
	protected SimpleSignature simple_signature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.CONSTRUCTOR_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralQualifier> getQualifier() {
		if (qualifier == null) {
			qualifier = new EDataTypeUniqueEList<GeneralQualifier>(GeneralQualifier.class, this, QVTOperationalPackage.CONSTRUCTOR_HEADER__QUALIFIER);
		}
		return qualifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CONSTRUCTOR_HEADER__SCOPED_IDENTIFIER, oldScoped_identifier, newScoped_identifier);
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
				msgs = ((InternalEObject)scoped_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CONSTRUCTOR_HEADER__SCOPED_IDENTIFIER, null, msgs);
			if (newScoped_identifier != null)
				msgs = ((InternalEObject)newScoped_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CONSTRUCTOR_HEADER__SCOPED_IDENTIFIER, null, msgs);
			msgs = basicSetScoped_identifier(newScoped_identifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CONSTRUCTOR_HEADER__SCOPED_IDENTIFIER, newScoped_identifier, newScoped_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSignature getSimple_signature() {
		return simple_signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimple_signature(SimpleSignature newSimple_signature, NotificationChain msgs) {
		SimpleSignature oldSimple_signature = simple_signature;
		simple_signature = newSimple_signature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CONSTRUCTOR_HEADER__SIMPLE_SIGNATURE, oldSimple_signature, newSimple_signature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimple_signature(SimpleSignature newSimple_signature) {
		if (newSimple_signature != simple_signature) {
			NotificationChain msgs = null;
			if (simple_signature != null)
				msgs = ((InternalEObject)simple_signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CONSTRUCTOR_HEADER__SIMPLE_SIGNATURE, null, msgs);
			if (newSimple_signature != null)
				msgs = ((InternalEObject)newSimple_signature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CONSTRUCTOR_HEADER__SIMPLE_SIGNATURE, null, msgs);
			msgs = basicSetSimple_signature(newSimple_signature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CONSTRUCTOR_HEADER__SIMPLE_SIGNATURE, newSimple_signature, newSimple_signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.CONSTRUCTOR_HEADER__SCOPED_IDENTIFIER:
				return basicSetScoped_identifier(null, msgs);
			case QVTOperationalPackage.CONSTRUCTOR_HEADER__SIMPLE_SIGNATURE:
				return basicSetSimple_signature(null, msgs);
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
			case QVTOperationalPackage.CONSTRUCTOR_HEADER__QUALIFIER:
				return getQualifier();
			case QVTOperationalPackage.CONSTRUCTOR_HEADER__SCOPED_IDENTIFIER:
				return getScoped_identifier();
			case QVTOperationalPackage.CONSTRUCTOR_HEADER__SIMPLE_SIGNATURE:
				return getSimple_signature();
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
			case QVTOperationalPackage.CONSTRUCTOR_HEADER__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends GeneralQualifier>)newValue);
				return;
			case QVTOperationalPackage.CONSTRUCTOR_HEADER__SCOPED_IDENTIFIER:
				setScoped_identifier((ScopedIdentifier)newValue);
				return;
			case QVTOperationalPackage.CONSTRUCTOR_HEADER__SIMPLE_SIGNATURE:
				setSimple_signature((SimpleSignature)newValue);
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
			case QVTOperationalPackage.CONSTRUCTOR_HEADER__QUALIFIER:
				getQualifier().clear();
				return;
			case QVTOperationalPackage.CONSTRUCTOR_HEADER__SCOPED_IDENTIFIER:
				setScoped_identifier((ScopedIdentifier)null);
				return;
			case QVTOperationalPackage.CONSTRUCTOR_HEADER__SIMPLE_SIGNATURE:
				setSimple_signature((SimpleSignature)null);
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
			case QVTOperationalPackage.CONSTRUCTOR_HEADER__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case QVTOperationalPackage.CONSTRUCTOR_HEADER__SCOPED_IDENTIFIER:
				return scoped_identifier != null;
			case QVTOperationalPackage.CONSTRUCTOR_HEADER__SIMPLE_SIGNATURE:
				return simple_signature != null;
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
		result.append(" (qualifier: ");
		result.append(qualifier);
		result.append(')');
		return result.toString();
	}

} //ConstructorHeaderImpl
