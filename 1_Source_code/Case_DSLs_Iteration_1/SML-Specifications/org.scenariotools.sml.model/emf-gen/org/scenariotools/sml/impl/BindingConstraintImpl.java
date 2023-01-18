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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.scenariotools.sml.BindingConstraint;
import org.scenariotools.sml.BindingExpression;
import org.scenariotools.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.scenariotools.sml.impl.BindingConstraintImpl#getBindingExpression <em>Binding Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BindingConstraintImpl extends MinimalEObjectImpl.Container implements BindingConstraint {
	/**
	 * The cached value of the '{@link #getBindingExpression() <em>Binding Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingExpression()
	 * @generated
	 * @ordered
	 */
	protected BindingExpression bindingExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.BINDING_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingExpression getBindingExpression() {
		return bindingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingExpression(BindingExpression newBindingExpression, NotificationChain msgs) {
		BindingExpression oldBindingExpression = bindingExpression;
		bindingExpression = newBindingExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.BINDING_CONSTRAINT__BINDING_EXPRESSION, oldBindingExpression, newBindingExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingExpression(BindingExpression newBindingExpression) {
		if (newBindingExpression != bindingExpression) {
			NotificationChain msgs = null;
			if (bindingExpression != null)
				msgs = ((InternalEObject)bindingExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.BINDING_CONSTRAINT__BINDING_EXPRESSION, null, msgs);
			if (newBindingExpression != null)
				msgs = ((InternalEObject)newBindingExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.BINDING_CONSTRAINT__BINDING_EXPRESSION, null, msgs);
			msgs = basicSetBindingExpression(newBindingExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.BINDING_CONSTRAINT__BINDING_EXPRESSION, newBindingExpression, newBindingExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.BINDING_CONSTRAINT__BINDING_EXPRESSION:
				return basicSetBindingExpression(null, msgs);
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
			case SmlPackage.BINDING_CONSTRAINT__BINDING_EXPRESSION:
				return getBindingExpression();
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
			case SmlPackage.BINDING_CONSTRAINT__BINDING_EXPRESSION:
				setBindingExpression((BindingExpression)newValue);
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
			case SmlPackage.BINDING_CONSTRAINT__BINDING_EXPRESSION:
				setBindingExpression((BindingExpression)null);
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
			case SmlPackage.BINDING_CONSTRAINT__BINDING_EXPRESSION:
				return bindingExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingConstraintImpl
