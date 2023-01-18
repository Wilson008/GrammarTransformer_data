/**
 */
package QVTOperational.impl;

import EMOF.EMOFPackage;
import EMOF.Property;
import EMOF.Tag;
import EMOF.Type;
import QVTOperational.EntryHeader;
import QVTOperational.EntryOperation;
import QVTOperational.ExpressionBlock;
import QVTOperational.ExpressionGO;
import QVTOperational.ModelType;
import QVTOperational.ModuleImport;
import QVTOperational.QVTOperationalPackage;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.EntryOperationImpl#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link QVTOperational.impl.EntryOperationImpl#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link QVTOperational.impl.EntryOperationImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link QVTOperational.impl.EntryOperationImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link QVTOperational.impl.EntryOperationImpl#getConfigProperty <em>Config Property</em>}</li>
 *   <li>{@link QVTOperational.impl.EntryOperationImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link QVTOperational.impl.EntryOperationImpl#getModuleImport <em>Module Import</em>}</li>
 *   <li>{@link QVTOperational.impl.EntryOperationImpl#getOwnedTag <em>Owned Tag</em>}</li>
 *   <li>{@link QVTOperational.impl.EntryOperationImpl#getOwnedVariable <em>Owned Variable</em>}</li>
 *   <li>{@link QVTOperational.impl.EntryOperationImpl#getUsedModelType <em>Used Model Type</em>}</li>
 *   <li>{@link QVTOperational.impl.EntryOperationImpl#getEntry_header <em>Entry header</em>}</li>
 *   <li>{@link QVTOperational.impl.EntryOperationImpl#getExpression_block <em>Expression block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryOperationImpl extends ImperativeOperationImpl implements EntryOperation {
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
	 * The cached value of the '{@link #getEntry_header() <em>Entry header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry_header()
	 * @generated
	 * @ordered
	 */
	protected EntryHeader entry_header;

	/**
	 * The cached value of the '{@link #getExpression_block() <em>Expression block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression_block()
	 * @generated
	 * @ordered
	 */
	protected ExpressionBlock expression_block;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.ENTRY_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMOF.Package> getNestedPackage() {
		if (nestedPackage == null) {
			nestedPackage = new EObjectContainmentWithInverseEList<EMOF.Package>(EMOF.Package.class, this, QVTOperationalPackage.ENTRY_OPERATION__NESTED_PACKAGE, EMOFPackage.PACKAGE__NESTING_PACKAGE);
		}
		return nestedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOF.Package getNestingPackage() {
		if (eContainerFeatureID() != QVTOperationalPackage.ENTRY_OPERATION__NESTING_PACKAGE) return null;
		return (EMOF.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestingPackage(EMOF.Package newNestingPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNestingPackage, QVTOperationalPackage.ENTRY_OPERATION__NESTING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingPackage(EMOF.Package newNestingPackage) {
		if (newNestingPackage != eInternalContainer() || (eContainerFeatureID() != QVTOperationalPackage.ENTRY_OPERATION__NESTING_PACKAGE && newNestingPackage != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.ENTRY_OPERATION__NESTING_PACKAGE, newNestingPackage, newNestingPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getOwnedType() {
		if (ownedType == null) {
			ownedType = new EObjectContainmentWithInverseEList<Type>(Type.class, this, QVTOperationalPackage.ENTRY_OPERATION__OWNED_TYPE, EMOFPackage.TYPE__PACKAGE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.ENTRY_OPERATION__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getConfigProperty() {
		if (configProperty == null) {
			configProperty = new EObjectResolvingEList<Property>(Property.class, this, QVTOperationalPackage.ENTRY_OPERATION__CONFIG_PROPERTY);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QVTOperationalPackage.ENTRY_OPERATION__ENTRY, oldEntry, entry));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.ENTRY_OPERATION__ENTRY, oldEntry, entry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleImport> getModuleImport() {
		if (moduleImport == null) {
			moduleImport = new EObjectContainmentWithInverseEList<ModuleImport>(ModuleImport.class, this, QVTOperationalPackage.ENTRY_OPERATION__MODULE_IMPORT, QVTOperationalPackage.MODULE_IMPORT__MODULE);
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
			ownedTag = new EObjectContainmentEList<Tag>(Tag.class, this, QVTOperationalPackage.ENTRY_OPERATION__OWNED_TAG);
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
			ownedVariable = new EObjectContainmentEList<ExpressionGO>(ExpressionGO.class, this, QVTOperationalPackage.ENTRY_OPERATION__OWNED_VARIABLE);
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
			usedModelType = new EObjectResolvingEList<ModelType>(ModelType.class, this, QVTOperationalPackage.ENTRY_OPERATION__USED_MODEL_TYPE);
		}
		return usedModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryHeader getEntry_header() {
		return entry_header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry_header(EntryHeader newEntry_header, NotificationChain msgs) {
		EntryHeader oldEntry_header = entry_header;
		entry_header = newEntry_header;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.ENTRY_OPERATION__ENTRY_HEADER, oldEntry_header, newEntry_header);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry_header(EntryHeader newEntry_header) {
		if (newEntry_header != entry_header) {
			NotificationChain msgs = null;
			if (entry_header != null)
				msgs = ((InternalEObject)entry_header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.ENTRY_OPERATION__ENTRY_HEADER, null, msgs);
			if (newEntry_header != null)
				msgs = ((InternalEObject)newEntry_header).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.ENTRY_OPERATION__ENTRY_HEADER, null, msgs);
			msgs = basicSetEntry_header(newEntry_header, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.ENTRY_OPERATION__ENTRY_HEADER, newEntry_header, newEntry_header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionBlock getExpression_block() {
		return expression_block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression_block(ExpressionBlock newExpression_block, NotificationChain msgs) {
		ExpressionBlock oldExpression_block = expression_block;
		expression_block = newExpression_block;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.ENTRY_OPERATION__EXPRESSION_BLOCK, oldExpression_block, newExpression_block);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression_block(ExpressionBlock newExpression_block) {
		if (newExpression_block != expression_block) {
			NotificationChain msgs = null;
			if (expression_block != null)
				msgs = ((InternalEObject)expression_block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.ENTRY_OPERATION__EXPRESSION_BLOCK, null, msgs);
			if (newExpression_block != null)
				msgs = ((InternalEObject)newExpression_block).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.ENTRY_OPERATION__EXPRESSION_BLOCK, null, msgs);
			msgs = basicSetExpression_block(newExpression_block, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.ENTRY_OPERATION__EXPRESSION_BLOCK, newExpression_block, newExpression_block));
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
			case QVTOperationalPackage.ENTRY_OPERATION__NESTED_PACKAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedPackage()).basicAdd(otherEnd, msgs);
			case QVTOperationalPackage.ENTRY_OPERATION__NESTING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNestingPackage((EMOF.Package)otherEnd, msgs);
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedType()).basicAdd(otherEnd, msgs);
			case QVTOperationalPackage.ENTRY_OPERATION__MODULE_IMPORT:
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
			case QVTOperationalPackage.ENTRY_OPERATION__NESTED_PACKAGE:
				return ((InternalEList<?>)getNestedPackage()).basicRemove(otherEnd, msgs);
			case QVTOperationalPackage.ENTRY_OPERATION__NESTING_PACKAGE:
				return basicSetNestingPackage(null, msgs);
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_TYPE:
				return ((InternalEList<?>)getOwnedType()).basicRemove(otherEnd, msgs);
			case QVTOperationalPackage.ENTRY_OPERATION__MODULE_IMPORT:
				return ((InternalEList<?>)getModuleImport()).basicRemove(otherEnd, msgs);
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_TAG:
				return ((InternalEList<?>)getOwnedTag()).basicRemove(otherEnd, msgs);
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_VARIABLE:
				return ((InternalEList<?>)getOwnedVariable()).basicRemove(otherEnd, msgs);
			case QVTOperationalPackage.ENTRY_OPERATION__ENTRY_HEADER:
				return basicSetEntry_header(null, msgs);
			case QVTOperationalPackage.ENTRY_OPERATION__EXPRESSION_BLOCK:
				return basicSetExpression_block(null, msgs);
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
			case QVTOperationalPackage.ENTRY_OPERATION__NESTING_PACKAGE:
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
			case QVTOperationalPackage.ENTRY_OPERATION__NESTED_PACKAGE:
				return getNestedPackage();
			case QVTOperationalPackage.ENTRY_OPERATION__NESTING_PACKAGE:
				return getNestingPackage();
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_TYPE:
				return getOwnedType();
			case QVTOperationalPackage.ENTRY_OPERATION__URI:
				return getUri();
			case QVTOperationalPackage.ENTRY_OPERATION__CONFIG_PROPERTY:
				return getConfigProperty();
			case QVTOperationalPackage.ENTRY_OPERATION__ENTRY:
				if (resolve) return getEntry();
				return basicGetEntry();
			case QVTOperationalPackage.ENTRY_OPERATION__MODULE_IMPORT:
				return getModuleImport();
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_TAG:
				return getOwnedTag();
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_VARIABLE:
				return getOwnedVariable();
			case QVTOperationalPackage.ENTRY_OPERATION__USED_MODEL_TYPE:
				return getUsedModelType();
			case QVTOperationalPackage.ENTRY_OPERATION__ENTRY_HEADER:
				return getEntry_header();
			case QVTOperationalPackage.ENTRY_OPERATION__EXPRESSION_BLOCK:
				return getExpression_block();
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
			case QVTOperationalPackage.ENTRY_OPERATION__NESTED_PACKAGE:
				getNestedPackage().clear();
				getNestedPackage().addAll((Collection<? extends EMOF.Package>)newValue);
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__NESTING_PACKAGE:
				setNestingPackage((EMOF.Package)newValue);
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends Type>)newValue);
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__URI:
				setUri((String)newValue);
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__CONFIG_PROPERTY:
				getConfigProperty().clear();
				getConfigProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__ENTRY:
				setEntry((EntryOperation)newValue);
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__MODULE_IMPORT:
				getModuleImport().clear();
				getModuleImport().addAll((Collection<? extends ModuleImport>)newValue);
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_TAG:
				getOwnedTag().clear();
				getOwnedTag().addAll((Collection<? extends Tag>)newValue);
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_VARIABLE:
				getOwnedVariable().clear();
				getOwnedVariable().addAll((Collection<? extends ExpressionGO>)newValue);
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__USED_MODEL_TYPE:
				getUsedModelType().clear();
				getUsedModelType().addAll((Collection<? extends ModelType>)newValue);
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__ENTRY_HEADER:
				setEntry_header((EntryHeader)newValue);
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__EXPRESSION_BLOCK:
				setExpression_block((ExpressionBlock)newValue);
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
			case QVTOperationalPackage.ENTRY_OPERATION__NESTED_PACKAGE:
				getNestedPackage().clear();
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__NESTING_PACKAGE:
				setNestingPackage((EMOF.Package)null);
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_TYPE:
				getOwnedType().clear();
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__URI:
				setUri(URI_EDEFAULT);
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__CONFIG_PROPERTY:
				getConfigProperty().clear();
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__ENTRY:
				setEntry((EntryOperation)null);
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__MODULE_IMPORT:
				getModuleImport().clear();
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_TAG:
				getOwnedTag().clear();
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_VARIABLE:
				getOwnedVariable().clear();
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__USED_MODEL_TYPE:
				getUsedModelType().clear();
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__ENTRY_HEADER:
				setEntry_header((EntryHeader)null);
				return;
			case QVTOperationalPackage.ENTRY_OPERATION__EXPRESSION_BLOCK:
				setExpression_block((ExpressionBlock)null);
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
			case QVTOperationalPackage.ENTRY_OPERATION__NESTED_PACKAGE:
				return nestedPackage != null && !nestedPackage.isEmpty();
			case QVTOperationalPackage.ENTRY_OPERATION__NESTING_PACKAGE:
				return getNestingPackage() != null;
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_TYPE:
				return ownedType != null && !ownedType.isEmpty();
			case QVTOperationalPackage.ENTRY_OPERATION__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case QVTOperationalPackage.ENTRY_OPERATION__CONFIG_PROPERTY:
				return configProperty != null && !configProperty.isEmpty();
			case QVTOperationalPackage.ENTRY_OPERATION__ENTRY:
				return entry != null;
			case QVTOperationalPackage.ENTRY_OPERATION__MODULE_IMPORT:
				return moduleImport != null && !moduleImport.isEmpty();
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_TAG:
				return ownedTag != null && !ownedTag.isEmpty();
			case QVTOperationalPackage.ENTRY_OPERATION__OWNED_VARIABLE:
				return ownedVariable != null && !ownedVariable.isEmpty();
			case QVTOperationalPackage.ENTRY_OPERATION__USED_MODEL_TYPE:
				return usedModelType != null && !usedModelType.isEmpty();
			case QVTOperationalPackage.ENTRY_OPERATION__ENTRY_HEADER:
				return entry_header != null;
			case QVTOperationalPackage.ENTRY_OPERATION__EXPRESSION_BLOCK:
				return expression_block != null;
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
				case QVTOperationalPackage.ENTRY_OPERATION__NESTED_PACKAGE: return EMOFPackage.PACKAGE__NESTED_PACKAGE;
				case QVTOperationalPackage.ENTRY_OPERATION__NESTING_PACKAGE: return EMOFPackage.PACKAGE__NESTING_PACKAGE;
				case QVTOperationalPackage.ENTRY_OPERATION__OWNED_TYPE: return EMOFPackage.PACKAGE__OWNED_TYPE;
				case QVTOperationalPackage.ENTRY_OPERATION__URI: return EMOFPackage.PACKAGE__URI;
				default: return -1;
			}
		}
		if (baseClass == QVTOperational.Module.class) {
			switch (derivedFeatureID) {
				case QVTOperationalPackage.ENTRY_OPERATION__CONFIG_PROPERTY: return QVTOperationalPackage.MODULE__CONFIG_PROPERTY;
				case QVTOperationalPackage.ENTRY_OPERATION__ENTRY: return QVTOperationalPackage.MODULE__ENTRY;
				case QVTOperationalPackage.ENTRY_OPERATION__MODULE_IMPORT: return QVTOperationalPackage.MODULE__MODULE_IMPORT;
				case QVTOperationalPackage.ENTRY_OPERATION__OWNED_TAG: return QVTOperationalPackage.MODULE__OWNED_TAG;
				case QVTOperationalPackage.ENTRY_OPERATION__OWNED_VARIABLE: return QVTOperationalPackage.MODULE__OWNED_VARIABLE;
				case QVTOperationalPackage.ENTRY_OPERATION__USED_MODEL_TYPE: return QVTOperationalPackage.MODULE__USED_MODEL_TYPE;
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
				case EMOFPackage.PACKAGE__NESTED_PACKAGE: return QVTOperationalPackage.ENTRY_OPERATION__NESTED_PACKAGE;
				case EMOFPackage.PACKAGE__NESTING_PACKAGE: return QVTOperationalPackage.ENTRY_OPERATION__NESTING_PACKAGE;
				case EMOFPackage.PACKAGE__OWNED_TYPE: return QVTOperationalPackage.ENTRY_OPERATION__OWNED_TYPE;
				case EMOFPackage.PACKAGE__URI: return QVTOperationalPackage.ENTRY_OPERATION__URI;
				default: return -1;
			}
		}
		if (baseClass == QVTOperational.Module.class) {
			switch (baseFeatureID) {
				case QVTOperationalPackage.MODULE__CONFIG_PROPERTY: return QVTOperationalPackage.ENTRY_OPERATION__CONFIG_PROPERTY;
				case QVTOperationalPackage.MODULE__ENTRY: return QVTOperationalPackage.ENTRY_OPERATION__ENTRY;
				case QVTOperationalPackage.MODULE__MODULE_IMPORT: return QVTOperationalPackage.ENTRY_OPERATION__MODULE_IMPORT;
				case QVTOperationalPackage.MODULE__OWNED_TAG: return QVTOperationalPackage.ENTRY_OPERATION__OWNED_TAG;
				case QVTOperationalPackage.MODULE__OWNED_VARIABLE: return QVTOperationalPackage.ENTRY_OPERATION__OWNED_VARIABLE;
				case QVTOperationalPackage.MODULE__USED_MODEL_TYPE: return QVTOperationalPackage.ENTRY_OPERATION__USED_MODEL_TYPE;
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

} //EntryOperationImpl
