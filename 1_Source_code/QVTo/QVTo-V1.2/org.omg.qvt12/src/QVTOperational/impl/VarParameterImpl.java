/**
 */
package QVTOperational.impl;

import EMOF.Comment;
import EMOF.EMOFPackage;
import EMOF.Element;
import EMOF.MultiplicityElement;
import EMOF.NamedElement;
import EMOF.Operation;
import EMOF.Parameter;
import EMOF.Property;
import EMOF.Type;
import EMOF.TypedElement;
import QVTOperational.Declarator;
import QVTOperational.DirectionKind;
import QVTOperational.ImperativeOperation;
import QVTOperational.QVTOperationalPackage;
import QVTOperational.VarParameter;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.VarParameterImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link QVTOperational.impl.VarParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link QVTOperational.impl.VarParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link QVTOperational.impl.VarParameterImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link QVTOperational.impl.VarParameterImpl#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link QVTOperational.impl.VarParameterImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link QVTOperational.impl.VarParameterImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link QVTOperational.impl.VarParameterImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link QVTOperational.impl.VarParameterImpl#getCtxOwner <em>Ctx Owner</em>}</li>
 *   <li>{@link QVTOperational.impl.VarParameterImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link QVTOperational.impl.VarParameterImpl#getResOwner <em>Res Owner</em>}</li>
 *   <li>{@link QVTOperational.impl.VarParameterImpl#getDeclarator <em>Declarator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarParameterImpl extends ExpressionGOImpl implements VarParameter {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ORDERED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected Boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_UNIQUE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected Boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected Integer lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected Integer upper = UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionKind KIND_EDEFAULT = DirectionKind.IN;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DirectionKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclarator() <em>Declarator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarator()
	 * @generated
	 * @ordered
	 */
	protected Declarator declarator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.VAR_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getOwnedComment() {
		if (ownedComment == null) {
			ownedComment = new EObjectContainmentEList<Comment>(Comment.class, this, QVTOperationalPackage.VAR_PARAMETER__OWNED_COMMENT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.VAR_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QVTOperationalPackage.VAR_PARAMETER__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.VAR_PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(Boolean newIsOrdered) {
		Boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.VAR_PARAMETER__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(Boolean newIsUnique) {
		Boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.VAR_PARAMETER__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(Integer newLower) {
		Integer oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.VAR_PARAMETER__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(Integer newUpper) {
		Integer oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.VAR_PARAMETER__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (eContainerFeatureID() != QVTOperationalPackage.VAR_PARAMETER__OPERATION) return null;
		return (Operation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOperation, QVTOperationalPackage.VAR_PARAMETER__OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		if (newOperation != eInternalContainer() || (eContainerFeatureID() != QVTOperationalPackage.VAR_PARAMETER__OPERATION && newOperation != null)) {
			if (EcoreUtil.isAncestor(this, newOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EMOFPackage.OPERATION__OWNED_PARAMETER, Operation.class, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.VAR_PARAMETER__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOperation getCtxOwner() {
		if (eContainerFeatureID() != QVTOperationalPackage.VAR_PARAMETER__CTX_OWNER) return null;
		return (ImperativeOperation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCtxOwner(ImperativeOperation newCtxOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCtxOwner, QVTOperationalPackage.VAR_PARAMETER__CTX_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtxOwner(ImperativeOperation newCtxOwner) {
		if (newCtxOwner != eInternalContainer() || (eContainerFeatureID() != QVTOperationalPackage.VAR_PARAMETER__CTX_OWNER && newCtxOwner != null)) {
			if (EcoreUtil.isAncestor(this, newCtxOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCtxOwner != null)
				msgs = ((InternalEObject)newCtxOwner).eInverseAdd(this, QVTOperationalPackage.IMPERATIVE_OPERATION__CONTEXT, ImperativeOperation.class, msgs);
			msgs = basicSetCtxOwner(newCtxOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.VAR_PARAMETER__CTX_OWNER, newCtxOwner, newCtxOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(DirectionKind newKind) {
		DirectionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.VAR_PARAMETER__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOperation getResOwner() {
		if (eContainerFeatureID() != QVTOperationalPackage.VAR_PARAMETER__RES_OWNER) return null;
		return (ImperativeOperation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResOwner(ImperativeOperation newResOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResOwner, QVTOperationalPackage.VAR_PARAMETER__RES_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResOwner(ImperativeOperation newResOwner) {
		if (newResOwner != eInternalContainer() || (eContainerFeatureID() != QVTOperationalPackage.VAR_PARAMETER__RES_OWNER && newResOwner != null)) {
			if (EcoreUtil.isAncestor(this, newResOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResOwner != null)
				msgs = ((InternalEObject)newResOwner).eInverseAdd(this, QVTOperationalPackage.IMPERATIVE_OPERATION__RESULT, ImperativeOperation.class, msgs);
			msgs = basicSetResOwner(newResOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.VAR_PARAMETER__RES_OWNER, newResOwner, newResOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declarator getDeclarator() {
		return declarator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclarator(Declarator newDeclarator, NotificationChain msgs) {
		Declarator oldDeclarator = declarator;
		declarator = newDeclarator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.VAR_PARAMETER__DECLARATOR, oldDeclarator, newDeclarator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclarator(Declarator newDeclarator) {
		if (newDeclarator != declarator) {
			NotificationChain msgs = null;
			if (declarator != null)
				msgs = ((InternalEObject)declarator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.VAR_PARAMETER__DECLARATOR, null, msgs);
			if (newDeclarator != null)
				msgs = ((InternalEObject)newDeclarator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.VAR_PARAMETER__DECLARATOR, null, msgs);
			msgs = basicSetDeclarator(newDeclarator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.VAR_PARAMETER__DECLARATOR, newDeclarator, newDeclarator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element container() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean equals(EMOF.Object object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOF.Object get(Property property) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOF.Class getMetaClass() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isSet(Property property) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set(Property property, EMOF.Object object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unset(Property property) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.VAR_PARAMETER__OPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOperation((Operation)otherEnd, msgs);
			case QVTOperationalPackage.VAR_PARAMETER__CTX_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCtxOwner((ImperativeOperation)otherEnd, msgs);
			case QVTOperationalPackage.VAR_PARAMETER__RES_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResOwner((ImperativeOperation)otherEnd, msgs);
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
			case QVTOperationalPackage.VAR_PARAMETER__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
			case QVTOperationalPackage.VAR_PARAMETER__OPERATION:
				return basicSetOperation(null, msgs);
			case QVTOperationalPackage.VAR_PARAMETER__CTX_OWNER:
				return basicSetCtxOwner(null, msgs);
			case QVTOperationalPackage.VAR_PARAMETER__RES_OWNER:
				return basicSetResOwner(null, msgs);
			case QVTOperationalPackage.VAR_PARAMETER__DECLARATOR:
				return basicSetDeclarator(null, msgs);
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
			case QVTOperationalPackage.VAR_PARAMETER__OPERATION:
				return eInternalContainer().eInverseRemove(this, EMOFPackage.OPERATION__OWNED_PARAMETER, Operation.class, msgs);
			case QVTOperationalPackage.VAR_PARAMETER__CTX_OWNER:
				return eInternalContainer().eInverseRemove(this, QVTOperationalPackage.IMPERATIVE_OPERATION__CONTEXT, ImperativeOperation.class, msgs);
			case QVTOperationalPackage.VAR_PARAMETER__RES_OWNER:
				return eInternalContainer().eInverseRemove(this, QVTOperationalPackage.IMPERATIVE_OPERATION__RESULT, ImperativeOperation.class, msgs);
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
			case QVTOperationalPackage.VAR_PARAMETER__OWNED_COMMENT:
				return getOwnedComment();
			case QVTOperationalPackage.VAR_PARAMETER__NAME:
				return getName();
			case QVTOperationalPackage.VAR_PARAMETER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case QVTOperationalPackage.VAR_PARAMETER__IS_ORDERED:
				return getIsOrdered();
			case QVTOperationalPackage.VAR_PARAMETER__IS_UNIQUE:
				return getIsUnique();
			case QVTOperationalPackage.VAR_PARAMETER__LOWER:
				return getLower();
			case QVTOperationalPackage.VAR_PARAMETER__UPPER:
				return getUpper();
			case QVTOperationalPackage.VAR_PARAMETER__OPERATION:
				return getOperation();
			case QVTOperationalPackage.VAR_PARAMETER__CTX_OWNER:
				return getCtxOwner();
			case QVTOperationalPackage.VAR_PARAMETER__KIND:
				return getKind();
			case QVTOperationalPackage.VAR_PARAMETER__RES_OWNER:
				return getResOwner();
			case QVTOperationalPackage.VAR_PARAMETER__DECLARATOR:
				return getDeclarator();
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
			case QVTOperationalPackage.VAR_PARAMETER__OWNED_COMMENT:
				getOwnedComment().clear();
				getOwnedComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__TYPE:
				setType((Type)newValue);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__LOWER:
				setLower((Integer)newValue);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__UPPER:
				setUpper((Integer)newValue);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__OPERATION:
				setOperation((Operation)newValue);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__CTX_OWNER:
				setCtxOwner((ImperativeOperation)newValue);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__KIND:
				setKind((DirectionKind)newValue);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__RES_OWNER:
				setResOwner((ImperativeOperation)newValue);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__DECLARATOR:
				setDeclarator((Declarator)newValue);
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
			case QVTOperationalPackage.VAR_PARAMETER__OWNED_COMMENT:
				getOwnedComment().clear();
				return;
			case QVTOperationalPackage.VAR_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__TYPE:
				setType((Type)null);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__OPERATION:
				setOperation((Operation)null);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__CTX_OWNER:
				setCtxOwner((ImperativeOperation)null);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__RES_OWNER:
				setResOwner((ImperativeOperation)null);
				return;
			case QVTOperationalPackage.VAR_PARAMETER__DECLARATOR:
				setDeclarator((Declarator)null);
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
			case QVTOperationalPackage.VAR_PARAMETER__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case QVTOperationalPackage.VAR_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QVTOperationalPackage.VAR_PARAMETER__TYPE:
				return type != null;
			case QVTOperationalPackage.VAR_PARAMETER__IS_ORDERED:
				return IS_ORDERED_EDEFAULT == null ? isOrdered != null : !IS_ORDERED_EDEFAULT.equals(isOrdered);
			case QVTOperationalPackage.VAR_PARAMETER__IS_UNIQUE:
				return IS_UNIQUE_EDEFAULT == null ? isUnique != null : !IS_UNIQUE_EDEFAULT.equals(isUnique);
			case QVTOperationalPackage.VAR_PARAMETER__LOWER:
				return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT.equals(lower);
			case QVTOperationalPackage.VAR_PARAMETER__UPPER:
				return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
			case QVTOperationalPackage.VAR_PARAMETER__OPERATION:
				return getOperation() != null;
			case QVTOperationalPackage.VAR_PARAMETER__CTX_OWNER:
				return getCtxOwner() != null;
			case QVTOperationalPackage.VAR_PARAMETER__KIND:
				return kind != KIND_EDEFAULT;
			case QVTOperationalPackage.VAR_PARAMETER__RES_OWNER:
				return getResOwner() != null;
			case QVTOperationalPackage.VAR_PARAMETER__DECLARATOR:
				return declarator != null;
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
		if (baseClass == EMOF.Object.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
				case QVTOperationalPackage.VAR_PARAMETER__OWNED_COMMENT: return EMOFPackage.ELEMENT__OWNED_COMMENT;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case QVTOperationalPackage.VAR_PARAMETER__NAME: return EMOFPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case QVTOperationalPackage.VAR_PARAMETER__TYPE: return EMOFPackage.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case QVTOperationalPackage.VAR_PARAMETER__IS_ORDERED: return EMOFPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case QVTOperationalPackage.VAR_PARAMETER__IS_UNIQUE: return EMOFPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case QVTOperationalPackage.VAR_PARAMETER__LOWER: return EMOFPackage.MULTIPLICITY_ELEMENT__LOWER;
				case QVTOperationalPackage.VAR_PARAMETER__UPPER: return EMOFPackage.MULTIPLICITY_ELEMENT__UPPER;
				default: return -1;
			}
		}
		if (baseClass == Parameter.class) {
			switch (derivedFeatureID) {
				case QVTOperationalPackage.VAR_PARAMETER__OPERATION: return EMOFPackage.PARAMETER__OPERATION;
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
		if (baseClass == EMOF.Object.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
				case EMOFPackage.ELEMENT__OWNED_COMMENT: return QVTOperationalPackage.VAR_PARAMETER__OWNED_COMMENT;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case EMOFPackage.NAMED_ELEMENT__NAME: return QVTOperationalPackage.VAR_PARAMETER__NAME;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case EMOFPackage.TYPED_ELEMENT__TYPE: return QVTOperationalPackage.VAR_PARAMETER__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case EMOFPackage.MULTIPLICITY_ELEMENT__IS_ORDERED: return QVTOperationalPackage.VAR_PARAMETER__IS_ORDERED;
				case EMOFPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE: return QVTOperationalPackage.VAR_PARAMETER__IS_UNIQUE;
				case EMOFPackage.MULTIPLICITY_ELEMENT__LOWER: return QVTOperationalPackage.VAR_PARAMETER__LOWER;
				case EMOFPackage.MULTIPLICITY_ELEMENT__UPPER: return QVTOperationalPackage.VAR_PARAMETER__UPPER;
				default: return -1;
			}
		}
		if (baseClass == Parameter.class) {
			switch (baseFeatureID) {
				case EMOFPackage.PARAMETER__OPERATION: return QVTOperationalPackage.VAR_PARAMETER__OPERATION;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == EMOF.Object.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (baseOperationID) {
				case EMOFPackage.ELEMENT___CONTAINER: return QVTOperationalPackage.VAR_PARAMETER___CONTAINER;
				case EMOFPackage.ELEMENT___EQUALS__OBJECT: return QVTOperationalPackage.VAR_PARAMETER___EQUALS__OBJECT;
				case EMOFPackage.ELEMENT___GET__PROPERTY: return QVTOperationalPackage.VAR_PARAMETER___GET__PROPERTY;
				case EMOFPackage.ELEMENT___GET_META_CLASS: return QVTOperationalPackage.VAR_PARAMETER___GET_META_CLASS;
				case EMOFPackage.ELEMENT___IS_SET__PROPERTY: return QVTOperationalPackage.VAR_PARAMETER___IS_SET__PROPERTY;
				case EMOFPackage.ELEMENT___SET__PROPERTY_OBJECT: return QVTOperationalPackage.VAR_PARAMETER___SET__PROPERTY_OBJECT;
				case EMOFPackage.ELEMENT___UNSET__PROPERTY: return QVTOperationalPackage.VAR_PARAMETER___UNSET__PROPERTY;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Parameter.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QVTOperationalPackage.VAR_PARAMETER___CONTAINER:
				return container();
			case QVTOperationalPackage.VAR_PARAMETER___EQUALS__OBJECT:
				return equals((EMOF.Object)arguments.get(0));
			case QVTOperationalPackage.VAR_PARAMETER___GET__PROPERTY:
				return get((Property)arguments.get(0));
			case QVTOperationalPackage.VAR_PARAMETER___GET_META_CLASS:
				return getMetaClass();
			case QVTOperationalPackage.VAR_PARAMETER___IS_SET__PROPERTY:
				return isSet((Property)arguments.get(0));
			case QVTOperationalPackage.VAR_PARAMETER___SET__PROPERTY_OBJECT:
				set((Property)arguments.get(0), (EMOF.Object)arguments.get(1));
				return null;
			case QVTOperationalPackage.VAR_PARAMETER___UNSET__PROPERTY:
				unset((Property)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //VarParameterImpl
