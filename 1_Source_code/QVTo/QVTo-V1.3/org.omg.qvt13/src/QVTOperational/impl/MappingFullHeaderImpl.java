/**
 */
package QVTOperational.impl;

import QVTOperational.ExpressionBlock;
import QVTOperational.MappingFullHeader;
import QVTOperational.MappingHeader;
import QVTOperational.QVTOperationalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Full Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.MappingFullHeaderImpl#getMapping_header <em>Mapping header</em>}</li>
 *   <li>{@link QVTOperational.impl.MappingFullHeaderImpl#getWhen <em>When</em>}</li>
 *   <li>{@link QVTOperational.impl.MappingFullHeaderImpl#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingFullHeaderImpl extends MinimalEObjectImpl.Container implements MappingFullHeader {
	/**
	 * The cached value of the '{@link #getMapping_header() <em>Mapping header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping_header()
	 * @generated
	 * @ordered
	 */
	protected MappingHeader mapping_header;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected ExpressionBlock when;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected ExpressionBlock where;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingFullHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.MAPPING_FULL_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingHeader getMapping_header() {
		return mapping_header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping_header(MappingHeader newMapping_header, NotificationChain msgs) {
		MappingHeader oldMapping_header = mapping_header;
		mapping_header = newMapping_header;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_FULL_HEADER__MAPPING_HEADER, oldMapping_header, newMapping_header);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping_header(MappingHeader newMapping_header) {
		if (newMapping_header != mapping_header) {
			NotificationChain msgs = null;
			if (mapping_header != null)
				msgs = ((InternalEObject)mapping_header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_FULL_HEADER__MAPPING_HEADER, null, msgs);
			if (newMapping_header != null)
				msgs = ((InternalEObject)newMapping_header).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_FULL_HEADER__MAPPING_HEADER, null, msgs);
			msgs = basicSetMapping_header(newMapping_header, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_FULL_HEADER__MAPPING_HEADER, newMapping_header, newMapping_header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionBlock getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(ExpressionBlock newWhen, NotificationChain msgs) {
		ExpressionBlock oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_FULL_HEADER__WHEN, oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(ExpressionBlock newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_FULL_HEADER__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_FULL_HEADER__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_FULL_HEADER__WHEN, newWhen, newWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionBlock getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(ExpressionBlock newWhere, NotificationChain msgs) {
		ExpressionBlock oldWhere = where;
		where = newWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_FULL_HEADER__WHERE, oldWhere, newWhere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(ExpressionBlock newWhere) {
		if (newWhere != where) {
			NotificationChain msgs = null;
			if (where != null)
				msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_FULL_HEADER__WHERE, null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.MAPPING_FULL_HEADER__WHERE, null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.MAPPING_FULL_HEADER__WHERE, newWhere, newWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.MAPPING_FULL_HEADER__MAPPING_HEADER:
				return basicSetMapping_header(null, msgs);
			case QVTOperationalPackage.MAPPING_FULL_HEADER__WHEN:
				return basicSetWhen(null, msgs);
			case QVTOperationalPackage.MAPPING_FULL_HEADER__WHERE:
				return basicSetWhere(null, msgs);
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
			case QVTOperationalPackage.MAPPING_FULL_HEADER__MAPPING_HEADER:
				return getMapping_header();
			case QVTOperationalPackage.MAPPING_FULL_HEADER__WHEN:
				return getWhen();
			case QVTOperationalPackage.MAPPING_FULL_HEADER__WHERE:
				return getWhere();
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
			case QVTOperationalPackage.MAPPING_FULL_HEADER__MAPPING_HEADER:
				setMapping_header((MappingHeader)newValue);
				return;
			case QVTOperationalPackage.MAPPING_FULL_HEADER__WHEN:
				setWhen((ExpressionBlock)newValue);
				return;
			case QVTOperationalPackage.MAPPING_FULL_HEADER__WHERE:
				setWhere((ExpressionBlock)newValue);
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
			case QVTOperationalPackage.MAPPING_FULL_HEADER__MAPPING_HEADER:
				setMapping_header((MappingHeader)null);
				return;
			case QVTOperationalPackage.MAPPING_FULL_HEADER__WHEN:
				setWhen((ExpressionBlock)null);
				return;
			case QVTOperationalPackage.MAPPING_FULL_HEADER__WHERE:
				setWhere((ExpressionBlock)null);
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
			case QVTOperationalPackage.MAPPING_FULL_HEADER__MAPPING_HEADER:
				return mapping_header != null;
			case QVTOperationalPackage.MAPPING_FULL_HEADER__WHEN:
				return when != null;
			case QVTOperationalPackage.MAPPING_FULL_HEADER__WHERE:
				return where != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingFullHeaderImpl
