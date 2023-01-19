/**
 * Copyright (c) 2016 Joel Greenyer and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * ScenarioTools-URL: www.scenariotools.org
 *    
 * Contributors:
 *     ScenarioTools Team - Initial API and implementation
 */
package org.scenariotools.sml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.scenariotools.sml.DummyExprClass;
import org.scenariotools.sml.FeatureAccessBindingExpression;
import org.scenariotools.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Access Binding Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.FeatureAccessBindingExpressionImpl#getFeatureaccess <em>Featureaccess</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureAccessBindingExpressionImpl extends BindingExpressionImpl implements FeatureAccessBindingExpression {
	/**
	 * The cached value of the '{@link #getFeatureaccess() <em>Featureaccess</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureaccess()
	 * @generated
	 * @ordered
	 */
	protected DummyExprClass featureaccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureAccessBindingExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.FEATURE_ACCESS_BINDING_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DummyExprClass getFeatureaccess() {
		return featureaccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureaccess(DummyExprClass newFeatureaccess, NotificationChain msgs) {
		DummyExprClass oldFeatureaccess = featureaccess;
		featureaccess = newFeatureaccess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.FEATURE_ACCESS_BINDING_EXPRESSION__FEATUREACCESS, oldFeatureaccess, newFeatureaccess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureaccess(DummyExprClass newFeatureaccess) {
		if (newFeatureaccess != featureaccess) {
			NotificationChain msgs = null;
			if (featureaccess != null)
				msgs = ((InternalEObject)featureaccess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.FEATURE_ACCESS_BINDING_EXPRESSION__FEATUREACCESS, null, msgs);
			if (newFeatureaccess != null)
				msgs = ((InternalEObject)newFeatureaccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.FEATURE_ACCESS_BINDING_EXPRESSION__FEATUREACCESS, null, msgs);
			msgs = basicSetFeatureaccess(newFeatureaccess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.FEATURE_ACCESS_BINDING_EXPRESSION__FEATUREACCESS, newFeatureaccess, newFeatureaccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.FEATURE_ACCESS_BINDING_EXPRESSION__FEATUREACCESS:
				return basicSetFeatureaccess(null, msgs);
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
			case SmlPackage.FEATURE_ACCESS_BINDING_EXPRESSION__FEATUREACCESS:
				return getFeatureaccess();
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
			case SmlPackage.FEATURE_ACCESS_BINDING_EXPRESSION__FEATUREACCESS:
				setFeatureaccess((DummyExprClass)newValue);
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
			case SmlPackage.FEATURE_ACCESS_BINDING_EXPRESSION__FEATUREACCESS:
				setFeatureaccess((DummyExprClass)null);
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
			case SmlPackage.FEATURE_ACCESS_BINDING_EXPRESSION__FEATUREACCESS:
				return featureaccess != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureAccessBindingExpressionImpl
