/**
 */
package QVTOperational.impl;

import QVTOperational.GeneralQualifier;
import QVTOperational.QVTOperationalPackage;
import QVTOperational.SimpleSignature;
import QVTOperational.TransformationHeader;
import QVTOperational.TransformationUsageRefine;

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
 * An implementation of the model object '<em><b>Transformation Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.TransformationHeaderImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link QVTOperational.impl.TransformationHeaderImpl#getName <em>Name</em>}</li>
 *   <li>{@link QVTOperational.impl.TransformationHeaderImpl#getTransformation_signature <em>Transformation signature</em>}</li>
 *   <li>{@link QVTOperational.impl.TransformationHeaderImpl#getTransformation_usage_refine <em>Transformation usage refine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationHeaderImpl extends MinimalEObjectImpl.Container implements TransformationHeader {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformation_signature() <em>Transformation signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation_signature()
	 * @generated
	 * @ordered
	 */
	protected SimpleSignature transformation_signature;

	/**
	 * The cached value of the '{@link #getTransformation_usage_refine() <em>Transformation usage refine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation_usage_refine()
	 * @generated
	 * @ordered
	 */
	protected TransformationUsageRefine transformation_usage_refine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.TRANSFORMATION_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralQualifier> getQualifier() {
		if (qualifier == null) {
			qualifier = new EDataTypeUniqueEList<GeneralQualifier>(GeneralQualifier.class, this, QVTOperationalPackage.TRANSFORMATION_HEADER__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TRANSFORMATION_HEADER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSignature getTransformation_signature() {
		return transformation_signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation_signature(SimpleSignature newTransformation_signature, NotificationChain msgs) {
		SimpleSignature oldTransformation_signature = transformation_signature;
		transformation_signature = newTransformation_signature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_SIGNATURE, oldTransformation_signature, newTransformation_signature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation_signature(SimpleSignature newTransformation_signature) {
		if (newTransformation_signature != transformation_signature) {
			NotificationChain msgs = null;
			if (transformation_signature != null)
				msgs = ((InternalEObject)transformation_signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_SIGNATURE, null, msgs);
			if (newTransformation_signature != null)
				msgs = ((InternalEObject)newTransformation_signature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_SIGNATURE, null, msgs);
			msgs = basicSetTransformation_signature(newTransformation_signature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_SIGNATURE, newTransformation_signature, newTransformation_signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationUsageRefine getTransformation_usage_refine() {
		return transformation_usage_refine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation_usage_refine(TransformationUsageRefine newTransformation_usage_refine, NotificationChain msgs) {
		TransformationUsageRefine oldTransformation_usage_refine = transformation_usage_refine;
		transformation_usage_refine = newTransformation_usage_refine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_USAGE_REFINE, oldTransformation_usage_refine, newTransformation_usage_refine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation_usage_refine(TransformationUsageRefine newTransformation_usage_refine) {
		if (newTransformation_usage_refine != transformation_usage_refine) {
			NotificationChain msgs = null;
			if (transformation_usage_refine != null)
				msgs = ((InternalEObject)transformation_usage_refine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_USAGE_REFINE, null, msgs);
			if (newTransformation_usage_refine != null)
				msgs = ((InternalEObject)newTransformation_usage_refine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_USAGE_REFINE, null, msgs);
			msgs = basicSetTransformation_usage_refine(newTransformation_usage_refine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_USAGE_REFINE, newTransformation_usage_refine, newTransformation_usage_refine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_SIGNATURE:
				return basicSetTransformation_signature(null, msgs);
			case QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_USAGE_REFINE:
				return basicSetTransformation_usage_refine(null, msgs);
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
			case QVTOperationalPackage.TRANSFORMATION_HEADER__QUALIFIER:
				return getQualifier();
			case QVTOperationalPackage.TRANSFORMATION_HEADER__NAME:
				return getName();
			case QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_SIGNATURE:
				return getTransformation_signature();
			case QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_USAGE_REFINE:
				return getTransformation_usage_refine();
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
			case QVTOperationalPackage.TRANSFORMATION_HEADER__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends GeneralQualifier>)newValue);
				return;
			case QVTOperationalPackage.TRANSFORMATION_HEADER__NAME:
				setName((String)newValue);
				return;
			case QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_SIGNATURE:
				setTransformation_signature((SimpleSignature)newValue);
				return;
			case QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_USAGE_REFINE:
				setTransformation_usage_refine((TransformationUsageRefine)newValue);
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
			case QVTOperationalPackage.TRANSFORMATION_HEADER__QUALIFIER:
				getQualifier().clear();
				return;
			case QVTOperationalPackage.TRANSFORMATION_HEADER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_SIGNATURE:
				setTransformation_signature((SimpleSignature)null);
				return;
			case QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_USAGE_REFINE:
				setTransformation_usage_refine((TransformationUsageRefine)null);
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
			case QVTOperationalPackage.TRANSFORMATION_HEADER__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case QVTOperationalPackage.TRANSFORMATION_HEADER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_SIGNATURE:
				return transformation_signature != null;
			case QVTOperationalPackage.TRANSFORMATION_HEADER__TRANSFORMATION_USAGE_REFINE:
				return transformation_usage_refine != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TransformationHeaderImpl
