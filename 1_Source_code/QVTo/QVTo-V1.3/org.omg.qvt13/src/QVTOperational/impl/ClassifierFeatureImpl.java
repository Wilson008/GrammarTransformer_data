/**
 */
package QVTOperational.impl;

import QVTOperational.ClassifierFeature;
import QVTOperational.CompleteSignature;
import QVTOperational.Declarator;
import QVTOperational.FeatureQualifier;
import QVTOperational.Multiplicity;
import QVTOperational.OppositeProperty;
import QVTOperational.QVTOperationalPackage;
import QVTOperational.TagGO;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.ClassifierFeatureImpl#getFeature_qualifier <em>Feature qualifier</em>}</li>
 *   <li>{@link QVTOperational.impl.ClassifierFeatureImpl#getDeclarator <em>Declarator</em>}</li>
 *   <li>{@link QVTOperational.impl.ClassifierFeatureImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link QVTOperational.impl.ClassifierFeatureImpl#getOpposite_property <em>Opposite property</em>}</li>
 *   <li>{@link QVTOperational.impl.ClassifierFeatureImpl#getComplete_signature <em>Complete signature</em>}</li>
 *   <li>{@link QVTOperational.impl.ClassifierFeatureImpl#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierFeatureImpl extends MinimalEObjectImpl.Container implements ClassifierFeature {
	/**
	 * The cached value of the '{@link #getFeature_qualifier() <em>Feature qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature_qualifier()
	 * @generated
	 * @ordered
	 */
	protected FeatureQualifier feature_qualifier;

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
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity multiplicity;

	/**
	 * The cached value of the '{@link #getOpposite_property() <em>Opposite property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite_property()
	 * @generated
	 * @ordered
	 */
	protected OppositeProperty opposite_property;

	/**
	 * The cached value of the '{@link #getComplete_signature() <em>Complete signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplete_signature()
	 * @generated
	 * @ordered
	 */
	protected CompleteSignature complete_signature;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected TagGO tag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.CLASSIFIER_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureQualifier getFeature_qualifier() {
		return feature_qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature_qualifier(FeatureQualifier newFeature_qualifier, NotificationChain msgs) {
		FeatureQualifier oldFeature_qualifier = feature_qualifier;
		feature_qualifier = newFeature_qualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CLASSIFIER_FEATURE__FEATURE_QUALIFIER, oldFeature_qualifier, newFeature_qualifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature_qualifier(FeatureQualifier newFeature_qualifier) {
		if (newFeature_qualifier != feature_qualifier) {
			NotificationChain msgs = null;
			if (feature_qualifier != null)
				msgs = ((InternalEObject)feature_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CLASSIFIER_FEATURE__FEATURE_QUALIFIER, null, msgs);
			if (newFeature_qualifier != null)
				msgs = ((InternalEObject)newFeature_qualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CLASSIFIER_FEATURE__FEATURE_QUALIFIER, null, msgs);
			msgs = basicSetFeature_qualifier(newFeature_qualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CLASSIFIER_FEATURE__FEATURE_QUALIFIER, newFeature_qualifier, newFeature_qualifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CLASSIFIER_FEATURE__DECLARATOR, oldDeclarator, newDeclarator);
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
				msgs = ((InternalEObject)declarator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CLASSIFIER_FEATURE__DECLARATOR, null, msgs);
			if (newDeclarator != null)
				msgs = ((InternalEObject)newDeclarator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CLASSIFIER_FEATURE__DECLARATOR, null, msgs);
			msgs = basicSetDeclarator(newDeclarator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CLASSIFIER_FEATURE__DECLARATOR, newDeclarator, newDeclarator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiplicity(Multiplicity newMultiplicity, NotificationChain msgs) {
		Multiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CLASSIFIER_FEATURE__MULTIPLICITY, oldMultiplicity, newMultiplicity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(Multiplicity newMultiplicity) {
		if (newMultiplicity != multiplicity) {
			NotificationChain msgs = null;
			if (multiplicity != null)
				msgs = ((InternalEObject)multiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CLASSIFIER_FEATURE__MULTIPLICITY, null, msgs);
			if (newMultiplicity != null)
				msgs = ((InternalEObject)newMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CLASSIFIER_FEATURE__MULTIPLICITY, null, msgs);
			msgs = basicSetMultiplicity(newMultiplicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CLASSIFIER_FEATURE__MULTIPLICITY, newMultiplicity, newMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OppositeProperty getOpposite_property() {
		return opposite_property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpposite_property(OppositeProperty newOpposite_property, NotificationChain msgs) {
		OppositeProperty oldOpposite_property = opposite_property;
		opposite_property = newOpposite_property;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CLASSIFIER_FEATURE__OPPOSITE_PROPERTY, oldOpposite_property, newOpposite_property);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite_property(OppositeProperty newOpposite_property) {
		if (newOpposite_property != opposite_property) {
			NotificationChain msgs = null;
			if (opposite_property != null)
				msgs = ((InternalEObject)opposite_property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CLASSIFIER_FEATURE__OPPOSITE_PROPERTY, null, msgs);
			if (newOpposite_property != null)
				msgs = ((InternalEObject)newOpposite_property).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CLASSIFIER_FEATURE__OPPOSITE_PROPERTY, null, msgs);
			msgs = basicSetOpposite_property(newOpposite_property, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CLASSIFIER_FEATURE__OPPOSITE_PROPERTY, newOpposite_property, newOpposite_property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteSignature getComplete_signature() {
		return complete_signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplete_signature(CompleteSignature newComplete_signature, NotificationChain msgs) {
		CompleteSignature oldComplete_signature = complete_signature;
		complete_signature = newComplete_signature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CLASSIFIER_FEATURE__COMPLETE_SIGNATURE, oldComplete_signature, newComplete_signature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplete_signature(CompleteSignature newComplete_signature) {
		if (newComplete_signature != complete_signature) {
			NotificationChain msgs = null;
			if (complete_signature != null)
				msgs = ((InternalEObject)complete_signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CLASSIFIER_FEATURE__COMPLETE_SIGNATURE, null, msgs);
			if (newComplete_signature != null)
				msgs = ((InternalEObject)newComplete_signature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CLASSIFIER_FEATURE__COMPLETE_SIGNATURE, null, msgs);
			msgs = basicSetComplete_signature(newComplete_signature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CLASSIFIER_FEATURE__COMPLETE_SIGNATURE, newComplete_signature, newComplete_signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagGO getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTag(TagGO newTag, NotificationChain msgs) {
		TagGO oldTag = tag;
		tag = newTag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CLASSIFIER_FEATURE__TAG, oldTag, newTag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(TagGO newTag) {
		if (newTag != tag) {
			NotificationChain msgs = null;
			if (tag != null)
				msgs = ((InternalEObject)tag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CLASSIFIER_FEATURE__TAG, null, msgs);
			if (newTag != null)
				msgs = ((InternalEObject)newTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalPackage.CLASSIFIER_FEATURE__TAG, null, msgs);
			msgs = basicSetTag(newTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.CLASSIFIER_FEATURE__TAG, newTag, newTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.CLASSIFIER_FEATURE__FEATURE_QUALIFIER:
				return basicSetFeature_qualifier(null, msgs);
			case QVTOperationalPackage.CLASSIFIER_FEATURE__DECLARATOR:
				return basicSetDeclarator(null, msgs);
			case QVTOperationalPackage.CLASSIFIER_FEATURE__MULTIPLICITY:
				return basicSetMultiplicity(null, msgs);
			case QVTOperationalPackage.CLASSIFIER_FEATURE__OPPOSITE_PROPERTY:
				return basicSetOpposite_property(null, msgs);
			case QVTOperationalPackage.CLASSIFIER_FEATURE__COMPLETE_SIGNATURE:
				return basicSetComplete_signature(null, msgs);
			case QVTOperationalPackage.CLASSIFIER_FEATURE__TAG:
				return basicSetTag(null, msgs);
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
			case QVTOperationalPackage.CLASSIFIER_FEATURE__FEATURE_QUALIFIER:
				return getFeature_qualifier();
			case QVTOperationalPackage.CLASSIFIER_FEATURE__DECLARATOR:
				return getDeclarator();
			case QVTOperationalPackage.CLASSIFIER_FEATURE__MULTIPLICITY:
				return getMultiplicity();
			case QVTOperationalPackage.CLASSIFIER_FEATURE__OPPOSITE_PROPERTY:
				return getOpposite_property();
			case QVTOperationalPackage.CLASSIFIER_FEATURE__COMPLETE_SIGNATURE:
				return getComplete_signature();
			case QVTOperationalPackage.CLASSIFIER_FEATURE__TAG:
				return getTag();
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
			case QVTOperationalPackage.CLASSIFIER_FEATURE__FEATURE_QUALIFIER:
				setFeature_qualifier((FeatureQualifier)newValue);
				return;
			case QVTOperationalPackage.CLASSIFIER_FEATURE__DECLARATOR:
				setDeclarator((Declarator)newValue);
				return;
			case QVTOperationalPackage.CLASSIFIER_FEATURE__MULTIPLICITY:
				setMultiplicity((Multiplicity)newValue);
				return;
			case QVTOperationalPackage.CLASSIFIER_FEATURE__OPPOSITE_PROPERTY:
				setOpposite_property((OppositeProperty)newValue);
				return;
			case QVTOperationalPackage.CLASSIFIER_FEATURE__COMPLETE_SIGNATURE:
				setComplete_signature((CompleteSignature)newValue);
				return;
			case QVTOperationalPackage.CLASSIFIER_FEATURE__TAG:
				setTag((TagGO)newValue);
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
			case QVTOperationalPackage.CLASSIFIER_FEATURE__FEATURE_QUALIFIER:
				setFeature_qualifier((FeatureQualifier)null);
				return;
			case QVTOperationalPackage.CLASSIFIER_FEATURE__DECLARATOR:
				setDeclarator((Declarator)null);
				return;
			case QVTOperationalPackage.CLASSIFIER_FEATURE__MULTIPLICITY:
				setMultiplicity((Multiplicity)null);
				return;
			case QVTOperationalPackage.CLASSIFIER_FEATURE__OPPOSITE_PROPERTY:
				setOpposite_property((OppositeProperty)null);
				return;
			case QVTOperationalPackage.CLASSIFIER_FEATURE__COMPLETE_SIGNATURE:
				setComplete_signature((CompleteSignature)null);
				return;
			case QVTOperationalPackage.CLASSIFIER_FEATURE__TAG:
				setTag((TagGO)null);
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
			case QVTOperationalPackage.CLASSIFIER_FEATURE__FEATURE_QUALIFIER:
				return feature_qualifier != null;
			case QVTOperationalPackage.CLASSIFIER_FEATURE__DECLARATOR:
				return declarator != null;
			case QVTOperationalPackage.CLASSIFIER_FEATURE__MULTIPLICITY:
				return multiplicity != null;
			case QVTOperationalPackage.CLASSIFIER_FEATURE__OPPOSITE_PROPERTY:
				return opposite_property != null;
			case QVTOperationalPackage.CLASSIFIER_FEATURE__COMPLETE_SIGNATURE:
				return complete_signature != null;
			case QVTOperationalPackage.CLASSIFIER_FEATURE__TAG:
				return tag != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassifierFeatureImpl
