/**
 */
package qvtoperational.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qvtoperational.ClassifierFeature;
import qvtoperational.ClassifierFeatureList;
import qvtoperational.QvtoperationalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Feature List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.ClassifierFeatureListImpl#getClassifier_feature <em>Classifier feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierFeatureListImpl extends MinimalEObjectImpl.Container implements ClassifierFeatureList {
	/**
	 * The cached value of the '{@link #getClassifier_feature() <em>Classifier feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier_feature()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassifierFeature> classifier_feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierFeatureListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.CLASSIFIER_FEATURE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassifierFeature> getClassifier_feature() {
		if (classifier_feature == null) {
			classifier_feature = new EObjectContainmentEList<ClassifierFeature>(ClassifierFeature.class, this, QvtoperationalPackage.CLASSIFIER_FEATURE_LIST__CLASSIFIER_FEATURE);
		}
		return classifier_feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.CLASSIFIER_FEATURE_LIST__CLASSIFIER_FEATURE:
				return ((InternalEList<?>)getClassifier_feature()).basicRemove(otherEnd, msgs);
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
			case QvtoperationalPackage.CLASSIFIER_FEATURE_LIST__CLASSIFIER_FEATURE:
				return getClassifier_feature();
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
			case QvtoperationalPackage.CLASSIFIER_FEATURE_LIST__CLASSIFIER_FEATURE:
				getClassifier_feature().clear();
				getClassifier_feature().addAll((Collection<? extends ClassifierFeature>)newValue);
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
			case QvtoperationalPackage.CLASSIFIER_FEATURE_LIST__CLASSIFIER_FEATURE:
				getClassifier_feature().clear();
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
			case QvtoperationalPackage.CLASSIFIER_FEATURE_LIST__CLASSIFIER_FEATURE:
				return classifier_feature != null && !classifier_feature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassifierFeatureListImpl
