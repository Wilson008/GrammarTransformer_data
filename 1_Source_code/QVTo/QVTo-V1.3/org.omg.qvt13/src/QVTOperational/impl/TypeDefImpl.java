/**
 */
package QVTOperational.impl;

import EMOF.EMOFPackage;
import EMOF.MultiplicityElement;
import EMOF.Operation;
import EMOF.Parameter;
import EMOF.Type;
import EMOF.TypedElement;

import QVTOperational.ImperativeOperation;
import QVTOperational.OperationBody;
import QVTOperational.QVTOperationalPackage;
import QVTOperational.TypeDef;
import QVTOperational.TypeSpec;
import QVTOperational.VarParameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.TypeDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link QVTOperational.impl.TypeDefImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link QVTOperational.impl.TypeDefImpl#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link QVTOperational.impl.TypeDefImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link QVTOperational.impl.TypeDefImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link QVTOperational.impl.TypeDefImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link QVTOperational.impl.TypeDefImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link QVTOperational.impl.TypeDefImpl#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link QVTOperational.impl.TypeDefImpl#getBody <em>Body</em>}</li>
 *   <li>{@link QVTOperational.impl.TypeDefImpl#getContext <em>Context</em>}</li>
 *   <li>{@link QVTOperational.impl.TypeDefImpl#getIsBlackbox <em>Is Blackbox</em>}</li>
 *   <li>{@link QVTOperational.impl.TypeDefImpl#getOverridden <em>Overridden</em>}</li>
 *   <li>{@link QVTOperational.impl.TypeDefImpl#getResult <em>Result</em>}</li>
 *   <li>{@link QVTOperational.impl.TypeDefImpl#getTypespec <em>Typespec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeDefImpl extends ModuleImpl implements TypeDef {
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
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameter;

	/**
	 * The cached value of the '{@link #getRaisedException() <em>Raised Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedException()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> raisedException;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected OperationBody body;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected VarParameter context;

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
	 * The cached value of the '{@link #getOverridden() <em>Overridden</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverridden()
	 * @generated
	 * @ordered
	 */
	protected ImperativeOperation overridden;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<VarParameter> result;

	/**
	 * The cached value of the '{@link #getTypespec() <em>Typespec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypespec()
	 * @generated
	 * @ordered
	 */
	protected TypeSpec typespec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.TYPE_DEF;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QVTOperationalPackage.TYPE_DEF__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_DEF__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_DEF__IS_ORDERED, oldIsOrdered, isOrdered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_DEF__IS_UNIQUE, oldIsUnique, isUnique));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_DEF__LOWER, oldLower, lower));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_DEF__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOF.Class getClass_() {
		if (eContainerFeatureID() != QVTOperationalPackage.TYPE_DEF__CLASS) return null;
		return (EMOF.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(EMOF.Class newClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClass, QVTOperationalPackage.TYPE_DEF__CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(EMOF.Class newClass) {
		if (newClass != eInternalContainer() || (eContainerFeatureID() != QVTOperationalPackage.TYPE_DEF__CLASS && newClass != null)) {
			if (EcoreUtil.isAncestor(this, newClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EMOFPackage.CLASS__OWNED_OPERATION, EMOF.Class.class, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_DEF__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, QVTOperationalPackage.TYPE_DEF__OWNED_PARAMETER, EMOFPackage.PARAMETER__OPERATION);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getRaisedException() {
		if (raisedException == null) {
			raisedException = new EObjectResolvingEList<Type>(Type.class, this, QVTOperationalPackage.TYPE_DEF__RAISED_EXCEPTION);
		}
		return raisedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationBody getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(OperationBody newBody, NotificationChain msgs) {
		OperationBody oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_DEF__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(OperationBody newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, QVTOperationalPackage.OPERATION_BODY__OPERATION, OperationBody.class, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, QVTOperationalPackage.OPERATION_BODY__OPERATION, OperationBody.class, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_DEF__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarParameter getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(VarParameter newContext, NotificationChain msgs) {
		VarParameter oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_DEF__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(VarParameter newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, QVTOperationalPackage.VAR_PARAMETER__CTX_OWNER, VarParameter.class, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, QVTOperationalPackage.VAR_PARAMETER__CTX_OWNER, VarParameter.class, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_DEF__CONTEXT, newContext, newContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_DEF__IS_BLACKBOX, oldIsBlackbox, isBlackbox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOperation getOverridden() {
		if (overridden != null && overridden.eIsProxy()) {
			InternalEObject oldOverridden = (InternalEObject)overridden;
			overridden = (ImperativeOperation)eResolveProxy(oldOverridden);
			if (overridden != oldOverridden) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QVTOperationalPackage.TYPE_DEF__OVERRIDDEN, oldOverridden, overridden));
			}
		}
		return overridden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOperation basicGetOverridden() {
		return overridden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverridden(ImperativeOperation newOverridden) {
		ImperativeOperation oldOverridden = overridden;
		overridden = newOverridden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_DEF__OVERRIDDEN, oldOverridden, overridden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarParameter> getResult() {
		if (result == null) {
			result = new EObjectContainmentWithInverseEList<VarParameter>(VarParameter.class, this, QVTOperationalPackage.TYPE_DEF__RESULT, QVTOperationalPackage.VAR_PARAMETER__RES_OWNER);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSpec getTypespec() {
		return typespec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypespec(TypeSpec newTypespec, NotificationChain msgs) {
		TypeSpec oldTypespec = typespec;
		typespec = newTypespec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_DEF__TYPESPEC, oldTypespec, newTypespec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypespec(TypeSpec newTypespec) {
		if (newTypespec != typespec) {
			NotificationChain msgs = null;
			if (typespec != null)
				msgs = ((InternalEObject)typespec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.TYPE_DEF__TYPESPEC, null, msgs);
			if (newTypespec != null)
				msgs = ((InternalEObject)newTypespec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.TYPE_DEF__TYPESPEC, null, msgs);
			msgs = basicSetTypespec(newTypespec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.TYPE_DEF__TYPESPEC, newTypespec, newTypespec));
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
			case QVTOperationalPackage.TYPE_DEF__CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClass((EMOF.Class)otherEnd, msgs);
			case QVTOperationalPackage.TYPE_DEF__OWNED_PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameter()).basicAdd(otherEnd, msgs);
			case QVTOperationalPackage.TYPE_DEF__BODY:
				if (body != null)
					msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.TYPE_DEF__BODY, null, msgs);
				return basicSetBody((OperationBody)otherEnd, msgs);
			case QVTOperationalPackage.TYPE_DEF__CONTEXT:
				if (context != null)
					msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.TYPE_DEF__CONTEXT, null, msgs);
				return basicSetContext((VarParameter)otherEnd, msgs);
			case QVTOperationalPackage.TYPE_DEF__RESULT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResult()).basicAdd(otherEnd, msgs);
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
			case QVTOperationalPackage.TYPE_DEF__CLASS:
				return basicSetClass(null, msgs);
			case QVTOperationalPackage.TYPE_DEF__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
			case QVTOperationalPackage.TYPE_DEF__BODY:
				return basicSetBody(null, msgs);
			case QVTOperationalPackage.TYPE_DEF__CONTEXT:
				return basicSetContext(null, msgs);
			case QVTOperationalPackage.TYPE_DEF__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
			case QVTOperationalPackage.TYPE_DEF__TYPESPEC:
				return basicSetTypespec(null, msgs);
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
			case QVTOperationalPackage.TYPE_DEF__CLASS:
				return eInternalContainer().eInverseRemove(this, EMOFPackage.CLASS__OWNED_OPERATION, EMOF.Class.class, msgs);
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
			case QVTOperationalPackage.TYPE_DEF__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case QVTOperationalPackage.TYPE_DEF__IS_ORDERED:
				return getIsOrdered();
			case QVTOperationalPackage.TYPE_DEF__IS_UNIQUE:
				return getIsUnique();
			case QVTOperationalPackage.TYPE_DEF__LOWER:
				return getLower();
			case QVTOperationalPackage.TYPE_DEF__UPPER:
				return getUpper();
			case QVTOperationalPackage.TYPE_DEF__CLASS:
				return getClass_();
			case QVTOperationalPackage.TYPE_DEF__OWNED_PARAMETER:
				return getOwnedParameter();
			case QVTOperationalPackage.TYPE_DEF__RAISED_EXCEPTION:
				return getRaisedException();
			case QVTOperationalPackage.TYPE_DEF__BODY:
				return getBody();
			case QVTOperationalPackage.TYPE_DEF__CONTEXT:
				return getContext();
			case QVTOperationalPackage.TYPE_DEF__IS_BLACKBOX:
				return getIsBlackbox();
			case QVTOperationalPackage.TYPE_DEF__OVERRIDDEN:
				if (resolve) return getOverridden();
				return basicGetOverridden();
			case QVTOperationalPackage.TYPE_DEF__RESULT:
				return getResult();
			case QVTOperationalPackage.TYPE_DEF__TYPESPEC:
				return getTypespec();
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
			case QVTOperationalPackage.TYPE_DEF__TYPE:
				setType((Type)newValue);
				return;
			case QVTOperationalPackage.TYPE_DEF__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case QVTOperationalPackage.TYPE_DEF__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case QVTOperationalPackage.TYPE_DEF__LOWER:
				setLower((Integer)newValue);
				return;
			case QVTOperationalPackage.TYPE_DEF__UPPER:
				setUpper((Integer)newValue);
				return;
			case QVTOperationalPackage.TYPE_DEF__CLASS:
				setClass((EMOF.Class)newValue);
				return;
			case QVTOperationalPackage.TYPE_DEF__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case QVTOperationalPackage.TYPE_DEF__RAISED_EXCEPTION:
				getRaisedException().clear();
				getRaisedException().addAll((Collection<? extends Type>)newValue);
				return;
			case QVTOperationalPackage.TYPE_DEF__BODY:
				setBody((OperationBody)newValue);
				return;
			case QVTOperationalPackage.TYPE_DEF__CONTEXT:
				setContext((VarParameter)newValue);
				return;
			case QVTOperationalPackage.TYPE_DEF__IS_BLACKBOX:
				setIsBlackbox((Boolean)newValue);
				return;
			case QVTOperationalPackage.TYPE_DEF__OVERRIDDEN:
				setOverridden((ImperativeOperation)newValue);
				return;
			case QVTOperationalPackage.TYPE_DEF__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends VarParameter>)newValue);
				return;
			case QVTOperationalPackage.TYPE_DEF__TYPESPEC:
				setTypespec((TypeSpec)newValue);
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
			case QVTOperationalPackage.TYPE_DEF__TYPE:
				setType((Type)null);
				return;
			case QVTOperationalPackage.TYPE_DEF__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case QVTOperationalPackage.TYPE_DEF__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case QVTOperationalPackage.TYPE_DEF__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case QVTOperationalPackage.TYPE_DEF__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case QVTOperationalPackage.TYPE_DEF__CLASS:
				setClass((EMOF.Class)null);
				return;
			case QVTOperationalPackage.TYPE_DEF__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case QVTOperationalPackage.TYPE_DEF__RAISED_EXCEPTION:
				getRaisedException().clear();
				return;
			case QVTOperationalPackage.TYPE_DEF__BODY:
				setBody((OperationBody)null);
				return;
			case QVTOperationalPackage.TYPE_DEF__CONTEXT:
				setContext((VarParameter)null);
				return;
			case QVTOperationalPackage.TYPE_DEF__IS_BLACKBOX:
				setIsBlackbox(IS_BLACKBOX_EDEFAULT);
				return;
			case QVTOperationalPackage.TYPE_DEF__OVERRIDDEN:
				setOverridden((ImperativeOperation)null);
				return;
			case QVTOperationalPackage.TYPE_DEF__RESULT:
				getResult().clear();
				return;
			case QVTOperationalPackage.TYPE_DEF__TYPESPEC:
				setTypespec((TypeSpec)null);
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
			case QVTOperationalPackage.TYPE_DEF__TYPE:
				return type != null;
			case QVTOperationalPackage.TYPE_DEF__IS_ORDERED:
				return IS_ORDERED_EDEFAULT == null ? isOrdered != null : !IS_ORDERED_EDEFAULT.equals(isOrdered);
			case QVTOperationalPackage.TYPE_DEF__IS_UNIQUE:
				return IS_UNIQUE_EDEFAULT == null ? isUnique != null : !IS_UNIQUE_EDEFAULT.equals(isUnique);
			case QVTOperationalPackage.TYPE_DEF__LOWER:
				return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT.equals(lower);
			case QVTOperationalPackage.TYPE_DEF__UPPER:
				return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
			case QVTOperationalPackage.TYPE_DEF__CLASS:
				return getClass_() != null;
			case QVTOperationalPackage.TYPE_DEF__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case QVTOperationalPackage.TYPE_DEF__RAISED_EXCEPTION:
				return raisedException != null && !raisedException.isEmpty();
			case QVTOperationalPackage.TYPE_DEF__BODY:
				return body != null;
			case QVTOperationalPackage.TYPE_DEF__CONTEXT:
				return context != null;
			case QVTOperationalPackage.TYPE_DEF__IS_BLACKBOX:
				return IS_BLACKBOX_EDEFAULT == null ? isBlackbox != null : !IS_BLACKBOX_EDEFAULT.equals(isBlackbox);
			case QVTOperationalPackage.TYPE_DEF__OVERRIDDEN:
				return overridden != null;
			case QVTOperationalPackage.TYPE_DEF__RESULT:
				return result != null && !result.isEmpty();
			case QVTOperationalPackage.TYPE_DEF__TYPESPEC:
				return typespec != null;
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
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case QVTOperationalPackage.TYPE_DEF__TYPE: return EMOFPackage.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case QVTOperationalPackage.TYPE_DEF__IS_ORDERED: return EMOFPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case QVTOperationalPackage.TYPE_DEF__IS_UNIQUE: return EMOFPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case QVTOperationalPackage.TYPE_DEF__LOWER: return EMOFPackage.MULTIPLICITY_ELEMENT__LOWER;
				case QVTOperationalPackage.TYPE_DEF__UPPER: return EMOFPackage.MULTIPLICITY_ELEMENT__UPPER;
				default: return -1;
			}
		}
		if (baseClass == Operation.class) {
			switch (derivedFeatureID) {
				case QVTOperationalPackage.TYPE_DEF__CLASS: return EMOFPackage.OPERATION__CLASS;
				case QVTOperationalPackage.TYPE_DEF__OWNED_PARAMETER: return EMOFPackage.OPERATION__OWNED_PARAMETER;
				case QVTOperationalPackage.TYPE_DEF__RAISED_EXCEPTION: return EMOFPackage.OPERATION__RAISED_EXCEPTION;
				default: return -1;
			}
		}
		if (baseClass == ImperativeOperation.class) {
			switch (derivedFeatureID) {
				case QVTOperationalPackage.TYPE_DEF__BODY: return QVTOperationalPackage.IMPERATIVE_OPERATION__BODY;
				case QVTOperationalPackage.TYPE_DEF__CONTEXT: return QVTOperationalPackage.IMPERATIVE_OPERATION__CONTEXT;
				case QVTOperationalPackage.TYPE_DEF__IS_BLACKBOX: return QVTOperationalPackage.IMPERATIVE_OPERATION__IS_BLACKBOX;
				case QVTOperationalPackage.TYPE_DEF__OVERRIDDEN: return QVTOperationalPackage.IMPERATIVE_OPERATION__OVERRIDDEN;
				case QVTOperationalPackage.TYPE_DEF__RESULT: return QVTOperationalPackage.IMPERATIVE_OPERATION__RESULT;
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
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case EMOFPackage.TYPED_ELEMENT__TYPE: return QVTOperationalPackage.TYPE_DEF__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case EMOFPackage.MULTIPLICITY_ELEMENT__IS_ORDERED: return QVTOperationalPackage.TYPE_DEF__IS_ORDERED;
				case EMOFPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE: return QVTOperationalPackage.TYPE_DEF__IS_UNIQUE;
				case EMOFPackage.MULTIPLICITY_ELEMENT__LOWER: return QVTOperationalPackage.TYPE_DEF__LOWER;
				case EMOFPackage.MULTIPLICITY_ELEMENT__UPPER: return QVTOperationalPackage.TYPE_DEF__UPPER;
				default: return -1;
			}
		}
		if (baseClass == Operation.class) {
			switch (baseFeatureID) {
				case EMOFPackage.OPERATION__CLASS: return QVTOperationalPackage.TYPE_DEF__CLASS;
				case EMOFPackage.OPERATION__OWNED_PARAMETER: return QVTOperationalPackage.TYPE_DEF__OWNED_PARAMETER;
				case EMOFPackage.OPERATION__RAISED_EXCEPTION: return QVTOperationalPackage.TYPE_DEF__RAISED_EXCEPTION;
				default: return -1;
			}
		}
		if (baseClass == ImperativeOperation.class) {
			switch (baseFeatureID) {
				case QVTOperationalPackage.IMPERATIVE_OPERATION__BODY: return QVTOperationalPackage.TYPE_DEF__BODY;
				case QVTOperationalPackage.IMPERATIVE_OPERATION__CONTEXT: return QVTOperationalPackage.TYPE_DEF__CONTEXT;
				case QVTOperationalPackage.IMPERATIVE_OPERATION__IS_BLACKBOX: return QVTOperationalPackage.TYPE_DEF__IS_BLACKBOX;
				case QVTOperationalPackage.IMPERATIVE_OPERATION__OVERRIDDEN: return QVTOperationalPackage.TYPE_DEF__OVERRIDDEN;
				case QVTOperationalPackage.IMPERATIVE_OPERATION__RESULT: return QVTOperationalPackage.TYPE_DEF__RESULT;
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
		result.append(" (isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", isBlackbox: ");
		result.append(isBlackbox);
		result.append(')');
		return result.toString();
	}

} //TypeDefImpl
