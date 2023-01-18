/**
 */
package qvtoperational.impl;

import emof.Comment;
import emof.Element;
import emof.EmofPackage;
import emof.NamedElement;
import emof.Operation;
import emof.Property;
import emof.Tag;
import emof.Type;

import emof.impl.URIExtentImpl;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import qvtoperational.ExpressionBlock;
import qvtoperational.ExpressionGO;
import qvtoperational.ModelType;
import qvtoperational.ModuleImport;
import qvtoperational.PackageRefGO;
import qvtoperational.QvtoperationalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getOwnedTag <em>Owned Tag</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getConfigProperty <em>Config Property</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getModuleImport <em>Module Import</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getUsedModelType <em>Used Model Type</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getIsBlackbox <em>Is Blackbox</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getOwnedVariable <em>Owned Variable</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getAdditionalCondition <em>Additional Condition</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getConformanceKind <em>Conformance Kind</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getCompliance_kind <em>Compliance kind</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getPackageref_list <em>Packageref list</em>}</li>
 *   <li>{@link qvtoperational.impl.ModelTypeImpl#getModeltype_where <em>Modeltype where</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelTypeImpl extends URIExtentImpl implements ModelType {
	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tag;

	/**
	 * The cached value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComment()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> ownedComment;

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
	 * The cached value of the '{@link #getOwnedType() <em>Owned Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> ownedType;

	/**
	 * The cached value of the '{@link #getNestedPackage() <em>Nested Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<emof.Package> nestedPackage;

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
	 * The cached value of the '{@link #getOwnedTag() <em>Owned Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> ownedTag;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Operation entry;

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
	 * The cached value of the '{@link #getModuleImport() <em>Module Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleImport()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleImport> moduleImport;

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
	 * The default value of the '{@link #getIsBlackbox() <em>Is Blackbox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBlackbox()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_BLACKBOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsBlackbox() <em>Is Blackbox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBlackbox()
	 * @generated
	 * @ordered
	 */
	protected Boolean isBlackbox = IS_BLACKBOX_EDEFAULT;

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
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected EList<emof.Class> superClass;

	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected EList<emof.Package> metamodel;

	/**
	 * The cached value of the '{@link #getAdditionalCondition() <em>Additional Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionGO> additionalCondition;

	/**
	 * The default value of the '{@link #getConformanceKind() <em>Conformance Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformanceKind()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFORMANCE_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConformanceKind() <em>Conformance Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformanceKind()
	 * @generated
	 * @ordered
	 */
	protected String conformanceKind = CONFORMANCE_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompliance_kind() <em>Compliance kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliance_kind()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLIANCE_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompliance_kind() <em>Compliance kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliance_kind()
	 * @generated
	 * @ordered
	 */
	protected String compliance_kind = COMPLIANCE_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackageref_list() <em>Packageref list</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageref_list()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRefGO> packageref_list;

	/**
	 * The cached value of the '{@link #getModeltype_where() <em>Modeltype where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeltype_where()
	 * @generated
	 * @ordered
	 */
	protected ExpressionBlock modeltype_where;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.MODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTag() {
		if (tag == null) {
			tag = new EObjectWithInverseResolvingEList.ManyInverse<Tag>(Tag.class, this, QvtoperationalPackage.MODEL_TYPE__TAG, EmofPackage.TAG__ELEMENT);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getOwnedComment() {
		if (ownedComment == null) {
			ownedComment = new EObjectContainmentEList<Comment>(Comment.class, this, QvtoperationalPackage.MODEL_TYPE__OWNED_COMMENT);
		}
		return ownedComment;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODEL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getOwnedType() {
		if (ownedType == null) {
			ownedType = new EObjectContainmentWithInverseEList<Type>(Type.class, this, QvtoperationalPackage.MODEL_TYPE__OWNED_TYPE, EmofPackage.TYPE__PACKAGE);
		}
		return ownedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<emof.Package> getNestedPackage() {
		if (nestedPackage == null) {
			nestedPackage = new EObjectContainmentEList<emof.Package>(emof.Package.class, this, QvtoperationalPackage.MODEL_TYPE__NESTED_PACKAGE);
		}
		return nestedPackage;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODEL_TYPE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getOwnedTag() {
		if (ownedTag == null) {
			ownedTag = new EObjectContainmentEList<Tag>(Tag.class, this, QvtoperationalPackage.MODEL_TYPE__OWNED_TAG);
		}
		return ownedTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getEntry() {
		if (entry != null && entry.eIsProxy()) {
			InternalEObject oldEntry = (InternalEObject)entry;
			entry = (Operation)eResolveProxy(oldEntry);
			if (entry != oldEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.MODEL_TYPE__ENTRY, oldEntry, entry));
			}
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(Operation newEntry) {
		Operation oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODEL_TYPE__ENTRY, oldEntry, entry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getConfigProperty() {
		if (configProperty == null) {
			configProperty = new EObjectResolvingEList<Property>(Property.class, this, QvtoperationalPackage.MODEL_TYPE__CONFIG_PROPERTY);
		}
		return configProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleImport> getModuleImport() {
		if (moduleImport == null) {
			moduleImport = new EObjectContainmentWithInverseEList<ModuleImport>(ModuleImport.class, this, QvtoperationalPackage.MODEL_TYPE__MODULE_IMPORT, QvtoperationalPackage.MODULE_IMPORT__MODULE);
		}
		return moduleImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelType> getUsedModelType() {
		if (usedModelType == null) {
			usedModelType = new EObjectResolvingEList<ModelType>(ModelType.class, this, QvtoperationalPackage.MODEL_TYPE__USED_MODEL_TYPE);
		}
		return usedModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsBlackbox() {
		return isBlackbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBlackbox(Boolean newIsBlackbox) {
		Boolean oldIsBlackbox = isBlackbox;
		isBlackbox = newIsBlackbox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODEL_TYPE__IS_BLACKBOX, oldIsBlackbox, isBlackbox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionGO> getOwnedVariable() {
		if (ownedVariable == null) {
			ownedVariable = new EObjectContainmentEList<ExpressionGO>(ExpressionGO.class, this, QvtoperationalPackage.MODEL_TYPE__OWNED_VARIABLE);
		}
		return ownedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public emof.Package getPackage() {
		if (eContainerFeatureID() != QvtoperationalPackage.MODEL_TYPE__PACKAGE) return null;
		return (emof.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(emof.Package newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, QvtoperationalPackage.MODEL_TYPE__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(emof.Package newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != QvtoperationalPackage.MODEL_TYPE__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, EmofPackage.PACKAGE__OWNED_TYPE, emof.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODEL_TYPE__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentWithInverseEList<Property>(Property.class, this, QvtoperationalPackage.MODEL_TYPE__OWNED_ATTRIBUTE, EmofPackage.PROPERTY__CLASS);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, QvtoperationalPackage.MODEL_TYPE__OWNED_OPERATION, EmofPackage.OPERATION__CLASS);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<emof.Class> getSuperClass() {
		if (superClass == null) {
			superClass = new EObjectResolvingEList<emof.Class>(emof.Class.class, this, QvtoperationalPackage.MODEL_TYPE__SUPER_CLASS);
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(Boolean newIsAbstract) {
		Boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODEL_TYPE__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<emof.Package> getMetamodel() {
		if (metamodel == null) {
			metamodel = new EObjectResolvingEList<emof.Package>(emof.Package.class, this, QvtoperationalPackage.MODEL_TYPE__METAMODEL);
		}
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionGO> getAdditionalCondition() {
		if (additionalCondition == null) {
			additionalCondition = new EObjectContainmentEList<ExpressionGO>(ExpressionGO.class, this, QvtoperationalPackage.MODEL_TYPE__ADDITIONAL_CONDITION);
		}
		return additionalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConformanceKind() {
		return conformanceKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformanceKind(String newConformanceKind) {
		String oldConformanceKind = conformanceKind;
		conformanceKind = newConformanceKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODEL_TYPE__CONFORMANCE_KIND, oldConformanceKind, conformanceKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompliance_kind() {
		return compliance_kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompliance_kind(String newCompliance_kind) {
		String oldCompliance_kind = compliance_kind;
		compliance_kind = newCompliance_kind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODEL_TYPE__COMPLIANCE_KIND, oldCompliance_kind, compliance_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRefGO> getPackageref_list() {
		if (packageref_list == null) {
			packageref_list = new EObjectContainmentEList<PackageRefGO>(PackageRefGO.class, this, QvtoperationalPackage.MODEL_TYPE__PACKAGEREF_LIST);
		}
		return packageref_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionBlock getModeltype_where() {
		return modeltype_where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModeltype_where(ExpressionBlock newModeltype_where, NotificationChain msgs) {
		ExpressionBlock oldModeltype_where = modeltype_where;
		modeltype_where = newModeltype_where;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODEL_TYPE__MODELTYPE_WHERE, oldModeltype_where, newModeltype_where);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeltype_where(ExpressionBlock newModeltype_where) {
		if (newModeltype_where != modeltype_where) {
			NotificationChain msgs = null;
			if (modeltype_where != null)
				msgs = ((InternalEObject)modeltype_where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MODEL_TYPE__MODELTYPE_WHERE, null, msgs);
			if (newModeltype_where != null)
				msgs = ((InternalEObject)newModeltype_where).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.MODEL_TYPE__MODELTYPE_WHERE, null, msgs);
			msgs = basicSetModeltype_where(newModeltype_where, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODEL_TYPE__MODELTYPE_WHERE, newModeltype_where, newModeltype_where));
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
			case QvtoperationalPackage.MODEL_TYPE__TAG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTag()).basicAdd(otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__OWNED_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedType()).basicAdd(otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__MODULE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModuleImport()).basicAdd(otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((emof.Package)otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__OWNED_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedAttribute()).basicAdd(otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__OWNED_OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperation()).basicAdd(otherEnd, msgs);
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
			case QvtoperationalPackage.MODEL_TYPE__TAG:
				return ((InternalEList<?>)getTag()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__OWNED_TYPE:
				return ((InternalEList<?>)getOwnedType()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__NESTED_PACKAGE:
				return ((InternalEList<?>)getNestedPackage()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__OWNED_TAG:
				return ((InternalEList<?>)getOwnedTag()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__MODULE_IMPORT:
				return ((InternalEList<?>)getModuleImport()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__OWNED_VARIABLE:
				return ((InternalEList<?>)getOwnedVariable()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__PACKAGE:
				return basicSetPackage(null, msgs);
			case QvtoperationalPackage.MODEL_TYPE__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__ADDITIONAL_CONDITION:
				return ((InternalEList<?>)getAdditionalCondition()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__PACKAGEREF_LIST:
				return ((InternalEList<?>)getPackageref_list()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MODEL_TYPE__MODELTYPE_WHERE:
				return basicSetModeltype_where(null, msgs);
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
			case QvtoperationalPackage.MODEL_TYPE__PACKAGE:
				return eInternalContainer().eInverseRemove(this, EmofPackage.PACKAGE__OWNED_TYPE, emof.Package.class, msgs);
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
			case QvtoperationalPackage.MODEL_TYPE__TAG:
				return getTag();
			case QvtoperationalPackage.MODEL_TYPE__OWNED_COMMENT:
				return getOwnedComment();
			case QvtoperationalPackage.MODEL_TYPE__NAME:
				return getName();
			case QvtoperationalPackage.MODEL_TYPE__OWNED_TYPE:
				return getOwnedType();
			case QvtoperationalPackage.MODEL_TYPE__NESTED_PACKAGE:
				return getNestedPackage();
			case QvtoperationalPackage.MODEL_TYPE__URI:
				return getUri();
			case QvtoperationalPackage.MODEL_TYPE__OWNED_TAG:
				return getOwnedTag();
			case QvtoperationalPackage.MODEL_TYPE__ENTRY:
				if (resolve) return getEntry();
				return basicGetEntry();
			case QvtoperationalPackage.MODEL_TYPE__CONFIG_PROPERTY:
				return getConfigProperty();
			case QvtoperationalPackage.MODEL_TYPE__MODULE_IMPORT:
				return getModuleImport();
			case QvtoperationalPackage.MODEL_TYPE__USED_MODEL_TYPE:
				return getUsedModelType();
			case QvtoperationalPackage.MODEL_TYPE__IS_BLACKBOX:
				return getIsBlackbox();
			case QvtoperationalPackage.MODEL_TYPE__OWNED_VARIABLE:
				return getOwnedVariable();
			case QvtoperationalPackage.MODEL_TYPE__PACKAGE:
				return getPackage();
			case QvtoperationalPackage.MODEL_TYPE__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case QvtoperationalPackage.MODEL_TYPE__OWNED_OPERATION:
				return getOwnedOperation();
			case QvtoperationalPackage.MODEL_TYPE__SUPER_CLASS:
				return getSuperClass();
			case QvtoperationalPackage.MODEL_TYPE__IS_ABSTRACT:
				return getIsAbstract();
			case QvtoperationalPackage.MODEL_TYPE__METAMODEL:
				return getMetamodel();
			case QvtoperationalPackage.MODEL_TYPE__ADDITIONAL_CONDITION:
				return getAdditionalCondition();
			case QvtoperationalPackage.MODEL_TYPE__CONFORMANCE_KIND:
				return getConformanceKind();
			case QvtoperationalPackage.MODEL_TYPE__COMPLIANCE_KIND:
				return getCompliance_kind();
			case QvtoperationalPackage.MODEL_TYPE__PACKAGEREF_LIST:
				return getPackageref_list();
			case QvtoperationalPackage.MODEL_TYPE__MODELTYPE_WHERE:
				return getModeltype_where();
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
			case QvtoperationalPackage.MODEL_TYPE__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends Tag>)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__OWNED_COMMENT:
				getOwnedComment().clear();
				getOwnedComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__NAME:
				setName((String)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends Type>)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__NESTED_PACKAGE:
				getNestedPackage().clear();
				getNestedPackage().addAll((Collection<? extends emof.Package>)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__URI:
				setUri((String)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__OWNED_TAG:
				getOwnedTag().clear();
				getOwnedTag().addAll((Collection<? extends Tag>)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__ENTRY:
				setEntry((Operation)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__CONFIG_PROPERTY:
				getConfigProperty().clear();
				getConfigProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__MODULE_IMPORT:
				getModuleImport().clear();
				getModuleImport().addAll((Collection<? extends ModuleImport>)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__USED_MODEL_TYPE:
				getUsedModelType().clear();
				getUsedModelType().addAll((Collection<? extends ModelType>)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__IS_BLACKBOX:
				setIsBlackbox((Boolean)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__OWNED_VARIABLE:
				getOwnedVariable().clear();
				getOwnedVariable().addAll((Collection<? extends ExpressionGO>)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__PACKAGE:
				setPackage((emof.Package)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__SUPER_CLASS:
				getSuperClass().clear();
				getSuperClass().addAll((Collection<? extends emof.Class>)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__METAMODEL:
				getMetamodel().clear();
				getMetamodel().addAll((Collection<? extends emof.Package>)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__ADDITIONAL_CONDITION:
				getAdditionalCondition().clear();
				getAdditionalCondition().addAll((Collection<? extends ExpressionGO>)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__CONFORMANCE_KIND:
				setConformanceKind((String)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__COMPLIANCE_KIND:
				setCompliance_kind((String)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__PACKAGEREF_LIST:
				getPackageref_list().clear();
				getPackageref_list().addAll((Collection<? extends PackageRefGO>)newValue);
				return;
			case QvtoperationalPackage.MODEL_TYPE__MODELTYPE_WHERE:
				setModeltype_where((ExpressionBlock)newValue);
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
			case QvtoperationalPackage.MODEL_TYPE__TAG:
				getTag().clear();
				return;
			case QvtoperationalPackage.MODEL_TYPE__OWNED_COMMENT:
				getOwnedComment().clear();
				return;
			case QvtoperationalPackage.MODEL_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QvtoperationalPackage.MODEL_TYPE__OWNED_TYPE:
				getOwnedType().clear();
				return;
			case QvtoperationalPackage.MODEL_TYPE__NESTED_PACKAGE:
				getNestedPackage().clear();
				return;
			case QvtoperationalPackage.MODEL_TYPE__URI:
				setUri(URI_EDEFAULT);
				return;
			case QvtoperationalPackage.MODEL_TYPE__OWNED_TAG:
				getOwnedTag().clear();
				return;
			case QvtoperationalPackage.MODEL_TYPE__ENTRY:
				setEntry((Operation)null);
				return;
			case QvtoperationalPackage.MODEL_TYPE__CONFIG_PROPERTY:
				getConfigProperty().clear();
				return;
			case QvtoperationalPackage.MODEL_TYPE__MODULE_IMPORT:
				getModuleImport().clear();
				return;
			case QvtoperationalPackage.MODEL_TYPE__USED_MODEL_TYPE:
				getUsedModelType().clear();
				return;
			case QvtoperationalPackage.MODEL_TYPE__IS_BLACKBOX:
				setIsBlackbox(IS_BLACKBOX_EDEFAULT);
				return;
			case QvtoperationalPackage.MODEL_TYPE__OWNED_VARIABLE:
				getOwnedVariable().clear();
				return;
			case QvtoperationalPackage.MODEL_TYPE__PACKAGE:
				setPackage((emof.Package)null);
				return;
			case QvtoperationalPackage.MODEL_TYPE__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case QvtoperationalPackage.MODEL_TYPE__OWNED_OPERATION:
				getOwnedOperation().clear();
				return;
			case QvtoperationalPackage.MODEL_TYPE__SUPER_CLASS:
				getSuperClass().clear();
				return;
			case QvtoperationalPackage.MODEL_TYPE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case QvtoperationalPackage.MODEL_TYPE__METAMODEL:
				getMetamodel().clear();
				return;
			case QvtoperationalPackage.MODEL_TYPE__ADDITIONAL_CONDITION:
				getAdditionalCondition().clear();
				return;
			case QvtoperationalPackage.MODEL_TYPE__CONFORMANCE_KIND:
				setConformanceKind(CONFORMANCE_KIND_EDEFAULT);
				return;
			case QvtoperationalPackage.MODEL_TYPE__COMPLIANCE_KIND:
				setCompliance_kind(COMPLIANCE_KIND_EDEFAULT);
				return;
			case QvtoperationalPackage.MODEL_TYPE__PACKAGEREF_LIST:
				getPackageref_list().clear();
				return;
			case QvtoperationalPackage.MODEL_TYPE__MODELTYPE_WHERE:
				setModeltype_where((ExpressionBlock)null);
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
			case QvtoperationalPackage.MODEL_TYPE__TAG:
				return tag != null && !tag.isEmpty();
			case QvtoperationalPackage.MODEL_TYPE__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case QvtoperationalPackage.MODEL_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QvtoperationalPackage.MODEL_TYPE__OWNED_TYPE:
				return ownedType != null && !ownedType.isEmpty();
			case QvtoperationalPackage.MODEL_TYPE__NESTED_PACKAGE:
				return nestedPackage != null && !nestedPackage.isEmpty();
			case QvtoperationalPackage.MODEL_TYPE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case QvtoperationalPackage.MODEL_TYPE__OWNED_TAG:
				return ownedTag != null && !ownedTag.isEmpty();
			case QvtoperationalPackage.MODEL_TYPE__ENTRY:
				return entry != null;
			case QvtoperationalPackage.MODEL_TYPE__CONFIG_PROPERTY:
				return configProperty != null && !configProperty.isEmpty();
			case QvtoperationalPackage.MODEL_TYPE__MODULE_IMPORT:
				return moduleImport != null && !moduleImport.isEmpty();
			case QvtoperationalPackage.MODEL_TYPE__USED_MODEL_TYPE:
				return usedModelType != null && !usedModelType.isEmpty();
			case QvtoperationalPackage.MODEL_TYPE__IS_BLACKBOX:
				return IS_BLACKBOX_EDEFAULT == null ? isBlackbox != null : !IS_BLACKBOX_EDEFAULT.equals(isBlackbox);
			case QvtoperationalPackage.MODEL_TYPE__OWNED_VARIABLE:
				return ownedVariable != null && !ownedVariable.isEmpty();
			case QvtoperationalPackage.MODEL_TYPE__PACKAGE:
				return getPackage() != null;
			case QvtoperationalPackage.MODEL_TYPE__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case QvtoperationalPackage.MODEL_TYPE__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case QvtoperationalPackage.MODEL_TYPE__SUPER_CLASS:
				return superClass != null && !superClass.isEmpty();
			case QvtoperationalPackage.MODEL_TYPE__IS_ABSTRACT:
				return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
			case QvtoperationalPackage.MODEL_TYPE__METAMODEL:
				return metamodel != null && !metamodel.isEmpty();
			case QvtoperationalPackage.MODEL_TYPE__ADDITIONAL_CONDITION:
				return additionalCondition != null && !additionalCondition.isEmpty();
			case QvtoperationalPackage.MODEL_TYPE__CONFORMANCE_KIND:
				return CONFORMANCE_KIND_EDEFAULT == null ? conformanceKind != null : !CONFORMANCE_KIND_EDEFAULT.equals(conformanceKind);
			case QvtoperationalPackage.MODEL_TYPE__COMPLIANCE_KIND:
				return COMPLIANCE_KIND_EDEFAULT == null ? compliance_kind != null : !COMPLIANCE_KIND_EDEFAULT.equals(compliance_kind);
			case QvtoperationalPackage.MODEL_TYPE__PACKAGEREF_LIST:
				return packageref_list != null && !packageref_list.isEmpty();
			case QvtoperationalPackage.MODEL_TYPE__MODELTYPE_WHERE:
				return modeltype_where != null;
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
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.MODEL_TYPE__TAG: return EmofPackage.ELEMENT__TAG;
				case QvtoperationalPackage.MODEL_TYPE__OWNED_COMMENT: return EmofPackage.ELEMENT__OWNED_COMMENT;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.MODEL_TYPE__NAME: return EmofPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == emof.Package.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.MODEL_TYPE__OWNED_TYPE: return EmofPackage.PACKAGE__OWNED_TYPE;
				case QvtoperationalPackage.MODEL_TYPE__NESTED_PACKAGE: return EmofPackage.PACKAGE__NESTED_PACKAGE;
				case QvtoperationalPackage.MODEL_TYPE__URI: return EmofPackage.PACKAGE__URI;
				default: return -1;
			}
		}
		if (baseClass == qvtoperational.Module.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.MODEL_TYPE__OWNED_TAG: return QvtoperationalPackage.MODULE__OWNED_TAG;
				case QvtoperationalPackage.MODEL_TYPE__ENTRY: return QvtoperationalPackage.MODULE__ENTRY;
				case QvtoperationalPackage.MODEL_TYPE__CONFIG_PROPERTY: return QvtoperationalPackage.MODULE__CONFIG_PROPERTY;
				case QvtoperationalPackage.MODEL_TYPE__MODULE_IMPORT: return QvtoperationalPackage.MODULE__MODULE_IMPORT;
				case QvtoperationalPackage.MODEL_TYPE__USED_MODEL_TYPE: return QvtoperationalPackage.MODULE__USED_MODEL_TYPE;
				case QvtoperationalPackage.MODEL_TYPE__IS_BLACKBOX: return QvtoperationalPackage.MODULE__IS_BLACKBOX;
				case QvtoperationalPackage.MODEL_TYPE__OWNED_VARIABLE: return QvtoperationalPackage.MODULE__OWNED_VARIABLE;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.MODEL_TYPE__PACKAGE: return EmofPackage.TYPE__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == emof.Class.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.MODEL_TYPE__OWNED_ATTRIBUTE: return EmofPackage.CLASS__OWNED_ATTRIBUTE;
				case QvtoperationalPackage.MODEL_TYPE__OWNED_OPERATION: return EmofPackage.CLASS__OWNED_OPERATION;
				case QvtoperationalPackage.MODEL_TYPE__SUPER_CLASS: return EmofPackage.CLASS__SUPER_CLASS;
				case QvtoperationalPackage.MODEL_TYPE__IS_ABSTRACT: return EmofPackage.CLASS__IS_ABSTRACT;
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
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
				case EmofPackage.ELEMENT__TAG: return QvtoperationalPackage.MODEL_TYPE__TAG;
				case EmofPackage.ELEMENT__OWNED_COMMENT: return QvtoperationalPackage.MODEL_TYPE__OWNED_COMMENT;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case EmofPackage.NAMED_ELEMENT__NAME: return QvtoperationalPackage.MODEL_TYPE__NAME;
				default: return -1;
			}
		}
		if (baseClass == emof.Package.class) {
			switch (baseFeatureID) {
				case EmofPackage.PACKAGE__OWNED_TYPE: return QvtoperationalPackage.MODEL_TYPE__OWNED_TYPE;
				case EmofPackage.PACKAGE__NESTED_PACKAGE: return QvtoperationalPackage.MODEL_TYPE__NESTED_PACKAGE;
				case EmofPackage.PACKAGE__URI: return QvtoperationalPackage.MODEL_TYPE__URI;
				default: return -1;
			}
		}
		if (baseClass == qvtoperational.Module.class) {
			switch (baseFeatureID) {
				case QvtoperationalPackage.MODULE__OWNED_TAG: return QvtoperationalPackage.MODEL_TYPE__OWNED_TAG;
				case QvtoperationalPackage.MODULE__ENTRY: return QvtoperationalPackage.MODEL_TYPE__ENTRY;
				case QvtoperationalPackage.MODULE__CONFIG_PROPERTY: return QvtoperationalPackage.MODEL_TYPE__CONFIG_PROPERTY;
				case QvtoperationalPackage.MODULE__MODULE_IMPORT: return QvtoperationalPackage.MODEL_TYPE__MODULE_IMPORT;
				case QvtoperationalPackage.MODULE__USED_MODEL_TYPE: return QvtoperationalPackage.MODEL_TYPE__USED_MODEL_TYPE;
				case QvtoperationalPackage.MODULE__IS_BLACKBOX: return QvtoperationalPackage.MODEL_TYPE__IS_BLACKBOX;
				case QvtoperationalPackage.MODULE__OWNED_VARIABLE: return QvtoperationalPackage.MODEL_TYPE__OWNED_VARIABLE;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case EmofPackage.TYPE__PACKAGE: return QvtoperationalPackage.MODEL_TYPE__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == emof.Class.class) {
			switch (baseFeatureID) {
				case EmofPackage.CLASS__OWNED_ATTRIBUTE: return QvtoperationalPackage.MODEL_TYPE__OWNED_ATTRIBUTE;
				case EmofPackage.CLASS__OWNED_OPERATION: return QvtoperationalPackage.MODEL_TYPE__OWNED_OPERATION;
				case EmofPackage.CLASS__SUPER_CLASS: return QvtoperationalPackage.MODEL_TYPE__SUPER_CLASS;
				case EmofPackage.CLASS__IS_ABSTRACT: return QvtoperationalPackage.MODEL_TYPE__IS_ABSTRACT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", uri: ");
		result.append(uri);
		result.append(", isBlackbox: ");
		result.append(isBlackbox);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", conformanceKind: ");
		result.append(conformanceKind);
		result.append(", compliance_kind: ");
		result.append(compliance_kind);
		result.append(')');
		return result.toString();
	}

} //ModelTypeImpl
