/**
 */
package qvtoperational.impl;

import emof.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qvtoperational.ExpressionGO;
import qvtoperational.ImperativeOperation;
import qvtoperational.ModelParameter;
import qvtoperational.OperationalTransformation;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.TransformationHeader;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.OperationalTransformationImpl#getIntermediateClass <em>Intermediate Class</em>}</li>
 *   <li>{@link qvtoperational.impl.OperationalTransformationImpl#getRefined <em>Refined</em>}</li>
 *   <li>{@link qvtoperational.impl.OperationalTransformationImpl#getIntermediateProperty <em>Intermediate Property</em>}</li>
 *   <li>{@link qvtoperational.impl.OperationalTransformationImpl#getModelParameter <em>Model Parameter</em>}</li>
 *   <li>{@link qvtoperational.impl.OperationalTransformationImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link qvtoperational.impl.OperationalTransformationImpl#getTransformation_h <em>Transformation h</em>}</li>
 *   <li>{@link qvtoperational.impl.OperationalTransformationImpl#getModule_element <em>Module element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalTransformationImpl extends ModuleImpl implements OperationalTransformation {
	/**
	 * The cached value of the '{@link #getIntermediateClass() <em>Intermediate Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateClass()
	 * @generated
	 * @ordered
	 */
	protected EList<emof.Class> intermediateClass;

	/**
	 * The cached value of the '{@link #getRefined() <em>Refined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefined()
	 * @generated
	 * @ordered
	 */
	protected ExpressionGO refined;

	/**
	 * The cached value of the '{@link #getIntermediateProperty() <em>Intermediate Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> intermediateProperty;

	/**
	 * The cached value of the '{@link #getModelParameter() <em>Model Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelParameter> modelParameter;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionGO> relation;

	/**
	 * The cached value of the '{@link #getTransformation_h() <em>Transformation h</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation_h()
	 * @generated
	 * @ordered
	 */
	protected TransformationHeader transformation_h;

	/**
	 * The cached value of the '{@link #getModule_element() <em>Module element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule_element()
	 * @generated
	 * @ordered
	 */
	protected EList<ImperativeOperation> module_element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.OPERATIONAL_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<emof.Class> getIntermediateClass() {
		if (intermediateClass == null) {
			intermediateClass = new EObjectResolvingEList<emof.Class>(emof.Class.class, this, QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__INTERMEDIATE_CLASS);
		}
		return intermediateClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionGO getRefined() {
		if (refined != null && refined.eIsProxy()) {
			InternalEObject oldRefined = (InternalEObject)refined;
			refined = (ExpressionGO)eResolveProxy(oldRefined);
			if (refined != oldRefined) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__REFINED, oldRefined, refined));
			}
		}
		return refined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionGO basicGetRefined() {
		return refined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefined(ExpressionGO newRefined) {
		ExpressionGO oldRefined = refined;
		refined = newRefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__REFINED, oldRefined, refined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getIntermediateProperty() {
		if (intermediateProperty == null) {
			intermediateProperty = new EObjectResolvingEList<Property>(Property.class, this, QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__INTERMEDIATE_PROPERTY);
		}
		return intermediateProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelParameter> getModelParameter() {
		if (modelParameter == null) {
			modelParameter = new EObjectContainmentEList<ModelParameter>(ModelParameter.class, this, QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER);
		}
		return modelParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionGO> getRelation() {
		if (relation == null) {
			relation = new EObjectContainmentEList<ExpressionGO>(ExpressionGO.class, this, QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__RELATION);
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationHeader getTransformation_h() {
		return transformation_h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation_h(TransformationHeader newTransformation_h, NotificationChain msgs) {
		TransformationHeader oldTransformation_h = transformation_h;
		transformation_h = newTransformation_h;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__TRANSFORMATION_H, oldTransformation_h, newTransformation_h);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation_h(TransformationHeader newTransformation_h) {
		if (newTransformation_h != transformation_h) {
			NotificationChain msgs = null;
			if (transformation_h != null)
				msgs = ((InternalEObject)transformation_h).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__TRANSFORMATION_H, null, msgs);
			if (newTransformation_h != null)
				msgs = ((InternalEObject)newTransformation_h).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__TRANSFORMATION_H, null, msgs);
			msgs = basicSetTransformation_h(newTransformation_h, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__TRANSFORMATION_H, newTransformation_h, newTransformation_h));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImperativeOperation> getModule_element() {
		if (module_element == null) {
			module_element = new EObjectContainmentEList<ImperativeOperation>(ImperativeOperation.class, this, QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT);
		}
		return module_element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER:
				return ((InternalEList<?>)getModelParameter()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__RELATION:
				return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__TRANSFORMATION_H:
				return basicSetTransformation_h(null, msgs);
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT:
				return ((InternalEList<?>)getModule_element()).basicRemove(otherEnd, msgs);
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
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__INTERMEDIATE_CLASS:
				return getIntermediateClass();
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__REFINED:
				if (resolve) return getRefined();
				return basicGetRefined();
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__INTERMEDIATE_PROPERTY:
				return getIntermediateProperty();
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER:
				return getModelParameter();
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__RELATION:
				return getRelation();
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__TRANSFORMATION_H:
				return getTransformation_h();
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT:
				return getModule_element();
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
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__INTERMEDIATE_CLASS:
				getIntermediateClass().clear();
				getIntermediateClass().addAll((Collection<? extends emof.Class>)newValue);
				return;
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__REFINED:
				setRefined((ExpressionGO)newValue);
				return;
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__INTERMEDIATE_PROPERTY:
				getIntermediateProperty().clear();
				getIntermediateProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER:
				getModelParameter().clear();
				getModelParameter().addAll((Collection<? extends ModelParameter>)newValue);
				return;
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends ExpressionGO>)newValue);
				return;
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__TRANSFORMATION_H:
				setTransformation_h((TransformationHeader)newValue);
				return;
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT:
				getModule_element().clear();
				getModule_element().addAll((Collection<? extends ImperativeOperation>)newValue);
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
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__INTERMEDIATE_CLASS:
				getIntermediateClass().clear();
				return;
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__REFINED:
				setRefined((ExpressionGO)null);
				return;
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__INTERMEDIATE_PROPERTY:
				getIntermediateProperty().clear();
				return;
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER:
				getModelParameter().clear();
				return;
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__RELATION:
				getRelation().clear();
				return;
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__TRANSFORMATION_H:
				setTransformation_h((TransformationHeader)null);
				return;
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT:
				getModule_element().clear();
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
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__INTERMEDIATE_CLASS:
				return intermediateClass != null && !intermediateClass.isEmpty();
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__REFINED:
				return refined != null;
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__INTERMEDIATE_PROPERTY:
				return intermediateProperty != null && !intermediateProperty.isEmpty();
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER:
				return modelParameter != null && !modelParameter.isEmpty();
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__RELATION:
				return relation != null && !relation.isEmpty();
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__TRANSFORMATION_H:
				return transformation_h != null;
			case QvtoperationalPackage.OPERATIONAL_TRANSFORMATION__MODULE_ELEMENT:
				return module_element != null && !module_element.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalTransformationImpl
