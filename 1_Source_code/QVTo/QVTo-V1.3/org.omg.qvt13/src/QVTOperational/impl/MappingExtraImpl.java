/**
 */
package QVTOperational.impl;

import QVTOperational.MappingExtension;
import QVTOperational.MappingExtra;
import QVTOperational.MappingRefinement;
import QVTOperational.QVTOperationalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Extra</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.MappingExtraImpl#getMapping_extension <em>Mapping extension</em>}</li>
 *   <li>{@link QVTOperational.impl.MappingExtraImpl#getMapping_refinement <em>Mapping refinement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingExtraImpl extends MinimalEObjectImpl.Container implements MappingExtra {
	/**
	 * The cached value of the '{@link #getMapping_extension() <em>Mapping extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping_extension()
	 * @generated
	 * @ordered
	 */
	protected MappingExtension mapping_extension;

	/**
	 * The cached value of the '{@link #getMapping_refinement() <em>Mapping refinement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping_refinement()
	 * @generated
	 * @ordered
	 */
	protected MappingRefinement mapping_refinement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingExtraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.MAPPING_EXTRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingExtension getMapping_extension() {
		return mapping_extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping_extension(MappingExtension newMapping_extension, NotificationChain msgs) {
		MappingExtension oldMapping_extension = mapping_extension;
		mapping_extension = newMapping_extension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_EXTRA__MAPPING_EXTENSION, oldMapping_extension, newMapping_extension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping_extension(MappingExtension newMapping_extension) {
		if (newMapping_extension != mapping_extension) {
			NotificationChain msgs = null;
			if (mapping_extension != null)
				msgs = ((InternalEObject)mapping_extension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_EXTRA__MAPPING_EXTENSION, null, msgs);
			if (newMapping_extension != null)
				msgs = ((InternalEObject)newMapping_extension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_EXTRA__MAPPING_EXTENSION, null, msgs);
			msgs = basicSetMapping_extension(newMapping_extension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_EXTRA__MAPPING_EXTENSION, newMapping_extension, newMapping_extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingRefinement getMapping_refinement() {
		return mapping_refinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping_refinement(MappingRefinement newMapping_refinement, NotificationChain msgs) {
		MappingRefinement oldMapping_refinement = mapping_refinement;
		mapping_refinement = newMapping_refinement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_EXTRA__MAPPING_REFINEMENT, oldMapping_refinement, newMapping_refinement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping_refinement(MappingRefinement newMapping_refinement) {
		if (newMapping_refinement != mapping_refinement) {
			NotificationChain msgs = null;
			if (mapping_refinement != null)
				msgs = ((InternalEObject)mapping_refinement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_EXTRA__MAPPING_REFINEMENT, null, msgs);
			if (newMapping_refinement != null)
				msgs = ((InternalEObject)newMapping_refinement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_EXTRA__MAPPING_REFINEMENT, null, msgs);
			msgs = basicSetMapping_refinement(newMapping_refinement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_EXTRA__MAPPING_REFINEMENT, newMapping_refinement, newMapping_refinement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.MAPPING_EXTRA__MAPPING_EXTENSION:
				return basicSetMapping_extension(null, msgs);
			case QVTOperationalPackage.MAPPING_EXTRA__MAPPING_REFINEMENT:
				return basicSetMapping_refinement(null, msgs);
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
			case QVTOperationalPackage.MAPPING_EXTRA__MAPPING_EXTENSION:
				return getMapping_extension();
			case QVTOperationalPackage.MAPPING_EXTRA__MAPPING_REFINEMENT:
				return getMapping_refinement();
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
			case QVTOperationalPackage.MAPPING_EXTRA__MAPPING_EXTENSION:
				setMapping_extension((MappingExtension)newValue);
				return;
			case QVTOperationalPackage.MAPPING_EXTRA__MAPPING_REFINEMENT:
				setMapping_refinement((MappingRefinement)newValue);
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
			case QVTOperationalPackage.MAPPING_EXTRA__MAPPING_EXTENSION:
				setMapping_extension((MappingExtension)null);
				return;
			case QVTOperationalPackage.MAPPING_EXTRA__MAPPING_REFINEMENT:
				setMapping_refinement((MappingRefinement)null);
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
			case QVTOperationalPackage.MAPPING_EXTRA__MAPPING_EXTENSION:
				return mapping_extension != null;
			case QVTOperationalPackage.MAPPING_EXTRA__MAPPING_REFINEMENT:
				return mapping_refinement != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingExtraImpl
