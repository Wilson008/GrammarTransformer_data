/**
 */
package qvtoperational.impl;

import emof.EmofPackage;
import emof.MultiplicityElement;
import emof.Operation;
import emof.Parameter;
import emof.Type;
import emof.TypedElement;

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

import qvtoperational.ExpressionGO;
import qvtoperational.ImperativeOperation;
import qvtoperational.OperationBody;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.TypeDef;
import qvtoperational.TypeSpec;
import qvtoperational.VarParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.TypeDefImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link qvtoperational.impl.TypeDefImpl#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link qvtoperational.impl.TypeDefImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link qvtoperational.impl.TypeDefImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link qvtoperational.impl.TypeDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link qvtoperational.impl.TypeDefImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link qvtoperational.impl.TypeDefImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link qvtoperational.impl.TypeDefImpl#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link qvtoperational.impl.TypeDefImpl#getContext <em>Context</em>}</li>
 *   <li>{@link qvtoperational.impl.TypeDefImpl#getResult <em>Result</em>}</li>
 *   <li>{@link qvtoperational.impl.TypeDefImpl#getOverridden <em>Overridden</em>}</li>
 *   <li>{@link qvtoperational.impl.TypeDefImpl#getBody <em>Body</em>}</li>
 *   <li>{@link qvtoperational.impl.TypeDefImpl#getTypespec <em>Typespec</em>}</li>
 *   <li>{@link qvtoperational.impl.TypeDefImpl#getTypedef_condition <em>Typedef condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeDefImpl extends ModuleImpl implements TypeDef {
	/**
	 * The default value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ORDERED_EDEFAULT = null;

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
	protected static final Boolean IS_UNIQUE_EDEFAULT = null;

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
	protected static final Integer LOWER_EDEFAULT = null;

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
	protected static final Integer UPPER_EDEFAULT = null;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected VarParameter context;

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
	 * The cached value of the '{@link #getOverridden() <em>Overridden</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverridden()
	 * @generated
	 * @ordered
	 */
	protected ImperativeOperation overridden;

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
	 * The cached value of the '{@link #getTypespec() <em>Typespec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypespec()
	 * @generated
	 * @ordered
	 */
	protected TypeSpec typespec;

	/**
	 * The cached value of the '{@link #getTypedef_condition() <em>Typedef condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedef_condition()
	 * @generated
	 * @ordered
	 */
	protected ExpressionGO typedef_condition;

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
		return QvtoperationalPackage.Literals.TYPE_DEF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TYPE_DEF__IS_ORDERED, oldIsOrdered, isOrdered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TYPE_DEF__IS_UNIQUE, oldIsUnique, isUnique));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TYPE_DEF__LOWER, oldLower, lower));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TYPE_DEF__UPPER, oldUpper, upper));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.TYPE_DEF__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TYPE_DEF__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public emof.Class getClass_() {
		if (eContainerFeatureID() != QvtoperationalPackage.TYPE_DEF__CLASS) return null;
		return (emof.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(emof.Class newClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClass, QvtoperationalPackage.TYPE_DEF__CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(emof.Class newClass) {
		if (newClass != eInternalContainer() || (eContainerFeatureID() != QvtoperationalPackage.TYPE_DEF__CLASS && newClass != null)) {
			if (EcoreUtil.isAncestor(this, newClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EmofPackage.CLASS__OWNED_OPERATION, emof.Class.class, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TYPE_DEF__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, QvtoperationalPackage.TYPE_DEF__OWNED_PARAMETER, EmofPackage.PARAMETER__OPERATION);
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
			raisedException = new EObjectResolvingEList<Type>(Type.class, this, QvtoperationalPackage.TYPE_DEF__RAISED_EXCEPTION);
		}
		return raisedException;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TYPE_DEF__CONTEXT, oldContext, newContext);
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
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TYPE_DEF__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TYPE_DEF__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TYPE_DEF__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarParameter> getResult() {
		if (result == null) {
			result = new EObjectContainmentWithInverseEList<VarParameter>(VarParameter.class, this, QvtoperationalPackage.TYPE_DEF__RESULT, QvtoperationalPackage.VAR_PARAMETER__RES_OWNER);
		}
		return result;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.TYPE_DEF__OVERRIDDEN, oldOverridden, overridden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TYPE_DEF__OVERRIDDEN, oldOverridden, overridden));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TYPE_DEF__BODY, oldBody, newBody);
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
				msgs = ((InternalEObject)body).eInverseRemove(this, QvtoperationalPackage.OPERATION_BODY__OPERATION, OperationBody.class, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, QvtoperationalPackage.OPERATION_BODY__OPERATION, OperationBody.class, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TYPE_DEF__BODY, newBody, newBody));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TYPE_DEF__TYPESPEC, oldTypespec, newTypespec);
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
				msgs = ((InternalEObject)typespec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TYPE_DEF__TYPESPEC, null, msgs);
			if (newTypespec != null)
				msgs = ((InternalEObject)newTypespec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TYPE_DEF__TYPESPEC, null, msgs);
			msgs = basicSetTypespec(newTypespec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TYPE_DEF__TYPESPEC, newTypespec, newTypespec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionGO getTypedef_condition() {
		return typedef_condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypedef_condition(ExpressionGO newTypedef_condition, NotificationChain msgs) {
		ExpressionGO oldTypedef_condition = typedef_condition;
		typedef_condition = newTypedef_condition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TYPE_DEF__TYPEDEF_CONDITION, oldTypedef_condition, newTypedef_condition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedef_condition(ExpressionGO newTypedef_condition) {
		if (newTypedef_condition != typedef_condition) {
			NotificationChain msgs = null;
			if (typedef_condition != null)
				msgs = ((InternalEObject)typedef_condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TYPE_DEF__TYPEDEF_CONDITION, null, msgs);
			if (newTypedef_condition != null)
				msgs = ((InternalEObject)newTypedef_condition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TYPE_DEF__TYPEDEF_CONDITION, null, msgs);
			msgs = basicSetTypedef_condition(newTypedef_condition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TYPE_DEF__TYPEDEF_CONDITION, newTypedef_condition, newTypedef_condition));
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
			case QvtoperationalPackage.TYPE_DEF__CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClass((emof.Class)otherEnd, msgs);
			case QvtoperationalPackage.TYPE_DEF__OWNED_PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameter()).basicAdd(otherEnd, msgs);
			case QvtoperationalPackage.TYPE_DEF__RESULT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResult()).basicAdd(otherEnd, msgs);
			case QvtoperationalPackage.TYPE_DEF__BODY:
				if (body != null)
					msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TYPE_DEF__BODY, null, msgs);
				return basicSetBody((OperationBody)otherEnd, msgs);
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
			case QvtoperationalPackage.TYPE_DEF__CLASS:
				return basicSetClass(null, msgs);
			case QvtoperationalPackage.TYPE_DEF__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.TYPE_DEF__CONTEXT:
				return basicSetContext(null, msgs);
			case QvtoperationalPackage.TYPE_DEF__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.TYPE_DEF__BODY:
				return basicSetBody(null, msgs);
			case QvtoperationalPackage.TYPE_DEF__TYPESPEC:
				return basicSetTypespec(null, msgs);
			case QvtoperationalPackage.TYPE_DEF__TYPEDEF_CONDITION:
				return basicSetTypedef_condition(null, msgs);
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
			case QvtoperationalPackage.TYPE_DEF__CLASS:
				return eInternalContainer().eInverseRemove(this, EmofPackage.CLASS__OWNED_OPERATION, emof.Class.class, msgs);
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
			case QvtoperationalPackage.TYPE_DEF__IS_ORDERED:
				return getIsOrdered();
			case QvtoperationalPackage.TYPE_DEF__IS_UNIQUE:
				return getIsUnique();
			case QvtoperationalPackage.TYPE_DEF__LOWER:
				return getLower();
			case QvtoperationalPackage.TYPE_DEF__UPPER:
				return getUpper();
			case QvtoperationalPackage.TYPE_DEF__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case QvtoperationalPackage.TYPE_DEF__CLASS:
				return getClass_();
			case QvtoperationalPackage.TYPE_DEF__OWNED_PARAMETER:
				return getOwnedParameter();
			case QvtoperationalPackage.TYPE_DEF__RAISED_EXCEPTION:
				return getRaisedException();
			case QvtoperationalPackage.TYPE_DEF__CONTEXT:
				return getContext();
			case QvtoperationalPackage.TYPE_DEF__RESULT:
				return getResult();
			case QvtoperationalPackage.TYPE_DEF__OVERRIDDEN:
				if (resolve) return getOverridden();
				return basicGetOverridden();
			case QvtoperationalPackage.TYPE_DEF__BODY:
				return getBody();
			case QvtoperationalPackage.TYPE_DEF__TYPESPEC:
				return getTypespec();
			case QvtoperationalPackage.TYPE_DEF__TYPEDEF_CONDITION:
				return getTypedef_condition();
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
			case QvtoperationalPackage.TYPE_DEF__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case QvtoperationalPackage.TYPE_DEF__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case QvtoperationalPackage.TYPE_DEF__LOWER:
				setLower((Integer)newValue);
				return;
			case QvtoperationalPackage.TYPE_DEF__UPPER:
				setUpper((Integer)newValue);
				return;
			case QvtoperationalPackage.TYPE_DEF__TYPE:
				setType((Type)newValue);
				return;
			case QvtoperationalPackage.TYPE_DEF__CLASS:
				setClass((emof.Class)newValue);
				return;
			case QvtoperationalPackage.TYPE_DEF__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case QvtoperationalPackage.TYPE_DEF__RAISED_EXCEPTION:
				getRaisedException().clear();
				getRaisedException().addAll((Collection<? extends Type>)newValue);
				return;
			case QvtoperationalPackage.TYPE_DEF__CONTEXT:
				setContext((VarParameter)newValue);
				return;
			case QvtoperationalPackage.TYPE_DEF__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends VarParameter>)newValue);
				return;
			case QvtoperationalPackage.TYPE_DEF__OVERRIDDEN:
				setOverridden((ImperativeOperation)newValue);
				return;
			case QvtoperationalPackage.TYPE_DEF__BODY:
				setBody((OperationBody)newValue);
				return;
			case QvtoperationalPackage.TYPE_DEF__TYPESPEC:
				setTypespec((TypeSpec)newValue);
				return;
			case QvtoperationalPackage.TYPE_DEF__TYPEDEF_CONDITION:
				setTypedef_condition((ExpressionGO)newValue);
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
			case QvtoperationalPackage.TYPE_DEF__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case QvtoperationalPackage.TYPE_DEF__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case QvtoperationalPackage.TYPE_DEF__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case QvtoperationalPackage.TYPE_DEF__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case QvtoperationalPackage.TYPE_DEF__TYPE:
				setType((Type)null);
				return;
			case QvtoperationalPackage.TYPE_DEF__CLASS:
				setClass((emof.Class)null);
				return;
			case QvtoperationalPackage.TYPE_DEF__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case QvtoperationalPackage.TYPE_DEF__RAISED_EXCEPTION:
				getRaisedException().clear();
				return;
			case QvtoperationalPackage.TYPE_DEF__CONTEXT:
				setContext((VarParameter)null);
				return;
			case QvtoperationalPackage.TYPE_DEF__RESULT:
				getResult().clear();
				return;
			case QvtoperationalPackage.TYPE_DEF__OVERRIDDEN:
				setOverridden((ImperativeOperation)null);
				return;
			case QvtoperationalPackage.TYPE_DEF__BODY:
				setBody((OperationBody)null);
				return;
			case QvtoperationalPackage.TYPE_DEF__TYPESPEC:
				setTypespec((TypeSpec)null);
				return;
			case QvtoperationalPackage.TYPE_DEF__TYPEDEF_CONDITION:
				setTypedef_condition((ExpressionGO)null);
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
			case QvtoperationalPackage.TYPE_DEF__IS_ORDERED:
				return IS_ORDERED_EDEFAULT == null ? isOrdered != null : !IS_ORDERED_EDEFAULT.equals(isOrdered);
			case QvtoperationalPackage.TYPE_DEF__IS_UNIQUE:
				return IS_UNIQUE_EDEFAULT == null ? isUnique != null : !IS_UNIQUE_EDEFAULT.equals(isUnique);
			case QvtoperationalPackage.TYPE_DEF__LOWER:
				return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT.equals(lower);
			case QvtoperationalPackage.TYPE_DEF__UPPER:
				return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
			case QvtoperationalPackage.TYPE_DEF__TYPE:
				return type != null;
			case QvtoperationalPackage.TYPE_DEF__CLASS:
				return getClass_() != null;
			case QvtoperationalPackage.TYPE_DEF__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case QvtoperationalPackage.TYPE_DEF__RAISED_EXCEPTION:
				return raisedException != null && !raisedException.isEmpty();
			case QvtoperationalPackage.TYPE_DEF__CONTEXT:
				return context != null;
			case QvtoperationalPackage.TYPE_DEF__RESULT:
				return result != null && !result.isEmpty();
			case QvtoperationalPackage.TYPE_DEF__OVERRIDDEN:
				return overridden != null;
			case QvtoperationalPackage.TYPE_DEF__BODY:
				return body != null;
			case QvtoperationalPackage.TYPE_DEF__TYPESPEC:
				return typespec != null;
			case QvtoperationalPackage.TYPE_DEF__TYPEDEF_CONDITION:
				return typedef_condition != null;
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
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.TYPE_DEF__IS_ORDERED: return EmofPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case QvtoperationalPackage.TYPE_DEF__IS_UNIQUE: return EmofPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case QvtoperationalPackage.TYPE_DEF__LOWER: return EmofPackage.MULTIPLICITY_ELEMENT__LOWER;
				case QvtoperationalPackage.TYPE_DEF__UPPER: return EmofPackage.MULTIPLICITY_ELEMENT__UPPER;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.TYPE_DEF__TYPE: return EmofPackage.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == Operation.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.TYPE_DEF__CLASS: return EmofPackage.OPERATION__CLASS;
				case QvtoperationalPackage.TYPE_DEF__OWNED_PARAMETER: return EmofPackage.OPERATION__OWNED_PARAMETER;
				case QvtoperationalPackage.TYPE_DEF__RAISED_EXCEPTION: return EmofPackage.OPERATION__RAISED_EXCEPTION;
				default: return -1;
			}
		}
		if (baseClass == ImperativeOperation.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.TYPE_DEF__CONTEXT: return QvtoperationalPackage.IMPERATIVE_OPERATION__CONTEXT;
				case QvtoperationalPackage.TYPE_DEF__RESULT: return QvtoperationalPackage.IMPERATIVE_OPERATION__RESULT;
				case QvtoperationalPackage.TYPE_DEF__OVERRIDDEN: return QvtoperationalPackage.IMPERATIVE_OPERATION__OVERRIDDEN;
				case QvtoperationalPackage.TYPE_DEF__BODY: return QvtoperationalPackage.IMPERATIVE_OPERATION__BODY;
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
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case EmofPackage.MULTIPLICITY_ELEMENT__IS_ORDERED: return QvtoperationalPackage.TYPE_DEF__IS_ORDERED;
				case EmofPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE: return QvtoperationalPackage.TYPE_DEF__IS_UNIQUE;
				case EmofPackage.MULTIPLICITY_ELEMENT__LOWER: return QvtoperationalPackage.TYPE_DEF__LOWER;
				case EmofPackage.MULTIPLICITY_ELEMENT__UPPER: return QvtoperationalPackage.TYPE_DEF__UPPER;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case EmofPackage.TYPED_ELEMENT__TYPE: return QvtoperationalPackage.TYPE_DEF__TYPE;
				default: return -1;
			}
		}
		if (baseClass == Operation.class) {
			switch (baseFeatureID) {
				case EmofPackage.OPERATION__CLASS: return QvtoperationalPackage.TYPE_DEF__CLASS;
				case EmofPackage.OPERATION__OWNED_PARAMETER: return QvtoperationalPackage.TYPE_DEF__OWNED_PARAMETER;
				case EmofPackage.OPERATION__RAISED_EXCEPTION: return QvtoperationalPackage.TYPE_DEF__RAISED_EXCEPTION;
				default: return -1;
			}
		}
		if (baseClass == ImperativeOperation.class) {
			switch (baseFeatureID) {
				case QvtoperationalPackage.IMPERATIVE_OPERATION__CONTEXT: return QvtoperationalPackage.TYPE_DEF__CONTEXT;
				case QvtoperationalPackage.IMPERATIVE_OPERATION__RESULT: return QvtoperationalPackage.TYPE_DEF__RESULT;
				case QvtoperationalPackage.IMPERATIVE_OPERATION__OVERRIDDEN: return QvtoperationalPackage.TYPE_DEF__OVERRIDDEN;
				case QvtoperationalPackage.IMPERATIVE_OPERATION__BODY: return QvtoperationalPackage.TYPE_DEF__BODY;
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
		result.append(')');
		return result.toString();
	}

} //TypeDefImpl
