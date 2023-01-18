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

import qvtoperational.EntryOperation;
import qvtoperational.ExpressionGO;
import qvtoperational.MappingBody;
import qvtoperational.MappingFullHeader;
import qvtoperational.MappingOperation;
import qvtoperational.ModelType;
import qvtoperational.ModuleImport;
import qvtoperational.QvtoperationalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getConfigProperty <em>Config Property</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getModuleImport <em>Module Import</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getOwnedTag <em>Owned Tag</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getOwnedVariable <em>Owned Variable</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getUsedModelType <em>Used Model Type</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getDisjunct <em>Disjunct</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getInherited <em>Inherited</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getMerged <em>Merged</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getRefinedRelation <em>Refined Relation</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getWhen <em>When</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getMapping_full_header <em>Mapping full header</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getMapping_body <em>Mapping body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingOperationImpl extends ImperativeOperationImpl implements MappingOperation {
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
	 * The cached value of the '{@link #getDisjunct() <em>Disjunct</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjunct()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingOperation> disjunct;

	/**
	 * The cached value of the '{@link #getInherited() <em>Inherited</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherited()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingOperation> inherited;

	/**
	 * The cached value of the '{@link #getMerged() <em>Merged</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerged()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingOperation> merged;

	/**
	 * The cached value of the '{@link #getRefinedRelation() <em>Refined Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedRelation()
	 * @generated
	 * @ordered
	 */
	protected ExpressionGO refinedRelation;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected ExpressionGO when;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected ExpressionGO where;

	/**
	 * The cached value of the '{@link #getMapping_full_header() <em>Mapping full header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping_full_header()
	 * @generated
	 * @ordered
	 */
	protected MappingFullHeader mapping_full_header;

	/**
	 * The cached value of the '{@link #getMapping_body() <em>Mapping body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping_body()
	 * @generated
	 * @ordered
	 */
	protected MappingBody mapping_body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.MAPPING_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMOF.Package> getNestedPackage() {
		if (nestedPackage == null) {
			nestedPackage = new EObjectContainmentWithInverseEList<EMOF.Package>(EMOF.Package.class, this, QvtoperationalPackage.MAPPING_OPERATION__NESTED_PACKAGE, EMOFPackage.PACKAGE__NESTING_PACKAGE);
		}
		return nestedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOF.Package getNestingPackage() {
		if (eContainerFeatureID() != QvtoperationalPackage.MAPPING_OPERATION__NESTING_PACKAGE) return null;
		return (EMOF.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestingPackage(EMOF.Package newNestingPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNestingPackage, QvtoperationalPackage.MAPPING_OPERATION__NESTING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingPackage(EMOF.Package newNestingPackage) {
		if (newNestingPackage != eInternalContainer() || (eContainerFeatureID() != QvtoperationalPackage.MAPPING_OPERATION__NESTING_PACKAGE && newNestingPackage != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__NESTING_PACKAGE, newNestingPackage, newNestingPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getOwnedType() {
		if (ownedType == null) {
			ownedType = new EObjectContainmentWithInverseEList<Type>(Type.class, this, QvtoperationalPackage.MAPPING_OPERATION__OWNED_TYPE, EMOFPackage.TYPE__PACKAGE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getConfigProperty() {
		if (configProperty == null) {
			configProperty = new EObjectResolvingEList<Property>(Property.class, this, QvtoperationalPackage.MAPPING_OPERATION__CONFIG_PROPERTY);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.MAPPING_OPERATION__ENTRY, oldEntry, entry));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__ENTRY, oldEntry, entry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleImport> getModuleImport() {
		if (moduleImport == null) {
			moduleImport = new EObjectContainmentWithInverseEList<ModuleImport>(ModuleImport.class, this, QvtoperationalPackage.MAPPING_OPERATION__MODULE_IMPORT, QvtoperationalPackage.MODULE_IMPORT__MODULE);
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
			ownedTag = new EObjectContainmentEList<Tag>(Tag.class, this, QvtoperationalPackage.MAPPING_OPERATION__OWNED_TAG);
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
			ownedVariable = new EObjectContainmentEList<ExpressionGO>(ExpressionGO.class, this, QvtoperationalPackage.MAPPING_OPERATION__OWNED_VARIABLE);
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
			usedModelType = new EObjectResolvingEList<ModelType>(ModelType.class, this, QvtoperationalPackage.MAPPING_OPERATION__USED_MODEL_TYPE);
		}
		return usedModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingOperation> getDisjunct() {
		if (disjunct == null) {
			disjunct = new EObjectResolvingEList<MappingOperation>(MappingOperation.class, this, QvtoperationalPackage.MAPPING_OPERATION__DISJUNCT);
		}
		return disjunct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingOperation> getInherited() {
		if (inherited == null) {
			inherited = new EObjectResolvingEList<MappingOperation>(MappingOperation.class, this, QvtoperationalPackage.MAPPING_OPERATION__INHERITED);
		}
		return inherited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingOperation> getMerged() {
		if (merged == null) {
			merged = new EObjectResolvingEList<MappingOperation>(MappingOperation.class, this, QvtoperationalPackage.MAPPING_OPERATION__MERGED);
		}
		return merged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionGO getRefinedRelation() {
		if (refinedRelation != null && refinedRelation.eIsProxy()) {
			InternalEObject oldRefinedRelation = (InternalEObject)refinedRelation;
			refinedRelation = (ExpressionGO)eResolveProxy(oldRefinedRelation);
			if (refinedRelation != oldRefinedRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION, oldRefinedRelation, refinedRelation));
			}
		}
		return refinedRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionGO basicGetRefinedRelation() {
		return refinedRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedRelation(ExpressionGO newRefinedRelation) {
		ExpressionGO oldRefinedRelation = refinedRelation;
		refinedRelation = newRefinedRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION, oldRefinedRelation, refinedRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionGO getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(ExpressionGO newWhen, NotificationChain msgs) {
		ExpressionGO oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__WHEN, oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(ExpressionGO newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MAPPING_OPERATION__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MAPPING_OPERATION__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__WHEN, newWhen, newWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionGO getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(ExpressionGO newWhere, NotificationChain msgs) {
		ExpressionGO oldWhere = where;
		where = newWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__WHERE, oldWhere, newWhere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(ExpressionGO newWhere) {
		if (newWhere != where) {
			NotificationChain msgs = null;
			if (where != null)
				msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MAPPING_OPERATION__WHERE, null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MAPPING_OPERATION__WHERE, null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__WHERE, newWhere, newWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingFullHeader getMapping_full_header() {
		return mapping_full_header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping_full_header(MappingFullHeader newMapping_full_header, NotificationChain msgs) {
		MappingFullHeader oldMapping_full_header = mapping_full_header;
		mapping_full_header = newMapping_full_header;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__MAPPING_FULL_HEADER, oldMapping_full_header, newMapping_full_header);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping_full_header(MappingFullHeader newMapping_full_header) {
		if (newMapping_full_header != mapping_full_header) {
			NotificationChain msgs = null;
			if (mapping_full_header != null)
				msgs = ((InternalEObject)mapping_full_header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MAPPING_OPERATION__MAPPING_FULL_HEADER, null, msgs);
			if (newMapping_full_header != null)
				msgs = ((InternalEObject)newMapping_full_header).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MAPPING_OPERATION__MAPPING_FULL_HEADER, null, msgs);
			msgs = basicSetMapping_full_header(newMapping_full_header, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__MAPPING_FULL_HEADER, newMapping_full_header, newMapping_full_header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingBody getMapping_body() {
		return mapping_body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping_body(MappingBody newMapping_body, NotificationChain msgs) {
		MappingBody oldMapping_body = mapping_body;
		mapping_body = newMapping_body;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__MAPPING_BODY, oldMapping_body, newMapping_body);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping_body(MappingBody newMapping_body) {
		if (newMapping_body != mapping_body) {
			NotificationChain msgs = null;
			if (mapping_body != null)
				msgs = ((InternalEObject)mapping_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MAPPING_OPERATION__MAPPING_BODY, null, msgs);
			if (newMapping_body != null)
				msgs = ((InternalEObject)newMapping_body).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MAPPING_OPERATION__MAPPING_BODY, null, msgs);
			msgs = basicSetMapping_body(newMapping_body, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__MAPPING_BODY, newMapping_body, newMapping_body));
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
			case QvtoperationalPackage.MAPPING_OPERATION__NESTED_PACKAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedPackage()).basicAdd(otherEnd, msgs);
			case QvtoperationalPackage.MAPPING_OPERATION__NESTING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNestingPackage((EMOF.Package)otherEnd, msgs);
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedType()).basicAdd(otherEnd, msgs);
			case QvtoperationalPackage.MAPPING_OPERATION__MODULE_IMPORT:
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
			case QvtoperationalPackage.MAPPING_OPERATION__NESTED_PACKAGE:
				return ((InternalEList<?>)getNestedPackage()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MAPPING_OPERATION__NESTING_PACKAGE:
				return basicSetNestingPackage(null, msgs);
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_TYPE:
				return ((InternalEList<?>)getOwnedType()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MAPPING_OPERATION__MODULE_IMPORT:
				return ((InternalEList<?>)getModuleImport()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_TAG:
				return ((InternalEList<?>)getOwnedTag()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_VARIABLE:
				return ((InternalEList<?>)getOwnedVariable()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
				return basicSetWhen(null, msgs);
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
				return basicSetWhere(null, msgs);
			case QvtoperationalPackage.MAPPING_OPERATION__MAPPING_FULL_HEADER:
				return basicSetMapping_full_header(null, msgs);
			case QvtoperationalPackage.MAPPING_OPERATION__MAPPING_BODY:
				return basicSetMapping_body(null, msgs);
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
			case QvtoperationalPackage.MAPPING_OPERATION__NESTING_PACKAGE:
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
			case QvtoperationalPackage.MAPPING_OPERATION__NESTED_PACKAGE:
				return getNestedPackage();
			case QvtoperationalPackage.MAPPING_OPERATION__NESTING_PACKAGE:
				return getNestingPackage();
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_TYPE:
				return getOwnedType();
			case QvtoperationalPackage.MAPPING_OPERATION__URI:
				return getUri();
			case QvtoperationalPackage.MAPPING_OPERATION__CONFIG_PROPERTY:
				return getConfigProperty();
			case QvtoperationalPackage.MAPPING_OPERATION__ENTRY:
				if (resolve) return getEntry();
				return basicGetEntry();
			case QvtoperationalPackage.MAPPING_OPERATION__MODULE_IMPORT:
				return getModuleImport();
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_TAG:
				return getOwnedTag();
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_VARIABLE:
				return getOwnedVariable();
			case QvtoperationalPackage.MAPPING_OPERATION__USED_MODEL_TYPE:
				return getUsedModelType();
			case QvtoperationalPackage.MAPPING_OPERATION__DISJUNCT:
				return getDisjunct();
			case QvtoperationalPackage.MAPPING_OPERATION__INHERITED:
				return getInherited();
			case QvtoperationalPackage.MAPPING_OPERATION__MERGED:
				return getMerged();
			case QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION:
				if (resolve) return getRefinedRelation();
				return basicGetRefinedRelation();
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
				return getWhen();
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
				return getWhere();
			case QvtoperationalPackage.MAPPING_OPERATION__MAPPING_FULL_HEADER:
				return getMapping_full_header();
			case QvtoperationalPackage.MAPPING_OPERATION__MAPPING_BODY:
				return getMapping_body();
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
			case QvtoperationalPackage.MAPPING_OPERATION__NESTED_PACKAGE:
				getNestedPackage().clear();
				getNestedPackage().addAll((Collection<? extends EMOF.Package>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__NESTING_PACKAGE:
				setNestingPackage((EMOF.Package)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends Type>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__URI:
				setUri((String)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__CONFIG_PROPERTY:
				getConfigProperty().clear();
				getConfigProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__ENTRY:
				setEntry((EntryOperation)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__MODULE_IMPORT:
				getModuleImport().clear();
				getModuleImport().addAll((Collection<? extends ModuleImport>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_TAG:
				getOwnedTag().clear();
				getOwnedTag().addAll((Collection<? extends Tag>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_VARIABLE:
				getOwnedVariable().clear();
				getOwnedVariable().addAll((Collection<? extends ExpressionGO>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__USED_MODEL_TYPE:
				getUsedModelType().clear();
				getUsedModelType().addAll((Collection<? extends ModelType>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__DISJUNCT:
				getDisjunct().clear();
				getDisjunct().addAll((Collection<? extends MappingOperation>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__INHERITED:
				getInherited().clear();
				getInherited().addAll((Collection<? extends MappingOperation>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__MERGED:
				getMerged().clear();
				getMerged().addAll((Collection<? extends MappingOperation>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION:
				setRefinedRelation((ExpressionGO)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
				setWhen((ExpressionGO)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
				setWhere((ExpressionGO)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__MAPPING_FULL_HEADER:
				setMapping_full_header((MappingFullHeader)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__MAPPING_BODY:
				setMapping_body((MappingBody)newValue);
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
			case QvtoperationalPackage.MAPPING_OPERATION__NESTED_PACKAGE:
				getNestedPackage().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__NESTING_PACKAGE:
				setNestingPackage((EMOF.Package)null);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_TYPE:
				getOwnedType().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__URI:
				setUri(URI_EDEFAULT);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__CONFIG_PROPERTY:
				getConfigProperty().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__ENTRY:
				setEntry((EntryOperation)null);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__MODULE_IMPORT:
				getModuleImport().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_TAG:
				getOwnedTag().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_VARIABLE:
				getOwnedVariable().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__USED_MODEL_TYPE:
				getUsedModelType().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__DISJUNCT:
				getDisjunct().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__INHERITED:
				getInherited().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__MERGED:
				getMerged().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION:
				setRefinedRelation((ExpressionGO)null);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
				setWhen((ExpressionGO)null);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
				setWhere((ExpressionGO)null);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__MAPPING_FULL_HEADER:
				setMapping_full_header((MappingFullHeader)null);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__MAPPING_BODY:
				setMapping_body((MappingBody)null);
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
			case QvtoperationalPackage.MAPPING_OPERATION__NESTED_PACKAGE:
				return nestedPackage != null && !nestedPackage.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__NESTING_PACKAGE:
				return getNestingPackage() != null;
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_TYPE:
				return ownedType != null && !ownedType.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case QvtoperationalPackage.MAPPING_OPERATION__CONFIG_PROPERTY:
				return configProperty != null && !configProperty.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__ENTRY:
				return entry != null;
			case QvtoperationalPackage.MAPPING_OPERATION__MODULE_IMPORT:
				return moduleImport != null && !moduleImport.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_TAG:
				return ownedTag != null && !ownedTag.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__OWNED_VARIABLE:
				return ownedVariable != null && !ownedVariable.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__USED_MODEL_TYPE:
				return usedModelType != null && !usedModelType.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__DISJUNCT:
				return disjunct != null && !disjunct.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__INHERITED:
				return inherited != null && !inherited.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__MERGED:
				return merged != null && !merged.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION:
				return refinedRelation != null;
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
				return when != null;
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
				return where != null;
			case QvtoperationalPackage.MAPPING_OPERATION__MAPPING_FULL_HEADER:
				return mapping_full_header != null;
			case QvtoperationalPackage.MAPPING_OPERATION__MAPPING_BODY:
				return mapping_body != null;
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
				case QvtoperationalPackage.MAPPING_OPERATION__NESTED_PACKAGE: return EMOFPackage.PACKAGE__NESTED_PACKAGE;
				case QvtoperationalPackage.MAPPING_OPERATION__NESTING_PACKAGE: return EMOFPackage.PACKAGE__NESTING_PACKAGE;
				case QvtoperationalPackage.MAPPING_OPERATION__OWNED_TYPE: return EMOFPackage.PACKAGE__OWNED_TYPE;
				case QvtoperationalPackage.MAPPING_OPERATION__URI: return EMOFPackage.PACKAGE__URI;
				default: return -1;
			}
		}
		if (baseClass == qvtoperational.Module.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.MAPPING_OPERATION__CONFIG_PROPERTY: return QvtoperationalPackage.MODULE__CONFIG_PROPERTY;
				case QvtoperationalPackage.MAPPING_OPERATION__ENTRY: return QvtoperationalPackage.MODULE__ENTRY;
				case QvtoperationalPackage.MAPPING_OPERATION__MODULE_IMPORT: return QvtoperationalPackage.MODULE__MODULE_IMPORT;
				case QvtoperationalPackage.MAPPING_OPERATION__OWNED_TAG: return QvtoperationalPackage.MODULE__OWNED_TAG;
				case QvtoperationalPackage.MAPPING_OPERATION__OWNED_VARIABLE: return QvtoperationalPackage.MODULE__OWNED_VARIABLE;
				case QvtoperationalPackage.MAPPING_OPERATION__USED_MODEL_TYPE: return QvtoperationalPackage.MODULE__USED_MODEL_TYPE;
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
				case EMOFPackage.PACKAGE__NESTED_PACKAGE: return QvtoperationalPackage.MAPPING_OPERATION__NESTED_PACKAGE;
				case EMOFPackage.PACKAGE__NESTING_PACKAGE: return QvtoperationalPackage.MAPPING_OPERATION__NESTING_PACKAGE;
				case EMOFPackage.PACKAGE__OWNED_TYPE: return QvtoperationalPackage.MAPPING_OPERATION__OWNED_TYPE;
				case EMOFPackage.PACKAGE__URI: return QvtoperationalPackage.MAPPING_OPERATION__URI;
				default: return -1;
			}
		}
		if (baseClass == qvtoperational.Module.class) {
			switch (baseFeatureID) {
				case QvtoperationalPackage.MODULE__CONFIG_PROPERTY: return QvtoperationalPackage.MAPPING_OPERATION__CONFIG_PROPERTY;
				case QvtoperationalPackage.MODULE__ENTRY: return QvtoperationalPackage.MAPPING_OPERATION__ENTRY;
				case QvtoperationalPackage.MODULE__MODULE_IMPORT: return QvtoperationalPackage.MAPPING_OPERATION__MODULE_IMPORT;
				case QvtoperationalPackage.MODULE__OWNED_TAG: return QvtoperationalPackage.MAPPING_OPERATION__OWNED_TAG;
				case QvtoperationalPackage.MODULE__OWNED_VARIABLE: return QvtoperationalPackage.MAPPING_OPERATION__OWNED_VARIABLE;
				case QvtoperationalPackage.MODULE__USED_MODEL_TYPE: return QvtoperationalPackage.MAPPING_OPERATION__USED_MODEL_TYPE;
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

} //MappingOperationImpl
