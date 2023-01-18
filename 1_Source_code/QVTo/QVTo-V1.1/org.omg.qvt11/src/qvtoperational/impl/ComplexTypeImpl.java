/**
 */
package qvtoperational.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qvtoperational.CollectionKey;
import qvtoperational.ComplexType;
import qvtoperational.ComplexTypeKey;
import qvtoperational.DeclaratorList;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.TypeSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.ComplexTypeImpl#getComplex_type_key <em>Complex type key</em>}</li>
 *   <li>{@link qvtoperational.impl.ComplexTypeImpl#getCollection_key <em>Collection key</em>}</li>
 *   <li>{@link qvtoperational.impl.ComplexTypeImpl#getTypespec <em>Typespec</em>}</li>
 *   <li>{@link qvtoperational.impl.ComplexTypeImpl#getDeclarator_list <em>Declarator list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexTypeImpl extends MinimalEObjectImpl.Container implements ComplexType {
	/**
	 * The default value of the '{@link #getComplex_type_key() <em>Complex type key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplex_type_key()
	 * @generated
	 * @ordered
	 */
	protected static final ComplexTypeKey COMPLEX_TYPE_KEY_EDEFAULT = ComplexTypeKey.COLLECTION;

	/**
	 * The cached value of the '{@link #getComplex_type_key() <em>Complex type key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplex_type_key()
	 * @generated
	 * @ordered
	 */
	protected ComplexTypeKey complex_type_key = COMPLEX_TYPE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollection_key() <em>Collection key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection_key()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionKey COLLECTION_KEY_EDEFAULT = CollectionKey.COLLECTION;

	/**
	 * The cached value of the '{@link #getCollection_key() <em>Collection key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection_key()
	 * @generated
	 * @ordered
	 */
	protected CollectionKey collection_key = COLLECTION_KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypespec() <em>Typespec</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypespec()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeSpec> typespec;

	/**
	 * The cached value of the '{@link #getDeclarator_list() <em>Declarator list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarator_list()
	 * @generated
	 * @ordered
	 */
	protected DeclaratorList declarator_list;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.COMPLEX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTypeKey getComplex_type_key() {
		return complex_type_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplex_type_key(ComplexTypeKey newComplex_type_key) {
		ComplexTypeKey oldComplex_type_key = complex_type_key;
		complex_type_key = newComplex_type_key == null ? COMPLEX_TYPE_KEY_EDEFAULT : newComplex_type_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.COMPLEX_TYPE__COMPLEX_TYPE_KEY, oldComplex_type_key, complex_type_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKey getCollection_key() {
		return collection_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection_key(CollectionKey newCollection_key) {
		CollectionKey oldCollection_key = collection_key;
		collection_key = newCollection_key == null ? COLLECTION_KEY_EDEFAULT : newCollection_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.COMPLEX_TYPE__COLLECTION_KEY, oldCollection_key, collection_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSpec> getTypespec() {
		if (typespec == null) {
			typespec = new EObjectContainmentEList<TypeSpec>(TypeSpec.class, this, QvtoperationalPackage.COMPLEX_TYPE__TYPESPEC);
		}
		return typespec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaratorList getDeclarator_list() {
		return declarator_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclarator_list(DeclaratorList newDeclarator_list, NotificationChain msgs) {
		DeclaratorList oldDeclarator_list = declarator_list;
		declarator_list = newDeclarator_list;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.COMPLEX_TYPE__DECLARATOR_LIST, oldDeclarator_list, newDeclarator_list);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclarator_list(DeclaratorList newDeclarator_list) {
		if (newDeclarator_list != declarator_list) {
			NotificationChain msgs = null;
			if (declarator_list != null)
				msgs = ((InternalEObject)declarator_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.COMPLEX_TYPE__DECLARATOR_LIST, null, msgs);
			if (newDeclarator_list != null)
				msgs = ((InternalEObject)newDeclarator_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.COMPLEX_TYPE__DECLARATOR_LIST, null, msgs);
			msgs = basicSetDeclarator_list(newDeclarator_list, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.COMPLEX_TYPE__DECLARATOR_LIST, newDeclarator_list, newDeclarator_list));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.COMPLEX_TYPE__TYPESPEC:
				return ((InternalEList<?>)getTypespec()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.COMPLEX_TYPE__DECLARATOR_LIST:
				return basicSetDeclarator_list(null, msgs);
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
			case QvtoperationalPackage.COMPLEX_TYPE__COMPLEX_TYPE_KEY:
				return getComplex_type_key();
			case QvtoperationalPackage.COMPLEX_TYPE__COLLECTION_KEY:
				return getCollection_key();
			case QvtoperationalPackage.COMPLEX_TYPE__TYPESPEC:
				return getTypespec();
			case QvtoperationalPackage.COMPLEX_TYPE__DECLARATOR_LIST:
				return getDeclarator_list();
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
			case QvtoperationalPackage.COMPLEX_TYPE__COMPLEX_TYPE_KEY:
				setComplex_type_key((ComplexTypeKey)newValue);
				return;
			case QvtoperationalPackage.COMPLEX_TYPE__COLLECTION_KEY:
				setCollection_key((CollectionKey)newValue);
				return;
			case QvtoperationalPackage.COMPLEX_TYPE__TYPESPEC:
				getTypespec().clear();
				getTypespec().addAll((Collection<? extends TypeSpec>)newValue);
				return;
			case QvtoperationalPackage.COMPLEX_TYPE__DECLARATOR_LIST:
				setDeclarator_list((DeclaratorList)newValue);
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
			case QvtoperationalPackage.COMPLEX_TYPE__COMPLEX_TYPE_KEY:
				setComplex_type_key(COMPLEX_TYPE_KEY_EDEFAULT);
				return;
			case QvtoperationalPackage.COMPLEX_TYPE__COLLECTION_KEY:
				setCollection_key(COLLECTION_KEY_EDEFAULT);
				return;
			case QvtoperationalPackage.COMPLEX_TYPE__TYPESPEC:
				getTypespec().clear();
				return;
			case QvtoperationalPackage.COMPLEX_TYPE__DECLARATOR_LIST:
				setDeclarator_list((DeclaratorList)null);
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
			case QvtoperationalPackage.COMPLEX_TYPE__COMPLEX_TYPE_KEY:
				return complex_type_key != COMPLEX_TYPE_KEY_EDEFAULT;
			case QvtoperationalPackage.COMPLEX_TYPE__COLLECTION_KEY:
				return collection_key != COLLECTION_KEY_EDEFAULT;
			case QvtoperationalPackage.COMPLEX_TYPE__TYPESPEC:
				return typespec != null && !typespec.isEmpty();
			case QvtoperationalPackage.COMPLEX_TYPE__DECLARATOR_LIST:
				return declarator_list != null;
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
		result.append(" (complex_type_key: ");
		result.append(complex_type_key);
		result.append(", collection_key: ");
		result.append(collection_key);
		result.append(')');
		return result.toString();
	}

} //ComplexTypeImpl
