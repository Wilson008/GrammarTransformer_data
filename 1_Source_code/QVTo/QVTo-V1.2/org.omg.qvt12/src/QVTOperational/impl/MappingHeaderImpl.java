/**
 */
package QVTOperational.impl;

import QVTOperational.CompleteSignature;
import QVTOperational.DirectionKind;
import QVTOperational.GeneralQualifier;
import QVTOperational.MappingExtra;
import QVTOperational.MappingHeader;
import QVTOperational.QVTOperationalPackage;
import QVTOperational.ScopedIdentifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.MappingHeaderImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link QVTOperational.impl.MappingHeaderImpl#getParam_direction <em>Param direction</em>}</li>
 *   <li>{@link QVTOperational.impl.MappingHeaderImpl#getScoped_identifier <em>Scoped identifier</em>}</li>
 *   <li>{@link QVTOperational.impl.MappingHeaderImpl#getComplete_signature <em>Complete signature</em>}</li>
 *   <li>{@link QVTOperational.impl.MappingHeaderImpl#getMapping_extra <em>Mapping extra</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingHeaderImpl extends MinimalEObjectImpl.Container implements MappingHeader {
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
	 * The default value of the '{@link #getParam_direction() <em>Param direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_direction()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionKind PARAM_DIRECTION_EDEFAULT = DirectionKind.IN;

	/**
	 * The cached value of the '{@link #getParam_direction() <em>Param direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_direction()
	 * @generated
	 * @ordered
	 */
	protected DirectionKind param_direction = PARAM_DIRECTION_EDEFAULT;

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
	 * The cached value of the '{@link #getComplete_signature() <em>Complete signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplete_signature()
	 * @generated
	 * @ordered
	 */
	protected CompleteSignature complete_signature;

	/**
	 * The cached value of the '{@link #getMapping_extra() <em>Mapping extra</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping_extra()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingExtra> mapping_extra;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.MAPPING_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralQualifier> getQualifier() {
		if (qualifier == null) {
			qualifier = new EDataTypeUniqueEList<GeneralQualifier>(GeneralQualifier.class, this, QVTOperationalPackage.MAPPING_HEADER__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionKind getParam_direction() {
		return param_direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam_direction(DirectionKind newParam_direction) {
		DirectionKind oldParam_direction = param_direction;
		param_direction = newParam_direction == null ? PARAM_DIRECTION_EDEFAULT : newParam_direction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_HEADER__PARAM_DIRECTION, oldParam_direction, param_direction));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_HEADER__SCOPED_IDENTIFIER, oldScoped_identifier, newScoped_identifier);
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
				msgs = ((InternalEObject)scoped_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_HEADER__SCOPED_IDENTIFIER, null, msgs);
			if (newScoped_identifier != null)
				msgs = ((InternalEObject)newScoped_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_HEADER__SCOPED_IDENTIFIER, null, msgs);
			msgs = basicSetScoped_identifier(newScoped_identifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_HEADER__SCOPED_IDENTIFIER, newScoped_identifier, newScoped_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteSignature getComplete_signature() {
		return complete_signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplete_signature(CompleteSignature newComplete_signature, NotificationChain msgs) {
		CompleteSignature oldComplete_signature = complete_signature;
		complete_signature = newComplete_signature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_HEADER__COMPLETE_SIGNATURE, oldComplete_signature, newComplete_signature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplete_signature(CompleteSignature newComplete_signature) {
		if (newComplete_signature != complete_signature) {
			NotificationChain msgs = null;
			if (complete_signature != null)
				msgs = ((InternalEObject)complete_signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_HEADER__COMPLETE_SIGNATURE, null, msgs);
			if (newComplete_signature != null)
				msgs = ((InternalEObject)newComplete_signature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_HEADER__COMPLETE_SIGNATURE, null, msgs);
			msgs = basicSetComplete_signature(newComplete_signature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_HEADER__COMPLETE_SIGNATURE, newComplete_signature, newComplete_signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingExtra> getMapping_extra() {
		if (mapping_extra == null) {
			mapping_extra = new EObjectContainmentEList<MappingExtra>(MappingExtra.class, this, QVTOperationalPackage.MAPPING_HEADER__MAPPING_EXTRA);
		}
		return mapping_extra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.MAPPING_HEADER__SCOPED_IDENTIFIER:
				return basicSetScoped_identifier(null, msgs);
			case QVTOperationalPackage.MAPPING_HEADER__COMPLETE_SIGNATURE:
				return basicSetComplete_signature(null, msgs);
			case QVTOperationalPackage.MAPPING_HEADER__MAPPING_EXTRA:
				return ((InternalEList<?>)getMapping_extra()).basicRemove(otherEnd, msgs);
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
			case QVTOperationalPackage.MAPPING_HEADER__QUALIFIER:
				return getQualifier();
			case QVTOperationalPackage.MAPPING_HEADER__PARAM_DIRECTION:
				return getParam_direction();
			case QVTOperationalPackage.MAPPING_HEADER__SCOPED_IDENTIFIER:
				return getScoped_identifier();
			case QVTOperationalPackage.MAPPING_HEADER__COMPLETE_SIGNATURE:
				return getComplete_signature();
			case QVTOperationalPackage.MAPPING_HEADER__MAPPING_EXTRA:
				return getMapping_extra();
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
			case QVTOperationalPackage.MAPPING_HEADER__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends GeneralQualifier>)newValue);
				return;
			case QVTOperationalPackage.MAPPING_HEADER__PARAM_DIRECTION:
				setParam_direction((DirectionKind)newValue);
				return;
			case QVTOperationalPackage.MAPPING_HEADER__SCOPED_IDENTIFIER:
				setScoped_identifier((ScopedIdentifier)newValue);
				return;
			case QVTOperationalPackage.MAPPING_HEADER__COMPLETE_SIGNATURE:
				setComplete_signature((CompleteSignature)newValue);
				return;
			case QVTOperationalPackage.MAPPING_HEADER__MAPPING_EXTRA:
				getMapping_extra().clear();
				getMapping_extra().addAll((Collection<? extends MappingExtra>)newValue);
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
			case QVTOperationalPackage.MAPPING_HEADER__QUALIFIER:
				getQualifier().clear();
				return;
			case QVTOperationalPackage.MAPPING_HEADER__PARAM_DIRECTION:
				setParam_direction(PARAM_DIRECTION_EDEFAULT);
				return;
			case QVTOperationalPackage.MAPPING_HEADER__SCOPED_IDENTIFIER:
				setScoped_identifier((ScopedIdentifier)null);
				return;
			case QVTOperationalPackage.MAPPING_HEADER__COMPLETE_SIGNATURE:
				setComplete_signature((CompleteSignature)null);
				return;
			case QVTOperationalPackage.MAPPING_HEADER__MAPPING_EXTRA:
				getMapping_extra().clear();
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
			case QVTOperationalPackage.MAPPING_HEADER__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case QVTOperationalPackage.MAPPING_HEADER__PARAM_DIRECTION:
				return param_direction != PARAM_DIRECTION_EDEFAULT;
			case QVTOperationalPackage.MAPPING_HEADER__SCOPED_IDENTIFIER:
				return scoped_identifier != null;
			case QVTOperationalPackage.MAPPING_HEADER__COMPLETE_SIGNATURE:
				return complete_signature != null;
			case QVTOperationalPackage.MAPPING_HEADER__MAPPING_EXTRA:
				return mapping_extra != null && !mapping_extra.isEmpty();
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
		result.append(", param_direction: ");
		result.append(param_direction);
		result.append(')');
		return result.toString();
	}

} //MappingHeaderImpl
