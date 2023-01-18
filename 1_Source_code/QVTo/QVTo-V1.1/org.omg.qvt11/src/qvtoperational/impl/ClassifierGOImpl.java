/**
 */
package qvtoperational.impl;

import EMOF.EMOFPackage;
import EMOF.Property;
import EMOF.Tag;
import EMOF.Type;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import qvtoperational.ClassifierFeatureList;
import qvtoperational.ClassifierGO;
import qvtoperational.ClassifierHeader;
import qvtoperational.EntryOperation;
import qvtoperational.ExpressionGO;
import qvtoperational.ModelType;
import qvtoperational.ModuleImport;
import qvtoperational.QvtoperationalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier GO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.ClassifierGOImpl#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link qvtoperational.impl.ClassifierGOImpl#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link qvtoperational.impl.ClassifierGOImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link qvtoperational.impl.ClassifierGOImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link qvtoperational.impl.ClassifierGOImpl#getConfigProperty <em>Config Property</em>}</li>
 *   <li>{@link qvtoperational.impl.ClassifierGOImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link qvtoperational.impl.ClassifierGOImpl#getModuleImport <em>Module Import</em>}</li>
 *   <li>{@link qvtoperational.impl.ClassifierGOImpl#getOwnedTag <em>Owned Tag</em>}</li>
 *   <li>{@link qvtoperational.impl.ClassifierGOImpl#getOwnedVariable <em>Owned Variable</em>}</li>
 *   <li>{@link qvtoperational.impl.ClassifierGOImpl#getUsedModelType <em>Used Model Type</em>}</li>
 *   <li>{@link qvtoperational.impl.ClassifierGOImpl#getClassifier_h <em>Classifier h</em>}</li>
 *   <li>{@link qvtoperational.impl.ClassifierGOImpl#getClassifier_feature_list <em>Classifier feature list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierGOImpl extends ImperativeOperationImpl implements ClassifierGO {
	/**
	 * The cached value of the '{@link #getNestedPackage() <em>Nested Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<EMOF.Package> nestedPackage;

	/**
	 * The cached value of the '{@link #getOwnedType() <em>Owned Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> ownedType;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigProperty() <em>Config Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> configProperty;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EntryOperation entry;

	/**
	 * The cached value of the '{@link #getModuleImport() <em>Module Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleImport()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleImport> moduleImport;

	/**
	 * The cached value of the '{@link #getOwnedTag() <em>Owned Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> ownedTag;

	/**
	 * The cached value of the '{@link #getOwnedVariable() <em>Owned Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionGO> ownedVariable;

	/**
	 * The cached value of the '{@link #getUsedModelType() <em>Used Model Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedModelType()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelType> usedModelType;

	/**
	 * The cached value of the '{@link #getClassifier_h() <em>Classifier h</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier_h()
	 * @generated
	 * @ordered
	 */
	protected ClassifierHeader classifier_h;

	/**
	 * The cached value of the '{@link #getClassifier_feature_list() <em>Classifier feature list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier_feature_list()
	 * @generated
	 * @ordered
	 */
	protected ClassifierFeatureList classifier_feature_list;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierGOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.CLASSIFIER_GO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMOF.Package> getNestedPackage() {
		if (nestedPackage == null) {
			nestedPackage = new EObjectContainmentWithInverseEList<EMOF.Package>(EMOF.Package.class, this, QvtoperationalPackage.CLASSIFIER_GO__NESTED_PACKAGE, EMOFPackage.PACKAGE__NESTING_PACKAGE);
		}
		return nestedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOF.Package getNestingPackage() {
		if (eContainerFeatureID() != QvtoperationalPackage.CLASSIFIER_GO__NESTING_PACKAGE) return null;
		return (EMOF.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestingPackage(EMOF.Package newNestingPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNestingPackage, QvtoperationalPackage.CLASSIFIER_GO__NESTING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingPackage(EMOF.Package newNestingPackage) {
		if (newNestingPackage != eInternalContainer() || (eContainerFeatureID() != QvtoperationalPackage.CLASSIFIER_GO__NESTING_PACKAGE && newNestingPackage != null)) {
			if (EcoreUtil.isAncestor(this, newNestingPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNestingPackage != null)
				msgs = ((InternalEObject)newNestingPackage).eInverseAdd(this, EMOFPackage.PACKAGE__NESTED_PACKAGE, EMOF.Package.class, msgs);
			msgs = basicSetNestingPackage(newNestingPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.CLASSIFIER_GO__NESTING_PACKAGE, newNestingPackage, newNestingPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getOwnedType() {
		if (ownedType == null) {
			ownedType = new EObjectContainmentWithInverseEList<Type>(Type.class, this, QvtoperationalPackage.CLASSIFIER_GO__OWNED_TYPE, EMOFPackage.TYPE__PACKAGE);
		}
		return ownedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.CLASSIFIER_GO__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getConfigProperty() {
		if (configProperty == null) {
			configProperty = new EObjectResolvingEList<Property>(Property.class, this, QvtoperationalPackage.CLASSIFIER_GO__CONFIG_PROPERTY);
		}
		return configProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryOperation getEntry() {
		if (entry != null && entry.eIsProxy()) {
			InternalEObject oldEntry = (InternalEObject)entry;
			entry = (EntryOperation)eResolveProxy(oldEntry);
			if (entry != oldEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.CLASSIFIER_GO__ENTRY, oldEntry, entry));
			}
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryOperation basicGetEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(EntryOperation newEntry) {
		EntryOperation oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.CLASSIFIER_GO__ENTRY, oldEntry, entry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleImport> getModuleImport() {
		if (moduleImport == null) {
			moduleImport = new EObjectContainmentWithInverseEList<ModuleImport>(ModuleImport.class, this, QvtoperationalPackage.CLASSIFIER_GO__MODULE_IMPORT, QvtoperationalPackage.MODULE_IMPORT__MODULE);
		}
		return moduleImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getOwnedTag() {
		if (ownedTag == null) {
			ownedTag = new EObjectContainmentEList<Tag>(Tag.class, this, QvtoperationalPackage.CLASSIFIER_GO__OWNED_TAG);
		}
		return ownedTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionGO> getOwnedVariable() {
		if (ownedVariable == null) {
			ownedVariable = new EObjectContainmentEList<ExpressionGO>(ExpressionGO.class, this, QvtoperationalPackage.CLASSIFIER_GO__OWNED_VARIABLE);
		}
		return ownedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelType> getUsedModelType() {
		if (usedModelType == null) {
			usedModelType = new EObjectResolvingEList<ModelType>(ModelType.class, this, QvtoperationalPackage.CLASSIFIER_GO__USED_MODEL_TYPE);
		}
		return usedModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierHeader getClassifier_h() {
		return classifier_h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifier_h(ClassifierHeader newClassifier_h, NotificationChain msgs) {
		ClassifierHeader oldClassifier_h = classifier_h;
		classifier_h = newClassifier_h;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_H, oldClassifier_h, newClassifier_h);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier_h(ClassifierHeader newClassifier_h) {
		if (newClassifier_h != classifier_h) {
			NotificationChain msgs = null;
			if (classifier_h != null)
				msgs = ((InternalEObject)classifier_h).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_H, null, msgs);
			if (newClassifier_h != null)
				msgs = ((InternalEObject)newClassifier_h).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_H, null, msgs);
			msgs = basicSetClassifier_h(newClassifier_h, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_H, newClassifier_h, newClassifier_h));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierFeatureList getClassifier_feature_list() {
		return classifier_feature_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifier_feature_list(ClassifierFeatureList newClassifier_feature_list, NotificationChain msgs) {
		ClassifierFeatureList oldClassifier_feature_list = classifier_feature_list;
		classifier_feature_list = newClassifier_feature_list;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_FEATURE_LIST, oldClassifier_feature_list, newClassifier_feature_list);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier_feature_list(ClassifierFeatureList newClassifier_feature_list) {
		if (newClassifier_feature_list != classifier_feature_list) {
			NotificationChain msgs = null;
			if (classifier_feature_list != null)
				msgs = ((InternalEObject)classifier_feature_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_FEATURE_LIST, null, msgs);
			if (newClassifier_feature_list != null)
				msgs = ((InternalEObject)newClassifier_feature_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_FEATURE_LIST, null, msgs);
			msgs = basicSetClassifier_feature_list(newClassifier_feature_list, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_FEATURE_LIST, newClassifier_feature_list, newClassifier_feature_list));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.CLASSIFIER_GO__NESTED_PACKAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedPackage()).basicAdd(otherEnd, msgs);
			case QvtoperationalPackage.CLASSIFIER_GO__NESTING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNestingPackage((EMOF.Package)otherEnd, msgs);
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedType()).basicAdd(otherEnd, msgs);
			case QvtoperationalPackage.CLASSIFIER_GO__MODULE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModuleImport()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.CLASSIFIER_GO__NESTED_PACKAGE:
				return ((InternalEList<?>)getNestedPackage()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.CLASSIFIER_GO__NESTING_PACKAGE:
				return basicSetNestingPackage(null, msgs);
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_TYPE:
				return ((InternalEList<?>)getOwnedType()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.CLASSIFIER_GO__MODULE_IMPORT:
				return ((InternalEList<?>)getModuleImport()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_TAG:
				return ((InternalEList<?>)getOwnedTag()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_VARIABLE:
				return ((InternalEList<?>)getOwnedVariable()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_H:
				return basicSetClassifier_h(null, msgs);
			case QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_FEATURE_LIST:
				return basicSetClassifier_feature_list(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QvtoperationalPackage.CLASSIFIER_GO__NESTING_PACKAGE:
				return eInternalContainer().eInverseRemove(this, EMOFPackage.PACKAGE__NESTED_PACKAGE, EMOF.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvtoperationalPackage.CLASSIFIER_GO__NESTED_PACKAGE:
				return getNestedPackage();
			case QvtoperationalPackage.CLASSIFIER_GO__NESTING_PACKAGE:
				return getNestingPackage();
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_TYPE:
				return getOwnedType();
			case QvtoperationalPackage.CLASSIFIER_GO__URI:
				return getUri();
			case QvtoperationalPackage.CLASSIFIER_GO__CONFIG_PROPERTY:
				return getConfigProperty();
			case QvtoperationalPackage.CLASSIFIER_GO__ENTRY:
				if (resolve) return getEntry();
				return basicGetEntry();
			case QvtoperationalPackage.CLASSIFIER_GO__MODULE_IMPORT:
				return getModuleImport();
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_TAG:
				return getOwnedTag();
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_VARIABLE:
				return getOwnedVariable();
			case QvtoperationalPackage.CLASSIFIER_GO__USED_MODEL_TYPE:
				return getUsedModelType();
			case QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_H:
				return getClassifier_h();
			case QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_FEATURE_LIST:
				return getClassifier_feature_list();
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
			case QvtoperationalPackage.CLASSIFIER_GO__NESTED_PACKAGE:
				getNestedPackage().clear();
				getNestedPackage().addAll((Collection<? extends EMOF.Package>)newValue);
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__NESTING_PACKAGE:
				setNestingPackage((EMOF.Package)newValue);
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends Type>)newValue);
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__URI:
				setUri((String)newValue);
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__CONFIG_PROPERTY:
				getConfigProperty().clear();
				getConfigProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__ENTRY:
				setEntry((EntryOperation)newValue);
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__MODULE_IMPORT:
				getModuleImport().clear();
				getModuleImport().addAll((Collection<? extends ModuleImport>)newValue);
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_TAG:
				getOwnedTag().clear();
				getOwnedTag().addAll((Collection<? extends Tag>)newValue);
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_VARIABLE:
				getOwnedVariable().clear();
				getOwnedVariable().addAll((Collection<? extends ExpressionGO>)newValue);
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__USED_MODEL_TYPE:
				getUsedModelType().clear();
				getUsedModelType().addAll((Collection<? extends ModelType>)newValue);
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_H:
				setClassifier_h((ClassifierHeader)newValue);
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_FEATURE_LIST:
				setClassifier_feature_list((ClassifierFeatureList)newValue);
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
			case QvtoperationalPackage.CLASSIFIER_GO__NESTED_PACKAGE:
				getNestedPackage().clear();
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__NESTING_PACKAGE:
				setNestingPackage((EMOF.Package)null);
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_TYPE:
				getOwnedType().clear();
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__URI:
				setUri(URI_EDEFAULT);
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__CONFIG_PROPERTY:
				getConfigProperty().clear();
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__ENTRY:
				setEntry((EntryOperation)null);
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__MODULE_IMPORT:
				getModuleImport().clear();
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_TAG:
				getOwnedTag().clear();
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_VARIABLE:
				getOwnedVariable().clear();
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__USED_MODEL_TYPE:
				getUsedModelType().clear();
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_H:
				setClassifier_h((ClassifierHeader)null);
				return;
			case QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_FEATURE_LIST:
				setClassifier_feature_list((ClassifierFeatureList)null);
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
			case QvtoperationalPackage.CLASSIFIER_GO__NESTED_PACKAGE:
				return nestedPackage != null && !nestedPackage.isEmpty();
			case QvtoperationalPackage.CLASSIFIER_GO__NESTING_PACKAGE:
				return getNestingPackage() != null;
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_TYPE:
				return ownedType != null && !ownedType.isEmpty();
			case QvtoperationalPackage.CLASSIFIER_GO__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case QvtoperationalPackage.CLASSIFIER_GO__CONFIG_PROPERTY:
				return configProperty != null && !configProperty.isEmpty();
			case QvtoperationalPackage.CLASSIFIER_GO__ENTRY:
				return entry != null;
			case QvtoperationalPackage.CLASSIFIER_GO__MODULE_IMPORT:
				return moduleImport != null && !moduleImport.isEmpty();
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_TAG:
				return ownedTag != null && !ownedTag.isEmpty();
			case QvtoperationalPackage.CLASSIFIER_GO__OWNED_VARIABLE:
				return ownedVariable != null && !ownedVariable.isEmpty();
			case QvtoperationalPackage.CLASSIFIER_GO__USED_MODEL_TYPE:
				return usedModelType != null && !usedModelType.isEmpty();
			case QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_H:
				return classifier_h != null;
			case QvtoperationalPackage.CLASSIFIER_GO__CLASSIFIER_FEATURE_LIST:
				return classifier_feature_list != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EMOF.Package.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.CLASSIFIER_GO__NESTED_PACKAGE: return EMOFPackage.PACKAGE__NESTED_PACKAGE;
				case QvtoperationalPackage.CLASSIFIER_GO__NESTING_PACKAGE: return EMOFPackage.PACKAGE__NESTING_PACKAGE;
				case QvtoperationalPackage.CLASSIFIER_GO__OWNED_TYPE: return EMOFPackage.PACKAGE__OWNED_TYPE;
				case QvtoperationalPackage.CLASSIFIER_GO__URI: return EMOFPackage.PACKAGE__URI;
				default: return -1;
			}
		}
		if (baseClass == qvtoperational.Module.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.CLASSIFIER_GO__CONFIG_PROPERTY: return QvtoperationalPackage.MODULE__CONFIG_PROPERTY;
				case QvtoperationalPackage.CLASSIFIER_GO__ENTRY: return QvtoperationalPackage.MODULE__ENTRY;
				case QvtoperationalPackage.CLASSIFIER_GO__MODULE_IMPORT: return QvtoperationalPackage.MODULE__MODULE_IMPORT;
				case QvtoperationalPackage.CLASSIFIER_GO__OWNED_TAG: return QvtoperationalPackage.MODULE__OWNED_TAG;
				case QvtoperationalPackage.CLASSIFIER_GO__OWNED_VARIABLE: return QvtoperationalPackage.MODULE__OWNED_VARIABLE;
				case QvtoperationalPackage.CLASSIFIER_GO__USED_MODEL_TYPE: return QvtoperationalPackage.MODULE__USED_MODEL_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EMOF.Package.class) {
			switch (baseFeatureID) {
				case EMOFPackage.PACKAGE__NESTED_PACKAGE: return QvtoperationalPackage.CLASSIFIER_GO__NESTED_PACKAGE;
				case EMOFPackage.PACKAGE__NESTING_PACKAGE: return QvtoperationalPackage.CLASSIFIER_GO__NESTING_PACKAGE;
				case EMOFPackage.PACKAGE__OWNED_TYPE: return QvtoperationalPackage.CLASSIFIER_GO__OWNED_TYPE;
				case EMOFPackage.PACKAGE__URI: return QvtoperationalPackage.CLASSIFIER_GO__URI;
				default: return -1;
			}
		}
		if (baseClass == qvtoperational.Module.class) {
			switch (baseFeatureID) {
				case QvtoperationalPackage.MODULE__CONFIG_PROPERTY: return QvtoperationalPackage.CLASSIFIER_GO__CONFIG_PROPERTY;
				case QvtoperationalPackage.MODULE__ENTRY: return QvtoperationalPackage.CLASSIFIER_GO__ENTRY;
				case QvtoperationalPackage.MODULE__MODULE_IMPORT: return QvtoperationalPackage.CLASSIFIER_GO__MODULE_IMPORT;
				case QvtoperationalPackage.MODULE__OWNED_TAG: return QvtoperationalPackage.CLASSIFIER_GO__OWNED_TAG;
				case QvtoperationalPackage.MODULE__OWNED_VARIABLE: return QvtoperationalPackage.CLASSIFIER_GO__OWNED_VARIABLE;
				case QvtoperationalPackage.MODULE__USED_MODEL_TYPE: return QvtoperationalPackage.CLASSIFIER_GO__USED_MODEL_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //ClassifierGOImpl
